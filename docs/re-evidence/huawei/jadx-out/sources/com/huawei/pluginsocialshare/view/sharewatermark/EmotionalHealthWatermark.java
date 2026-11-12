package com.huawei.pluginsocialshare.view.sharewatermark;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.health.socialshare.model.EditShareCommonView;
import com.huawei.pluginsocialshare.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gyh;
import defpackage.pnq;
import defpackage.qqf;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes15.dex */
public class EmotionalHealthWatermark extends EditShareCommonView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f22628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22629c;
    private HealthTextView d;
    private HealthTextView e;
    private RelativeLayout f;
    private HealthTextView g;
    private HealthTextView h;
    private LinearLayout i;
    private HealthTextView j;
    private HealthTextView l;
    private ImageView m;
    private View o;
    private HealthTextView p;
    private HealthTextView q;
    private ImageView r;
    private String s;
    private ImageView t;
    private int x;
    private boolean k = true;
    private boolean n = false;

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshUi(int i, int i2) {
    }

    public EmotionalHealthWatermark(Context context) {
        a(context);
        c(context);
    }

    private void a(Context context) {
        View viewInflate = View.inflate(context, R.layout.emotional_health_share_watermark, null);
        this.o = viewInflate;
        this.f = (RelativeLayout) viewInflate.findViewById(R.id.emotion_real);
        this.i = (LinearLayout) this.o.findViewById(R.id.emotion_pressure);
        this.f22629c = (HealthTextView) this.o.findViewById(R.id.data_title);
        this.f22628b = (HealthTextView) this.o.findViewById(R.id.data_value);
        this.d = (HealthTextView) this.o.findViewById(R.id.data_date);
        this.l = (HealthTextView) this.o.findViewById(R.id.real_date);
        this.e = (HealthTextView) this.o.findViewById(R.id.edit_share_detail_title_device_name);
        this.p = (HealthTextView) this.o.findViewById(R.id.right_top_first_data_real);
        this.r = (ImageView) this.o.findViewById(R.id.share_real_bitmap);
        this.t = (ImageView) this.o.findViewById(R.id.track_share_bitmap_track);
        this.q = (HealthTextView) this.o.findViewById(R.id.edit_share_detail_title_username);
        this.m = (ImageView) this.o.findViewById(R.id.track_share_short_image);
        this.h = (HealthTextView) this.o.findViewById(R.id.emotion_high_type);
        this.j = (HealthTextView) this.o.findViewById(R.id.emotion_calm_type);
        this.g = (HealthTextView) this.o.findViewById(R.id.emotion_pressure_type);
    }

    private void c(Context context) {
        this.f22628b.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/hw-italic.ttf"));
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public View getView() {
        return this.o;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getBitmap() {
        return this.f22627a;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setBitmap(int i) {
        this.f22627a = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshTopUi(int i) {
        this.e.setTextColor(i);
        this.q.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public String getSourcePath() {
        return this.s;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setSourcePath(String str) {
        this.s = str;
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
        if (gyhVar == null) {
            LogUtil.c("Share_EmotionalHealthWatermark", "saveData shareWaterMarkBean is null");
            return;
        }
        if (gyhVar.k() == 1169) {
            e(gyhVar);
        } else if (gyhVar.k() == 1170) {
            c(gyhVar);
        } else if (gyhVar.k() == 1171) {
            b(gyhVar);
        } else if (gyhVar.k() != 1172) {
            LogUtil.c("Share_EmotionalHealthWatermark", "refreshData shareWaterMarkBean no branch");
        } else {
            d(gyhVar);
        }
        c(gyhVar.y(), gyhVar.w());
    }

    private void e(gyh gyhVar) {
        Bitmap bitmapC = qqf.c(gyhVar.r());
        if (bitmapC == null) {
            this.n = true;
            LogUtil.c("Share_EmotionalHealthWatermark", "refreshRealData thumbnail is empty");
            return;
        }
        this.f.setVisibility(0);
        this.i.setVisibility(8);
        pnq.d(this.p, gyhVar.d());
        pnq.d(this.e, gyhVar.s());
        this.r.setBackground(qqf.d(bitmapC));
        String strA = gyhVar.a();
        if (TextUtils.isEmpty(strA) || !strA.contains(",")) {
            return;
        }
        String[] strArrSplit = strA.split(",");
        if (strArrSplit.length >= 3) {
            this.h.setText(strArrSplit[0]);
            this.j.setText(strArrSplit[1]);
            this.g.setText(strArrSplit[2]);
        }
    }

    private void c(gyh gyhVar) {
        if (TextUtils.isEmpty(gyhVar.a())) {
            this.n = true;
            return;
        }
        this.f.setVisibility(8);
        this.i.setVisibility(0);
        pnq.d(this.f22629c, gyhVar.d());
        pnq.d(this.f22628b, gyhVar.a());
        pnq.d(this.e, gyhVar.s());
        this.t.setImageResource(R.drawable.curves_pressure_hight);
    }

    private void b(gyh gyhVar) {
        if (TextUtils.isEmpty(gyhVar.a())) {
            this.n = true;
            return;
        }
        this.f.setVisibility(8);
        this.i.setVisibility(0);
        pnq.d(this.f22629c, gyhVar.d());
        pnq.d(this.f22628b, gyhVar.a());
        pnq.d(this.e, gyhVar.s());
        this.t.setImageResource(R.drawable.curves_emotion_low);
    }

    private void d(gyh gyhVar) {
        if (TextUtils.isEmpty(gyhVar.a())) {
            this.n = true;
            return;
        }
        this.f.setVisibility(8);
        this.i.setVisibility(0);
        pnq.d(this.f22629c, gyhVar.d());
        pnq.d(this.f22628b, gyhVar.a());
        pnq.d(this.e, gyhVar.s());
        this.t.setImageResource(R.drawable.curves_emotion_hight);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setWatermarkId(int i) {
        this.x = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getWatermarkId() {
        return this.x;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsNeedHide() {
        return this.n;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setUserInfo(Bitmap bitmap, String str) {
        if (bitmap == null && TextUtils.isEmpty(str)) {
            this.m.setVisibility(8);
            this.q.setVisibility(8);
            return;
        }
        if (bitmap != null) {
            this.m.setImageBitmap(bitmap);
            this.m.setVisibility(0);
        }
        if (!TextUtils.isEmpty(str)) {
            this.q.setText(str);
            this.q.setVisibility(0);
        }
        if (pnq.d()) {
            pnq.e(this.q);
        }
    }

    private void c(String str, String str2) {
        LogUtil.a("Share_EmotionalHealthWatermark", "setDateInfo dateStr:", str, " weekNum:", str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.d.setText(str);
        this.l.setText(str);
    }
}
