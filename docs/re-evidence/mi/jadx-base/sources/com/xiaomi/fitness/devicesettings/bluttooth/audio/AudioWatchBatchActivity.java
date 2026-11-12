package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.xiaomi.fitness.baseui.recyclerview.decoration.LinearItemSpace;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.devicesettings.bigdata.UploadRecorderForegroundService;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioWatchBatchActivity;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.WatchRecordBean;
import defpackage.cji;
import defpackage.eui;
import defpackage.jni;
import defpackage.nd6;
import defpackage.wkf;
import defpackage.wzi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u001e\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b'\u0010\tJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0019\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0007*\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0012\u0010\tR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioWatchBatchActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordViewModel;", "Lnd6;", "", "isAllPulled", "()Z", "", "updateSaveButtonState", "()V", "showDownloadDialog", "dialogDismiss", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "bindView", "(Lnd6;)V", LifecycleConstantKt.ON_DESTROY, "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchRecordBean;", "selectDataList", "Ljava/util/List;", "dataList", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchListAdapter;", "watchListAdapter", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchListAdapter;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/DownloadFileDialog;", "mDialog", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/DownloadFileDialog;", "com/xiaomi/fitness/devicesettings/bluttooth/audio/AudioWatchBatchActivity$onDeviceStatusListener$1", "onDeviceStatusListener", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioWatchBatchActivity$onDeviceStatusListener$1;", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAudioWatchBatchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioWatchBatchActivity.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioWatchBatchActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,191:1\n1734#2,3:192\n1782#2,4:195\n1863#2,2:199\n1557#2:201\n1628#2,3:202\n37#3:205\n36#3,3:206\n*S KotlinDebug\n*F\n+ 1 AudioWatchBatchActivity.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioWatchBatchActivity\n*L\n161#1:192,3\n108#1:195,4\n113#1:199,2\n139#1:201\n139#1:202,3\n139#1:205\n139#1:206,3\n*E\n"})
public final class AudioWatchBatchActivity extends BaseBindingActivity<AudioRecordViewModel, nd6> {

    @Nullable
    private DownloadFileDialog mDialog;

    @Nullable
    private WatchListAdapter watchListAdapter;

    @NotNull
    private List<WatchRecordBean> selectDataList = new ArrayList();

    @NotNull
    private List<WatchRecordBean> dataList = new ArrayList();

    @NotNull
    private final AudioWatchBatchActivity$onDeviceStatusListener$1 onDeviceStatusListener = new OnDeviceStatusListener() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.AudioWatchBatchActivity$onDeviceStatusListener$1
        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectFailure(String did, int errorCode, int retryTimes) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectStart(String did) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onConnectSuccess(String did) {
        }

        @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
        public void onDisconnect(String did) {
            ToastUtil.showToast(this.this$0.getString(wzi.i3));
            this.this$0.dialogDismiss();
            UploadRecorderForegroundService.INSTANCE.stopForegroundServiceIfNeed(ApplicationExtKt.getApplication());
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$0(AudioWatchBatchActivity this$0, WatchRecordBean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (this$0.selectDataList.contains(it)) {
            this$0.selectDataList.remove(it);
        } else {
            this$0.selectDataList.add(it);
        }
        WatchListAdapter watchListAdapter = this$0.watchListAdapter;
        if (watchListAdapter != null) {
            watchListAdapter.notifyDataSetChanged();
        }
        this$0.updateSaveButtonState();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1(AudioWatchBatchActivity this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dataList.clear();
        List<WatchRecordBean> list2 = this$0.dataList;
        Intrinsics.checkNotNull(list);
        list2.addAll(list);
        WatchListAdapter watchListAdapter = this$0.watchListAdapter;
        if (watchListAdapter != null) {
            watchListAdapter.notifyDataSetChanged();
        }
        this$0.updateSaveButtonState();
        LinearLayout emptyView = this$0.getMBinding().C;
        Intrinsics.checkNotNullExpressionValue(emptyView, "emptyView");
        ExtUtilsKt.setVisible(emptyView, this$0.dataList.isEmpty());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$4(AudioWatchBatchActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.dataList.isEmpty()) {
            return;
        }
        List<WatchRecordBean> list = this$0.dataList;
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if ((!((WatchRecordBean) it.next()).isPull()) && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (this$0.selectDataList.size() == i) {
            this$0.selectDataList.clear();
        } else {
            this$0.selectDataList.clear();
            for (WatchRecordBean watchRecordBean : this$0.dataList) {
                if (!watchRecordBean.isPull()) {
                    this$0.selectDataList.add(watchRecordBean);
                }
            }
        }
        WatchListAdapter watchListAdapter = this$0.watchListAdapter;
        if (watchListAdapter != null) {
            watchListAdapter.notifyDataSetChanged();
        }
        this$0.updateSaveButtonState();
        if (this$0.isAllPulled()) {
            ToastUtil.INSTANCE.showToast(wzi.j9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$5(AudioWatchBatchActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<WatchRecordBean> list = this$0.dataList;
        StringBuilder sb = new StringBuilder();
        sb.append("datalist ");
        sb.append(list);
        if (!this$0.dataList.isEmpty() && this$0.isAllPulled()) {
            ToastUtil.INSTANCE.showToast(wzi.j9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bindView$lambda$7(AudioWatchBatchActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<WatchRecordBean> list = this$0.selectDataList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((WatchRecordBean) it.next()).getFile());
        }
        ((AudioRecordViewModel) this$0.getMViewModel()).requestFiles((wkf[]) arrayList.toArray(new wkf[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$8(AudioWatchBatchActivity this$0, Pair pair) {
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
    public static final Unit bindView$lambda$9(AudioWatchBatchActivity this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bool.booleanValue()) {
            this$0.setResult(-1);
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dialogDismiss() {
        DownloadFileDialog downloadFileDialog = this.mDialog;
        if (downloadFileDialog != null) {
            downloadFileDialog.dismissAllowingStateLoss();
        }
    }

    private final boolean isAllPulled() {
        List<WatchRecordBean> list = this.dataList;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((WatchRecordBean) it.next()).isPull()) {
                return false;
            }
        }
        return true;
    }

    private final void showDownloadDialog() {
        DownloadFileDialog downloadFileDialog;
        if (this.mDialog == null) {
            this.mDialog = DownloadFileDialog.INSTANCE.defaultBuilder("download_file").create();
        }
        DownloadFileDialog downloadFileDialog2 = this.mDialog;
        if ((downloadFileDialog2 == null || !downloadFileDialog2.isShowing()) && (downloadFileDialog = this.mDialog) != null) {
            downloadFileDialog.showIfNeed(getSupportFragmentManager());
        }
    }

    private final void updateSaveButtonState() {
        Button saveBtn = getMBinding().F;
        Intrinsics.checkNotNullExpressionValue(saveBtn, "saveBtn");
        ExtUtilsKt.setVisible(saveBtn, !isAllPulled());
        Button allSavedBtn = getMBinding().A;
        Intrinsics.checkNotNullExpressionValue(allSavedBtn, "allSavedBtn");
        ExtUtilsKt.setVisible(allSavedBtn, isAllPulled());
        Button saveBtn2 = getMBinding().F;
        Intrinsics.checkNotNullExpressionValue(saveBtn2, "saveBtn");
        if (ExtUtilsKt.isVisible(saveBtn2)) {
            getMBinding().F.setEnabled(!this.selectDataList.isEmpty());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull nd6 nd6Var) {
        Intrinsics.checkNotNullParameter(nd6Var, "<this>");
        setTitle(wzi.v0);
        setTitleBackground(cji.y);
        ((AudioRecordViewModel) getMViewModel()).register(this, true);
        nd6Var.E.setLayoutManager(new LinearLayoutManager(this));
        nd6Var.E.addItemDecoration(new LinearItemSpace(ExtUtilsKt.getDp(12), false, false, 6, null));
        this.dataList.clear();
        ((AudioRecordViewModel) getMViewModel()).updateRecordData(WatchPullDataManager.INSTANCE.get());
        WatchListAdapter watchListAdapter = new WatchListAdapter(this, true, this.dataList, this.selectDataList, new Function1() { // from class: bq1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioWatchBatchActivity.bindView$lambda$0(this.f4477a, (WatchRecordBean) obj);
            }
        });
        this.watchListAdapter = watchListAdapter;
        nd6Var.E.setAdapter(watchListAdapter);
        ((AudioRecordViewModel) getMViewModel()).getDataListLiveData().observe(this, new AudioWatchBatchActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: cq1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioWatchBatchActivity.bindView$lambda$1(this.f14609a, (List) obj);
            }
        }));
        IActionBar.DefaultImpls.setEndView$default(this, 0, jni.h, getString(wzi.Ne), new View.OnClickListener() { // from class: dq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioWatchBatchActivity.bindView$lambda$4(this.f15800a, view);
            }
        }, 1, null);
        nd6Var.A.setOnClickListener(new View.OnClickListener() { // from class: eq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioWatchBatchActivity.bindView$lambda$5(this.f16949a, view);
            }
        });
        nd6Var.F.setOnClickListener(new View.OnClickListener() { // from class: fq1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioWatchBatchActivity.bindView$lambda$7(this.f18073a, view);
            }
        });
        ((AudioRecordViewModel) getMViewModel()).getProgress().observe(this, new AudioWatchBatchActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: gq1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioWatchBatchActivity.bindView$lambda$8(this.f19224a, (Pair) obj);
            }
        }));
        ((AudioRecordViewModel) getMViewModel()).getUploadEnd().observe(this, new AudioWatchBatchActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: hq1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AudioWatchBatchActivity.bindView$lambda$9(this.f20329a, (Boolean) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return eui.j;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(this.onDeviceStatusListener);
        UIUtils uIUtils = UIUtils.INSTANCE;
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        uIUtils.hideSystemUI(window);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((AudioRecordViewModel) getMViewModel()).unRegister(this, true);
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceStatusListener(this.onDeviceStatusListener);
    }
}
