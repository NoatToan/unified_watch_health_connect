package eu;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import i3.mc;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leu/d;", "Landroid/content/BroadcastReceiver;", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f66077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f66078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mc f66079c;

    public d(b0 b0Var, e23.a<Unit> aVar, mc mcVar) {
        this.f66077a = b0Var;
        this.f66078b = aVar;
        this.f66079c = mcVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str = "onReceive: " + intent;
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "AnnualReportMultipleShareActivity", str);
        c cVar = c.f66055a;
        ge1.b.T(this.f66077a, null, null, new e(this.f66079c, null), 3);
        this.f66078b.invoke();
    }
}
