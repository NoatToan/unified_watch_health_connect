package com.huawei.pluginsocialshare.view.sharewatermark;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.huawei.health.socialshare.model.EditShareCommonView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.pluginsocialshare.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gxu;
import defpackage.gyh;
import defpackage.pnq;

/* JADX INFO: loaded from: classes15.dex */
public class PlanWaterMarkVersionTwo extends EditShareCommonView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f22660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22661c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView f;
    private ImageView g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthTextView j;
    private View k;
    private boolean l = true;
    private boolean m = false;
    private String n;
    private HealthTextView o;
    private HealthTextView p;
    private HealthTextView q;
    private HealthTextView r;
    private HealthTextView s;
    private HealthTextView t;
    private int v;

    public PlanWaterMarkVersionTwo(Context context) {
        d(context);
        b();
    }

    private void b() {
        Typeface typefaceE = gxu.e();
        this.r.setTypeface(typefaceE);
        this.f.setTypeface(typefaceE);
        this.f22660b.setTypeface(typefaceE);
        this.o.setTypeface(typefaceE);
    }

    private void d(Context context) {
        View viewInflate = View.inflate(context, R.layout.plan_watermark_v2, null);
        this.k = viewInflate;
        this.o = (HealthTextView) viewInflate.findViewById(R.id.left_top_first);
        this.q = (HealthTextView) this.k.findViewById(R.id.left_top_forth);
        this.f22661c = (HealthTextView) this.k.findViewById(R.id.left_bottom_first);
        this.t = (HealthTextView) this.k.findViewById(R.id.right_top_first);
        this.r = (HealthTextView) this.k.findViewById(R.id.right_top_second);
        this.p = (HealthTextView) this.k.findViewById(R.id.right_top_third);
        this.h = (HealthTextView) this.k.findViewById(R.id.right_center_first);
        this.f = (HealthTextView) this.k.findViewById(R.id.right_center_second);
        this.i = (HealthTextView) this.k.findViewById(R.id.right_center_third);
        this.d = (HealthTextView) this.k.findViewById(R.id.right_bottom_first);
        this.f22660b = (HealthTextView) this.k.findViewById(R.id.right_bottom_second);
        this.e = (HealthTextView) this.k.findViewById(R.id.right_bottom_third);
        this.s = (HealthTextView) this.k.findViewById(R.id.edit_share_detail_title_username);
        this.g = (ImageView) this.k.findViewById(R.id.track_share_short_image);
        this.j = (HealthTextView) this.k.findViewById(R.id.edit_share_detail_title_device_name);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void refreshUi(int i, int i2) {
        this.o.setTextColor(i);
        this.q.setTextColor(i);
        this.f22661c.setTextColor(i);
        this.t.setTextColor(i);
        this.r.setTextColor(i);
        this.p.setTextColor(i);
        this.h.setTextColor(i);
        this.f.setTextColor(i);
        this.i.setTextColor(i);
        this.d.setTextColor(i);
        this.f22660b.setTextColor(i);
        this.e.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void refreshTopUi(int i) {
        this.j.setTextColor(i);
        this.s.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public View getView() {
        return this.k;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setBitmap(int i) {
        this.f22659a = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getBitmap() {
        return this.f22659a;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public String getSourcePath() {
        return this.n;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setSourcePath(String str) {
        this.n = str;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setIsDefaultSource(boolean z) {
        this.l = z;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsDefaultSource() {
        return this.l;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void refreshData(gyh gyhVar) {
        if (gyhVar != null) {
            String strA = gyhVar.a();
            String strJ = gyhVar.j();
            String strM = gyhVar.m();
            String str = gyhVar.s() + " ";
            String strP = gyhVar.p();
            if (pnq.a(strA) || pnq.a(strJ) || pnq.a(strM)) {
                this.m = true;
                return;
            }
            this.o.setText(pnq.a(str, strP, BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.emui_text_size_headline6)));
            pnq.d(this.q, gyhVar.x());
            pnq.d(this.f22661c, gyhVar.y());
            pnq.d(this.t, gyhVar.d());
            pnq.d(this.r, strA);
            pnq.d(this.p, gyhVar.b());
            pnq.d(this.h, gyhVar.g());
            pnq.d(this.f, strJ);
            pnq.d(this.i, gyhVar.i());
            pnq.d(this.d, gyhVar.f());
            pnq.d(this.f22660b, strM);
            pnq.d(this.e, gyhVar.n());
            pnq.d(this.j, "");
        }
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setWatermarkId(int i) {
        this.v = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getWatermarkId() {
        return this.v;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsNeedHide() {
        return this.m;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setUserInfo(Bitmap bitmap, String str) {
        if (bitmap == null && TextUtils.isEmpty(str)) {
            this.g.setVisibility(8);
            this.s.setVisibility(8);
            return;
        }
        if (bitmap != null) {
            this.g.setImageBitmap(bitmap);
            this.g.setVisibility(0);
        }
        if (!TextUtils.isEmpty(str)) {
            this.s.setText(str);
            this.s.setVisibility(0);
        }
        if (pnq.d()) {
            pnq.e(this.s);
        }
    }
}
