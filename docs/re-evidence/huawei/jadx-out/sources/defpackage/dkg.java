package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes26.dex */
public class dkg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f31845a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static dkg f31846b;
    private edm e = null;
    private List<edv> d = new ArrayList();

    private dkg() {
    }

    public static dkg d() {
        dkg dkgVar;
        synchronized (f31845a) {
            if (f31846b == null) {
                f31846b = new dkg();
            }
            dkgVar = f31846b;
        }
        return dkgVar;
    }

    public List<eds> e() {
        edm edmVarC = c();
        ArrayList arrayList = new ArrayList(16);
        if (edmVarC == null) {
            LogUtil.j("DeviceIndexAllInfoManager", "getAllDeviceList mIndexAllBean is null");
            return arrayList;
        }
        List<edq> listE = edmVarC.e();
        if (listE != null && !listE.isEmpty()) {
            c(listE, arrayList);
        }
        return arrayList;
    }

    private void c(List<edq> list, List<eds> list2) {
        if (list == null) {
            LogUtil.j("DeviceIndexAllInfoManager", "kindBeans is null");
            return;
        }
        Iterator<edq> it = list.iterator();
        while (it.hasNext()) {
            List<eds> listA = it.next().a();
            if (listA == null) {
                LogUtil.j("DeviceIndexAllInfoManager", "deviceSingleSeriesInfoBeans is null");
            } else {
                list2.addAll(listA);
            }
        }
    }

    public void a() {
        File file = new File(eek.a());
        boolean zExists = file.exists();
        LogUtil.a("DeviceIndexAllInfoManager", "updateIndexCacheForWear isExistThisIndex is = ", Boolean.valueOf(zExists));
        if (zExists) {
            b(dla.e(file));
        } else {
            this.e = null;
        }
    }

    public edm c() {
        if (this.e == null) {
            a();
        }
        edm edmVar = this.e;
        if (edmVar != null) {
            LogUtil.a("DeviceIndexAllInfoManager", "mIndexAllBean, version: ", edmVar.f());
            f();
        }
        return this.e;
    }

    private void b(String str) {
        String strF;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceIndexAllInfoManager", "parseVersionIndexFile indexJson is null");
            return;
        }
        try {
            edm edmVar = this.e;
            if (edmVar == null) {
                strF = "";
            } else {
                strF = edmVar.f();
            }
            if (TextUtils.isEmpty(strF)) {
                this.e = dkx.c(str);
                f();
            } else {
                if (strF.equals(new JSONObject(str).optString("version"))) {
                    return;
                }
                this.e = dkx.c(str);
                f();
            }
        } catch (JSONException unused) {
            LogUtil.e("DeviceIndexAllInfoManager", "parseVersionIndexFile JSONException");
        }
    }

    private void f() {
        boolean zE;
        edm edmVar = this.e;
        boolean zE2 = false;
        if (edmVar != null) {
            zE = e("img_index_all", edmVar.a());
            LogUtil.a("DeviceIndexAllInfoManager", "isImageZip: ", Boolean.valueOf(zE));
        } else {
            zE = false;
        }
        edm edmVar2 = this.e;
        if (edmVar2 != null) {
            zE2 = e("lang_index_all", edmVar2.b());
            LogUtil.a("DeviceIndexAllInfoManager", "isLangZip: ", Boolean.valueOf(zE2));
        }
        if (!zE || !zE2) {
            this.e = null;
        }
        if (h()) {
            return;
        }
        LogUtil.a("DeviceIndexAllInfoManager", "done file is not exist");
        this.e = null;
    }

    private boolean h() {
        return new File(eek.e()).exists();
    }

    private boolean e(String str, String str2) {
        synchronized (this) {
            File file = new File(eek.d(str) + str2 + File.separator);
            if (!file.exists() || !file.isDirectory()) {
                return false;
            }
            String[] list = file.list();
            return (list == null || list.length == 0) ? false : true;
        }
    }

    public List<eds> a(String str) {
        List<String> listD;
        ArrayList arrayList = new ArrayList(16);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceIndexAllInfoManager", "getDeviceInfoByBluetooth, bluetooth is empty");
            return arrayList;
        }
        List<eds> listE = e();
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        for (eds edsVar : listE) {
            if (edsVar != null) {
                String strE = edsVar.e();
                if (!TextUtils.isEmpty(strE) && (listD = edsVar.d()) != null && !listD.isEmpty()) {
                    for (String str2 : listD) {
                        if (!TextUtils.isEmpty(str2) && b(strE, lowerCase, str2.toLowerCase(Locale.ENGLISH))) {
                            arrayList.add(edsVar);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074 A[RETURN] */
    private boolean b(String str, String str2, String str3) {
        byte b2;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            str.hashCode();
            switch (str) {
                case "PREFIX":
                    b2 = 0;
                    break;
                case "SUFFIX":
                    b2 = 1;
                    break;
                case "EMPTY":
                    b2 = 2;
                    break;
                case "EXACT":
                    b2 = 3;
                    break;
                case "CONTAIN":
                    b2 = 4;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 == 2) {
                        if (str2.contains(str3)) {
                            return true;
                        }
                    } else if (b2 != 3) {
                        if (b2 == 4) {
                            if (str2.contains(str3)) {
                                return true;
                            }
                        }
                    } else if (Objects.equals(str2, str3)) {
                        return true;
                    }
                } else if (str2.endsWith(str3)) {
                    return true;
                }
            } else if (str2.startsWith(str3)) {
                return true;
            }
        }
        return false;
    }

    public void c(String str) {
        synchronized (this) {
            try {
                JSONArray jSONArray = new JSONObject(str).getJSONArray("device_info");
                if (jSONArray != null) {
                    List listC = peh.c(jSONArray.toString(), edv[].class);
                    if (!njy.e(listC)) {
                        this.d.clear();
                        this.d.addAll(listC);
                    }
                }
                if (!this.d.isEmpty()) {
                    edg.c();
                }
            } catch (JSONException unused) {
                LogUtil.j("DeviceIndexAllInfoManager", "readFileToData, JSONException");
            }
        }
    }

    private void j() {
        File file = new File(eek.a());
        boolean zExists = file.exists();
        LogUtil.a("DeviceIndexAllInfoManager", "updateIndexCacheForWear isExistThisIndex is = ", Boolean.valueOf(zExists));
        if (zExists) {
            c(dla.e(file));
        } else {
            dkr.d().e();
        }
    }

    public List<edv> b() {
        ArrayList arrayList;
        synchronized (this) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (this.d.isEmpty()) {
                LogUtil.j("DeviceIndexAllInfoManager", "mDeviceUuids is empty");
                j();
            }
            linkedHashSet.addAll(this.d);
            arrayList = new ArrayList();
            arrayList.addAll(linkedHashSet);
            LogUtil.d("DeviceIndexAllInfoManager", "list size: ", Integer.valueOf(arrayList.size()));
        }
        return arrayList;
    }
}
