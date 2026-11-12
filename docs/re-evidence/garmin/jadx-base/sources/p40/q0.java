package p40;

import p005kotlin.Unit;
import p3.p1;
import t21.k1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f135726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f135727c;

    public /* synthetic */ q0(p1 p1Var, p1 p1Var2, int i14) {
        this.f135725a = i14;
        this.f135726b = p1Var;
        this.f135727c = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        CharSequence charSequence;
        switch (this.f135725a) {
            case 0:
                this.f135726b.setValue(Boolean.TRUE);
                this.f135727c.setValue(u0.CUTOFF_TIME);
                return Unit.INSTANCE;
            case 1:
                return Boolean.valueOf(((Boolean) this.f135726b.getF182175a()).booleanValue() && !d53.w.J((CharSequence) this.f135727c.getF182175a()));
            case 2:
                this.f135726b.setValue(Boolean.FALSE);
                this.f135727c.setValue("");
                return Unit.INSTANCE;
            case 3:
                return Boolean.valueOf((!((Boolean) this.f135726b.getF182175a()).booleanValue() || (charSequence = (CharSequence) this.f135727c.getF182175a()) == null || d53.w.J(charSequence)) ? false : true);
            case 4:
                this.f135726b.setValue(null);
                this.f135727c.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 5:
                this.f135726b.setValue(Boolean.FALSE);
                this.f135727c.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 6:
                this.f135726b.setValue(k1.COUNTRY);
                this.f135727c.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 7:
                this.f135726b.setValue(k1.LANGUAGE);
                this.f135727c.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 8:
                this.f135726b.setValue(Boolean.FALSE);
                this.f135727c.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 9:
                this.f135726b.setValue(Boolean.FALSE);
                this.f135727c.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 10:
                this.f135726b.setValue(Boolean.FALSE);
                this.f135727c.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 11:
                this.f135726b.setValue(Boolean.FALSE);
                this.f135727c.setValue("");
                return Unit.INSTANCE;
            case 12:
                this.f135726b.setValue(Boolean.FALSE);
                this.f135727c.setValue("");
                return Unit.INSTANCE;
            case 13:
                this.f135726b.setValue(Boolean.FALSE);
                w11.d.c(this.f135727c, true);
                return Unit.INSTANCE;
            case 14:
                Boolean bool = Boolean.TRUE;
                this.f135726b.setValue(bool);
                this.f135727c.setValue(bool);
                return Unit.INSTANCE;
            default:
                this.f135726b.setValue(Boolean.FALSE);
                this.f135727c.setValue(null);
                return Unit.INSTANCE;
        }
    }
}
