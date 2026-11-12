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
public class FitnessShareWatermarkOne extends EditShareCommonView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f22630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f22631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22632c;
    private int d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthTextView j;
    private View k;
    private String m;
    private HealthTextView n;
    private int q;
    private HealthTextView r;
    private HealthTextView s;
    private boolean o = true;
    private boolean l = false;

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setUserInfo(Bitmap bitmap, String str) {
    }

    public FitnessShareWatermarkOne(Context context) {
        d(context);
        c(context);
    }

    private void d(Context context) {
        View viewInflate = View.inflate(context, R.layout.fitness_watermak_one, null);
        this.k = viewInflate;
        this.n = (HealthTextView) viewInflate.findViewById(R.id.top_left_first_data);
        this.r = (HealthTextView) this.k.findViewById(R.id.top_left_second_data);
        this.s = (HealthTextView) this.k.findViewById(R.id.top_left_third_data);
        this.h = (HealthTextView) this.k.findViewById(R.id.bottom_start_title);
        this.j = (HealthTextView) this.k.findViewById(R.id.bottom_start_value);
        this.f = (HealthTextView) this.k.findViewById(R.id.bottom_start_unit);
        this.e = (HealthTextView) this.k.findViewById(R.id.bottom_center_title);
        this.f22631b = (HealthTextView) this.k.findViewById(R.id.bottom_center_value);
        this.f22630a = (HealthTextView) this.k.findViewById(R.id.bottom_center_unit);
        this.f22632c = (HealthTextView) this.k.findViewById(R.id.bottom_end_title);
        this.i = (HealthTextView) this.k.findViewById(R.id.bottom_end_value);
        this.g = (HealthTextView) this.k.findViewById(R.id.bottom_end_unit);
    }

    private void c(Context context) {
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/hw-italic.ttf");
        this.j.setTypeface(typefaceCreateFromAsset);
        this.f22631b.setTypeface(typefaceCreateFromAsset);
        this.i.setTypeface(typefaceCreateFromAsset);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshUi(int i, int i2) {
        this.h.setTextColor(i);
        this.j.setTextColor(i);
        this.f.setTextColor(i);
        this.e.setTextColor(i);
        this.f22631b.setTextColor(i);
        this.f22630a.setTextColor(i);
        this.f22632c.setTextColor(i);
        this.i.setTextColor(i);
        this.g.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshTopUi(int i) {
        this.s.setTextColor(i);
        this.n.setTextColor(i);
        this.r.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public View getView() {
        return this.k;
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
    public String getSourcePath() {
        return this.m;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setSourcePath(String str) {
        this.m = str;
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
            if (pnq.a(strA) || pnq.a(strJ) || pnq.a(strM)) {
                this.l = true;
                return;
            }
            pnq.d(this.n, gyhVar.s());
            pnq.d(this.r, gyhVar.p());
            pnq.d(this.s, gyhVar.u());
            pnq.d(this.h, gyhVar.d());
            pnq.d(this.j, strA);
            pnq.d(this.f, gyhVar.b());
            pnq.d(this.e, gyhVar.g());
            pnq.d(this.f22631b, strJ);
            pnq.d(this.f22630a, gyhVar.i());
            pnq.d(this.f22632c, gyhVar.f());
            pnq.d(this.i, strM);
            pnq.d(this.g, gyhVar.n());
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
