package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.LottieListener;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.extension.compose.style.standard.BaseStyleConfigurationState;
import com.nimbusds.jose.HeaderParameterNames;
import d53.u;
import d53.w;
import e23.p;
import e23.q;
import ge1.b;
import i3.e5;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import lc.u0;
import o13.r;
import o53.b0;
import o53.j;
import o53.k;
import o53.s0;
import org.apache.commons.io.IOUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.l0;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import t13.d;
import u13.a;
import u13.f;
import v.e0;
import v13.c;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ao\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022*\b\u0002\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aF\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a9\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a \u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0082@¢\u0006\u0004\b\u001b\u0010\u001c\u001a*\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082@¢\u0006\u0004\b\u001f\u0010 \u001a)\u0010#\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0017\u0010%\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&\u001a2\u0010'\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b'\u0010(\u001a1\u0010+\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,\u001a!\u00100\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101\u001a\u0017\u00102\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b2\u00103\u001a\u0013\u00104\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b4\u00103\"\u0014\u00105\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00106¨\u00069²\u0006\f\u00108\u001a\u0002078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "spec", "", "imageAssetsFolder", "fontAssetsFolder", "fontFileExtension", "cacheKey", "Lkotlin/Function3;", "", "", "Lt13/d;", "", "", "onRetry", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "rememberLottieComposition", "(Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le23/q;Lp3/m;II)Lcom/airbnb/lottie/compose/LottieCompositionResult;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/airbnb/lottie/LottieComposition;", "lottieComposition", "(Landroid/content/Context;Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "isWarmingCache", "Lcom/airbnb/lottie/LottieTask;", "lottieTask", "(Landroid/content/Context;Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Z)Lcom/airbnb/lottie/LottieTask;", "T", "await", "(Lcom/airbnb/lottie/LottieTask;Lt13/d;)Ljava/lang/Object;", "composition", "", "loadImagesFromAssets", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieComposition;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Lcom/airbnb/lottie/LottieImageAsset;", "asset", "maybeLoadImageFromAsset", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieImageAsset;Ljava/lang/String;)V", "maybeDecodeBase64Image", "(Lcom/airbnb/lottie/LottieImageAsset;)V", "loadFontsFromAssets", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieComposition;Ljava/lang/String;Ljava/lang/String;Lt13/d;)Ljava/lang/Object;", "Lcom/airbnb/lottie/model/Font;", BaseStyleConfigurationState.CONFIG_FONT, "maybeLoadTypefaceFromAssets", "(Landroid/content/Context;Lcom/airbnb/lottie/model/Font;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/graphics/Typeface;", "typeface", TtmlNode.TAG_STYLE, "typefaceForStyle", "(Landroid/graphics/Typeface;Ljava/lang/String;)Landroid/graphics/Typeface;", "ensureTrailingSlash", "(Ljava/lang/String;)Ljava/lang/String;", "ensureLeadingPeriod", "DefaultCacheKey", "Ljava/lang/String;", "Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;", "result", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RememberLottieCompositionKt {
    private static final String DefaultCacheKey = "__LottieInternalDefaultCacheKey__";

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p<b0, d<? super Unit>, Object> {
        final /* synthetic */ LottieComposition $composition;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $fontAssetsFolder;
        final /* synthetic */ String $fontFileExtension;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LottieComposition lottieComposition, Context context, String str, String str2, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$composition = lottieComposition;
            this.$context = context;
            this.$fontAssetsFolder = str;
            this.$fontFileExtension = str2;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$composition, this.$context, this.$fontAssetsFolder, this.$fontFileExtension, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            for (Font font : this.$composition.getFonts().values()) {
                Context context = this.$context;
                font.getClass();
                RememberLottieCompositionKt.maybeLoadTypefaceFromAssets(context, font, this.$fontAssetsFolder, this.$fontFileExtension);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
    public static final class C38772 extends i implements p<b0, d<? super Unit>, Object> {
        final /* synthetic */ LottieComposition $composition;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $imageAssetsFolder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38772(LottieComposition lottieComposition, Context context, String str, d<? super C38772> dVar) {
            super(2, dVar);
            this.$composition = lottieComposition;
            this.$context = context;
            this.$imageAssetsFolder = str;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C38772(this.$composition, this.$context, this.$imageAssetsFolder, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((C38772) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            for (LottieImageAsset lottieImageAsset : this.$composition.getImages().values()) {
                lottieImageAsset.getClass();
                RememberLottieCompositionKt.maybeDecodeBase64Image(lottieImageAsset);
                RememberLottieCompositionKt.maybeLoadImageFromAsset(this.$context, lottieImageAsset, this.$imageAssetsFolder);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.RememberLottieCompositionKt$lottieComposition$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @e(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt", f = "rememberLottieComposition.kt", l = {127, 128, 129}, m = "lottieComposition")
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RememberLottieCompositionKt.lottieComposition(null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", l = {92, 94}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends i implements p<b0, d<? super Unit>, Object> {
        final /* synthetic */ String $cacheKey;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $fontAssetsFolder;
        final /* synthetic */ String $fontFileExtension;
        final /* synthetic */ String $imageAssetsFolder;
        final /* synthetic */ q<Integer, Throwable, d<? super Boolean>, Object> $onRetry;
        final /* synthetic */ p1<LottieCompositionResultImpl> $result$delegate;
        final /* synthetic */ LottieCompositionSpec $spec;
        int I$0;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(q<? super Integer, ? super Throwable, ? super d<? super Boolean>, ? extends Object> qVar, Context context, LottieCompositionSpec lottieCompositionSpec, String str, String str2, String str3, String str4, p1<LottieCompositionResultImpl> p1Var, d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$onRetry = qVar;
            this.$context = context;
            this.$spec = lottieCompositionSpec;
            this.$imageAssetsFolder = str;
            this.$fontAssetsFolder = str2;
            this.$fontFileExtension = str3;
            this.$cacheKey = str4;
            this.$result$delegate = p1Var;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass3(this.$onRetry, this.$context, this.$spec, this.$imageAssetsFolder, this.$fontAssetsFolder, this.$fontFileExtension, this.$cacheKey, this.$result$delegate, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((AnonymousClass3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(5:23|45|25|26|27) */
        /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:18:0x0045  */
        /* JADX WARN: Code duplicated, block: B:20:0x005b  */
        /* JADX WARN: Code duplicated, block: B:21:0x005d A[PHI: r0 r4 r14
          0x005d: PHI (r0v7 int) = (r0v8 int), (r0v12 int) binds: [B:19:0x0059, B:13:0x0027] A[DONT_GENERATE, DONT_INLINE]
          0x005d: PHI (r4v6 java.lang.Throwable) = (r4v7 java.lang.Throwable), (r4v11 java.lang.Throwable) binds: [B:19:0x0059, B:13:0x0027] A[DONT_GENERATE, DONT_INLINE]
          0x005d: PHI (r14v14 java.lang.Object) = (r14v21 java.lang.Object), (r14v0 java.lang.Object) binds: [B:19:0x0059, B:13:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:23:0x0065 A[PHI: r0 r4
          0x0065: PHI (r0v4 int) = (r0v7 int), (r0v8 int) binds: [B:22:0x0063, B:17:0x0043] A[DONT_GENERATE, DONT_INLINE]
          0x0065: PHI (r4v4 java.lang.Throwable) = (r4v6 java.lang.Throwable), (r4v7 java.lang.Throwable) binds: [B:22:0x0063, B:17:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:39:0x00b8 A[ADDED_TO_REGION] */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        
            if (((java.lang.Boolean) r14).booleanValue() != false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
        
            if (r14 == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008e -> B:43:0x0091). Please report as a decompilation issue!!! */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i14;
            Throwable th3;
            int i15;
            Throwable th4;
            AnonymousClass3 anonymousClass3;
            a aVar = a.COROUTINE_SUSPENDED;
            int i16 = this.label;
            if (i16 != 0) {
                try {
                    if (i16 == 1) {
                        i14 = this.I$0;
                        th3 = (Throwable) this.L$0;
                        r.b(obj);
                    } else {
                        if (i16 != 2) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i15 = this.I$0;
                        th4 = (Throwable) this.L$0;
                        try {
                            r.b(obj);
                            anonymousClass3 = this;
                        } catch (Throwable th5) {
                            th3 = th5;
                            i14 = i15 + 1;
                            if (!RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate).isSuccess()) {
                                if (i14 != 0) {
                                    q<Integer, Throwable, d<? super Boolean>, Object> qVar = this.$onRetry;
                                    Integer num = new Integer(i14);
                                    th3.getClass();
                                    this.L$0 = th3;
                                    this.I$0 = i14;
                                    this.label = 1;
                                    obj = qVar.invoke(num, th3, this);
                                    if (obj == aVar) {
                                    }
                                } else {
                                    Throwable th6 = th3;
                                    i15 = i14;
                                    th4 = th6;
                                    Context context = this.$context;
                                    LottieCompositionSpec lottieCompositionSpec = this.$spec;
                                    String strEnsureTrailingSlash = RememberLottieCompositionKt.ensureTrailingSlash(this.$imageAssetsFolder);
                                    String strEnsureTrailingSlash2 = RememberLottieCompositionKt.ensureTrailingSlash(this.$fontAssetsFolder);
                                    String strEnsureLeadingPeriod = RememberLottieCompositionKt.ensureLeadingPeriod(this.$fontFileExtension);
                                    String str = this.$cacheKey;
                                    this.L$0 = th4;
                                    this.I$0 = i15;
                                    this.label = 2;
                                    anonymousClass3 = this;
                                    obj = RememberLottieCompositionKt.lottieComposition(context, lottieCompositionSpec, strEnsureTrailingSlash, strEnsureTrailingSlash2, strEnsureLeadingPeriod, str, anonymousClass3);
                                }
                                return aVar;
                            }
                            if (!RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate).isComplete()) {
                                RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate).completeExceptionally$lottie_compose_release(th3);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                } catch (Throwable th7) {
                    Throwable th8 = th7;
                    int i17 = i15;
                    th3 = th8;
                    i14 = i17 + 1;
                    if (!RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate).isSuccess()) {
                        if (i14 != 0) {
                            q<Integer, Throwable, d<? super Boolean>, Object> qVar2 = this.$onRetry;
                            Integer num2 = new Integer(i14);
                            th3.getClass();
                            this.L$0 = th3;
                            this.I$0 = i14;
                            this.label = 1;
                            obj = qVar2.invoke(num2, th3, this);
                            if (obj == aVar) {
                            }
                        } else {
                            Throwable th9 = th3;
                            i15 = i14;
                            th4 = th9;
                            Context context2 = this.$context;
                            LottieCompositionSpec lottieCompositionSpec2 = this.$spec;
                            String strEnsureTrailingSlash3 = RememberLottieCompositionKt.ensureTrailingSlash(this.$imageAssetsFolder);
                            String strEnsureTrailingSlash4 = RememberLottieCompositionKt.ensureTrailingSlash(this.$fontAssetsFolder);
                            String strEnsureLeadingPeriod2 = RememberLottieCompositionKt.ensureLeadingPeriod(this.$fontFileExtension);
                            String str2 = this.$cacheKey;
                            this.L$0 = th4;
                            this.I$0 = i15;
                            this.label = 2;
                            anonymousClass3 = this;
                            obj = RememberLottieCompositionKt.lottieComposition(context2, lottieCompositionSpec2, strEnsureTrailingSlash3, strEnsureTrailingSlash4, strEnsureLeadingPeriod2, str2, anonymousClass3);
                        }
                        return aVar;
                    }
                    if (!RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate).isComplete()) {
                        RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate).completeExceptionally$lottie_compose_release(th3);
                    }
                    return Unit.INSTANCE;
                }
                RememberLottieCompositionKt.rememberLottieComposition$lambda$1(anonymousClass3.$result$delegate).complete$lottie_compose_release((LottieComposition) obj);
                int i18 = i15;
                th3 = th4;
                i14 = i18;
            } else {
                r.b(obj);
                i14 = 0;
                th3 = null;
            }
            if (!RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate).isSuccess()) {
                if (i14 != 0) {
                    q<Integer, Throwable, d<? super Boolean>, Object> qVar3 = this.$onRetry;
                    Integer num3 = new Integer(i14);
                    th3.getClass();
                    this.L$0 = th3;
                    this.I$0 = i14;
                    this.label = 1;
                    obj = qVar3.invoke(num3, th3, this);
                    if (obj == aVar) {
                    }
                } else {
                    Throwable th10 = th3;
                    i15 = i14;
                    th4 = th10;
                    Context context3 = this.$context;
                    LottieCompositionSpec lottieCompositionSpec3 = this.$spec;
                    String strEnsureTrailingSlash5 = RememberLottieCompositionKt.ensureTrailingSlash(this.$imageAssetsFolder);
                    String strEnsureTrailingSlash6 = RememberLottieCompositionKt.ensureTrailingSlash(this.$fontAssetsFolder);
                    String strEnsureLeadingPeriod3 = RememberLottieCompositionKt.ensureLeadingPeriod(this.$fontFileExtension);
                    String str3 = this.$cacheKey;
                    this.L$0 = th4;
                    this.I$0 = i15;
                    this.label = 2;
                    anonymousClass3 = this;
                    obj = RememberLottieCompositionKt.lottieComposition(context3, lottieCompositionSpec3, strEnsureTrailingSlash5, strEnsureTrailingSlash6, strEnsureLeadingPeriod3, str3, anonymousClass3);
                }
                return aVar;
            }
            if (!RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate).isComplete() && th3 != null) {
                RememberLottieCompositionKt.rememberLottieComposition$lambda$1(this.$result$delegate).completeExceptionally$lottie_compose_release(th3);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object await(LottieTask<T> lottieTask, d<? super T> dVar) throws Throwable {
        final k kVar = new k(f.b(dVar), 1);
        kVar.q();
        lottieTask.addListener(new LottieListener() { // from class: com.airbnb.lottie.compose.RememberLottieCompositionKt$await$2$1
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(T t7) {
                if (kVar.e()) {
                    return;
                }
                j<T> jVar = kVar;
                int i14 = o13.q.f128596b;
                jVar.resumeWith(t7);
            }
        }).addFailureListener(new LottieListener() { // from class: com.airbnb.lottie.compose.RememberLottieCompositionKt$await$2$2
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Throwable th3) {
                if (kVar.e()) {
                    return;
                }
                j<T> jVar = kVar;
                int i14 = o13.q.f128596b;
                th3.getClass();
                jVar.resumeWith(new o13.q.b(th3));
            }
        });
        Object objP = kVar.p();
        a aVar = a.COROUTINE_SUSPENDED;
        return objP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureLeadingPeriod(String str) {
        return (w.J(str) || u.y(str, ".", false)) ? str : ".".concat(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureTrailingSlash(String str) {
        if (str == null || w.J(str)) {
            return null;
        }
        return w.D(str, IOUtils.DIR_SEPARATOR_UNIX) ? str : str.concat("/");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadFontsFromAssets(Context context, LottieComposition lottieComposition, String str, String str2, d<? super Unit> dVar) throws Throwable {
        if (lottieComposition.getFonts().isEmpty()) {
            return Unit.INSTANCE;
        }
        x53.c cVar = s0.f129406a;
        Object objE0 = b.e0(x53.b.f189152a, new AnonymousClass2(lottieComposition, context, str, str2, null), dVar);
        return objE0 == a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadImagesFromAssets(Context context, LottieComposition lottieComposition, String str, d<? super Unit> dVar) throws Throwable {
        if (!lottieComposition.hasImages()) {
            return Unit.INSTANCE;
        }
        x53.c cVar = s0.f129406a;
        Object objE0 = b.e0(x53.b.f189152a, new C38772(lottieComposition, context, str, null), dVar);
        return objE0 == a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object lottieComposition(Context context, LottieCompositionSpec lottieCompositionSpec, String str, String str2, String str3, String str4, d<? super LottieComposition> dVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String str5;
        Context context2;
        LottieComposition lottieComposition;
        String str6;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i14 = anonymousClass1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i14 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object objAwait = anonymousClass1.result;
        a aVar = a.COROUTINE_SUSPENDED;
        int i15 = anonymousClass1.label;
        if (i15 == 0) {
            r.b(objAwait);
            LottieTask<LottieComposition> lottieTask = lottieTask(context, lottieCompositionSpec, str4, false);
            if (lottieTask == null) {
                androidx.core.view.j.s("Unable to create parsing task for ", lottieCompositionSpec, ".");
                return null;
            }
            anonymousClass1.L$0 = context;
            anonymousClass1.L$1 = str;
            anonymousClass1.L$2 = str2;
            anonymousClass1.L$3 = str3;
            anonymousClass1.label = 1;
            objAwait = await(lottieTask, anonymousClass1);
            if (objAwait != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            str3 = (String) anonymousClass1.L$3;
            str2 = (String) anonymousClass1.L$2;
            str = (String) anonymousClass1.L$1;
            context = (Context) anonymousClass1.L$0;
            r.b(objAwait);
        } else {
            if (i15 != 2) {
                if (i15 != 3) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                LottieComposition lottieComposition2 = (LottieComposition) anonymousClass1.L$0;
                r.b(objAwait);
                return lottieComposition2;
            }
            lottieComposition = (LottieComposition) anonymousClass1.L$3;
            str6 = (String) anonymousClass1.L$2;
            str5 = (String) anonymousClass1.L$1;
            context2 = (Context) anonymousClass1.L$0;
            r.b(objAwait);
        }
        anonymousClass1.L$0 = lottieComposition;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.label = 3;
        if (loadFontsFromAssets(context2, lottieComposition, str5, str6, anonymousClass1) != aVar) {
            return aVar;
        }
        return lottieComposition;
        LottieComposition lottieComposition3 = (LottieComposition) objAwait;
        anonymousClass1.L$0 = context;
        anonymousClass1.L$1 = str2;
        anonymousClass1.L$2 = str3;
        anonymousClass1.L$3 = lottieComposition3;
        anonymousClass1.label = 2;
        if (loadImagesFromAssets(context, lottieComposition3, str, anonymousClass1) != aVar) {
            str5 = str2;
            context2 = context;
            lottieComposition = lottieComposition3;
            str6 = str3;
            anonymousClass1.L$0 = lottieComposition;
            anonymousClass1.L$1 = null;
            anonymousClass1.L$2 = null;
            anonymousClass1.L$3 = null;
            anonymousClass1.label = 3;
            if (loadFontsFromAssets(context2, lottieComposition, str5, str6, anonymousClass1) != aVar) {
                return lottieComposition;
            }
        }
        return aVar;
    }

    private static final LottieTask<LottieComposition> lottieTask(Context context, LottieCompositionSpec lottieCompositionSpec, String str, boolean z14) throws FileNotFoundException {
        if (lottieCompositionSpec instanceof LottieCompositionSpec.RawRes) {
            return s.g(str, DefaultCacheKey) ? LottieCompositionFactory.fromRawRes(context, ((LottieCompositionSpec.RawRes) lottieCompositionSpec).m46unboximpl()) : LottieCompositionFactory.fromRawRes(context, ((LottieCompositionSpec.RawRes) lottieCompositionSpec).m46unboximpl(), str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.Url) {
            return s.g(str, DefaultCacheKey) ? LottieCompositionFactory.fromUrl(context, ((LottieCompositionSpec.Url) lottieCompositionSpec).m53unboximpl()) : LottieCompositionFactory.fromUrl(context, ((LottieCompositionSpec.Url) lottieCompositionSpec).m53unboximpl(), str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.File) {
            if (z14) {
                return null;
            }
            LottieCompositionSpec.File file = (LottieCompositionSpec.File) lottieCompositionSpec;
            FileInputStream fileInputStream = new FileInputStream(file.m32unboximpl());
            if (s.g(str, DefaultCacheKey)) {
                str = file.m32unboximpl();
            }
            if (u.p(file.m32unboximpl(), HeaderParameterNames.COMPRESSION_ALGORITHM, false)) {
                return LottieCompositionFactory.fromZipStream(new ZipInputStream(fileInputStream), str);
            }
            return u.p(file.m32unboximpl(), "tgs", false) ? LottieCompositionFactory.fromJsonInputStream(new GZIPInputStream(fileInputStream), str) : LottieCompositionFactory.fromJsonInputStream(fileInputStream, str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.Asset) {
            return s.g(str, DefaultCacheKey) ? LottieCompositionFactory.fromAsset(context, ((LottieCompositionSpec.Asset) lottieCompositionSpec).m18unboximpl()) : LottieCompositionFactory.fromAsset(context, ((LottieCompositionSpec.Asset) lottieCompositionSpec).m18unboximpl(), str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.JsonString) {
            if (s.g(str, DefaultCacheKey)) {
                str = String.valueOf(((LottieCompositionSpec.JsonString) lottieCompositionSpec).m39unboximpl().hashCode());
            }
            return LottieCompositionFactory.fromJsonString(((LottieCompositionSpec.JsonString) lottieCompositionSpec).m39unboximpl(), str);
        }
        if (!(lottieCompositionSpec instanceof LottieCompositionSpec.ContentProvider)) {
            u0.r();
            return null;
        }
        LottieCompositionSpec.ContentProvider contentProvider = (LottieCompositionSpec.ContentProvider) lottieCompositionSpec;
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(contentProvider.m25unboximpl());
        if (s.g(str, DefaultCacheKey)) {
            str = contentProvider.m25unboximpl().toString();
        }
        String string = contentProvider.m25unboximpl().toString();
        string.getClass();
        if (u.p(string, HeaderParameterNames.COMPRESSION_ALGORITHM, false)) {
            return LottieCompositionFactory.fromZipStream(new ZipInputStream(inputStreamOpenInputStream), str);
        }
        String string2 = contentProvider.m25unboximpl().toString();
        string2.getClass();
        return u.p(string2, "tgs", false) ? LottieCompositionFactory.fromJsonInputStream(new GZIPInputStream(inputStreamOpenInputStream), str) : LottieCompositionFactory.fromJsonInputStream(inputStreamOpenInputStream, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void maybeDecodeBase64Image(LottieImageAsset lottieImageAsset) {
        if (lottieImageAsset.getBitmap() != null) {
            return;
        }
        String fileName = lottieImageAsset.getFileName();
        fileName.getClass();
        if (!u.y(fileName, "data:", false) || w.H(fileName, "base64,", 0, false, 6) <= 0) {
            return;
        }
        try {
            byte[] bArrDecode = Base64.decode(fileName.substring(w.G(CoreConstants.COMMA_CHAR, 0, 6, fileName) + 1), 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = SyslogConstants.LOG_LOCAL4;
            lottieImageAsset.setBitmap(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
        } catch (IllegalArgumentException e4) {
            Logger.warning("data URL did not have correct base64 format.", e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void maybeLoadImageFromAsset(Context context, LottieImageAsset lottieImageAsset, String str) {
        if (lottieImageAsset.getBitmap() != null || str == null) {
            return;
        }
        String fileName = lottieImageAsset.getFileName();
        try {
            InputStream inputStreamOpen = context.getAssets().open(str + fileName);
            inputStreamOpen.getClass();
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = SyslogConstants.LOG_LOCAL4;
                lottieImageAsset.setBitmap(Utils.resizeBitmapIfNeeded(BitmapFactory.decodeStream(inputStreamOpen, null, options), lottieImageAsset.getWidth(), lottieImageAsset.getHeight()));
            } catch (IllegalArgumentException e4) {
                Logger.warning("Unable to decode image.", e4);
            }
        } catch (IOException e14) {
            Logger.warning("Unable to open asset.", e14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void maybeLoadTypefaceFromAssets(Context context, Font font, String str, String str2) {
        String strG = e5.g(str, font.getFamily(), str2);
        try {
            Typeface typefaceCreateFromAsset = Typeface.createFromAsset(context.getAssets(), strG);
            try {
                typefaceCreateFromAsset.getClass();
                String style = font.getStyle();
                style.getClass();
                font.setTypeface(typefaceForStyle(typefaceCreateFromAsset, style));
            } catch (Exception e4) {
                Logger.error(e0.g("Failed to create ", font.getFamily(), " typeface with style=", font.getStyle(), "!"), e4);
            }
        } catch (Exception e14) {
            Logger.error("Failed to find typeface in assets with path " + strG + ".", e14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c1  */
    public static final LottieCompositionResult rememberLottieComposition(LottieCompositionSpec lottieCompositionSpec, String str, String str2, String str3, String str4, q<? super Integer, ? super Throwable, ? super d<? super Boolean>, ? extends Object> qVar, m mVar, int i14, int i15) throws FileNotFoundException {
        lottieCompositionSpec.getClass();
        mVar.L(-1248473602);
        String str5 = (i15 & 2) != 0 ? null : str;
        String str6 = (i15 & 4) != 0 ? "fonts/" : str2;
        String str7 = (i15 & 8) != 0 ? ".ttf" : str3;
        String str8 = (i15 & 16) != 0 ? DefaultCacheKey : str4;
        q<? super Integer, ? super Throwable, ? super d<? super Boolean>, ? extends Object> c38781 = (i15 & 32) != 0 ? new C38781(null) : qVar;
        x1 x1Var = n.f135158a;
        Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
        mVar.L(1388713922);
        int i16 = (i14 & 14) ^ 6;
        boolean z14 = (i16 > 4 && mVar.B(lottieCompositionSpec)) || (i14 & 6) == 4;
        Object objQ = mVar.q();
        m.a aVar = m.f135153a;
        if (z14) {
            objQ = p0.n(new LottieCompositionResultImpl());
            mVar.K(objQ);
        } else {
            aVar.getClass();
            if (objQ == m.a.f135155b) {
                objQ = p0.n(new LottieCompositionResultImpl());
                mVar.K(objQ);
            }
        }
        p1 p1Var = (p1) objQ;
        mVar.R();
        mVar.L(1388714213);
        boolean z15 = ((i16 > 4 && mVar.B(lottieCompositionSpec)) || (i14 & 6) == 4) | ((((57344 & i14) ^ 24576) > 16384 && mVar.B(str8)) || (i14 & 24576) == 16384);
        Object objQ2 = mVar.q();
        if (z15) {
            objQ2 = lottieTask(context, lottieCompositionSpec, str8, true);
            mVar.K(objQ2);
        } else {
            aVar.getClass();
            if (objQ2 == m.a.f135155b) {
                objQ2 = lottieTask(context, lottieCompositionSpec, str8, true);
                mVar.K(objQ2);
            }
        }
        mVar.R();
        l0.f(lottieCompositionSpec, str8, new AnonymousClass3(c38781, context, lottieCompositionSpec, str5, str6, str7, str8, p1Var, null), mVar);
        LottieCompositionResultImpl lottieCompositionResultImplRememberLottieComposition$lambda$1 = rememberLottieComposition$lambda$1(p1Var);
        mVar.R();
        return lottieCompositionResultImplRememberLottieComposition$lambda$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieCompositionResultImpl rememberLottieComposition$lambda$1(p1<LottieCompositionResultImpl> p1Var) {
        return p1Var.getF182175a();
    }

    private static final Typeface typefaceForStyle(Typeface typeface, String str) {
        int i14 = 0;
        boolean z14 = w.z(str, "Italic", false);
        boolean z15 = w.z(str, "Bold", false);
        if (z14 && z15) {
            i14 = 3;
        } else if (z14) {
            i14 = 2;
        } else if (z15) {
            i14 = 1;
        }
        return typeface.getStyle() == i14 ? typeface : Typeface.create(typeface, i14);
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @e(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
    public static final class C38781 extends i implements q<Integer, Throwable, d<? super Boolean>, Object> {
        int label;

        public C38781(d<? super C38781> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Throwable th3, d<? super Boolean> dVar) {
            return invoke(num.intValue(), th3, dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                r.b(obj);
                return Boolean.FALSE;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        public final Object invoke(int i14, Throwable th3, d<? super Boolean> dVar) {
            return new C38781(dVar).invokeSuspend(Unit.INSTANCE);
        }
    }
}
