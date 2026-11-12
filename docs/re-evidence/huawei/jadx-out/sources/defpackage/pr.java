package defpackage;

import android.os.Process;
import androidx.core.internal.view.SupportMenu;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes4.dex */
public class pr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Hashtable<String, int[]> f45850a = new Hashtable<>();
    private static short d;

    public static void d(String str) {
        synchronized (pr.class) {
            try {
                if (str == null) {
                    po.e.e("SenderIdManager", "registerSender, param == null");
                } else {
                    f45850a.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(String str) {
        synchronized (pr.class) {
            try {
                if (str == null) {
                    po.e.e("SenderIdManager", "registerSender, param == null");
                    return;
                }
                int iMyPid = Process.myPid();
                po.e.d("SenderIdManager", "registerSender groupId:" + ((int) d));
                short s = (short) (d + 1);
                d = s;
                short sAbs = (short) (Math.abs((int) s) % 32767);
                d = sAbs;
                int[] iArr = {iMyPid, sAbs << 16};
                po.e.d("SenderIdManager", "registerSender, tidAndTime:" + str + " senderId:" + iArr[0] + "," + iArr[1]);
                f45850a.put(str, iArr);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int[] a(String str) {
        synchronized (pr.class) {
            try {
                if (str == null) {
                    po.e.e("SenderIdManager", "getSenderId, param == null");
                    return null;
                }
                int[] iArr = f45850a.get(str);
                if (iArr == null || 2 != iArr.length) {
                    po.e.e("SenderIdManager", "getSenderId, param: " + str + " fail!");
                    return null;
                }
                iArr[1] = ((short) (Math.abs((int) ((short) (((short) (iArr[1] & 65535)) + 1))) % 32767)) | (iArr[1] & SupportMenu.CATEGORY_MASK);
                po.e.d("SenderIdManager", "getSenderId, tidAndTime:" + str + " pid:" + iArr[0] + ", gid:" + (iArr[1] & SupportMenu.CATEGORY_MASK) + ", seq:" + (iArr[1] & 65535));
                return iArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
