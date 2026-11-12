package com.airbnb.lottie.compose;

import android.graphics.Typeface;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.RenderMode;
import f5.f2;
import java.util.Map;
import n4.g;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0099\u0001\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u001e\u001a\u00020\u001b*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Lcom/airbnb/lottie/LottieComposition;", "composition", "", "progress", "", "outlineMasksAndMattes", "applyOpacityToLayers", "enableMergePaths", "Lcom/airbnb/lottie/RenderMode;", "renderMode", "maintainOriginalImageBounds", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "dynamicProperties", "clipToCompositionBounds", "clipTextToBoundingBox", "", "", "Landroid/graphics/Typeface;", "fontMap", "Lcom/airbnb/lottie/AsyncUpdates;", "asyncUpdates", "Lcom/airbnb/lottie/compose/LottiePainter;", "rememberLottiePainter", "(Lcom/airbnb/lottie/LottieComposition;FZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;ZZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;Lp3/m;III)Lcom/airbnb/lottie/compose/LottiePainter;", "Ln4/g;", "Lf5/f2;", "scale", "Lg6/m;", "times-UQTWf7w", "(JJ)J", "times", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LottiePainterKt {
    public static final LottiePainter rememberLottiePainter(LottieComposition lottieComposition, float f14, boolean z14, boolean z15, boolean z16, RenderMode renderMode, boolean z17, LottieDynamicProperties lottieDynamicProperties, boolean z18, boolean z19, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates, m mVar, int i14, int i15, int i16) {
        mVar.L(-1760390310);
        LottieComposition lottieComposition2 = (i16 & 1) != 0 ? null : lottieComposition;
        float f15 = (i16 & 2) != 0 ? 0.0f : f14;
        boolean z24 = (i16 & 4) != 0 ? false : z14;
        boolean z25 = (i16 & 8) != 0 ? false : z15;
        boolean z26 = (i16 & 16) != 0 ? false : z16;
        RenderMode renderMode2 = (i16 & 32) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z27 = (i16 & 64) != 0 ? false : z17;
        LottieDynamicProperties lottieDynamicProperties2 = (i16 & 128) != 0 ? null : lottieDynamicProperties;
        boolean z28 = (i16 & 256) != 0 ? true : z18;
        boolean z29 = (i16 & 512) == 0 ? z19 : false;
        Map<String, ? extends Typeface> map2 = (i16 & 1024) == 0 ? map : null;
        AsyncUpdates asyncUpdates2 = (i16 & 2048) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        x1 x1Var = n.f135158a;
        mVar.L(1356844528);
        Object objQ = mVar.q();
        m.f135153a.getClass();
        if (objQ == m.a.f135155b) {
            LottiePainter lottiePainter = new LottiePainter(null, 0.0f, false, false, false, null, false, null, false, false, null, null, 4095, null);
            mVar.K(lottiePainter);
            objQ = lottiePainter;
        }
        LottiePainter lottiePainter2 = (LottiePainter) objQ;
        mVar.R();
        lottiePainter2.setComposition$lottie_compose_release(lottieComposition2);
        lottiePainter2.setProgress$lottie_compose_release(f15);
        lottiePainter2.setOutlineMasksAndMattes$lottie_compose_release(z24);
        lottiePainter2.setApplyOpacityToLayers$lottie_compose_release(z25);
        lottiePainter2.setEnableMergePaths$lottie_compose_release(z26);
        lottiePainter2.setRenderMode$lottie_compose_release(renderMode2);
        lottiePainter2.setMaintainOriginalImageBounds$lottie_compose_release(z27);
        lottiePainter2.setDynamicProperties$lottie_compose_release(lottieDynamicProperties2);
        lottiePainter2.setClipToCompositionBounds$lottie_compose_release(z28);
        lottiePainter2.setClipTextToBoundingBox$lottie_compose_release(z29);
        lottiePainter2.setFontMap$lottie_compose_release(map2);
        lottiePainter2.setAsyncUpdates$lottie_compose_release(asyncUpdates2);
        mVar.R();
        return lottiePainter2;
    }

    /* JADX INFO: renamed from: times-UQTWf7w, reason: not valid java name */
    private static final long m55timesUQTWf7w(long j8, long j14) {
        float fG = g.g(j8);
        int i14 = f2.f68942b;
        return g6.n.a((int) (Float.intBitsToFloat((int) (j14 >> 32)) * fG), (int) (Float.intBitsToFloat((int) (j14 & 4294967295L)) * g.d(j8)));
    }
}
