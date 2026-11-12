package com.huawei.featureuserprofile.todo.adapter;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.featureuserprofile.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.TodoTaskInterface;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dlp;
import defpackage.ikw;
import defpackage.qqp;
import defpackage.qrs;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes6.dex */
public class TodoCardInnerViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f5756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthDivider f5757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f5758c;
    private LinearLayout d;
    private LinearLayout e;
    private LinearLayout f;
    private HealthTextView h;
    private HealthTextView j;

    public TodoCardInnerViewHolder(Context context, View view) {
        super(view);
        this.f5756a = context;
        this.f = (LinearLayout) view.findViewById(R.id.root_view);
        this.j = (HealthTextView) view.findViewById(R.id.tv_today_todo);
        this.h = (HealthTextView) view.findViewById(R.id.tv_allday_todo_name);
        this.f5757b = (HealthDivider) view.findViewById(R.id.linview);
        this.e = (LinearLayout) view.findViewById(R.id.activity_container_ll_top);
        this.d = (LinearLayout) view.findViewById(R.id.activity_container_ll_bottom);
        this.f5758c = (ImageView) view.findViewById(R.id.iv_arrow);
        if (LanguageUtil.ba(this.f5756a)) {
            this.f5758c.setImageResource(R.drawable.common_ui_arrow_left);
        }
    }

    public void d(ikw ikwVar) {
        TodoTaskInterface todoTaskInterfaceN;
        if (ikwVar == null) {
            LogUtil.j("TodoCardInnerViewHolder", "data == null");
            return;
        }
        LogUtil.a("TodoCardInnerViewHolder", "refreshTodoCardViewHolder");
        this.j.setText(ikwVar.o());
        this.h.setText(TextUtils.isEmpty(ikwVar.e()) ? ikwVar.i() : ikwVar.e());
        this.e.setVisibility(8);
        this.d.setVisibility(8);
        if (ikwVar.l() == 1792 && (todoTaskInterfaceN = ikwVar.n()) != null && (todoTaskInterfaceN instanceof dlp)) {
            a((dlp) todoTaskInterfaceN, ikwVar);
        }
    }

    private void a(dlp dlpVar, ikw ikwVar) {
        if (dlpVar.n() == 2 && dlpVar.k() == 1) {
            d(dlpVar);
        }
    }

    private void d(dlp dlpVar) {
        int i;
        if (dlpVar == null) {
            LogUtil.j("TodoCardInnerViewHolder", "historyFinished activity is null,return");
            return;
        }
        int iG = dlpVar.g();
        int iT = dlpVar.t();
        int i2 = iT - iG;
        int i3 = 0;
        this.e.setVisibility(0);
        this.e.removeAllViews();
        if (iT > 0 && iT <= 10) {
            while (i3 < iT) {
                if (i3 < i2) {
                    d(this.e, R.drawable.ic_cheack_on);
                } else {
                    d(this.e, R.drawable.ic_cheack_off);
                }
                i3++;
            }
            i = 73;
        } else if (iT <= 10) {
            LogUtil.j("TodoCardInnerViewHolder", "no branch!");
            i = 56;
        } else {
            this.d.setVisibility(0);
            this.d.removeAllViews();
            for (int i4 = 0; i4 < 10; i4++) {
                if (i4 < i2) {
                    d(this.e, R.drawable.ic_cheack_on);
                } else {
                    d(this.e, R.drawable.ic_cheack_off);
                }
            }
            while (i3 < iT - 10) {
                if (i3 < i2 - 10) {
                    d(this.d, R.drawable.ic_cheack_on);
                } else {
                    d(this.d, R.drawable.ic_cheack_off);
                }
                i3++;
            }
            i = 94;
        }
        this.f.setLayoutParams(new LinearLayout.LayoutParams(-1, qqp.a(this.f5756a, i)));
    }

    public void a() {
        this.f5757b.setVisibility(8);
    }

    private void d(LinearLayout linearLayout, int i) {
        ImageView imageView = new ImageView(this.f5756a);
        imageView.setImageResource(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qqp.a(this.f5756a, 16.0f), qqp.a(this.f5756a, 16.0f));
        if (qrs.af(this.f5756a)) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Context context = this.f5756a;
            if (context instanceof Activity) {
                ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            }
            layoutParams.setMarginEnd((displayMetrics.widthPixels - qqp.a(this.f5756a, 232.0f)) / 9);
        } else {
            layoutParams.setMarginEnd(qqp.a(this.f5756a, 14.0f));
        }
        imageView.setLayoutParams(layoutParams);
        linearLayout.addView(imageView);
    }
}
