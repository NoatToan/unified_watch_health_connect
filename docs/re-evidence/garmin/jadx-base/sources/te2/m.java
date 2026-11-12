package te2;

import okhttp3.internal.http.StatusLine;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.mobileauth.biz.AbstractOAuth2ITOperation", f = "AbstractOAuth2ITOperation.kt", l = {StatusLine.HTTP_PERM_REDIRECT, 309}, m = "attemptIT2ForIT2")
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sc2.o f164168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f164169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f164170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f164171d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f164170c = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f164169b = obj;
        this.f164171d |= Integer.MIN_VALUE;
        return this.f164170c.i(null, this);
    }
}
