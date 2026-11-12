package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import defpackage.u4j;

/* JADX INFO: loaded from: classes.dex */
public class MotionEffect extends MotionHelper {
    public float n;
    public int o;
    public int p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1921r;
    public boolean s;
    public int t;
    public int u;

    public MotionEffect(Context context) {
        super(context);
        this.n = 0.1f;
        this.o = 49;
        this.p = 50;
        this.q = 0;
        this.f1921r = 0;
        this.s = true;
        this.t = -1;
        this.u = -1;
    }

    private void F(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4j.s9);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u4j.w9) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.o);
                    this.o = i2;
                    this.o = Math.max(Math.min(i2, 99), 0);
                } else if (index == u4j.u9) {
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, this.p);
                    this.p = i3;
                    this.p = Math.max(Math.min(i3, 99), 0);
                } else if (index == u4j.y9) {
                    this.q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.q);
                } else if (index == u4j.z9) {
                    this.f1921r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1921r);
                } else if (index == u4j.t9) {
                    this.n = typedArrayObtainStyledAttributes.getFloat(index, this.n);
                } else if (index == u4j.v9) {
                    this.u = typedArrayObtainStyledAttributes.getInt(index, this.u);
                } else if (index == u4j.x9) {
                    this.s = typedArrayObtainStyledAttributes.getBoolean(index, this.s);
                } else if (index == u4j.A9) {
                    this.t = typedArrayObtainStyledAttributes.getResourceId(index, this.t);
                }
            }
            int i4 = this.o;
            int i5 = this.p;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.o = i4 - 1;
                } else {
                    this.p = i5 + 1;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0158  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01db  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x017c, code lost:
    
        if (r14 == 0.0f) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0190, code lost:
    
        if (r14 == 0.0f) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a0, code lost:
    
        if (r15 == 0.0f) goto L58;
     */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D(androidx.constraintlayout.motion.widget.MotionLayout r23, java.util.HashMap<android.view.View, defpackage.n8g> r24) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.D(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    public boolean x() {
        return true;
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = 0.1f;
        this.o = 49;
        this.p = 50;
        this.q = 0;
        this.f1921r = 0;
        this.s = true;
        this.t = -1;
        this.u = -1;
        F(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = 0.1f;
        this.o = 49;
        this.p = 50;
        this.q = 0;
        this.f1921r = 0;
        this.s = true;
        this.t = -1;
        this.u = -1;
        F(context, attributeSet);
    }
}
