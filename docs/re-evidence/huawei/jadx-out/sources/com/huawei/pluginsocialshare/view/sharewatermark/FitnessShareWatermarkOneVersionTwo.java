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
public class FitnessShareWatermarkOneVersionTwo extends EditShareCommonView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f22633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f22634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22635c;
    private HealthTextView d;
    private int e;
    private HealthTextView f;
    private ImageView g;
    private boolean h = true;
    private boolean i = false;
    private HealthTextView j;
    private HealthTextView k;
    private HealthTextView l;
    private String m;
    private View n;
    private HealthTextView o;
    private HealthTextView p;
    private int q;
    private HealthTextView r;

    public FitnessShareWatermarkOneVersionTwo(Context context) {
        b(context);
        b();
    }

    private void b(Context context) {
        View viewInflate = View.inflate(context, R.layout.fitness_watermak_one_v2, null);
        this.n = viewInflate;
        this.l = (HealthTextView) viewInflate.findViewById(R.id.top_left_first_data);
        this.k = (HealthTextView) this.n.findViewById(R.id.top_left_second_data);
        this.p = (HealthTextView) this.n.findViewById(R.id.top_left_third_data);
        this.j = (HealthTextView) this.n.findViewById(R.id.bottom_start_title);
        this.f = (HealthTextView) this.n.findViewById(R.id.bottom_start_value);
        this.d = (HealthTextView) this.n.findViewById(R.id.bottom_center_title);
        this.f22635c = (HealthTextView) this.n.findViewById(R.id.bottom_center_value);
        this.f22634b = (HealthTextView) this.n.findViewById(R.id.bottom_end_title);
        this.f22633a = (HealthTextView) this.n.findViewById(R.id.bottom_end_value);
        this.r = (HealthTextView) this.n.findViewById(R.id.edit_share_detail_title_username);
        this.g = (ImageView) this.n.findViewById(R.id.track_share_short_image);
        this.o = (HealthTextView) this.n.findViewById(R.id.edit_share_detail_title_device_name);
    }

    private void b() {
        this.f.setTypeface(gxu.e());
        this.f22635c.setTypeface(gxu.e());
        this.f22633a.setTypeface(gxu.e());
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshUi(int i, int i2) {
        this.j.setTextColor(i);
        this.f.setTextColor(i);
        this.d.setTextColor(i);
        this.f22635c.setTextColor(i);
        this.f22634b.setTextColor(i);
        this.f22633a.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshTopUi(int i) {
        this.p.setTextColor(i);
        this.l.setTextColor(i);
        this.k.setTextColor(i);
        this.r.setTextColor(i);
        this.o.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public View getView() {
        return this.n;
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
        return this.m;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setSourcePath(String str) {
        this.m = str;
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
            String strM = gyhVar.m();
            if (pnq.a(strA) || pnq.a(strJ) || pnq.a(strM)) {
                this.i = true;
                return;
            }
            pnq.d(this.l, gyhVar.s());
            pnq.d(this.k, gyhVar.p());
            pnq.d(this.p, gyhVar.u());
            pnq.d(this.j, gyhVar.d());
            pnq.d(this.f, strA);
            pnq.d(this.d, gyhVar.g());
            pnq.d(this.f22635c, strJ);
            pnq.d(this.f22634b, gyhVar.f());
            pnq.d(this.f22633a, strM);
            pnq.d(this.o, gyhVar.w());
        }
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setWatermarkId(int i) {
        this.q = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getWatermarkId() {
        return this.q;
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
