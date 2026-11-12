package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.up.utils.Constants;
import health.compact.a.Services;
import java.sql.Timestamp;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes13.dex */
public class osb {
    public static boolean c(Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = context.getApplicationContext().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = systemService instanceof ConnectivityManager ? ((ConnectivityManager) systemService).getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static String b(Context context) {
        PluginAchieveAdapter adapter = oru.a(context).getAdapter();
        if (adapter != null) {
            return adapter.getInfo(new String[]{Constants.METHOD_GET_USER_INFO}).get("picPath");
        }
        return "";
    }

    public static String e(Context context) {
        PluginAchieveAdapter adapter = oru.a(context).getAdapter();
        if (adapter != null) {
            return adapter.getInfo(new String[]{Constants.METHOD_GET_USER_INFO}).get("name");
        }
        return "";
    }

    public static String b() {
        return ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).getShareNickName();
    }

    public static boolean d() {
        return ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).isShowUserInfo();
    }

    public static void c(Context context, Bitmap bitmap, String str, Map<String, Object> map) {
        gxt gxtVar = new gxt(1);
        gxtVar.e((String) null);
        gxtVar.b((String) null);
        gxtVar.d(bitmap);
        gxtVar.f((String) null);
        gxtVar.d(str);
        gxtVar.f(true);
        gxtVar.a(1);
        gxtVar.e(false);
        if (map != null) {
            gxtVar.c(map);
        }
        if (AnalyticsValue.SUCCESSES_SHARE_1100011.value().equals(str)) {
            gxtVar.d(5);
        }
        ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(gxtVar, context);
    }

    public static void e(Context context, String str, String str2, Map<String, Object> map) {
        gxt gxtVar = new gxt(4);
        gxtVar.e((String) null);
        gxtVar.b((String) null);
        gxtVar.c(str);
        gxtVar.f((String) null);
        gxtVar.d(str2);
        gxtVar.f(false);
        gxtVar.a(1);
        gxtVar.e(false);
        if (AnalyticsValue.SUCCESSES_SHARE_1100011.value().equals(str2)) {
            gxtVar.d(5);
        }
        gxtVar.c(map);
        ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(gxtVar, context);
    }

    public static void c(String str, final ImageView imageView) {
        LogUtil.a("PluginAchieveUtils", "get headImg with PortraitUrl");
        if (!TextUtils.isEmpty(str)) {
            qqf.a(str, new CustomTarget<Bitmap>() { // from class: osb.4
                @Override // com.bumptech.glide.request.target.Target
                public void onLoadCleared(Drawable drawable) {
                }

                @Override // com.bumptech.glide.request.target.Target
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onResourceReady(Bitmap bitmap, Transition<? super Bitmap> transition) {
                    ImageView imageView2;
                    final Bitmap bitmapC = ouf.c(bitmap);
                    if (bitmapC == null || (imageView2 = imageView) == null) {
                        return;
                    }
                    imageView2.post(new Runnable() { // from class: osb.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap(bitmapC);
                        }
                    });
                }

                @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
                public void onLoadFailed(Drawable drawable) {
                    LogUtil.j("PluginAchieveUtils", "get user head image error");
                    super.onLoadFailed(drawable);
                }
            });
        } else {
            LogUtil.a("PluginAchieveUtils", "showUserHeadImage headImgPath is null! ");
        }
    }

    public static boolean a(String str) {
        boolean z;
        LogUtil.a("PluginAchieveUtils", "lastCheckInTime = ", str);
        boolean z2 = false;
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (str.length() <= 10) {
                String strReplaceAll = String.valueOf(new Timestamp(System.currentTimeMillis())).substring(0, 10).replaceAll(com.huawei.openalliance.ad.constant.Constants.LINK, "");
                int i = Integer.parseInt(str);
                int i2 = Integer.parseInt(strReplaceAll);
                try {
                    if (i != i2) {
                        if (Math.abs(i - i2) <= 1) {
                            osa.b(BaseApplication.getContext(), "kakaLastCheckInTime", "");
                        } else {
                            LogUtil.a("PluginAchieveUtils", "not check in today");
                            z = false;
                        }
                        LogUtil.a("PluginAchieveUtils", "isTodayCheckedIn = ", Boolean.valueOf(z));
                        return z;
                    }
                    LogUtil.a("PluginAchieveUtils", "isTodayCheckedIn = ", Boolean.valueOf(z));
                    return z;
                } catch (NumberFormatException unused) {
                    z2 = z;
                    LogUtil.e("PluginAchieveUtils", "isTodayCheckedIn NumberFormatException");
                    return z2;
                }
                z = true;
            } else {
                return b(str);
            }
        } catch (NumberFormatException unused2) {
        }
    }

    private static boolean b(String str) {
        long j;
        boolean z = false;
        try {
            String[] strArrSplit = str.split(":");
            LogUtil.a("PluginAchieveUtils", "checkTime length = ", Integer.valueOf(strArrSplit.length));
            if (strArrSplit.length >= 2) {
                long j2 = Long.parseLong(strArrSplit[0]);
                int i = Integer.parseInt(strArrSplit[1]);
                int rawOffset = TimeZone.getDefault().getRawOffset();
                j = (((long) rawOffset) + j2) - ((long) i);
                LogUtil.a("PluginAchieveUtils", "time = ", Long.valueOf(j2), " rawOffset = ", Integer.valueOf(i), " curRawOffset = ", Integer.valueOf(rawOffset));
                LogUtil.a("PluginAchieveUtils", "lastCheckInTime = ", Long.valueOf(j));
            } else {
                j = Long.parseLong(str);
            }
            boolean z2 = !pap.e(j, System.currentTimeMillis());
            try {
                LogUtil.a("PluginAchieveUtils", "isTodayCheckedInOld = ", Boolean.valueOf(z2));
                return z2;
            } catch (NumberFormatException e) {
                z = z2;
                e = e;
                LogUtil.e("PluginAchieveUtils", "isTodayCheckedInOld: exception -> " + e.getMessage());
                return z;
            }
        } catch (NumberFormatException e2) {
            e = e2;
        }
    }
}
