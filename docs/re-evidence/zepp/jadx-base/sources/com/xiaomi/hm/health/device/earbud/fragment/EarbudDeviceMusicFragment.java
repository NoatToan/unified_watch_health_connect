package com.xiaomi.hm.health.device.earbud.fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.sky.lib.constant.WebConstant;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.xiaomi.hm.health.bt.profile.earbud.model.CurrentMusicState;
import com.xiaomi.hm.health.bt.profile.earbud.model.MusicControlCmd;
import com.xiaomi.hm.health.databases.model.EarbudMusicInfo;
import com.xiaomi.hm.health.device.earbud.adapter.EarbudDeviceMusicAdapter;
import com.xiaomi.hm.health.device.earbud.fragment.EarbudDeviceMusicFragment;
import com.xiaomi.hm.health.device.earbud.service.MusicDownloadStatus;
import com.xiaomi.hm.health.device.earbud.viewmodel.DeviceMusicSection;
import com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J&\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0002H\u0016R\u001d\u0010!\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)¨\u0006/"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/fragment/EarbudDeviceMusicFragment;", "Landroidx/fragment/app/Fragment;", "", "initView", SOAP.XMLNS, "Lcom/xiaomi/hm/health/databases/model/EarbudMusicInfo;", "item", "y", "", "z", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "x", "l", WebConstant.QueryParam.TYPE_MUSIC, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "C", "currentDownload", "E", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "onPause", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudMusicViewModel;", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.b, "()Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudMusicViewModel;", "mViewModel", "Lcom/xiaomi/hm/health/device/earbud/adapter/EarbudDeviceMusicAdapter;", "b", "m", "()Lcom/xiaomi/hm/health/device/earbud/adapter/EarbudDeviceMusicAdapter;", "mAdapter", "", "c", "F", "mTouchX", GoogleApiAvailabilityLight.a, "mTouchY", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudDeviceMusicFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EarbudMusicViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.device.earbud.fragment.EarbudDeviceMusicFragment$special$$inlined$activityViewModels$default$1
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
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.device.earbud.fragment.EarbudDeviceMusicFragment$special$$inlined$activityViewModels$default$2
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

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAdapter = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float mTouchX;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private float mTouchY;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/adapter/EarbudDeviceMusicAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<EarbudDeviceMusicAdapter> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EarbudDeviceMusicAdapter getA() {
            return new EarbudDeviceMusicAdapter();
        }
    }

    private final void A(final EarbudMusicInfo music) {
        new AlertDialogFragment.Builder(requireActivity()).setTitle(getString(R.string.earbud_delete_music_confirm_title, music.getName())).setMessage(getString(R.string.earbud_delete_music_msg, Integer.valueOf(n().getMusicSize(music.getId().longValue())))).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: ge1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EarbudDeviceMusicFragment.B(this.a, music, dialogInterface, i);
            }
        }).show(getChildFragmentManager(), "Delete Dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(EarbudDeviceMusicFragment earbudDeviceMusicFragment, EarbudMusicInfo earbudMusicInfo, DialogInterface dialogInterface, int i) {
        earbudDeviceMusicFragment.n().deleteMusic(earbudMusicInfo.getId().longValue());
    }

    private final void C(final EarbudMusicInfo music) {
        BigDecimal bigDecimal;
        int status;
        AlertDialogFragment.Builder title = new AlertDialogFragment.Builder(requireActivity()).setTitle(getString(R.string.earbud_delete_download_title, music.getName()));
        int i = R.string.earbud_delete_download_msg;
        Object[] objArr = new Object[1];
        MusicDownloadStatus value = n().getDownloadStatusData().getValue();
        Long id = music.getId();
        if (value == null || id == null || value.getId() != id.longValue() || (status = value.getStatus()) == 0) {
            bigDecimal = new BigDecimal(0);
        } else if (CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, -1}).contains(Integer.valueOf(status))) {
            bigDecimal = (value.getProgress() == null || value.getProgress().progress == 0 || value.getProgress().total == 0) ? new BigDecimal(0) : new BigDecimal(((double) (value.getProgress().progress * 100)) / ((double) value.getProgress().total)).setScale(1, 4);
        } else {
            bigDecimal = new BigDecimal(100);
        }
        objArr[0] = bigDecimal.toString();
        title.setMessage(getString(i, objArr)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: je1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                EarbudDeviceMusicFragment.D(this.a, music, dialogInterface, i2);
            }
        }).show(getChildFragmentManager(), "Delete Download Dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(EarbudDeviceMusicFragment earbudDeviceMusicFragment, EarbudMusicInfo earbudMusicInfo, DialogInterface dialogInterface, int i) {
        EarbudMusicViewModel.removeDownload$default(earbudDeviceMusicFragment.n(), earbudMusicInfo.getId().longValue(), false, 2, null);
    }

    private final void E(final EarbudMusicInfo music, EarbudMusicInfo currentDownload) {
        new AlertDialogFragment.Builder(requireActivity()).setMessage(getString(R.string.earbud_switch_download_msg, music.getName(), currentDownload.getName())).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: ie1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EarbudDeviceMusicFragment.F(this.a, music, dialogInterface, i);
            }
        }).show(getChildFragmentManager(), "Switch Download Dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(EarbudDeviceMusicFragment earbudDeviceMusicFragment, EarbudMusicInfo earbudMusicInfo, DialogInterface dialogInterface, int i) {
        earbudDeviceMusicFragment.n().forceDownload(earbudMusicInfo.getId().longValue());
    }

    private final void initView() {
        m().setOnItemLongClickListener(new BaseQuickAdapter.OnItemLongClickListener() { // from class: he1
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemLongClickListener
            public final boolean onItemLongClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                return EarbudDeviceMusicFragment.o(this.a, baseQuickAdapter, view, i);
            }
        });
        m().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: qe1
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                EarbudDeviceMusicFragment.p(this.a, baseQuickAdapter, view, i);
            }
        });
        m().setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() { // from class: pe1
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemChildClickListener
            public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                EarbudDeviceMusicFragment.q(this.a, baseQuickAdapter, view, i);
            }
        });
        View view = getView();
        ((RecyclerView) (view == null ? null : view.findViewById(R.id.music_list))).setLayoutManager(new GridLayoutManager(requireActivity(), 2));
        EarbudDeviceMusicAdapter earbudDeviceMusicAdapterM = m();
        View view2 = getView();
        earbudDeviceMusicAdapterM.bindToRecyclerView((RecyclerView) (view2 == null ? null : view2.findViewById(R.id.music_list)));
        View view3 = getView();
        ((RecyclerView) (view3 == null ? null : view3.findViewById(R.id.music_list))).setOnTouchListener(new View.OnTouchListener() { // from class: ke1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view4, MotionEvent motionEvent) {
                return EarbudDeviceMusicFragment.r(this.a, view4, motionEvent);
            }
        });
        View view4 = getView();
        ((SmartRefreshLayout) (view4 == null ? null : view4.findViewById(R.id.pull_view))).setEnableRefresh(false);
        View view5 = getView();
        ((SmartRefreshLayout) (view5 != null ? view5.findViewById(R.id.pull_view) : null)).setEnableLoadmore(false);
    }

    private final void l(EarbudMusicInfo item) {
        if (item == null) {
            return;
        }
        Integer localStatus = item.getLocalStatus();
        if (localStatus != null && localStatus.intValue() == 3) {
            A(item);
            return;
        }
        Integer localStatus2 = item.getLocalStatus();
        if (localStatus2 != null && localStatus2.intValue() == 2) {
            C(item);
            return;
        }
        Integer localStatus3 = item.getLocalStatus();
        if (localStatus3 != null && localStatus3.intValue() == 1) {
            n().removeDownload(item.getId().longValue(), false);
        } else {
            A(item);
        }
    }

    private final EarbudDeviceMusicAdapter m() {
        return (EarbudDeviceMusicAdapter) this.mAdapter.getValue();
    }

    private final EarbudMusicViewModel n() {
        return (EarbudMusicViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(EarbudDeviceMusicFragment earbudDeviceMusicFragment, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        return earbudDeviceMusicFragment.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(EarbudDeviceMusicFragment earbudDeviceMusicFragment, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Object obj = baseQuickAdapter.getData().get(i);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.xiaomi.hm.health.device.earbud.viewmodel.DeviceMusicSection");
        earbudDeviceMusicFragment.y((EarbudMusicInfo) ((DeviceMusicSection) obj).t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(EarbudDeviceMusicFragment earbudDeviceMusicFragment, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Object obj = baseQuickAdapter.getData().get(i);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.xiaomi.hm.health.device.earbud.viewmodel.DeviceMusicSection");
        earbudDeviceMusicFragment.x((EarbudMusicInfo) ((DeviceMusicSection) obj).t, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(EarbudDeviceMusicFragment earbudDeviceMusicFragment, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            earbudDeviceMusicFragment.mTouchX = motionEvent.getX();
            earbudDeviceMusicFragment.mTouchY = motionEvent.getY();
        }
        if (motionEvent.getAction() == 1 && view.getId() != 0 && Math.abs(earbudDeviceMusicFragment.mTouchX - motionEvent.getX()) <= 5.0f && Math.abs(earbudDeviceMusicFragment.mTouchY - motionEvent.getY()) <= 5.0f) {
            earbudDeviceMusicFragment.n().setShowDelete(false);
        }
        return false;
    }

    private final void s() {
        n().getLocalMusicData().observe(this, new Observer() { // from class: oe1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EarbudDeviceMusicFragment.t(this.a, (List) obj);
            }
        });
        n().getShowDelete().observe(this, new Observer() { // from class: ne1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EarbudDeviceMusicFragment.u(this.a, (Boolean) obj);
            }
        });
        n().getMusicStateData().observe(this, new Observer() { // from class: le1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EarbudDeviceMusicFragment.v(this.a, (CurrentMusicState) obj);
            }
        });
        n().getDownloadStatusData().observe(this, new Observer() { // from class: me1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EarbudDeviceMusicFragment.w(this.a, (MusicDownloadStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(EarbudDeviceMusicFragment earbudDeviceMusicFragment, List list) {
        if (list == null) {
            return;
        }
        earbudDeviceMusicFragment.m().setNewData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(EarbudDeviceMusicFragment earbudDeviceMusicFragment, Boolean bool) {
        earbudDeviceMusicFragment.m().setShowDelete(Intrinsics.areEqual(bool, Boolean.TRUE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(EarbudDeviceMusicFragment earbudDeviceMusicFragment, CurrentMusicState currentMusicState) {
        if (currentMusicState == null) {
            return;
        }
        earbudDeviceMusicFragment.m().setCurrentMusicId(currentMusicState.getMusicId());
        earbudDeviceMusicFragment.m().setPlaying(currentMusicState.isPlay());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(EarbudDeviceMusicFragment earbudDeviceMusicFragment, MusicDownloadStatus musicDownloadStatus) {
        earbudDeviceMusicFragment.m().setDownloadProgress(musicDownloadStatus);
    }

    private final void x(EarbudMusicInfo item, View view) {
        if (view.getId() == R.id.music_delete) {
            l(item);
        }
    }

    private final void y(EarbudMusicInfo item) {
        EarbudMusicInfo downloadingMusic;
        boolean z = false;
        if (m().getShowDelete()) {
            n().setShowDelete(false);
            return;
        }
        if (item == null) {
            return;
        }
        Integer localStatus = item.getLocalStatus();
        if (localStatus == null || localStatus.intValue() != 3) {
            Integer localStatus2 = item.getLocalStatus();
            if (localStatus2 == null || localStatus2.intValue() != 1 || (downloadingMusic = n().getDownloadingMusic()) == null) {
                return;
            }
            E(item, downloadingMusic);
            return;
        }
        CurrentMusicState value = n().getMusicStateData().getValue();
        if (!(value != null && value.getMusicId() == ((int) item.getId().longValue()))) {
            n().switchMusic(item.getId().longValue());
            return;
        }
        EarbudMusicViewModel earbudMusicViewModelN = n();
        CurrentMusicState value2 = n().getMusicStateData().getValue();
        if (value2 != null && value2.isPlay()) {
            z = true;
        }
        earbudMusicViewModelN.musicControl(z ? MusicControlCmd.PAUSE : MusicControlCmd.PLAY);
    }

    private final boolean z() {
        if (m().getShowDelete()) {
            n().setShowDelete(false);
            return false;
        }
        n().setShowDelete(true);
        return false;
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_earbud_music_list, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        n().setShowDelete(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        s();
    }
}
