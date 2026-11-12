package com.huami.femalehealth.uilib.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.calendarview.Calendar;
import com.huami.femalehealth.logiclib.helper.DateTriple;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.koin.ScopesAndQualifersKt;
import com.huami.femalehealth.uilib.ui.fragment.StatusFragment;
import com.huami.femalehealth.uilib.viewmodel.StatusViewModel;
import com.huami.femalehealth.uilib.widget.MyStatueView;
import com.huami.femalehealth.uilib.widget.calendar.status.CalendarPeriodStyle;
import com.huami.femalehealth.uilib.widget.calendar.week.CalendarWeekLayout;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/huami/femalehealth/uilib/ui/fragment/StatusFragment;", "Landroidx/fragment/app/Fragment;", "", "e", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/huami/femalehealth/uilib/viewmodel/StatusViewModel;", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/femalehealth/uilib/viewmodel/StatusViewModel;", "viewModel", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class StatusFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/calendarview/Calendar;", "it", "Lcom/huami/femalehealth/uilib/widget/calendar/status/CalendarPeriodStyle;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Calendar, CalendarPeriodStyle> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CalendarPeriodStyle invoke(@NotNull Calendar calendar) {
            return StatusFragment.this.d().calRenderStyle(calendar).getFirst();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StatusFragment() {
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(new Function0<StatusViewModel>() { // from class: com.huami.femalehealth.uilib.ui.fragment.StatusFragment$special$$inlined$injectInFH$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.femalehealth.uilib.viewmodel.StatusViewModel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final StatusViewModel invoke() {
                return ScopesAndQualifersKt.femaleHealthScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(StatusViewModel.class), qualifier, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StatusViewModel d() {
        return (StatusViewModel) this.viewModel.getValue();
    }

    private final void e() {
        d().getCurrentStyleLiveData().observe(this, new Observer() { // from class: zf7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                StatusFragment.f(this.a, (Triple) obj);
            }
        });
        d().getSyncTimeLiveData().observe(this, new Observer() { // from class: yf7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                StatusFragment.g(this.a, (String) obj);
            }
        });
        d().getRefreshLiveData().observe(this, new Observer() { // from class: xf7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                StatusFragment.h(this.a, (DateTriple) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(StatusFragment statusFragment, Triple triple) {
        View view = statusFragment.getView();
        ((MyStatueView) (view == null ? null : view.findViewById(R.id.sv_status))).setStatusDesc((String) triple.getSecond());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(StatusFragment statusFragment, String str) {
        View view = statusFragment.getView();
        ((MyStatueView) (view == null ? null : view.findViewById(R.id.sv_status))).setStatusTime(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(StatusFragment statusFragment, DateTriple dateTriple) {
        View view = statusFragment.getView();
        ((MyStatueView) (view == null ? null : view.findViewById(R.id.sv_status))).refresh();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fh_fragment_status, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        d().calculation();
        View view2 = getView();
        ((CalendarWeekLayout) (view2 == null ? null : view2.findViewById(R.id.calendar_week_layout))).setRenderStyle(new a());
        e();
    }
}
