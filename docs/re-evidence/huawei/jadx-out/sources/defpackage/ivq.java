package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.bolt.BoltCustomDialog;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ivq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f38106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<ivo.d> f38107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38108c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private Map<Integer, List<ivo.d>> i;
    private jaq j;
    private Map<Integer, List<ivo.d>> l;

    private ivq() {
    }

    public static ivq e() {
        return c.d;
    }

    public void e(HashMap<String, Object> map, int i) {
        LogUtil.a("Track_BoltUpdateImageStatus", "updateImageBolt");
        if (!SportSupportUtil.g(i)) {
            LogUtil.j("Track_BoltUpdateImageStatus", "updateImageBolt() current sport type is not support bolt sport");
            return;
        }
        this.j = ivo.c();
        List<ivo.d> listE = ivo.a().e(false);
        this.f38107b = listE;
        b(map, listE, i);
    }

    private void b(HashMap<String, Object> map, List<ivo.d> list, int i) {
        LogUtil.a("Track_BoltUpdateImageStatus", " setRightTopImage()");
        c(list, true);
        if (SportSupportUtil.a(i)) {
            j();
            d(map, this.f38106a, this.f, this.e, this.g);
        }
        if (i == 259) {
            b();
            d(map, this.f38106a, this.f38108c, this.e, this.d);
        }
    }

    private void b() {
        if (this.f38106a <= 0 || this.f38108c <= 0) {
            LogUtil.a("Track_BoltUpdateImageStatus", "connectBoltDevice");
            ivo.a().d();
        }
    }

    private void j() {
        if (this.f38106a <= 0 || this.f <= 0) {
            LogUtil.a("Track_BoltUpdateImageStatus", "connectRunSportBoltDevice");
            ivo.a().d();
        }
    }

    private void c(List<ivo.d> list, boolean z) {
        d(list);
        a();
        c();
        d();
        if (z) {
            int iC = c(this.i, -1);
            this.h = iC;
            LogUtil.a("Track_BoltUpdateImageStatus", "getWearingPositionBoltList : mNoWearingBoltDeviceNumber = ", Integer.valueOf(iC));
        }
    }

    public void d(List<ivo.d> list) {
        this.i = ivo.a().c(list, true);
        this.l = ivo.a().c(list, false);
    }

    public int a() {
        this.f38106a = c(this.i, 0);
        int iC = c(this.l, 0);
        this.e = iC;
        return iC;
    }

    public int c() {
        this.f = c(this.i, 1);
        int iC = c(this.l, 1);
        this.g = iC;
        return iC;
    }

    public int d() {
        this.f38108c = c(this.i, 2);
        int iC = c(this.l, 2);
        this.d = iC;
        return iC;
    }

    private void d(HashMap<String, Object> map, int i, int i2, int i3, int i4) {
        Context context = BaseApplication.getContext();
        String strB = een.b(554, context, context.getPackageName());
        if (i3 == 0 && i4 == 0) {
            if (this.h > 0) {
                map.put("RIGHT_TOP_IMAGE_SECOND", Integer.valueOf(R.drawable.ic_bolt_no_pair));
                map.put("RIGHT_TOP_SECOND_BUBBLE", context.getString(R.string.IDS_bolt_not_avail_tip, strB));
                return;
            } else {
                map.remove("RIGHT_TOP_IMAGE_SECOND");
                map.remove("RIGHT_TOP_SECOND_BUBBLE");
                return;
            }
        }
        if (i == 0 && i2 == 0) {
            map.put("RIGHT_TOP_IMAGE_SECOND", Integer.valueOf(R.drawable.ic_bolt_no_pair));
            map.put("RIGHT_TOP_SECOND_BUBBLE", context.getString(R.string.IDS_bolt_not_avail_tip, strB));
            return;
        }
        if ((i == 0 && i2 > 0) || (i > 0 && i2 == 0)) {
            map.put("RIGHT_TOP_IMAGE_SECOND", Integer.valueOf(R.drawable.ic_bolt_on_one));
            map.put("RIGHT_TOP_SECOND_BUBBLE", context.getString(R.string.IDS_bolt_not_avail_tip, strB));
        } else {
            if (i <= 0 || i2 <= 0) {
                return;
            }
            map.remove("RIGHT_TOP_SECOND_BUBBLE");
            map.put("RIGHT_TOP_IMAGE_SECOND", Integer.valueOf(R.drawable.ic_bolt_on_two));
        }
    }

    private int c(Map<Integer, List<ivo.d>> map, int i) {
        if (map == null) {
            LogUtil.j("Track_BoltUpdateImageStatus", "getBoltNumberOfWears : wearingPositionBoltList is null");
            return 0;
        }
        List<ivo.d> list = map.get(Integer.valueOf(i));
        if (njy.e(list)) {
            LogUtil.j("Track_BoltUpdateImageStatus", "getBoltNumberOfWears : boltDeviceWaistList is empty");
            return 0;
        }
        a(i, list);
        if (njy.e(list)) {
            return 0;
        }
        return list.size();
    }

    private void a(int i, List<ivo.d> list) {
        if (list.size() == 0) {
            LogUtil.j("Track_BoltUpdateImageStatus", "setDefaultSelectedDevice :", " boltDeviceLists size is 0, current wearingPositionWaist is ", Integer.valueOf(i));
            return;
        }
        if (this.j == null) {
            this.j = ivo.c();
        }
        String deviceIdentify = list.get(0).e().getDeviceIdentify();
        if (i == 0) {
            String strU = this.j.u();
            boolean zC = c(list, strU);
            if (TextUtils.isEmpty(strU) || !zC) {
                this.j.l(deviceIdentify);
            }
        }
        if (i == 1) {
            String strZ = this.j.z();
            boolean zC2 = c(list, strZ);
            if (TextUtils.isEmpty(strZ) || !zC2) {
                this.j.n(deviceIdentify);
            }
        }
        if (i == 2) {
            String strW = this.j.w();
            boolean zC3 = c(list, strW);
            if (TextUtils.isEmpty(strW) || !zC3) {
                this.j.m(deviceIdentify);
            }
        }
    }

    private boolean c(List<ivo.d> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ivo.d dVar = list.get(i);
            if (dVar != null) {
                arrayList.add(dVar.e().getDeviceIdentify());
            }
        }
        return arrayList.contains(str);
    }

    public void c(Context context, int i) {
        LogUtil.a("Track_BoltUpdateImageStatus", "onClickRightTopImage");
        c(ivo.a().e(true), true);
        if (SportSupportUtil.a(i)) {
            d(context, i, this.g);
        }
        if (i == 259) {
            d(context, i, this.d);
        }
    }

    private void d(Context context, int i, int i2) {
        int i3 = this.e;
        if (i3 > 0 || i2 > 0) {
            BoltCustomDialog.c().d(context, i, (BoltCustomDialog.OnConfirmCallBack) null, 0);
        } else {
            if (i3 + i2 != 0 || this.h <= 0) {
                return;
            }
            BoltCustomDialog.c().c(context, i);
        }
    }

    static class c {
        private static final ivq d = new ivq();
    }
}
