package ht1;

import java.util.Calendar;
import p005kotlin.Unit;
import p3.o1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1 f85562b;

    public /* synthetic */ m(o1 o1Var, int i14) {
        this.f85561a = i14;
        this.f85562b = o1Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f85561a) {
            case 0:
                Calendar calendar = (Calendar) obj;
                calendar.getClass();
                this.f85562b.setValue(Long.valueOf(calendar.getTimeInMillis()));
                break;
            default:
                this.f85562b.k(((Long) obj).longValue());
                break;
        }
        return Unit.INSTANCE;
    }
}
