package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.socialshare.api.WatermarkViewBase;
import com.huawei.health.socialshare.model.EditShareCommonView;
import com.huawei.health.socialshare.model.socialsharebean.ShareDataInfo;
import com.huawei.hms.framework.network.download.internal.constants.ExceptionCode;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.view.sharewatermark.EmotionalHealthWatermark;
import com.huawei.pluginsocialshare.view.sharewatermark.FitnessShareWatermarkOne;
import com.huawei.pluginsocialshare.view.sharewatermark.FitnessShareWatermarkOneVersionTwo;
import com.huawei.pluginsocialshare.view.sharewatermark.FitnessShareWatermarkThree;
import com.huawei.pluginsocialshare.view.sharewatermark.FitnessShareWatermarkThreeVersionTwo;
import com.huawei.pluginsocialshare.view.sharewatermark.FitnessShareWatermarkTwo;
import com.huawei.pluginsocialshare.view.sharewatermark.FitnessShareWatermarkTwoVersionTwo;
import com.huawei.pluginsocialshare.view.sharewatermark.PlanWaterMarkVersionOne;
import com.huawei.pluginsocialshare.view.sharewatermark.PlanWaterMarkVersionThree;
import com.huawei.pluginsocialshare.view.sharewatermark.PlanWaterMarkVersionTwo;
import com.huawei.pluginsocialshare.view.sharewatermark.SportBottomMainWatermark;
import com.huawei.pluginsocialshare.view.sharewatermark.SportBottomMainWatermarkVersionTwo;
import com.huawei.pluginsocialshare.view.sharewatermark.SportCommonWatermark;
import com.huawei.pluginsocialshare.view.sharewatermark.SportCommonWatermarkVersionTwo;
import com.huawei.pluginsocialshare.view.sharewatermark.SportShareWatermarkOutline;
import com.huawei.pluginsocialshare.view.sharewatermark.SportTitleWatermark;
import com.huawei.pluginsocialshare.view.sharewatermark.SportTitleWatermarkVersionTwo;
import com.huawei.pluginsocialshare.view.sharewatermark.ThreeCircleShareWatermark;
import com.huawei.pluginsocialshare.view.sharewatermark.TrackShareWatermark;
import com.huawei.pluginsocialshare.view.sharewatermark.TrackSimpleViewVersionTwo;
import health.compact.a.LogAnonymous;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class pnx implements WatermarkViewBase {
    private gyd aa;
    private int ab;
    private List<pnf> ac;
    private String ad;
    private Map<String, String> ah;
    private int ai;
    private int u;
    private List<jpg> v;
    private Context w;
    private String z;
    private static final List<Integer> d = new ArrayList(Arrays.asList(1021));
    private static final List<Integer> i = new ArrayList(Arrays.asList(1022));
    private static final List<Integer> e = new ArrayList(Arrays.asList(1020));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<Integer> f45735c = new ArrayList(Arrays.asList(1121));
    private static final List<Integer> f = new ArrayList(Arrays.asList(1122));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<Integer> f45733a = new ArrayList(Arrays.asList(1120));
    private static final List<Integer> l = new ArrayList(Arrays.asList(1001, 1005, 1015, 1019, 1023, 1024, 1026, 1027));
    private static final List<Integer> m = new ArrayList(Arrays.asList(1101, Integer.valueOf(ExceptionCode.CHECK_FILE_SIZE_FAILED), 1115, 1119, 1123, 1124, 1126, 1127, 1102, 1106, 1116, 1134, 1135, 1136, 1137, 1142, 1143, 1144, 1145, 1146, 1148, 1151));
    private static final List<Integer> o = new ArrayList(Arrays.asList(1002, 1003, 1004, 1006, 1010, 1011, 1016, 1017, 1018));
    private static final List<Integer> k = new ArrayList(Arrays.asList(Integer.valueOf(ExceptionCode.CHECK_FILE_HASH_FAILED), 1111, 1118, 1131, 1132, 1133, 1140, 1141, 1166, 1167));
    private static final List<Integer> n = new ArrayList(Arrays.asList(1008, 1009, 1014));
    private static final List<Integer> q = new ArrayList(Arrays.asList(1012, 1013, 1025, 1028, 1029, 1030, Integer.valueOf(AnalyticsListener.EVENT_AUDIO_TRACK_INITIALIZED), Integer.valueOf(AnalyticsListener.EVENT_AUDIO_TRACK_RELEASED)));
    private static final List<Integer> t = new ArrayList(Arrays.asList(999, Integer.valueOf(ExceptionCode.DOWNLOAD_RENAME_ERROR), Integer.valueOf(ExceptionCode.FILE_NO_EXIST), 1125, 1128, 1129, 1130, 1103, Integer.valueOf(ExceptionCode.SERVER_EXCEPTION), 1117, 1156, 1158, 1138, 1139, 1147, 1150));
    private static final List<Integer> p = new ArrayList(Arrays.asList(1007));
    private static final List<Integer> r = new ArrayList(Arrays.asList(Integer.valueOf(ExceptionCode.CREATE_DOWNLOAD_FILE_FAILED), 1168));
    private static final List<Integer> s = new ArrayList(Arrays.asList(1165));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<Integer> f45734b = new ArrayList(Arrays.asList(1169, 1170, 1171, 1172));
    private static final List<Integer> j = new ArrayList(Arrays.asList(1153, 1157, 1163));
    private static final List<Integer> g = new ArrayList(Arrays.asList(1154, 1160, 1161));
    private static final List<Integer> h = new ArrayList(Arrays.asList(1149, 1152, 1155, 1159, 1162));
    private ArrayList<EditShareCommonView> y = new ArrayList<>();
    private boolean x = true;

    public pnx(gyd gydVar, Context context) {
        this.aa = gydVar;
        this.w = context;
        b();
    }

    private void b() {
        a();
        this.ah = this.aa.d();
        this.v = this.aa.b();
        this.z = this.aa.h();
    }

    private void a() {
        Context context = this.w;
        if (context == null) {
            return;
        }
        try {
            this.ac = (List) lls.e(context.getAssets().open("shareWatermark/watermarkConfig.json"), new TypeToken<ArrayList<pnf>>() { // from class: com.huawei.pluginsocialshare.utils.WatermarkViewUtils$1
            });
        } catch (IOException e2) {
            LogUtil.e("Share_WatermarkViewUtils", "initShareWatermarkConfig", LogAnonymous.b(e2));
        }
    }

    public void e(String str) {
        LogUtil.a("Share_WatermarkViewUtils", "setRequestShareModule requestShareModule:" + str);
        this.ad = str;
    }

    @Override // com.huawei.health.socialshare.api.WatermarkViewBase
    public void constructDownloadWatermarkViewList(List<ShareDataInfo> list) {
        this.x = false;
        for (ShareDataInfo shareDataInfo : list) {
            if (shareDataInfo instanceof gyj) {
                gyj gyjVar = (gyj) shareDataInfo;
                int id = gyjVar.getId();
                if (l.contains(Integer.valueOf(id))) {
                    e(id, gyjVar, new SportBottomMainWatermark(this.w));
                } else if (o.contains(Integer.valueOf(id))) {
                    e(id, gyjVar, new SportCommonWatermark(this.w));
                } else if (n.contains(Integer.valueOf(id))) {
                    e(id, gyjVar, new SportShareWatermarkOutline(this.w));
                } else {
                    c(id, gyjVar);
                }
            }
        }
    }

    private void c(int i2, gyj gyjVar) {
        if (q.contains(Integer.valueOf(i2))) {
            e(i2, gyjVar, new SportTitleWatermark(this.w));
            return;
        }
        if (p.contains(Integer.valueOf(i2))) {
            e(i2, gyjVar, new TrackShareWatermark(this.w));
            return;
        }
        if (d.contains(Integer.valueOf(i2))) {
            e(i2, gyjVar, new FitnessShareWatermarkOne(this.w));
            return;
        }
        if (i.contains(Integer.valueOf(i2))) {
            e(i2, gyjVar, new FitnessShareWatermarkTwo(this.w));
            return;
        }
        if (e.contains(Integer.valueOf(i2))) {
            e(i2, gyjVar, new FitnessShareWatermarkThree(this.w));
            return;
        }
        if (m.contains(Integer.valueOf(i2))) {
            e(i2, gyjVar, new SportBottomMainWatermarkVersionTwo(this.w));
            return;
        }
        if (k.contains(Integer.valueOf(i2))) {
            e(i2, gyjVar, new SportCommonWatermarkVersionTwo(this.w));
            return;
        }
        if (t.contains(Integer.valueOf(i2))) {
            e(i2, gyjVar, new SportTitleWatermarkVersionTwo(this.w));
            return;
        }
        if (r.contains(Integer.valueOf(i2))) {
            e(i2, gyjVar, new TrackSimpleViewVersionTwo(this.w));
            return;
        }
        if (f45735c.contains(Integer.valueOf(i2))) {
            e(i2, gyjVar, new FitnessShareWatermarkOneVersionTwo(this.w));
            return;
        }
        if (f.contains(Integer.valueOf(i2))) {
            e(i2, gyjVar, new FitnessShareWatermarkTwoVersionTwo(this.w));
            return;
        }
        if (f45733a.contains(Integer.valueOf(i2))) {
            e(i2, gyjVar, new FitnessShareWatermarkThreeVersionTwo(this.w));
            return;
        }
        if (j.contains(Integer.valueOf(i2))) {
            e(i2, gyjVar, new PlanWaterMarkVersionOne(this.w));
            return;
        }
        if (g.contains(Integer.valueOf(i2))) {
            e(i2, gyjVar, new PlanWaterMarkVersionTwo(this.w));
            return;
        }
        if (h.contains(Integer.valueOf(i2))) {
            e(i2, gyjVar, new PlanWaterMarkVersionThree(this.w));
            return;
        }
        if (s.contains(Integer.valueOf(i2))) {
            e(i2, gyjVar, new ThreeCircleShareWatermark(this.w));
        } else if (f45734b.contains(Integer.valueOf(i2))) {
            e(i2, gyjVar, new EmotionalHealthWatermark(this.w));
        } else {
            LogUtil.j("Share_WatermarkViewUtils", "constructDownloadWatermarkViewList is other id");
        }
    }

    @Override // com.huawei.health.socialshare.api.WatermarkViewBase
    public void constructLocalDefaultWatermarkViewList(List<gxz> list) {
        this.x = true;
        for (gxz gxzVar : list) {
            int iD = gxzVar.d();
            int iE = gxzVar.e();
            if (l.contains(Integer.valueOf(iD))) {
                a(iD, iE, new SportBottomMainWatermark(this.w));
            } else if (o.contains(Integer.valueOf(iD))) {
                a(iD, iE, new SportCommonWatermark(this.w));
            } else if (n.contains(Integer.valueOf(iD))) {
                a(iD, iE, new SportShareWatermarkOutline(this.w));
            } else {
                d(iD, iE);
            }
        }
    }

    private void d(int i2, int i3) {
        if (q.contains(Integer.valueOf(i2))) {
            a(i2, i3, new SportTitleWatermark(this.w));
            return;
        }
        if (p.contains(Integer.valueOf(i2))) {
            a(i2, i3, new TrackShareWatermark(this.w));
            return;
        }
        if (d.contains(Integer.valueOf(i2))) {
            a(i2, i3, new FitnessShareWatermarkOne(this.w));
            return;
        }
        if (i.contains(Integer.valueOf(i2))) {
            a(i2, i3, new FitnessShareWatermarkTwo(this.w));
            return;
        }
        if (e.contains(Integer.valueOf(i2))) {
            a(i2, i3, new FitnessShareWatermarkThree(this.w));
            return;
        }
        if (m.contains(Integer.valueOf(i2))) {
            a(i2, i3, new SportBottomMainWatermarkVersionTwo(this.w));
            return;
        }
        if (k.contains(Integer.valueOf(i2))) {
            a(i2, i3, new SportCommonWatermarkVersionTwo(this.w));
            return;
        }
        if (t.contains(Integer.valueOf(i2))) {
            a(i2, i3, new SportTitleWatermarkVersionTwo(this.w));
            return;
        }
        if (r.contains(Integer.valueOf(i2))) {
            a(i2, i3, new TrackSimpleViewVersionTwo(this.w));
            return;
        }
        if (f45735c.contains(Integer.valueOf(i2))) {
            a(i2, i3, new FitnessShareWatermarkOneVersionTwo(this.w));
            return;
        }
        if (f.contains(Integer.valueOf(i2))) {
            a(i2, i3, new FitnessShareWatermarkTwoVersionTwo(this.w));
            return;
        }
        if (f45733a.contains(Integer.valueOf(i2))) {
            a(i2, i3, new FitnessShareWatermarkThreeVersionTwo(this.w));
            return;
        }
        if (j.contains(Integer.valueOf(i2))) {
            a(i2, i3, new PlanWaterMarkVersionOne(this.w));
            return;
        }
        if (g.contains(Integer.valueOf(i2))) {
            a(i2, i3, new PlanWaterMarkVersionTwo(this.w));
            return;
        }
        if (h.contains(Integer.valueOf(i2))) {
            a(i2, i3, new PlanWaterMarkVersionThree(this.w));
            return;
        }
        if (s.contains(Integer.valueOf(i2))) {
            a(i2, i3, new ThreeCircleShareWatermark(this.w));
        } else if (f45734b.contains(Integer.valueOf(i2))) {
            a(i2, i3, new EmotionalHealthWatermark(this.w));
        } else {
            LogUtil.j("Share_WatermarkViewUtils", "constructLocalDefaultWatermarkViewList is other watermarkId");
        }
    }

    private void e(int i2, gyj gyjVar, EditShareCommonView editShareCommonView) {
        String path = gyjVar.getPath();
        String strE = gyjVar.e();
        editShareCommonView.setWatermarkId(i2);
        editShareCommonView.refreshData(a(i2, strE));
        editShareCommonView.setSourcePath(path);
        editShareCommonView.setIsDefaultSource(this.x);
        editShareCommonView.refreshUi(this.ai, this.u);
        editShareCommonView.refreshTopUi(this.ab);
        c(editShareCommonView);
        this.y.add(editShareCommonView);
    }

    private void c(EditShareCommonView editShareCommonView) {
        LogUtil.a("Share_WatermarkViewUtils", "setUserInfo mRequestShareModule: ", this.ad);
        if (!pnq.j()) {
            editShareCommonView.setUserInfo(null, null);
        } else {
            editShareCommonView.setUserInfo(pnq.d(this.w), pnq.a());
        }
    }

    private void a(int i2, int i3, EditShareCommonView editShareCommonView) {
        editShareCommonView.refreshData(a(i2, null));
        editShareCommonView.setWatermarkId(i2);
        editShareCommonView.setBitmap(i3);
        editShareCommonView.setIsDefaultSource(this.x);
        editShareCommonView.refreshUi(this.ai, this.u);
        editShareCommonView.refreshTopUi(this.ab);
        c(editShareCommonView);
        this.y.add(editShareCommonView);
    }

    private gyh a(int i2, String str) {
        gyh gyhVar = new gyh();
        pnf pnfVarD = d(i2);
        gyhVar.a(pnfVarD.k());
        gyhVar.p(a(pnfVarD.o()));
        gyhVar.t(a(pnfVarD.q()));
        gyhVar.r(a(pnfVarD.t()));
        gyhVar.s(a(pnfVarD.r()));
        gyhVar.q(a(pnfVarD.p()));
        LogUtil.a("Share_WatermarkViewUtils", "location= ", a(pnfVarD.p()), " id: ", Integer.valueOf(i2));
        gyhVar.u(a(pnfVarD.s()));
        gyhVar.y(a(pnfVarD.y()));
        gyhVar.d(a(pnfVarD.c()));
        gyhVar.a(a(pnfVarD.a()));
        gyhVar.b(a(pnfVarD.e()));
        gyhVar.g(a(pnfVarD.g()));
        gyhVar.h(a(pnfVarD.h()));
        gyhVar.f(a(pnfVarD.i()));
        gyhVar.j(a(pnfVarD.f()));
        gyhVar.m(a(pnfVarD.m()));
        gyhVar.n(a(pnfVarD.l()));
        gyhVar.c(a(pnfVarD.b()));
        gyhVar.e(a(pnfVarD.d()));
        gyhVar.i(a(pnfVarD.j()));
        gyhVar.l(str);
        gyhVar.e(this.v);
        gyhVar.k(this.z);
        gyhVar.o(a(pnfVarD.n()));
        gyhVar.c(pnfVarD.x());
        return gyhVar;
    }

    private String a(String str) {
        if (this.ah.containsKey(str)) {
            return this.ah.get(str);
        }
        return "";
    }

    private pnf d(int i2) {
        List<pnf> list = this.ac;
        if (list != null) {
            for (pnf pnfVar : list) {
                if (pnfVar.k() == i2) {
                    return pnfVar;
                }
            }
        }
        return new pnf();
    }

    @Override // com.huawei.health.socialshare.api.WatermarkViewBase
    public void setWidgetColor(int i2) {
        this.ai = i2;
    }

    @Override // com.huawei.health.socialshare.api.WatermarkViewBase
    public void setDoMainColor(int i2) {
        this.u = i2;
    }

    @Override // com.huawei.health.socialshare.api.WatermarkViewBase
    public void setTopWidgetColor(int i2) {
        this.ab = i2;
    }

    @Override // com.huawei.health.socialshare.api.WatermarkViewBase
    public List<EditShareCommonView> getEditShareCommonViewList() {
        return this.y;
    }
}
