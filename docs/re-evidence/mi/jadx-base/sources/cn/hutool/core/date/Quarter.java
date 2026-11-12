package cn.hutool.core.date;

/* JADX INFO: loaded from: classes.dex */
public enum Quarter {
    Q1(1),
    Q2(2),
    Q3(3),
    Q4(4);

    private final int value;

    Quarter(int i) {
        this.value = i;
    }

    public static Quarter of(int i) {
        if (i == 1) {
            return Q1;
        }
        if (i == 2) {
            return Q2;
        }
        if (i == 3) {
            return Q3;
        }
        if (i != 4) {
            return null;
        }
        return Q4;
    }

    public int getValue() {
        return this.value;
    }
}
