package com.xiaomi.hm.health.training.ui.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelProviders;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.lib.view.SystemBarTintSupport;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.api.entity.User;
import com.xiaomi.hm.health.training.api.function.Supplier;
import com.xiaomi.hm.health.training.api.util.Loggers;
import com.xiaomi.hm.health.training.ui.fragment.FeaturedCourseMoreActionFragment;
import com.xiaomi.hm.health.training.ui.viewmodel.FeaturedCourseDetailViewModel;
import com.xiaomi.hm.health.training.utils.TrainingInjection;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes21.dex */
public class FeaturedCourseMoreActionFragment extends BaseDialogFragment implements View.OnClickListener {
    private static final String j = "Train-FeaturedCourseMoreActionFragment";

    @Inject
    public ViewModelProvider.Factory e;
    private FeaturedCourseDetailViewModel f;
    private boolean g;
    private boolean h;
    private OnViewClickListener i;

    public interface OnViewClickListener {
        void onViewClick(int i);
    }

    private void f() {
        this.e = TrainingInjection.get().getViewModelFactory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g(User user) {
        return "是否绑定心率设备:" + user.hasBoundHrDevice();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object h() {
        return "getView() is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(final User user) {
        if (user != null) {
            Loggers.getLogger().v(j, new Supplier() { // from class: f22
                @Override // com.xiaomi.hm.health.training.api.function.Supplier
                public final Object get() {
                    return FeaturedCourseMoreActionFragment.g(user);
                }
            });
            this.g = user.hasBoundHrDevice();
            if (getView() != null) {
                j(getView());
            } else {
                Loggers.getLogger().w(j, new Supplier() { // from class: g22
                    @Override // com.xiaomi.hm.health.training.api.function.Supplier
                    public final Object get() {
                        return FeaturedCourseMoreActionFragment.h();
                    }
                });
            }
        }
    }

    private void initViewModel() {
        if (getActivity() == null) {
            return;
        }
        FeaturedCourseDetailViewModel featuredCourseDetailViewModel = (FeaturedCourseDetailViewModel) ViewModelProviders.of(getActivity(), this.e).get(FeaturedCourseDetailViewModel.class);
        this.f = featuredCourseDetailViewModel;
        featuredCourseDetailViewModel.getUserLiveData().observe(this, new Observer() { // from class: e22
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.i((User) obj);
            }
        });
    }

    private void j(View view) {
        boolean z = !this.h && this.g;
        view.findViewById(R.id.item_setting).setVisibility(z ? 0 : 8);
        view.findViewById(R.id.divider_setting).setVisibility(z ? 0 : 8);
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public View initView() {
        View viewInflate = View.inflate(getContext(), R.layout.dialog_featured_course_more_action, null);
        initView(viewInflate);
        j(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.i.onViewClick(view.getId());
        dismiss();
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = R.style.DimPanel;
        if (SystemBarTintSupport.isSupport(getActivity())) {
            i = R.style.DimPanelTint;
        }
        setStyle(0, i);
        f();
        initViewModel();
    }

    public void setHideSettings(boolean z) {
        this.h = z;
    }

    public void setOnViewClickListener(OnViewClickListener onViewClickListener) {
        this.i = onViewClickListener;
    }

    private void initView(View view) {
        view.findViewById(R.id.item_exit).setOnClickListener(this);
        view.findViewById(R.id.item_cancel).setOnClickListener(this);
        view.findViewById(R.id.view_other).setOnClickListener(this);
        view.findViewById(R.id.item_setting).setOnClickListener(this);
    }
}
