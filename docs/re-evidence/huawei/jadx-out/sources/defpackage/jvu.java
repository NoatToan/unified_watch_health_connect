package defpackage;

import android.content.Context;
import android.view.View;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.view.ShowProgress;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jvu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f39123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f39124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f39125c;
    private ShowProgress d;
    private HealthTextView e;
    private View f;
    private HealthTextView g;
    private int h;
    private View i;
    private View j;
    private ShowProgress k;
    private HealthTextView l;
    private HealthTextView m;
    private ShowProgress n;
    private HealthTextView o;
    private HealthTextView p;
    private HealthTextView q;
    private HealthTextView r;

    public jvu(Context context, int i) {
        this.f39125c = context;
        this.h = i;
    }

    public View a() {
        View viewB;
        int i = this.h;
        if (i == 100) {
            viewB = b();
        } else if (i == 101) {
            viewB = e();
        } else {
            LogUtil.a("Track_TrainViewHolder", "buildView unknow style");
            viewB = new View(this.f39125c);
        }
        this.j = viewB;
        return viewB;
    }

    private View e() {
        View viewInflate = View.inflate(this.f39125c, R.layout.track_share_viewholder_train_new, null);
        this.n = (ShowProgress) viewInflate.findViewById(R.id.track_detail_sp_xg);
        this.d = (ShowProgress) viewInflate.findViewById(R.id.track_detail_sp_anaerobic_xg);
        this.k = (ShowProgress) viewInflate.findViewById(R.id.track_detail_sp_ox);
        this.p = (HealthTextView) viewInflate.findViewById(R.id.track_ox_msg);
        this.q = (HealthTextView) viewInflate.findViewById(R.id.sug_detail_ox);
        this.r = (HealthTextView) viewInflate.findViewById(R.id.sug_detail_ox_unit);
        this.f39124b = (HealthTextView) viewInflate.findViewById(R.id.tv_track_detail_xg_title);
        this.o = (HealthTextView) viewInflate.findViewById(R.id.track_detail_xg);
        this.m = (HealthTextView) viewInflate.findViewById(R.id.track_detail_effectshow);
        this.e = (HealthTextView) viewInflate.findViewById(R.id.tv_track_detail_anaerobic_xg_title);
        this.g = (HealthTextView) viewInflate.findViewById(R.id.track_detail_anaerobic_xg);
        this.l = (HealthTextView) viewInflate.findViewById(R.id.track_detail_anaerobic_effectshow);
        this.f = viewInflate.findViewById(R.id.track_train_divider);
        this.f39123a = viewInflate.findViewById(R.id.track_aerobic_train_divider);
        this.i = viewInflate.findViewById(R.id.track_train_divider_two);
        b(viewInflate);
        this.n.a(izw.f38267a);
        this.d.a(izw.f38267a);
        this.k.a(izw.f38267a);
        this.f.setBackgroundColor(izw.d);
        this.f39123a.setBackgroundColor(izw.d);
        this.i.setBackgroundColor(izw.d);
        return viewInflate;
    }

    private void b(View view) {
        c((HealthTextView) view.findViewById(R.id.tv_track_detail_xg_title), izw.f38267a);
        c((HealthTextView) view.findViewById(R.id.tv_track_detail_anaerobic_xg_title), izw.f38267a);
        c((HealthTextView) view.findViewById(R.id.tv_track_detail_ox_title), izw.f38267a);
        c(this.o, this.f39125c.getResources().getColor(R.color.color_normal_titlebar_title));
        c(this.m, izw.f38267a);
        c(this.g, this.f39125c.getResources().getColor(R.color.color_normal_titlebar_title));
        c(this.l, izw.f38267a);
        c(this.q, this.f39125c.getResources().getColor(R.color.color_normal_titlebar_title));
        c(this.r, izw.f38267a);
        c(this.p, izw.f38267a);
        c((HealthTextView) view.findViewById(R.id.pluginmotiontrack_detail_title_train_textview), izw.f38267a);
        c((HealthTextView) view.findViewById(R.id.track_detail_ritire_duration_name), izw.f38267a);
        c((HealthTextView) view.findViewById(R.id.track_detail_ritire_duration), this.f39125c.getResources().getColor(R.color.color_normal_titlebar_title));
    }

    private View b() {
        View viewInflate = View.inflate(this.f39125c, R.layout.track_share_viewholder_train_new, null);
        this.n = (ShowProgress) viewInflate.findViewById(R.id.track_detail_sp_xg);
        this.d = (ShowProgress) viewInflate.findViewById(R.id.track_detail_sp_anaerobic_xg);
        this.k = (ShowProgress) viewInflate.findViewById(R.id.track_detail_sp_ox);
        this.f39124b = (HealthTextView) viewInflate.findViewById(R.id.tv_track_detail_xg_title);
        this.o = (HealthTextView) viewInflate.findViewById(R.id.track_detail_xg);
        this.m = (HealthTextView) viewInflate.findViewById(R.id.track_detail_effectshow);
        this.e = (HealthTextView) viewInflate.findViewById(R.id.tv_track_detail_anaerobic_xg_title);
        this.g = (HealthTextView) viewInflate.findViewById(R.id.track_detail_anaerobic_xg);
        this.l = (HealthTextView) viewInflate.findViewById(R.id.track_detail_anaerobic_effectshow);
        this.q = (HealthTextView) viewInflate.findViewById(R.id.sug_detail_ox);
        this.r = (HealthTextView) viewInflate.findViewById(R.id.sug_detail_ox_unit);
        this.p = (HealthTextView) viewInflate.findViewById(R.id.track_ox_msg);
        View viewFindViewById = viewInflate.findViewById(R.id.track_train_divider);
        this.f = viewFindViewById;
        viewFindViewById.setBackgroundColor(izw.f38269c);
        View viewFindViewById2 = viewInflate.findViewById(R.id.track_aerobic_train_divider);
        this.f39123a = viewFindViewById2;
        viewFindViewById2.setBackgroundColor(izw.f38269c);
        View viewFindViewById3 = viewInflate.findViewById(R.id.track_train_divider_two);
        this.i = viewFindViewById3;
        viewFindViewById3.setBackgroundColor(izw.f38269c);
        return viewInflate;
    }

    private void c(HealthTextView healthTextView, int i) {
        healthTextView.setTextColor(i);
    }

    public void d(int i, float f, float f2, int i2, int i3) {
        if (this.j == null) {
            return;
        }
        boolean zBa = LanguageUtil.ba(BaseApplication.getContext());
        b(f, zBa, i3);
        c(f2, zBa, i3);
        a(i, zBa);
        d(i2);
    }

    private void a(int i, boolean z) {
        if (i > 0) {
            Integer[] numArrE = jpq.e(((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getLocalUserInfo());
            this.k.a(i).e(0).d(false).c(izw.o, izw.k, izw.j, izw.i, izw.h, izw.l, izw.g).c(numArrE).b(z);
            this.r.setVisibility(0);
            if (this.h == 101) {
                this.q.setTextColor(this.f39125c.getResources().getColor(R.color.color_normal_titlebar_title));
                this.r.setTextColor(izw.f38267a);
                this.q.setText(UnitUtil.e(i, 1, 0));
            } else {
                this.q.setTextColor(izw.f);
                this.r.setTextColor(izw.e);
                this.q.setText(UnitUtil.e(i, 1, 0));
            }
            this.p.setText(this.f39125c.getString(R.string.IDS_motiontrack_detail_ox_level, jpq.c(this.f39125c, numArrE, i, false)));
            return;
        }
        this.j.findViewById(R.id.track_train_vo2max).setVisibility(8);
        this.i.setVisibility(8);
    }

    private void b(float f, boolean z, int i) {
        if (f >= 1.0f) {
            this.o.setText(UnitUtil.e(f, 1, 1));
            float fG = jpq.g(f);
            this.n.a(fG).d(false).c(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f).c(jpq.e(this.f39125c, fG, i)).b(z);
            if (i == 0) {
                this.f39124b.setText(R.string.IDS_sport_noun_explain_xunlianbiaoxian_youyang_title);
                return;
            } else {
                this.f39124b.setText(R.string.IDS_aerobic_train_pressure);
                return;
            }
        }
        this.j.findViewById(R.id.track_train_train).setVisibility(8);
        this.f.setVisibility(8);
    }

    private void c(float f, boolean z, int i) {
        if (f >= 1.0f) {
            this.g.setText(UnitUtil.e(f, 1, 1));
            float fG = jpq.g(f);
            this.d.a(fG).d(false).c(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f).c(jpq.e(this.f39125c, fG, i)).b(z);
            if (i == 0) {
                this.e.setText(R.string.IDS_pluginmotiontrack_anaerobic_exercise);
                return;
            } else {
                this.e.setText(R.string.IDS_anaerobic_train_pressure);
                return;
            }
        }
        this.j.findViewById(R.id.track_anaerobic_train_train).setVisibility(8);
        this.f39123a.setVisibility(8);
    }

    private void d(int i) {
        Context context = this.f39125c;
        if (context != null && i > 0) {
            String quantityString = context.getResources().getQuantityString(R.plurals.IDS_motiontrack_detail_recover_time_hour, i, Integer.valueOf(i));
            View view = this.j;
            if (view != null) {
                ((HealthTextView) view.findViewById(R.id.track_detail_ritire_duration)).setText(jpq.b("\\d", quantityString, R.style.track_detail_time_b, R.style.track_detail_time_n, this.f39125c));
                return;
            }
            return;
        }
        View view2 = this.j;
        if (view2 != null) {
            view2.findViewById(R.id.track_detail_ritire).setVisibility(8);
        }
    }
}
