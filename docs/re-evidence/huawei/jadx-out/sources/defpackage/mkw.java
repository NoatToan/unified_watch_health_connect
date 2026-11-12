package defpackage;

import android.content.res.Configuration;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import androidx.media3.common.C;
import androidx.media3.extractor.ts.TsExtractor;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.google.common.base.Ascii;
import com.huawei.devicesdk.entity.ExternalDeviceCapability;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwmap.callback.ReverseGeocodeResultCallback;
import com.huawei.hwmap.model.ReverseGeocodeResponse;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.unitedevice.entity.UniteDevice;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public class mkw extends VariableHandshakeGeneralCommandBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f41838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41839c;
    private final boolean e;
    private boolean h = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41837a = "notify_account_verify_success";
    private final CountDownLatch d = new CountDownLatch(1);

    mkw(UniteDevice uniteDevice) {
        this.f41839c = false;
        DeviceInfo deviceInfoC = cox.c(uniteDevice);
        this.f41838b = eey.d(deviceInfoC, TsExtractor.TS_STREAM_TYPE_AC4);
        this.e = deviceInfoC.getIsDemoWatch() == 1;
        this.f41839c = deviceInfoC.getDeviceFactoryReset() == 1;
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase
    public int processReceivedData(UniteDevice uniteDevice, String str) {
        if (StringUtils.g(str)) {
            LogUtil.j("SendAccountToDeviceCommand", "hexString is null.");
            return 51;
        }
        if (uniteDevice != null && uniteDevice.getDeviceInfo() != null) {
            cqp.a(100047, uniteDevice.getDeviceInfo().getDeviceName(), "", "");
        }
        this.mCurrentCommandTag = getCurrentCommandTag();
        if (!mla.c(this.mCurrentCommandTag, str)) {
            LogUtil.j("SendAccountToDeviceCommand", "is not current command reply, abandon this reply command");
            return 54;
        }
        if (!mla.b(str)) {
            LogUtil.j("SendAccountToDeviceCommand", "processReceivedData checkResponseCode Failed.");
            return 51;
        }
        if (this.h) {
            int iA = a(str);
            LogUtil.a("SendAccountToDeviceCommand", "processReceivedData mode: ", Integer.valueOf(iA));
            if (iA == 6) {
                if (!e(uniteDevice) || this.f41837a.equals("notify_account_verify_failed")) {
                    b(uniteDevice);
                    lng.c("ConnectMessage", "children account verify time out or verify failed: " + uniteDevice.getDeviceInfo().getDeviceName());
                    return 51;
                }
                cnf.d().b(uniteDevice.getDeviceInfo());
            } else {
                if (iA == 7) {
                    mla.c(uniteDevice, 12);
                    b(uniteDevice);
                    return 51;
                }
                LogUtil.j("SendAccountToDeviceCommand", "processReceivedData mode: ", Integer.valueOf(iA));
            }
        }
        if (d(str, uniteDevice)) {
            return 50;
        }
        LogUtil.j("SendAccountToDeviceCommand", "resolveSendAccountToDeviceCommand Failed.");
        return 51;
    }

    private boolean e(UniteDevice uniteDevice) {
        mla.c(uniteDevice, 15);
        try {
            cnf.d().c(uniteDevice.getDeviceInfo());
            return this.d.await(600L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            LogUtil.e("SendAccountToDeviceCommand", "await verify error.");
            return false;
        }
    }

    public void c(String str) {
        LogUtil.a("SendAccountToDeviceCommand", "releaseAccountVerifyLock mAccountVerifyStatus: ", str);
        if (!TextUtils.isEmpty(str)) {
            this.f41837a = str;
        }
        this.d.countDown();
    }

    private void b(UniteDevice uniteDevice) {
        DeviceInfo deviceInfo = null;
        boolean z = false;
        for (DeviceInfo deviceInfo2 : ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "SendAccountToDeviceCommand")) {
            if (deviceInfo2.getDeviceIdentify().equals(uniteDevice.getIdentify())) {
                deviceInfo = deviceInfo2;
                z = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(deviceInfo.getDeviceIdentify());
            mkf.e(BaseApplication.getContext()).unPair(arrayList, false);
        } else {
            arrayList.add(cox.c(uniteDevice).getDeviceIdentify());
            mkf.e(BaseApplication.getContext()).unPair(arrayList, true);
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase
    public String getCurrentCommandTag() {
        return "1A05";
    }

    @Override // com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.unitedevicemanger.handshake.VariableHandshakeGeneralCommandBase
    public int constructCommandMessage(cmg cmgVar) {
        String accountInfo;
        ByteBuffer byteBufferA;
        LogUtil.j("SendAccountToDeviceCommand", "constructCommandMessage Enter");
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        if (this.h) {
            accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1019);
            LogUtil.a("SendAccountToDeviceCommand", "constructCommandMessage accountType: ", accountInfo);
        } else {
            accountInfo = "";
        }
        if (strC == null || "0".equals(strC) || "com.huawei.health".equals(strC)) {
            LogUtil.j("SendAccountToDeviceCommand", "constructCommandMessage userId is empty");
            strC = "";
        }
        if (cmgVar == null) {
            LogUtil.j("SendAccountToDeviceCommand", "commandMessage is null.");
            return 51;
        }
        if (this.e) {
            strC = "demo_account";
        }
        LogUtil.a("SendAccountToDeviceCommand", "constructCommandMessage mIsSupportReworkAndManage: ", Boolean.valueOf(this.h));
        byte[] bArrB = eeq.b(strC);
        int length = bArrB.length;
        if (this.h) {
            if (Utils.h()) {
                if ("-1".equals(accountInfo)) {
                    byteBufferA = a(bArrB, length);
                } else {
                    byteBufferA = a(bArrB, length, Integer.valueOf(accountInfo).intValue());
                }
            } else {
                byteBufferA = d(bArrB, length);
            }
        } else {
            byteBufferA = a(bArrB, length);
        }
        cmgVar.a(byteBufferA.array());
        return 50;
    }

    private ByteBuffer a(byte[] bArr, int i, int i2) {
        byte[] bArrE = e(i2);
        byte[] bArrD = d();
        byte[] bArrB = b();
        byte[] bArrA = a();
        byte[] bArrG = g();
        byte[] bArrC = c();
        if (this.f41838b) {
            LogUtil.a("SendAccountToDeviceCommand", "getHasAccountByteByManageTlv support diff account pairing optimization");
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + 7 + bArrE.length + bArrD.length + bArrB.length + bArrA.length + bArrG.length + bArrC.length);
            byteBufferAllocate.put(Ascii.SUB).put((byte) 5).put((byte) 1).put(eeq.a(i)).put(bArr).put((byte) 3).put((byte) 1).put((byte) 1).put(bArrE).put(bArrD).put(bArrB).put(bArrA).put(bArrG).put(bArrC);
            return byteBufferAllocate;
        }
        LogUtil.a("SendAccountToDeviceCommand", "getHasAccountByteByManageTlv not support diff account pairing optimization");
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i + 4 + bArrE.length + bArrD.length + bArrB.length + bArrA.length + bArrG.length + bArrC.length);
        byteBufferAllocate2.put(Ascii.SUB).put((byte) 5).put((byte) 1).put(eeq.a(i)).put(bArr).put(bArrE).put(bArrD).put(bArrB).put(bArrA).put(bArrG).put(bArrC);
        return byteBufferAllocate2;
    }

    private ByteBuffer d(byte[] bArr, int i) {
        byte[] bArrA = a();
        byte[] bArrG = g();
        if (this.f41838b) {
            LogUtil.a("SendAccountToDeviceCommand", "getNoAccountByteByManageTlv support diff account pairing optimization");
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + 7 + bArrA.length + bArrG.length);
            byteBufferAllocate.put(Ascii.SUB).put((byte) 5).put((byte) 1).put(eeq.a(i)).put(bArr).put((byte) 3).put((byte) 1).put((byte) 1).put(bArrA).put(bArrG);
            return byteBufferAllocate;
        }
        LogUtil.a("SendAccountToDeviceCommand", "getNoAccountByteByManageTlv not support diff account pairing optimization");
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i + 4 + bArrA.length + bArrG.length);
        byteBufferAllocate2.put(Ascii.SUB).put((byte) 5).put((byte) 1).put(eeq.a(i)).put(bArr).put(bArrA).put(bArrG);
        return byteBufferAllocate2;
    }

    private ByteBuffer a(byte[] bArr, int i) {
        if (this.f41838b) {
            LogUtil.a("SendAccountToDeviceCommand", "support diff account pairing optimization");
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + 7);
            byteBufferAllocate.put(Ascii.SUB).put((byte) 5).put((byte) 1).put(eeq.a(i)).put(bArr).put((byte) 3).put((byte) 1).put((byte) 1);
            return byteBufferAllocate;
        }
        LogUtil.a("SendAccountToDeviceCommand", "not support diff account pairing optimization");
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i + 4);
        byteBufferAllocate2.put(Ascii.SUB).put((byte) 5).put((byte) 1).put(eeq.a(i)).put(bArr);
        return byteBufferAllocate2;
    }

    private byte[] e(int i) {
        return new byte[]{4, 1, (byte) i};
    }

    private byte[] d() {
        byte[] bArrB = eeq.b(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        byte[] bArrA = eeq.a(bArrB.length);
        byte[] bArr = new byte[bArrB.length + 1 + bArrA.length];
        bArr[0] = 5;
        System.arraycopy(bArrA, 0, bArr, 1, bArrA.length);
        System.arraycopy(bArrB, 0, bArr, bArrA.length + 1, bArrB.length);
        return bArr;
    }

    private byte[] b() {
        byte[] bArrB = eeq.b(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1014));
        byte[] bArrA = eeq.a(bArrB.length);
        byte[] bArr = new byte[bArrB.length + 1 + bArrA.length];
        bArr[0] = 6;
        System.arraycopy(bArrA, 0, bArr, 1, bArrA.length);
        System.arraycopy(bArrB, 0, bArr, bArrA.length + 1, bArrB.length);
        return bArr;
    }

    private byte[] a() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference("");
        ThreadPoolManager.c().a("SendAccountToDeviceCommand", new Runnable() { // from class: mkv
            @Override // java.lang.Runnable
            public final void run() {
                this.f41836c.a(atomicReference, countDownLatch);
            }
        });
        try {
            if (!countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)) {
                ReleaseLogUtil.d("R_SendAccountToDeviceCommand", "getGpsCountryFromLocation timeout");
            }
        } catch (InterruptedException e) {
            LogUtil.e("R_SendAccountToDeviceCommand", "getGpsCountryFromLocation interrupted: ", ExceptionUtils.c(e));
        }
        LogUtil.a("SendAccountToDeviceCommand", "send gpsCountry: ", atomicReference.get());
        byte[] bArrB = eeq.b((String) atomicReference.get());
        byte[] bArrA = eeq.a(bArrB.length);
        byte[] bArr = new byte[bArrB.length + 1 + bArrA.length];
        bArr[0] = 7;
        System.arraycopy(bArrA, 0, bArr, 1, bArrA.length);
        System.arraycopy(bArrB, 0, bArr, bArrA.length + 1, bArrB.length);
        return bArr;
    }

    /* synthetic */ void a(AtomicReference atomicReference, CountDownLatch countDownLatch) {
        atomicReference.set(e());
        countDownLatch.countDown();
    }

    private String e() {
        if (ActivityCompat.checkSelfPermission(BaseApplication.getContext(), "android.permission.ACCESS_FINE_LOCATION") != 0 && ActivityCompat.checkSelfPermission(BaseApplication.getContext(), "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            LogUtil.a("SendAccountToDeviceCommand", "no location permission, request...");
            return "";
        }
        LogUtil.a("SendAccountToDeviceCommand", "mISDeviceFactoryReset is ", Boolean.valueOf(this.f41839c));
        if (!this.f41839c) {
            return "";
        }
        LocationManager locationManager = (LocationManager) BaseApplication.getContext().getSystemService("location");
        Location lastKnownLocation = locationManager.getLastKnownLocation(GeocodeSearch.GPS);
        if (lastKnownLocation == null) {
            lastKnownLocation = locationManager.getLastKnownLocation("network");
        }
        if (lastKnownLocation == null) {
            LogUtil.j("SendAccountToDeviceCommand", "getGpsCountry location is null");
            return "";
        }
        try {
            List<Address> fromLocation = new Geocoder(BaseApplication.getContext(), Locale.getDefault()).getFromLocation(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude(), 1);
            if (!coq.d(fromLocation) && fromLocation.get(0) != null && fromLocation.get(0).getCountryCode() != null) {
                return fromLocation.get(0).getCountryCode();
            }
            return e(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            LogUtil.e("SendAccountToDeviceCommand", "getGpsCountry Exception ", ExceptionUtils.c(e));
            return e(lastKnownLocation.getLatitude(), lastKnownLocation.getLongitude());
        }
    }

    private String e(double d, double d2) {
        ReleaseLogUtil.d("R_SendAccountToDeviceCommand", "hwreverseGeocode requestMapsLocation location result");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final String[] strArr = {""};
        npx.a("SendAccountToDeviceCommand", d2, d, null, null, new ReverseGeocodeResultCallback() { // from class: mkw.1
            @Override // com.huawei.hwmap.callback.ReverseGeocodeResultCallback
            public void onSuccess(ReverseGeocodeResponse reverseGeocodeResponse) {
                if (reverseGeocodeResponse == null || coq.d(reverseGeocodeResponse.getSites())) {
                    countDownLatch.countDown();
                    return;
                }
                ReleaseLogUtil.d("R_SendAccountToDeviceCommand", "onRegeocodeSearched code ", reverseGeocodeResponse.getReturnCode());
                ReverseGeocodeResponse.Site site = reverseGeocodeResponse.getSites().get(0);
                if (site == null || site.getAddress() == null) {
                    countDownLatch.countDown();
                    return;
                }
                strArr[0] = site.getAddress().getCountryCode();
                countDownLatch.countDown();
            }

            @Override // com.huawei.hwmap.callback.ReverseGeocodeResultCallback
            public void onFailure(Throwable th) {
                ReleaseLogUtil.d("R_SendAccountToDeviceCommand", "hwreverseGeocode failure");
                countDownLatch.countDown();
            }
        });
        try {
            if (!countDownLatch.await(2500L, TimeUnit.MILLISECONDS)) {
                ReleaseLogUtil.d("R_SendAccountToDeviceCommand", "hwreverseGeocode timeout");
            }
        } catch (InterruptedException e) {
            LogUtil.e("SendAccountToDeviceCommand", " interrupted ", ExceptionUtils.c(e));
        }
        ReleaseLogUtil.d("R_SendAccountToDeviceCommand", "getGpsCountryFromHwMap GpsCountry ", strArr[0]);
        return strArr[0];
    }

    private byte[] g() {
        Configuration configuration = BaseApplication.getContext().getResources().getConfiguration();
        byte[] bArrB = eeq.b(LanguageUtil.b(BaseApplication.getContext()) + Constants.LINK + configuration.locale.getCountry());
        byte[] bArrA = eeq.a(bArrB.length);
        byte[] bArr = new byte[bArrB.length + 1 + bArrA.length];
        bArr[0] = 8;
        System.arraycopy(bArrA, 0, bArr, 1, bArrA.length);
        System.arraycopy(bArrB, 0, bArr, bArrA.length + 1, bArrB.length);
        return bArr;
    }

    private byte[] c() {
        boolean zB = CommonUtil.b(R.array.eu_country_code, LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010));
        LogUtil.a("SendAccountToDeviceCommand", "isEurope:", Boolean.valueOf(zB));
        return new byte[]{9, 1, (byte) (!zB ? 1 : 0)};
    }

    private boolean d(String str, UniteDevice uniteDevice) {
        if (d(str)) {
            cqp.a(100048, uniteDevice.getDeviceInfo().getDeviceName(), String.valueOf(d(str)), "");
            ExternalDeviceCapability capability = uniteDevice.getCapability();
            if (capability == null) {
                LogUtil.e("SendAccountToDeviceCommand", "resolveSendAccountToDeviceCommand externalDeviceCapability is null.");
                return false;
            }
            DeviceCapability compatibleCapacity = capability.getCompatibleCapacity();
            if (compatibleCapacity == null) {
                LogUtil.j("SendAccountToDeviceCommand", "resolveSendAccountToDeviceCommand deviceCapability is null.");
                return false;
            }
            if (!compatibleCapacity.isSupportSettingRelated()) {
                LogUtil.a("SendAccountToDeviceCommand", "resolveSendAccountToDeviceCommand is not support setting related.");
                return false;
            }
            this.mNextVariableHandshakeCommand = new mkr();
            return true;
        }
        cqp.a(100049, uniteDevice.getDeviceInfo().getDeviceName(), String.valueOf(d(str)), "");
        LogUtil.a("SendAccountToDeviceCommand", "resolveSendAccountToDeviceCommand account is different");
        this.mNextVariableHandshakeCommand = new mks();
        if (this.f41838b) {
            mla.c(uniteDevice, 13);
            return true;
        }
        mla.c(uniteDevice, 9);
        return true;
    }

    private boolean d(String str) {
        int iV;
        ees eesVarE = mla.e(str);
        if (eesVarE == null) {
            LogUtil.j("SendAccountToDeviceCommand", "tlvFather is null.");
            return false;
        }
        Iterator<eew> it = eesVarE.e().iterator();
        while (true) {
            if (!it.hasNext()) {
                iV = -1;
                break;
            }
            eew next = it.next();
            if (CommonUtil.v(next.e()) == 2) {
                iV = CommonUtil.v(next.b());
                break;
            }
        }
        b(iV);
        return iV != 1;
    }

    private int a(String str) {
        ees eesVarE = mla.e(str);
        if (eesVarE == null) {
            LogUtil.j("SendAccountToDeviceCommand", "tlvFather is null.");
            return 7;
        }
        for (eew eewVar : eesVarE.e()) {
            if (CommonUtil.v(eewVar.e()) == 2) {
                return CommonUtil.v(eewVar.b());
            }
        }
        return 7;
    }

    private void b(int i) {
        LogUtil.a("SendAccountToDeviceCommand", "saveAccountStatus:", Integer.valueOf(i));
        if (4 == i) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: mkw.4
                @Override // java.lang.Runnable
                public void run() {
                    HiHealthManager.d(BaseApplication.getContext()).setUserPreference(new HiUserPreference("sync_account_dialog_mark", "1"), false);
                }
            });
        } else if (i == 0) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: mkw.2
                @Override // java.lang.Runnable
                public void run() {
                    HiHealthManager.d(BaseApplication.getContext()).setUserPreference(new HiUserPreference("sync_account_dialog_mark", "0"), false);
                }
            });
        } else {
            LogUtil.j("SendAccountToDeviceCommand", "saveAccountStatus others: ", Integer.valueOf(i));
        }
    }

    public void a(boolean z) {
        this.h = z;
    }
}
