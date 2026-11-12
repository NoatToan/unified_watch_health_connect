package cu1;

import c22.j0;
import c22.t3;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import org.joda.time.DateTime;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.training.atp.dashboard.d f55662b;

    public /* synthetic */ d0(com.garmin.android.apps.connectmobile.training.atp.dashboard.d dVar, int i14) {
        this.f55661a = i14;
        this.f55662b = dVar;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f55661a) {
            case 0:
                b bVar = this.f55662b.f45421i;
                if (bVar != null) {
                    bVar.c(-1);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("presenter");
                throw null;
            case 1:
                b bVar2 = this.f55662b.f45421i;
                if (bVar2 != null) {
                    bVar2.c(-1);
                    return Unit.INSTANCE;
                }
                p005kotlin.jvm.internal.s.m("presenter");
                throw null;
            case 2:
                wt1.b bVar3 = this.f55662b.f45429q;
                if (bVar3 != null) {
                    bVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                b bVar4 = this.f55662b.f45421i;
                if (bVar4 == null) {
                    p005kotlin.jvm.internal.s.m("presenter");
                    throw null;
                }
                wt1.a aVar = (wt1.a) KoinJavaComponent.get$default(wt1.a.class, null, null, 6, null);
                UserSettingsDTO userSettings = aVar.getUserSettings();
                UserSettingsDTO userSettingsDTOC = userSettings.C();
                String strB = j0.b(DateTime.now(), "yyyy-MM-dd", null);
                wi1.j jVar = userSettings.f43524b;
                if (jVar != null) {
                    jVar.f185557v = strB;
                }
                JSONObject jSONObjectB = t3.b(userSettings.t1(), userSettingsDTOC.t1());
                if (jSONObjectB != null) {
                    bVar4.f55627a.U1();
                    bVar4.f55630d.add(Long.valueOf(aVar.a(userSettings, jSONObjectB, bVar4.f55642p)));
                }
                return Unit.INSTANCE;
            default:
                g22.e.a(this.f55662b, null);
                return Unit.INSTANCE;
        }
    }
}
