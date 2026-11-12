package z10;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o3 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3 f201195b;

    public /* synthetic */ o3(p3 p3Var, int i14) {
        this.f201194a = i14;
        this.f201195b = p3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f201194a;
        p3 p3Var = this.f201195b;
        switch (i15) {
            case 0:
                int i16 = p3.f201204b;
                p3Var.setResult(0);
                p3Var.finish();
                break;
            case 1:
                int i17 = p3.f201204b;
                i3 i3VarFa = p3Var.fa();
                ge1.b.T(androidx.lifecycle.v1.a(i3VarFa), null, null, new l3(i3VarFa, true, false, null), 3);
                break;
            default:
                int i18 = p3.f201204b;
                dialogInterface.getClass();
                p3Var.fa().y4(m0.DEVICE_UPLOAD_CONSENT_REVOKED);
                break;
        }
    }
}
