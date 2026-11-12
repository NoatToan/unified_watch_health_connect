package com.huawei.hms.scankit.p;

import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes34.dex */
public final class m1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m1 f16207b = new m1("OTHER", 0, Object.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m1 f16208c = new m1("POSSIBLE_FORMATS", 1, List.class);
    public static final m1 d;
    public static final m1 e;
    public static final m1 f;
    public static final m1 g;
    public static final m1 h;
    public static final m1 i;
    public static final m1 j;
    public static final m1 k;
    private static final /* synthetic */ m1[] l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f16209a;

    static {
        Class cls = Void.TYPE;
        d = new m1("PHOTO_MODE", 2, cls);
        e = new m1("PHOTO_MODE_NUM", 3, Integer.TYPE);
        f = new m1("NEED_JNI", 4, cls);
        g = new m1("TRY_HARDER", 5, Void.class);
        h = new m1("CHARACTER_SET", 6, String.class);
        i = new m1("RETURN_CODABAR_START_END", 7, Void.class);
        j = new m1("NEED_RESULT_POINT_CALLBACK", 8, v6.class);
        k = new m1("ALLOWED_EAN_EXTENSIONS", 9, int[].class);
        l = a();
    }

    public static m1 valueOf(String str) {
        return (m1) Enum.valueOf(m1.class, str);
    }

    public static m1[] values() {
        return (m1[]) l.clone();
    }

    private static /* synthetic */ m1[] a() {
        return new m1[]{f16207b, f16208c, d, e, f, g, h, i, j, k};
    }

    private m1(String str, int i2, Class cls) {
        super(str, i2);
        this.f16209a = cls;
    }
}
