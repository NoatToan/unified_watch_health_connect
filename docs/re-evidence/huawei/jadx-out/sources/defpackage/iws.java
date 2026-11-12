package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.templates.BackgroundTemplate;
import com.huawei.health.marketing.datatype.templates.NavigationTemplate;
import com.huawei.health.marketing.datatype.templates.TrackPointSkinTemplate;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class iws {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static MarketingApi f38148a;
    private static int d;
    private static List<Integer> e;

    public static void e() {
        LogUtil.a("Track_SportAdManager", "requestMarketingSkin()");
        if (!CommonUtil.ab(BaseApplication.b())) {
            LogUtil.j("Track_SportAdManager", "requestMarketingSkin() network is not connect");
            return;
        }
        if (f38148a == null) {
            f38148a = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        }
        if (f38148a != null) {
            e = Arrays.asList(13002, 14001, 15001, 16001, 14002, 15002, 16002);
            d dVar = new d();
            f38148a.getResourceResultInfo(e).addOnFailureListener(dVar).addOnSuccessListener(dVar);
            return;
        }
        LogUtil.e("Track_SportAdManager", "requestMarketingSkin() mMarketingApi = null");
    }

    static class d implements OnSuccessListener<Map<Integer, ResourceResultInfo>>, OnFailureListener {
        private d() {
        }

        @Override // com.huawei.hmf.tasks.OnFailureListener
        public void onFailure(Exception exc) {
            LogUtil.e("Track_SportAdManager", "OnMarketingResponseListener onFailure(): ", LogAnonymous.b(exc));
            if (iws.d == 0) {
                iws.d++;
                iws.e();
            }
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final Map<Integer, ResourceResultInfo> map) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: iwu
                @Override // java.lang.Runnable
                public final void run() {
                    iws.e((Map<Integer, ResourceResultInfo>) map, (List<Integer>) iws.e);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Map<Integer, ResourceResultInfo> map, List<Integer> list) {
        if (f38148a == null) {
            f38148a = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        }
        if (f38148a == null || njy.e(list) || map == null || map.isEmpty()) {
            LogUtil.e("Track_SportAdManager", "handleMarketingSkin() marketingApi or skinPositions or resInfoMap is null or empty");
            return;
        }
        Map<Integer, ResourceResultInfo> mapFilterMarketingRules = f38148a.filterMarketingRules(new MarketingOption.Builder().setContext(BaseApplication.b()).setTypeId(50).setResultInfoMap(map).build());
        LogUtil.a("Track_SportAdManager", "handleMarketingSkin() first filterResInfoMap size: ", Integer.valueOf(mapFilterMarketingRules.size()));
        for (Map.Entry<Integer, ResourceResultInfo> entry : mapFilterMarketingRules.entrySet()) {
            Integer key = entry.getKey();
            key.intValue();
            ResourceResultInfo value = entry.getValue();
            if (value == null || value.getTotalNum() == 0 || njy.e(value.getResources())) {
                HashMap map2 = new HashMap();
                map2.put(key, map.get(key));
                mapFilterMarketingRules.put(key, f38148a.filterMarketingRules(map2).get(key));
            }
        }
        LogUtil.a("Track_SportAdManager", "handleMarketingSkin() second filterResInfoMap size: ", Integer.valueOf(mapFilterMarketingRules.size()));
        i();
        HashMap map3 = new HashMap();
        for (Map.Entry<Integer, ResourceResultInfo> entry2 : mapFilterMarketingRules.entrySet()) {
            if (list.contains(entry2.getKey())) {
                a(entry2.getValue(), entry2.getKey(), map3);
            }
        }
        if (map3.isEmpty()) {
            LogUtil.j("Track_SportAdManager", "handleMarketingSkin() skinsMap is empty");
        } else {
            LogUtil.a("Track_SportAdManager", "handleMarketingSkin() skinsMap size: ", Integer.valueOf(map3.size()));
        }
    }

    private static void a(ResourceResultInfo resourceResultInfo, Integer num, Map<Integer, MessageObject> map) {
        LogUtil.j("Track_SportAdManager", "parseMarketingSkin() resourceId: ", num);
        if (resourceResultInfo == null || njy.e(resourceResultInfo.getResources())) {
            LogUtil.j("Track_SportAdManager", "parseMarketingSkin() resourceResultInfo is null or empty");
            return;
        }
        List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
        Collections.sort(resources, new Comparator() { // from class: iwv
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return iws.c((ResourceBriefInfo) obj, (ResourceBriefInfo) obj2);
            }
        });
        Gson gson = new Gson();
        for (ResourceBriefInfo resourceBriefInfo : resources) {
            if (resourceBriefInfo == null || resourceBriefInfo.getContent() == null || TextUtils.isEmpty(resourceBriefInfo.getContent().getContent()) || !fxl.b(resourceBriefInfo.getEffectiveTime(), resourceBriefInfo.getExpirationTime())) {
                LogUtil.a("Track_SportAdManager", "resourceBriefInfo or content is null or empty");
            } else {
                MessageObject messageObjectE = e(resourceBriefInfo, resourceBriefInfo.getContent().getContent(), resourceBriefInfo.getContentType(), gson, num.intValue());
                if (messageObjectE != null) {
                    messageObjectE.setResBriefInfo(resourceBriefInfo);
                    map.put(num, messageObjectE);
                    return;
                }
            }
        }
    }

    static /* synthetic */ int c(ResourceBriefInfo resourceBriefInfo, ResourceBriefInfo resourceBriefInfo2) {
        int priority = resourceBriefInfo2.getPriority() - resourceBriefInfo.getPriority();
        return priority == 0 ? Long.compare(resourceBriefInfo2.getModifyTime(), resourceBriefInfo.getModifyTime()) : priority;
    }

    private static MessageObject e(ResourceBriefInfo resourceBriefInfo, String str, int i, Gson gson, int i2) {
        NavigationTemplate navigationTemplate;
        BackgroundTemplate backgroundTemplate;
        LogUtil.a("Track_SportAdManager", "parseSingleTemplate() contentStr: ", str, ", contentType: ", Integer.valueOf(i), ", resourceId: ", Integer.valueOf(i2));
        if (i == 56 || i == 57) {
            try {
                navigationTemplate = (NavigationTemplate) gson.fromJson(str, NavigationTemplate.class);
            } catch (JsonSyntaxException e2) {
                LogUtil.e("Track_SportAdManager", "NavigationTemplate exception: ", LogAnonymous.b(e2));
                navigationTemplate = null;
            }
            if (navigationTemplate == null || TextUtils.isEmpty(navigationTemplate.getPicture())) {
                LogUtil.j("Track_SportAdManager", "NavigationTemplate Picture is NULL");
                return null;
            }
            MessageObject messageObject = new MessageObject();
            messageObject.setImgUri(navigationTemplate.getPicture());
            String strC = peh.c(e(resourceBriefInfo, navigationTemplate));
            if (i == 56) {
                c(resourceBriefInfo, i2, navigationTemplate, strC);
            } else {
                a(resourceBriefInfo, i2, navigationTemplate, strC);
            }
            return messageObject;
        }
        if (i != 58) {
            if (i != 55) {
                LogUtil.j("Track_SportAdManager", "parseSingleTemplate() error contentType: ", Integer.valueOf(i));
                return null;
            }
            return d(resourceBriefInfo, str, gson);
        }
        try {
            backgroundTemplate = (BackgroundTemplate) gson.fromJson(str, BackgroundTemplate.class);
        } catch (JsonSyntaxException e3) {
            LogUtil.a("Track_SportAdManager", "BackgroundTemplate exception: ", LogAnonymous.b(e3));
            backgroundTemplate = null;
        }
        if (backgroundTemplate == null || TextUtils.isEmpty(backgroundTemplate.getMediaUrl()) || TextUtils.isEmpty(backgroundTemplate.getMediaType())) {
            LogUtil.a("Track_SportAdManager", "BackgroundTemplate MediaUrl or MediaType is NULL");
            return null;
        }
        MessageObject messageObject2 = new MessageObject();
        messageObject2.setImgUri(backgroundTemplate.getMediaUrl());
        messageObject2.setImgBigUri(backgroundTemplate.getTahitiMediaUrl());
        messageObject2.setType(backgroundTemplate.getMediaType());
        c(resourceBriefInfo, i2, backgroundTemplate);
        return messageObject2;
    }

    private static void c(ResourceBriefInfo resourceBriefInfo, int i, BackgroundTemplate backgroundTemplate) {
        jbq jbqVar = new jbq();
        jbqVar.a(resourceBriefInfo.getEffectiveTime());
        jbqVar.b(resourceBriefInfo.getExpirationTime());
        jbqVar.c(backgroundTemplate.getMediaUrl());
        jbqVar.a(backgroundTemplate.getTahitiMediaUrl());
        String strC = peh.c(jbqVar);
        if (i == 16001) {
            LogUtil.j("Track_SportAdManager", "BackgroundTemplate outdoor jsonStr: ", strC);
            e("SportAdSportingCountdownBgOutdoor", strC);
            b(backgroundTemplate.getMediaUrl());
            b(backgroundTemplate.getTahitiMediaUrl());
            c(i, resourceBriefInfo);
            return;
        }
        if (i == 16002) {
            LogUtil.j("Track_SportAdManager", "BackgroundTemplate indoor jsonStr: ", strC);
            e("SportAdSportingCountdownBgIndoor", strC);
            b(backgroundTemplate.getMediaUrl());
            b(backgroundTemplate.getTahitiMediaUrl());
            c(i, resourceBriefInfo);
            return;
        }
        LogUtil.j("Track_SportAdManager", "BackgroundTemplate error resourceId: ", Integer.valueOf(i));
    }

    private static void a(ResourceBriefInfo resourceBriefInfo, int i, NavigationTemplate navigationTemplate, String str) {
        if (i == 15001) {
            LogUtil.a("Track_SportAdManager", "NavigationTemplate pause sport outdoor jsonStr: ", str);
            e("SportAdSportingPauseIconOutdoor", str);
            b(navigationTemplate.getPicture());
            c(i, resourceBriefInfo);
            return;
        }
        if (i == 15002) {
            LogUtil.a("Track_SportAdManager", "NavigationTemplate pause sport outdoor jsonStr: ", str);
            e("SportAdSportingPauseIconIndoor", str);
            b(navigationTemplate.getPicture());
            c(i, resourceBriefInfo);
            return;
        }
        LogUtil.j("Track_SportAdManager", "NavigationTemplate pause sport error resourceId: ", Integer.valueOf(i));
    }

    private static void c(ResourceBriefInfo resourceBriefInfo, int i, NavigationTemplate navigationTemplate, String str) {
        if (i == 14001) {
            LogUtil.a("Track_SportAdManager", "NavigationTemplate start sport outdoor jsonStr: ", str);
            e("SportAdStartSportIconOutdoor", str);
            b(navigationTemplate.getPicture());
            c(i, resourceBriefInfo);
        } else if (i == 14002) {
            LogUtil.a("Track_SportAdManager", "NavigationTemplate start sport indoor jsonStr: ", str);
            e("SportAdStartSportIconIndoor", str);
            b(navigationTemplate.getPicture());
            c(i, resourceBriefInfo);
        } else {
            LogUtil.j("Track_SportAdManager", "NavigationTemplate start sport error resourceId: ", Integer.valueOf(i));
            return;
        }
        Intent intent = new Intent("refreshSportAdIconReceiver");
        intent.setPackage(BaseApplication.d());
        BaseApplication.b().sendBroadcast(intent, ive.f38078b);
    }

    private static jbq e(ResourceBriefInfo resourceBriefInfo, NavigationTemplate navigationTemplate) {
        jbq jbqVar = new jbq();
        jbqVar.a(resourceBriefInfo.getEffectiveTime());
        jbqVar.b(resourceBriefInfo.getExpirationTime());
        jbqVar.c(navigationTemplate.getPicture());
        return jbqVar;
    }

    private static MessageObject d(final ResourceBriefInfo resourceBriefInfo, String str, Gson gson) {
        TrackPointSkinTemplate trackPointSkinTemplate;
        try {
            trackPointSkinTemplate = (TrackPointSkinTemplate) gson.fromJson(str, TrackPointSkinTemplate.class);
        } catch (JsonSyntaxException e2) {
            LogUtil.a("Track_SportAdManager", "TrackPointSkinTemplate exception: ", LogAnonymous.b(e2));
            trackPointSkinTemplate = null;
        }
        if (trackPointSkinTemplate == null || TextUtils.isEmpty(trackPointSkinTemplate.getPicture()) || TextUtils.isEmpty(trackPointSkinTemplate.getBackgroundIcon())) {
            LogUtil.a("Track_SportAdManager", "TrackPointSkinTemplate picture or background is NULL");
            return null;
        }
        MessageObject messageObject = new MessageObject();
        messageObject.setImgUri(trackPointSkinTemplate.getPicture());
        messageObject.setImgBigUri(trackPointSkinTemplate.getBackgroundIcon());
        c(13002, resourceBriefInfo);
        b(trackPointSkinTemplate.getPicture());
        qqf.a(trackPointSkinTemplate.getPicture(), new CustomTarget<Bitmap>() { // from class: iws.5
            @Override // com.bumptech.glide.request.target.Target
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onResourceReady(Bitmap bitmap, Transition<? super Bitmap> transition) throws Throwable {
                LogUtil.a("Track_SportAdManager", "TrackPointSkinTemplate icon onResourceReady()");
                String strA = iws.a(bitmap, resourceBriefInfo, true);
                LogUtil.a("Track_SportAdManager", "TrackPointSkinTemplate icon jsonStr: ", strA);
                iws.e("SportAdSportingIconOutdoor", strA);
                iws.j();
            }

            @Override // com.bumptech.glide.request.target.Target
            public void onLoadCleared(Drawable drawable) {
                LogUtil.a("Track_SportAdManager", " TrackPointSkinTemplate icon onLoadCleared()");
            }
        });
        b(trackPointSkinTemplate.getBackgroundIcon());
        qqf.a(trackPointSkinTemplate.getBackgroundIcon(), new CustomTarget<Bitmap>() { // from class: iws.1
            @Override // com.bumptech.glide.request.target.Target
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onResourceReady(Bitmap bitmap, Transition<? super Bitmap> transition) throws Throwable {
                LogUtil.a("Track_SportAdManager", "TrackPointSkinTemplate background icon onResourceReady()");
                String strA = iws.a(bitmap, resourceBriefInfo, false);
                LogUtil.a("Track_SportAdManager", "TrackPointSkinTemplate background icon jsonStr: ", strA);
                iws.e("SportAdSportingIconBgOutdoor", strA);
                iws.j();
            }

            @Override // com.bumptech.glide.request.target.Target
            public void onLoadCleared(Drawable drawable) {
                LogUtil.a("Track_SportAdManager", "TrackPointSkinTemplate background icon onLoadCleared()");
            }
        });
        return messageObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String a(Bitmap bitmap, ResourceBriefInfo resourceBriefInfo, boolean z) throws Throwable {
        jbq jbqVar = new jbq();
        jbqVar.a(resourceBriefInfo.getEffectiveTime());
        jbqVar.b(resourceBriefInfo.getExpirationTime());
        String strE = qqf.e("Track_SportAdManager_" + System.currentTimeMillis(), bitmap, Bitmap.CompressFormat.PNG, true);
        if (z) {
            jbqVar.c(strE);
        } else {
            jbqVar.b(strE);
        }
        return peh.c(jbqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j() {
        LogUtil.a("Track_SportAdManager", "sendRefreshSportingIconDataBroadcast()");
        Intent intent = new Intent("refreshSportingIconDataReceiver");
        intent.setPackage(BaseApplication.d());
        BaseApplication.b().sendBroadcast(intent, ive.f38078b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str, String str2) {
        SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(20002), str, str2, null);
    }

    private static void c(int i, ResourceBriefInfo resourceBriefInfo) {
        e("SportAdMarketingBi_" + i, peh.c(resourceBriefInfo));
    }

    public static jbq d(String str) {
        String strE = SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(20002), str);
        LogUtil.a("Track_SportAdManager", "getSportAdData() read key: ", str, ", jsonStr: ", strE);
        jbq jbqVar = (jbq) peh.b(strE, jbq.class);
        if (jbqVar == null || !jbqVar.d()) {
            return null;
        }
        return jbqVar;
    }

    public static ResourceBriefInfo e(int i) {
        String strE = SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(20002), "SportAdMarketingBi_" + i);
        LogUtil.a("Track_SportAdManager", "getSportAdMarketingBiObj() read resPositionId: ", Integer.valueOf(i), ", jsonStr: ", strE);
        return (ResourceBriefInfo) peh.b(strE, ResourceBriefInfo.class);
    }

    private static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Track_SportAdManager", "preloadImage() error, imageUrl is null or empty");
            return;
        }
        qqf.c(BaseApplication.b(), str, new RequestOptions().diskCacheStrategy(DiskCacheStrategy.DATA), new RequestListener<Drawable>() { // from class: iws.2
            @Override // com.bumptech.glide.request.RequestListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                return true;
            }

            @Override // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
                return true;
            }
        });
    }

    private static void i() {
        f();
        a();
        e("SportAdStartSportIconOutdoor", "");
        e("SportAdStartSportIconIndoor", "");
        e("SportAdSportingCountdownBgOutdoor", "");
        e("SportAdSportingCountdownBgIndoor", "");
        e("SportAdSportingIconOutdoor", "");
        e("SportAdSportingIconBgOutdoor", "");
        e("SportAdSportingPauseIconOutdoor", "");
        e("SportAdSportingPauseIconIndoor", "");
    }

    private static void a() {
        jbq jbqVarD = d("SportAdSportingIconBgOutdoor");
        if (jbqVarD == null) {
            LogUtil.a("Track_SportAdManager", "deleteAdBackground: oldSportAdDataBackground is null");
            return;
        }
        String strB = jbqVarD.b();
        if (TextUtils.isEmpty(strB)) {
            LogUtil.a("Track_SportAdManager", "deleteAdBackground: iconPath is empty");
            return;
        }
        File file = new File(strB);
        if (!file.exists()) {
            LogUtil.a("Track_SportAdManager", "deleteAdBackground: file is not exists");
        } else if (file.delete()) {
            LogUtil.a("Track_SportAdManager", "TrackPointSkinTemplate delete old background icon success, oldIconPath: ", strB);
        } else {
            LogUtil.a("Track_SportAdManager", "TrackPointSkinTemplate delete old background icon failed");
        }
    }

    private static void f() {
        jbq jbqVarD = d("SportAdSportingIconOutdoor");
        if (jbqVarD == null) {
            LogUtil.a("Track_SportAdManager", "deleteAdIcon: oldSportAdDataIcon is null");
            return;
        }
        String strE = jbqVarD.e();
        if (TextUtils.isEmpty(strE)) {
            LogUtil.a("Track_SportAdManager", "deleteAdIcon: iconPath is empty");
            return;
        }
        File file = new File(strE);
        if (!file.exists()) {
            LogUtil.a("Track_SportAdManager", "deleteAdIcon: file is not exists");
        } else if (file.delete()) {
            LogUtil.a("Track_SportAdManager", "resetSportAdAllData() delete old icon success, oldIconPath: ", strE);
        } else {
            LogUtil.a("Track_SportAdManager", "resetSportAdAllData() delete old icon failed");
        }
    }
}
