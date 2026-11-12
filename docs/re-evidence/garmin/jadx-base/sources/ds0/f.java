package ds0;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.JetLagActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JetLagActivity f61072b;

    public /* synthetic */ f(JetLagActivity jetLagActivity, int i14) {
        this.f61071a = i14;
        this.f61072b = jetLagActivity;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f61071a;
        JetLagActivity jetLagActivity = this.f61072b;
        switch (i14) {
            case 0:
                JetLagActivity.a aVar = JetLagActivity.f36950d;
                jetLagActivity.ca(e.f61070a);
                return Unit.INSTANCE;
            default:
                JetLagActivity.a aVar2 = JetLagActivity.f36950d;
                Bundle extras = jetLagActivity.getIntent().getExtras();
                return Boolean.valueOf(extras != null ? extras.getBoolean("EXTRA_FROM_CALENDAR") : false);
        }
    }
}
