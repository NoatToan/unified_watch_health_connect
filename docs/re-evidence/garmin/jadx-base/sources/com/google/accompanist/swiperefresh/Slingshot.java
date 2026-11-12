package com.google.accompanist.swiperefresh;

import com.mapbox.maps.MapboxMap;
import p005kotlin.Metadata;
import p3.p0;
import p3.p1;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R+\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R+\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0007\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R+\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0007\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012¨\u0006 "}, d2 = {"Lcom/google/accompanist/swiperefresh/Slingshot;", "", "<init>", "()V", "", "<set-?>", "offset$delegate", "Lp3/p1;", "getOffset", "()I", "setOffset", "(I)V", MapboxMap.QFE_OFFSET, "", "startTrim$delegate", "getStartTrim", "()F", "setStartTrim", "(F)V", "startTrim", "endTrim$delegate", "getEndTrim", "setEndTrim", "endTrim", "rotation$delegate", "getRotation", "setRotation", "rotation", "arrowScale$delegate", "getArrowScale", "setArrowScale", "arrowScale", "swiperefresh_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Slingshot {

    /* JADX INFO: renamed from: arrowScale$delegate, reason: from kotlin metadata */
    private final p1 arrowScale;

    /* JADX INFO: renamed from: endTrim$delegate, reason: from kotlin metadata */
    private final p1 endTrim;

    /* JADX INFO: renamed from: offset$delegate, reason: from kotlin metadata */
    private final p1 offset = p0.n(0);

    /* JADX INFO: renamed from: rotation$delegate, reason: from kotlin metadata */
    private final p1 rotation;

    /* JADX INFO: renamed from: startTrim$delegate, reason: from kotlin metadata */
    private final p1 startTrim;

    public Slingshot() {
        Float fValueOf = Float.valueOf(0.0f);
        this.startTrim = p0.n(fValueOf);
        this.endTrim = p0.n(fValueOf);
        this.rotation = p0.n(fValueOf);
        this.arrowScale = p0.n(fValueOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getArrowScale() {
        return ((Number) this.arrowScale.getF182175a()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getEndTrim() {
        return ((Number) this.endTrim.getF182175a()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getOffset() {
        return ((Number) this.offset.getF182175a()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getRotation() {
        return ((Number) this.rotation.getF182175a()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getStartTrim() {
        return ((Number) this.startTrim.getF182175a()).floatValue();
    }

    public final void setArrowScale(float f14) {
        this.arrowScale.setValue(Float.valueOf(f14));
    }

    public final void setEndTrim(float f14) {
        this.endTrim.setValue(Float.valueOf(f14));
    }

    public final void setOffset(int i14) {
        this.offset.setValue(Integer.valueOf(i14));
    }

    public final void setRotation(float f14) {
        this.rotation.setValue(Float.valueOf(f14));
    }

    public final void setStartTrim(float f14) {
        this.startTrim.setValue(Float.valueOf(f14));
    }
}
