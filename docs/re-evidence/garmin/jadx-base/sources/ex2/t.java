package ex2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.networkwrapper.networking.StringsHelper", f = "StringsHelper.kt", l = {140}, m = "isTranslationFileExists", v = 1)
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f67044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f67045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f67046c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f67045b = wVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f67044a = obj;
        this.f67046c |= Integer.MIN_VALUE;
        w wVar = w.f67058a;
        return this.f67045b.h(null, 0L, null, this);
    }
}
