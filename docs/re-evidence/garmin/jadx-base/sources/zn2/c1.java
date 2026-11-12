package zn2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayServiceProvider", f = "NewFitPayServiceProvider.kt", l = {491, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, SyslogConstants.LOG_LOCAL3, 153, 157}, m = "setup", v = 2)
public final class c1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f205440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.a f205441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f205442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f205443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f205444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z0 f205445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f205446g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(z0 z0Var, t13.d<? super c1> dVar) {
        super(dVar);
        this.f205445f = z0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205444e = obj;
        this.f205446g |= Integer.MIN_VALUE;
        return this.f205445f.r(false, this);
    }
}
