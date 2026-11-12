package defpackage;

import cn.hutool.core.io.IORuntimeException;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class k6d {
    public static BufferedImage a(Image image, int i) {
        return b(image, i, null);
    }

    public static BufferedImage b(Image image, int i, Color color) {
        BufferedImage bufferedImage = new BufferedImage(image.getWidth((ImageObserver) null), image.getHeight((ImageObserver) null), i);
        Graphics2D graphics2DA = o3b.a(bufferedImage, color);
        graphics2DA.drawImage(image, 0, 0, (ImageObserver) null);
        graphics2DA.dispose();
        return bufferedImage;
    }

    public static ImageOutputStream c(File file) throws IORuntimeException {
        try {
            ImageOutputStream imageOutputStreamCreateImageOutputStream = ImageIO.createImageOutputStream(file);
            if (imageOutputStreamCreateImageOutputStream != null) {
                return imageOutputStreamCreateImageOutputStream;
            }
            throw new IllegalArgumentException("Image type of file [" + file.getName() + "] is not supported!");
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    public static ImageOutputStream d(OutputStream outputStream) throws IORuntimeException {
        try {
            ImageOutputStream imageOutputStreamCreateImageOutputStream = ImageIO.createImageOutputStream(outputStream);
            if (imageOutputStreamCreateImageOutputStream != null) {
                return imageOutputStreamCreateImageOutputStream;
            }
            throw new IllegalArgumentException("Image type is not supported!");
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    public static Point e(Rectangle rectangle, int i, int i2) {
        return new Point(rectangle.x + (Math.abs(i - rectangle.width) / 2), rectangle.y + (Math.abs(i2 - rectangle.height) / 2));
    }

    public static ImageWriter f(Image image, String str) {
        Iterator imageWriters = ImageIO.getImageWriters(ImageTypeSpecifier.createFromRenderedImage(m(image, str)), str);
        if (imageWriters.hasNext()) {
            return (ImageWriter) imageWriters.next();
        }
        return null;
    }

    public static BufferedImage g(File file) {
        try {
            BufferedImage bufferedImage = ImageIO.read(file);
            if (bufferedImage != null) {
                return bufferedImage;
            }
            throw new IllegalArgumentException("Image type of file [" + file.getName() + "] is not supported!");
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    public static BufferedImage h(InputStream inputStream) {
        try {
            BufferedImage bufferedImage = ImageIO.read(inputStream);
            if (bufferedImage != null) {
                return bufferedImage;
            }
            throw new IllegalArgumentException("Image type is not supported!");
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    public static BufferedImage i(URL url) {
        try {
            BufferedImage bufferedImage = ImageIO.read(url);
            if (bufferedImage != null) {
                return bufferedImage;
            }
            throw new IllegalArgumentException("Image type of [" + url + "] is not supported!");
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    public static BufferedImage j(ImageInputStream imageInputStream) {
        try {
            BufferedImage bufferedImage = ImageIO.read(imageInputStream);
            if (bufferedImage != null) {
                return bufferedImage;
            }
            throw new IllegalArgumentException("Image type is not supported!");
        } catch (IOException e) {
            throw new IORuntimeException(e);
        }
    }

    public static BufferedImage k(Image image) {
        return image instanceof BufferedImage ? (BufferedImage) image : a(image, 1);
    }

    public static BufferedImage l(Image image, int i) {
        if (!(image instanceof BufferedImage)) {
            return a(image, i);
        }
        BufferedImage bufferedImage = (BufferedImage) image;
        return i != bufferedImage.getType() ? a(image, i) : bufferedImage;
    }

    public static BufferedImage m(Image image, String str) {
        return l(image, "png".equalsIgnoreCase(str) ? 2 : 1);
    }

    public static RenderedImage n(Image image) {
        return image instanceof RenderedImage ? (RenderedImage) image : a(image, 1);
    }

    public static boolean o(Image image, String str, ImageOutputStream imageOutputStream, float f) throws IORuntimeException {
        if (tt3.F(str)) {
            str = "jpg";
        }
        BufferedImage bufferedImageM = m(image, str);
        return p(bufferedImageM, f(bufferedImageM, str), imageOutputStream, f);
    }

    public static boolean p(Image image, ImageWriter imageWriter, ImageOutputStream imageOutputStream, float f) {
        ImageWriteParam defaultWriteParam;
        if (imageWriter == null) {
            return false;
        }
        imageWriter.setOutput(imageOutputStream);
        RenderedImage renderedImageN = n(image);
        if (f <= 0.0f || f >= 1.0f) {
            defaultWriteParam = null;
        } else {
            defaultWriteParam = imageWriter.getDefaultWriteParam();
            if (defaultWriteParam.canWriteCompressed()) {
                defaultWriteParam.setCompressionMode(2);
                defaultWriteParam.setCompressionQuality(f);
                ColorModel colorModel = renderedImageN.getColorModel();
                defaultWriteParam.setDestinationType(new ImageTypeSpecifier(colorModel, colorModel.createCompatibleSampleModel(16, 16)));
            }
        }
        try {
            try {
                if (defaultWriteParam != null) {
                    imageWriter.write((IIOMetadata) null, new IIOImage(renderedImageN, (List) null, (IIOMetadata) null), defaultWriteParam);
                } else {
                    imageWriter.write(renderedImageN);
                }
                imageOutputStream.flush();
                imageWriter.dispose();
                return true;
            } catch (IOException e) {
                throw new IORuntimeException(e);
            }
        } catch (Throwable th) {
            imageWriter.dispose();
            throw th;
        }
    }
}
