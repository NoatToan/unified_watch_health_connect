package ss1;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.data.repository.GarminTrailsRepoImpl", f = "GarminTrailsRepoImpl.kt", l = {64, 68, 70}, m = "getTrailByIdForActivityDetails", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f160662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f160663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f160664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f160665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v2.b f160666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f160667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z f160668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f160669h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(z zVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f160668g = zVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f160667f = obj;
        this.f160669h |= Integer.MIN_VALUE;
        return this.f160668g.a(0L, 0L, false, false, this);
    }
}
