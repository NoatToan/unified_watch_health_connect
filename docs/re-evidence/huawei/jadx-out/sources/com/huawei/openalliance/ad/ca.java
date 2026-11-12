package com.huawei.openalliance.ad;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.huawei.openalliance.ad.activity.CustomLandingDetailActivity;
import com.huawei.openalliance.ad.activity.DomesticDsaActivity;
import com.huawei.openalliance.ad.activity.LandingDetailsActivity;
import com.huawei.openalliance.ad.activity.OpenPrivacyPerActivity;
import com.huawei.openalliance.ad.activity.PPSInterstitialAdActivity;
import com.huawei.openalliance.ad.activity.PPSRewardActivity;
import com.huawei.openalliance.ad.activity.PPSShareActivity;
import com.huawei.openalliance.ad.activity.SafeIntent;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.MapNameConstants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.IAd;
import com.huawei.openalliance.ad.inter.data.ImageInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;

/* JADX INFO: loaded from: classes12.dex */
public class ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f18334a;

    private static Class b() {
        return Build.VERSION.SDK_INT == 26 ? CustomLandingDetailActivity.class : LandingDetailsActivity.class;
    }

    private static boolean a(com.huawei.openalliance.ad.inter.data.e eVar) {
        String str;
        if (com.huawei.openalliance.ad.utils.ah.a()) {
            str = "repeat click too fast";
        } else {
            if (eVar != null) {
                return false;
            }
            str = "nativeAd is null";
        }
        hw.a("ActivityStarter", str);
        return true;
    }

    public static boolean a(Context context, com.huawei.openalliance.ad.inter.data.i iVar) {
        if (context == null || iVar == null) {
            return false;
        }
        try {
            Intent intent = new Intent();
            intent.setClassName(context, Constants.REWARD_ACTIVITY_NAME);
            String uniqueId = iVar.getUniqueId();
            PPSRewardActivity.a(uniqueId, iVar.ae());
            PPSRewardActivity.a(uniqueId, iVar.ac());
            df.a(iVar);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setClipData(Constants.CLIP_DATA);
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            hw.a(3, th);
            hw.b("ActivityStarter", "startRewardActivty error, %s", th.getClass().getSimpleName());
            return false;
        }
    }

    public static boolean a(Context context, com.huawei.openalliance.ad.inter.data.d dVar) {
        if (context == null || dVar == null) {
            return false;
        }
        try {
            Intent intent = new Intent();
            intent.setClassName(context, Constants.INTERSTITIAL_ACTIVITY_NAME);
            PPSInterstitialAdActivity.a(dVar.getUniqueId(), dVar.ai());
            df.b(dVar);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setClipData(Constants.CLIP_DATA);
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            hw.a(3, th);
            hw.b("ActivityStarter", "startInterstitialActivity error, %s", th.getClass().getSimpleName());
            return false;
        }
    }

    private static boolean a() {
        if (System.currentTimeMillis() - f18334a < 500) {
            return true;
        }
        f18334a = System.currentTimeMillis();
        return false;
    }

    private static void a(Intent intent, hg hgVar) {
        if (intent == null || hgVar == null) {
            return;
        }
        hw.b("ActivityStarter", "parseLinkedAdConfig.");
        intent.putExtra(MapKeyNames.LINKED_AD_DATA, com.huawei.openalliance.ad.utils.bk.b(hgVar));
    }

    public static void a(Context context, String str) {
        if (a()) {
            hw.b("ActivityStarter", "start privacy or permission, fast click.");
            return;
        }
        try {
            Intent intent = new Intent(context, (Class<?>) OpenPrivacyPerActivity.class);
            intent.putExtra("url", str);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            com.huawei.openalliance.ad.utils.dk.a(context, intent);
        } catch (Throwable th) {
            hw.c("ActivityStarter", "start PriPer err, %s", th.getClass().getSimpleName());
        }
    }

    public static void a(Context context, com.huawei.openalliance.ad.inter.data.e eVar, ContentRecord contentRecord) {
        ImageInfo imageInfo;
        hw.a("ActivityStarter", "startComplianceActivity");
        if (a(eVar)) {
            return;
        }
        try {
            Intent intent = new Intent(context, (Class<?>) PPSShareActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.putExtra("title", eVar.getTitle());
            intent.putExtra("description", eVar.getDescription());
            if (eVar.getImageInfos() != null && !eVar.getImageInfos().isEmpty() && (imageInfo = eVar.getImageInfos().get(0)) != null) {
                intent.putExtra("imageUrl", imageInfo.getUrl());
            }
            intent.putExtra(MapKeyNames.CONTENT_RECORD, com.huawei.openalliance.ad.utils.bk.b(contentRecord));
            intent.putExtra(JsbMapKeyNames.H5_CSHARE_URL, eVar.aD());
            com.huawei.openalliance.ad.utils.dk.a(context, intent);
        } catch (Throwable th) {
            hw.c("ActivityStarter", "start Activity error: %s", th.getClass().getSimpleName());
        }
    }

    public static void a(Context context, IAd iAd, MaterialClickInfo materialClickInfo) {
        hw.b("ActivityStarter", "start landing detail activity external jump start.");
        if (iAd == null || iAd.getAppInfo() == null || TextUtils.isEmpty(iAd.getAppInfo().getAppDetailUrl())) {
            hw.b("ActivityStarter", "start landing detail activity native detail url is empty.");
            return;
        }
        SafeIntent safeIntent = new SafeIntent(new Intent(context, (Class<?>) b()));
        if (iAd instanceof com.huawei.openalliance.ad.inter.data.d) {
            df.a((com.huawei.openalliance.ad.inter.data.d) iAd);
        } else {
            safeIntent.putExtra(MapKeyNames.APP_DETAIL_DATA, iAd);
        }
        if (materialClickInfo != null && com.huawei.openalliance.ad.utils.dg.r(materialClickInfo.f()) && materialClickInfo.b() != null) {
            safeIntent.putExtra("click_info", com.huawei.openalliance.ad.utils.bk.b(materialClickInfo));
        }
        a(context, safeIntent);
    }

    public static void a(Context context, AdLandingPageData adLandingPageData, MaterialClickInfo materialClickInfo) {
        hw.b("ActivityStarter", "start landing detail activity internal jump start.");
        if (adLandingPageData == null || adLandingPageData.getAppInfo() == null || TextUtils.isEmpty(adLandingPageData.getAppInfo().getAppDetailUrl())) {
            hw.b("ActivityStarter", "start landing detail activity landingPageData detail url is empty.");
            return;
        }
        SafeIntent safeIntent = new SafeIntent(new Intent(context, (Class<?>) b()));
        safeIntent.putExtra(MapKeyNames.APP_DETAIL_DATA, adLandingPageData);
        if (materialClickInfo != null && com.huawei.openalliance.ad.utils.dg.r(materialClickInfo.f()) && materialClickInfo.b() != null) {
            safeIntent.putExtra("click_info", com.huawei.openalliance.ad.utils.bk.b(materialClickInfo));
        }
        a(context, safeIntent);
    }

    private static void a(Context context, SafeIntent safeIntent) {
        try {
            safeIntent.setFlags(65536);
            if (!(context instanceof Activity)) {
                safeIntent.addFlags(268435456);
            }
            com.huawei.openalliance.ad.utils.dk.a(context, safeIntent);
        } catch (Throwable th) {
            hw.d("ActivityStarter", "start landing detail Activity error: %s", th.getClass().getSimpleName());
        }
    }

    public static void a(Context context, View view, int[] iArr, ContentRecord contentRecord) {
        String str;
        hw.b("ActivityStarter", "start domestic dsa activity");
        if (view == null) {
            return;
        }
        if (contentRecord == null || !contentRecord.bf() || com.huawei.openalliance.ad.utils.dg.b(contentRecord.be())) {
            str = "start domestic dsa activity failed, switch close or empty url.";
        } else {
            if (iArr != null && iArr.length == 2) {
                a(context, view, contentRecord, iArr);
                return;
            }
            str = "invalid location array.";
        }
        hw.b("ActivityStarter", str);
    }

    private static void a(Context context, View view, ContentRecord contentRecord, int[] iArr) {
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new hn(view, context, iArr2));
        int[] iArr3 = {view.getMeasuredWidth(), view.getMeasuredHeight()};
        SafeIntent safeIntent = new SafeIntent(new Intent(context, (Class<?>) DomesticDsaActivity.class));
        safeIntent.putExtra(MapKeyNames.DSA_URL, contentRecord.be());
        safeIntent.putExtra(MapKeyNames.ANCHOR_LOCATION, iArr);
        safeIntent.putExtra(MapKeyNames.ANCHOR_SIZE, iArr3);
        safeIntent.setFlags(65536);
        if (!(context instanceof Activity)) {
            safeIntent.addFlags(268435456);
        }
        safeIntent.setClipData(Constants.CLIP_DATA);
        com.huawei.openalliance.ad.utils.dk.a(context, safeIntent);
    }

    public static void a(Context context, View view, ContentRecord contentRecord) {
        hw.b("ActivityStarter", "start domestic dsa activity");
        if (view == null) {
            return;
        }
        if (contentRecord == null || !contentRecord.bf() || com.huawei.openalliance.ad.utils.dg.b(contentRecord.be())) {
            hw.b("ActivityStarter", "start domestic dsa activity failed, switch close or empty url.");
            return;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        hw.b("ActivityStarter", "startDomesticDsaActivity, anchorView.getLocationInWindow [x,y]= %d, %d", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
        a(context, view, contentRecord, iArr);
    }

    public static String a(Context context, AdLandingPageData adLandingPageData, hg hgVar, ContentRecord contentRecord, boolean z) {
        try {
            Intent intent = new Intent();
            intent.setClassName(context, "com.huawei.openalliance.ad.activity.PPSActivity");
            intent.putExtra(MapNameConstants.AD_LANDING_PAGE_DATA, adLandingPageData);
            intent.putExtra(MapKeyNames.FROM_LIFECYCLE_LISTENER, z);
            a(intent, hgVar);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setClipData(Constants.CLIP_DATA);
            context.startActivity(intent);
            return "success";
        } catch (Throwable th) {
            hw.a(3, th);
            hw.b("ActivityStarter", "startAdActivity error, %s", th.getClass().getSimpleName());
            return th.getClass().getSimpleName();
        }
    }
}
