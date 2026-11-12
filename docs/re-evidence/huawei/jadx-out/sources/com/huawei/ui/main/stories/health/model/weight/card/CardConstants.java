package com.huawei.ui.main.stories.health.model.weight.card;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.socialshare.model.SaveBitampCallback;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.trade.JsTradeApi;
import com.huawei.operation.js.JsInteractAddition;
import com.huawei.ui.commonui.base.Consumable;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.model.weight.card.CardConstants;
import defpackage.ddv;
import defpackage.gxt;
import defpackage.lmf;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qrs;
import defpackage.uxb;
import defpackage.vgp;
import defpackage.vhn;
import defpackage.wpl;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class CardConstants {

    /* JADX INFO: loaded from: classes43.dex */
    public enum CardType implements Consumable.ConsumableType {
        FASTING_CARD,
        DIET_CARD,
        INTERMITTENT_PERIOD
    }

    public static String c() {
        vgp vgpVarB = vhn.b();
        if (vgpVarB == null || !vgpVarB.c()) {
            return "0";
        }
        if (vgpVarB.d() == null || vgpVarB.d().d() == null || vgpVarB.d().d().i() > 0) {
            return "1";
        }
        uxb.c().d();
        if (uxb.c().e()) {
            return "2";
        }
        return "3";
    }

    private static String c(String str) {
        String str2 = wpl.b("WeightCardConstructor") + "img/" + str + ".webp";
        LogUtil.a("CardConstants", "getPicFilePath picName: ", str, ", img: ", str2);
        return CommonUtil.c(str2);
    }

    public static boolean e() {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.weight_diet_diary_status");
        return userPreference != null && TextUtils.equals("true", userPreference.getValue());
    }

    public static void a() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: uxa
            @Override // java.lang.Runnable
            public final void run() {
                CardConstants.h();
            }
        });
    }

    public static /* synthetic */ void h() {
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("custom.weight_diet_diary_status");
        hiUserPreference.setValue(String.valueOf(true));
        LogUtil.a("CardConstants", "joinDietDiary = ", Boolean.valueOf(HiHealthManager.d(BaseApplication.getContext()).setUserPreference(hiUserPreference)));
        i();
    }

    private static void i() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(10026);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    public static BitmapDrawable d(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("R_CardConstants", "context or path is null, leave getWeightShareBackground");
            return null;
        }
        BitmapDrawable bitmapDrawableB = qqf.b(c(str));
        if (!LanguageUtil.ba(context)) {
            return bitmapDrawableB;
        }
        LogUtil.a("CardConstants", "is RTLLanguage, getMirrorBitmapDrawable");
        return qqz.e(context, bitmapDrawableB);
    }

    public static List<Bitmap> d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(qqf.c(R.mipmap.hw_health_edit_share_photo_pic));
        arrayList.add(qqf.f(c("weight_share_background_small_1")));
        arrayList.add(qqf.f(c("weight_share_background_small_2")));
        arrayList.add(qqf.f(c("weight_share_background_small_3")));
        return arrayList;
    }

    public static List<Bitmap> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(qqf.f(c("weight_share_data_small_0")));
        arrayList.add(qqf.f(c("weight_share_data_small_1")));
        arrayList.add(qqf.f(c("weight_share_data_small_2")));
        return arrayList;
    }

    public static List<Bitmap> d(Resources resources) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(BitmapFactory.decodeResource(resources, R.mipmap.weight_share_data_small_0));
        arrayList.add(BitmapFactory.decodeResource(resources, R.mipmap.weight_share_data_small_1));
        arrayList.add(BitmapFactory.decodeResource(resources, R.mipmap.weight_share_data_small_2));
        return arrayList;
    }

    public static int d(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return calendar.get(11);
    }

    public static void a(gxt gxtVar, final Context context, AnalyticsValue analyticsValue) {
        gxtVar.a(1);
        gxtVar.f(false);
        gxtVar.d("13");
        HashMap map = new HashMap(1);
        map.put("click", 1);
        gxtVar.c(map);
        gxtVar.e(false);
        if (CommonUtil.ca()) {
            gxtVar.c(new SaveBitampCallback() { // from class: com.huawei.ui.main.stories.health.model.weight.card.CardConstants.2
                @Override // com.huawei.health.socialshare.model.SaveBitampCallback
                public void onSuccess(Uri uri) {
                    SharedPreferenceManager.e(context, JsInteractAddition.BI_ERROR_CODE_INVALID_AT, "SP_REPORT_BODY", uri.toString(), null);
                }

                @Override // com.huawei.health.socialshare.model.SaveBitampCallback
                public void onFail(int i) {
                    LogUtil.j("CardConstants", "shareWeightFragment shareToLocal err = ", Integer.valueOf(i));
                }
            });
        }
        ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(gxtVar, context);
        lmf.d().c(context, analyticsValue.value(), map, 0);
    }

    public static void b(Context context, String str) {
        LogUtil.a("CardConstants", "openFastingLiteH5 enter");
        if (qrs.r()) {
            LogUtil.j("CardConstants", "openFastingLiteH5 isFastClick");
            return;
        }
        if (context == null) {
            LogUtil.j("CardConstants", "openFastingLiteH5 but context = null");
            return;
        }
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath(str);
        builder.addCustomizeJsModule("tradeApi", JsTradeApi.class);
        ddv.b().loadH5ProApp(context, "com.huawei.health.h5.fasting-lite", builder);
    }

    public static void c(HealthTextView healthTextView) {
        if (healthTextView == null) {
            return;
        }
        healthTextView.setAutoTextInfo(10, 1, 1);
    }
}
