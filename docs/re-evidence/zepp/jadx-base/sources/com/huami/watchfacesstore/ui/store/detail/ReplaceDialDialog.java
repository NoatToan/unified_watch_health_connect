package com.huami.watchfacesstore.ui.store.detail;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.arch.core.LiveDataExtensionKt;
import com.huami.arch.core.StateBuilder;
import com.huami.arch.core.Success;
import com.huami.watch.notification.TransportUri;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.bean.MyWatchFaceBean;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.ext.ViewExtKt;
import com.huami.watchfacesstore.ui.adapter.MyWatchAdapter;
import com.huami.watchfacesstore.ui.base.BaseDialogFragment;
import com.huami.watchfacesstore.ui.store.detail.ReplaceDialDialog;
import com.huami.watchfacesstore.view.recycleview.BaseRVAdapter;
import com.huami.watchfacesstore.view.recycleview.ViewHolder;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0007\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004J\b\u0010\t\u001a\u00020\bH\u0015J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0014R\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/huami/watchfacesstore/ui/store/detail/ReplaceDialDialog;", "Lcom/huami/watchfacesstore/ui/base/BaseDialogFragment;", "", "initData", "Lkotlin/Function1;", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", TransportUri.ACTION_BLOCK, "onConfirm", "Landroid/view/View;", "initView", "onStart", "", "hasPadding", "Lcom/huami/watchfacesstore/ui/adapter/MyWatchAdapter;", "e", "Lkotlin/Lazy;", "r", "()Lcom/huami/watchfacesstore/ui/adapter/MyWatchAdapter;", "watchFaceAdapter", "", "f", "Ljava/util/List;", "dialList", "Lcom/huami/watchfacesstore/ui/store/detail/WatchFaceDetailViewModel;", "g", DTransferConstants.SEARCH_KEY, "()Lcom/huami/watchfacesstore/ui/store/detail/WatchFaceDetailViewModel;", "mViewModel", "h", "Lkotlin/jvm/functions/Function1;", "confirm", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "i", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "deviceSizeManager", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class ReplaceDialDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy watchFaceAdapter = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private List<MyWatchFaceBean> dialList;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Function1<? super MyWatchFaceBean, Unit> confirm;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final DeviceConfigManager deviceSizeManager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<StateBuilder<List<? extends MyWatchFaceBean>>, Unit> {

        /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.store.detail.ReplaceDialDialog$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0699a extends Lambda implements Function1<Success<? extends List<? extends MyWatchFaceBean>>, Unit> {
            public final /* synthetic */ ReplaceDialDialog a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0699a(ReplaceDialDialog replaceDialDialog) {
                super(1);
                this.a = replaceDialDialog;
            }

            public final void a(@NotNull Success<? extends List<MyWatchFaceBean>> success) {
                List<MyWatchFaceBean> value = success.getValue();
                if (value == null) {
                    return;
                }
                ReplaceDialDialog replaceDialDialog = this.a;
                replaceDialDialog.dialList = value;
                List list = replaceDialDialog.dialList;
                MyWatchFaceBean myWatchFaceBean = list == null ? null : (MyWatchFaceBean) CollectionsKt.firstOrNull(list);
                if (myWatchFaceBean != null) {
                    myWatchFaceBean.setSelected(true);
                }
                replaceDialDialog.r().addAll(replaceDialDialog.dialList);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends List<? extends MyWatchFaceBean>> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<List<MyWatchFaceBean>> stateBuilder) {
            stateBuilder.onSuccess(new C0699a(ReplaceDialDialog.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<List<? extends MyWatchFaceBean>> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<TextView, Unit> {
        public b() {
            super(1);
        }

        public final void a(TextView textView) {
            Function1 function1;
            List list = ReplaceDialDialog.this.dialList;
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((MyWatchFaceBean) obj).isSelected()) {
                    arrayList.add(obj);
                }
            }
            ReplaceDialDialog replaceDialDialog = ReplaceDialDialog.this;
            if (!(!arrayList.isEmpty()) || (function1 = replaceDialDialog.confirm) == null) {
                return;
            }
            function1.invoke(arrayList.get(0));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TextView textView) {
            a(textView);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watchfacesstore/ui/adapter/MyWatchAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<MyWatchAdapter> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MyWatchAdapter getA() {
            return new MyWatchAdapter(ReplaceDialDialog.this.requireContext(), DeviceConfigManager.DeviceSize.SIZE_FIVE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplaceDialDialog() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.watchfacesstore.ui.store.detail.ReplaceDialDialog$special$$inlined$sharedViewModel$default$1
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
        this.mViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<WatchFaceDetailViewModel>() { // from class: com.huami.watchfacesstore.ui.store.detail.ReplaceDialDialog$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.watchfacesstore.ui.store.detail.WatchFaceDetailViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final WatchFaceDetailViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(WatchFaceDetailViewModel.class), function0, objArr);
            }
        });
        this.deviceSizeManager = KoinExtKt.getDeviceConfigManager();
    }

    private final void initData() {
        if (this.dialList == null) {
            LiveDataExtensionKt.observeState$default(q().getDeviceDialLiveData(), getViewLifecycleOwner(), null, new a(), 2, null);
            q().getDeviceWatchFaceFromOnline();
        }
    }

    private final WatchFaceDetailViewModel q() {
        return (WatchFaceDetailViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MyWatchAdapter r() {
        return (MyWatchAdapter) this.watchFaceAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(ReplaceDialDialog replaceDialDialog, View view) {
        replaceDialDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(ReplaceDialDialog replaceDialDialog, ViewHolder viewHolder, int i, int i2) {
        replaceDialDialog.r().setItemSelected(i2);
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseDialogFragment
    public boolean hasPadding() {
        return false;
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseDialogFragment
    @SuppressLint({"InflateParams"})
    @NotNull
    public View initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.wf_dialog_replace_dial, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.dialog_cancel)).setOnClickListener(new View.OnClickListener() { // from class: tb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReplaceDialDialog.s(this.a, view);
            }
        });
        ViewExtKt.clickWithTrigger$default(viewInflate.findViewById(R.id.dialog_confirm), 0L, new b(), 1, null);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rl_dial_list);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), this.deviceSizeManager.getReplaceDialogItemWidth() > 70 ? 2 : 3);
        recyclerView.setAdapter(r());
        recyclerView.setLayoutManager(gridLayoutManager);
        r().setOnItemClickListener(new BaseRVAdapter.OnItemClickListener() { // from class: ub6
            @Override // com.huami.watchfacesstore.view.recycleview.BaseRVAdapter.OnItemClickListener
            public final void onItemClick(ViewHolder viewHolder, int i, int i2) {
                ReplaceDialDialog.t(this.a, viewHolder, i, i2);
            }
        });
        initData();
        return viewInflate;
    }

    public final void onConfirm(@Nullable Function1<? super MyWatchFaceBean, Unit> block) {
        this.confirm = block;
    }

    @Override // com.huami.watchfacesstore.ui.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        setCancelable(false);
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 17;
            attributes.width = ExtensionsKt.getDp(295);
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }
}
