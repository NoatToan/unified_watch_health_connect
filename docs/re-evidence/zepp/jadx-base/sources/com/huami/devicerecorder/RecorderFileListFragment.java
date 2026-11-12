package com.huami.devicerecorder;

import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicerecorder.RecorderFileListFragment;
import com.huami.devicerecorder.adapter.IItemClickListener;
import com.huami.devicerecorder.adapter.RecorderFileAdapter;
import com.huami.devicerecorder.adapter.SpacingDecoration;
import com.huami.devicerecorder.model.PageMode;
import com.huami.devicerecorder.model.PlayItemData;
import com.huami.devicerecorder.model.RecorderStatistics;
import com.huami.devicerecorder.player.IRecorderPlayer;
import com.huami.devicerecorder.player.RecorderPlayerViewModel;
import com.huami.devicerecorder.viewmodel.RecorderFileListViewModel;
import com.huami.devicerecorder.viewmodel.RecorderSyncViewModel;
import com.huami.lib.view.widget.TipComponent;
import com.huami.tools.log.HMLog;
import com.huami.watch.musicupload.fragment.MusicConstant;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.Status;
import java.io.File;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ;2\u00020\u0001:\u0002; B\u0007¢\u0006\u0004\b9\u0010:J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J \u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\b\u0010\u0015\u001a\u00020\u0002H\u0002J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\b\u0010\u0017\u001a\u00020\u0002H\u0002J\u001a\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\u0012\u0010\u001e\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016R\u001d\u0010$\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010)\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R\u001d\u0010.\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010-R\u001d\u00103\u001a\u00020/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u00102R\u001d\u00108\u001a\u0002048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010!\u001a\u0004\b6\u00107¨\u0006<"}, d2 = {"Lcom/huami/devicerecorder/RecorderFileListFragment;", "Landroidx/fragment/app/Fragment;", "", com.google.android.exoplayer2.text.ttml.b.r, "", Status.PRE_CONNECT_STATE_CONNECTED, "x", "u", "m", "o", "t", "Lcom/huami/devicerecorder/model/PageMode;", "mode", "C", "Lcom/huami/devicerecorder/model/PlayItemData;", "itemData", "", "titleResId", "contentResId", "y", "B", LogUtil.D, "E", GoogleApiAvailabilityLight.b, "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onDestroyView", "onActivityCreated", "Lcom/huami/devicerecorder/viewmodel/RecorderFileListViewModel;", "a", "Lkotlin/Lazy;", hl.k, "()Lcom/huami/devicerecorder/viewmodel/RecorderFileListViewModel;", "recordListViewModel", "Lcom/huami/devicerecorder/viewmodel/RecorderSyncViewModel;", "b", "l", "()Lcom/huami/devicerecorder/viewmodel/RecorderSyncViewModel;", "syncViewModel", "Lcom/huami/devicerecorder/player/RecorderPlayerViewModel;", "c", z.j, "()Lcom/huami/devicerecorder/player/RecorderPlayerViewModel;", "playerViewModel", "Lcom/huami/devicerecorder/adapter/RecorderFileAdapter;", GoogleApiAvailabilityLight.a, "h", "()Lcom/huami/devicerecorder/adapter/RecorderFileAdapter;", "adapter", "Lcom/huami/devicerecorder/adapter/SpacingDecoration;", "e", "i", "()Lcom/huami/devicerecorder/adapter/SpacingDecoration;", "itemDecoration", "<init>", "()V", "Companion", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final class RecorderFileListFragment extends Fragment {

    @NotNull
    private static final String f = "RecorderFileListFragment";

    @NotNull
    private static final String g = "record_show_connect_wifi_warning";

    @NotNull
    private static final String h = "file_manager_configs";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy recordListViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy syncViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy playerViewModel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy itemDecoration;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PageMode.values().length];
            iArr[PageMode.Normal.ordinal()] = 1;
            iArr[PageMode.Transport.ordinal()] = 2;
            iArr[PageMode.DeviceUnConnect.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\"\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0014"}, d2 = {"com/huami/devicerecorder/RecorderFileListFragment$a", "Lcom/huami/devicerecorder/adapter/IItemClickListener;", "", "position", "Lcom/huami/devicerecorder/model/PlayItemData;", "itemData", "", "onShareClick", "onDeleteClick", "onPlayInvalidFile", "onPlayFileNotFound", "Lcom/huami/devicerecorder/player/IRecorderPlayer$IPlayerCallback;", "callback", "registerPlayerCallback", "unRegisterPlayerCallback", "", "select", "onSelected", "<init>", "(Lcom/huami/devicerecorder/RecorderFileListFragment;)V", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
    public final class a implements IItemClickListener {

        /* JADX INFO: renamed from: com.huami.devicerecorder.RecorderFileListFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0371a extends Lambda implements Function0<String> {
            public static final C0371a a = new C0371a();

            public C0371a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onDeleteClick record file is null";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onProgressChanged record file is null";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public static final c a = new c();

            public c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onShareClick record file is null";
            }
        }

        public a() {
        }

        @Override // com.huami.devicerecorder.adapter.IItemClickListener
        public void onDeleteClick(int position, @Nullable PlayItemData itemData) {
            if (itemData == null) {
                HMLog.info(RecorderFileListFragment.f, C0371a.a);
            } else {
                RecorderFileListFragment.this.y(itemData, R.string.delete_alert_title, R.string.delete_alert_content);
            }
        }

        @Override // com.huami.devicerecorder.adapter.IItemClickListener
        public void onPlayFileNotFound(int position, @NotNull PlayItemData itemData) {
            RecorderFileListFragment.this.y(itemData, R.string.invalid_record_file_title, R.string.record_file_broken);
        }

        @Override // com.huami.devicerecorder.adapter.IItemClickListener
        public void onPlayInvalidFile(int position, @NotNull PlayItemData itemData) {
            RecorderFileListFragment.this.y(itemData, R.string.invalid_record_file_title, R.string.record_file_broken);
        }

        @Override // com.huami.devicerecorder.adapter.IItemClickListener
        public void onSelected(int position, @Nullable PlayItemData itemData, boolean select) {
            if (itemData == null) {
                HMLog.info(RecorderFileListFragment.f, b.a);
            } else {
                RecorderFileListFragment.this.k().selectItem(itemData, select);
            }
        }

        @Override // com.huami.devicerecorder.adapter.IItemClickListener
        public void onShareClick(int position, @Nullable PlayItemData itemData) {
            if (itemData == null) {
                HMLog.info(RecorderFileListFragment.f, c.a);
                return;
            }
            String localPath = itemData.getRecordFile().getLocalPath();
            Uri fileUri = UriGetter.getFileUri(RecorderFileListFragment.this.requireContext(), UriGetter.ShareContentType.File, new File(localPath));
            Intent intent = new Intent();
            if (fileUri != null) {
                intent.putExtra("android.intent.extra.STREAM", fileUri);
                intent.setClipData(ClipData.newRawUri("", fileUri));
                intent.addFlags(1);
                intent.setType(RecorderFileListFragment.this.requireActivity().getContentResolver().getType(fileUri));
            } else {
                intent.putExtra("android.intent.extra.STREAM", localPath);
                intent.setType(UriGetter.ShareContentType.AUDIO);
            }
            intent.setAction("android.intent.action.SEND");
            RecorderFileListFragment.this.startActivity(Intent.createChooser(intent, ""));
        }

        @Override // com.huami.devicerecorder.adapter.IItemClickListener
        public void registerPlayerCallback(@NotNull IRecorderPlayer.IPlayerCallback callback) {
            RecorderFileListFragment.this.j().registerPlayerCallback(callback);
        }

        @Override // com.huami.devicerecorder.adapter.IItemClickListener
        public void unRegisterPlayerCallback(@NotNull IRecorderPlayer.IPlayerCallback callback) {
            RecorderFileListFragment.this.j().unRegisterPlayerCallback(callback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/devicerecorder/adapter/RecorderFileAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<RecorderFileAdapter> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecorderFileAdapter getA() {
            return new RecorderFileAdapter(null, 1, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/devicerecorder/adapter/SpacingDecoration;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<SpacingDecoration> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SpacingDecoration getA() {
            return new SpacingDecoration(0, 24, true);
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
            return "showConnectDeviceWifiDialog";
        }
    }

    public RecorderFileListFragment() {
        super(R.layout.fragment_recorder_list);
        this.recordListViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(RecorderFileListViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.devicerecorder.RecorderFileListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.devicerecorder.RecorderFileListFragment$special$$inlined$activityViewModels$default$2
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
        this.syncViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(RecorderSyncViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.devicerecorder.RecorderFileListFragment$special$$inlined$activityViewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.devicerecorder.RecorderFileListFragment$special$$inlined$activityViewModels$default$4
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
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.huami.devicerecorder.RecorderFileListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final Fragment getA() {
                return this;
            }
        };
        this.playerViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(RecorderPlayerViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.devicerecorder.RecorderFileListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final ViewModelStore getA() {
                return ((ViewModelStoreOwner) function0.getA()).getViewModelStore();
            }
        }, null);
        this.adapter = LazyKt__LazyJVMKt.lazy(b.a);
        this.itemDecoration = LazyKt__LazyJVMKt.lazy(c.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(RecorderFileListFragment recorderFileListFragment, PlayItemData playItemData, DialogInterface dialogInterface, int i) {
        recorderFileListFragment.k().deleteRecorderFile(playItemData);
        dialogInterface.dismiss();
    }

    private final void B() {
        x(false);
        View view = getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.tv_transport))).setText(R.string.transport_record_file);
        View view2 = getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.tv_transport))).setEnabled(false);
        View view3 = getView();
        ((LinearLayout) (view3 == null ? null : view3.findViewById(R.id.layout_transform))).setVisibility(8);
        View view4 = getView();
        ((LinearLayout) (view4 != null ? view4.findViewById(R.id.layout_device_status) : null)).setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(PageMode mode) {
        int i = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i == 1) {
            D();
        } else if (i == 2) {
            E();
            k().cacheSelected$device_recorder_release(true);
        } else if (i == 3) {
            B();
        }
        if (h().getMode() != mode) {
            h().setMode(mode);
            h().notifyDataSetChanged();
        }
    }

    private final void D() {
        x(true);
        View view = getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.tv_transport))).setText(R.string.transport_record_file);
        View view2 = getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.tv_transport))).setEnabled(true);
        View view3 = getView();
        ((LinearLayout) (view3 == null ? null : view3.findViewById(R.id.layout_transform))).setVisibility(8);
        View view4 = getView();
        ((LinearLayout) (view4 != null ? view4.findViewById(R.id.layout_device_status) : null)).setVisibility(8);
    }

    private final void E() {
        View view = getView();
        ((LinearLayout) (view == null ? null : view.findViewById(R.id.layout_transform))).setVisibility(0);
        View view2 = getView();
        ((LinearLayout) (view2 == null ? null : view2.findViewById(R.id.layout_device_status))).setVisibility(8);
        View view3 = getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.tv_transport))).setEnabled(true);
        View view4 = getView();
        ((TextView) (view4 != null ? view4.findViewById(R.id.tv_transport) : null)).setText(R.string.cancel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecorderFileAdapter h() {
        return (RecorderFileAdapter) this.adapter.getValue();
    }

    private final SpacingDecoration i() {
        return (SpacingDecoration) this.itemDecoration.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecorderPlayerViewModel j() {
        return (RecorderPlayerViewModel) this.playerViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecorderFileListViewModel k() {
        return (RecorderFileListViewModel) this.recordListViewModel.getValue();
    }

    private final RecorderSyncViewModel l() {
        return (RecorderSyncViewModel) this.syncViewModel.getValue();
    }

    private final void m() {
        k().cacheSelected$device_recorder_release(true);
        k().changeMode();
        l().showDownloadItems(k().getWantToSyncFile$device_recorder_release());
        FragmentKt.findNavController(this).navigate(R.id.to_sync_fragment);
    }

    private final void n() {
        View view = getView();
        ((RecyclerView) (view == null ? null : view.findViewById(R.id.rv_record_file_list))).setAdapter(h());
        h().setListener(new a());
        View view2 = getView();
        ((RecyclerView) (view2 != null ? view2.findViewById(R.id.rv_record_file_list) : null)).addItemDecoration(i());
    }

    private final boolean o() {
        Boolean boolValueOf;
        MusicConstant musicConstant = MusicConstant.INSTANCE;
        Context contextRequireContext = requireContext();
        Object obj = Boolean.TRUE;
        SharedPreferences sharedPreferences = contextRequireContext.getSharedPreferences("file_manager_configs", 0);
        if (obj instanceof String) {
            Object string = sharedPreferences.getString(g, (String) obj);
            Objects.requireNonNull(string, "null cannot be cast to non-null type kotlin.Boolean");
            boolValueOf = (Boolean) string;
        } else if (obj instanceof Integer) {
            boolValueOf = (Boolean) Integer.valueOf(sharedPreferences.getInt(g, ((Number) obj).intValue()));
        } else if (obj instanceof Long) {
            boolValueOf = (Boolean) Long.valueOf(sharedPreferences.getLong(g, ((Number) obj).longValue()));
        } else {
            boolValueOf = obj instanceof Float ? (Boolean) Float.valueOf(sharedPreferences.getFloat(g, ((Number) obj).floatValue())) : Boolean.valueOf(sharedPreferences.getBoolean(g, true));
        }
        return boolValueOf.booleanValue();
    }

    private final void p() {
        View view = getView();
        ((TextView) (view == null ? null : view.findViewById(R.id.tv_transport))).setOnClickListener(new View.OnClickListener() { // from class: y96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RecorderFileListFragment.q(this.a, view2);
            }
        });
        View view2 = getView();
        ((AppCompatImageView) (view2 == null ? null : view2.findViewById(R.id.btn_back))).setOnClickListener(new View.OnClickListener() { // from class: z96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                RecorderFileListFragment.r(this.a, view3);
            }
        });
        View view3 = getView();
        ((TextView) (view3 != null ? view3.findViewById(R.id.tv_transform) : null)).setOnClickListener(new View.OnClickListener() { // from class: x96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                RecorderFileListFragment.s(this.a, view4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(RecorderFileListFragment recorderFileListFragment, View view) {
        recorderFileListFragment.k().changeMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(RecorderFileListFragment recorderFileListFragment, View view) {
        recorderFileListFragment.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(RecorderFileListFragment recorderFileListFragment, View view) {
        RecorderStatistics.INSTANCE.recordDownloadBtnClick(recorderFileListFragment.k().getSelected().size());
        if (recorderFileListFragment.o()) {
            recorderFileListFragment.u();
        } else {
            recorderFileListFragment.m();
        }
    }

    private final void t() {
        MusicConstant musicConstant = MusicConstant.INSTANCE;
        Context contextRequireContext = requireContext();
        Object obj = Boolean.FALSE;
        SharedPreferences.Editor editorEdit = contextRequireContext.getSharedPreferences("file_manager_configs", 0).edit();
        if (obj instanceof String) {
            editorEdit.putString(g, (String) obj);
        } else {
            editorEdit.putBoolean(g, false);
        }
        editorEdit.apply();
    }

    private final void u() {
        HMLog.info(f, d.a);
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R.layout.fragment_connect_device_wifi_warning, (ViewGroup) null);
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.chkbox_block);
        new AlertDialogFragment.Builder(requireContext()).setTitle(R.string.file_manager_connect_ap_warning_title).setContentView(viewInflate).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: t96
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RecorderFileListFragment.v(checkBox, this, dialogInterface, i);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: v96
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RecorderFileListFragment.w(dialogInterface, i);
            }
        }).show(getChildFragmentManager(), "RecordConnectWifiDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(CheckBox checkBox, RecorderFileListFragment recorderFileListFragment, DialogInterface dialogInterface, int i) {
        if (checkBox.isChecked()) {
            recorderFileListFragment.t();
        }
        dialogInterface.dismiss();
        recorderFileListFragment.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    private final void x(boolean connected) {
        if (connected) {
            View view = getView();
            (view == null ? null : view.findViewById(R.id.fog_layer)).setVisibility(8);
            View view2 = getView();
            ((LinearLayout) (view2 == null ? null : view2.findViewById(R.id.layout_device_status))).setVisibility(8);
            View view3 = getView();
            ((TipComponent) (view3 != null ? view3.findViewById(R.id.tipview) : null)).stopLoading();
            return;
        }
        View view4 = getView();
        (view4 == null ? null : view4.findViewById(R.id.fog_layer)).setVisibility(0);
        View view5 = getView();
        ((LinearLayout) (view5 == null ? null : view5.findViewById(R.id.layout_device_status))).setVisibility(0);
        View view6 = getView();
        ((TipComponent) (view6 == null ? null : view6.findViewById(R.id.tipview))).clear();
        View view7 = getView();
        ((TipComponent) (view7 == null ? null : view7.findViewById(R.id.tipview))).setTitle(R.string.device_connecting);
        View view8 = getView();
        ((TipComponent) (view8 != null ? view8.findViewById(R.id.tipview) : null)).startLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(final PlayItemData itemData, int titleResId, int contentResId) {
        new AlertDialogFragment.Builder(requireContext()).setTitle(titleResId).setMessage(contentResId).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: w96
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RecorderFileListFragment.z(dialogInterface, i);
            }
        }).setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: u96
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RecorderFileListFragment.A(this.a, itemData, dialogInterface, i);
            }
        }).create().show(getFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        k().getPageModeLiveData().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.devicerecorder.RecorderFileListFragment$onActivityCreated$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                this.a.C((PageMode) t);
            }
        });
        k().getRecordFilesLiveData().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.devicerecorder.RecorderFileListFragment$onActivityCreated$$inlined$observe$2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                List<PlayItemData> list = (List) t;
                if (list != null && !list.isEmpty()) {
                    View view = this.a.getView();
                    ((TextView) (view == null ? null : view.findViewById(R.id.tv_transport))).setVisibility(0);
                    View view2 = this.a.getView();
                    ((RelativeLayout) (view2 == null ? null : view2.findViewById(R.id.layout_empty))).setVisibility(8);
                    View view3 = this.a.getView();
                    ((LinearLayout) (view3 != null ? view3.findViewById(R.id.layout_list) : null)).setVisibility(0);
                    this.a.h().setItems(list);
                    this.a.h().notifyDataSetChanged();
                    return;
                }
                View view4 = this.a.getView();
                ((RelativeLayout) (view4 == null ? null : view4.findViewById(R.id.layout_empty))).setVisibility(0);
                View view5 = this.a.getView();
                ((LinearLayout) (view5 == null ? null : view5.findViewById(R.id.layout_list))).setVisibility(8);
                View view6 = this.a.getView();
                ((TextView) (view6 != null ? view6.findViewById(R.id.tv_transport) : null)).setVisibility(8);
                if (this.a.h().getA() > 0) {
                    this.a.h().clear();
                    this.a.h().notifyDataSetChanged();
                }
            }
        });
        k().getSelectedCountLiveData().observe(getViewLifecycleOwner(), new Observer<T>() { // from class: com.huami.devicerecorder.RecorderFileListFragment$onActivityCreated$$inlined$observe$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Integer num = (Integer) t;
                View view = this.a.getView();
                ((LinearLayout) (view == null ? null : view.findViewById(R.id.layout_transform))).setEnabled(num.intValue() > 0);
                View view2 = this.a.getView();
                ((TextView) (view2 != null ? view2.findViewById(R.id.tv_transform) : null)).setEnabled(num.intValue() > 0);
            }
        });
        k().getRecorderFiles();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = getView();
        ((RecyclerView) (view == null ? null : view.findViewById(R.id.rv_record_file_list))).setAdapter(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        n();
        p();
    }
}
