package am;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.ActivityRepo", f = "ActivityRepo.kt", l = {196, 198}, m = "uploadActivityImage", v = 2)
public final class r0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f4177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(m mVar, t13.d<? super r0> dVar) {
        super(dVar);
        this.f4177b = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f4176a = obj;
        this.f4178c |= Integer.MIN_VALUE;
        return this.f4177b.f(0L, null, 0, this);
    }
}
