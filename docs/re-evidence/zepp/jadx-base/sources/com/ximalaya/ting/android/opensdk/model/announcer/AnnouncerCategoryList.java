package com.ximalaya.ting.android.opensdk.model.announcer;

import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class AnnouncerCategoryList extends XimalayaResponse {
    public List<AnnouncerCategory> list = new ArrayList();

    public List<AnnouncerCategory> getList() {
        return this.list;
    }

    public void setList(List<AnnouncerCategory> list) {
        this.list = list;
    }
}
