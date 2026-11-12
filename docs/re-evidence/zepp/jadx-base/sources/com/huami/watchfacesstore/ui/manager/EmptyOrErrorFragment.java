package com.huami.watchfacesstore.ui.manager;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.p008lifecycle.Observer;
import androidx.viewbinding.ViewBinding;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.databinding.WfErrorLayoutBinding;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.ui.WatchFacesStoreActivity;
import com.huami.watchfacesstore.ui.base.BaseFragment;
import com.huami.watchfacesstore.ui.manager.EmptyOrErrorFragment;
import com.huami.widget.toast.IconToast;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.cybergarage.upnp.std.av.server.ContentDirectory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/huami/watchfacesstore/ui/manager/EmptyOrErrorFragment;", "Lcom/huami/watchfacesstore/ui/base/BaseFragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "initView", "Landroidx/viewbinding/ViewBinding;", "getViewBinding", "Lcom/huami/watchfacesstore/databinding/WfErrorLayoutBinding;", "f", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "g", "()Lcom/huami/watchfacesstore/databinding/WfErrorLayoutBinding;", "binding", "Lcom/huami/watchfacesstore/ui/manager/WatchManagerViewModel;", "Lkotlin/Lazy;", "h", "()Lcom/huami/watchfacesstore/ui/manager/WatchManagerViewModel;", "managerViewModel", "", LogUtil.I, "type", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class EmptyOrErrorFragment extends BaseFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final int EMPTY = 0;
    public static final int ERROR = 1;
    public static final /* synthetic */ KProperty<Object>[] i;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = FragmentViewBindingKt.viewBinding(new EmptyOrErrorFragment$special$$inlined$viewBinding$1(new InflateViewBinder(WfErrorLayoutBinding.class)));

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy managerViewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/huami/watchfacesstore/ui/manager/EmptyOrErrorFragment$Companion;", "", "", "type", "Lcom/huami/watchfacesstore/ui/manager/EmptyOrErrorFragment;", "newInstance", "EMPTY", LogUtil.I, ContentDirectory.ERROR, "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EmptyOrErrorFragment newInstance(int type) {
            EmptyOrErrorFragment emptyOrErrorFragment = new EmptyOrErrorFragment();
            emptyOrErrorFragment.type = type;
            return emptyOrErrorFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "emptyLiveData observe " + this.a;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(EmptyOrErrorFragment.class), "binding", "getBinding()Lcom/huami/watchfacesstore/databinding/WfErrorLayoutBinding;"));
        i = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmptyOrErrorFragment() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.watchfacesstore.ui.manager.EmptyOrErrorFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.managerViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WatchManagerViewModel>() { // from class: com.huami.watchfacesstore.ui.manager.EmptyOrErrorFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.watchfacesstore.ui.manager.WatchManagerViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WatchManagerViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(WatchManagerViewModel.class), function0, objArr);
            }
        });
    }

    private final WfErrorLayoutBinding g() {
        return (WfErrorLayoutBinding) this.binding.getValue(this, i[0]);
    }

    private final WatchManagerViewModel h() {
        return (WatchManagerViewModel) this.managerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(TextView textView, View view) {
        Context context = textView.getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.huami.watchfacesstore.ui.WatchFacesStoreActivity");
        ((WatchFacesStoreActivity) context).switchTab(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(EmptyOrErrorFragment emptyOrErrorFragment, View view) {
        if (!NetUtil.INSTANCE.networkInfo().isNetworkConnect()) {
            IconToast.showError(KoinExtKt.getAppContext(), R.string.wf_network_unconnected);
        } else {
            emptyOrErrorFragment.h().getAllData();
            emptyOrErrorFragment.h().getMyWatchFaceList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(EmptyOrErrorFragment emptyOrErrorFragment, Boolean bool) {
        HMLog.info("ErrorFragment", new a(bool));
        ExtensionsKt.hideSelf(emptyOrErrorFragment);
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseFragment
    @NotNull
    public ViewBinding getViewBinding() {
        return g();
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseFragment
    public void initView() {
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        if (this.type != 0) {
            g().errorContainer.setPadding(0, ExtensionsKt.getDp(40), 0, ExtensionsKt.getDp(40));
            g().refreshTv.setOnClickListener(new View.OnClickListener() { // from class: zk1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    EmptyOrErrorFragment.j(this.a, view2);
                }
            });
            h().getEmptyLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: al1
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    EmptyOrErrorFragment.k(this.a, (Boolean) obj);
                }
            });
        } else {
            g().errorTipsTv.setText(R.string.wf_manager_empty_data_tip);
            final TextView textView = g().refreshTv;
            textView.setText(R.string.wf_manager_empty_data_jump);
            textView.setOnClickListener(new View.OnClickListener() { // from class: yk1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    EmptyOrErrorFragment.i(textView, view2);
                }
            });
        }
    }
}
