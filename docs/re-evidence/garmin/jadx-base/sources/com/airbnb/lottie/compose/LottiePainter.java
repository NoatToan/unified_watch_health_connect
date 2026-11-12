package com.airbnb.lottie.compose;

import android.graphics.Matrix;
import android.graphics.Typeface;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieFeatureFlag;
import com.airbnb.lottie.RenderMode;
import g6.m;
import g6.n;
import java.util.Map;
import n4.g;
import n4.h;
import o4.y;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;
import p3.m1;
import p3.p0;
import p3.p1;
import p3.z1;
import q4.f;
import t4.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b9\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0093\u0001\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cR/\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u00028@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00048@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R+\u0010\b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u001f\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R+\u0010\t\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010\u001f\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u001f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R+\u0010\f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b:\u0010\u001f\u001a\u0004\b;\u0010,\"\u0004\b<\u0010.R/\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\r8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010\u001f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR+\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bB\u0010\u001f\u001a\u0004\bC\u0010,\"\u0004\bD\u0010.RG\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00112\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00118@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010\u001f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00158@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010\u001f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR+\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010\u001f\u001a\u0004\bP\u0010,\"\u0004\bQ\u0010.R\u0018\u0010R\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010X\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010]\u001a\u00020Z8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b[\u0010\\\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Lcom/airbnb/lottie/compose/LottiePainter;", "Lt4/d;", "Lcom/airbnb/lottie/LottieComposition;", "composition", "", "progress", "", "outlineMasksAndMattes", "applyOpacityToLayers", "enableMergePaths", "Lcom/airbnb/lottie/RenderMode;", "renderMode", "maintainOriginalImageBounds", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "dynamicProperties", "clipToCompositionBounds", "clipTextToBoundingBox", "", "", "Landroid/graphics/Typeface;", "fontMap", "Lcom/airbnb/lottie/AsyncUpdates;", "asyncUpdates", "<init>", "(Lcom/airbnb/lottie/LottieComposition;FZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;ZZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;)V", "Lq4/f;", "", "onDraw", "(Lq4/f;)V", "<set-?>", "composition$delegate", "Lp3/p1;", "getComposition$lottie_compose_release", "()Lcom/airbnb/lottie/LottieComposition;", "setComposition$lottie_compose_release", "(Lcom/airbnb/lottie/LottieComposition;)V", "progress$delegate", "Lp3/m1;", "getProgress$lottie_compose_release", "()F", "setProgress$lottie_compose_release", "(F)V", "outlineMasksAndMattes$delegate", "getOutlineMasksAndMattes$lottie_compose_release", "()Z", "setOutlineMasksAndMattes$lottie_compose_release", "(Z)V", "applyOpacityToLayers$delegate", "getApplyOpacityToLayers$lottie_compose_release", "setApplyOpacityToLayers$lottie_compose_release", "enableMergePaths$delegate", "getEnableMergePaths$lottie_compose_release", "setEnableMergePaths$lottie_compose_release", "renderMode$delegate", "getRenderMode$lottie_compose_release", "()Lcom/airbnb/lottie/RenderMode;", "setRenderMode$lottie_compose_release", "(Lcom/airbnb/lottie/RenderMode;)V", "maintainOriginalImageBounds$delegate", "getMaintainOriginalImageBounds$lottie_compose_release", "setMaintainOriginalImageBounds$lottie_compose_release", "dynamicProperties$delegate", "getDynamicProperties$lottie_compose_release", "()Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "setDynamicProperties$lottie_compose_release", "(Lcom/airbnb/lottie/compose/LottieDynamicProperties;)V", "clipToCompositionBounds$delegate", "getClipToCompositionBounds$lottie_compose_release", "setClipToCompositionBounds$lottie_compose_release", "fontMap$delegate", "getFontMap$lottie_compose_release", "()Ljava/util/Map;", "setFontMap$lottie_compose_release", "(Ljava/util/Map;)V", "asyncUpdates$delegate", "getAsyncUpdates$lottie_compose_release", "()Lcom/airbnb/lottie/AsyncUpdates;", "setAsyncUpdates$lottie_compose_release", "(Lcom/airbnb/lottie/AsyncUpdates;)V", "clipTextToBoundingBox$delegate", "getClipTextToBoundingBox$lottie_compose_release", "setClipTextToBoundingBox$lottie_compose_release", "setDynamicProperties", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "Lcom/airbnb/lottie/LottieDrawable;", "drawable", "Lcom/airbnb/lottie/LottieDrawable;", "Landroid/graphics/Matrix;", "matrix", "Landroid/graphics/Matrix;", "Ln4/g;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LottiePainter extends d {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: applyOpacityToLayers$delegate, reason: from kotlin metadata */
    private final p1 applyOpacityToLayers;

    /* JADX INFO: renamed from: asyncUpdates$delegate, reason: from kotlin metadata */
    private final p1 asyncUpdates;

    /* JADX INFO: renamed from: clipTextToBoundingBox$delegate, reason: from kotlin metadata */
    private final p1 clipTextToBoundingBox;

    /* JADX INFO: renamed from: clipToCompositionBounds$delegate, reason: from kotlin metadata */
    private final p1 clipToCompositionBounds;

    /* JADX INFO: renamed from: composition$delegate, reason: from kotlin metadata */
    private final p1 composition;
    private final LottieDrawable drawable;

    /* JADX INFO: renamed from: dynamicProperties$delegate, reason: from kotlin metadata */
    private final p1 dynamicProperties;

    /* JADX INFO: renamed from: enableMergePaths$delegate, reason: from kotlin metadata */
    private final p1 enableMergePaths;

    /* JADX INFO: renamed from: fontMap$delegate, reason: from kotlin metadata */
    private final p1 fontMap;

    /* JADX INFO: renamed from: maintainOriginalImageBounds$delegate, reason: from kotlin metadata */
    private final p1 maintainOriginalImageBounds;
    private final Matrix matrix;

    /* JADX INFO: renamed from: outlineMasksAndMattes$delegate, reason: from kotlin metadata */
    private final p1 outlineMasksAndMattes;

    /* JADX INFO: renamed from: progress$delegate, reason: from kotlin metadata */
    private final m1 progress;

    /* JADX INFO: renamed from: renderMode$delegate, reason: from kotlin metadata */
    private final p1 renderMode;
    private LottieDynamicProperties setDynamicProperties;

    public LottiePainter(LottieComposition lottieComposition, float f14, boolean z14, boolean z15, boolean z16, RenderMode renderMode, boolean z17, LottieDynamicProperties lottieDynamicProperties, boolean z18, boolean z19, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates) {
        renderMode.getClass();
        asyncUpdates.getClass();
        this.composition = p0.n(lottieComposition);
        this.progress = new z1(f14);
        this.outlineMasksAndMattes = p0.n(Boolean.valueOf(z14));
        this.applyOpacityToLayers = p0.n(Boolean.valueOf(z15));
        this.enableMergePaths = p0.n(Boolean.valueOf(z16));
        this.renderMode = p0.n(renderMode);
        this.maintainOriginalImageBounds = p0.n(Boolean.valueOf(z17));
        this.dynamicProperties = p0.n(lottieDynamicProperties);
        this.clipToCompositionBounds = p0.n(Boolean.valueOf(z18));
        this.fontMap = p0.n(map);
        this.asyncUpdates = p0.n(asyncUpdates);
        this.clipTextToBoundingBox = p0.n(Boolean.valueOf(z19));
        this.drawable = new LottieDrawable();
        this.matrix = new Matrix();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getApplyOpacityToLayers$lottie_compose_release() {
        return ((Boolean) this.applyOpacityToLayers.getF182175a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AsyncUpdates getAsyncUpdates$lottie_compose_release() {
        return (AsyncUpdates) this.asyncUpdates.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getClipTextToBoundingBox$lottie_compose_release() {
        return ((Boolean) this.clipTextToBoundingBox.getF182175a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getClipToCompositionBounds$lottie_compose_release() {
        return ((Boolean) this.clipToCompositionBounds.getF182175a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LottieComposition getComposition$lottie_compose_release() {
        return (LottieComposition) this.composition.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final LottieDynamicProperties getDynamicProperties$lottie_compose_release() {
        return (LottieDynamicProperties) this.dynamicProperties.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnableMergePaths$lottie_compose_release() {
        return ((Boolean) this.enableMergePaths.getF182175a()).booleanValue();
    }

    public final Map<String, Typeface> getFontMap$lottie_compose_release() {
        return (Map) this.fontMap.getF182175a();
    }

    @Override // t4.d
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long getF162260d() {
        LottieComposition composition$lottie_compose_release = getComposition$lottie_compose_release();
        if (composition$lottie_compose_release != null) {
            return h.a(composition$lottie_compose_release.getBounds().width(), composition$lottie_compose_release.getBounds().height());
        }
        g.f123559b.getClass();
        return g.f123560c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getMaintainOriginalImageBounds$lottie_compose_release() {
        return ((Boolean) this.maintainOriginalImageBounds.getF182175a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getOutlineMasksAndMattes$lottie_compose_release() {
        return ((Boolean) this.outlineMasksAndMattes.getF182175a()).booleanValue();
    }

    public final float getProgress$lottie_compose_release() {
        return this.progress.getFloatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final RenderMode getRenderMode$lottie_compose_release() {
        return (RenderMode) this.renderMode.getF182175a();
    }

    @Override // t4.d
    public void onDraw(f fVar) {
        fVar.getClass();
        LottieComposition composition$lottie_compose_release = getComposition$lottie_compose_release();
        if (composition$lottie_compose_release == null) {
            return;
        }
        y yVarA = fVar.getF142543b().a();
        long jA = h.a(composition$lottie_compose_release.getBounds().width(), composition$lottie_compose_release.getBounds().height());
        long jA2 = n.a(MathKt.c(g.g(fVar.b())), MathKt.c(g.d(fVar.b())));
        this.matrix.reset();
        Matrix matrix = this.matrix;
        m.a aVar = m.f76012b;
        matrix.preScale(((int) (jA2 >> 32)) / g.g(jA), ((int) (jA2 & 4294967295L)) / g.d(jA));
        this.drawable.enableFeatureFlag(LottieFeatureFlag.MergePathsApi19, getEnableMergePaths$lottie_compose_release());
        this.drawable.setRenderMode(getRenderMode$lottie_compose_release());
        this.drawable.setAsyncUpdates(getAsyncUpdates$lottie_compose_release());
        this.drawable.setComposition(composition$lottie_compose_release);
        this.drawable.setFontMap(getFontMap$lottie_compose_release());
        LottieDynamicProperties dynamicProperties$lottie_compose_release = getDynamicProperties$lottie_compose_release();
        LottieDynamicProperties lottieDynamicProperties = this.setDynamicProperties;
        if (dynamicProperties$lottie_compose_release != lottieDynamicProperties) {
            if (lottieDynamicProperties != null) {
                lottieDynamicProperties.removeFrom$lottie_compose_release(this.drawable);
            }
            LottieDynamicProperties dynamicProperties$lottie_compose_release2 = getDynamicProperties$lottie_compose_release();
            if (dynamicProperties$lottie_compose_release2 != null) {
                dynamicProperties$lottie_compose_release2.addTo$lottie_compose_release(this.drawable);
            }
            this.setDynamicProperties = getDynamicProperties$lottie_compose_release();
        }
        this.drawable.setOutlineMasksAndMattes(getOutlineMasksAndMattes$lottie_compose_release());
        this.drawable.setApplyingOpacityToLayersEnabled(getApplyOpacityToLayers$lottie_compose_release());
        this.drawable.setMaintainOriginalImageBounds(getMaintainOriginalImageBounds$lottie_compose_release());
        this.drawable.setClipToCompositionBounds(getClipToCompositionBounds$lottie_compose_release());
        this.drawable.setClipTextToBoundingBox(getClipTextToBoundingBox$lottie_compose_release());
        this.drawable.setProgress(getProgress$lottie_compose_release());
        this.drawable.setBounds(0, 0, composition$lottie_compose_release.getBounds().width(), composition$lottie_compose_release.getBounds().height());
        this.drawable.draw(o4.d.a(yVarA), this.matrix);
    }

    public final void setApplyOpacityToLayers$lottie_compose_release(boolean z14) {
        this.applyOpacityToLayers.setValue(Boolean.valueOf(z14));
    }

    public final void setAsyncUpdates$lottie_compose_release(AsyncUpdates asyncUpdates) {
        asyncUpdates.getClass();
        this.asyncUpdates.setValue(asyncUpdates);
    }

    public final void setClipTextToBoundingBox$lottie_compose_release(boolean z14) {
        this.clipTextToBoundingBox.setValue(Boolean.valueOf(z14));
    }

    public final void setClipToCompositionBounds$lottie_compose_release(boolean z14) {
        this.clipToCompositionBounds.setValue(Boolean.valueOf(z14));
    }

    public final void setComposition$lottie_compose_release(LottieComposition lottieComposition) {
        this.composition.setValue(lottieComposition);
    }

    public final void setDynamicProperties$lottie_compose_release(LottieDynamicProperties lottieDynamicProperties) {
        this.dynamicProperties.setValue(lottieDynamicProperties);
    }

    public final void setEnableMergePaths$lottie_compose_release(boolean z14) {
        this.enableMergePaths.setValue(Boolean.valueOf(z14));
    }

    public final void setFontMap$lottie_compose_release(Map<String, ? extends Typeface> map) {
        this.fontMap.setValue(map);
    }

    public final void setMaintainOriginalImageBounds$lottie_compose_release(boolean z14) {
        this.maintainOriginalImageBounds.setValue(Boolean.valueOf(z14));
    }

    public final void setOutlineMasksAndMattes$lottie_compose_release(boolean z14) {
        this.outlineMasksAndMattes.setValue(Boolean.valueOf(z14));
    }

    public final void setProgress$lottie_compose_release(float f14) {
        this.progress.i(f14);
    }

    public final void setRenderMode$lottie_compose_release(RenderMode renderMode) {
        renderMode.getClass();
        this.renderMode.setValue(renderMode);
    }

    public /* synthetic */ LottiePainter(LottieComposition lottieComposition, float f14, boolean z14, boolean z15, boolean z16, RenderMode renderMode, boolean z17, LottieDynamicProperties lottieDynamicProperties, boolean z18, boolean z19, Map map, AsyncUpdates asyncUpdates, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : lottieComposition, (i14 & 2) != 0 ? 0.0f : f14, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? false : z15, (i14 & 16) != 0 ? false : z16, (i14 & 32) != 0 ? RenderMode.AUTOMATIC : renderMode, (i14 & 64) != 0 ? false : z17, (i14 & 128) != 0 ? null : lottieDynamicProperties, (i14 & 256) != 0 ? true : z18, (i14 & 512) == 0 ? z19 : false, (i14 & 1024) == 0 ? map : null, (i14 & 2048) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates);
    }

    public LottiePainter() {
        this(null, 0.0f, false, false, false, null, false, null, false, false, null, null, 4095, null);
    }
}
