package com.huami.pai.ui.intro;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.pai.dc.PaiWebConst;
import com.huami.pai.koin.ScopesAndQualifersKt;
import com.huami.pai.lib.R;
import com.huami.pai.lib.databinding.PaiFragmentIntroBinding;
import com.huami.pai.navigate.ExternalUrlNavigator;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0016R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001c\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/pai/ui/intro/PaiIntroFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "", "onViewCreated", "v", "onClick", "a", "Landroid/view/View;", "mPaiQuestion", "Lcom/huami/pai/navigate/ExternalUrlNavigator;", "b", "Lkotlin/Lazy;", "c", "()Lcom/huami/pai/navigate/ExternalUrlNavigator;", "iIntroDetail", "Lcom/huami/pai/lib/databinding/PaiFragmentIntroBinding;", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "()Lcom/huami/pai/lib/databinding/PaiFragmentIntroBinding;", "binding", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiIntroFragment extends Fragment implements View.OnClickListener {
    public static final /* synthetic */ KProperty<Object>[] d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private View mPaiQuestion;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy iIntroDetail;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(PaiIntroFragment.class), "binding", "getBinding()Lcom/huami/pai/lib/databinding/PaiFragmentIntroBinding;"));
        d = kPropertyArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaiIntroFragment() {
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.iIntroDetail = LazyKt__LazyJVMKt.lazy(new Function0<ExternalUrlNavigator>() { // from class: com.huami.pai.ui.intro.PaiIntroFragment$special$$inlined$injectInPai$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.pai.navigate.ExternalUrlNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ExternalUrlNavigator invoke() {
                return ScopesAndQualifersKt.paiScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(ExternalUrlNavigator.class), qualifier, objArr);
            }
        });
        this.binding = FragmentViewBindingKt.viewBinding(new PaiIntroFragment$special$$inlined$viewBinding$1(new InflateViewBinder(PaiFragmentIntroBinding.class)));
    }

    private final PaiFragmentIntroBinding b() {
        return (PaiFragmentIntroBinding) this.binding.getValue(this, d[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExternalUrlNavigator c() {
        return (ExternalUrlNavigator) this.iIntroDetail.getValue();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        if (v.getId() == R.id.ll_pai_question) {
            v.setClickable(false);
            Context context = getContext();
            if (context == null) {
                return;
            }
            e.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new PaiIntroFragment$onClick$1$1(this, context, v, null), 3, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return b().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        View viewFindViewById = view.findViewById(R.id.ll_pai_question);
        this.mPaiQuestion = viewFindViewById;
        Objects.requireNonNull(viewFindViewById);
        viewFindViewById.setOnClickListener(this);
        String string = getString(R.string.pai_detail_desc);
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{"\n"}, false, 0, 6, (Object) null);
        try {
            if (!(((CharSequence) listSplit$default.get(0)).length() == 0)) {
                b().tvPaiinfoInfo1.setText((CharSequence) listSplit$default.get(0));
            }
            if (((CharSequence) listSplit$default.get(1)).length() > 0) {
                b().tvPaiinfoInfo2.setText((CharSequence) listSplit$default.get(1));
            }
            if (((CharSequence) listSplit$default.get(2)).length() > 0) {
                b().tvPaiinfoInfo3.setText((CharSequence) listSplit$default.get(2));
            }
        } catch (IndexOutOfBoundsException unused) {
            HMLog.info(PaiWebConst.Tag.HTTP_TAG, new a(string));
        }
    }
}
