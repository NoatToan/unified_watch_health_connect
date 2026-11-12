package com.huawei.pluginsocialshare.view.sharewatermark;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.view.View;
import com.huawei.health.socialshare.model.EditShareCommonView;
import com.huawei.pluginsocialshare.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gyh;
import defpackage.pnq;

/* JADX INFO: loaded from: classes15.dex */
public class SportTitleWatermark extends EditShareCommonView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f22677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f22678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22679c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthTextView j;
    private View k;
    private HealthTextView m;
    private HealthTextView n;
    private HealthTextView p;
    private int q;
    private String r;
    private HealthTextView s;
    private HealthTextView t;
    private boolean o = true;
    private boolean l = false;

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setUserInfo(Bitmap bitmap, String str) {
    }

    public SportTitleWatermark(Context context) {
        b(context);
        a(context);
    }

    private void b(Context context) {
        View viewInflate = View.inflate(context, R.layout.sport_title_watermark_layout, null);
        this.k = viewInflate;
        this.t = (HealthTextView) viewInflate.findViewById(R.id.top_right_first_data);
        this.s = (HealthTextView) this.k.findViewById(R.id.top_right_second_data);
        this.p = (HealthTextView) this.k.findViewById(R.id.top_right_third_data);
        this.m = (HealthTextView) this.k.findViewById(R.id.main_data_value);
        this.n = (HealthTextView) this.k.findViewById(R.id.main_data_unit);
        this.j = (HealthTextView) this.k.findViewById(R.id.bottom_start_title);
        this.i = (HealthTextView) this.k.findViewById(R.id.bottom_start_value);
        this.h = (HealthTextView) this.k.findViewById(R.id.bottom_start_unit);
        this.d = (HealthTextView) this.k.findViewById(R.id.bottom_center_title);
        this.f22677a = (HealthTextView) this.k.findViewById(R.id.bottom_center_value);
        this.e = (HealthTextView) this.k.findViewById(R.id.bottom_center_unit);
        this.f22678b = (HealthTextView) this.k.findViewById(R.id.bottom_end_title);
        this.f = (HealthTextView) this.k.findViewById(R.id.bottom_end_value);
        this.g = (HealthTextView) this.k.findViewById(R.id.bottom_end_unit);
    }

    private void a(Context context) {
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/hw-italic.ttf");
        this.m.setTypeface(typefaceCreateFromAsset);
        this.i.setTypeface(typefaceCreateFromAsset);
        this.f22677a.setTypeface(typefaceCreateFromAsset);
        this.f.setTypeface(typefaceCreateFromAsset);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshUi(int i, int i2) {
        this.m.setTextColor(i);
        this.n.setTextColor(i);
        this.j.setTextColor(i);
        this.i.setTextColor(i);
        this.h.setTextColor(i);
        this.e.setTextColor(i);
        this.f22677a.setTextColor(i);
        this.d.setTextColor(i);
        this.f22678b.setTextColor(i);
        this.f.setTextColor(i);
        this.g.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshTopUi(int i) {
        this.s.setTextColor(i);
        this.p.setTextColor(i);
        this.t.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public View getView() {
        return this.k;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getBitmap() {
        return this.f22679c;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setBitmap(int i) {
        this.f22679c = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public String getSourcePath() {
        return this.r;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setSourcePath(String str) {
        this.r = str;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setIsDefaultSource(boolean z) {
        this.o = z;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsDefaultSource() {
        return this.o;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void refreshData(gyh gyhVar) {
        if (gyhVar != null) {
            String strA = gyhVar.a();
            String strJ = gyhVar.j();
            String strM = gyhVar.m();
            String strH = gyhVar.h();
            if (pnq.a(strA) || pnq.a(strJ) || pnq.a(strM) || pnq.a(strH)) {
                this.l = true;
                return;
            }
            pnq.d(this.t, gyhVar.x());
            pnq.d(this.s, gyhVar.y());
            pnq.d(this.p, gyhVar.w());
            pnq.d(this.m, strA);
            pnq.d(this.n, gyhVar.b());
            pnq.d(this.j, gyhVar.g());
            pnq.d(this.i, strJ);
            pnq.d(this.h, gyhVar.i());
            pnq.d(this.d, gyhVar.f());
            pnq.d(this.f22677a, strM);
            pnq.d(this.e, gyhVar.n());
            pnq.d(this.f22678b, gyhVar.c());
            pnq.d(this.f, strH);
            pnq.d(this.g, gyhVar.e());
        }
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setWatermarkId(int i) {
        this.q = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getWatermarkId() {
        return this.q;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsNeedHide() {
        return this.l;
    }
}
