package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;
import android.text.TextUtils;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class mxw implements ParserInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile mxw f42670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42671c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42672a;
    private String d;
    private String e;
    private eet f = new eet();
    private iof g;
    private Context j;

    private mxw(Context context) {
        this.j = context;
    }

    public String b() {
        return this.e;
    }

    public void b(String str) {
        this.e = str;
    }

    public String a() {
        return this.f42672a;
    }

    public void c(String str) {
        this.f42672a = str;
    }

    public String c() {
        return this.d;
    }

    public void a(String str) {
        this.d = str;
    }

    private void c(byte[] bArr, DeviceInfo deviceInfo) {
        LogUtil.a("HwSosManager", "handleResultFromDevice:", eeq.e(bArr));
        if (bArr == null || bArr.length <= 1) {
            LogUtil.d("HwSosManager", "data illegal");
            return;
        }
        ReleaseLogUtil.d("DEVMGR_HwSosManager", "handleResultFromDevice commandId:", Byte.valueOf(bArr[1]));
        byte b2 = bArr[1];
        if (b2 == 1) {
            b(bArr);
            return;
        }
        if (b2 == 2) {
            b(bArr, deviceInfo);
        } else if (b2 == 4) {
            a(bArr);
        } else {
            LogUtil.d("HwSosManager", "handleResultFromDevice nothing to do");
        }
    }

    public static mxw e() {
        mxw mxwVar;
        synchronized (f42671c) {
            if (f42670b == null) {
                f42670b = new mxw(BaseApplication.getContext());
            }
            mxwVar = f42670b;
        }
        return mxwVar;
    }

    public void e(iof iofVar) {
        ReleaseLogUtil.d("DEVMGR_HwSosManager", "syncEmergencyInfoToDevice enter");
        e(mxv.b(mxv.d(iofVar)));
    }

    public void d(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("DEVMGR_HwSosManager", "syncImageData enter");
        a(mxv.c(mxv.d()), deviceInfo);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    public void a(String str, iof iofVar) {
        String strB;
        ReleaseLogUtil.d("DEVMGR_HwSosManager", "syncSomeInfoToDevice enter updateKey:", str);
        if (TextUtils.isEmpty(str) || iofVar == null) {
            ReleaseLogUtil.e("DEVMGR_HwSosManager", "syncSomeInfoToDevice updateKey is empty or emergencyInfo is null");
            xjt.ak("HwSosManager syncSomeInfoToDevice: updateKey is empty or emergencyInfo is null");
            return;
        }
        if (d(str, iofVar)) {
            return;
        }
        str.hashCode();
        switch (str) {
            case "blood_type":
                strB = mxv.b(3, iofVar.b());
                break;
            case "address":
                strB = mxv.b(2, iofVar.g());
                break;
            case "organ_donor":
                strB = mxv.c(6, iofVar.j());
                break;
            case "key_update_all_emergency":
            case "key_clear_all_emergency":
                LogUtil.a("HwSosManager", "clear or update emergency info");
                strB = mxv.d(iofVar);
                break;
            case "name":
                strB = mxv.b(1, iofVar.i());
                break;
            case "allergies":
                strB = mxv.b(4, iofVar.e());
                break;
            case "emergency_contacts":
                LogUtil.a("HwSosManager", "buildUpSomeEmergencyInfo updateContact");
                strB = mxv.e(iofVar);
                break;
            case "medications":
                strB = mxv.b(5, iofVar.d());
                break;
            case "medical_conditions":
                strB = mxv.b(7, iofVar.c());
                break;
            default:
                LogUtil.a("HwSosManager", "buildUpSomeEmergencyInfo default");
                strB = "";
                break;
        }
        e(mxv.b(strB));
    }

    private void e(DeviceCommand deviceCommand) {
        if (deviceCommand != null) {
            LogUtil.a("HwSosManager", "sendDeviceCommand, deviceCommand:", deviceCommand.toString());
            mkf.e(this.j).sendDeviceData(deviceCommand);
        }
    }

    private void a(DeviceCommand deviceCommand, DeviceInfo deviceInfo) {
        if (deviceCommand == null || deviceCommand.getDataLen() <= 0) {
            return;
        }
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("HwSosManager", "deviceCommand:", deviceCommand.toString());
        mkf.e(this.j).sendDeviceData(deviceCommand);
    }

    private void b(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a("HwSosManager", "5.51.1 handleEmergencyInfo:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() <= 4) {
            ReleaseLogUtil.e("DEVMGR_HwSosManager", "handleEmergencyInfo data is error");
            xjt.ak("HwSosManager handleEmergencyInfo: data is error");
            return;
        }
        try {
            List<eew> listE = this.f.b(strE.substring(4)).e();
            if (listE != null && !listE.isEmpty()) {
                for (eew eewVar : listE) {
                    int iB = CommonUtil.b(eewVar.e(), 16);
                    String strB = eewVar.b();
                    if (iB == 127) {
                        ReleaseLogUtil.d("DEVMGR_HwSosManager", "handleEmergencyInfo ERROR_CODE:", Integer.valueOf(CommonUtil.b(strB, 16)));
                    } else {
                        ReleaseLogUtil.e("DEVMGR_HwSosManager", "handleEmergencyInfo, nothing to do");
                    }
                }
                return;
            }
            ReleaseLogUtil.e("DEVMGR_HwSosManager", "handleEmergencyInfo tlv error");
            xjt.ak("HwSosManager handleEmergencyInfo: tlvList is null or empty");
        } catch (eeu unused) {
            ReleaseLogUtil.a("DEVMGR_HwSosManager", "handleEmergencyInfo error");
            xjt.ak("HwSosManager handleEmergencyInfo: TlvException");
        }
    }

    private void a(String str, DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("DEVMGR_HwSosManager", "sendEmergencyInfoMessage enter");
        e(deviceInfo);
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("DEVMGR_HwSosManager", "sendEmergencyMessage messageContent is null or empty string");
            xjt.ak("HwSosManager sendEmergencyInfoMessage: msgContent is empty");
        } else if (mxv.b()) {
            mxu.e(str, new IBaseResponseCallback() { // from class: mxt
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f42667b.a(i, obj);
                }
            });
        } else {
            e(str);
        }
    }

    /* synthetic */ void a(int i, Object obj) {
        if (obj instanceof String) {
            e((String) obj);
        }
    }

    private void e(String str) {
        if (!j()) {
            ReleaseLogUtil.e("DEVMGR_HwSosManager", "sendEmergencyMessage canSendMessage is false");
            return;
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(this.j, 0, new Intent("SEND_SMS_ACTION"), 67108864);
        SmsManager smsManager = SmsManager.getDefault();
        for (iof.b bVar : this.g.a()) {
            if (bVar != null) {
                String strA = bVar.a();
                ArrayList<String> arrayListDivideMessage = smsManager.divideMessage(str);
                if (!TextUtils.isEmpty(strA) && arrayListDivideMessage != null && arrayListDivideMessage.size() > 0) {
                    ArrayList<PendingIntent> arrayList = new ArrayList<>();
                    for (int i = 0; i < arrayListDivideMessage.size(); i++) {
                        arrayList.add(broadcast);
                    }
                    smsManager.sendMultipartTextMessage(strA, null, arrayListDivideMessage, arrayList, null);
                }
            }
        }
    }

    private void b(byte[] bArr, DeviceInfo deviceInfo) {
        String strE = eeq.e(bArr);
        LogUtil.a("HwSosManager", "5.51.2 handleSosHelpingMessage info:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.e("DEVMGR_HwSosManager", "handleSosHelpingMessage data is error");
            xjt.ak("HwSosManager sendSosMessage: data is error");
            return;
        }
        try {
            a(eeq.d(this.f.b(strE.substring(4)).e().get(0).b()), deviceInfo);
        } catch (eeu unused) {
            ReleaseLogUtil.a("DEVMGR_HwSosManager", "handleSosHelpingMessage TlvException");
            xjt.ak("HwSosManager sendSosMessage: TlvException");
        }
    }

    private void a(byte[] bArr) {
        String strE = eeq.e(bArr);
        LogUtil.a("HwSosManager", "5.51.4 handleImageData info:", strE);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            ReleaseLogUtil.e("DEVMGR_HwSosManager", "handleImageData data is error");
            xjt.ak("HwSosManager handleImageData: data is error");
            return;
        }
        try {
            List<eew> listE = this.f.b(strE.substring(4)).e();
            if (listE != null && listE.size() > 0) {
                for (eew eewVar : listE) {
                    if (eewVar != null) {
                        int iB = CommonUtil.b(eewVar.e(), 16);
                        if (iB == 1) {
                            b(eewVar.b());
                            ReleaseLogUtil.d("DEVMGR_HwSosManager", "IMAGE_SIZE:" + eewVar.b());
                        } else if (iB == 2) {
                            c(eewVar.b());
                            ReleaseLogUtil.d("DEVMGR_HwSosManager", "IMAGE_TYPE:" + eewVar.b());
                        } else if (iB == 3) {
                            a(eewVar.b());
                            ReleaseLogUtil.d("DEVMGR_HwSosManager", "IMAGE_COLOR_TYPE:" + eewVar.b());
                        } else {
                            b("");
                            c("");
                            a("");
                            ReleaseLogUtil.e("DEVMGR_HwSosManager", "handleImageData the default branch");
                        }
                    }
                }
            }
        } catch (eeu unused) {
            ReleaseLogUtil.a("DEVMGR_HwSosManager", "handleImageData TlvException");
            xjt.ak("HwSosManager handleImageData: TlvException");
        }
        HashMap<String, String> mapH = h();
        Intent intent = new Intent();
        intent.setAction("image_info_sync");
        intent.putExtra("image_info", mapH);
        BroadcastManagerUtil.e(this.j, intent);
        e(((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getEmergencyInfo());
    }

    public HashMap<String, String> h() {
        ReleaseLogUtil.d("DEVMGR_HwSosManager", "syncImageInfo enter");
        HashMap<String, String> map = new HashMap<>(16);
        map.put("image_size_tag", b());
        map.put("image_type_tag", a());
        map.put("image_color_type_tag", c());
        return map;
    }

    public void e(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("DEVMGR_HwSosManager", "reportMessageSendingState enter");
        String str = eeq.d(127) + eeq.d(4) + eeq.c(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US);
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(51);
        deviceCommand.setCommandID(2);
        deviceCommand.setDataContent(eeq.c(str));
        deviceCommand.setDataLen(eeq.c(str).length);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("HwSosManager", "reportMessageSendingState, deviceCommand:", deviceCommand.toString());
        mkf.e(this.j).sendDeviceData(deviceCommand);
    }

    private boolean j() {
        iof emergencyInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getEmergencyInfo();
        this.g = emergencyInfo;
        if (emergencyInfo == null || emergencyInfo.a() == null || this.g.a().size() == 0) {
            ReleaseLogUtil.e("DEVMGR_HwSosManager", "doesn't have any emergency contact");
            xjt.ak("HwSosManager canSendMessage: doesn't have any emergency contact");
            return false;
        }
        if (lsg.d(this.j, new String[]{"android.permission.SEND_SMS"})) {
            return true;
        }
        ReleaseLogUtil.e("DEVMGR_HwSosManager", "doesn't have send sms permission");
        xjt.ak("HwSosManager canSendMessage: doesn't have send sms permission");
        return false;
    }

    public void d() {
        ReleaseLogUtil.d("DEVMGR_HwSosManager", "HwSosManger onDestroy");
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        ReleaseLogUtil.d("DEVMGR_HwSosManager", "HwSosManger getResult");
        c(bArr, deviceInfo);
    }

    private boolean d(String str, iof iofVar) {
        if (!mxv.b()) {
            return false;
        }
        if (d(str)) {
            return true;
        }
        iofVar.d("");
        iofVar.b("");
        iofVar.e("");
        e(mxv.b(mxv.d(iofVar)));
        ReleaseLogUtil.d("DEVMGR_HwSosManager", "isHandleSportWatch sendDeviceCommand");
        return true;
    }

    private boolean d(String str) {
        ReleaseLogUtil.d("DEVMGR_HwSosManager", "isIngoreInfoToDevice updateKey ", str);
        return "allergies".equals(str) || "medications".equals(str) || "medical_conditions".equals(str);
    }
}
