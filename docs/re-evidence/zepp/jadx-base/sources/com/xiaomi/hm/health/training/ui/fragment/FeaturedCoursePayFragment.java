package com.xiaomi.hm.health.training.ui.fragment;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.lib.view.SystemBarTintSupport;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.entity.PayChannel;
import com.xiaomi.hm.health.training.api.entity.PayOrderParams;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.Status;
import com.xiaomi.hm.health.training.ui.helper.LoadingDialogHelper;
import com.xiaomi.hm.health.training.ui.viewmodel.FeaturedCoursePayViewModel;
import com.xiaomi.hm.health.training.ui.viewmodel.TrainingViewModelFactory;
import com.xiaomi.hm.health.training.utils.TrainingInjection;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCoursePayFragment extends BaseDialogFragment implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private static final String o = "Train-FeaturedCoursePayFragment";
    private OnPayResultListener e;
    private OnJoinResultListener f;
    private PayOrderParams g;
    private Float h;
    private String i;
    public CheckBox j;
    public CheckBox k;

    @Inject
    public TrainingViewModelFactory l;
    private FeaturedCoursePayViewModel m;
    private LoadingDialogHelper n;

    public interface OnJoinResultListener {
        void onJoinedResult(boolean z);
    }

    public interface OnPayResultListener {
        void onPayResult(boolean z, String str);
    }

    private void f() {
        this.l = TrainingInjection.get().getViewModelFactory();
    }

    private static boolean g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.tencent.mm", 0) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Resource resource) {
        this.n.showOrError(resource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Resource resource) {
        if (resource == null || !resource.isComplete()) {
            return;
        }
        OnPayResultListener onPayResultListener = this.e;
        if (onPayResultListener != null) {
            onPayResultListener.onPayResult(resource.getStatus() == Status.SUCCESS, resource.getMessage());
        }
        if (resource.getStatus() != Status.SUCCESS) {
            dismiss();
        }
    }

    private void initViewModel() {
        FeaturedCoursePayViewModel featuredCoursePayViewModel = (FeaturedCoursePayViewModel) ViewModelProviders.of(this, this.l).get(FeaturedCoursePayViewModel.class);
        this.m = featuredCoursePayViewModel;
        featuredCoursePayViewModel.getOrderResultLiveData().observe(this, new Observer() { // from class: m22
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.h((Resource) obj);
            }
        });
        this.m.getPayResultLiveData().observe(this, new Observer() { // from class: l22
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.i((Resource) obj);
            }
        });
        this.m.getJoinResultLiveData().observe(this, new Observer() { // from class: k22
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.j((Resource) obj);
            }
        });
        this.m.setCourseId(this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(Resource resource) {
        if (resource == null || !resource.isComplete()) {
            return;
        }
        if (this.f != null) {
            this.f.onJoinedResult(resource.getData() != null ? ((Boolean) resource.getData()).booleanValue() : false);
        }
        dismiss();
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public View initView() {
        View viewInflate = View.inflate(getContext(), R.layout.dialog_featured_course_pay, null);
        initView(viewInflate);
        f();
        initViewModel();
        return viewInflate;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton.getId() == R.id.cb_wx) {
            this.k.setChecked(!z);
        } else if (compoundButton.getId() == R.id.cb_zfb) {
            this.j.setChecked(!z);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_confirm) {
            if (getActivity() == null) {
                return;
            }
            boolean zIsChecked = this.j.isChecked();
            if (zIsChecked && !g(getActivity())) {
                CustomToast.showShort(getActivity(), R.string.tr_install_weixin_tips);
                return;
            }
            this.g.payChannel = zIsChecked ? PayChannel.WECHAT : PayChannel.ALIPAY;
            this.m.generateOrderAndPay(getActivity(), this.g);
            Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.CONFIRM_PURCHASE_CLICK).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, String.valueOf(this.i)).addExtra(TrainingAnalytics.ParamKey.PURCHASE_METHOD, zIsChecked ? TrainingAnalytics.ParamValue.PurchaseMethod.WECHAT : TrainingAnalytics.ParamValue.PurchaseMethod.ALIPAY));
            return;
        }
        if (id == R.id.iv_close) {
            dismiss();
            return;
        }
        if (id == R.id.layout_wx) {
            this.j.setChecked(true);
            this.k.setChecked(false);
        } else if (id == R.id.layout_zfb) {
            this.j.setChecked(false);
            this.k.setChecked(true);
        }
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = R.style.DimPanel;
        if (SystemBarTintSupport.isSupport(getActivity())) {
            i = R.style.DimPanelTint;
        }
        setStyle(0, i);
        Analytics.recordEvent(new CountEventBuilder(TrainingAnalytics.EventId.CONFIRM_PURCHASE_VIEW_NUM).addExtra(TrainingAnalytics.ParamKey.COURSE_ID, String.valueOf(this.i)));
    }

    public void setOnResultListener(OnPayResultListener onPayResultListener, OnJoinResultListener onJoinResultListener) {
        this.e = onPayResultListener;
        this.f = onJoinResultListener;
    }

    public void setPayOrder(PayOrderParams payOrderParams, Float f, String str) {
        this.g = payOrderParams;
        this.h = f;
        this.i = str;
    }

    private void initView(View view) {
        view.findViewById(R.id.iv_close).setOnClickListener(this);
        view.findViewById(R.id.btn_confirm).setOnClickListener(this);
        view.findViewById(R.id.layout_wx).setOnClickListener(this);
        view.findViewById(R.id.layout_zfb).setOnClickListener(this);
        if (this.g == null) {
            PayOrderParams payOrderParams = new PayOrderParams();
            this.g = payOrderParams;
            payOrderParams.courseId = this.i;
        }
        ((TextView) view.findViewById(R.id.tv_purchase_content)).setText(this.g.description);
        ((TextView) view.findViewById(R.id.tv_pay_amount)).setText("¥" + this.h);
        this.j = (CheckBox) view.findViewById(R.id.cb_wx);
        this.k = (CheckBox) view.findViewById(R.id.cb_zfb);
        this.j.setOnCheckedChangeListener(this);
        this.k.setOnCheckedChangeListener(this);
        this.n = new LoadingDialogHelper(getActivity());
    }
}
