package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginmgr.hwwear.bean.DeviceFittingsBean;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class piq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f45450a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static piq f45451c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private piw f45452b = null;
    private List<pjc> d = new CopyOnWriteArrayList();

    private piq() {
    }

    public static piq e() {
        piq piqVar;
        synchronized (f45450a) {
            if (f45451c == null) {
                f45451c = new piq();
            }
            piqVar = f45451c;
        }
        return piqVar;
    }

    public List<pjc> d() {
        this.f45452b = a();
        this.d.clear();
        piw piwVar = this.f45452b;
        if (piwVar == null) {
            LogUtil.e("DevicePluginInfoManager", "getAllDeviceList mIndexAllBean is null.");
            return new ArrayList(0);
        }
        List<piv> listC = piwVar.c();
        if (listC != null && !listC.isEmpty()) {
            this.d.addAll(d(listC));
        }
        return new ArrayList(this.d);
    }

    private List<pjc> d(List<piv> list) {
        ArrayList arrayList = new ArrayList(16);
        if (list == null) {
            LogUtil.j("DevicePluginInfoManager", "kindBeans is null");
            return arrayList;
        }
        for (piv pivVar : list) {
            List<pjc> listC = pivVar.c();
            if (njy.e(listC)) {
                LogUtil.j("DevicePluginInfoManager", "devicePluginInfoBeans is null");
            } else {
                for (pjc pjcVar : listC) {
                    if (pjcVar == null) {
                        LogUtil.j("DevicePluginInfoManager", pivVar.a(), " devicePluginInfoBean is null");
                    } else {
                        arrayList.add(pjcVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public boolean a(String str) {
        if (njy.e(this.d)) {
            LogUtil.j("DevicePluginInfoManager", "isIntelligentDevice mAllDeviceList is null, reload deviceList");
            this.d = d();
        }
        ArrayList<pjc> arrayList = new ArrayList(16);
        arrayList.addAll(this.d);
        if (njy.e(arrayList)) {
            LogUtil.j("DevicePluginInfoManager", "isIntelligentDevice allList is empty");
            return false;
        }
        for (pjc pjcVar : arrayList) {
            if (pjcVar != null && !njy.e(pjcVar.s()) && b(pjcVar) && str.equals(pjcVar.s().get(0))) {
                return true;
            }
        }
        return false;
    }

    public boolean b(pjc pjcVar) {
        return pjcVar != null && pjcVar.j() == 1;
    }

    public void c() {
        File file = new File(pir.d());
        boolean zExists = file.exists();
        LogUtil.a("DevicePluginInfoManager", "updateIndexCacheForWear isExistThisIndex is = ", Boolean.valueOf(zExists));
        if (zExists) {
            e(pia.a(file));
        } else {
            this.f45452b = null;
        }
    }

    private piw a() {
        if (this.f45452b == null) {
            c();
        }
        piw piwVar = this.f45452b;
        if (piwVar != null) {
            LogUtil.a("DevicePluginInfoManager", "mIndexAllBean, version: ", piwVar.e());
            j();
        }
        return this.f45452b;
    }

    private void e(String str) {
        String strE;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DevicePluginInfoManager", "parseVersionIndexFile indexJson is null");
            return;
        }
        try {
            piw piwVar = this.f45452b;
            if (piwVar == null) {
                strE = "";
            } else {
                strE = piwVar.e();
            }
            if (TextUtils.isEmpty(strE)) {
                this.f45452b = piz.e(str);
                j();
            } else {
                if (strE.equals(new JSONObject(str).optString("version"))) {
                    return;
                }
                this.f45452b = piz.e(str);
                j();
            }
        } catch (JSONException unused) {
            LogUtil.e("DevicePluginInfoManager", "parseVersionIndexFile JSONException");
        }
    }

    private void j() {
        piw piwVar = this.f45452b;
        boolean zB = piwVar != null ? b("img_index_all", piwVar.d()) : false;
        piw piwVar2 = this.f45452b;
        boolean zB2 = piwVar2 != null ? b("lang_index_all", piwVar2.b()) : false;
        if (!zB || !zB2) {
            this.f45452b = null;
        }
        if (!b()) {
            this.f45452b = null;
        }
        LogUtil.a("DevicePluginInfoManager", "setEmptyIndex mIndexAllBean: ", Boolean.valueOf(this.f45452b == null), ", isImageZip: ", Boolean.valueOf(zB), ", isLangZip: ", Boolean.valueOf(zB2));
    }

    private boolean b() {
        return new File(pir.c()).exists();
    }

    private boolean b(String str, String str2) {
        String[] list;
        File file = new File(pir.c(str) + str2 + File.separator);
        return file.exists() && file.isDirectory() && (list = file.list()) != null && list.length != 0;
    }

    public List<pjc> c(String str) {
        List<String> listS;
        ArrayList arrayList = new ArrayList(16);
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DevicePluginInfoManager", "getDeviceInfoByUuid, uuid is empty");
            return arrayList;
        }
        ArrayList<pjc> arrayList2 = new ArrayList(16);
        if (njy.e(this.d)) {
            LogUtil.j("DevicePluginInfoManager", "isIntelligentDevice  mAllDeviceList is null, reload deviceList");
            this.d = d();
        }
        arrayList2.addAll(this.d);
        if (njy.e(arrayList2)) {
            LogUtil.e("DevicePluginInfoManager", "getDeviceInfoByUuid allList is empty");
            return arrayList;
        }
        for (pjc pjcVar : arrayList2) {
            if (pjcVar != null && (listS = pjcVar.s()) != null && !listS.isEmpty() && listS.contains(str)) {
                arrayList.add(pjcVar);
            }
        }
        return arrayList;
    }

    public List<DeviceFittingsBean> a(String str, String str2) {
        ArrayList arrayList = new ArrayList(16);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("DevicePluginInfoManager", "getFittingDeviceInfoByBluetoothName, hostProductId or bluetooth is empty");
            return arrayList;
        }
        List<pjc> listC = c(str);
        if (!njy.e(listC)) {
            pjc pjcVar = listC.get(0);
            String lowerCase = str2.toLowerCase(Locale.ENGLISH);
            if (pjcVar != null) {
                List<String> listS = pjcVar.s();
                if (!njy.e(listS) && listS.contains(str)) {
                    List<DeviceFittingsBean> listE = pjcVar.e();
                    if (!njy.e(listE)) {
                        for (DeviceFittingsBean deviceFittingsBean : listE) {
                            if (deviceFittingsBean != null) {
                                String bluetoothMatch = deviceFittingsBean.getBluetoothMatch();
                                if (!TextUtils.isEmpty(bluetoothMatch)) {
                                    List<String> bluetoothNameList = deviceFittingsBean.getBluetoothNameList();
                                    if (!njy.e(bluetoothNameList)) {
                                        for (String str3 : bluetoothNameList) {
                                            if (!TextUtils.isEmpty(str3) && d(bluetoothMatch, lowerCase, str3.toLowerCase(Locale.ENGLISH))) {
                                                arrayList.add(deviceFittingsBean);
                                            }
                                        }
                                    }
                                }
                            }
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
    private boolean d(String str, String str2, String str3) {
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
}
