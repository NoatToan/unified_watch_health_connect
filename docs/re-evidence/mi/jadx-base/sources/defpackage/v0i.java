package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public class v0i extends d1i implements View.OnClickListener {
    @Override // defpackage.d1i, defpackage.mzc
    public View a(ViewGroup viewGroup) {
        View viewA = super.a(viewGroup);
        i1i.a((TextView) viewA.findViewById(msi.f27163b), vkg.d(viewA.getContext()) ? viewA.getResources().getString(t1j.common_exoplay_player_data_error_tip) : viewA.getResources().getString(t1j.common_exoplay_player_net_error));
        viewA.findViewById(msi.j).setOnClickListener(this);
        return viewA;
    }

    @Override // defpackage.d1i
    public int c() {
        return tvi.f35109b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        q0i.f().d(view.getId());
    }
}
