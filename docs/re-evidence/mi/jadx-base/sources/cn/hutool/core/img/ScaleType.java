package cn.hutool.core.img;

/* JADX INFO: loaded from: classes.dex */
public enum ScaleType {
    DEFAULT(1),
    FAST(2),
    SMOOTH(4),
    REPLICATE(8),
    AREA_AVERAGING(16);

    private final int value;

    ScaleType(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
