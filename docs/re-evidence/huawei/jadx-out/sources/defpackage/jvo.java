package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.view.CircleProgressButton;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jvo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f39116a;
    private GridView d;
    private ResourceBriefInfo f;
    private int g;
    private int h;
    private View i;
    private HealthTextView k;
    private HealthTextView m;
    private HealthTextView x;
    private ImageView p = null;
    private ImageView r = null;
    private CircleProgressButton q = null;
    private ImageView t = null;
    private ImageButton l = null;
    private ImageButton s = null;
    private RelativeLayout e = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f39117b = null;
    private HealthTextView n = null;
    private HealthTextView o = null;
    private jvp y = null;
    private SparseArray<jvp> j = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f39118c = null;

    public jvo(View view, int i, Context context) {
        this.i = null;
        this.g = 0;
        this.i = view;
        this.g = i;
        this.f39116a = context;
        z();
    }

    private void z() {
        View view = this.i;
        if (view == null) {
            return;
        }
        this.e = (RelativeLayout) view.findViewById(R.id.layout_operation);
        this.f39117b = (LinearLayout) this.i.findViewById(R.id.layout_lockoperation);
        this.p = (ImageView) this.i.findViewById(R.id.track_main_page_btn_pause);
        this.r = (ImageView) this.i.findViewById(R.id.track_main_page_btn_play);
        CircleProgressButton circleProgressButton = (CircleProgressButton) this.i.findViewById(R.id.track_main_page_btn_stop);
        this.q = circleProgressButton;
        lrd.e(circleProgressButton, qre.i(R.string.IDS_motiontrack_show_sport_dialog_finish));
        this.l = (ImageButton) this.i.findViewById(R.id.track_main_page_btn_lock);
        this.s = (ImageButton) this.i.findViewById(R.id.track_main_page_btn_sound);
        RelativeLayout relativeLayout = (RelativeLayout) this.i.findViewById(R.id.layout_hidden_right);
        RelativeLayout relativeLayout2 = (RelativeLayout) this.i.findViewById(R.id.layout_hidden_left);
        if (!v()) {
            this.n = (HealthTextView) relativeLayout.findViewById(R.id.data_value);
            this.o = (HealthTextView) relativeLayout2.findViewById(R.id.data_value);
            this.k = (HealthTextView) relativeLayout.findViewById(R.id.data_name);
            this.m = (HealthTextView) relativeLayout2.findViewById(R.id.data_name);
        }
        this.x = (HealthTextView) this.i.findViewById(R.id.track_stop_content);
        this.t = (ImageView) this.i.findViewById(R.id.track_main_page_action_next);
        u();
        x();
        y();
        p();
    }

    public void p() {
        this.d = (GridView) this.i.findViewById(R.id.data_container_gridview);
        e();
    }

    private jvp d(RelativeLayout relativeLayout) {
        if (relativeLayout == null) {
            return null;
        }
        HealthTextView healthTextView = (HealthTextView) relativeLayout.findViewById(R.id.data_value);
        HealthTextView healthTextView2 = (HealthTextView) relativeLayout.findViewById(R.id.data_name);
        if (LanguageUtil.aj(this.f39116a)) {
            relativeLayout.setLayoutDirection(1);
        }
        return new jvp(healthTextView, healthTextView2, relativeLayout);
    }

    private void u() {
        jvp jvpVarD = d((RelativeLayout) this.i.findViewById(R.id.layout_hidden_left));
        if (jvpVarD == null) {
            LogUtil.e("Track_TrackMainViewHolderBean", "constructHiddenDistance(), item == null");
        } else {
            jvpVarD.c().setText(UnitUtil.f() ? R.string.IDS_workout_data_distance_mi : R.string.IDS_workout_data_distance_km);
            this.j.put(0, jvpVarD);
        }
    }

    private void x() {
        jvp jvpVarD = d((RelativeLayout) this.i.findViewById(R.id.layout_hidden_right));
        if (jvpVarD == null) {
            LogUtil.e("Track_TrackMainViewHolderBean", "constructHiddenDistance(), item == null");
        } else {
            jvpVarD.c().setText(R.string.IDS_workout_data_time);
            this.j.put(1, jvpVarD);
        }
    }

    public View j() {
        return this.i;
    }

    public HealthTextView s() {
        return this.x;
    }

    public LinearLayout b() {
        return this.f39117b;
    }

    public RelativeLayout c() {
        return this.e;
    }

    public HealthTextView f() {
        return this.o;
    }

    public HealthTextView k() {
        return this.n;
    }

    public HealthTextView l() {
        return this.k;
    }

    public HealthTextView n() {
        return this.m;
    }

    public ImageButton q() {
        return this.s;
    }

    public ImageButton o() {
        return this.l;
    }

    public ImageView r() {
        return this.r;
    }

    public ImageView m() {
        return this.p;
    }

    public CircleProgressButton w() {
        return this.q;
    }

    public SparseArray<jvp> g() {
        return this.j;
    }

    public void b(jvp jvpVar) {
        this.y = jvpVar;
    }

    public ImageView t() {
        return this.t;
    }

    public HealthTextView a() {
        return this.f39118c;
    }

    public void b(View.OnClickListener onClickListener) {
        this.e.setOnClickListener(onClickListener);
        this.s.setOnClickListener(onClickListener);
        this.l.setOnClickListener(onClickListener);
        this.p.setOnClickListener(onClickListener);
        this.r.setOnClickListener(onClickListener);
        ImageView imageView = this.t;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    public boolean v() {
        int i = this.g;
        return i == 265 || i == 264 || i == 281;
    }

    private void y() {
        boolean z;
        String str;
        int i = this.g;
        if (i == 258 || i == 264) {
            if (i == 258) {
                this.h = 15001;
                z = true;
                str = "SportAdSportingPauseIconOutdoor";
            } else {
                this.h = 15002;
                z = false;
                str = "SportAdSportingPauseIconIndoor";
            }
            jbq jbqVarD = iws.d(str);
            if (jbqVarD != null && !TextUtils.isEmpty(jbqVarD.e())) {
                LogUtil.a("Track_TrackMainViewHolderBean", "checkSportAdData() pause has imageUrl, isOutdoorRun: ", Boolean.valueOf(z));
                qqf.a(jbqVarD.e(), new CustomTarget<Bitmap>() { // from class: jvo.4
                    @Override // com.bumptech.glide.request.target.Target
                    public void onLoadCleared(Drawable drawable) {
                    }

                    @Override // com.bumptech.glide.request.target.Target
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public void onResourceReady(Bitmap bitmap, Transition<? super Bitmap> transition) {
                        LogUtil.a("Track_TrackMainViewHolderBean", "checkSportAdData() pause show image success");
                        jvo.this.p.setImageBitmap(bitmap);
                    }

                    @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
                    public void onLoadFailed(Drawable drawable) {
                        LogUtil.a("Track_TrackMainViewHolderBean", "checkSportAdData() pause show image failed");
                        jvo.this.ac();
                    }
                });
                ResourceBriefInfo resourceBriefInfoE = iws.e(this.h);
                this.f = resourceBriefInfoE;
                MarketingBiUtils.e(this.h, resourceBriefInfoE);
                return;
            }
            ac();
            return;
        }
        ac();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        this.p.setImageResource(R.drawable.track_main_page_btn_pause_selector);
        this.h = 0;
        this.f = null;
    }

    public int i() {
        return this.h;
    }

    public ResourceBriefInfo h() {
        return this.f;
    }

    public GridView d() {
        return this.d;
    }

    public void b(boolean z) {
        qsp.c((View) this.d, z ? 0 : 8);
        jvp jvpVar = this.y;
        if (jvpVar != null) {
            qsp.c((View) jvpVar.a(), z ? 0 : 8);
        }
    }

    public void e() {
        if (this.d == null) {
            ReleaseLogUtil.d("Track_TrackMainViewHolderBean", "changeGridViewColumns mGridView is null");
        } else if (qrs.af(this.f39116a)) {
            this.d.setNumColumns(3);
        } else {
            this.d.setNumColumns(2);
        }
    }
}
