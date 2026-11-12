package com.huawei.pluginsocialshare.view.sharewatermark;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.health.socialshare.model.EditShareCommonView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.pluginsocialshare.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.view.threeCircle.ThreeCircleView;
import defpackage.gyh;
import defpackage.pnq;
import defpackage.qho;
import defpackage.qqn;
import defpackage.qrs;
import defpackage.qth;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes15.dex */
public class ThreeCircleShareWatermark extends EditShareCommonView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f22683a;
    private HealthTextView ac;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f22684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f22685c;
    private HealthTextView d;
    private int e;
    private HealthTextView g;
    private HealthTextView h;
    private ImageView i;
    private RelativeLayout j;
    private View k;
    private String l;
    private HealthTextView m;
    private LinearLayout n;
    private HealthTextView p;
    private HealthTextView q;
    private HealthTextView r;
    private HealthTextView s;
    private HealthTextView t;
    private RelativeLayout u;
    private ThreeCircleView v;
    private HealthTextView w;
    private HealthTextView x;
    private HealthTextView y;
    private int z;
    private boolean f = true;
    private boolean o = false;

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public final void refreshUi(int i, int i2) {
    }

    public ThreeCircleShareWatermark(Context context) {
        c(context);
        d(context);
    }

    private void c(Context context) {
        View viewInflate = View.inflate(context, R.layout.three_circle_watermark_layout, null);
        this.k = viewInflate;
        this.n = (LinearLayout) viewInflate.findViewById(R.id.ll_perfect_circle_data);
        this.m = (HealthTextView) this.k.findViewById(R.id.tv_perfect_circle_data);
        this.r = (HealthTextView) this.k.findViewById(R.id.tv_date);
        this.ac = (HealthTextView) this.k.findViewById(R.id.edit_share_detail_title_username);
        this.i = (ImageView) this.k.findViewById(R.id.track_share_short_image);
        this.w = (HealthTextView) this.k.findViewById(R.id.edit_share_detail_title_device_name);
        this.v = (ThreeCircleView) this.k.findViewById(R.id.three_circle_layout_container);
        this.i.setVisibility(Utils.k() ? 8 : 0);
        this.u = (RelativeLayout) this.k.findViewById(R.id.step_three_circle_date_layout);
        this.t = (HealthTextView) this.k.findViewById(R.id.tv_sport_intensity_time);
        this.s = (HealthTextView) this.k.findViewById(R.id.tv_sport_intensity_time_unit);
        this.y = (HealthTextView) this.k.findViewById(R.id.tv_steps);
        this.x = (HealthTextView) this.k.findViewById(R.id.tv_steps_unit);
        this.p = (HealthTextView) this.k.findViewById(R.id.tv_sport_hours);
        this.q = (HealthTextView) this.k.findViewById(R.id.tv_sport_hours_unit);
        this.j = (RelativeLayout) this.k.findViewById(R.id.calorie_three_circle_date_layout);
        this.d = (HealthTextView) this.k.findViewById(R.id.tv_active_caloric);
        this.f22683a = (HealthTextView) this.k.findViewById(R.id.tv_active_caloric_unit);
        if (LanguageUtil.j(context) || LanguageUtil.g(context)) {
            this.f22683a.setAutoTextInfo(10, 1, 1);
            this.f22683a.setMaxWidth(context.getResources().getDimensionPixelSize(R.dimen.health_common_35dp));
        }
        this.f22685c = (HealthTextView) this.k.findViewById(R.id.tv_active_workout);
        this.f22684b = (HealthTextView) this.k.findViewById(R.id.tv_active_workout_unit);
        this.h = (HealthTextView) this.k.findViewById(R.id.tv_hours);
        this.g = (HealthTextView) this.k.findViewById(R.id.tv_hours_unit);
        HealthTextView healthTextView = (HealthTextView) this.j.findViewById(R.id.activity_hours);
        HealthTextView healthTextView2 = (HealthTextView) this.u.findViewById(R.id.activity_hours);
        qho.e(R.string.IDS_three_circle_card_activity_hours);
        if (healthTextView != null) {
            healthTextView.setText(qho.e(R.string.IDS_three_circle_card_activity_hours));
        }
        if (healthTextView2 != null) {
            healthTextView2.setText(qho.e(R.string.IDS_three_circle_card_activity_hours));
        }
    }

    private void e() {
        qth.b bVar = new qth.b();
        bVar.d(new int[]{qqn.d(R.color.common_colorWhite_4d), qqn.d(R.color.common_colorWhite_4d)}).e(new int[]{qqn.d(R.color.step_circle_process_start_color), qqn.d(R.color.step_circle_process_end_color)}).c();
        qth qthVar = new qth(bVar);
        qth.b bVar2 = new qth.b();
        bVar2.d(new int[]{qqn.d(R.color.common_colorWhite_4d), qqn.d(R.color.common_colorWhite_4d)}).e(new int[]{qqn.d(R.color.strength_circle_process_start_color), qqn.d(R.color.strength_circle_process_end_color)}).c();
        qth qthVar2 = new qth(bVar2);
        qth.b bVar3 = new qth.b();
        bVar3.d(new int[]{qqn.d(R.color.common_colorWhite_4d), qqn.d(R.color.common_colorWhite_4d)}).e(new int[]{qqn.d(R.color.activity_circle_process_start_color), qqn.d(R.color.activity_circle_process_end_color)}).c();
        qth qthVar3 = new qth(bVar3);
        LinkedHashMap<String, qth> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("firstCircle", qthVar);
        linkedHashMap.put("secondCircle", qthVar2);
        linkedHashMap.put("thirdCircle", qthVar3);
        this.v.e(linkedHashMap);
    }

    private void d(Context context) {
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/hw-italic.ttf");
        this.t.setTypeface(typefaceCreateFromAsset);
        this.y.setTypeface(typefaceCreateFromAsset);
        this.d.setTypeface(typefaceCreateFromAsset);
        this.f22685c.setTypeface(typefaceCreateFromAsset);
        this.h.setTypeface(typefaceCreateFromAsset);
        this.p.setTypeface(typefaceCreateFromAsset);
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public View getView() {
        return this.k;
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
    public final void refreshTopUi(int i) {
        this.ac.setTextColor(i);
        this.w.setTextColor(i);
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
        if (gyhVar == null) {
            ReleaseLogUtil.a("Share_ThreeCircleShareWatermark", "saveData sportShareWatermarkBean is null");
            return;
        }
        if ("0".equals(gyhVar.l())) {
            this.u.setVisibility(0);
            e();
            b(gyhVar);
        } else {
            this.j.setVisibility(0);
            c(gyhVar);
        }
        pnq.d(this.r, gyhVar.y());
        pnq.d(this.w, gyhVar.w());
        a(gyhVar.s());
    }

    private void c(gyh gyhVar) {
        String strF = "0";
        try {
            String strA = gyhVar.a();
            String strJ = gyhVar.j();
            String strM = gyhVar.m();
            pnq.d(this.d, d(strA));
            pnq.d(this.f22683a, gyhVar.b());
            pnq.d(this.f22685c, d(strJ));
            pnq.d(this.f22684b, gyhVar.i());
            pnq.d(this.h, d(strM));
            pnq.d(this.g, gyhVar.n());
            if (strA.length() > 3 || qrs.a(2.0f)) {
                e(12.0f);
            }
            String strD = "0".equals(strA) ? "0" : gyhVar.d();
            String strG = "0".equals(strJ) ? "0" : gyhVar.g();
            if (!"0".equals(strM)) {
                strF = gyhVar.f();
            }
            ReleaseLogUtil.d("Share_ThreeCircleShareWatermark", "refreshCalorieCircleData caloric: ", strA, "/", strD, ", activeWorkout: ", strJ, "/", strG, ", hours: ", strM, "/", strF);
            this.v.a("firstCircle", Integer.parseInt(strA), Integer.parseInt(strD));
            this.v.a("secondCircle", Integer.parseInt(strJ), Integer.parseInt(strG));
            this.v.a("thirdCircle", Integer.parseInt(strM), Integer.parseInt(strF));
        } catch (NumberFormatException e) {
            LogUtil.c("Share_ThreeCircleShareWatermark", "refreshCalorieCircleData exception: ", e.getMessage());
        }
    }

    private void b(gyh gyhVar) {
        String strF = "0";
        try {
            String strA = gyhVar.a();
            String strJ = gyhVar.j();
            String strM = gyhVar.m();
            pnq.d(this.t, d(strJ));
            pnq.d(this.s, gyhVar.i());
            pnq.d(this.y, d(strA));
            pnq.d(this.x, gyhVar.b());
            pnq.d(this.p, d(strM));
            pnq.d(this.q, gyhVar.n());
            if (strA.length() > 5) {
                e(11.0f);
            } else if (strA.length() > 4 || qrs.a(2.0f)) {
                e(12.0f);
            }
            String strD = "0".equals(strA) ? "0" : gyhVar.d();
            String strG = "0".equals(strJ) ? "0" : gyhVar.g();
            if (!"0".equals(strM)) {
                strF = gyhVar.f();
            }
            ReleaseLogUtil.d("Share_ThreeCircleShareWatermark", "refreshStepCircleData step: ", strA, "/", strD, ", strength: ", strJ, "/", strG, ", hours: ", strM, "/", strF);
            this.v.a("firstCircle", Integer.parseInt(strA), Integer.parseInt(strD));
            this.v.a("secondCircle", Integer.parseInt(strJ), Integer.parseInt(strG));
            this.v.a("thirdCircle", Integer.parseInt(strM), Integer.parseInt(strF));
        } catch (NumberFormatException e) {
            LogUtil.c("Share_ThreeCircleShareWatermark", "refreshStepCircleData exception: ", e.getMessage());
        }
    }

    private void e(float f) {
        this.t.setTextSize(1, f);
        this.y.setTextSize(1, f);
        this.h.setTextSize(1, f);
        this.d.setTextSize(1, f);
        this.f22685c.setTextSize(1, f);
        this.p.setTextSize(1, f);
    }

    private void a(String str) {
        try {
            if (TextUtils.isEmpty(str) || Integer.parseInt(str) <= 0) {
                return;
            }
            ReleaseLogUtil.d("Share_ThreeCircleShareWatermark", "perfectDay: ", str);
            pnq.d(this.m, b(R.plurals.IDS_plugin_socialshare_perfect_three_circle, str));
            this.n.setVisibility(0);
        } catch (NumberFormatException e) {
            LogUtil.c("Share_ThreeCircleShareWatermark", "setPerfectDays exception: ", e.getMessage());
        }
    }

    private SpannableString b(int i, String str) {
        int i2;
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("Share_ThreeCircleShareWatermark", "getSpannableString value is null");
            return new SpannableString("");
        }
        try {
            i2 = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            LogUtil.c("Share_ThreeCircleShareWatermark", "getSpannableString exception: ", e.getMessage());
            i2 = 0;
        }
        return a(str, BaseApplication.getContext().getResources().getQuantityString(i, i2, Integer.valueOf(i2)));
    }

    private SpannableString a(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("Share_ThreeCircleShareWatermark", "getSpannableString content or part is null");
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(str2);
        int iIndexOf = str2.indexOf(str);
        if (iIndexOf == -1) {
            LogUtil.d("Share_ThreeCircleShareWatermark", "getSpannableString content not contains part");
            return spannableString;
        }
        spannableString.setSpan(new AbsoluteSizeSpan(BaseApplication.getContext().getResources().getDimensionPixelSize(R.dimen.health_common_24dp)), iIndexOf, str.length() + iIndexOf, 34);
        return spannableString;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setWatermarkId(int i) {
        this.z = i;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public int getWatermarkId() {
        return this.z;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public boolean getIsNeedHide() {
        return this.o;
    }

    @Override // com.huawei.health.socialshare.model.EditShareCommonView
    public void setUserInfo(Bitmap bitmap, String str) {
        if (bitmap == null && TextUtils.isEmpty(str)) {
            this.i.setVisibility(8);
            this.ac.setVisibility(8);
            return;
        }
        if (bitmap != null) {
            this.i.setImageBitmap(bitmap);
            this.i.setVisibility(Utils.k() ? 8 : 0);
        }
        if (!TextUtils.isEmpty(str)) {
            this.ac.setText(str);
            this.ac.setVisibility(0);
        }
        if (pnq.d()) {
            pnq.e(this.ac);
        }
    }

    private CharSequence d(String str) {
        try {
            return UnitUtil.e(Integer.parseInt(str), 1, 0);
        } catch (NumberFormatException e) {
            LogUtil.c("Share_ThreeCircleShareWatermark", "getNumberFormat exception: ", e.getMessage());
            return "";
        }
    }
}
