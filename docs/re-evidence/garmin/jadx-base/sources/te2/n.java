package te2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.AbstractOAuth2ITOperation", f = "AbstractOAuth2ITOperation.kt", l = {81}, m = "callGetOrRefresh")
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f164192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f164193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164194c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f164193b = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164192a = obj;
        this.f164194c |= Integer.MIN_VALUE;
        return s.d(this.f164193b, this);
    }
}
