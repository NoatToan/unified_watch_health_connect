package com.xiaomi.fitness.devicesettings.bluttooth.music;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingsViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.music.ui.MusicSettingsSongAdapter;
import defpackage.a4i;
import defpackage.am6;
import defpackage.av6;
import defpackage.clf;
import defpackage.eui;
import defpackage.uwi;
import defpackage.wzi;
import defpackage.zqi;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00014B\u0007¢\u0006\u0004\b3\u0010\nJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001e\u0010\nJ\u0013\u0010\u001f\u001a\u00020\u0006*\u00020\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010+\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010/\u001a\u0004\u0018\u00010,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSongListSettingFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSongListSettingsViewModel;", "Lam6;", "", "songListRemoveSuc", "", "handleSongListRemoveResponse", "(Z)V", "showSongListRemoveDialog", "()V", "Landroid/view/View;", "itemView", "", "position", "Lclf;", "song", "showSongSettingsWindow", "(Landroid/view/View;ILclf;)V", "onRemoveSong", "(ILclf;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSongListSettingsViewModel$SongRemoveResponse;", "songRemoveResponse", "onSongRemoved", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSongListSettingsViewModel$SongRemoveResponse;)V", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onVisible", "bindView", "(Lam6;)V", "onBackPressed", "()Z", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/MusicSettingsSongAdapter;", "mMusicSettingsSongAdapter$delegate", "Lkotlin/Lazy;", "getMMusicSettingsSongAdapter", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/MusicSettingsSongAdapter;", "mMusicSettingsSongAdapter", "getSongListID", "()Ljava/lang/Integer;", "songListID", "", "getSongListName", "()Ljava/lang/String;", "songListName", "getLayoutId", "()I", "layoutId", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MusicSongListSettingFragment extends BaseBindingFragment<MusicSongListSettingsViewModel, am6> {

    @NotNull
    public static final String ACTION = "action";

    @NotNull
    public static final String ACTION_REMOVE = "action_remove";

    @NotNull
    public static final String ACTION_UPDATE = "action_update";
    public static final int REQUEST_CODE_ADD_SONG = 89757;

    @NotNull
    public static final String SONG_LIST_ID = "song_list_id";

    @NotNull
    public static final String SONG_LIST_NAME = "song_list_name";

    @NotNull
    public static final String SONG_LIST_POSITION = "song_list_position";

    @NotNull
    public static final String TAG = "MUSIC_SET";

    /* JADX INFO: renamed from: mMusicSettingsSongAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mMusicSettingsSongAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: cdg
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MusicSongListSettingFragment.mMusicSettingsSongAdapter_delegate$lambda$0(this.f5212a);
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ MusicSongListSettingsViewModel access$getMViewModel(MusicSongListSettingFragment musicSongListSettingFragment) {
        return (MusicSongListSettingsViewModel) musicSongListSettingFragment.getMViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$5(MusicSongListSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$6(MusicSongListSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showSongListRemoveDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$7(MusicSongListSettingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        Integer songListID = this$0.getSongListID();
        Intrinsics.checkNotNull(songListID);
        bundle.putInt(SONG_LIST_ID, songListID.intValue());
        bundle.putString(SONG_LIST_NAME, this$0.getSongListName());
        BaseFragmentExKt.gotoPageForResult(this$0, (Class<?>) AddSongToListFragment.class, bundle, REQUEST_CODE_ADD_SONG);
    }

    private final MusicSettingsSongAdapter getMMusicSettingsSongAdapter() {
        return (MusicSettingsSongAdapter) this.mMusicSettingsSongAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer getSongListID() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return Integer.valueOf(arguments.getInt(SONG_LIST_ID));
        }
        return null;
    }

    private final String getSongListName() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getString(SONG_LIST_NAME);
        }
        return null;
    }

    private final void handleSongListRemoveResponse(boolean songListRemoveSuc) {
        hideLoading();
        if (!songListRemoveSuc) {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, "删除失败");
                return;
            }
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("action", ACTION_REMOVE);
        intent.putExtra(SONG_LIST_ID, getSongListID());
        Bundle arguments = getArguments();
        intent.putExtra(SONG_LIST_POSITION, arguments != null ? Integer.valueOf(arguments.getInt(SONG_LIST_POSITION)) : null);
        FragmentActivity mActivity2 = getMActivity();
        if (mActivity2 != null) {
            mActivity2.setResult(-1, intent);
        }
        FragmentActivity mActivity3 = getMActivity();
        if (mActivity3 != null) {
            mActivity3.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MusicSettingsSongAdapter mMusicSettingsSongAdapter_delegate$lambda$0(final MusicSongListSettingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new MusicSettingsSongAdapter(new Function3<View, Integer, clf, Unit>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingFragment$mMusicSettingsSongAdapter$2$1
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

    /* JADX WARN: Multi-variable type inference failed */
    private final void onRemoveSong(int position, clf song) {
        MusicSongListSettingsViewModel musicSongListSettingsViewModel = (MusicSongListSettingsViewModel) getMViewModel();
        Integer songListID = getSongListID();
        Intrinsics.checkNotNull(songListID);
        musicSongListSettingsViewModel.removeSongFromList(songListID.intValue(), position, song);
    }

    private final void onSongRemoved(MusicSongListSettingsViewModel.SongRemoveResponse songRemoveResponse) {
        List<clf> currentList = getMMusicSettingsSongAdapter().getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        List<clf> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) currentList);
        if (songRemoveResponse.isSuc()) {
            mutableList.remove(songRemoveResponse.getSongList());
        } else {
            FragmentActivity mActivity = getMActivity();
            if (mActivity != null) {
                ToastExtKt.toastShort(mActivity, "删除失败");
            }
        }
        getMMusicSettingsSongAdapter().updateCurrentList(mutableList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(MusicSongListSettingFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(bool);
        this$0.handleSongListRemoveResponse(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(MusicSongListSettingFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (list.isEmpty()) {
            RecyclerView songsRv = this$0.getMBinding().F;
            Intrinsics.checkNotNullExpressionValue(songsRv, "songsRv");
            ExtUtilsKt.setVisible(songsRv, false);
            ConstraintLayout emptyView = this$0.getMBinding().B;
            Intrinsics.checkNotNullExpressionValue(emptyView, "emptyView");
            ExtUtilsKt.setVisible(emptyView, true);
        } else {
            RecyclerView songsRv2 = this$0.getMBinding().F;
            Intrinsics.checkNotNullExpressionValue(songsRv2, "songsRv");
            ExtUtilsKt.setVisible(songsRv2, true);
            ConstraintLayout emptyView2 = this$0.getMBinding().B;
            Intrinsics.checkNotNullExpressionValue(emptyView2, "emptyView");
            ExtUtilsKt.setVisible(emptyView2, false);
        }
        MusicSettingsSongAdapter mMusicSettingsSongAdapter = this$0.getMMusicSettingsSongAdapter();
        Intrinsics.checkNotNull(list);
        mMusicSettingsSongAdapter.updateCurrentList(list);
        this$0.hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(MusicSongListSettingFragment this$0, MusicSongListSettingsViewModel.SongRemoveResponse songRemoveResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(songRemoveResponse);
        this$0.onSongRemoved(songRemoveResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onVisible$lambda$4(MusicSongListSettingFragment this$0, byte[] bArr) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bArr != null) {
            ((MusicSongListSettingsViewModel) this$0.getMViewModel()).getSongsInSongList(bArr);
        }
        return Unit.INSTANCE;
    }

    private final void showSongListRemoveDialog() {
        new CommonDialog.c("commonDialog").setDialogTitle(wzi.o7).setDialogDescriptionString(new DialogParams.DialogDescriptionString(getString(wzi.n7, getSongListName()))).setNegativeText(wzi.e).setPositiveText(wzi.g).setCanceledOnTouchOutside(true).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingFragment.showSongListRemoveDialog.1
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
                    PageState.DefaultImpls.showLoading$default(MusicSongListSettingFragment.this, null, 0, false, 5, null);
                    MusicSongListSettingsViewModel musicSongListSettingsViewModelAccess$getMViewModel = MusicSongListSettingFragment.access$getMViewModel(MusicSongListSettingFragment.this);
                    Integer songListID = MusicSongListSettingFragment.this.getSongListID();
                    Intrinsics.checkNotNull(songListID);
                    musicSongListSettingsViewModelAccess$getMViewModel.onSongListRemove(songListID.intValue());
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }
        }).show(getParentFragmentManager(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showSongSettingsWindow(View itemView, final int position, final clf song) {
        a4i a4iVar = new a4i(requireContext(), itemView);
        a4iVar.f(uwi.f36226b);
        a4iVar.setOnMenuItemClickListener(new a4i.c() { // from class: gdg
            @Override // a4i.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return MusicSongListSettingFragment.showSongSettingsWindow$lambda$8(this.f18855a, position, song, menuItem);
            }
        });
        a4iVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showSongSettingsWindow$lambda$8(MusicSongListSettingFragment this$0, int i, clf song, MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(song, "$song");
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        if (menuItem.getItemId() != zqi.O1) {
            return true;
        }
        this$0.onRemoveSong(i, song);
        return true;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull am6 am6Var) {
        Intrinsics.checkNotNullParameter(am6Var, "<this>");
        am6Var.A.setOnClickListener(new View.OnClickListener() { // from class: ddg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicSongListSettingFragment.bindView$lambda$5(this.f15399a, view);
            }
        });
        am6Var.E.setOnClickListener(new View.OnClickListener() { // from class: edg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicSongListSettingFragment.bindView$lambda$6(this.f16525a, view);
            }
        });
        am6Var.D.setOnClickListener(new View.OnClickListener() { // from class: fdg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicSongListSettingFragment.bindView$lambda$7(this.f17677a, view);
            }
        });
        am6Var.F.setAdapter(getMMusicSettingsSongAdapter());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.L1;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("action", ACTION_UPDATE);
        intent.putExtra(SONG_LIST_ID, getSongListID());
        Bundle arguments = getArguments();
        intent.putExtra(SONG_LIST_POSITION, arguments != null ? Integer.valueOf(arguments.getInt(SONG_LIST_POSITION)) : null);
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            mActivity.setResult(-1, intent);
        }
        finish();
        return super.onBackPressed();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        getMBinding().H.setText(getSongListName());
        ((MusicSongListSettingsViewModel) getMViewModel()).getSongListRemoveResponse().observe(getViewLifecycleOwner(), new Observer() { // from class: zcg
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MusicSongListSettingFragment.onViewCreated$lambda$1(this.f41119a, (Boolean) obj);
            }
        });
        ((MusicSongListSettingsViewModel) getMViewModel()).getSongsInSongList().observe(getViewLifecycleOwner(), new Observer() { // from class: adg
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MusicSongListSettingFragment.onViewCreated$lambda$2(this.f900a, (List) obj);
            }
        });
        ((MusicSongListSettingsViewModel) getMViewModel()).getSongRemoveResponse().observe(getViewLifecycleOwner(), new Observer() { // from class: bdg
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MusicSongListSettingFragment.onViewCreated$lambda$3(this.f4086a, (MusicSongListSettingsViewModel.SongRemoveResponse) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
        MusicSongListSettingsViewModel musicSongListSettingsViewModel = (MusicSongListSettingsViewModel) getMViewModel();
        Integer songListID = getSongListID();
        Intrinsics.checkNotNull(songListID);
        musicSongListSettingsViewModel.querySongList(songListID.intValue(), new Function1() { // from class: ycg
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MusicSongListSettingFragment.onVisible$lambda$4(this.f40038a, (byte[]) obj);
            }
        });
    }
}
