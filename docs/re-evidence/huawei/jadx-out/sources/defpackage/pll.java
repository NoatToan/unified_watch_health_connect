package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class pll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private plz f45601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private pnp f45602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f45603c;
    private gxt e;

    private pll(Context context) {
        this.f45603c = context;
        d(context);
    }

    public static pll e(Context context) {
        return new pll(context);
    }

    public void e() {
        d();
    }

    public void d() {
        this.f45603c = null;
        this.f45601a = null;
        pnp pnpVar = this.f45602b;
        if (pnpVar != null) {
            pnpVar.e();
            this.f45602b = null;
        }
    }

    private void d(Context context) {
        LogUtil.a("Share_InteractorManager", "init sdk");
        this.f45603c = context;
        this.e = pjm.e();
        if (!Utils.o()) {
            this.f45601a = new plz(context);
        }
        this.f45602b = new pnp(this.f45603c, this.e);
    }

    private PermissionUtil.PermissionType b(int i, gxt gxtVar) {
        int iU = gxtVar.u();
        if (i == 4) {
            return PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES;
        }
        if (i == 5 && ((iU == 4 || iU == 1) && !PermissionUtil.a())) {
            return PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES;
        }
        if (i == 7 || i == 8) {
            return PermissionUtil.PermissionType.MANAGE_EXTERNAL_STORAGE;
        }
        if (iU == 5) {
            return PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES;
        }
        return PermissionUtil.PermissionType.NONE;
    }

    public void e(Context context, final int i, gxt gxtVar) {
        if (gxtVar == null) {
            LogUtil.j("Share_InteractorManager", "shareContent is null");
            return;
        }
        this.e = gxtVar;
        PermissionUtil.PermissionType permissionTypeB = b(i, gxtVar);
        if (permissionTypeB == PermissionUtil.PermissionType.NONE) {
            f(i);
        } else {
            PermissionUtil.d(context, permissionTypeB, new CustomPermissionAction(context) { // from class: pll.3
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    pll.this.f(i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i) {
        try {
            e(i);
        } catch (OutOfMemoryError unused) {
            LogUtil.e("Share_InteractorManager", "share fail: out of memory");
            qpx.e(BaseApplication.getContext(), R.string.IDS_plugin_social_error_code_1);
        }
    }

    private void e(int i) {
        switch (i) {
            case 1:
                t();
                break;
            case 2:
                s();
                break;
            case 3:
                r();
                break;
            case 4:
                h();
                break;
            case 5:
                c();
                break;
            case 6:
                p();
                break;
            case 7:
                i();
                break;
            case 8:
                g();
                break;
            case 9:
                a();
                break;
            case 10:
                q();
                break;
            case 11:
                l();
                break;
            default:
                LogUtil.a("Share_InteractorManager", "unknow type:", Integer.valueOf(i));
                break;
        }
    }

    private void t() {
        LogUtil.a("Share_InteractorManager", "share_wechat_moments");
        d(2);
        b(2);
        y();
    }

    private void s() {
        LogUtil.a("Share_InteractorManager", "share_wechat_friends");
        d(1);
        b(1);
        w();
    }

    private void q() {
        LogUtil.a("Share_InteractorManager", "share_xhs");
        d(7);
        b(7);
        v();
    }

    private void l() {
        LogUtil.a("Share_InteractorManager", "share_douyin");
        d(8);
        b(8);
        o();
    }

    private void r() {
        LogUtil.a("Share_InteractorManager", "share_weibo");
        d(3);
        b(3);
        x();
    }

    private void p() {
        LogUtil.a("Share_InteractorManager", "share_familygroup");
        d(6);
        b(6);
        k();
    }

    private void h() {
        LogUtil.a("Share_InteractorManager", "share_save_to_local");
        d(4);
        b(4);
        new plt().c(this.e);
    }

    private void c() {
        LogUtil.a("Share_InteractorManager", "share_more_layout");
        d(5);
        b(5);
        u();
    }

    private void i() {
        LogUtil.a("Share_InteractorManager", "share_save_pdf_layout");
        d(7);
        b(7);
        b();
    }

    private void g() {
        LogUtil.a("Share_InteractorManager", "share_print_layout");
        d(8);
        b(8);
        f();
    }

    private void a() {
        LogUtil.a("Share_InteractorManager", "SHARE_TYPE_PRE_VIEW");
        j();
    }

    private void b(int i) {
        Context context = this.f45603c;
        if (context != null) {
            b(context, i);
        }
    }

    private void b(Context context, int i) {
        SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_SPEED_UP), "SHARE_POP_UP_ACTIVITY_SHARE_TYPE", String.valueOf(i), new StorageParams());
    }

    private void d(int i) {
        LogUtil.d("Share_InteractorManager", "setBiEvent ENTER key=", Integer.valueOf(i));
        HashMap map = new HashMap(2);
        map.put(Constants.BI_MODULE_ID, this.e.o());
        map.put("type", c(i));
        Map<String, Object> mapM = this.e.m();
        if (mapM != null) {
            map.putAll(mapM);
        }
        lmn lmnVar = new lmn();
        lmnVar.e(map);
        HashMap map2 = new HashMap(1);
        map2.put("pageId", "Share_0001");
        lmnVar.d(map2);
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.SHARE_1140001.value(), lmnVar, 0);
        n();
    }

    private String c(int i) {
        if (i == 7) {
            return "rednote";
        }
        if (i == 8) {
            return "tiktok";
        }
        return String.valueOf(i);
    }

    private void j() {
        LogUtil.d("Share_InteractorManager", "setPreViewBiEvent ENTER.");
        HashMap map = new HashMap(2);
        map.put(Constants.BI_MODULE_ID, this.e.o());
        Map<String, Object> mapM = this.e.m();
        if (mapM != null) {
            map.putAll(mapM);
        }
        lmn lmnVar = new lmn();
        lmnVar.e(map);
        HashMap map2 = new HashMap(1);
        map2.put("pageId", "Share_0001");
        lmnVar.d(map2);
        lmf.d().a(BaseApplication.getContext(), AnalyticsValue.HEALTH_SHARE_EDIT_SHARE_2100010.value(), lmnVar, 0);
    }

    private void n() {
        if (this.e != null) {
            m();
            String strV = this.e.v();
            if (TextUtils.isEmpty(strV)) {
                return;
            }
            HashMap map = new HashMap(2);
            map.put("url", strV);
            ddq.d().finishKakaTask(this.f45603c, 40003, map);
        }
    }

    private void m() {
        if ("14".equals(this.e.o())) {
            ddq.d().finishKakaTask(this.f45603c, 40004, new HashMap(2));
        }
    }

    private void y() {
        if (this.f45601a == null) {
            LogUtil.e("Share_InteractorManager", "shareWeChatMoments() mWeChatInteractors == null");
            if (Utils.o()) {
                return;
            } else {
                this.f45601a = new plz(this.f45603c);
            }
        }
        if (!lsj.c(this.f45603c, "com.tencent.mm")) {
            qpx.e(BaseApplication.getContext(), com.huawei.pluginsocialshare.R.string.IDS_plugin_socialshare_install_wechat);
        } else {
            Context context = this.f45603c;
            qrs.e("com.tencent.mm", context, context.getString(com.huawei.pluginsocialshare.R.string.IDS_wechat_pay), new View.OnClickListener() { // from class: plp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f45611c.d(view);
                }
            }, null);
        }
    }

    /* synthetic */ void d(View view) {
        plz plzVar = this.f45601a;
        if (plzVar == null) {
            LogUtil.j("Share_InteractorManager", "shareWeChatMoments mWeChatInteractors is null");
            return;
        }
        int iC = plzVar.c(this.e, 1);
        if (iC == 1) {
            LogUtil.e("Share_InteractorManager", "shareWeChatMoments() ERR_NOT_INSTALLED");
        } else {
            a(this.e.aa());
            LogUtil.d("Share_InteractorManager", "shareWeChatMoments shareResult = ", Integer.valueOf(iC));
        }
    }

    private void w() {
        if (this.f45601a == null) {
            LogUtil.e("Share_InteractorManager", "ShareWeChat() mWeChatInteractors == null");
            if (Utils.o()) {
                return;
            } else {
                this.f45601a = new plz(this.f45603c);
            }
        }
        if (!lsj.c(this.f45603c, "com.tencent.mm")) {
            qpx.e(BaseApplication.getContext(), com.huawei.pluginsocialshare.R.string.IDS_plugin_socialshare_install_wechat);
        } else {
            Context context = this.f45603c;
            qrs.e("com.tencent.mm", context, context.getString(com.huawei.pluginsocialshare.R.string.IDS_wechat_pay), new View.OnClickListener() { // from class: plj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f45599c.b(view);
                }
            }, null);
        }
    }

    /* synthetic */ void b(View view) {
        int iC = this.f45601a.c(this.e, 0);
        if (iC == 1) {
            return;
        }
        a(this.e.aa());
        LogUtil.d("Share_InteractorManager", "shareWeChat shareResult = ", Integer.valueOf(iC));
    }

    private void v() {
        if (!lsj.c(this.f45603c, "com.xingin.xhs")) {
            qpx.e(BaseApplication.getContext(), com.huawei.pluginsocialshare.R.string.IDS_plugin_socialshare_install_xhs);
        } else {
            Context context = this.f45603c;
            qrs.e("com.xingin.xhs", context, context.getString(com.huawei.pluginsocialshare.R.string.IDS_plugin_socialshare_xhs), new View.OnClickListener() { // from class: plr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Throwable {
                    this.f45613b.e(view);
                }
            }, null);
        }
    }

    /* synthetic */ void e(View view) throws Throwable {
        new pmd(this.f45603c, this.e).d();
        a(this.e.aa());
        LogUtil.d("Share_InteractorManager", "shareXhs");
    }

    private void o() {
        if (!lsj.c(this.f45603c, "com.ss.android.ugc.aweme")) {
            qpx.e(BaseApplication.getContext(), com.huawei.pluginsocialshare.R.string.IDS_plugin_socialshare_install_douyin);
        } else {
            Context context = this.f45603c;
            qrs.e("com.ss.android.ugc.aweme", context, context.getString(com.huawei.pluginsocialshare.R.string.IDS_plugin_socialshare_douyin), new View.OnClickListener() { // from class: plo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.a(view);
                }
            }, null);
        }
    }

    /* synthetic */ void a(View view) {
        new plk(this.f45603c, this.e).a();
        a(this.e.aa());
        LogUtil.d("Share_InteractorManager", "shareDouYin");
    }

    private void x() {
        if (!lsj.c(this.f45603c, "com.sina.weibo")) {
            qpx.e(BaseApplication.getContext(), com.huawei.pluginsocialshare.R.string.IDS_plugin_socialshare_install_weibo);
        } else {
            Context context = this.f45603c;
            qrs.e("com.sina.weibo", context, context.getString(com.huawei.pluginsocialshare.R.string.IDS_plugin_socialshare_weibo), new View.OnClickListener() { // from class: plq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f45612b.c(view);
                }
            }, null);
        }
    }

    /* synthetic */ void c(View view) {
        new plx(this.f45603c, this.e).b();
        a(this.e.aa());
        LogUtil.d("Share_InteractorManager", "shareWeibo");
    }

    private void k() {
        new pli(this.f45603c, this.e).b();
        a(this.e.aa());
        LogUtil.d("Share_InteractorManager", "shareFamilyGroup", Integer.valueOf(this.e.aa()));
    }

    private void a(int i) {
        LogUtil.a("Share_InteractorManager", "sendShareBroadCast shareSource=", Integer.valueOf(i));
        HashMap map = new HashMap(10);
        map.put("share_key", Integer.valueOf(i));
        ddq.d().finishKakaTask(this.f45603c, 40000, map);
    }

    private void b() {
        pln plnVar = new pln(this.e);
        Context context = this.f45603c;
        if (context instanceof Activity) {
            plnVar.a((Activity) context);
        }
        LogUtil.d("Share_InteractorManager", "savePdf ", Integer.valueOf(this.e.aa()));
    }

    private void f() {
        new pln(this.e).a(this.f45603c);
        LogUtil.d("Share_InteractorManager", "print ", Integer.valueOf(this.e.aa()));
    }

    private void u() {
        pnp pnpVar = this.f45602b;
        if (pnpVar != null) {
            pnpVar.e();
        }
        pnp pnpVar2 = new pnp(this.f45603c, this.e);
        this.f45602b = pnpVar2;
        pnpVar2.a();
        a(this.e.aa());
    }
}
