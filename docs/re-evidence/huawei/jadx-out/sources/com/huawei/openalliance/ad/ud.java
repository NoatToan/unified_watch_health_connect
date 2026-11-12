package com.huawei.openalliance.ad;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import com.huawei.operation.beans.TitleBean;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, String> f20298a = new HashMap<String, String>() { // from class: com.huawei.openalliance.ad.ud.1
        {
            put("WX", "com.tencent.mm");
            put(Constants.SOURCE_QQ, "com.tencent.mobileqq");
            put("WB", "com.sina.weibo");
            put("weLink", com.huawei.openalliance.ad.constant.Constants.WELINK_PKG_NAME);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, Integer> f20299b = new HashMap<String, Integer>() { // from class: com.huawei.openalliance.ad.ud.2
        {
            put("WX", Integer.valueOf(R.string.hiad_share_wx));
            put(Constants.SOURCE_QQ, Integer.valueOf(R.string.hiad_share_qq));
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Dialog f20300c;
    private View d;
    private final Activity e;
    private final uk f;
    private List<String> g = new ArrayList();
    private Map<String, String> h = new HashMap();
    private com.huawei.openalliance.ad.analysis.c i;

    public void b() {
        Dialog dialog = this.f20300c;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f20300c.dismiss();
    }

    public void a(DialogInterface.OnDismissListener onDismissListener) {
        Dialog dialog = this.f20300c;
        if (dialog != null) {
            dialog.setOnDismissListener(onDismissListener);
        }
    }

    public void a() {
        Dialog dialog;
        if (this.e == null || this.f == null || (dialog = this.f20300c) == null) {
            hw.a("PPSShareDialog", "context,nativeAd or dialog is empty");
        } else {
            dialog.show();
        }
    }

    private void f() {
        a(R.id.share_wx, "WX", 1);
        a(R.id.share_wx_moments, "WX", 2);
        a(R.id.share_qq, Constants.SOURCE_QQ, 1);
        a(R.id.share_qq_qzone, Constants.SOURCE_QQ, 2);
        a(R.id.share_weibo, "WB", -1);
        a(R.id.share_weLink, "weLink", -1);
        a(R.id.share_more, TitleBean.RIGHT_BTN_TYPE_MORE, -1);
        if (hw.a()) {
            hw.a("PPSShareDialog", "initShareButton end");
        }
    }

    private void e() {
        this.f20300c = new Dialog(this.e, R.style.HIAD_share_dialog);
        View viewInflate = LayoutInflater.from(this.e).inflate(R.layout.bottom_share_layout, (ViewGroup) null);
        this.d = viewInflate;
        this.f20300c.setContentView(viewInflate);
        this.f20300c.setCanceledOnTouchOutside(true);
        this.f20300c.setCancelable(true);
        Window window = this.f20300c.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            window.setDimAmount(0.0f);
            attributes.gravity = 80;
            attributes.width = this.e.getResources().getDisplayMetrics().widthPixels;
        }
    }

    private boolean d(String str) {
        if (com.huawei.openalliance.ad.utils.k.a(this.e, f20298a.get(str))) {
            return true;
        }
        if (!hw.a()) {
            return false;
        }
        hw.a("PPSShareDialog", "checkForInstall : %s filed", str);
        return false;
    }

    private void d() {
        if (hw.a()) {
            hw.a("PPSShareDialog", "initDialog");
        }
        if (this.e == null) {
            if (hw.a()) {
                hw.a("PPSShareDialog", "initDialog filed : context is null");
            }
        } else {
            e();
            this.h = fp.b(this.e.getApplicationContext()).an();
            f();
            this.i = new com.huawei.openalliance.ad.analysis.c(this.e.getApplicationContext());
        }
    }

    private boolean c(String str) {
        if (ul.a(str)) {
            return true;
        }
        if (!hw.a()) {
            return false;
        }
        hw.a("PPSShareDialog", "checkForDependencies : %s filed", str);
        return false;
    }

    private boolean b(String str) {
        if (this.h.get(str) != null) {
            return c(str);
        }
        if (hw.a()) {
            hw.a("PPSShareDialog", "checkForAppId : %s filed", str);
        }
        return false;
    }

    private boolean a(final String str, View view) {
        if (!b(str)) {
            view.setVisibility(8);
            return true;
        }
        if (d(str)) {
            return false;
        }
        a(str);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.ud.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Toast.makeText(ud.this.e, ud.this.e.getResources().getString(R.string.hiad_share_app_not_install, ud.this.e.getResources().getString(((Integer) ud.f20299b.get(str)).intValue())), 0).show();
                hw.a("PPSShareDialog", "click %s share : app not support", str);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    public void a(String str, int i) {
        String strA;
        boolean z;
        um umVar = new um();
        umVar.a(this.h.get(str));
        if (1 != i) {
            z = 2 != i;
            if (TitleBean.RIGHT_BTN_TYPE_MORE.equals(str)) {
                umVar.a(this.g);
            }
            b();
            strA = this.f.a();
            if (strA != null || !strA.startsWith("http")) {
                this.f.a(this.h.get("defImg"));
            }
            ul.a(str, this.e, this.f, umVar);
        }
        umVar.a(z);
        if (TitleBean.RIGHT_BTN_TYPE_MORE.equals(str)) {
            umVar.a(this.g);
        }
        b();
        strA = this.f.a();
        if (strA != null) {
            this.f.a(this.h.get("defImg"));
        } else {
            this.f.a(this.h.get("defImg"));
        }
        ul.a(str, this.e, this.f, umVar);
    }

    private void a(String str) {
        String str2 = f20298a.get(str);
        if (this.g.contains(str2)) {
            return;
        }
        this.g.add(str2);
    }

    private void a(int i, final String str, final int i2) {
        View viewFindViewById = this.d.findViewById(i);
        if (Constants.SOURCE_QQ.equals(str) || "WX".equals(str)) {
            if (a(str, viewFindViewById)) {
                return;
            }
        } else if ("WB".equals(str)) {
            if (!b(str) || !d(str)) {
                viewFindViewById.setVisibility(8);
                return;
            }
        } else if ("weLink".equals(str) && (!c(str) || !d(str))) {
            viewFindViewById.setVisibility(8);
            return;
        }
        a(str);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.ud.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ud.this.a(str, i2);
                ud.this.i.a(str, ud.this.f.f());
                hw.a("PPSShareDialog", "click %s share", str);
            }
        });
    }

    public ud(Activity activity, uk ukVar) {
        this.e = activity;
        this.f = ukVar;
        d();
    }
}
