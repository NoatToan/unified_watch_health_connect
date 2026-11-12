package ml2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "com.garmin.device.multilink.MultiLinkServiceAgentImpl", f = "MultiLinkServiceAgentImpl.kt", l = {45}, m = "close")
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f119459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f119460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f119461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f119462d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s sVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f119461c = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f119460b = obj;
        this.f119462d |= Integer.MIN_VALUE;
        return this.f119461c.b(this);
    }
}
