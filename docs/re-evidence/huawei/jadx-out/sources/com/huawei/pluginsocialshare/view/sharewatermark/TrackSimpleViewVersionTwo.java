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
import defpackage.njy;
import defpackage.pnq;
import defpackage.qqf;
import defpackage.qre;
import health.compact.a.LanguageUtil;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes15.dex */
public class TrackSimpleViewVersionTwo extends EditShareCommonView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f22693b;
    private int d;
    private HealthTextView e;
    private TrackSimpleView f;
    private HealthTextView g;
    private View h;
    private String j;
    private HealthTextView k;
    private ImageView l;
    private HealthTextView m;
    private HealthTextView n;
    private HealthTextView o;
    private int t;
    private int i = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f22692a = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22694c = false;

    public TrackSimpleViewVersionTwo(Context context) {
        a(context);
        a();
    }

    private void a(Context context) {
        View viewInflate = View.inflate(context, R.layout.track_share_watermark_v2, null);
        this.h = viewInflate;
        this.n = (HealthTextView) viewInflate.findViewById(R.id.right_top_first_data);
        this.m = (HealthTextView) this.h.findViewById(R.id.right_top_second_data);
        this.k = (HealthTextView) this.h.findViewById(R.id.edit_share_detail_title_device_name);
        this.g = (HealthTextView) this.h.findViewById(R.id.track_share_watermark_main_data_value);
        this.e = (HealthTextView) this.h.findViewById(R.id.track_share_watermark_main_data_unit);
        this.f = (TrackSimpleView) this.h.findViewById(R.id.track_share_simple_track);
        this.l = (ImageView) this.h.findViewById(R.id.track_share_bitmap_track);
        this.o = (HealthTextView) this.h.findViewById(R.id.edit_share_detail_title_username);
        this.f22693b = (ImageView) this.h.findViewById(R.id.track_share_short_image);
        this.f.a(8.0f);
        if (LanguageUtil.c(context)) {
            this.i = 2;
        }
    }

    private void a() {
        this.g.setTypeface(gxu.e());
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshUi(int i, int i2) {
        this.g.setTextColor(i);
        this.e.setTextColor(i);
        this.f.e(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public View getView() {
        return this.h;
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
    public final void refreshTopUi(int i) {
        this.n.setTextColor(i);
        this.m.setTextColor(i);
        this.k.setTextColor(i);
        this.o.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public String getSourcePath() {
        return this.j;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setSourcePath(String str) {
        this.j = str;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setIsDefaultSource(boolean z) {
        this.f22692a = z;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsDefaultSource() {
        return this.f22692a;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void refreshData(gyh gyhVar) {
        if (gyhVar == null) {
            LogUtil.c("Share_TrackSimpleViewVersionTwo", "saveData trackShareWaterMarkBean is null");
            return;
        }
        if (gyhVar.k() == 1107) {
            d(gyhVar);
        } else if (gyhVar.k() != 1168) {
            LogUtil.c("Share_TrackSimpleViewVersionTwo", "saveData trackShareWaterMarkBean no branch");
        } else {
            a(gyhVar);
        }
    }

    private void d(gyh gyhVar) {
        if (njy.e(gyhVar.t())) {
            this.f22694c = true;
            LogUtil.c("Share_TrackSimpleViewVersionTwo", "saveData points is empty");
            return;
        }
        String strA = gyhVar.a();
        if (pnq.a(strA)) {
            this.f22694c = true;
            return;
        }
        this.l.setVisibility(8);
        this.f.setVisibility(0);
        pnq.d(this.n, gyhVar.x());
        pnq.d(this.m, gyhVar.y());
        pnq.d(this.k, gyhVar.w());
        pnq.d(this.g, strA);
        pnq.d(this.e, gyhVar.b());
        this.f.e(gyhVar.t(), this.i);
    }

    private void a(gyh gyhVar) {
        Bitmap bitmapC = qqf.c(gyhVar.r());
        if (bitmapC == null) {
            this.f22694c = true;
            LogUtil.c("Share_TrackSimpleViewVersionTwo", "refreshBitmapData thumbnail is empty");
            return;
        }
        String strA = gyhVar.a();
        if (pnq.a(strA)) {
            this.f22694c = true;
            return;
        }
        this.l.setVisibility(0);
        this.f.setVisibility(8);
        pnq.d(this.n, qre.i(R.string.IDS_track_route_draw_sport_graffiti));
        pnq.d(this.m, gyhVar.y());
        pnq.d(this.k, gyhVar.w());
        pnq.d(this.g, strA);
        pnq.d(this.e, gyhVar.b());
        this.l.setImageBitmap(bitmapC);
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
        return this.f22694c;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setUserInfo(Bitmap bitmap, String str) {
        if (bitmap == null && TextUtils.isEmpty(str)) {
            this.f22693b.setVisibility(8);
            this.o.setVisibility(8);
            return;
        }
        if (bitmap != null) {
            this.f22693b.setImageBitmap(bitmap);
            this.f22693b.setVisibility(0);
        }
        if (!TextUtils.isEmpty(str)) {
            this.o.setText(str);
            this.o.setVisibility(0);
        }
        if (pnq.d()) {
            pnq.e(this.o);
        }
    }
}
