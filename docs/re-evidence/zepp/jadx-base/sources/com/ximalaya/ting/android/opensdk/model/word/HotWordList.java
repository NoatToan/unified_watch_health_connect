package com.ximalaya.ting.android.opensdk.model.word;

import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class HotWordList extends XimalayaResponse {
    private List<HotWord> hotWordList;

    public List<HotWord> getHotWordList() {
        return this.hotWordList;
    }

    public void setHotWordList(List<HotWord> list) {
        this.hotWordList = list;
    }

    public String toString() {
        return "HotWordList [hotWordList=" + this.hotWordList + "]";
    }
}
