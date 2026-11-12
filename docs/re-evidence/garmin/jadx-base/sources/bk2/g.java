package bk2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "com.garmin.device.devicemessages.CIQMessageManager", f = "CIQMessageManager.kt", l = {127}, m = "send")
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f18534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f18536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18537d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f18536c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f18535b = obj;
        this.f18537d |= Integer.MIN_VALUE;
        b.c cVar = b.f18501j;
        return this.f18536c.m(0L, this);
    }
}
