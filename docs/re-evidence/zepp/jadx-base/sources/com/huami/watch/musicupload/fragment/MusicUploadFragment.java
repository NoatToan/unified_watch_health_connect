package com.huami.watch.musicupload.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.log.HMLog;
import com.huami.watch.musicupload.DeviceStatus;
import com.huami.watch.musicupload.adapter.SpacingDecoration;
import com.huami.watch.musicupload.adapter.UploadAdapter;
import com.huami.watch.musicupload.adapter.UploadItemInfo;
import com.huami.watch.musicupload.logic.MusicUploadStatistics;
import com.huami.watch.musicupload.viewmodel.DeviceStatusViewModel;
import com.huami.watch.musicupload.viewmodel.MusicUploadViewModel;
import com.huami.watch.musicupload.viewmodel.WifiFtpViewModel;
import com.huami.watch.wififtp.R;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0002\u000e\u0014B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016R\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001a\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0014\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u001a\u0010 \u001a\u00060\u001eR\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\"¨\u0006'"}, d2 = {"Lcom/huami/watch/musicupload/fragment/MusicUploadFragment;", "Landroidx/fragment/app/Fragment;", "", "e", "f", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onActivityCreated", "onDestroyView", "Lcom/huami/watch/musicupload/viewmodel/MusicUploadViewModel;", "a", "Lkotlin/Lazy;", "c", "()Lcom/huami/watch/musicupload/viewmodel/MusicUploadViewModel;", "viewModel", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel;", "b", GoogleApiAvailabilityLight.a, "()Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel;", "wifiFtpViewModel", "Lcom/huami/watch/musicupload/viewmodel/DeviceStatusViewModel;", "()Lcom/huami/watch/musicupload/viewmodel/DeviceStatusViewModel;", "deviceStatusViewModel", "Lcom/huami/watch/musicupload/adapter/UploadAdapter;", "Lcom/huami/watch/musicupload/adapter/UploadAdapter;", "adapter", "Lcom/huami/watch/musicupload/fragment/MusicUploadFragment$b;", "Lcom/huami/watch/musicupload/fragment/MusicUploadFragment$b;", "itemClickListener", "Lcom/huami/watch/musicupload/adapter/SpacingDecoration;", "Lcom/huami/watch/musicupload/adapter/SpacingDecoration;", "itemDecoration", "<init>", "()V", "i", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class MusicUploadFragment extends Fragment {
    private static final String h = "MusicUploadFragment";

    @NotNull
    private static final a i = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy wifiFtpViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy deviceStatusViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final UploadAdapter adapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final b itemClickListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private SpacingDecoration itemDecoration;
    private HashMap g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/watch/musicupload/fragment/MusicUploadFragment$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"com/huami/watch/musicupload/fragment/MusicUploadFragment$b", "Lcom/huami/watch/musicupload/adapter/UploadAdapter$IItemClickListener;", "", "position", "Lcom/huami/watch/musicupload/adapter/UploadItemInfo;", "itemInfo", "", "onDelete", "onRetry", "onRetryAll", "<init>", "(Lcom/huami/watch/musicupload/fragment/MusicUploadFragment;)V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public final class b implements UploadAdapter.IItemClickListener {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ UploadItemInfo b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, UploadItemInfo uploadItemInfo) {
                super(0);
                this.a = i;
                this.b = uploadItemInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onDelete position: " + this.a + "; itemInfo: " + this.b;
            }
        }

        /* JADX INFO: renamed from: com.huami.watch.musicupload.fragment.MusicUploadFragment$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class C0667b extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ UploadItemInfo b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0667b(int i, UploadItemInfo uploadItemInfo) {
                super(0);
                this.a = i;
                this.b = uploadItemInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onRetry position: " + this.a + "; itemInfo: " + this.b;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class c extends Lambda implements Function0<String> {
            public static final c a = new c();

            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onRetry all tasks";
            }
        }

        public b() {
        }

        @Override // com.huami.watch.musicupload.adapter.UploadAdapter.IItemClickListener
        public void onDelete(int position, @NotNull UploadItemInfo itemInfo) {
            a unused = MusicUploadFragment.i;
            HMLog.info(MusicUploadFragment.h, new a(position, itemInfo));
            if (itemInfo.getFileInfo() == null) {
                return;
            }
            MusicUploadFragment.this.adapter.notifyItemRemoved(position);
            MusicUploadFragment.this.c().deleteTask(itemInfo.getFileInfo());
        }

        @Override // com.huami.watch.musicupload.adapter.UploadAdapter.IItemClickListener
        public void onRetry(int position, @NotNull UploadItemInfo itemInfo) {
            a unused = MusicUploadFragment.i;
            HMLog.info(MusicUploadFragment.h, new C0667b(position, itemInfo));
            if (itemInfo.getFileInfo() == null) {
                return;
            }
            MusicUploadFragment.this.c().retryTask(itemInfo.getFileInfo());
            WifiFtpViewModel.establishConnection$default(MusicUploadFragment.this.d(), MusicUploadFragment.this.requireActivity(), null, 2, null);
            MusicUploadStatistics.INSTANCE.recordRetryBtnClick();
        }

        @Override // com.huami.watch.musicupload.adapter.UploadAdapter.IItemClickListener
        public void onRetryAll() {
            a unused = MusicUploadFragment.i;
            HMLog.info(MusicUploadFragment.h, c.a);
            MusicUploadFragment.this.c().retryAllTask();
            WifiFtpViewModel.establishConnection$default(MusicUploadFragment.this.d(), MusicUploadFragment.this.requireActivity(), null, 2, null);
            MusicUploadStatistics.INSTANCE.recordRetryBtnClick();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/huami/watch/musicupload/adapter/UploadItemInfo;", "kotlin.jvm.PlatformType", "items", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 4, 1})
    public static final class c<T> implements Observer<List<? extends UploadItemInfo>> {
        public c() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(List<UploadItemInfo> list) {
            if (list == null || list.isEmpty()) {
                MusicUploadFragment.this.f();
            } else {
                MusicUploadFragment.this.adapter.setItems(list);
                MusicUploadFragment.this.adapter.notifyDataSetChanged();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "show", "", "a", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 1})
    public static final class d<T> implements Observer<Boolean> {
        public d() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(Boolean bool) {
            ((TextView) MusicUploadFragment.this._$_findCachedViewById(R.id.tv_desc)).setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/huami/watch/musicupload/DeviceStatus;", "kotlin.jvm.PlatformType", "status", "", "a", "(Lcom/huami/watch/musicupload/DeviceStatus;)V"}, k = 3, mv = {1, 4, 1})
    public static final class e<T> implements Observer<DeviceStatus> {
        public e() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(DeviceStatus deviceStatus) {
            if (deviceStatus != null) {
                if (deviceStatus == DeviceStatus.DisconnectedIdle) {
                    MusicUploadFragment.this._$_findCachedViewById(R.id.back_fog_layer).setVisibility(8);
                    MusicUploadFragment.this._$_findCachedViewById(R.id.fog_layer2).setVisibility(0);
                    MusicUploadFragment.this._$_findCachedViewById(R.id.fog_layer).setVisibility(0);
                } else if (deviceStatus == DeviceStatus.DisconnectedTransfer) {
                    MusicUploadFragment.this._$_findCachedViewById(R.id.back_fog_layer).setVisibility(0);
                    MusicUploadFragment.this._$_findCachedViewById(R.id.fog_layer2).setVisibility(0);
                    MusicUploadFragment.this._$_findCachedViewById(R.id.fog_layer).setVisibility(0);
                } else if (deviceStatus.isConnected()) {
                    MusicUploadFragment.this._$_findCachedViewById(R.id.back_fog_layer).setVisibility(8);
                    MusicUploadFragment.this._$_findCachedViewById(R.id.fog_layer2).setVisibility(8);
                    MusicUploadFragment.this._$_findCachedViewById(R.id.fog_layer).setVisibility(8);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FragmentKt.findNavController(MusicUploadFragment.this).navigateUp();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class g implements View.OnClickListener {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "on clear clicked!!";
            }
        }

        public g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a unused = MusicUploadFragment.i;
            HMLog.info(MusicUploadFragment.h, a.a);
            MusicUploadFragment.this.c().clearAll();
        }
    }

    public MusicUploadFragment() {
        super(R.layout.fragment_music_upload);
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MusicUploadViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.watch.musicupload.fragment.MusicUploadFragment$$special$$inlined$activityViewModels$1
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.watch.musicupload.fragment.MusicUploadFragment$$special$$inlined$activityViewModels$2
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
        this.wifiFtpViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(WifiFtpViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.watch.musicupload.fragment.MusicUploadFragment$$special$$inlined$activityViewModels$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.watch.musicupload.fragment.MusicUploadFragment$$special$$inlined$activityViewModels$4
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
        this.deviceStatusViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DeviceStatusViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.watch.musicupload.fragment.MusicUploadFragment$$special$$inlined$activityViewModels$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.watch.musicupload.fragment.MusicUploadFragment$$special$$inlined$activityViewModels$6
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
        this.adapter = new UploadAdapter();
        this.itemClickListener = new b();
    }

    private final DeviceStatusViewModel b() {
        return (DeviceStatusViewModel) this.deviceStatusViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MusicUploadViewModel c() {
        return (MusicUploadViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WifiFtpViewModel d() {
        return (WifiFtpViewModel) this.wifiFtpViewModel.getValue();
    }

    private final void e() {
        this.adapter.setUploadObservable(c());
        this.adapter.setItemListener(this.itemClickListener);
        float f2 = requireContext().getResources().getDisplayMetrics().density * 14;
        int i2 = R.id.rv_file_upload;
        ((RecyclerView) _$_findCachedViewById(i2)).setAdapter(this.adapter);
        SpacingDecoration spacingDecoration = this.itemDecoration;
        if (spacingDecoration == null) {
            spacingDecoration = new SpacingDecoration(0, (int) f2, false);
        }
        this.itemDecoration = spacingDecoration;
        ((RecyclerView) _$_findCachedViewById(i2)).removeItemDecoration(spacingDecoration);
        ((RecyclerView) _$_findCachedViewById(i2)).addItemDecoration(spacingDecoration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        ((LinearLayout) _$_findCachedViewById(R.id.layout_empty)).setVisibility(0);
        ((LinearLayout) _$_findCachedViewById(R.id.layout_transform_list)).setVisibility(8);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.g;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i2) {
        if (this.g == null) {
            this.g = new HashMap();
        }
        View view = (View) this.g.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i2);
        this.g.put(Integer.valueOf(i2), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        c().getTaskItemsLiveData().observe(getViewLifecycleOwner(), new c());
        c().getShowTransformAlertLiveData().observe(getViewLifecycleOwner(), new d());
        b().getStatusLiveData().observe(getViewLifecycleOwner(), new e());
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ((RecyclerView) _$_findCachedViewById(R.id.rv_file_upload)).setAdapter(null);
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        e();
        ((ImageView) _$_findCachedViewById(R.id.iv_back)).setOnClickListener(new f());
        ((TextView) _$_findCachedViewById(R.id.btn_clear_all)).setOnClickListener(new g());
    }
}
