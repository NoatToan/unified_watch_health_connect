package ex2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.networkwrapper.networking.ImageHelper", f = "ImageHelper.kt", l = {434}, m = "fetchServerConfigVersion", v = 1)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f66954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f66955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f66956c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f66955b = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f66954a = obj;
        this.f66956c |= Integer.MIN_VALUE;
        i iVar = i.f66970a;
        return this.f66955b.b(null, null, this);
    }
}
