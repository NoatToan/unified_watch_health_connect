package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public enum fc1 {
    OPACITY,
    SCALE_X,
    SCALE_Y,
    SCALE_XY;

    public static fc1 a(String str) {
        str.hashCode();
        switch (str) {
            case "opacity":
                return OPACITY;
            case "scaleX":
                return SCALE_X;
            case "scaleY":
                return SCALE_Y;
            case "scaleXY":
                return SCALE_XY;
            default:
                throw new IllegalArgumentException("Unsupported animated property: " + str);
        }
    }
}
