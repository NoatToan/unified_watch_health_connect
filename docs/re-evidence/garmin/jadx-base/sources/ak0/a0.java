package ak0;

import java.util.Collection;
import java.util.Iterator;
import o4.v0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeViewModel", f = "GCPlusHomeViewModel.kt", l = {587}, m = "getEducationData", v = 2)
public final class a0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rj0.a f3571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f3572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f3573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rj0.c f3574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v0 f3575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f3576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f3577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Collection f3578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f3581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.gcplus.presentation.home.e f3582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3583m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar, t13.d<? super a0> dVar) {
        super(dVar);
        this.f3582l = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f3581k = obj;
        this.f3583m |= Integer.MIN_VALUE;
        int i14 = com.garmin.android.apps.connectmobile.gcplus.presentation.home.e.D;
        return this.f3582l.A4(null, null, this);
    }
}
