package com.huami.watch.companion.intervalrun.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class IntervalTrainingInfo implements Serializable {
    private List<IntervalGroupInfo> groupList;
    private int id;
    private String title;

    public IntervalTrainingInfo copy() {
        IntervalTrainingInfo intervalTrainingInfo = new IntervalTrainingInfo();
        ArrayList arrayList = new ArrayList();
        List<IntervalGroupInfo> list = this.groupList;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                IntervalGroupInfo intervalGroupInfo = new IntervalGroupInfo();
                ArrayList arrayList2 = new ArrayList();
                IntervalGroupInfo intervalGroupInfo2 = this.groupList.get(i);
                List<IntervalItemInfo> itemInfoList = intervalGroupInfo2.getItemInfoList();
                if (itemInfoList != null) {
                    int size2 = itemInfoList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        arrayList2.add(itemInfoList.get(i2).copy());
                    }
                }
                intervalGroupInfo.setItemInfoList(arrayList2);
                intervalGroupInfo.setRepeatCount(intervalGroupInfo2.getRepeatCount());
                intervalGroupInfo.setGroupId(intervalGroupInfo2.getGroupId());
                arrayList.add(intervalGroupInfo);
            }
        }
        intervalTrainingInfo.setId(getId());
        intervalTrainingInfo.setTitle(getTitle());
        intervalTrainingInfo.setGroupList(arrayList);
        return intervalTrainingInfo;
    }

    public List<IntervalGroupInfo> getGroupList() {
        return this.groupList;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isValid() {
        List<IntervalGroupInfo> list = this.groupList;
        if (list == null || list.isEmpty()) {
            return false;
        }
        int size = this.groupList.size();
        for (int i = 0; i < size; i++) {
            if (!this.groupList.get(i).isValid()) {
                return false;
            }
        }
        return true;
    }

    public void setGroupList(List<IntervalGroupInfo> list) {
        this.groupList = list;
    }

    public void setId(int i) {
        this.id = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
