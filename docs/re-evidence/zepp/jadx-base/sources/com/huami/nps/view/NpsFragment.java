package com.huami.nps.view;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nps.R;
import com.huami.nps.databinding.NpsLayoutBinding;
import com.huami.nps.ext.ViewExKt;
import com.huami.nps.p003const.NpsConst;
import com.huami.nps.view.NpsFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u001a\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016R\u001d\u0010\u0019\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006)"}, d2 = {"Lcom/huami/nps/view/NpsFragment;", "Landroidx/fragment/app/Fragment;", "", "i", GoogleApiAvailabilityLight.a, "", "index", "", "showH5", "l", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "surveyUrl", "h", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/huami/nps/view/NpsViewModel;", "a", "Lkotlin/Lazy;", "g", "()Lcom/huami/nps/view/NpsViewModel;", "npsViewModel", "Lcom/huami/nps/databinding/NpsLayoutBinding;", "b", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "f", "()Lcom/huami/nps/databinding/NpsLayoutBinding;", "binding", "Ljava/util/ArrayList;", "Landroid/widget/CheckBox;", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "rateBox", "<init>", "()V", "Companion", "nps_release"}, k = 1, mv = {1, 5, 1})
public final class NpsFragment extends Fragment {

    @NotNull
    public static final String ARGS_TYPE = "type_nps";

    @NotNull
    public static final String ARGS_TYPE_UID = "type_nps_uid";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy npsViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ArrayList<CheckBox> rateBox;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/nps/view/NpsFragment$Companion;", "", "", "type", "userId", "Lcom/huami/nps/view/NpsFragment;", "newInstance", "ARGS_TYPE", "Ljava/lang/String;", "ARGS_TYPE_UID", "<init>", "()V", "nps_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final NpsFragment newInstance(@NotNull String type, @NotNull String userId) {
            NpsFragment npsFragment = new NpsFragment();
            Bundle bundle = new Bundle();
            bundle.putString(NpsFragment.ARGS_TYPE, type);
            bundle.putString(NpsFragment.ARGS_TYPE_UID, userId);
            Unit unit = Unit.INSTANCE;
            npsFragment.setArguments(bundle);
            return npsFragment;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(NpsFragment.class), "binding", "getBinding()Lcom/huami/nps/databinding/NpsLayoutBinding;"));
        d = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NpsFragment() {
        super(R.layout.nps_layout);
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.nps.view.NpsFragment$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.npsViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<NpsViewModel>() { // from class: com.huami.nps.view.NpsFragment$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.nps.view.NpsViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final NpsViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(NpsViewModel.class), function0, objArr);
            }
        });
        this.binding = FragmentViewBindingKt.viewBinding(new NpsFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(NpsLayoutBinding.class)));
        this.rateBox = new ArrayList<>();
    }

    private final void d() {
        this.rateBox.add(f().cb0);
        this.rateBox.add(f().cb1);
        this.rateBox.add(f().cb2);
        this.rateBox.add(f().cb3);
        this.rateBox.add(f().cb4);
        this.rateBox.add(f().cb5);
        this.rateBox.add(f().cb6);
        this.rateBox.add(f().cb7);
        this.rateBox.add(f().cb8);
        this.rateBox.add(f().cb9);
        this.rateBox.add(f().cb10);
        int size = this.rateBox.size();
        if (size <= 0) {
            return;
        }
        final int i = 0;
        while (true) {
            int i2 = i + 1;
            this.rateBox.get(i).setOnClickListener(new View.OnClickListener() { // from class: qh5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NpsFragment.e(this.a, i, view);
                }
            });
            if (i2 >= size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(NpsFragment npsFragment, int i, View view) {
        npsFragment.l(i, (npsFragment.f().cb9.getId() == view.getId() || npsFragment.f().cb10.getId() == view.getId()) ? false : true);
    }

    private final NpsLayoutBinding f() {
        return (NpsLayoutBinding) this.binding.getValue(this, d[1]);
    }

    private final NpsViewModel g() {
        return (NpsViewModel) this.npsViewModel.getValue();
    }

    private final void h(Context context, String surveyUrl) {
        if (context instanceof FragmentActivity) {
            QuestionnaireFragment.INSTANCE.create(surveyUrl).show(((FragmentActivity) context).getSupportFragmentManager(), "");
        }
    }

    private final void i() {
        f().ivNpsClose.setOnClickListener(new View.OnClickListener() { // from class: ph5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NpsFragment.j(this.a, view);
            }
        });
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(NpsFragment npsFragment, View view) {
        ViewExKt.setVisible(npsFragment.f().getRoot(), false);
        npsFragment.g().saveShowedNpsId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(NpsFragment npsFragment, Boolean bool) {
        ViewExKt.setVisible(npsFragment.f().getRoot(), bool.booleanValue());
    }

    private final void l(int index, boolean showH5) {
        g().saveShowedNpsId();
        g().reportRatingToCloud(index);
        f().clNpsBox.setVisibility(8);
        f().tvNpsLike.setVisibility(8);
        f().tvNpsNotLike.setVisibility(8);
        f().tvNpsRecommendTitle.setVisibility(8);
        f().ivNpsSmile.setVisibility(0);
        f().tvNpsTks.setVisibility(0);
        f().tvNpsTksContent.setVisibility(0);
        if (showH5) {
            h(requireContext(), g().getServeyUrl());
        }
    }

    @JvmStatic
    @NotNull
    public static final NpsFragment newInstance(@NotNull String str, @NotNull String str2) {
        return INSTANCE.newInstance(str, str2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(ARGS_TYPE);
            if (string != null) {
                g().loadNpsByType(string);
                if (Intrinsics.areEqual(string, NpsConst.ParamValue.DIAL_TYPE_VALUE)) {
                    f().tvNpsTksContent.setText(R.string.nps_str_tks_title);
                    f().tvNpsRecommendTitle.setText(R.string.nps_str_title);
                } else {
                    f().tvNpsTksContent.setText(R.string.nps_str_tks_title_sleep);
                    f().tvNpsRecommendTitle.setText(R.string.nps_str_title_sleep);
                }
            }
            String string2 = arguments.getString(ARGS_TYPE_UID);
            if (string2 != null) {
                g().setUserId(string2);
            }
        }
        g().getShowNps().observe(getViewLifecycleOwner(), new Observer() { // from class: rh5
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                NpsFragment.k(this.a, (Boolean) obj);
            }
        });
        i();
    }
}
