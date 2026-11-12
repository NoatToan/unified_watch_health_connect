package com.airbnb.lottie.compose;

import am.j;
import e23.l;
import e23.p;
import h4.r;
import h5.x0;
import kotlin.m2;
import kotlin.v3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b!\u0010\u0017¨\u0006\""}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;", "Lh5/x0;", "Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;", "", "width", "height", "<init>", "(II)V", "create", "()Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;", "node", "", "update", "(Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;)V", "Li5/m2;", "inspectableProperties", "(Li5/m2;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "component2", "copy", "(II)Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;", "", "toString", "()Ljava/lang/String;", "I", "getWidth", "getHeight", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LottieAnimationSizeElement extends x0<LottieAnimationSizeNode> {
    public static final int $stable = 0;
    private final int height;
    private final int width;

    public LottieAnimationSizeElement(int i14, int i15) {
        this.width = i14;
        this.height = i15;
    }

    public static /* synthetic */ LottieAnimationSizeElement copy$default(LottieAnimationSizeElement lottieAnimationSizeElement, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i14 = lottieAnimationSizeElement.width;
        }
        if ((i16 & 2) != 0) {
            i15 = lottieAnimationSizeElement.height;
        }
        return lottieAnimationSizeElement.copy(i14, i15);
    }

    @Override // h4.r.b, h4.r
    public /* bridge */ /* synthetic */ boolean all(l lVar) {
        return super.all(lVar);
    }

    public boolean any(l lVar) {
        return ((Boolean) lVar.invoke(this)).booleanValue();
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public final LottieAnimationSizeElement copy(int width, int height) {
        return new LottieAnimationSizeElement(width, height);
    }

    @Override // h5.x0
    public LottieAnimationSizeNode create() {
        return new LottieAnimationSizeNode(this.width, this.height);
    }

    @Override // h5.x0
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LottieAnimationSizeElement)) {
            return false;
        }
        LottieAnimationSizeElement lottieAnimationSizeElement = (LottieAnimationSizeElement) other;
        return this.width == lottieAnimationSizeElement.width && this.height == lottieAnimationSizeElement.height;
    }

    @Override // h4.r.b, h4.r
    public Object foldIn(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    public Object foldOut(Object obj, p pVar) {
        return pVar.invoke(this, obj);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    @Override // h5.x0
    public int hashCode() {
        return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
    }

    @Override // h5.x0
    public void inspectableProperties(m2 m2Var) {
        m2Var.getClass();
        m2Var.f91341a = "Lottie Size";
        v3 v3Var = m2Var.f91343c;
        v3Var.c(Integer.valueOf(this.width), "width");
        v3Var.c(Integer.valueOf(this.height), "height");
    }

    @Override // h4.r
    public /* bridge */ /* synthetic */ r then(r rVar) {
        return super.then(rVar);
    }

    public String toString() {
        return j.g(this.width, this.height, "LottieAnimationSizeElement(width=", ", height=", ")");
    }

    @Override // h5.x0
    public void update(LottieAnimationSizeNode node) {
        node.getClass();
        node.setWidth(this.width);
        node.setHeight(this.height);
    }
}
