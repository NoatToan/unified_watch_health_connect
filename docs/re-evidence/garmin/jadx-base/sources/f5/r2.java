package f5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f69091a = a.f69092a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf5/r2$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f69092a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final s2 f69093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final s2 f69094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final s2 f69095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final s2 f69096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final s2 f69097f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final s2 f69098g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final s2 f69099h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final s2 f69100i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final s2 f69101j;

        static {
            s2 s2Var = new s2("caption bar");
            f69093b = s2Var;
            s2 s2Var2 = new s2("display cutout");
            f69094c = s2Var2;
            s2 s2Var3 = new s2("ime");
            f69095d = s2Var3;
            s2 s2Var4 = new s2("mandatory system gestures");
            f69096e = s2Var4;
            s2 s2Var5 = new s2("navigation bars");
            f69097f = s2Var5;
            s2 s2Var6 = new s2("status bars");
            f69098g = s2Var6;
            new u("system bars", new r2[]{s2Var6, s2Var5, s2Var});
            s2 s2Var7 = new s2("system gestures");
            f69099h = s2Var7;
            s2 s2Var8 = new s2("tappable element");
            f69100i = s2Var8;
            s2 s2Var9 = new s2("waterfall");
            f69101j = s2Var9;
            new u("safe drawing", new r2[]{s2Var6, s2Var5, s2Var, s2Var2, s2Var3, s2Var8});
            new u("safe gestures", new r2[]{s2Var4, s2Var7, s2Var8, s2Var9});
            new u("safe content", new r2[]{s2Var6, s2Var5, s2Var, s2Var3, s2Var7, s2Var4, s2Var8, s2Var2, s2Var9});
        }

        private a() {
        }
    }

    x1 getCurrent();

    x1 getMaximum();
}
