package com.xiaomi.fitness.watch.face.edit.photo.picker;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.electronic.scale.widget.banner.EcoBanner;
import com.xiaomi.fitness.watch.face.edit.photo.FaceEditPhotoHelper;
import com.xiaomi.fitness.watch.face.edit.utils.DialFileUtils;
import com.xiaomi.fitness.watch.face.export.data.FaceEditPhotoBean;
import com.xiaomi.fitness.watch.face.export.data.WatchFaceImage;
import defpackage.av6;
import defpackage.gyi;
import defpackage.p1j;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$openGallery$1$2", f = "FaceEditPhotoPickerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFaceEditPhotoPickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditPhotoPickerFragment.kt\ncom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerFragment$openGallery$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,726:1\n1#2:727\n*E\n"})
public final class FaceEditPhotoPickerFragment$openGallery$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Intent $data;
    final /* synthetic */ WearableDeviceModel $deviceModel;
    int label;
    final /* synthetic */ FaceEditPhotoPickerFragment this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$openGallery$1$2$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$openGallery$1$2$2", f = "FaceEditPhotoPickerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ FaceEditPhotoPickerFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FaceEditPhotoPickerFragment faceEditPhotoPickerFragment, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = faceEditPhotoPickerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Context context = this.this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, this.this$0.isPickPhoto() ? p1j.U0 : p1j.V0);
            }
            this.this$0.hideLoading();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$openGallery$1$2$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$openGallery$1$2$4", f = "FaceEditPhotoPickerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ FaceEditPhotoPickerFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(FaceEditPhotoPickerFragment faceEditPhotoPickerFragment, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = faceEditPhotoPickerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Context context = this.this$0.getContext();
            if (context != null) {
                ToastExtKt.toastShort(context, ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), gyi.o, 1, Boxing.boxInt(1)));
            }
            this.this$0.hideLoading();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$openGallery$1$2$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$openGallery$1$2$5", f = "FaceEditPhotoPickerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFaceEditPhotoPickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditPhotoPickerFragment.kt\ncom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerFragment$openGallery$1$2$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,726:1\n1557#2:727\n1628#2,3:728\n*S KotlinDebug\n*F\n+ 1 FaceEditPhotoPickerFragment.kt\ncom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerFragment$openGallery$1$2$5\n*L\n505#1:727\n505#1:728,3\n*E\n"})
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ FaceEditPhotoPickerFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(FaceEditPhotoPickerFragment faceEditPhotoPickerFragment, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = faceEditPhotoPickerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FaceEditPhotoPickerAdapter faceEditPhotoPickerAdapter = this.this$0.mAdapter;
            if (faceEditPhotoPickerAdapter != null) {
                List<FaceEditPhotoBean> list = this.this$0.originImageBeanList;
                FaceEditPhotoPickerFragment faceEditPhotoPickerFragment = this.this$0;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (FaceEditPhotoBean faceEditPhotoBean : list) {
                    arrayList.add(TuplesKt.to(faceEditPhotoPickerFragment.isPickPhoto() ? faceEditPhotoBean.getBackgroundImage().getOriginImagePath() : faceEditPhotoBean.getBackgroundImage().getThumbnailPath(), faceEditPhotoBean.getBackgroundImage().getDuration()));
                }
                faceEditPhotoPickerAdapter.setPhotoList(arrayList);
            }
            FaceEditPhotoHelper.setCurrentPhotoList$default(FaceEditPhotoHelper.INSTANCE, this.this$0.photoId, this.this$0.originImageBeanList, false, 4, null);
            FaceEditPhotoPickerFragment faceEditPhotoPickerFragment2 = this.this$0;
            FaceEditPhotoPickerFragment.setTitleBar$default(faceEditPhotoPickerFragment2, faceEditPhotoPickerFragment2.getCurrentImageListSize(), false, false, 6, null);
            this.this$0.hideLoading();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceEditPhotoPickerFragment$openGallery$1$2(FaceEditPhotoPickerFragment faceEditPhotoPickerFragment, WearableDeviceModel wearableDeviceModel, Intent intent, Continuation<? super FaceEditPhotoPickerFragment$openGallery$1$2> continuation) {
        super(2, continuation);
        this.this$0 = faceEditPhotoPickerFragment;
        this.$deviceModel = wearableDeviceModel;
        this.$data = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FaceEditPhotoPickerFragment$openGallery$1$2(this.this$0, this.$deviceModel, this.$data, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String originVideoFile;
        Object next;
        Long lBoxLong;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.this$0.isPickPhoto()) {
            DialFileUtils dialFileUtils = DialFileUtils.INSTANCE;
            Context contextRequireContext = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            WearableDeviceModel wearableDeviceModel = this.$deviceModel;
            String str = this.this$0.faceId;
            Uri data = this.$data.getData();
            Intrinsics.checkNotNull(data);
            originVideoFile = dialFileUtils.getOriginImageFile(contextRequireContext, wearableDeviceModel, str, data);
        } else {
            DialFileUtils dialFileUtils2 = DialFileUtils.INSTANCE;
            Context contextRequireContext2 = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            WearableDeviceModel wearableDeviceModel2 = this.$deviceModel;
            String str2 = this.this$0.faceId;
            Uri data2 = this.$data.getData();
            Intrinsics.checkNotNull(data2);
            originVideoFile = dialFileUtils2.getOriginVideoFile(contextRequireContext2, wearableDeviceModel2, str2, data2);
        }
        String str3 = originVideoFile;
        File file = new File(str3);
        String fileMD5 = MD5Util.getFileMD5(file);
        Iterator it = this.this$0.originImageBeanList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((FaceEditPhotoBean) next).getBackgroundImage().getOriginImageMd5(), fileMD5));
        if (next != null) {
            AnyExtKt.main$default(null, new AnonymousClass2(this.this$0, null), 1, null);
            return Unit.INSTANCE;
        }
        if (this.this$0.pickType == 2) {
            DialFileUtils dialFileUtils3 = DialFileUtils.INSTANCE;
            String path = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            if (!dialFileUtils3.isSupportVideo(path)) {
                this.this$0.hideLoading();
                new CommonDialog.c("video upload fail").setDialogTitle(p1j.u2).setDialogDescriptionString(new DialogParams.DialogDescriptionString(this.this$0.getString(p1j.t2))).setPositiveText(p1j.J).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$openGallery$1$2.3
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
                }).showIfNeed(this.this$0.getParentFragmentManager());
                return Unit.INSTANCE;
            }
        }
        if (this.this$0.isPickPhoto()) {
            lBoxLong = null;
        } else {
            DialFileUtils dialFileUtils4 = DialFileUtils.INSTANCE;
            Context contextRequireContext3 = this.this$0.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
            Uri data3 = this.$data.getData();
            Intrinsics.checkNotNull(data3);
            lBoxLong = Boxing.boxLong(dialFileUtils4.getMediaDuration(contextRequireContext3, data3));
        }
        if (this.this$0.pickType == 2 && (lBoxLong == null || lBoxLong.longValue() > EcoBanner.BANNER_CHANGE_TIME)) {
            AnyExtKt.main$default(null, new AnonymousClass4(this.this$0, null), 1, null);
            return Unit.INSTANCE;
        }
        FaceEditPhotoBean faceEditPhotoBean = new FaceEditPhotoBean(0, new WatchFaceImage("", null, null, str3, fileMD5, !this.this$0.isPickPhoto() ? DialFileUtils.INSTANCE.getVideoThumb(str3) : null, lBoxLong, null, 134, null), null, 4, null);
        if (this.this$0.originImageBeanList.size() == 1) {
            Boxing.boxBoolean(this.this$0.originImageBeanList.add(faceEditPhotoBean));
        } else {
            this.this$0.originImageBeanList.add(1, faceEditPhotoBean);
        }
        AnyExtKt.main$default(null, new AnonymousClass5(this.this$0, null), 1, null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FaceEditPhotoPickerFragment$openGallery$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
