package vd0;

import android.content.DialogInterface;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oe0.d f177276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f177277c;

    public /* synthetic */ h(oe0.d dVar, p3.p1 p1Var, int i14) {
        this.f177275a = i14;
        this.f177276b = dVar;
        this.f177277c = p1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        String str;
        Object value;
        Boolean bool;
        Object value2;
        switch (this.f177275a) {
            case 0:
                dialogInterface.getClass();
                int checkedItemPosition = ((androidx.appcompat.app.e) dialogInterface).f4658a.f4596g.getCheckedItemPosition();
                if (checkedItemPosition != 1) {
                    str = checkedItemPosition != 2 ? je0.g.UNKNOWN.f98524a : je0.g.MALE.f98524a;
                } else {
                    str = je0.g.FEMALE.f98524a;
                }
                String str2 = str;
                oe0.d dVar = this.f177276b;
                dVar.getClass();
                str2.getClass();
                p2 p2Var = dVar.f131261f;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, pe0.c.a((pe0.c) value, null, null, null, str2, null, 0.0d, null, null, false, null, 1015)));
                this.f177277c.setValue(Boolean.FALSE);
                break;
            default:
                dialogInterface.getClass();
                int checkedItemPosition2 = ((androidx.appcompat.app.e) dialogInterface).f4658a.f4596g.getCheckedItemPosition();
                if (checkedItemPosition2 != 1) {
                    bool = checkedItemPosition2 != 2 ? null : Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                Boolean bool2 = bool;
                p2 p2Var2 = this.f177276b.f131261f;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, pe0.c.a((pe0.c) value2, null, null, null, null, bool2, 0.0d, null, null, false, null, 1007)));
                this.f177277c.setValue(Boolean.FALSE);
                break;
        }
    }
}
