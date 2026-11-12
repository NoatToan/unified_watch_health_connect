package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwidauth.datatype.SiteDefaultInfo;
import com.huawei.hwidauth.datatype.SiteListInfo;
import com.huawei.hwidauth.utils.globalcfg.CountryInfoForCFG;
import com.huawei.hwidauth.utils.globalcfg.SiteInfoForCFG;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public final class nnm {
    private static nnm e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SiteDefaultInfo f43322b = new SiteDefaultInfo();
    private ArrayList<String> d = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<SiteListInfo> f43323c = new ArrayList<>();

    private nnm() {
    }

    public static nnm c() {
        nnm nnmVar;
        synchronized (nnm.class) {
            if (e == null) {
                e = new nnm();
            }
            nnmVar = e;
        }
        return nnmVar;
    }

    private void j(Context context) {
        synchronized (this) {
            if (this.d.isEmpty()) {
                nox.b("SiteCountryDataManager", "inner update.", true);
                c(context);
            }
        }
    }

    public void c(final Context context) {
        boolean zAwait;
        synchronized (this) {
            nox.b("SiteCountryDataManager", "start countDownLatch innerInit", true);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            nny.e().execute(new Runnable() { // from class: nnm.3
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.CountDownLatch] */
                @Override // java.lang.Runnable
                public void run() {
                    String str = "finish thread innerInit";
                    nox.b("SiteCountryDataManager", "start thread innerInit", true);
                    try {
                        try {
                            nnm.this.d.clear();
                            nnm.this.f43323c.clear();
                            noz.e(context, nnm.this.f43322b, nnm.this.d, nnm.this.f43323c);
                        } catch (IOException e2) {
                            nox.a("SiteCountryDataManager", "IOException = " + e2.getClass().getSimpleName(), true);
                        } catch (XmlPullParserException e3) {
                            nox.a("SiteCountryDataManager", "XmlPullParserException = " + e3.getClass().getSimpleName(), true);
                        } catch (Exception e4) {
                            nox.a("SiteCountryDataManager", "Exception = " + e4.getClass().getSimpleName(), true);
                        }
                    } finally {
                        nox.a("SiteCountryDataManager", str, true);
                        countDownLatch.countDown();
                    }
                }
            });
            try {
                zAwait = countDownLatch.await(3L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                nox.a("SiteCountryDataManager", "InterruptedException", true);
                zAwait = false;
            }
            nox.b("SiteCountryDataManager", "end countDownLatch innerInit awaitValue:" + zAwait, true);
        }
    }

    public ArrayList<String> a(Context context) {
        ArrayList<String> arrayList;
        synchronized (this) {
            j(context);
            nox.b("SiteCountryDataManager", "get allow list from file.", true);
            arrayList = this.d;
        }
        return arrayList;
    }

    public ArrayList<String> d(Context context) {
        ArrayList<String> arrayListA = a(context);
        return arrayListA == null ? new ArrayList<>(0) : arrayListA;
    }

    public String e(Context context) {
        synchronized (this) {
            j(context);
            String strA = this.f43322b.a();
            nox.b("SiteCountryDataManager", "getLogOutUrl::=" + strA, false);
            if (TextUtils.isEmpty(strA)) {
                return "";
            }
            return "https://" + strA + "/logout";
        }
    }

    public String b(Context context) {
        synchronized (this) {
            j(context);
        }
        return "/AMW/mobile/delUser.html";
    }

    public String i(Context context) {
        synchronized (this) {
            j(context);
        }
        return "/AMW/mobile/appealSelf/bindNewFinish.html";
    }

    public String h(Context context) {
        synchronized (this) {
            j(context);
            String strB = this.f43322b.b();
            nox.b("SiteCountryDataManager", "getQrAuthUrl::=" + strB, false);
            if (TextUtils.isEmpty(strB)) {
                return "";
            }
            return "https://" + strB + "/CAS/mobile/loginHmsSuccess.html";
        }
    }

    public String c(Context context, int i) {
        String str;
        synchronized (this) {
            str = "https://" + b(context, i);
        }
        return str;
    }

    private String b(Context context, int i) {
        String strC;
        synchronized (this) {
            j(context);
            strC = "";
            if (i > 0) {
                for (SiteListInfo siteListInfo : this.f43323c) {
                    if (siteListInfo.a() == i) {
                        strC = siteListInfo.b();
                        nox.b("SiteCountryDataManager", "find the site id " + i, true);
                        break;
                    }
                }
                if (TextUtils.isEmpty(strC)) {
                    strC = "";
                    nou.d(context);
                }
            } else if (TextUtils.isEmpty("")) {
                strC = this.f43322b.c();
            }
        }
        return strC;
    }

    private CountryInfoForCFG a(String str, List<CountryInfoForCFG> list) {
        CountryInfoForCFG next;
        synchronized (this) {
            Iterator<CountryInfoForCFG> it = list.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (str.equalsIgnoreCase(next.b())) {
                }
            }
            next = null;
        }
        return next;
    }

    private SiteInfoForCFG b(String str, List<SiteInfoForCFG> list) {
        SiteInfoForCFG next;
        synchronized (this) {
            Iterator<SiteInfoForCFG> it = list.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (str.equals(next.a())) {
                }
            }
            next = null;
        }
        return next;
    }

    private CountryInfoForCFG c(String str, List<CountryInfoForCFG> list) {
        CountryInfoForCFG next;
        synchronized (this) {
            Iterator<CountryInfoForCFG> it = list.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (str.equalsIgnoreCase(next.c())) {
                }
            }
            next = null;
        }
        return next;
    }

    private String d(Context context, String str, String str2, List<CountryInfoForCFG> list, List<SiteInfoForCFG> list2, boolean z) {
        synchronized (this) {
            SiteInfoForCFG siteInfoForCFGB = b(str2, list2);
            if (siteInfoForCFGB == null) {
                nox.a("SiteCountryDataManager", "not found the site info by site", true);
                return "";
            }
            if ("1".equals(siteInfoForCFGB.b())) {
                return str;
            }
            if (!z) {
                return "";
            }
            return e(context, str, list, list2);
        }
    }

    private List<CountryInfoForCFG> d(List<CountryInfoForCFG> list, List<CountryInfoForCFG> list2) {
        ArrayList arrayList = new ArrayList();
        for (CountryInfoForCFG countryInfoForCFG : list) {
            Iterator<CountryInfoForCFG> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    CountryInfoForCFG next = it.next();
                    if (!TextUtils.isEmpty(countryInfoForCFG.b()) && countryInfoForCFG.b().equals(next.b())) {
                        arrayList.add(next);
                        break;
                    }
                } else {
                    arrayList.add(countryInfoForCFG);
                    break;
                }
            }
        }
        return arrayList;
    }

    private String b(Context context, String str, List<CountryInfoForCFG> list, List<SiteInfoForCFG> list2) {
        String strE = nol.d().e(context);
        if (nnq.b().c() && !TextUtils.isEmpty(nnq.b().d())) {
            strE = nnq.b().d();
        }
        nox.c("SiteCountryDataManager", "sim card root MCC is " + strE, false);
        CountryInfoForCFG countryInfoForCFGC = c(strE, list);
        if (countryInfoForCFGC == null) {
            nox.a("SiteCountryDataManager", "not found the country by mcc:", true);
            return "";
        }
        String strD = countryInfoForCFGC.d();
        if ("1".equals(strD)) {
            return countryInfoForCFGC.b();
        }
        if (!TextUtils.isEmpty(strD)) {
            return "";
        }
        return d(context, countryInfoForCFGC.b(), countryInfoForCFGC.a(), list, list2, false);
    }

    private String e(Context context, String str, List<CountryInfoForCFG> list, List<SiteInfoForCFG> list2) {
        String strE = nol.d().e(context);
        if (nnq.b().c() && !TextUtils.isEmpty(nnq.b().d())) {
            strE = nnq.b().d();
        }
        nox.c("SiteCountryDataManager", "sim card root MCC is " + strE, false);
        CountryInfoForCFG countryInfoForCFGC = c(strE, list);
        if (countryInfoForCFGC == null) {
            nox.a("SiteCountryDataManager", "not found the country by mcc:" + str, false);
            return "";
        }
        String strD = countryInfoForCFGC.d();
        if ("1".equals(strD)) {
            return countryInfoForCFGC.b();
        }
        if (!TextUtils.isEmpty(strD)) {
            return "";
        }
        return d(context, countryInfoForCFGC.b(), countryInfoForCFGC.a(), list, list2, false);
    }

    public String g(Context context) {
        synchronized (this) {
            try {
                String strB = nom.b(context);
                if (nnq.b().c() && !TextUtils.isEmpty(nnq.b().e())) {
                    strB = nnq.b().e();
                }
                String str = strB;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                noq.a().c(context, arrayList, arrayList2, arrayList3);
                List<CountryInfoForCFG> listD = d(arrayList, arrayList2);
                CountryInfoForCFG countryInfoForCFGA = a(str, listD);
                if (countryInfoForCFGA == null) {
                    return b(context, str, listD, arrayList3);
                }
                String strD = countryInfoForCFGA.d();
                if ("1".equals(strD)) {
                    return str;
                }
                if (TextUtils.isEmpty(strD)) {
                    return d(context, str, countryInfoForCFGA.a(), listD, arrayList3, true);
                }
                return e(context, str, listD, arrayList3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
