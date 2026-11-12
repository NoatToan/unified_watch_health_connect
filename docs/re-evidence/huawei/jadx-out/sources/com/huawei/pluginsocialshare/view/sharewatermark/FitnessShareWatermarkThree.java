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
public class FitnessShareWatermarkThree extends EditShareCommonView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f22637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22638c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView f;
    private View g;
    private HealthTextView j;
    private HealthTextView k;
    private String l;
    private int m;
    private HealthTextView n;
    private HealthTextView o;
    private boolean i = true;
    private boolean h = false;

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setUserInfo(Bitmap bitmap, String str) {
    }

    public FitnessShareWatermarkThree(Context context) {
        e(context);
        d(context);
    }

    private void e(Context context) {
        View viewInflate = View.inflate(context, R.layout.fitness_watermark_three, null);
        this.g = viewInflate;
        this.n = (HealthTextView) viewInflate.findViewById(R.id.top_left_first_data);
        this.o = (HealthTextView) this.g.findViewById(R.id.top_left_second_data);
        this.k = (HealthTextView) this.g.findViewById(R.id.top_left_third_data);
        this.f22638c = (HealthTextView) this.g.findViewById(R.id.bottom_start_title);
        this.j = (HealthTextView) this.g.findViewById(R.id.bottom_start_value);
        this.f = (HealthTextView) this.g.findViewById(R.id.bottom_start_unit);
        this.e = (HealthTextView) this.g.findViewById(R.id.bottom_end_title);
        this.f22637b = (HealthTextView) this.g.findViewById(R.id.bottom_end_value);
        this.d = (HealthTextView) this.g.findViewById(R.id.bottom_end_unit);
    }

    private void d(Context context) {
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/hw-italic.ttf");
        this.j.setTypeface(typefaceCreateFromAsset);
        this.f22637b.setTypeface(typefaceCreateFromAsset);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshTopUi(int i) {
        this.k.setTextColor(i);
        this.n.setTextColor(i);
        this.o.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshUi(int i, int i2) {
        this.f22638c.setTextColor(i);
        this.j.setTextColor(i);
        this.f.setTextColor(i);
        this.e.setTextColor(i);
        this.f22637b.setTextColor(i);
        this.d.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public View getView() {
        return this.g;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getBitmap() {
        return this.f22636a;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setBitmap(int i) {
        this.f22636a = i;
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
            if (pnq.a(strA) || pnq.a(strJ)) {
                this.h = true;
                return;
            }
            pnq.d(this.n, gyhVar.s());
            pnq.d(this.o, gyhVar.p());
            pnq.d(this.k, gyhVar.u());
            pnq.d(this.f22638c, gyhVar.d());
            pnq.d(this.j, strA);
            pnq.d(this.f, gyhVar.b());
            pnq.d(this.e, gyhVar.g());
            pnq.d(this.f22637b, strJ);
            pnq.d(this.d, gyhVar.i());
        }
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setWatermarkId(int i) {
        this.m = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getWatermarkId() {
        return this.m;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsNeedHide() {
        return this.h;
    }
}
