package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class e extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f6296a;

    public e(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public d getConstraintSet() {
        if (this.f6296a == null) {
            this.f6296a = new d();
        }
        d dVar = this.f6296a;
        dVar.getClass();
        int childCount = getChildCount();
        HashMap<Integer, d.a> map = dVar.f6198g;
        map.clear();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            a aVar = (a) childAt.getLayoutParams();
            int id3 = childAt.getId();
            if (dVar.f6197f && id3 == -1) {
                kg.f.n("All children of ConstraintLayout must have ids to use ConstraintSet");
                return null;
            }
            if (!map.containsKey(Integer.valueOf(id3))) {
                map.put(Integer.valueOf(id3), new d.a());
            }
            d.a aVar2 = map.get(Integer.valueOf(id3));
            if (aVar2 != null) {
                if (childAt instanceof b) {
                    b bVar = (b) childAt;
                    d.b bVar2 = aVar2.f6203e;
                    aVar2.d(id3, aVar);
                    if (bVar instanceof Barrier) {
                        bVar2.f6237i0 = 1;
                        Barrier barrier = (Barrier) bVar;
                        bVar2.f6233g0 = barrier.getType();
                        bVar2.f6239j0 = barrier.getReferencedIds();
                        bVar2.f6235h0 = barrier.getMargin();
                    }
                }
                aVar2.d(id3, aVar);
            }
        }
        return this.f6296a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    public e(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        super.setVisibility(8);
    }

    public static class a extends ConstraintLayout.b {
        public final float A0;
        public final float B0;
        public final float C0;
        public final float D0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final float f6297r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f6298s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final float f6299t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final float f6300u0;

        /* JADX INFO: renamed from: v0, reason: collision with root package name */
        public final float f6301v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final float f6302w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final float f6303x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final float f6304y0;

        /* JADX INFO: renamed from: z0, reason: collision with root package name */
        public final float f6305z0;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f6297r0 = 1.0f;
            this.f6298s0 = false;
            this.f6299t0 = 0.0f;
            this.f6300u0 = 0.0f;
            this.f6301v0 = 0.0f;
            this.f6302w0 = 0.0f;
            this.f6303x0 = 1.0f;
            this.f6304y0 = 1.0f;
            this.f6305z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f6313e);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i14 = 0; i14 < indexCount; i14++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i14);
                if (index == 15) {
                    this.f6297r0 = typedArrayObtainStyledAttributes.getFloat(index, this.f6297r0);
                } else if (index == 28) {
                    this.f6299t0 = typedArrayObtainStyledAttributes.getFloat(index, this.f6299t0);
                    this.f6298s0 = true;
                } else if (index == 23) {
                    this.f6301v0 = typedArrayObtainStyledAttributes.getFloat(index, this.f6301v0);
                } else if (index == 24) {
                    this.f6302w0 = typedArrayObtainStyledAttributes.getFloat(index, this.f6302w0);
                } else if (index == 22) {
                    this.f6300u0 = typedArrayObtainStyledAttributes.getFloat(index, this.f6300u0);
                } else if (index == 20) {
                    this.f6303x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f6303x0);
                } else if (index == 21) {
                    this.f6304y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f6304y0);
                } else if (index == 16) {
                    this.f6305z0 = typedArrayObtainStyledAttributes.getFloat(index, this.f6305z0);
                } else if (index == 17) {
                    this.A0 = typedArrayObtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == 18) {
                    this.B0 = typedArrayObtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == 19) {
                    this.C0 = typedArrayObtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == 27) {
                    this.D0 = typedArrayObtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(a aVar) {
            super(aVar);
            this.f6297r0 = 1.0f;
            this.f6298s0 = false;
            this.f6299t0 = 0.0f;
            this.f6300u0 = 0.0f;
            this.f6301v0 = 0.0f;
            this.f6302w0 = 0.0f;
            this.f6303x0 = 1.0f;
            this.f6304y0 = 1.0f;
            this.f6305z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }

        public a(int i14, int i15) {
            super(i14, i15);
            this.f6297r0 = 1.0f;
            this.f6298s0 = false;
            this.f6299t0 = 0.0f;
            this.f6300u0 = 0.0f;
            this.f6301v0 = 0.0f;
            this.f6302w0 = 0.0f;
            this.f6303x0 = 1.0f;
            this.f6304y0 = 1.0f;
            this.f6305z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }
    }
}
