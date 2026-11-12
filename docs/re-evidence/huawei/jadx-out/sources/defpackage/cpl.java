package defpackage;

import android.text.TextUtils;
import android.util.LruCache;
import com.google.common.base.Ascii;
import com.huawei.devicesdk.entity.DeviceInfo;
import health.compact.a.LogUtil;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
public class cpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f31239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<Byte> f31240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f31241c;
    private static LruCache<String, String> d;
    private static final Map<Integer, Byte> e;

    static {
        TreeSet treeSet = new TreeSet();
        f31240b = treeSet;
        e = new HashMap(16);
        f31239a = "**********".toCharArray();
        f31241c = "*********************************************************".toCharArray();
        d = new LruCache<>(3);
        treeSet.add((byte) 9);
        treeSet.add(Byte.valueOf(Ascii.FS));
        treeSet.add((byte) 40);
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(new int[]{2, 1});
        arrayList.add(new int[]{2, 3});
        arrayList.add(new int[]{2, 16});
        arrayList.add(new int[]{3, 1});
        arrayList.add(new int[]{46, 2});
        arrayList.add(new int[]{49, 2});
        arrayList.add(new int[]{49, 3});
        arrayList.add(new int[]{49, 4});
        arrayList.add(new int[]{49, 5});
        arrayList.add(new int[]{51, 1});
        arrayList.add(new int[]{51, 2});
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            e.put(Integer.valueOf(e((int[]) it.next())), (byte) 1);
        }
    }

    private static int a(byte[] bArr) {
        return bArr[1] | (bArr[0] << 8);
    }

    private static int e(int[] iArr) {
        return iArr[1] | (iArr[0] << 8);
    }

    public static String a(DeviceInfo deviceInfo) {
        if (cop.h()) {
            return "";
        }
        return e(deviceInfo);
    }

    public static String e(DeviceInfo deviceInfo) {
        return a(deviceInfo == null ? null : deviceInfo.getDeviceMac());
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder(" deviceUuid:");
        if (TextUtils.isEmpty(str)) {
            sb.append("");
        } else {
            sb.append(e(str));
        }
        return sb.toString();
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = d.get(str);
        if (str2 != null) {
            return str2;
        }
        int length = str.length();
        if (length <= 2) {
            return "**";
        }
        if (length <= 8) {
            return c(str, 1, (length / 3) - 1);
        }
        return c(str, 3, 4);
    }

    private static String c(String str, int i, int i2) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        sb.append(str.substring(0, i));
        int i3 = length - i2;
        int i4 = i3 - i;
        if (i4 == 10) {
            sb.append(f31239a);
        } else if (i4 == 57) {
            sb.append(f31241c);
        } else {
            for (int i5 = 0; i5 < i4; i5++) {
                sb.append('*');
            }
        }
        sb.append(str.substring(i3));
        String string = sb.toString();
        d.put(str, string);
        return string;
    }

    public static String d(byte[] bArr) {
        return b(bArr, false);
    }

    public static String b(byte[] bArr, boolean z) {
        if (!z && cop.h()) {
            return null;
        }
        if (bArr == null || bArr.length <= 2) {
            return cph.d(bArr);
        }
        if (bArr.length > 200 && f31240b.contains(Byte.valueOf(bArr[0]))) {
            byte[] bArr2 = new byte[200];
            System.arraycopy(bArr, 0, bArr2, 0, 200);
            return cph.d(bArr2);
        }
        if (e.get(Integer.valueOf(a(bArr))) != null) {
            return cph.d(c(bArr));
        }
        return cph.d(bArr);
    }

    private static byte[] c(byte[] bArr) {
        try {
            byte[] bArrA = lnh.a(16);
            byte[] bArrA2 = lnh.a(16);
            byte[] bArrA3 = lnh.a(1, bArr, bArrA, bArrA2);
            if (bArrA3 != null) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArrA3.length + 34);
                byteBufferAllocate.put(bArr[0]);
                byteBufferAllocate.put(bArr[1]);
                byteBufferAllocate.put(bArrA);
                byteBufferAllocate.put(bArrA2);
                byteBufferAllocate.put(bArrA3);
                return byteBufferAllocate.array();
            }
        } catch (NoSuchAlgorithmException e2) {
            LogUtil.d("LogContentUtil", "printEncryptHex : ", e2.getMessage());
        }
        return bArr;
    }

    public static void d(String str, byte[] bArr, Object... objArr) {
        if (cop.h()) {
            return;
        }
        LogUtil.b(str, a(objArr), cph.d(bArr));
    }

    public static void c(String str, byte[] bArr, Object... objArr) {
        if (cop.h()) {
            return;
        }
        LogUtil.e(str, a(objArr), cph.d(bArr));
    }

    public static void b(String str, byte[] bArr, Object... objArr) {
        if (cop.h() || cop.e()) {
            return;
        }
        LogUtil.c(str, a(objArr), cph.d(bArr));
    }

    private static StringBuilder a(Object... objArr) {
        StringBuilder sb = new StringBuilder(16);
        if (objArr != null) {
            for (Object obj : objArr) {
                sb.append(obj);
            }
        }
        return sb;
    }

    public static void e(String str, byte[] bArr, Object... objArr) {
        if (cop.h()) {
            return;
        }
        if (bArr == null || bArr.length < 16) {
            LogUtil.b(str, a(objArr), cph.d(bArr));
            return;
        }
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        LogUtil.b(str, a(objArr), cph.d(bArr2));
    }
}
