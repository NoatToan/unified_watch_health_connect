package v5;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lv5/j;", "Landroid/text/style/CharacterStyle;", "", TtmlNode.ATTR_TTS_COLOR, "", "offsetX", "offsetY", "radius", "<init>", "(IFFF)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f175734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f175735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f175736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f175737d;

    public j(int i14, float f14, float f15, float f16) {
        this.f175734a = i14;
        this.f175735b = f14;
        this.f175736c = f15;
        this.f175737d = f16;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f175737d, this.f175735b, this.f175736c, this.f175734a);
    }
}
