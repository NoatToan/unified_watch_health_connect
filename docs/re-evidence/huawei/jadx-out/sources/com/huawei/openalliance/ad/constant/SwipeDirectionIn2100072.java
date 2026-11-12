package com.huawei.openalliance.ad.constant;

/* JADX INFO: loaded from: classes41.dex */
public class SwipeDirectionIn2100072 {
    public static final int ANY = 0;
    public static final int DOWN = 2;
    public static final int LEFT = 3;
    public static final int RIGHT = 4;
    public static final int UP = 1;

    public static int transformSwipeDirectionType(int i) {
        return i != 0 ? 0 : 1;
    }
}
