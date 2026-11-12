package defpackage;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.MonthlyReportTemplate;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.SingleMonth;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.R;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.manager.model.RecentMonthRecordFromDB;
import com.huawei.pluginachievement.manager.model.RecentWeekRecordFromDB;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes13.dex */
public class pal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f45079a = Color.parseColor("#FFA3E5A3");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f45080b = Color.parseColor("#FF47CC47");
    private static List<SingleMonth> d;

    public static ArrayList<String> e(long j, boolean z) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        if (z) {
            calendar.setFirstDayOfWeek(1);
        } else {
            calendar.setFirstDayOfWeek(2);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        calendar.add(5, calendar.getFirstDayOfWeek() - calendar.get(7));
        arrayList.add(i(calendar.getTimeInMillis()));
        for (int i = 0; i < 6; i++) {
            calendar.add(5, 1);
            arrayList.add(i(calendar.getTimeInMillis()));
        }
        return arrayList;
    }

    private static String i(long j) {
        if (LanguageUtil.o(BaseApplication.getContext()) || LanguageUtil.q(BaseApplication.getContext())) {
            return g(j);
        }
        return h(j);
    }

    private static String g(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        switch (calendar.get(7)) {
            case 1:
                return BaseApplication.getContext().getResources().getString(R.string.IDS_report_sunday);
            case 2:
                return BaseApplication.getContext().getResources().getString(R.string.IDS_report_monday);
            case 3:
                return BaseApplication.getContext().getResources().getString(R.string.IDS_report_thuesday);
            case 4:
                return BaseApplication.getContext().getResources().getString(R.string.IDS_report_wedesday);
            case 5:
                return BaseApplication.getContext().getResources().getString(R.string.IDS_report_thursday);
            case 6:
                return BaseApplication.getContext().getResources().getString(R.string.IDS_report_friday);
            case 7:
                return BaseApplication.getContext().getResources().getString(R.string.IDS_report_saturday);
            default:
                return "";
        }
    }

    private static String h(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        switch (calendar.get(7)) {
            case 1:
                return UnitUtil.e(7.0d, 1, 0);
            case 2:
                return UnitUtil.e(1.0d, 1, 0);
            case 3:
                return UnitUtil.e(2.0d, 1, 0);
            case 4:
                return UnitUtil.e(3.0d, 1, 0);
            case 5:
                return UnitUtil.e(4.0d, 1, 0);
            case 6:
                return UnitUtil.e(5.0d, 1, 0);
            case 7:
                return UnitUtil.e(6.0d, 1, 0);
            default:
                return "";
        }
    }

    public static ArrayList<String> d(long j, long j2) {
        int iK = lsl.k(j2);
        int[] iArr = {1, 8, 15, 22};
        ArrayList<String> arrayList = new ArrayList<>(iK);
        int i = 1;
        while (i <= iK) {
            boolean z = false;
            for (int i2 = 0; i2 < 4; i2++) {
                if (i == iArr[i2]) {
                    z = true;
                }
            }
            if (z || i == iK) {
                arrayList.add(paw.d(i == 1 ? j : lsl.d(j, i - 1), 3));
            } else {
                arrayList.add("");
            }
            i++;
        }
        return arrayList;
    }

    public static long c(long j, int i, boolean z) {
        if (z) {
            return d(j, i);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(2);
        calendar.setTimeInMillis(j);
        if (i == 1) {
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(7, 2);
            return calendar.getTimeInMillis();
        }
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        calendar.set(7, 1);
        return calendar.getTimeInMillis();
    }

    public static long d(long j, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(1);
        calendar.setTimeInMillis(j);
        if (i == 1) {
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(7, 1);
            return calendar.getTimeInMillis();
        }
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        calendar.set(7, 7);
        return calendar.getTimeInMillis();
    }

    public static long c(int i, long j, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.add(2, i);
        if (i2 == 1) {
            calendar.set(5, calendar.getActualMinimum(5));
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
        } else {
            calendar.set(5, calendar.getActualMaximum(5));
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 999);
        }
        return calendar.getTimeInMillis();
    }

    public static long d(int i, int i2, boolean z) {
        Calendar calendar = Calendar.getInstance();
        if (z) {
            calendar.setFirstDayOfWeek(1);
        } else {
            calendar.setFirstDayOfWeek(2);
        }
        calendar.add(5, i2 * (-7));
        if (i == 1) {
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            if (z) {
                calendar.set(7, 1);
            } else {
                calendar.set(7, 2);
            }
        } else {
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 999);
            if (z) {
                calendar.set(7, 7);
            } else {
                calendar.set(7, 1);
            }
        }
        return calendar.getTimeInMillis();
    }

    public static long d(int i, int i2, long j, boolean z) {
        Calendar calendar = Calendar.getInstance();
        if (z) {
            calendar.setFirstDayOfWeek(1);
        } else {
            calendar.setFirstDayOfWeek(2);
        }
        calendar.setTimeInMillis(j);
        calendar.add(5, i2 * (-7));
        if (i == 1) {
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            if (z) {
                calendar.set(7, 1);
            } else {
                calendar.set(7, 2);
            }
        } else {
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 999);
            if (z) {
                calendar.set(7, 7);
            } else {
                calendar.set(7, 1);
            }
        }
        return calendar.getTimeInMillis();
    }

    public static int a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return calendar.get(2) + 1;
    }

    public static int e(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return calendar.get(5);
    }

    public static String j(long j) {
        if (j <= 0) {
            return "";
        }
        return paw.d(j, 2);
    }

    public static <T> HiUserInfo d(T t, HiUserInfo hiUserInfo, Handler handler, int i) {
        if (t != null) {
            try {
                if (njy.b(t, HiUserInfo.class)) {
                    List list = (List) t;
                    if (list.isEmpty()) {
                        LogUtil.d("AchieveReportUtil", "userInfos empty");
                        return hiUserInfo;
                    }
                    LogUtil.a("AchieveReportUtil", "fetchUserData onSuccess");
                    HiUserInfo hiUserInfo2 = (HiUserInfo) list.get(0);
                    try {
                        if (LoginInit.getInstance(BaseApplication.getContext()).isLoginedByWear()) {
                            String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1002);
                            if (TextUtils.isEmpty(accountInfo)) {
                                LogUtil.a("AchieveReportUtil", "updateUserNameFromLocal userName is null");
                            } else {
                                hiUserInfo2.setName(accountInfo);
                            }
                            hiUserInfo2.setHeadImgUrl(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1003));
                        }
                        if (handler == null) {
                            LogUtil.a("AchieveReportUtil", "Handler is null");
                            return hiUserInfo2;
                        }
                        handler.sendEmptyMessage(i);
                        return hiUserInfo2;
                    } catch (ClassCastException unused) {
                        hiUserInfo = hiUserInfo2;
                        LogUtil.e("AchieveReportUtil", "updateUserNameFromLocal data ClassCastException");
                        return hiUserInfo;
                    }
                }
            } catch (ClassCastException unused2) {
            }
        }
        return hiUserInfo;
    }

    public static int d(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return calendar.getActualMaximum(5);
    }

    public static long e(long j, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        if (i == 1) {
            calendar.set(5, calendar.getMinimum(5));
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            return calendar.getTimeInMillis();
        }
        calendar.set(5, calendar.getActualMaximum(5));
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    public static ArrayList<String> d(RecentMonthRecordFromDB recentMonthRecordFromDB) {
        if (recentMonthRecordFromDB == null) {
            LogUtil.j("AchieveReportUtil", "getWeeklyCaloriesDateList currentMonthRecord is null.");
            return new ArrayList<>();
        }
        Map<Long, Float> mapAcquireWeekCalorie = recentMonthRecordFromDB.acquireWeekCalorie();
        if (mapAcquireWeekCalorie == null || mapAcquireWeekCalorie.size() <= 0) {
            LogUtil.j("AchieveReportUtil", "setWeeklyCaloriesBarChart weekCaloriesMap is null.");
            return new ArrayList<>();
        }
        Map<Long, Number> mapD = d();
        mapD.putAll(mapAcquireWeekCalorie);
        ArrayList<String> arrayList = new ArrayList<>(8);
        Iterator<Map.Entry<Long, Number>> it = mapD.entrySet().iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().getKey().longValue();
            long jB = b(jLongValue);
            long jC = c(jLongValue);
            if (Math.abs(jB - jC) <= 86400000) {
                arrayList.add(paw.d(jB, 3));
            } else {
                arrayList.add(paw.d(jB, 3) + Constants.LINK + e(jC));
            }
        }
        return arrayList;
    }

    public static float b(RecentMonthRecordFromDB recentMonthRecordFromDB) {
        float fMax = 0.0f;
        if (recentMonthRecordFromDB == null) {
            LogUtil.j("AchieveReportUtil", "getWeeklyCaloriesDateList currentMonthRecord is null.");
            return 0.0f;
        }
        Map<Long, Float> mapAcquireWeekCalorie = recentMonthRecordFromDB.acquireWeekCalorie();
        if (mapAcquireWeekCalorie == null || mapAcquireWeekCalorie.size() <= 0) {
            LogUtil.j("AchieveReportUtil", "setWeeklyCaloriesBarChart weekCaloriesMap is null.");
            return 0.0f;
        }
        Iterator<Map.Entry<Long, Float>> it = mapAcquireWeekCalorie.entrySet().iterator();
        while (it.hasNext()) {
            fMax = Math.max(fMax, it.next().getValue().floatValue());
        }
        return fMax / 1000.0f;
    }

    public static ArrayList<String> b(RecentWeekRecordFromDB recentWeekRecordFromDB) {
        if (recentWeekRecordFromDB == null) {
            LogUtil.j("AchieveReportUtil", "getWeekExerciseTimeDateList currentWeekRecord is null.");
            return new ArrayList<>();
        }
        Map<Long, Long> mapAcquireSevenDayTime = recentWeekRecordFromDB.acquireSevenDayTime();
        if (mapAcquireSevenDayTime == null || mapAcquireSevenDayTime.size() <= 0) {
            LogUtil.j("AchieveReportUtil", "getWeekExerciseTimeDateList weekExerciseTimeMap is null.");
            return new ArrayList<>();
        }
        Map<Long, Number> mapD = d();
        mapD.putAll(mapAcquireSevenDayTime);
        ArrayList<String> arrayList = new ArrayList<>(8);
        Iterator<Map.Entry<Long, Number>> it = mapD.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(i(it.next().getKey().longValue()));
        }
        return arrayList;
    }

    public static Map<Long, Number> d() {
        return new TreeMap(new Comparator<Long>() { // from class: pal.5
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(Long l, Long l2) {
                if (l.longValue() > l2.longValue()) {
                    return 1;
                }
                return l.longValue() < l2.longValue() ? -1 : 0;
            }
        });
    }

    public static float c(RecentWeekRecordFromDB recentWeekRecordFromDB) {
        float fMax = 0.0f;
        if (recentWeekRecordFromDB == null) {
            LogUtil.j("AchieveReportUtil", "getWeekExerciseMaxTime currentWeekRecord is null.");
            return 0.0f;
        }
        Map<Long, Long> mapAcquireSevenDayTime = recentWeekRecordFromDB.acquireSevenDayTime();
        if (mapAcquireSevenDayTime == null || mapAcquireSevenDayTime.size() <= 0) {
            LogUtil.j("AchieveReportUtil", "getWeekExerciseMaxTime weekExerciseTimeMap is null.");
            return 0.0f;
        }
        Iterator<Map.Entry<Long, Long>> it = mapAcquireSevenDayTime.entrySet().iterator();
        while (it.hasNext()) {
            fMax = Math.max(fMax, it.next().getValue().longValue() / 60.0f);
        }
        return fMax;
    }

    public static long b(long j) {
        long jC = c(0, j, 1);
        long jD = d(1, 0, j, Utils.o());
        return jD <= jC ? jC : jD;
    }

    public static long c(long j) {
        long jC = c(0, j, 2);
        long jD = d(2, 0, j, Utils.o());
        return jD > jC ? jC : jD;
    }

    public static void e(final ImageView imageView, final String str, final Drawable drawable, final boolean z) {
        if (imageView == null || drawable == null) {
            LogUtil.j("AchieveReportUtil", "loadImage imageView ||defaultRes is null");
            return;
        }
        if (z && LanguageUtil.ba(BaseApplication.getContext())) {
            drawable = qqz.e(BaseApplication.getContext(), drawable);
        }
        if (TextUtils.isEmpty(str)) {
            imageView.setBackground(drawable);
            return;
        }
        if (e(str)) {
            imageView.setTag(str);
        }
        GRSManager.c(BaseApplication.getContext()).d("domainContentcenterDbankcdnNew", new GrsQueryCallback() { // from class: pal.1
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str2) {
                LogUtil.d("AchieveReportUtil", "imageViewUrl ", str2 + str);
                pal.e(imageView, str2 + str, str, drawable, z);
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.e("AchieveReportUtil", "onCallBackFail errorCode = ", Integer.valueOf(i));
            }
        });
    }

    private static boolean e(String str) {
        return str.contains("com.huawei.health.h5.annual-report-");
    }

    public static void d(ImageView imageView, String str, Drawable drawable, boolean z) {
        if (imageView == null || drawable == null) {
            LogUtil.j("AchieveReportUtil", "loadImageFromMarket imageView ||defaultRes is null");
            return;
        }
        if (z && LanguageUtil.ba(BaseApplication.getContext())) {
            drawable = qqz.e(BaseApplication.getContext(), drawable);
        }
        if (TextUtils.isEmpty(str)) {
            imageView.setBackground(drawable);
        } else {
            e(imageView, str, "", drawable, z);
        }
    }

    /* JADX INFO: renamed from: pal$3, reason: invalid class name */
    class AnonymousClass3 extends CustomTarget<Drawable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Drawable f45084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ WeakReference f45085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f45086c;
        final /* synthetic */ String e;

        @Override // com.bumptech.glide.request.target.Target
        public void onLoadCleared(Drawable drawable) {
        }

        AnonymousClass3(WeakReference weakReference, String str, boolean z, Drawable drawable) {
            this.f45085b = weakReference;
            this.e = str;
            this.f45086c = z;
            this.f45084a = drawable;
        }

        @Override // com.bumptech.glide.request.target.Target
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(final Drawable drawable, Transition<? super Drawable> transition) {
            final WeakReference weakReference = this.f45085b;
            final String str = this.e;
            final boolean z = this.f45086c;
            HandlerExecutor.b(new Runnable() { // from class: pan
                @Override // java.lang.Runnable
                public final void run() {
                    pal.AnonymousClass3.b(weakReference, str, z, drawable);
                }
            });
        }

        static /* synthetic */ void b(WeakReference weakReference, String str, boolean z, Drawable drawable) {
            ImageView imageView = (ImageView) weakReference.get();
            if (imageView != null) {
                if (pal.d(imageView, str)) {
                    if (z && LanguageUtil.ba(BaseApplication.getContext())) {
                        imageView.setBackground(qqz.e(BaseApplication.getContext(), drawable));
                        return;
                    } else {
                        imageView.setBackground(drawable);
                        return;
                    }
                }
                return;
            }
            LogUtil.j("AchieveReportUtil", "displayImage(onResourceReady): innerImageView is null");
        }

        @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
        public void onLoadFailed(Drawable drawable) {
            LogUtil.j("AchieveReportUtil", "loadRoundRectangle onLoadFailed");
            final Drawable drawable2 = this.f45084a;
            if (drawable2 == null) {
                super.onLoadFailed(drawable);
            } else {
                final WeakReference weakReference = this.f45085b;
                HandlerExecutor.b(new Runnable() { // from class: pam
                    @Override // java.lang.Runnable
                    public final void run() {
                        pal.AnonymousClass3.a(weakReference, drawable2);
                    }
                });
            }
        }

        static /* synthetic */ void a(WeakReference weakReference, Drawable drawable) {
            ImageView imageView = (ImageView) weakReference.get();
            if (imageView == null) {
                LogUtil.j("AchieveReportUtil", "displayImage(onLoadFailed): innerImageView is null");
            } else {
                imageView.setBackground(drawable);
            }
        }
    }

    public static void e(ImageView imageView, String str, String str2, Drawable drawable, boolean z) {
        qqf.b(imageView, str, new AnonymousClass3(new WeakReference(imageView), str2, z, drawable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(ImageView imageView, String str) {
        String str2;
        if (TextUtils.isEmpty(str) || !e(str)) {
            return true;
        }
        if (!(imageView.getTag() instanceof String)) {
            str2 = "";
        } else {
            str2 = (String) imageView.getTag();
        }
        return str.equals(str2);
    }

    public static void b(ImageView imageView, String str, String str2, Drawable drawable) {
        if (qrs.af(BaseApplication.getContext())) {
            e(imageView, str2, drawable, false);
        } else {
            e(imageView, str, drawable, false);
        }
    }

    public static void e(ImageView imageView, String str, String str2, Drawable drawable) {
        if (qrs.af(BaseApplication.getContext())) {
            e(imageView, str2, drawable, true);
        } else {
            e(imageView, str, drawable, true);
        }
    }

    public static void a(ImageView imageView, String str, String str2, Drawable drawable) {
        if (qrs.af(BaseApplication.getContext())) {
            d(imageView, str2, drawable, true);
        } else {
            d(imageView, str, drawable, true);
        }
    }

    public static void b(final AchieveCallback achieveCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: pal.4
            @Override // java.lang.Runnable
            public void run() {
                final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
                if (marketingApi == null) {
                    achieveCallback.onResponse(-1, null);
                    return;
                }
                Task<Map<Integer, ResourceResultInfo>> resourceResultInfo = marketingApi.getResourceResultInfo(1014);
                resourceResultInfo.addOnSuccessListener(new OnSuccessListener<Map<Integer, ResourceResultInfo>>() { // from class: pal.4.4
                    @Override // com.huawei.hmf.tasks.OnSuccessListener
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(Map<Integer, ResourceResultInfo> map) {
                        LogUtil.a("AchieveReportUtil", "requestMarketResource onSuccess");
                        if (map == null || map.isEmpty()) {
                            LogUtil.e("AchieveReportUtil", "marketingResponse is invalid");
                            achieveCallback.onResponse(-1, null);
                            return;
                        }
                        Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules(map);
                        if (mapFilterMarketingRules == null || mapFilterMarketingRules.isEmpty()) {
                            LogUtil.e("AchieveReportUtil", "filterResultInfoMap is invalid");
                            achieveCallback.onResponse(-1, null);
                        } else if (mapFilterMarketingRules.get(1014) != null) {
                            List unused = pal.d = pal.d(mapFilterMarketingRules.get(1014));
                            achieveCallback.onResponse(200, pal.d);
                        } else {
                            achieveCallback.onResponse(-1, null);
                            LogUtil.j("AchieveReportUtil", "resultMap does not contain search default page resource id");
                        }
                    }
                });
                resourceResultInfo.addOnFailureListener(new OnFailureListener() { // from class: pal.4.5
                    @Override // com.huawei.hmf.tasks.OnFailureListener
                    public void onFailure(Exception exc) {
                        LogUtil.e("AchieveReportUtil", "requestMarketResource onFailure");
                        achieveCallback.onResponse(-1, null);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<SingleMonth> d(ResourceResultInfo resourceResultInfo) {
        MonthlyReportTemplate monthlyReportTemplate;
        ArrayList arrayList = new ArrayList(10);
        if (resourceResultInfo != null) {
            List<ResourceBriefInfo> listD = d(resourceResultInfo.getResources());
            if (!njy.e(listD)) {
                for (ResourceBriefInfo resourceBriefInfo : listD) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis > resourceBriefInfo.getEffectiveTime() && jCurrentTimeMillis < resourceBriefInfo.getExpirationTime() && resourceBriefInfo.getContentType() == 60) {
                        String content = resourceBriefInfo.getContent().getContent();
                        LogUtil.a("AchieveReportUtil", "text link content: ", content);
                        if (!TextUtils.isEmpty(content) && (monthlyReportTemplate = (MonthlyReportTemplate) nlu.b(content, MonthlyReportTemplate.class)) != null) {
                            return monthlyReportTemplate.getGridContents();
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static List<ResourceBriefInfo> d(List<ResourceBriefInfo> list) {
        Collections.sort(list, new Comparator<ResourceBriefInfo>() { // from class: pal.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public int compare(ResourceBriefInfo resourceBriefInfo, ResourceBriefInfo resourceBriefInfo2) {
                if (resourceBriefInfo.getEffectiveTime() > resourceBriefInfo2.getEffectiveTime()) {
                    return -1;
                }
                return resourceBriefInfo.getEffectiveTime() == resourceBriefInfo2.getEffectiveTime() ? 0 : 1;
            }
        });
        return list;
    }

    public static List<SingleMonth> b() {
        return d;
    }

    public static void e() {
        List<SingleMonth> list = d;
        if (list != null) {
            list.clear();
            d = null;
        }
    }
}
