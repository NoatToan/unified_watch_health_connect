package n70;

import android.content.res.Resources;
import com.garmin.android.apps.connectmobile.R;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvc2/b$d;", "serverNotAvailable", "", "scheduledMaintenanceMessage", "Lc80/o0;", "promoData", "Lo70/v;", "<anonymous>", "(Lvc2/b$d;Ljava/lang/String;Lc80/o0;)Lo70/v;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetServerMaintenanceStatusUseCase$invoke$1", f = "GetServerMaintenanceStatusUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v5 extends v13.i implements e23.r<vc2.b.d, String, c80.o0, t13.d<? super o70.v>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ vc2.b.d f124697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ String f124698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ c80.o0 f124699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w5 f124700d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(w5 w5Var, t13.d<? super v5> dVar) {
        super(4, dVar);
        this.f124700d = w5Var;
    }

    @Override // e23.r
    public final Object invoke(vc2.b.d dVar, String str, c80.o0 o0Var, t13.d<? super o70.v> dVar2) {
        v5 v5Var = new v5(this.f124700d, dVar2);
        v5Var.f124697a = dVar;
        v5Var.f124698b = str;
        v5Var.f124699c = o0Var;
        return v5Var.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String string;
        vc2.l lVar;
        String str;
        vc2.b.d dVar = this.f124697a;
        String string2 = this.f124698b;
        c80.o0 o0Var = this.f124699c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (o0Var != null && o0Var.f25507c != null) {
            return new o70.v(null, null, null, o0Var, 7, null);
        }
        w5 w5Var = this.f124700d;
        if (dVar == null) {
            if (string2 == null) {
                return null;
            }
            Resources resources = w5Var.f124717b;
            Resources resources2 = w5Var.f124717b;
            String string3 = resources.getString(R.string.title_system_maintenance);
            string3.getClass();
            if (d53.w.J(string2)) {
                string2 = resources2.getString(R.string.msg_system_maintenance_in_progress);
                string2.getClass();
            }
            String str2 = string2;
            return new o70.v(str2, string3, i3.e5.g(str2, StringUtils.SPACE, resources2.getString(R.string.msg_check_status_website)), null, 8, null);
        }
        vc2.b bVar = (vc2.b) az0.b.f13674e.getValue();
        String string4 = "";
        if (bVar instanceof vc2.b.d) {
            az0.h hVar = az0.b.f13676g;
            if (hVar == null || (string = hVar.getTitle()) == null) {
            }
            if (d53.w.J(string)) {
                string = w5Var.f124717b.getString(R.string.title_outage_notice);
                string.getClass();
            }
            String str3 = string;
            lVar = dVar.f177085b;
            if (lVar != null && (str = lVar.f177124a) != null) {
                string4 = str;
            }
            if (d53.w.J(string4)) {
                string4 = w5Var.f124717b.getString(R.string.msg_card_server_outage);
                string4.getClass();
            }
            String str4 = string4;
            return new o70.v(str4, str3, i3.e5.g(str4, StringUtils.SPACE, w5Var.f124717b.getString(R.string.msg_check_status_website)), null, 8, null);
        }
        com.garmin.android.apps.connectmobile.i2.a aVar2 = com.garmin.android.apps.connectmobile.i2.f36769a;
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
        aVar2.getClass();
        com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ConnectivityMonitor", "Calling getServerMaintenanceCardTitle() but connectionState is " + bVar);
        string = "";
        if (d53.w.J(string)) {
            string = w5Var.f124717b.getString(R.string.title_outage_notice);
            string.getClass();
        }
        String str5 = string;
        lVar = dVar.f177085b;
        if (lVar != null) {
            string4 = str;
        }
        if (d53.w.J(string4)) {
            string4 = w5Var.f124717b.getString(R.string.msg_card_server_outage);
            string4.getClass();
        }
        String str6 = string4;
        return new o70.v(str6, str5, i3.e5.g(str6, StringUtils.SPACE, w5Var.f124717b.getString(R.string.msg_check_status_website)), null, 8, null);
    }
}
