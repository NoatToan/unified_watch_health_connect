package defpackage;

import android.content.Context;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kyj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Context f39621a = BaseApplication.getContext();
    private kye e;

    private kyj() {
        this.e = new kye();
    }

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final kyj f39622c = new kyj();
    }

    public static kyj c() {
        return a.f39622c;
    }

    public List<Integer> c(int i) {
        return e(i);
    }

    private List<Integer> e(int i) {
        if (i <= 0) {
            LogUtil.j("Debug_StatClients", "getUserStatClients who <= 0 ");
            return null;
        }
        String strA = kyf.a("0", Integer.toString(i), "0");
        List<Integer> listD = this.e.d(strA);
        if (listD != null && !listD.isEmpty()) {
            return listD;
        }
        List<Integer> listF = kwt.b().f(i);
        if (listF == null || listF.isEmpty()) {
            LogUtil.j("Debug_StatClients", "getUserStatClients clients is null who = ", Integer.valueOf(i));
            return null;
        }
        this.e.d(strA, listF);
        return listF;
    }

    public void a(int i) {
        if (i <= 0) {
            return;
        }
        List<Integer> listF = kwt.b().f(i);
        if (listF == null || listF.isEmpty()) {
            LogUtil.j("Debug_StatClients", "setUserStatClients clients is null who = ", Integer.valueOf(i));
        } else {
            this.e.d(kyf.a("0", Integer.toString(i), "0"), listF);
        }
    }

    public List<Integer> c(int i, int i2) {
        return f(i, i2);
    }

    private List<Integer> f(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            LogUtil.j("Debug_StatClients", "getUserDeviceStatClients who <= 0 or deviceID <= 0");
            return null;
        }
        String strA = kyf.a("0", Integer.toString(i), Integer.toString(i2));
        List<Integer> listD = this.e.d(strA);
        if (listD != null && !listD.isEmpty()) {
            return listD;
        }
        List<Integer> listA = kwt.b().a(i, i2);
        if (listA == null || listA.isEmpty()) {
            LogUtil.j("Debug_StatClients", "getUserDeviceStatClients clients is null key = ", strA);
            return null;
        }
        this.e.d(strA, listA);
        return listA;
    }

    public List<Integer> a(int i, String str) {
        String strReplaceAll;
        if (str.indexOf("#ANDROID21") >= 0) {
            strReplaceAll = str.toUpperCase().replaceAll(":", "").replaceAll("#ANDROID21", "");
        } else {
            strReplaceAll = str + "#ANDROID21";
        }
        ArrayList arrayList = new ArrayList(10);
        List<Integer> listB = b(i, str);
        List<Integer> listB2 = b(i, strReplaceAll);
        if (listB != null) {
            arrayList.addAll(listB);
        }
        if (listB2 != null) {
            arrayList.addAll(listB2);
        }
        return arrayList;
    }

    private List<Integer> b(int i, String str) {
        if (i <= 0 || str == null) {
            LogUtil.j("Debug_StatClients", "getUserDeviceStatClients who <= 0 or deviceUUID = null");
            return null;
        }
        String strA = kyf.a("0", Integer.toString(i), str);
        List<Integer> listD = this.e.d(strA);
        if (listD != null && !listD.isEmpty()) {
            return listD;
        }
        int iC = kxi.c(f39621a, str);
        if (iC <= 0) {
            LogUtil.j("Debug_StatClients", "getUserDeviceStatClients deviceID <= 0 deviceUUID error");
            return null;
        }
        List<Integer> listC = c(i, iC);
        if (listC == null || listC.isEmpty()) {
            LogUtil.j("Debug_StatClients", "getUserDeviceStatClients clients is null key error ! who is ", Integer.valueOf(i), " deviceID is ", Integer.valueOf(iC));
            return null;
        }
        this.e.d(strA, listC);
        return listC;
    }

    public void b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            LogUtil.j("Debug_StatClients", "setUserDeviceStatClients who <= 0 or deviceID <= 0");
            return;
        }
        List<Integer> listA = kwt.b().a(i, i2);
        if (listA == null || listA.isEmpty()) {
            LogUtil.j("Debug_StatClients", "setUserDeviceStatClients clients is null who = ", Integer.valueOf(i), ",deviceID = ", Integer.valueOf(i2));
        } else {
            this.e.d(kyf.a("0", Integer.toString(i), Integer.toString(i2)), listA);
        }
    }

    public void c(int i, String str, List<Integer> list) {
        if (i <= 0 || str == null || list == null || list.isEmpty()) {
            LogUtil.e("Debug_StatClients", "Failed to setUserDeviceStatClients cause: userID=", Integer.valueOf(i), ", deviceUUID=", str, ", clientIs=" + HiJsonUtil.d(list));
            return;
        }
        this.e.d(kyf.a("0", Integer.toString(i), str), list);
        LogUtil.a("Debug_StatClients", "Success setUserDeviceStatClients ");
    }

    public List<Integer> e(int i, int i2) {
        return a(i, i2);
    }

    private List<Integer> a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            LogUtil.j("Debug_StatClients", "getUserAppStatClients who <= 0 or appID <= 0");
            return null;
        }
        String strA = kyf.a(Integer.toString(i), Integer.toString(i2), "0");
        List<Integer> listD = this.e.d(strA);
        if (listD != null && !listD.isEmpty()) {
            return listD;
        }
        List<Integer> listD2 = kwt.b().d(i2, i);
        if (listD2 == null || listD2.isEmpty()) {
            LogUtil.j("Debug_StatClients", "getUserAppStatClients clients is null key = ", strA);
            return null;
        }
        this.e.d(strA, listD2);
        return listD2;
    }

    public void d(int i, int i2) {
        if (i2 <= 0 || i <= 0) {
            LogUtil.j("Debug_StatClients", "setUserAppStatClients who <= 0 or appID <= 0");
            return;
        }
        List<Integer> listD = kwt.b().d(i2, i);
        if (listD == null || listD.isEmpty()) {
            LogUtil.j("Debug_StatClients", "setUserAppStatClients clients is null who = ", Integer.valueOf(i2), ",appID = ", Integer.valueOf(i));
        } else {
            this.e.d(kyf.a(Integer.toString(i), Integer.toString(i2), "0"), listD);
        }
    }

    public void b() {
        this.e.e();
    }
}
