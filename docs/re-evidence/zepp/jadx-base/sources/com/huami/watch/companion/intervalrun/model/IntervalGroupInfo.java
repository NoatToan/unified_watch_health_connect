package com.huami.watch.companion.intervalrun.model;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class IntervalGroupInfo implements Serializable {
    private long groupId;
    private List<IntervalItemInfo> itemInfoList;
    private int repeatCount;

    public long getGroupId() {
        return this.groupId;
    }

    public List<IntervalItemInfo> getItemInfoList() {
        return this.itemInfoList;
    }

    public int getRepeatCount() {
        return this.repeatCount;
    }

    public boolean isValid() {
        List<IntervalItemInfo> list = this.itemInfoList;
        if (list == null || list.isEmpty()) {
            return false;
        }
        int size = this.itemInfoList.size();
        for (int i = 0; i < size; i++) {
            if (!this.itemInfoList.get(i).isValid()) {
                return false;
            }
        }
        return true;
    }

    public void setGroupId(long j) {
        this.groupId = j;
    }

    public void setItemInfoList(List<IntervalItemInfo> list) {
        this.itemInfoList = list;
    }

    public void setRepeatCount(int i) {
        this.repeatCount = i;
    }
}
