package com.airbnb.lottie.compose;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import c2.q;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieFeatureFlag;
import com.airbnb.lottie.RenderMode;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.a;
import e23.l;
import e23.p;
import f5.f2;
import f5.k;
import h4.d;
import h4.r;
import java.util.Map;
import n4.g;
import n4.h;
import o13.e;
import o4.y;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p005kotlin.math.MathKt;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import q4.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÃ\u0001\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u009d\u0001\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001e\u0010 \u001aó\u0001\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010(\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001e\u0010)\u001a\u001f\u00100\u001a\u00020-*\u00020*2\u0006\u0010,\u001a\u00020+H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062²\u0006\u0010\u00101\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Lcom/airbnb/lottie/LottieComposition;", "composition", "Lkotlin/Function0;", "", "progress", "Lh4/r;", "modifier", "", "outlineMasksAndMattes", "applyOpacityToLayers", "enableMergePaths", "Lcom/airbnb/lottie/RenderMode;", "renderMode", "maintainOriginalImageBounds", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "dynamicProperties", "Lh4/d;", "alignment", "Lf5/k;", "contentScale", "clipToCompositionBounds", "clipTextToBoundingBox", "", "", "Landroid/graphics/Typeface;", "fontMap", "Lcom/airbnb/lottie/AsyncUpdates;", "asyncUpdates", "safeMode", "", "LottieAnimation", "(Lcom/airbnb/lottie/LottieComposition;Le23/a;Lh4/r;ZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;Lh4/d;Lf5/k;ZZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;ZLp3/m;III)V", "(Lcom/airbnb/lottie/LottieComposition;FLh4/r;ZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;Lh4/d;Lf5/k;ZZLcom/airbnb/lottie/AsyncUpdates;Lp3/m;III)V", "isPlaying", "restartOnPlay", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "speed", "", "iterations", "reverseOnRepeat", "(Lcom/airbnb/lottie/LottieComposition;Lh4/r;ZZLcom/airbnb/lottie/compose/LottieClipSpec;FIZZZLcom/airbnb/lottie/RenderMode;ZZLcom/airbnb/lottie/compose/LottieDynamicProperties;Lh4/d;Lf5/k;ZZLjava/util/Map;ZLcom/airbnb/lottie/AsyncUpdates;Lp3/m;IIII)V", "Ln4/g;", "Lf5/f2;", "scale", "Lg6/m;", "times-UQTWf7w", "(JJ)J", "times", "setDynamicProperties", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LottieAnimationKt {
    /* JADX WARN: Code duplicated, block: B:91:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void LottieAnimation(LottieComposition lottieComposition, r rVar, boolean z14, boolean z15, LottieClipSpec lottieClipSpec, float f14, int i14, boolean z16, boolean z17, boolean z18, RenderMode renderMode, boolean z19, boolean z24, LottieDynamicProperties lottieDynamicProperties, d dVar, k kVar, boolean z25, boolean z26, Map<String, ? extends Typeface> map, boolean z27, AsyncUpdates asyncUpdates, m mVar, int i15, int i16, int i17, int i18) {
        d dVar2;
        k kVar2;
        boolean z28;
        boolean z29;
        d dVar3;
        boolean z34;
        RenderMode renderMode2;
        p2 p2VarI0;
        o0 o0VarE = mVar.E(-1151869807);
        r rVar2 = (i18 & 2) != 0 ? r.S : rVar;
        boolean z35 = (i18 & 4) != 0 ? true : z14;
        boolean z36 = (i18 & 8) != 0 ? true : z15;
        LottieClipSpec lottieClipSpec2 = (i18 & 16) != 0 ? null : lottieClipSpec;
        float f15 = (i18 & 32) != 0 ? 1.0f : f14;
        int i19 = (i18 & 64) != 0 ? 1 : i14;
        boolean z37 = (i18 & 128) != 0 ? false : z16;
        boolean z38 = (i18 & 256) != 0 ? false : z17;
        boolean z39 = (i18 & 512) != 0 ? false : z18;
        RenderMode renderMode3 = (i18 & 1024) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z44 = (i18 & 2048) != 0 ? false : z19;
        boolean z45 = (i18 & 4096) != 0 ? false : z24;
        LottieDynamicProperties lottieDynamicProperties2 = (i18 & 8192) != 0 ? null : lottieDynamicProperties;
        if ((i18 & 16384) != 0) {
            d.f81522a.getClass();
            dVar2 = d.a.f81528f;
        } else {
            dVar2 = dVar;
        }
        if ((i18 & 32768) != 0) {
            k.f68985a.getClass();
            kVar2 = k.a.f68988c;
        } else {
            kVar2 = kVar;
        }
        boolean z46 = (i18 & 65536) != 0 ? true : z25;
        boolean z47 = (i18 & 131072) != 0 ? false : z26;
        Map<String, ? extends Typeface> map2 = (i18 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : map;
        boolean z48 = (i18 & 524288) != 0 ? false : z27;
        AsyncUpdates asyncUpdates2 = (i18 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        x1 x1Var = n.f135158a;
        int i24 = i15 >> 3;
        boolean z49 = z36;
        LottieClipSpec lottieClipSpec3 = lottieClipSpec2;
        float f16 = f15;
        int i25 = i19;
        boolean z54 = z44;
        LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState(lottieComposition, z35, z49, z54, lottieClipSpec3, f16, i25, null, false, false, o0VarE, (i24 & 112) | 8 | (i24 & 896) | ((i16 << 6) & 7168) | (i15 & 57344) | (i15 & 458752) | (i15 & 3670016), 896);
        r rVar3 = rVar2;
        boolean z55 = z45;
        LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
        boolean z56 = z38;
        o0VarE.L(185157140);
        boolean zB = o0VarE.B(lottieAnimationStateAnimateLottieCompositionAsState);
        Object objQ = o0VarE.q();
        if (!zB) {
            m.f135153a.getClass();
            z28 = z35;
            if (objQ == m.a.f135155b) {
            }
            o0VarE.g0(false);
            int i26 = i15 >> 12;
            int i27 = ((i15 << 3) & 896) | 134217736 | (i26 & 7168) | (i26 & 57344) | (i26 & 458752) | ((i16 << 18) & 3670016);
            int i28 = i16 << 15;
            int i29 = i27 | (i28 & 29360128) | (i28 & 1879048192);
            int i30 = i16 >> 15;
            z29 = z37;
            dVar3 = dVar2;
            z34 = z39;
            renderMode2 = renderMode3;
            LottieAnimation(lottieComposition, (a) objQ, rVar3, z29, z56, z34, renderMode2, z55, lottieDynamicProperties3, dVar3, kVar2, z46, z47, map2, asyncUpdates2, z48, o0VarE, i29, (i30 & 14) | 4096 | (i30 & 112) | (i30 & 896) | ((i17 << 12) & 57344) | ((i16 >> 12) & 458752), 0);
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new AnonymousClass7(lottieComposition, rVar3, z28, z49, lottieClipSpec3, f16, i25, z29, z56, z34, renderMode2, z54, z55, lottieDynamicProperties3, dVar3, kVar2, z46, z47, map2, z48, asyncUpdates2, i15, i16, i17, i18);
            }
        }
        z28 = z35;
        objQ = new LottieAnimationKt$LottieAnimation$6$1(lottieAnimationStateAnimateLottieCompositionAsState);
        o0VarE.K(objQ);
        o0VarE.g0(false);
        int i210 = i15 >> 12;
        int i211 = ((i15 << 3) & 896) | 134217736 | (i210 & 7168) | (i210 & 57344) | (i210 & 458752) | ((i16 << 18) & 3670016);
        int i212 = i16 << 15;
        int i213 = i211 | (i212 & 29360128) | (i212 & 1879048192);
        int i34 = i16 >> 15;
        z29 = z37;
        dVar3 = dVar2;
        z34 = z39;
        renderMode2 = renderMode3;
        LottieAnimation(lottieComposition, (a) objQ, rVar3, z29, z56, z34, renderMode2, z55, lottieDynamicProperties3, dVar3, kVar2, z46, z47, map2, asyncUpdates2, z48, o0VarE, i213, (i34 & 14) | 4096 | (i34 & 112) | (i34 & 896) | ((i17 << 12) & 57344) | ((i16 >> 12) & 458752), 0);
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new AnonymousClass7(lottieComposition, rVar3, z28, z49, lottieClipSpec3, f16, i25, z29, z56, z34, renderMode2, z54, z55, lottieDynamicProperties3, dVar3, kVar2, z46, z47, map2, z48, asyncUpdates2, i15, i16, i17, i18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieDynamicProperties LottieAnimation$lambda$3(p1<LottieDynamicProperties> p1Var) {
        return p1Var.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LottieAnimation$lambda$4(p1<LottieDynamicProperties> p1Var, LottieDynamicProperties lottieDynamicProperties) {
        p1Var.setValue(lottieDynamicProperties);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LottieAnimation$lambda$6(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getF182175a().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m10timesUQTWf7w(long j8, long j14) {
        float fG = g.g(j8);
        int i14 = f2.f68942b;
        return g6.n.a((int) (Float.intBitsToFloat((int) (j14 >> 32)) * fG), (int) (Float.intBitsToFloat((int) (j14 & 4294967295L)) * g.d(j8)));
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$5, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass5 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ d $alignment;
        final /* synthetic */ boolean $applyOpacityToLayers;
        final /* synthetic */ AsyncUpdates $asyncUpdates;
        final /* synthetic */ boolean $clipToCompositionBounds;
        final /* synthetic */ LottieComposition $composition;
        final /* synthetic */ k $contentScale;
        final /* synthetic */ LottieDynamicProperties $dynamicProperties;
        final /* synthetic */ boolean $enableMergePaths;
        final /* synthetic */ boolean $maintainOriginalImageBounds;
        final /* synthetic */ r $modifier;
        final /* synthetic */ boolean $outlineMasksAndMattes;
        final /* synthetic */ float $progress;
        final /* synthetic */ RenderMode $renderMode;
        final /* synthetic */ boolean $safeMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(LottieComposition lottieComposition, float f14, r rVar, boolean z14, boolean z15, boolean z16, RenderMode renderMode, boolean z17, LottieDynamicProperties lottieDynamicProperties, d dVar, k kVar, boolean z18, boolean z19, AsyncUpdates asyncUpdates, int i14, int i15, int i16) {
            super(2);
            this.$composition = lottieComposition;
            this.$progress = f14;
            this.$modifier = rVar;
            this.$outlineMasksAndMattes = z14;
            this.$applyOpacityToLayers = z15;
            this.$enableMergePaths = z16;
            this.$renderMode = renderMode;
            this.$maintainOriginalImageBounds = z17;
            this.$dynamicProperties = lottieDynamicProperties;
            this.$alignment = dVar;
            this.$contentScale = kVar;
            this.$clipToCompositionBounds = z18;
            this.$safeMode = z19;
            this.$asyncUpdates = asyncUpdates;
            this.$$changed = i14;
            this.$$changed1 = i15;
            this.$$default = i16;
        }

        public final void invoke(m mVar, int i14) {
            LottieAnimationKt.LottieAnimation(this.$composition, this.$progress, this.$modifier, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$enableMergePaths, this.$renderMode, this.$maintainOriginalImageBounds, this.$dynamicProperties, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$safeMode, this.$asyncUpdates, mVar, p0.t(this.$$changed | 1), p0.t(this.$$changed1), this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ d $alignment;
        final /* synthetic */ boolean $applyOpacityToLayers;
        final /* synthetic */ AsyncUpdates $asyncUpdates;
        final /* synthetic */ boolean $clipTextToBoundingBox;
        final /* synthetic */ boolean $clipToCompositionBounds;
        final /* synthetic */ LottieComposition $composition;
        final /* synthetic */ k $contentScale;
        final /* synthetic */ LottieDynamicProperties $dynamicProperties;
        final /* synthetic */ boolean $enableMergePaths;
        final /* synthetic */ Map<String, Typeface> $fontMap;
        final /* synthetic */ boolean $maintainOriginalImageBounds;
        final /* synthetic */ r $modifier;
        final /* synthetic */ boolean $outlineMasksAndMattes;
        final /* synthetic */ a<Float> $progress;
        final /* synthetic */ RenderMode $renderMode;
        final /* synthetic */ boolean $safeMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(LottieComposition lottieComposition, a<Float> aVar, r rVar, boolean z14, boolean z15, boolean z16, RenderMode renderMode, boolean z17, LottieDynamicProperties lottieDynamicProperties, d dVar, k kVar, boolean z18, boolean z19, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates, boolean z24, int i14, int i15, int i16) {
            super(2);
            this.$composition = lottieComposition;
            this.$progress = aVar;
            this.$modifier = rVar;
            this.$outlineMasksAndMattes = z14;
            this.$applyOpacityToLayers = z15;
            this.$enableMergePaths = z16;
            this.$renderMode = renderMode;
            this.$maintainOriginalImageBounds = z17;
            this.$dynamicProperties = lottieDynamicProperties;
            this.$alignment = dVar;
            this.$contentScale = kVar;
            this.$clipToCompositionBounds = z18;
            this.$clipTextToBoundingBox = z19;
            this.$fontMap = map;
            this.$asyncUpdates = asyncUpdates;
            this.$safeMode = z24;
            this.$$changed = i14;
            this.$$changed1 = i15;
            this.$$default = i16;
        }

        public final void invoke(m mVar, int i14) {
            LottieAnimationKt.LottieAnimation(this.$composition, this.$progress, this.$modifier, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$enableMergePaths, this.$renderMode, this.$maintainOriginalImageBounds, this.$dynamicProperties, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$clipTextToBoundingBox, this.$fontMap, this.$asyncUpdates, this.$safeMode, mVar, p0.t(this.$$changed | 1), p0.t(this.$$changed1), this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass3 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ d $alignment;
        final /* synthetic */ boolean $applyOpacityToLayers;
        final /* synthetic */ AsyncUpdates $asyncUpdates;
        final /* synthetic */ boolean $clipTextToBoundingBox;
        final /* synthetic */ boolean $clipToCompositionBounds;
        final /* synthetic */ LottieComposition $composition;
        final /* synthetic */ k $contentScale;
        final /* synthetic */ LottieDynamicProperties $dynamicProperties;
        final /* synthetic */ boolean $enableMergePaths;
        final /* synthetic */ Map<String, Typeface> $fontMap;
        final /* synthetic */ boolean $maintainOriginalImageBounds;
        final /* synthetic */ r $modifier;
        final /* synthetic */ boolean $outlineMasksAndMattes;
        final /* synthetic */ a<Float> $progress;
        final /* synthetic */ RenderMode $renderMode;
        final /* synthetic */ boolean $safeMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(LottieComposition lottieComposition, a<Float> aVar, r rVar, boolean z14, boolean z15, boolean z16, RenderMode renderMode, boolean z17, LottieDynamicProperties lottieDynamicProperties, d dVar, k kVar, boolean z18, boolean z19, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates, boolean z24, int i14, int i15, int i16) {
            super(2);
            this.$composition = lottieComposition;
            this.$progress = aVar;
            this.$modifier = rVar;
            this.$outlineMasksAndMattes = z14;
            this.$applyOpacityToLayers = z15;
            this.$enableMergePaths = z16;
            this.$renderMode = renderMode;
            this.$maintainOriginalImageBounds = z17;
            this.$dynamicProperties = lottieDynamicProperties;
            this.$alignment = dVar;
            this.$contentScale = kVar;
            this.$clipToCompositionBounds = z18;
            this.$clipTextToBoundingBox = z19;
            this.$fontMap = map;
            this.$asyncUpdates = asyncUpdates;
            this.$safeMode = z24;
            this.$$changed = i14;
            this.$$changed1 = i15;
            this.$$default = i16;
        }

        public final void invoke(m mVar, int i14) {
            LottieAnimationKt.LottieAnimation(this.$composition, this.$progress, this.$modifier, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$enableMergePaths, this.$renderMode, this.$maintainOriginalImageBounds, this.$dynamicProperties, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$clipTextToBoundingBox, this.$fontMap, this.$asyncUpdates, this.$safeMode, mVar, p0.t(this.$$changed | 1), p0.t(this.$$changed1), this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$7, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass7 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$changed2;
        final /* synthetic */ int $$default;
        final /* synthetic */ d $alignment;
        final /* synthetic */ boolean $applyOpacityToLayers;
        final /* synthetic */ AsyncUpdates $asyncUpdates;
        final /* synthetic */ LottieClipSpec $clipSpec;
        final /* synthetic */ boolean $clipTextToBoundingBox;
        final /* synthetic */ boolean $clipToCompositionBounds;
        final /* synthetic */ LottieComposition $composition;
        final /* synthetic */ k $contentScale;
        final /* synthetic */ LottieDynamicProperties $dynamicProperties;
        final /* synthetic */ boolean $enableMergePaths;
        final /* synthetic */ Map<String, Typeface> $fontMap;
        final /* synthetic */ boolean $isPlaying;
        final /* synthetic */ int $iterations;
        final /* synthetic */ boolean $maintainOriginalImageBounds;
        final /* synthetic */ r $modifier;
        final /* synthetic */ boolean $outlineMasksAndMattes;
        final /* synthetic */ RenderMode $renderMode;
        final /* synthetic */ boolean $restartOnPlay;
        final /* synthetic */ boolean $reverseOnRepeat;
        final /* synthetic */ boolean $safeMode;
        final /* synthetic */ float $speed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(LottieComposition lottieComposition, r rVar, boolean z14, boolean z15, LottieClipSpec lottieClipSpec, float f14, int i14, boolean z16, boolean z17, boolean z18, RenderMode renderMode, boolean z19, boolean z24, LottieDynamicProperties lottieDynamicProperties, d dVar, k kVar, boolean z25, boolean z26, Map<String, ? extends Typeface> map, boolean z27, AsyncUpdates asyncUpdates, int i15, int i16, int i17, int i18) {
            super(2);
            this.$composition = lottieComposition;
            this.$modifier = rVar;
            this.$isPlaying = z14;
            this.$restartOnPlay = z15;
            this.$clipSpec = lottieClipSpec;
            this.$speed = f14;
            this.$iterations = i14;
            this.$outlineMasksAndMattes = z16;
            this.$applyOpacityToLayers = z17;
            this.$enableMergePaths = z18;
            this.$renderMode = renderMode;
            this.$reverseOnRepeat = z19;
            this.$maintainOriginalImageBounds = z24;
            this.$dynamicProperties = lottieDynamicProperties;
            this.$alignment = dVar;
            this.$contentScale = kVar;
            this.$clipToCompositionBounds = z25;
            this.$clipTextToBoundingBox = z26;
            this.$fontMap = map;
            this.$safeMode = z27;
            this.$asyncUpdates = asyncUpdates;
            this.$$changed = i15;
            this.$$changed1 = i16;
            this.$$changed2 = i17;
            this.$$default = i18;
        }

        public final void invoke(m mVar, int i14) {
            LottieAnimationKt.LottieAnimation(this.$composition, this.$modifier, this.$isPlaying, this.$restartOnPlay, this.$clipSpec, this.$speed, this.$iterations, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$enableMergePaths, this.$renderMode, this.$reverseOnRepeat, this.$maintainOriginalImageBounds, this.$dynamicProperties, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$clipTextToBoundingBox, this.$fontMap, this.$safeMode, this.$asyncUpdates, mVar, p0.t(this.$$changed | 1), p0.t(this.$$changed1), p0.t(this.$$changed2), this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq4/f;", "", "invoke", "(Lq4/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass2 extends w implements l<f, Unit> {
        final /* synthetic */ d $alignment;
        final /* synthetic */ boolean $applyOpacityToLayers;
        final /* synthetic */ AsyncUpdates $asyncUpdates;
        final /* synthetic */ Rect $bounds;
        final /* synthetic */ boolean $clipTextToBoundingBox;
        final /* synthetic */ boolean $clipToCompositionBounds;
        final /* synthetic */ LottieComposition $composition;
        final /* synthetic */ k $contentScale;
        final /* synthetic */ LottieDrawable $drawable;
        final /* synthetic */ LottieDynamicProperties $dynamicProperties;
        final /* synthetic */ boolean $enableMergePaths;
        final /* synthetic */ Map<String, Typeface> $fontMap;
        final /* synthetic */ boolean $maintainOriginalImageBounds;
        final /* synthetic */ Matrix $matrix;
        final /* synthetic */ boolean $outlineMasksAndMattes;
        final /* synthetic */ a<Float> $progress;
        final /* synthetic */ RenderMode $renderMode;
        final /* synthetic */ boolean $safeMode;
        final /* synthetic */ p1<LottieDynamicProperties> $setDynamicProperties$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Rect rect, k kVar, d dVar, Matrix matrix, LottieDrawable lottieDrawable, boolean z14, boolean z15, RenderMode renderMode, AsyncUpdates asyncUpdates, LottieComposition lottieComposition, Map<String, ? extends Typeface> map, LottieDynamicProperties lottieDynamicProperties, boolean z16, boolean z17, boolean z18, boolean z19, boolean z24, a<Float> aVar, p1<LottieDynamicProperties> p1Var) {
            super(1);
            this.$bounds = rect;
            this.$contentScale = kVar;
            this.$alignment = dVar;
            this.$matrix = matrix;
            this.$drawable = lottieDrawable;
            this.$enableMergePaths = z14;
            this.$safeMode = z15;
            this.$renderMode = renderMode;
            this.$asyncUpdates = asyncUpdates;
            this.$composition = lottieComposition;
            this.$fontMap = map;
            this.$dynamicProperties = lottieDynamicProperties;
            this.$outlineMasksAndMattes = z16;
            this.$applyOpacityToLayers = z17;
            this.$maintainOriginalImageBounds = z18;
            this.$clipToCompositionBounds = z19;
            this.$clipTextToBoundingBox = z24;
            this.$progress = aVar;
            this.$setDynamicProperties$delegate = p1Var;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(f fVar) {
            fVar.getClass();
            Rect rect = this.$bounds;
            k kVar = this.$contentScale;
            d dVar = this.$alignment;
            Matrix matrix = this.$matrix;
            LottieDrawable lottieDrawable = this.$drawable;
            boolean z14 = this.$enableMergePaths;
            boolean z15 = this.$safeMode;
            RenderMode renderMode = this.$renderMode;
            AsyncUpdates asyncUpdates = this.$asyncUpdates;
            LottieComposition lottieComposition = this.$composition;
            Map<String, Typeface> map = this.$fontMap;
            LottieDynamicProperties lottieDynamicProperties = this.$dynamicProperties;
            boolean z16 = this.$outlineMasksAndMattes;
            boolean z17 = this.$applyOpacityToLayers;
            boolean z18 = this.$maintainOriginalImageBounds;
            boolean z19 = this.$clipToCompositionBounds;
            boolean z24 = this.$clipTextToBoundingBox;
            a<Float> aVar = this.$progress;
            p1<LottieDynamicProperties> p1Var = this.$setDynamicProperties$delegate;
            y yVarA = fVar.getF142543b().a();
            long jA = h.a(rect.width(), rect.height());
            long jA2 = g6.n.a(MathKt.c(g.g(fVar.b())), MathKt.c(g.d(fVar.b())));
            long jA3 = kVar.a(jA, fVar.b());
            long jA4 = dVar.a(LottieAnimationKt.m10timesUQTWf7w(jA, jA3), jA2, fVar.getLayoutDirection());
            matrix.reset();
            g6.k.a aVar2 = g6.k.f76003b;
            matrix.preTranslate((int) (jA4 >> 32), (int) (jA4 & 4294967295L));
            int i14 = f2.f68942b;
            matrix.preScale(Float.intBitsToFloat((int) (jA3 >> 32)), Float.intBitsToFloat((int) (jA3 & 4294967295L)));
            lottieDrawable.enableFeatureFlag(LottieFeatureFlag.MergePathsApi19, z14);
            lottieDrawable.setSafeMode(z15);
            lottieDrawable.setRenderMode(renderMode);
            lottieDrawable.setAsyncUpdates(asyncUpdates);
            lottieDrawable.setComposition(lottieComposition);
            lottieDrawable.setFontMap(map);
            if (lottieDynamicProperties != LottieAnimationKt.LottieAnimation$lambda$3(p1Var)) {
                LottieDynamicProperties lottieDynamicPropertiesLottieAnimation$lambda$3 = LottieAnimationKt.LottieAnimation$lambda$3(p1Var);
                if (lottieDynamicPropertiesLottieAnimation$lambda$3 != null) {
                    lottieDynamicPropertiesLottieAnimation$lambda$3.removeFrom$lottie_compose_release(lottieDrawable);
                }
                if (lottieDynamicProperties != null) {
                    lottieDynamicProperties.addTo$lottie_compose_release(lottieDrawable);
                }
                LottieAnimationKt.LottieAnimation$lambda$4(p1Var, lottieDynamicProperties);
            }
            lottieDrawable.setOutlineMasksAndMattes(z16);
            lottieDrawable.setApplyingOpacityToLayersEnabled(z17);
            lottieDrawable.setMaintainOriginalImageBounds(z18);
            lottieDrawable.setClipToCompositionBounds(z19);
            lottieDrawable.setClipTextToBoundingBox(z24);
            lottieDrawable.setProgress(aVar.invoke().floatValue());
            lottieDrawable.setBounds(0, 0, rect.width(), rect.height());
            lottieDrawable.draw(o4.d.a(yVarA), matrix);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(f fVar) {
            invoke2(fVar);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    @e
    public static final void LottieAnimation(LottieComposition lottieComposition, float f14, r rVar, boolean z14, boolean z15, boolean z16, RenderMode renderMode, boolean z17, LottieDynamicProperties lottieDynamicProperties, d dVar, k kVar, boolean z18, boolean z19, AsyncUpdates asyncUpdates, m mVar, int i14, int i15, int i16) {
        d dVar2;
        k kVar2;
        o0 o0VarE = mVar.E(847508402);
        r rVar2 = (i16 & 4) != 0 ? r.S : rVar;
        boolean z24 = (i16 & 8) != 0 ? false : z14;
        boolean z25 = (i16 & 16) != 0 ? false : z15;
        boolean z26 = (i16 & 32) != 0 ? false : z16;
        RenderMode renderMode2 = (i16 & 64) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z27 = (i16 & 128) != 0 ? false : z17;
        LottieDynamicProperties lottieDynamicProperties2 = (i16 & 256) != 0 ? null : lottieDynamicProperties;
        if ((i16 & 512) != 0) {
            d.f81522a.getClass();
            dVar2 = d.a.f81528f;
        } else {
            dVar2 = dVar;
        }
        if ((i16 & 1024) != 0) {
            k.f68985a.getClass();
            kVar2 = k.a.f68988c;
        } else {
            kVar2 = kVar;
        }
        boolean z28 = true;
        boolean z29 = (i16 & 2048) != 0 ? true : z18;
        boolean z34 = (i16 & 4096) != 0 ? false : z19;
        AsyncUpdates asyncUpdates2 = (i16 & 8192) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        x1 x1Var = n.f135158a;
        o0VarE.L(185155174);
        if ((((i14 & 112) ^ 48) <= 32 || !o0VarE.i(f14)) && (i14 & 48) != 32) {
            z28 = false;
        }
        Object objQ = o0VarE.q();
        if (!z28) {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new LottieAnimationKt$LottieAnimation$4$1(f14);
                o0VarE.K(objQ);
            }
        } else {
            objQ = new LottieAnimationKt$LottieAnimation$4$1(f14);
            o0VarE.K(objQ);
        }
        o0VarE.g0(false);
        LottieAnimation(lottieComposition, (a) objQ, rVar2, z24, z25, z26, renderMode2, z27, lottieDynamicProperties2, dVar2, kVar2, z29, false, null, asyncUpdates2, z34, o0VarE, (i14 & 896) | 134217736 | (i14 & 7168) | (i14 & 57344) | (i14 & 458752) | (3670016 & i14) | (29360128 & i14) | (1879048192 & i14), (i15 & 126) | (57344 & (i15 << 3)) | ((i15 << 9) & 458752), 12288);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new AnonymousClass5(lottieComposition, f14, rVar2, z24, z25, z26, renderMode2, z27, lottieDynamicProperties2, dVar2, kVar2, z29, z34, asyncUpdates2, i14, i15, i16);
        }
    }

    public static final void LottieAnimation(LottieComposition lottieComposition, a<Float> aVar, r rVar, boolean z14, boolean z15, boolean z16, RenderMode renderMode, boolean z17, LottieDynamicProperties lottieDynamicProperties, d dVar, k kVar, boolean z18, boolean z19, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates, boolean z24, m mVar, int i14, int i15, int i16) {
        d dVar2;
        k kVar2;
        aVar.getClass();
        o0 o0VarE = mVar.E(-674272918);
        r rVar2 = (i16 & 4) != 0 ? r.S : rVar;
        boolean z25 = (i16 & 8) != 0 ? false : z14;
        boolean z26 = (i16 & 16) != 0 ? false : z15;
        boolean z27 = (i16 & 32) != 0 ? false : z16;
        RenderMode renderMode2 = (i16 & 64) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z28 = (i16 & 128) != 0 ? false : z17;
        LottieDynamicProperties lottieDynamicProperties2 = (i16 & 256) != 0 ? null : lottieDynamicProperties;
        if ((i16 & 512) != 0) {
            d.f81522a.getClass();
            dVar2 = d.a.f81528f;
        } else {
            dVar2 = dVar;
        }
        if ((i16 & 1024) != 0) {
            k.f68985a.getClass();
            kVar2 = k.a.f68988c;
        } else {
            kVar2 = kVar;
        }
        boolean z29 = (i16 & 2048) != 0 ? true : z18;
        boolean z34 = (i16 & 4096) != 0 ? false : z19;
        Map<String, ? extends Typeface> map2 = (i16 & 8192) != 0 ? null : map;
        AsyncUpdates asyncUpdates2 = (i16 & 16384) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        boolean z35 = (i16 & 32768) != 0 ? false : z24;
        x1 x1Var = n.f135158a;
        o0VarE.L(185152095);
        Object objQ = o0VarE.q();
        m.f135153a.getClass();
        m.a.C2565a c2565a = m.a.f135155b;
        if (objQ == c2565a) {
            objQ = new LottieDrawable();
            o0VarE.K(objQ);
        }
        LottieDrawable lottieDrawable = (LottieDrawable) objQ;
        boolean z36 = z25;
        o0VarE.g0(false);
        o0VarE.L(185152142);
        Object objQ2 = o0VarE.q();
        if (objQ2 == c2565a) {
            objQ2 = new Matrix();
            o0VarE.K(objQ2);
        }
        Matrix matrix = (Matrix) objQ2;
        o0VarE.g0(false);
        o0VarE.L(185152222);
        boolean zB = o0VarE.B(lottieComposition);
        Object objQ3 = o0VarE.q();
        if (zB || objQ3 == c2565a) {
            objQ3 = p0.n(null);
            o0VarE.K(objQ3);
        }
        p1 p1Var = (p1) objQ3;
        o0VarE.g0(false);
        o0VarE.L(185152274);
        if (lottieComposition != null && lottieComposition.getDuration() != 0.0f) {
            o0VarE.g0(false);
            Rect bounds = lottieComposition.getBounds();
            r rVarLottieSize = LottieAnimationSizeNodeKt.lottieSize(rVar2, bounds.width(), bounds.height());
            r rVar3 = rVar2;
            d dVar3 = dVar2;
            k kVar3 = kVar2;
            Map<String, ? extends Typeface> map3 = map2;
            boolean z37 = z28;
            LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
            AsyncUpdates asyncUpdates3 = asyncUpdates2;
            RenderMode renderMode3 = renderMode2;
            boolean z38 = z35;
            boolean z39 = z34;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(bounds, kVar3, dVar3, matrix, lottieDrawable, z27, z38, renderMode3, asyncUpdates3, lottieComposition, map3, lottieDynamicProperties3, z36, z26, z37, z29, z39, aVar, p1Var);
            boolean z44 = z29;
            boolean z45 = z26;
            u1.n.b(rVarLottieSize, anonymousClass2, o0VarE, 0);
            p2 p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new AnonymousClass3(lottieComposition, aVar, rVar3, z36, z45, z27, renderMode3, z37, lottieDynamicProperties3, dVar3, kVar3, z44, z39, map3, asyncUpdates3, z38, i14, i15, i16);
                return;
            }
            return;
        }
        r rVar4 = rVar2;
        boolean z46 = z26;
        Map<String, ? extends Typeface> map4 = map2;
        AsyncUpdates asyncUpdates4 = asyncUpdates2;
        d dVar4 = dVar2;
        k kVar4 = kVar2;
        boolean z47 = z29;
        boolean z48 = z35;
        q.a(rVar4, o0VarE, (i14 >> 6) & 14);
        o0VarE.g0(false);
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new AnonymousClass1(lottieComposition, aVar, rVar4, z36, z46, z27, renderMode2, z28, lottieDynamicProperties2, dVar4, kVar4, z47, z34, map4, asyncUpdates4, z48, i14, i15, i16);
        }
    }
}
