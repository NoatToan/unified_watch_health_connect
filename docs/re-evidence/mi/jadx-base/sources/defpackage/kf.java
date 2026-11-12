package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum kf {
    KG((byte) 0),
    POUND((byte) 1),
    JIN((byte) 2);

    public byte t;

    kf(byte b2) {
        this.t = b2;
    }

    public byte a() {
        return this.t;
    }

    public static kf a(byte b2) {
        for (kf kfVar : values()) {
            if (b2 == kfVar.a()) {
                return kfVar;
            }
        }
        return null;
    }
}
