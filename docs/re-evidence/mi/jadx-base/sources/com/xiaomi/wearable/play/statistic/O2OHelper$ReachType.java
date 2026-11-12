package com.xiaomi.wearable.play.statistic;

/* JADX INFO: loaded from: classes2.dex */
public enum O2OHelper$ReachType {
    EXPOSE(1),
    CLICK(2),
    VIEW(3),
    LIKE(4),
    UNLIKE(5),
    BUY(6),
    REFRESH(7),
    COLLECTION(8),
    SHARE(9),
    UNCOLLECTION(10),
    CART(11),
    PUSH_REC(12),
    COMMNET(13),
    VIDEO_START(14),
    VIDEO_PAUSE(15),
    VIDEO_FINISH(16),
    VIDEO_RESUME(17),
    VIDEO_END(18),
    CLOSE(19);

    int value;

    O2OHelper$ReachType(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
