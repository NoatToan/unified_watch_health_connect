package au;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.preprocess.AnnualReportPreprocessor", f = "AnnualReportPreprocessor.kt", l = {86, 100}, m = "getReport", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f12822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.annual_report.preprocess.a f12824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12825d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.garmin.android.apps.connectmobile.annual_report.preprocess.a aVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f12824c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f12823b = obj;
        this.f12825d |= Integer.MIN_VALUE;
        String str = com.garmin.android.apps.connectmobile.annual_report.preprocess.a.f30185c;
        return this.f12824c.a(null, this);
    }
}
