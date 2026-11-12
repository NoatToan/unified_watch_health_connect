package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.model.DeviceInformation;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hms.framework.common.PackageUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class nye {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<ProductMapInfo> f43940b;
    private Context d;

    private nye(Context context) {
        this.d = context;
    }

    public static nye d(Context context) {
        return new nye(context);
    }

    public void d() {
        ArrayList<ProductMapInfo> arrayListE = ProductMap.e();
        this.f43940b = arrayListE;
        if (arrayListE.isEmpty()) {
            LogUtil.a("SportBiReportController", "sport products is empty, start load product map.");
            ThreadPoolManager.c().execute(new Runnable() { // from class: nye.3
                @Override // java.lang.Runnable
                public void run() {
                    if (!lql.b(nye.this.d, 2)) {
                        LogUtil.a("SportBiReportController", "updateProductMapConfig failed");
                        return;
                    }
                    nye.this.f43940b = ProductMap.e();
                    LogUtil.a("SportBiReportController", "load product map success. sport product size is ", Integer.valueOf(nye.this.f43940b.size()));
                }
            });
        } else {
            LogUtil.a("SportBiReportController", "get product map success. sport product size is ", Integer.valueOf(this.f43940b.size()));
        }
    }

    public void a(DeviceInformation deviceInformation, String str) {
        if (deviceInformation == null) {
            LogUtil.a("SportBiReportController", "device information is null in reportDeviceInfo method.");
            return;
        }
        ProductMapInfo productMapInfoD = d(deviceInformation.getModelString(), deviceInformation.getDeviceType());
        if (productMapInfoD != null) {
            b(productMapInfoD, str);
        } else {
            b(e(), str);
        }
    }

    public void b(String str) {
        enm.b(str, 0);
    }

    private ProductMapInfo e() {
        return new ProductMapInfo("08F", "2BYB", "41e57179-c0c1-49d1-9ea6-c317689ffda8", "A5H", "252", null, 309);
    }

    public ProductMapInfo d(String str, int i) {
        ArrayList<ProductMapInfo> arrayList = this.f43940b;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        String strC = nzc.c(i);
        ArrayList arrayList2 = new ArrayList();
        String upperCase = TextUtils.isEmpty(str) ? "" : str.toUpperCase(Locale.ENGLISH);
        for (ProductMapInfo productMapInfo : this.f43940b) {
            if (!TextUtils.isEmpty(productMapInfo.d()) && productMapInfo.d().toUpperCase(Locale.ENGLISH).equals(upperCase) && productMapInfo.e().equals(strC)) {
                arrayList2.add(productMapInfo);
            }
        }
        LogUtil.a("SportBiReportController", "target sport product size :", Integer.valueOf(arrayList2.size()));
        if (arrayList2.isEmpty()) {
            return null;
        }
        return (ProductMapInfo) arrayList2.get(0);
    }

    private void b(ProductMapInfo productMapInfo, String str) {
        LogUtil.j("SportBiReportController", "uploadDeviceToCloud enter");
        if (dxm.ag(productMapInfo.g())) {
            LogUtil.j("SportBiReportController", "uploadDeviceToCloud do not add huawei or honour scale");
            return;
        }
        enf enfVarE = e(productMapInfo, str, str);
        if (enfVarE != null) {
            enm.b(enfVarE, 1);
        } else {
            LogUtil.j("SportBiReportController", "uploadDeviceToCloud CloudValidInformation is null");
        }
    }

    private enf e(ProductMapInfo productMapInfo, String str, String str2) {
        String strD = productMapInfo.d();
        enf.d dVar = new enf.d();
        LogUtil.a("SportBiReportController", " getCloudValidInformation deviceModeInfo exist");
        dVar.c(productMapInfo.a());
        dVar.d(strD);
        String strG = productMapInfo.g();
        dVar.h(strG);
        dVar.i(productMapInfo.e());
        if (!TextUtils.isEmpty(str2)) {
            dVar.e(str2);
            dVar.a(c(str2));
            dVar.f(str);
        }
        elh elhVarD = ResourceManager.c().d(strG);
        if (elhVarD != null) {
            LogUtil.a("SportBiReportController", " getCloudValidInformation productInfo exist");
            String strA = elo.a(strG, elhVarD.l().d());
            if (!TextUtils.isEmpty(strA)) {
                dVar.g(strA + Constants.LINK + c(str2));
                LogUtil.a("SportBiReportController", " getCloudValidInformation device resource");
            }
        }
        dVar.b("1.0");
        dVar.e(4);
        dVar.n("local");
        dVar.a(0);
        String versionName = PackageUtils.getVersionName(this.d);
        dVar.m(versionName);
        LogUtil.d("SportBiReportController", "app version:", versionName);
        dVar.a(System.currentTimeMillis());
        return dVar.b();
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("SportBiReportController", "can not substring an empty mac");
            return "";
        }
        String strReplaceAll = str.replaceAll(":", "");
        int length = strReplaceAll.length();
        if (length > 3) {
            return strReplaceAll.substring(length - 3, length);
        }
        return null;
    }
}
