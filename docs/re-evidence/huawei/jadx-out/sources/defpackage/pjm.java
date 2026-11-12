package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.m.s.e;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.router.AppRouter;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.activity.SharePopupActivity;
import com.huawei.up.model.UserInfomation;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class pjm extends pbx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static gyc f45513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static UserInfomation f45514b;
    private static gxy d;
    private static gxt e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private pll f45515c = null;

    private pjm() {
    }

    public static pjm d() {
        return new pjm();
    }

    private static void b(UserInfomation userInfomation) {
        f45514b = userInfomation;
    }

    public static gxy c() {
        return d;
    }

    private static void a(gxy gxyVar) {
        d = gxyVar;
    }

    public static gxt e() {
        return e;
    }

    public static void e(gxt gxtVar) {
        e = gxtVar;
    }

    public static gyc b() {
        return f45513a;
    }

    public static void e(gyc gycVar) {
        f45513a = gycVar;
    }

    @Override // defpackage.pbx
    public void finish() {
        super.finish();
        a();
    }

    public void a(gxt gxtVar, Context context) {
        if (gxtVar == null || context == null) {
            LogUtil.e("Share_PluginSocialShare", "exeShare() shareContent/mContext == null");
            return;
        }
        int iU = gxtVar.u();
        if (iU == 12) {
            LogUtil.j("Share_PluginSocialShare", "exeShare() shareType is SHARE_WAY_EDIT_IMG");
            b(context, gxtVar);
            return;
        }
        b(iU, gxtVar);
        e(gxtVar);
        boolean z = true;
        if (iU != 1 && iU != 7 && iU != 4 && iU != 6 && iU != 13 && (iU != 10 || gxtVar.r() == null)) {
            z = false;
        }
        if (!Utils.o() || z || iU == 8) {
            try {
                Intent intent = new Intent(context, (Class<?>) SharePopupActivity.class);
                intent.setFlags(268435456);
                pnq.c(context.getResources().getConfiguration().uiMode & 48);
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException e2) {
                LogUtil.e("Share_PluginSocialShare", "exeShare:", e2.getMessage());
                return;
            }
        }
        pll pllVarE = pll.e(context);
        this.f45515c = pllVarE;
        pllVarE.e(context, 5, gxtVar);
    }

    private void b(int i, gxt gxtVar) {
        if (i == 13 && !j()) {
            gxtVar.e(6);
        }
    }

    private boolean j() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "30004", "ai-sport-share-001");
        LogUtil.j("Share_PluginSocialShare", "fetchConfigSportShareShow config ", strE);
        if (TextUtils.isEmpty(strE)) {
            return true;
        }
        try {
            JSONObject jSONObject = new JSONObject(strE);
            if (jSONObject.has(e.n) && jSONObject.has(k.g)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(e.n);
                if (jSONObject.getBoolean(k.g) && jSONObject2.has("sport")) {
                    return a(jSONObject2.getString("sport"));
                }
                return true;
            }
            return true;
        } catch (JSONException unused) {
            LogUtil.e("Share_PluginSocialShare", "fetchConfigSportShareShow JSONException");
        }
    }

    private boolean a(String str) {
        LogUtil.a("Share_PluginSocialShare", "isShowSportShare state ", str);
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return e(str);
    }

    public boolean e(String str) {
        if (str.contains("1") && CommonUtil.cl()) {
            return true;
        }
        if (str.contains("2") && CommonUtil.ao()) {
            return true;
        }
        if (str.contains("3") && CommonUtil.ap()) {
            return true;
        }
        return str.contains("4") && CommonUtil.bu();
    }

    public void a(Context context, int i, gxt gxtVar) {
        if (gxtVar == null || context == null) {
            LogUtil.e("Share_PluginSocialShare", "exeShare() shareContent/mContext == null");
            return;
        }
        if (this.f45515c == null) {
            this.f45515c = pll.e(context);
        }
        this.f45515c.e(context, i, gxtVar);
    }

    public void a() {
        pll pllVar = this.f45515c;
        if (pllVar != null) {
            pllVar.e();
            this.f45515c = null;
        }
        i();
    }

    private void i() {
        gxt gxtVar = e;
        if (gxtVar != null) {
            gxtVar.ag();
            e((gxt) null);
        }
        gxy gxyVar = d;
        if (gxyVar != null) {
            gxyVar.t();
            a((gxy) null);
        }
    }

    public void c(Context context, gxy gxyVar, UserInfomation userInfomation) {
        if (gxyVar == null || context == null) {
            LogUtil.e("Share_PluginSocialShare", "exeShare() shareContent/mContext == null");
        } else {
            a(gxyVar);
            b(userInfomation);
        }
    }

    private void b(Context context, gxt gxtVar) {
        if (CollectionUtils.a(gxtVar.e())) {
            ReleaseLogUtil.e("Share_PluginSocialShare", "shareEditContentList is empty");
            return;
        }
        gxy gxyVar = gxtVar.e().get(0);
        if (gxyVar == null) {
            ReleaseLogUtil.e("Share_PluginSocialShare", "shareEditContent is null");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("shareWaterMarkData", gxyVar.k());
        if (!CollectionUtils.a(gxyVar.o())) {
            bundle.putSerializable("waterMarkIds", new ArrayList(gxyVar.o()));
        }
        bundle.putString("shareSource", String.valueOf(gxtVar.aa()));
        bundle.putInt("downLoadId", gxyVar.h());
        bundle.putBoolean("isDownloadMarkFromCloud", true);
        bundle.putString("shareModuleId", gxtVar.o());
        AppRouter.c("/PluginSocialShare/CustomizeShareActivity").d(bundle).b(context);
    }
}
