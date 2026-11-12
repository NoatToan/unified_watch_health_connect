package vo2;

import com.garmin.feature.garminpay.providers.gpay.sync.NewFitPayTransitCardSync;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.sync.NewFitPayTransitCardSync", f = "NewFitPayTransitCardSync.kt", l = {48, 57, 68, 81}, m = "syncTransitCard", v = 2)
public final class x extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xo2.g f179218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f179219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f179220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ NewFitPayTransitCardSync f179221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f179222e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(NewFitPayTransitCardSync newFitPayTransitCardSync, t13.d<? super x> dVar) {
        super(dVar);
        this.f179221d = newFitPayTransitCardSync;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f179220c = obj;
        this.f179222e |= Integer.MIN_VALUE;
        return this.f179221d.a(null, this);
    }
}
