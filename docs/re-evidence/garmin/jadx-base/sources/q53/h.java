package q53;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n<Object> f142975a = new n<>(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f142976b = og2.k.K(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f142977c = og2.k.K(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u53.x f142978d = new u53.x("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u53.x f142979e = new u53.x("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u53.x f142980f = new u53.x("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u53.x f142981g = new u53.x("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u53.x f142982h = new u53.x("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u53.x f142983i = new u53.x("DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u53.x f142984j = new u53.x("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final u53.x f142985k = new u53.x("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u53.x f142986l = new u53.x("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final u53.x f142987m = new u53.x("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u53.x f142988n = new u53.x("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final u53.x f142989o = new u53.x("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final u53.x f142990p = new u53.x("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u53.x f142991q = new u53.x("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u53.x f142992r = new u53.x("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u53.x f142993s = new u53.x("NO_CLOSE_CAUSE");

    public static final <T> boolean a(o53.j<? super T> jVar, T t7, e23.q<? super Throwable, ? super T, ? super t13.g, Unit> qVar) {
        u53.x xVarO = jVar.o(t7, qVar);
        if (xVarO == null) {
            return false;
        }
        jVar.B(xVarO);
        return true;
    }
}
