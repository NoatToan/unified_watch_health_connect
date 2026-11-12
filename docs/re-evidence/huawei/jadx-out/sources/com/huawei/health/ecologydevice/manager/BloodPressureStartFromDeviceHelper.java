package com.huawei.health.ecologydevice.manager;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.ecologydevice.R;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.MeasureKit;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import defpackage.dxw;
import defpackage.elh;
import defpackage.enw;
import health.compact.a.Services;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class BloodPressureStartFromDeviceHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f6520a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f6521c;
    private static BloodPressureStartFromDeviceHelper d;
    private static final Set<String> e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f6522b;
    private int f = 2;
    private StartFromDeviceListen h;
    private String i;
    private CustomViewDialog j;

    public interface StartFromDeviceListen {
        void onMeasureChanged(int i);

        void onStatusChanged(int i);
    }

    static {
        HashSet hashSet = new HashSet(10);
        e = hashSet;
        d = null;
        hashSet.add("O008");
        hashSet.add("O007");
        hashSet.add("O006");
        hashSet.add("O03S");
    }

    public static BloodPressureStartFromDeviceHelper c() {
        BloodPressureStartFromDeviceHelper bloodPressureStartFromDeviceHelper;
        synchronized (f6520a) {
            if (d == null) {
                d = new BloodPressureStartFromDeviceHelper();
            }
            bloodPressureStartFromDeviceHelper = d;
        }
        return bloodPressureStartFromDeviceHelper;
    }

    public static void e() {
        synchronized (f6520a) {
            d = null;
        }
    }

    public static boolean a() {
        return !TextUtils.isEmpty(f6521c) && "1".equals(f6521c);
    }

    public static void d(elh elhVar) {
        if (c(elhVar)) {
            f6521c = elhVar.y().d();
        } else {
            LogUtil.a("BloodPressureStartFromDeviceHelper", "productInfo or Resolution or getResolution is null");
            f6521c = "";
        }
    }

    private static boolean c(elh elhVar) {
        return (elhVar == null || elhVar.y() == null) ? false : true;
    }

    public static boolean b(String str) {
        return e.contains(str);
    }

    public static boolean c(String str) {
        return a() && b(str);
    }

    public int d() {
        return this.f6522b;
    }

    public int b() {
        return this.f;
    }

    public void e(int i) {
        this.f = i;
    }

    public void c(String str, String str2, StartFromDeviceListen startFromDeviceListen) {
        this.i = str2;
        this.h = startFromDeviceListen;
        if (!a()) {
            LogUtil.j("BloodPressureStartFromDeviceHelper", "Enter initResolution no SupportStartMeasureFromDevice");
        } else {
            LogUtil.a("BloodPressureStartFromDeviceHelper", "Enter initResolution");
            ((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).startMeasure(str, str2, new b(), f());
        }
    }

    public void a(elh elhVar) {
        MeasureKit measureKit;
        if (elhVar != null && (measureKit = ((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).getMeasureKit(elhVar.q())) != null) {
            measureKit.getMeasureController().cleanup();
        }
        this.h = null;
        e();
    }

    public void d(Context context, String str) {
        if (context == null) {
            return;
        }
        if (this.j == null) {
            View viewInflate = LayoutInflater.from(dxw.d()).inflate(R.layout.blood_pressure_connect_timeout_dialog, (ViewGroup) null);
            CustomViewDialog.Builder builder = new CustomViewDialog.Builder(context);
            builder.a(str).d(viewInflate).d(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: eke
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f33076c.d(view);
                }
            });
            CustomViewDialog customViewDialogD = builder.d();
            this.j = customViewDialogD;
            customViewDialogD.setCancelable(false);
        }
        this.j.show();
    }

    public /* synthetic */ void d(View view) {
        LogUtil.a("BloodPressureStartFromDeviceHelper", "showConnectionNoteDialog onclick PositiveButton");
        this.j.dismiss();
        this.j = null;
    }

    private Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putInt("type", -1);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(HealthData healthData) {
        if (TextUtils.isEmpty(this.i)) {
            LogUtil.j("BloodPressureStartFromDeviceHelper", "saveBloodPressureData UniqueId is null");
            return;
        }
        HealthDevice bondedDeviceByUniqueId = ((HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class)).getBondedDeviceByUniqueId(this.i);
        if (bondedDeviceByUniqueId == null) {
            LogUtil.a("BloodPressureStartFromDeviceHelper", "saveBloodPressureData device is null");
            return;
        }
        enw enwVar = new enw(DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value());
        enwVar.c(new IBaseResponseCallback() { // from class: ekf
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f33077a.a(i, obj);
            }
        });
        enwVar.onDataChanged(bondedDeviceByUniqueId, healthData);
    }

    public /* synthetic */ void a(int i, Object obj) {
        StartFromDeviceListen startFromDeviceListen;
        LogUtil.a("BloodPressureStartFromDeviceHelper", "BloodPressureResultFragment saveBloodPressureData() onResponse() err_code:", Integer.valueOf(i));
        if (i != 0 || (startFromDeviceListen = this.h) == null) {
            return;
        }
        startFromDeviceListen.onMeasureChanged(10002);
    }

    class b implements IHealthDeviceCallback {
        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onDataChanged(HealthDevice healthDevice, List<HealthData> list) {
        }

        private b() {
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onDataChanged(HealthDevice healthDevice, HealthData healthData) {
            LogUtil.a("BloodPressureStartFromDeviceHelper", "InnerHealthDeviceCallback onDataChanged");
            BloodPressureStartFromDeviceHelper.this.d(healthData);
            BloodPressureStartFromDeviceHelper.this.f = 2;
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onProgressChanged(HealthDevice healthDevice, HealthData healthData) {
            LogUtil.a("BloodPressureStartFromDeviceHelper", "InnerHealthDeviceCallback onProgressChanged");
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onStatusChanged(HealthDevice healthDevice, int i) {
            LogUtil.a("BloodPressureStartFromDeviceHelper", "InnerHealthDeviceCallback onStatusChanged status = ", Integer.valueOf(i));
            BloodPressureStartFromDeviceHelper.this.f6522b = i;
            if (BloodPressureStartFromDeviceHelper.this.h != null) {
                BloodPressureStartFromDeviceHelper.this.h.onStatusChanged(i);
            }
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onFailed(HealthDevice healthDevice, int i) {
            LogUtil.j("BloodPressureStartFromDeviceHelper", "InnerHealthDeviceCallback onFailed code=", Integer.valueOf(i));
        }

        @Override // com.huawei.health.device.callback.IHealthDeviceCallback
        public void onMeasureChanged(int i) {
            BloodPressureStartFromDeviceHelper.this.f = i;
            LogUtil.a("BloodPressureStartFromDeviceHelper", "InnerHealthDeviceCallback onMeasureChange status=", Integer.valueOf(i));
            if (BloodPressureStartFromDeviceHelper.this.h != null) {
                if (i == 0) {
                    BloodPressureStartFromDeviceHelper.this.h.onMeasureChanged(10004);
                } else if (i != 1) {
                    BloodPressureStartFromDeviceHelper.this.h.onMeasureChanged(i);
                } else {
                    BloodPressureStartFromDeviceHelper.this.h.onMeasureChanged(10003);
                }
            }
        }
    }
}
