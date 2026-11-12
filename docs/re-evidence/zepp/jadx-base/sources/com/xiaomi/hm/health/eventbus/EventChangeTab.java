package com.xiaomi.hm.health.eventbus;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes21.dex */
public class EventChangeTab {
    public static final int TAB_MINE = 3;
    public static final int TAB_SPORT = 2;
    public static final int TAB_STATUS = 0;
    private int a;
    private String b;

    public EventChangeTab(int tabType) {
        this.a = 0;
        this.a = tabType;
    }

    public int getTabType() {
        return this.a;
    }

    @Nullable
    public String getTarget() {
        return this.b;
    }

    public EventChangeTab(int tabType, String target) {
        this.a = 0;
        this.a = tabType;
        this.b = target;
    }
}
