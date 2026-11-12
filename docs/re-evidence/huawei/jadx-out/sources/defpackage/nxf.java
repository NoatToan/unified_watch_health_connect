package defpackage;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.C;
import com.huawei.btsportdevice.callback.CallbackBetweenClientAndController;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.base.AbstractFitnessClient;
import com.huawei.health.device.model.DeviceInformation;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hms.mlsdk.common.internal.client.event.MonitorResult;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.datastruct.IndoorEquipTrainerData;
import com.huawei.indoorequip.datastruct.RawDataFromCsafeTreadmill;
import com.huawei.openalliance.ad.constant.DetailedCreativeType;
import com.huawei.ui.main.stories.nps.interactors.mode.TypeParams;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes12.dex */
public class nxf extends nxi {
    private boolean aa;
    private BluetoothGattCharacteristic ab;
    private boolean ac;
    private boolean ad;
    private final Object ae;
    private long af;
    private a ag;
    private int ah;
    private volatile RawDataFromCsafeTreadmill ai;
    private volatile List<Byte> f;
    private nxr g;
    private BluetoothGattCharacteristic h;
    private int j;
    private DeviceInformation k;
    private BluetoothGatt l;
    private boolean m;
    private String n;
    private ExtendHandler o;
    private IndoorEquipTrainerData p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    private static final UUID e = UUID.fromString("226a47bc-86eb-4046-a03c-ab6804ca40c6");
    private static final UUID i = UUID.fromString("226a47bc-86ea-4046-a03c-ab6804ca40c6");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final UUID f43884b = UUID.fromString("5ddeb811-0098-45ae-9c70-dabbeb50304e");
    private static final Object d = new Object();

    public nxf(BluetoothGatt bluetoothGatt, CallbackBetweenClientAndController callbackBetweenClientAndController, Object obj) {
        super(bluetoothGatt, callbackBetweenClientAndController, obj);
        this.ai = new RawDataFromCsafeTreadmill();
        this.ac = false;
        this.r = false;
        this.z = false;
        this.s = false;
        this.q = false;
        this.y = false;
        this.aa = false;
        this.m = false;
        this.ad = false;
        this.w = false;
        this.v = false;
        this.u = false;
        this.t = false;
        this.x = true;
        this.j = 0;
        this.ah = 0;
        this.af = 0L;
        this.f = new ArrayList(0);
        this.ae = new Object();
        this.o = null;
        this.k = null;
        this.g = null;
    }

    private void e(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        synchronized (this.ae) {
            for (byte b2 : bArr) {
                this.f.add(Byte.valueOf(b2));
            }
        }
    }

    private byte[] k() {
        synchronized (this.ae) {
            if (this.f.size() <= 0) {
                return null;
            }
            byte[] bArr = new byte[this.f.size()];
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                bArr[i2] = this.f.get(i2).byteValue();
            }
            this.f.clear();
            return bArr;
        }
    }

    private void n() {
        synchronized (this.ae) {
            this.f.clear();
        }
    }

    @Override // defpackage.nxi
    public void d(BluetoothGatt bluetoothGatt) {
        super.d(bluetoothGatt);
    }

    @Override // defpackage.nxi
    public void c() {
        this.ab = null;
        this.h = null;
        this.l = null;
    }

    @Override // defpackage.nxi
    public void i() {
        this.w = true;
    }

    public boolean b() {
        return this.u;
    }

    public void a() {
        this.q = false;
        this.r = false;
        this.s = false;
    }

    public void j() {
        this.q = false;
        this.r = false;
        this.s = false;
    }

    public void d() {
        LogUtil.a("Track_IDEQ_CsafeController", "set pause thread true");
        this.y = true;
    }

    @Override // defpackage.nxi
    public void b(BluetoothGatt bluetoothGatt, int i2) {
        if (i2 == 0) {
            if (this.x) {
                e(bluetoothGatt, false);
                return;
            } else {
                a(bluetoothGatt, false);
                return;
            }
        }
        e(AbstractFitnessClient.ACTION_SERVICE_NOT_SUPPORT);
    }

    @Override // defpackage.nxi
    public void c(BluetoothGatt bluetoothGatt, int i2) {
        if (i2 == 0) {
            if (this.x) {
                e(bluetoothGatt, true);
                return;
            } else {
                a(bluetoothGatt, true);
                return;
            }
        }
        e(AbstractFitnessClient.ACTION_SERVICE_NOT_SUPPORT);
    }

    @Override // defpackage.nxi
    public void c(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
        byte[] value;
        if (i2 != 0 || bluetoothGattCharacteristic == null || !this.x || (value = bluetoothGattCharacteristic.getValue()) == null || value.length < 6) {
            return;
        }
        int i3 = 0;
        while (i3 < value.length && value[i3] != 0) {
            i3++;
        }
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = value[i4];
        }
        try {
            this.n = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("Track_IDEQ_CsafeController", "onFitnessCharacteristicRead, UnsupportedEncodingException!");
        }
        this.ah++;
    }

    @Override // defpackage.nxi
    public void b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic != null) {
            if (this.x) {
                if (this.ad) {
                    a(bluetoothGattCharacteristic);
                    return;
                } else {
                    e(bluetoothGattCharacteristic);
                    return;
                }
            }
            a(bluetoothGattCharacteristic);
        }
    }

    private void e(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        String str;
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (value != null) {
            try {
                str = new String(value, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                LogUtil.e("Track_IDEQ_CsafeController", "onFitnessCharacteristicChanged, UnsupportedEncodingException");
                str = null;
            }
            if (str != null && MonitorResult.SUCCESS.equals(str.toUpperCase(Locale.ENGLISH))) {
                this.ad = true;
                LogUtil.a("Track_IDEQ_CsafeController", "UNLOCK_COMMAND is correct!");
            } else if (b(value)) {
                this.ad = true;
                LogUtil.a("Track_IDEQ_CsafeController", "UNLOCK_COMMAND is correct (has been mIsUnlocked before already)");
            } else {
                this.ad = false;
                LogUtil.e("Track_IDEQ_CsafeController", "UNLOCK_COMMAND is incorrect! reply is " + str);
            }
        }
    }

    private boolean b(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            for (byte b2 : bArr) {
                if (b2 == -15 || b2 == -14) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.nxi
    public void e(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i2) {
        this.j++;
    }

    public void a(BluetoothGatt bluetoothGatt, final boolean z) {
        LogUtil.a("Track_IDEQ_CsafeController", "getService: isReconnect is ", Boolean.valueOf(z));
        if (bluetoothGatt == null) {
            LogUtil.e("Track_IDEQ_CsafeController", "cannot get service bcz gatt is null");
            e(AbstractFitnessClient.ACTION_SERVICE_NOT_SUPPORT);
            return;
        }
        BluetoothGattService service = bluetoothGatt.getService(i);
        if (service == null) {
            LogUtil.e("Track_IDEQ_CsafeController", "cannot get service bcz gattService is null");
            e(AbstractFitnessClient.ACTION_SERVICE_NOT_SUPPORT);
            return;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(e);
        if (characteristic == null) {
            LogUtil.e("Track_IDEQ_CsafeController", "cannot get service bcz gattCharacteristic is null");
            e(AbstractFitnessClient.ACTION_SERVICE_NOT_SUPPORT);
            return;
        }
        LogUtil.a("Track_IDEQ_CsafeController", "getService: get gattCharacteristic success");
        if (this.f43891a != null) {
            this.f43891a.setBreakBySelf(false);
        }
        this.ab = characteristic;
        if (z && this.aa) {
            LogUtil.a("Track_IDEQ_CsafeController", "now will resume three work threads(A)");
            e(AbstractFitnessClient.ACTION_SERVICE_REDISCOVERIED);
        } else {
            LogUtil.a("Track_IDEQ_CsafeController", "now will start three work threads, first will reset some vars(A)");
            e(AbstractFitnessClient.ACTION_SERVICE_DISCOVERIED);
            this.ai.resetAllMembers();
            a(0);
            this.m = false;
            n();
            nxn.b();
            d(901, (String) null);
            IndoorEquipTrainerData indoorEquipTrainerData = new IndoorEquipTrainerData(99);
            this.p = indoorEquipTrainerData;
            this.g = new nxr(indoorEquipTrainerData, this.k, null, false);
            this.y = false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: nxf.2
            @Override // java.lang.Runnable
            public void run() {
                nxf nxfVar = nxf.this;
                nxfVar.d(nxfVar.ab, z);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        e(bluetoothGattCharacteristic, true, true);
        if (!z || !this.aa) {
            LogUtil.a("Track_IDEQ_CsafeController", "now will start three work threads, first will reset some vars(B)");
            x();
        } else {
            LogUtil.a("Track_IDEQ_CsafeController", "now will resume three work threads(B)");
            this.y = false;
        }
    }

    public void e(BluetoothGatt bluetoothGatt, final boolean z) {
        LogUtil.a("Track_IDEQ_CsafeController", "getService: isReconnect is ", Boolean.valueOf(z));
        if (bluetoothGatt == null) {
            LogUtil.e("Track_IDEQ_CsafeController", "cannot get service bcz gatt is null");
            e(AbstractFitnessClient.ACTION_SERVICE_NOT_SUPPORT);
            return;
        }
        BluetoothGattService service = bluetoothGatt.getService(i);
        if (service == null) {
            LogUtil.e("Track_IDEQ_CsafeController", "cannot get service bcz gattService is null");
            e(AbstractFitnessClient.ACTION_SERVICE_NOT_SUPPORT);
            return;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(e);
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(f43884b);
        if (characteristic == null || characteristic2 == null) {
            LogUtil.e("Track_IDEQ_CsafeController", "cannot get service bcz gattCharacteristic or gattCharacteristicDeviceInfo is null");
            e(AbstractFitnessClient.ACTION_SERVICE_NOT_SUPPORT);
            return;
        }
        LogUtil.a("Track_IDEQ_CsafeController", "getService: get gattCharacteristic success");
        this.ab = characteristic;
        this.h = characteristic2;
        this.l = bluetoothGatt;
        ThreadPoolManager.c().execute(new Runnable() { // from class: nxg
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void b(boolean z) {
        int i2;
        try {
            Thread.sleep(100L);
            this.j = 0;
            e(this.ab, true, true);
            int i3 = 0;
            while (true) {
                i2 = this.j;
                if (i2 == 1 || i3 >= 10) {
                    break;
                }
                Thread.sleep(100L);
                i3++;
            }
            if (i3 >= 10 && i2 != 1) {
                LogUtil.a("Track_IDEQ_CsafeController", "gattCharacteristic write descriptor failed");
                e(AbstractFitnessClient.ACTION_SERVICE_NOT_SUPPORT);
                return;
            }
            this.ad = false;
            d(this.h, "UK502L".getBytes(Charset.defaultCharset()));
            if (c(0)) {
                return;
            }
            DeviceInformation deviceInformationE = e(0);
            this.k = deviceInformationE;
            if (deviceInformationE == null) {
                return;
            }
            BluetoothGatt bluetoothGatt = this.l;
            if (bluetoothGatt != null && bluetoothGatt.getDevice() != null) {
                LogUtil.d("Track_IDEQ_CsafeController", "bleDeviceName = ", this.l.getDevice().getName());
                this.k.setBleDeviceName(this.l.getDevice().getName());
            }
            c(this.k);
            d(z, this.k);
        } catch (InterruptedException | SecurityException e2) {
            LogUtil.e("Track_IDEQ_CsafeController", "afterFindingServiceForNewBtModule Exception:", ExceptionUtils.c(e2));
        }
    }

    private void d(boolean z, DeviceInformation deviceInformation) {
        if ("Life Fitness".equals(deviceInformation.getManufacturerString()) && (deviceInformation.getModelString() == null || !deviceInformation.getModelString().contains("-1"))) {
            this.v = true;
        } else {
            this.v = false;
        }
        if (this.f43891a != null) {
            this.f43891a.setBreakBySelf(false);
        }
        if (!z || !this.aa) {
            LogUtil.a("Track_IDEQ_CsafeController", "now will start three work threads, first will reset some vars(A)");
            e(AbstractFitnessClient.ACTION_SERVICE_DISCOVERIED);
            this.ai.resetAllMembers();
            a(0);
            this.m = false;
            n();
            nxn.b();
            d(901, (String) null);
            IndoorEquipTrainerData indoorEquipTrainerData = new IndoorEquipTrainerData(99);
            this.p = indoorEquipTrainerData;
            this.g = new nxr(indoorEquipTrainerData, this.k, null, false);
            this.y = false;
        } else {
            LogUtil.a("Track_IDEQ_CsafeController", "now will resume three work threads(A)");
            e(AbstractFitnessClient.ACTION_SERVICE_REDISCOVERIED);
        }
        if (!z || !this.aa) {
            LogUtil.a("Track_IDEQ_CsafeController", "now will start three work threads, first will reset some vars(B)");
            x();
        } else {
            LogUtil.a("Track_IDEQ_CsafeController", "now will resume three work threads(B)");
            this.y = false;
        }
    }

    private DeviceInformation e(int i2) throws InterruptedException {
        int i3;
        while (true) {
            i3 = this.ah;
            if (i3 == 1 || i2 >= 20) {
                break;
            }
            Thread.sleep(100L);
            i2++;
        }
        if (i2 >= 20 && i3 != 1) {
            LogUtil.a("Track_IDEQ_CsafeController", "cannot read device info");
            e(AbstractFitnessClient.ACTION_INVALID_DEVICE_INFO);
            return null;
        }
        if (!b(this.n)) {
            LogUtil.d("Track_IDEQ_CsafeController", "device info ", this.n, " is invalid");
            e(AbstractFitnessClient.ACTION_INVALID_DEVICE_INFO);
            return null;
        }
        DeviceInformation deviceInformation = new DeviceInformation();
        a(this.n, deviceInformation);
        if (deviceInformation.getDeviceType() == -1) {
            LogUtil.a("Track_IDEQ_CsafeController", "device info (device type) is invalid");
            e(AbstractFitnessClient.ACTION_INVALID_DEVICE_INFO);
            return null;
        }
        if (deviceInformation.getDeviceType() != 273 && deviceInformation.getDeviceType() != 265) {
            return deviceInformation;
        }
        LogUtil.a("Track_IDEQ_CsafeController", "crosstrainer and bike in this version is not support");
        e(AbstractFitnessClient.ACTION_FAILED_UNLOCK_BT_MODULE);
        return null;
    }

    private boolean c(int i2) throws InterruptedException {
        boolean z;
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        boolean z2;
        while (true) {
            z = this.ad;
            if (z || i2 >= 20) {
                break;
            }
            Thread.sleep(100L);
            i2++;
        }
        if (i2 >= 20 && !z) {
            LogUtil.a("Track_IDEQ_CsafeController", "unlock BT module failed, retry");
            d(this.ab, nwa.h());
            Thread.sleep(100L);
            d(this.ab, nwa.h());
            int i3 = 0;
            while (true) {
                z2 = this.ad;
                if (z2 || i3 >= 20) {
                    break;
                }
                Thread.sleep(100L);
                i3++;
            }
            if (i3 >= 20 && !z2) {
                LogUtil.a("Track_IDEQ_CsafeController", "unlock BT module failed");
                e(AbstractFitnessClient.ACTION_FAILED_UNLOCK_BT_MODULE);
                return true;
            }
        }
        try {
            BluetoothGatt bluetoothGatt = this.l;
            if (bluetoothGatt == null || (bluetoothGattCharacteristic = this.h) == null) {
                LogUtil.j("Track_IDEQ_CsafeController", "gatt has been closed");
                return true;
            }
            this.ah = 0;
            this.n = "";
            bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
            return false;
        } catch (SecurityException e2) {
            LogUtil.e("Track_IDEQ_CsafeController", "isFailStatus SecurityException:", ExceptionUtils.c(e2));
            return true;
        }
    }

    private boolean b(String str) {
        LogUtil.a("Track_IDEQ_CsafeController", "in checkDeviceInfoValid, mDeviceInfo is ", str);
        if (!TextUtils.isEmpty(str)) {
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            if (upperCase.startsWith("DI") && upperCase.endsWith("#") && !upperCase.contains("NULL") && upperCase.length() >= 11) {
                LogUtil.a("Track_IDEQ_CsafeController", "in checkDeviceInfoValid, mDeviceInfo is valid, return true");
                return true;
            }
            LogUtil.j("Track_IDEQ_CsafeController", "in checkDeviceInfoValid, mDeviceInfo is invalid, return false");
            return false;
        }
        LogUtil.j("Track_IDEQ_CsafeController", "in checkDeviceInfoValid, mDeviceInfo is empty, return false");
        return false;
    }

    private void a(String str, DeviceInformation deviceInformation) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        if (!upperCase.startsWith("DI") || !upperCase.endsWith("#") || upperCase.contains("NULL") || upperCase.length() < 11) {
            return;
        }
        String strSubstring = upperCase.substring(2, 3);
        String strSubstring2 = upperCase.substring(3, 5);
        String strSubstring3 = upperCase.substring(5, upperCase.length() - 5);
        LogUtil.a("Track_IDEQ_CsafeController", "in analysisDataInfo, mDeviceInfo is: TYPE:", strSubstring, " BRAND:", strSubstring2, " MODLE:", strSubstring3);
        if (ExifInterface.GPS_DIRECTION_TRUE.equals(strSubstring)) {
            deviceInformation.setDeviceType(264);
        } else if (TypeParams.SEARCH_CODE.equals(strSubstring)) {
            deviceInformation.setDeviceType(OldToNewMotionPath.SPORT_TYPE_CROSS_TRAINER);
        } else if ("B".equals(strSubstring)) {
            deviceInformation.setDeviceType(OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE);
        } else {
            deviceInformation.setDeviceType(-1);
        }
        if ("JS".equals(strSubstring2)) {
            deviceInformation.setManufacturerString("Johnson");
        } else if ("PC".equals(strSubstring2)) {
            deviceInformation.setManufacturerString("Precor");
        } else if ("TG".equals(strSubstring2)) {
            deviceInformation.setManufacturerString("Technogym");
        } else if ("LF".equals(strSubstring2)) {
            deviceInformation.setManufacturerString("Life Fitness");
        } else if ("ST".equals(strSubstring2)) {
            deviceInformation.setManufacturerString("Star Trac");
        } else if (!"MT".equals(strSubstring2) && "IZ".equals(strSubstring2)) {
            deviceInformation.setManufacturerString("Intenza");
        } else {
            deviceInformation.setManufacturerString("Matrix");
        }
        deviceInformation.setModelString(strSubstring3);
    }

    private void x() {
        LogUtil.a("Track_IDEQ_CsafeController", "now will start three work threads");
        this.q = true;
        this.r = true;
        this.s = true;
        if (this.ag == null) {
            this.ag = new a();
        }
        ThreadPoolManager.c().execute(this.ag);
    }

    private void a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        byte[] value = bluetoothGattCharacteristic.getValue();
        if (value == null || !this.z) {
            return;
        }
        this.ac = true;
        LogUtil.d("Track_IDEQ_CsafeController", "[COMMAND RECEIVED FROM EQUIP]", nzc.d(value));
        e(value);
        this.ac = false;
    }

    private void s() {
        c(nwa.k());
    }

    private void r() {
        c(nwa.b());
    }

    private void l() {
        c(nwa.a());
    }

    private void q() {
        c(nwa.j());
    }

    private void p() {
        c(nwa.e());
    }

    private void t() {
        c(nwa.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2) {
        if (!this.w) {
            if (i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7) {
                s();
                return;
            }
            return;
        }
        if (i2 == 1 || i2 == 4 || i2 == 6 || i2 == 9) {
            s();
            return;
        }
        if (i2 == 2 || i2 == 7) {
            r();
            return;
        }
        if (i2 == 5) {
            q();
            return;
        }
        if (i2 == 3) {
            l();
        } else if (i2 == 8) {
            p();
        } else if (i2 == 10) {
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(byte[] bArr) {
        if (bArr != null) {
            LogUtil.d("Track_IDEQ_CsafeController", "[COMMAND SEND TO EQUIP]", nzc.d(bArr));
            d(this.ab, bArr);
        } else {
            LogUtil.j("Track_IDEQ_CsafeController", "sendDeviceData: dataContent is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        this.o.removeMessages(902);
        if (!this.s) {
            this.p = null;
            return;
        }
        if (this.y) {
            this.o.sendEmptyMessage(902, 500L);
            return;
        }
        synchronized (d) {
            if (this.ai.isThereAnyFlagsHasBeenSet()) {
                c(this.ai, this.p);
                this.ai.clearDataFlags();
                this.g.c();
                e(this.p, this.ai.getStateOfTreadmill());
            }
        }
        this.o.sendEmptyMessage(902, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        byte[] bArrK;
        this.o.removeMessages(901);
        if (!this.r) {
            this.z = false;
            return;
        }
        if (this.y) {
            this.o.sendEmptyMessage(901, 500L);
            return;
        }
        if (!this.ac && (bArrK = k()) != null) {
            synchronized (d) {
                d(bArrK);
            }
        }
        this.o.sendEmptyMessage(901, 200L);
    }

    private void d(byte[] bArr) {
        nxn.e(bArr, this.ai);
        if (this.ai.getStateOfTreadmill() == 7) {
            LogUtil.a("Track_IDEQ_CsafeController", "caLL finishThisSession  (4)");
            if (SystemClock.elapsedRealtime() - this.af < C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS || !this.m) {
                return;
            }
            c(true, true, false, false);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int stateOfTreadmill;
            if (!nxf.this.aa) {
                nxf.this.aa = true;
                nxf.this.m = false;
                nxf.this.w = false;
                nxf.this.t = false;
                LogUtil.a("IDEQ/ThreadToSendCommand", "start a WorkThreadToSendCommand, mIsAllowedToRunThreadToSendCommand is ", Boolean.valueOf(nxf.this.q));
                nxf.this.o();
                nxf.this.y();
                boolean z = nxf.this.n != null && (nxf.this.n.toUpperCase(Locale.ENGLISH).contains("T7XE") || nxf.this.n.toUpperCase(Locale.ENGLISH).contains("T-7XE"));
                boolean zE = true;
                boolean zE2 = true;
                int i = 0;
                int i2 = 0;
                boolean zA = false;
                int i3 = 0;
                while (nxf.this.q) {
                    boolean z2 = (i >= 10 || i2 >= 10) && z;
                    if (!nxf.this.y) {
                        synchronized (nxf.d) {
                            stateOfTreadmill = nxf.this.ai.getStateOfTreadmill();
                        }
                        if (stateOfTreadmill == 7) {
                            zA = nxf.this.a(zA, z2);
                        } else if (stateOfTreadmill == 2 && !z2) {
                            zE = nxf.this.e(zE, nwa.d());
                        } else if (stateOfTreadmill == 3 && !z2) {
                            nxf.this.c(nwa.f());
                            try {
                                Thread.sleep(200L);
                            } catch (InterruptedException unused) {
                                LogUtil.e("Track_IDEQ_CsafeController", "InterruptedException");
                            }
                        } else if (stateOfTreadmill == 8 && i < 10) {
                            i++;
                            if (!z2) {
                                zE2 = nxf.this.e(zE2, nwa.g());
                            }
                        } else if ((stateOfTreadmill == 9 || stateOfTreadmill == 0) && i2 < 10) {
                            i2++;
                            if (!z2) {
                                nxf.this.c(nwa.g());
                                try {
                                    Thread.sleep(200L);
                                } catch (InterruptedException unused2) {
                                    LogUtil.e("Track_IDEQ_CsafeController", "InterruptedException");
                                }
                            }
                        } else if (stateOfTreadmill == 1 && !z2) {
                            nxf.this.c(nwa.i());
                            try {
                                Thread.sleep(200L);
                            } catch (InterruptedException unused3) {
                                LogUtil.e("Track_IDEQ_CsafeController", "InterruptedException");
                            }
                            zA = false;
                        } else if (stateOfTreadmill == 5 || stateOfTreadmill == 6) {
                            nxf.this.m = true;
                        }
                        i3++;
                        nxf.this.b(i3);
                        if (i3 >= 10) {
                            i3 = 0;
                        }
                        try {
                            Thread.sleep(200L);
                        } catch (InterruptedException unused4) {
                            LogUtil.e("Track_IDEQ_CsafeController", "InterruptedException");
                        }
                    } else {
                        try {
                            Thread.sleep(500L);
                        } catch (InterruptedException unused5) {
                            LogUtil.e("Track_IDEQ_CsafeController", "InterruptedException");
                        }
                    }
                }
                LogUtil.a("IDEQ/ThreadToSendCommand", "End a WorkThreadToSendCommand");
                nxf.this.aa = false;
                return;
            }
            LogUtil.a("IDEQ/ThreadToSendCommand", "a WorkThreadToSendCommand is running already, not allowed to start a new one");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(boolean z, byte[] bArr) {
        boolean z2;
        if (z) {
            c(bArr);
            z2 = false;
        } else {
            c(nwa.f());
            z2 = true;
        }
        try {
            Thread.sleep(200L);
            return z2;
        } catch (InterruptedException unused) {
            LogUtil.e("Track_IDEQ_CsafeController", "InterruptedException");
            return z2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(boolean z, boolean z2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.af;
        LogUtil.a("IDEQ/ThreadToSendCommand", "in WorkThreadToSendCommand and state is Finish, diff = ", Long.valueOf(jElapsedRealtime), ", state Is Finish At Beginning = ", Boolean.valueOf(z));
        if (jElapsedRealtime >= C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS && !z) {
            return z;
        }
        if (!z2) {
            c(nwa.g());
        }
        try {
            Thread.sleep(200L);
            return true;
        } catch (InterruptedException unused) {
            LogUtil.e("Track_IDEQ_CsafeController", "InterruptedException");
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        while (!this.ai.isThereAnyFlagsHasBeenSet() && this.q) {
            if (this.y) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused) {
                    LogUtil.e("Track_IDEQ_CsafeController", "InterruptedException");
                }
            } else {
                if (!this.t) {
                    this.t = true;
                    this.af = SystemClock.elapsedRealtime();
                    n();
                    if (this.o == null) {
                        this.o = HandlerCenter.b(new Handler.Callback() { // from class: nxf.4
                            @Override // android.os.Handler.Callback
                            public boolean handleMessage(Message message) {
                                int i2 = message.what;
                                if (i2 == 901) {
                                    nxf.this.m();
                                    return true;
                                }
                                if (i2 != 902) {
                                    return false;
                                }
                                nxf.this.u();
                                return true;
                            }
                        }, "Track_IDEQ_CsafeController");
                    }
                    this.o.sendEmptyMessage(901);
                    this.o.sendEmptyMessage(902);
                    this.z = true;
                }
                c(nwa.h());
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                    LogUtil.e("Track_IDEQ_CsafeController", "InterruptedException");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.v) {
            LogUtil.a("IDEQ/ThreadToSendCommand", "will delay 10s to start command sending");
            this.u = true;
            d(DetailedCreativeType.SINGLE_IMG, (String) null);
            int i2 = 0;
            while (this.q) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused) {
                    LogUtil.e("Track_IDEQ_CsafeController", "InterruptedException");
                }
                i2++;
                if (i2 >= 20) {
                    break;
                }
            }
            d(910, (String) null);
            this.u = false;
        }
    }

    private void c(RawDataFromCsafeTreadmill rawDataFromCsafeTreadmill, IndoorEquipTrainerData indoorEquipTrainerData) {
        if (indoorEquipTrainerData == null || rawDataFromCsafeTreadmill == null) {
            return;
        }
        indoorEquipTrainerData.clearData();
        if (rawDataFromCsafeTreadmill.isItDistanceHasBeenSet()) {
            d(rawDataFromCsafeTreadmill, indoorEquipTrainerData);
        }
        if (rawDataFromCsafeTreadmill.isItCreepHasBeenSet()) {
            double dC = nxn.c(rawDataFromCsafeTreadmill.getCreep(), rawDataFromCsafeTreadmill.getCreepUnit());
            if (dC >= 0.0d) {
                indoorEquipTrainerData.setPositiveElevationGain((int) (dC * 10000.0d));
            }
        }
        if (rawDataFromCsafeTreadmill.isItSpeedHasBeenSet()) {
            double dE = nxn.e(rawDataFromCsafeTreadmill.getSpeed(), rawDataFromCsafeTreadmill.getSpeedUnit());
            if (rawDataFromCsafeTreadmill.getSpeedUnit() == 83) {
                indoorEquipTrainerData.setStepPerMinute((int) dE);
            } else if (rawDataFromCsafeTreadmill.getSpeedUnit() == 82) {
                indoorEquipTrainerData.setRevsPerMinute((int) dE);
            } else if (dE >= 0.0d) {
                indoorEquipTrainerData.setInstantaneousSpeed((int) (dE * 100.0d));
            }
        }
        if (rawDataFromCsafeTreadmill.isItTimeHasBeenSet()) {
            indoorEquipTrainerData.setElapsedTime((int) rawDataFromCsafeTreadmill.getDuringSeconds());
            indoorEquipTrainerData.setElapsedTimeStringForShow(rawDataFromCsafeTreadmill.getDuringTimeForShow());
        }
        if (rawDataFromCsafeTreadmill.isItCalorieHasBeenSet()) {
            indoorEquipTrainerData.setTotalEnergy(rawDataFromCsafeTreadmill.getCalorie());
        }
        if (rawDataFromCsafeTreadmill.isItHeartRateHasBeenSet()) {
            indoorEquipTrainerData.setHeartRate(rawDataFromCsafeTreadmill.getHeartRateFromTreadmill());
        }
        if (rawDataFromCsafeTreadmill.isItPowerHasBeenSet()) {
            if (rawDataFromCsafeTreadmill.getPowerUnit() == 86) {
                indoorEquipTrainerData.setPowerInCalPerMin(rawDataFromCsafeTreadmill.getPower());
            } else if (rawDataFromCsafeTreadmill.getPowerUnit() == 87) {
                indoorEquipTrainerData.setPowerInCalPerMin(rawDataFromCsafeTreadmill.getPower() / 60);
            } else if (rawDataFromCsafeTreadmill.getPowerUnit() == 88) {
                indoorEquipTrainerData.setInstantaneousPower(rawDataFromCsafeTreadmill.getPower());
            }
        }
        indoorEquipTrainerData.setStartTime((int) rawDataFromCsafeTreadmill.getStartSecond());
    }

    private void d(RawDataFromCsafeTreadmill rawDataFromCsafeTreadmill, IndoorEquipTrainerData indoorEquipTrainerData) {
        double dC = nxn.c(rawDataFromCsafeTreadmill.getDistance(), rawDataFromCsafeTreadmill.getDistanceUnit());
        if (dC >= 0.0d) {
            indoorEquipTrainerData.setTotalDistance((int) (dC * 1000.0d));
        }
        if (rawDataFromCsafeTreadmill.getDistanceUnit() == 69) {
            indoorEquipTrainerData.setStrideCount(rawDataFromCsafeTreadmill.getDistance() * 10);
        }
    }
}
