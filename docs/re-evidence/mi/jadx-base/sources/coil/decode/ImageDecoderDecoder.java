package coil.decode;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Size;
import androidx.annotation.RequiresApi;
import coil.ImageLoader;
import coil.drawable.ScaleDrawable;
import coil.fetch.SourceResult;
import coil.request.Gifs;
import coil.request.Options;
import coil.size.Sizes;
import coil.transform.AnimatedTransformation;
import coil.util.GifUtils;
import defpackage.d4d;
import defpackage.i4d;
import defpackage.p3d;
import defpackage.u3d;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import okio.BufferedSource;
import okio.Okio;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0013H\u0002J\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0003H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcoil/decode/ImageDecoderDecoder;", "Lcoil/decode/Decoder;", "source", "Lcoil/decode/ImageSource;", "options", "Lcoil/request/Options;", "enforceMinimumFrameDelay", "", "(Lcoil/decode/ImageSource;Lcoil/request/Options;Z)V", "decode", "Lcoil/decode/DecodeResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wrapDrawable", "Landroid/graphics/drawable/Drawable;", "baseDrawable", "(Landroid/graphics/drawable/Drawable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wrapImageSource", "configureImageDecoderProperties", "", "Landroid/graphics/ImageDecoder;", "toImageDecoderSource", "Landroid/graphics/ImageDecoder$Source;", "Factory", "coil-gif_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ImageDecoderDecoder implements Decoder {
    private final boolean enforceMinimumFrameDelay;

    @NotNull
    private final Options options;

    @NotNull
    private final ImageSource source;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcoil/decode/ImageDecoderDecoder$Factory;", "Lcoil/decode/Decoder$Factory;", "enforceMinimumFrameDelay", "", "(Z)V", "create", "Lcoil/decode/Decoder;", "result", "Lcoil/fetch/SourceResult;", "options", "Lcoil/request/Options;", "imageLoader", "Lcoil/ImageLoader;", "equals", "other", "", "hashCode", "", "isApplicable", "source", "Lokio/BufferedSource;", "coil-gif_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Factory implements Decoder.Factory {
        private final boolean enforceMinimumFrameDelay;

        @JvmOverloads
        public Factory() {
            this(false, 1, null);
        }

        private final boolean isApplicable(BufferedSource source) {
            DecodeUtils decodeUtils = DecodeUtils.INSTANCE;
            return GifDecodeUtils.isGif(decodeUtils, source) || GifDecodeUtils.isAnimatedWebP(decodeUtils, source) || (Build.VERSION.SDK_INT >= 30 && GifDecodeUtils.isAnimatedHeif(decodeUtils, source));
        }

        @Override // coil.decode.Decoder.Factory
        @Nullable
        public Decoder create(@NotNull SourceResult result, @NotNull Options options, @NotNull ImageLoader imageLoader) {
            if (isApplicable(result.getSource().source())) {
                return new ImageDecoderDecoder(result.getSource(), options, this.enforceMinimumFrameDelay);
            }
            return null;
        }

        public boolean equals(@Nullable Object other) {
            return other instanceof Factory;
        }

        public int hashCode() {
            return Factory.class.hashCode();
        }

        @JvmOverloads
        public Factory(boolean z) {
            this.enforceMinimumFrameDelay = z;
        }

        public /* synthetic */ Factory(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }
    }

    /* JADX INFO: renamed from: coil.decode.ImageDecoderDecoder$decode$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "coil.decode.ImageDecoderDecoder", f = "ImageDecoderDecoder.kt", i = {0, 0, 1}, l = {50, 90}, m = "decode", n = {"this", "isSampled", "isSampled"}, s = {"L$0", "L$1", "L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImageDecoderDecoder.this.decode(this);
        }
    }

    /* JADX INFO: renamed from: coil.decode.ImageDecoderDecoder$wrapDrawable$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "coil.decode.ImageDecoderDecoder", f = "ImageDecoderDecoder.kt", i = {0, 0}, l = {158}, m = "wrapDrawable", n = {"this", "baseDrawable"}, s = {"L$0", "L$1"})
    public static final class C13241 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C13241(Continuation<? super C13241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ImageDecoderDecoder.this.wrapDrawable(null, this);
        }
    }

    /* JADX INFO: renamed from: coil.decode.ImageDecoderDecoder$wrapDrawable$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "coil.decode.ImageDecoderDecoder$wrapDrawable$2", f = "ImageDecoderDecoder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Drawable $baseDrawable;
        final /* synthetic */ Function0<Unit> $onEnd;
        final /* synthetic */ Function0<Unit> $onStart;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Drawable drawable, Function0<Unit> function0, Function0<Unit> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$baseDrawable = drawable;
            this.$onStart = function0;
            this.$onEnd = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass2(this.$baseDrawable, this.$onStart, this.$onEnd, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            u3d.a(this.$baseDrawable).registerAnimationCallback(GifUtils.animatable2CallbackOf(this.$onStart, this.$onEnd));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @JvmOverloads
    public ImageDecoderDecoder(@NotNull ImageSource imageSource, @NotNull Options options) {
        this(imageSource, options, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureImageDecoderProperties(ImageDecoder imageDecoder) {
        imageDecoder.setAllocator(GifUtils.isHardware(this.options.getConfig()) ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!this.options.getAllowRgb565() ? 1 : 0);
        if (this.options.getColorSpace() != null) {
            imageDecoder.setTargetColorSpace(this.options.getColorSpace());
        }
        imageDecoder.setUnpremultipliedRequired(!this.options.getPremultipliedAlpha());
        AnimatedTransformation animatedTransformation = Gifs.animatedTransformation(this.options.getParameters());
        imageDecoder.setPostProcessor(animatedTransformation != null ? GifUtils.asPostProcessor(animatedTransformation) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageDecoder.Source toImageDecoderSource(ImageSource imageSource) {
        Path pathFileOrNull = imageSource.fileOrNull();
        if (pathFileOrNull != null) {
            return ImageDecoder.createSource(pathFileOrNull.toFile());
        }
        ImageSource.Metadata metadata = imageSource.getMetadata();
        if (metadata instanceof AssetMetadata) {
            return ImageDecoder.createSource(this.options.getContext().getAssets(), ((AssetMetadata) metadata).getFilePath());
        }
        if (metadata instanceof ContentMetadata) {
            return ImageDecoder.createSource(this.options.getContext().getContentResolver(), ((ContentMetadata) metadata).getUri());
        }
        if (metadata instanceof ResourceMetadata) {
            ResourceMetadata resourceMetadata = (ResourceMetadata) metadata;
            if (Intrinsics.areEqual(resourceMetadata.getPackageName(), this.options.getContext().getPackageName())) {
                return ImageDecoder.createSource(this.options.getContext().getResources(), resourceMetadata.getResId());
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return ImageDecoder.createSource(imageSource.source().readByteArray());
        }
        return i == 30 ? ImageDecoder.createSource(ByteBuffer.wrap(imageSource.source().readByteArray())) : ImageDecoder.createSource(imageSource.file().toFile());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object wrapDrawable(Drawable drawable, Continuation<? super Drawable> continuation) {
        C13241 c13241;
        ImageDecoderDecoder imageDecoderDecoder;
        if (continuation instanceof C13241) {
            c13241 = (C13241) continuation;
            int i = c13241.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13241.label = i - Integer.MIN_VALUE;
            } else {
                c13241 = new C13241(continuation);
            }
        } else {
            c13241 = new C13241(continuation);
        }
        Object obj = c13241.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c13241.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!p3d.a(drawable)) {
                return drawable;
            }
            AnimatedImageDrawable animatedImageDrawableA = u3d.a(drawable);
            Integer numRepeatCount = Gifs.repeatCount(this.options.getParameters());
            animatedImageDrawableA.setRepeatCount(numRepeatCount != null ? numRepeatCount.intValue() : -1);
            Function0<Unit> function0AnimationStartCallback = Gifs.animationStartCallback(this.options.getParameters());
            Function0<Unit> function0AnimationEndCallback = Gifs.animationEndCallback(this.options.getParameters());
            if (function0AnimationStartCallback != null || function0AnimationEndCallback != null) {
                MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(drawable, function0AnimationStartCallback, function0AnimationEndCallback, null);
                c13241.L$0 = this;
                c13241.L$1 = drawable;
                c13241.label = 1;
                if (BuildersKt.withContext(immediate, anonymousClass2, c13241) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            imageDecoderDecoder = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            drawable = (Drawable) c13241.L$1;
            imageDecoderDecoder = (ImageDecoderDecoder) c13241.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return new ScaleDrawable(drawable, imageDecoderDecoder.options.getScale());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageSource wrapImageSource(ImageSource source) {
        return (this.enforceMinimumFrameDelay && GifDecodeUtils.isGif(DecodeUtils.INSTANCE, source.source())) ? ImageSources.create(Okio.buffer(new FrameDelayRewritingSource(source.source())), this.options.getContext()) : source;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // coil.decode.Decoder
    @Nullable
    public Object decode(@NotNull Continuation<? super DecodeResult> continuation) {
        AnonymousClass1 anonymousClass1;
        ImageDecoderDecoder imageDecoderDecoder;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objWrapDrawable = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                booleanRef = (Ref.BooleanRef) anonymousClass1.L$1;
                imageDecoderDecoder = (ImageDecoderDecoder) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objWrapDrawable);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef2 = (Ref.BooleanRef) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objWrapDrawable);
            }
            return new DecodeResult((Drawable) objWrapDrawable, booleanRef2.element);
        }
        ResultKt.throwOnFailure(objWrapDrawable);
        final Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        Function0<Drawable> function0 = new Function0<Drawable>() { // from class: coil.decode.ImageDecoderDecoder$decode$drawable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Drawable invoke() throws IOException {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                ImageDecoderDecoder imageDecoderDecoder2 = this.this$0;
                ImageSource imageSourceWrapImageSource = imageDecoderDecoder2.wrapImageSource(imageDecoderDecoder2.source);
                try {
                    ImageDecoder.Source imageDecoderSource = this.this$0.toImageDecoderSource(imageSourceWrapImageSource);
                    final ImageDecoderDecoder imageDecoderDecoder3 = this.this$0;
                    final Ref.BooleanRef booleanRef4 = booleanRef3;
                    Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(imageDecoderSource, i4d.a(new ImageDecoder$OnHeaderDecodedListener() { // from class: coil.decode.ImageDecoderDecoder$decode$drawable$1$invoke$$inlined$decodeDrawable$1
                        /* JADX WARN: Multi-variable type inference failed */
                        public final void onHeaderDecoded(@NotNull ImageDecoder decoder, @NotNull ImageDecoder.ImageInfo info, @NotNull ImageDecoder.Source source) {
                            Intrinsics.checkNotNullParameter(decoder, "decoder");
                            Intrinsics.checkNotNullParameter(info, "info");
                            Intrinsics.checkNotNullParameter(source, "source");
                            objectRef.element = decoder;
                            Size size = info.getSize();
                            int width = size.getWidth();
                            int height = size.getHeight();
                            coil.size.Size size2 = imageDecoderDecoder3.options.getSize();
                            int px = Sizes.isOriginal(size2) ? width : GifUtils.toPx(size2.getWidth(), imageDecoderDecoder3.options.getScale());
                            coil.size.Size size3 = imageDecoderDecoder3.options.getSize();
                            int px2 = Sizes.isOriginal(size3) ? height : GifUtils.toPx(size3.getHeight(), imageDecoderDecoder3.options.getScale());
                            if (width > 0 && height > 0 && (width != px || height != px2)) {
                                double dComputeSizeMultiplier = DecodeUtils.computeSizeMultiplier(width, height, px, px2, imageDecoderDecoder3.options.getScale());
                                Ref.BooleanRef booleanRef5 = booleanRef4;
                                boolean z = dComputeSizeMultiplier < 1.0d;
                                booleanRef5.element = z;
                                if (z || !imageDecoderDecoder3.options.getAllowInexactSize()) {
                                    decoder.setTargetSize(MathKt__MathJVMKt.roundToInt(((double) width) * dComputeSizeMultiplier), MathKt__MathJVMKt.roundToInt(dComputeSizeMultiplier * ((double) height)));
                                }
                            }
                            imageDecoderDecoder3.configureImageDecoderProperties(decoder);
                        }
                    }));
                    Intrinsics.checkNotNullExpressionValue(drawableDecodeDrawable, "crossinline action: Imag…ction(info, source)\n    }");
                    return drawableDecodeDrawable;
                } finally {
                    ImageDecoder imageDecoderA = d4d.a(objectRef.element);
                    if (imageDecoderA != null) {
                        imageDecoderA.close();
                    }
                    imageSourceWrapImageSource.close();
                }
            }
        };
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = booleanRef3;
        anonymousClass1.label = 1;
        Object objRunInterruptible$default = InterruptibleKt.runInterruptible$default(null, function0, anonymousClass1, 1, null);
        if (objRunInterruptible$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        imageDecoderDecoder = this;
        booleanRef = booleanRef3;
        objWrapDrawable = objRunInterruptible$default;
        anonymousClass1.L$0 = booleanRef;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 2;
        objWrapDrawable = imageDecoderDecoder.wrapDrawable((Drawable) objWrapDrawable, anonymousClass1);
        if (objWrapDrawable == coroutine_suspended) {
            return coroutine_suspended;
        }
        booleanRef2 = booleanRef;
        return new DecodeResult((Drawable) objWrapDrawable, booleanRef2.element);
    }

    @JvmOverloads
    public ImageDecoderDecoder(@NotNull ImageSource imageSource, @NotNull Options options, boolean z) {
        this.source = imageSource;
        this.options = options;
        this.enforceMinimumFrameDelay = z;
    }

    public /* synthetic */ ImageDecoderDecoder(ImageSource imageSource, Options options, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageSource, options, (i & 4) != 0 ? true : z);
    }
}
