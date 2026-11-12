package te2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.AbstractOAuth2DIOperation", f = "AbstractOAuth2DIOperation.kt", l = {93}, m = "callGetOrRefresh")
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f163999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f164000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164001c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f164000b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f163999a = obj;
        this.f164001c |= Integer.MIN_VALUE;
        return j.d(this.f164000b, this);
    }
}
