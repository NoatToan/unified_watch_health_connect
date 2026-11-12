package nw2;

import p005kotlin.Metadata;
import t13.d;
import v13.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@e(c = "com.garmin.realtimesettings.app.datahandler.servicecalls.dataresponse.DataResponseServiceCalls", f = "DataResponseServiceCalls.kt", l = {40, 46}, m = "getSettingsDataResponseService", v = 1)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f128179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f128180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f128181c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, d<? super b> dVar) {
        super(dVar);
        this.f128180b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f128179a = obj;
        this.f128181c |= Integer.MIN_VALUE;
        return this.f128180b.d(0, null, this);
    }
}
