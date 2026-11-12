package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.huawei.health.ITrackDataForDeveloper;
import com.huawei.hihealth.ICommonCallback;
import com.huawei.hihealth.IRealTimeDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lew {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f40008c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap<String, List<ldu>> f40007b = new HashMap<>(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<ldu> f40006a = new ArrayList();

    public static void e(String str, int i, String str2, IRealTimeDataCallback iRealTimeDataCallback, ITrackDataForDeveloper iTrackDataForDeveloper) {
        synchronized (f40008c) {
            if (f40007b.containsKey(str)) {
                List<ldu> list = f40007b.get(str);
                f40006a = list;
                if (list.size() == 0) {
                    a(str, i, str2, iRealTimeDataCallback, iTrackDataForDeveloper);
                } else if (f40006a.size() > 0) {
                    c(i, str2, str, iRealTimeDataCallback, iTrackDataForDeveloper);
                }
            } else {
                a(str, i, str2, iRealTimeDataCallback, iTrackDataForDeveloper);
            }
        }
    }

    private static void c(int i, String str, String str2, IRealTimeDataCallback iRealTimeDataCallback, ITrackDataForDeveloper iTrackDataForDeveloper) {
        boolean z = false;
        for (int i2 = 0; i2 < f40006a.size(); i2++) {
            if (str.equals(f40006a.get(i2).getPermissionTypeName())) {
                z = true;
            }
        }
        if (z) {
            return;
        }
        a(str2, i, str, iRealTimeDataCallback, iTrackDataForDeveloper);
    }

    private static void a(String str, int i, String str2, IRealTimeDataCallback iRealTimeDataCallback, ITrackDataForDeveloper iTrackDataForDeveloper) {
        synchronized (f40008c) {
            f40006a.add(new ldu(i, str2, iRealTimeDataCallback, iTrackDataForDeveloper));
            f40007b.put(str, f40006a);
        }
    }

    public static void e(String str, String str2) {
        synchronized (f40008c) {
            if (f40007b.size() > 0 && f40007b.containsKey(str)) {
                List<ldu> list = f40007b.get(str);
                if (list.size() == 0) {
                    return;
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (str2.equals(list.get(size).getPermissionTypeName())) {
                        list.remove(size);
                    }
                }
            }
        }
    }

    public static void a(int i, String str, Context context) {
        LogUtil.a("HiHealthPermissionTypeUtil", "stopRealingTime scopeId = ", Integer.valueOf(i), " packageName = ", str);
        synchronized (f40008c) {
            if (f40007b.containsKey(str)) {
                List<ldu> list = f40007b.get(str);
                if (list.size() == 0) {
                    return;
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (list.get(size).getPermissionTypeId() == i) {
                        b(list, size, i, str, context);
                        break;
                    }
                }
            }
        }
    }

    public static void b(List<ldu> list, int i, int i2, String str, Context context) {
        ICommonCallback iCommonCallback = new ICommonCallback() { // from class: lew.3
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.huawei.hihealth.ICommonCallback
            public void onResult(int i3, String str2) throws RemoteException {
            }
        };
        if (i2 == 50001) {
            lbm.c(context).n(str, list.get(i).getCallback());
            lbm.c(context).o(str, list.get(i).getCallback());
        } else if (i2 == 101003) {
            lbg.b(context).d(list.get(i).getTrackDataForDeveloper(), iCommonCallback);
        } else if (i2 == 101202) {
            lbm.c(context).m(str, list.get(i).getCallback());
        } else {
            LogUtil.a("HiHealthPermissionTypeUtil", "stopRealingTimeData none");
        }
        list.remove(i);
    }
}
