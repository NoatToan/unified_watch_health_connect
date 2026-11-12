package qa0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import r53.b2;
import r53.j;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lqa0/f;", "Landroidx/lifecycle/u1;", "", "unitId", "Lrg1/a;", "deviceBackupRepo", "Ll22/b;", "stringResourceResolver", "Lx80/b;", "deviceSetupDelegate", "<init>", "(JLrg1/a;Ll22/b;Lx80/b;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f143852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rg1.a f143853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f143854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x80.b f143855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f143856e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f143857f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lqa0/c;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.migration.DeviceMigrationViewModel$uiState$1", f = "DeviceMigrationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<j<? super c>, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(j<? super c> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            f fVar = f.this;
            fVar.getClass();
            ge1.b.T(v1.a(fVar), null, null, new e(fVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    public f(long j8, rg1.a aVar, l22.b bVar, x80.b bVar2) {
        aVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.f143852a = j8;
        this.f143853b = aVar;
        this.f143854c = bVar;
        this.f143855d = bVar2;
        p2 p2VarA = q2.a(new c(false, false, null, false, false, 31, null));
        this.f143856e = p2VarA;
        this.f143857f = s.K(new v(new a(null), p2VarA), v1.a(this), k2.a.a(k2.f150703a, 2), new c(false, false, null, false, false, 31, null));
    }

    public final void x4(long j8, boolean z14, boolean z15) {
        Object value;
        p2 p2Var = this.f143856e;
        List<sg1.c> list = ((c) p2Var.getValue()).f143843c;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(sg1.c.b((sg1.c) it.next(), false));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it3 = arrayList2.iterator();
        int i14 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i14 = -1;
                break;
            } else if (((sg1.c) it3.next()).f159207e == j8) {
                break;
            } else {
                i14++;
            }
        }
        if (i14 != -1) {
            sg1.c cVarB = sg1.c.b((sg1.c) arrayList2.get(i14), z14);
            if (z15) {
                arrayList2.remove(i14);
                arrayList2.add(0, cVarB);
            } else {
                arrayList2.set(i14, cVarB);
            }
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, c.a((c) value, arrayList2, 27)));
        }
    }
}
