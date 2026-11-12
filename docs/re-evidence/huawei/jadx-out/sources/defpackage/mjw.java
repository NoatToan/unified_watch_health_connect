package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import androidx.work.PeriodicWorkRequest;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.hihealthkit.AuthSupport;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwWorkoutServiceManager;
import com.huawei.hwdevice.phoneprocess.mgr.heartrate.HwHeartRateManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IDeviceStateAIDLCallback;
import health.compact.a.CommonUtil;
import health.compact.a.HEXUtils;
import health.compact.a.LocalBroadcast;
import health.compact.a.ReleaseLogUtil;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class mjw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<Integer, ParserInterface> f41772a = new ConcurrentHashMap(32);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f41773b = 0;
    private Context e;

    private boolean a(int i, int i2) {
        if (i == 7) {
            return i2 == 30 || i2 == 38 || i2 == 39;
        }
        return false;
    }

    private boolean c(int i, int i2) {
        if (i == 7) {
            return i2 == 3 || i2 == 4 || i2 == 5 || i2 == 8 || i2 == 10 || i2 == 11 || i2 == 12 || i2 == 13 || i2 == 14 || i2 == 15 || i2 == 31 || i2 == 32;
        }
        return false;
    }

    private boolean f(int i, int i2) {
        if (i == 37) {
            return i2 == 1 || i2 == 2 || i2 == 3;
        }
        return false;
    }

    private boolean g(int i, int i2) {
        return i == 26 && i2 == 7;
    }

    private boolean h(int i, int i2) {
        if (i == 22) {
            return i2 == 12 || i2 == 13;
        }
        return false;
    }

    private boolean i(int i, int i2) {
        return (i == 2 && (i2 == 5 || i2 == 2 || i2 == 11 || i2 == 16 || i2 == 17)) || (i == 33 && i2 == 2);
    }

    public void e(Context context) {
        this.e = context;
        HwExerciseAdviceManager hwExerciseAdviceManager = HwExerciseAdviceManager.getInstance();
        HwWorkoutServiceManager hwWorkoutServiceManager = HwWorkoutServiceManager.getInstance();
        HwHeartRateManager hwHeartRateManager = HwHeartRateManager.getInstance();
        mnm mnmVarA = mnm.a();
        mvx mvxVarE = mvx.e();
        mnl mnlVarD = mnl.d();
        mro mroVarE = mro.e();
        mrj mrjVarE = mrj.e();
        mxf mxfVarE = mxf.e(BaseApplication.getContext());
        mxp mxpVarD = mxp.d();
        mnc mncVarE = mnc.e();
        oqm oqmVarC = oqm.c();
        mzv mzvVarD = mzv.d();
        yhu yhuVarB = yhu.b();
        yht yhtVarD = yht.d();
        mzz mzzVarC = mzz.c();
        f41772a.put(31, mncVarE);
        f41772a.put(43, mzzVarC);
        f41772a.put(49, mzvVarD);
        f41772a.put(22, hwExerciseAdviceManager);
        f41772a.put(23, hwWorkoutServiceManager);
        f41772a.put(25, hwHeartRateManager);
        f41772a.put(1014, mnmVarA);
        f41772a.put(24, mvxVarE);
        f41772a.put(28, mnlVarD);
        f41772a.put(40, mroVarE);
        f41772a.put(35, mxfVarE);
        f41772a.put(45, mxpVarD);
        f41772a.put(44, mrjVarE);
        f41772a.put(48, oqmVarC);
        f41772a.put(52, yhuVarB);
        f41772a.put(53, yhtVarD);
    }

    public void a(DeviceInfo deviceInfo, int i, byte[] bArr, IDeviceStateAIDLCallback iDeviceStateAIDLCallback, Map<String, IDeviceStateAIDLCallback> map) {
        if (e(bArr)) {
            b(deviceInfo, bArr);
        }
        if (!mju.e(bArr, deviceInfo)) {
            LogUtil.a("PhoneService-LayerDataOrder", "onDataReceived, but don't need process");
            return;
        }
        if (f41772a == null || bArr == null || bArr.length < 2) {
            LogUtil.j("PhoneService-LayerDataOrder", "sManagerMap is null");
            return;
        }
        boolean zD = eel.d(deviceInfo.getProductType());
        byte b2 = bArr[0];
        byte b3 = bArr[1];
        e(b2, b3);
        if (b2 == 27 || b2 == 39 || b2 == 37 || b2 == 42) {
            ReleaseLogUtil.c("DEVMGR_PhoneService-LayerDataOrder", "response sid: ", Integer.valueOf(b2), " cid: ", Integer.valueOf(b3), " deviceStateAidlCallback is empty: ", Boolean.valueOf(iDeviceStateAIDLCallback == null));
        }
        if (b2 == 8 && b3 == 10) {
            ReleaseLogUtil.c("DEVMGR_PhoneService-LayerDataOrder", "handle alarm clock escape.");
            String strA = HEXUtils.a(bArr);
            LogUtil.a("PhoneService-LayerDataOrder", "handle alarm clock escape tlvHex=", strA);
            moy.a().d(strA);
            return;
        }
        ParserInterface parserInterfaceB = b(b2, b3, zD);
        if (parserInterfaceB != null && !h(b2, b3)) {
            parserInterfaceB.getResult(deviceInfo, bArr);
        } else {
            b(deviceInfo, i, bArr, iDeviceStateAIDLCallback, map);
        }
        d(deviceInfo, bArr);
        c(deviceInfo, bArr);
    }

    private boolean e(byte[] bArr) {
        if (bArr != null && bArr.length >= 2) {
            byte b2 = bArr[0];
            byte b3 = bArr[1];
            if (b2 == 7 && b3 == 15) {
                return true;
            }
        }
        return false;
    }

    private void b(DeviceInfo deviceInfo, byte[] bArr) {
        try {
            int iA = mjb.a(bArr);
            LogUtil.a("PhoneService-LayerDataOrder", "dealIsBtProxySleepActionReport action: ", Integer.valueOf(iA));
            if (iA == 4 || iA == 16) {
                mlu.d().c(deviceInfo.getDeviceIdentify(), iA);
                mwe.a().a(iA);
            }
        } catch (eeu unused) {
            LogUtil.e("PhoneService-LayerDataOrder", "dealIsBtProxySleepActionReport occur TlvException");
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x0098 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r6 != 12) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        return defpackage.mjw.f41772a.get(1014);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r6 != 15) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private ParserInterface b(int i, int i2, boolean z) {
        ParserInterface parserInterfaceB;
        if (!CommonUtil.bu()) {
            LogUtil.a("PhoneService-LayerDataOrder", "getProcessManager beta");
            if (i == 10) {
                if (i2 != 15) {
                }
            }
            if (i != 1) {
            }
            if (f(i, i2)) {
                return f41772a.get(2037);
            }
            if (i != 23) {
            }
            if (i != 1) {
            }
            if (i != 1) {
            }
            parserInterfaceB = b(i, i2);
            if (parserInterfaceB == null) {
                return c(i, i2, z);
            }
            return parserInterfaceB;
        }
        if (i == 10) {
        }
        if (i != 1 && (i2 == 41 || i2 == 42)) {
            return f41772a.get(2001);
        }
        if (f(i, i2)) {
            return f41772a.get(2037);
        }
        if (i != 23 && i2 == 16) {
            return f41772a.get(25);
        }
        if (i != 1 && i2 == 23) {
            return nac.e(this.e);
        }
        if (i != 1 && i2 == 47) {
            return naf.e();
        }
        parserInterfaceB = b(i, i2);
        if (parserInterfaceB == null) {
            return c(i, i2, z);
        }
        return parserInterfaceB;
    }

    private ParserInterface b(int i, int i2) {
        if (i != 32) {
            return null;
        }
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            return mxz.d();
        }
        LogUtil.j("PhoneService-LayerDataOrder", "getStressRelaxDataManager not stress relax data.");
        return null;
    }

    private ParserInterface c(int i, int i2, boolean z) {
        if (i == 24 && i2 == 6) {
            return nei.c();
        }
        if (i == 3 && (i2 == 4 || i2 == 3)) {
            return mrx.d();
        }
        if (i == 7 && i2 == 42) {
            return ndq.c();
        }
        if (i(i, i2)) {
            return ncl.d(this.e);
        }
        if (i == 42 && i2 == 3) {
            return muj.c();
        }
        if (i == 1 && (i2 == 61 || i2 == 62)) {
            return mlo.d();
        }
        if (a(i, i2)) {
            return myp.b();
        }
        if (z && c(i, i2)) {
            return mpq.c();
        }
        if (c(i, i2)) {
            return mpg.d();
        }
        return f41772a.get(Integer.valueOf(i));
    }

    private void b(DeviceInfo deviceInfo, int i, byte[] bArr, IDeviceStateAIDLCallback iDeviceStateAIDLCallback, Map<String, IDeviceStateAIDLCallback> map) {
        if (iDeviceStateAIDLCallback != null) {
            try {
                iDeviceStateAIDLCallback.onDataReceived(deviceInfo, i, bArr);
            } catch (RemoteException unused) {
                ReleaseLogUtil.b("DEVMGR_PhoneService-LayerDataOrder", "onDataReceived remoteException RemoteException");
                e(bArr, deviceInfo);
            } catch (Exception unused2) {
                ReleaseLogUtil.b("DEVMGR_PhoneService-LayerDataOrder", "mDeviceStateCallback onDataReceived Exception");
            }
            if (d(bArr) || b(bArr)) {
                c(deviceInfo, i, bArr, iDeviceStateAIDLCallback, map);
                return;
            }
            return;
        }
        e(bArr, deviceInfo);
    }

    private boolean d(byte[] bArr) {
        byte b2 = bArr[0];
        return b2 == 27 || b2 == 39 || b2 == 9;
    }

    private boolean b(byte[] bArr) {
        byte b2 = bArr[0];
        return b2 == 37 || b2 == 42;
    }

    private static void c(DeviceInfo deviceInfo, int i, byte[] bArr, IDeviceStateAIDLCallback iDeviceStateAIDLCallback, Map<String, IDeviceStateAIDLCallback> map) {
        IDeviceStateAIDLCallback iDeviceStateAIDLCallback2 = map.get(BaseApplication.getAppPackage());
        if (iDeviceStateAIDLCallback2 == null || iDeviceStateAIDLCallback2.equals(iDeviceStateAIDLCallback)) {
            ReleaseLogUtil.c("DEVMGR_PhoneService-LayerDataOrder", "mainProcessCallback is ", iDeviceStateAIDLCallback2);
            return;
        }
        try {
            iDeviceStateAIDLCallback2.onDataReceived(deviceInfo, i, bArr);
        } catch (Exception unused) {
            ReleaseLogUtil.b("DEVMGR_PhoneService-LayerDataOrder", "callbackAgain onDataReceived Exception");
        }
    }

    private void e(byte[] bArr, DeviceInfo deviceInfo) {
        LogUtil.a("PhoneService-LayerDataOrder", "sendBroadcastWhenMainProcessDead");
        if (a(bArr)) {
            return;
        }
        Intent intent = new Intent("com.huawei.bone.ACTION_RECEIVE_SEND_SPORT_GOAL");
        intent.putExtra("synchronize_data_deviceinfo_key", deviceInfo);
        intent.setPackage(BaseApplication.getContext().getPackageName());
        if (d(bArr[0], bArr[1])) {
            intent.putExtra("alarm_data_key", bArr);
        } else if (g(bArr[0], bArr[1])) {
            intent.putExtra("synchronize_data_key", bArr);
        } else {
            LogUtil.j("PhoneService-LayerDataOrder", "sendBroadcastWhenMainProcessDead is return.");
            return;
        }
        BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    private boolean a(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            LogUtil.j("PhoneService-LayerDataOrder", "sendBroadcastWhenMainProcessDead error datas");
            return true;
        }
        if (!d(bArr[0], bArr[1]) && !g(bArr[0], bArr[1])) {
            LogUtil.j("PhoneService-LayerDataOrder", "sendBroadcastWhenMainProcessDead no match data");
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!d(bArr[0], bArr[1]) && jCurrentTimeMillis - this.f41773b > PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS && !g(bArr[0], bArr[1])) {
            LogUtil.j("PhoneService-LayerDataOrder", "The user is not moving.");
            this.f41773b = jCurrentTimeMillis;
            return true;
        }
        this.f41773b = System.currentTimeMillis();
        return false;
    }

    private boolean d(int i, int i2) {
        LogUtil.a("isAlarmCommand command: ", Integer.valueOf(i2));
        if (i == 8) {
            return i2 == 5 || i2 == 8;
        }
        return false;
    }

    private void e(int i, int i2) {
        try {
            if (j(i, 50)) {
                f41772a.put(50, mwt.c());
            }
            if (j(i, 43)) {
                f41772a.put(43, mzz.c());
            }
            if (j(i, 46)) {
                f41772a.put(46, mlb.e());
            }
            if (i == 1 && ((i2 == 41 || i2 == 42) && f41772a.get(2001) == null)) {
                f41772a.put(2001, ndk.b());
            }
            if (f(i, i2) && f41772a.get(2037) == null) {
                f41772a.put(2037, nbp.c());
            }
            if (j(i, 4)) {
                f41772a.put(4, ndn.b(this.e));
            }
            if (j(i, 15)) {
                f41772a.put(15, nei.c());
            }
            if (j(i, 51)) {
                f41772a.put(51, mxw.e());
            }
        } catch (IndexOutOfBoundsException e) {
            LogUtil.e("PhoneService-LayerDataOrder", "processOtherService IndexOutOfBoundsException:", ExceptionUtils.c(e));
        }
    }

    private boolean j(int i, int i2) {
        return i == i2 && f41772a.get(Integer.valueOf(i2)) == null;
    }

    private void d(DeviceInfo deviceInfo, byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == 1 && bArr[1] == 8) {
            mlc.a().a(deviceInfo, bArr);
        } else if (b2 == 37 && bArr[1] == 15) {
            AuthSupport.c().b(deviceInfo, bArr);
        }
    }

    private void c(DeviceInfo deviceInfo, byte[] bArr) {
        byte b2 = bArr[0];
        if ((b2 == 1 && bArr[1] == 8) || b2 == 46) {
            yht.d().b(deviceInfo, bArr);
        }
    }
}
