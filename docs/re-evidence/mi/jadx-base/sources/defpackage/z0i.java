package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class z0i extends d1i implements View.OnClickListener {
    public z0i() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(msi.f27164k));
        cil.d().i(arrayList);
    }

    @Override // defpackage.d1i, defpackage.mzc
    public View a(ViewGroup viewGroup) {
        View viewA = super.a(viewGroup);
        ((TextView) viewA.findViewById(msi.f27164k)).setOnClickListener(this);
        return viewA;
    }

    @Override // defpackage.d1i
    public int c() {
        return tvi.d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        q0i.f().c(view.getId());
    }
}
