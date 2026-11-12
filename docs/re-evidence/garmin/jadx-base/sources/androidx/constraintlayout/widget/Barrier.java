package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6092i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6093j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public t6.a f6094k;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f6094k.f162565z0;
    }

    public int getMargin() {
        return this.f6094k.A0;
    }

    public int getType() {
        return this.f6092i;
    }

    @Override // androidx.constraintlayout.widget.b
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f6094k = new t6.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f6310b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i14 = 0; i14 < indexCount; i14++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i14);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f6094k.f162565z0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f6094k.A0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f6169d = this.f6094k;
        m();
    }

    @Override // androidx.constraintlayout.widget.b
    public final void j(d.a aVar, t6.i iVar, e.a aVar2, SparseArray sparseArray) {
        super.j(aVar, iVar, aVar2, sparseArray);
        d.b bVar = aVar.f6203e;
        if (iVar instanceof t6.a) {
            t6.a aVar3 = (t6.a) iVar;
            n(aVar3, bVar.f6233g0, ((t6.f) iVar.X).B0);
            aVar3.f162565z0 = bVar.f6249o0;
            aVar3.A0 = bVar.f6235h0;
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public final void k(t6.e eVar, boolean z14) {
        n(eVar, this.f6092i, z14);
    }

    public final void n(t6.e eVar, int i14, boolean z14) {
        this.f6093j = i14;
        int i15 = this.f6092i;
        if (z14) {
            if (i15 == 5) {
                this.f6093j = 1;
            } else if (i15 == 6) {
                this.f6093j = 0;
            }
        } else if (i15 == 5) {
            this.f6093j = 0;
        } else if (i15 == 6) {
            this.f6093j = 1;
        }
        if (eVar instanceof t6.a) {
            ((t6.a) eVar).f162564y0 = this.f6093j;
        }
    }

    public void setAllowsGoneWidget(boolean z14) {
        this.f6094k.f162565z0 = z14;
    }

    public void setDpMargin(int i14) {
        this.f6094k.A0 = (int) ((i14 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i14) {
        this.f6094k.A0 = i14;
    }

    public void setType(int i14) {
        this.f6092i = i14;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        super.setVisibility(8);
    }
}
