package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.media3.common.C;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.router.AppRouter;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.main.R;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class tti {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f49633a = BaseApplication.b();
    private HashMap<String, String> e = new HashMap<>(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f49634c = 0;

    public tti(fsj fsjVar) {
        if (fsjVar == null) {
            ReleaseLogUtil.a("SCUI_ThreeCircleShareManager", "ActiveRecordData is null");
            return;
        }
        if (a(fsjVar)) {
            d();
        }
        c(fsjVar.ag());
        d(fsjVar);
    }

    private void d(fsj fsjVar) {
        if (fsjVar.ag()) {
            this.e.put("first_circle_data", b(fsjVar.b()));
            this.e.put("three_circle_type", "1");
            this.e.put("first_circle_target", b(fsjVar.c()));
        } else {
            this.e.put("first_circle_data", b(fsjVar.u()));
            this.e.put("three_circle_type", "0");
            this.e.put("first_circle_target", b(fsjVar.x()));
        }
        this.e.put("second_circle_target", b(fsjVar.i()));
        this.e.put("third_circle_target", b(fsjVar.q()));
        this.e.put("second_circle_data", b(fsjVar.g()));
        this.e.put("third_circle_data", b(fsjVar.p()));
        this.e.put("sport_date", c(fsjVar.f()));
        this.e.put("three_circle_perfect_days", Integer.toString(this.f49634c));
    }

    private boolean a(fsj fsjVar) {
        return lsl.aa(fsjVar.f()) && e(fsjVar);
    }

    private boolean e(fsj fsjVar) {
        return fsjVar.b() >= fsjVar.c() && fsjVar.g() >= fsjVar.i() && fsjVar.p() >= fsjVar.q();
    }

    private void d() {
        this.f49634c = 0;
        if (System.currentTimeMillis() < 1676822400000L) {
            LogUtil.a("SCUI_ThreeCircleShareManager", "time is earlier than 20230220");
            return;
        }
        if (!"true".equals(wmq.a(this.f49633a).c(3))) {
            ReleaseLogUtil.d("SCUI_ThreeCircleShareManager", "PRIVACY_SPORT_DATA Sync is close");
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        IBaseResponseCallback iBaseResponseCallback = new IBaseResponseCallback() { // from class: tti.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("SCUI_ThreeCircleShareManager", " errorCode is ", Integer.valueOf(i), " objData is ", obj);
                if (!(obj instanceof ttj.e)) {
                    ReleaseLogUtil.e("SCUI_ThreeCircleShareManager", "requestPerfectDays onResponse with error data");
                    countDownLatch.countDown();
                } else {
                    tti.this.a((ttj.e) obj);
                    countDownLatch.countDown();
                }
            }
        };
        new ttp().e(iBaseResponseCallback);
        try {
            if (countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)) {
                return;
            }
            ReleaseLogUtil.e("SCUI_ThreeCircleShareManager", "RequestData wait timeout");
            iBaseResponseCallback.a(-1, null);
        } catch (InterruptedException unused) {
            ReleaseLogUtil.a("SCUI_ThreeCircleShareManager", "interrupted while waiting for requestData");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ttj.e eVar) {
        int iB = eVar.b();
        int iC = eVar.c();
        this.f49634c = eVar.d();
        if (iB != DateFormatUtil.a(System.currentTimeMillis(), TimeZone.getDefault())) {
            this.f49634c = 0;
            LogUtil.a("SCUI_ThreeCircleShareManager", "cloud data not today");
        } else if (iC != 1) {
            this.f49634c++;
            LogUtil.a("SCUI_ThreeCircleShareManager", "cloud data not achieve three circle today");
        }
    }

    private void c(boolean z) {
        if (!z) {
            this.e.put("first_circle_unit", this.f49633a.getResources().getString(R.string.IDS_settings_steps_unit));
        } else {
            this.e.put("first_circle_unit", this.f49633a.getResources().getString(R.string.IDS_band_data_sport_energy_unit));
        }
        this.e.put("second_circle_unit", this.f49633a.getResources().getString(R.string.IDS_min));
        this.e.put("third_circle_unit", this.f49633a.getResources().getString(R.string.IDS_messagecenter_time_hour_value));
    }

    private String c(long j) {
        return DateFormatUtil.a(j, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMD) + " " + UnitUtil.a(new Date(j), 2);
    }

    private String b(int i) {
        return Integer.toString(i);
    }

    public void c(int i) {
        String strValue;
        ujq.c(i);
        this.e.put(BleConstants.SPORT_TYPE, String.valueOf(1100));
        gyd gydVar = new gyd();
        gydVar.e(this.e);
        ReleaseLogUtil.d("SCUI_ThreeCircleShareManager", "ThreeCircleMap is ", e(this.e));
        ArrayList arrayList = new ArrayList(1);
        gxz gxzVar = new gxz();
        gxzVar.a(1165);
        gxzVar.b(R.drawable.ic_three_circle_share);
        arrayList.add(gxzVar);
        Bundle bundle = new Bundle();
        bundle.putSerializable("shareWaterMarkData", gydVar);
        bundle.putSerializable("waterMarkIds", arrayList);
        bundle.putString("shareSource", "threeCircle");
        bundle.putInt("downLoadId", 1100);
        bundle.putBoolean("isDownloadMarkFromCloud", true);
        if (i == 4) {
            strValue = AnalyticsValue.HEALTH_CIRCLE_RING_GUIDE_10401124.value();
        } else {
            strValue = AnalyticsValue.HEALTH_HOME_CIRCLE_RING_1040112.value();
        }
        bundle.putString("shareModuleId", strValue);
        AppRouter.c("/PluginSocialShare/CustomizeShareActivity").d(bundle).b(this.f49633a);
    }

    public String e(HashMap<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() instanceof String) {
                sb.append(entry.getKey().length());
                sb.append(" ");
                sb.append((Object) entry.getValue());
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
