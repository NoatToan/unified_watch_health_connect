package com.xiaomi.fitness.watch.face.edit.photo.crop;

import android.content.Intent;
import android.graphics.Bitmap;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.export.data.FaceEditPhotoBean;
import com.xiaomi.fitness.watch.face.export.data.WatchFaceImage;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.watch.face.edit.photo.crop.FaceEditPhotoCropFragment$initSaveBtn$2$1", f = "FaceEditPhotoCropFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FaceEditPhotoCropFragment$initSaveBtn$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WearableDeviceModel $deviceModel;
    int label;
    final /* synthetic */ FaceEditPhotoCropFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceEditPhotoCropFragment$initSaveBtn$2$1(FaceEditPhotoCropFragment faceEditPhotoCropFragment, WearableDeviceModel wearableDeviceModel, Continuation<? super FaceEditPhotoCropFragment$initSaveBtn$2$1> continuation) {
        super(2, continuation);
        this.this$0 = faceEditPhotoCropFragment;
        this.$deviceModel = wearableDeviceModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FaceEditPhotoCropFragment$initSaveBtn$2$1(this.this$0, this.$deviceModel, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:47:0x010f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FaceEditPhotoBean faceEditPhotoBean;
        FaceEditPhotoBean faceEditPhotoBean2;
        WatchFaceImage backgroundImage;
        WatchFaceImage backgroundImage2;
        WatchFaceImage backgroundImage3;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Bitmap bitmapH = FaceEditPhotoCropFragment.access$getMBinding(this.this$0).D.h(false, FaceManager.INSTANCE.getProductImageFormat(this.$deviceModel));
        if (bitmapH != null) {
            FaceEditPhotoCropFragment faceEditPhotoCropFragment = this.this$0;
            String strSaveBackgroundImage = FaceEditPhotoCropFragment.access$getMViewModel(faceEditPhotoCropFragment).saveBackgroundImage(this.$deviceModel, faceEditPhotoCropFragment.originPath, bitmapH);
            FaceEditPhotoBean faceEditPhotoBean3 = faceEditPhotoCropFragment.faceEditPhotoBean;
            if (faceEditPhotoBean3 != null && (backgroundImage3 = faceEditPhotoBean3.getBackgroundImage()) != null) {
                backgroundImage3.setCropBinPath(strSaveBackgroundImage);
            }
            FaceEditPhotoBean faceEditPhotoBean4 = faceEditPhotoCropFragment.faceEditPhotoBean;
            if (faceEditPhotoBean4 != null && (backgroundImage2 = faceEditPhotoBean4.getBackgroundImage()) != null) {
                backgroundImage2.setCropPath(strSaveBackgroundImage + ".png");
            }
            FaceEditPhotoBean faceEditPhotoBean5 = faceEditPhotoCropFragment.faceEditPhotoBean;
            if (faceEditPhotoBean5 != null && (backgroundImage = faceEditPhotoBean5.getBackgroundImage()) != null) {
                String fileMD5 = MD5Util.getFileMD5(new File(strSaveBackgroundImage));
                if (fileMD5 == null) {
                    fileMD5 = "";
                }
                backgroundImage.setMd5(fileMD5);
            }
            if (faceEditPhotoCropFragment.getNeedSplit()) {
                FaceForegroundScaleView fgUp = FaceEditPhotoCropFragment.access$getMBinding(faceEditPhotoCropFragment).B;
                Intrinsics.checkNotNullExpressionValue(fgUp, "fgUp");
                if (ExtUtilsKt.isVisible(fgUp)) {
                    FaceEditPhotoBean faceEditPhotoBean6 = faceEditPhotoCropFragment.faceEditPhotoBean;
                    if (faceEditPhotoBean6 != null) {
                        faceEditPhotoBean6.setForegroundImage(FaceEditPhotoCropFragment.access$getMViewModel(faceEditPhotoCropFragment).getForegroundImage(faceEditPhotoCropFragment.originPath));
                    }
                } else {
                    faceEditPhotoBean2 = faceEditPhotoCropFragment.faceEditPhotoBean;
                    if (faceEditPhotoBean2 != null) {
                        faceEditPhotoBean2.setForegroundImage(null);
                    }
                }
            } else {
                faceEditPhotoBean2 = faceEditPhotoCropFragment.faceEditPhotoBean;
                if (faceEditPhotoBean2 != null) {
                    faceEditPhotoBean2.setForegroundImage(null);
                }
            }
        }
        if (this.this$0.deviceSupportFG && this.this$0.supportSplit && this.this$0.getNeedSplit()) {
            FaceForegroundScaleView fgUp2 = FaceEditPhotoCropFragment.access$getMBinding(this.this$0).B;
            Intrinsics.checkNotNullExpressionValue(fgUp2, "fgUp");
            if (ExtUtilsKt.isVisible(fgUp2)) {
                Bitmap bitmapCrop = FaceEditPhotoCropFragment.access$getMBinding(this.this$0).B.crop();
                if (bitmapCrop != null) {
                    FaceEditPhotoCropFragment faceEditPhotoCropFragment2 = this.this$0;
                    FaceEditPhotoCropFragment.access$getMViewModel(faceEditPhotoCropFragment2).saveCropPortraitImageFile(this.$deviceModel, faceEditPhotoCropFragment2.originPath, bitmapCrop);
                    FaceEditPhotoBean faceEditPhotoBean7 = faceEditPhotoCropFragment2.faceEditPhotoBean;
                    if (faceEditPhotoBean7 != null) {
                        faceEditPhotoBean7.setForegroundImage(FaceEditPhotoCropFragment.access$getMViewModel(faceEditPhotoCropFragment2).getForegroundImage(faceEditPhotoCropFragment2.originPath));
                    }
                }
            } else {
                faceEditPhotoBean = this.this$0.faceEditPhotoBean;
                if (faceEditPhotoBean != null) {
                    faceEditPhotoBean.setForegroundImage(null);
                }
            }
        } else {
            faceEditPhotoBean = this.this$0.faceEditPhotoBean;
            if (faceEditPhotoBean != null) {
                faceEditPhotoBean.setForegroundImage(null);
            }
        }
        FaceEditPhotoBean faceEditPhotoBean8 = this.this$0.faceEditPhotoBean;
        if (faceEditPhotoBean8 != null) {
            faceEditPhotoBean8.setPositionIndex(this.this$0.splitStrategy == 1 ? 1 : 0);
        }
        Logger.i("FaceEditPhotoCropFragment", "save crop photo success: " + this.this$0.faceEditPhotoBean);
        FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
        Intent intent = new Intent();
        FaceEditPhotoCropFragment faceEditPhotoCropFragment3 = this.this$0;
        intent.putExtra("select_bean", faceEditPhotoCropFragment3.faceEditPhotoBean);
        intent.putExtra("select_index", faceEditPhotoCropFragment3.currentIndex);
        Unit unit = Unit.INSTANCE;
        fragmentActivityRequireActivity.setResult(-1, intent);
        this.this$0.finish();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FaceEditPhotoCropFragment$initSaveBtn$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
