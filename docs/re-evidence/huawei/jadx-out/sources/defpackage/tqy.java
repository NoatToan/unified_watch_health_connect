package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.ui.main.R;
import health.compact.a.GRSManager;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class tqy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile tqy f49554c;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private tqu f49555b = tqu.e();

    private tqy() {
    }

    public static tqy b() {
        if (f49554c == null) {
            synchronized (e) {
                if (f49554c == null) {
                    f49554c = new tqy();
                }
            }
        }
        return f49554c;
    }

    public String d(DeviceInfo deviceInfo) {
        edn ednVarA;
        if (deviceInfo == null) {
            return e() + "/mhw/consumer/cn/community/mhwnews/allcircle/id_10000008";
        }
        int productType = deviceInfo.getProductType();
        if (eei.d(deviceInfo) && (ednVarA = lvi.a(productType)) != null) {
            return ednVarA.t();
        }
        if (d().contains(Integer.valueOf(productType))) {
            return e() + "/mhw/consumer/cn/community/mhwnews/allcircle/id_10000008";
        }
        return e(productType);
    }

    private List<Integer> d() {
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(5);
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(7);
        arrayList.add(14);
        arrayList.add(13);
        arrayList.add(15);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(10);
        arrayList.add(3);
        arrayList.add(11);
        arrayList.add(16);
        arrayList.add(18);
        arrayList.add(19);
        arrayList.add(20);
        arrayList.add(21);
        arrayList.add(44);
        arrayList.add(45);
        return arrayList;
    }

    private String e() {
        return GRSManager.c(BaseApplication.getContext()).getUrl("domainHuafenUrl");
    }

    private String e(int i) {
        String strG = lvi.a(i).g();
        if (strG == null || "".equals(strG)) {
            LogUtil.e("HuaFenClubInteractor", "use inner url");
            return e() + "/mhw/consumer/cn/community/mhwnews/allcircle/id_10000008";
        }
        if ((BaseApplication.getContext().getString(R.string.huafen_old_host) + "/forum.php?mod=forumdisplay&fid=4301").equals(strG)) {
            return e() + "/mhw/consumer/cn/community/mhwnews/allcircle/id_10000008";
        }
        if (i != 78 && i != 57) {
            OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("HuaFenClubInteractor", String.valueOf(i));
        }
        return strG;
    }
}
