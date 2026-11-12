package com.xiaomi.fitness.watch.face;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.view.BaseBindingFragment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.v2.onetrack.HealthTabOneTrackExtKt;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;
import com.xiaomi.fitness.watch.face.helper.FaceLowLatencyRequester;
import com.xiaomi.fitness.watch.face.view.FaceColorPickView;
import com.xiaomi.fitness.watch.face.view.FaceLayerFunView;
import com.xiaomi.onetrack.OneTrack;
import defpackage.av6;
import defpackage.isi;
import defpackage.ld8;
import defpackage.noi;
import defpackage.orf;
import defpackage.ovi;
import defpackage.p1j;
import defpackage.rv1;
import defpackage.uno;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\f\b&\u0018\u0000 ²\u0001*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u00020\u0006:\u0002²\u0001B&\u0012\b\u0010«\u0001\u001a\u00030§\u0001\u0012\b\u0010¬\u0001\u001a\u00030§\u0001\u0012\u0007\u0010\u00ad\u0001\u001a\u00020\u0012¢\u0006\u0006\b®\u0001\u0010¯\u0001B\u001f\b\u0016\u0012\b\u0010«\u0001\u001a\u00030§\u0001\u0012\b\u0010°\u0001\u001a\u00030§\u0001¢\u0006\u0006\b®\u0001\u0010±\u0001B\n\b\u0016¢\u0006\u0005\b®\u0001\u0010\u0011J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0004¢\u0006\u0004\b\u0018\u0010\u0011J!\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0004¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\tH\u0004¢\u0006\u0004\b\u001b\u0010\u0011J\u000f\u0010\u001c\u001a\u00020\tH\u0004¢\u0006\u0004\b\u001c\u0010\u0011J\u000f\u0010\u001d\u001a\u00020\tH\u0004¢\u0006\u0004\b\u001d\u0010\u0011J\u000f\u0010\u001e\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001f\u0010\u0011J\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0012H\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\tH\u0016¢\u0006\u0004\b'\u0010\u0011J\u000f\u0010(\u001a\u00020\tH\u0004¢\u0006\u0004\b(\u0010\u0011J\u000f\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010\u0011J\u000f\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b*\u0010\u0011R\"\u0010+\u001a\u00020\u00128\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u0010!R\"\u00100\u001a\u00020\u00128\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.\"\u0004\b2\u0010!R\"\u00103\u001a\u00020\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010:\u001a\u0004\u0018\u0001098\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010A\u001a\u0004\u0018\u00010@8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010G\u001a\u00020@8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bG\u0010B\u001a\u0004\bH\u0010D\"\u0004\bI\u0010FR\"\u0010J\u001a\u00020\f8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010P\u001a\u00020\f8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR\"\u0010S\u001a\u00020@8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bS\u0010B\u001a\u0004\bT\u0010D\"\u0004\bU\u0010FR\"\u0010W\u001a\u00020V8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010^\u001a\u00020]8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010e\u001a\u00020d8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR\"\u0010k\u001a\u00020@8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bk\u0010B\u001a\u0004\bl\u0010D\"\u0004\bm\u0010FR\"\u0010n\u001a\u00020@8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\bn\u0010B\u001a\u0004\bo\u0010D\"\u0004\bp\u0010FR\"\u0010r\u001a\u00020q8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR$\u0010x\u001a\u0004\u0018\u00010@8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bx\u0010B\u001a\u0004\by\u0010D\"\u0004\bz\u0010FR&\u0010|\u001a\u0004\u0018\u00010{8\u0004@\u0004X\u0084\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R*\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0004@\u0004X\u0084.¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R,\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R,\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R&\u0010\u0097\u0001\u001a\u00020\u00128\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b\u0097\u0001\u0010,\u001a\u0005\b\u0097\u0001\u0010.\"\u0005\b\u0098\u0001\u0010!R\u001a\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R*\u0010\u009c\u0001\u001a\u00030\u0099\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009b\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R*\u0010¡\u0001\u001a\u00030\u0099\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010\u009b\u0001\u001a\u0006\b¢\u0001\u0010\u009e\u0001\"\u0006\b£\u0001\u0010 \u0001R*\u0010¤\u0001\u001a\u00030\u0099\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b¤\u0001\u0010\u009b\u0001\u001a\u0006\b¥\u0001\u0010\u009e\u0001\"\u0006\b¦\u0001\u0010 \u0001R\u0018\u0010ª\u0001\u001a\u00030§\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001¨\u0006³\u0001"}, d2 = {"Lcom/xiaomi/fitness/watch/face/FaceInfoBase;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "VM", "Landroidx/databinding/ViewDataBinding;", "VDB", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Landroid/view/View$OnClickListener;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setButton1", "()V", "", "isSuccess", "", Constants.EXTRA_ERROR_MESSAGE, "dotFaceDownloadFinish", "(ZLjava/lang/String;)V", "dotFaceInstallStart", "success", "doFaceInstallFinish", "doFaceSwitchFinish", "doFaceDeleteFinish", "doFaceBrowseDetailFinish", "setImageView", "setFace", "onFaceSet", "(Z)V", "Lorf;", "event", "onDataEvent", "(Lorf;)V", "onMessageEvent", LifecycleConstantKt.ON_DESTROY, "hideDelayLoading", "requestLowLatency", "stopLowLatency", "mFromMore", "Z", "getMFromMore", "()Z", "setMFromMore", "mInstalled", "getMInstalled", "setMInstalled", FaceInfoBase.FACE_ID, "Ljava/lang/String;", "getFaceId", "()Ljava/lang/String;", "setFaceId", "(Ljava/lang/String;)V", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "mInfo", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "getMInfo", "()Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "setMInfo", "(Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;)V", "Landroid/widget/TextView;", "actionUseView", "Landroid/widget/TextView;", "getActionUseView", "()Landroid/widget/TextView;", "setActionUseView", "(Landroid/widget/TextView;)V", "actionDelView", "getActionDelView", "setActionDelView", "emptyView", "Landroid/view/View;", "getEmptyView", "()Landroid/view/View;", "setEmptyView", "(Landroid/view/View;)V", "applyMargin", "getApplyMargin", "setApplyMargin", "mSizeAuthorView", "getMSizeAuthorView", "setMSizeAuthorView", "Lcom/xiaomi/fitness/watch/face/export/exportview/FaceIcon;", "mImageView", "Lcom/xiaomi/fitness/watch/face/export/exportview/FaceIcon;", "getMImageView", "()Lcom/xiaomi/fitness/watch/face/export/exportview/FaceIcon;", "setMImageView", "(Lcom/xiaomi/fitness/watch/face/export/exportview/FaceIcon;)V", "Lcom/xiaomi/fitness/watch/face/export/exportview/FaceInfoView;", "styleView", "Lcom/xiaomi/fitness/watch/face/export/exportview/FaceInfoView;", "getStyleView", "()Lcom/xiaomi/fitness/watch/face/export/exportview/FaceInfoView;", "setStyleView", "(Lcom/xiaomi/fitness/watch/face/export/exportview/FaceInfoView;)V", "Lcom/xiaomi/fitness/watch/face/view/FaceLayerFunView;", "funView", "Lcom/xiaomi/fitness/watch/face/view/FaceLayerFunView;", "getFunView", "()Lcom/xiaomi/fitness/watch/face/view/FaceLayerFunView;", "setFunView", "(Lcom/xiaomi/fitness/watch/face/view/FaceLayerFunView;)V", "mDescView", "getMDescView", "setMDescView", "mNameView", "getMNameView", "setMNameView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "imgLabelView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getImgLabelView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setImgLabelView", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "paletteView", "getPaletteView", "setPaletteView", "Lcom/xiaomi/fitness/watch/face/view/FaceColorPickView;", "bgColorsView", "Lcom/xiaomi/fitness/watch/face/view/FaceColorPickView;", "getBgColorsView", "()Lcom/xiaomi/fitness/watch/face/view/FaceColorPickView;", "setBgColorsView", "(Lcom/xiaomi/fitness/watch/face/view/FaceColorPickView;)V", "Landroid/widget/ImageView;", "outlineView", "Landroid/widget/ImageView;", "getOutlineView", "()Landroid/widget/ImageView;", "setOutlineView", "(Landroid/widget/ImageView;)V", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "mDeviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "getMDeviceModel", "()Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "setMDeviceModel", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;)V", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "mRequestData", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "getMRequestData", "()Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "setMRequestData", "(Lcom/xiaomi/fitness/watch/face/export/data/FaceData;)V", "isScreenOffWatchFace", "setScreenOffWatchFace", "", "mInstallFaceStartTime", "J", "mBrowseFaceStartTime", "getMBrowseFaceStartTime", "()J", "setMBrowseFaceStartTime", "(J)V", "mDownloadFaceStartTime", "getMDownloadFaceStartTime", "setMDownloadFaceStartTime", "initLoadingTime", "getInitLoadingTime", "setInitLoadingTime", "", "getLayoutId", "()I", "layoutId", "contentLayoutId", "mViewModelId", "sharedViewModel", "<init>", "(IIZ)V", "viewModelId", "(II)V", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFaceInfoBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceInfoBase.kt\ncom/xiaomi/fitness/watch/face/FaceInfoBase\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,371:1\n54#2,3:372\n24#2:375\n59#2,6:376\n*S KotlinDebug\n*F\n+ 1 FaceInfoBase.kt\ncom/xiaomi/fitness/watch/face/FaceInfoBase\n*L\n248#1:372,3\n248#1:375\n248#1:376,6\n*E\n"})
public abstract class FaceInfoBase<VM extends AbsViewModel, VDB extends ViewDataBinding> extends BaseBindingFragment<VM, VDB> implements View.OnClickListener {

    @NotNull
    public static final String FACE_FROM = "face_from";

    @NotNull
    public static final String FACE_ID = "faceId";

    @NotNull
    public static final String FACE_INFO = "face_bean";
    public static final int FROM_LOCAL = 22;
    public static final int FROM_MORE = 11;

    @NotNull
    private static final String TAG = "FaceInfoBase";
    protected TextView actionDelView;

    @Nullable
    private TextView actionUseView;
    protected View applyMargin;

    @Nullable
    private FaceColorPickView bgColorsView;
    protected View emptyView;

    @NotNull
    private String faceId;
    protected FaceLayerFunView funView;
    protected ConstraintLayout imgLabelView;
    private long initLoadingTime;
    private boolean isScreenOffWatchFace;
    private long mBrowseFaceStartTime;
    protected TextView mDescView;

    @Nullable
    private WearableDeviceModel mDeviceModel;
    private long mDownloadFaceStartTime;
    private boolean mFromMore;
    protected FaceIcon mImageView;

    @Nullable
    private WatchFace mInfo;
    private long mInstallFaceStartTime;
    private boolean mInstalled;
    protected TextView mNameView;

    @Nullable
    private FaceData mRequestData;
    protected TextView mSizeAuthorView;
    protected ImageView outlineView;

    @Nullable
    private TextView paletteView;
    protected FaceInfoView styleView;

    public FaceInfoBase(int i, int i2, boolean z) {
        super(i, i2, z);
        this.faceId = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideDelayLoading$lambda$2(FaceInfoBase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(FaceInfoBase this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onClick(view);
    }

    public final void doFaceBrowseDetailFinish() {
        String id;
        String name;
        String tabName;
        String model;
        String firmwareVersion;
        if (this.mBrowseFaceStartTime <= 0) {
            Logger.i("doFaceBrowseDetailFinish mBrowseFaceStartTime <= 0", new Object[0]);
            return;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.mBrowseFaceStartTime) / ((long) 1000);
        this.mBrowseFaceStartTime = 0L;
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("c_pa_v3", "56.47.1.1.19539");
        Object[] objArr = new Object[16];
        objArr[0] = "name";
        objArr[1] = "watchface_detail_page";
        objArr[2] = "duration_sec";
        objArr[3] = Long.valueOf(jCurrentTimeMillis);
        objArr[4] = "asset_id";
        WatchFace watchFace = this.mInfo;
        String str = "";
        if (watchFace == null || (id = watchFace.getId()) == null) {
            id = "";
        }
        objArr[5] = id;
        objArr[6] = OneTrack.Param.ASSET_NAME;
        WatchFace watchFace2 = this.mInfo;
        if (watchFace2 == null || (name = watchFace2.getName()) == null) {
            name = "";
        }
        objArr[7] = name;
        objArr[8] = HealthTabOneTrackExtKt.KEY_TYPE_NUM;
        WatchFace watchFace3 = this.mInfo;
        objArr[9] = Integer.valueOf(watchFace3 != null ? watchFace3.getTabId() : 0);
        objArr[10] = "type_str";
        WatchFace watchFace4 = this.mInfo;
        if (watchFace4 == null || (tabName = watchFace4.getTabName()) == null) {
            tabName = "";
        }
        objArr[11] = tabName;
        objArr[12] = "device_model";
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        objArr[13] = model;
        objArr[14] = "device_version";
        WearableDeviceModel wearableDeviceModel2 = this.mDeviceModel;
        if (wearableDeviceModel2 != null && (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel2)) != null) {
            str = firmwareVersion;
        }
        objArr[15] = str;
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
    }

    public final void doFaceDeleteFinish() {
        String id;
        String name;
        String model;
        String firmwareVersion;
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("connect_v3", "56.47.1.1.19531");
        Object[] objArr = new Object[10];
        objArr[0] = "name";
        objArr[1] = "watchface_delete";
        objArr[2] = "asset_id";
        WatchFace watchFace = this.mInfo;
        String str = "";
        if (watchFace == null || (id = watchFace.getId()) == null) {
            id = "";
        }
        objArr[3] = id;
        objArr[4] = OneTrack.Param.ASSET_NAME;
        WatchFace watchFace2 = this.mInfo;
        if (watchFace2 == null || (name = watchFace2.getName()) == null) {
            name = "";
        }
        objArr[5] = name;
        objArr[6] = "device_model";
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        objArr[7] = model;
        objArr[8] = "device_version";
        WearableDeviceModel wearableDeviceModel2 = this.mDeviceModel;
        if (wearableDeviceModel2 != null && (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel2)) != null) {
            str = firmwareVersion;
        }
        objArr[9] = str;
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
    }

    public final void doFaceInstallFinish(boolean success, @Nullable String errorMsg) {
        String id;
        String name;
        String tabName;
        String model;
        String firmwareVersion;
        WearableDeviceInfo deviceInfo;
        WearableDeviceInfo deviceInfo2;
        if (this.mInstallFaceStartTime == 0) {
            Logger.i(TAG, "dotFaceInstallFinish startTime = 0");
            return;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.mInstallFaceStartTime) / ((long) 1000);
        this.mInstallFaceStartTime = 0L;
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        String name2 = null;
        String model2 = (wearableDeviceModel == null || (deviceInfo2 = wearableDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo2.getModel();
        WearableDeviceModel wearableDeviceModel2 = this.mDeviceModel;
        if (wearableDeviceModel2 != null && (deviceInfo = wearableDeviceModel2.getDeviceInfo()) != null) {
            name2 = deviceInfo.getName();
        }
        Logger.i(TAG, "dotFaceInstall finish " + model2 + " " + name2 + " cost " + jCurrentTimeMillis + "ms");
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("connect_v3", "56.47.1.1.19519");
        Object[] objArr = new Object[22];
        objArr[0] = "name";
        objArr[1] = "watchface_setup";
        objArr[2] = "result";
        objArr[3] = Boolean.valueOf(success);
        objArr[4] = "error_info";
        String str = "";
        if (errorMsg == null) {
            errorMsg = "";
        }
        objArr[5] = errorMsg;
        objArr[6] = "duration_sec";
        objArr[7] = Long.valueOf(jCurrentTimeMillis);
        objArr[8] = "test_type";
        FaceData faceData = this.mRequestData;
        objArr[9] = Integer.valueOf((faceData == null || !faceData.canPurchase()) ? 0 : 1);
        objArr[10] = "asset_id";
        WatchFace watchFace = this.mInfo;
        if (watchFace == null || (id = watchFace.getId()) == null) {
            id = "";
        }
        objArr[11] = id;
        objArr[12] = OneTrack.Param.ASSET_NAME;
        WatchFace watchFace2 = this.mInfo;
        if (watchFace2 == null || (name = watchFace2.getName()) == null) {
            name = "";
        }
        objArr[13] = name;
        objArr[14] = HealthTabOneTrackExtKt.KEY_TYPE_NUM;
        WatchFace watchFace3 = this.mInfo;
        objArr[15] = Integer.valueOf(watchFace3 != null ? watchFace3.getTabId() : 0);
        objArr[16] = "type_str";
        WatchFace watchFace4 = this.mInfo;
        if (watchFace4 == null || (tabName = watchFace4.getTabName()) == null) {
            tabName = "";
        }
        objArr[17] = tabName;
        objArr[18] = "device_model";
        WearableDeviceModel wearableDeviceModel3 = this.mDeviceModel;
        if (wearableDeviceModel3 == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel3)) == null) {
            model = "";
        }
        objArr[19] = model;
        objArr[20] = "device_version";
        WearableDeviceModel wearableDeviceModel4 = this.mDeviceModel;
        if (wearableDeviceModel4 != null && (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel4)) != null) {
            str = firmwareVersion;
        }
        objArr[21] = str;
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
    }

    public final void doFaceSwitchFinish() {
        String id;
        String name;
        String model;
        String firmwareVersion;
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("connect_v3", "56.47.1.1.19526");
        Object[] objArr = new Object[10];
        objArr[0] = "name";
        objArr[1] = "watchface_switch";
        objArr[2] = "asset_id";
        WatchFace watchFace = this.mInfo;
        String str = "";
        if (watchFace == null || (id = watchFace.getId()) == null) {
            id = "";
        }
        objArr[3] = id;
        objArr[4] = OneTrack.Param.ASSET_NAME;
        WatchFace watchFace2 = this.mInfo;
        if (watchFace2 == null || (name = watchFace2.getName()) == null) {
            name = "";
        }
        objArr[5] = name;
        objArr[6] = "device_model";
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        objArr[7] = model;
        objArr[8] = "device_version";
        WearableDeviceModel wearableDeviceModel2 = this.mDeviceModel;
        if (wearableDeviceModel2 != null && (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel2)) != null) {
            str = firmwareVersion;
        }
        objArr[9] = str;
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
    }

    public final void dotFaceDownloadFinish(boolean isSuccess, @Nullable String errorMsg) {
        String id;
        String name;
        String tabName;
        String model;
        String firmwareVersion;
        if (this.mDownloadFaceStartTime == 0) {
            Logger.d(TAG, "dotFaceDownloadFinish startTime = 0");
            return;
        }
        Logger.i(TAG, "dotFaceDownloadFinish");
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.mDownloadFaceStartTime) / ((long) 1000);
        this.mDownloadFaceStartTime = 0L;
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("connect_v3", "56.47.1.1.19520");
        Object[] objArr = new Object[22];
        objArr[0] = "name";
        objArr[1] = "watchface_download";
        objArr[2] = "result";
        objArr[3] = Boolean.valueOf(isSuccess);
        objArr[4] = "error_info";
        String str = "";
        if (errorMsg == null) {
            errorMsg = "";
        }
        objArr[5] = errorMsg;
        objArr[6] = "duration_sec";
        objArr[7] = Long.valueOf(jCurrentTimeMillis);
        objArr[8] = "test_type";
        FaceData faceData = this.mRequestData;
        objArr[9] = Integer.valueOf((faceData == null || !faceData.canPurchase()) ? 0 : 1);
        objArr[10] = "asset_id";
        WatchFace watchFace = this.mInfo;
        if (watchFace == null || (id = watchFace.getId()) == null) {
            id = "";
        }
        objArr[11] = id;
        objArr[12] = OneTrack.Param.ASSET_NAME;
        WatchFace watchFace2 = this.mInfo;
        if (watchFace2 == null || (name = watchFace2.getName()) == null) {
            name = "";
        }
        objArr[13] = name;
        objArr[14] = HealthTabOneTrackExtKt.KEY_TYPE_NUM;
        WatchFace watchFace3 = this.mInfo;
        objArr[15] = Integer.valueOf(watchFace3 != null ? watchFace3.getTabId() : 0);
        objArr[16] = "type_str";
        WatchFace watchFace4 = this.mInfo;
        if (watchFace4 == null || (tabName = watchFace4.getTabName()) == null) {
            tabName = "";
        }
        objArr[17] = tabName;
        objArr[18] = "device_model";
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        if (wearableDeviceModel == null || (model = DeviceModelExtKt.getModel(wearableDeviceModel)) == null) {
            model = "";
        }
        objArr[19] = model;
        objArr[20] = "device_version";
        WearableDeviceModel wearableDeviceModel2 = this.mDeviceModel;
        if (wearableDeviceModel2 != null && (firmwareVersion = DeviceModelExtKt.getFirmwareVersion(wearableDeviceModel2)) != null) {
            str = firmwareVersion;
        }
        objArr[21] = str;
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
    }

    public final void dotFaceInstallStart() {
        WearableDeviceInfo deviceInfo;
        WearableDeviceInfo deviceInfo2;
        this.mInstallFaceStartTime = System.currentTimeMillis();
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        String name = null;
        String model = (wearableDeviceModel == null || (deviceInfo2 = wearableDeviceModel.getDeviceInfo()) == null) ? null : deviceInfo2.getModel();
        WearableDeviceModel wearableDeviceModel2 = this.mDeviceModel;
        if (wearableDeviceModel2 != null && (deviceInfo = wearableDeviceModel2.getDeviceInfo()) != null) {
            name = deviceInfo.getName();
        }
        Logger.i(TAG, "dotFaceInstall start " + model + " " + name + " " + this.mInstallFaceStartTime);
    }

    @NotNull
    public final TextView getActionDelView() {
        TextView textView = this.actionDelView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("actionDelView");
        return null;
    }

    @Nullable
    public final TextView getActionUseView() {
        return this.actionUseView;
    }

    @NotNull
    public final View getApplyMargin() {
        View view = this.applyMargin;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("applyMargin");
        return null;
    }

    @Nullable
    public final FaceColorPickView getBgColorsView() {
        return this.bgColorsView;
    }

    @NotNull
    public final View getEmptyView() {
        View view = this.emptyView;
        if (view != null) {
            return view;
        }
        Intrinsics.throwUninitializedPropertyAccessException("emptyView");
        return null;
    }

    @NotNull
    public final String getFaceId() {
        return this.faceId;
    }

    @NotNull
    public final FaceLayerFunView getFunView() {
        FaceLayerFunView faceLayerFunView = this.funView;
        if (faceLayerFunView != null) {
            return faceLayerFunView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("funView");
        return null;
    }

    @NotNull
    public final ConstraintLayout getImgLabelView() {
        ConstraintLayout constraintLayout = this.imgLabelView;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imgLabelView");
        return null;
    }

    public final long getInitLoadingTime() {
        return this.initLoadingTime;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return ovi.e0;
    }

    public final long getMBrowseFaceStartTime() {
        return this.mBrowseFaceStartTime;
    }

    @NotNull
    public final TextView getMDescView() {
        TextView textView = this.mDescView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDescView");
        return null;
    }

    @Nullable
    public final WearableDeviceModel getMDeviceModel() {
        return this.mDeviceModel;
    }

    public final long getMDownloadFaceStartTime() {
        return this.mDownloadFaceStartTime;
    }

    public final boolean getMFromMore() {
        return this.mFromMore;
    }

    @NotNull
    public final FaceIcon getMImageView() {
        FaceIcon faceIcon = this.mImageView;
        if (faceIcon != null) {
            return faceIcon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mImageView");
        return null;
    }

    @Nullable
    public final WatchFace getMInfo() {
        return this.mInfo;
    }

    public final boolean getMInstalled() {
        return this.mInstalled;
    }

    @NotNull
    public final TextView getMNameView() {
        TextView textView = this.mNameView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mNameView");
        return null;
    }

    @Nullable
    public final FaceData getMRequestData() {
        return this.mRequestData;
    }

    @NotNull
    public final TextView getMSizeAuthorView() {
        TextView textView = this.mSizeAuthorView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mSizeAuthorView");
        return null;
    }

    @NotNull
    public final ImageView getOutlineView() {
        ImageView imageView = this.outlineView;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("outlineView");
        return null;
    }

    @Nullable
    public final TextView getPaletteView() {
        return this.paletteView;
    }

    @NotNull
    public final FaceInfoView getStyleView() {
        FaceInfoView faceInfoView = this.styleView;
        if (faceInfoView != null) {
            return faceInfoView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("styleView");
        return null;
    }

    public final void hideDelayLoading() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.initLoadingTime;
        if (jCurrentTimeMillis > 700) {
            hideLoading();
            return;
        }
        TextView textView = this.actionUseView;
        if (textView != null) {
            textView.postDelayed(new Runnable() { // from class: ty8
                @Override // java.lang.Runnable
                public final void run() {
                    FaceInfoBase.hideDelayLoading$lambda$2(this.f35179a);
                }
            }, jCurrentTimeMillis);
        }
    }

    /* JADX INFO: renamed from: isScreenOffWatchFace, reason: from getter */
    public final boolean getIsScreenOffWatchFace() {
        return this.isScreenOffWatchFace;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String string;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(FACE_ID)) == null) {
            string = "";
        }
        this.faceId = string;
        if (string.length() == 0) {
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, p1j.common_hint_unkonwn_error);
            }
            finish();
            return;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            Context context2 = getContext();
            if (context2 != null) {
                ToastExtKt.toastShort(context2, p1j.common_hint_device_removed);
            }
            finish();
            return;
        }
        this.mDeviceModel = wearableDeviceModel;
        this.mInfo = FaceManager.INSTANCE.getFace(this.faceId);
        boolean z = false;
        if (arguments != null && arguments.getInt(FACE_FROM, 22) == 11) {
            z = true;
        }
        this.mFromMore = z;
        if (ld8.c().j(this)) {
            return;
        }
        ld8.c().p(this);
    }

    @uno(threadMode = ThreadMode.MAIN)
    public final void onDataEvent(@NotNull orf event) {
        Intrinsics.checkNotNullParameter(event, "event");
        onMessageEvent(event);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ld8.c().r(this);
    }

    public void onFaceSet(boolean success) {
        if (isInvalid()) {
            return;
        }
        Logger.d(TAG, "onFaceSet: " + success);
        hideLoading();
        if (success) {
            TextView textView = this.actionUseView;
            if (textView != null) {
                textView.setEnabled(false);
            }
            FaceManager.INSTANCE.changeCurFace(this.mInfo);
            return;
        }
        Context context = getContext();
        if (context != null) {
            ToastExtKt.toastShort(context, p1j.common_set_error);
        }
    }

    public void onMessageEvent(@NotNull orf event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Context context;
        WearableDeviceModel wearableDeviceModel;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.actionUseView = (TextView) getMBinding().getRoot().findViewById(isi.f22049b);
        setOutlineView((ImageView) getMBinding().getRoot().findViewById(isi.n1));
        setMSizeAuthorView((TextView) getMBinding().getRoot().findViewById(isi.Z0));
        setMNameView((TextView) getMBinding().getRoot().findViewById(isi.V0));
        setMImageView((FaceIcon) getMBinding().getRoot().findViewById(isi.T0));
        setMDescView((TextView) getMBinding().getRoot().findViewById(isi.S0));
        WearableDeviceModel wearableDeviceModel2 = this.mDeviceModel;
        if (wearableDeviceModel2 == null) {
            return;
        }
        setTitle((wearableDeviceModel2 == null || !DeviceModelExtKt.isBandType(wearableDeviceModel2)) ? p1j.g0 : p1j.f0);
        TextView mNameView = getMNameView();
        WatchFace watchFace = this.mInfo;
        mNameView.setText(watchFace != null ? watchFace.getName() : null);
        setImageView();
        this.mInstalled = FaceManager.INSTANCE.isInstalled(this.faceId);
        TextView textView = this.actionUseView;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: sy8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    FaceInfoBase.onViewCreated$lambda$0(this.f34100a, view2);
                }
            });
        }
        WearableDeviceModel wearableDeviceModel3 = this.mDeviceModel;
        if ((wearableDeviceModel3 == null || !wearableDeviceModel3.getIsCurrent() || (wearableDeviceModel = this.mDeviceModel) == null || !wearableDeviceModel.getIsDeviceConnected()) && (context = getContext()) != null) {
            ToastExtKt.toastShort(context, p1j.f);
        }
    }

    public void requestLowLatency() {
        FaceLowLatencyRequester.INSTANCE.startTimer();
    }

    public final void setActionDelView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.actionDelView = textView;
    }

    public final void setActionUseView(@Nullable TextView textView) {
        this.actionUseView = textView;
    }

    public final void setApplyMargin(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.applyMargin = view;
    }

    public final void setBgColorsView(@Nullable FaceColorPickView faceColorPickView) {
        this.bgColorsView = faceColorPickView;
    }

    public void setButton1() {
    }

    public final void setEmptyView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.emptyView = view;
    }

    public void setFace() {
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        if (wearableDeviceModel == null || !wearableDeviceModel.getIsDeviceConnected()) {
            new CommonDialog.c("set_face_device_disconnect").setDialogTitle(p1j.q).setDialogDescription(p1j.p).setPositiveText(p1j.d).setNegativeText(p1j.c).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.FaceInfoBase.setFace.1
                @Override // defpackage.av6
                public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                    super.onDialogClick(dialogName, dialog, which);
                    if (which == -2) {
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                    } else if (which == -1 && dialog != null) {
                        dialog.dismiss();
                    }
                }
            }).showIfNeed(getChildFragmentManager());
        } else {
            showLoading();
        }
    }

    public final void setFaceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.faceId = str;
    }

    public final void setFunView(@NotNull FaceLayerFunView faceLayerFunView) {
        Intrinsics.checkNotNullParameter(faceLayerFunView, "<set-?>");
        this.funView = faceLayerFunView;
    }

    public void setImageView() {
        WearableDeviceModel wearableDeviceModel = this.mDeviceModel;
        String deviceIconUrl = wearableDeviceModel != null ? DeviceModelExtKt.getDeviceIconUrl(wearableDeviceModel, 2) : null;
        int i = noi.P;
        WearableDeviceModel wearableDeviceModel2 = this.mDeviceModel;
        if (wearableDeviceModel2 != null && DeviceModelExtKt.isBandType(wearableDeviceModel2)) {
            i = noi.O;
        }
        ImageView outlineView = getOutlineView();
        ImageLoader imageLoader = Coil.imageLoader(outlineView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(outlineView.getContext()).data(deviceIconUrl).target(outlineView);
        builderTarget.placeholder(i);
        imageLoader.enqueue(builderTarget.build());
        FaceManager.INSTANCE.loadFaceBean(this.mInfo, getMImageView(), (108 & 4) != 0 ? false : true, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : false);
    }

    public final void setImgLabelView(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.imgLabelView = constraintLayout;
    }

    public final void setInitLoadingTime(long j) {
        this.initLoadingTime = j;
    }

    public final void setMBrowseFaceStartTime(long j) {
        this.mBrowseFaceStartTime = j;
    }

    public final void setMDescView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mDescView = textView;
    }

    public final void setMDeviceModel(@Nullable WearableDeviceModel wearableDeviceModel) {
        this.mDeviceModel = wearableDeviceModel;
    }

    public final void setMDownloadFaceStartTime(long j) {
        this.mDownloadFaceStartTime = j;
    }

    public final void setMFromMore(boolean z) {
        this.mFromMore = z;
    }

    public final void setMImageView(@NotNull FaceIcon faceIcon) {
        Intrinsics.checkNotNullParameter(faceIcon, "<set-?>");
        this.mImageView = faceIcon;
    }

    public final void setMInfo(@Nullable WatchFace watchFace) {
        this.mInfo = watchFace;
    }

    public final void setMInstalled(boolean z) {
        this.mInstalled = z;
    }

    public final void setMNameView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mNameView = textView;
    }

    public final void setMRequestData(@Nullable FaceData faceData) {
        this.mRequestData = faceData;
    }

    public final void setMSizeAuthorView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mSizeAuthorView = textView;
    }

    public final void setOutlineView(@NotNull ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.outlineView = imageView;
    }

    public final void setPaletteView(@Nullable TextView textView) {
        this.paletteView = textView;
    }

    public final void setScreenOffWatchFace(boolean z) {
        this.isScreenOffWatchFace = z;
    }

    public final void setStyleView(@NotNull FaceInfoView faceInfoView) {
        Intrinsics.checkNotNullParameter(faceInfoView, "<set-?>");
        this.styleView = faceInfoView;
    }

    public void stopLowLatency() {
        FaceLowLatencyRequester.INSTANCE.reset();
    }

    public FaceInfoBase(int i, int i2) {
        this(i, i2, false);
    }

    public FaceInfoBase() {
        this(-1, rv1.f32936a, false);
    }
}
