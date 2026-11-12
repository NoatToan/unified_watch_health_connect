package rk0;

import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class w implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f153288b;

    public /* synthetic */ w(p1 p1Var, int i14) {
        this.f153287a = i14;
        this.f153288b = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        switch (this.f153287a) {
            case 0:
                this.f153288b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 1:
                this.f153288b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                this.f153288b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 3:
                int i14 = 2;
                int i15 = 0;
                boolean z14 = false;
                while (i15 <= i14) {
                    boolean z15 = p005kotlin.jvm.internal.s.h("150".charAt(!z14 ? i15 : i14), 32) <= 0;
                    if (z14) {
                        if (!z15) {
                            this.f153288b.setValue("150".subSequence(i15, i14 + 1).toString());
                            return Unit.INSTANCE;
                        }
                        i14--;
                    } else if (z15) {
                        i15++;
                    } else {
                        z14 = true;
                    }
                }
                this.f153288b.setValue("150".subSequence(i15, i14 + 1).toString());
                return Unit.INSTANCE;
            case 4:
                p1 p1Var = this.f153288b;
                p1Var.setValue(Boolean.valueOf(!((Boolean) p1Var.getF182175a()).booleanValue()));
                return Unit.INSTANCE;
            case 5:
                p1 p1Var2 = this.f153288b;
                p1Var2.setValue(Boolean.valueOf(!((Boolean) p1Var2.getF182175a()).booleanValue()));
                return Unit.INSTANCE;
            case 6:
                return p3.p0.n((String) this.f153288b.getF182175a());
            case 7:
                f5.c0 c0Var = (f5.c0) this.f153288b.getF182175a();
                if (c0Var != null) {
                    return c0Var;
                }
                b2.e.d("Required value was null.");
                o2.c.f();
                return null;
            case 8:
                this.f153288b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 9:
                this.f153288b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 10:
                s70.s.d("showBluetoothPermissionDeniedDialog: negative button clicked");
                this.f153288b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 11:
                s70.s.d("showBluetoothPermissionDeniedDialog: onDismiss");
                this.f153288b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 12:
                this.f153288b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 13:
                this.f153288b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 14:
                this.f153288b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 15:
                this.f153288b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 16:
                this.f153288b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 17:
                this.f153288b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 18:
                this.f153288b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 19:
                this.f153288b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 20:
                this.f153288b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 21:
                this.f153288b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 22:
                this.f153288b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 23:
                this.f153288b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 24:
                this.f153288b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 25:
                p1 p1Var3 = this.f153288b;
                p1Var3.setValue(Boolean.valueOf(!((Boolean) p1Var3.getF182175a()).booleanValue()));
                return Unit.INSTANCE;
            case 26:
                p1 p1Var4 = this.f153288b;
                if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                    p1Var4.setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 27:
                this.f153288b.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 28:
                this.f153288b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            default:
                this.f153288b.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
