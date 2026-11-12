package miuix.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import defpackage.u5j;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class MiuixTransitionSet extends a {
    public ArrayList<a> A;
    public boolean B;
    public boolean C;

    public MiuixTransitionSet() {
        this.A = new ArrayList<>();
        this.B = true;
        this.C = false;
    }

    @Override // miuix.transition.a
    public String d(String str) {
        String strD = super.d(str);
        for (int i = 0; i < this.A.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strD);
            sb.append("\n");
            sb.append(this.A.get(i).d(str + "  "));
            strD = sb.toString();
        }
        return strD;
    }

    public MiuixTransitionSet e(a aVar) {
        if (aVar != null) {
            f(aVar);
        }
        return this;
    }

    public final void f(a aVar) {
        this.A.add(aVar);
        aVar.n = this;
    }

    @Override // miuix.transition.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public MiuixTransitionSet clone() {
        MiuixTransitionSet miuixTransitionSet = (MiuixTransitionSet) super.clone();
        miuixTransitionSet.A = new ArrayList<>();
        int size = this.A.size();
        for (int i = 0; i < size; i++) {
            miuixTransitionSet.f(this.A.get(i).clone());
        }
        return miuixTransitionSet;
    }

    public MiuixTransitionSet h(int i) {
        if (i == 0) {
            this.B = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
            }
            this.B = false;
        }
        return this;
    }

    public MiuixTransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = new ArrayList<>();
        this.B = true;
        this.C = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u5j.y);
        h(typedArrayObtainStyledAttributes.getInt(u5j.z, 0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
