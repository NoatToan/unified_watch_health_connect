package com.xiaomi.fitness.watch.face.edit.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.xiaomi.fitness.watch.face.export.exportview.FaceIcon;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/watch/face/edit/ui/FaceEditPreviewView;", "Lcom/xiaomi/fitness/watch/face/export/exportview/FaceIcon;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ratio", "", "getRatio", "()F", "setRatio", "(F)V", "getW", "getH", "getRadius", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FaceEditPreviewView extends FaceIcon {
    private float ratio;

    @JvmOverloads
    public FaceEditPreviewView(@Nullable Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // com.xiaomi.fitness.watch.face.export.exportview.FaceIcon
    public int getH() {
        return (int) (((double) FaceIcon.INFO_HEIGHT) * 1.14d * ((double) this.ratio));
    }

    @Override // com.xiaomi.fitness.watch.face.export.exportview.FaceIcon
    public float getRadius() {
        return (getH() * FaceIcon.RADIUS) / FaceIcon.HEIGHT;
    }

    public final float getRatio() {
        return this.ratio;
    }

    @Override // com.xiaomi.fitness.watch.face.export.exportview.FaceIcon
    public int getW() {
        return (int) (((double) FaceIcon.INFO_WIDTH) * 1.14d * ((double) this.ratio));
    }

    public final void setRatio(float f) {
        this.ratio = f;
    }

    @JvmOverloads
    public FaceEditPreviewView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ FaceEditPreviewView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @JvmOverloads
    public FaceEditPreviewView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ratio = 1.0f;
    }
}
