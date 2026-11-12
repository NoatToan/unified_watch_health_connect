package com.xiaomi.fitness.watch.face.edit.photo.picker;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.watch.face.FaceEditFragment;
import com.xiaomi.fitness.watch.face.FaceInfoBase;
import com.xiaomi.fitness.watch.face.edit.photo.FaceEditPhotoHelper;
import com.xiaomi.fitness.watch.face.edit.photo.crop.FaceEditPhotoCropFragment;
import com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment;
import com.xiaomi.fitness.watch.face.edit.utils.DialFileUtils;
import com.xiaomi.fitness.watch.face.edit.video.crop.FaceEditVideoCropFragment;
import com.xiaomi.fitness.watch.face.export.data.FaceEditPhotoBean;
import com.xiaomi.fitness.watch.face.export.data.WatchFace;
import com.xiaomi.fitness.watch.face.export.data.WatchFaceImage;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import defpackage.av6;
import defpackage.d39;
import defpackage.dx8;
import defpackage.gyi;
import defpackage.iki;
import defpackage.nyp;
import defpackage.ovi;
import defpackage.p1j;
import defpackage.tv1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u000b*\u0001F\b\u0007\u0018\u0000 O2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001OB\u0007¢\u0006\u0004\bN\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0006J\u001d\u0010\u0016\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0012J/\u0010 \u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0006J!\u0010'\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010\u0012J)\u0010.\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00105R\u0016\u00107\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u0016\u00108\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00109R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010J¨\u0006P"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerViewModel;", "Ldx8;", "", "loadPhotoList", "()V", "", MediaStoreUtil.MediaInfo.SIZE, "", "editMode", "selectAll", "setTitleBar", "(IZZ)V", "addListener", "onAddPhoto", "onImageDisable", "checkPhotoCount", "()Z", "openGallery", "", "deleteList", "onDeletePhotos", "(Ljava/util/List;)V", "onStartViewClick", "(Z)V", "isPickPhoto", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceModel", "index", "Lkotlin/Function0;", "onTranscodeComplete", "transcode", "(Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;ILkotlin/jvm/functions/Function0;)V", "onEndViewClick", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onBackPressed", AccountInteractActivity.KEY_REQUEST_CODE, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerAdapter;", "mAdapter", "Lcom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerAdapter;", "", FaceInfoBase.FACE_ID, "Ljava/lang/String;", "photoId", "unzipPath", "supportMaxCount", "I", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "mInfo", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFace;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "originImageBeanList", "Ljava/util/List;", "pickType", "Ld39;", "titleBarBinding", "Ld39;", "toastDuplicate", "Z", "com/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerFragment$mCallback$1", "mCallback", "Lcom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerFragment$mCallback$1;", "getCurrentImageListSize", "()I", "currentImageListSize", "getLayoutId", "layoutId", "<init>", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFaceEditPhotoPickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditPhotoPickerFragment.kt\ncom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,726:1\n1557#2:727\n1628#2,3:728\n1557#2:731\n1628#2,3:732\n*S KotlinDebug\n*F\n+ 1 FaceEditPhotoPickerFragment.kt\ncom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerFragment\n*L\n115#1:727\n115#1:728,3\n523#1:731\n523#1:732,3\n*E\n"})
public final class FaceEditPhotoPickerFragment extends Hilt_FaceEditPhotoPickerFragment<FaceEditPhotoPickerViewModel, dx8> {

    @NotNull
    public static final String FACE_ID = "face_id";

    @NotNull
    public static final String FACE_PHOTO_ID = "face_photo_id";

    @NotNull
    public static final String FACE_PICK_TYPE = "face_pick_type";
    public static final int PICK_PHOTO = 1;
    public static final int PICK_VIDEO = 2;

    @NotNull
    private static final String TAG = "FaceEditPhotoPickerFragment";

    @NotNull
    private String faceId;

    @Nullable
    private FaceEditPhotoPickerAdapter mAdapter;

    @NotNull
    private final FaceEditPhotoPickerFragment$mCallback$1 mCallback;

    @Nullable
    private WatchFace mInfo;

    @NotNull
    private final List<FaceEditPhotoBean> originImageBeanList;

    @NotNull
    private String photoId;
    private int pickType;
    private int supportMaxCount;

    @Nullable
    private d39 titleBarBinding;
    private boolean toastDuplicate;

    @NotNull
    private String unzipPath;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$onStartViewClick$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$onStartViewClick$1", f = "FaceEditPhotoPickerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $deviceModel;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$onStartViewClick$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$onStartViewClick$1$1", f = "FaceEditPhotoPickerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C08071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FaceEditPhotoPickerFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08071(FaceEditPhotoPickerFragment faceEditPhotoPickerFragment, Continuation<? super C08071> continuation) {
                super(2, continuation);
                this.this$0 = faceEditPhotoPickerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08071(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FaceEditPhotoHelper.setCurrentPhotoList$default(FaceEditPhotoHelper.INSTANCE, this.this$0.photoId, this.this$0.originImageBeanList, false, 4, null);
                this.this$0.hideLoading();
                this.this$0.finish();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C08071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WearableDeviceModel wearableDeviceModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$deviceModel = wearableDeviceModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceEditPhotoPickerFragment.this.new AnonymousClass1(this.$deviceModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            for (FaceEditPhotoBean faceEditPhotoBean : FaceEditPhotoPickerFragment.this.originImageBeanList) {
                String cropPath = faceEditPhotoBean.getBackgroundImage().getCropPath();
                if (cropPath == null || cropPath.length() == 0) {
                    FaceEditPhotoPickerFragment.access$getMViewModel(FaceEditPhotoPickerFragment.this).cropDefaultPhotos(this.$deviceModel, faceEditPhotoBean);
                }
            }
            AnyExtKt.main$default(null, new C08071(FaceEditPhotoPickerFragment.this, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$onStartViewClick$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$onStartViewClick$2", f = "FaceEditPhotoPickerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $deviceModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(WearableDeviceModel wearableDeviceModel, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$deviceModel = wearableDeviceModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(FaceEditPhotoPickerFragment faceEditPhotoPickerFragment) {
            AnyExtKt.main$default(null, new FaceEditPhotoPickerFragment$onStartViewClick$2$1$1(faceEditPhotoPickerFragment, null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceEditPhotoPickerFragment.this.new AnonymousClass2(this.$deviceModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final FaceEditPhotoPickerFragment faceEditPhotoPickerFragment = FaceEditPhotoPickerFragment.this;
            faceEditPhotoPickerFragment.transcode(this.$deviceModel, 0, new Function0() { // from class: com.xiaomi.fitness.watch.face.edit.photo.picker.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FaceEditPhotoPickerFragment.AnonymousClass2.invokeSuspend$lambda$0(faceEditPhotoPickerFragment);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$transcode$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$transcode$1", f = "FaceEditPhotoPickerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FaceEditPhotoBean $bean;
        final /* synthetic */ WearableDeviceModel $deviceModel;
        final /* synthetic */ int $index;
        final /* synthetic */ Function0<Unit> $onTranscodeComplete;
        final /* synthetic */ Ref.ObjectRef<nyp> $transformationState;
        int label;
        final /* synthetic */ FaceEditPhotoPickerFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33711(Ref.ObjectRef<nyp> objectRef, FaceEditPhotoPickerFragment faceEditPhotoPickerFragment, FaceEditPhotoBean faceEditPhotoBean, WearableDeviceModel wearableDeviceModel, int i, Function0<Unit> function0, Continuation<? super C33711> continuation) {
            super(2, continuation);
            this.$transformationState = objectRef;
            this.this$0 = faceEditPhotoPickerFragment;
            this.$bean = faceEditPhotoBean;
            this.$deviceModel = wearableDeviceModel;
            this.$index = i;
            this.$onTranscodeComplete = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit invokeSuspend$lambda$0(FaceEditPhotoBean faceEditPhotoBean, Ref.ObjectRef objectRef, FaceEditPhotoPickerFragment faceEditPhotoPickerFragment, WearableDeviceModel wearableDeviceModel, int i, Function0 function0, nyp nypVar) {
            if (nypVar.f28576a == 3) {
                String path = nypVar.d.f533a.getPath();
                faceEditPhotoBean.getBackgroundImage().setCropPath(path);
                faceEditPhotoBean.getBackgroundImage().setCropBinPath(path);
                WatchFaceImage backgroundImage = faceEditPhotoBean.getBackgroundImage();
                String fileMD5 = MD5Util.getFileMD5(new File(path));
                if (fileMD5 == null) {
                    fileMD5 = "";
                }
                backgroundImage.setMd5(fileMD5);
                Logger.d(FaceEditPhotoPickerFragment.TAG, "crop video path " + path);
                WatchFaceImage backgroundImage2 = faceEditPhotoBean.getBackgroundImage();
                DialFileUtils dialFileUtils = DialFileUtils.INSTANCE;
                Intrinsics.checkNotNull(path);
                backgroundImage2.setThumbnailCropPath(dialFileUtils.getVideoThumb(path));
                ((nyp) objectRef.element).removeObservers(faceEditPhotoPickerFragment.getViewLifecycleOwner());
                faceEditPhotoPickerFragment.transcode(wearableDeviceModel, i, function0);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C33711(this.$transformationState, this.this$0, this.$bean, this.$deviceModel, this.$index, this.$onTranscodeComplete, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            nyp nypVar = this.$transformationState.element;
            LifecycleOwner viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            final FaceEditPhotoBean faceEditPhotoBean = this.$bean;
            final Ref.ObjectRef<nyp> objectRef = this.$transformationState;
            final FaceEditPhotoPickerFragment faceEditPhotoPickerFragment = this.this$0;
            final WearableDeviceModel wearableDeviceModel = this.$deviceModel;
            final int i = this.$index;
            final Function0<Unit> function0 = this.$onTranscodeComplete;
            nypVar.observe(viewLifecycleOwner, new FaceEditPhotoPickerFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: com.xiaomi.fitness.watch.face.edit.photo.picker.b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return FaceEditPhotoPickerFragment.C33711.invokeSuspend$lambda$0(faceEditPhotoBean, objectRef, faceEditPhotoPickerFragment, wearableDeviceModel, i, function0, (nyp) obj2);
                }
            }));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$mCallback$1] */
    public FaceEditPhotoPickerFragment() {
        super(ovi.e, tv1.d);
        this.faceId = "";
        this.photoId = "";
        this.unzipPath = "";
        this.supportMaxCount = 8;
        this.originImageBeanList = new ArrayList();
        this.pickType = 1;
        this.mCallback = new l.h() { // from class: com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$mCallback$1
            {
                super(51, 0);
            }

            @Override // androidx.recyclerview.widget.l.e
            public boolean canDropOver(RecyclerView recyclerView, RecyclerView.d0 current, RecyclerView.d0 target) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(current, "current");
                Intrinsics.checkNotNullParameter(target, "target");
                return target.getBindingAdapterPosition() != 0;
            }

            @Override // androidx.recyclerview.widget.l.e
            public void clearView(RecyclerView recyclerView, RecyclerView.d0 viewHolder) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                super.clearView(recyclerView, viewHolder);
                FaceEditPhotoHelper.setCurrentPhotoList$default(FaceEditPhotoHelper.INSTANCE, this.this$0.photoId, this.this$0.originImageBeanList, false, 4, null);
            }

            @Override // androidx.recyclerview.widget.l.e
            public boolean isLongPressDragEnabled() {
                return false;
            }

            @Override // androidx.recyclerview.widget.l.e
            public boolean onMove(RecyclerView recyclerView, RecyclerView.d0 viewHolder, RecyclerView.d0 target) {
                FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                Intrinsics.checkNotNullParameter(target, "target");
                int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
                int bindingAdapterPosition2 = target.getBindingAdapterPosition();
                if (bindingAdapterPosition >= bindingAdapterPosition2) {
                    int i = bindingAdapterPosition2 + 1;
                    if (i <= bindingAdapterPosition) {
                        int i2 = bindingAdapterPosition;
                        while (true) {
                            Collections.swap(this.this$0.originImageBeanList, i2, i2 - 1);
                            if (i2 == i) {
                                break;
                            }
                            i2--;
                        }
                    }
                } else {
                    int i3 = bindingAdapterPosition;
                    while (i3 < bindingAdapterPosition2) {
                        int i4 = i3 + 1;
                        Collections.swap(this.this$0.originImageBeanList, i3, i4);
                        i3 = i4;
                    }
                }
                if (recyclerView.isComputingLayout() || (faceEditPhotoPickerAdapter = this.this$0.mAdapter) == null) {
                    return true;
                }
                faceEditPhotoPickerAdapter.notifyMoved(bindingAdapterPosition, bindingAdapterPosition2);
                return true;
            }

            @Override // androidx.recyclerview.widget.l.e
            public void onSelectedChanged(RecyclerView.d0 viewHolder, int actionState) {
                View view;
                super.onSelectedChanged(viewHolder, actionState);
                if (viewHolder == null || (view = viewHolder.itemView) == null) {
                    return;
                }
                float width = view.getWidth();
                float dp = (ExtUtilsKt.getDp(Double.valueOf(1.33d)) * 2) + width;
                float f = dp / width;
                float f2 = width / dp;
                if (actionState == 0) {
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewHolder.itemView, "scaleX", f2, 1.0f);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewHolder.itemView, "scaleY", f2, 1.0f);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                    animatorSet.start();
                    return;
                }
                if (actionState != 2) {
                    return;
                }
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(viewHolder.itemView, "scaleX", 1.0f, f);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewHolder.itemView, "scaleY", 1.0f, f);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                animatorSet2.start();
            }

            @Override // androidx.recyclerview.widget.l.e
            public void onSwiped(RecyclerView.d0 viewHolder, int direction) {
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FaceEditPhotoPickerViewModel access$getMViewModel(FaceEditPhotoPickerFragment faceEditPhotoPickerFragment) {
        return (FaceEditPhotoPickerViewModel) faceEditPhotoPickerFragment.getMViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addListener() {
        FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter = this.mAdapter;
        if (faceEditPhotoPickerAdapter != null) {
            faceEditPhotoPickerAdapter.setOnPhotoPickerAddListener(new Function0() { // from class: gu8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FaceEditPhotoPickerFragment.addListener$lambda$7(this.f19331a);
                }
            });
        }
        FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter2 = this.mAdapter;
        if (faceEditPhotoPickerAdapter2 != null) {
            faceEditPhotoPickerAdapter2.setOnPhotoPickerCheckedListener(new Function1() { // from class: hu8
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FaceEditPhotoPickerFragment.addListener$lambda$8(this.f20464a, ((Integer) obj).intValue());
                }
            });
        }
        FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter3 = this.mAdapter;
        if (faceEditPhotoPickerAdapter3 != null) {
            faceEditPhotoPickerAdapter3.setOnPhotoPickerSelectListener(new Function1() { // from class: iu8
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return FaceEditPhotoPickerFragment.addListener$lambda$11(this.f22096a, ((Integer) obj).intValue());
                }
            });
        }
        ((dx8) getMBinding()).B.setOnClickListener(new View.OnClickListener() { // from class: ju8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaceEditPhotoPickerFragment.addListener$lambda$12(this.f23135a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$11(FaceEditPhotoPickerFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        String originImagePath = this$0.originImageBeanList.get(i).getBackgroundImage().getOriginImagePath();
        if (originImagePath == null || originImagePath.length() == 0) {
            this$0.onImageDisable();
        } else if (this$0.isPickPhoto()) {
            Bundle bundle = new Bundle();
            bundle.putString(FaceEditFragment.FACE_UNZIP_PATH, this$0.unzipPath);
            bundle.putParcelable("select_bean", this$0.originImageBeanList.get(i));
            bundle.putInt("select_index", i);
            WatchFace watchFace = this$0.mInfo;
            Intrinsics.checkNotNull(watchFace);
            bundle.putBoolean("support_foreground", watchFace.getSupportImageGroup());
            Unit unit = Unit.INSTANCE;
            BaseFragmentExKt.gotoPageForResult(this$0, (Class<?>) FaceEditPhotoCropFragment.class, bundle, 1);
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putString(FaceEditFragment.FACE_UNZIP_PATH, this$0.unzipPath);
            bundle2.putParcelable("select_bean", this$0.originImageBeanList.get(i));
            bundle2.putInt("select_index", i);
            WatchFace watchFace2 = this$0.mInfo;
            Intrinsics.checkNotNull(watchFace2);
            bundle2.putBoolean("support_foreground", watchFace2.getSupportImageGroup());
            Unit unit2 = Unit.INSTANCE;
            BaseFragmentExKt.gotoPageForResult(this$0, (Class<?>) FaceEditVideoCropFragment.class, bundle2, 1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addListener$lambda$12(final FaceEditPhotoPickerFragment this$0, View view) {
        String quantityString;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter = this$0.mAdapter;
        Intrinsics.checkNotNull(faceEditPhotoPickerAdapter);
        final List<Integer> deleteList = faceEditPhotoPickerAdapter.getDeleteList();
        CommonDialog.c dialogTitle = new CommonDialog.c("delete photos").setDialogTitle(p1j.D0);
        Context context = this$0.getContext();
        if (context != null) {
            quantityString = ResourceExtKt.getQuantityString(context, this$0.isPickPhoto() ? gyi.f19467k : gyi.q, deleteList.size(), Integer.valueOf(deleteList.size()));
        } else {
            quantityString = null;
        }
        dialogTitle.setDialogDescriptionString(new DialogParams.DialogDescriptionString(quantityString)).setPositiveText(p1j.D0).setNegativeText(p1j.c).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$addListener$4$1
            @Override // defpackage.av6
            public void onDialogClick(String dialogName, DialogInterface dialog, int which) {
                super.onDialogClick(dialogName, dialog, which);
                if (which != -2) {
                    if (which != -1) {
                        return;
                    }
                    this.this$0.onDeletePhotos(deleteList);
                } else if (dialog != null) {
                    dialog.dismiss();
                }
            }
        }).showIfNeed(this$0.getParentFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$7(FaceEditPhotoPickerFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onAddPhoto();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit addListener$lambda$8(FaceEditPhotoPickerFragment this$0, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter = this$0.mAdapter;
        Intrinsics.checkNotNull(faceEditPhotoPickerAdapter);
        ((FaceEditPhotoPickerViewModel) this$0.getMViewModel()).getMModel().getIntentDeleteSize().set(faceEditPhotoPickerAdapter.getDeleteList().size());
        int currentImageListSize = this$0.getCurrentImageListSize();
        FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter2 = this$0.mAdapter;
        Intrinsics.checkNotNull(faceEditPhotoPickerAdapter2);
        this$0.setTitleBar(currentImageListSize, true, faceEditPhotoPickerAdapter2.isSelectAll(this$0.getCurrentImageListSize()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean checkPhotoCount() {
        return this.originImageBeanList.size() < this.supportMaxCount + 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCurrentImageListSize() {
        return FaceEditPhotoHelper.INSTANCE.getCurrentPhotoList(this.photoId).size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPickPhoto() {
        return this.pickType == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void loadPhotoList() {
        this.originImageBeanList.clear();
        this.originImageBeanList.add(new FaceEditPhotoBean(0, new WatchFaceImage("", null, null, null, null, null, null, null, 254, null), null, 4, null));
        this.originImageBeanList.addAll(FaceEditPhotoHelper.INSTANCE.getCurrentPhotoList(this.photoId));
        FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter = this.mAdapter;
        if (faceEditPhotoPickerAdapter != null) {
            faceEditPhotoPickerAdapter.setEditMode(((FaceEditPhotoPickerViewModel) getMViewModel()).getMModel().getEditMode().get());
        }
        FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter2 = this.mAdapter;
        if (faceEditPhotoPickerAdapter2 != null) {
            List<FaceEditPhotoBean> list = this.originImageBeanList;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (FaceEditPhotoBean faceEditPhotoBean : list) {
                arrayList.add(TuplesKt.to(isPickPhoto() ? faceEditPhotoBean.getBackgroundImage().getOriginImagePath() : faceEditPhotoBean.getBackgroundImage().getThumbnailPath(), faceEditPhotoBean.getBackgroundImage().getDuration()));
            }
            faceEditPhotoPickerAdapter2.setPhotoList(arrayList);
        }
        FaceEditPhotoHelper.setCurrentPhotoList$default(FaceEditPhotoHelper.INSTANCE, this.photoId, this.originImageBeanList, false, 4, null);
        setTitleBar$default(this, getCurrentImageListSize(), false, false, 6, null);
    }

    private final void onAddPhoto() {
        openGallery();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onDeletePhotos(List<Integer> deleteList) {
        CollectionsKt__MutableCollectionsJVMKt.sort(deleteList);
        int size = deleteList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                this.originImageBeanList.remove(deleteList.get(size).intValue());
            }
        }
        FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter = this.mAdapter;
        if (faceEditPhotoPickerAdapter != null) {
            List<FaceEditPhotoBean> list = this.originImageBeanList;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (FaceEditPhotoBean faceEditPhotoBean : list) {
                arrayList.add(TuplesKt.to(isPickPhoto() ? faceEditPhotoBean.getBackgroundImage().getOriginImagePath() : faceEditPhotoBean.getBackgroundImage().getThumbnailPath(), faceEditPhotoBean.getBackgroundImage().getDuration()));
            }
            faceEditPhotoPickerAdapter.setPhotoList(arrayList);
        }
        FaceEditPhotoHelper.setCurrentPhotoList$default(FaceEditPhotoHelper.INSTANCE, this.photoId, this.originImageBeanList, false, 4, null);
        FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter2 = this.mAdapter;
        if (faceEditPhotoPickerAdapter2 != null) {
            faceEditPhotoPickerAdapter2.setEditMode(false);
        }
        ((FaceEditPhotoPickerViewModel) getMViewModel()).getMModel().getEditMode().set(false);
        setTitleBar$default(this, getCurrentImageListSize(), false, false, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onEndViewClick() {
        if (!((FaceEditPhotoPickerViewModel) getMViewModel()).getMModel().getEditMode().get()) {
            FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter = this.mAdapter;
            if (faceEditPhotoPickerAdapter != null) {
                faceEditPhotoPickerAdapter.setEditMode(true);
            }
            ((FaceEditPhotoPickerViewModel) getMViewModel()).getMModel().getEditMode().set(true);
            setTitleBar(getCurrentImageListSize(), true, false);
            return;
        }
        FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter2 = this.mAdapter;
        Intrinsics.checkNotNull(faceEditPhotoPickerAdapter2);
        boolean zIsSelectAll = faceEditPhotoPickerAdapter2.isSelectAll(getCurrentImageListSize());
        FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter3 = this.mAdapter;
        if (faceEditPhotoPickerAdapter3 != null) {
            faceEditPhotoPickerAdapter3.selectAll(!zIsSelectAll);
        }
        ObservableInt intentDeleteSize = ((FaceEditPhotoPickerViewModel) getMViewModel()).getMModel().getIntentDeleteSize();
        FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter4 = this.mAdapter;
        Intrinsics.checkNotNull(faceEditPhotoPickerAdapter4);
        intentDeleteSize.set(faceEditPhotoPickerAdapter4.getDeleteList().size());
        setTitleBar(getCurrentImageListSize(), true, !zIsSelectAll);
    }

    private final void onImageDisable() {
        Context context = getContext();
        if (context != null) {
            ToastExtKt.toastShort(context, isPickPhoto() ? p1j.E0 : p1j.q2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onStartViewClick(boolean editMode) {
        if (!editMode) {
            showLoading();
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (isPickPhoto()) {
                AnyExtKt.io$default(null, new AnonymousClass1(wearableDeviceModel, null), 1, null);
                return;
            } else {
                AnyExtKt.io$default(null, new AnonymousClass2(wearableDeviceModel, null), 1, null);
                return;
            }
        }
        FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter = this.mAdapter;
        if (faceEditPhotoPickerAdapter != null) {
            faceEditPhotoPickerAdapter.setEditMode(false);
        }
        ((FaceEditPhotoPickerViewModel) getMViewModel()).getMModel().getEditMode().set(false);
        ((FaceEditPhotoPickerViewModel) getMViewModel()).getMModel().getIntentDeleteSize().set(0);
        setTitleBar$default(this, getCurrentImageListSize(), false, false, 6, null);
        Unit unit = Unit.INSTANCE;
    }

    private final void openGallery() {
        final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return;
        }
        String str = isPickPhoto() ? "image/*" : "video/*";
        String[] strArr = {"video/mp4", "video/quicktime"};
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType(str);
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        if (this.pickType == 2) {
            intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        }
        startForActivityResult(intent, new Function2() { // from class: fu8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FaceEditPhotoPickerFragment.openGallery$lambda$14(this.f18244a, wearableDeviceModel, ((Integer) obj).intValue(), (Intent) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit openGallery$lambda$14(FaceEditPhotoPickerFragment this$0, WearableDeviceModel deviceModel, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(deviceModel, "$deviceModel");
        if (intent == null) {
            return Unit.INSTANCE;
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null) {
            Logger.i(TAG, "select photo multi: " + clipData.getItemCount());
            this$0.showLoading();
            AnyExtKt.io$default(null, new FaceEditPhotoPickerFragment$openGallery$1$1(clipData, this$0, deviceModel, null), 1, null);
        } else if (intent.getData() != null) {
            if (this$0.originImageBeanList.size() >= this$0.supportMaxCount + 1) {
                return Unit.INSTANCE;
            }
            Logger.i(TAG, "select photo single");
            this$0.showLoading();
            AnyExtKt.io$default(null, new FaceEditPhotoPickerFragment$openGallery$1$2(this$0, deviceModel, intent, null), 1, null);
        }
        return Unit.INSTANCE;
    }

    private final void setTitleBar(int size, boolean editMode, boolean selectAll) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        TextView textView5;
        int i;
        TextView textView6;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        TextView textView10;
        if (editMode) {
            FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter = this.mAdapter;
            Intrinsics.checkNotNull(faceEditPhotoPickerAdapter);
            if (faceEditPhotoPickerAdapter.getDeleteList().size() == 0) {
                int i2 = isPickPhoto() ? p1j.O0 : p1j.s2;
                d39 d39Var = this.titleBarBinding;
                if (d39Var != null && (textView10 = d39Var.D) != null) {
                    textView10.setText(getString(i2));
                }
            } else {
                FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter2 = this.mAdapter;
                Intrinsics.checkNotNull(faceEditPhotoPickerAdapter2);
                int size2 = faceEditPhotoPickerAdapter2.getDeleteList().size();
                d39 d39Var2 = this.titleBarBinding;
                if (d39Var2 != null && (textView6 = d39Var2.D) != null) {
                    textView6.setText(ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), isPickPhoto() ? gyi.j : gyi.p, size2, Integer.valueOf(size2)));
                }
            }
            d39 d39Var3 = this.titleBarBinding;
            if (d39Var3 != null && (textView9 = d39Var3.C) != null) {
                ExtUtilsKt.setVisible(textView9, true);
            }
            d39 d39Var4 = this.titleBarBinding;
            if (d39Var4 != null && (textView8 = d39Var4.A) != null) {
                ExtUtilsKt.setVisible(textView8, false);
            }
            d39 d39Var5 = this.titleBarBinding;
            if (d39Var5 != null && (textView7 = d39Var5.C) != null) {
                textView7.setText(p1j.I0);
                textView7.setTextColor(ResourceExtKt.getResourceColor(ApplicationExtKt.getApplication(), iki.e));
                textView7.setOnClickListener(new View.OnClickListener() { // from class: cu8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FaceEditPhotoPickerFragment.setTitleBar$lambda$2$lambda$1(this.f14722a, view);
                    }
                });
            }
        } else {
            d39 d39Var6 = this.titleBarBinding;
            if (d39Var6 != null && (textView4 = d39Var6.C) != null) {
                ExtUtilsKt.setVisible(textView4, false);
            }
            d39 d39Var7 = this.titleBarBinding;
            if (d39Var7 != null && (textView3 = d39Var7.A) != null) {
                ExtUtilsKt.setVisible(textView3, true);
            }
            d39 d39Var8 = this.titleBarBinding;
            if (d39Var8 != null && (textView2 = d39Var8.A) != null) {
                textView2.setContentDescription(ApplicationExtKt.getApplication().getString(p1j.f29912b));
                textView2.setOnClickListener(new View.OnClickListener() { // from class: du8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        FaceEditPhotoPickerFragment.setTitleBar$lambda$4$lambda$3(this.f15933a, view);
                    }
                });
            }
            d39 d39Var9 = this.titleBarBinding;
            if (d39Var9 != null && (textView = d39Var9.D) != null) {
                textView.setText(ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), isPickPhoto() ? gyi.j : gyi.p, size, Integer.valueOf(size)));
            }
        }
        d39 d39Var10 = this.titleBarBinding;
        if (d39Var10 == null || (textView5 = d39Var10.B) == null) {
            return;
        }
        if (editMode) {
            i = selectAll ? p1j.P0 : p1j.H0;
        } else {
            i = p1j.G0;
        }
        textView5.setText(getString(i));
        textView5.setEnabled(editMode || size != 0);
        textView5.setOnClickListener(new View.OnClickListener() { // from class: eu8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FaceEditPhotoPickerFragment.setTitleBar$lambda$6$lambda$5(this.f17073a, view);
            }
        });
    }

    public static /* synthetic */ void setTitleBar$default(FaceEditPhotoPickerFragment faceEditPhotoPickerFragment, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        faceEditPhotoPickerFragment.setTitleBar(i, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTitleBar$lambda$2$lambda$1(FaceEditPhotoPickerFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onStartViewClick(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTitleBar$lambda$4$lambda$3(FaceEditPhotoPickerFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onStartViewClick(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTitleBar$lambda$6$lambda$5(FaceEditPhotoPickerFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onEndViewClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, nyp] */
    public final void transcode(WearableDeviceModel deviceModel, int index, Function0<Unit> onTranscodeComplete) {
        String originImagePath;
        if (index >= this.originImageBeanList.size()) {
            onTranscodeComplete.invoke();
            return;
        }
        FaceEditPhotoBean faceEditPhotoBean = this.originImageBeanList.get(index);
        String cropPath = faceEditPhotoBean.getBackgroundImage().getCropPath();
        if ((cropPath != null && cropPath.length() != 0) || (originImagePath = faceEditPhotoBean.getBackgroundImage().getOriginImagePath()) == null || originImagePath.length() == 0) {
            transcode(deviceModel, index + 1, onTranscodeComplete);
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new nyp();
        AnyExtKt.main$default(null, new C33711(objectRef, this, faceEditPhotoBean, deviceModel, index, onTranscodeComplete, null), 1, null);
        ((FaceEditPhotoPickerViewModel) getMViewModel()).cropDefaultVideos(faceEditPhotoBean, (nyp) objectRef.element);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return ovi.e;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        FaceEditPhotoBean faceEditPhotoBean;
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != -1 || requestCode != 1 || data == null || (faceEditPhotoBean = (FaceEditPhotoBean) data.getParcelableExtra("select_bean")) == null) {
            return;
        }
        this.originImageBeanList.set(data.getIntExtra("select_index", 0), faceEditPhotoBean);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, com.xiaomi.fitness.baseui.view.BackPressHandler
    public boolean onBackPressed() {
        onStartViewClick(((FaceEditPhotoPickerViewModel) getMViewModel()).getMModel().getEditMode().get());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        String string;
        String string2;
        String string3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        d39 d39VarA0 = d39.A0(getLayoutInflater());
        this.titleBarBinding = d39VarA0;
        Intrinsics.checkNotNull(d39VarA0);
        View root = d39VarA0.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        setCustomView(root, new ActionBar.LayoutParams(-1, -1));
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString(FACE_PHOTO_ID, "")) == null) {
            string = "";
        }
        this.photoId = string;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString(FACE_ID, "")) == null) {
            string2 = "";
        }
        this.faceId = string2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string3 = arguments3.getString(FaceEditFragment.FACE_UNZIP_PATH, "")) != null) {
            str = string3;
        }
        this.unzipPath = str;
        Bundle arguments4 = getArguments();
        WatchFace watchFace = arguments4 != null ? (WatchFace) arguments4.getParcelable(FaceInfoBase.FACE_INFO) : null;
        this.mInfo = watchFace;
        if (watchFace == null) {
            Context context = getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, p1j.common_hint_unkonwn_error);
            }
            finish();
            return;
        }
        Intrinsics.checkNotNull(watchFace);
        this.supportMaxCount = watchFace.getSupportMaxCount();
        Bundle arguments5 = getArguments();
        this.pickType = arguments5 != null ? arguments5.getInt(FACE_PICK_TYPE, 1) : 1;
        Context context2 = getContext();
        boolean z = context2 != null && UIUtils.INSTANCE.isTabletAndLandscape(context2);
        int i = z ? 6 : 4;
        ((dx8) getMBinding()).C.setLayoutManager(new GridLayoutManager(ApplicationExtKt.getApplication(), i));
        l lVar = new l(this.mCallback);
        lVar.d(((dx8) getMBinding()).C);
        this.mAdapter = new FaceEditPhotoPickerAdapter(z, i, lVar, this.pickType == 1);
        ((dx8) getMBinding()).C.setAdapter(this.mAdapter);
        loadPhotoList();
        addListener();
    }
}
