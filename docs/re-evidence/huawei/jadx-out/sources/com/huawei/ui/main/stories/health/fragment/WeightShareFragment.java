package com.huawei.ui.main.stories.health.fragment;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.hwbasemgr.WeightBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.indicator.HealthLevelIndicator;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.recycleview.RecyclerItemDecoration;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.adapter.WeightBodyIndexRecycleAdapter;
import com.huawei.ui.main.stories.health.model.weight.card.CardConstants;
import com.huawei.ui.main.stories.health.util.WeightCommonView;
import defpackage.dnb;
import defpackage.dnj;
import defpackage.exz;
import defpackage.gxt;
import defpackage.lrp;
import defpackage.lsl;
import defpackage.lsv;
import defpackage.qlj;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qre;
import defpackage.qrk;
import defpackage.qrs;
import defpackage.uwc;
import defpackage.vcp;
import defpackage.vcs;
import defpackage.vcz;
import defpackage.vdc;
import defpackage.vei;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;

/* JADX INFO: loaded from: classes19.dex */
public class WeightShareFragment extends BaseFragment {
    private HealthTextView ab;
    private HealthTextView ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f27926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f27927c;
    private int d;
    private long e;
    private ImageView f;
    private boolean g;
    private HealthLevelIndicator i;
    private HealthRecycleView l;
    private dnj m;
    private HealthSubHeader n;
    private boolean o;
    private int p;
    private LinearLayout q;
    private long r;
    private View s;
    private View t;
    private HealthSubHeader u;
    private HealthTextView v;
    private View w;
    private HealthTextView x;
    private ImageView y;
    private WeightCommonView z;
    private List<uwc> h = new ArrayList(31);
    private dnb k = new dnb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<dnb> f27925a = new ArrayList(31);
    private boolean j = false;

    public void a(boolean z) {
        this.j = z;
    }

    public void b(Activity activity, boolean z) {
        if (activity == null) {
            LogUtil.a("HealthWeight_WeightShareFragment", "context is null");
            return;
        }
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        this.m = currentUser;
        this.f27927c = activity;
        this.g = z;
        if (z) {
            boolean z2 = currentUser == null || TextUtils.isEmpty(currentUser.h());
            if (Utils.m() && z2) {
                a(activity, R.id.viewstub_fragment_weight_share_detail_area_no_cloud, R.id.fragment_weight_share_detail_area_no_cloud_inflated);
            } else {
                a(activity, R.id.viewstub_fragment_weight_share_detail_area, R.id.fragment_weight_share_detail_area_inflated);
            }
        } else {
            a(activity, R.id.viewstub_fragment_weight_share_detail, R.id.fragment_weight_share_detail_inflated);
        }
        if (this.s == null) {
            LogUtil.j("HealthWeight_WeightShareFragment", "initViewInActivity: can't get rootview!");
        } else {
            e();
            j();
        }
    }

    private void a(Activity activity, int i, int i2) {
        ViewStub viewStub = (ViewStub) activity.findViewById(i);
        if (viewStub != null) {
            this.s = viewStub.inflate();
        } else {
            this.s = activity.findViewById(i2);
        }
    }

    private void j() {
        if (qrs.af(this.f27927c)) {
            ViewGroup.LayoutParams layoutParams = this.f.getLayoutParams();
            layoutParams.height = qqp.a(this.f27927c, 360.0f);
            layoutParams.width = -1;
            this.f.setLayoutParams(layoutParams);
            this.f.setImageResource(R.drawable.weight_share_bg_bigcd);
            return;
        }
        this.f.setImageResource(R.drawable.weight_share_bg);
    }

    private void e() {
        this.z = (WeightCommonView) this.s.findViewById(R.id.hw_show_health_weight_detail_common_view);
        HealthSubHeader healthSubHeader = (HealthSubHeader) this.s.findViewById(R.id.weight_suggest_health_subheader);
        this.u = healthSubHeader;
        if (healthSubHeader != null) {
            healthSubHeader.setMarginStartEnd(8.0f, 8.0f);
            this.u.setPaddingStartEnd(16.0f, 16.0f);
        }
        HealthSubHeader healthSubHeader2 = (HealthSubHeader) this.s.findViewById(R.id.peer_comparison_health_subheader);
        this.n = healthSubHeader2;
        if (healthSubHeader2 != null) {
            healthSubHeader2.setMarginStartEnd(8.0f, 8.0f);
            this.n.setPaddingStartEnd(16.0f, 16.0f);
        }
        this.v = (HealthTextView) this.s.findViewById(R.id.weight_share_body_tips);
        this.ad = (HealthTextView) this.s.findViewById(R.id.weight_scoring);
        this.t = this.s.findViewById(R.id.weight_score_parent);
        this.x = (HealthTextView) this.s.findViewById(R.id.weight_user_name);
        this.f27926b = (HealthTextView) this.s.findViewById(R.id.body_fat_scale_source_text);
        this.ab = (HealthTextView) this.s.findViewById(R.id.last_weight_date);
        this.i = (HealthLevelIndicator) this.s.findViewById(R.id.weight_detail_share_specification_indicator);
        this.y = (ImageView) this.s.findViewById(R.id.core_sleep_share_user_icon);
        this.q = (LinearLayout) this.s.findViewById(R.id.weight_share_fragment);
        this.w = this.s.findViewById(R.id.weight_scoring_text);
        this.f = (ImageView) this.s.findViewById(R.id.weight_share_short_map);
        a();
    }

    private void a() {
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.s.findViewById(R.id.hw_show_health_data_bodyindex_detail_recycle);
        this.l = healthRecycleView;
        healthRecycleView.setLayoutManager(new GridLayoutManager(this.f27927c, 3));
        this.l.setIsScroll(false);
        if (this.l.getItemDecorationCount() <= 0) {
            int dimensionPixelSize = this.f27927c.getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle);
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(Integer.valueOf(dimensionPixelSize));
            arrayList.add(Integer.valueOf(dimensionPixelSize));
            arrayList.add(Integer.valueOf(dimensionPixelSize));
            arrayList.add(Integer.valueOf(this.f27927c.getResources().getDimensionPixelSize(R.dimen.health_common_16dp)));
            int dimensionPixelSize2 = this.f27927c.getResources().getDimensionPixelSize(R.dimen.health_common_8dp);
            this.l.addItemDecoration(new RecyclerItemDecoration(dimensionPixelSize2, dimensionPixelSize2, arrayList));
        }
    }

    public void c(dnb dnbVar, Context context) {
        if (b(dnbVar, context)) {
            return;
        }
        this.k = dnbVar;
        if (TextUtils.isEmpty(dnbVar.k())) {
            this.f27926b.setVisibility(8);
        } else {
            this.f27926b.setText(context.getString(R.string.IDS_body_fat_scale_source, this.k.k()));
        }
        i();
        this.ab.setText(qrk.a(this.f27927c, dnbVar.ax(), 21));
        this.ad.setText(UnitUtil.e(this.k.h(), 1, 0));
        c();
        boolean z = this.g;
        if (this.k.isVisible(31, z)) {
            h();
        } else {
            this.t.setVisibility(4);
            this.w.setVisibility(4);
            this.v.setVisibility(4);
        }
        if (this.m != null) {
            a(z, context);
        }
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        if (currentUser.e() > 0) {
            e(dnbVar, currentUser);
        } else {
            a(dnbVar);
        }
        this.z.setWeightCommonView(this.k, z, true);
        f();
    }

    private void f() {
        if (this.j) {
            return;
        }
        ((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).updateShareUserView("HealthWeight_WeightShareFragment", 8, this.y, this.x);
    }

    private void c() {
        double[] dArrE = exz.e(this.g, this.k.an(), this.k.c());
        if (!vei.b(dArrE, 2)) {
            health.compact.a.util.LogUtil.d("HealthWeight_WeightShareFragment", "initSpecification, bodyMassIndexValue is out of bound.");
            return;
        }
        float f = (float) dArrE[0];
        float f2 = (float) dArrE[1];
        float f3 = (float) dArrE[2];
        float fC = c(f2, 0.1f, true);
        String strD = vcz.d(0, 1);
        String strD2 = vcz.d(0, 2);
        String strD3 = vcz.d(0, 3);
        String strD4 = vcz.d(0, 4);
        int color = this.f27927c.getColor(vdc.c(1));
        int color2 = this.f27927c.getColor(vdc.c(2));
        int color3 = this.f27927c.getColor(vdc.c(3));
        int color4 = this.f27927c.getColor(vdc.c(4));
        double[] dArrC = exz.c(Utils.o());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qlj((float) dArrC[0], f, color, strD));
        arrayList.add(new qlj(f, fC, color2, strD2));
        arrayList.add(new qlj(fC, f3, color3, strD3));
        arrayList.add(new qlj(f3, (float) dArrC[1], color4, strD4));
        vei.e(this.i, arrayList, dArrE, dArrC);
        e(this.s.findViewById(R.id.weight_body_level_rang_low), strD, color);
        e(this.s.findViewById(R.id.weight_body_level_rang_stand), strD2, color2);
        e(this.s.findViewById(R.id.weight_body_level_rang_high), strD3, color3);
        e(this.s.findViewById(R.id.weight_body_level_rang_super_high), strD4, color4);
        SpannableString spannableStringA = a(UnitUtil.e(UnitUtil.c(this.k.av()), 1, this.k.getFractionDigitByType(0)), 34);
        SpannableString spannableStringA2 = a(vei.b(), 14);
        this.i.setLevel((float) UnitUtil.d(this.k.f(), 1), spannableStringA);
        this.i.setLevelUnit(spannableStringA2);
        this.i.c(qre.b(R.dimen.health_common_36dp));
        this.i.setVisibility(0);
        this.i.invalidate();
        ReleaseLogUtil.c("HealthWeight_WeightShareFragment", "initLevel mIndicator ", this.i);
    }

    private SpannableString a(String str, int i) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new AbsoluteSizeSpan(i, true), 0, str.length(), 18);
        return spannableString;
    }

    private float c(float f, float f2, boolean z) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(f);
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(f2);
        if (z) {
            return bigDecimalValueOf.add(bigDecimalValueOf2).floatValue();
        }
        return bigDecimalValueOf.subtract(bigDecimalValueOf2).floatValue();
    }

    private void e(View view, String str, int i) {
        view.setVisibility(0);
        ImageView imageView = (ImageView) view.findViewById(R.id.weight_body_level_rang_item_icon);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        imageView.setImageDrawable(gradientDrawable);
        ((HealthTextView) view.findViewById(R.id.weight_body_level_rang_item_name)).setText(str);
        view.findViewById(R.id.weight_body_level_rang_item_content).setVisibility(8);
    }

    private void a(boolean z, Context context) {
        LogUtil.d("HealthWeight_WeightShareFragment", "mMainUser is not null ");
        c(z);
        g();
        this.y.setImageResource(0);
        if (this.j) {
            return;
        }
        if (!TextUtils.isEmpty(this.m.b())) {
            e(context, this.m.b(), this.y);
        } else if (this.m.k() == null) {
            this.y.setImageResource(R.mipmap.ic_personal_head);
        } else {
            this.y.setImageBitmap(qqf.a(this.m.k()));
        }
    }

    private void a(final dnb dnbVar) {
        MultiUsersManager.INSTANCE.getCurrentUser(new WeightBaseResponseCallback() { // from class: uve
            @Override // com.huawei.hwbasemgr.WeightBaseResponseCallback
            public final void onResponse(int i, Object obj) {
                this.e.a(dnbVar, i, (dnj) obj);
            }
        });
    }

    public /* synthetic */ void a(final dnb dnbVar, final int i, final dnj dnjVar) {
        Context context = this.f27927c;
        if (context == null || !(context instanceof Activity)) {
            LogUtil.j("HealthWeight_WeightShareFragment", "mContext is null or mContext is not Activity");
        } else {
            ((Activity) context).runOnUiThread(new Runnable() { // from class: uvg
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50605b.a(dnjVar, i, dnbVar);
                }
            });
        }
    }

    public /* synthetic */ void a(dnj dnjVar, int i, dnb dnbVar) {
        if (dnjVar == null || i != 0) {
            LogUtil.j("HealthWeight_WeightShareFragment", "loadDataSuccess getCurrentUser: currentUser is null return");
            dnjVar = MultiUsersManager.INSTANCE.getCurrentUser();
        }
        e(dnbVar, dnjVar);
    }

    private void e(dnb dnbVar, dnj dnjVar) {
        this.f27925a = vei.e(dnjVar.i(), dnbVar.ax(), dnjVar, this.g);
        b();
    }

    private void h() {
        if (this.k == null) {
            LogUtil.j("HealthWeight_WeightShareFragment", "mLatestBean is null!");
            return;
        }
        this.t.setVisibility(0);
        this.v.setVisibility(0);
        this.w.setVisibility(0);
        this.v.setText(vcp.a(this.k));
    }

    private void i() {
        dnj dnjVar;
        if (!this.j && (dnjVar = this.m) != null) {
            if (dnjVar.m() == 1) {
                this.x.setText(((SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class)).getShareNickName());
                this.x.setVisibility(0);
                return;
            } else {
                if (!TextUtils.isEmpty(this.m.h())) {
                    this.x.setText(this.m.h());
                } else {
                    this.x.setText(R.string.IDS_share_nick_default_name);
                }
                this.x.setVisibility(0);
                return;
            }
        }
        if (this.g) {
            this.y.setVisibility(8);
            this.x.setVisibility(8);
        }
    }

    private boolean b(dnb dnbVar, Context context) {
        if (dnbVar == null) {
            LogUtil.j("HealthWeight_WeightShareFragment", "intent get WeightBean is null ..");
            return true;
        }
        if (context == null) {
            LogUtil.j("HealthWeight_WeightShareFragment", "intent get context is null ..");
            return true;
        }
        if (this.s != null) {
            return false;
        }
        LogUtil.j("HealthWeight_WeightShareFragment", "intent get mRootView is null ..");
        return true;
    }

    private void e(Context context, String str, ImageView imageView) {
        if (!"default".equals(str)) {
            Bitmap bitmapA = qqf.a(context, str);
            if (bitmapA != null) {
                imageView.setImageBitmap(bitmapA);
                return;
            }
            return;
        }
        imageView.setImageResource(R.mipmap.ic_personal_head);
    }

    private void g() {
        this.l.setAdapter(new WeightBodyIndexRecycleAdapter(this.f27927c, this.h, this.k, this.g));
    }

    private void c(boolean z) {
        List<uwc> list;
        if (this.k == null || (list = this.h) == null) {
            LogUtil.j("HealthWeight_WeightShareFragment", "setListItem latestBeanis null. ");
            return;
        }
        list.clear();
        this.h.addAll(vcs.a(this.k, false, z));
        if (this.h.size() > 0) {
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            for (int i4 = 0; i4 < this.h.size(); i4++) {
                if (this.h.get(i4).a() == 9) {
                    i = i4;
                }
                if (this.h.get(i4).a() == 13) {
                    i2 = i4;
                }
                if (this.h.get(i4).a() == 25) {
                    i3 = i4;
                }
            }
            if (z) {
                if (i != -1) {
                    this.h.remove(i);
                }
                if (i2 != -1) {
                    this.h.remove(i2);
                }
                if (i3 != -1) {
                    this.h.remove(i3);
                    return;
                }
                return;
            }
            return;
        }
        LogUtil.j("HealthWeight_WeightShareFragment", "mIndexRecycleItems size == 0  ");
    }

    private String c(Bitmap bitmap) {
        String strC = CommonUtil.c(lrp.g);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("HealthWeight_WeightShareFragment", "saveBmpToFile pathName is null");
            return "";
        }
        File file = new File(strC);
        if (!file.exists() && !file.mkdirs()) {
            LogUtil.j("HealthWeight_WeightShareFragment", "saveBmpToFile:mkdirs error ");
        }
        File file2 = new File(file, "weight_share_tmp.jpg");
        try {
            String strC2 = CommonUtil.c(file2.getCanonicalPath());
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    try {
                        FileOutputStream fileOutputStreamOpenOutputStream = FileUtils.openOutputStream(file2);
                        if (!CommonUtil.e(file2, strC2)) {
                            LogUtil.j("HealthWeight_WeightShareFragment", "saveBmpToFile invalidate file path");
                            if (fileOutputStreamOpenOutputStream != null) {
                                try {
                                    fileOutputStreamOpenOutputStream.close();
                                    return "";
                                } catch (IOException unused) {
                                    LogUtil.e("HealthWeight_WeightShareFragment", "saveBmpToFile IOException finally");
                                }
                            }
                            return "";
                        }
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStreamOpenOutputStream);
                        fileOutputStreamOpenOutputStream.flush();
                        if (fileOutputStreamOpenOutputStream != null) {
                            try {
                                fileOutputStreamOpenOutputStream.close();
                                return strC2;
                            } catch (IOException unused2) {
                                LogUtil.e("HealthWeight_WeightShareFragment", "saveBmpToFile IOException finally");
                            }
                        }
                        return strC2;
                    } catch (IOException unused3) {
                        LogUtil.e("HealthWeight_WeightShareFragment", "saveBmpToFile IOException");
                        if (0 != 0) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused4) {
                                LogUtil.e("HealthWeight_WeightShareFragment", "saveBmpToFile IOException finally");
                            }
                        }
                    }
                } catch (IllegalArgumentException e) {
                    LogUtil.e("HealthWeight_WeightShareFragment", "saveBmpToFile IllegalArgumentException ", e.getMessage());
                    if (0 != 0) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused5) {
                            LogUtil.e("HealthWeight_WeightShareFragment", "saveBmpToFile IOException finally");
                        }
                    }
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused6) {
                        LogUtil.e("HealthWeight_WeightShareFragment", "saveBmpToFile IOException finally");
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            LogUtil.j("HealthWeight_WeightShareFragment", "generate ioexception when saveBitToFile:", e2.getMessage());
            return "";
        } catch (SecurityException e3) {
            LogUtil.j("HealthWeight_WeightShareFragment", "generate securityException when saveBitToFile:", e3.getMessage());
            return "";
        }
    }

    public void d() {
        gxt gxtVar;
        LinearLayout linearLayout = this.q;
        if (linearLayout == null) {
            LogUtil.j("HealthWeight_WeightShareFragment", "shareWeightFragment: has no parent Activity or view null!");
            qpx.b(this.f27927c, R.string.IDS_motiontrack_share_fail_tip);
            return;
        }
        Bitmap bitmapE = lsv.e(linearLayout);
        if (bitmapE == null) {
            LogUtil.j("HealthWeight_WeightShareFragment", "screenCut is null");
            qpx.b(this.f27927c, R.string.IDS_motiontrack_share_fail_tip);
            return;
        }
        String strC = c(bitmapE);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("HealthWeight_WeightShareFragment", "The path is invalid, return");
            return;
        }
        if (Utils.m()) {
            gxtVar = new gxt(1);
            gxtVar.d(bitmapE);
        } else {
            gxt gxtVar2 = new gxt(4);
            gxtVar2.c(strC);
            gxtVar = gxtVar2;
        }
        ReleaseLogUtil.c("HealthWeight_WeightShareFragment", "shareWeightFragment mIsGuestMeasureShare:", Boolean.valueOf(this.j));
        gxtVar.j(!this.j);
        CardConstants.a(gxtVar, this.f27927c, AnalyticsValue.BI_TRACK_WEIGHT_DATA_SHARE_BUTTON_2100012);
    }

    private boolean b() {
        this.o = false;
        this.p = 0;
        this.d = 0;
        List<dnb> list = this.f27925a;
        if (list == null || list.size() <= 1) {
            LogUtil.j("HealthWeight_WeightShareFragment", "isShowBadyTypeCard mBodyTypeDataList is null or size <= 1");
            return this.o;
        }
        LogUtil.a("HealthWeight_WeightShareFragment", "isShowBadyTypeCard mBodyTypeDataList size = ", Integer.valueOf(this.f27925a.size()));
        List<dnb> list2 = this.f27925a;
        dnb dnbVar = list2.get(list2.size() - 1);
        if (lsl.g(dnbVar.ax(), this.k.ax())) {
            return this.o;
        }
        for (int size = this.f27925a.size() - 1; size >= 0; size--) {
            if (!lsl.g(dnbVar.ax(), this.f27925a.get(size).ax())) {
                if (this.f27925a.get(size).ax() != this.k.ax() || dnbVar.r() <= 0) {
                    break;
                    break;
                }
                this.p = vei.d(dnbVar);
                this.d = vei.d(this.k);
                this.r = dnbVar.ax();
                this.e = this.k.ax();
                break;
            }
        }
        LogUtil.a("HealthWeight_WeightShareFragment", "isShowBadyTypeCard, mStartType = ", Integer.valueOf(this.p), "; mEndType = ", Integer.valueOf(this.d), "; mStartTime=", Long.valueOf(this.r), "; mEndTime=", Long.valueOf(this.e));
        if (this.p != this.d) {
            this.o = true;
        }
        return this.o;
    }
}
