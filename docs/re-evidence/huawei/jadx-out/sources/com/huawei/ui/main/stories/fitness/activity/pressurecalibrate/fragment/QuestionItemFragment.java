package com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.activity.PressureCalibrateResultActivity;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.activity.WifiDevicePressureCalibrateResultGuideActivity;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.adapter.OptionsListAdapter;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.view.NoScrollListView;
import defpackage.iov;
import defpackage.jcg;
import defpackage.qjs;
import defpackage.qrs;
import defpackage.uey;
import defpackage.ufo;
import defpackage.ugb;
import health.compact.a.CompileParameterUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class QuestionItemFragment extends PressureQuestionFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26978c;
    private OptionsListAdapter d;
    private int f;
    private HealthButton g;
    private ufo h;
    private HealthButton i;
    private NoScrollListView j;
    private View k;
    private HealthTextView n;
    private boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f26976a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Intent f26977b = null;

    public static QuestionItemFragment a(int i) {
        QuestionItemFragment questionItemFragment = new QuestionItemFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("key_index", i);
        questionItemFragment.setArguments(bundle);
        return questionItemFragment;
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.fragment.PressureQuestionFragment
    protected int setContentView() {
        return R.layout.pressure_calibrate_viewpager_item;
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.fragment.PressureQuestionFragment
    protected void lazyLoad() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i = arguments.getInt("key_index");
            this.f26978c = i;
            this.f = i + 1;
            List<ufo> listR = ugb.b().r();
            if (i >= 0 && i < listR.size()) {
                this.h = listR.get(i);
            }
            LogUtil.a("PressureMeasureMessage", "QuestionItemFragment index = ", Integer.valueOf(i));
        }
        ((WindowManager) getContext().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay().getMetrics(new DisplayMetrics());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        View contentView = getContentView();
        HealthTextView healthTextView = (HealthTextView) contentView.findViewById(R.id.hw_pressure_calibrate_pager_question_number);
        spannableStringBuilder.append((CharSequence) UnitUtil.e(this.f, 1, 0)).append((CharSequence) "/").append((CharSequence) UnitUtil.e(ugb.b().r().size(), 1, 0));
        healthTextView.setText(spannableStringBuilder);
        LogUtil.a("PressureMeasureMessage", "pager index = ", Integer.valueOf(this.f26978c));
        if (this.h != null) {
            spannableStringBuilder.clear();
            spannableStringBuilder.append((CharSequence) UnitUtil.e(this.h.d(), 1, 0));
            spannableStringBuilder.append((CharSequence) (LanguageUtil.ai(BaseApplication.b()) ? "." : "、"));
            spannableStringBuilder.append((CharSequence) this.h.c());
            ((HealthTextView) contentView.findViewById(R.id.hw_pressure_calibrate_pager_question_description)).setText(spannableStringBuilder);
        }
        this.g = (HealthButton) contentView.findViewById(R.id.hw_question_btn_change_pager);
        this.k = contentView.findViewById(R.id.hw_pressure_calibrate_view);
        this.i = (HealthButton) contentView.findViewById(R.id.hw_pressure_calibrate_pager_question_btn_submit);
        b();
        HealthTextView healthTextView2 = (HealthTextView) contentView.findViewById(R.id.hw_wifi_device_guide_pressure_calibrate_tv);
        this.n = healthTextView2;
        healthTextView2.setVisibility(8);
        c();
        i();
        a();
        e();
    }

    private void i() {
        int iE = ugb.b().e(this.f26978c + 1);
        if (iE == -1) {
            LogUtil.j("PressureMeasureMessage", "selectedItem is none");
            return;
        }
        LogUtil.a("PressureMeasureMessage", "selectedItem is ", Integer.valueOf(iE));
        this.j.setItemChecked(iE, true);
        this.d.notifyDataSetChanged();
    }

    private void b() {
        this.g.setText(getString(R.string.IDS_hw_pressure_previous));
        int iE = qjs.e(4, 2);
        ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
        layoutParams.width = iE;
        this.g.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.i.getLayoutParams();
        layoutParams2.width = iE;
        this.i.setLayoutParams(layoutParams2);
        int i = this.f26978c;
        if (i == 0) {
            this.i.setText(getString(R.string.IDS_hw_pressure_next));
            this.g.setVisibility(8);
            this.k.setVisibility(8);
            this.i.setVisibility(this.f26976a ? 0 : 8);
            return;
        }
        if (i == ugb.b().r().size() - 1) {
            this.i.setText(R.string.IDS_hw_show_card_pressure_calibrate_answer_question_submit);
        } else {
            this.i.setText(getString(R.string.IDS_hw_pressure_next));
        }
        this.g.setVisibility(0);
        this.k.setVisibility(this.f26976a ? 0 : 8);
        this.i.setVisibility(this.f26976a ? 0 : 8);
    }

    private void c() {
        this.j = (NoScrollListView) getContentView().findViewById(R.id.hw_pressure_calibrate_pager_question_options);
        OptionsListAdapter optionsListAdapter = new OptionsListAdapter(getActivity(), this.h.a(), this.j);
        this.d = optionsListAdapter;
        this.j.setAdapter((ListAdapter) optionsListAdapter);
        this.j.setChoiceMode(1);
        this.j.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.fragment.QuestionItemFragment$$ExternalSyntheticLambda2
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                this.f26979a.c(adapterView, view, i, j);
            }
        });
    }

    /* synthetic */ void c(AdapterView adapterView, View view, int i, long j) {
        this.f26976a = true;
        b("com.huawei.ui.pressure.question.next");
        LogUtil.a("PressureMeasureMessage", "getQuestionId = ", Integer.valueOf(this.h.d()));
        if (j >= 0 && j < this.h.a().size()) {
            int i2 = (int) j;
            LogUtil.a("PressureMeasureMessage", "id name = ", this.h.a().get(i2).d());
            ugb.b().d(this.h.d(), this.h.a().get(i2).d());
        }
        if (this.h.d() == ugb.b().r().size()) {
            this.e = true;
            this.k.setVisibility(0);
            this.i.setVisibility(0);
            if ("wifi_device".equals(ugb.b().o())) {
                this.n.setText(String.format(getContext().getResources().getString(R.string.IDS_device_wifi_pressure_calibrate_question_prompt), "10"));
                this.n.setVisibility(0);
            } else {
                this.n.setVisibility(8);
            }
        }
        this.d.notifyDataSetChanged();
    }

    private void a() {
        this.g.setOnClickListener(new View.OnClickListener() { // from class: ufv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(view);
            }
        });
    }

    public /* synthetic */ void c(View view) {
        if (qrs.c(500)) {
            LogUtil.j("PressureMeasureMessage", "mPreviousPageBtn fast click");
        } else {
            b("com.huawei.ui.pressure.question.previous");
            this.d.notifyDataSetChanged();
        }
    }

    private void e() {
        this.i.setOnClickListener(new View.OnClickListener() { // from class: ufw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50041c.b(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        if (qrs.c(500)) {
            LogUtil.j("PressureMeasureMessage", "mSubmitBtn fast click");
            return;
        }
        if (this.h.d() != ugb.b().r().size()) {
            b("com.huawei.ui.pressure.question.next");
            return;
        }
        if (this.e) {
            this.e = false;
            int iM = (int) ugb.b().m();
            ugb.b().a(iM);
            LogUtil.a("PressureMeasureMessage", "Answer question score = ", Integer.valueOf(iM));
            ugb.b().a(System.currentTimeMillis());
            if (ugb.b().c() == 0) {
                ugb.b().a(System.currentTimeMillis());
            }
            d();
            uey.a().d(true);
            ugb.b().g(false);
            String strO = ugb.b().o();
            String strQ = ugb.b().q();
            if ("wifi_device".equals(strO)) {
                if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false) && !jcg.c(getContext())) {
                    j();
                    return;
                }
                String strT = ugb.b().t();
                Intent intent = new Intent(getContext(), (Class<?>) WifiDevicePressureCalibrateResultGuideActivity.class);
                this.f26977b = intent;
                intent.putExtra("health_wifi_device_productId", strT);
                this.f26977b.putExtra("wifi_device_calibrate_score", iM);
                this.f26977b.putExtra("health_wifi_device_userId", strQ);
                iov.d(getContext(), this.f26977b);
                getActivity().finish();
            } else {
                h();
            }
        }
        this.d.notifyDataSetChanged();
    }

    private void b(String str) {
        Context context = getContext();
        if (context == null) {
            ReleaseLogUtil.e("PressureMeasureMessage", "gotoNextPage context == null");
            return;
        }
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        context.sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    private void d() {
        if (ugb.b().c() - ugb.b().p() > 60000) {
            ugb.b().a(true);
            if (uey.a().i()) {
                return;
            }
            uey.a().c(2, false);
        }
    }

    private void h() {
        Intent intent = new Intent(getContext(), (Class<?>) PressureCalibrateResultActivity.class);
        this.f26977b = intent;
        intent.putExtra("pressure_is_have_datas", ugb.b().j());
        this.f26977b.putExtra("from_health_record", ugb.b().a());
        this.f26977b.putExtra("press_auto_monitor", ugb.b().h());
        this.f26977b.putExtra(ArkUIXConstants.FROM_TYPE, ugb.b().d());
        iov.d(getContext(), this.f26977b);
        getActivity().finish();
    }

    private void j() {
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(getContext());
        builder.e(getContext().getString(R.string.IDS_hw_health_show_common_dialog_title)).a(getContext().getString(R.string.IDS_hw_show_set_about_privacy_connectting_error)).b(getContext().getString(R.string.IDS_hw_pressure_known), new View.OnClickListener() { // from class: ufu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50040b.e(view);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCanceledOnTouchOutside(false);
        customTextAlertDialogB.show();
    }

    public /* synthetic */ void e(View view) {
        getActivity().finish();
    }
}
