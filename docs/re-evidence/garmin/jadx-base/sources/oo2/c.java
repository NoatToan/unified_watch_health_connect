package oo2;

import fo2.l0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.sync.SnowballSyncStrategy", f = "SnowballSyncStrategy.kt", l = {45, 56, 61, 69, 71, 83}, m = "onActivatedOrUpdated", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l0 f133142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f133143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f133144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f133145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f133146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f133147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f133148g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f133147f = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f133146e = obj;
        this.f133148g |= Integer.MIN_VALUE;
        return this.f133147f.c(null, this);
    }
}
