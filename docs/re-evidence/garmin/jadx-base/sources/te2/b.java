package te2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.AbstractOAuth2DIOperation", f = "AbstractOAuth2DIOperation.kt", l = {331, 333}, m = "attemptGC1OtherAppForDI2")
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sc2.n f163965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f163966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f163967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f163968d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f163967c = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f163966b = obj;
        this.f163968d |= Integer.MIN_VALUE;
        return this.f163967c.h(null, null, this);
    }
}
