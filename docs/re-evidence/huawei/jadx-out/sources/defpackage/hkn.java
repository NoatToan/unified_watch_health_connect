package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.suggestion.R;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class hkn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CommonDialog21 f36844a = null;

    public void a(Activity activity, String str, int i, FitWorkout fitWorkout) {
        if (activity == null || TextUtils.isEmpty(str) || fitWorkout == null) {
            LogUtil.j("Suggestion_TrailDetailSharedHelper", "activity is null or sharedTitle is null or fitWorkout is null");
            return;
        }
        HashMap map = new HashMap(10);
        map.put("click", 1);
        idy.b("1130059", map);
        gxt gxtVar = new gxt(2);
        gxtVar.d(0);
        HashMap map2 = new HashMap(10);
        map2.put("click", 1);
        map2.put(Constants.BI_MODULE_ID, "1140001119");
        map2.put("name", str);
        map2.put("resourceType", Integer.valueOf(fitWorkout.acquireCommodityFlag()));
        gxtVar.c(map2);
        gxtVar.d(AnalyticsValue.SHARE_1140001.value());
        gxtVar.e(str);
        gxtVar.b(b(fitWorkout.acquireUsers()));
        String topicPreviewPicUrl = fitWorkout.getTopicPreviewPicUrl();
        b(activity);
        if (!TextUtils.isEmpty(topicPreviewPicUrl)) {
            new b(topicPreviewPicUrl, gxtVar).execute(new String[0]);
        } else {
            gxtVar.d(a());
        }
        d(activity, i, fitWorkout, gxtVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(gxt gxtVar) {
        if (TextUtils.isEmpty(gxtVar.v())) {
            LogUtil.j("Suggestion_TrailDetailSharedHelper", "doShared, shareContent.getShareUrlContent() is empty");
        } else {
            LogUtil.a("Suggestion_TrailDetailSharedHelper", "doShared, shareContent.getShareUrlContent() = ", gxtVar.v());
            ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).exeShare(gxtVar, BaseApplication.b());
        }
    }

    private void d(final Activity activity, final int i, final FitWorkout fitWorkout, final gxt gxtVar) {
        final GrsQueryCallback grsQueryCallback = new GrsQueryCallback() { // from class: hkn.1
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                hkn.this.a(str, activity, i, fitWorkout, gxtVar);
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i2) {
                hkn.this.a("", activity, i, fitWorkout, gxtVar);
            }
        };
        btt.d().c(new Runnable() { // from class: hkm
            @Override // java.lang.Runnable
            public final void run() {
                GRSManager.c(BaseApplication.b()).d("domainContentcenterDbankcdnNew", grsQueryCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Activity activity, int i, FitWorkout fitWorkout, final gxt gxtVar) {
        if (gxtVar.r() != null) {
            activity.runOnUiThread(new Runnable() { // from class: hko
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36850c.d();
                }
            });
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Suggestion_TrailDetailSharedHelper", "getSharedLink, url is empty");
            activity.runOnUiThread(new Runnable() { // from class: hkp
                @Override // java.lang.Runnable
                public final void run() {
                    qpx.e(BaseApplication.b(), R.string.IDS_motiontrack_share_fail_tip);
                }
            });
            return;
        }
        LogUtil.a("Suggestion_TrailDetailSharedHelper", "getSharedLink, success url = ", str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (CommonUtil.cl() || CommonUtil.ba()) {
            sb.append(Constants.H5_URL_BASE_PATH_TEST);
        } else if (CommonUtil.ap() || CommonUtil.ao()) {
            sb.append(Constants.H5_URL_BASE_PATH_BETA);
        } else {
            sb.append(Constants.H5_URL_BASE_PATH_RELEASE);
        }
        sb.append("com.huawei.health.h5.course/static/dist/index.html#/FitnessCourceDetail?workoutId=");
        sb.append(fitWorkout.acquireId());
        sb.append("&sex=");
        sb.append(i);
        sb.append("&isH5=true&version=");
        sb.append(fitWorkout.accquireVersion());
        gxtVar.f(sb.toString());
        if (gxtVar.r() != null) {
            activity.runOnUiThread(new Runnable() { // from class: hkl
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a(gxtVar);
                }
            });
        }
    }

    private String b(int i) {
        double d;
        LogUtil.a("Suggestion_TrailDetailSharedHelper", "getShareTextContent, exerciseTimes = ", Integer.valueOf(i));
        double d2 = i;
        if (d2 > 10000.0d) {
            int i2 = 0;
            if (!LanguageUtil.q(BaseApplication.b()) && LanguageUtil.al(BaseApplication.b())) {
                double d3 = d2 / 10000.0d;
                d = UnitUtil.d(d3, 1);
                double d4 = UnitUtil.d(d3, 0);
                if (Double.doubleToLongBits(d) != Double.doubleToLongBits(d4)) {
                    i2 = 1;
                } else {
                    d = d4;
                }
            } else {
                d = UnitUtil.d(d2 / 1000.0d, 0);
            }
            return BaseApplication.b().getResources().getQuantityString(R.plurals.IDS_sug_shared_content_more, i, UnitUtil.e(d, 1, i2));
        }
        return BaseApplication.b().getString(R.string.IDS_sug_shared_content_less);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap a() {
        Drawable drawableLoadIcon = BaseApplication.b().getApplicationInfo().loadIcon(BaseApplication.b().getPackageManager());
        if (!(drawableLoadIcon instanceof BitmapDrawable)) {
            LogUtil.j("Suggestion_TrailDetailSharedHelper", "getAppIcon, drawable is not BitmapDrawable");
            return null;
        }
        LogUtil.a("Suggestion_TrailDetailSharedHelper", "getAppIcon, app icon");
        return ((BitmapDrawable) drawableLoadIcon).getBitmap();
    }

    private void b(Activity activity) {
        LogUtil.a("Suggestion_TrailDetailSharedHelper", "showWaitingDialog: mLoadDataDialog = ", this.f36844a);
        if (this.f36844a != null) {
            return;
        }
        new CommonDialog21(activity, R.style.common_dialog21);
        CommonDialog21 commonDialog21B = CommonDialog21.b(activity);
        this.f36844a = commonDialog21B;
        commonDialog21B.b(activity.getString(R.string.IDS_getting_file));
        this.f36844a.setCancelable(false);
        this.f36844a.c();
        this.f36844a.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void d() {
        LogUtil.a("Suggestion_TrailDetailSharedHelper", "dismissWaitingDialog, mLoadDataDialog = ", this.f36844a);
        CommonDialog21 commonDialog21 = this.f36844a;
        if (commonDialog21 != null) {
            commonDialog21.dismiss();
            this.f36844a = null;
        }
    }

    class b extends AsyncTask<String, Void, Bitmap> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f36849c;
        private final gxt e;

        public b(String str, gxt gxtVar) {
            this.f36849c = str;
            this.e = gxtVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(String... strArr) {
            return ltg.a(this.f36849c);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            LogUtil.a("Suggestion_TrailDetailSharedHelper", "onPostExecute，down bitmap success");
            gxt gxtVar = this.e;
            if (gxtVar == null) {
                LogUtil.j("Suggestion_TrailDetailSharedHelper", "down bitmap, mSharedContent is null");
                return;
            }
            if (bitmap == null) {
                bitmap = hkn.this.a();
            }
            gxtVar.d(bitmap);
            if (TextUtils.isEmpty(this.e.v())) {
                return;
            }
            hkn.this.d();
            hkn.this.a(this.e);
        }
    }
}
