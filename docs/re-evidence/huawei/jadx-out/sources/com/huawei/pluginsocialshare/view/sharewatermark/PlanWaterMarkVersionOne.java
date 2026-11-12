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
public class PlanWaterMarkVersionOne extends EditShareCommonView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f22653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f22654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22655c;
    private int d;
    private HealthTextView e;
    private HealthTextView f;
    private ImageView g;
    private HealthTextView h;
    private HealthTextView k;
    private HealthTextView l;
    private String m;
    private View n;
    private HealthTextView o;
    private HealthTextView p;
    private HealthTextView r;
    private int t;
    private boolean j = true;
    private boolean i = false;

    public PlanWaterMarkVersionOne(Context context) {
        a(context);
        d();
    }

    private void d() {
        Typeface typefaceE = gxu.e();
        this.p.setTypeface(typefaceE);
        this.h.setTypeface(typefaceE);
        this.f22654b.setTypeface(typefaceE);
        this.l.setTypeface(typefaceE);
    }

    private void a(Context context) {
        View viewInflate = View.inflate(context, R.layout.plan_watermark_v1, null);
        this.n = viewInflate;
        this.l = (HealthTextView) viewInflate.findViewById(R.id.left_top_first);
        this.o = (HealthTextView) this.n.findViewById(R.id.left_top_forth);
        this.f22655c = (HealthTextView) this.n.findViewById(R.id.left_bottom_first);
        this.k = (HealthTextView) this.n.findViewById(R.id.right_top_first);
        this.p = (HealthTextView) this.n.findViewById(R.id.right_top_second);
        this.f22653a = (HealthTextView) this.n.findViewById(R.id.right_center_first);
        this.h = (HealthTextView) this.n.findViewById(R.id.right_center_second);
        this.e = (HealthTextView) this.n.findViewById(R.id.right_bottom_first);
        this.f22654b = (HealthTextView) this.n.findViewById(R.id.right_bottom_second);
        this.r = (HealthTextView) this.n.findViewById(R.id.edit_share_detail_title_username);
        this.g = (ImageView) this.n.findViewById(R.id.track_share_short_image);
        this.f = (HealthTextView) this.n.findViewById(R.id.edit_share_detail_title_device_name);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void refreshUi(int i, int i2) {
        this.l.setTextColor(i);
        this.o.setTextColor(i);
        this.f22655c.setTextColor(i);
        this.k.setTextColor(i);
        this.p.setTextColor(i);
        this.f22653a.setTextColor(i);
        this.h.setTextColor(i);
        this.e.setTextColor(i);
        this.f22654b.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void refreshTopUi(int i) {
        this.r.setTextColor(i);
        this.f.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public View getView() {
        return this.n;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setBitmap(int i) {
        this.d = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getBitmap() {
        return this.d;
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
            String strM = gyhVar.m();
            String str = gyhVar.s() + " ";
            String strP = gyhVar.p();
            if (pnq.a(strA) || pnq.a(strJ) || pnq.a(strM)) {
                this.i = true;
                return;
            }
            this.l.setText(pnq.a(str, strP, BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.emui_text_size_headline6)));
            pnq.d(this.o, gyhVar.x());
            pnq.d(this.f22655c, gyhVar.y());
            pnq.d(this.k, gyhVar.b());
            pnq.d(this.p, strA);
            pnq.d(this.f22653a, gyhVar.i());
            pnq.d(this.h, strJ);
            pnq.d(this.e, gyhVar.n());
            pnq.d(this.f22654b, strM);
            pnq.d(this.f, "");
        }
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setWatermarkId(int i) {
        this.t = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getWatermarkId() {
        return this.t;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsNeedHide() {
        return this.i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setUserInfo(Bitmap bitmap, String str) {
        if (bitmap == null && TextUtils.isEmpty(str)) {
            this.g.setVisibility(8);
            this.r.setVisibility(8);
            return;
        }
        if (bitmap != null) {
            this.g.setImageBitmap(bitmap);
            this.g.setVisibility(0);
        }
        if (!TextUtils.isEmpty(str)) {
            this.r.setText(str);
            this.r.setVisibility(0);
        }
        if (pnq.d()) {
            pnq.e(this.r);
        }
    }
}
