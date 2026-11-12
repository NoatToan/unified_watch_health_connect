package com.xiaomi.fitness.watch.face;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.memory.MemoryCache;
import coil.request.ImageRequest;
import com.mi.fitness.checkupdate.ui.huami.HuamiUpgradeFragment;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.mibi.sdk.component.Constants;
import com.tencent.wcdb.FileUtils;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.baseui.recyclerview.StateData;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.NetUtil;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainTab;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.watch.face.FaceInfoHMFragment;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.db.FaceBleMultiPhoto;
import com.xiaomi.fitness.watch.face.db.FaceCommonEntity;
import com.xiaomi.fitness.watch.face.db.WatchFaceDao;
import com.xiaomi.fitness.watch.face.db.WatchFaceDataBase;
import com.xiaomi.fitness.watch.face.event.FaceDeleteEvent;
import com.xiaomi.fitness.watch.face.event.FaceInstallEvent;
import com.xiaomi.fitness.watch.face.event.FaceReSycEvent;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.export.exportview.FaceInfoView;
import com.xiaomi.fitness.watch.face.ext.FaceExtKt;
import com.xiaomi.fitness.watch.face.impl.Callback;
import com.xiaomi.fitness.watch.face.view.FaceColorPickView;
import com.xiaomi.fitness.watch.face.viewmodel.FaceBleInfoViewModelKt;
import com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel;
import com.xiaomi.fitness.watch.face.widget.FaceDialog;
import com.xiaomi.fitness.watch.face.widget.PhotoBgPicker;
import defpackage.av6;
import defpackage.gyi;
import defpackage.isi;
import defpackage.l6a;
import defpackage.ld8;
import defpackage.orf;
import defpackage.p1j;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\bv\u0010\fJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\fJ\u000f\u0010\u0018\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\fJ\u001d\u0010\u001b\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\fJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001eH\u0002¢\u0006\u0004\b#\u0010!J\u001f\u0010%\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001eH\u0002¢\u0006\u0004\b'\u0010!J\u0017\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u001eH\u0002¢\u0006\u0004\b-\u0010!J\u0017\u0010/\u001a\u00020\n2\u0006\u0010)\u001a\u00020.H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\nH\u0002¢\u0006\u0004\b1\u0010\fJ\u000f\u00102\u001a\u00020\nH\u0002¢\u0006\u0004\b2\u0010\fJ!\u00107\u001a\u00020\n2\u0006\u00104\u001a\u0002032\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\nH\u0014¢\u0006\u0004\b9\u0010\fJ\u000f\u0010:\u001a\u00020\nH\u0014¢\u0006\u0004\b:\u0010\fJ\u0019\u0010<\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b<\u0010=J/\u0010D\u001a\u00020\n2\u0006\u0010?\u001a\u00020>2\u000e\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0@2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ)\u0010H\u001a\u00020\n2\u0006\u0010?\u001a\u00020>2\u0006\u0010F\u001a\u00020>2\b\u0010\u000e\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020\n2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\nH\u0014¢\u0006\u0004\bN\u0010\fJ\u000f\u0010O\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u0010\fJ\u000f\u0010P\u001a\u00020\nH\u0016¢\u0006\u0004\bP\u0010\fR\u0014\u0010Q\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010T\u001a\u00020S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001b\u0010Z\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010RR\u0018\u0010\\\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010RR\u0016\u0010]\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010RR\u0016\u0010_\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR+\u0010i\u001a\u00020\u00042\u0006\u0010c\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010\u0006\"\u0004\bg\u0010hR\u0016\u0010j\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010bR#\u0010p\u001a\n l*\u0004\u0018\u00010k0k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010W\u001a\u0004\bn\u0010oR\u0016\u0010q\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u001c\u0010t\u001a\b\u0012\u0004\u0012\u00020\u001e0s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010u¨\u0006w"}, d2 = {"Lcom/xiaomi/fitness/watch/face/FaceInfoHMFragment;", "Lcom/xiaomi/fitness/watch/face/FaceInfoBase;", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceHMInfoViewModel;", "Ll6a;", "", "isSetChanged", "()Z", "spiritColorChanged", "bgImgChanged", "bgImgListChanged", "", "initEditData", "()V", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "data", "initDetailView", "(Lcom/xiaomi/fitness/watch/face/export/data/FaceData;)V", "initSelectView", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BleExt;", "ext", "setExtraPhotoFaceData", "(Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BleExt;)V", "initAodFace", "pickerColor", "installOrUpdate", "Lkotlin/Function0;", "action", "checkConnect", "(Lkotlin/jvm/functions/Function0;)V", "openGallery", "", "file", HuamiUpgradeFragment.DOWNLOAD_TAG, "(Ljava/lang/String;)V", "filePath", "doDownload", "needCheckStorage", "installBleFace", "(Ljava/lang/String;Z)V", "doInstallFace", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceHMInfoViewModel$DownloadRet;", Constants.KEY_PAY_RESULT_RET, "onDownload", "(Lcom/xiaomi/fitness/watch/face/viewmodel/FaceHMInfoViewModel$DownloadRet;)V", "path", "showFullDialog", "Lcom/xiaomi/fitness/watch/face/viewmodel/FaceHMInfoViewModel$InstallRet;", "onInstallRet", "(Lcom/xiaomi/fitness/watch/face/viewmodel/FaceHMInfoViewModel$InstallRet;)V", "dismissProgress", "onRealDismissDialog", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "setButton1", "setFace", "v", "onClick", "(Landroid/view/View;)V", "", AccountInteractActivity.KEY_REQUEST_CODE, "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "resultCode", "Landroid/content/Intent;", "onActivityResult", "(IILandroid/content/Intent;)V", "Lorf;", "event", "onMessageEvent", "(Lorf;)V", "onInvisible", LifecycleConstantKt.ON_STOP, "onDestroyView", "TAG", "Ljava/lang/String;", "", "mFaceSize", "F", "hmInfoViewModel$delegate", "Lkotlin/Lazy;", "getHmInfoViewModel", "()Lcom/xiaomi/fitness/watch/face/viewmodel/FaceHMInfoViewModel;", "hmInfoViewModel", "bgImgMd5", "mCurBgImgPath", "spiritColor", "Lcom/xiaomi/fitness/watch/face/widget/PhotoBgPicker;", "mPhotoPicker", "Lcom/xiaomi/fitness/watch/face/widget/PhotoBgPicker;", "isMultiPhotoFace", "Z", "<set-?>", "setChanged$delegate", "Lkotlin/properties/ReadWriteProperty;", "getSetChanged", "setSetChanged", "(Z)V", "setChanged", "isEditing", "Lcom/xiaomi/fitness/watch/face/widget/FaceDialog;", "kotlin.jvm.PlatformType", "progressDialog$delegate", "getProgressDialog", "()Lcom/xiaomi/fitness/watch/face/widget/FaceDialog;", "progressDialog", "usedProgress", "I", "", "originImgMd5List", "Ljava/util/List;", "<init>", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFaceInfoHMFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceInfoHMFragment.kt\ncom/xiaomi/fitness/watch/face/FaceInfoHMFragment\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n+ 4 Extensions.kt\ncoil/-SingletonExtensions$load$1\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,693:1\n33#2,3:694\n54#3,3:697\n24#3:700\n57#3,6:701\n63#3,2:708\n57#4:707\n1#5:710\n*S KotlinDebug\n*F\n+ 1 FaceInfoHMFragment.kt\ncom/xiaomi/fitness/watch/face/FaceInfoHMFragment\n*L\n127#1:694,3\n289#1:697,3\n289#1:700\n289#1:701,6\n289#1:708,2\n289#1:707\n*E\n"})
public final class FaceInfoHMFragment extends Hilt_FaceInfoHMFragment<FaceHMInfoViewModel, l6a> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(FaceInfoHMFragment.class, "setChanged", "getSetChanged()Z", 0))};
    private boolean isEditing;
    private boolean isMultiPhotoFace;

    @Nullable
    private String mCurBgImgPath;
    private float mFaceSize;
    private PhotoBgPicker mPhotoPicker;

    @NotNull
    private List<String> originImgMd5List;

    /* JADX INFO: renamed from: progressDialog$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy progressDialog;

    /* JADX INFO: renamed from: setChanged$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty setChanged;
    private int usedProgress;

    @NotNull
    private final String TAG = "FaceInfoHMFragment";

    /* JADX INFO: renamed from: hmInfoViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy hmInfoViewModel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: l09
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FaceInfoHMFragment.hmInfoViewModel_delegate$lambda$0(this.f24475a);
        }
    });

    @NotNull
    private String bgImgMd5 = "";

    @NotNull
    private String spiritColor = "";

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceInfoHMFragment$onInstallRet$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceInfoHMFragment$onInstallRet$1", f = "FaceInfoHMFragment.kt", i = {}, l = {632, 645}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33581 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C33581(Continuation<? super C33581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceInfoHMFragment.this.new C33581(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (FaceInfoHMFragment.this.isMultiPhotoFace) {
                    ArrayList arrayList = new ArrayList();
                    FaceInfoHMFragment.this.originImgMd5List.clear();
                    PhotoBgPicker photoBgPicker = FaceInfoHMFragment.this.mPhotoPicker;
                    if (photoBgPicker == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPhotoPicker");
                        photoBgPicker = null;
                    }
                    for (PhotoBgPicker.PhotoBgItem photoBgItem : photoBgPicker.getPhotoList()) {
                        arrayList.add(new FaceBleMultiPhoto(photoBgItem.getFilePath(), photoBgItem.getMd5(), null, null, null, null, null, 124, null));
                        FaceInfoHMFragment.this.originImgMd5List.add(photoBgItem.getMd5());
                    }
                    WearableDeviceModel mDeviceModel = FaceInfoHMFragment.this.getMDeviceModel();
                    String did = mDeviceModel != null ? mDeviceModel.getDid() : null;
                    String str = did + FaceInfoHMFragment.this.getFaceId();
                    Long lBoxLong = Boxing.boxLong(System.currentTimeMillis());
                    WearableDeviceModel mDeviceModel2 = FaceInfoHMFragment.this.getMDeviceModel();
                    String did2 = mDeviceModel2 != null ? mDeviceModel2.getDid() : null;
                    String faceId = FaceInfoHMFragment.this.getFaceId();
                    WatchFace mInfo = FaceInfoHMFragment.this.getMInfo();
                    FaceCommonEntity faceCommonEntity = new FaceCommonEntity(str, lBoxLong, did2, faceId, mInfo != null ? mInfo.getName() : null, FaceInfoHMFragment.this.spiritColor, null, null, null, arrayList, FileUtils.S_IRWXU, null);
                    Logger.i(FaceInfoHMFragment.this.TAG, "save photos: " + faceCommonEntity);
                    WatchFaceDao watchFaceDao = WatchFaceDataBase.INSTANCE.getInstance().watchFaceDao();
                    this.label = 1;
                    if (watchFaceDao.saveWatchFace(faceCommonEntity, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ld8.c().l(new FaceInstallEvent());
                } else {
                    WearableDeviceModel mDeviceModel3 = FaceInfoHMFragment.this.getMDeviceModel();
                    String did3 = mDeviceModel3 != null ? mDeviceModel3.getDid() : null;
                    String str2 = did3 + FaceInfoHMFragment.this.getFaceId();
                    Long lBoxLong2 = Boxing.boxLong(System.currentTimeMillis());
                    WearableDeviceModel mDeviceModel4 = FaceInfoHMFragment.this.getMDeviceModel();
                    String did4 = mDeviceModel4 != null ? mDeviceModel4.getDid() : null;
                    String faceId2 = FaceInfoHMFragment.this.getFaceId();
                    WatchFace mInfo2 = FaceInfoHMFragment.this.getMInfo();
                    FaceCommonEntity faceCommonEntity2 = new FaceCommonEntity(str2, lBoxLong2, did4, faceId2, mInfo2 != null ? mInfo2.getName() : null, FaceInfoHMFragment.this.spiritColor, null, FaceInfoHMFragment.this.bgImgMd5, FaceInfoHMFragment.this.mCurBgImgPath, null, 576, null);
                    Logger.i(FaceInfoHMFragment.this.TAG, "save photo: " + faceCommonEntity2);
                    WatchFaceDao watchFaceDao2 = WatchFaceDataBase.INSTANCE.getInstance().watchFaceDao();
                    this.label = 2;
                    if (watchFaceDao2.saveWatchFace(faceCommonEntity2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ld8.c().l(new FaceInstallEvent());
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
                ld8.c().l(new FaceInstallEvent());
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ld8.c().l(new FaceInstallEvent());
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceInfoHMFragment$setButton1$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceInfoHMFragment$setButton1$1", f = "FaceInfoHMFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C33601(Continuation<? super C33601> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceInfoHMFragment.this.new C33601(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String file_hash;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (FaceManager.INSTANCE.isInstalled(FaceInfoHMFragment.this.getFaceId())) {
                FaceInfoHMFragment.this.getActionDelView().setVisibility(0);
                FaceInfoHMFragment.this.getActionDelView().setText(p1j.f29913k);
                TextView actionUseView = FaceInfoHMFragment.this.getActionUseView();
                if (actionUseView != null) {
                    actionUseView.setText(FaceInfoHMFragment.this.getSetChanged() ? p1j.Z0 : p1j.common_use);
                }
                TextView actionUseView2 = FaceInfoHMFragment.this.getActionUseView();
                if (actionUseView2 != null) {
                    FaceData mRequestData = FaceInfoHMFragment.this.getMRequestData();
                    file_hash = mRequestData != null ? mRequestData.getFile_hash() : null;
                    actionUseView2.setEnabled(!(file_hash == null || file_hash.length() == 0));
                }
            } else {
                FaceInfoHMFragment.this.getActionDelView().setVisibility(8);
                TextView actionUseView3 = FaceInfoHMFragment.this.getActionUseView();
                if (actionUseView3 != null) {
                    actionUseView3.setText(FaceInfoHMFragment.this.getSetChanged() ? p1j.Z0 : p1j.common_use);
                }
                TextView actionUseView4 = FaceInfoHMFragment.this.getActionUseView();
                if (actionUseView4 != null) {
                    FaceData mRequestData2 = FaceInfoHMFragment.this.getMRequestData();
                    file_hash = mRequestData2 != null ? mRequestData2.getFile_hash() : null;
                    actionUseView4.setEnabled(!(file_hash == null || file_hash.length() == 0));
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceInfoHMFragment$setExtraPhotoFaceData$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceInfoHMFragment$setExtraPhotoFaceData$4", f = "FaceInfoHMFragment.kt", i = {}, l = {263}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceInfoHMFragment.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WatchFaceDao watchFaceDao = WatchFaceDataBase.INSTANCE.getInstance().watchFaceDao();
                WearableDeviceModel mDeviceModel = FaceInfoHMFragment.this.getMDeviceModel();
                String did = mDeviceModel != null ? mDeviceModel.getDid() : null;
                String str = did + FaceInfoHMFragment.this.getFaceId();
                this.label = 1;
                obj = watchFaceDao.getWatchFace(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FaceCommonEntity faceCommonEntity = (FaceCommonEntity) obj;
            Logger.i(FaceInfoHMFragment.this.TAG, "load photos: " + faceCommonEntity);
            if ((faceCommonEntity != null ? faceCommonEntity.getMultiPhotoDataList() : null) != null) {
                List<FaceBleMultiPhoto> multiPhotoDataList = faceCommonEntity.getMultiPhotoDataList();
                Intrinsics.checkNotNull(multiPhotoDataList);
                for (FaceBleMultiPhoto faceBleMultiPhoto : CollectionsKt___CollectionsKt.reversed(multiPhotoDataList)) {
                    PhotoBgPicker photoBgPicker = FaceInfoHMFragment.this.mPhotoPicker;
                    if (photoBgPicker == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPhotoPicker");
                        photoBgPicker = null;
                    }
                    photoBgPicker.addPhotoBg(new PhotoBgPicker.PhotoBgItem(faceBleMultiPhoto.getMultiPath(), faceBleMultiPhoto.getMultiMd5()));
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public FaceInfoHMFragment() {
        Delegates delegates = Delegates.INSTANCE;
        final Boolean bool = Boolean.FALSE;
        this.setChanged = new ObservableProperty<Boolean>(bool) { // from class: com.xiaomi.fitness.watch.face.FaceInfoHMFragment$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                newValue.booleanValue();
                oldValue.booleanValue();
                this.setButton1();
            }
        };
        this.progressDialog = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: m09
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceInfoHMFragment.progressDialog_delegate$lambda$22();
            }
        });
        this.originImgMd5List = new ArrayList();
    }

    private final boolean bgImgChanged() {
        String str;
        if (this.bgImgMd5.length() > 0) {
            WatchFace mInfo = getMInfo();
            if (!Intrinsics.areEqual(mInfo != null ? mInfo.getBackgroundImage() : null, this.bgImgMd5) && (str = this.mCurBgImgPath) != null && str.length() != 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean bgImgListChanged() {
        int size = this.originImgMd5List.size();
        PhotoBgPicker photoBgPicker = this.mPhotoPicker;
        if (photoBgPicker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhotoPicker");
            photoBgPicker = null;
        }
        if (size != photoBgPicker.getPhotoList().size()) {
            return true;
        }
        int size2 = this.originImgMd5List.size();
        for (int i = 0; i < size2; i++) {
            String str = this.originImgMd5List.get(i);
            PhotoBgPicker photoBgPicker2 = this.mPhotoPicker;
            if (photoBgPicker2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPhotoPicker");
                photoBgPicker2 = null;
            }
            if (!Intrinsics.areEqual(str, photoBgPicker2.getPhotoList().get(i).getMd5())) {
                return true;
            }
        }
        return false;
    }

    private final void checkConnect(Function0<Unit> action) {
        WearableDeviceModel mDeviceModel = getMDeviceModel();
        if (mDeviceModel != null && mDeviceModel.getIsDeviceConnected()) {
            action.invoke();
            return;
        }
        new CommonDialog.c("face_check_connect").setDialogTitle(p1j.q).setDialogDescription(p1j.p).setPositiveText(p1j.d).setNegativeText(p1j.c).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.FaceInfoHMFragment.checkConnect.1
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
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("key_tab", MainTab.INSTANCE.getINDEX_DEVICE());
                    Context context = FaceInfoHMFragment.this.getContext();
                    if (context != null) {
                        MainExtKt.showMainActivity$default(context, null, bundle, 2, null);
                    }
                }
            }
        }).showIfNeed(getParentFragmentManager());
        if (this.isEditing) {
            this.isEditing = false;
        }
        hideLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void dismissProgress() {
        ((FaceHMInfoViewModel) getMViewModel()).dismissProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doDownload(String filePath) {
        setMDownloadFaceStartTime(System.currentTimeMillis());
        getProgressDialog().showIfNeed(getChildFragmentManager());
        TextView actionUseView = getActionUseView();
        if (actionUseView != null) {
            actionUseView.setEnabled(false);
        }
        FaceHMInfoViewModel hmInfoViewModel = getHmInfoViewModel();
        FaceData mRequestData = getMRequestData();
        Intrinsics.checkNotNull(mRequestData);
        String config_file = mRequestData.getConfig_file();
        Intrinsics.checkNotNull(config_file);
        hmInfoViewModel.downloadFace(config_file, filePath, getFaceId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    public final void doInstallFace(String filePath) {
        ArrayList arrayList;
        if (getHmInfoViewModel().isBatteryLow()) {
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, p1j.common_hint_battery_low);
            }
            setButton1();
            dismissProgress();
            return;
        }
        dotFaceInstallStart();
        TextView actionUseView = getActionUseView();
        if (actionUseView != null) {
            actionUseView.setEnabled(false);
        }
        if (!getSetChanged()) {
            String str = this.mCurBgImgPath;
            if (str != null && str.length() != 0) {
                String str2 = this.mCurBgImgPath;
                Intrinsics.checkNotNull(str2);
                if (!new File(str2).exists()) {
                    if (this.spiritColor.length() <= 0) {
                        getHmInfoViewModel().installFace(filePath);
                        return;
                    }
                }
            } else if (this.spiritColor.length() <= 0) {
                getHmInfoViewModel().installFace(filePath);
                return;
            }
        }
        if (this.isMultiPhotoFace) {
            arrayList = new ArrayList();
            PhotoBgPicker photoBgPicker = this.mPhotoPicker;
            if (photoBgPicker == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPhotoPicker");
                photoBgPicker = null;
            }
            Iterator<PhotoBgPicker.PhotoBgItem> it = photoBgPicker.getPhotoList().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getFilePath());
            }
        } else {
            arrayList = new ArrayList();
            arrayList.add(this.mCurBgImgPath);
        }
        getHmInfoViewModel().reqEdit(filePath, arrayList, this.spiritColor);
    }

    private final void downLoad(final String file) {
        NetUtil netUtil = NetUtil.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        if (!netUtil.getNetWorkAvailable(contextRequireContext)) {
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, p1j.common_hint_network_unavailable);
                return;
            }
            return;
        }
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        if (netUtil.isWifiCon(contextRequireContext2)) {
            doDownload(file);
            return;
        }
        CommonDialog.c positiveText = new CommonDialog.c("face_download_in_mobile_net").setDialogTitle(p1j.j).setPositiveText(p1j.l);
        if (this.mFaceSize > 0.0f) {
            positiveText.setDialogDescriptionString(new DialogParams.DialogDescriptionString(p1j.n, Float.valueOf(this.mFaceSize)));
        } else {
            positiveText.setDialogDescription(p1j.o);
        }
        CommonDialog commonDialogCreate = positiveText.create();
        commonDialogCreate.addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.FaceInfoHMFragment.downLoad.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -2) {
                    if (which != -1) {
                        return;
                    }
                    FaceInfoHMFragment.this.doDownload(file);
                } else if (dialog != null) {
                    dialog.dismiss();
                }
            }
        });
        commonDialogCreate.showIfNeed(getParentFragmentManager());
    }

    private final FaceHMInfoViewModel getHmInfoViewModel() {
        return (FaceHMInfoViewModel) this.hmInfoViewModel.getValue();
    }

    private final FaceDialog getProgressDialog() {
        return (FaceDialog) this.progressDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getSetChanged() {
        return ((Boolean) this.setChanged.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FaceHMInfoViewModel hmInfoViewModel_delegate$lambda$0(FaceInfoHMFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (FaceHMInfoViewModel) new ViewModelProvider(this$0).get(FaceHMInfoViewModel.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initAodFace() {
        FaceData mRequestData = getMRequestData();
        String aod_icon = mRequestData != null ? mRequestData.getAod_icon() : null;
        setScreenOffWatchFace(!(aod_icon == null || aod_icon.length() == 0));
        if (getIsScreenOffWatchFace()) {
            Logger.i(this.TAG, "isScreenOffWatchFace " + getIsScreenOffWatchFace());
            ImageView imageView = (ImageView) ((l6a) getMBinding()).getRoot().findViewById(isi.n1);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = DisplayUtil.dip2px(168.0f);
            layoutParams.height = DisplayUtil.dip2px(168.0f);
            imageView.setLayoutParams(layoutParams);
            FaceManager faceManager = FaceManager.INSTANCE;
            FaceData mRequestData2 = getMRequestData();
            faceManager.loadFaceUrl(mRequestData2 != null ? mRequestData2.getIcon() : null, getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : true, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            View viewFindViewById = ((l6a) getMBinding()).getRoot().findViewById(isi.X0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            ViewExtKt.visible(viewFindViewById);
            View viewFindViewById2 = ((l6a) getMBinding()).getRoot().findViewById(isi.W0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            ViewExtKt.visible(viewFindViewById2);
            ((ConstraintLayout) ((l6a) getMBinding()).getRoot().findViewById(isi.f)).setVisibility(0);
            ImageView imageView2 = (ImageView) ((l6a) getMBinding()).getRoot().findViewById(isi.o1);
            WearableDeviceModel mDeviceModel = getMDeviceModel();
            String deviceIconUrl = mDeviceModel != null ? DeviceModelExtKt.getDeviceIconUrl(mDeviceModel, 2) : null;
            View viewFindViewById3 = ((l6a) getMBinding()).getRoot().findViewById(isi.o1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            ImageView imageView3 = (ImageView) viewFindViewById3;
            Coil.imageLoader(imageView3.getContext()).enqueue(new ImageRequest.Builder(imageView3.getContext()).data(deviceIconUrl).target(imageView3).build());
            FaceInfoView faceInfoView = (FaceInfoView) ((l6a) getMBinding()).getRoot().findViewById(isi.U0);
            FaceData mRequestData3 = getMRequestData();
            String aod_icon2 = mRequestData3 != null ? mRequestData3.getAod_icon() : null;
            Intrinsics.checkNotNull(faceInfoView);
            faceManager.loadFaceUrl(aod_icon2, faceInfoView, (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : true, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            layoutParams2.width = DisplayUtil.dip2px(168.0f);
            layoutParams2.height = DisplayUtil.dip2px(168.0f);
            imageView2.setLayoutParams(layoutParams2);
            TextView screenOffTips = ((l6a) getMBinding()).O;
            Intrinsics.checkNotNullExpressionValue(screenOffTips, "screenOffTips");
            ViewExtKt.visible(screenOffTips);
            ((l6a) getMBinding()).O.setText(p1j.a1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initDetailView(FaceData data) {
        setMBrowseFaceStartTime(System.currentTimeMillis());
        setMRequestData(data);
        setMInfo(FaceExtKt.getFaceBean(data));
        FaceManager.INSTANCE.loadFaceUrl(data.getIcon(), getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : false, (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
        initAodFace();
        ((FaceHMInfoViewModel) getMViewModel()).loadLocalImg(getFaceId());
        boolean z = data.getFile_size() > 10485;
        boolean zIsEmpty = true ^ TextUtils.isEmpty(data.getPublish_name());
        if (z || zIsEmpty) {
            getMSizeAuthorView().setVisibility(0);
        }
        if (!z && zIsEmpty) {
            getMSizeAuthorView().setText(getString(p1j.i, data.getPublish_name()));
        } else if (z && !zIsEmpty) {
            this.mFaceSize = data.getFile_size() / 1048576.0f;
            getMSizeAuthorView().setText(getString(p1j.c1, Float.valueOf(this.mFaceSize)));
        } else if (z) {
            getMSizeAuthorView().setText(getString(p1j.d1, Float.valueOf(data.getFile_size() / 1048576.0f), data.getPublish_name()));
        }
        TextView mDescView = getMDescView();
        FaceData mRequestData = getMRequestData();
        mDescView.setText(mRequestData != null ? mRequestData.getIntroduction() : null);
        TextView mNameView = getMNameView();
        FaceData mRequestData2 = getMRequestData();
        mNameView.setText(mRequestData2 != null ? mRequestData2.getDisplay_name() : null);
        setButton1();
        initSelectView();
    }

    private final void initEditData() {
        String backgroundImage;
        String spiritColor;
        WatchFace mInfo = getMInfo();
        String str = "";
        if (mInfo == null || (backgroundImage = mInfo.getBackgroundImage()) == null) {
            backgroundImage = "";
        }
        this.bgImgMd5 = backgroundImage;
        WatchFace mInfo2 = getMInfo();
        if (mInfo2 != null && (spiritColor = mInfo2.getSpiritColor()) != null) {
            str = spiritColor;
        }
        this.spiritColor = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initSelectView() {
        FaceData mRequestData = getMRequestData();
        FaceData.BleExt ble_ext = mRequestData != null ? mRequestData.getBle_ext() : null;
        if (ble_ext == null || !ble_ext.canEdit()) {
            return;
        }
        FaceData mRequestData2 = getMRequestData();
        String aod_icon = mRequestData2 != null ? mRequestData2.getAod_icon() : null;
        setScreenOffWatchFace(!(aod_icon == null || aod_icon.length() == 0));
        boolean zHasBgImg = ble_ext.hasBgImg();
        if (zHasBgImg) {
            Logger.i(this.TAG, "hasBgImg");
            if (ble_ext.isMultiPhotoFace() && ((FaceHMInfoViewModel) getMViewModel()).getSupportMultiPhoto()) {
                Logger.i(this.TAG, "isMultiPhotoFace");
                this.isMultiPhotoFace = true;
                setExtraPhotoFaceData(ble_ext);
            } else {
                Logger.i(this.TAG, "isSinglePhotoFace " + ble_ext.isMultiPhotoFace() + " " + ((FaceHMInfoViewModel) getMViewModel()).getSupportMultiPhoto());
                this.isMultiPhotoFace = false;
                ((l6a) getMBinding()).M.setVisibility(8);
                getImgLabelView().setVisibility(0);
                String str = this.mCurBgImgPath;
                if (str == null || str.length() == 0) {
                    FaceManager.INSTANCE.loadFaceUrl(ble_ext.getBottom_background(), getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : getIsScreenOffWatchFace(), (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
                }
            }
            FaceManager.INSTANCE.loadFaceUrl(ble_ext.getUpper_background(), getStyleView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : getIsScreenOffWatchFace(), (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
        }
        if (ble_ext.hasSpirit() && ((FaceHMInfoViewModel) getMViewModel()).isSupportDialFontCustomColor()) {
            FaceColorPickView bgColorsView = ((l6a) getMBinding()).D;
            Intrinsics.checkNotNullExpressionValue(bgColorsView, "bgColorsView");
            ViewExtKt.visible(bgColorsView);
            ((l6a) getMBinding()).D.setData(ble_ext.getElement_colours(), this.spiritColor, zHasBgImg);
            ((l6a) getMBinding()).D.getColor().observe(this, new Observer() { // from class: q09
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    FaceInfoHMFragment.initSelectView$lambda$9(this.f30947a, (String) obj);
                }
            });
            if (!zHasBgImg) {
                FaceManager.INSTANCE.loadFaceUrl(ble_ext.getBottom_background(), getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : getIsScreenOffWatchFace(), (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
            }
            FaceManager.INSTANCE.loadFaceUrl(ble_ext.getUpper_background(), getStyleView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : getIsScreenOffWatchFace(), (4092 & 64) != 0 ? null : new Callback() { // from class: com.xiaomi.fitness.watch.face.FaceInfoHMFragment.initSelectView.2
                @Override // com.xiaomi.fitness.watch.face.impl.Callback
                public void onReady(Drawable drawable) {
                    Intrinsics.checkNotNullParameter(drawable, "drawable");
                    FaceInfoHMFragment.this.getStyleView().setImageDrawable(drawable);
                    FaceInfoHMFragment.this.getStyleView().tintColor(FaceInfoHMFragment.this.spiritColor);
                }
            }, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSelectView$lambda$9(FaceInfoHMFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getStyleView().tintColor(str);
        this$0.spiritColor = str;
        this$0.setSetChanged(this$0.isSetChanged());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void installBleFace(final String filePath, boolean needCheckStorage) {
        if (needCheckStorage) {
            getHmInfoViewModel().onStorageCheck(filePath, new FaceHMInfoViewModel.Callback() { // from class: com.xiaomi.fitness.watch.face.FaceInfoHMFragment.installBleFace.1
                @Override // com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel.Callback
                public void onError(int code) {
                    AnyExtKt.main$default(null, new FaceInfoHMFragment$installBleFace$1$onError$1(FaceInfoHMFragment.this, code, filePath, null), 1, null);
                }

                @Override // com.xiaomi.fitness.watch.face.viewmodel.FaceHMInfoViewModel.Callback
                public void onSuccess() {
                    AnyExtKt.main$default(null, new FaceInfoHMFragment$installBleFace$1$onSuccess$1(FaceInfoHMFragment.this, filePath, null), 1, null);
                }
            });
        } else {
            doInstallFace(filePath);
        }
    }

    private final void installOrUpdate() {
        String file_hash;
        FaceData mRequestData = getMRequestData();
        if (mRequestData != null) {
            String config_file = mRequestData.getConfig_file();
            if (config_file == null || config_file.length() == 0 || (file_hash = mRequestData.getFile_hash()) == null || file_hash.length() == 0) {
                Context context = getContext();
                if (context != null) {
                    ToastExtKt.toastShort(context, p1j.common_hint_unkonwn_error);
                    return;
                }
                return;
            }
            TextView actionUseView = getActionUseView();
            if (actionUseView != null) {
                actionUseView.setKeepScreenOn(true);
            }
            boolean zValidZip = FaceBleInfoViewModelKt.validZip(mRequestData.getFile_hash());
            String bleZip = FaceManager.INSTANCE.getBleZip(mRequestData.getFile_hash());
            if (!zValidZip) {
                downLoad(bleZip);
            } else {
                getProgressDialog().showIfNeed(getChildFragmentManager());
                installBleFace(bleZip, true);
            }
        }
    }

    private final boolean isSetChanged() {
        if (this.isMultiPhotoFace) {
            if (spiritColorChanged() || bgImgListChanged()) {
                return true;
            }
        } else if (spiritColorChanged() || bgImgChanged()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClick$lambda$20(FaceInfoHMFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.installOrUpdate();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onDownload(FaceHMInfoViewModel.DownloadRet ret) {
        int percent = ret.getPercent();
        if (percent != -2 && percent != -1) {
            if (percent != 100) {
                getProgressDialog().setProgress(((FaceHMInfoViewModel) getMViewModel()).getDownloadProgress(ret.getPercent()));
                return;
            }
            FaceData mRequestData = getMRequestData();
            if (!FaceBleInfoViewModelKt.validZip(mRequestData != null ? mRequestData.getFile_hash() : null)) {
                onDownload(new FaceHMInfoViewModel.DownloadRet(-2, "zip not valid"));
                return;
            }
            dotFaceDownloadFinish(true, null);
            getProgressDialog().setProgress(((FaceHMInfoViewModel) getMViewModel()).getDownloadProgress(ret.getPercent()));
            this.usedProgress = 1;
            FaceManager faceManager = FaceManager.INSTANCE;
            FaceData mRequestData2 = getMRequestData();
            Intrinsics.checkNotNull(mRequestData2);
            installBleFace(faceManager.getBleZip(mRequestData2.getFile_hash()), true);
            return;
        }
        TextView actionUseView = getActionUseView();
        if (actionUseView != null) {
            actionUseView.setKeepScreenOn(false);
        }
        Context context = getContext();
        if (context != null) {
            ToastExtKt.toastShort(context, FaceBleInfoViewModelKt.getTip(ret.getPercent()));
        }
        setButton1();
        dismissProgress();
        dotFaceDownloadFinish(false, ret.getMsg());
        Logger.i(this.TAG, "onDownload: fail = " + ret.getPercent());
    }

    private final void onInstallRet(FaceHMInfoViewModel.InstallRet ret) {
        if (!ret.getResult()) {
            doFaceInstallFinish(false, getString(getHmInfoViewModel().getErrorDesc(ret.getCodeOrProgress())));
            dismissProgress();
            setButton1();
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, getHmInfoViewModel().getErrorDesc(ret.getCodeOrProgress()));
                return;
            }
            return;
        }
        int codeOrProgress = ret.getCodeOrProgress();
        if (ret.getType() == 1 || ret.getType() == 2) {
            this.usedProgress += codeOrProgress;
            getProgressDialog().setProgress(this.usedProgress);
        } else if (ret.getType() == 3) {
            getProgressDialog().setProgress(getHmInfoViewModel().getPushProgress(this.usedProgress, codeOrProgress, false));
        }
        Logger.i(this.TAG, "onInstallRet: " + codeOrProgress);
        if (codeOrProgress >= 100) {
            dismissProgress();
            doFaceInstallFinish(true, null);
            doFaceSwitchFinish();
            Context context2 = getContext();
            if (context2 != null) {
                ToastExtKt.toastShort(context2, p1j.common_set_success);
            }
            setMInstalled(true);
            WatchFace mInfo = getMInfo();
            if (mInfo != null) {
                mInfo.setBackgroundImage(this.bgImgMd5);
            }
            WatchFace mInfo2 = getMInfo();
            if (mInfo2 != null) {
                mInfo2.setSpiritColor(this.spiritColor);
            }
            ScopeExtKt.scopeNet$default(null, new C33581(null), 1, null);
        }
    }

    private final void onRealDismissDialog() {
        hideLoading();
        this.usedProgress = 0;
        TextView actionUseView = getActionUseView();
        if (actionUseView != null) {
            actionUseView.post(new Runnable() { // from class: r09
                @Override // java.lang.Runnable
                public final void run() {
                    FaceInfoHMFragment.onRealDismissDialog$lambda$25(this.f32046a);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRealDismissDialog$lambda$25(FaceInfoHMFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getProgressDialog().isShowing()) {
            this$0.getProgressDialog().setProgress(0);
            this$0.getProgressDialog().dismissAllowingStateLoss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(FaceInfoHMFragment this$0, ConstraintLayout it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.onClick(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit onViewCreated$lambda$2(FaceInfoHMFragment this$0, StateData stateData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (stateData.i()) {
            this$0.setInitLoadingTime(System.currentTimeMillis());
            this$0.showLoading();
        } else if (stateData.h()) {
            this$0.hideDelayLoading();
            Context context = this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, stateData.c == 22223 ? p1j.common_hint_network_unavailable : p1j.common_hint_unkonwn_error);
            }
            this$0.setButton1();
        } else {
            this$0.hideDelayLoading();
            FaceData faceData = (FaceData) stateData.f11668a;
            if (faceData != null) {
                this$0.initDetailView(faceData);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(FaceInfoHMFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mCurBgImgPath = str;
        Logger.i(this$0.TAG, "initView: path = " + str);
        String str2 = this$0.mCurBgImgPath;
        if (str2 != null && str2.length() != 0) {
            FaceManager.INSTANCE.loadFaceFile(new File(str), this$0.getMImageView(), (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : this$0.getIsScreenOffWatchFace());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(Boolean bool) {
        ld8.c().l(new FaceDeleteEvent());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(FaceInfoHMFragment this$0, FaceHMInfoViewModel.DownloadRet downloadRet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(downloadRet);
        this$0.onDownload(downloadRet);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$6(FaceInfoHMFragment this$0, FaceHMInfoViewModel.InstallRet installRet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(installRet);
        this$0.onInstallRet(installRet);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7(FaceInfoHMFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onRealDismissDialog();
        return Unit.INSTANCE;
    }

    private final void openGallery() {
        startForActivityResult(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), new Function2() { // from class: p09
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FaceInfoHMFragment.openGallery$lambda$21(this.f29866a, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openGallery$lambda$21(FaceInfoHMFragment this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if ((intent != null ? intent.getData() : null) == null) {
            return Unit.INSTANCE;
        }
        FaceCropActivity.p(this$0.getActivity(), intent.getData(), 34, this$0.getFaceId(), null, "", null, true, this$0.isMultiPhotoFace, 0, false);
        return Unit.INSTANCE;
    }

    private final void pickerColor() {
        final String str = this.spiritColor;
        new PaletteDialog().setOnCancel(new View.OnClickListener() { // from class: c09
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaceInfoHMFragment.pickerColor$lambda$15(this.f4783a, str, view);
            }
        }).setOnColorChange(new PaletteDialog.OnColorChangeListener() { // from class: com.xiaomi.fitness.watch.face.FaceInfoHMFragment.pickerColor.2
            @Override // com.xiaomi.fitness.watch.face.PaletteDialog.OnColorChangeListener
            public void onColorChange(int color) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str2 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(color)}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                FaceInfoHMFragment.this.spiritColor = str2;
                Logger.d(FaceInfoHMFragment.this.TAG, "pickerColor: " + str2);
                FaceInfoHMFragment.this.getStyleView().tintColor(str2);
            }
        }).setOnConfirm(new View.OnClickListener() { // from class: n09
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaceInfoHMFragment.pickerColor$lambda$16(this.f27399a, view);
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o09
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                FaceInfoHMFragment.pickerColor$lambda$17(this.f28607a, dialogInterface);
            }
        }).show(getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pickerColor$lambda$15(FaceInfoHMFragment this$0, String preColor, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(preColor, "$preColor");
        Logger.d(this$0.TAG, "pickerColor: cancel");
        this$0.spiritColor = preColor;
        if (preColor.length() != 0) {
            this$0.getStyleView().tintColor(this$0.spiritColor);
            return;
        }
        FaceManager faceManager = FaceManager.INSTANCE;
        FaceData mRequestData = this$0.getMRequestData();
        Intrinsics.checkNotNull(mRequestData);
        FaceData.BleExt ble_ext = mRequestData.getBle_ext();
        Intrinsics.checkNotNull(ble_ext);
        faceManager.loadFaceUrl(ble_ext.getUpper_background(), this$0.getStyleView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : this$0.getIsScreenOffWatchFace(), (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pickerColor$lambda$16(FaceInfoHMFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setSetChanged(this$0.isSetChanged());
        Logger.d(this$0.TAG, "pickerColor: confirm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pickerColor$lambda$17(FaceInfoHMFragment this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setSetChanged(this$0.isSetChanged());
        Logger.d(this$0.TAG, "pickerColor: dismiss");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FaceDialog progressDialog_delegate$lambda$22() {
        return new FaceDialog.Builder("").create();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setExtraPhotoFaceData(final FaceData.BleExt ext) {
        getImgLabelView().setVisibility(8);
        ((l6a) getMBinding()).M.setVisibility(0);
        ((TextView) ((l6a) getMBinding()).M.findViewById(isi.p2)).setVisibility(8);
        ((RecyclerView) ((l6a) getMBinding()).M.findViewById(isi.m2)).setVisibility(8);
        PhotoBgPicker photoBgPicker = this.mPhotoPicker;
        if (photoBgPicker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhotoPicker");
            photoBgPicker = null;
        }
        photoBgPicker.setVisibility(0);
        PhotoBgPicker photoBgPicker2 = this.mPhotoPicker;
        if (photoBgPicker2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhotoPicker");
            photoBgPicker2 = null;
        }
        photoBgPicker2.refreshMaxSize(4);
        PhotoBgPicker photoBgPicker3 = this.mPhotoPicker;
        if (photoBgPicker3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhotoPicker");
            photoBgPicker3 = null;
        }
        photoBgPicker3.setOnAddBtnClickListener(new Function1() { // from class: s09
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceInfoHMFragment.setExtraPhotoFaceData$lambda$10(this.f33126a, ((Boolean) obj).booleanValue());
            }
        });
        PhotoBgPicker photoBgPicker4 = this.mPhotoPicker;
        if (photoBgPicker4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhotoPicker");
            photoBgPicker4 = null;
        }
        photoBgPicker4.setOnItemDelBtnClickListener(new Function2() { // from class: t09
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FaceInfoHMFragment.setExtraPhotoFaceData$lambda$12(this.f34164a, ext, ((Integer) obj).intValue(), (PhotoBgPicker.PhotoBgItem) obj2);
            }
        });
        PhotoBgPicker photoBgPicker5 = this.mPhotoPicker;
        if (photoBgPicker5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhotoPicker");
            photoBgPicker5 = null;
        }
        photoBgPicker5.setOnItemSelectBtnClickListener(new Function1() { // from class: u09
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceInfoHMFragment.setExtraPhotoFaceData$lambda$14(this.f35241a, (PhotoBgPicker.PhotoBgItem) obj);
            }
        });
        ScopeExtKt.scope$default(null, new AnonymousClass4(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setExtraPhotoFaceData$lambda$10(FaceInfoHMFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.openGallery();
        } else {
            Context context = this$0.getContext();
            if (context != null) {
                String quantityString = this$0.getResources().getQuantityString(gyi.l, 4, 4);
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                ToastExtKt.toastShort(context, quantityString);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setExtraPhotoFaceData$lambda$12(FaceInfoHMFragment this$0, FaceData.BleExt ext, int i, PhotoBgPicker.PhotoBgItem photoBgItem) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ext, "$ext");
        Intrinsics.checkNotNullParameter(photoBgItem, "<unused var>");
        PhotoBgPicker photoBgPicker = this$0.mPhotoPicker;
        if (photoBgPicker == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhotoPicker");
            photoBgPicker = null;
        }
        String strRemovePhotoBg = photoBgPicker.removePhotoBg(i);
        if (strRemovePhotoBg != null) {
            FaceManager.INSTANCE.loadFaceFile(new File(strRemovePhotoBg), this$0.getMImageView(), (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : this$0.getIsScreenOffWatchFace());
        } else {
            FaceManager.INSTANCE.loadFaceUrl(ext.getBottom_background(), this$0.getMImageView(), (4092 & 4) != 0 ? false : false, (4092 & 8) != 0 ? false : false, (4092 & 16) != 0 ? false : false, (4092 & 32) != 0 ? false : this$0.getIsScreenOffWatchFace(), (4092 & 64) != 0 ? null : null, (4092 & 128) != 0 ? false : false, (4092 & 256) != 0 ? false : false, (4092 & 512) != 0 ? 0 : 0, (4092 & 1024) != 0 ? 0 : 0, (4092 & 2048) != 0 ? null : null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setExtraPhotoFaceData$lambda$14(FaceInfoHMFragment this$0, PhotoBgPicker.PhotoBgItem it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        FaceManager.INSTANCE.loadFaceFile(new File(it.getFilePath()), this$0.getMImageView(), (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : this$0.getIsScreenOffWatchFace());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setFace$lambda$19(FaceInfoHMFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getHmInfoViewModel().setFaceId(this$0.getFaceId());
        return Unit.INSTANCE;
    }

    private final void setSetChanged(boolean z) {
        this.setChanged.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFullDialog(final String path) {
        new CommonDialog.c("face_replace_desc").setDialogDescription(p1j.R0).setPositiveText(p1j.d).setNegativeText(p1j.c).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.FaceInfoHMFragment.showFullDialog.1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -2) {
                    if (which != -1) {
                        return;
                    }
                    FaceInfoHMFragment.this.installBleFace(path, false);
                } else {
                    FaceInfoHMFragment.this.dismissProgress();
                    FaceInfoHMFragment.this.setButton1();
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                }
            }
        }).showIfNeed(getParentFragmentManager());
    }

    private final boolean spiritColorChanged() {
        if (this.spiritColor.length() > 0) {
            WatchFace mInfo = getMInfo();
            if (!Intrinsics.areEqual(mInfo != null ? mInfo.getSpiritColor() : null, this.spiritColor)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (data != null && requestCode == 34) {
            this.mCurBgImgPath = data.getStringExtra(FaceBlePhotoFragmentKt.EXTRA_PATH);
            String stringExtra = data.getStringExtra(FaceBlePhotoFragmentKt.EXTRA_MD5);
            if (this.isMultiPhotoFace) {
                String str = this.mCurBgImgPath;
                if (str != null && str.length() != 0 && stringExtra != null && stringExtra.length() != 0) {
                    FaceManager faceManager = FaceManager.INSTANCE;
                    String str2 = this.mCurBgImgPath;
                    Intrinsics.checkNotNull(str2);
                    faceManager.loadFaceFile(new File(str2), getMImageView(), (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : getIsScreenOffWatchFace());
                    PhotoBgPicker photoBgPicker = this.mPhotoPicker;
                    if (photoBgPicker == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPhotoPicker");
                        photoBgPicker = null;
                    }
                    PhotoBgPicker.PhotoBgItem.Companion companion = PhotoBgPicker.PhotoBgItem.INSTANCE;
                    String str3 = this.mCurBgImgPath;
                    Intrinsics.checkNotNull(str3);
                    photoBgPicker.addPhotoBg(companion.of(str3, stringExtra));
                }
            } else {
                String str4 = this.mCurBgImgPath;
                if (str4 != null && str4.length() != 0 && stringExtra != null && stringExtra.length() != 0) {
                    this.bgImgMd5 = stringExtra;
                    getMImageView().setVisibility(0);
                    FaceManager faceManager2 = FaceManager.INSTANCE;
                    String str5 = this.mCurBgImgPath;
                    Intrinsics.checkNotNull(str5);
                    faceManager2.loadFaceFile(new File(str5), getMImageView(), (108 & 4) != 0 ? false : false, (108 & 8) != 0 ? false : false, (108 & 16) != 0 ? false : false, (108 & 32) != 0 ? false : false, (108 & 64) != 0 ? false : getIsScreenOffWatchFace());
                }
            }
            setSetChanged(isSetChanged());
            Logger.i(this.TAG, "onActivityResult: bgImgPath = " + this.mCurBgImgPath + "; md5 = " + stringExtra);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v) {
        if (Intrinsics.areEqual(v, getActionUseView())) {
            checkConnect(new Function0() { // from class: v09
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FaceInfoHMFragment.onClick$lambda$20(this.f36341a);
                }
            });
            return;
        }
        if (Intrinsics.areEqual(v, getActionDelView())) {
            ((FaceHMInfoViewModel) getMViewModel()).delete(getFaceId());
        } else if (Intrinsics.areEqual(v, getImgLabelView())) {
            openGallery();
        } else if (Intrinsics.areEqual(v, getPaletteView())) {
            pickerColor();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ((FaceHMInfoViewModel) getMViewModel()).liveData.removeObservers(getViewLifecycleOwner());
        ((FaceHMInfoViewModel) getMViewModel()).getBgImg().removeObservers(getViewLifecycleOwner());
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onInvisible() {
        super.onInvisible();
        doFaceBrowseDetailFinish();
    }

    @Override // com.xiaomi.fitness.watch.face.FaceInfoBase
    public void onMessageEvent(@NotNull orf event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onMessageEvent(event);
        if (event instanceof FaceReSycEvent) {
            setButton1();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        Logger.d(this.TAG, "onRequestPermissionsResult: " + requestCode);
        if (PermissionsUtil.INSTANCE.onRequestPermissionsResult(requestCode, grantResults)) {
            openGallery();
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        try {
            MemoryCache memoryCache = Coil.imageLoader(ApplicationExtKt.getApplication()).getMemoryCache();
            if (memoryCache != null) {
                memoryCache.clear();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.xiaomi.fitness.watch.face.FaceInfoBase, com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setActionBarNormalTitleMode();
        if (getMInstalled()) {
            setMInfo(FaceManager.INSTANCE.getFace(getFaceId()));
        }
        Logger.i(this.TAG, "initView: face = " + getMInfo() + "; installed = " + getMInstalled());
        initEditData();
        this.mPhotoPicker = (PhotoBgPicker) ((l6a) getMBinding()).getRoot().findViewById(isi.w1);
        setStyleView((FaceInfoView) ((l6a) getMBinding()).getRoot().findViewById(isi.j2));
        setImgLabelView((ConstraintLayout) ((l6a) getMBinding()).getRoot().findViewById(isi.K0));
        setBgColorsView((FaceColorPickView) ((l6a) getMBinding()).getRoot().findViewById(isi.p));
        FaceColorPickView bgColorsView = getBgColorsView();
        setPaletteView(bgColorsView != null ? (TextView) bgColorsView.findViewById(isi.p1) : null);
        setActionDelView((TextView) ((l6a) getMBinding()).getRoot().findViewById(isi.f22048a));
        setEmptyView(((l6a) getMBinding()).getRoot().findViewById(isi.f0));
        setApplyMargin(((l6a) getMBinding()).getRoot().findViewById(isi.h));
        setActionDelView((TextView) ((l6a) getMBinding()).getRoot().findViewById(isi.f22048a));
        getApplyMargin().setVisibility(0);
        getEmptyView().setVisibility(8);
        getActionDelView().setVisibility(8);
        ViewExtKt.clickWithTrigger$default(getImgLabelView(), 0L, new Function1() { // from class: e09
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceInfoHMFragment.onViewCreated$lambda$1(this.f16118a, (ConstraintLayout) obj);
            }
        }, 1, null);
        TextView paletteView = getPaletteView();
        if (paletteView != null) {
            paletteView.setOnClickListener(this);
        }
        getActionDelView().setOnClickListener(this);
        getHmInfoViewModel().liveData.observe(getViewLifecycleOwner(), new FaceInfoHMFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: f09
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceInfoHMFragment.onViewCreated$lambda$2(this.f17256a, (StateData) obj);
            }
        }));
        getHmInfoViewModel().getBgImg().observe(getViewLifecycleOwner(), new FaceInfoHMFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: g09
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceInfoHMFragment.onViewCreated$lambda$3(this.f18416a, (String) obj);
            }
        }));
        getHmInfoViewModel().getDeleteLiveData().observe(getViewLifecycleOwner(), new FaceInfoHMFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: h09
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceInfoHMFragment.onViewCreated$lambda$4((Boolean) obj);
            }
        }));
        getHmInfoViewModel().requestData(getFaceId(), this.bgImgMd5);
        getHmInfoViewModel().getDownload().observe(getViewLifecycleOwner(), new FaceInfoHMFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: i09
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceInfoHMFragment.onViewCreated$lambda$5(this.f20644a, (FaceHMInfoViewModel.DownloadRet) obj);
            }
        }));
        getHmInfoViewModel().getInstall().observe(getViewLifecycleOwner(), new FaceInfoHMFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: j09
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceInfoHMFragment.onViewCreated$lambda$6(this.f22284a, (FaceHMInfoViewModel.InstallRet) obj);
            }
        }));
        getHmInfoViewModel().getDismissDialogLiveData().observe(getViewLifecycleOwner(), new FaceInfoHMFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: k09
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceInfoHMFragment.onViewCreated$lambda$7(this.f23289a, (Boolean) obj);
            }
        }));
    }

    @Override // com.xiaomi.fitness.watch.face.FaceInfoBase
    public void setButton1() {
        AnyExtKt.main$default(null, new C33601(null), 1, null);
    }

    @Override // com.xiaomi.fitness.watch.face.FaceInfoBase
    public void setFace() {
        checkConnect(new Function0() { // from class: d09
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FaceInfoHMFragment.setFace$lambda$19(this.f14920a);
            }
        });
    }
}
