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
public class SportBottomMainWatermarkVersionTwo extends EditShareCommonView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f22665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22667c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView g;
    private HealthTextView h;
    private ImageView i;
    private HealthTextView j;
    private LinearLayout k;
    private String l;
    private HealthTextView n;
    private View o;
    private HealthTextView p;
    private HealthTextView q;
    private int r;
    private HealthTextView s;
    private HealthTextView t;
    private boolean f = true;
    private boolean m = false;

    public SportBottomMainWatermarkVersionTwo(Context context) {
        a(context);
        a();
    }

    private void a(Context context) {
        View viewInflate = View.inflate(context, R.layout.sport_bottom_main_layout_v2, null);
        this.o = viewInflate;
        this.s = (HealthTextView) viewInflate.findViewById(R.id.top_right_first_data);
        this.k = (LinearLayout) this.o.findViewById(R.id.right_top_location_layout);
        this.n = (HealthTextView) this.o.findViewById(R.id.top_left_location_data);
        this.t = (HealthTextView) this.o.findViewById(R.id.top_right_second_data);
        this.p = (HealthTextView) this.o.findViewById(R.id.edit_share_detail_title_device_name);
        this.d = (HealthTextView) this.o.findViewById(R.id.bottom_start_title);
        this.h = (HealthTextView) this.o.findViewById(R.id.bottom_start_value);
        this.j = (HealthTextView) this.o.findViewById(R.id.bottom_start_unit);
        this.f22667c = (HealthTextView) this.o.findViewById(R.id.bottom_end_title);
        this.e = (HealthTextView) this.o.findViewById(R.id.bottom_end_value);
        this.f22665a = (HealthTextView) this.o.findViewById(R.id.bottom_end_unit);
        this.q = (HealthTextView) this.o.findViewById(R.id.edit_share_detail_title_username);
        this.i = (ImageView) this.o.findViewById(R.id.track_share_short_image);
        this.g = (HealthTextView) this.o.findViewById(R.id.detail_title_device_name);
    }

    private void a() {
        Typeface typefaceE = gxu.e();
        this.h.setTypeface(typefaceE);
        this.e.setTypeface(typefaceE);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshUi(int i, int i2) {
        this.d.setTextColor(i);
        this.h.setTextColor(i);
        this.j.setTextColor(i);
        this.f22667c.setTextColor(i);
        this.e.setTextColor(i);
        this.f22665a.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshTopUi(int i) {
        this.s.setTextColor(i);
        this.t.setTextColor(i);
        this.q.setTextColor(i);
        this.p.setTextColor(i);
        this.g.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public View getView() {
        return this.o;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getBitmap() {
        return this.f22666b;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setBitmap(int i) {
        this.f22666b = i;
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
        this.f = z;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsDefaultSource() {
        return this.f;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void refreshData(gyh gyhVar) {
        if (gyhVar != null) {
            String strA = gyhVar.a();
            String strJ = gyhVar.j();
            if (pnq.a(strA) || pnq.a(strJ)) {
                this.m = true;
                return;
            }
            pnq.c(this.h, strA);
            pnq.d(this.s, gyhVar.x());
            pnq.d(this.n, gyhVar.q());
            pnq.d(this.t, gyhVar.y());
            pnq.d(this.d, gyhVar.d());
            pnq.d(this.j, gyhVar.b());
            pnq.d(this.f22667c, gyhVar.g());
            pnq.d(this.e, strJ);
            pnq.d(this.f22665a, gyhVar.i());
            this.k.setVisibility(TextUtils.isEmpty(gyhVar.q()) ? 8 : 0);
            String strW = gyhVar.w();
            if (TextUtils.isEmpty(strW)) {
                this.p.setVisibility(8);
            } else if (Utils.k()) {
                this.g.setVisibility(0);
                pnq.d(this.g, strW);
            } else {
                pnq.d(this.p, strW);
            }
        }
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setWatermarkId(int i) {
        this.r = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getWatermarkId() {
        return this.r;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsNeedHide() {
        return this.m;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setUserInfo(Bitmap bitmap, String str) {
        if (bitmap == null && TextUtils.isEmpty(str)) {
            this.i.setVisibility(8);
            this.q.setVisibility(8);
            return;
        }
        if (bitmap != null) {
            this.i.setImageBitmap(bitmap);
            this.i.setVisibility(0);
        }
        if (!TextUtils.isEmpty(str)) {
            this.q.setText(str);
            this.q.setVisibility(0);
        }
        if (pnq.d()) {
            pnq.e(this.q);
        }
    }
}
