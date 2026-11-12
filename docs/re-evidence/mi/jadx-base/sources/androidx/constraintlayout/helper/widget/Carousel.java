package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import defpackage.u4j;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class Carousel extends MotionHelper {
    public int A;
    public float B;
    public int C;
    public int D;
    public int E;
    public Runnable F;
    public final ArrayList<View> n;
    public int o;
    public int p;
    public MotionLayout q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1916r;
    public boolean s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public int y;
    public int z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Carousel.this.q.setProgress(0.0f);
            Carousel.this.K();
            Carousel.I(Carousel.this);
            int unused = Carousel.this.p;
            throw null;
        }
    }

    public interface b {
    }

    public Carousel(Context context) {
        super(context);
        this.n = new ArrayList<>();
        this.o = 0;
        this.p = 0;
        this.f1916r = -1;
        this.s = false;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = 0.9f;
        this.y = 0;
        this.z = 4;
        this.A = 1;
        this.B = 2.0f;
        this.C = -1;
        this.D = 200;
        this.E = -1;
        this.F = new a();
    }

    public static /* synthetic */ b I(Carousel carousel) {
        carousel.getClass();
        return null;
    }

    public final void J(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u4j.q);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == u4j.t) {
                    this.f1916r = typedArrayObtainStyledAttributes.getResourceId(index, this.f1916r);
                } else if (index == u4j.f35376r) {
                    this.t = typedArrayObtainStyledAttributes.getResourceId(index, this.t);
                } else if (index == u4j.u) {
                    this.u = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
                } else if (index == u4j.s) {
                    this.z = typedArrayObtainStyledAttributes.getInt(index, this.z);
                } else if (index == u4j.x) {
                    this.v = typedArrayObtainStyledAttributes.getResourceId(index, this.v);
                } else if (index == u4j.w) {
                    this.w = typedArrayObtainStyledAttributes.getResourceId(index, this.w);
                } else if (index == u4j.z) {
                    this.x = typedArrayObtainStyledAttributes.getFloat(index, this.x);
                } else if (index == u4j.y) {
                    this.A = typedArrayObtainStyledAttributes.getInt(index, this.A);
                } else if (index == u4j.A) {
                    this.B = typedArrayObtainStyledAttributes.getFloat(index, this.B);
                } else if (index == u4j.v) {
                    this.s = typedArrayObtainStyledAttributes.getBoolean(index, this.s);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void K() {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.k
    public void a(MotionLayout motionLayout, int i, int i2, float f) {
        this.E = i;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.k
    public void b(MotionLayout motionLayout, int i) {
        int i2 = this.p;
        this.o = i2;
        if (i == this.w) {
            this.p = i2 + 1;
        } else if (i == this.v) {
            this.p = i2 - 1;
        }
        if (!this.s) {
            throw null;
        }
        throw null;
    }

    public int getCount() {
        return 0;
    }

    public int getCurrentIndex() {
        return this.p;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @RequiresApi(api = 17)
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i = 0; i < this.f2000b; i++) {
                int i2 = this.f1999a[i];
                View viewById = motionLayout.getViewById(i2);
                if (this.f1916r == i2) {
                    this.y = i;
                }
                this.n.add(viewById);
            }
            this.q = motionLayout;
            if (this.A == 2) {
                androidx.constraintlayout.motion.widget.a.b bVarO = motionLayout.O(this.u);
                if (bVarO != null) {
                    bVarO.G(5);
                }
                androidx.constraintlayout.motion.widget.a.b bVarO2 = this.q.O(this.t);
                if (bVarO2 != null) {
                    bVarO2.G(5);
                }
            }
            K();
        }
    }

    public void setAdapter(b bVar) {
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = new ArrayList<>();
        this.o = 0;
        this.p = 0;
        this.f1916r = -1;
        this.s = false;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = 0.9f;
        this.y = 0;
        this.z = 4;
        this.A = 1;
        this.B = 2.0f;
        this.C = -1;
        this.D = 200;
        this.E = -1;
        this.F = new a();
        J(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = new ArrayList<>();
        this.o = 0;
        this.p = 0;
        this.f1916r = -1;
        this.s = false;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = 0.9f;
        this.y = 0;
        this.z = 4;
        this.A = 1;
        this.B = 2.0f;
        this.C = -1;
        this.D = 200;
        this.E = -1;
        this.F = new a();
        J(context, attributeSet);
    }
}
