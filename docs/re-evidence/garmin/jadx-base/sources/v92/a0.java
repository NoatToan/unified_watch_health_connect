package v92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.android.consent.ui.ConsentViewModel", f = "ConsentViewModel.kt", l = {563}, m = "updateDeviceUpload")
public final class a0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f176302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f176303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f176304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f176305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f176306e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(r rVar, t13.d<? super a0> dVar) {
        super(dVar);
        this.f176305d = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f176304c = obj;
        this.f176306e |= Integer.MIN_VALUE;
        return r.B4(this.f176305d, false, this);
    }
}
