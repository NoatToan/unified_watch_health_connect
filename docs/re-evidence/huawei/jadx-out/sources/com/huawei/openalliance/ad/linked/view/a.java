package com.huawei.openalliance.ad.linked.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.cc;

/* JADX INFO: loaded from: classes41.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected C0220a f19467a = new C0220a();

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.linked.view.a$a, reason: collision with other inner class name */
    public static class C0220a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected Drawable f19468a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected int f19469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected int f19470c = 12;
    }

    public C0220a a() {
        return this.f19467a;
    }

    public a(Context context) {
        C0220a c0220a;
        Resources resources;
        int i;
        if (cc.a(context).g()) {
            c0220a = this.f19467a;
            resources = context.getResources();
            i = R.drawable.hiad_extand_landing_app_down_btn_normal_hm;
        } else {
            c0220a = this.f19467a;
            resources = context.getResources();
            i = R.drawable.hiad_extand_landing_app_down_btn_normal;
        }
        c0220a.f19468a = resources.getDrawable(i);
        this.f19467a.f19469b = context.getResources().getColor(R.color.hiad_emui_white_no_night);
    }
}
