package com.huami.watchfacesstore.device.process;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u001b\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\fR\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0015\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/huami/watchfacesstore/device/process/DialJsPreviewProcessor;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "targetWidth", "targetHeight", "a", "", "originPath", "process", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/String;", "transparentPath", "b", LogUtil.I, "getWidth", "()I", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "c", "getHeight", "height", "<init>", "(Ljava/lang/String;II)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class DialJsPreviewProcessor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String transparentPath;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int height;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.device.process.DialJsPreviewProcessor", f = "DialJsPreviewProcessor.kt", i = {0, 0, 0}, l = {21}, m = "process", n = {"this", "originPath", "previewBitmap"}, s = {"L$0", "L$1", "L$2"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return DialJsPreviewProcessor.this.process(null, this);
        }
    }

    public DialJsPreviewProcessor(@NotNull String str, int i, int i2) {
        this.transparentPath = str;
        this.width = i;
        this.height = i2;
    }

    private final Bitmap a(Bitmap bitmap, int targetWidth, int targetHeight) {
        return Bitmap.createScaledBitmap(bitmap, targetWidth, targetHeight, true);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object process(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        a aVar;
        String str2;
        Bitmap bitmap;
        DialJsPreviewProcessor dialJsPreviewProcessor;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.f;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            String str3 = this.transparentPath;
            aVar.a = this;
            aVar.b = str;
            aVar.c = bitmapDecodeFile;
            aVar.f = 1;
            Object bitmap2 = ExtensionsKt.toBitmap(str3, aVar);
            if (bitmap2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str;
            bitmap = bitmapDecodeFile;
            obj = bitmap2;
            dialJsPreviewProcessor = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap = (Bitmap) aVar.c;
            str2 = (String) aVar.b;
            dialJsPreviewProcessor = (DialJsPreviewProcessor) aVar.a;
            ResultKt.throwOnFailure(obj);
        }
        Bitmap bitmap3 = (Bitmap) obj;
        if (bitmap3 == null) {
            throw new Exception("transparentPath to bitmap fail");
        }
        Bitmap bitmapA = dialJsPreviewProcessor.a(bitmap3, dialJsPreviewProcessor.getWidth(), dialJsPreviewProcessor.getHeight());
        BitmapUtils bitmapUtils = BitmapUtils.INSTANCE;
        return bitmapUtils.saveBitmap(bitmapUtils.mergeBitmap(bitmap, bitmapA), str2);
    }
}
