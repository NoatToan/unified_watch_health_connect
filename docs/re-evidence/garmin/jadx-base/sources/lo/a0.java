package lo;

/* JADX INFO: loaded from: classes7.dex */
public class a0 extends f0.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f113707b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(f0 f0Var) {
        super(f0Var, 0);
        this.f113707b = f0Var;
    }

    @Override // lo.f0.c
    public final void a(f0.d dVar) {
        f0 f0Var = this.f113707b;
        String buttonTopLabel = f0Var.f113830u.getButtonTopLabel();
        int i14 = f0Var.O1;
        if (i14 == 0) {
            i14 = 1;
        }
        ((t) dVar).A6("number_of_lengths", buttonTopLabel, i14, 1, 9999);
    }
}
