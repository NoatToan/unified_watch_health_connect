package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Comparable<s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Field f6811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f6812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class<?> f6813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Field f6815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0 f6819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Field f6820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Class<?> f6821k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f6822l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z.c f6823m;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6824a;

        static {
            int[] iArr = new int[u.values().length];
            f6824a = iArr;
            try {
                iArr[u.f6882c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6824a[u.f6883d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6824a[u.f6884e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6824a[u.f6887h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private s(Field field, int i14, u uVar, Class<?> cls, Field field2, int i15, boolean z14, boolean z15, y0 y0Var, Class<?> cls2, Object obj, z.c cVar, Field field3) {
        this.f6811a = field;
        this.f6812b = uVar;
        this.f6813c = cls;
        this.f6814d = i14;
        this.f6815e = field2;
        this.f6816f = i15;
        this.f6817g = z14;
        this.f6818h = z15;
        this.f6819i = y0Var;
        this.f6821k = cls2;
        this.f6822l = obj;
        this.f6823m = cVar;
        this.f6820j = field3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(s sVar) {
        return this.f6814d - sVar.f6814d;
    }
}
