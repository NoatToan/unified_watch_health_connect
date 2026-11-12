package com.xiaomi.fitness.watch.face.edit.photo.picker;

import android.app.Application;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.common.utils.ToastUtil;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$openGallery$1$1", f = "FaceEditPhotoPickerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nFaceEditPhotoPickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditPhotoPickerFragment.kt\ncom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerFragment$openGallery$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,726:1\n1#2:727\n*E\n"})
public final class FaceEditPhotoPickerFragment$openGallery$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ClipData $clipData;
    final /* synthetic */ WearableDeviceModel $deviceModel;
    int label;
    final /* synthetic */ FaceEditPhotoPickerFragment this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$openGallery$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$openGallery$1$1$1", f = "FaceEditPhotoPickerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ClipData $clipData;
        final /* synthetic */ int $i;
        int label;
        final /* synthetic */ FaceEditPhotoPickerFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ClipData clipData, int i, FaceEditPhotoPickerFragment faceEditPhotoPickerFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$clipData = clipData;
            this.$i = i;
            this.this$0 = faceEditPhotoPickerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$clipData, this.$i, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String quantityString = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), gyi.n, this.$clipData.getItemCount() - this.$i, Boxing.boxInt(this.$clipData.getItemCount() - this.$i));
            String quantityString2 = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), gyi.m, this.this$0.supportMaxCount, Boxing.boxInt(this.this$0.supportMaxCount));
            Context context = this.this$0.getContext();
            if (context != null) {
                String string = this.this$0.isPickPhoto() ? this.this$0.getString(p1j.X0) : this.this$0.getString(p1j.Y0, quantityString, quantityString2);
                Intrinsics.checkNotNull(string);
                ToastExtKt.toastShort(context, string);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$openGallery$1$1$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$openGallery$1$1$3", f = "FaceEditPhotoPickerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ FaceEditPhotoPickerFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(FaceEditPhotoPickerFragment faceEditPhotoPickerFragment, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = faceEditPhotoPickerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
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
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$openGallery$1$1$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$openGallery$1$1$4", f = "FaceEditPhotoPickerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.IntRef $invalidDurationCount;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Ref.IntRef intRef, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.$invalidDurationCount = intRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.$invalidDurationCount, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Application application = ApplicationExtKt.getApplication();
            int i = gyi.o;
            int i2 = this.$invalidDurationCount.element;
            ToastUtil.showToast(ResourceExtKt.getQuantityString(application, i, i2, Boxing.boxInt(i2)));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$openGallery$1$1$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$openGallery$1$1$5", f = "FaceEditPhotoPickerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ClipData $clipData;
        final /* synthetic */ Ref.IntRef $invalidVideoTypeCount;
        int label;
        final /* synthetic */ FaceEditPhotoPickerFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Ref.IntRef intRef, ClipData clipData, FaceEditPhotoPickerFragment faceEditPhotoPickerFragment, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.$invalidVideoTypeCount = intRef;
            this.$clipData = clipData;
            this.this$0 = faceEditPhotoPickerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.$invalidVideoTypeCount, this.$clipData, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            new CommonDialog.c("video upload fail").setDialogTitle(this.$invalidVideoTypeCount.element == this.$clipData.getItemCount() ? p1j.u2 : p1j.v2).setDialogDescriptionString(new DialogParams.DialogDescriptionString(this.this$0.getString(p1j.t2))).setPositiveText(p1j.J).create().addDialogCallback(new av6() { // from class: com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment.openGallery.1.1.5.1
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$openGallery$1$1$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment$openGallery$1$1$6", f = "FaceEditPhotoPickerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFaceEditPhotoPickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceEditPhotoPickerFragment.kt\ncom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerFragment$openGallery$1$1$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,726:1\n1557#2:727\n1628#2,3:728\n*S KotlinDebug\n*F\n+ 1 FaceEditPhotoPickerFragment.kt\ncom/xiaomi/fitness/watch/face/edit/photo/picker/FaceEditPhotoPickerFragment$openGallery$1$1$6\n*L\n406#1:727\n406#1:728,3\n*E\n"})
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ FaceEditPhotoPickerFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(FaceEditPhotoPickerFragment faceEditPhotoPickerFragment, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = faceEditPhotoPickerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.this$0, continuation);
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
            return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceEditPhotoPickerFragment$openGallery$1$1(ClipData clipData, FaceEditPhotoPickerFragment faceEditPhotoPickerFragment, WearableDeviceModel wearableDeviceModel, Continuation<? super FaceEditPhotoPickerFragment$openGallery$1$1> continuation) {
        super(2, continuation);
        this.$clipData = clipData;
        this.this$0 = faceEditPhotoPickerFragment;
        this.$deviceModel = wearableDeviceModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FaceEditPhotoPickerFragment$openGallery$1$1(this.$clipData, this.this$0, this.$deviceModel, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0108  */
    /* JADX WARN: Code duplicated, block: B:41:0x0122  */
    /* JADX WARN: Code duplicated, block: B:43:0x012a  */
    /* JADX WARN: Code duplicated, block: B:46:0x015b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0169  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String originVideoFile;
        Object next;
        FaceEditPhotoBean faceEditPhotoBean;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Ref.IntRef intRef = new Ref.IntRef();
        Ref.IntRef intRef2 = new Ref.IntRef();
        int itemCount = this.$clipData.getItemCount();
        int i = 0;
        while (true) {
            if (i >= itemCount) {
                break;
            }
            if (!this.this$0.checkPhotoCount()) {
                AnyExtKt.main$default(null, new AnonymousClass1(this.$clipData, i, this.this$0, null), 1, null);
                break;
            }
            Uri uri = this.$clipData.getItemAt(i).getUri();
            if (this.this$0.isPickPhoto()) {
                DialFileUtils dialFileUtils = DialFileUtils.INSTANCE;
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                WearableDeviceModel wearableDeviceModel = this.$deviceModel;
                String str = this.this$0.faceId;
                Intrinsics.checkNotNull(uri);
                originVideoFile = dialFileUtils.getOriginImageFile(contextRequireContext, wearableDeviceModel, str, uri);
            } else {
                DialFileUtils dialFileUtils2 = DialFileUtils.INSTANCE;
                Context contextRequireContext2 = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                WearableDeviceModel wearableDeviceModel2 = this.$deviceModel;
                String str2 = this.this$0.faceId;
                Intrinsics.checkNotNull(uri);
                originVideoFile = dialFileUtils2.getOriginVideoFile(contextRequireContext2, wearableDeviceModel2, str2, uri);
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
            if (next == null) {
                Long lBoxLong = this.this$0.pickType == 2 ? Boxing.boxLong(DialFileUtils.INSTANCE.getMediaDuration(file)) : null;
                if (this.this$0.pickType == 2) {
                    DialFileUtils dialFileUtils3 = DialFileUtils.INSTANCE;
                    String path = file.getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                    if (!dialFileUtils3.isSupportVideo(path)) {
                        intRef2.element++;
                    } else if (this.this$0.pickType == 2 || (lBoxLong != null && lBoxLong.longValue() <= EcoBanner.BANNER_CHANGE_TIME)) {
                        faceEditPhotoBean = new FaceEditPhotoBean(0, new WatchFaceImage("", null, null, str3, fileMD5, this.this$0.pickType == 2 ? DialFileUtils.INSTANCE.getVideoThumb(str3) : null, lBoxLong, null, 134, null), null, 4, null);
                        if (this.this$0.originImageBeanList.size() == 1) {
                            Boxing.boxBoolean(this.this$0.originImageBeanList.add(faceEditPhotoBean));
                        } else {
                            this.this$0.originImageBeanList.add(1, faceEditPhotoBean);
                        }
                    } else {
                        intRef.element++;
                    }
                } else if (this.this$0.pickType == 2) {
                    faceEditPhotoBean = new FaceEditPhotoBean(0, new WatchFaceImage("", null, null, str3, fileMD5, this.this$0.pickType == 2 ? DialFileUtils.INSTANCE.getVideoThumb(str3) : null, lBoxLong, null, 134, null), null, 4, null);
                    if (this.this$0.originImageBeanList.size() == 1) {
                        Boxing.boxBoolean(this.this$0.originImageBeanList.add(faceEditPhotoBean));
                    } else {
                        this.this$0.originImageBeanList.add(1, faceEditPhotoBean);
                    }
                } else {
                    faceEditPhotoBean = new FaceEditPhotoBean(0, new WatchFaceImage("", null, null, str3, fileMD5, this.this$0.pickType == 2 ? DialFileUtils.INSTANCE.getVideoThumb(str3) : null, lBoxLong, null, 134, null), null, 4, null);
                    if (this.this$0.originImageBeanList.size() == 1) {
                        Boxing.boxBoolean(this.this$0.originImageBeanList.add(faceEditPhotoBean));
                    } else {
                        this.this$0.originImageBeanList.add(1, faceEditPhotoBean);
                    }
                }
            } else if (!this.this$0.toastDuplicate) {
                AnyExtKt.main$default(null, new AnonymousClass3(this.this$0, null), 1, null);
                this.this$0.toastDuplicate = true;
            }
            i++;
        }
        if (intRef.element > 0) {
            AnyExtKt.main$default(null, new AnonymousClass4(intRef, null), 1, null);
        }
        if (intRef2.element > 0) {
            AnyExtKt.main$default(null, new AnonymousClass5(intRef2, this.$clipData, this.this$0, null), 1, null);
        }
        this.this$0.toastDuplicate = false;
        AnyExtKt.main$default(null, new AnonymousClass6(this.this$0, null), 1, null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FaceEditPhotoPickerFragment$openGallery$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
