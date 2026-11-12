package ml2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "com.garmin.device.multilink.MultiLinkServiceAgentImpl", f = "MultiLinkServiceAgentImpl.kt", l = {81, 92, 101, 109, 110}, m = "writeReliable")
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f119470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dz2.b f119471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e23.p f119472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f119473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f119474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f119475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f119476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f119477h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(s sVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f119476g = sVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f119475f = obj;
        this.f119477h |= Integer.MIN_VALUE;
        return s.e(this.f119476g, null, null, this);
    }
}
