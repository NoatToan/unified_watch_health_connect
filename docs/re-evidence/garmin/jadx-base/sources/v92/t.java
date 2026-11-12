package v92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.android.consent.ui.ConsentViewModel", f = "ConsentViewModel.kt", l = {478}, m = "checkPassword")
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f176523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f176524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f176525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f176526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f176527e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r rVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f176526d = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f176525c = obj;
        this.f176527e |= Integer.MIN_VALUE;
        return r.y4(this.f176526d, null, this);
    }
}
