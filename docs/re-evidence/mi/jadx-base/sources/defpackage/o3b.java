package defpackage;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

/* JADX INFO: loaded from: classes.dex */
public class o3b {
    public static Graphics2D a(BufferedImage bufferedImage, Color color) {
        Graphics2D graphics2DCreateGraphics = bufferedImage.createGraphics();
        if (color != null) {
            graphics2DCreateGraphics.setColor(color);
            graphics2DCreateGraphics.fillRect(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight());
        }
        return graphics2DCreateGraphics;
    }

    public static Graphics b(Graphics graphics, Image image, Rectangle rectangle) {
        graphics.drawImage(image, rectangle.x, rectangle.y, rectangle.width, rectangle.height, (ImageObserver) null);
        return graphics;
    }

    public static Graphics c(Graphics graphics, String str, Font font, Color color, Point point) {
        if (graphics instanceof Graphics2D) {
            ((Graphics2D) graphics).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }
        graphics.setFont(font);
        graphics.setColor((Color) g4h.e(color, Color.BLACK));
        graphics.drawString(str, point.x, point.y);
        return graphics;
    }

    public static Graphics d(Graphics graphics, String str, Font font, Color color, Rectangle rectangle) {
        Dimension dimension;
        int i = rectangle.width;
        int i2 = rectangle.height;
        try {
            dimension = i0a.c(graphics.getFontMetrics(font), str);
        } catch (Exception unused) {
            dimension = new Dimension(i / 3, i2 / 3);
        }
        rectangle.setSize(dimension.width, dimension.height);
        return c(graphics, str, font, color, k6d.e(rectangle, i, i2));
    }

    public static Graphics2D e(Graphics2D graphics2D, float f) {
        graphics2D.setComposite(AlphaComposite.getInstance(10, f));
        return graphics2D;
    }
}
