package defpackage;

import android.emcom.IHandoffSdkCallback;
import android.emcom.IOneHopAppCallback;
import android.emcom.IOneHopAuthReqCallback;
import android.os.RemoteException;
import android.util.Log;
import com.huawei.android.emcom.EmcomManagerEx;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public class ogy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile ogy f44301c;
    private static final Object e = new Object();
    private static HashMap<String, Integer> d = new HashMap<>(5);

    private ogy() {
        d.put("com.huawei.health", 5);
        d.put("com.android.gallery3d", 3);
        d.put("cn.wps.moffice_eng", 1);
        d.put("com.huawei.himovie", 4);
        d.put("com.android.mediacenter", 4);
    }

    public static ogy e() {
        if (f44301c == null) {
            synchronized (e) {
                if (f44301c == null) {
                    f44301c = new ogy();
                }
            }
        }
        return f44301c;
    }

    public int c(String str, int i, final IOneHopAppCallback.Stub stub) {
        Log.d("HwOneHopSdkDelegate", "registerOneHop, packageName:" + str);
        if (stub == null) {
            Log.e("HwOneHopSdkDelegate", "registerOneHop, appCallBack == null");
            return -1;
        }
        if (d()) {
            try {
                return EmcomManagerEx.getInstance().registerOneHop(str, i, stub);
            } catch (NoSuchMethodError unused) {
                Log.e("HwOneHopSdkDelegate", "registerOneHop catch NoMethodError.");
                return -1;
            }
        }
        if (!e(str, i)) {
            Log.d("HwOneHopSdkDelegate", "registerHandoff older version ,not support dataType:" + i);
            return -1;
        }
        try {
            return EmcomManagerEx.getInstance().registerHandoff(str, i, new IHandoffSdkCallback.Stub() { // from class: ogy.1
                @Override // android.emcom.IHandoffSdkCallback
                public void handoffStateChg(int i2) {
                }

                @Override // android.emcom.IHandoffSdkCallback
                public void handoffDataEvent(String str2) throws RemoteException {
                    stub.onOneHopReceived(str2);
                }
            });
        } catch (NoSuchMethodError unused2) {
            Log.e("HwOneHopSdkDelegate", "registerHandoff catch NoMethodError.");
            return -1;
        }
    }

    private boolean e(String str, int i) {
        int i2;
        int i3;
        try {
            String strOnehopGetVersion = EmcomManagerEx.getInstance().onehopGetVersion();
            Log.d("HwOneHopSdkDelegate", "isSupprtDataTypeWithApp strVersion: ");
            String[] strArrSplit = strOnehopGetVersion.split("\\.");
            if (strArrSplit.length >= 4) {
                i2 = Integer.parseInt(strArrSplit[1], 10);
                try {
                    i3 = Integer.parseInt(strArrSplit[2], 10);
                } catch (NoSuchMethodError unused) {
                    Log.e("HwOneHopSdkDelegate", "isSupprtDataTypeWithApp catch NoMethodError: ");
                    i3 = 0;
                } catch (NumberFormatException unused2) {
                    Log.e("HwOneHopSdkDelegate", "isSupprtDataTypeWithApp parse vaule error.");
                    i3 = 0;
                }
            } else {
                i3 = 0;
                i2 = 0;
            }
        } catch (NoSuchMethodError unused3) {
            i2 = 0;
        } catch (NumberFormatException unused4) {
            i2 = 0;
        }
        Log.d("HwOneHopSdkDelegate", "isSupprtDataTypeWithApp mainVersion: " + i2 + "subVersion:" + i3);
        if (i2 > 2) {
            return true;
        }
        if (i2 == 2 && i3 >= 2) {
            return true;
        }
        Integer num = d.get(str);
        return num != null && num.intValue() == i;
    }

    private boolean d() {
        int i;
        int i2;
        try {
            String strOnehopGetVersion = EmcomManagerEx.getInstance().onehopGetVersion();
            Log.d("HwOneHopSdkDelegate", "isSupportOneHopInterface strVersion: ");
            String[] strArrSplit = strOnehopGetVersion.split("\\.");
            if (strArrSplit.length >= 4) {
                i = Integer.parseInt(strArrSplit[1], 10);
                try {
                    i2 = Integer.parseInt(strArrSplit[2], 10);
                } catch (NoSuchMethodError unused) {
                    Log.e("HwOneHopSdkDelegate", "isSupportOneHopInterface catch NoMethodError: ");
                    i2 = 0;
                } catch (NumberFormatException unused2) {
                    Log.e("HwOneHopSdkDelegate", "isSupportOneHopInterface parse vaule error.");
                    i2 = 0;
                }
            } else {
                i2 = 0;
                i = 0;
            }
        } catch (NoSuchMethodError unused3) {
            i = 0;
        } catch (NumberFormatException unused4) {
            i = 0;
        }
        Log.d("HwOneHopSdkDelegate", "isSupportOneHopInterface mainVersion: " + i + "subVersion:" + i2);
        if (i > 2) {
            return true;
        }
        return i == 2 && i2 >= 3;
    }

    public String a() {
        Log.d("HwOneHopSdkDelegate", "getOneHopVersion.");
        try {
            return EmcomManagerEx.getInstance().onehopGetVersion();
        } catch (NoSuchMethodError unused) {
            Log.e("HwOneHopSdkDelegate", "getOneHopVersion error occurs");
            return "";
        }
    }

    public int c(String str, IOneHopAuthReqCallback.Stub stub) {
        Log.d("HwOneHopSdkDelegate", "onehopAuthReq, packageName:" + str);
        try {
            return EmcomManagerEx.getInstance().onehopAuthReq(str, stub);
        } catch (NoSuchMethodError unused) {
            Log.e("HwOneHopSdkDelegate", "onehopAuthReq catch NoMethodError.");
            return -1;
        }
    }
}
