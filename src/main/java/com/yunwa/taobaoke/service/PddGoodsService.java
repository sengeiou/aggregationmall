package com.yunwa.taobaoke.service;

import com.github.pagehelper.PageInfo;
import com.yunwa.taobaoke.pojo.dto.PddGoodsDto;
import com.yunwa.taobaoke.pojo.po.PddGoods;
import com.yunwa.taobaoke.pojo.vo.PddGoodsDocumentVo;

import java.util.HashMap;
import java.util.List;

public interface PddGoodsService {
    List<PddGoodsDto> goodsSearch(Long opt_id, Integer page_size, String p_id, Integer page);

    String getGoodsPicUrls(PddGoodsDto pddGoodsDto);

    void getUrls(String p_id, List<PddGoods> list);

    boolean delPddGoods();

    PageInfo<PddGoods> getGoodsList(int pageNum, HashMap<String, Object> map);

    PddGoods getGoodsDetil(long goods_id);

    PddGoodsDocumentVo getGoodsDocument(long goods_id);

}
