package com.huawei.pluginsocialshare.view.sharewatermark;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.huawei.health.socialshare.model.EditShareCommonView;
import com.huawei.pluginsocialshare.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gxu;
import defpackage.gyh;
import defpackage.pnq;

/* JADX INFO: loaded from: classes15.dex */
public class PlanWaterMarkVersionThree extends EditShareCommonView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f22656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f22657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22658c;
    private int d;
    private HealthTextView e;
    private View f;
    private boolean g = true;
    private boolean h = false;
    private HealthTextView i;
    private ImageView j;
    private String k;
    private HealthTextView l;
    private HealthTextView m;
    private HealthTextView n;
    private HealthTextView o;
    private HealthTextView r;
    private int s;

    public PlanWaterMarkVersionThree(Context context) {
        e(context);
        d();
    }

    private void d() {
        Typeface typefaceE = gxu.e();
        this.e.setTypeface(typefaceE);
        this.f22658c.setTypeface(typefaceE);
    }

    private void e(Context context) {
        View viewInflate = View.inflate(context, R.layout.plan_watermark_v3, null);
        this.f = viewInflate;
        this.l = (HealthTextView) viewInflate.findViewById(R.id.top_left_first_data);
        this.m = (HealthTextView) this.f.findViewById(R.id.top_left_second_data);
        this.f22658c = (HealthTextView) this.f.findViewById(R.id.left_buttom_first);
        this.f22656a = (HealthTextView) this.f.findViewById(R.id.left_buttom_second);
        this.n = (HealthTextView) this.f.findViewById(R.id.left_top_first);
        this.o = (HealthTextView) this.f.findViewById(R.id.right_top_first);
        this.e = (HealthTextView) this.f.findViewById(R.id.right_bottom_first);
        this.f22657b = (HealthTextView) this.f.findViewById(R.id.right_bottom_second);
        this.r = (HealthTextView) this.f.findViewById(R.id.edit_share_detail_title_username);
        this.j = (ImageView) this.f.findViewById(R.id.track_share_short_image);
        this.i = (HealthTextView) this.f.findViewById(R.id.edit_share_detail_title_device_name);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void refreshUi(int i, int i2) {
        this.l.setTextColor(i);
        this.m.setTextColor(i);
        this.f22658c.setTextColor(i);
        this.f22656a.setTextColor(i);
        this.n.setTextColor(i);
        this.o.setTextColor(i);
        this.e.setTextColor(i);
        this.f22657b.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void refreshTopUi(int i) {
        this.i.setTextColor(i);
        this.r.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public View getView() {
        return this.f;
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
        return this.k;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setSourcePath(String str) {
        this.k = str;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setIsDefaultSource(boolean z) {
        this.g = z;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsDefaultSource() {
        return this.g;
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
            pnq.d(this.l, gyhVar.x());
            pnq.d(this.m, gyhVar.y());
            pnq.d(this.f22658c, strA);
            pnq.d(this.f22656a, gyhVar.b());
            pnq.d(this.n, gyhVar.d());
            pnq.d(this.o, gyhVar.g());
            pnq.d(this.e, strJ);
            pnq.d(this.f22657b, gyhVar.i());
            pnq.d(this.i, gyhVar.w());
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
        return this.h;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setUserInfo(Bitmap bitmap, String str) {
        if (bitmap == null && TextUtils.isEmpty(str)) {
            this.j.setVisibility(8);
            this.r.setVisibility(8);
            return;
        }
        if (bitmap != null) {
            this.j.setImageBitmap(bitmap);
            this.j.setVisibility(0);
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
