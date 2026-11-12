package miuix.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.Preference;
import defpackage.eii;
import defpackage.g7i;
import defpackage.hm1;
import defpackage.l6i;
import defpackage.n5j;
import defpackage.pwk;
import defpackage.z6i;

/* JADX INFO: loaded from: classes3.dex */
public class BasePreference extends Preference implements z6i, l6i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26807b;
    public boolean c;
    public boolean d;

    public BasePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        e(attributeSet);
    }

    private void e(AttributeSet attributeSet) {
        int iJ = hm1.j(getContext(), eii.n, 1);
        boolean z = iJ == 2 || (pwk.a() > 1 && iJ == 1);
        if (attributeSet == null) {
            this.f26806a = true;
            this.f26807b = true;
            this.c = z;
            this.d = true;
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, n5j.v);
        this.f26806a = typedArrayObtainStyledAttributes.getBoolean(n5j.y, true);
        this.f26807b = typedArrayObtainStyledAttributes.getBoolean(n5j.z, true);
        this.c = typedArrayObtainStyledAttributes.getBoolean(n5j.x, z);
        this.d = typedArrayObtainStyledAttributes.getBoolean(n5j.w, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.qz9
    public boolean a() {
        return this.f26807b;
    }

    @Override // defpackage.l6i
    public boolean b() {
        return this.d;
    }

    @Override // defpackage.z6i
    public boolean d() {
        return this.c;
    }

    public void h(boolean z) {
        this.c = z;
    }

    public void i(boolean z) {
        this.f26806a = z;
    }

    public void k(boolean z) {
        this.f26807b = z;
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(g7i g7iVar) {
        super.onBindViewHolder(g7iVar);
        g7iVar.itemView.setClickable(this.f26806a);
    }

    public BasePreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(attributeSet);
    }

    public BasePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(attributeSet);
    }

    public BasePreference(Context context) {
        super(context);
        e(null);
    }
}
