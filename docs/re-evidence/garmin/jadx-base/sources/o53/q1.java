package o53;

/* JADX INFO: loaded from: classes3.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u53.x f129397a = new u53.x("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u53.x f129398b = new u53.x("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u53.x f129399c = new u53.x("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u53.x f129400d = new u53.x("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u53.x f129401e = new u53.x("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x0 f129402f = new x0(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final x0 f129403g = new x0(true);

    public static final Object a(Object obj) {
        g1 g1Var;
        h1 h1Var = obj instanceof h1 ? (h1) obj : null;
        return (h1Var == null || (g1Var = h1Var.f129345a) == null) ? obj : g1Var;
    }
}
