package defpackage;

import android.content.Context;
import com.huawei.haf.threadpool.ThreadPoolManager;
import health.compact.a.LogUtil;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes20.dex */
public class xik {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f53051b = "";

    public static String e() {
        SecureRandom secureRandomI = i();
        if (secureRandomI != null) {
            int[] iArr = new int[3];
            StringBuilder sb = new StringBuilder(16);
            for (int i = 0; i < 3; i++) {
                int iNextInt = secureRandomI.nextInt(10);
                iArr[i] = iNextInt;
                sb.append(iNextInt);
            }
            LogUtil.e("WifiP2pTransferUtil", "getNetWorkName randomNetworkName is: ", sb.toString());
            return "DIRECT-" + sb.toString();
        }
        return "";
    }

    private static SecureRandom i() {
        try {
            return SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException e) {
            LogUtil.d("WifiP2pTransferUtil", "getRandom exception : ", cpc.c(e));
            return null;
        }
    }

    public static String b() {
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(Character.valueOf(c()));
        arrayList.add(Character.valueOf(h()));
        arrayList.add(Character.valueOf(d()));
        arrayList.add(Character.valueOf(j()));
        SecureRandom secureRandomI = i();
        if (secureRandomI != null) {
            for (int i = 4; i < 8; i++) {
                arrayList.add(Character.valueOf(a(secureRandomI.nextInt(4))));
            }
            Collections.shuffle(arrayList);
            StringBuilder sb = new StringBuilder(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append((Character) it.next());
            }
            return sb.toString();
        }
        return "";
    }

    private static char e(String str) {
        SecureRandom secureRandomI = i();
        if (secureRandomI != null) {
            return str.charAt(secureRandomI.nextInt(str.length()));
        }
        return str.charAt(0);
    }

    private static char c() {
        return e("abcdefghijklmnopqrstuvwxyz");
    }

    private static char h() {
        return Character.toUpperCase(c());
    }

    private static char d() {
        return e("0123456789");
    }

    private static char j() {
        return e("~!@#$%^&*()_+/-=[]{};:'<>?.");
    }

    private static char a(int i) {
        if (i == 0) {
            return c();
        }
        if (i == 1) {
            return h();
        }
        if (i == 2) {
            return d();
        }
        return j();
    }

    public static cqb a(byte[] bArr) {
        String strD = cph.d(bArr);
        if (strD == null) {
            LogUtil.e("WifiP2pTransferUtil", "parseDataToTlvFormat dataStrInfo is null");
            return null;
        }
        try {
            return new cqe().a(strD.substring(6));
        } catch (cpy unused) {
            LogUtil.b("WifiP2pTransferUtil", "tlv resolve exception.");
            return null;
        }
    }

    public static int a() {
        return cop.b() ? 0 : 1;
    }

    public static String b(final Context context) {
        if (context == null) {
            LogUtil.e("WifiP2pTransferUtil", "error, context is null. please check.");
            return f53051b;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            ThreadPoolManager.c().execute(new Runnable() { // from class: xik.1
                @Override // java.lang.Runnable
                public void run() {
                    String unused = xik.f53051b = xgx.d().getCommonCountryCode(context);
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await();
            LogUtil.b("WifiP2pTransferUtil", "getCountryCode is: ", f53051b);
        } catch (InterruptedException e) {
            LogUtil.b("WifiP2pTransferUtil", "getCountryCode exception: ", cpc.c(e));
        }
        return f53051b;
    }
}
