package com.xiaomi.hm.health.device.view;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.widget.EditText;
import androidx.annotation.Nullable;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.model.HMBrandType;
import com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import com.xiaomi.hm.health.device.webapi.device.HMWebBindInfo;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes19.dex */
public class EditDeviceDisplayNameDialog implements DialogInterface.OnClickListener {
    private static final String g = "EditDeviceDisplayNameDialog";
    private static final int h = 20;
    private Device a;
    private Context c;
    private IDisplayNameListener b = null;
    private final Lazy<KeeperProxyApi> d = KoinJavaComponent.inject(KeeperProxyApi.class);
    private final Lazy<DeviceUtilsApi> e = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private final Lazy<DeviceManagerApi> f = KoinJavaComponent.inject(DeviceManagerApi.class);

    public interface IDisplayNameListener {
        void onDisplayNameChanged(String str);
    }

    private EditDeviceDisplayNameDialog(@NotNull Device device, @NotNull Context context) {
        this.a = null;
        this.c = null;
        this.a = device;
        this.c = context;
    }

    private String d() {
        if (TextUtils.isEmpty(this.a.getDisplayName())) {
            return (GlobalConfig.get().isBuildMidong() && this.f.getValue().isUseWearCompanionName(this.a)) ? this.e.getValue().getHuamiDeviceDescription(this.a) : this.e.getValue().getDeviceDescription(HMDeviceSource.fromValue(this.a.getDevice_source().intValue()), HMBrandType.fromValue(this.a.getBrandType().intValue()));
        }
        return this.a.getDisplayName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e() {
        return "error when find text value.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(boolean z) {
        return "update name: " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(HMWebBindInfo hMWebBindInfo) {
        String device_id;
        final boolean zUpdateDeviceToWeb = HMDeviceWebAPI.updateDeviceToWeb(hMWebBindInfo);
        HMLog.info(g, new Function0() { // from class: fi1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditDeviceDisplayNameDialog.f(zUpdateDeviceToWeb);
            }
        });
        if (zUpdateDeviceToWeb) {
            return;
        }
        String uploadDeviceIds = this.d.getValue().getUploadDeviceIds();
        if (TextUtils.isEmpty(uploadDeviceIds)) {
            device_id = this.a.getDevice_id();
        } else {
            device_id = uploadDeviceIds + "," + this.a.getDevice_id();
        }
        this.d.getValue().setUploadDeviceIds(device_id);
    }

    private void h(DialogInterface dialogInterface) {
        try {
            if (dialogInterface instanceof AlertDialogFragment) {
                String strTrim = ((EditText) ((AlertDialogFragment) dialogInterface).getView().findViewById(R.id.dialog_edittext)).getText().toString().replaceAll("\\n", "").trim();
                if (strTrim.length() > 20) {
                    strTrim = strTrim.substring(0, 19);
                }
                this.a.setDisplayName(strTrim);
                if (this.f.getValue().isActive(this.a)) {
                    this.f.getValue().updateDisplayName(HMDeviceType.fromValue(this.a.getDevice_type().intValue()), strTrim);
                } else {
                    this.f.getValue().updateDevice(this.a);
                }
                i(strTrim);
                IDisplayNameListener iDisplayNameListener = this.b;
                if (iDisplayNameListener != null) {
                    iDisplayNameListener.onDisplayNameChanged(strTrim);
                }
            }
        } catch (Exception e) {
            HMLog.error(g, "100", e, new Function0() { // from class: gi1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EditDeviceDisplayNameDialog.e();
                }
            });
        }
    }

    private void i(String str) {
        final HMWebBindInfo hMWebBindInfoCreateUpdateInfo = HMWebBindInfo.createUpdateInfo(this.a.getDevice_type().intValue(), this.a.getDevice_id(), this.a.getActiveStatus().intValue(), str);
        new Thread(new Runnable() { // from class: ei1
            @Override // java.lang.Runnable
            public final void run() {
                this.a.g(hMWebBindInfoCreateUpdateInfo);
            }
        }).start();
    }

    @Nullable
    public static AlertDialogFragment newInstance(@Nullable Device device, @Nullable Context context, @NotNull IDisplayNameListener iDisplayNameListener) {
        if (device == null || context == null) {
            return null;
        }
        EditDeviceDisplayNameDialog editDeviceDisplayNameDialog = new EditDeviceDisplayNameDialog(device, context);
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(context);
        editDeviceDisplayNameDialog.setDisplayNameLisenter(iDisplayNameListener);
        builder.setHint(editDeviceDisplayNameDialog.d()).setTitle(R.string.add_device_display_name).setNegativeButton(R.string.cancel, editDeviceDisplayNameDialog).setPositiveButton(R.string.save, editDeviceDisplayNameDialog);
        return builder.create();
    }

    public void closeSoftInput(Context context) {
        if (context != null) {
            this.e.getValue().closeSoftInput(context);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            h(dialogInterface);
        }
        Context context = this.c;
        if (context != null) {
            closeSoftInput(context);
        }
        dialogInterface.dismiss();
    }

    public void setDevice(Device device) {
        this.a = device;
    }

    public void setDisplayNameLisenter(IDisplayNameListener iDisplayNameListener) {
        this.b = iDisplayNameListener;
    }
}
