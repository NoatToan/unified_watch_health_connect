package ex2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.networkwrapper.networking.ImageHelper", f = "ImageHelper.kt", l = {393}, m = "isCachePopulated", v = 1)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f66960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f66961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f66962c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f66961b = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f66960a = obj;
        this.f66962c |= Integer.MIN_VALUE;
        i iVar = i.f66970a;
        return this.f66961b.c(null, null, null, this);
    }
}
