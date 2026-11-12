package com.xiaomi.ai.domain.mobileapp.local;

import com.xiaomi.ai.domain.mobileapp.common.BaseAppItem;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class MatchRet {
    private List<BaseAppItem> baseAppItemList;
    private EventInfo eventInfo;
    private Set<String> pkgNameSet = new HashSet();

    public MatchRet(List<BaseAppItem> list, EventInfo eventInfo) {
        this.baseAppItemList = list;
        this.eventInfo = eventInfo;
    }

    public int addBaseAppItem(BaseAppItem baseAppItem) {
        if (baseAppItem == null || this.pkgNameSet.contains(baseAppItem.getPackageName())) {
            return 0;
        }
        this.baseAppItemList.add(baseAppItem);
        this.pkgNameSet.add(baseAppItem.getPackageName());
        return 1;
    }

    public List<BaseAppItem> getBaseAppItemList() {
        return this.baseAppItemList;
    }

    public EventInfo getEventInfo() {
        return this.eventInfo;
    }

    public void setBaseAppItemList(List<BaseAppItem> list) {
        this.baseAppItemList = list;
    }

    public void setEventInfo(EventInfo eventInfo) {
        this.eventInfo = eventInfo;
    }
}
