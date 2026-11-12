package com.huawei.basichealthmodel.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.huawei.basichealthmodel.R;
import com.huawei.basichealthmodel.callback.ShareClickListener;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.socialshare.api.SocialShareCenterApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.reportchart.HwHealthReportLineChart;
import defpackage.cav;
import defpackage.cbg;
import defpackage.cbk;
import defpackage.cgk;
import defpackage.cgo;
import defpackage.lsl;
import defpackage.njy;
import defpackage.pao;
import defpackage.qqz;
import defpackage.qrs;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class WeeklyReportDetailView extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f5383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f5384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f5385c;
    private HealthTextView d;
    private HealthWeekCalendarGroupView e;
    private HealthTextView f;
    private int g;
    private HealthTextView h;
    private HwHealthReportLineChart i;
    private View j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private ImageView p;
    private ImageView q;
    private HealthTextView r;
    private ImageView s;
    private ShareClickListener t;
    private HealthTextView w;

    public WeeklyReportDetailView(Context context) {
        this(context, null);
    }

    public WeeklyReportDetailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public WeeklyReportDetailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = false;
        this.o = false;
        this.k = false;
        this.n = false;
        this.f5385c = context;
        e(context, attributeSet);
        a(context);
    }

    private void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.WeeklyReportDetailView);
        if (typedArrayObtainStyledAttributes == null) {
            return;
        }
        try {
            this.m = typedArrayObtainStyledAttributes.getBoolean(R.styleable.WeeklyReportDetailView_processing_view_visible, false);
            this.o = typedArrayObtainStyledAttributes.getBoolean(R.styleable.WeeklyReportDetailView_share_icon_visible, false);
            this.k = typedArrayObtainStyledAttributes.getBoolean(R.styleable.WeeklyReportDetailView_chart_view_visible, false);
            this.n = typedArrayObtainStyledAttributes.getBoolean(R.styleable.WeeklyReportDetailView_is_head_icon, false);
        } catch (Resources.NotFoundException unused) {
            LogUtil.e("HL_WeeklyReportDetailView", "init NotFoundException");
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a(Context context) {
        Object systemService = context.getSystemService("layout_inflater");
        if (!(systemService instanceof LayoutInflater)) {
            LogUtil.j("HL_WeeklyReportDetailView", "initView object is null or not LayoutInflater");
            return;
        }
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.weekly_report_detail_layout, this);
        this.f = (HealthTextView) viewInflate.findViewById(R.id.weekly_report_date_tv);
        this.w = (HealthTextView) viewInflate.findViewById(R.id.weekly_report_num_tv);
        this.q = (ImageView) viewInflate.findViewById(R.id.weekly_report_share_iv);
        this.p = (ImageView) viewInflate.findViewById(R.id.weekly_report_share_head_icon);
        this.q.setOnClickListener(this);
        viewInflate.findViewById(R.id.weekly_report_detail).setOnClickListener(this);
        this.s = (ImageView) viewInflate.findViewById(R.id.weekly_report_tips_icon);
        this.r = (HealthTextView) viewInflate.findViewById(R.id.weekly_report_tips_tv);
        this.d = (HealthTextView) viewInflate.findViewById(R.id.weekly_report_management_tv);
        this.e = (HealthWeekCalendarGroupView) viewInflate.findViewById(R.id.week_calendar_group_view);
        this.j = viewInflate.findViewById(R.id.weekly_report_interval_view);
        this.f5384b = (LinearLayout) viewInflate.findViewById(R.id.weekly_report_chart_layout);
        this.i = (HwHealthReportLineChart) viewInflate.findViewById(R.id.history_line_chart);
        this.h = (HealthTextView) viewInflate.findViewById(R.id.history_line_chart_tips_tv);
        b(viewInflate);
    }

    private void b(View view) {
        int i;
        if (this.o) {
            if (this.n) {
                this.q.setVisibility(8);
                this.p.setVisibility(0);
                HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.weekly_report_share_user_name_tv);
                SocialShareCenterApi socialShareCenterApi = (SocialShareCenterApi) Services.b("PluginSocialShare", SocialShareCenterApi.class);
                String shareNickName = socialShareCenterApi.getShareNickName();
                if (!TextUtils.isEmpty(shareNickName)) {
                    healthTextView.setText(shareNickName);
                    healthTextView.setVisibility(0);
                }
                socialShareCenterApi.updateShareUserView("HL_WeeklyReportDetailView", this.p, healthTextView);
                return;
            }
            this.q.setVisibility(0);
            Context contextB = BaseApplication.b();
            ImageView imageView = this.q;
            if (LanguageUtil.ba(contextB)) {
                i = com.huawei.ui.commonui.R.drawable.ic_health_nav_share_black_rt;
            } else {
                i = com.huawei.ui.commonui.R.drawable.ic_health_nav_share_black;
            }
            imageView.setImageResource(i);
            this.p.setVisibility(8);
            return;
        }
        this.q.setVisibility(8);
        this.p.setVisibility(8);
    }

    public void a(List<cav> list, int i, boolean z, boolean z2) {
        LogUtil.a("HL_WeeklyReportDetailView", "updateWeekView", list.toString(), " ,percent", Integer.valueOf(i), " ,isCurrentWeek", Boolean.valueOf(z), " ,isFromHistoryPage", Boolean.valueOf(z2));
        if (njy.e(list)) {
            LogUtil.j("HL_WeeklyReportDetailView", "initialViewData, recentWeeklyData is empty");
            return;
        }
        if (z2) {
            this.q.setVisibility(8);
            this.w.setVisibility(8);
        }
        cav cavVar = list.get(0);
        if (z) {
            c(cavVar, i, true);
            return;
        }
        if (this.o && this.n) {
            this.w.setVisibility(0);
            UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
            if (userProfileMgrApi == null) {
                LogUtil.j("HL_WeeklyReportDetailView", "getHeadBitmap : userProfileMgrApi is null.");
                return;
            } else {
                Bitmap headBitmap = userProfileMgrApi.getHeadBitmap(this.f5385c);
                if (headBitmap != null) {
                    this.p.setImageBitmap(headBitmap);
                }
            }
        }
        if (!z2 && list.size() > 1) {
            cavVar = list.get(1);
        }
        c(cavVar, i, false);
        if (!z2) {
            list.remove(list.get(0));
        }
        if (!this.k || !njy.b(list) || list.size() <= 1) {
            LogUtil.a("HL_WeeklyReportDetailView", "initViewData recentWeeklyData can not show line chart layout");
            return;
        }
        LogUtil.a("HL_WeeklyReportDetailView", "initViewData recentWeeklyData more than one week data");
        this.f5384b.setVisibility(0);
        this.j.setVisibility(0);
        cgk.c(this.f5385c, this.h, this.i, list);
    }

    private void c(cav cavVar, int i, boolean z) {
        LogUtil.a("HL_WeeklyReportDetailView", "updateWeekView", cavVar.toString(), " ,percent", Integer.valueOf(i), " ,isNowWeek", Boolean.valueOf(z));
        this.r.setText(a(cavVar.d(), i));
        this.e.d(cavVar.a(), cavVar.c(), cavVar.f(), z);
        setWeekDate(cavVar);
        setWeekNumber(cavVar);
        setWeeklyReport("", false, z, cavVar.c());
    }

    public void setWeeklyReport(String str, boolean z, boolean z2, int i) {
        if (!z2 && (z || !TextUtils.isEmpty(str))) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(pao.e(this.f5385c, 86.5f), pao.e(this.f5385c, 86.5f));
            layoutParams.setMargins(pao.e(this.f5385c, 20.0f), pao.e(this.f5385c, 12.0f), pao.e(this.f5385c, 12.0f), 0);
            this.s.setLayoutParams(layoutParams);
            this.d.setVisibility(0);
            this.g = i;
            this.f5383a = CommonUtils.j(str);
            this.l = z;
            setChallengeTextAndPic(z);
            return;
        }
        this.d.setVisibility(8);
        this.s.setImageDrawable(ContextCompat.getDrawable(this.f5385c, R.drawable.health_model_clover_green_with_icon));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(pao.e(this.f5385c, 75.0f), pao.e(this.f5385c, 75.0f));
        layoutParams2.setMargins(pao.e(this.f5385c, 20.0f), pao.e(this.f5385c, 4.0f), pao.e(this.f5385c, 24.0f), 0);
        this.s.setLayoutParams(layoutParams2);
    }

    private void setChallengeTextAndPic(boolean z) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        Context contextB = BaseApplication.b();
        boolean z2 = LanguageUtil.ba(contextB) && !LanguageUtil.br(contextB);
        if (z) {
            this.d.setText(R.string.IDS_week_report_health_two);
            ImageView imageView = this.s;
            if (z2) {
                drawable6 = qqz.e(this.f5385c, R.drawable.health_model_reports_management);
            } else {
                drawable6 = ContextCompat.getDrawable(this.f5385c, R.drawable.health_model_reports_management);
            }
            imageView.setImageDrawable(drawable6);
        }
        int i = this.f5383a;
        switch (i) {
            case AwarenessConstants.ERROR_INVALID_FREQUENCY_CODE /* 200002 */:
                this.d.setText(R.string.IDS_week_report_anxiety);
                ImageView imageView2 = this.s;
                if (z2) {
                    drawable = qqz.e(this.f5385c, R.drawable.health_model_reports_anxiety);
                } else {
                    drawable = ContextCompat.getDrawable(this.f5385c, R.drawable.health_model_reports_anxiety);
                }
                imageView2.setImageDrawable(drawable);
                break;
            case AwarenessConstants.ERROR_TIMEOUT_CODE /* 200003 */:
                this.d.setText(R.string.IDS_week_report_weight);
                ImageView imageView3 = this.s;
                if (z2) {
                    drawable2 = qqz.e(this.f5385c, R.drawable.health_model_reports_weight);
                } else {
                    drawable2 = ContextCompat.getDrawable(this.f5385c, R.drawable.health_model_reports_weight);
                }
                imageView3.setImageDrawable(drawable2);
                break;
            case AwarenessConstants.ERROR_UNKNOWN_CODE /* 200004 */:
                this.d.setText(R.string.IDS_week_report_sleep);
                ImageView imageView4 = this.s;
                if (z2) {
                    drawable3 = qqz.e(this.f5385c, R.drawable.health_model_reports_sleep);
                } else {
                    drawable3 = ContextCompat.getDrawable(this.f5385c, R.drawable.health_model_reports_sleep);
                }
                imageView4.setImageDrawable(drawable3);
                break;
            case AwarenessConstants.ERROR_LIMITED_REGISTRY_CODE /* 200005 */:
                this.d.setText(R.string.IDS_week_report_immunity);
                ImageView imageView5 = this.s;
                if (z2) {
                    drawable4 = qqz.e(this.f5385c, R.drawable.health_model_reports_immunity);
                } else {
                    drawable4 = ContextCompat.getDrawable(this.f5385c, R.drawable.health_model_reports_immunity);
                }
                imageView5.setImageDrawable(drawable4);
                break;
            case AwarenessConstants.ERROR_CANCEL_REGISTRY_CODE /* 200006 */:
            case AwarenessConstants.ERROR_PARAMETER_CODE /* 200007 */:
            case AwarenessConstants.ERROR_REGISTER_SAME_FENCE_CODE /* 200008 */:
                this.d.setText(R.string.IDS_week_report_blood_pressure);
                ImageView imageView6 = this.s;
                if (z2) {
                    drawable5 = qqz.e(this.f5385c, R.drawable.health_model_reports_pressure);
                } else {
                    drawable5 = ContextCompat.getDrawable(this.f5385c, R.drawable.health_model_reports_pressure);
                }
                imageView6.setImageDrawable(drawable5);
                break;
            default:
                LogUtil.j("HL_WeeklyReportDetailView", "setChallengeTextAndPic mChallengeId ", Integer.valueOf(i));
                break;
        }
    }

    private SpannableString a(int i, int i2) {
        return cbg.c(i, i2, (i2 == 0 || i == 0) ? 1 : 2);
    }

    private void setWeekDate(cav cavVar) {
        int iA = cavVar.a();
        int iC = cavVar.c();
        StringBuilder sb = new StringBuilder();
        sb.append(cgo.d(String.valueOf(iA), 4));
        sb.append(Constants.LINK);
        sb.append(cgo.d(String.valueOf(iC), 4));
        this.f.setText(sb);
    }

    private void setWeekNumber(cav cavVar) {
        int iG = cavVar.g();
        String quantityString = this.f5385c.getResources().getQuantityString(R.plurals.IDS_health_model_week_time, iG, Integer.valueOf(iG));
        String string = this.f5385c.getResources().getString(R.string.IDS_weekly_report_progress, quantityString, this.f5385c.getResources().getString(R.string.IDS_processing_has_brackets));
        if (this.m) {
            this.w.setText(string);
        } else {
            this.w.setText(quantityString);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ReleaseLogUtil.c("HL_WeeklyReportDetailView", "onClick view ", view);
        if (view == null || qrs.e(view)) {
            return;
        }
        int id = view.getId();
        if (id == R.id.weekly_report_share_iv) {
            this.t.shareClickCallback();
        }
        if (this.d.getVisibility() == 0 && id == R.id.weekly_report_detail) {
            cbk.b(4, this.l ? 1 : this.f5383a);
            cbg.b(this.f5385c, DateFormatUtil.a(lsl.e(DateFormatUtil.d(this.g), 1, 0)));
        }
    }

    public void setListener(ShareClickListener shareClickListener) {
        this.t = shareClickListener;
    }
}
