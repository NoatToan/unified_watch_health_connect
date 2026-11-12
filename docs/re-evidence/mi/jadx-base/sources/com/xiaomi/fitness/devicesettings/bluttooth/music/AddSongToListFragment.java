package com.xiaomi.fitness.devicesettings.bluttooth.music;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.devicesettings.bluttooth.music.AddSongToListFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSongListSettingsViewModel;
import com.xiaomi.fitness.devicesettings.bluttooth.music.data.AddSong;
import com.xiaomi.fitness.devicesettings.bluttooth.music.ui.AddSongToListAdapter;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.eui;
import defpackage.ql6;
import defpackage.qyi;
import defpackage.wzi;
import defpackage.zwh;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0006R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/AddSongToListFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicSongListSettingsViewModel;", "Lql6;", "", "updateSelectStatus", "()V", "bindView", "(Lql6;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "loadData", "", "songListID$delegate", "Lkotlin/Lazy;", "getSongListID", "()Ljava/lang/Integer;", "songListID", "", "songListName$delegate", "getSongListName", "()Ljava/lang/String;", "songListName", "", "isSelectAll", "Z", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/AddSongToListAdapter;", "mAddSongToListAdapter$delegate", "getMAddSongToListAdapter", "()Lcom/xiaomi/fitness/devicesettings/bluttooth/music/ui/AddSongToListAdapter;", "mAddSongToListAdapter", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAddSongToListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddSongToListFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/music/AddSongToListFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n1863#2,2:150\n1010#2,2:152\n*S KotlinDebug\n*F\n+ 1 AddSongToListFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/music/AddSongToListFragment\n*L\n64#1:150,2\n120#1:152,2\n*E\n"})
public final class AddSongToListFragment extends BaseBindingFragment<MusicSongListSettingsViewModel, ql6> {
    private boolean isSelectAll;

    /* JADX INFO: renamed from: songListID$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy songListID = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zt0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AddSongToListFragment.songListID_delegate$lambda$0(this.f41643a);
        }
    });

    /* JADX INFO: renamed from: songListName$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy songListName = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: au0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AddSongToListFragment.songListName_delegate$lambda$1(this.f3444a);
        }
    });

    /* JADX INFO: renamed from: mAddSongToListAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAddSongToListAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bu0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AddSongToListFragment.mAddSongToListAdapter_delegate$lambda$6(this.f4604a);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$2(AddSongToListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$3(AddSongToListFragment this$0, ql6 this_bindView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_bindView, "$this_bindView");
        boolean z = !this$0.isSelectAll;
        this$0.isSelectAll = z;
        this_bindView.B.setText(this$0.getString(z ? wzi.J5 : wzi.F5));
        this_bindView.G.setChecked(this$0.isSelectAll);
        int size = this$0.getMAddSongToListAdapter().getUpdateCurrentList().size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this$0.getMAddSongToListAdapter().getUpdateCurrentList().get(i2).getStatus() != 2) {
                if (this$0.isSelectAll) {
                    i++;
                    this$0.getMAddSongToListAdapter().getUpdateCurrentList().get(i2).setStatus(1);
                } else {
                    this$0.getMAddSongToListAdapter().getUpdateCurrentList().get(i2).setStatus(0);
                }
                this$0.getMAddSongToListAdapter().notifyItemChanged(i2);
            }
        }
        if (i > 0) {
            AppCompatImageButton mediaMusicSongListSettingsConfirmButton = this$0.getMBinding().F;
            Intrinsics.checkNotNullExpressionValue(mediaMusicSongListSettingsConfirmButton, "mediaMusicSongListSettingsConfirmButton");
            ViewExtKt.visible(mediaMusicSongListSettingsConfirmButton);
        } else {
            AppCompatImageButton mediaMusicSongListSettingsConfirmButton2 = this$0.getMBinding().F;
            Intrinsics.checkNotNullExpressionValue(mediaMusicSongListSettingsConfirmButton2, "mediaMusicSongListSettingsConfirmButton");
            ViewExtKt.invisible(mediaMusicSongListSettingsConfirmButton2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$5(AddSongToListFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ArrayList arrayList = new ArrayList();
        for (AddSong addSong : this$0.getMAddSongToListAdapter().getUpdateCurrentList()) {
            if (addSong.getStatus() == 1) {
                byte[] id = addSong.getSong().c;
                Intrinsics.checkNotNullExpressionValue(id, "id");
                arrayList.addAll(ArraysKt___ArraysKt.toMutableList(id));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        MusicSongListSettingsViewModel musicSongListSettingsViewModel = (MusicSongListSettingsViewModel) this$0.getMViewModel();
        Integer songListID = this$0.getSongListID();
        Intrinsics.checkNotNull(songListID);
        musicSongListSettingsViewModel.addSongToSongList(arrayList, songListID.intValue());
    }

    private final AddSongToListAdapter getMAddSongToListAdapter() {
        return (AddSongToListAdapter) this.mAddSongToListAdapter.getValue();
    }

    private final Integer getSongListID() {
        return (Integer) this.songListID.getValue();
    }

    private final String getSongListName() {
        return (String) this.songListName.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit loadData$lambda$10(AddSongToListFragment this$0, byte[] bArr) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bArr != null) {
            ((MusicSongListSettingsViewModel) this$0.getMViewModel()).getSongsOutSongList(bArr);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AddSongToListAdapter mAddSongToListAdapter_delegate$lambda$6(final AddSongToListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new AddSongToListAdapter(new Function2<View, AddSong, Unit>() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.AddSongToListFragment$mAddSongToListAdapter$2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(View view, AddSong addSong) {
                invoke2(view, addSong);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public void invoke2(View p1, AddSong addSong) {
                Intrinsics.checkNotNullParameter(p1, "p1");
                Intrinsics.checkNotNullParameter(addSong, "addSong");
                this.this$0.updateSelectStatus();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$8(AddSongToListFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (list.isEmpty()) {
            ConstraintLayout selectAllView = this$0.getMBinding().H;
            Intrinsics.checkNotNullExpressionValue(selectAllView, "selectAllView");
            ExtUtilsKt.setVisible(selectAllView, false);
            RecyclerView songsRv = this$0.getMBinding().J;
            Intrinsics.checkNotNullExpressionValue(songsRv, "songsRv");
            ExtUtilsKt.setVisible(songsRv, false);
            ConstraintLayout emptyView = this$0.getMBinding().D;
            Intrinsics.checkNotNullExpressionValue(emptyView, "emptyView");
            ExtUtilsKt.setVisible(emptyView, true);
        } else {
            ConstraintLayout selectAllView2 = this$0.getMBinding().H;
            Intrinsics.checkNotNullExpressionValue(selectAllView2, "selectAllView");
            ExtUtilsKt.setVisible(selectAllView2, true);
            RecyclerView songsRv2 = this$0.getMBinding().J;
            Intrinsics.checkNotNullExpressionValue(songsRv2, "songsRv");
            ExtUtilsKt.setVisible(songsRv2, true);
            ConstraintLayout emptyView2 = this$0.getMBinding().D;
            Intrinsics.checkNotNullExpressionValue(emptyView2, "emptyView");
            ExtUtilsKt.setVisible(emptyView2, false);
        }
        this$0.getMBinding().I.setText(this$0.getResources().getQuantityString(qyi.o, list.size(), Integer.valueOf(list.size())));
        Intrinsics.checkNotNull(list);
        if (list.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new Comparator() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.music.AddSongToListFragment$onViewCreated$lambda$8$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(zwh.d(((AddSong) t).getSong().d), zwh.d(((AddSong) t2).getSong().d));
                }
            });
        }
        this$0.getMAddSongToListAdapter().updateCurrentList(list);
        this$0.hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$9(AddSongToListFragment this$0, MusicSongListSettingsViewModel.AddSongToSongListResponse addSongToSongListResponse) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (addSongToSongListResponse.isSuc()) {
            Intent intent = new Intent();
            FragmentActivity mActivity = this$0.getMActivity();
            if (mActivity != null) {
                mActivity.setResult(-1, intent);
            }
            FragmentActivity mActivity2 = this$0.getMActivity();
            if (mActivity2 != null) {
                mActivity2.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer songListID_delegate$lambda$0(AddSongToListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle arguments = this$0.getArguments();
        if (arguments != null) {
            return Integer.valueOf(arguments.getInt(MusicSongListSettingFragment.SONG_LIST_ID));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String songListName_delegate$lambda$1(AddSongToListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle arguments = this$0.getArguments();
        if (arguments != null) {
            return arguments.getString(MusicSongListSettingFragment.SONG_LIST_NAME);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectStatus() {
        int size = getMAddSongToListAdapter().getUpdateCurrentList().size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (getMAddSongToListAdapter().getUpdateCurrentList().get(i2).getStatus() == 1) {
                i++;
            }
        }
        if (i > 0) {
            AppCompatImageButton mediaMusicSongListSettingsConfirmButton = getMBinding().F;
            Intrinsics.checkNotNullExpressionValue(mediaMusicSongListSettingsConfirmButton, "mediaMusicSongListSettingsConfirmButton");
            ViewExtKt.visible(mediaMusicSongListSettingsConfirmButton);
        } else {
            AppCompatImageButton mediaMusicSongListSettingsConfirmButton2 = getMBinding().F;
            Intrinsics.checkNotNullExpressionValue(mediaMusicSongListSettingsConfirmButton2, "mediaMusicSongListSettingsConfirmButton");
            ViewExtKt.invisible(mediaMusicSongListSettingsConfirmButton2);
        }
        if (i == getMAddSongToListAdapter().getUpdateCurrentList().size()) {
            getMBinding().G.setChecked(true);
            this.isSelectAll = true;
        } else {
            getMBinding().G.setChecked(false);
            this.isSelectAll = false;
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull final ql6 ql6Var) {
        Intrinsics.checkNotNullParameter(ql6Var, "<this>");
        ql6Var.A.setOnClickListener(new View.OnClickListener() { // from class: wt0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddSongToListFragment.bindView$lambda$2(this.f38326a, view);
            }
        });
        ql6Var.J.setAdapter(getMAddSongToListAdapter());
        ql6Var.G.setOnClickListener(new View.OnClickListener() { // from class: xt0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddSongToListFragment.bindView$lambda$3(this.f39434a, ql6Var, view);
            }
        });
        ql6Var.F.setOnClickListener(new View.OnClickListener() { // from class: yt0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddSongToListFragment.bindView$lambda$5(this.f40506a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.G1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void loadData() {
        super.loadData();
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
        MusicSongListSettingsViewModel musicSongListSettingsViewModel = (MusicSongListSettingsViewModel) getMViewModel();
        Integer songListID = getSongListID();
        Intrinsics.checkNotNull(songListID);
        musicSongListSettingsViewModel.querySongList(songListID.intValue(), new Function1() { // from class: cu0
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AddSongToListFragment.loadData$lambda$10(this.f14714a, (byte[]) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarDisplayable(false);
        getMBinding().L.setText(getString(wzi.m7, getSongListName()));
        ((MusicSongListSettingsViewModel) getMViewModel()).getSongsOutSongList().observe(getViewLifecycleOwner(), new Observer() { // from class: ut0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                AddSongToListFragment.onViewCreated$lambda$8(this.f36106a, (List) obj);
            }
        });
        ((MusicSongListSettingsViewModel) getMViewModel()).getAddSongToSongListResponse().observe(getViewLifecycleOwner(), new Observer() { // from class: vt0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                AddSongToListFragment.onViewCreated$lambda$9(this.f37197a, (MusicSongListSettingsViewModel.AddSongToSongListResponse) obj);
            }
        });
    }
}
