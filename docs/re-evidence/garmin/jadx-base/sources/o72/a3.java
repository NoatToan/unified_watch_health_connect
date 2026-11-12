package o72;

import com.garmin.android.apps.connectmobile.activities.stats.timinggates.TimingGatesActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a3 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.n1 f130310b;

    public /* synthetic */ a3(p3.n1 n1Var, int i14) {
        this.f130309a = i14;
        this.f130310b = n1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f130309a;
        p3.n1 n1Var = this.f130310b;
        switch (i14) {
            case 0:
                n1Var.t(((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 1:
                f5.c0 c0Var = (f5.c0) obj;
                c0Var.getClass();
                n1Var.t((int) (c0Var.a() & 4294967295L));
                return Unit.INSTANCE;
            case 2:
                n1Var.t(((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 3:
                o13.p pVar = (o13.p) obj;
                pVar.getClass();
                return Boolean.valueOf(((Number) pVar.f128594a).intValue() == n1Var.getIntValue());
            case 4:
                n1Var.t(((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 5:
                n1Var.t(((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 6:
                return Boolean.valueOf(((Integer) obj).intValue() == n1Var.getIntValue());
            case 7:
                n1Var.t(((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 8:
                n1Var.t((int) (((g6.m) obj).f76013a & 4294967295L));
                return Unit.INSTANCE;
            case 9:
                n1Var.t(((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 10:
                n1Var.t(((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 11:
                n1Var.t(((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 12:
                n1Var.t(((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 13:
                n1Var.t((int) (((g6.m) obj).f76013a & 4294967295L));
                return Unit.INSTANCE;
            case 14:
                n1Var.t(((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 15:
                n1Var.t(((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 16:
                n1Var.t(((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 17:
                n1Var.t(((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 18:
                n1Var.t((int) (((g6.m) obj).f76013a & 4294967295L));
                return Unit.INSTANCE;
            case 19:
                n1Var.t((int) (((g6.m) obj).f76013a & 4294967295L));
                return Unit.INSTANCE;
            case 20:
                TimingGatesActivity.a aVar = TimingGatesActivity.f29952c;
                n1Var.t((int) (((g6.m) obj).f76013a >> 32));
                return Unit.INSTANCE;
            case 21:
                n1Var.t(((Integer) obj).intValue());
                return Unit.INSTANCE;
            case 22:
                n1Var.t(((Integer) obj).intValue());
                return Unit.INSTANCE;
            default:
                n1Var.t(((Integer) obj).intValue());
                return Unit.INSTANCE;
        }
    }
}
