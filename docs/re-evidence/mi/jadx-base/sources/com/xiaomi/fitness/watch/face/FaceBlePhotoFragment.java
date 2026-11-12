package com.xiaomi.fitness.watch.face;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.sifli.ezip.sifliEzipUtil;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.MD5Util;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.fitness.watch.face.FaceBlePhotoFragment;
import com.xiaomi.fitness.watch.face.adapter.FaceStyleAdapter;
import com.xiaomi.fitness.watch.face.data.FaceManager;
import com.xiaomi.fitness.watch.face.edit.photo.picker.FaceEditPhotoPickerFragment;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import com.xiaomi.fitness.watch.face.helper.ImageLoadUtil;
import com.xiaomi.fitness.watch.face.view.FaceStyleView;
import com.xiaomi.fitness.watch.face.view.ScaleView;
import defpackage.d6a;
import defpackage.gak;
import defpackage.isi;
import defpackage.kq2;
import defpackage.p1j;
import defpackage.r72;
import defpackage.uw8;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u0003:\u00019B\u0007¢\u0006\u0004\b7\u00108J\"\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0016\u0010-\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u000b\u00106\u001a\u0002058\u0016X\u0096\u0005¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/watch/face/FaceBlePhotoFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/view/View$OnClickListener;", "", "path", "", "retPngPath", "saveFile", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "bitmap", "saveBytes", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Z", "Landroid/net/Uri;", SportRecordBundleKey.BUNDLE_PARAM_URI, "getFitBitmap", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "url", "Lcom/xiaomi/fitness/watch/face/export/exportview/FaceIcon;", "imgView", "", "loadStyleImg", "(Ljava/lang/String;Lcom/xiaomi/fitness/watch/face/export/exportview/FaceIcon;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "mPhotoId", "Ljava/lang/String;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BgStyle;", "mSelectedStyle", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData$BgStyle;", "Z", "multiPhotos", "wearOsPhotos", "", "supportImageFormat", "I", "Ld6a;", "binding", "Ld6a;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class FaceBlePhotoFragment extends BaseFragment implements CoroutineScope, View.OnClickListener {

    @NotNull
    private static final String TAG = "FaceBlePhotoFragment";
    private final /* synthetic */ CoroutineScope $$delegate_0;

    @Nullable
    private d6a binding;

    @Nullable
    private String mPhotoId;

    @Nullable
    private FaceData.BgStyle mSelectedStyle;
    private boolean multiPhotos;
    private boolean retPngPath;
    private int supportImageFormat;
    private boolean wearOsPhotos;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceBlePhotoFragment$getFitBitmap$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceBlePhotoFragment$getFitBitmap$2", f = "FaceBlePhotoFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        final /* synthetic */ Uri $uri;
        int label;
        final /* synthetic */ FaceBlePhotoFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Uri uri, FaceBlePhotoFragment faceBlePhotoFragment, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$uri = uri;
            this.this$0 = faceBlePhotoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$uri, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ScaleView scaleView;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = uw8.c() + File.separator + "temp.jpg";
            uw8.a(str, this.$uri);
            d6a d6aVar = this.this$0.binding;
            if (d6aVar == null || (scaleView = d6aVar.B) == null) {
                return null;
            }
            return scaleView.j(str);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Bitmap> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceBlePhotoFragment$onClick$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceBlePhotoFragment$onClick$1", f = "FaceBlePhotoFragment.kt", i = {0}, l = {120}, m = "invokeSuspend", n = {"savePath"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceBlePhotoFragment.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            String pngPath;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceBlePhotoFragment.this.showLoading();
                String strC = uw8.c();
                String str2 = File.separator;
                if (FaceBlePhotoFragment.this.multiPhotos) {
                    str = FaceBlePhotoFragment.this.mPhotoId + "multi" + str2 + System.currentTimeMillis();
                } else {
                    str = FaceBlePhotoFragment.this.mPhotoId + System.currentTimeMillis();
                }
                String str3 = strC + str2 + str;
                FaceBlePhotoFragment faceBlePhotoFragment = FaceBlePhotoFragment.this;
                boolean z = faceBlePhotoFragment.retPngPath;
                this.L$0 = str3;
                this.label = 1;
                Object objSaveFile = faceBlePhotoFragment.saveFile(str3, z, this);
                if (objSaveFile == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pngPath = str3;
                obj = objSaveFile;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pngPath = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            String str4 = (String) obj;
            FaceBlePhotoFragment.this.hideLoading();
            if (str4 == null || str4.length() == 0) {
                Context context = FaceBlePhotoFragment.this.getContext();
                if (context != null) {
                    ToastExtKt.toastShort(context, p1j.common_hint_unkonwn_error);
                }
            } else {
                Intent intent = new Intent();
                if (FaceBlePhotoFragment.this.retPngPath) {
                    pngPath = FaceBlePhotoFragmentKt.getPngPath(pngPath);
                }
                intent.putExtra(FaceBlePhotoFragmentKt.EXTRA_PATH, pngPath);
                intent.putExtra(FaceBlePhotoFragmentKt.EXTRA_STYLE, FaceBlePhotoFragment.this.mSelectedStyle);
                intent.putExtra(FaceBlePhotoFragmentKt.EXTRA_MD5, str4);
                FragmentActivity activity = FaceBlePhotoFragment.this.getActivity();
                if (activity != null) {
                    activity.setResult(-1, intent);
                }
                FragmentActivity activity2 = FaceBlePhotoFragment.this.getActivity();
                if (activity2 != null) {
                    activity2.lambda$onCreate$0();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceBlePhotoFragment$onViewCreated$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceBlePhotoFragment$onViewCreated$1", f = "FaceBlePhotoFragment.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Uri $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33231(Uri uri, Continuation<? super C33231> continuation) {
            super(2, continuation);
            this.$uri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceBlePhotoFragment.this.new C33231(this.$uri, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            TextView textView;
            ScaleView scaleView;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceBlePhotoFragment faceBlePhotoFragment = FaceBlePhotoFragment.this;
                Uri uri = this.$uri;
                this.label = 1;
                obj = faceBlePhotoFragment.getFitBitmap(uri, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Bitmap bitmap = (Bitmap) obj;
            FaceBlePhotoFragment.this.hideLoading();
            if (bitmap == null) {
                Context context = FaceBlePhotoFragment.this.getContext();
                if (context != null) {
                    ToastExtKt.toastShort(context, p1j.common_hint_unkonwn_error);
                }
            } else {
                d6a d6aVar = FaceBlePhotoFragment.this.binding;
                if (d6aVar != null && (scaleView = d6aVar.B) != null) {
                    scaleView.setImage(bitmap);
                }
                d6a d6aVar2 = FaceBlePhotoFragment.this.binding;
                if (d6aVar2 != null && (textView = d6aVar2.A) != null) {
                    textView.setEnabled(true);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.FaceBlePhotoFragment$saveFile$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.FaceBlePhotoFragment$saveFile$2", f = "FaceBlePhotoFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33242 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ String $path;
        final /* synthetic */ boolean $retPngPath;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33242(String str, boolean z, Continuation<? super C33242> continuation) {
            super(2, continuation);
            this.$path = str;
            this.$retPngPath = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FaceBlePhotoFragment.this.new C33242(this.$path, this.$retPngPath, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:29:0x0108  */
        /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ScaleView scaleView;
            Bitmap bitmapH;
            boolean zBooleanValue;
            boolean zBooleanValue2;
            boolean zSaveBytes;
            Boolean boolBoxBoolean;
            String fileMD5;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Logger.i(FaceBlePhotoFragment.TAG, "supportImageFormat: " + FaceBlePhotoFragment.this.supportImageFormat);
            d6a d6aVar = FaceBlePhotoFragment.this.binding;
            if (d6aVar == null || (scaleView = d6aVar.B) == null || (bitmapH = scaleView.h(FaceBlePhotoFragment.this.wearOsPhotos, FaceBlePhotoFragment.this.supportImageFormat)) == null) {
                return null;
            }
            String str = this.$path;
            FaceBlePhotoFragment faceBlePhotoFragment = FaceBlePhotoFragment.this;
            boolean z = this.$retPngPath;
            String pngPath = FaceBlePhotoFragmentKt.getPngPath(str);
            Boolean boolC = kq2.c(bitmapH, pngPath);
            Logger.i(FaceBlePhotoFragment.TAG, "saveBitmap: " + boolC);
            int i = faceBlePhotoFragment.supportImageFormat;
            if (i == 1) {
                zBooleanValue = boolC.booleanValue();
                Boolean boolF = kq2.f(bitmapH, str);
                Intrinsics.checkNotNullExpressionValue(boolF, "saveBytes_565_3553(...)");
                zBooleanValue2 = boolF.booleanValue();
            } else if (i == 2) {
                zBooleanValue = boolC.booleanValue();
                Boolean boolK = kq2.k(bitmapH, str);
                Intrinsics.checkNotNullExpressionValue(boolK, "saveBytes_ARGB_BGRA(...)");
                zBooleanValue2 = boolK.booleanValue();
            } else {
                if (i != 7) {
                    if (i != 8) {
                        zSaveBytes = faceBlePhotoFragment.saveBytes(bitmapH, str) & boolC.booleanValue();
                    } else {
                        zBooleanValue = boolC.booleanValue();
                        Boolean boolH = kq2.h(bitmapH, str, false);
                        Intrinsics.checkNotNullExpressionValue(boolH, "saveBytes_8888_ARGB565(...)");
                        zBooleanValue2 = boolH.booleanValue();
                    }
                    boolBoxBoolean = Boxing.boxBoolean(zSaveBytes);
                    Logger.i(FaceBlePhotoFragment.TAG, "saveBytes: " + boolBoxBoolean);
                    if (z) {
                        str = pngPath;
                    }
                    fileMD5 = MD5Util.getFileMD5(new File(str));
                    Logger.i(FaceBlePhotoFragment.TAG, "getFileMD5: " + fileMD5);
                    if (boolBoxBoolean.booleanValue()) {
                        return fileMD5;
                    }
                    return null;
                }
                zBooleanValue = boolC.booleanValue();
                Boolean boolH2 = kq2.h(bitmapH, str, true);
                Intrinsics.checkNotNullExpressionValue(boolH2, "saveBytes_8888_ARGB565(...)");
                zBooleanValue2 = boolH2.booleanValue();
            }
            zSaveBytes = zBooleanValue2 & zBooleanValue;
            boolBoxBoolean = Boxing.boxBoolean(zSaveBytes);
            Logger.i(FaceBlePhotoFragment.TAG, "saveBytes: " + boolBoxBoolean);
            if (z) {
                str = pngPath;
            }
            fileMD5 = MD5Util.getFileMD5(new File(str));
            Logger.i(FaceBlePhotoFragment.TAG, "getFileMD5: " + fileMD5);
            if (boolBoxBoolean.booleanValue()) {
                return fileMD5;
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C33242) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public FaceBlePhotoFragment() {
        super(0, 1, null);
        this.$$delegate_0 = CoroutineScopeKt.MainScope();
        this.supportImageFormat = FaceManager.INSTANCE.getSupportImageFormat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFitBitmap(Uri uri, Continuation<? super Bitmap> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(uri, this, null), continuation);
    }

    private final void loadStyleImg(String url, FaceIcon imgView) {
        if (url == null || url.length() == 0) {
            return;
        }
        ImageLoadUtil.load$default(ImageLoadUtil.INSTANCE, imgView, url, imgView.getW(), imgView.getH(), (int) FaceIcon.INFO_RADIUS, null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(FaceBlePhotoFragment this$0, FaceData.BgStyle bgStyle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mSelectedStyle = bgStyle;
        String style = bgStyle.getStyle();
        d6a d6aVar = this$0.binding;
        FaceStyleView faceStyleView = d6aVar != null ? d6aVar.F : null;
        Intrinsics.checkNotNull(faceStyleView);
        this$0.loadStyleImg(style, faceStyleView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean saveBytes(Bitmap bitmap, String path) {
        Product.Size size;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (size = DeviceModelExtKt.getSize(wearableDeviceModel)) == null) {
            return false;
        }
        if (DeviceModelExtKt.isSupportFeature(wearableDeviceModel, Feature.N65AB_PHOTO_WATCHFACE)) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getByteCount());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            return r72.a(new ByteArrayInputStream(sifliEzipUtil.a(byteBufferAllocate.array(), size.getWidth(), size.getHeight())), path);
        }
        Boolean boolD = kq2.d(bitmap, path);
        Intrinsics.checkNotNull(boolD);
        return boolD.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveFile(String str, boolean z, Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C33242(str, z, null), continuation);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        if (v.getId() == isi.R0) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(null), 3, null);
        }
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        d6a d6aVarA0 = d6a.A0(inflater, container, false);
        this.binding = d6aVarA0;
        Intrinsics.checkNotNull(d6aVarA0);
        View root = d6aVarA0.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        TextView textView;
        RecyclerView recyclerView3;
        TextView textView2;
        TextView textView3;
        Intrinsics.checkNotNullParameter(view, "view");
        setTitle(p1j.f29914r);
        Bundle arguments = getArguments();
        Uri uri = arguments != null ? (Uri) arguments.getParcelable("img_uri") : null;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString(FaceEditPhotoPickerFragment.FACE_ID) : null;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Bundle arguments3 = getArguments();
        this.multiPhotos = arguments3 != null ? arguments3.getBoolean("multi_photos") : false;
        Bundle arguments4 = getArguments();
        this.retPngPath = arguments4 != null ? arguments4.getBoolean(FaceBlePhotoFragmentKt.EXTRA_RET_PNG) : false;
        this.supportImageFormat = FaceManager.INSTANCE.getProductImageFormat(wearableDeviceModel);
        Bundle arguments5 = getArguments();
        this.wearOsPhotos = arguments5 != null ? arguments5.getBoolean("wear_os_photos") : false;
        Logger.d(TAG, "initView: " + this.retPngPath);
        if (TextUtils.isEmpty(string) || uri == null || wearableDeviceModel == null || TextUtils.isEmpty(wearableDeviceModel.getDeviceInfo().getDid())) {
            onBackPressed();
            return;
        }
        this.mPhotoId = wearableDeviceModel.getDeviceInfo().getDid() + string;
        Logger.i(TAG, "initView: did = " + wearableDeviceModel.getDeviceInfo().getDid() + "; faceId = " + string + "; supportImageFormat: " + this.supportImageFormat);
        d6a d6aVar = this.binding;
        if (d6aVar != null && (textView3 = d6aVar.A) != null) {
            textView3.setOnClickListener(this);
        }
        showLoading();
        d6a d6aVar2 = this.binding;
        if (d6aVar2 != null && (textView2 = d6aVar2.A) != null) {
            textView2.setEnabled(false);
        }
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new C33231(uri, null), 3, null);
        Bundle arguments6 = getArguments();
        Parcelable[] parcelableArray = arguments6 != null ? arguments6.getParcelableArray(FaceBlePhotoFragmentKt.EXTRA_STYLES) : null;
        if (parcelableArray != null) {
            if (!(parcelableArray.length == 0)) {
                d6a d6aVar3 = this.binding;
                if (d6aVar3 != null && (recyclerView3 = d6aVar3.D) != null) {
                    recyclerView3.setVisibility(0);
                }
                d6a d6aVar4 = this.binding;
                if (d6aVar4 != null && (textView = d6aVar4.C) != null) {
                    textView.setVisibility(0);
                }
                d6a d6aVar5 = this.binding;
                if (d6aVar5 != null && (recyclerView2 = d6aVar5.D) != null) {
                    recyclerView2.addItemDecoration(new gak(FaceIcon.LIST_SPACE, true));
                }
                Bundle arguments7 = getArguments();
                String string2 = arguments7 != null ? arguments7.getString(FaceBlePhotoFragmentKt.EXTRA_STYLE) : null;
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Bundle arguments8 = getArguments();
                FaceStyleAdapter faceStyleAdapter = new FaceStyleAdapter(contextRequireContext, parcelableArray, string2, arguments8 != null ? arguments8.getString(FaceBlePhotoFragmentKt.EXTRA_BG) : null);
                d6a d6aVar6 = this.binding;
                if (d6aVar6 != null && (recyclerView = d6aVar6.D) != null) {
                    recyclerView.setAdapter(faceStyleAdapter);
                }
                faceStyleAdapter.getLiveData().observe(getViewLifecycleOwner(), new FaceBlePhotoFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: vn8
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return FaceBlePhotoFragment.onViewCreated$lambda$0(this.f37055a, (FaceData.BgStyle) obj);
                    }
                }));
                Logger.d(TAG, "initView: curStyle = " + string2);
                d6a d6aVar7 = this.binding;
                FaceStyleView faceStyleView = d6aVar7 != null ? d6aVar7.F : null;
                Intrinsics.checkNotNull(faceStyleView);
                loadStyleImg(string2, faceStyleView);
            }
        }
    }
}
