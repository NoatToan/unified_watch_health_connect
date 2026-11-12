package defpackage;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes4.dex */
public final class gj3 {
    public static final gj3 g = new gj3(-1, -16777216, 0, 0, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19046b;
    public final int c;
    public final int d;
    public final int e;
    public final Typeface f;

    public gj3(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.f19045a = i;
        this.f19046b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = typeface;
    }

    @RequiresApi(19)
    public static gj3 a(CaptioningManager.CaptionStyle captionStyle) {
        return wlq.f38110a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    @RequiresApi(19)
    public static gj3 b(CaptioningManager.CaptionStyle captionStyle) {
        return new gj3(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    @RequiresApi(21)
    public static gj3 c(CaptioningManager.CaptionStyle captionStyle) {
        return new gj3(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : g.f19045a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : g.f19046b, captionStyle.hasWindowColor() ? captionStyle.windowColor : g.c, captionStyle.hasEdgeType() ? captionStyle.edgeType : g.d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : g.e, captionStyle.getTypeface());
    }
}
