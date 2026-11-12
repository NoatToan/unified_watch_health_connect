package com.huami.bloodpressure_ui.intro;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.bloodpressure_core.di.KoinExKt;
import com.huami.bloodpressure_core.url.IBPResearchConfig;
import com.huami.bloodpressure_ui.R;
import com.huami.bloodpressure_ui.databinding.BloodPressureIntroFragmentBinding;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001d\u0010\r\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/bloodpressure_ui/intro/BloodPressureIntroFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Lcom/huami/bloodpressure_ui/databinding/BloodPressureIntroFragmentBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "b", "()Lcom/huami/bloodpressure_ui/databinding/BloodPressureIntroFragmentBinding;", "binding", "Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", "Lkotlin/Lazy;", "c", "()Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", "mResearchConfig", "<init>", "()V", "Companion", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureIntroFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mResearchConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/huami/bloodpressure_ui/intro/BloodPressureIntroFragment$Companion;", "", "Lcom/huami/bloodpressure_ui/intro/BloodPressureIntroFragment;", "newInstance", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BloodPressureIntroFragment newInstance() {
            return new BloodPressureIntroFragment();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<IBPResearchConfig> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IBPResearchConfig invoke() {
            return (IBPResearchConfig) KoinExKt.bloodPressureScope(KoinExKt.bloodPressureScope().getKoin()).get(Reflection.getOrCreateKotlinClass(IBPResearchConfig.class), null, null);
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BloodPressureIntroFragment.class), "binding", "getBinding()Lcom/huami/bloodpressure_ui/databinding/BloodPressureIntroFragmentBinding;"));
        c = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    public BloodPressureIntroFragment() {
        super(R.layout.blood_pressure_intro_fragment);
        this.binding = FragmentViewBindingKt.viewBinding(new BloodPressureIntroFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(BloodPressureIntroFragmentBinding.class)));
        this.mResearchConfig = LazyKt__LazyJVMKt.lazy(a.a);
    }

    private final BloodPressureIntroFragmentBinding b() {
        return (BloodPressureIntroFragmentBinding) this.binding.getValue(this, c[0]);
    }

    private final IBPResearchConfig c() {
        return (IBPResearchConfig) this.mResearchConfig.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        b().tvIntroDesc.setText(c().researchEnable() ? R.string.blood_pressure_research_intro : R.string.blood_pressure_intro);
        b().tvIntroTitle.setText(c().researchEnable() ? R.string.blood_pressure_introducation : R.string.blood_pressure);
    }
}
