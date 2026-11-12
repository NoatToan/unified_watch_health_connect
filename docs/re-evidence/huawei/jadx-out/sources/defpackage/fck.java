package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Outline;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.health.utils.vippage.dataauthority.HealthDataPrivacyClickableSpan;
import com.huawei.health.health.utils.vippage.dataauthority.HealthDataTagTextViewBuilder;
import com.huawei.health.servicesui.R;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.flowlayout.HealthFlowLayout;
import com.huawei.ui.commonui.imageview.HealthImageView;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class fck extends BaseDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthImageView f33853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<qle> f33855c;
    private HealthFlowLayout d;
    private Context e;
    private final ioi f;
    private final List<lpo> g;
    private final List<inz> h;
    private View i;
    private String j;

    public fck(Context context, int i) {
        super(context, R.style.BenefitHalfModeStyle, 0);
        this.h = Collections.synchronizedList(new ArrayList(16));
        this.g = Collections.synchronizedList(new ArrayList(16));
        this.f33855c = Collections.synchronizedList(new ArrayList(16));
        this.f = ioi.d();
        this.j = "";
        this.e = context;
        this.f33854b = i;
        i();
        g();
        h();
    }

    private void i() {
        int i = this.f33854b;
        if (i == 5) {
            this.j = "Device_0001";
            return;
        }
        if (i == 9) {
            this.j = "My_page_0001";
        } else if (i == 10) {
            this.j = "Member_center_Page_0001";
        } else {
            LogUtil.j("HealthDataAuthorityDialog", "initPageId default");
        }
    }

    private void h() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.i.findViewById(R.id.container);
        final float fA = qre.a(R.dimen.emui_corner_radius_dialog);
        constraintLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: fck.3
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                if (qrs.af(fck.this.e)) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), fA);
                    return;
                }
                int width = view.getWidth();
                int height = view.getHeight();
                float f = fA;
                outline.setRoundRect(0, 0, width, height + ((int) (2.0f * f)), f);
            }
        });
        constraintLayout.setClipToOutline(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void c() {
        if (!HandlerExecutor.c()) {
            ((Activity) this.e).runOnUiThread(new Runnable() { // from class: fcq
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c();
                }
            });
            return;
        }
        this.f33855c.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            fcv fcvVar = new fcv();
            boolean z = this.h.get(i2).c() != 1;
            fcvVar.b(z);
            fcvVar.e(this.h.get(i2).e());
            fcvVar.b(this.h.get(i2).e());
            fcvVar.c(i2);
            fcvVar.b(this.h.get(i2).j());
            fcvVar.d(this.h.get(i2).i());
            if (z) {
                arrayList.add(fcvVar);
            } else {
                arrayList2.add(fcvVar);
            }
        }
        this.f33855c.addAll(arrayList);
        this.f33855c.addAll(arrayList2);
        while (i < this.h.size()) {
            qle qleVar = this.f33855c.get(i);
            StringBuilder sb = new StringBuilder();
            int i3 = i + 1;
            sb.append(i3);
            sb.append(". ");
            sb.append(this.f33855c.get(i).e());
            qleVar.e(sb.toString());
            i = i3;
        }
        k();
    }

    private void k() {
        this.d.d(new ArrayList<>(this.f33855c), false);
        for (int i = 0; i < this.f33855c.size(); i++) {
            d(this.d.getChildAt(i), i);
        }
    }

    private void d(View view, final int i) {
        view.setOnClickListener(new View.OnClickListener() { // from class: fck.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (!njy.e(fck.this.f33855c, i)) {
                    fck.this.d(i);
                    if (!(view2 instanceof TextView)) {
                        LogUtil.j("HealthDataAuthorityDialog", "view is not TextView");
                        return;
                    }
                    TextView textView = (TextView) view2;
                    if (((qle) fck.this.f33855c.get(i)).k()) {
                        HealthDataTagTextViewBuilder.d(textView);
                        HealthDataTagTextViewBuilder.a(textView);
                        return;
                    } else {
                        textView.getPaint().setShader(null);
                        textView.invalidate();
                        textView.setBackgroundResource(R.drawable.inbox_tag_card_normal);
                        textView.setTextColor(ContextCompat.getColor(fck.this.e, com.huawei.ui.commonui.R.color.textColorSecondary));
                        return;
                    }
                }
                LogUtil.a("HealthDataAuthorityDialog", "setClickListener isOutOfBounds");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (njy.e(this.f33855c, i)) {
            LogUtil.a("HealthDataAuthorityDialog", "clickActionSelected isOutOfBounds");
            return;
        }
        this.f33855c.get(i).b(!this.f33855c.get(i).k());
        if (this.f33855c.get(i) instanceof fcv) {
            c(((fcv) this.f33855c.get(i)).c());
        }
        k();
    }

    private void c(String str) {
        for (inz inzVar : this.h) {
            if (inzVar.a().equals(str)) {
                inzVar.a(inzVar.c() == 1 ? 0 : 1);
            }
        }
    }

    private void e(HealthFlowLayout healthFlowLayout) {
        this.d = healthFlowLayout;
        this.d.setTextViewBuilder(new HealthDataTagTextViewBuilder(BaseApplication.getContext()));
        this.d.setVerticalSpacing(qrs.d(this.e, 12.0f));
        this.d.setTagHeight(qrs.d(this.e, 48.0f));
        this.d.setChildViewPadding(qrs.d(this.e, 12.0f));
        this.d.setTextViewSpacing(qre.b(R.dimen.health_common_12dp));
    }

    private void g() {
        LogUtil.a("HealthDataAuthorityDialog", "initView");
        View viewInflate = ((LayoutInflater) this.e.getSystemService("layout_inflater")).inflate(R.layout.health_data_authority_dialog, (ViewGroup) null);
        this.i = viewInflate;
        e((HealthFlowLayout) viewInflate.findViewById(R.id.inbox_data_flow_layout));
        this.i.findViewById(R.id.closeView).setOnClickListener(new View.OnClickListener() { // from class: fcs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33863a.a(view);
            }
        });
        this.i.findViewById(R.id.skip_button).setOnClickListener(new View.OnClickListener() { // from class: fcr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        });
        this.i.findViewById(R.id.confirm_button).setOnClickListener(new View.OnClickListener() { // from class: fcp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(view);
            }
        });
        TextView textView = (TextView) this.i.findViewById(R.id.inbox_dialog_tip4);
        String strF = qre.f(R.string.IDS_inbox_data_authority_how_manage);
        SpannableString spannableString = new SpannableString(qre.a(R.string.IDS_inbox_data_authority_tip_4, strF));
        int iIndexOf = spannableString.toString().indexOf(strF);
        HealthDataPrivacyClickableSpan healthDataPrivacyClickableSpan = new HealthDataPrivacyClickableSpan(this.e);
        healthDataPrivacyClickableSpan.b(new HealthDataPrivacyClickableSpan.PrivacyClickable() { // from class: fcy
            @Override // com.huawei.health.health.utils.vippage.dataauthority.HealthDataPrivacyClickableSpan.PrivacyClickable
            public final void onClick() {
                this.d.d();
            }
        });
        spannableString.setSpan(healthDataPrivacyClickableSpan, iIndexOf, strF.length() + iIndexOf, 33);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
        this.f33853a = (HealthImageView) this.i.findViewById(R.id.closeView);
        a();
        setContentView(this.i);
    }

    /* synthetic */ void a(View view) {
        fcl.d(this.j, "m4");
        f();
    }

    /* synthetic */ void d(View view) {
        fcl.d(this.j, "m2");
        f();
    }

    /* synthetic */ void c(View view) {
        fcl.d(this.j, "m1");
        n();
    }

    /* synthetic */ void d() {
        fcl.d(this.j, "m3");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (this.f == null) {
            LogUtil.j("HealthDataAuthorityDialog", "updatePersonalizedRecommendation mUserProfileMgrUserPrivacy is null");
            return;
        }
        this.f.e(12, !LoginInit.getInstance(BaseApplication.getContext()).isKidAccount(), String.valueOf(12), new IBaseResponseCallback() { // from class: fcx
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.c(i, obj);
            }
        });
    }

    /* synthetic */ void c(int i, Object obj) {
        if (i == 0) {
            LogUtil.a("HealthDataAuthorityDialog", "onResponse updatePersonalizedRecommendation success");
            l();
        } else {
            LogUtil.j("HealthDataAuthorityDialog", "onResponse updatePersonalizedRecommendation failure");
        }
    }

    private void l() {
        ioi ioiVar = this.f;
        if (ioiVar == null) {
            LogUtil.j("HealthDataAuthorityDialog", "updateHealthDataStatus mUserProfileMgrUserPrivacy is null");
            return;
        }
        String strC = ioiVar.c(16);
        String strE = SharedPreferenceManager.e(this.e, Integer.toString(1004), "cloud_user_privacy16");
        LogUtil.a("HealthDataAuthorityDialog", "updateHealthDataStatus healthDataUserValue = ", strC, " healthDataSwitchValue = ", strE);
        if (TextUtils.isEmpty(strE) || "false".equals(strE)) {
            this.f.e(16, true, String.valueOf(16), new IBaseResponseCallback() { // from class: fco
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    LogUtil.a("HealthDataAuthorityDialog", i == 0 ? "onResponse updateHealthDataStatus success" : "onResponse updateHealthDataStatus failure");
                }
            });
        }
    }

    private void n() {
        iny.c(this.h, new ResultCallback<CloudCommonReponse>() { // from class: fck.5
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(CloudCommonReponse cloudCommonReponse) {
                LogUtil.a("HealthDataAuthorityDialog", "saveUserLabelConfig onSuccess ", HiJsonUtil.d(cloudCommonReponse));
                if (cloudCommonReponse.getResultCode().intValue() == 0) {
                    fck.this.p();
                    fck.this.f();
                } else {
                    LogUtil.j("HealthDataAuthorityDialog", "saveUserLabelConfig fail. resultCode:", cloudCommonReponse.getResultCode());
                }
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j("HealthDataAuthorityDialog", "saveUserLabelConfig onFailure ", th.getMessage());
            }
        });
    }

    private void a() {
        int iB;
        HealthImageView healthImageView = (HealthImageView) this.i.findViewById(R.id.inbox_top_img);
        int i = qrs.i(this.e);
        healthImageView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        if (qrs.af(this.e)) {
            if (qrs.ab(this.e) && i <= qre.b(R.dimen.health_common_480dp)) {
                iB = i - (qre.b(R.dimen.health_common_32dp) * 2);
            } else {
                iB = qre.b(R.dimen.health_common_480dp);
            }
            healthImageView.setLayoutParams(new ViewGroup.LayoutParams(iB, (int) (((double) iB) * (((double) qre.b(R.dimen.health_common_360dp)) / ((double) qre.b(R.dimen.health_common_480dp))))));
        }
        if (qrs.af(this.e)) {
            healthImageView.setImageResource(R.drawable.pic_health_data_authority_pad);
        } else {
            healthImageView.setImageResource(R.drawable.pic_health_data_authority);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (!j()) {
            ReleaseLogUtil.e("R_HealthDataAuthorityDialog", "can't dismiss");
            return;
        }
        try {
            dismiss();
        } catch (Exception e) {
            LogUtil.e("HealthDataAuthorityDialog", e.getMessage());
        }
    }

    private boolean j() {
        Context context = this.e;
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        return (activity.isFinishing() || activity.isDestroyed() || !isShowing()) ? false : true;
    }

    private void m() {
        iny.a(1, new ResultCallback<inr>() { // from class: fck.4
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(inr inrVar) {
                LogUtil.a("HealthDataAuthorityDialog", "requestUserLabel onSuccess");
                ArrayList arrayList = new ArrayList(16);
                if (inrVar.getResultCode().intValue() == 0) {
                    arrayList.addAll(inrVar.e());
                }
                fck.this.b(arrayList);
                fck.this.c();
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j("HealthDataAuthorityDialog", "requestUserLabel onFailure ", th.getMessage());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<inz> list) {
        this.h.clear();
        HashMap map = new HashMap(16);
        for (inz inzVar : list) {
            map.put(inzVar.a(), inzVar);
        }
        Iterator<lpo> it = this.g.iterator();
        while (it.hasNext()) {
            inz inzVar2 = (inz) map.get(it.next().c());
            if (inzVar2 != null) {
                inzVar2.b(inzVar2.c() == 0);
                this.h.add(inzVar2);
            }
        }
    }

    public void b() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: fct
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e();
            }
        });
    }

    /* synthetic */ void e() {
        lpd lpdVar = new lpd();
        lpdVar.c("477c1deae2d39105");
        lqo.b(this.e).c(lpdVar, new ResultCallback<lpc>() { // from class: fck.1
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(lpc lpcVar) {
                LogUtil.a("HealthDataAuthorityDialog", "requestLabelRuleGroup onSuccess");
                fck.this.a(lpcVar);
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.j("HealthDataAuthorityDialog", "requestLabelRuleGroup onFailure ", th.getMessage());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(lpc lpcVar) {
        lpl lplVarA;
        if (lpcVar.b() == null || njy.e(lpcVar.b().b())) {
            return;
        }
        List<lpi> listB = lpcVar.b().b();
        if (njy.e(listB) || (lplVarA = listB.get(0).a()) == null || njy.e(lplVarA.a())) {
            return;
        }
        List<lpo> listA = lplVarA.a();
        this.g.clear();
        this.g.addAll(listA);
        m();
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog
    public void configDialog() {
        h();
        o();
    }

    private void o() {
        Context context;
        LogUtil.j("HealthDataAuthorityDialog", "setCenterCardLayout() ");
        View view = this.i;
        if (view == null) {
            LogUtil.j("HealthDataAuthorityDialog", "setCenterCardLayout() mTextContainer is null.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null || (context = this.e) == null) {
            LogUtil.j("HealthDataAuthorityDialog", "setCenterCardLayout() containerParams or mContext is null.");
            return;
        }
        if (qrs.af(context)) {
            int i = qrs.i(this.e);
            int iG = qrs.g(this.e);
            layoutParams2.height = (int) (((double) Math.min(i, iG)) * 0.9d);
            layoutParams2.width = qre.b(R.dimen.health_common_480dp);
            if (qrs.ab(this.e) && i <= qre.b(R.dimen.health_common_480dp)) {
                layoutParams2.width = i - (qre.b(R.dimen.health_common_32dp) * 2);
            }
            layoutParams2.topMargin = qre.b(R.dimen.health_common_0dp);
            layoutParams2.gravity = 17;
            LogUtil.a("HealthDataAuthorityDialog", "setCenterCardLayout() windowWidth = ", Integer.valueOf(i), " windowHeight:", Integer.valueOf(iG), "containerParams.height = ", Integer.valueOf(layoutParams2.height), "containerParams.width = ", Integer.valueOf(layoutParams2.width));
        } else {
            layoutParams2.topMargin = qre.b(R.dimen.health_common_8dp);
            layoutParams2.height = -1;
            layoutParams2.width = -1;
            layoutParams2.gravity = 80;
        }
        a();
        this.i.setLayoutParams(layoutParams2);
    }
}
