package z10;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f201281b;

    public /* synthetic */ w0(y0 y0Var, int i14) {
        this.f201280a = i14;
        this.f201281b = y0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f201280a;
        y0 y0Var = this.f201281b;
        switch (i15) {
            case 0:
                int i16 = y0.f201310q;
                y0Var.setResult(0);
                y0Var.finish();
                break;
            case 1:
                int i17 = y0.f201310q;
                y0Var.finish();
                break;
            case 2:
                int i18 = y0.f201310q;
                e1 e1Var = (e1) y0Var.f201312p.getValue();
                androidx.lifecycle.y0 y0Var2 = new androidx.lifecycle.y0();
                ge1.b.T(androidx.lifecycle.v1.a(e1Var), null, null, new m1(true, false, y0Var2, null), 3);
                y0Var2.f(y0Var, new y0.a(new x0(y0Var, 2)));
                break;
            default:
                int i19 = y0.f201310q;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                if (y0Var.oa() != v92.e0.ASK_FOR_DEVICE_UPLOAD_OPTIONAL) {
                    y0Var.ua();
                } else {
                    y0Var.ta();
                }
                break;
        }
    }
}
