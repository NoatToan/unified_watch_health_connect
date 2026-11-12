package cn.hutool.core.img;

import cn.hutool.core.io.IORuntimeException;
import com.amap.api.maps.utils.SpatialRelationUtil;
import defpackage.cid;
import defpackage.g4h;
import defpackage.i0a;
import defpackage.jm9;
import defpackage.k6d;
import defpackage.mqk;
import defpackage.o3b;
import defpackage.qk1;
import defpackage.s2h;
import defpackage.tt3;
import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.awt.color.ColorSpace;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.URL;
import java.nio.file.Path;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class Img implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean positionBaseCentre;
    private float quality;
    private final BufferedImage srcImage;
    private Image targetImage;
    private String targetImageType;

    public Img(BufferedImage bufferedImage) {
        this(bufferedImage, null);
    }

    private static Rectangle calcRotatedSize(int i, int i2, int i3) {
        if (i3 < 0) {
            i3 += SpatialRelationUtil.A_CIRCLE_DEGREE;
        }
        if (i3 >= 90) {
            if ((i3 / 90) % 2 == 1) {
                i2 = i;
                i = i2;
            }
            i3 %= 90;
        }
        double d = i3;
        double dSin = Math.sin(Math.toRadians(d) / 2.0d) * 2.0d * (Math.sqrt((i2 * i2) + (i * i)) / 2.0d);
        double radians = (3.141592653589793d - Math.toRadians(d)) / 2.0d;
        double d2 = i2;
        double d3 = i;
        double d4 = 3.141592653589793d - radians;
        return new Rectangle(i + (((int) (Math.cos(d4 - Math.atan(d2 / d3)) * dSin)) * 2), i2 + (((int) (dSin * Math.cos(d4 - Math.atan(d3 / d2)))) * 2));
    }

    private BufferedImage draw(BufferedImage bufferedImage, Image image, Rectangle rectangle, float f) {
        Graphics2D graphics2DCreateGraphics = bufferedImage.createGraphics();
        o3b.e(graphics2DCreateGraphics, f);
        Point pointE = this.positionBaseCentre ? k6d.e(rectangle, bufferedImage.getWidth(), bufferedImage.getHeight()) : new Point(rectangle.x, rectangle.y);
        rectangle.setLocation(pointE.x, pointE.y);
        o3b.b(graphics2DCreateGraphics, image, rectangle);
        graphics2DCreateGraphics.dispose();
        return bufferedImage;
    }

    private Rectangle fixRectangle(Rectangle rectangle, int i, int i2) {
        if (this.positionBaseCentre) {
            rectangle.setLocation(rectangle.x + (Math.abs(i - rectangle.width) / 2), rectangle.y + (Math.abs(i2 - rectangle.height) / 2));
        }
        return rectangle;
    }

    public static Img from(Path path) {
        return from(path.toFile());
    }

    private int getTypeInt() {
        String str = this.targetImageType;
        str.hashCode();
        return !str.equals("png") ? 1 : 2;
    }

    private Image getValidSrcImg() {
        return (Image) g4h.e(this.targetImage, this.srcImage);
    }

    public Img binary() {
        this.targetImage = k6d.a(getValidSrcImg(), 12);
        return this;
    }

    public Img cut(Rectangle rectangle) {
        Image validSrcImg = getValidSrcImg();
        fixRectangle(rectangle, validSrcImg.getWidth((ImageObserver) null), validSrcImg.getHeight((ImageObserver) null));
        this.targetImage = k6d.k(Toolkit.getDefaultToolkit().createImage(new FilteredImageSource(validSrcImg.getSource(), new CropImageFilter(rectangle.x, rectangle.y, rectangle.width, rectangle.height))));
        return this;
    }

    public Img flip() {
        Image validSrcImg = getValidSrcImg();
        int width = validSrcImg.getWidth((ImageObserver) null);
        int height = validSrcImg.getHeight((ImageObserver) null);
        BufferedImage bufferedImage = new BufferedImage(width, height, getTypeInt());
        Graphics2D graphics2DCreateGraphics = bufferedImage.createGraphics();
        graphics2DCreateGraphics.drawImage(validSrcImg, 0, 0, width, height, width, 0, 0, height, (ImageObserver) null);
        graphics2DCreateGraphics.dispose();
        this.targetImage = bufferedImage;
        return this;
    }

    public Image getImg() {
        throw null;
    }

    public Img gray() {
        this.targetImage = new ColorConvertOp(ColorSpace.getInstance(1003), (RenderingHints) null).filter(k6d.k(getValidSrcImg()), (BufferedImage) null);
        return this;
    }

    public Img pressImage(Image image, int i, int i2, float f) {
        return pressImage(image, new Rectangle(i, i2, image.getWidth((ImageObserver) null), image.getHeight((ImageObserver) null)), f);
    }

    public Img pressText(String str, Color color, Font font, int i, int i2, float f) {
        BufferedImage bufferedImageK = k6d.k(getValidSrcImg());
        Graphics2D graphics2DCreateGraphics = bufferedImageK.createGraphics();
        if (font == null) {
            font = i0a.b((int) (((double) bufferedImageK.getHeight()) * 0.75d));
        }
        graphics2DCreateGraphics.setComposite(AlphaComposite.getInstance(10, f));
        if (this.positionBaseCentre) {
            o3b.d(graphics2DCreateGraphics, str, font, color, new Rectangle(i, i2, bufferedImageK.getWidth(), bufferedImageK.getHeight()));
        } else {
            o3b.c(graphics2DCreateGraphics, str, font, color, new Point(i, i2));
        }
        graphics2DCreateGraphics.dispose();
        this.targetImage = bufferedImageK;
        return this;
    }

    public Img rotate(int i) {
        Image validSrcImg = getValidSrcImg();
        int width = validSrcImg.getWidth((ImageObserver) null);
        int height = validSrcImg.getHeight((ImageObserver) null);
        Rectangle rectangleCalcRotatedSize = calcRotatedSize(width, height, i);
        BufferedImage bufferedImage = new BufferedImage(rectangleCalcRotatedSize.width, rectangleCalcRotatedSize.height, getTypeInt());
        Graphics2D graphics2DCreateGraphics = bufferedImage.createGraphics();
        graphics2DCreateGraphics.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2DCreateGraphics.translate(((double) (rectangleCalcRotatedSize.width - width)) / 2.0d, ((double) (rectangleCalcRotatedSize.height - height)) / 2.0d);
        graphics2DCreateGraphics.rotate(Math.toRadians(i), ((double) width) / 2.0d, ((double) height) / 2.0d);
        graphics2DCreateGraphics.drawImage(validSrcImg, 0, 0, (ImageObserver) null);
        graphics2DCreateGraphics.dispose();
        this.targetImage = bufferedImage;
        return this;
    }

    public Img round(double d) {
        Image validSrcImg = getValidSrcImg();
        int width = validSrcImg.getWidth((ImageObserver) null);
        int height = validSrcImg.getHeight((ImageObserver) null);
        double dR = s2h.r(d, Math.min(width, height));
        BufferedImage bufferedImage = new BufferedImage(width, height, 2);
        Graphics2D graphics2DCreateGraphics = bufferedImage.createGraphics();
        graphics2DCreateGraphics.setComposite(AlphaComposite.Src);
        graphics2DCreateGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2DCreateGraphics.fill(new RoundRectangle2D.Double(0.0d, 0.0d, width, height, dR, dR));
        graphics2DCreateGraphics.setComposite(AlphaComposite.SrcAtop);
        graphics2DCreateGraphics.drawImage(validSrcImg, 0, 0, (ImageObserver) null);
        graphics2DCreateGraphics.dispose();
        this.targetImage = bufferedImage;
        return this;
    }

    public Img scale(float f) {
        if (f < 0.0f) {
            f = -f;
        }
        Image validSrcImg = getValidSrcImg();
        if ("png".equals(this.targetImageType)) {
            double d = f;
            this.targetImage = new AffineTransformOp(AffineTransform.getScaleInstance(d, d), (RenderingHints) null).filter(k6d.k(validSrcImg), (BufferedImage) null);
        } else {
            String string = Float.toString(f);
            scale(s2h.t(Integer.toString(validSrcImg.getWidth((ImageObserver) null)), string).intValue(), s2h.t(Integer.toString(validSrcImg.getHeight((ImageObserver) null)), string).intValue());
        }
        return this;
    }

    public Img setPositionBaseCentre(boolean z) {
        this.positionBaseCentre = z;
        return this;
    }

    public Img setQuality(double d) {
        return setQuality((float) d);
    }

    public Img setTargetImageType(String str) {
        this.targetImageType = str;
        return this;
    }

    public Img stroke(Color color, float f) {
        return stroke(color, (Stroke) new BasicStroke(f));
    }

    public boolean write(OutputStream outputStream) throws IORuntimeException {
        return write(k6d.d(outputStream));
    }

    public Img(BufferedImage bufferedImage, String str) {
        this.positionBaseCentre = true;
        this.quality = -1.0f;
        this.srcImage = bufferedImage;
        this.targetImageType = str == null ? (bufferedImage.getType() == 2 || bufferedImage.getType() == 3 || bufferedImage.getType() == 6 || bufferedImage.getType() == 7) ? "png" : "jpg" : str;
    }

    public static Img from(File file) {
        return new Img(k6d.g(file));
    }

    public Img setQuality(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            this.quality = 1.0f;
        } else {
            this.quality = f;
        }
        return this;
    }

    public Img stroke(Color color, Stroke stroke) {
        BufferedImage bufferedImageK = k6d.k(getValidSrcImg());
        int width = bufferedImageK.getWidth((ImageObserver) null);
        int height = bufferedImageK.getHeight((ImageObserver) null);
        Graphics2D graphics2DCreateGraphics = bufferedImageK.createGraphics();
        graphics2DCreateGraphics.setColor((Color) g4h.e(color, Color.BLACK));
        if (stroke != null) {
            graphics2DCreateGraphics.setStroke(stroke);
        }
        graphics2DCreateGraphics.drawRect(0, 0, width - 1, height - 1);
        graphics2DCreateGraphics.dispose();
        this.targetImage = bufferedImageK;
        return this;
    }

    public boolean write(ImageOutputStream imageOutputStream) throws IORuntimeException {
        qk1.p(this.targetImageType, "Target image type is blank !", new Object[0]);
        qk1.u(imageOutputStream, "Target output stream is null !", new Object[0]);
        BufferedImage bufferedImage = this.targetImage;
        if (bufferedImage == null) {
            bufferedImage = this.srcImage;
        }
        qk1.u(bufferedImage, "Target image is null !", new Object[0]);
        return k6d.o(bufferedImage, this.targetImageType, imageOutputStream, this.quality);
    }

    public static Img from(mqk mqkVar) {
        return from(mqkVar.getStream());
    }

    public static Img from(InputStream inputStream) {
        return new Img(k6d.h(inputStream));
    }

    public Img pressImage(Image image, Rectangle rectangle, float f) {
        this.targetImage = draw(k6d.m(getValidSrcImg(), this.targetImageType), image, rectangle, f);
        return this;
    }

    public static Img from(ImageInputStream imageInputStream) {
        return new Img(k6d.j(imageInputStream));
    }

    public static Img from(URL url) {
        return new Img(k6d.i(url));
    }

    public Img cut(int i, int i2) {
        return cut(i, i2, -1);
    }

    public static Img from(Image image) {
        return new Img(k6d.k(image));
    }

    public Img cut(int i, int i2, int i3) {
        int i4;
        int i5;
        Image validSrcImg = getValidSrcImg();
        int width = validSrcImg.getWidth((ImageObserver) null);
        int height = validSrcImg.getHeight((ImageObserver) null);
        int iMin = i3 > 0 ? i3 * 2 : Math.min(width, height);
        BufferedImage bufferedImage = new BufferedImage(iMin, iMin, 2);
        Graphics2D graphics2DCreateGraphics = bufferedImage.createGraphics();
        double d = iMin;
        graphics2DCreateGraphics.setClip(new Ellipse2D.Double(0.0d, 0.0d, d, d));
        if (this.positionBaseCentre) {
            int i6 = iMin / 2;
            i4 = (i - (width / 2)) + i6;
            i5 = (i2 - (height / 2)) + i6;
        } else {
            i4 = i;
            i5 = i2;
        }
        graphics2DCreateGraphics.drawImage(validSrcImg, i4, i5, (ImageObserver) null);
        graphics2DCreateGraphics.dispose();
        this.targetImage = bufferedImage;
        return this;
    }

    public boolean write(File file) throws Throwable {
        ImageOutputStream imageOutputStreamC;
        String strM = jm9.m(file);
        if (tt3.H(strM)) {
            this.targetImageType = strM;
        }
        if (file.exists()) {
            file.delete();
        }
        try {
            imageOutputStreamC = k6d.c(file);
            try {
                boolean zWrite = write(imageOutputStreamC);
                cid.a(imageOutputStreamC);
                return zWrite;
            } catch (Throwable th) {
                th = th;
                cid.a(imageOutputStreamC);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            imageOutputStreamC = null;
        }
    }

    public Img scale(int i, int i2) {
        Image validSrcImg = getValidSrcImg();
        int height = validSrcImg.getHeight((ImageObserver) null);
        int width = validSrcImg.getWidth((ImageObserver) null);
        if (height == i2 && width == i) {
            this.targetImage = validSrcImg;
            return this;
        }
        int i3 = (height < i2 || width < i) ? 4 : 1;
        double dF = s2h.f(i, width);
        double dF2 = s2h.f(i2, height);
        if ("png".equals(this.targetImageType)) {
            this.targetImage = new AffineTransformOp(AffineTransform.getScaleInstance(dF, dF2), (RenderingHints) null).filter(k6d.k(validSrcImg), (BufferedImage) null);
        } else {
            this.targetImage = validSrcImg.getScaledInstance(i, i2, i3);
        }
        return this;
    }

    public Img scale(int i, int i2, Color color) {
        Image validSrcImg = getValidSrcImg();
        int height = validSrcImg.getHeight((ImageObserver) null);
        int width = validSrcImg.getWidth((ImageObserver) null);
        double dF = s2h.f(i2, height);
        double dF2 = s2h.f(i, width);
        if (s2h.l(dF, dF2)) {
            scale(i, i2);
        } else if (dF2 < dF) {
            scale(i, (int) (((double) height) * dF2));
        } else {
            scale((int) (((double) width) * dF), i2);
        }
        Image validSrcImg2 = getValidSrcImg();
        int height2 = validSrcImg2.getHeight((ImageObserver) null);
        int width2 = validSrcImg2.getWidth((ImageObserver) null);
        BufferedImage bufferedImage = new BufferedImage(i, i2, getTypeInt());
        Graphics2D graphics2DCreateGraphics = bufferedImage.createGraphics();
        if (color != null) {
            graphics2DCreateGraphics.setBackground(color);
            graphics2DCreateGraphics.clearRect(0, 0, i, i2);
        }
        graphics2DCreateGraphics.drawImage(validSrcImg2, (i - width2) / 2, (i2 - height2) / 2, width2, height2, color, (ImageObserver) null);
        graphics2DCreateGraphics.dispose();
        this.targetImage = bufferedImage;
        return this;
    }
}
