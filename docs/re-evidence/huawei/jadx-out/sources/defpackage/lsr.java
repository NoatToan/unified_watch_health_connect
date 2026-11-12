package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lsr {
    private static final byte[] d = new byte[0];

    private static boolean b(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        return str != null && str.equals(str2);
    }

    public static byte[] b(Parcelable parcelable, String str) {
        if (parcelable == null) {
            LogUtil.j("ParcelableUtil", "marshall, parcelable == null");
            return d;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeString(str);
        parcelObtain.writeString(parcelable.getClass().getName());
        parcelable.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall != null ? bArrMarshall : d;
    }

    public static <T> T a(byte[] bArr, Parcelable.Creator<T> creator, String str) {
        if (bArr == null || bArr.length == 0) {
            LogUtil.j("ParcelableUtil", "unmarshall, data is empty");
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                if (b(str, parcelObtain.readString())) {
                    String string = parcelObtain.readString();
                    T tCreateFromParcel = creator.createFromParcel(parcelObtain);
                    if (tCreateFromParcel != null && tCreateFromParcel.getClass().getName().equals(string)) {
                        parcelObtain.recycle();
                        return tCreateFromParcel;
                    }
                }
            } catch (Exception e) {
                LogUtil.j("ParcelableUtil", "unmarshall fail, e=", ExceptionUtils.c(e));
            }
            parcelObtain.recycle();
            LogUtil.j("ParcelableUtil", "unmarshall fail, version or name or data error");
            return null;
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public static byte[] a(Parcelable parcelable, String str) {
        return Base64.encode(b(parcelable, str), 0);
    }

    public static <T> T e(byte[] bArr, Parcelable.Creator<T> creator, String str) {
        if (bArr == null || bArr.length == 0) {
            LogUtil.j("ParcelableUtil", "unmarshallFromBase64, data is empty");
            return null;
        }
        try {
            return (T) a(Base64.decode(bArr, 0), creator, str);
        } catch (IllegalArgumentException e) {
            LogUtil.e("ParcelableUtil", "unmarshallFromBase64, ex=", ExceptionUtils.c(e));
            return null;
        }
    }

    public static String d(Parcelable parcelable, String str) {
        return new String(a(parcelable, str), StandardCharsets.UTF_8);
    }

    public static <T> T b(String str, Parcelable.Creator<T> creator, String str2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ParcelableUtil", "unmarshallFromBase64String, data is empty");
            return null;
        }
        return (T) e(str.getBytes(StandardCharsets.UTF_8), creator, str2);
    }

    public static byte[] d(List list, String str) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("ParcelableUtil", "marshallList, lists is empty");
            return d;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeString(str);
        parcelObtain.writeList(list);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall != null ? bArrMarshall : d;
    }

    public static void a(byte[] bArr, ClassLoader classLoader, String str, List list) {
        if (bArr == null || bArr.length == 0) {
            LogUtil.j("ParcelableUtil", "unmarshallList, data is empty");
            return;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                if (b(str, parcelObtain.readString())) {
                    parcelObtain.readList(list, classLoader);
                    parcelObtain.recycle();
                    return;
                }
            } catch (Exception e) {
                LogUtil.j("ParcelableUtil", "unmarshallList fail, e=", ExceptionUtils.c(e));
            }
            parcelObtain.recycle();
            LogUtil.j("ParcelableUtil", "unmarshallList fail, version or data error");
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    public static byte[] c(List list, String str) {
        return Base64.encode(d(list, str), 0);
    }

    public static void b(byte[] bArr, ClassLoader classLoader, String str, List list) {
        if (bArr == null || bArr.length == 0) {
            LogUtil.j("ParcelableUtil", "unmarshallListFormBase64, data is empty");
            return;
        }
        try {
            a(Base64.decode(bArr, 0), classLoader, str, list);
        } catch (IllegalArgumentException e) {
            LogUtil.e("ParcelableUtil", "unmarshallListFormBase64, ex=", ExceptionUtils.c(e));
        }
    }

    public static String e(List list, String str) {
        return new String(c(list, str), StandardCharsets.UTF_8);
    }

    public static void c(String str, ClassLoader classLoader, String str2, List list) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ParcelableUtil", "unmarshallListFromBase64String, data is empty");
        } else {
            b(str.getBytes(StandardCharsets.UTF_8), classLoader, str2, list);
        }
    }
}
