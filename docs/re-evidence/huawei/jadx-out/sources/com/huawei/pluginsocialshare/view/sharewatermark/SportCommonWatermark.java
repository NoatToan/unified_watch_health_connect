package com.huawei.pluginsocialshare.view.sharewatermark;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewTreeObserver;
import com.huawei.health.socialshare.model.EditShareCommonView;
import com.huawei.pluginsocialshare.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gyh;
import defpackage.pnq;

/* JADX INFO: loaded from: classes15.dex */
public class SportCommonWatermark extends EditShareCommonView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f22668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f22669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22670c;
    private int d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView h;
    private boolean i;
    private boolean j = false;
    private HealthTextView k;
    private String l;
    private View m;
    private HealthTextView n;
    private HealthTextView o;
    private HealthTextView q;
    private int s;

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setUserInfo(Bitmap bitmap, String str) {
    }

    public SportCommonWatermark(Context context) {
        d(context);
        e(context);
        e();
    }

    private void e() {
        this.f22668a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.pluginsocialshare.view.sharewatermark.SportCommonWatermark.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                int width = SportCommonWatermark.this.f22670c.getWidth();
                float fMeasureText = SportCommonWatermark.this.f22670c.getPaint().measureText(SportCommonWatermark.this.f22670c.getText().toString());
                if (SportCommonWatermark.this.f22668a.getWidth() < SportCommonWatermark.this.f22668a.getPaint().measureText(SportCommonWatermark.this.f22668a.getText().toString()) || width < fMeasureText) {
                    float textSize = SportCommonWatermark.this.f22670c.getTextSize();
                    float textSize2 = SportCommonWatermark.this.f22668a.getTextSize();
                    float f = textSize - 1.0f;
                    SportCommonWatermark.this.h.setTextSize(0, f);
                    SportCommonWatermark.this.f22669b.setTextSize(0, f);
                    SportCommonWatermark.this.f22670c.setTextSize(0, f);
                    float f2 = textSize2 - 1.0f;
                    SportCommonWatermark.this.g.setTextSize(0, f2);
                    SportCommonWatermark.this.f22668a.setTextSize(0, f2);
                    SportCommonWatermark.this.e.setTextSize(0, f2);
                }
            }
        });
    }

    private void d(Context context) {
        View viewInflate = View.inflate(context, R.layout.sport_common_watermark_layout, null);
        this.m = viewInflate;
        this.o = (HealthTextView) viewInflate.findViewById(R.id.top_right_first_data);
        this.n = (HealthTextView) this.m.findViewById(R.id.top_right_second_data);
        this.q = (HealthTextView) this.m.findViewById(R.id.top_right_third_data);
        this.g = (HealthTextView) this.m.findViewById(R.id.bottom_start_value);
        this.h = (HealthTextView) this.m.findViewById(R.id.bottom_start_unit);
        this.f22668a = (HealthTextView) this.m.findViewById(R.id.bottom_center_value);
        this.f22670c = (HealthTextView) this.m.findViewById(R.id.bottom_center_unit);
        this.e = (HealthTextView) this.m.findViewById(R.id.bottom_end_value);
        this.f22669b = (HealthTextView) this.m.findViewById(R.id.bottom_end_unit);
        this.k = (HealthTextView) this.m.findViewById(R.id.main_data_value);
        this.f = (HealthTextView) this.m.findViewById(R.id.main_data_unit);
    }

    private void e(Context context) {
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/hw-italic.ttf");
        this.g.setTypeface(typefaceCreateFromAsset);
        this.f22668a.setTypeface(typefaceCreateFromAsset);
        this.e.setTypeface(typefaceCreateFromAsset);
        this.k.setTypeface(typefaceCreateFromAsset);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshUi(int i, int i2) {
        this.g.setTextColor(i);
        this.h.setTextColor(i);
        this.f22668a.setTextColor(i);
        this.f22670c.setTextColor(i);
        this.e.setTextColor(i);
        this.f22669b.setTextColor(i);
        this.k.setTextColor(i);
        this.f.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshTopUi(int i) {
        this.o.setTextColor(i);
        this.n.setTextColor(i);
        this.q.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public View getView() {
        return this.m;
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
        return this.l;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setSourcePath(String str) {
        this.l = str;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setIsDefaultSource(boolean z) {
        this.i = z;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsDefaultSource() {
        return this.i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void refreshData(gyh gyhVar) {
        if (gyhVar != null) {
            String strA = gyhVar.a();
            String strJ = gyhVar.j();
            String strM = gyhVar.m();
            String strH = gyhVar.h();
            if (pnq.a(strA) || pnq.a(strJ) || pnq.a(strM) || pnq.a(strH)) {
                this.j = true;
                return;
            }
            pnq.d(this.o, gyhVar.x());
            pnq.d(this.n, gyhVar.y());
            pnq.d(this.q, gyhVar.w());
            pnq.d(this.k, strA);
            pnq.d(this.f, gyhVar.b());
            pnq.d(this.h, gyhVar.i());
            pnq.d(this.f22668a, strM);
            pnq.d(this.f22670c, gyhVar.n());
            pnq.d(this.e, strH);
            pnq.d(this.f22669b, gyhVar.e());
            pnq.d(this.g, pnq.b(strJ));
        }
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setWatermarkId(int i) {
        this.s = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getWatermarkId() {
        return this.s;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsNeedHide() {
        return this.j;
    }
}
