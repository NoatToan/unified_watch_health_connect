package oo2;

import fo2.l0;
import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.sync.SnowballSyncStrategy", f = "SnowballSyncStrategy.kt", l = {93, 94}, m = "updateCache", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l0 f133159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f133160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f133161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f133162d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f133161c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f133160b = obj;
        this.f133162d |= Integer.MIN_VALUE;
        Logger logger = a.f133132h;
        return this.f133161c.d(null, this);
    }
}
