package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.google.gson.JsonSyntaxException;
import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.sport.base.GridBanner;
import com.huawei.ui.main.R;
import health.compact.a.CommonUtils;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class wui {
    public static void d(long j, long j2, int i, int i2, final Handler handler, final int i3) {
        if (i != 286 || i2 < ezo.a()) {
            handler.obtainMessage(i3, null).sendToTarget();
        } else {
            ((HealthDataMgrApi) Services.b("HWHealthDataMgr", HealthDataMgrApi.class)).requestTrackSimplifyData(j, j2, i, new IBaseResponseCallback() { // from class: wuq
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i4, Object obj) {
                    wui.b(handler, i3, i4, obj);
                }
            });
        }
    }

    static /* synthetic */ void b(Handler handler, int i, int i2, Object obj) {
        if (i2 != 0) {
            LogUtil.e("GolfBriefHelper", "requestGolfBriefData not success");
            return;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            LogUtil.e("GolfBriefHelper", "requestGolfBriefData size 0");
            return;
        }
        List<HiHealthData> listA = a((List<HiHealthData>) list, 18);
        List<HiHealthData> listA2 = a((List<HiHealthData>) list, 9);
        ArrayList arrayList = new ArrayList();
        if (njy.b(listA) || njy.b(listA2)) {
            arrayList.add(d(listA));
            arrayList.add(d(listA2));
        }
        handler.sendMessage(handler.obtainMessage(i, arrayList));
    }

    private static List<HiHealthData> a(List<HiHealthData> list, int i) {
        int i2;
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list)) {
            for (HiHealthData hiHealthData : list) {
                if (hiHealthData != null) {
                    try {
                        HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiTrackMetaData.class);
                        if (hiTrackMetaData.getSportType() == 286) {
                            String str = hiTrackMetaData.getExtendTrackMap().get("totalHoles");
                            try {
                                i2 = !TextUtils.isEmpty(str) ? Integer.parseInt(str) : 18;
                            } catch (NumberFormatException unused) {
                                LogUtil.j("GolfBriefHelper", "getGolfDataByHoles NumberFormatException");
                            }
                            LogUtil.j("GolfBriefHelper", "getGolfDataByHoles, requireHoles=" + i + ", totalHoles=" + i2);
                            if (i2 == i) {
                                arrayList.add(hiHealthData);
                            }
                            if (arrayList.size() >= 5) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } catch (JsonSyntaxException unused2) {
                        LogUtil.j("GolfBriefHelper", "getGolfDataByHoles trackMetaData is jsonSyntaxException");
                    }
                }
            }
        }
        return arrayList;
    }

    private static vqp d(List<HiHealthData> list) {
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i = 0;
        int iMin = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Map<String, String> mapE = e(list.get(i2));
            if (mapE != null) {
                int iJ = CommonUtils.j(mapE.get("golfSwingCount"));
                iMin = Math.min(iJ, iMin);
                f4 += iJ;
                int iJ2 = CommonUtils.j(mapE.get("putts"));
                float f5 = f + iJ2;
                int iJ3 = CommonUtils.j(mapE.get("fairwayHits"));
                int iJ4 = CommonUtils.j(mapE.get("fairwayLeft"));
                int iJ5 = CommonUtils.j(mapE.get("fairwayRight"));
                f2 += iJ3 / ((iJ3 + iJ4) + iJ5);
                float f6 = CommonUtils.f(mapE.get("gir"));
                f3 += f6;
                i++;
                LogUtil.a("GolfBriefHelper", "calculateGolfBrief() current hiHealthData, coursesCount = ", Integer.valueOf(i), ", swingCount = ", Integer.valueOf(iJ), ", putts = ", Integer.valueOf(iJ2), ", fairWayHits = ", Integer.valueOf(iJ3), ", fairWayLeft = ", Integer.valueOf(iJ4), ", fairWayRight = ", Integer.valueOf(iJ5), ", gir = ", Float.valueOf(f6));
                f = f5;
            }
        }
        int iD = (int) d(f4, i);
        int iD2 = (int) d(f, i);
        float fD = d(f2 * 100.0f, i);
        float fD2 = d(f3, i);
        int i3 = iMin == Integer.MAX_VALUE ? 0 : iMin;
        LogUtil.a("GolfBriefHelper", "calculateGolfBrief(), size = ", Integer.valueOf(list.size()), ", coursesCount = ", Integer.valueOf(i), ", bestCount = ", Integer.valueOf(i3), ", avgCount = ", Integer.valueOf(iD), ", avgPutters = ", Integer.valueOf(iD2), ", avgFairwayHitsRatio = ", Float.valueOf(fD), ", avgGIR = ", Float.valueOf(fD2), ", bestCount = ", Integer.valueOf(i3), ", totalCount = ", Float.valueOf(f4));
        return new vqp(i3, iD, iD2, fD, fD2, f4);
    }

    private static float d(float f, int i) {
        if (i == 0) {
            LogUtil.e("GolfBriefHelper", "courseCount  =  0");
            return 0.0f;
        }
        return Math.round(f / i);
    }

    private static Map<String, String> e(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            LogUtil.j("GolfBriefHelper", "hiHealthData is null");
            return null;
        }
        String metaData = hiHealthData.getMetaData();
        if (TextUtils.isEmpty(metaData)) {
            LogUtil.j("GolfBriefHelper", "metaData is null");
            return null;
        }
        try {
            HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) HiJsonUtil.d(metaData, HiTrackMetaData.class);
            if (hiTrackMetaData == null) {
                LogUtil.j("GolfBriefHelper", "trackMetaData is null");
                return null;
            }
            return hiTrackMetaData.getExtendTrackMap();
        } catch (JsonSyntaxException unused) {
            LogUtil.j("GolfBriefHelper", "calculateGolfBrief trackMetaData is jsonSyntaxException");
            return null;
        }
    }

    public static void a(Context context, List<vqp> list, View view) {
        if (list != null) {
            ((GridBanner) view.findViewById(R.id.golf_year_brief_banner)).setData(a(context, list));
        }
    }

    private static List<qpa> a(Context context, List<vqp> list) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            LogUtil.j("GolfBriefHelper", "extractGridBannerData() golfBriefs is null");
            return arrayList;
        }
        vqp vqpVar = list.get(0);
        vqp vqpVar2 = list.get(1);
        String string = context.getString(R.string.IDS_golf_best_swing);
        String string2 = context.getString(R.string.IDS_golf_average_swing);
        String string3 = context.getString(R.string.IDS_golf_average_putt);
        String string4 = context.getString(R.string.IDS_golf_average_fairway_rate);
        String string5 = context.getString(R.string.IDS_golf_average_gir);
        String string6 = context.getString(R.string.IDS_golf_total_strokes);
        arrayList.add(new qpa(context.getString(R.string.IDS_golf_course_recent_five_rounds_link, context.getResources().getQuantityString(R.plurals.IDS_golf_course_recent_five_rounds_data, 5, 5), context.getResources().getQuantityString(R.plurals.IDS_golf_course_recent_five_rounds_data_unit, 18, 18)), new ArrayList<qpa.e>(string, string2, string3, string4, string5, string6) { // from class: wui.5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f52507a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f52508b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f52509c;
            final /* synthetic */ String d;
            final /* synthetic */ String e;
            final /* synthetic */ String h;

            {
                this.d = string;
                this.e = string2;
                this.f52508b = string3;
                this.f52509c = string4;
                this.f52507a = string5;
                this.h = string6;
                add(new qpa.e(this.f.d(), string));
                add(new qpa.e(this.f.e(), string2));
                add(new qpa.e(this.f.b(), string3));
                add(new qpa.e(this.f.a(), string4));
                add(new qpa.e(this.f.c(), string5));
                add(new qpa.e(this.f.j(), string6));
            }
        }));
        arrayList.add(new qpa(context.getString(R.string.IDS_golf_course_recent_five_rounds_link, context.getResources().getQuantityString(R.plurals.IDS_golf_course_recent_five_rounds_data, 5, 5), context.getResources().getQuantityString(R.plurals.IDS_golf_course_recent_five_rounds_data_unit, 9, 9)), new ArrayList<qpa.e>(string, string2, string3, string4, string5, string6) { // from class: wui.1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f52504a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f52505b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f52506c;
            final /* synthetic */ String d;
            final /* synthetic */ String e;
            final /* synthetic */ String j;

            {
                this.f52505b = string;
                this.d = string2;
                this.f52506c = string3;
                this.e = string4;
                this.f52504a = string5;
                this.j = string6;
                add(new qpa.e(this.h.d(), string));
                add(new qpa.e(this.h.e(), string2));
                add(new qpa.e(this.h.b(), string3));
                add(new qpa.e(this.h.a(), string4));
                add(new qpa.e(this.h.c(), string5));
                add(new qpa.e(this.h.j(), string6));
            }
        }));
        return arrayList;
    }
}
