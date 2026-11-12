package v92;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.android.consent.ui.ConsentViewModel", f = "ConsentViewModel.kt", l = {242}, m = "callDeleteDataScreenText")
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f176519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f176520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f176521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f176522d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r rVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f176521c = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f176520b = obj;
        this.f176522d |= Integer.MIN_VALUE;
        return r.x4(this.f176521c, this);
    }
}
