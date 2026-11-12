package defpackage;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import com.huawei.health.device.manager.DeviceCloudSharePreferencesManager;
import com.huawei.health.device.ui.measure.fragment.HagridDeviceManagerFragment;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.device.wifi.lib.handler.StaticHandler;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindevice.R;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class dvi extends StaticHandler<HagridDeviceManagerFragment> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NoTitleCustomAlertDialog f32412c;

    public dvi(HagridDeviceManagerFragment hagridDeviceManagerFragment) {
        super(hagridDeviceManagerFragment);
    }

    @Override // com.huawei.health.device.wifi.lib.handler.StaticHandler
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void handleMessage(HagridDeviceManagerFragment hagridDeviceManagerFragment, Message message) {
        if (hagridDeviceManagerFragment == null || hagridDeviceManagerFragment.isDestory() || !hagridDeviceManagerFragment.isAdded()) {
            LogUtil.j("HagridDeviceManagerHandler", "MyHandler object is dead");
        } else if (message == null) {
            LogUtil.j("R_Weight_HagridDeviceManagerHandler", "MyHandler msg is null");
        } else {
            a(hagridDeviceManagerFragment, message);
            b(hagridDeviceManagerFragment, message);
        }
    }

    private void a(HagridDeviceManagerFragment hagridDeviceManagerFragment, Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                LogUtil.a("HagridDeviceManagerHandler", "MyHandler msg is REFRESH_WLAN_AND_OTA");
                d(hagridDeviceManagerFragment);
                return;
            }
            if (i == 3) {
                if (e(hagridDeviceManagerFragment)) {
                    EventBus.a(new EventBus.d("get_device_ssid", new Bundle()));
                }
            } else {
                if (i == 4) {
                    dvr.a().e(hagridDeviceManagerFragment);
                    return;
                }
                if (i != 5) {
                    if (i == 14) {
                        hagridDeviceManagerFragment.setWeightUnitResult(message.arg1);
                        return;
                    } else {
                        LogUtil.j("R_Weight_HagridDeviceManagerHandler", "MyHandler what is other");
                        return;
                    }
                }
                if (e(hagridDeviceManagerFragment)) {
                    hagridDeviceManagerFragment.setHuidType(3);
                    EventBus.a(new EventBus.d("get_manager_info", new Bundle()));
                }
            }
        }
    }

    private boolean e(HagridDeviceManagerFragment hagridDeviceManagerFragment) {
        if (hagridDeviceManagerFragment.getWeightInteractor() != null) {
            return hagridDeviceManagerFragment.getWeightInteractor().c();
        }
        return false;
    }

    private void b(HagridDeviceManagerFragment hagridDeviceManagerFragment, Message message) {
        switch (message.what) {
            case 6:
                hagridDeviceManagerFragment.refreshSubUserNum();
                break;
            case 7:
                d(hagridDeviceManagerFragment, message.arg1);
                break;
            case 8:
                hagridDeviceManagerFragment.switchToSubUserWifiPage();
                break;
            case 9:
                if (message.arg1 == 1) {
                    dvk.b().b("send_reset_cmd", new Bundle());
                } else {
                    dvk.b().e();
                }
                dvk.b().a();
                break;
            case 10:
                a(hagridDeviceManagerFragment);
                break;
            case 11:
            case 12:
            case 14:
            default:
                LogUtil.j("R_Weight_HagridDeviceManagerHandler", "MyHandler what is other");
                break;
            case 13:
                dvk.b().e();
                break;
            case 15:
                hagridDeviceManagerFragment.gotoHagridDeviceWlanUseGuideFragment();
                break;
            case 16:
                hagridDeviceManagerFragment.connectSuccess();
                break;
        }
    }

    private void d(HagridDeviceManagerFragment hagridDeviceManagerFragment) {
        if (dxm.ai(hagridDeviceManagerFragment.getProductId()) || dxm.q(hagridDeviceManagerFragment.getProductId())) {
            return;
        }
        boolean z = false;
        if (hagridDeviceManagerFragment.getWiFiDevice() != null && hagridDeviceManagerFragment.getHuid() != null && hagridDeviceManagerFragment.getHuid().length == 0) {
            LogUtil.a("HagridDeviceManagerHandler", "mWifiDevice != null but mHuid = null");
            if (hagridDeviceManagerFragment.getWiFiDevice().a().m() == 1) {
                LogUtil.a("HagridDeviceManagerHandler", "mHuid = null but isMainCloudUser");
                ean.g(hagridDeviceManagerFragment.getWiFiDevice().e());
                hagridDeviceManagerFragment.getWiFiDevice().doRemoveBond();
                hagridDeviceManagerFragment.setWiFiDevice(null);
                hagridDeviceManagerFragment.setDevId(null);
                hagridDeviceManagerFragment.setMainUser(false);
                f(hagridDeviceManagerFragment);
                return;
            }
        }
        if (hagridDeviceManagerFragment.getAdapter() == null) {
            LogUtil.j("R_Weight_HagridDeviceManagerHandler", "mAdapter is null.");
            return;
        }
        if (hagridDeviceManagerFragment.getHuid() != null && hagridDeviceManagerFragment.getHuid().length > 0) {
            z = true;
        }
        e(hagridDeviceManagerFragment, z);
        if (!z) {
            b(hagridDeviceManagerFragment);
            return;
        }
        if (!hagridDeviceManagerFragment.isMainUser()) {
            LogUtil.a("HagridDeviceManagerHandler", "current user is not main user and show shareItem");
            dwe dweVarCreateSettingItem = hagridDeviceManagerFragment.createSettingItem(14, e(R.string.IDS_device_user_manager), "", "");
            dweVarCreateSettingItem.e(true);
            d(hagridDeviceManagerFragment, dweVarCreateSettingItem);
            hagridDeviceManagerFragment.dealWithLoadingResult(!hagridDeviceManagerFragment.isClickDeviceVersionUpdateItem());
            return;
        }
        LogUtil.j("R_Weight_HagridDeviceManagerHandler", "RefreshWlan no new items.");
    }

    private void d(HagridDeviceManagerFragment hagridDeviceManagerFragment, dwe dweVar) {
        boolean zD = hagridDeviceManagerFragment.getAdapter().d(13, dweVar);
        LogUtil.a("HagridDeviceManagerHandler", "replaceFlag: ", Boolean.valueOf(zD));
        if (zD) {
            hagridDeviceManagerFragment.getAdapter().b(12);
        }
    }

    private String e(int i) {
        return BaseApplication.getContext().getResources().getString(i);
    }

    private void b(HagridDeviceManagerFragment hagridDeviceManagerFragment) {
        String str;
        LogUtil.a("HagridDeviceManagerHandler", "No manager.");
        if (qrs.ah(BaseApplication.getContext())) {
            str = String.format(Locale.ENGLISH, hagridDeviceManagerFragment.getMainActivity().getResources().getString(R.string.IDS_pad_device_auto_sync_data), new Object[0]);
        } else {
            str = String.format(Locale.ENGLISH, hagridDeviceManagerFragment.getMainActivity().getResources().getString(R.string.IDS_device_request_wlan_auto_sync_data_sub_content), new Object[0]);
        }
        LogUtil.a("HagridDeviceManagerHandler", "refreshWlan wlanItem does not have Manager and show config network");
        dwe dweVarCreateSettingItem = hagridDeviceManagerFragment.createSettingItem(13, e(R.string.IDS_device_wifi_config_network), str, "");
        dweVarCreateSettingItem.e(true);
        hagridDeviceManagerFragment.getAdapter().d(14, dweVarCreateSettingItem);
        hagridDeviceManagerFragment.getAdapter().c(dweVarCreateSettingItem);
        hagridDeviceManagerFragment.dealWithLoadingResult(hagridDeviceManagerFragment.isClickDeviceVersionUpdateItem());
    }

    private void f(HagridDeviceManagerFragment hagridDeviceManagerFragment) {
        LogUtil.a("HagridDeviceManagerHandler", "update item manager to ble");
        hagridDeviceManagerFragment.getAdapter().d(12);
        hagridDeviceManagerFragment.showClaimDataView();
    }

    private void e(HagridDeviceManagerFragment hagridDeviceManagerFragment, boolean z) {
        DeviceCloudSharePreferencesManager deviceCloudSharePreferencesManager = new DeviceCloudSharePreferencesManager(dxw.d());
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("device_has_manager");
        stringBuffer.append(hagridDeviceManagerFragment.getUniqueId());
        LogUtil.a("HagridDeviceManagerHandler", "saveDeviceManagerStatus code: ", CommonUtil.n(hagridDeviceManagerFragment.getUniqueId()));
        deviceCloudSharePreferencesManager.c(stringBuffer.toString(), z);
    }

    private void d(HagridDeviceManagerFragment hagridDeviceManagerFragment, int i) {
        if (hagridDeviceManagerFragment.getAdapter() != null) {
            dwe dweVarA = hagridDeviceManagerFragment.getAdapter().a(12);
            if (dweVarA != null) {
                dweVarA.c(i > 0);
                hagridDeviceManagerFragment.getAdapter().notifyDataSetChanged();
                return;
            }
            return;
        }
        LogUtil.j("HagridDeviceManagerHandler", "refreshAuthRequestNum is null, num:", Integer.valueOf(i));
    }

    public void a(HagridDeviceManagerFragment hagridDeviceManagerFragment) {
        LogUtil.a("HagridDeviceManagerHandler", "showConfigureNetworkDialog starting");
        if (hagridDeviceManagerFragment.getMainActivity() == null) {
            LogUtil.j("HagridDeviceManagerHandler", "showConfigureNetworkDialog getActivity is null");
            return;
        }
        if (!e(hagridDeviceManagerFragment)) {
            LogUtil.j("HagridDeviceManagerHandler", "please connect bluetooth!!!");
            return;
        }
        if (!"b29df4e3-b1f7-4e40-960d-4cfb63ccca05".equals(hagridDeviceManagerFragment.getProductId())) {
            LogUtil.j("HagridDeviceManagerHandler", "this device is not HAG2021 scale");
            return;
        }
        if ((dmp.d().b(hagridDeviceManagerFragment.getUniqueId(), false) instanceof eby) || dxi.b(hagridDeviceManagerFragment.getUniqueId())) {
            LogUtil.j("HagridDeviceManagerHandler", "is not bleDevice or have manage");
        } else if (dxi.c(hagridDeviceManagerFragment.getHuid(), hagridDeviceManagerFragment.getMainActivity(), "HagridDeviceManagerHandler")) {
            LogUtil.j("HagridDeviceManagerHandler", "showConfigureNetworkDialog current user is mainUser");
        } else {
            c(hagridDeviceManagerFragment);
        }
    }

    private void c(final HagridDeviceManagerFragment hagridDeviceManagerFragment) {
        int i;
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.f32412c;
        if (noTitleCustomAlertDialog != null) {
            if (noTitleCustomAlertDialog.isShowing()) {
                this.f32412c.dismiss();
            }
            this.f32412c = null;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(hagridDeviceManagerFragment.getMainActivity());
        if (Utils.o()) {
            i = R.string.IDS_manage_network_tip_oversea;
        } else {
            i = R.string.IDS_device_manage_network_tip;
        }
        builder.b(i).c(R.string.IDS_wlan_config_device, new View.OnClickListener() { // from class: dvl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(hagridDeviceManagerFragment, view);
            }
        }).a(R.string.IDS_device_hygride_button_cancel, new View.OnClickListener() { // from class: dvj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dvi.e(hagridDeviceManagerFragment, view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.f32412c = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.f32412c.show();
    }

    /* synthetic */ void c(HagridDeviceManagerFragment hagridDeviceManagerFragment, View view) {
        LogUtil.a("HagridDeviceManagerHandler", "configCustomAlertDialog is Positive");
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "hagridConfigureTheNetwork" + hagridDeviceManagerFragment.getUniqueId(), String.valueOf(System.currentTimeMillis()), null);
        if (e(hagridDeviceManagerFragment)) {
            hagridDeviceManagerFragment.configWifi();
            this.f32412c.dismiss();
        } else {
            qpx.e(BaseApplication.getContext(), e(R.string.IDS_plugin_device_weight_device_not_connect));
        }
    }

    static /* synthetic */ void e(HagridDeviceManagerFragment hagridDeviceManagerFragment, View view) {
        LogUtil.a("HagridDeviceManagerHandler", "configCustomAlertDialog is Negative");
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "hagridConfigureTheNetwork" + hagridDeviceManagerFragment.getUniqueId(), String.valueOf(System.currentTimeMillis()), null);
    }

    public void c() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.f32412c;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            this.f32412c.dismiss();
        }
        this.f32412c = null;
    }
}
