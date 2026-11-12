package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.xiaomi.fitness.baseui.recyclerview.decoration.LinearItemSpace;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioListWatchFragment;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.WatchRecordBean;
import defpackage.blf;
import defpackage.eui;
import defpackage.mf6;
import defpackage.qyi;
import defpackage.r64;
import defpackage.wkf;
import defpackage.xc6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b'\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0006J\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioListWatchFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel;", "Lmf6;", "", "showDownloadDialog", "()V", "dialogDismiss", "bindView", "(Lmf6;)V", "Lblf;", "status", "recordStatusChange", "(Lblf;)V", LifecycleConstantKt.ON_DESTROY, "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchRecordBean;", "getRecordData", "()Ljava/util/List;", "", "datas", "updateRecordData", "(Ljava/util/List;)V", "", "title", "refreshData", "(Ljava/lang/String;)V", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/DownloadFileDialog;", "mDialog", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/DownloadFileDialog;", "dataList", "Ljava/util/List;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchListAdapter;", "watchListAdapter", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchListAdapter;", "", "getLayoutId", "()I", "layoutId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAudioListWatchFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioListWatchFragment.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioListWatchFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n1#2:133\n*E\n"})
public final class AudioListWatchFragment extends BaseBindingFragment<AudioRecordViewModel, mf6> {

    @NotNull
    private List<WatchRecordBean> dataList = new ArrayList();

    @Nullable
    private DownloadFileDialog mDialog;

    @Nullable
    private WatchListAdapter watchListAdapter;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$0(WatchRecordBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1(AudioListWatchFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dataList.clear();
        List<WatchRecordBean> list2 = this$0.dataList;
        Intrinsics.checkNotNull(list);
        list2.addAll(list);
        WatchListAdapter watchListAdapter = this$0.watchListAdapter;
        if (watchListAdapter != null) {
            watchListAdapter.notifyDataSetChanged();
        }
        LinearLayout emptyView = this$0.getMBinding().A;
        Intrinsics.checkNotNullExpressionValue(emptyView, "emptyView");
        ExtUtilsKt.setVisible(emptyView, list.isEmpty());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$2(AudioListWatchFragment this$0, Pair pair) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (((Boolean) pair.getFirst()).booleanValue()) {
            this$0.showDownloadDialog();
            DownloadFileDialog downloadFileDialog = this$0.mDialog;
            if (downloadFileDialog != null) {
                downloadFileDialog.updateProgress(((Number) pair.getSecond()).intValue());
            }
        } else {
            this$0.dialogDismiss();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$4(AudioListWatchFragment this$0, Boolean bool) {
        FragmentActivity mActivity;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue() && (mActivity = this$0.getMActivity()) != null && (mActivity instanceof AudioRecordListActivity)) {
            ((AudioRecordListActivity) mActivity).refreshPhoneList();
        }
        return Unit.INSTANCE;
    }

    private final void dialogDismiss() {
        DownloadFileDialog downloadFileDialog = this.mDialog;
        if (downloadFileDialog != null) {
            downloadFileDialog.dismissAllowingStateLoss();
        }
    }

    private final void showDownloadDialog() {
        DownloadFileDialog downloadFileDialog;
        if (this.mDialog == null) {
            this.mDialog = DownloadFileDialog.INSTANCE.defaultBuilder("download_file").create();
        }
        DownloadFileDialog downloadFileDialog2 = this.mDialog;
        if ((downloadFileDialog2 == null || !downloadFileDialog2.isShowing()) && (downloadFileDialog = this.mDialog) != null) {
            downloadFileDialog.showIfNeed(getParentFragmentManager());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull mf6 mf6Var) {
        Intrinsics.checkNotNullParameter(mf6Var, "<this>");
        setActionBarDisplayable(false);
        AudioRecordViewModel audioRecordViewModel = (AudioRecordViewModel) getMViewModel();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        AudioRecordViewModel.register$default(audioRecordViewModel, contextRequireContext, false, 2, null);
        mf6Var.D.setLayoutManager(new LinearLayoutManager(requireActivity()));
        mf6Var.D.addItemDecoration(new LinearItemSpace(ExtUtilsKt.getDp(12), false, false, 6, null));
        this.dataList.clear();
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        WatchListAdapter watchListAdapter = new WatchListAdapter(contextRequireContext2, false, this.dataList, null, new Function1() { // from class: fn1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioListWatchFragment.bindView$lambda$0((WatchRecordBean) obj);
            }
        }, 8, null);
        this.watchListAdapter = watchListAdapter;
        mf6Var.D.setAdapter(watchListAdapter);
        ((AudioRecordViewModel) getMViewModel()).getDataListLiveData().observe(this, new AudioListWatchFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: gn1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioListWatchFragment.bindView$lambda$1(this.f19147a, (List) obj);
            }
        }));
        ((AudioRecordViewModel) getMViewModel()).getProgress().observe(getViewLifecycleOwner(), new AudioListWatchFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: hn1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioListWatchFragment.bindView$lambda$2(this.f20251a, (Pair) obj);
            }
        }));
        ((AudioRecordViewModel) getMViewModel()).getUploadEnd().observe(getViewLifecycleOwner(), new AudioListWatchFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: in1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioListWatchFragment.bindView$lambda$4(this.f21312a, (Boolean) obj);
            }
        }));
        ((AudioRecordViewModel) getMViewModel()).loadDeviceRecordList();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.N;
    }

    @NotNull
    public final List<WatchRecordBean> getRecordData() {
        return this.dataList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AudioRecordViewModel audioRecordViewModel = (AudioRecordViewModel) getMViewModel();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        AudioRecordViewModel.unRegister$default(audioRecordViewModel, contextRequireContext, false, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void recordStatusChange(@NotNull blf status) {
        Intrinsics.checkNotNullParameter(status, "status");
        if (getIsPrepared()) {
            getMBinding().B.setVisibility(0);
            r64 r64Var = status.c;
            int i = r64Var.c / 60;
            int i2 = r64Var.d / 60;
            getMBinding().G.setText(ApplicationExtKt.getApplication().getResources().getQuantityString(qyi.F, i, Integer.valueOf(i)) + "/" + ApplicationExtKt.getApplication().getResources().getQuantityString(qyi.F, i2, Integer.valueOf(i2)));
            r64 r64Var2 = status.c;
            int i3 = r64Var2.c;
            int i4 = r64Var2.d;
            xc6.d("AudioListWatchFragment recordStatusChange current:" + i3 + " max:" + i4);
            getMBinding().E.setProgress((int) (((((double) i3) * 1.0d) / ((double) i4)) * ((double) 100)));
            blf.a aVar = status.e;
            if (aVar != null && aVar.d == 1) {
                List<WatchRecordBean> value = ((AudioRecordViewModel) getMViewModel()).getDataListLiveData().getValue();
                wkf mediaFile = aVar.c;
                Intrinsics.checkNotNullExpressionValue(mediaFile, "mediaFile");
                WatchRecordBean watchRecordBean = new WatchRecordBean(mediaFile, false, 2, null);
                if (value != null) {
                    value.add(0, watchRecordBean);
                }
                this.dataList.add(0, watchRecordBean);
                WatchListAdapter watchListAdapter = this.watchListAdapter;
                if (watchListAdapter != null) {
                    watchListAdapter.notifyDataSetChanged();
                }
            }
            LinearLayout emptyView = getMBinding().A;
            Intrinsics.checkNotNullExpressionValue(emptyView, "emptyView");
            ExtUtilsKt.setVisible(emptyView, this.dataList.isEmpty());
        }
    }

    public final void refreshData(@NotNull String title) {
        Object next;
        Intrinsics.checkNotNullParameter(title, "title");
        Iterator<T> it = this.dataList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((WatchRecordBean) next).getFile().c.c, title));
        WatchRecordBean watchRecordBean = (WatchRecordBean) next;
        if (watchRecordBean != null) {
            int iIndexOf = this.dataList.indexOf(watchRecordBean);
            watchRecordBean.setPull(false);
            WatchListAdapter watchListAdapter = this.watchListAdapter;
            if (watchListAdapter != null) {
                watchListAdapter.notifyItemChanged(iIndexOf);
            }
        }
    }

    public final void updateRecordData(@NotNull List<WatchRecordBean> datas) {
        Intrinsics.checkNotNullParameter(datas, "datas");
        this.dataList.clear();
        this.dataList.addAll(datas);
    }
}
