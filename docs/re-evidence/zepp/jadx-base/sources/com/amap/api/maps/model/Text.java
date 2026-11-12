package com.amap.api.maps.model;

import android.graphics.Typeface;
import com.amap.api.mapcore.util.cx;
import com.autonavi.amap.mapcore.interfaces.IText;

/* JADX INFO: loaded from: classes2.dex */
public final class Text {
    public static final int ALIGN_BOTTOM = 16;
    public static final int ALIGN_CENTER_HORIZONTAL = 4;
    public static final int ALIGN_CENTER_VERTICAL = 32;
    public static final int ALIGN_LEFT = 1;
    public static final int ALIGN_RIGHT = 2;
    public static final int ALIGN_TOP = 8;
    private Marker marker;
    private IText textDelegate;
    private TextOptions textOptions;

    public Text(IText iText) {
        this.textDelegate = iText;
    }

    private void a() {
        this.marker.setIcon(cx.b(this.textOptions));
    }

    public final void destroy() {
        try {
            IText iText = this.textDelegate;
            if (iText != null) {
                iText.destroy(true);
            } else {
                this.marker.destroy();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Text)) {
            return false;
        }
        try {
            IText iText = this.textDelegate;
            return iText != null ? iText.equalsRemote(((Text) obj).textDelegate) : this.marker.equals(((Text) obj).marker);
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public final int getAlignX() {
        try {
            IText iText = this.textDelegate;
            return iText != null ? iText.getAlignX() : this.textOptions.getAlignX();
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public final int getAlignY() {
        try {
            IText iText = this.textDelegate;
            if (iText != null) {
                iText.getAlignY();
            } else {
                this.textOptions.getAlignY();
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public final int getBackgroundColor() {
        try {
            IText iText = this.textDelegate;
            return iText != null ? iText.getBackgroundColor() : this.textOptions.getBackgroundColor();
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public final int getFontColor() {
        try {
            IText iText = this.textDelegate;
            return iText != null ? iText.getFontColor() : this.textOptions.getFontColor();
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public final int getFontSize() {
        try {
            IText iText = this.textDelegate;
            return iText != null ? iText.getFontSize() : this.textOptions.getFontSize();
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public final String getId() {
        try {
            IText iText = this.textDelegate;
            return iText != null ? iText.getId() : this.marker.getId();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final Object getObject() {
        IText iText = this.textDelegate;
        return iText != null ? iText.getObject() : this.marker.getObject();
    }

    public final LatLng getPosition() {
        try {
            IText iText = this.textDelegate;
            return iText != null ? iText.getPosition() : this.marker.getPosition();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final float getRotate() {
        IText iText = this.textDelegate;
        return iText != null ? iText.getRotateAngle() : this.marker.getRotateAngle();
    }

    public final String getText() {
        try {
            IText iText = this.textDelegate;
            return iText != null ? iText.getText() : this.textOptions.getText();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final Typeface getTypeface() {
        try {
            IText iText = this.textDelegate;
            return iText != null ? iText.getTypeface() : this.textOptions.getTypeface();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final float getZIndex() {
        IText iText = this.textDelegate;
        return iText != null ? iText.getZIndex() : this.marker.getZIndex();
    }

    public final int hashCode() {
        IText iText = this.textDelegate;
        return iText != null ? iText.hashCodeRemote() : this.marker.hashCode();
    }

    public final boolean isVisible() {
        try {
            IText iText = this.textDelegate;
            return iText != null ? iText.isVisible() : this.marker.isVisible();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public final void remove() {
        try {
            IText iText = this.textDelegate;
            if (iText != null) {
                iText.remove();
            } else {
                this.marker.remove();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setAlign(int i, int i2) {
        try {
            IText iText = this.textDelegate;
            if (iText != null) {
                iText.setAlign(i, i2);
                return;
            }
            this.textOptions.align(i, i2);
            this.marker.setAnchor(cx.a(this.textOptions.getAlignX(), true), cx.a(this.textOptions.getAlignY(), false));
            a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setBackgroundColor(int i) {
        try {
            IText iText = this.textDelegate;
            if (iText != null) {
                iText.setBackgroundColor(i);
            } else {
                this.textOptions.backgroundColor(i);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setFontColor(int i) {
        try {
            IText iText = this.textDelegate;
            if (iText != null) {
                iText.setFontColor(i);
            } else {
                this.textOptions.fontColor(i);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setFontSize(int i) {
        try {
            IText iText = this.textDelegate;
            if (iText != null) {
                iText.setFontSize(i);
            } else {
                this.textOptions.fontSize(i);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setObject(Object obj) {
        IText iText = this.textDelegate;
        if (iText != null) {
            iText.setObject(obj);
        } else {
            this.marker.setObject(obj);
        }
    }

    public final void setPosition(LatLng latLng) {
        try {
            IText iText = this.textDelegate;
            if (iText != null) {
                iText.setPosition(latLng);
            } else {
                this.marker.setPosition(latLng);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setRotate(float f) {
        try {
            IText iText = this.textDelegate;
            if (iText != null) {
                iText.setRotateAngle(f);
            } else {
                this.marker.setRotateAngle(f);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setText(String str) {
        try {
            IText iText = this.textDelegate;
            if (iText != null) {
                iText.setText(str);
            } else {
                this.textOptions.text(str);
                a();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setTypeface(Typeface typeface) {
        try {
            IText iText = this.textDelegate;
            if (iText != null) {
                iText.setTypeface(typeface);
            } else {
                this.textOptions.typeface(typeface);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setVisible(boolean z) {
        try {
            IText iText = this.textDelegate;
            if (iText != null) {
                iText.setVisible(z);
            } else {
                this.marker.setVisible(z);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setZIndex(float f) {
        IText iText = this.textDelegate;
        if (iText != null) {
            iText.setZIndex(f);
        } else {
            this.marker.setZIndex(f);
        }
    }

    public Text(Marker marker, TextOptions textOptions) {
        this.marker = marker;
        this.textOptions = textOptions;
    }
}
