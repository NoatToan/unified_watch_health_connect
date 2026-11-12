package miuix.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.eii;
import defpackage.g7i;
import defpackage.hm1;
import defpackage.l6i;
import defpackage.n5j;
import defpackage.pwk;
import defpackage.z6i;

/* JADX INFO: loaded from: classes3.dex */
public class BaseCheckBoxPreference extends androidx.preference.CheckBoxPreference implements z6i, l6i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26805b;
    public boolean c;
    public boolean d;
    public boolean e;

    public BaseCheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        h(attributeSet);
    }

    @Override // defpackage.qz9
    public boolean a() {
        return this.c;
    }

    @Override // defpackage.l6i
    public boolean b() {
        return this.e;
    }

    @Override // defpackage.z6i
    public boolean d() {
        return this.d;
    }

    public final void h(AttributeSet attributeSet) {
        int iJ = hm1.j(getContext(), eii.n, 1);
        boolean z = iJ == 2 || (pwk.a() > 1 && iJ == 1);
        if (attributeSet == null) {
            this.f26805b = true;
            this.c = true;
            this.d = z;
            this.e = true;
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, n5j.v);
        this.f26805b = typedArrayObtainStyledAttributes.getBoolean(n5j.y, true);
        this.c = typedArrayObtainStyledAttributes.getBoolean(n5j.z, true);
        this.d = typedArrayObtainStyledAttributes.getBoolean(n5j.x, z);
        this.e = typedArrayObtainStyledAttributes.getBoolean(n5j.w, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.CheckBoxPreference, androidx.preference.Preference
    public void onBindViewHolder(g7i g7iVar) {
        super.onBindViewHolder(g7iVar);
        g7iVar.itemView.setClickable(this.f26805b);
    }

    public BaseCheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        h(attributeSet);
    }

    public BaseCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h(attributeSet);
    }

    public BaseCheckBoxPreference(Context context) {
        super(context);
        h(null);
    }
}
