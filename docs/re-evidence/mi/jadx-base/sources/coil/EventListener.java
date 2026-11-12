package coil;

import android.graphics.Bitmap;
import coil.EventListener;
import coil.decode.DecodeResult;
import coil.decode.Decoder;
import coil.fetch.FetchResult;
import coil.fetch.Fetcher;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.Options;
import coil.request.SuccessResult;
import coil.size.Size;
import coil.transition.Transition;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 +2\u00020\u0001:\u0002+,J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0017J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0017J*\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0010H\u0017J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\tH\u0017J\u001a\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0017H\u0017J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0017J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u001cH\u0017J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u001fH\u0017J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"H\u0017J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020%H\u0017J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020%H\u0017J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010(\u001a\u00020)H\u0017J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010(\u001a\u00020)H\u0017¨\u0006-"}, d2 = {"Lcoil/EventListener;", "Lcoil/request/ImageRequest$Listener;", "decodeEnd", "", "request", "Lcoil/request/ImageRequest;", "decoder", "Lcoil/decode/Decoder;", "options", "Lcoil/request/Options;", "result", "Lcoil/decode/DecodeResult;", "decodeStart", "fetchEnd", "fetcher", "Lcoil/fetch/Fetcher;", "Lcoil/fetch/FetchResult;", "fetchStart", "keyEnd", "output", "", "keyStart", "input", "", "mapEnd", "mapStart", "onCancel", "onError", "Lcoil/request/ErrorResult;", LifecycleConstantKt.ON_START, "onSuccess", "Lcoil/request/SuccessResult;", "resolveSizeEnd", MediaStoreUtil.MediaInfo.SIZE, "Lcoil/size/Size;", "resolveSizeStart", "transformEnd", "Landroid/graphics/Bitmap;", "transformStart", "transitionEnd", "transition", "Lcoil/transition/Transition;", "transitionStart", "Companion", "Factory", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface EventListener extends ImageRequest.Listener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @JvmField
    @NotNull
    public static final EventListener NONE = new EventListener() { // from class: coil.EventListener$Companion$NONE$1
        @Override // coil.EventListener
        public void decodeEnd(@NotNull ImageRequest imageRequest, @NotNull Decoder decoder, @NotNull Options options, @Nullable DecodeResult decodeResult) {
            EventListener.DefaultImpls.decodeEnd(this, imageRequest, decoder, options, decodeResult);
        }

        @Override // coil.EventListener
        public void decodeStart(@NotNull ImageRequest imageRequest, @NotNull Decoder decoder, @NotNull Options options) {
            EventListener.DefaultImpls.decodeStart(this, imageRequest, decoder, options);
        }

        @Override // coil.EventListener
        public void fetchEnd(@NotNull ImageRequest imageRequest, @NotNull Fetcher fetcher, @NotNull Options options, @Nullable FetchResult fetchResult) {
            EventListener.DefaultImpls.fetchEnd(this, imageRequest, fetcher, options, fetchResult);
        }

        @Override // coil.EventListener
        public void fetchStart(@NotNull ImageRequest imageRequest, @NotNull Fetcher fetcher, @NotNull Options options) {
            EventListener.DefaultImpls.fetchStart(this, imageRequest, fetcher, options);
        }

        @Override // coil.EventListener
        public void keyEnd(@NotNull ImageRequest imageRequest, @Nullable String str) {
            EventListener.DefaultImpls.keyEnd(this, imageRequest, str);
        }

        @Override // coil.EventListener
        public void keyStart(@NotNull ImageRequest imageRequest, @NotNull Object obj) {
            EventListener.DefaultImpls.keyStart(this, imageRequest, obj);
        }

        @Override // coil.EventListener
        public void mapEnd(@NotNull ImageRequest imageRequest, @NotNull Object obj) {
            EventListener.DefaultImpls.mapEnd(this, imageRequest, obj);
        }

        @Override // coil.EventListener
        public void mapStart(@NotNull ImageRequest imageRequest, @NotNull Object obj) {
            EventListener.DefaultImpls.mapStart(this, imageRequest, obj);
        }

        @Override // coil.EventListener, coil.request.ImageRequest.Listener
        public void onCancel(@NotNull ImageRequest imageRequest) {
            EventListener.DefaultImpls.onCancel(this, imageRequest);
        }

        @Override // coil.EventListener, coil.request.ImageRequest.Listener
        public void onError(@NotNull ImageRequest imageRequest, @NotNull ErrorResult errorResult) {
            EventListener.DefaultImpls.onError(this, imageRequest, errorResult);
        }

        @Override // coil.EventListener, coil.request.ImageRequest.Listener
        public void onStart(@NotNull ImageRequest imageRequest) {
            EventListener.DefaultImpls.onStart(this, imageRequest);
        }

        @Override // coil.EventListener, coil.request.ImageRequest.Listener
        public void onSuccess(@NotNull ImageRequest imageRequest, @NotNull SuccessResult successResult) {
            EventListener.DefaultImpls.onSuccess(this, imageRequest, successResult);
        }

        @Override // coil.EventListener
        public void resolveSizeEnd(@NotNull ImageRequest imageRequest, @NotNull Size size) {
            EventListener.DefaultImpls.resolveSizeEnd(this, imageRequest, size);
        }

        @Override // coil.EventListener
        public void resolveSizeStart(@NotNull ImageRequest imageRequest) {
            EventListener.DefaultImpls.resolveSizeStart(this, imageRequest);
        }

        @Override // coil.EventListener
        public void transformEnd(@NotNull ImageRequest imageRequest, @NotNull Bitmap bitmap) {
            EventListener.DefaultImpls.transformEnd(this, imageRequest, bitmap);
        }

        @Override // coil.EventListener
        public void transformStart(@NotNull ImageRequest imageRequest, @NotNull Bitmap bitmap) {
            EventListener.DefaultImpls.transformStart(this, imageRequest, bitmap);
        }

        @Override // coil.EventListener
        public void transitionEnd(@NotNull ImageRequest imageRequest, @NotNull Transition transition) {
            EventListener.DefaultImpls.transitionEnd(this, imageRequest, transition);
        }

        @Override // coil.EventListener
        public void transitionStart(@NotNull ImageRequest imageRequest, @NotNull Transition transition) {
            EventListener.DefaultImpls.transitionStart(this, imageRequest, transition);
        }
    };

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lcoil/EventListener$Companion;", "", "()V", "NONE", "Lcoil/EventListener;", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void decodeEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Decoder decoder, @NotNull Options options, @Nullable DecodeResult decodeResult) {
        }

        public static void decodeStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Decoder decoder, @NotNull Options options) {
        }

        public static void fetchEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Fetcher fetcher, @NotNull Options options, @Nullable FetchResult fetchResult) {
        }

        public static void fetchStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Fetcher fetcher, @NotNull Options options) {
        }

        public static void keyEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @Nullable String str) {
        }

        public static void keyStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Object obj) {
        }

        public static void mapEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Object obj) {
        }

        public static void mapStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Object obj) {
        }

        public static void onCancel(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest) {
        }

        public static void onError(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull ErrorResult errorResult) {
        }

        public static void onStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest) {
        }

        public static void onSuccess(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull SuccessResult successResult) {
        }

        public static void resolveSizeEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Size size) {
        }

        public static void resolveSizeStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest) {
        }

        public static void transformEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Bitmap bitmap) {
        }

        public static void transformStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Bitmap bitmap) {
        }

        public static void transitionEnd(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Transition transition) {
        }

        public static void transitionStart(@NotNull EventListener eventListener, @NotNull ImageRequest imageRequest, @NotNull Transition transition) {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcoil/EventListener$Factory;", "", "create", "Lcoil/EventListener;", "request", "Lcoil/request/ImageRequest;", "Companion", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface Factory {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @JvmField
        @NotNull
        public static final Factory NONE = new Factory() { // from class: rd8
            @Override // coil.EventListener.Factory
            public final EventListener create(ImageRequest imageRequest) {
                return EventListener.Factory.DefaultImpls.m74NONE$lambda0(imageRequest);
            }
        };

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0005"}, d2 = {"Lcoil/EventListener$Factory$Companion;", "", "()V", "NONE", "Lcoil/EventListener$Factory;", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class DefaultImpls {
            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: NONE$lambda-0, reason: not valid java name */
            public static EventListener m74NONE$lambda0(ImageRequest imageRequest) {
                return EventListener.NONE;
            }
        }

        @NotNull
        EventListener create(@NotNull ImageRequest request);
    }

    void decodeEnd(@NotNull ImageRequest request, @NotNull Decoder decoder, @NotNull Options options, @Nullable DecodeResult result);

    void decodeStart(@NotNull ImageRequest request, @NotNull Decoder decoder, @NotNull Options options);

    void fetchEnd(@NotNull ImageRequest request, @NotNull Fetcher fetcher, @NotNull Options options, @Nullable FetchResult result);

    void fetchStart(@NotNull ImageRequest request, @NotNull Fetcher fetcher, @NotNull Options options);

    void keyEnd(@NotNull ImageRequest request, @Nullable String output);

    void keyStart(@NotNull ImageRequest request, @NotNull Object input);

    void mapEnd(@NotNull ImageRequest request, @NotNull Object output);

    void mapStart(@NotNull ImageRequest request, @NotNull Object input);

    @Override // coil.request.ImageRequest.Listener
    void onCancel(@NotNull ImageRequest request);

    @Override // coil.request.ImageRequest.Listener
    void onError(@NotNull ImageRequest request, @NotNull ErrorResult result);

    @Override // coil.request.ImageRequest.Listener
    void onStart(@NotNull ImageRequest request);

    @Override // coil.request.ImageRequest.Listener
    void onSuccess(@NotNull ImageRequest request, @NotNull SuccessResult result);

    void resolveSizeEnd(@NotNull ImageRequest request, @NotNull Size size);

    void resolveSizeStart(@NotNull ImageRequest request);

    void transformEnd(@NotNull ImageRequest request, @NotNull Bitmap output);

    void transformStart(@NotNull ImageRequest request, @NotNull Bitmap input);

    void transitionEnd(@NotNull ImageRequest request, @NotNull Transition transition);

    void transitionStart(@NotNull ImageRequest request, @NotNull Transition transition);
}
