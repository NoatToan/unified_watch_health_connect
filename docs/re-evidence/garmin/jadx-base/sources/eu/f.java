package eu;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p3.h0;
import p3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leu/f;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f66082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f66083b;

    public f(i0 i0Var, Context context, d dVar) {
        this.f66082a = context;
        this.f66083b = dVar;
    }

    @Override // p3.h0
    public final void dispose() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportMultipleShareActivity", "unregister receiver");
        this.f66082a.unregisterReceiver(this.f66083b);
    }
}
