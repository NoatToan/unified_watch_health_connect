package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public class r0i extends d1i implements View.OnClickListener {
    @Override // defpackage.d1i, defpackage.mzc
    public View a(ViewGroup viewGroup) {
        View viewA = super.a(viewGroup);
        viewA.findViewById(msi.h).setOnClickListener(this);
        return viewA;
    }

    @Override // defpackage.d1i
    public int c() {
        return tvi.f35108a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        q0i.f().e(view.getId());
    }
}
