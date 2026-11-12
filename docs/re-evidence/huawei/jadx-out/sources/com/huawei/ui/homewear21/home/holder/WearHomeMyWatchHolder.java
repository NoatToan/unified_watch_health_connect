package com.huawei.ui.homewear21.home.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homewear21.R;
import defpackage.qsp;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeMyWatchHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f26330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f26331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f26332c;
    private View d;
    private View e;
    private LinearLayout f;
    private ImageView g;
    private View h;
    private View i;
    private View j;
    private LinearLayout n;
    private HealthTextView o;

    public WearHomeMyWatchHolder(View view) {
        super(view);
        this.f26332c = (RelativeLayout) qsp.a(view, R.id.card_mywatch_view);
        this.f = (LinearLayout) qsp.a(view, R.id.ll_mywatch_more);
        this.g = (ImageView) qsp.a(view, R.id.im_mywatch_more);
        this.o = (HealthTextView) qsp.a(view, R.id.tv_mywatch_more);
        this.f26330a = (HealthTextView) qsp.a(view, R.id.tv_mywatch_manage);
        this.n = (LinearLayout) qsp.a(view, R.id.linear_layout_recommend_watch_face);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.g.setImageResource(R.drawable.ic_public_arrow_left_arkui);
        } else {
            this.g.setImageResource(R.drawable.ic_public_arrow_right_arkui);
        }
        this.e = qsp.a(view, R.id.rl_mywatch0);
        this.i = qsp.a(view, R.id.rl_mywatch1);
        this.j = qsp.a(view, R.id.rl_mywatch2);
        this.f26331b = qsp.a(view, R.id.rl_mywatch3);
        this.d = qsp.a(view, R.id.rl_mywatch4);
        this.h = qsp.a(view, R.id.rl_mywatch5);
    }

    public RelativeLayout b() {
        return this.f26332c;
    }

    public LinearLayout a() {
        return this.f;
    }

    public HealthTextView e() {
        return this.o;
    }

    public HealthTextView c() {
        return this.f26330a;
    }

    public View d() {
        return this.n;
    }
}
