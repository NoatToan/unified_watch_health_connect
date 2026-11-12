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
public class FitnessShareWatermarkTwo extends EditShareCommonView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f22642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f22643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22644c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthTextView j;
    private boolean k = true;
    private HealthTextView l;
    private HealthTextView m;
    private HealthTextView n;
    private boolean o;
    private String p;
    private View q;
    private HealthTextView r;
    private HealthTextView s;
    private HealthTextView t;
    private int w;

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setUserInfo(Bitmap bitmap, String str) {
    }

    public FitnessShareWatermarkTwo(Context context) {
        e(context);
        d(context);
    }

    private void e(Context context) {
        View viewInflate = View.inflate(context, R.layout.fitness_watermask_two, null);
        this.q = viewInflate;
        this.r = (HealthTextView) viewInflate.findViewById(R.id.top_left_first_data);
        this.s = (HealthTextView) this.q.findViewById(R.id.top_left_second_data);
        this.t = (HealthTextView) this.q.findViewById(R.id.top_left_third_data);
        this.f22643b = (HealthTextView) this.q.findViewById(R.id.first_line_start_data_title);
        this.j = (HealthTextView) this.q.findViewById(R.id.first_line_start_data_value);
        this.g = (HealthTextView) this.q.findViewById(R.id.first_line_start_data_unit);
        this.d = (HealthTextView) this.q.findViewById(R.id.first_line_end_data_title);
        this.f22642a = (HealthTextView) this.q.findViewById(R.id.first_line_end_data_value);
        this.e = (HealthTextView) this.q.findViewById(R.id.first_line_end_data_unit);
        this.n = (HealthTextView) this.q.findViewById(R.id.second_line_start_data_title);
        this.m = (HealthTextView) this.q.findViewById(R.id.second_line_start_data_value);
        this.l = (HealthTextView) this.q.findViewById(R.id.second_line_start_data_unit);
        this.h = (HealthTextView) this.q.findViewById(R.id.second_line_end_data_title);
        this.i = (HealthTextView) this.q.findViewById(R.id.second_line_end_data_value);
        this.f = (HealthTextView) this.q.findViewById(R.id.second_line_end_data_unit);
    }

    private void d(Context context) {
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/hw-italic.ttf");
        this.j.setTypeface(typefaceCreateFromAsset);
        this.f22642a.setTypeface(typefaceCreateFromAsset);
        this.m.setTypeface(typefaceCreateFromAsset);
        this.i.setTypeface(typefaceCreateFromAsset);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshUi(int i, int i2) {
        this.f22643b.setTextColor(i);
        this.j.setTextColor(i);
        this.g.setTextColor(i);
        this.d.setTextColor(i);
        this.f22642a.setTextColor(i);
        this.e.setTextColor(i);
        this.n.setTextColor(i);
        this.m.setTextColor(i);
        this.l.setTextColor(i);
        this.h.setTextColor(i);
        this.i.setTextColor(i);
        this.f.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshTopUi(int i) {
        this.r.setTextColor(i);
        this.s.setTextColor(i);
        this.t.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public View getView() {
        return this.q;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getBitmap() {
        return this.f22644c;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setBitmap(int i) {
        this.f22644c = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public String getSourcePath() {
        return this.p;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setSourcePath(String str) {
        this.p = str;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setIsDefaultSource(boolean z) {
        this.k = z;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsDefaultSource() {
        return this.k;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void refreshData(gyh gyhVar) {
        if (gyhVar != null) {
            String strA = gyhVar.a();
            String strJ = gyhVar.j();
            String strM = gyhVar.m();
            String strH = gyhVar.h();
            if (pnq.a(strA) || pnq.a(strJ) || pnq.a(strM) || pnq.a(strH)) {
                this.o = true;
                return;
            }
            pnq.d(this.r, gyhVar.s());
            pnq.d(this.s, gyhVar.p());
            pnq.d(this.t, gyhVar.u());
            pnq.d(this.f22643b, gyhVar.d());
            pnq.d(this.j, strA);
            pnq.d(this.g, gyhVar.b());
            pnq.d(this.d, gyhVar.g());
            pnq.d(this.f22642a, strJ);
            pnq.d(this.e, gyhVar.i());
            pnq.d(this.n, gyhVar.f());
            pnq.d(this.m, strM);
            pnq.d(this.l, gyhVar.n());
            pnq.d(this.h, gyhVar.c());
            pnq.d(this.i, strH);
            pnq.d(this.f, gyhVar.e());
        }
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setWatermarkId(int i) {
        this.w = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getWatermarkId() {
        return this.w;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsNeedHide() {
        return this.o;
    }
}
