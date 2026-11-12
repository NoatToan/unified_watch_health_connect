package ex2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.networkwrapper.networking.StringsHelper", f = "StringsHelper.kt", l = {324}, m = "fetchDevicePartNumber", v = 1)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f66999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f67000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f67001c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(w wVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f67000b = wVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f66999a = obj;
        this.f67001c |= Integer.MIN_VALUE;
        w wVar = w.f67058a;
        return this.f67000b.b(null, null, this);
    }
}
