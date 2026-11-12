package fe2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.domain.GrouptrackManager", f = "GrouptrackManager.kt", l = {291, 293, 295, 297}, m = "handleGetLastKnownLocationsRequest", v = 2)
public final class l1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f70835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f70836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f70837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j1 f70838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f70839e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(j1 j1Var, t13.d<? super l1> dVar) {
        super(dVar);
        this.f70838d = j1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f70837c = obj;
        this.f70839e |= Integer.MIN_VALUE;
        return this.f70838d.b(0, null, null, this);
    }
}
