package com.huawei.ui.homewear21.home.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.homewear21.R;
import defpackage.qsp;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeWatchFaceHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f26339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f26340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f26341c;
    private LinearLayout d;
    private HealthImageView e;
    private View f;
    private HealthTextView g;
    private final View h;
    private View i;
    private View j;
    private LinearLayout k;
    private ImageView m;
    private HealthTextView o;

    public WearHomeWatchFaceHolder(View view, boolean z) {
        super(view);
        this.f26339a = (RelativeLayout) qsp.a(view, R.id.card_watchface_view);
        this.k = (LinearLayout) qsp.a(view, R.id.ll_watchface_more);
        this.m = (ImageView) qsp.a(view, R.id.im_watchface_more);
        this.g = (HealthTextView) qsp.a(view, R.id.tv_watchface_more);
        if (z) {
            this.e = (HealthImageView) qsp.a(view, R.id.iv_watchface_market);
        }
        this.o = (HealthTextView) qsp.a(view, R.id.tv_watchface_manage);
        this.d = (LinearLayout) qsp.a(view, R.id.linear_layout_recommend_watch_face);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.m.setImageResource(R.drawable.ic_public_arrow_left_arkui);
        } else {
            this.m.setImageResource(R.drawable.ic_public_arrow_right_arkui);
        }
        this.f26341c = qsp.a(view, R.id.rl_watchface0);
        this.j = qsp.a(view, R.id.rl_watchface1);
        this.h = qsp.a(view, R.id.rl_watchface2);
        this.f = qsp.a(view, R.id.rl_watchface3);
        this.f26340b = qsp.a(view, R.id.rl_watchface4);
        this.i = qsp.a(view, R.id.rl_watchface5);
    }

    public RelativeLayout b() {
        return this.f26339a;
    }

    public LinearLayout g() {
        return this.k;
    }

    public HealthImageView e() {
        return this.e;
    }

    public HealthTextView c() {
        return this.g;
    }

    public ImageView h() {
        return this.m;
    }

    public HealthTextView a() {
        return this.o;
    }

    public View d() {
        return this.d;
    }
}
