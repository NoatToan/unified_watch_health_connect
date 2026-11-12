package coil.decode;

import android.graphics.Bitmap;
import android.graphics.Movie;
import coil.ImageLoader;
import coil.drawable.MovieDrawable;
import coil.fetch.SourceResult;
import coil.request.Gifs;
import coil.request.Options;
import coil.util.GifUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.InterruptibleKt;
import okio.BufferedSource;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcoil/decode/GifDecoder;", "Lcoil/decode/Decoder;", "source", "Lcoil/decode/ImageSource;", "options", "Lcoil/request/Options;", "enforceMinimumFrameDelay", "", "(Lcoil/decode/ImageSource;Lcoil/request/Options;Z)V", "decode", "Lcoil/decode/DecodeResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "Factory", "coil-gif_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GifDecoder implements Decoder {

    @NotNull
    public static final String ANIMATED_TRANSFORMATION_KEY = "coil#animated_transformation";

    @NotNull
    public static final String ANIMATION_END_CALLBACK_KEY = "coil#animation_end_callback";

    @NotNull
    public static final String ANIMATION_START_CALLBACK_KEY = "coil#animation_start_callback";

    @NotNull
    public static final String REPEAT_COUNT_KEY = "coil#repeat_count";
    private final boolean enforceMinimumFrameDelay;

    @NotNull
    private final Options options;

    @NotNull
    private final ImageSource source;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcoil/decode/GifDecoder$Factory;", "Lcoil/decode/Decoder$Factory;", "enforceMinimumFrameDelay", "", "(Z)V", "create", "Lcoil/decode/Decoder;", "result", "Lcoil/fetch/SourceResult;", "options", "Lcoil/request/Options;", "imageLoader", "Lcoil/ImageLoader;", "equals", "other", "", "hashCode", "", "coil-gif_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Factory implements Decoder.Factory {
        private final boolean enforceMinimumFrameDelay;

        @JvmOverloads
        public Factory() {
            this(false, 1, null);
        }

        @Override // coil.decode.Decoder.Factory
        @Nullable
        public Decoder create(@NotNull SourceResult result, @NotNull Options options, @NotNull ImageLoader imageLoader) {
            if (GifDecodeUtils.isGif(DecodeUtils.INSTANCE, result.getSource().source())) {
                return new GifDecoder(result.getSource(), options, this.enforceMinimumFrameDelay);
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

    @JvmOverloads
    public GifDecoder(@NotNull ImageSource imageSource, @NotNull Options options) {
        this(imageSource, options, false, 4, null);
    }

    @Override // coil.decode.Decoder
    @Nullable
    public Object decode(@NotNull Continuation<? super DecodeResult> continuation) {
        return InterruptibleKt.runInterruptible$default(null, new Function0<DecodeResult>() { // from class: coil.decode.GifDecoder.decode.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DecodeResult invoke() {
                Bitmap.Config config;
                BufferedSource bufferedSourceBuffer = GifDecoder.this.enforceMinimumFrameDelay ? Okio.buffer(new FrameDelayRewritingSource(GifDecoder.this.source.source())) : GifDecoder.this.source.source();
                try {
                    Movie movieDecodeStream = Movie.decodeStream(bufferedSourceBuffer.inputStream());
                    CloseableKt.closeFinally(bufferedSourceBuffer, null);
                    if (movieDecodeStream == null || movieDecodeStream.width() <= 0 || movieDecodeStream.height() <= 0) {
                        throw new IllegalStateException("Failed to decode GIF.".toString());
                    }
                    if (movieDecodeStream.isOpaque() && GifDecoder.this.options.getAllowRgb565()) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = GifUtils.isHardware(GifDecoder.this.options.getConfig()) ? Bitmap.Config.ARGB_8888 : GifDecoder.this.options.getConfig();
                    }
                    MovieDrawable movieDrawable = new MovieDrawable(movieDecodeStream, config, GifDecoder.this.options.getScale());
                    Integer numRepeatCount = Gifs.repeatCount(GifDecoder.this.options.getParameters());
                    movieDrawable.setRepeatCount(numRepeatCount != null ? numRepeatCount.intValue() : -1);
                    Function0<Unit> function0AnimationStartCallback = Gifs.animationStartCallback(GifDecoder.this.options.getParameters());
                    Function0<Unit> function0AnimationEndCallback = Gifs.animationEndCallback(GifDecoder.this.options.getParameters());
                    if (function0AnimationStartCallback != null || function0AnimationEndCallback != null) {
                        movieDrawable.registerAnimationCallback(GifUtils.animatable2CompatCallbackOf(function0AnimationStartCallback, function0AnimationEndCallback));
                    }
                    movieDrawable.setAnimatedTransformation(Gifs.animatedTransformation(GifDecoder.this.options.getParameters()));
                    return new DecodeResult(movieDrawable, false);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(bufferedSourceBuffer, th);
                        throw th2;
                    }
                }
            }
        }, continuation, 1, null);
    }

    @JvmOverloads
    public GifDecoder(@NotNull ImageSource imageSource, @NotNull Options options, boolean z) {
        this.source = imageSource;
        this.options = options;
        this.enforceMinimumFrameDelay = z;
    }

    public /* synthetic */ GifDecoder(ImageSource imageSource, Options options, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageSource, options, (i & 4) != 0 ? true : z);
    }
}
