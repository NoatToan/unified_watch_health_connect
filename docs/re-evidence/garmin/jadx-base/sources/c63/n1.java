package c63;

import com.roomorama.caldroid.CaldroidFragment;
import java.time.Month;
import java.time.YearMonth;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\t\nB\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lc63/n1;", "Lc63/a;", "Lb63/d0;", "Lc63/e0;", "Le63/f;", "Lc63/l1;", "actualFormat", "<init>", "(Le63/f;)V", "b", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n1 extends c63.a<b63.d0, e0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f25026b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e63.f<l1> f25027a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc63/n1$a;", "Lc63/b;", "Lc63/l1;", "Lc63/g;", "Le63/d;", "actualBuilder", "<init>", "(Le63/d;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements c63.b<l1, a>, g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e63.d<l1> f25028a;

        public a(e63.d<l1> dVar) {
            dVar.getClass();
            this.f25028a = dVar;
        }

        @Override // c63.b
        public final e63.d<l1> A() {
            return this.f25028a;
        }

        @Override // c63.b
        public final c63.b C() {
            return new a(new e63.d());
        }

        @Override // c63.g
        public final void v(e63.e eVar) {
            this.f25028a.a(eVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n1(e63.f<? super l1> fVar) {
        super(null);
        fVar.getClass();
        this.f25027a = fVar;
    }

    @Override // c63.a
    public final e63.f<l1> c() {
        return this.f25027a;
    }

    @Override // c63.a
    public final g63.c d() {
        return o1.f25034a;
    }

    @Override // c63.a
    public final g63.c e(b63.d0 d0Var) {
        b63.d0 d0Var2 = d0Var;
        d0Var2.getClass();
        e0 e0Var = new e0(null, null, 3, null);
        YearMonth yearMonth = d0Var2.f16180a;
        e0Var.f24963a = Integer.valueOf(yearMonth.getYear());
        Month month = yearMonth.getMonth();
        month.getClass();
        e0Var.f24964b = Integer.valueOf(b63.b.b(b63.c.a(month)));
        return e0Var;
    }

    @Override // c63.a
    public final b63.d0 f(g63.c cVar) {
        e0 e0Var = (e0) cVar;
        e0Var.getClass();
        Integer num = e0Var.f24963a;
        o1.a(num, CaldroidFragment.YEAR);
        int iIntValue = num.intValue();
        Integer num2 = e0Var.f24964b;
        o1.a(num2, "monthNumber");
        return new b63.d0(iIntValue, num2.intValue());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc63/n1$b;", "", "<init>", "()V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
