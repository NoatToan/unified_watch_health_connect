package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes9.dex */
public class c0c extends nf2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f4787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f4788b;
    public TextView c;
    public TextView d;

    public c0c(View view) {
        super(view);
        View viewFindViewById = view.findViewById(eri.ne);
        this.f4787a = viewFindViewById;
        this.f4788b = (ImageView) viewFindViewById.findViewById(eri.H7);
        this.c = (TextView) this.f4787a.findViewById(eri.Pn);
        this.d = (TextView) this.f4787a.findViewById(eri.On);
    }

    public void bindData(Context context, km5 km5Var) {
        int i = km5Var.f23980k;
        if (i == 2) {
            this.f4788b.setImageResource(pni.J0);
            this.c.setText(context.getString(c0j.F9));
            this.d.setText(context.getString(c0j.E9));
        } else if (i == 1) {
            this.f4788b.setImageResource(pni.I0);
            this.c.setText(context.getString(c0j.C9));
            this.d.setText(context.getString(c0j.B9));
        }
    }
}
