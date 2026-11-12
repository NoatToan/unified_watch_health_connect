package com.huawei.pluginmessagecenter.provider.data;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class MessageChangeEvent {
    private List<String> mModifyMessageObjectIds;
    private List<String> mRemoveMessageObjectIds;

    public MessageChangeEvent(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.mModifyMessageObjectIds = arrayList;
        this.mRemoveMessageObjectIds = arrayList2;
    }

    public List<String> getModifyMessageObjectIds() {
        return this.mModifyMessageObjectIds;
    }

    public List<String> getRemoveMessageObjectIds() {
        return this.mRemoveMessageObjectIds;
    }
}
