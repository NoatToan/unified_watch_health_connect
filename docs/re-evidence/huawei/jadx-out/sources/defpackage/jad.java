package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.IReportDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private iwi f38278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PluginSportTrackAdapter f38279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f38280c;
    private int h = 0;
    private int j = 0;
    private long d = 0;
    private boolean e = false;

    public jad(PluginSportTrackAdapter pluginSportTrackAdapter, iwi iwiVar, Context context) {
        this.f38279b = pluginSportTrackAdapter;
        this.f38278a = iwiVar;
        this.f38280c = context;
    }

    public void a(PluginSportTrackAdapter pluginSportTrackAdapter) {
        this.f38279b = pluginSportTrackAdapter;
    }

    public void d(int i) {
        this.h = i;
    }

    public void b(int i) {
        this.j = i;
    }

    public void c() {
        if (jaa.h(this.h) && jaa.j(this.j)) {
            LogUtil.a("Track_ReportDataUtil", "registerReportData begin");
            if (this.f38279b == null) {
                LogUtil.e("Track_ReportDataUtil", "registerReportData mPluginTrackAdapter is null");
                return;
            }
            final boolean zBb = iwy.a(this.f38280c).bb();
            this.f38279b.registerReportDataListener(new IReportDataCallback() { // from class: jad.2
                @Override // com.huawei.hwfoundationmodel.trackmodel.IReportDataCallback
                public void onResult() {
                }

                @Override // com.huawei.hwfoundationmodel.trackmodel.IReportDataCallback
                public void onChange(nsp nspVar) {
                    if (jad.this.f38278a == null || nspVar == null) {
                        LogUtil.a("Track_ReportDataUtil", "registerReportDataListener null");
                        return;
                    }
                    iwy.a(jad.this.f38280c).b(zBb, nspVar);
                    jeh.e().e(iwy.a(BaseApplication.getContext()).i().a(), nspVar.y());
                    jad.this.d = nspVar.m();
                    njf njfVar = new njf(nspVar.m(), nspVar.w());
                    LogUtil.a("Track_ReportDataUtil", "registerReportDataListener newStep = ", Integer.valueOf(nspVar.w()));
                    ReleaseLogUtil.d("R_Track_ReportDataUtil", "registerReportDataListener onChange wear total steps");
                    iwt.d().d(njfVar);
                    iwy.a(BaseApplication.getContext()).b(nspVar);
                }
            });
            this.e = true;
            return;
        }
        LogUtil.e("Track_ReportDataUtil", "registerReportData not supportReportData");
    }

    public Bundle a(Bundle bundle) {
        String strValueOf;
        String strValueOf2;
        if (bundle == null) {
            bundle = new Bundle();
        }
        nsp nspVarI = iwy.a(BaseApplication.getContext()).i();
        if (nspVarI == null || (this.d != 0 && System.currentTimeMillis() - this.d > 20000)) {
            LogUtil.j("Track_ReportDataUtil", "putReportData reportData is null or long time no update");
            return bundle;
        }
        int iU = nspVarI.u();
        int iQ = nspVarI.q();
        int iC = nspVarI.c();
        int iT = nspVarI.t();
        int iS = nspVarI.s();
        String strValueOf3 = "";
        bundle.putString(MedalConstants.EVENT_STEPS, iU > 0 ? String.valueOf(iU) : "");
        if (iQ <= 0) {
            strValueOf = "";
        } else {
            strValueOf = String.valueOf(iQ);
        }
        bundle.putString("stepRate", strValueOf);
        bundle.putString("altitude", String.valueOf(iC));
        if (iT <= 0) {
            strValueOf2 = "";
        } else {
            strValueOf2 = String.valueOf(iT);
        }
        bundle.putString("totalCreep", strValueOf2);
        if (iS > 0) {
            strValueOf3 = String.valueOf(iS);
        }
        bundle.putString(BleConstants.TOTAL_DESCENT, strValueOf3);
        bundle.putString("calorie", String.valueOf(nspVarI.b() / 1000.0f));
        return bundle;
    }

    public void b() {
        if (this.e) {
            PluginSportTrackAdapter pluginSportTrackAdapter = this.f38279b;
            if (pluginSportTrackAdapter != null) {
                pluginSportTrackAdapter.unRegisterReportDataListener();
            }
            this.e = false;
        }
    }
}
