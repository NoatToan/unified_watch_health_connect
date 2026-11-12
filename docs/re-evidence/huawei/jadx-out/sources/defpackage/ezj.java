package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.utils.vippage.PromotionPolicyActivity;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.trade.datatype.PromotionPolicyInfo;

/* JADX INFO: loaded from: classes.dex */
public class ezj {
    public static boolean d() {
        long jA = a();
        int iC = c();
        long jCurrentTimeMillis = System.currentTimeMillis();
        LogUtil.a("PromotionPolicyDialogUtils", "checkPromotionPolicyShowStatus: lastShowTime is ", Long.valueOf(jA), "showCount is :", Integer.valueOf(iC));
        if (jA > 0 && lsl.a(jA, jCurrentTimeMillis) > 30) {
            b();
            LogUtil.a("PromotionPolicyDialogUtils", "checkPromotionPolicyShowStatus: More than 30 days since last show");
            return true;
        }
        if (lsl.c(jCurrentTimeMillis, jA)) {
            LogUtil.a("PromotionPolicyDialogUtils", "checkPromotionPolicyShowStatus: today already showed");
            return false;
        }
        if (iC < 3) {
            return true;
        }
        LogUtil.a("PromotionPolicyDialogUtils", "checkPromotionPolicyShowStatus: already shown 3 times in 30 days");
        return false;
    }

    private static long a() {
        return lua.d("promotion_policy_sp", "last_show_time", 0L);
    }

    private static int c() {
        return lua.b("promotion_policy_sp", "show_count", 0);
    }

    private static void b() {
        lua.c("promotion_policy_sp", "show_count", 0);
        lua.a("promotion_policy_sp", "last_show_time", 0L);
    }

    private static void e() {
        lua.c("promotion_policy_sp", "show_count", c() + 1);
        lua.a("promotion_policy_sp", "last_show_time", System.currentTimeMillis());
    }

    public static void b(final PromotionPolicyInfo promotionPolicyInfo, final Activity activity, final String str) {
        String dialogPicUrl;
        if (HandlerExecutor.c()) {
            LogUtil.a("PromotionPolicyDialogUtils", "preloadPromotionPolicyImage() is in ui tread ");
            ThreadPoolManager.c().execute(new Runnable() { // from class: ezk
                @Override // java.lang.Runnable
                public final void run() {
                    ezj.b(promotionPolicyInfo, activity, str);
                }
            });
            return;
        }
        if (promotionPolicyInfo == null || activity == null) {
            LogUtil.j("PromotionPolicyDialogUtils", "preloadPromotionPolicyImage() error, promotionInfo is null or activity is null");
            return;
        }
        if (activity.isDestroyed() || activity.isFinishing()) {
            LogUtil.j("PromotionPolicyDialogUtils", "preloadPromotionPolicyImage() error, activity is Destroyed or activity is Finishing");
            return;
        }
        if (qrs.af(activity)) {
            dialogPicUrl = promotionPolicyInfo.getTahitiDialogPicUrl();
        } else {
            dialogPicUrl = promotionPolicyInfo.getDialogPicUrl();
        }
        if (TextUtils.isEmpty(dialogPicUrl)) {
            LogUtil.j("PromotionPolicyDialogUtils", "preloadPromotionPolicyImage() error, imageUrl is null or empty");
            return;
        }
        RequestOptions requestOptionsDiskCacheStrategy = new RequestOptions().skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.DATA);
        RequestListener<Drawable> requestListener = new RequestListener<Drawable>() { // from class: ezj.1
            @Override // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(GlideException glideException, Object obj, Target<Drawable> target, boolean z) {
                LogUtil.j("PromotionPolicyDialogUtils", "preloadPromotionPolicyImage failed");
                return true;
            }

            @Override // com.bumptech.glide.request.RequestListener
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public boolean onResourceReady(Drawable drawable, Object obj, Target<Drawable> target, DataSource dataSource, boolean z) {
                LogUtil.a("PromotionPolicyDialogUtils", "preloadPromotionPolicyImage success");
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    ezj.c(activity, promotionPolicyInfo, str);
                    return true;
                }
                LogUtil.j("PromotionPolicyDialogUtils", "preloadPromotionPolicyImage activity is finishing or destroyed");
                return true;
            }
        };
        e();
        qqf.c(BaseApplication.getActivity(), dialogPicUrl, requestOptionsDiskCacheStrategy, requestListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final Activity activity, final PromotionPolicyInfo promotionPolicyInfo, final String str) {
        HandlerExecutor.b(new Runnable() { // from class: ezm
            @Override // java.lang.Runnable
            public final void run() {
                ezj.e(activity, promotionPolicyInfo, str);
            }
        });
    }

    static /* synthetic */ void e(Activity activity, PromotionPolicyInfo promotionPolicyInfo, String str) {
        Intent intent = new Intent(activity, (Class<?>) PromotionPolicyActivity.class);
        intent.putExtra("promotionPolicyInfo", qqt.b(promotionPolicyInfo));
        intent.putExtra("showPage", str);
        activity.startActivity(intent);
    }
}
