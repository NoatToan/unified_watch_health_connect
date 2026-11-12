package com.ximalaya.ting.android.opensdk.model.tag;

import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class TagList extends XimalayaResponse {
    private List<Tag> tagList;

    public List<Tag> getTagList() {
        return this.tagList;
    }

    public void setTagList(List<Tag> list) {
        this.tagList = list;
    }
}
