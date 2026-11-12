package defpackage;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;

/* JADX INFO: loaded from: classes.dex */
public class i0a {
    public static Font a(String str, int i) {
        return new Font(str, 0, i);
    }

    public static Font b(int i) {
        return a("SansSerif", i);
    }

    public static Dimension c(FontMetrics fontMetrics, String str) {
        return new Dimension(fontMetrics.stringWidth(str), (fontMetrics.getAscent() - fontMetrics.getLeading()) - fontMetrics.getDescent());
    }
}
