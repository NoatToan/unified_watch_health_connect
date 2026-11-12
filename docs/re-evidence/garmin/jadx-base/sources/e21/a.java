package e21;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b63.v;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.g3;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o13.r;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p13.j0;
import p13.k0;
import p13.y;
import q01.j;
import q6.f;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import u62.z;
import v01.b1;
import v01.d2;
import v13.i;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Le21/a;", "Landroidx/lifecycle/u1;", "Lv01/b1;", "getNutritionReminders", "Lv01/d2;", "saveNutritionReminders", "Lkotlin/Function0;", "", "hasInternetConnection", "<init>", "(Lv01/b1;Lv01/d2;Le23/a;)V", "c", "d", "b", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f62608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d2 f62609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Boolean> f62610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f62611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f62612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public qd1.b f62613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qd1.b f62614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<String, j> f62615h;

    /* JADX INFO: renamed from: e21.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class C1316a extends q implements e23.a<Boolean> {
        public C1316a(Object obj) {
            super(0, obj, az0.b.class, "hasInternetConnection", "hasInternetConnection()Z", 0);
        }

        @Override // e23.a
        public final Boolean invoke() {
            return Boolean.valueOf(az0.b.a());
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Le21/a$c;", "", "", Action.KEY_ATTRIBUTE, "Lq01/j;", "title", "", "enabled", "Lb63/v;", "time", "isDaily", "<init>", "(Ljava/lang/String;Lq01/j;ZLb63/v;Z)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f62617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f62618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v f62619d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f62620e;

        public c(String str, j jVar, boolean z14, v vVar, boolean z15) {
            str.getClass();
            jVar.getClass();
            vVar.getClass();
            this.f62616a = str;
            this.f62617b = jVar;
            this.f62618c = z14;
            this.f62619d = vVar;
            this.f62620e = z15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f62616a.equals(cVar.f62616a) && this.f62617b.equals(cVar.f62617b) && this.f62618c == cVar.f62618c && this.f62619d.equals(cVar.f62619d) && this.f62620e == cVar.f62620e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f62620e) + l2.c(this.f62619d.f16219a, f.g((this.f62617b.hashCode() + (this.f62616a.hashCode() * 31)) * 31, 31, this.f62618c), 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("ReminderRowUiState(key=");
            sb3.append(this.f62616a);
            sb3.append(", title=");
            sb3.append(this.f62617b);
            sb3.append(", enabled=");
            sb3.append(this.f62618c);
            sb3.append(", time=");
            sb3.append(this.f62619d);
            sb3.append(", isDaily=");
            return hb.a.k(sb3, this.f62620e, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Le21/a$d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reminders.viewmodel.NutritionRemindersViewModel$uiState$1", f = "NutritionRemindersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends i implements p<r53.j<? super d>, t13.d<? super Unit>, Object> {
        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super d> jVar, t13.d<? super Unit> dVar) {
            return ((e) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = a.this;
            aVar2.getClass();
            w9.a aVarA = v1.a(aVar2);
            x53.c cVar = s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new e21.b(aVar2, null), 2);
            return Unit.INSTANCE;
        }
    }

    static {
        new b(null);
    }

    public a(b1 b1Var, d2 d2Var, e23.a<Boolean> aVar) {
        b1Var.getClass();
        d2Var.getClass();
        aVar.getClass();
        this.f62608a = b1Var;
        this.f62609b = d2Var;
        this.f62610c = aVar;
        p2 p2VarA = q2.a(new d(null, null, null, 7, null));
        this.f62611d = p2VarA;
        r53.v vVar = new r53.v(new e(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f62612e = s.K(vVar, aVarA, k2.a.f150706c, p2VarA.getValue());
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        this.f62615h = k0Var;
    }

    public final ArrayList x4(List list) {
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qd1.a aVar = (qd1.a) it.next();
            String str = aVar.f144476b;
            j jVar = this.f62615h.get(str);
            if (jVar == null) {
                jVar = new j(str, false);
            }
            boolean z14 = aVar.f144475a;
            v vVar = aVar.f144477c;
            f01.f.f67690b.getClass();
            arrayList.add(new c(str, jVar, z14, vVar, f01.f.a.b(str)));
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Le21/a$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Le21/a$d;", "", "Lcom/garmin/android/apps/connectmobile/g3;", "", "loadState", "Le21/d;", "saveState", "", "Le21/a$c;", "reminders", "<init>", "(Lcom/garmin/android/apps/connectmobile/g3;Le21/d;Ljava/util/List;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g3<Unit> f62621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e21.d f62622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<c> f62623c;

        public d(g3 g3Var, e21.d dVar, List list, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? g3.a.c(g3.f35298f) : g3Var, (i14 & 2) != 0 ? null : dVar, (i14 & 4) != 0 ? j0.f134944a : list);
        }

        public static d a(d dVar, g3 g3Var, e21.d dVar2, ArrayList arrayList, int i14) {
            if ((i14 & 1) != 0) {
                g3Var = dVar.f62621a;
            }
            if ((i14 & 2) != 0) {
                dVar2 = dVar.f62622b;
            }
            List<c> list = arrayList;
            if ((i14 & 4) != 0) {
                list = dVar.f62623c;
            }
            dVar.getClass();
            g3Var.getClass();
            list.getClass();
            return new d(g3Var, dVar2, list);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p005kotlin.jvm.internal.s.g(this.f62621a, dVar.f62621a) && p005kotlin.jvm.internal.s.g(this.f62622b, dVar.f62622b) && p005kotlin.jvm.internal.s.g(this.f62623c, dVar.f62623c);
        }

        public final int hashCode() {
            int iHashCode = this.f62621a.hashCode() * 31;
            e21.d dVar = this.f62622b;
            return this.f62623c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("RemindersUiState(loadState=");
            sb3.append(this.f62621a);
            sb3.append(", saveState=");
            sb3.append(this.f62622b);
            sb3.append(", reminders=");
            return z.c(sb3, this.f62623c, ")");
        }

        public d(g3<Unit> g3Var, e21.d dVar, List<c> list) {
            g3Var.getClass();
            list.getClass();
            this.f62621a = g3Var;
            this.f62622b = dVar;
            this.f62623c = list;
        }

        public d() {
            this(null, null, null, 7, null);
        }
    }

    public /* synthetic */ a(b1 b1Var, d2 d2Var, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(b1Var, d2Var, (i14 & 4) != 0 ? new C1316a(az0.b.f13670a) : aVar);
    }
}
