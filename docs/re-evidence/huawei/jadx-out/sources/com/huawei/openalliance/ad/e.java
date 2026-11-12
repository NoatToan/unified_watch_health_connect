package com.huawei.openalliance.ad;

import android.content.Context;
import android.os.IBinder;
import android.util.Log;
import com.huawei.hms.ads.dynamic.DynamicModule;
import com.huawei.hms.ads.uiengine.IRemoteCreator;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Context f18678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static IRemoteCreator f18679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f18680c;
    private static com.huawei.hms.ads.uiengine.e d;
    private static final List<String> e;

    private static Integer c(Context context) {
        return Integer.valueOf(e.contains(context.getPackageName()) ? 2 : 1);
    }

    public static com.huawei.hms.ads.uiengine.e b() {
        return d;
    }

    private static Context b(Context context) {
        hw.b("RemoteSdkInitializer", "newRemoteContext: ");
        if (f18678a != null) {
            return f18678a;
        }
        try {
            if (com.huawei.openalliance.ad.utils.cr.a("com.huawei.hms.ads.common.inter.LoaderSpHandlerInter")) {
                DynamicModule.setSpHandler(fh.a(context));
            } else {
                hw.d("RemoteSdkInitializer", "LoaderSpHandler is not available");
            }
            if (com.huawei.openalliance.ad.utils.cr.a("com.huawei.hms.ads.common.inter.LoaderCommonInter")) {
                DynamicModule.setCommonInter(fg.a(context));
            } else {
                hw.d("RemoteSdkInitializer", "LoaderCommonHandler is not available");
            }
            f18678a = DynamicModule.load(context, c(context), "adsuiengine", "").getModuleContext();
        } catch (Throwable th) {
            hw.d("RemoteSdkInitializer", "newRemoteContext failed: " + th.getLocalizedMessage());
        }
        return f18678a;
    }

    public static String a() {
        String str;
        synchronized (e.class) {
            str = f18680c;
        }
        return str;
    }

    public static IRemoteCreator a(Context context) {
        synchronized (e.class) {
            hw.b("RemoteSdkInitializer", "newCreator: ");
            if (f18679b != null) {
                hw.b("RemoteSdkInitializer", "newCreator: mRemoteCreator != null return");
                return f18679b;
            }
            try {
                Context contextB = b(context);
                if (contextB == null) {
                    Log.i("RemoteSdkInitializer", "newCreator: remoteContext= null");
                    return null;
                }
                IRemoteCreator iRemoteCreatorA = IRemoteCreator.a.a((IBinder) contextB.getClassLoader().loadClass("com.huawei.hms.ads.uiengine.remote.RemoteCreator").newInstance());
                f18679b = iRemoteCreatorA;
                f18680c = iRemoteCreatorA.getVersion();
                f18679b.setGlobalUtil(com.huawei.openalliance.ad.inter.d.a(context));
                f18679b.setSdkInfo(com.huawei.openalliance.ad.utils.d.z(context).intValue(), 30484300, null);
                d = f18679b.getUiEngineUtil();
                Log.i("RemoteSdkInitializer", "newRemoteContext: mRemoteCreator :" + f18679b);
                return f18679b;
            } catch (Throwable th) {
                hw.d("RemoteSdkInitializer", "newCreator failed " + th.getLocalizedMessage());
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        e = arrayList;
        arrayList.add(Constants.HW_INTELLIEGNT_PACKAGE);
    }
}
