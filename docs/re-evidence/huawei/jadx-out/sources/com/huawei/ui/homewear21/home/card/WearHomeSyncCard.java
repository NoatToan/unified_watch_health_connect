package com.huawei.ui.homewear21.home.card;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.homewear21.R;
import defpackage.qsp;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeSyncCard extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f26311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f26312b;
    private LinearLayout d;
    private LinearLayout e;

    public WearHomeSyncCard(Context context) {
        this(context, null);
    }

    public WearHomeSyncCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WearHomeSyncCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LogUtil.a("WearHomeSyncCard", "WearHomeSyncCard enter");
        a(LayoutInflater.from(context).inflate(R.layout.wear_home_sync_card, this));
    }

    private void a(View view) {
        this.f26312b = (LinearLayout) qsp.a(view, R.id.lin_sync_error);
        this.d = (LinearLayout) qsp.a(view, R.id.lin_syncing);
        this.e = (LinearLayout) qsp.a(view, R.id.lin_sync_success);
        this.f26311a = (HealthTextView) qsp.a(view, R.id.toast_cancel_tv);
    }

    public void d(int i) {
        if (i == 0) {
            a();
            return;
        }
        if (i == 1) {
            d();
        } else if (i == 2) {
            e();
        } else {
            LogUtil.j("WearHomeSyncCard", "accountStateChange state default");
        }
    }

    private void a() {
        ReleaseLogUtil.d("R_WearHomeSyncCard", "syncSuccess in");
        this.f26312b.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setVisibility(0);
    }

    private void e() {
        ReleaseLogUtil.d("R_WearHomeSyncCard", "syncLoading in");
        this.f26312b.setVisibility(8);
        this.d.setVisibility(0);
        this.e.setVisibility(8);
    }

    private void d() {
        ReleaseLogUtil.d("R_WearHomeSyncCard", "syncFail in");
        this.f26312b.setVisibility(0);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
    }

    public void e(View.OnClickListener onClickListener) {
        if (onClickListener == null) {
            LogUtil.j("WearHomeSyncCard", "cardCancel listener is null");
        } else {
            this.f26311a.setOnClickListener(onClickListener);
        }
    }
}
