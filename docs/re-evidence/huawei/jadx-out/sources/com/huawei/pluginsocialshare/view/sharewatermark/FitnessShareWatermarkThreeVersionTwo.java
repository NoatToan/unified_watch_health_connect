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
public class FitnessShareWatermarkThreeVersionTwo extends EditShareCommonView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f22639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f22640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22641c;
    private HealthTextView d;
    private int e;
    private HealthTextView f;
    private HealthTextView i;
    private ImageView j;
    private HealthTextView k;
    private String l;
    private View m;
    private HealthTextView n;
    private HealthTextView o;
    private HealthTextView p;
    private HealthTextView q;
    private int s;
    private boolean h = true;
    private boolean g = false;

    public FitnessShareWatermarkThreeVersionTwo(Context context) {
        d(context);
        a();
    }

    private void d(Context context) {
        View viewInflate = View.inflate(context, R.layout.fitness_watermark_three_v2, null);
        this.m = viewInflate;
        this.n = (HealthTextView) viewInflate.findViewById(R.id.top_left_first_data);
        this.k = (HealthTextView) this.m.findViewById(R.id.top_left_second_data);
        this.p = (HealthTextView) this.m.findViewById(R.id.top_left_third_data);
        this.f22640b = (HealthTextView) this.m.findViewById(R.id.bottom_start_title);
        this.f = (HealthTextView) this.m.findViewById(R.id.bottom_start_value);
        this.i = (HealthTextView) this.m.findViewById(R.id.bottom_start_unit);
        this.f22641c = (HealthTextView) this.m.findViewById(R.id.bottom_end_title);
        this.f22639a = (HealthTextView) this.m.findViewById(R.id.bottom_end_value);
        this.d = (HealthTextView) this.m.findViewById(R.id.bottom_end_unit);
        this.q = (HealthTextView) this.m.findViewById(R.id.edit_share_detail_title_username);
        this.j = (ImageView) this.m.findViewById(R.id.track_share_short_image);
        this.o = (HealthTextView) this.m.findViewById(R.id.edit_share_detail_title_device_name);
    }

    private void a() {
        this.f.setTypeface(gxu.e());
        this.f22639a.setTypeface(gxu.e());
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshTopUi(int i) {
        this.p.setTextColor(i);
        this.n.setTextColor(i);
        this.k.setTextColor(i);
        this.q.setTextColor(i);
        this.o.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshUi(int i, int i2) {
        this.f22640b.setTextColor(i);
        this.f.setTextColor(i);
        this.i.setTextColor(i);
        this.f22641c.setTextColor(i);
        this.f22639a.setTextColor(i);
        this.d.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public View getView() {
        return this.m;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getBitmap() {
        return this.e;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setBitmap(int i) {
        this.e = i;
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
        this.h = z;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsDefaultSource() {
        return this.h;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void refreshData(gyh gyhVar) {
        if (gyhVar != null) {
            String strA = gyhVar.a();
            String strJ = gyhVar.j();
            if (pnq.a(strA) || pnq.a(strJ)) {
                this.g = true;
                return;
            }
            pnq.d(this.n, gyhVar.s());
            pnq.d(this.k, gyhVar.p());
            pnq.d(this.p, gyhVar.u());
            pnq.d(this.f22640b, gyhVar.d());
            pnq.d(this.f, strA);
            pnq.d(this.i, gyhVar.b());
            pnq.d(this.f22641c, gyhVar.g());
            pnq.d(this.f22639a, strJ);
            pnq.d(this.d, gyhVar.i());
            pnq.d(this.o, gyhVar.w());
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
        return this.g;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setUserInfo(Bitmap bitmap, String str) {
        if (bitmap == null && TextUtils.isEmpty(str)) {
            this.j.setVisibility(8);
            this.q.setVisibility(8);
            return;
        }
        if (bitmap != null) {
            this.j.setImageBitmap(bitmap);
            this.j.setVisibility(0);
        }
        if (!TextUtils.isEmpty(str)) {
            this.q.setText(str);
            this.j.setVisibility(0);
        }
        if (pnq.d()) {
            pnq.e(this.q);
        }
    }
}
