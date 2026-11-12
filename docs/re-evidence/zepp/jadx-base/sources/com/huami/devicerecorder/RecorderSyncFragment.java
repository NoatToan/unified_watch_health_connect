package com.huami.devicerecorder;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicerecorder.RecorderSyncFragment;
import com.huami.devicerecorder.adapter.SpacingDecoration;
import com.huami.devicerecorder.adapter.SyncingAdapter;
import com.huami.devicerecorder.model.RecordUtils;
import com.huami.devicerecorder.model.SyncItemData;
import com.huami.devicerecorder.viewmodel.RecorderSyncViewModel;
import com.huami.tools.log.HMLog;
import com.huami.watch.musicupload.viewmodel.TransformMode;
import com.huami.watch.musicupload.viewmodel.WifiFtpViewModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u001d\u0010%\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b#\u0010$R\u001d\u0010)\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/huami/devicerecorder/RecorderSyncFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "e", "", hl.k, "", "Lcom/huami/devicerecorder/model/SyncItemData;", "syncItems", "l", "h", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onResume", "onActivityCreated", "onDestroyView", "onDestroy", "Lcom/huami/devicerecorder/adapter/SyncingAdapter;", "a", "Lkotlin/Lazy;", "c", "()Lcom/huami/devicerecorder/adapter/SyncingAdapter;", "adapter", "Lcom/huami/devicerecorder/adapter/SpacingDecoration;", "b", GoogleApiAvailabilityLight.a, "()Lcom/huami/devicerecorder/adapter/SpacingDecoration;", "itemDecoration", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "Lcom/huami/devicerecorder/viewmodel/RecorderSyncViewModel;", "f", "()Lcom/huami/devicerecorder/viewmodel/RecorderSyncViewModel;", "syncViewModel", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel;", "g", "()Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel;", "wifiFtpViewModel", "<init>", "()V", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final class RecorderSyncFragment extends Fragment {

    @NotNull
    private static final a f = new a(null);

    @Deprecated
    @NotNull
    private static final String g = "RecorderSyncFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy itemDecoration;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy syncViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy wifiFtpViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/devicerecorder/RecorderSyncFragment$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/devicerecorder/adapter/SyncingAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<SyncingAdapter> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SyncingAdapter getA() {
            return new SyncingAdapter();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/devicerecorder/adapter/SpacingDecoration;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<SpacingDecoration> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SpacingDecoration getA() {
            return new SpacingDecoration(0, (int) RecordUtils.INSTANCE.dp2px(RecorderSyncFragment.this.requireContext(), 15.0f), true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "exit record sync fragment";
        }
    }

    public RecorderSyncFragment() {
        super(R.layout.fragment_recorder_sync);
        this.adapter = LazyKt__LazyJVMKt.lazy(b.a);
        this.itemDecoration = LazyKt__LazyJVMKt.lazy(new c());
        this.syncViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(RecorderSyncViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.devicerecorder.RecorderSyncFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return this.requireActivity().getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.devicerecorder.RecorderSyncFragment$special$$inlined$activityViewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelProvider.Factory getA() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        this.wifiFtpViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(WifiFtpViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.devicerecorder.RecorderSyncFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return this.requireActivity().getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.devicerecorder.RecorderSyncFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelProvider.Factory getA() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    private final SyncingAdapter c() {
        return (SyncingAdapter) this.adapter.getValue();
    }

    private final SpacingDecoration d() {
        return (SpacingDecoration) this.itemDecoration.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadingDialog e() {
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog != null) {
            return loadingDialog;
        }
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(requireContext(), getString(R.string.alert_converting));
        loadingDialogShowDialog.setCancelable(false);
        this.mLoadingDialog = loadingDialogShowDialog;
        return loadingDialogShowDialog;
    }

    private final RecorderSyncViewModel f() {
        return (RecorderSyncViewModel) this.syncViewModel.getValue();
    }

    private final WifiFtpViewModel g() {
        return (WifiFtpViewModel) this.wifiFtpViewModel.getValue();
    }

    private final void h() {
        c().setSyncer(f());
        View view = getView();
        ((RecyclerView) (view == null ? null : view.findViewById(R.id.rv_record_sync_list))).setAdapter(c());
        View view2 = getView();
        ((RecyclerView) (view2 != null ? view2.findViewById(R.id.rv_record_sync_list) : null)).addItemDecoration(d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(RecorderSyncFragment recorderSyncFragment, View view) {
        FragmentKt.findNavController(recorderSyncFragment).navigateUp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(RecorderSyncFragment recorderSyncFragment, View view) {
        recorderSyncFragment.f().cancelAll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        View view = getView();
        ((LinearLayout) (view == null ? null : view.findViewById(R.id.layout_list))).setVisibility(8);
        View view2 = getView();
        ((RelativeLayout) (view2 == null ? null : view2.findViewById(R.id.layout_empty))).setVisibility(0);
        View view3 = getView();
        ((TextView) (view3 != null ? view3.findViewById(R.id.tv_clear) : null)).setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(List<SyncItemData> syncItems) {
        View view = getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.tv_clear))).setVisibility(0);
        View view2 = getView();
        ((LinearLayout) (view2 == null ? null : view2.findViewById(R.id.layout_list))).setVisibility(0);
        View view3 = getView();
        ((RelativeLayout) (view3 != null ? view3.findViewById(R.id.layout_empty) : null)).setVisibility(8);
        c().setData(syncItems);
        c().notifyDataSetChanged();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        f().getSyncItemsLiveData().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.devicerecorder.RecorderSyncFragment$onActivityCreated$$inlined$observe$1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                List list = (List) t;
                if (list != null && !list.isEmpty()) {
                    this.a.l(list);
                } else {
                    this.a.k();
                    FragmentKt.findNavController(this.a).navigateUp();
                }
            }
        });
        f().getDeviceConnectLivedata().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.devicerecorder.RecorderSyncFragment$onActivityCreated$$inlined$observe$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                if (((Boolean) t).booleanValue()) {
                    return;
                }
                FragmentKt.findNavController(this.a).navigateUp();
            }
        });
        f().getDecodeLiveData().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.devicerecorder.RecorderSyncFragment$onActivityCreated$$inlined$observe$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                if (((Boolean) t).booleanValue()) {
                    this.a.e().show();
                } else {
                    this.a.e().dismiss();
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        HMLog.info(g, d.a);
        f().cancelAll();
        g().disconnect();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = getView();
        ((RecyclerView) (view == null ? null : view.findViewById(R.id.rv_record_sync_list))).setAdapter(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        g().establishConnection(requireContext(), TransformMode.Record);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        h();
        View view2 = getView();
        ((AppCompatImageView) (view2 == null ? null : view2.findViewById(R.id.btn_back))).setOnClickListener(new View.OnClickListener() { // from class: ba6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RecorderSyncFragment.i(this.a, view3);
            }
        });
        View view3 = getView();
        ((TextView) (view3 != null ? view3.findViewById(R.id.tv_clear) : null)).setOnClickListener(new View.OnClickListener() { // from class: aa6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                RecorderSyncFragment.j(this.a, view4);
            }
        });
    }
}
