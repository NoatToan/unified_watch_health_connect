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
public class SportBottomMainWatermark extends EditShareCommonView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f22663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22664c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView f;
    private View h;
    private HealthTextView i;
    private String k;
    private int l;
    private HealthTextView m;
    private HealthTextView n;
    private HealthTextView o;
    private boolean j = true;
    private boolean g = false;

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setUserInfo(Bitmap bitmap, String str) {
    }

    public SportBottomMainWatermark(Context context) {
        b(context);
        d(context);
    }

    private void b(Context context) {
        View viewInflate = View.inflate(context, R.layout.sport_bottom_main_layout, null);
        this.h = viewInflate;
        this.o = (HealthTextView) viewInflate.findViewById(R.id.top_right_first_data);
        this.n = (HealthTextView) this.h.findViewById(R.id.top_right_second_data);
        this.m = (HealthTextView) this.h.findViewById(R.id.top_right_third_data);
        this.d = (HealthTextView) this.h.findViewById(R.id.bottom_start_title);
        this.i = (HealthTextView) this.h.findViewById(R.id.bottom_start_value);
        this.f = (HealthTextView) this.h.findViewById(R.id.bottom_start_unit);
        this.f22664c = (HealthTextView) this.h.findViewById(R.id.bottom_end_title);
        this.f22663b = (HealthTextView) this.h.findViewById(R.id.bottom_end_value);
        this.e = (HealthTextView) this.h.findViewById(R.id.bottom_end_unit);
    }

    private void d(Context context) {
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/hw-italic.ttf");
        this.i.setTypeface(typefaceCreateFromAsset);
        this.f22663b.setTypeface(typefaceCreateFromAsset);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshUi(int i, int i2) {
        this.d.setTextColor(i);
        this.i.setTextColor(i);
        this.f.setTextColor(i);
        this.f22664c.setTextColor(i);
        this.f22663b.setTextColor(i);
        this.f.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshTopUi(int i) {
        this.o.setTextColor(i);
        this.m.setTextColor(i);
        this.n.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public View getView() {
        return this.h;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getBitmap() {
        return this.f22662a;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setBitmap(int i) {
        this.f22662a = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public String getSourcePath() {
        return this.k;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setSourcePath(String str) {
        this.k = str;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setIsDefaultSource(boolean z) {
        this.j = z;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsDefaultSource() {
        return this.j;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void refreshData(gyh gyhVar) {
        if (gyhVar != null) {
            String strA = gyhVar.a();
            String strJ = gyhVar.j();
            boolean z = gyhVar.k() == 1005;
            if ((pnq.a(strA) && !z) || pnq.a(strJ)) {
                this.g = true;
                return;
            }
            pnq.d(this.o, gyhVar.x());
            pnq.d(this.n, gyhVar.y());
            pnq.d(this.m, gyhVar.w());
            pnq.d(this.d, gyhVar.d());
            pnq.d(this.i, strA);
            pnq.d(this.f, gyhVar.b());
            pnq.d(this.f22664c, gyhVar.g());
            pnq.d(this.f22663b, strJ);
            pnq.d(this.e, gyhVar.i());
        }
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setWatermarkId(int i) {
        this.l = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getWatermarkId() {
        return this.l;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsNeedHide() {
        return this.g;
    }
}
