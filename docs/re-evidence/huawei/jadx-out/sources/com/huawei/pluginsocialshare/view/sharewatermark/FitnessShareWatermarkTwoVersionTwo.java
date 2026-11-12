package com.huawei.pluginsocialshare.view.sharewatermark;

import android.content.Context;
import android.graphics.Bitmap;
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
public class FitnessShareWatermarkTwoVersionTwo extends EditShareCommonView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f22645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22646b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f22647c;
    private int d;
    private ImageView e;
    private HealthTextView f;
    private String g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthTextView j;
    private HealthTextView k;
    private HealthTextView l;
    private HealthTextView m;
    private HealthTextView n;
    private HealthTextView o;
    private int p;
    private HealthTextView q;
    private HealthTextView r;
    private HealthTextView s;
    private HealthTextView t;

    public FitnessShareWatermarkTwoVersionTwo(Context context) {
        e(context);
        e();
    }

    private void e(Context context) {
        View viewInflate = View.inflate(context, R.layout.fitness_watermask_two_v2, null);
        this.f22647c = viewInflate;
        this.r = (HealthTextView) viewInflate.findViewById(R.id.top_left_first_data);
        this.t = (HealthTextView) this.f22647c.findViewById(R.id.top_left_second_data);
        this.q = (HealthTextView) this.f22647c.findViewById(R.id.top_left_third_data);
        this.j = (HealthTextView) this.f22647c.findViewById(R.id.second_line_start_data_title);
        this.i = (HealthTextView) this.f22647c.findViewById(R.id.second_line_start_data_value);
        this.f = (HealthTextView) this.f22647c.findViewById(R.id.second_line_end_data_value);
        this.h = (HealthTextView) this.f22647c.findViewById(R.id.second_line_end_data_title);
        this.m = (HealthTextView) this.f22647c.findViewById(R.id.third_line_start_data_title);
        this.n = (HealthTextView) this.f22647c.findViewById(R.id.third_line_start_data_value);
        this.k = (HealthTextView) this.f22647c.findViewById(R.id.third_line_end_data_title);
        this.o = (HealthTextView) this.f22647c.findViewById(R.id.third_line_end_data_value);
        this.s = (HealthTextView) this.f22647c.findViewById(R.id.edit_share_detail_title_username);
        this.e = (ImageView) this.f22647c.findViewById(R.id.track_share_short_image);
        this.l = (HealthTextView) this.f22647c.findViewById(R.id.edit_share_detail_title_device_name);
    }

    private void e() {
        this.i.setTypeface(gxu.e());
        this.f.setTypeface(gxu.e());
        this.n.setTypeface(gxu.e());
        this.o.setTypeface(gxu.e());
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshUi(int i, int i2) {
        this.i.setTextColor(i);
        this.j.setTextColor(i);
        this.f.setTextColor(i);
        this.h.setTextColor(i);
        this.n.setTextColor(i);
        this.m.setTextColor(i);
        this.o.setTextColor(i);
        this.k.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshTopUi(int i) {
        this.r.setTextColor(i);
        this.t.setTextColor(i);
        this.q.setTextColor(i);
        this.s.setTextColor(i);
        this.l.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public View getView() {
        return this.f22647c;
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
        return this.g;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setSourcePath(String str) {
        this.g = str;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setIsDefaultSource(boolean z) {
        this.f22646b = z;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsDefaultSource() {
        return this.f22646b;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void refreshData(gyh gyhVar) {
        if (gyhVar != null) {
            String strA = gyhVar.a();
            String strJ = gyhVar.j();
            String strM = gyhVar.m();
            String strH = gyhVar.h();
            if (pnq.a(strA) || pnq.a(strJ) || pnq.a(strM) || pnq.a(strH)) {
                this.f22645a = true;
                return;
            }
            pnq.d(this.r, gyhVar.s());
            pnq.d(this.t, gyhVar.p());
            pnq.d(this.q, gyhVar.u());
            pnq.d(this.j, gyhVar.d());
            pnq.d(this.i, strA);
            pnq.d(this.h, gyhVar.g());
            pnq.d(this.f, strJ);
            pnq.d(this.m, gyhVar.f());
            pnq.d(this.n, strM);
            pnq.d(this.k, gyhVar.c());
            pnq.d(this.o, strH);
            pnq.d(this.l, gyhVar.w());
        }
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setWatermarkId(int i) {
        this.p = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getWatermarkId() {
        return this.p;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsNeedHide() {
        return this.f22645a;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setUserInfo(Bitmap bitmap, String str) {
        if (bitmap == null && TextUtils.isEmpty(str)) {
            this.e.setVisibility(8);
            this.s.setVisibility(8);
            return;
        }
        if (bitmap != null) {
            this.e.setImageBitmap(bitmap);
            this.e.setVisibility(0);
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
