package com.xiaomi.fitness.training_plan.report;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.widget.ImageView;
import androidx.core.content.FileProvider;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.SuccessResult;
import coil.transform.RoundedCornersTransformation;
import com.xiaomi.fit.data.common.util.UrlConstants;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.im9;
import defpackage.ioi;
import defpackage.kfi;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\u0016\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0002\u001a*\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u001a\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u001a\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¨\u0006\u0017"}, d2 = {"getCustomizeSharePreviewUris", "", "Landroid/net/Uri;", "getLocalBgUri", "isRectangle", "", "index", "", "getUriFromFile", "file", "Ljava/io/File;", "loadImgWithHardwareRenderingDisabled", "", "imageView", "Landroid/widget/ImageView;", SportRecordBundleKey.BUNDLE_PARAM_URI, "cornerRadius", "", "deleteAfterLoad", "getCommonQrCodeBitmapLiveData", "Landroidx/lifecycle/LiveData;", "Landroid/graphics/Bitmap;", "deleteImage", "training-plan_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nShareExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareExt.kt\ncom/xiaomi/fitness/training_plan/report/ShareExtKt\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,102:1\n54#2,3:103\n24#2:106\n59#2,4:107\n63#2,2:122\n489#3,11:111\n*S KotlinDebug\n*F\n+ 1 ShareExt.kt\ncom/xiaomi/fitness/training_plan/report/ShareExtKt\n*L\n66#1:103,3\n66#1:106\n66#1:107,4\n66#1:122,2\n71#1:111,11\n*E\n"})
public final class ShareExtKt {

    /* JADX INFO: renamed from: com.xiaomi.fitness.training_plan.report.ShareExtKt$getCommonQrCodeBitmapLiveData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.training_plan.report.ShareExtKt$getCommonQrCodeBitmapLiveData$1", f = "ShareExt.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LiveDataScope<Bitmap>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $qrCodeBitmap;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Bitmap bitmap, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$qrCodeBitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$qrCodeBitmap, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Bitmap> liveDataScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                Bitmap bitmap = this.$qrCodeBitmap;
                Intrinsics.checkNotNull(bitmap);
                this.label = 1;
                if (liveDataScope.emit(bitmap, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deleteImage(Uri uri) {
        try {
            ApplicationExtKt.getApplication().getContentResolver().delete(uri, null, null);
        } catch (Exception unused) {
        }
    }

    @NotNull
    public static final LiveData<Bitmap> getCommonQrCodeBitmapLiveData() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new AnonymousClass1(kfi.b(UrlConstants.INSTANCE.getQRCodeDownloadHtmlUrl(), ExtUtilsKt.getDp(80), -16777216, 0, BitmapFactory.decodeResource(ApplicationExtKt.getApplication().getResources(), ioi.L)), null), 3, (Object) null);
    }

    @NotNull
    public static final List<Uri> getCustomizeSharePreviewUris() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getLocalBgUri(true, 15));
        arrayList.add(getLocalBgUri(true, 4));
        arrayList.add(getLocalBgUri(true, 6));
        arrayList.add(getLocalBgUri(false, 9));
        arrayList.add(getLocalBgUri(false, 1));
        arrayList.add(getLocalBgUri(false, 2));
        return arrayList;
    }

    @NotNull
    public static final Uri getLocalBgUri(boolean z, int i) {
        StringBuilder sb;
        String str;
        String strL = im9.L();
        int i2 = i + 1;
        if (z) {
            sb = new StringBuilder();
            str = "rectangle-";
        } else {
            sb = new StringBuilder();
            str = "square-";
        }
        sb.append(str);
        sb.append(i2);
        sb.append(".webp");
        String string = sb.toString();
        return getUriFromFile(new File(new File(strL).getAbsolutePath() + File.separator + string));
    }

    private static final Uri getUriFromFile(File file) {
        Uri uriForFile = FileProvider.getUriForFile(ApplicationExtKt.getApplication(), im9.B(), file);
        Intrinsics.checkNotNull(uriForFile);
        return uriForFile;
    }

    public static final void loadImgWithHardwareRenderingDisabled(@NotNull ImageView imageView, @NotNull final Uri uri, float f, boolean z) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(uri, "uri");
        ImageLoader imageLoader = Coil.imageLoader(imageView.getContext());
        ImageRequest.Builder builderTarget = new ImageRequest.Builder(imageView.getContext()).data(uri).target(imageView);
        builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
        builderTarget.allowHardware(false);
        builderTarget.transformations(new RoundedCornersTransformation(f));
        if (z) {
            builderTarget.listener(new ImageRequest.Listener() { // from class: com.xiaomi.fitness.training_plan.report.ShareExtKt$loadImgWithHardwareRenderingDisabled$lambda$2$$inlined$listener$default$1
                @Override // coil.request.ImageRequest.Listener
                public void onCancel(@NotNull ImageRequest request) {
                }

                @Override // coil.request.ImageRequest.Listener
                public void onError(@NotNull ImageRequest request, @NotNull ErrorResult result) {
                    ShareExtKt.deleteImage(uri);
                }

                @Override // coil.request.ImageRequest.Listener
                public void onStart(@NotNull ImageRequest request) {
                }

                @Override // coil.request.ImageRequest.Listener
                public void onSuccess(@NotNull ImageRequest request, @NotNull SuccessResult result) {
                    ShareExtKt.deleteImage(uri);
                }
            });
        }
        imageLoader.enqueue(builderTarget.build());
    }

    public static /* synthetic */ void loadImgWithHardwareRenderingDisabled$default(ImageView imageView, Uri uri, float f, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            f = ExtUtilsKt.getDp(Float.valueOf(8.0f));
        }
        if ((i & 8) != 0) {
            z = false;
        }
        loadImgWithHardwareRenderingDisabled(imageView, uri, f, z);
    }
}
