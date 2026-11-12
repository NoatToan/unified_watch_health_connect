package defpackage;

import com.huawei.ucd.helper.android.Medal3DLogApi;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes43.dex */
public class qid {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakReference<Medal3DLogApi> f46267a = null;
    private static boolean e = true;

    public static void e(String str, String str2) {
        WeakReference<Medal3DLogApi> weakReference = f46267a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        f46267a.get().medalLogShow("Medal3D_" + str, str2);
    }

    public static void b(WeakReference<Medal3DLogApi> weakReference) {
        f46267a = weakReference;
    }

    public static String a() {
        if (!e) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append(Thread.currentThread().getName());
            stringBuffer.append("-> ");
            stringBuffer.append(Thread.currentThread().getStackTrace()[3].getMethodName());
            stringBuffer.append("()");
            stringBuffer.append(" ");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return stringBuffer.toString();
    }
}
