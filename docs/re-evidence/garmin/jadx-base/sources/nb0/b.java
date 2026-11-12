package nb0;

import java.util.Locale;
import x5.c0;
import x5.q0;
import x5.r0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f125252b;

    public /* synthetic */ b(int i14) {
        this.f125252b = i14;
    }

    @Override // x5.r0
    public final q0 a(s5.c cVar) {
        switch (this.f125252b) {
            case 0:
                cVar.getClass();
                String upperCase = cVar.f157138b.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                s5.c cVar2 = new s5.c(upperCase, null, 2, null);
                c0.f188826a.getClass();
                return new q0(cVar2, c0.a.f188828b);
            case 1:
                cVar.getClass();
                String upperCase2 = cVar.f157138b.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                s5.c cVar3 = new s5.c(upperCase2, null, 2, null);
                c0.f188826a.getClass();
                return new q0(cVar3, c0.a.f188828b);
            default:
                r0.a aVar = r0.a.f188942a;
                c0.f188826a.getClass();
                return new q0(cVar, c0.a.f188828b);
        }
    }
}
