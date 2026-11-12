package defpackage;

import com.google.gson.Gson;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Collections;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class fkp {
    private IBaseResponseCallback i;
    private boolean d = false;
    private IBaseResponseCallback j = new IBaseResponseCallback() { // from class: fkp.1
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("Posture_BtProtocolChannel", "mOpenRunPostureCallback errorCode: ", Integer.valueOf(i), ", objData: ", obj.toString());
            if (i != 100000) {
                return;
            }
            DeviceInfo deviceInfoA = fkp.this.a();
            if (deviceInfoA == null) {
                LogUtil.j("Posture_BtProtocolChannel", "mOpenRunPostureCallback device is null.");
                return;
            }
            gzt gztVar = (gzt) new Gson().fromJson(CommonUtil.ac(obj.toString()), gzt.class);
            if (gztVar != null) {
                fkp.this.e(gztVar, deviceInfoA);
            } else {
                LogUtil.j("Posture_BtProtocolChannel", "mOpenRunPostureCallback runPostureDataInfo null");
            }
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IBaseResponseCallback f34134c = new IBaseResponseCallback() { // from class: fkp.3
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            ReleaseLogUtil.d("HWhealthLinkage_Posture_BtProtocolChannel", "mCloseRunPostureCallback errorCode = ", Integer.valueOf(i));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseResponseCallback f34132a = new IBaseResponseCallback() { // from class: fkp.2
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("Posture_BtProtocolChannel", "mOpenCadenceDataCallback errorCode: ", Integer.valueOf(i), ", objData: ", obj.toString());
            if (i != 100000) {
                return;
            }
            DeviceInfo deviceInfoA = fkp.this.a();
            if (deviceInfoA == null) {
                LogUtil.j("Posture_BtProtocolChannel", "mOpenCadenceDataCallback device is null.");
                return;
            }
            gzs gzsVar = (gzs) new Gson().fromJson(CommonUtil.ac(obj.toString()), gzs.class);
            if (gzsVar != null) {
                fkp.this.e(gzsVar, deviceInfoA);
            } else {
                LogUtil.j("Posture_BtProtocolChannel", "mOpenCadenceDataCallback runPostureDataInfo null");
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IBaseResponseCallback f34133b = new IBaseResponseCallback() { // from class: fkp.4
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            ReleaseLogUtil.d("HWhealthLinkage_Posture_BtProtocolChannel", "mCloseCadenceCallback errorCode = ", Integer.valueOf(i));
        }
    };
    private IBaseResponseCallback e = new IBaseResponseCallback() { // from class: fkp.5
        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("Posture_BtProtocolChannel", "mAw70LinkReportStatusCallback errCode is ", Integer.valueOf(i));
            if (i != 100000) {
                return;
            }
            if (obj == null) {
                LogUtil.j("Posture_BtProtocolChannel", "mAw70LinkReportStatusCallback objData is null");
                return;
            }
            try {
                if (obj instanceof String) {
                    JSONArray jSONArray = new JSONArray((String) obj);
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        fkp.this.i.a(100000, jSONArray.getJSONObject(i2));
                    }
                }
            } catch (JSONException e) {
                ReleaseLogUtil.a("HWhealthLinkage_Posture_BtProtocolChannel", "get mAw70LinkReportStatusCallback error: ", ExceptionUtils.c(e));
                xjt.v("mAw70LinkReportStatusCallback JSONException:" + e.getMessage());
            }
        }
    };

    public void e(int i, int i2) {
        c(i, i2, this.j);
    }

    public void b(int i, int i2) {
        c(i, i2, this.f34134c);
    }

    public void a(final int i, final int i2) {
        fks.d().c(new IBaseResponseCallback() { // from class: fkp.8
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                LogUtil.a("Posture_BtProtocolChannel", "openRidePosture onResponse errCode:", Integer.valueOf(i3), "objData", obj);
                if (i3 == 100000 && "true".equals(obj)) {
                    fkp fkpVar = fkp.this;
                    fkpVar.c(i, i2, fkpVar.f34132a);
                }
            }
        });
    }

    public void c(int i, int i2) {
        c(i, i2, this.f34133b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DeviceInfo a() {
        DeviceInfo deviceInfoE = fhf.b().e();
        if (deviceInfoE != null && !this.d) {
            fhf.b().e(Collections.singletonList(deviceInfoE));
            this.d = true;
        }
        return deviceInfoE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, int i2, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("Posture_BtProtocolChannel", "changePostureReportStatus, 1 & 3 means open, 2 & 4 means close, sportStatus = ", Integer.valueOf(i));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i);
            jSONObject.put(BleConstants.SPORT_TYPE, i2);
        } catch (JSONException e) {
            ReleaseLogUtil.a("HWhealthLinkage_Posture_BtProtocolChannel", "changePostureReportStatus exception: ", ExceptionUtils.c(e));
            xjt.v("changePostureReportStatus exception:" + e.getMessage());
        }
        this.i = iBaseResponseCallback;
        fks.d().a(jSONObject, this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Object obj, DeviceInfo deviceInfo) {
        Map<Integer, Double> mapB = fkn.b(obj);
        if (mapB.isEmpty()) {
            ReleaseLogUtil.e("HWhealthLinkage_Posture_BtProtocolChannel", "parseData error, fieldsValue is empty.");
            return;
        }
        fhf.b().a(deviceInfo, HiJsonUtil.d(mapB), fkn.b(mapB.keySet()));
    }
}
