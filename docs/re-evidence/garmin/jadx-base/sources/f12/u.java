package f12;

/* JADX INFO: loaded from: classes10.dex */
public enum u {
    LEVEL_1(1, 0),
    LEVEL_2(2, 20),
    LEVEL_3(3, 60),
    LEVEL_4(4, 140),
    LEVEL_5(5, 300),
    LEVEL_6(6, 620),
    LEVEL_7(7, 1260),
    LEVEL_8(8, 2540),
    LEVEL_9(9, 5100),
    LEVEL_10(10, 10220);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f68115b;

    u(int i14, int i15) {
        this.f68114a = i14;
        this.f68115b = i15;
    }

    public static u a(int i14) {
        u[] uVarArrValues = values();
        u uVar = uVarArrValues[uVarArrValues.length - 1];
        u uVar2 = values()[0];
        if (i14 > uVar2.f68114a) {
            return i14 < uVar.f68114a ? values()[i14 - 1] : uVar;
        }
        return uVar2;
    }
}
