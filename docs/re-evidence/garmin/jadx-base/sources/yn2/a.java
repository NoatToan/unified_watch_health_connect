package yn2;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import e23.l;
import zb0.g0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f198199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f198200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f198201d;

    public /* synthetic */ a(Object obj, int i14, Object obj2, Object obj3) {
        this.f198198a = i14;
        this.f198199b = obj;
        this.f198200c = obj2;
        this.f198201d = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f198198a;
        Object obj = this.f198201d;
        Object obj2 = this.f198200c;
        Object obj3 = this.f198199b;
        switch (i15) {
            case 0:
                int i16 = b.G0;
                dialogInterface.getClass();
                ((l) obj3).invoke(dialogInterface);
                ((b) obj2).getF52032a().startActivity(new Intent("android.intent.action.DIAL", Uri.parse("tel:" + ((String) obj))));
                break;
            default:
                g0 g0Var = (g0) obj3;
                sd2.f fVar = (sd2.f) obj2;
                gj1.c cVar = (gj1.c) obj;
                if (!fVar.T()) {
                    g0Var.f203492c.a(fVar, false);
                } else {
                    g0Var.f203491b.z4(cVar).f(g0Var, new hc0.f(7, g0Var, fVar));
                }
                break;
        }
    }
}
