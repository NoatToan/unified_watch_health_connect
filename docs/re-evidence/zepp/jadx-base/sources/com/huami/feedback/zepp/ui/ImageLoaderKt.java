package com.huami.feedback.zepp.ui;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Size;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroid/content/ContentResolver;", "contentResolver", "Landroid/net/Uri;", "uri", "", "size", "Landroid/graphics/Bitmap;", "loadImage", "(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feedback-zepp-ui_release"}, k = 2, mv = {1, 5, 1})
public final class ImageLoaderKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.zepp.ui.ImageLoaderKt$loadImage$2", f = "ImageLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Bitmap>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ ContentResolver c;
        public final /* synthetic */ Uri d;
        public final /* synthetic */ Integer e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ContentResolver contentResolver, Uri uri, Integer num, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = contentResolver;
            this.d = uri;
            this.e = num;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.c, this.d, this.e, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Bitmap> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            Bitmap bitmapDecodeFile;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ContentResolver contentResolver = this.c;
            Uri uri = this.d;
            Integer num = this.e;
            try {
                Result.Companion companion = Result.Companion;
                if (Build.VERSION.SDK_INT < 29) {
                    bitmapDecodeFile = MediaStore.Images.Media.getBitmap(contentResolver, uri);
                } else if (num == null) {
                    bitmapDecodeFile = ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver, uri));
                } else {
                    try {
                        bitmapDecodeFile = contentResolver.loadThumbnail(uri, new Size(num.intValue(), num.intValue()), null);
                    } catch (Exception unused) {
                        bitmapDecodeFile = BitmapFactory.decodeFile(uri.getPath());
                    }
                }
                objM3845constructorimpl = Result.m3845constructorimpl(bitmapDecodeFile);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            return Result.m3850isFailureimpl(objM3845constructorimpl) ? Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8) : objM3845constructorimpl;
        }
    }

    @Nullable
    public static final Object loadImage(@NotNull ContentResolver contentResolver, @NotNull Uri uri, @Nullable Integer num, @NotNull Continuation<? super Bitmap> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(contentResolver, uri, num, null), continuation);
    }
}
