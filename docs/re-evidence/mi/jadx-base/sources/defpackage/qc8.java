package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class qc8 {
    public static <E extends Enum<E>> E a(Class<E> cls, int i) {
        E[] enumConstants = cls.getEnumConstants();
        if (i < 0 || i >= enumConstants.length) {
            return null;
        }
        return enumConstants[i];
    }
}
