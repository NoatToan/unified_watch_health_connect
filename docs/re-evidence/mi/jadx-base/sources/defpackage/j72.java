package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j72 {
    private Object mData;
    private Drawable mIcon;
    private float y;

    public j72() {
        this.y = 0.0f;
        this.mData = null;
        this.mIcon = null;
    }

    public Object getData() {
        return this.mData;
    }

    public Drawable getIcon() {
        return this.mIcon;
    }

    public float getY() {
        return this.y;
    }

    public void setData(Object obj) {
        this.mData = obj;
    }

    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
    }

    public void setY(float f) {
        this.y = f;
    }

    public j72(float f) {
        this.mData = null;
        this.mIcon = null;
        this.y = f;
    }

    public j72(float f, Object obj) {
        this(f);
        this.mData = obj;
    }

    public j72(float f, Drawable drawable) {
        this(f);
        this.mIcon = drawable;
    }

    public j72(float f, Drawable drawable, Object obj) {
        this(f);
        this.mIcon = drawable;
        this.mData = obj;
    }
}
