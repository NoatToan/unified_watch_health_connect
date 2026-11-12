package com.huami.pai.ui.heartrate;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.ext.I18nKt;
import com.huami.pai.ext.PaiTimeExKt;
import com.huami.pai.ext.ViewExKt;
import com.huami.pai.lib.R;
import com.huami.pai.lib.databinding.FragmentNoheartrateDataBinding;
import com.huami.pai.lib.databinding.FragmentPaiNoHrBinding;
import com.huami.pai.ui.history.PAIHistoryViewModel;
import com.huami.pai.vo.PAIDataVo;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.xiaomi.hm.health.dataprocess.SportDay;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0002J \u0010\u000b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0002J \u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u001a\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/pai/ui/heartrate/PaiNoHeartRateFragment;", "Landroidx/fragment/app/Fragment;", "", "mint", "", "c", "pai", "progress", "timeString", "", "e", "f", GoogleApiAvailabilityLight.a, "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/huami/pai/lib/databinding/FragmentNoheartrateDataBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "b", "()Lcom/huami/pai/lib/databinding/FragmentNoheartrateDataBinding;", "binding", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiNoHeartRateFragment extends Fragment {
    public static final /* synthetic */ KProperty<Object>[] b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PaiNoHeartRateFragment.class), "binding", "getBinding()Lcom/huami/pai/lib/databinding/FragmentNoheartrateDataBinding;"))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    public PaiNoHeartRateFragment() {
        super(R.layout.fragment_noheartrate_data);
        this.binding = FragmentViewBindingKt.viewBinding(new PaiNoHeartRateFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(FragmentNoheartrateDataBinding.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentNoheartrateDataBinding b() {
        return (FragmentNoheartrateDataBinding) this.binding.getValue(this, b[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c(int mint) {
        return getString(R.string.pai_hour_mint, Integer.valueOf(mint / 60), Integer.valueOf(mint % 60));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int pai, int progress, String timeString) {
        FragmentPaiNoHrBinding fragmentPaiNoHrBinding = b().llNoHrContent;
        fragmentPaiNoHrBinding.paiProgressValueH.setText(getString(R.string.pai_progress_value, String.valueOf(pai)));
        fragmentPaiNoHrBinding.paiTimeH.setText(timeString);
        fragmentPaiNoHrBinding.paiProgressH.setProgress(progress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(int pai, int progress, String timeString) {
        FragmentPaiNoHrBinding fragmentPaiNoHrBinding = b().llNoHrContent;
        fragmentPaiNoHrBinding.paiProgressValueL.setText(getString(R.string.pai_progress_value, String.valueOf(pai)));
        fragmentPaiNoHrBinding.paiTimeL.setText(timeString);
        fragmentPaiNoHrBinding.paiProgressL.setProgress(progress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(int pai, int progress, String timeString) {
        FragmentPaiNoHrBinding fragmentPaiNoHrBinding = b().llNoHrContent;
        fragmentPaiNoHrBinding.paiProgressValueM.setText(getString(R.string.pai_progress_value, String.valueOf(pai)));
        fragmentPaiNoHrBinding.paiTimeM.setText(timeString);
        fragmentPaiNoHrBinding.paiProgressM.setProgress(progress);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        b().paiValueToday.setText(getString(R.string.pai_value_today, I18nKt.i18nString(0)));
        ((PAIHistoryViewModel) new ViewModelProvider(requireActivity()).get(PAIHistoryViewModel.class)).getCurrentSelectData().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.pai.ui.heartrate.PaiNoHeartRateFragment$onViewCreated$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                PAIDataVo pAIDataVo = (PAIDataVo) t;
                if (pAIDataVo == null) {
                    PaiNoHeartRateFragment paiNoHeartRateFragment = this.a;
                    paiNoHeartRateFragment.e(0, 0, paiNoHeartRateFragment.c(0));
                    PaiNoHeartRateFragment paiNoHeartRateFragment2 = this.a;
                    paiNoHeartRateFragment2.f(0, 0, paiNoHeartRateFragment2.c(0));
                    PaiNoHeartRateFragment paiNoHeartRateFragment3 = this.a;
                    paiNoHeartRateFragment3.d(0, 0, paiNoHeartRateFragment3.c(0));
                    return;
                }
                ViewExKt.setVisible(this.a.b().llNoHrParent, pAIDataVo.getLhr() <= 0);
                SportDay sportDayFromString = SportDay.fromString(pAIDataVo.getDate());
                if (sportDayFromString.isToday()) {
                    this.a.b().paiValueToday.setText(this.a.getString(R.string.pai_value_today, String.valueOf((int) pAIDataVo.getDp())));
                } else {
                    TextView textView = this.a.b().paiValueToday;
                    PaiNoHeartRateFragment paiNoHeartRateFragment4 = this.a;
                    textView.setText(paiNoHeartRateFragment4.getString(R.string.pai_value_select_day, PaiTimeExKt.formatDate_no_y(paiNoHeartRateFragment4.requireContext(), sportDayFromString.calendar.getTime()), String.valueOf((int) pAIDataVo.getDp())));
                }
                this.a.e((int) pAIDataVo.getLp(), pAIDataVo.getDp() > 0.0f ? (int) ((pAIDataVo.getLp() / pAIDataVo.getDp()) * 100) : 0, this.a.c(pAIDataVo.getLm()));
                this.a.f((int) pAIDataVo.getMp(), pAIDataVo.getDp() > 0.0f ? (int) ((pAIDataVo.getMp() / pAIDataVo.getDp()) * 100) : 0, this.a.c(pAIDataVo.getMm()));
                this.a.d((int) pAIDataVo.getHp(), pAIDataVo.getDp() > 0.0f ? (int) ((pAIDataVo.getHp() / pAIDataVo.getDp()) * 100) : 0, this.a.c(pAIDataVo.getHm()));
            }
        });
    }
}
