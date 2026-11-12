package com.xiaomi.fitness.devicesettings.bluttooth.music;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.viewbinding.ViewBindingUtilKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicBean;
import com.xiaomi.fitness.devicesettings.bluttooth.music.data.AddSongList;
import com.xiaomi.fitness.devicesettings.bluttooth.music.ui.AddSongToListDialogAdapter;
import com.xiaomi.fitness.devicesettings.bluttooth.music.ui.MusicSettingsSongAdapter;
import com.xiaomi.fitness.devicesettings.bluttooth.music.ui.MusicSettingsSongListAdapter;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import defpackage.a4i;
import defpackage.av6;
import defpackage.clf;
import defpackage.dlf;
import defpackage.elf;
import defpackage.eui;
import defpackage.jni;
import defpackage.sl6;
import defpackage.sxo;
import defpackage.uwi;
import defpackage.wzi;
import defpackage.xc6;
import defpackage.zqi;
import defpackage.zwh;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 l2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001lB\u0007¢\u0006\u0004\bk\u0010\fJ!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J'\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\bH\u0002¢\u0006\u0004\b0\u0010\fJ\u0017\u00103\u001a\u00020\b2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\b2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u001d\u0010;\u001a\u00020\b2\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001809H\u0002¢\u0006\u0004\b;\u0010<J\u0019\u0010?\u001a\u00020\b2\b\u0010>\u001a\u0004\u0018\u00010=H\u0002¢\u0006\u0004\b?\u0010@J\u0019\u0010C\u001a\u00020\b2\b\u0010B\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\bH\u0002¢\u0006\u0004\bE\u0010\fJ\u0017\u0010F\u001a\u00020\b2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\bF\u0010+J\u0019\u0010I\u001a\u00020\b2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bI\u0010JJ!\u0010L\u001a\u00020\b2\u0006\u0010K\u001a\u00020\r2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\bH\u0014¢\u0006\u0004\bN\u0010\fJ\u0013\u0010O\u001a\u00020\b*\u00020\u0003H\u0016¢\u0006\u0004\bO\u0010PJ)\u0010U\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010R\u001a\u00020\u000f2\b\u0010T\u001a\u0004\u0018\u00010SH\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\bH\u0016¢\u0006\u0004\bW\u0010\fR\u0016\u0010X\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u001b\u0010b\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001b\u0010g\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010_\u001a\u0004\be\u0010fR\u0014\u0010j\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006m"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel;", "Lsl6;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;", "song", "", "isSuc", "", "handleWhenSongPushEnd", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;Z)V", "bindService", "()V", "Landroid/view/View;", "itemView", "", "position", "Lelf;", "songList", "showSongListSettingsWindow", "(Landroid/view/View;ILelf;)V", "onSongListRemove", "(ILelf;)V", "onSongListRename", "Lclf;", "showSongSettingsWindow", "(Landroid/view/View;ILclf;)V", "onRemoveSong", "(ILclf;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$AddSongToSongListResponse;", "addSongToSongListResponse", "handleAddSongToSongListResponse", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$AddSongToSongListResponse;)V", "addSongListResponse", "handleAddSongListResponse", "(Z)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$RemoveSongFromSongListResponse;", "songRemoveFromSongListResponse", "handleSongRemoveFromSongListResponse", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$RemoveSongFromSongListResponse;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$QuerySongListResponse;", "querySongListResponse", "handleSongListWithSongRemoved", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$QuerySongListResponse;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$SongListRemoveResponse;", "songListRemoveResponse", "handleSongListRemoveResult", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$SongListRemoveResponse;)V", "updateBaseView", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$SongListRenameResponse;", "songListRenameResponse", "handleSongListRenamed", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$SongListRenameResponse;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$SongRemoveResponse;", "songRemoveResponse", "onSongRemoved", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingsViewModel$SongRemoveResponse;)V", "", "songs", "updateSongs", "(Ljava/util/List;)V", "Ldlf;", "songSummary", "updateSongList", "(Ldlf;)V", "Lsxo;", "storageInfo", "updateDeviceStorageInfo", "(Lsxo;)V", "createSongList", "showAddSongListDialog", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "loadData", "bindView", "(Lsl6;)V", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", LifecycleConstantKt.ON_DESTROY, "isPushingMusic", "Z", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushState;", "musicPushState", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushState;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/MusicSettingsSongListAdapter;", "mMusicSettingsSongListAdapter$delegate", "Lkotlin/Lazy;", "getMMusicSettingsSongListAdapter", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/MusicSettingsSongListAdapter;", "mMusicSettingsSongListAdapter", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/MusicSettingsSongAdapter;", "mMusicSettingsSongAdapter$delegate", "getMMusicSettingsSongAdapter", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/MusicSettingsSongAdapter;", "mMusicSettingsSongAdapter", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMusicSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicSettingFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingFragment\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,793:1\n65#2,16:794\n93#2,3:810\n65#2,16:827\n93#2,3:843\n54#3,3:813\n24#3:816\n59#3,6:817\n1863#4,2:823\n1010#4,2:825\n*S KotlinDebug\n*F\n+ 1 MusicSettingFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSettingFragment\n*L\n266#1:794,16\n266#1:810,3\n678#1:827,16\n678#1:843,3\n372#1:813,3\n372#1:816\n372#1:817,6\n479#1:823,2\n566#1:825,2\n*E\n"})
public final class MusicSettingFragment extends BaseBindingFragment<MusicSettingsViewModel, sl6> {
    public static final int REQUEST_CODE_SONG_LIST_SETTINGS = 10086;

    @NotNull
    public static final String TAG = "MUSIC_SET";
    public static final int sRequestMusicPush = 10;
    private boolean isPushingMusic;

    @NotNull
    private MusicPushState musicPushState = new MusicPushState(new MusicSettingFragment$musicPushState$1(this, Looper.getMainLooper()));

    /* JADX INFO: renamed from: mMusicSettingsSongListAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mMusicSettingsSongListAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: lcg
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MusicSettingFragment.mMusicSettingsSongListAdapter_delegate$lambda$0(this.f24900a);
        }
    });

    /* JADX INFO: renamed from: mMusicSettingsSongAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mMusicSettingsSongAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mcg
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MusicSettingFragment.mMusicSettingsSongAdapter_delegate$lambda$6(this.f26008a);
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ MusicSettingsViewModel access$getMViewModel(MusicSettingFragment musicSettingFragment) {
        return (MusicSettingsViewModel) musicSettingFragment.getMViewModel();
    }

    private final void bindService() {
        MusicPushServiceContact.INSTANCE.bindConnectionService(new Function0() { // from class: ncg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MusicSettingFragment.bindService$lambda$1(this.f27779a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindService$lambda$1(MusicSettingFragment this$0) throws RemoteException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MusicPushServiceContact.INSTANCE.addMusicPushState(this$0.musicPushState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$22(MusicSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$23(View view) throws RemoteException {
        MusicPushServiceContact.INSTANCE.cancle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$24(MusicSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        xc6.d("MusicSettingFragment " + ((MusicSettingsViewModel) this$0.getMViewModel()).getSupportFormatLivaData().getValue());
        if (((MusicSettingsViewModel) this$0.getMViewModel()).getSupportFormatLivaData().getValue() == null) {
            ToastUtil.INSTANCE.showToast(wzi.common_hint_unkonwn_error);
        } else {
            if (this$0.isPushingMusic) {
                ToastUtil.INSTANCE.showToast(wzi.E5);
                return;
            }
            Intent intent = new Intent(this$0.requireActivity(), (Class<?>) MusicPushActivity.class);
            intent.putExtra(MusicPushActivity.sSupportType, ((MusicSettingsViewModel) this$0.getMViewModel()).getSupportFormatLivaData().getValue());
            this$0.startActivityForResult(intent, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$25(MusicSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        dlf value = ((MusicSettingsViewModel) this$0.getMViewModel()).getSongSummary().getValue();
        if (value == null || this$0.getMMusicSettingsSongListAdapter().getCurrentList().size() != value.e) {
            this$0.createSongList();
            return;
        }
        FragmentActivity mActivity = this$0.getMActivity();
        if (mActivity != null) {
            ToastExtKt.toastShort(mActivity, wzi.H5);
        }
    }

    private final void createSongList() {
        View viewInflate = getLayoutInflater().inflate(eui.d2, (ViewGroup) null);
        final CommonDialog commonDialogCreate = new CommonDialog.c("commonDialog").setDialogTitle(wzi.G5).setCustomView(viewInflate).setCanceledOnTouchOutside(true).create();
        final TextView textView = (TextView) viewInflate.findViewById(zqi.D6);
        TextView textView2 = (TextView) viewInflate.findViewById(zqi.H5);
        EditText editText = (EditText) viewInflate.findViewById(zqi.Z3);
        Intrinsics.checkNotNull(editText);
        editText.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingFragment$createSongList$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                TextView textView3 = textView;
                boolean z = false;
                if (s != null && s.length() == 0) {
                    z = true;
                }
                textView3.setEnabled(!z);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: pcg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicSettingFragment.createSongList$lambda$27(commonDialogCreate, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: qcg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicSettingFragment.createSongList$lambda$28(commonDialogCreate, this, view);
            }
        });
        commonDialogCreate.show(getParentFragmentManager(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createSongList$lambda$27(CommonDialog commonDialog, View view) {
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void createSongList$lambda$28(CommonDialog commonDialog, MusicSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(commonDialog);
        View rootView = ViewBindingUtilKt.getRootView(commonDialog, zqi.Z3);
        Intrinsics.checkNotNull(rootView, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) rootView;
        if (StringsKt__StringsKt.trim((CharSequence) editText.getText().toString()).toString().length() == 0) {
            return;
        }
        PageState.DefaultImpls.showLoading$default(this$0, null, 0, false, 5, null);
        ((MusicSettingsViewModel) this$0.getMViewModel()).addSongList(editText.getText().toString(), ((MusicSettingsViewModel) this$0.getMViewModel()).getSongListNewId(this$0.getMMusicSettingsSongListAdapter().getUpdateCurrentList()));
        commonDialog.dismiss();
    }

    private final MusicSettingsSongAdapter getMMusicSettingsSongAdapter() {
        return (MusicSettingsSongAdapter) this.mMusicSettingsSongAdapter.getValue();
    }

    private final MusicSettingsSongListAdapter getMMusicSettingsSongListAdapter() {
        return (MusicSettingsSongListAdapter) this.mMusicSettingsSongListAdapter.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleAddSongListResponse(boolean addSongListResponse) {
        if (addSongListResponse) {
            ((MusicSettingsViewModel) getMViewModel()).getSongList();
        } else {
            hideLoading();
        }
    }

    private final void handleAddSongToSongListResponse(MusicSettingsViewModel.AddSongToSongListResponse addSongToSongListResponse) {
        hideLoading();
        if (addSongToSongListResponse.isSuc()) {
            int size = getMMusicSettingsSongListAdapter().getUpdateCurrentList().size();
            for (int i = 0; i < size; i++) {
                if (getMMusicSettingsSongListAdapter().getUpdateCurrentList().get(i).c == addSongToSongListResponse.getAddSongListId()) {
                    getMMusicSettingsSongListAdapter().getUpdateCurrentList().get(i).e++;
                    getMMusicSettingsSongListAdapter().notifyItemChanged(i);
                }
            }
        }
    }

    private final void handleSongListRemoveResult(MusicSettingsViewModel.SongListRemoveResponse songListRemoveResponse) {
        if (songListRemoveResponse.isSuc()) {
            List<elf> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) getMMusicSettingsSongListAdapter().getUpdateCurrentList());
            mutableList.remove(songListRemoveResponse.getSongList());
            getMMusicSettingsSongListAdapter().updateCurrentList(mutableList);
        }
        updateBaseView();
        hideLoading();
    }

    private final void handleSongListRenamed(MusicSettingsViewModel.SongListRenameResponse songListRenameResponse) {
        if (songListRenameResponse.isSuc()) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(CollectionsKt___CollectionsKt.toMutableList((Collection) getMMusicSettingsSongListAdapter().getUpdateCurrentList()));
            Logger.d("MUSIC_SET", "old name = " + arrayList.get(0).d);
            elf elfVar = arrayList.get(songListRenameResponse.getPosition());
            elfVar.d = songListRenameResponse.getName();
            arrayList.set(songListRenameResponse.getPosition(), elfVar);
            Logger.d("MUSIC_SET", "new name = " + arrayList.get(songListRenameResponse.getPosition()).d);
            getMMusicSettingsSongListAdapter().updateCurrentList(arrayList);
            getMMusicSettingsSongListAdapter().notifyItemChanged(songListRenameResponse.getPosition());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void handleSongListWithSongRemoved(MusicSettingsViewModel.QuerySongListResponse querySongListResponse) {
        for (AddSongList addSongList : querySongListResponse.getAddSongLists()) {
            if (addSongList.getStatus() == 2) {
                ((MusicSettingsViewModel) getMViewModel()).removeSongFromSongList(querySongListResponse.getSong(), addSongList.getSongList());
            }
        }
    }

    private final void handleSongRemoveFromSongListResponse(MusicSettingsViewModel.RemoveSongFromSongListResponse songRemoveFromSongListResponse) {
        if (songRemoveFromSongListResponse.isSuc()) {
            Logger.d("MUSIC_SET", "handleSongRemoveFromSongListResponse");
            int size = getMMusicSettingsSongListAdapter().getUpdateCurrentList().size();
            for (int i = 0; i < size; i++) {
                if (getMMusicSettingsSongListAdapter().getUpdateCurrentList().get(i).c == songRemoveFromSongListResponse.getSongList().c) {
                    getMMusicSettingsSongListAdapter().getUpdateCurrentList().get(i).e--;
                    getMMusicSettingsSongListAdapter().notifyItemChanged(i);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void handleWhenSongPushEnd(MusicBean song, boolean isSuc) {
        ((MusicSettingsViewModel) getMViewModel()).getCurrentSongList().clear();
        ((MusicSettingsViewModel) getMViewModel()).getSongs();
        ((MusicSettingsViewModel) getMViewModel()).getDeviceStorageInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MusicSettingsSongAdapter mMusicSettingsSongAdapter_delegate$lambda$6(final MusicSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new MusicSettingsSongAdapter(new Function3<View, Integer, clf, Unit>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingFragment$mMusicSettingsSongAdapter$2$1
            public void invoke(View itemView, int position, clf song) {
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                Intrinsics.checkNotNullParameter(song, "song");
                this.this$0.showSongSettingsWindow(itemView, position, song);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(View view, Integer num, clf clfVar) {
                invoke(view, num.intValue(), clfVar);
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MusicSettingsSongListAdapter mMusicSettingsSongListAdapter_delegate$lambda$0(final MusicSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new MusicSettingsSongListAdapter(new Function3<View, Integer, elf, Unit>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingFragment$mMusicSettingsSongListAdapter$2$1
            public void invoke(View itemView, int position, elf songList) {
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                Intrinsics.checkNotNullParameter(songList, "songList");
                this.this$0.showSongListSettingsWindow(itemView, position, songList);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(View view, Integer num, elf elfVar) {
                invoke(view, num.intValue(), elfVar);
                return Unit.INSTANCE;
            }
        }, new Function3<View, Integer, elf, Unit>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingFragment$mMusicSettingsSongListAdapter$2$2
            public void invoke(View p1, int position, elf songList) {
                Intrinsics.checkNotNullParameter(p1, "p1");
                Intrinsics.checkNotNullParameter(songList, "songList");
                Bundle bundle = new Bundle();
                bundle.putString(MusicSongListSettingFragment.SONG_LIST_NAME, songList.d);
                bundle.putInt(MusicSongListSettingFragment.SONG_LIST_ID, songList.c);
                bundle.putInt(MusicSongListSettingFragment.SONG_LIST_POSITION, position);
                BaseFragmentExKt.gotoPageForResult(this.this$0, (Class<?>) MusicSongListSettingFragment.class, bundle, MusicSettingFragment.REQUEST_CODE_SONG_LIST_SETTINGS);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(View view, Integer num, elf elfVar) {
                invoke(view, num.intValue(), elfVar);
                return Unit.INSTANCE;
            }
        });
    }

    private final void onRemoveSong(final int position, final clf song) {
        new CommonDialog.c("commonDialog").setDialogTitle(wzi.o7).setDialogDescriptionString(new DialogParams.DialogDescriptionString(getString(wzi.p7, song.d))).setNegativeText(wzi.e).setPositiveText(wzi.g).setCanceledOnTouchOutside(true).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingFragment.onRemoveSong.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    MusicSettingFragment.access$getMViewModel(MusicSettingFragment.this).removeSong(position, song);
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }
        }).show(getParentFragmentManager(), "");
    }

    private final void onSongListRemove(final int position, final elf songList) {
        new CommonDialog.c("commonDialog").setDialogTitle(wzi.o7).setDialogDescriptionString(new DialogParams.DialogDescriptionString(getString(wzi.n7, songList.d))).setNegativeText(wzi.e).setPositiveText(wzi.g).setCanceledOnTouchOutside(true).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingFragment.onSongListRemove.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } else {
                    if (which != -1) {
                        return;
                    }
                    PageState.DefaultImpls.showLoading$default(MusicSettingFragment.this, null, 0, false, 5, null);
                    MusicSettingFragment.access$getMViewModel(MusicSettingFragment.this).onSongListRemove(position, songList);
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }
        }).show(getParentFragmentManager(), "");
    }

    private final void onSongListRename(final int position, final elf songList) {
        View viewInflate = getLayoutInflater().inflate(eui.d2, (ViewGroup) null);
        final TextView textView = (TextView) viewInflate.findViewById(zqi.D6);
        TextView textView2 = (TextView) viewInflate.findViewById(zqi.H5);
        EditText editText = (EditText) viewInflate.findViewById(zqi.Z3);
        final CommonDialog commonDialogCreate = new CommonDialog.c("commonDialog").setDialogTitle(wzi.I5).setCustomView(viewInflate).setCanceledOnTouchOutside(true).create();
        Intrinsics.checkNotNull(editText);
        editText.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingFragment$onSongListRename$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                TextView textView3 = textView;
                boolean z = false;
                if (s != null && s.length() == 0) {
                    z = true;
                }
                textView3.setEnabled(!z);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() { // from class: vbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicSettingFragment.onSongListRename$lambda$4(commonDialogCreate, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: gcg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicSettingFragment.onSongListRename$lambda$5(commonDialogCreate, this, position, songList, view);
            }
        });
        commonDialogCreate.show(getParentFragmentManager(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSongListRename$lambda$4(CommonDialog commonDialog, View view) {
        if (commonDialog != null) {
            commonDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onSongListRename$lambda$5(CommonDialog commonDialog, MusicSettingFragment this$0, int i, elf songList, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(songList, "$songList");
        Intrinsics.checkNotNull(commonDialog);
        View rootView = ViewBindingUtilKt.getRootView(commonDialog, zqi.Z3);
        Intrinsics.checkNotNull(rootView, "null cannot be cast to non-null type android.widget.EditText");
        EditText editText = (EditText) rootView;
        if (StringsKt__StringsKt.trim((CharSequence) editText.getText().toString()).toString().length() == 0) {
            return;
        }
        ((MusicSettingsViewModel) this$0.getMViewModel()).onSongListRename(editText.getText().toString(), i, songList);
        commonDialog.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onSongRemoved(MusicSettingsViewModel.SongRemoveResponse songRemoveResponse) {
        List<clf> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) getMMusicSettingsSongAdapter().getUpdateCurrentList());
        Logger.d("MUSIC_SET", "onSongRemoved before size = " + mutableList.size());
        if (songRemoveResponse.isSuc()) {
            ((MusicSettingsViewModel) getMViewModel()).getDeviceStorageInfo();
            mutableList.remove(songRemoveResponse.getSong());
            if (!getMMusicSettingsSongListAdapter().getUpdateCurrentList().isEmpty()) {
                loadData();
            }
        }
        getMMusicSettingsSongAdapter().updateCurrentList(mutableList);
        updateBaseView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$10(MusicSettingFragment this$0, sxo sxoVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateDeviceStorageInfo(sxoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$11(MusicSettingFragment this$0, dlf dlfVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updateSongList(dlfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$12(MusicSettingFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(list);
        this$0.updateSongs(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$13(MusicSettingFragment this$0, MusicSettingsViewModel.SongListRenameResponse songListRenameResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(songListRenameResponse);
        this$0.handleSongListRenamed(songListRenameResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$14(MusicSettingFragment this$0, MusicSettingsViewModel.SongRemoveResponse songRemoveResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(songRemoveResponse);
        this$0.onSongRemoved(songRemoveResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$15(MusicSettingFragment this$0, MusicSettingsViewModel.QuerySongListResponse querySongListResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (querySongListResponse.isSuc()) {
            if (querySongListResponse.isRemove()) {
                Intrinsics.checkNotNull(querySongListResponse);
                this$0.handleSongListWithSongRemoved(querySongListResponse);
            } else {
                Intrinsics.checkNotNull(querySongListResponse);
                this$0.showAddSongListDialog(querySongListResponse);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$16(MusicSettingFragment this$0, MusicSettingsViewModel.AddSongToSongListResponse addSongToSongListResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(addSongToSongListResponse);
        this$0.handleAddSongToSongListResponse(addSongToSongListResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$17(MusicSettingFragment this$0, MusicSettingsViewModel.SongListRemoveResponse songListRemoveResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(songListRemoveResponse);
        this$0.handleSongListRemoveResult(songListRemoveResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$18(MusicSettingFragment this$0, MusicSettingsViewModel.RemoveSongFromSongListResponse removeSongFromSongListResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(removeSongFromSongListResponse);
        this$0.handleSongRemoveFromSongListResponse(removeSongFromSongListResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$19(MusicSettingFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(bool);
        this$0.handleAddSongListResponse(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$9(MusicSettingFragment this$0, Boolean bool) {
        FragmentActivity mActivity;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue() || (mActivity = this$0.getMActivity()) == null) {
            return;
        }
        ToastExtKt.toastShort(mActivity, wzi.Ra);
    }

    private final void showAddSongListDialog(final MusicSettingsViewModel.QuerySongListResponse querySongListResponse) {
        View viewInflate = getLayoutInflater().inflate(eui.F1, (ViewGroup) null);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(zqi.W1);
        final AddSongToListDialogAdapter addSongToListDialogAdapter = new AddSongToListDialogAdapter(new Function3<View, Integer, AddSongList, Unit>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingFragment$showAddSongListDialog$mAddSongToListDialogAdapter$1
            public void invoke(View itemView, int position, AddSongList addSongList) {
                Intrinsics.checkNotNullParameter(itemView, "itemView");
                Intrinsics.checkNotNullParameter(addSongList, "addSongList");
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(View view, Integer num, AddSongList addSongList) {
                invoke(view, num.intValue(), addSongList);
                return Unit.INSTANCE;
            }
        });
        recyclerView.setAdapter(addSongToListDialogAdapter);
        addSongToListDialogAdapter.submitList(querySongListResponse.getAddSongLists());
        new CommonDialog.c("commonDialog").setDialogTitle(wzi.C5).setCustomView(viewInflate).setNegativeText(wzi.e).setPositiveText(wzi.g).setCanceledOnTouchOutside(true).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingFragment.showAddSongListDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which == -2) {
                    if (dialog != null) {
                        dialog.dismiss();
                        return;
                    }
                    return;
                }
                if (which != -1) {
                    return;
                }
                PageState.DefaultImpls.showLoading$default(MusicSettingFragment.this, null, 0, false, 5, null);
                List<AddSongList> currentList = addSongToListDialogAdapter.getCurrentList();
                Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
                int i = 0;
                for (AddSongList addSongList : currentList) {
                    if (addSongList.getStatus() == 1) {
                        i = addSongList.getSongList().c;
                    }
                }
                MusicSettingFragment.access$getMViewModel(MusicSettingFragment.this).addSongToSongList(querySongListResponse.getSong(), i);
                if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).show(getParentFragmentManager(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSongListSettingsWindow(View itemView, final int position, final elf songList) {
        a4i a4iVar = new a4i(requireContext(), itemView);
        a4iVar.f(uwi.c);
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: ocg
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return MusicSettingFragment.showSongListSettingsWindow$lambda$2(songList, this, position, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showSongListSettingsWindow$lambda$2(elf songList, MusicSettingFragment this$0, int i, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(songList, "$songList");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == zqi.d5) {
            Bundle bundle = new Bundle();
            bundle.putInt(MusicSongListSettingFragment.SONG_LIST_ID, songList.c);
            bundle.putString(MusicSongListSettingFragment.SONG_LIST_NAME, songList.d);
            BaseFragmentExKt.gotoPageForResult(this$0, (Class<?>) AddSongToListFragment.class, bundle, MusicSongListSettingFragment.REQUEST_CODE_ADD_SONG);
            return true;
        }
        if (itemId == zqi.f5) {
            this$0.onSongListRename(i, songList);
            return true;
        }
        if (itemId != zqi.e5) {
            return true;
        }
        this$0.onSongListRemove(i, songList);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSongSettingsWindow(View itemView, final int position, final clf song) {
        a4i a4iVar = new a4i(requireContext(), itemView);
        a4iVar.f(uwi.f36225a);
        a4iVar.d().findItem(zqi.g5).setVisible(!getMMusicSettingsSongListAdapter().getUpdateCurrentList().isEmpty());
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: ybg
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return MusicSettingFragment.showSongSettingsWindow$lambda$7(this.f40015a, song, position, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean showSongSettingsWindow$lambda$7(MusicSettingFragment this$0, clf song, int i, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(song, "$song");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == zqi.g5) {
            ((MusicSettingsViewModel) this$0.getMViewModel()).getAddSongList().clear();
            if (!this$0.getMMusicSettingsSongListAdapter().getUpdateCurrentList().isEmpty()) {
                ((MusicSettingsViewModel) this$0.getMViewModel()).querySongList(false, song, this$0.getMMusicSettingsSongListAdapter().getUpdateCurrentList());
            }
        } else if (itemId == zqi.h5) {
            this$0.onRemoveSong(i, song);
        }
        return true;
    }

    private final void updateBaseView() {
        if (getMMusicSettingsSongListAdapter().getUpdateCurrentList().isEmpty() && getMMusicSettingsSongAdapter().getUpdateCurrentList().isEmpty()) {
            LinearLayoutCompat contentView = getMBinding().C;
            Intrinsics.checkNotNullExpressionValue(contentView, "contentView");
            ExtUtilsKt.setVisible(contentView, false);
            ConstraintLayout emptyView = getMBinding().I;
            Intrinsics.checkNotNullExpressionValue(emptyView, "emptyView");
            ExtUtilsKt.setVisible(emptyView, true);
            return;
        }
        LinearLayoutCompat contentView2 = getMBinding().C;
        Intrinsics.checkNotNullExpressionValue(contentView2, "contentView");
        ExtUtilsKt.setVisible(contentView2, true);
        ConstraintLayout emptyView2 = getMBinding().I;
        Intrinsics.checkNotNullExpressionValue(emptyView2, "emptyView");
        ExtUtilsKt.setVisible(emptyView2, false);
        if (getMMusicSettingsSongListAdapter().getUpdateCurrentList().isEmpty()) {
            AppCompatTextView deviceSettingsMusicSettingsMySongList = getMBinding().F;
            Intrinsics.checkNotNullExpressionValue(deviceSettingsMusicSettingsMySongList, "deviceSettingsMusicSettingsMySongList");
            ExtUtilsKt.setVisible(deviceSettingsMusicSettingsMySongList, false);
            RecyclerView songListRv = getMBinding().W;
            Intrinsics.checkNotNullExpressionValue(songListRv, "songListRv");
            ExtUtilsKt.setVisible(songListRv, false);
            return;
        }
        if (getMMusicSettingsSongAdapter().getUpdateCurrentList().isEmpty()) {
            AppCompatTextView deviceSettingsMusicSettingsMySong = getMBinding().E;
            Intrinsics.checkNotNullExpressionValue(deviceSettingsMusicSettingsMySong, "deviceSettingsMusicSettingsMySong");
            ExtUtilsKt.setVisible(deviceSettingsMusicSettingsMySong, false);
            RecyclerView songRv = getMBinding().X;
            Intrinsics.checkNotNullExpressionValue(songRv, "songRv");
            ExtUtilsKt.setVisible(songRv, false);
            return;
        }
        AppCompatTextView deviceSettingsMusicSettingsMySongList2 = getMBinding().F;
        Intrinsics.checkNotNullExpressionValue(deviceSettingsMusicSettingsMySongList2, "deviceSettingsMusicSettingsMySongList");
        ExtUtilsKt.setVisible(deviceSettingsMusicSettingsMySongList2, true);
        RecyclerView songListRv2 = getMBinding().W;
        Intrinsics.checkNotNullExpressionValue(songListRv2, "songListRv");
        ExtUtilsKt.setVisible(songListRv2, true);
        AppCompatTextView deviceSettingsMusicSettingsMySong2 = getMBinding().E;
        Intrinsics.checkNotNullExpressionValue(deviceSettingsMusicSettingsMySong2, "deviceSettingsMusicSettingsMySong");
        ExtUtilsKt.setVisible(deviceSettingsMusicSettingsMySong2, true);
        RecyclerView songRv2 = getMBinding().X;
        Intrinsics.checkNotNullExpressionValue(songRv2, "songRv");
        ExtUtilsKt.setVisible(songRv2, true);
    }

    private final void updateDeviceStorageInfo(sxo storageInfo) {
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        decimalFormat.setRoundingMode(RoundingMode.FLOOR);
        if (storageInfo == null) {
            getMBinding().G.setText(getString(wzi.k9, "0 MB / 0 MB"));
            getMBinding().L.setProgress(0);
            return;
        }
        long j = storageInfo.c;
        long j2 = EventRecurrence.TH;
        String str = decimalFormat.format(j / j2);
        String str2 = decimalFormat.format(storageInfo.d / j2);
        getMBinding().G.setText(getString(wzi.k9, str + " MB / " + str2 + " MB"));
        long j3 = (storageInfo.c / storageInfo.d) * ((long) 100);
        StringBuilder sb = new StringBuilder();
        sb.append("mediaMusicSettingsDeviceStorageProgress = ");
        sb.append(j3);
        Logger.d("MUSIC_SET", sb.toString());
        getMBinding().L.setProgress((int) (((storageInfo.c * 1.0d) / storageInfo.d) * ((double) 100)));
    }

    private final void updateSongList(dlf songSummary) {
        if (songSummary != null) {
            ArrayList arrayList = new ArrayList();
            elf[] list = songSummary.f;
            Intrinsics.checkNotNullExpressionValue(list, "list");
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, list);
            getMMusicSettingsSongListAdapter().updateCurrentList(arrayList);
        }
        updateBaseView();
        hideLoading();
    }

    private final void updateSongs(List<clf> songs) {
        Logger.d("MUSIC_SET", "update songs size = " + songs.size());
        if (songs.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(songs, new Comparator() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingFragment$updateSongs$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(zwh.d(((clf) t).d), zwh.d(((clf) t2).d));
                }
            });
        }
        getMMusicSettingsSongAdapter().updateCurrentList(songs);
        updateBaseView();
        hideLoading();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull sl6 sl6Var) {
        Intrinsics.checkNotNullParameter(sl6Var, "<this>");
        sl6Var.W.setAdapter(getMMusicSettingsSongListAdapter());
        sl6Var.X.setAdapter(getMMusicSettingsSongAdapter());
        sl6Var.A.setOnClickListener(new View.OnClickListener() { // from class: rcg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicSettingFragment.bindView$lambda$22(this.f32409a, view);
            }
        });
        sl6Var.B.setOnClickListener(new View.OnClickListener() { // from class: scg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws RemoteException {
                MusicSettingFragment.bindView$lambda$23(view);
            }
        });
        sl6Var.P.setContentDescription(getString(wzi.o6));
        sl6Var.P.setOnClickListener(new View.OnClickListener() { // from class: wbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicSettingFragment.bindView$lambda$24(this.f37807a, view);
            }
        });
        sl6Var.O.setContentDescription(getString(wzi.G5));
        sl6Var.O.setOnClickListener(new View.OnClickListener() { // from class: xbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicSettingFragment.bindView$lambda$25(this.f38943a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.H1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void loadData() {
        super.loadData();
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
        ((MusicSettingsViewModel) getMViewModel()).getDeviceStorageInfo();
        ((MusicSettingsViewModel) getMViewModel()).getSongList();
        ((MusicSettingsViewModel) getMViewModel()).getSongs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 10) {
            if (requestCode != 10086) {
                if (requestCode == 89757 && resultCode == -1) {
                    ((MusicSettingsViewModel) getMViewModel()).getSongList();
                    return;
                }
                return;
            }
            if (resultCode != -1 || data == null) {
                return;
            }
            String stringExtra = data.getStringExtra("action");
            if (!Intrinsics.areEqual(stringExtra, MusicSongListSettingFragment.ACTION_REMOVE)) {
                if (Intrinsics.areEqual(stringExtra, MusicSongListSettingFragment.ACTION_UPDATE)) {
                    ((MusicSettingsViewModel) getMViewModel()).getSongList();
                    return;
                }
                return;
            }
            int intExtra = data.getIntExtra(MusicSongListSettingFragment.SONG_LIST_POSITION, -1);
            data.getIntExtra(MusicSongListSettingFragment.SONG_LIST_ID, -1);
            List<elf> currentList = getMMusicSettingsSongListAdapter().getCurrentList();
            Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
            List<elf> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) currentList);
            mutableList.remove(intExtra);
            getMMusicSettingsSongListAdapter().updateCurrentList(mutableList);
        }
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindService();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() throws RemoteException {
        super.onDestroy();
        MusicPushServiceContact.INSTANCE.removeMusicPushHandler(this.musicPushState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        WearableDeviceModel mDeviceModel = ((MusicSettingsViewModel) getMViewModel()).getMDeviceModel();
        if (mDeviceModel == null || !mDeviceModel.getIsDeviceConnected()) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, wzi.u);
                return;
            }
            return;
        }
        setActionBarDisplayable(false);
        WearableDeviceModel mDeviceModel2 = ((MusicSettingsViewModel) getMViewModel()).getMDeviceModel();
        String bigIcon = mDeviceModel2 != null ? com.xiaomi.fitness.device.manager.DeviceModelExtKt.getBigIcon(mDeviceModel2) : null;
        AppCompatImageView deviceIcon = getMBinding().D;
        Intrinsics.checkNotNullExpressionValue(deviceIcon, "deviceIcon");
        ImageLoader imageLoader = Coil.imageLoader(deviceIcon.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(deviceIcon.getContext()).data(bigIcon).target(deviceIcon);
        WearableDeviceModel mDeviceModel3 = ((MusicSettingsViewModel) getMViewModel()).getMDeviceModel();
        Intrinsics.checkNotNull(mDeviceModel3);
        builderTarget.placeholder(com.xiaomi.fitness.device.manager.DeviceModelExtKt.isBandType(mDeviceModel3) ? jni.g1 : jni.h1);
        imageLoader.enqueue(builderTarget.build());
        ((MusicSettingsViewModel) getMViewModel()).isSupport().observe(getViewLifecycleOwner(), new Observer() { // from class: zbg
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MusicSettingFragment.onViewCreated$lambda$9(this.f41096a, (Boolean) obj);
            }
        });
        ((MusicSettingsViewModel) getMViewModel()).getStorageInfo().observe(getViewLifecycleOwner(), new Observer() { // from class: bcg
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MusicSettingFragment.onViewCreated$lambda$10(this.f4056a, (sxo) obj);
            }
        });
        ((MusicSettingsViewModel) getMViewModel()).getSongSummary().observe(getViewLifecycleOwner(), new Observer() { // from class: ccg
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MusicSettingFragment.onViewCreated$lambda$11(this.f5183a, (dlf) obj);
            }
        });
        ((MusicSettingsViewModel) getMViewModel()).getSongsLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: dcg
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MusicSettingFragment.onViewCreated$lambda$12(this.f15367a, (List) obj);
            }
        });
        ((MusicSettingsViewModel) getMViewModel()).getSongListRenameResponse().observe(getViewLifecycleOwner(), new Observer() { // from class: ecg
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MusicSettingFragment.onViewCreated$lambda$13(this.f16493a, (MusicSettingsViewModel.SongListRenameResponse) obj);
            }
        });
        ((MusicSettingsViewModel) getMViewModel()).getSongRemoveResponse().observe(getViewLifecycleOwner(), new Observer() { // from class: fcg
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MusicSettingFragment.onViewCreated$lambda$14(this.f17650a, (MusicSettingsViewModel.SongRemoveResponse) obj);
            }
        });
        ((MusicSettingsViewModel) getMViewModel()).getQuerySongListResponse().observe(getViewLifecycleOwner(), new Observer() { // from class: hcg
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MusicSettingFragment.onViewCreated$lambda$15(this.f19932a, (MusicSettingsViewModel.QuerySongListResponse) obj);
            }
        });
        ((MusicSettingsViewModel) getMViewModel()).getAddSongToSongListResponse().observe(getViewLifecycleOwner(), new Observer() { // from class: icg
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MusicSettingFragment.onViewCreated$lambda$16(this.f20995a, (MusicSettingsViewModel.AddSongToSongListResponse) obj);
            }
        });
        ((MusicSettingsViewModel) getMViewModel()).getSongListRemoveResponse().observe(getViewLifecycleOwner(), new Observer() { // from class: jcg
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MusicSettingFragment.onViewCreated$lambda$17(this.f22647a, (MusicSettingsViewModel.SongListRemoveResponse) obj);
            }
        });
        ((MusicSettingsViewModel) getMViewModel()).getSongRemoveFromSongListResponse().observe(getViewLifecycleOwner(), new Observer() { // from class: kcg
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MusicSettingFragment.onViewCreated$lambda$18(this.f23716a, (MusicSettingsViewModel.RemoveSongFromSongListResponse) obj);
            }
        });
        ((MusicSettingsViewModel) getMViewModel()).getAddSongListResponse().observe(getViewLifecycleOwner(), new Observer() { // from class: acg
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MusicSettingFragment.onViewCreated$lambda$19(this.f877a, (Boolean) obj);
            }
        });
    }
}
