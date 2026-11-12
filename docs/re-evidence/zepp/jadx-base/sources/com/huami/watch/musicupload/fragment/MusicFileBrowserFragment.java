package com.huami.watch.musicupload.fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p010navigation.fragment.FragmentKt;
import aurelienribon.tweenengine.BaseTween;
import aurelienribon.tweenengine.TweenCallback;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.tools.log.HMLog;
import com.huami.watch.musicupload.DeviceStatus;
import com.huami.watch.musicupload.logic.MusicUploadStatistics;
import com.huami.watch.musicupload.viewmodel.DeviceStatusViewModel;
import com.huami.watch.musicupload.viewmodel.FileViewModel;
import com.huami.watch.musicupload.viewmodel.MusicFileBrowserViewModel;
import com.huami.watch.musicupload.viewmodel.MusicUploadViewModel;
import com.huami.watch.musicupload.viewmodel.WifiFtpViewModel;
import com.huami.watch.util.FlyAnimation;
import com.huami.watch.util.SingleClickListener;
import com.huami.watch.wififtp.R;
import com.loc.z;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 /2\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u000f\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001e\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\"\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b \u0010!R\u001d\u0010&\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b$\u0010%R\u001d\u0010)\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b\u0016\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010+¨\u00060"}, d2 = {"Lcom/huami/watch/musicupload/fragment/MusicFileBrowserFragment;", "Landroidx/fragment/app/Fragment;", "", "enableTransBtn", "enableUploadBtn", "", "h", "g", "i", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onActivityCreated", "onDestroy", "Lcom/huami/watch/musicupload/fragment/FileFragment;", "a", "Lcom/huami/watch/musicupload/fragment/FileFragment;", "fileBrowser", "Lcom/huami/watch/musicupload/viewmodel/FileViewModel;", "b", "Lkotlin/Lazy;", "c", "()Lcom/huami/watch/musicupload/viewmodel/FileViewModel;", "fileViewModel", "Lcom/huami/watch/musicupload/viewmodel/MusicUploadViewModel;", "e", "()Lcom/huami/watch/musicupload/viewmodel/MusicUploadViewModel;", "uploadViewModel", "Lcom/huami/watch/musicupload/viewmodel/MusicFileBrowserViewModel;", GoogleApiAvailabilityLight.a, "()Lcom/huami/watch/musicupload/viewmodel/MusicFileBrowserViewModel;", "musicViewModel", "Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel;", "f", "()Lcom/huami/watch/musicupload/viewmodel/WifiFtpViewModel;", "wifiFtpViewModel", "Lcom/huami/watch/musicupload/viewmodel/DeviceStatusViewModel;", "()Lcom/huami/watch/musicupload/viewmodel/DeviceStatusViewModel;", "deviceStatusViewModel", "Lcom/huami/watch/util/FlyAnimation;", "Lcom/huami/watch/util/FlyAnimation;", "uploadAnimation", "<init>", "()V", z.j, "wififtp_release"}, k = 1, mv = {1, 4, 1})
public final class MusicFileBrowserFragment extends Fragment {
    private static final String i = "MusicFileBrowserFragment";

    @NotNull
    private static final a j = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private FileFragment fileBrowser;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy fileViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy uploadViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy musicViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Lazy wifiFtpViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Lazy deviceStatusViewModel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private FlyAnimation uploadAnimation;
    private HashMap h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/watch/musicupload/fragment/MusicFileBrowserFragment$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wififtp_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "selectCount", "", "a", "(Ljava/lang/Integer;)V"}, k = 3, mv = {1, 4, 1})
    public static final class b<T> implements Observer<Integer> {
        public b() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(Integer num) {
            MusicFileBrowserFragment musicFileBrowserFragment = MusicFileBrowserFragment.this;
            musicFileBrowserFragment.h(musicFileBrowserFragment.e().haveTasks(), num.intValue() > 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/huami/watch/musicupload/DeviceStatus;", "kotlin.jvm.PlatformType", "status", "", "a", "(Lcom/huami/watch/musicupload/DeviceStatus;)V"}, k = 3, mv = {1, 4, 1})
    public static final class c<T> implements Observer<DeviceStatus> {
        public c() {
        }

        @Override // androidx.p008lifecycle.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onChanged(DeviceStatus deviceStatus) {
            if (deviceStatus != null) {
                if (deviceStatus == DeviceStatus.DisconnectedIdle) {
                    MusicFileBrowserFragment.this._$_findCachedViewById(R.id.back_fog_layer).setVisibility(8);
                    MusicFileBrowserFragment.this._$_findCachedViewById(R.id.fog_layer2).setVisibility(0);
                    MusicFileBrowserFragment.this._$_findCachedViewById(R.id.fog_layer1).setVisibility(0);
                } else if (deviceStatus == DeviceStatus.DisconnectedTransfer) {
                    MusicFileBrowserFragment.this._$_findCachedViewById(R.id.back_fog_layer).setVisibility(0);
                    MusicFileBrowserFragment.this._$_findCachedViewById(R.id.fog_layer2).setVisibility(0);
                    MusicFileBrowserFragment.this._$_findCachedViewById(R.id.fog_layer1).setVisibility(0);
                } else if (deviceStatus.isConnected()) {
                    MusicFileBrowserFragment.this._$_findCachedViewById(R.id.back_fog_layer).setVisibility(8);
                    MusicFileBrowserFragment.this._$_findCachedViewById(R.id.fog_layer2).setVisibility(8);
                    MusicFileBrowserFragment.this._$_findCachedViewById(R.id.fog_layer1).setVisibility(8);
                }
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
            ((TextView) MusicFileBrowserFragment.this._$_findCachedViewById(R.id.tv_desc)).setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MusicFileBrowserFragment.this.requireActivity().onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MusicUploadStatistics.INSTANCE.recordUploadBtnClick(MusicFileBrowserFragment.this.c().getSelected().size());
            if (MusicFileBrowserFragment.this.d().needShowConnectApWarning()) {
                MusicFileBrowserFragment.this.i();
            } else {
                MusicFileBrowserFragment.this.g();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0002\b\u0003 \u0003*\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "<anonymous parameter 0>", "Laurelienribon/tweenengine/BaseTween;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onEvent", "(ILaurelienribon/tweenengine/BaseTween;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class g implements TweenCallback {
        public g() {
        }

        @Override // aurelienribon.tweenengine.TweenCallback
        public final void onEvent(int i, BaseTween<?> baseTween) {
            FrameLayout frameLayout = (FrameLayout) MusicFileBrowserFragment.this._$_findCachedViewById(R.id.layout_transform_btn);
            if (frameLayout != null) {
                frameLayout.callOnClick();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "show connect ap warning";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "dialog", "", "which", "", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class i implements DialogInterface.OnClickListener {
        public final /* synthetic */ CheckBox b;

        public i(CheckBox checkBox) {
            this.b = checkBox;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            if (this.b.isChecked()) {
                MusicFileBrowserFragment.this.d().setNotShowConnectApWarning();
            }
            dialogInterface.dismiss();
            MusicFileBrowserFragment.this.g();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "dialog", "", "which", "", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class j implements DialogInterface.OnClickListener {
        public static final j a = new j();

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public MusicFileBrowserFragment() {
        super(R.layout.fragment_music_file_browser);
        this.fileViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(FileViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.watch.musicupload.fragment.MusicFileBrowserFragment$$special$$inlined$activityViewModels$1
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.watch.musicupload.fragment.MusicFileBrowserFragment$$special$$inlined$activityViewModels$2
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
        this.uploadViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MusicUploadViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.watch.musicupload.fragment.MusicFileBrowserFragment$$special$$inlined$activityViewModels$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.watch.musicupload.fragment.MusicFileBrowserFragment$$special$$inlined$activityViewModels$4
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
        this.musicViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(MusicFileBrowserViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.watch.musicupload.fragment.MusicFileBrowserFragment$$special$$inlined$activityViewModels$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.watch.musicupload.fragment.MusicFileBrowserFragment$$special$$inlined$activityViewModels$6
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
        this.wifiFtpViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(WifiFtpViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.watch.musicupload.fragment.MusicFileBrowserFragment$$special$$inlined$activityViewModels$7
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.watch.musicupload.fragment.MusicFileBrowserFragment$$special$$inlined$activityViewModels$8
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
        this.deviceStatusViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DeviceStatusViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.watch.musicupload.fragment.MusicFileBrowserFragment$$special$$inlined$activityViewModels$9
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.watch.musicupload.fragment.MusicFileBrowserFragment$$special$$inlined$activityViewModels$10
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

    private final DeviceStatusViewModel b() {
        return (DeviceStatusViewModel) this.deviceStatusViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FileViewModel c() {
        return (FileViewModel) this.fileViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MusicFileBrowserViewModel d() {
        return (MusicFileBrowserViewModel) this.musicViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MusicUploadViewModel e() {
        return (MusicUploadViewModel) this.uploadViewModel.getValue();
    }

    private final WifiFtpViewModel f() {
        return (WifiFtpViewModel) this.wifiFtpViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        FileFragment fileFragment = this.fileBrowser;
        List<View> selectedItemImageView = fileFragment != null ? fileFragment.getSelectedItemImageView() : null;
        FlyAnimation flyAnimation = this.uploadAnimation;
        if (flyAnimation != null) {
            flyAnimation.startAnimation(selectedItemImageView, _$_findCachedViewById(R.id.view_trans_point), (ImageView) _$_findCachedViewById(R.id.btn_trans), new g());
        }
        e().addUploadTasks(c().getSelected());
        c().resetSelected();
        _$_findCachedViewById(R.id.view_trans_point).setVisibility(0);
        WifiFtpViewModel.establishConnection$default(f(), requireActivity(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(boolean enableTransBtn, boolean enableUploadBtn) {
        ((FrameLayout) _$_findCachedViewById(R.id.layout_transform_btn)).setEnabled(enableTransBtn);
        ((ImageView) _$_findCachedViewById(R.id.btn_trans)).setEnabled(enableTransBtn);
        int i2 = R.id.btn_upload;
        ((TextView) _$_findCachedViewById(i2)).setEnabled(enableUploadBtn);
        ((TextView) _$_findCachedViewById(i2)).setAlpha(enableUploadBtn ? 1.0f : 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        HMLog.info(i, h.a);
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_ftp_connect_ap_warning, (ViewGroup) null);
        new AlertDialogFragment.Builder(requireContext()).setTitle(R.string.file_manager_connect_ap_warning_title).setContentView(viewInflate).setPositiveButton(R.string.btn_enter, new i((CheckBox) viewInflate.findViewById(R.id.chkbox_block))).setNegativeButton(R.string.btn_cancel, j.a).show(getChildFragmentManager(), "RecordConnectWifiDialog");
    }

    public void _$_clearFindViewByIdCache() {
        HashMap map = this.h;
        if (map != null) {
            map.clear();
        }
    }

    public View _$_findCachedViewById(int i2) {
        if (this.h == null) {
            this.h = new HashMap();
        }
        View view = (View) this.h.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i2);
        this.h.put(Integer.valueOf(i2), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.uploadAnimation = new FlyAnimation(requireActivity());
        c().getSelectFileCountLiveData().observe(getViewLifecycleOwner(), new b());
        b().getStatusLiveData().observe(getViewLifecycleOwner(), new c());
        e().getShowTransformAlertLiveData().observe(getViewLifecycleOwner(), new d());
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        e().haveTasks();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        FlyAnimation flyAnimation = this.uploadAnimation;
        if (flyAnimation != null) {
            flyAnimation.release();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(R.id.fragment_file_browser);
        if (!(fragmentFindFragmentById instanceof FileFragment)) {
            fragmentFindFragmentById = null;
        }
        this.fileBrowser = (FileFragment) fragmentFindFragmentById;
        ((ImageView) _$_findCachedViewById(R.id.iv_back)).setOnClickListener(new e());
        ((FrameLayout) _$_findCachedViewById(R.id.layout_transform_btn)).setOnClickListener(new SingleClickListener() { // from class: com.huami.watch.musicupload.fragment.MusicFileBrowserFragment.onViewCreated.2
            @Override // com.huami.watch.util.SingleClickListener
            public void performClick(@Nullable View v) {
                FragmentKt.findNavController(MusicFileBrowserFragment.this).navigate(R.id.to_upload_fragment);
            }
        });
        ((TextView) _$_findCachedViewById(R.id.btn_upload)).setOnClickListener(new f());
        h(e().haveTasks(), c().getSelectFileCount() > 0);
    }
}
