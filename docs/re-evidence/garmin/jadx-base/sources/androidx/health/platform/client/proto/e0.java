package androidx.health.platform.client.proto;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Comparable<e0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f7587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f7588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<?> f7589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f7591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f7593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f7594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f7595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f7596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Class<?> f7597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f7598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l0.c f7599m;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7600a;

        static {
            int[] iArr = new int[g0.values().length];
            f7600a = iArr;
            try {
                iArr[g0.f7629c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7600a[g0.f7630d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7600a[g0.f7631e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7600a[g0.f7634h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private e0(Field field, int i14, g0 g0Var, Class<?> cls, Field field2, int i15, boolean z14, boolean z15, k1 k1Var, Class<?> cls2, Object obj, l0.c cVar, Field field3) {
        this.f7587a = field;
        this.f7588b = g0Var;
        this.f7589c = cls;
        this.f7590d = i14;
        this.f7591e = field2;
        this.f7592f = i15;
        this.f7593g = z14;
        this.f7594h = z15;
        this.f7595i = k1Var;
        this.f7597k = cls2;
        this.f7598l = obj;
        this.f7599m = cVar;
        this.f7596j = field3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(e0 e0Var) {
        return this.f7590d - e0Var.f7590d;
    }
}
