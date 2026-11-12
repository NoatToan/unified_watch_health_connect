package ot;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f133561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f133562c;

    public /* synthetic */ a0(b0 b0Var, Context context, int i14) {
        this.f133560a = i14;
        this.f133561b = b0Var;
        this.f133562c = context;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f133560a;
        Context context = this.f133562c;
        b0 b0Var = this.f133561b;
        Number number = (Number) obj;
        switch (i14) {
            case 0:
                int i15 = b0.f133572r;
                number.getClass();
                break;
            default:
                int i16 = b0.f133572r;
                number.getClass();
                break;
        }
        return b0Var.r(number, context);
    }
}
