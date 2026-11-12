package com.huawei.health.ecologydevice.manager;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.huawei.ecologydevice.R;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.ecologydevice.manager.DeviceUnbindHelper;
import com.huawei.health.ecologydevice.networkclient.BindStatusCheckResponse;
import com.huawei.health.ecologydevice.networkclient.OnRequestCallBack;
import com.huawei.health.ecologydevice.networkclient.ResponseResult;
import com.huawei.health.ecologydevice.ui.BaseFragment;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import defpackage.dxw;
import defpackage.elh;
import defpackage.etn;
import defpackage.lmf;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class DeviceUnbindHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BaseFragment f6523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private elh f6525c;
    private final DeviceUnBingListen d;
    private final String i;
    private CustomTextAlertDialog g = null;
    private final OnRequestCallBack<ResponseResult> f = new OnRequestCallBack<ResponseResult>() { // from class: com.huawei.health.ecologydevice.manager.DeviceUnbindHelper.2
        @Override // com.huawei.health.ecologydevice.networkclient.OnRequestCallBack
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(ResponseResult responseResult) {
            if (DeviceUnbindHelper.this.f6523a == null || DeviceUnbindHelper.this.f6523a.getActivity() == null) {
                LogUtil.j("DeviceUnBindHelper", "onSuccess mBaseFragment = null");
                return;
            }
            if (responseResult.isSuccess()) {
                LogUtil.a("DeviceUnBindHelper", "UnbindSinoDeviceRequest onSuccess");
                DeviceUnbindHelper.this.e();
                return;
            }
            ReleaseLogUtil.d("DEVMGR_DeviceUnBindHelper", "UnbindSinoDeviceRequest onFail");
            etn.b((Activity) DeviceUnbindHelper.this.f6523a.getActivity(), responseResult.getMsg(), false);
            if (DeviceUnbindHelper.this.d != null) {
                DeviceUnbindHelper.this.d.onFail();
            }
        }

        @Override // com.huawei.health.ecologydevice.networkclient.OnRequestCallBack
        public void onFail(int i, Throwable th) {
            ReleaseLogUtil.a("DEVMGR_DeviceUnBindHelper", "onFail errorCode ", Integer.valueOf(i), ",throwable ", th.toString());
        }
    };
    private final HealthDeviceEntryApi e = (HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class);

    public interface DeviceUnBingListen {
        void onFail();

        void onSuccess(int i);
    }

    public static /* synthetic */ void c(View view) {
    }

    public DeviceUnbindHelper(BaseFragment baseFragment, String str, String str2, DeviceUnBingListen deviceUnBingListen) {
        this.f6523a = baseFragment;
        this.f6524b = str;
        this.i = str2;
        this.d = deviceUnBingListen;
    }

    public void b() {
        LogUtil.a("DeviceUnBindHelper", "unBindHaveBindDevice to enter");
        if (TextUtils.isEmpty(this.f6524b)) {
            LogUtil.a("DeviceUnBindHelper", "unBindHaveBindDevice productId is null");
            return;
        }
        elh elhVarD = ResourceManager.c().d(this.f6524b);
        this.f6525c = elhVarD;
        if (elhVarD == null) {
            LogUtil.a("DeviceUnBindHelper", "unBindHaveBindDevice productInfo is null");
        } else if (a(elhVarD) || GprsDeviceHelper.b(this.f6524b)) {
            d();
        } else {
            a();
        }
    }

    private boolean a(elh elhVar) {
        int iC = elhVar.v().c();
        return iC == 2 || iC == 1;
    }

    private void d() {
        BaseFragment baseFragment = this.f6523a;
        if (baseFragment == null || baseFragment.getContext() == null) {
            LogUtil.j("DeviceUnBindHelper", "showBluetoothUnBindDialog mBaseFragment = null");
            return;
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f6523a.getContext()).a(R.string.IDS_hw_health_wear_connect_device_unpair_button).b(R.string.IDS_unbind_device_wear_home).a(R.string.IDS_hw_health_wear_connect_device_unpair_button, new View.OnClickListener() { // from class: eki
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: ekj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(view);
            }
        }).b();
        this.g = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.g.show();
    }

    public /* synthetic */ void b(View view) {
        CustomTextAlertDialog customTextAlertDialog = this.g;
        if (customTextAlertDialog != null) {
            customTextAlertDialog.dismiss();
            this.g = null;
            f();
            return;
        }
        LogUtil.a("DeviceUnBindHelper", "ProductIntroductionFragment setPositiveButton mUnbindDialog = null");
    }

    public /* synthetic */ void a(View view) {
        CustomTextAlertDialog customTextAlertDialog = this.g;
        if (customTextAlertDialog != null) {
            customTextAlertDialog.dismiss();
            this.g = null;
        } else {
            LogUtil.a("DeviceUnBindHelper", "ProductIntroductionFragment setNegativeButton mUnbindDialog = null");
        }
    }

    private void a() {
        BaseFragment baseFragment = this.f6523a;
        if (baseFragment == null || baseFragment.getContext() == null) {
            LogUtil.j("DeviceUnBindHelper", "showOtherUnBindDialog mBaseFragment = null");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f6523a.getContext());
        builder.b(R.string.IDS_device_selection_cancel_unbind_device);
        builder.c(R.string.IDS_device_ui_dialog_yes, new View.OnClickListener() { // from class: ekl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33080c.d(view);
            }
        });
        builder.a(R.string.IDS_device_ui_dialog_no, new View.OnClickListener() { // from class: ekk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceUnbindHelper.c(view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void d(View view) {
        f();
    }

    private void f() {
        BaseFragment baseFragment = this.f6523a;
        if (baseFragment == null || baseFragment.getActivity() == null) {
            LogUtil.j("DeviceUnBindHelper", "unBindDevice mBaseFragment = null");
            return;
        }
        if (etn.h(this.f6524b)) {
            ReleaseLogUtil.d("DEVMGR_DeviceUnBindHelper", "unBindSino request");
            GprsDeviceHelper.a(this.f6523a.getActivity(), this.i, this.f);
        } else if (GprsDeviceHelper.b(this.f6524b)) {
            c();
        } else {
            e();
        }
    }

    private void c() {
        ReleaseLogUtil.d("DEVMGR_DeviceUnBindHelper", "deviceUnBind");
        GprsDeviceHelper.c(new OnRequestCallBack<BindStatusCheckResponse.DeviceBindResp>() { // from class: com.huawei.health.ecologydevice.manager.DeviceUnbindHelper.4
            @Override // com.huawei.health.ecologydevice.networkclient.OnRequestCallBack
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(BindStatusCheckResponse.DeviceBindResp deviceBindResp) {
                LogUtil.a("DeviceUnBindHelper", "deviceUnBind onSuccess");
                DeviceUnbindHelper.this.e();
            }

            @Override // com.huawei.health.ecologydevice.networkclient.OnRequestCallBack
            public void onFail(int i, Throwable th) {
                ReleaseLogUtil.a("DEVMGR_DeviceUnBindHelper", "deviceUnBind onFail errorCode = ", Integer.valueOf(i), "Error:", th.getMessage());
                String str = "errorCode = " + i + "," + th.getMessage();
                if (DeviceUnbindHelper.this.f6523a != null && DeviceUnbindHelper.this.f6523a.getActivity() != null) {
                    etn.b((Activity) DeviceUnbindHelper.this.f6523a.getActivity(), str, false);
                    if (DeviceUnbindHelper.this.d != null) {
                        DeviceUnbindHelper.this.d.onFail();
                        return;
                    }
                    return;
                }
                LogUtil.j("DeviceUnBindHelper", "onFail mBaseFragment = null");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        g();
        ResourceManager.c().f();
        BaseFragment baseFragment = this.f6523a;
        if (baseFragment != null) {
            baseFragment.popupFragment(null);
        }
    }

    private void g() {
        if (this.f6525c == null) {
            LogUtil.j("DeviceUnBindHelper", "unBindDeviceLocal mProductInfo = null");
            return;
        }
        HashMap map = new HashMap(2);
        map.put("click", "1");
        map.put("device_name", etn.c(this.f6524b, this.f6525c.l().d()));
        if (j()) {
            lmf.d().c(dxw.d(), AnalyticsValue.HEALTH_PLUGIN_DEVICE_UNBIND_SUCCEED_2060014.value(), map, 0);
            if (etn.a(this.f6523a.getContext())) {
                this.f6523a.popupFragment(null);
            }
            DeviceUnBingListen deviceUnBingListen = this.d;
            if (deviceUnBingListen != null) {
                deviceUnBingListen.onSuccess(1);
            }
        }
    }

    private boolean j() {
        if (this.e.isDeviceKitUniversal(this.f6524b)) {
            return this.e.unbindDeviceUniversalByUniqueId(this.f6524b, this.i);
        }
        if (!TextUtils.isEmpty(this.i)) {
            return this.e.unbindDeviceByUniqueId(this.i);
        }
        return this.e.unbindDevice(this.f6524b);
    }
}
