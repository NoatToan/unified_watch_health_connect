package yo;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.multisport.advancededit.repo.MultisportEditLegsRepo", f = "MultisportEditLegsRepo.kt", l = {386, 387}, m = "callUploadStatusOperation", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f198254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f198255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f198256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f198257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f198258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f198259f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f198258e = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f198257d = obj;
        this.f198259f |= Integer.MIN_VALUE;
        int i14 = e.f198230s;
        return this.f198258e.b(0L, null, null, this);
    }
}
