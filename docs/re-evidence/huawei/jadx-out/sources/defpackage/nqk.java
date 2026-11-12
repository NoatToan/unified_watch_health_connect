package defpackage;

import android.text.TextUtils;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.ReflectionUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class nqk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f43453a = "name";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f43454b = "aggregateType";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f43455c = "is_meta";
    public static String d = "id";
    public static String e = "meta_key";
    public static String f = "samplePointDataType";
    public static String g = "typeId";
    public static String h = "point_name";
    public static String i = "sampleSequenceDataType";
    public static String j = "sampleStatDataType";
    private static String n = "HiHealthProcess_RequestUtils";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    public static void d(nrg nrgVar, String str, String str2, HiHealthData hiHealthData) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "avg":
                b2 = 0;
                break;
            case "max":
                b2 = 1;
                break;
            case "min":
                b2 = 2;
                break;
            case "sum":
                b2 = 3;
                break;
            case "count":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            nrgVar.a(hiHealthData.get(str2));
            return;
        }
        if (b2 == 1) {
            nrgVar.e(hiHealthData.get(str2));
            return;
        }
        if (b2 == 2) {
            nrgVar.c(hiHealthData.get(str2));
        } else if (b2 == 3) {
            nrgVar.b(hiHealthData.get(str2));
        } else {
            if (b2 != 4) {
                return;
            }
            nrgVar.d(hiHealthData.get(str2));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    public static int e(String str) {
        byte b2;
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "sd":
                b2 = 0;
                break;
            case "avg":
                b2 = 1;
                break;
            case "max":
                b2 = 2;
                break;
            case "min":
                b2 = 3;
                break;
            case "sum":
                b2 = 4;
                break;
            case "count":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return 7;
        }
        if (b2 == 1) {
            return 3;
        }
        if (b2 == 2) {
            return 4;
        }
        if (b2 == 3) {
            return 5;
        }
        if (b2 != 4) {
            return b2 != 5 ? 0 : 2;
        }
        return 1;
    }

    public static nrh e(ArrayList<nrh> arrayList, HiHealthData hiHealthData) {
        for (nrh nrhVar : arrayList) {
            if (nrhVar.f() == hiHealthData.getStartTime() && nrhVar.g() == hiHealthData.getEndTime()) {
                return nrhVar;
            }
        }
        return null;
    }

    public static nrh d(ArrayList<nrh> arrayList, HiHealthData hiHealthData) {
        for (nrh nrhVar : arrayList) {
            if (nrhVar.f() == hiHealthData.getStartTime() && nrhVar.g() == hiHealthData.getEndTime() && hiHealthData.getString("device_uniquecode").equals(nrhVar.a())) {
                return nrhVar;
            }
        }
        return null;
    }

    public static nrh a(ArrayList<nrh> arrayList, HiHealthData hiHealthData, int i2, int i3) {
        for (nrh nrhVar : arrayList) {
            if (e(nrhVar, hiHealthData, i2) && nrhVar.d().getmId() == i3) {
                return nrhVar;
            }
        }
        return null;
    }

    private static boolean e(nrh nrhVar, HiHealthData hiHealthData, int i2) {
        switch (i2) {
            case 1:
                return lsl.h(nrhVar.f(), hiHealthData.getStartTime());
            case 2:
                return lsl.d(nrhVar.f(), hiHealthData.getStartTime());
            case 3:
                return lsl.c(nrhVar.f(), hiHealthData.getStartTime());
            case 4:
                return lsl.g(nrhVar.f(), hiHealthData.getStartTime());
            case 5:
                return lsl.f(nrhVar.f(), hiHealthData.getStartTime());
            case 6:
                return lsl.i(nrhVar.f(), hiHealthData.getStartTime());
            case 7:
                return true;
            default:
                return false;
        }
    }

    public static void b(List<? extends nrm> list, final int i2) {
        Collections.sort(list, new Comparator() { // from class: nqn
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return nqk.e(i2, (nrm) obj, (nrm) obj2);
            }
        });
    }

    static /* synthetic */ int e(int i2, nrm nrmVar, nrm nrmVar2) {
        if (i2 == 1) {
            return nrmVar2.f() >= nrmVar.f() ? 1 : -1;
        }
        return nrmVar2.f() > nrmVar.f() ? -1 : 1;
    }

    public static void b(String str, Object[] objArr) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LogUtil.a(n, "current type need extra process, method name is ", str, " args is ", objArr);
        String[] strArrSplit = str.split("#");
        int length = strArrSplit.length;
        if (length != 2) {
            LogUtil.e(n, "extra process method format wrong, current length is ", Integer.valueOf(length));
        } else {
            d(strArrSplit[0], strArrSplit[1], objArr);
        }
    }

    private static void d(String str, String str2, Object[] objArr) {
        try {
            ReflectionUtils.e(ReflectionUtils.e(str), str2, (Class<?>[]) new Class[]{Object[].class}).invoke(null, objArr);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            LogUtil.j(n, "reflect reflectExtralProcessMethod fail");
        }
    }
}
