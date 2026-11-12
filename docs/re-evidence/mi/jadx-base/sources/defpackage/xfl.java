package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.wearable.yrn.export.YRNPushHandler;
import com.xiaomi.wearable.yrn.export.YRNPushHandlerExtKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class xfl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile xfl f39075b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<wfl> f39076a = new ArrayList<>();

    public xfl() {
        d(new dwg());
    }

    public static xfl a() {
        if (f39075b == null) {
            synchronized (xfl.class) {
                try {
                    if (f39075b == null) {
                        f39075b = new xfl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f39075b;
    }

    public static void b(Context context, String str) {
        Uri uri;
        wfl wflVarC;
        if (TextUtils.isEmpty(str)) {
            uri = null;
            wflVarC = null;
        } else {
            uri = Uri.parse(str);
            if (YRNPushHandlerExtKt.isVirtualPage(uri)) {
                Logger.i("SchemaManager", "push isVirtualPage:" + uri);
                YRNPushHandlerExtKt.getInstance(YRNPushHandler.INSTANCE).handleNotificationClick(uri);
                wflVarC = null;
            } else {
                Logger.i("SchemaManager", "push not VirtualPage:" + uri);
                wflVarC = a().c(uri);
            }
        }
        if (uri == null || wflVarC == null) {
            return;
        }
        wflVarC.process(context, uri, null);
    }

    public wfl c(Uri uri) {
        synchronized (this.f39076a) {
            try {
                Logger.i("SchemaManager", "queryHandler uri=" + uri);
                for (wfl wflVar : this.f39076a) {
                    Logger.i("SchemaManager", "handler className=" + wflVar.getClass());
                    if (wflVar.canHandle(uri)) {
                        Logger.i("SchemaManager", "handler className= " + wflVar.getClass() + " canHandle true");
                        return wflVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(wfl wflVar) {
        synchronized (this.f39076a) {
            this.f39076a.add(wflVar);
        }
    }
}
