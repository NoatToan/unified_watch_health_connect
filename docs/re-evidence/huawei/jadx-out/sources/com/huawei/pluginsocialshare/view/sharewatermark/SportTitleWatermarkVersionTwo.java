package com.huawei.pluginsocialshare.view.sharewatermark;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.health.socialshare.model.EditShareCommonView;
import com.huawei.pluginsocialshare.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gxu;
import defpackage.gyh;
import defpackage.pnq;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes15.dex */
public class SportTitleWatermarkVersionTwo extends EditShareCommonView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f22681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22682c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthTextView j;
    private ImageView l;
    private HealthTextView m;
    private HealthTextView n;
    private String p;
    private LinearLayout q;
    private HealthTextView r;
    private View s;
    private HealthTextView t;
    private HealthTextView u;
    private HealthTextView v;
    private int w;
    private HealthTextView x;
    private boolean o = true;
    private boolean k = false;

    public SportTitleWatermarkVersionTwo(Context context) {
        e(context);
        a();
    }

    private void e(Context context) {
        View viewInflate = View.inflate(context, R.layout.sport_title_watermark_layout_v2, null);
        this.s = viewInflate;
        this.t = (HealthTextView) viewInflate.findViewById(R.id.top_right_first_data);
        this.u = (HealthTextView) this.s.findViewById(R.id.top_right_second_data);
        this.x = (HealthTextView) this.s.findViewById(R.id.edit_share_detail_title_device_name);
        this.m = (HealthTextView) this.s.findViewById(R.id.main_data_value);
        this.n = (HealthTextView) this.s.findViewById(R.id.main_data_unit);
        this.j = (HealthTextView) this.s.findViewById(R.id.bottom_start_title);
        this.g = (HealthTextView) this.s.findViewById(R.id.bottom_start_value);
        this.i = (HealthTextView) this.s.findViewById(R.id.bottom_start_unit);
        this.f22681b = (HealthTextView) this.s.findViewById(R.id.bottom_center_title);
        this.e = (HealthTextView) this.s.findViewById(R.id.bottom_center_value);
        this.f22682c = (HealthTextView) this.s.findViewById(R.id.bottom_center_unit);
        this.d = (HealthTextView) this.s.findViewById(R.id.bottom_end_title);
        this.f = (HealthTextView) this.s.findViewById(R.id.bottom_end_value);
        this.h = (HealthTextView) this.s.findViewById(R.id.bottom_end_unit);
        this.v = (HealthTextView) this.s.findViewById(R.id.edit_share_detail_title_username);
        this.l = (ImageView) this.s.findViewById(R.id.track_share_short_image);
        this.q = (LinearLayout) this.s.findViewById(R.id.right_top_location_layout);
        this.r = (HealthTextView) this.s.findViewById(R.id.top_left_location_data);
    }

    private void a() {
        Typeface typefaceE = gxu.e();
        this.m.setTypeface(typefaceE);
        this.g.setTypeface(typefaceE);
        this.e.setTypeface(typefaceE);
        this.f.setTypeface(typefaceE);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshUi(int i, int i2) {
        this.m.setTextColor(i);
        this.n.setTextColor(i);
        this.j.setTextColor(i);
        this.g.setTextColor(i);
        this.i.setTextColor(i);
        this.f22681b.setTextColor(i);
        this.e.setTextColor(i);
        this.f22682c.setTextColor(i);
        this.d.setTextColor(i);
        this.f.setTextColor(i);
        this.h.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshTopUi(int i) {
        this.u.setTextColor(i);
        this.t.setTextColor(i);
        this.v.setTextColor(i);
        this.x.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public View getView() {
        return this.s;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getBitmap() {
        return this.f22680a;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setBitmap(int i) {
        this.f22680a = i;
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
    public String getSourcePath() {
        return this.p;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setSourcePath(String str) {
        this.p = str;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void refreshData(gyh gyhVar) {
        if (gyhVar != null) {
            String strA = gyhVar.a();
            String strJ = gyhVar.j();
            String strM = gyhVar.m();
            String strH = gyhVar.h();
            if (pnq.a(strA) || pnq.a(strJ) || pnq.a(strM) || pnq.a(strH)) {
                this.k = true;
                return;
            }
            pnq.c(this.g, strJ);
            pnq.d(this.t, gyhVar.x());
            pnq.d(this.u, gyhVar.y());
            pnq.d(this.x, gyhVar.w());
            pnq.d(this.m, strA);
            pnq.d(this.n, gyhVar.b());
            pnq.d(this.j, gyhVar.g());
            pnq.d(this.i, gyhVar.i());
            pnq.d(this.f22681b, gyhVar.f());
            pnq.d(this.e, strM);
            pnq.d(this.f22682c, gyhVar.n());
            pnq.d(this.d, gyhVar.c());
            pnq.d(this.f, strH);
            pnq.d(this.h, gyhVar.e());
            pnq.d(this.r, gyhVar.q());
            this.q.setVisibility(TextUtils.isEmpty(gyhVar.q()) ? 8 : 0);
        }
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsNeedHide() {
        return this.k;
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
    public void setUserInfo(Bitmap bitmap, String str) {
        if (bitmap == null && TextUtils.isEmpty(str)) {
            this.l.setVisibility(8);
            this.v.setVisibility(8);
            return;
        }
        this.l.setVisibility(Utils.k() ? 8 : 0);
        if (bitmap != null) {
            this.l.setImageBitmap(bitmap);
        }
        if (!TextUtils.isEmpty(str)) {
            this.v.setText(str);
            this.v.setVisibility(0);
        }
        if (pnq.d()) {
            pnq.e(this.v);
        }
    }
}
