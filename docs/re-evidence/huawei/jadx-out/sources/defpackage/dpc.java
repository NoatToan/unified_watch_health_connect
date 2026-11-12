package defpackage;

import android.bluetooth.BluetoothGattDescriptor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.callback.BindHealthDeviceCallback;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.kit.hwwsp.hagrid.bean.MiniUserDataInfo;
import com.huawei.health.device.kit.wsp.task.BleTaskQueueUtil;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.versionmgr.api.VersionMgrApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.secure.android.common.util.HexUtil;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.Services;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class dpc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f32179a;
    private String f;
    private BleTaskQueueUtil h;
    private TimerTask i;
    private Timer j;
    private ArrayList<cmg> l;
    private dnr m;
    private UniteDevice n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f32178c = new Object();
    private static final Object e = new Object();
    private static final Object d = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CopyOnWriteArrayList<IHealthDeviceCallback> f32180b = new CopyOnWriteArrayList<>();
    private ArrayList<dro> g = new ArrayList<>(16);

    private byte e(int i) {
        return (byte) (i & 255);
    }

    public dpc(BleTaskQueueUtil bleTaskQueueUtil) {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        this.f32179a = bArr;
        this.h = bleTaskQueueUtil;
        try {
            this.f = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            LogUtil.j("WspCommandUtils", "mSupplement is error");
        }
    }

    public void t() {
        ReleaseLogUtil.d("WspCommandUtils", "Begin to sendRequestAuth");
        this.h.c(new dro(BleTaskQueueUtil.TaskType.REQUEST_AUTH, new byte[0], false, 5000));
        this.h.b();
    }

    public void d(dow dowVar) {
        String accountInfo;
        if (dowVar == null) {
            return;
        }
        if (Utils.h()) {
            accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        } else {
            accountInfo = "0";
        }
        LogUtil.d("WspCommandUtils", "Begin to sending huid", accountInfo);
        this.h.c(new dro(BleTaskQueueUtil.TaskType.BIND_REQUEST, dowVar.c(accountInfo), true));
        this.h.b();
    }

    public void v() {
        int iE;
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        int i3 = calendar.get(5);
        int i4 = calendar.get(11);
        int i5 = calendar.get(12);
        int i6 = calendar.get(13);
        if (dxm.y(doq.e().j())) {
            iE = u();
        } else {
            iE = e(calendar);
        }
        this.h.c(new dro(BleTaskQueueUtil.TaskType.SET_SYNC_TIME, new byte[]{e(i), e(i >> 8), e(i2 + 1), e(i3), e(i4), e(i5), e(i6), e(iE)}, false, 5000));
        this.h.b();
    }

    public void a(byte[] bArr) {
        ReleaseLogUtil.d("R_Weight_WspCommandUtils", "Begin to sendAuthToken");
        this.h.c(new dro(BleTaskQueueUtil.TaskType.AUTH_TOKEN, bArr, false, 5000));
        this.h.b();
    }

    public void g(byte[] bArr) {
        ReleaseLogUtil.d("R_Weight_WspCommandUtils", "Begin to work key");
        this.h.c(new dro(BleTaskQueueUtil.TaskType.SEND_WORK_KEY, bArr, true, 5000));
        this.h.b();
    }

    public void r() {
        LogUtil.a("WspCommandUtils", "Begin to device reset");
        dro droVar = new dro(BleTaskQueueUtil.TaskType.SEND_DEVICE_RESET, new byte[0], false, 5000);
        if (doq.e().i()) {
            this.h.c(droVar);
            this.h.b();
        } else {
            c(droVar);
        }
    }

    public void d(byte[] bArr) {
        LogUtil.a("WspCommandUtils", "begin to delete user data");
        this.h.c(new dro(BleTaskQueueUtil.TaskType.SEND_DELETE_USER_DATA, bArr, true, 5000));
        this.h.b();
    }

    public void a(Bundle bundle) {
        byte[] byteArray;
        if (bundle == null) {
            LogUtil.j("WspCommandUtils", "bundle is null when get user data");
            return;
        }
        LogUtil.a("WspCommandUtils", "begin to get user data");
        try {
            byteArray = bundle.getByteArray(JsbMapKeyNames.H5_USER_ID);
        } catch (Exception unused) {
            LogUtil.e("WspCommandUtils", "getByteArray exception");
            byteArray = null;
        }
        dro droVar = new dro(BleTaskQueueUtil.TaskType.SEND_GET_USER_DATA, byteArray, true, 5000);
        if (doq.e().i()) {
            this.h.c(droVar);
            this.h.b();
        } else {
            c(droVar);
        }
    }

    public void g() {
        LogUtil.a("WspCommandUtils", "begin to get next user data");
        this.h.c(new dro(BleTaskQueueUtil.TaskType.SEND_GET_USER_DATA, new byte[1], false, 5000));
        this.h.b();
    }

    public void m() {
        LogUtil.a("WspCommandUtils", "begin to get next user data again");
        this.h.c(new dro(BleTaskQueueUtil.TaskType.SEND_GET_USER_DATA, new byte[]{1}, false, 5000));
        this.h.b();
    }

    public void q() {
        LogUtil.a("WspCommandUtils", "enter sendWakeupScale");
        dro droVar = new dro(BleTaskQueueUtil.TaskType.SEND_WAKE_UP, new byte[]{1}, false);
        if (doq.e().i()) {
            this.h.c(droVar);
            this.h.b();
        } else {
            c(droVar);
        }
    }

    public void j(byte[] bArr) {
        LogUtil.a("WspCommandUtils", "begin to get next user data send user again");
        this.h.c(new dro(BleTaskQueueUtil.TaskType.SEND_GET_USER_DATA, bArr, true, 5000));
        this.h.b();
    }

    public void e(String str) {
        LogUtil.a("WspCommandUtils", "enter sendWifiSsid");
        if (!TextUtils.isEmpty(str)) {
            byte[] bytes = new byte[0];
            try {
                bytes = str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                LogUtil.e("WspCommandUtils", "sendWifiSsid getBytes Exception");
            }
            this.h.c(new dro(BleTaskQueueUtil.TaskType.SEND_SSID, bytes, true));
            this.h.b();
            return;
        }
        LogUtil.j("WspCommandUtils", "ssid is empty");
    }

    public void c(String str) {
        LogUtil.a("WspCommandUtils", "enter sendWifiPassword");
        if (!TextUtils.isEmpty(str)) {
            byte[] bytes = new byte[0];
            try {
                bytes = str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                LogUtil.e("WspCommandUtils", "sendWifiPassword getBytes Exception");
            }
            this.h.c(new dro(BleTaskQueueUtil.TaskType.SEND_WIFI_PASSWORD, bytes, true));
            this.h.b();
            return;
        }
        LogUtil.j("WspCommandUtils", "mWifiPwd is empty");
        this.h.c(new dro(BleTaskQueueUtil.TaskType.SEND_WIFI_PASSWORD, new byte[0], true));
        this.h.b();
    }

    public void d(String str) {
        if (!doq.e().b(dpg.ah)) {
            LogUtil.a("WspCommandUtils", "is noSupportCharacteristic.");
            return;
        }
        LogUtil.a("WspCommandUtils", "[grs] event handled. begin send grsUrl to devices,url:", str);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WspCommandUtils", "[grs] grsUrl is empty");
            return;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 2);
        byteBufferAllocate.put(new byte[]{3});
        byteBufferAllocate.put((byte) bytes.length);
        byteBufferAllocate.put(bytes);
        byte[] bArrArray = byteBufferAllocate.array();
        LogUtil.a("WspCommandUtils", "[grs] grsBytes:", HexUtil.byteArray2HexStr(bArrArray));
        this.h.c(new dro(BleTaskQueueUtil.TaskType.SEND_OTA_URL, bArrArray, false));
        this.h.b();
    }

    public void f() {
        if (!this.h.b(1)) {
            this.h.e(1);
            this.h.c(new dro(BleTaskQueueUtil.TaskType.GET_MANAGER_INFO, new byte[0], false, 5000));
            this.h.b();
            return;
        }
        LogUtil.j("WspCommandUtils", "GET_MANAGER_INFO task is doing.");
    }

    public void e(boolean z) {
        if (z) {
            if (!this.h.b(2)) {
                this.h.e(2);
                this.h.c(new dro(BleTaskQueueUtil.TaskType.GET_MANAGER_INFO, new byte[]{1}, false, 5000));
                this.h.b();
                return;
            }
            LogUtil.j("WspCommandUtils", "GET_MANAGER_INFO with account task is doing.");
            return;
        }
        f();
    }

    public void s() {
        this.h.c(new dro(BleTaskQueueUtil.TaskType.GET_WEIGHT_UNIT, new byte[0], false, 5000));
        this.h.b();
    }

    public void f(byte[] bArr) {
        dro droVar = new dro(BleTaskQueueUtil.TaskType.SET_USER_INFO, bArr, true, 5000);
        if (doq.e().i()) {
            this.h.c(droVar);
            this.h.b();
        } else {
            c(droVar);
        }
    }

    public void b(String str, String str2, dow dowVar) {
        if (dowVar == null) {
            return;
        }
        if (str == null || str2 == null) {
            LogUtil.j("WspCommandUtils", "Set manager info failed, just skip");
            return;
        }
        this.h.c(new dro(BleTaskQueueUtil.TaskType.SET_MANAGER_INFO, dowVar.c(str, str2), true, 5000));
        this.h.b();
    }

    public void b(String str, String str2, String str3, dow dowVar) {
        LogUtil.a("WspCommandUtils", "account Info:", str3);
        LogUtil.a("WspCommandUtils", "Begin to set manager info");
        if (dowVar == null) {
            return;
        }
        if (str == null || str2 == null) {
            LogUtil.j("WspCommandUtils", "Set manager info failed, just skip");
            return;
        }
        if (str3.length() > 20) {
            LogUtil.j("WspCommandUtils", "account info is too long");
            return;
        }
        try {
            byte[] bArrC = dowVar.c(str, (str2 + this.f).substring(0, 40));
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrC.length + str3.getBytes("UTF-8").length + 1);
            byteBufferAllocate.put(bArrC);
            byteBufferAllocate.put((byte) str3.length());
            byteBufferAllocate.put(str3.getBytes("UTF-8"));
            LogUtil.a("WspCommandUtils", eeq.e(byteBufferAllocate.array()));
            this.h.c(new dro(BleTaskQueueUtil.TaskType.SET_MANAGER_INFO, byteBufferAllocate.array(), true, 5000));
            this.h.b();
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("WspCommandUtils", "account string is wrong");
        }
    }

    public void p() {
        LogUtil.a("WspCommandUtils", "Begin to sendRealTimeWeight.");
        this.h.c(new dro(BleTaskQueueUtil.TaskType.GET_WEIGHT_REAL_TIME_DATA, new byte[0], false));
        this.h.b();
    }

    public void e(byte[] bArr) {
        if (bArr == null) {
            LogUtil.j("WspCommandUtils", "sending getHistoryWeight values is null");
        } else {
            LogUtil.a("WspCommandUtils", "sending getHistoryWeight values is ", eeq.e(bArr));
        }
        dro droVar = new dro(BleTaskQueueUtil.TaskType.GET_WEIGHT_HISTORY_DATA, bArr, false);
        if (doq.e().i()) {
            this.h.c(droVar);
            this.h.b();
        } else {
            c(droVar);
        }
    }

    public String b(byte[] bArr) {
        return eeq.e(bArr);
    }

    public void h() {
        this.h.c(new dro(BleTaskQueueUtil.TaskType.GET_DEVICE_SSID, new byte[0], false, 5000));
        this.h.b();
    }

    public void i() {
        this.h.c(new dro(BleTaskQueueUtil.TaskType.GET_ALLOW_RESET_WIFI, new byte[0], false, 5000));
        this.h.b();
    }

    public void e(Bundle bundle) {
        dro droVar = new dro(BleTaskQueueUtil.TaskType.DISABLE_NOTIFICATION, new byte[0], false, -1);
        droVar.b(bundle);
        droVar.d(new dro.c(droVar, false) { // from class: dpc.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(z);
                Objects.requireNonNull(droVar);
                c(new byte[][]{BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE, BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE});
            }
        });
        this.h.c(droVar);
        this.h.b();
    }

    public void b(BleTaskQueueUtil.TaskType taskType, byte[] bArr) {
        dro droVar = new dro(taskType, bArr);
        if (doq.e().i()) {
            this.h.c(droVar);
            this.h.b();
        } else {
            c(droVar);
        }
    }

    public void a(String str) {
        this.h.c(new dro(BleTaskQueueUtil.TaskType.SEND_HILINK_CONFIG_INFO_ENCRYPTED, b(str), true, 5000));
        this.h.b();
    }

    public void a(String str, String str2, int i, String str3, String str4) {
        byte[] bArr;
        int i2;
        byte[] bArr2;
        LogUtil.a("WspCommandUtils", "AssembleDataPackage enter");
        byte[] bArrB = ecn.b();
        String strA = ecn.a();
        LogUtil.a("WspCommandUtils", "AssembleDataPackage aes128Key  ", dyg.b(strA));
        byte[] bArrB2 = b(str2);
        byte[] bArrD = ecg.d(bArrB2, strA, bArrB);
        if (TextUtils.isEmpty(str4)) {
            LogUtil.a("WspCommandUtils", "AssembleDataPackage mRegMessage is null");
            bArr = null;
            i2 = 0;
        } else {
            byte[] bArrD2 = ecg.d(b(str4), strA, bArrB);
            int length = bArrD2.length;
            LogUtil.d("WspCommandUtils", "AssembleDataPackage encodeRegisterMsg: len:", Integer.valueOf(bArrD2.length));
            bArr = bArrD2;
            i2 = length;
        }
        byte[] bArrC = c(bArrD);
        byte[] bArrB3 = b(str);
        byte[] bArrB4 = b(str3);
        int length2 = bArrB2 != null ? bArrB2.length : 0;
        if (bArrB3 == null) {
            LogUtil.a("WspCommandUtils", "sendWifiConfigInfo ssidArrays is null");
            return;
        }
        LogUtil.d("WspCommandUtils", "AssembleDataPackage passworddArrays:", Integer.valueOf(length2), " ssidArrays:", Integer.valueOf(bArrB3.length), " encodedPasswords:", Integer.valueOf(bArrD.length), " scaleKeyVectors:", Integer.valueOf(bArrC.length), " deviceSsid: ", dyg.b(str3), " ssid:", dyg.b(str), " infos:", bArrB4, " registerMsg:", str4, " registerMsgLength:", Integer.valueOf(i2));
        int length3 = i2 + bArrB3.length + 20 + bArrD.length + 1;
        LogUtil.a("WspCommandUtils", "AssembleDataPackage dataPakageLen: ", Integer.valueOf(length3));
        if ((length3 & 1) == 1) {
            bArr2 = new byte[length3 + 1];
            bArr2[length3] = 0;
        } else {
            bArr2 = new byte[length3];
        }
        byte[] bArr3 = bArr2;
        byte[] bArrA = ecj.a(i, bArrC, strA);
        d(bArr3, bArrB4, a(str3, i));
        c(bArr3, bArrB3, bArrD, bArr, bArrA);
        bArr3[1] = c(bArr3, 2, length3);
        i(bArr3);
    }

    private void i(byte[] bArr) {
        if (doq.e().b(dpg.j)) {
            LogUtil.a("WspCommandUtils", "send hilink config info on encrypted mode");
            this.h.c(new dro(BleTaskQueueUtil.TaskType.SEND_HILINK_CONFIG_INFO_ENCRYPTED, bArr, true, 5000));
        } else {
            this.h.c(new dro(BleTaskQueueUtil.TaskType.SEND_HILINK_CONFIG_INFO, bArr, false, 5000));
        }
        this.h.b();
    }

    public dnr l() {
        if (this.m == null) {
            this.m = new dnr(this.h);
        }
        return this.m;
    }

    public static byte[] b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("WspCommandUtils", "UnsupportedEncodingException");
            return null;
        }
    }

    private static byte c(byte[] bArr, int i, int i2) {
        int i3 = 255;
        while (i < i2) {
            i3 ^= bArr[i] & 255;
            for (int i4 = 0; i4 < 8; i4++) {
                int i5 = i3 & 1;
                i3 >>= 1;
                if (i5 != 0) {
                    i3 ^= 184;
                }
            }
            i++;
        }
        return (byte) (i3 & 255);
    }

    public byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        if (bArr != null && bArr.length >= 16) {
            System.arraycopy(bArr, 0, bArr2, 0, 16);
        }
        return bArr2;
    }

    private void d(byte[] bArr, byte[] bArr2, byte b2) {
        if (bArr == null) {
            return;
        }
        bArr[0] = (byte) (ecn.e(bArr2) & 255);
        LogUtil.d("WspCommandUtils", "AssembleDataPackage dataPackages:", ecj.b(bArr));
        bArr[2] = b2;
    }

    private void c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        if (bArr == null || bArr2 == null || bArr3 == null || bArr5 == null) {
            return;
        }
        int i = 0;
        int i2 = 3;
        int i3 = 0;
        while (i3 < 16) {
            bArr[i2] = bArr5[i3];
            i3++;
            i2++;
        }
        int i4 = i2 + 1;
        bArr[i2] = (byte) (ecn.b(bArr2.length, bArr3.length) & 255);
        int i5 = 0;
        while (i5 < bArr2.length) {
            bArr[i4] = bArr2[i5];
            i5++;
            i4++;
        }
        int i6 = 0;
        while (i6 < bArr3.length) {
            bArr[i4] = bArr3[i6];
            i6++;
            i4++;
        }
        if (bArr4 != null) {
            int i7 = i4 + 1;
            bArr[i4] = (byte) ((bArr4.length >> 4) & 255);
            while (i < bArr4.length) {
                bArr[i7] = bArr4[i];
                i++;
                i7++;
            }
            return;
        }
        bArr[i4] = 0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    private byte a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return (byte) 0;
        }
        String[] strArrSplit = str.split(Constants.LINK);
        int i2 = 3;
        if (strArrSplit.length > 3) {
            strArrSplit[3].charAt(0);
        }
        LogUtil.a("WspCommandUtils", "AssembleDataPackageget VersionMode: ", Integer.valueOf(i));
        if (i == 100) {
            i2 = 1;
        } else if (i == 101) {
            i2 = 2;
        } else if (i != 110) {
            i2 = 1;
        }
        return (byte) (i2 << 4);
    }

    public void c(String str, String str2, String str3, String str4) {
        LogUtil.a("WspCommandUtils", "checkBandNewVersionService bind");
        ((VersionMgrApi) Services.b("HWVersionMgr", VersionMgrApi.class)).checkScaleNewVersionService(str3, str, str2, dxm.ai(str3), str4);
    }

    public void h(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        MiniUserDataInfo miniUserDataInfo = new MiniUserDataInfo();
        miniUserDataInfo.setWeight(doa.a(bArr, 0, 2) / 100.0f);
        miniUserDataInfo.setResis(doa.a(bArr, 2, 12));
        byte[] bArr2 = new byte[32];
        System.arraycopy(bArr, 14, bArr2, 0, 32);
        if (doa.a(bArr, 14, 32) == 0) {
            miniUserDataInfo.setHuid("0");
        } else {
            miniUserDataInfo.setHuid(eeq.d(eeq.e(bArr2)));
        }
        miniUserDataInfo.setSex(doa.a(bArr, 46, 1));
        miniUserDataInfo.setAge(doa.a(bArr, 47, 1));
        miniUserDataInfo.setHeight(doa.a(bArr, 48, 2));
        miniUserDataInfo.setIsOver(doa.a(bArr, 50, 1));
        miniUserDataInfo.setIsMainId(doa.a(bArr, 51, 1));
        miniUserDataInfo.setTime(doa.a(bArr, 52, 8));
        Bundle bundle = new Bundle();
        bundle.putParcelable("userData", miniUserDataInfo);
        EventBus.a(new EventBus.d("get_user_data_result", bundle));
    }

    public void d(IHealthDeviceCallback iHealthDeviceCallback) {
        LogUtil.a("WspCommandUtils", "registerCallBack start");
        synchronized (f32178c) {
            try {
                if (iHealthDeviceCallback == null) {
                    LogUtil.j("WspCommandUtils", "registerCallBack callback is null, size = ", Integer.valueOf(this.f32180b.size()));
                } else if (!this.f32180b.contains(iHealthDeviceCallback)) {
                    this.f32180b.add(iHealthDeviceCallback);
                    LogUtil.a("WspCommandUtils", "registerCallBack add success, size = ", Integer.valueOf(this.f32180b.size()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    public void a(IHealthDeviceCallback iHealthDeviceCallback) {
        boolean z;
        LogUtil.a("WspCommandUtils", "HwWspMeasureController unRegisterCallback !");
        synchronized (f32178c) {
            if (iHealthDeviceCallback != null) {
                try {
                    if (this.f32180b.contains(iHealthDeviceCallback)) {
                        this.f32180b.remove(iHealthDeviceCallback);
                        LogUtil.a("WspCommandUtils", "remove callback, size = ", Integer.valueOf(this.f32180b.size()));
                    } else {
                        if (iHealthDeviceCallback != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        LogUtil.j("WspCommandUtils", "callback != null ", Boolean.valueOf(z), " mCallBacks.contains(callback) ", Boolean.valueOf(this.f32180b.contains(iHealthDeviceCallback)), " size =", Integer.valueOf(this.f32180b.size()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (iHealthDeviceCallback != null) {
                    z = true;
                } else {
                    z = false;
                }
                LogUtil.j("WspCommandUtils", "callback != null ", Boolean.valueOf(z), " mCallBacks.contains(callback) ", Boolean.valueOf(this.f32180b.contains(iHealthDeviceCallback)), " size =", Integer.valueOf(this.f32180b.size()));
            }
        }
    }

    public void b(HealthDevice healthDevice, int i) {
        synchronized (f32178c) {
            for (IHealthDeviceCallback iHealthDeviceCallback : this.f32180b) {
                if (iHealthDeviceCallback != null) {
                    iHealthDeviceCallback.onStatusChanged(healthDevice, i);
                } else {
                    LogUtil.j("WspCommandUtils", "onStatusChanged error: callback is null");
                }
            }
        }
    }

    public void b(HealthDevice healthDevice, int i, Bundle bundle) {
        synchronized (f32178c) {
            for (IHealthDeviceCallback iHealthDeviceCallback : this.f32180b) {
                if (iHealthDeviceCallback != null) {
                    if (bundle != null && (iHealthDeviceCallback instanceof BindHealthDeviceCallback)) {
                        ((BindHealthDeviceCallback) iHealthDeviceCallback).onStatusChanged(healthDevice, i, bundle);
                    }
                } else {
                    LogUtil.j("WspCommandUtils", "onStatusChanged fail: callback is null");
                }
            }
        }
    }

    public void a(HealthDevice healthDevice, HealthData healthData) {
        synchronized (f32178c) {
            for (IHealthDeviceCallback iHealthDeviceCallback : this.f32180b) {
                if (iHealthDeviceCallback != null) {
                    iHealthDeviceCallback.onDataChanged(healthDevice, healthData);
                } else {
                    LogUtil.j("WspCommandUtils", "callback is null");
                }
            }
        }
    }

    public void a(HealthDevice healthDevice, int i) {
        synchronized (f32178c) {
            for (IHealthDeviceCallback iHealthDeviceCallback : this.f32180b) {
                if (iHealthDeviceCallback != null) {
                    iHealthDeviceCallback.onFailed(healthDevice, i);
                } else {
                    LogUtil.j("WspCommandUtils", "callback is null");
                }
            }
        }
    }

    public void e() {
        synchronized (f32178c) {
            this.f32180b.clear();
        }
    }

    public void b(UUID uuid, dow dowVar, byte[] bArr, boolean z, int i) {
        if (uuid == null || dowVar == null) {
            return;
        }
        if (dpg.r.equals(uuid)) {
            int iE = dowVar.e(bArr);
            LogUtil.a("WspCommandUtils", "HwWspMeasureController scale status report : ", Integer.valueOf(iE), "isSyncHistoryData:", Boolean.valueOf(z));
            if (iE == 2 || iE == 3) {
                Bundle bundle = new Bundle();
                bundle.putInt("status", iE);
                EventBus.a(new EventBus.d("update_wifi_device_cloud_status", bundle));
                return;
            } else {
                if (iE != 0 || z || !doq.e().r() || i == -2) {
                    return;
                }
                EventBus.a(new EventBus.d("send_history_weight_info", new Bundle()));
                return;
            }
        }
        if (dpg.ax.equals(uuid)) {
            int iE2 = dowVar.e(bArr);
            LogUtil.a("WspCommandUtils", "HwWspMeasureController update ssid resultAck:", Integer.valueOf(iE2));
            if (iE2 == 0) {
                EventBus.a(new EventBus.d("send_wifi_password"));
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putInt("result", iE2);
            EventBus.a(new EventBus.d("send_wifi_password_result", bundle2));
            return;
        }
        if (dpg.ae.equals(uuid)) {
            int iE3 = dowVar.e(bArr);
            LogUtil.a("WspCommandUtils", "HwWspMeasureController send wifi password resultAck:", Integer.valueOf(iE3));
            Bundle bundle3 = new Bundle();
            bundle3.putInt("result", iE3);
            EventBus.a(new EventBus.d("send_wifi_password_result", bundle3));
            return;
        }
        LogUtil.d("WspCommandUtils", "HwWspMeasureController handlerReceiverDataOne end");
    }

    public void a(UUID uuid, dow dowVar, byte[] bArr) {
        if (uuid == null || dowVar == null) {
            return;
        }
        if (uuid.equals(dpg.y)) {
            int iE = dowVar.e(bArr);
            Bundle bundle = new Bundle();
            bundle.putInt("ret", iE);
            EventBus.a(new EventBus.d("set_manager_info_result", bundle));
            EventBus.a(new EventBus.d("event_bus_send_ota_url", bundle));
            return;
        }
        if (uuid.equals(dpg.g) || uuid.equals(dpg.j)) {
            int iE2 = dowVar.e(bArr);
            d(iE2);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("ret", iE2);
            EventBus.a(new EventBus.d("config_info_result", bundle2));
            return;
        }
        if (uuid.equals(dpg.ab)) {
            int iE3 = dowVar.e(bArr);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("ret", iE3);
            EventBus.a(new EventBus.d("workkey_info", bundle3));
            return;
        }
        if (dpg.x.equals(uuid)) {
            dre.a().e(bArr);
            return;
        }
        if (dpg.w.equals(uuid)) {
            dre.a().d(bArr);
            return;
        }
        if (dpg.v.equals(uuid)) {
            dre.a().a(bArr);
            return;
        }
        if (dpg.u.equals(uuid)) {
            dre.a().c(bArr);
            return;
        }
        if (dpg.i.equals(uuid)) {
            int iE4 = dowVar.e(bArr);
            Bundle bundle4 = new Bundle();
            bundle4.putInt("ret", iE4);
            EventBus.a(new EventBus.d("device_reset_result", bundle4));
            return;
        }
        if (dpg.h.equals(uuid)) {
            int iE5 = dowVar.e(bArr);
            Bundle bundle5 = new Bundle();
            bundle5.putInt("ret", iE5);
            EventBus.a(new EventBus.d("delete_user_data_result", bundle5));
            return;
        }
        LogUtil.d("WspCommandUtils", "HwWspMeasureController handlerReceiverDataTwo end");
    }

    public void c(int i, int i2, boolean z, Bundle bundle, Handler handler) {
        if (handler == null || bundle == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("ret", i);
        if (i2 == -4) {
            EventBus.a(new EventBus.d("send_real_time_weight_info", bundle2));
            return;
        }
        if (i2 == -1 && z) {
            LogUtil.a("WspCommandUtils", "has set user info ,send real weight data cmd");
            EventBus.a(new EventBus.d("send_real_time_weight_info", bundle2));
            return;
        }
        if (i2 == -2) {
            EventBus.a(new EventBus.d("set_user_info_result", bundle2));
            return;
        }
        String string = bundle.getString("productId", null);
        boolean z2 = bundle.getBoolean("isConnectAction", false);
        if (dxm.ao(string) && z2) {
            EventBus.a(new EventBus.d("send_history_weight_info", new Bundle()));
        }
        if (!dxm.ai(string) && !dxm.q(string)) {
            EventBus.a(new EventBus.d("get_device_ssid"));
        } else {
            handler.sendEmptyMessageDelayed(7, 200L);
        }
    }

    public void d(Handler handler, int i, String str, Bundle bundle) {
        if (handler == null) {
            return;
        }
        handler.removeMessages(4);
        x();
        if (i == -4 || i == -1) {
            if (bundle != null && bundle.getInt("guestUser", 0) == 1) {
                EventBus.a(new EventBus.d("weight_measure_set_user", bundle));
                return;
            } else {
                EventBus.a(new EventBus.d("weight_measure_set_user"));
                return;
            }
        }
        if (i == -2) {
            if (dxm.ai(str) || dxm.q(str)) {
                EventBus.a(new EventBus.d("bind_process_completed", new Bundle()));
                handler.sendEmptyMessageDelayed(7, 200L);
                return;
            } else {
                EventBus.a(new EventBus.d("get_device_ssid"));
                return;
            }
        }
        LogUtil.j("WspCommandUtils", "HwWspMeasureController syncCurrentTimeComplete end");
    }

    public void b(Handler handler, int i, String str) {
        d(handler, i, str, null);
    }

    private void c(dro droVar) {
        synchronized (d) {
            this.g.add(droVar);
        }
    }

    private void x() {
        synchronized (d) {
            Iterator<dro> it = this.g.iterator();
            while (it.hasNext()) {
                this.h.c(it.next());
            }
            this.g.clear();
        }
    }

    public void a() {
        synchronized (d) {
            this.g.clear();
        }
    }

    public void e(boolean z, int i) {
        synchronized (e) {
            Timer timer = this.j;
            if (timer != null) {
                timer.cancel();
                this.j = null;
            }
            TimerTask timerTask = this.i;
            if (timerTask != null) {
                timerTask.cancel();
                this.i = null;
            }
            if (z || i == -1) {
                this.j = new Timer("WspCommandUtils");
                TimerTask timerTask2 = new TimerTask() { // from class: dpc.2
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        if (dre.a().c() || dpc.this.h.d() != 0) {
                            return;
                        }
                        doq.e().c(new byte[0], dpg.al, dpg.s);
                    }
                };
                this.i = timerTask2;
                try {
                    this.j.schedule(timerTask2, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                } catch (IllegalStateException unused) {
                    LogUtil.e("WspCommandUtils", "startTimeTask schedule IllegalStateException");
                }
            } else {
                LogUtil.j("WspCommandUtils", "not start timer");
            }
        }
    }

    public void y() {
        LogUtil.a("WspCommandUtils", "stopTimeTask");
        synchronized (e) {
            Timer timer = this.j;
            if (timer != null) {
                timer.cancel();
                this.j = null;
            }
            TimerTask timerTask = this.i;
            if (timerTask != null) {
                timerTask.cancel();
                this.i = null;
            }
        }
    }

    private int u() {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(15) + calendar.get(16);
        LogUtil.a("WspCommandUtils", "date Zone minute offset", Integer.valueOf(i));
        int i2 = (i * 4) / 3600000;
        int i3 = i2 > 0 ? (i2 & 63) | 128 : ((-i2) & 63) | 64;
        LogUtil.a("WspCommandUtils", "getTimeZoneOffsetHour offSet", Integer.valueOf(i3));
        return i3;
    }

    private int e(Calendar calendar) {
        if (calendar == null) {
            LogUtil.j("WspCommandUtils", "getWeekDay calendar is null");
            return 1;
        }
        boolean z = calendar.getFirstDayOfWeek() == 1;
        LogUtil.d("WspCommandUtils", "HwWspMeasureController syncCurrentTime isFirstSunday:", Boolean.valueOf(z));
        int i = calendar.get(7);
        int i2 = (!z || (i = i + (-1)) >= 1) ? i : 7;
        LogUtil.d("WspCommandUtils", "HwWspMeasureController syncCurrentTime weekDay:", Integer.valueOf(i2));
        return i2;
    }

    public void b(ArrayList<cmg> arrayList) {
        this.l = arrayList;
    }

    public void b(UniteDevice uniteDevice) {
        this.n = uniteDevice;
    }

    private void d(int i) {
        ArrayList<cmg> arrayList;
        if (i != 0) {
            LogUtil.j("WspCommandUtils", "resultAck is not success");
            this.l = null;
            this.n = null;
        } else {
            if (this.n != null && (arrayList = this.l) != null && arrayList.size() > 0) {
                drc.b().c(this.n, new cmg[]{this.l.get(0)});
                this.l.remove(0);
                if (this.l.size() == 0) {
                    LogUtil.a("WspCommandUtils", "sendWifiConfigCacheCommands cache is send end.");
                    this.l = null;
                    this.n = null;
                    return;
                }
                return;
            }
            this.l = null;
            this.n = null;
        }
    }

    public void b() {
        LogUtil.a("WspCommandUtils", "HwWspMeasureController enableScaleStatusCharacter");
        this.h.c(new dro(BleTaskQueueUtil.TaskType.OPEN_STATUS, new byte[0], true));
        this.h.b();
    }

    public void a(byte[] bArr, boolean z) {
        BleTaskQueueUtil bleTaskQueueUtil = this.h;
        if (bleTaskQueueUtil != null) {
            bleTaskQueueUtil.c(new dro(BleTaskQueueUtil.TaskType.WRITE_BLE_FILE, bArr, z));
            if (!Looper.getMainLooper().isCurrentThread()) {
                this.h.b();
            } else {
                ThreadPoolManager.c().a("sendTlvOtaUpgrade", new Runnable() { // from class: doy
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.o();
                    }
                });
            }
        }
    }

    /* synthetic */ void o() {
        this.h.b();
    }

    public void n() {
        dro droVar = new dro(BleTaskQueueUtil.TaskType.NOTIFY_BLE_FILE, new byte[0], false);
        droVar.c().c(new byte[][]{BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE});
        this.h.c(droVar);
        this.h.b();
    }

    public void j() {
        this.h.c(new dro(BleTaskQueueUtil.TaskType.ENABLE_WEIGHT_SCALE, null));
        this.h.b();
    }

    public void d() {
        this.h.c(new dro(BleTaskQueueUtil.TaskType.ENABLE_BODY_MEASUREMENT, null));
        this.h.b();
    }

    public void c() {
        this.h.c(new dro(BleTaskQueueUtil.TaskType.ENABLE_CLEAR_USER_INFO, null));
        this.h.b();
    }

    public void k() {
        LogUtil.a("WspCommandUtils", "Enter sendClearUserInfo");
        this.h.c(new dro(BleTaskQueueUtil.TaskType.CLEAR_USER_INFO, dog.d()));
        this.h.b();
    }

    public void e(byte b2, byte b3, byte b4) {
        LogUtil.a("WspCommandUtils", "synCurrentUser is begin...");
        this.h.c(new dro(BleTaskQueueUtil.TaskType.SET_AGE, new byte[]{b2}));
        this.h.c(new dro(BleTaskQueueUtil.TaskType.SET_GENDER, new byte[]{b3}));
        this.h.c(new dro(BleTaskQueueUtil.TaskType.SET_HEIGHT, new byte[]{b4, 0}));
        this.h.b();
    }

    public void w() {
        Calendar calendar = Calendar.getInstance();
        boolean z = calendar.getFirstDayOfWeek() == 1;
        LogUtil.d("WspCommandUtils", "syncCurrentTime isFirstSunday:", Boolean.valueOf(z));
        int i = calendar.get(7);
        if (z && (i = i - 1) == 0) {
            i = 7;
        }
        LogUtil.d("WspCommandUtils", "syncCurrentTime weekDay:", Integer.valueOf(i));
        int i2 = calendar.get(1);
        this.h.c(new dro(BleTaskQueueUtil.TaskType.SET_TIME, new byte[]{(byte) (i2 & 255), (byte) ((i2 >> 8) & 255), (byte) ((calendar.get(2) + 1) & 255), (byte) (calendar.get(5) & 255), (byte) (calendar.get(11) & 255), (byte) (calendar.get(12) & 255), (byte) (calendar.get(13) & 255), (byte) (i & 255), 0, 0}));
        this.h.b();
    }
}
