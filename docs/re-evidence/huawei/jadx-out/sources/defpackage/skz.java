package defpackage;

import android.text.TextUtils;
import androidx.core.util.Consumer;
import com.google.android.gms.common.util.BiConsumer;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesInfoManager;
import com.tencent.open.SocialConstants;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class skz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static CopyOnWriteArrayList<gdy> f48311b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static CopyOnWriteArrayList<snk> f48312c = new CopyOnWriteArrayList<>();
    private static long d = System.currentTimeMillis();

    skz() {
    }

    public static void b() {
        LogUtil.a("AudioRequestUtils", "initHistoryList.");
        d = System.currentTimeMillis();
        f48311b = new CopyOnWriteArrayList<>();
        f48312c = new CopyOnWriteArrayList<>();
    }

    public static void d(BiConsumer<List<gdy>, List<snk>> biConsumer, String str, int i, String str2) {
        LogUtil.a("AudioRequestUtils", "requestHistoryListData. mediaId = ", str, "; historyAudioItemList.size = ", Integer.valueOf(f48311b.size()), "; pageNum = ", Integer.valueOf(i), "; audioTime = ", str2);
        if (!j(f48312c)) {
            LogUtil.a("AudioRequestUtils", "first media is not for today. refresh historyList.");
            b();
        }
        int i2 = -29;
        if (i == 0) {
            if (b(f48311b, str)) {
                LogUtil.a("AudioRequestUtils", "has cacheHistoryInfo. no need to request.");
                smp.b().b(f48311b, f48312c);
                biConsumer.accept(f48311b, f48312c);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    int iA = lsl.a(DateFormatUtil.d(str2, DateFormatUtil.DateFormatType.DATE_FORMAT_YYYY_MM_DD).getTime(), d);
                    if (iA > 30) {
                        i2 = (-(((iA / 30) + 1) * 30)) + 1;
                    }
                } catch (ParseException e) {
                    ReleaseLogUtil.d("R_AudioRequestUtils", "requestHistoryListData ", ExceptionUtils.c(e));
                }
            }
            d(b(d, i2), d, biConsumer, str, true);
            return;
        }
        if (i * 30 < f48311b.size()) {
            LogUtil.a("AudioRequestUtils", "has cacheHistoryInfo. no need to request.");
            smp.b().b(f48311b, f48312c);
            biConsumer.accept(f48311b, f48312c);
            return;
        }
        d(b(d, -29), d, biConsumer, str, false);
    }

    /* JADX INFO: renamed from: skz$5, reason: invalid class name */
    class AnonymousClass5 extends UiCallback<List<snn>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f48317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BiConsumer f48318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f48319c;
        final /* synthetic */ long d;

        AnonymousClass5(BiConsumer biConsumer, long j, boolean z, String str) {
            this.f48318b = biConsumer;
            this.d = j;
            this.f48317a = z;
            this.f48319c = str;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("AudioRequestUtils", "getListHistoryData failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str);
            this.f48318b.accept(null, null);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<snn> list) {
            if (njy.e(list)) {
                ReleaseLogUtil.a("AudioRequestUtils", "getListHistoryData request failed, workoutHistoryList is empty!");
                return;
            }
            Collections.sort(list, new Comparator() { // from class: sle
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(ift.d(((snn) obj2).a()), ift.d(((snn) obj).a()));
                }
            });
            List<gdy> listA = skz.a(list);
            List<snk> listD = skz.d(list);
            skz.f48311b.addAll(listA);
            skz.f48312c.addAll(listD);
            long unused = skz.d = skz.b(this.d, -1);
            if (!this.f48317a || skz.b(listA, this.f48319c)) {
                smp.b().b(skz.f48311b, skz.f48312c);
                this.f48318b.accept(skz.f48311b, skz.f48312c);
            } else {
                LogUtil.a("AudioRequestUtils", "not contain audio. continue request. mediaId = ", this.f48319c);
                skz.d(skz.b(skz.d, -29), skz.d, this.f48318b, this.f48319c, this.f48317a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(long j, long j2, BiConsumer<List<gdy>, List<snk>> biConsumer, String str, boolean z) {
        HealthHeadLinesInfoManager.d().b(new AnonymousClass5(biConsumer, j, z, str), j, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(List<gdy> list, String str) {
        if (njy.e(list)) {
            LogUtil.j("AudioRequestUtils", "audioItemList empty in isContainAudio");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("AudioRequestUtils", "mediaId is empty. choose the first mediaId.");
            return true;
        }
        Iterator<gdy> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().h(), str)) {
                return true;
            }
        }
        return false;
    }

    public static void c() {
        LogUtil.a("AudioRequestUtils", "updateHistoryList. mLastHistoryQueryTime = ", Long.valueOf(d));
        d(b(d, -29), d, new BiConsumer<List<gdy>, List<snk>>() { // from class: skz.1
            @Override // com.google.android.gms.common.util.BiConsumer
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void accept(List<gdy> list, List<snk> list2) {
                smp.b().d(list, list2, smp.b().f(), null);
            }
        }, "", false);
    }

    public static void b(final Consumer<JSONArray> consumer, final BiConsumer<List<gdy>, List<snk>> biConsumer, List<snk> list) {
        LogUtil.a("AudioRequestUtils", "requestUserBehaviorList");
        if (njy.b(list)) {
            biConsumer.accept(b(list), list);
            return;
        }
        HealthHeadLinesInfoManager healthHeadLinesInfoManagerD = HealthHeadLinesInfoManager.d();
        if (healthHeadLinesInfoManagerD == null) {
            LogUtil.e("AudioRequestUtils", "infoManager is null");
        } else {
            healthHeadLinesInfoManagerD.c(new UiCallback<List<snk>>() { // from class: skz.2
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("AudioRequestUtils", "requestUserBehaviorList failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str);
                    consumer.accept(null);
                    biConsumer.accept(null, null);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<snk> list2) {
                    if (njy.e(list2)) {
                        ReleaseLogUtil.a("AudioRequestUtils", "requestUserBehaviorList request failed, audioWorkoutDetails is empty!");
                        return;
                    }
                    LogUtil.a("AudioRequestUtils", "audioWorkoutDetails: ", list2);
                    biConsumer.accept(skz.b(list2), list2);
                    consumer.accept(skz.c(list2));
                }
            });
        }
    }

    public static void c(Consumer<JSONArray> consumer, BiConsumer<List<gdy>, List<snk>> biConsumer, List<snk> list) {
        LogUtil.a("AudioRequestUtils", "requestUserPlayRecord");
        if (njy.b(list)) {
            biConsumer.accept(b(list), list);
            return;
        }
        HealthHeadLinesInfoManager healthHeadLinesInfoManagerD = HealthHeadLinesInfoManager.d();
        if (healthHeadLinesInfoManagerD == null) {
            LogUtil.e("AudioRequestUtils", "infoManager is null");
        } else {
            healthHeadLinesInfoManagerD.j(new AnonymousClass4(consumer, biConsumer));
        }
    }

    /* JADX INFO: renamed from: skz$4, reason: invalid class name */
    class AnonymousClass4 extends UiCallback<List<snk>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BiConsumer f48316b;
        final /* synthetic */ Consumer e;

        AnonymousClass4(Consumer consumer, BiConsumer biConsumer) {
            this.e = consumer;
            this.f48316b = biConsumer;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("AudioRequestUtils", "getUserPlayRecord failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str);
            this.e.accept(null);
            this.f48316b.accept(null, null);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<snk> list) {
            if (njy.e(list)) {
                ReleaseLogUtil.a("AudioRequestUtils", "getUserPlayRecord request failed, audioWorkoutDetails is empty!");
                return;
            }
            LogUtil.a("AudioRequestUtils", "audioWorkoutDetails: ", list);
            Collections.sort(list, new Comparator() { // from class: slc
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((snk) obj2).e(), ((snk) obj).e());
                }
            });
            this.f48316b.accept(skz.b(list), list);
            this.e.accept(skz.c(list));
        }
    }

    public static void b(String str, final Consumer<JSONArray> consumer, final BiConsumer<List<gdy>, List<snk>> biConsumer, List<snk> list) {
        LogUtil.a("AudioRequestUtils", "requestLecturerInfo");
        if (njy.b(list)) {
            biConsumer.accept(b(list), list);
            return;
        }
        HealthHeadLinesInfoManager healthHeadLinesInfoManagerD = HealthHeadLinesInfoManager.d();
        if (healthHeadLinesInfoManagerD == null) {
            LogUtil.e("AudioRequestUtils", "infoManager is null");
        } else {
            healthHeadLinesInfoManagerD.a(str, new UiCallback<List<snk>>() { // from class: skz.3
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str2) {
                    LogUtil.e("AudioRequestUtils", "requestLecturerInfo failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str2);
                    biConsumer.accept(null, null);
                    consumer.accept(null);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<snk> list2) {
                    if (njy.e(list2)) {
                        ReleaseLogUtil.a("AudioRequestUtils", "getLecturerInfo request failed, topicLists is empty!");
                        return;
                    }
                    biConsumer.accept(skz.b(list2), list2);
                    consumer.accept(skz.c(list2));
                }
            });
        }
    }

    public static void a(String str, final BiConsumer<List<sni>, Integer> biConsumer, final int i) {
        LogUtil.a("AudioRequestUtils", "requestWorkoutsByTopicId");
        HealthHeadLinesInfoManager healthHeadLinesInfoManagerD = HealthHeadLinesInfoManager.d();
        if (healthHeadLinesInfoManagerD == null) {
            LogUtil.e("AudioRequestUtils", "infoManager is null");
        } else {
            healthHeadLinesInfoManagerD.a(str, new HealthHeadLinesInfoManager.RequestCallBack<List<sni>, Integer>() { // from class: skz.6
                @Override // com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesInfoManager.RequestCallBack
                public void onFailure(int i2, String str2) {
                    LogUtil.e("AudioRequestUtils", "requestWorkoutsByTopicId failed, errorCode: ", Integer.valueOf(i2), " errorInfo: ", str2);
                    biConsumer.accept(null, null);
                }

                @Override // com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesInfoManager.RequestCallBack
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<sni> list, Integer num) {
                    if (njy.e(list)) {
                        ReleaseLogUtil.a("AudioRequestUtils", "requestWorkoutsByTopicId request failed, audioWorkoutByTopicList is empty!");
                        biConsumer.accept(null, null);
                    } else if (num != null && i * 20 > num.intValue()) {
                        LogUtil.e("AudioRequestUtils", "requestWorkoutsByTopicId redundant, cause request size exceed totalSize, ", "pageNum = ", Integer.valueOf(i), ", totalSize = ", num);
                        biConsumer.accept(null, null);
                    } else {
                        biConsumer.accept(list, num);
                    }
                }
            }, i);
        }
    }

    public static void c(final Consumer<Long> consumer) {
        LogUtil.a("AudioRequestUtils", "requestAccumulatedDuration");
        HealthHeadLinesInfoManager healthHeadLinesInfoManagerD = HealthHeadLinesInfoManager.d();
        if (healthHeadLinesInfoManagerD == null) {
            LogUtil.e("AudioRequestUtils", "infoManager is null");
        } else {
            healthHeadLinesInfoManagerD.d(new UiCallback<Long>() { // from class: skz.7
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("AudioRequestUtils", "requestAccumulatedDuration failed, errorCode: ", Integer.valueOf(i), " errorInfo: ", str);
                    consumer.accept(null);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Long l) {
                    consumer.accept(l);
                }
            });
        }
    }

    public static List<snk> e(List<sni> list) {
        LogUtil.a("AudioRequestUtils", "dealTopicList");
        ArrayList arrayList = new ArrayList();
        for (sni sniVar : list) {
            if (sniVar == null) {
                LogUtil.e("AudioRequestUtils", "workoutTopicList is null");
                return Collections.EMPTY_LIST;
            }
            snk snkVarC = sniVar.c();
            if (snkVarC == null) {
                LogUtil.e("AudioRequestUtils", "audioWorkoutDetail is null");
                return Collections.EMPTY_LIST;
            }
            arrayList.add(snkVarC);
        }
        return arrayList;
    }

    private static void b(snk snkVar, gdy gdyVar) {
        snw snwVarC;
        if (snkVar == null) {
            return;
        }
        gdyVar.d(snkVar.g());
        if (TextUtils.isEmpty(gdyVar.d()) && (snwVarC = snkVar.c()) != null) {
            gdyVar.d(snwVarC.e());
        }
    }

    public static List<gdy> b(List<snk> list) {
        ArrayList arrayList = new ArrayList(0);
        if (njy.e(list)) {
            LogUtil.j("AudioRequestUtils", "convertDetailListToAudioItemList failed, cause detailList is empty!");
            return arrayList;
        }
        for (snk snkVar : list) {
            if (snkVar != null) {
                gdy gdyVar = new gdy();
                b(snkVar, gdyVar);
                snp snpVarD = snkVar.d();
                if (snpVarD != null) {
                    gdyVar.j(snpVarD.e());
                    gdyVar.f(snpVarD.c());
                    gdyVar.e(snpVarD.a());
                }
                a(gdyVar, snkVar, snpVarD);
                sng sngVarB = snkVar.b();
                if (sngVarB != null) {
                    gdyVar.e(sngVarB.b());
                    gdyVar.g(sngVarB.a());
                }
                snx snxVarK = snkVar.k();
                if (snxVarK != null) {
                    gdyVar.b(snxVarK.e());
                }
                gdyVar.a("headLine");
                gdyVar.c("huaweihealth://huaweihealth.app/openwith?type=1&address=com.huawei.health.h5.health-headlines?h5pro=true&urlType=4&pName=com.huawei.health&isImmerse");
                arrayList.add(gdyVar);
            }
        }
        return arrayList;
    }

    public static List<snk> d(List<snn> list) {
        if (yls.c(list)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            snn snnVar = list.get(i);
            if (snnVar != null) {
                String strA = snnVar.a();
                snk snkVarD = snnVar.d();
                if (snkVarD != null) {
                    snkVarD.e(strA);
                    arrayList.add(snkVarD);
                }
            }
        }
        return arrayList;
    }

    public static List<gdy> a(List<snn> list) {
        ArrayList arrayList = new ArrayList();
        if (njy.e(list)) {
            return arrayList;
        }
        StringBuilder sb = new StringBuilder();
        for (snn snnVar : list) {
            gdy gdyVar = new gdy();
            snk snkVarD = snnVar.d();
            if (snkVarD != null) {
                gdyVar.d(snnVar.a());
                snp snpVarD = snkVarD.d();
                if (snpVarD != null) {
                    gdyVar.j(snpVarD.e());
                    gdyVar.f(snpVarD.c());
                    gdyVar.e(snpVarD.a());
                }
                a(gdyVar, snkVarD, snpVarD);
                sng sngVarB = snkVarD.b();
                if (sngVarB != null) {
                    gdyVar.e(sngVarB.b());
                    gdyVar.g(sngVarB.a());
                }
                snx snxVarK = snkVarD.k();
                if (snxVarK != null) {
                    gdyVar.b(snxVarK.e());
                }
                gdyVar.a("headLine");
                gdyVar.c("huaweihealth://huaweihealth.app/openwith?type=1&address=com.huawei.health.h5.health-headlines?h5pro=true&urlType=4&pName=com.huawei.health&isImmerse");
                sb.append(" title=");
                sb.append(gdyVar.o());
                sb.append(" date=");
                sb.append(gdyVar.d());
                arrayList.add(gdyVar);
            }
        }
        ReleaseLogUtil.d("R_AudioRequestUtils", sb.toString());
        return arrayList;
    }

    private static void a(gdy gdyVar, snk snkVar, snp snpVar) {
        String strA;
        String strJ;
        String strD;
        if (!snkVar.h().equals("")) {
            strA = snkVar.h();
        } else {
            strA = snkVar.a();
        }
        if (!snkVar.i().equals("")) {
            strJ = snkVar.i();
        } else {
            strJ = snkVar.j();
        }
        if (snpVar == null || TextUtils.isEmpty(snpVar.d())) {
            strD = strA + " " + strJ;
        } else {
            strD = snpVar.d();
        }
        gdyVar.h(strD);
    }

    public static JSONArray c(List<snk> list) {
        String str;
        String strE;
        String str2;
        long jB;
        String str3;
        String str4;
        int iB;
        String str5;
        String str6;
        LogUtil.a("AudioRequestUtils", "transformListToJson");
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            Iterator<snk> it = list.iterator();
            while (it.hasNext()) {
                snk next = it.next();
                if (next == null) {
                    LogUtil.e("AudioRequestUtils", "workoutDetail is empty");
                    return null;
                }
                long jL = next.l();
                int iN = next.n();
                String strG = next.g();
                snp snpVarD = next.d();
                sng sngVarB = next.b();
                snx snxVarK = next.k();
                snq snqVarF = next.f();
                snw snwVarC = next.c();
                if (snpVarD != null) {
                    String strC = snpVarD.c();
                    strE = snpVarD.e();
                    String strA = snpVarD.a();
                    jB = snpVarD.b();
                    str2 = strC;
                    str = strA;
                } else {
                    str = null;
                    strE = null;
                    str2 = null;
                    jB = 0;
                }
                if (snxVarK != null) {
                    String strD = snxVarK.d();
                    String strE2 = snxVarK.e();
                    str4 = strD;
                    str3 = strE2;
                } else {
                    str3 = null;
                    str4 = null;
                }
                if (sngVarB != null) {
                    String strA2 = sngVarB.a();
                    String strE3 = sngVarB.e();
                    iB = (int) sngVarB.b();
                    str5 = strA2;
                    str6 = strE3;
                } else {
                    iB = 0;
                    str5 = null;
                    str6 = null;
                }
                if (str6 != null) {
                    smp.b().e(str6, str2);
                }
                String strB = snqVarF != null ? snqVarF.b() : null;
                String strE4 = snwVarC != null ? snwVarC.e() : null;
                Iterator<snk> it2 = it;
                String str7 = str3;
                JSONArray jSONArray2 = jSONArray;
                String str8 = str4;
                String str9 = str5;
                String str10 = str;
                String str11 = strE;
                String str12 = str2;
                String str13 = strB;
                LogUtil.a("AudioRequestUtils", "workoutId=", str12, " title=", str11, " audioId=", str6, " audioDuration=", Integer.valueOf(iB), " name=", str13, " playRecord=", Long.valueOf(jL), " status=", Integer.valueOf(iN), " onlineDate=", strE4, " createTime=", Long.valueOf(jB), " historyDate=", strG);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID, str12);
                    jSONObject.put("title", str11);
                    jSONObject.put(SocialConstants.PARAM_APP_DESC, str10);
                    jSONObject.put("detailPng", str8);
                    jSONObject.put("listPng", str7);
                    jSONObject.put("audioId", str6);
                    jSONObject.put("audioUrl", str9);
                    jSONObject.put("audioDuration", iB);
                    jSONObject.put("name", str13);
                    jSONObject.put("playRecord", jL);
                    jSONObject.put("status", iN);
                    if (!TextUtils.isEmpty(strG)) {
                        jSONObject.put("onlineDate", strG);
                    } else if (TextUtils.isEmpty(strE4)) {
                        jSONObject.put("onlineDate", ift.i(jB));
                    } else {
                        jSONObject.put("onlineDate", strE4);
                    }
                } catch (JSONException unused) {
                    LogUtil.e("AudioRequestUtils", "convertDetailListToJsonArray exception happened ");
                }
                jSONArray = jSONArray2;
                jSONArray.put(jSONObject);
                it = it2;
            }
        }
        return jSONArray;
    }

    private static List<snk> b(List<snk> list, int i, int i2) {
        if (njy.e(list)) {
            return new ArrayList();
        }
        int i3 = i * i2;
        int i4 = i2 + i3;
        return (i3 >= list.size() || i3 > i4 || i4 < 0 || i3 < 0) ? new ArrayList() : list.subList(i3, Math.min(i4, list.size()));
    }

    public static JSONArray a(List<snk> list, int i, int i2) {
        List<snk> listB = b(list, i, i2);
        LogUtil.a("AudioRequestUtils", "pageNum = ", Integer.valueOf(i), "; detailListByPage = ", Integer.valueOf(listB.size()));
        return c(listB);
    }

    public static boolean j(List<snk> list) {
        snk snkVar;
        if (njy.e(list) || (snkVar = list.get(0)) == null) {
            return false;
        }
        long jD = d(snkVar);
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zC = lsl.c(jD, jCurrentTimeMillis);
        if (!zC) {
            LogUtil.a("AudioRequestUtils", "checkIsSameDayOnSaveMediaInfo return false, cause is not same day, lastSaveTime = ", DateFormatUtil.d(jD, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT), ", nowTime = ", DateFormatUtil.d(jCurrentTimeMillis, DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT));
        }
        return zC;
    }

    public static long b(long j, int i) {
        return ltb.d(new Date(j), i).getTime();
    }

    public static long d(snk snkVar) {
        if (snkVar == null) {
            LogUtil.j("AudioRequestUtils", "workoutDetail is null in getTimeInWorkoutDetail.");
            return 0L;
        }
        snw snwVarC = snkVar.c();
        if (snwVarC == null) {
            LogUtil.j("AudioRequestUtils", "timeDaoBean is null in getTimeInWorkoutDetail.");
            return 0L;
        }
        return ezo.b(snwVarC.e());
    }
}
