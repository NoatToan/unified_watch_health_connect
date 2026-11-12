package com.huami.pai.ext;

import android.annotation.SuppressLint;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieOnCompositionLoadedListener;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0083\u0001\u0010\t\u001a\u00020\b*\u00020\u000024\b\u0002\u0010\u0006\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001j\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u000524\b\u0002\u0010\u0007\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0001j\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\u0081@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000e\u001a\u00020\r*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/airbnb/lottie/LottieAnimationView;", "Ljava/util/HashMap;", "", "", "", "Lkotlin/collections/HashMap;", "strokeMap", "colorMap", "", "awaitCompositionLoaded", "(Lcom/airbnb/lottie/LottieAnimationView;Ljava/util/HashMap;Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/airbnb/lottie/model/KeyPath;", "string", "", "isSameKey", "(Lcom/airbnb/lottie/model/KeyPath;[Ljava/lang/String;)Z", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class LottieExKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Throwable, Unit> {
        public final /* synthetic */ LottieAnimationView a;
        public final /* synthetic */ LottieExKt$awaitCompositionLoaded$2$listener$1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LottieAnimationView lottieAnimationView, LottieExKt$awaitCompositionLoaded$2$listener$1 lottieExKt$awaitCompositionLoaded$2$listener$1) {
            super(1);
            this.a = lottieAnimationView;
            this.b = lottieExKt$awaitCompositionLoaded$2$listener$1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
            this.a.removeLottieOnCompositionLoadedListener(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.airbnb.lottie.LottieOnCompositionLoadedListener, com.huami.pai.ext.LottieExKt$awaitCompositionLoaded$2$listener$1] */
    @ExperimentalCoroutinesApi
    @Nullable
    public static final Object awaitCompositionLoaded(@NotNull final LottieAnimationView lottieAnimationView, @Nullable final HashMap<String[], Integer> map, @Nullable final HashMap<String[], Integer> map2, @NotNull Continuation<? super Unit> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        ?? r1 = new LottieOnCompositionLoadedListener() { // from class: com.huami.pai.ext.LottieExKt$awaitCompositionLoaded$2$listener$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/airbnb/lottie/value/LottieFrameInfo;", "", "kotlin.jvm.PlatformType", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a<T> implements SimpleLottieValueCallback {
                public final /* synthetic */ Map.Entry<String[], Integer> a;

                public a(Map.Entry<String[], Integer> entry) {
                    this.a = entry;
                }

                @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Integer getValue(LottieFrameInfo<Integer> lottieFrameInfo) {
                    return this.a.getValue();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/airbnb/lottie/value/LottieFrameInfo;", "", "kotlin.jvm.PlatformType", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b<T> implements SimpleLottieValueCallback {
                public final /* synthetic */ Map.Entry<String[], Integer> a;

                public b(Map.Entry<String[], Integer> entry) {
                    this.a = entry;
                }

                @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Integer getValue(LottieFrameInfo<Integer> lottieFrameInfo) {
                    return this.a.getValue();
                }
            }

            @Override // com.airbnb.lottie.LottieOnCompositionLoadedListener
            public void onCompositionLoaded(@Nullable LottieComposition composition) {
                Set<Map.Entry<String[], Integer>> setEntrySet;
                Set<Map.Entry<String[], Integer>> setEntrySet2;
                List<KeyPath> listResolveKeyPath = lottieAnimationView.resolveKeyPath(new KeyPath("**"));
                if (listResolveKeyPath != null) {
                    HashMap<String[], Integer> map3 = map;
                    HashMap<String[], Integer> map4 = map2;
                    LottieAnimationView lottieAnimationView2 = lottieAnimationView;
                    for (KeyPath keyPath : listResolveKeyPath) {
                        Iterator<Map.Entry<String[], Integer>> it2 = (map3 == null || (setEntrySet = map3.entrySet()) == null) ? null : setEntrySet.iterator();
                        if (it2 != null) {
                            while (it2.hasNext()) {
                                Map.Entry<String[], Integer> next = it2.next();
                                if (LottieExKt.isSameKey(keyPath, next.getKey())) {
                                    lottieAnimationView2.addValueCallback(keyPath, LottieProperty.STROKE_COLOR, new a(next));
                                }
                            }
                        }
                        Iterator<Map.Entry<String[], Integer>> it3 = (map4 == null || (setEntrySet2 = map4.entrySet()) == null) ? null : setEntrySet2.iterator();
                        if (it3 != null) {
                            while (it3.hasNext()) {
                                Map.Entry<String[], Integer> next2 = it3.next();
                                if (LottieExKt.isSameKey(keyPath, next2.getKey())) {
                                    lottieAnimationView2.addValueCallback(keyPath, LottieProperty.COLOR, new b(next2));
                                }
                            }
                        }
                    }
                }
                if (cancellableContinuationImpl.isCompleted()) {
                    return;
                }
                cancellableContinuationImpl.resume(Unit.INSTANCE, null);
            }
        };
        cancellableContinuationImpl.invokeOnCancellation(new a(lottieAnimationView, r1));
        lottieAnimationView.addLottieOnCompositionLoadedListener(r1);
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public static /* synthetic */ Object awaitCompositionLoaded$default(LottieAnimationView lottieAnimationView, HashMap map, HashMap map2, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            map = null;
        }
        if ((i & 2) != 0) {
            map2 = null;
        }
        return awaitCompositionLoaded(lottieAnimationView, map, map2, continuation);
    }

    @SuppressLint({"RestrictedApi"})
    public static final boolean isSameKey(@NotNull KeyPath keyPath, @NotNull String[] strArr) {
        int length = strArr.length;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            if (!keyPath.matches(strArr[i], i2)) {
                z = false;
            }
            i++;
            i2 = i3;
        }
        return z;
    }
}
