package uf2;

import java.util.UUID;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.communication.protobuf.LSVSessionStartInteractor", f = "LSVSessionStartInteractor.kt", l = {89, 109, 132}, m = "initializeManualStart$live_session_view", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rs2.c f170373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zf2.d f170374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zf2.i f170375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f170376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public yf2.a f170377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f170378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f170379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public UUID f170380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f170381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f170382j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f170383k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f170384l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f170385m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f170386n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d f170387o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f170388p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, t13.d<? super h> dVar2) {
        super(dVar2);
        this.f170387o = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170386n = obj;
        this.f170388p |= Integer.MIN_VALUE;
        return this.f170387o.e(null, null, false, false, false, null, null, null, this);
    }
}
