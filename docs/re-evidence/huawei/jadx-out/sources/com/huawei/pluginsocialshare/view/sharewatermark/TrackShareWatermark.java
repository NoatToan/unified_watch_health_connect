package com.huawei.pluginsocialshare.view.sharewatermark;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.view.View;
import com.huawei.health.socialshare.model.EditShareCommonView;
import com.huawei.pluginsocialshare.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gyh;
import defpackage.njy;
import defpackage.pnq;
import health.compact.a.LanguageUtil;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes15.dex */
public class TrackShareWatermark extends EditShareCommonView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f22687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22688c;
    private int d;
    private View f;
    private HealthTextView h;
    private TrackSimpleView i;
    private String j;
    private int k;
    private HealthTextView m;
    private HealthTextView n;
    private int g = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f22686a = true;
    private boolean e = false;

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setUserInfo(Bitmap bitmap, String str) {
    }

    public TrackShareWatermark(Context context) {
        c(context);
        a(context);
    }

    private void c(Context context) {
        View viewInflate = View.inflate(context, R.layout.track_share_watermark, null);
        this.f = viewInflate;
        this.h = (HealthTextView) viewInflate.findViewById(R.id.right_top_first_data);
        this.m = (HealthTextView) this.f.findViewById(R.id.right_top_second_data);
        this.n = (HealthTextView) this.f.findViewById(R.id.right_top_third_data);
        this.f22687b = (HealthTextView) this.f.findViewById(R.id.track_share_watermark_main_data_value);
        this.f22688c = (HealthTextView) this.f.findViewById(R.id.track_share_watermark_main_data_unit);
        TrackSimpleView trackSimpleView = (TrackSimpleView) this.f.findViewById(R.id.track_share_simple_track);
        this.i = trackSimpleView;
        trackSimpleView.a(8.0f);
        if (LanguageUtil.c(context)) {
            this.g = 3;
        }
    }

    private void a(Context context) {
        this.f22687b.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/hw-italic.ttf"));
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshUi(int i, int i2) {
        this.f22687b.setTextColor(i);
        this.f22688c.setTextColor(i);
        this.i.e(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public View getView() {
        return this.f;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getBitmap() {
        return this.d;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setBitmap(int i) {
        this.d = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshTopUi(int i) {
        this.h.setTextColor(i);
        this.m.setTextColor(i);
        this.n.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public String getSourcePath() {
        return this.j;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setSourcePath(String str) {
        this.j = str;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setIsDefaultSource(boolean z) {
        this.f22686a = z;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsDefaultSource() {
        return this.f22686a;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void refreshData(gyh gyhVar) {
        if (gyhVar == null) {
            LogUtil.c("Share_TrackShareWatermark", "saveData trackShareWaterMarkBean is null");
            return;
        }
        if (njy.e(gyhVar.t())) {
            this.e = true;
            LogUtil.c("Share_TrackShareWatermark", "saveData points is empty");
            return;
        }
        String strA = gyhVar.a();
        if (pnq.a(strA)) {
            this.e = true;
            return;
        }
        pnq.d(this.h, gyhVar.x());
        pnq.d(this.m, gyhVar.y());
        pnq.d(this.n, gyhVar.w());
        pnq.d(this.f22687b, strA);
        pnq.d(this.f22688c, gyhVar.b());
        this.i.e(gyhVar.t(), this.g);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setWatermarkId(int i) {
        this.k = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getWatermarkId() {
        return this.k;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsNeedHide() {
        return this.e;
    }
}
