package com.huawei.pluginsocialshare.view.sharewatermark;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.socialshare.model.EditShareCommonView;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsocialshare.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.gxu;
import defpackage.gyh;
import defpackage.njy;
import defpackage.pnq;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes15.dex */
public class SportCommonWatermarkVersionTwo extends EditShareCommonView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f22671a;
    private String aa;
    private HealthTextView ab;
    private TrackSimpleView ac;
    private HealthTextView ad;
    private HealthTextView ae;
    private HealthTextView af;
    private HealthTextView ag;
    private HealthTextView ah;
    private int ai;
    private HealthTextView ak;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22673c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView f;
    private ImageView g;
    private HealthTextView h;
    private boolean i;
    private HealthTextView j;
    private HealthTextView k;
    private boolean l = false;
    private LinearLayout m;
    private HealthTextView n;
    private LinearLayout o;
    private HealthTextView p;
    private HealthTextView q;
    private HealthTextView r;
    private View s;
    private LinearLayout t;
    private LinearLayout u;
    private HealthTextView v;
    private HealthTextView w;
    private HealthTextView x;
    private HealthTextView y;
    private HealthTextView z;

    public SportCommonWatermarkVersionTwo(Context context) {
        d(context);
        a();
    }

    private void d(Context context) {
        View viewInflate = View.inflate(context, R.layout.sport_common_watermark_layout_v2, null);
        this.s = viewInflate;
        this.ae = (HealthTextView) viewInflate.findViewById(R.id.first_line_first_data);
        this.af = (HealthTextView) this.s.findViewById(R.id.first_line_second_data);
        this.o = (LinearLayout) this.s.findViewById(R.id.first_line_data_layout);
        this.u = (LinearLayout) this.s.findViewById(R.id.second_line_start_data_lin);
        this.t = (LinearLayout) this.s.findViewById(R.id.outdoor_adventures_title_lin);
        this.p = (HealthTextView) this.s.findViewById(R.id.outdoor_adventures_title);
        this.k = (HealthTextView) this.s.findViewById(R.id.outdoor_adventures_time);
        this.n = (HealthTextView) this.s.findViewById(R.id.outdoor_adventures_short_language);
        this.ak = (HealthTextView) this.s.findViewById(R.id.third_line_end_data_unit);
        this.f = (HealthTextView) this.s.findViewById(R.id.duration_unit_day);
        this.j = (HealthTextView) this.s.findViewById(R.id.duration_unit_hours);
        this.h = (HealthTextView) this.s.findViewById(R.id.duration_unit_minute);
        this.d = (HealthTextView) this.s.findViewById(R.id.duration_day_hour);
        this.e = (HealthTextView) this.s.findViewById(R.id.duration_minute);
        this.f22673c = (HealthTextView) this.s.findViewById(R.id.duration_day);
        this.m = (LinearLayout) this.s.findViewById(R.id.outdoor_adventures_time_lin);
        this.w = (HealthTextView) this.s.findViewById(R.id.second_line_start_data_title);
        this.y = (HealthTextView) this.s.findViewById(R.id.second_line_start_data_value);
        this.v = (HealthTextView) this.s.findViewById(R.id.second_line_start_data_unit);
        this.q = (HealthTextView) this.s.findViewById(R.id.second_line_end_data_value);
        this.r = (HealthTextView) this.s.findViewById(R.id.second_line_end_data_title);
        this.x = (HealthTextView) this.s.findViewById(R.id.second_line_end_data_unit);
        this.ag = (HealthTextView) this.s.findViewById(R.id.third_line_start_data_title);
        this.z = (HealthTextView) this.s.findViewById(R.id.third_line_start_data_value);
        this.ad = (HealthTextView) this.s.findViewById(R.id.third_line_end_data_title);
        this.ab = (HealthTextView) this.s.findViewById(R.id.third_line_end_data_value);
        this.ah = (HealthTextView) this.s.findViewById(R.id.edit_share_detail_title_username);
        this.g = (ImageView) this.s.findViewById(R.id.track_share_short_image);
        this.f22671a = (HealthTextView) this.s.findViewById(R.id.edit_share_detail_title_device_name);
        this.ac = (TrackSimpleView) this.s.findViewById(R.id.adventures_share_simple_track);
    }

    private void a() {
        Typeface typefaceE = gxu.e();
        this.y.setTypeface(typefaceE);
        this.q.setTypeface(typefaceE);
        this.z.setTypeface(typefaceE);
        this.d.setTypeface(typefaceE);
        this.e.setTypeface(typefaceE);
        this.f22673c.setTypeface(typefaceE);
        this.ab.setTypeface(typefaceE);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshUi(int i, int i2) {
        this.p.setTextColor(i);
        this.k.setTextColor(i);
        this.n.setTextColor(i);
        this.ae.setTextColor(i);
        this.af.setTextColor(i);
        this.y.setTextColor(i);
        this.w.setTextColor(i);
        this.v.setTextColor(i);
        this.q.setTextColor(i);
        this.r.setTextColor(i);
        this.x.setTextColor(i);
        this.z.setTextColor(i);
        this.ag.setTextColor(i);
        this.ab.setTextColor(i);
        this.ad.setTextColor(i);
        this.ak.setTextColor(i);
        this.d.setTextColor(i);
        this.e.setTextColor(i);
        this.f22673c.setTextColor(i);
        this.f.setTextColor(i);
        this.j.setTextColor(i);
        this.h.setTextColor(i);
        this.ac.e(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshTopUi(int i) {
        this.ah.setTextColor(i);
        this.f22671a.setTextColor(i);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public View getView() {
        return this.s;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getBitmap() {
        return this.f22672b;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setBitmap(int i) {
        this.f22672b = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public String getSourcePath() {
        return this.aa;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setSourcePath(String str) {
        this.aa = str;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setIsDefaultSource(boolean z) {
        this.i = z;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsDefaultSource() {
        return this.i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void refreshData(gyh gyhVar) {
        if (gyhVar != null) {
            String strA = gyhVar.a();
            String strJ = gyhVar.j();
            String strM = gyhVar.m();
            String strH = gyhVar.h();
            int iK = gyhVar.k();
            boolean z = iK == 1166 || iK == 1167;
            if ((pnq.a(strA) || pnq.a(strJ) || pnq.a(strM) || pnq.a(strH)) && !z) {
                this.l = true;
                return;
            }
            if (njy.e(gyhVar.t()) && iK == 1167) {
                LogUtil.j("Share_SportCommonWatermarkVersionTwo", "refreshData points is empty");
                this.l = true;
                return;
            }
            this.r.setVisibility(pnq.a(strJ) ? 8 : 0);
            this.q.setVisibility(pnq.a(strJ) ? 8 : 0);
            pnq.d(this.r, gyhVar.g());
            pnq.c(this.q, (CharSequence) strJ);
            pnq.d(this.x, gyhVar.i());
            pnq.d(this.ad, gyhVar.c());
            pnq.d(this.ag, gyhVar.f());
            pnq.d(this.ab, strH);
            pnq.d(this.f22671a, gyhVar.w());
            if (z) {
                c(gyhVar);
            } else {
                c(gyhVar, strA, strM);
            }
        }
    }

    private void c(gyh gyhVar) {
        this.o.setVisibility(8);
        this.z.setVisibility(8);
        this.u.setVisibility(8);
        this.t.setVisibility(0);
        this.m.setVisibility(0);
        this.ak.setVisibility(0);
        pnq.d(this.ak, gyhVar.e());
        pnq.d(this.p, gyhVar.d());
        pnq.d(this.k, gyhVar.a());
        String strQ = gyhVar.q();
        if (LanguageUtil.f(BaseApplication.b())) {
            LogUtil.a("Share_SportCommonWatermarkVersionTwo", "outdoorAdventuresWatermark isChinese");
            pnq.d(this.n, strQ);
        }
        this.ag.setVisibility(TextUtils.isEmpty(strQ) && gyhVar.k() == 1167 ? 8 : 0);
        e(gyhVar);
        d(gyhVar);
    }

    private void e(gyh gyhVar) {
        try {
            long j = Long.parseLong(gyhVar.m());
            int i = (int) (j / 86400000);
            long j2 = j - ((long) (86400000 * i));
            int i2 = (int) (j2 / 3600000);
            int iCeil = (int) Math.ceil((j2 - ((long) (3600000 * i2))) / 60000.0d);
            if (i > 0) {
                pnq.d(this.f22673c, UnitUtil.e(i, 1, 0));
                pnq.d(this.f, gyhVar.s());
            }
            if (i2 > 0) {
                pnq.d(this.d, UnitUtil.e(i2, 1, 0));
                pnq.d(this.j, gyhVar.p());
            }
            if (iCeil > 0) {
                pnq.d(this.e, UnitUtil.e(iCeil, 1, 0));
                pnq.d(this.h, gyhVar.u());
            }
        } catch (NumberFormatException unused) {
            LogUtil.e("Share_SportCommonWatermarkVersionTwo", "setAdventuresDuration time is illegal");
            pnq.d(this.f22673c, gyhVar.m());
        }
    }

    private void d(gyh gyhVar) {
        this.ac.setVisibility(gyhVar.v() ? 0 : 8);
        this.ac.a(8.0f);
        this.ac.e(gyhVar.t(), 3);
    }

    private void c(gyh gyhVar, String str, String str2) {
        this.o.setVisibility(0);
        this.z.setVisibility(0);
        this.u.setVisibility(0);
        this.t.setVisibility(8);
        this.m.setVisibility(8);
        this.ak.setVisibility(8);
        pnq.d(this.ae, gyhVar.x());
        pnq.d(this.af, gyhVar.y());
        pnq.d(this.w, gyhVar.d());
        pnq.c(this.y, str);
        pnq.d(this.v, gyhVar.b());
        pnq.d(this.z, str2);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setWatermarkId(int i) {
        this.ai = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getWatermarkId() {
        return this.ai;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsNeedHide() {
        return this.l;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setUserInfo(Bitmap bitmap, String str) {
        if (bitmap == null && TextUtils.isEmpty(str)) {
            this.g.setVisibility(8);
            this.ah.setVisibility(8);
            return;
        }
        this.g.setVisibility(Utils.k() ? 8 : 0);
        if (bitmap != null) {
            this.g.setImageBitmap(bitmap);
        }
        if (!TextUtils.isEmpty(str)) {
            this.ah.setText(str);
            this.ah.setVisibility(0);
        }
        if (pnq.d()) {
            pnq.e(this.ah);
        }
    }
}
