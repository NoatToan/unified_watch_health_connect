package defpackage;

import android.content.Context;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.functionsetcard.dailymoment.operation.IGetDailyMomentContentCallback;
import com.huawei.health.functionsetcard.dailymoment.operation.IGetDailyMomentDataCallback;
import com.huawei.health.functionsetcard.dailymoment.operation.IGetDataCallback;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.marketing.datatype.templates.DailyMomentContent;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ewq {
    private static final SecureRandom d = qrf.b();
    private static ewq e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ResourceBriefInfo f33574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<SingleDailyMomentContent> f33575c = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f33573a = BaseApplication.b();

    private ewq() {
    }

    public static ewq a() {
        ewq ewqVar;
        synchronized (ewq.class) {
            if (e == null) {
                e = new ewq();
            }
            ewqVar = e;
        }
        return ewqVar;
    }

    /* JADX INFO: renamed from: ewq$5, reason: invalid class name */
    class AnonymousClass5 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IGetDataCallback f33583b;

        AnonymousClass5(IGetDataCallback iGetDataCallback) {
            this.f33583b = iGetDataCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            ewq.this.c(new IGetDailyMomentDataCallback() { // from class: ewq.5.5
                @Override // com.huawei.health.functionsetcard.dailymoment.operation.IGetDailyMomentDataCallback
                public void onComplete(final DailyMomentContent dailyMomentContent) {
                    LogUtil.a("DataManager", "requestMarketingPlatformData complete");
                    if (dailyMomentContent == null) {
                        LogUtil.e("DataManager", "request MarketingPlatformData failed");
                        AnonymousClass5.this.f33583b.onComplete(null, null);
                    } else {
                        fua.a(dailyMomentContent.getMomentContents());
                        lsy.a(new Runnable() { // from class: ewq.5.5.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (exa.b(ewq.this.f33573a, dailyMomentContent) != 0) {
                                    LogUtil.e("DataManager", "saveDailyMomentData failed");
                                }
                            }
                        });
                        ewq.this.a(dailyMomentContent);
                        AnonymousClass5.this.f33583b.onComplete(ewq.this.e(), ewq.this.f33574b);
                    }
                }
            });
        }
    }

    public void a(boolean z, IGetDataCallback iGetDataCallback) {
        if (z) {
            ThreadPoolManager.c().execute(new AnonymousClass5(iGetDataCallback));
        } else {
            DailyMomentContent dailyMomentContentE = exa.e(this.f33573a);
            if (dailyMomentContentE == null) {
                LogUtil.e("DataManager", "queryDailyMomentData failed");
                iGetDataCallback.onComplete(null, null);
                return;
            }
            a(dailyMomentContentE);
        }
        iGetDataCallback.onComplete(e(), this.f33574b);
    }

    public List<SingleDailyMomentContent> e() {
        List<SingleDailyMomentContent> list = this.f33575c;
        if (list == null || list.size() <= 0) {
            LogUtil.e("DataManager", "mResourcePool is empty");
            return new ArrayList();
        }
        if (this.f33575c.size() <= 3) {
            return new ArrayList(this.f33575c);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            arrayList.add(this.f33575c.get(i));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final IGetDailyMomentDataCallback iGetDailyMomentDataCallback) {
        LogUtil.a("DataManager", "requestMarketingPlatformData");
        e(new IGetDailyMomentContentCallback() { // from class: ewq.2
            @Override // com.huawei.health.functionsetcard.dailymoment.operation.IGetDailyMomentContentCallback
            public void onComplete(ResourceResultInfo resourceResultInfo) {
                if (resourceResultInfo == null) {
                    LogUtil.e("DataManager", "request marketing data failed");
                    iGetDailyMomentDataCallback.onComplete(null);
                    return;
                }
                List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
                if (njy.e(resources)) {
                    LogUtil.e("DataManager", "allResourceList is empty");
                    iGetDailyMomentDataCallback.onComplete(null);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (ResourceBriefInfo resourceBriefInfo : resources) {
                    if (ewq.this.c(resourceBriefInfo)) {
                        arrayList.add(resourceBriefInfo);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ResourceBriefInfo resourceBriefInfoD = ewq.this.d(arrayList);
                    if (resourceBriefInfoD != null && resourceBriefInfoD.getContent() != null) {
                        ewq.this.f33574b = resourceBriefInfoD;
                        DailyMomentContent dailyMomentContentA = ewq.this.a(resourceBriefInfoD.getContent().getContent());
                        if (dailyMomentContentA == null) {
                            LogUtil.e("DataManager", "content is invalid");
                            iGetDailyMomentDataCallback.onComplete(null);
                            return;
                        } else {
                            iGetDailyMomentDataCallback.onComplete(dailyMomentContentA);
                            return;
                        }
                    }
                    LogUtil.e("DataManager", "prioritizedResource is invalid");
                    iGetDailyMomentDataCallback.onComplete(null);
                    return;
                }
                LogUtil.e("DataManager", "resources are invalid");
                iGetDailyMomentDataCallback.onComplete(null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DailyMomentContent dailyMomentContent) {
        List<SingleDailyMomentContent> momentContents = dailyMomentContent.getMomentContents();
        if (momentContents == null || momentContents.isEmpty()) {
            LogUtil.e("DataManager", "content is empty");
            return;
        }
        List<SingleDailyMomentContent> list = this.f33575c;
        if (list == null) {
            return;
        }
        list.clear();
        e(momentContents);
        final int iIntValue = dailyMomentContent.getDisplayRule().intValue();
        Collections.sort(this.f33575c, new Comparator<SingleDailyMomentContent>() { // from class: ewq.4
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(SingleDailyMomentContent singleDailyMomentContent, SingleDailyMomentContent singleDailyMomentContent2) {
                int iE = ewq.this.e(singleDailyMomentContent, singleDailyMomentContent2);
                if (iE != 0) {
                    return iE;
                }
                int i = iIntValue;
                if (i == 1) {
                    return ewq.this.a(singleDailyMomentContent, singleDailyMomentContent2, i);
                }
                if (i == 2) {
                    return ewq.this.d(singleDailyMomentContent, singleDailyMomentContent2, i);
                }
                LogUtil.e("DataManager", "invalid displayRule");
                return 0;
            }
        });
        for (SingleDailyMomentContent singleDailyMomentContent : this.f33575c) {
            LogUtil.a("DataManager", singleDailyMomentContent.toString());
            fxl.d(singleDailyMomentContent, this.f33574b);
        }
    }

    private boolean d(SingleDailyMomentContent singleDailyMomentContent) {
        String strD = DateFormatUtil.d(System.currentTimeMillis(), DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE);
        return a(strD, singleDailyMomentContent.getAppearTime()) >= 0 && a(strD, singleDailyMomentContent.getDisappearTime()) < 0;
    }

    private int a(String str, String str2) {
        int[] iArrD = d(str);
        int[] iArrD2 = d(str2);
        if (iArrD == null || iArrD2 == null || iArrD.length != 2 || iArrD2.length != 2) {
            LogUtil.e("DataManager", "time length is invalid");
            return 0;
        }
        int i = iArrD[0];
        int i2 = iArrD2[0];
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = iArrD[1];
        int i4 = iArrD2[1];
        if (i3 < i4) {
            return -1;
        }
        return i3 > i4 ? 1 : 0;
    }

    private long c(SingleDailyMomentContent singleDailyMomentContent) {
        String latestShowTime = singleDailyMomentContent.getLatestShowTime();
        if (latestShowTime != null && latestShowTime.length() != 0) {
            try {
                return Long.parseLong(latestShowTime);
            } catch (NumberFormatException unused) {
            }
        }
        return 0L;
    }

    private int[] d(String str) {
        if (str == null || str.length() <= 0 || str.length() > 5) {
            LogUtil.e("DataManager", "time is invalid");
            return new int[0];
        }
        String[] strArrSplit = str.split("\\:");
        if (strArrSplit == null || strArrSplit.length != 2) {
            LogUtil.e("DataManager", "split failed");
            return new int[0];
        }
        int[] iArr = new int[2];
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                iArr[i] = Integer.parseInt(strArrSplit[i]);
            } catch (NumberFormatException e2) {
                LogUtil.e("DataManager", "NumberFormatException", e2.getMessage());
            }
        }
        return iArr;
    }

    private void e(List<SingleDailyMomentContent> list) {
        for (SingleDailyMomentContent singleDailyMomentContent : list) {
            if (singleDailyMomentContent.getTimeRule() != 2 || d(singleDailyMomentContent)) {
                this.f33575c.add(singleDailyMomentContent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DailyMomentContent a(String str) {
        if (str == null || str.length() == 0) {
            LogUtil.e("DataManager", "resourceJson is invalid");
            return null;
        }
        return (DailyMomentContent) qqt.e(str, DailyMomentContent.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(ResourceBriefInfo resourceBriefInfo) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis > resourceBriefInfo.getEffectiveTime() && jCurrentTimeMillis < resourceBriefInfo.getExpirationTime() && resourceBriefInfo.getContentType() == 10000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ResourceBriefInfo d(List<ResourceBriefInfo> list) {
        ArrayList<ResourceBriefInfo> arrayList = new ArrayList();
        int priority = Integer.MIN_VALUE;
        for (ResourceBriefInfo resourceBriefInfo : list) {
            if (resourceBriefInfo.getPriority() > priority) {
                priority = resourceBriefInfo.getPriority();
                arrayList.clear();
                arrayList.add(resourceBriefInfo);
            } else if (resourceBriefInfo.getPriority() == priority) {
                arrayList.add(resourceBriefInfo);
            }
        }
        int size = arrayList.size();
        if (size <= 0) {
            return null;
        }
        if (size == 1) {
            return (ResourceBriefInfo) arrayList.get(0);
        }
        ArrayList arrayList2 = new ArrayList();
        long modifyTime = Long.MIN_VALUE;
        for (ResourceBriefInfo resourceBriefInfo2 : arrayList) {
            if (resourceBriefInfo2.getModifyTime() > modifyTime) {
                modifyTime = resourceBriefInfo2.getModifyTime();
                arrayList2.clear();
                arrayList2.add(resourceBriefInfo2);
            } else if (resourceBriefInfo2.getModifyTime() == modifyTime) {
                arrayList2.add(resourceBriefInfo2);
            }
        }
        if (arrayList2.size() <= 0) {
            return null;
        }
        return (ResourceBriefInfo) arrayList2.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e(SingleDailyMomentContent singleDailyMomentContent, SingleDailyMomentContent singleDailyMomentContent2) {
        return Long.compare(c(singleDailyMomentContent), c(singleDailyMomentContent2));
    }

    private void e(final IGetDailyMomentContentCallback iGetDailyMomentContentCallback) {
        ReleaseLogUtil.d("R_DataManager", "requestMarketResource");
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            ReleaseLogUtil.a("R_DataManager", "get marketingApi failed");
        } else {
            marketingApi.getResourceResultInfo(5001).addOnSuccessListener(new OnSuccessListener<Map<Integer, ResourceResultInfo>>() { // from class: ewq.3
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Map<Integer, ResourceResultInfo> map) {
                    ReleaseLogUtil.d("R_DataManager", "requestMarketResource onSuccess");
                    if (map == null || map.isEmpty()) {
                        ReleaseLogUtil.a("R_DataManager", "marketingResponse is invalid");
                        iGetDailyMomentContentCallback.onComplete(null);
                        return;
                    }
                    Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules(map);
                    if (mapFilterMarketingRules == null || mapFilterMarketingRules.isEmpty()) {
                        ReleaseLogUtil.e("R_DataManager", "filterResultInfoMap is invalid");
                        iGetDailyMomentContentCallback.onComplete(null);
                    } else {
                        if (mapFilterMarketingRules.containsKey(5001)) {
                            ResourceResultInfo resourceResultInfo = mapFilterMarketingRules.get(5001);
                            if (resourceResultInfo == null) {
                                ReleaseLogUtil.e("R_DataManager", "resourceResultInfo result is null");
                                iGetDailyMomentContentCallback.onComplete(null);
                                return;
                            } else {
                                iGetDailyMomentContentCallback.onComplete(resourceResultInfo);
                                return;
                            }
                        }
                        ReleaseLogUtil.e("R_DataManager", "resourceResultInfo not have daily marketing resource");
                        iGetDailyMomentContentCallback.onComplete(null);
                    }
                }
            });
        }
    }

    public static void d() {
        synchronized (ewq.class) {
            if (e != null) {
                e = null;
            }
        }
    }

    private int e(SingleDailyMomentContent singleDailyMomentContent, SingleDailyMomentContent singleDailyMomentContent2, int i) {
        int displayPriority;
        int displayPriority2;
        int iA;
        if (i == 1) {
            if (d(singleDailyMomentContent) && d(singleDailyMomentContent2)) {
                if (!singleDailyMomentContent.getAppearTime().equals(singleDailyMomentContent2.getAppearTime()) && (iA = a(singleDailyMomentContent.getAppearTime(), singleDailyMomentContent2.getAppearTime())) != 0) {
                    return iA;
                }
                displayPriority = singleDailyMomentContent2.getDisplayPriority();
                displayPriority2 = singleDailyMomentContent.getDisplayPriority();
            } else {
                if (d(singleDailyMomentContent)) {
                    return -1;
                }
                if (d(singleDailyMomentContent2)) {
                    return 1;
                }
                displayPriority = singleDailyMomentContent2.getDisplayPriority();
                displayPriority2 = singleDailyMomentContent.getDisplayPriority();
            }
            return displayPriority - displayPriority2;
        }
        if (d(singleDailyMomentContent) && d(singleDailyMomentContent2)) {
            if (!singleDailyMomentContent.getAppearTime().equals(singleDailyMomentContent2.getAppearTime())) {
                int iA2 = a(singleDailyMomentContent.getAppearTime(), singleDailyMomentContent2.getAppearTime());
                return iA2 == 0 ? d.nextInt() : iA2;
            }
            return d.nextInt();
        }
        if (d(singleDailyMomentContent)) {
            return -1;
        }
        if (d(singleDailyMomentContent2)) {
            return 1;
        }
        return d.nextInt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(SingleDailyMomentContent singleDailyMomentContent, SingleDailyMomentContent singleDailyMomentContent2, int i) {
        if (singleDailyMomentContent.getTimeRule() == 1 && singleDailyMomentContent2.getTimeRule() == 1) {
            return singleDailyMomentContent2.getDisplayPriority() - singleDailyMomentContent.getDisplayPriority();
        }
        if (singleDailyMomentContent.getTimeRule() == 1) {
            return d(singleDailyMomentContent2) ? 1 : -1;
        }
        if (singleDailyMomentContent2.getTimeRule() == 1) {
            return d(singleDailyMomentContent) ? -1 : 1;
        }
        return e(singleDailyMomentContent, singleDailyMomentContent2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(SingleDailyMomentContent singleDailyMomentContent, SingleDailyMomentContent singleDailyMomentContent2, int i) {
        if (singleDailyMomentContent.getTimeRule() == 1 && singleDailyMomentContent2.getTimeRule() == 1) {
            return d.nextInt();
        }
        if (singleDailyMomentContent.getTimeRule() == 1) {
            if (d(singleDailyMomentContent2)) {
                return 1;
            }
            return d.nextInt();
        }
        if (singleDailyMomentContent2.getTimeRule() == 1) {
            if (d(singleDailyMomentContent)) {
                return -1;
            }
            return d.nextInt();
        }
        return e(singleDailyMomentContent, singleDailyMomentContent2, i);
    }
}
