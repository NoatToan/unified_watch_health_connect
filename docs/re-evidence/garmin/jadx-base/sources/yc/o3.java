package yc;

import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001\u000bB#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lyc/o3;", "", "Key", "Value", "Lyc/t3;", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Lyc/n3;", "remoteMediator", "<init>", "(Lo53/b0;Lyc/n3;)V", "a", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class o3<Key, Value> implements t3<Key, Value> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f196291e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o53.b0 f196292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n3<Key, Value> f196293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yc.b<Key, Value> f196294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i4 f196295d;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f196296a;

        static {
            int[] iArr = new int[c1.values().length];
            try {
                iArr[c1.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f196296a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lyc/a;", "it", "", "invoke", "(Lyc/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.l<yc.a<Key, Value>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f196297a = new c();

        public c() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(Object obj) {
            yc.a aVar = (yc.a) obj;
            aVar.getClass();
            aVar.f195713d = true;
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lyc/a;", "it", "", "invoke", "(Lyc/a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.l<yc.a<Key, Value>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c1 f196298a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i3<Key, Value> f196299b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c1 c1Var, i3<Key, Value> i3Var) {
            super(1);
            this.f196298a = c1Var;
            this.f196299b = i3Var;
        }

        @Override // e23.l
        public final Boolean invoke(Object obj) {
            yc.a.b<Key, Value> next;
            yc.a aVar = (yc.a) obj;
            aVar.getClass();
            c1 c1Var = this.f196298a;
            c1Var.getClass();
            i3<Key, Value> i3Var = this.f196299b;
            i3Var.getClass();
            p13.k<yc.a.b<Key, Value>> kVar = aVar.f195712c;
            Iterator<yc.a.b<Key, Value>> it = kVar.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.f195718a != c1Var);
            yc.a.b<Key, Value> bVar = next;
            boolean z14 = false;
            if (bVar != null) {
                bVar.f195719b = i3Var;
            } else {
                yc.a.EnumC3643a enumC3643a = aVar.f195710a[c1Var.ordinal()];
                if (enumC3643a == yc.a.EnumC3643a.REQUIRES_REFRESH && c1Var != c1.REFRESH) {
                    kVar.addLast(new yc.a.b<>(c1Var, i3Var));
                } else if (enumC3643a == yc.a.EnumC3643a.UNBLOCKED || c1Var == c1.REFRESH) {
                    c1 c1Var2 = c1.REFRESH;
                    if (c1Var == c1Var2) {
                        aVar.e(c1Var2, null);
                    }
                    if (aVar.f195711b[c1Var.ordinal()] == null) {
                        kVar.addLast(new yc.a.b<>(c1Var, i3Var));
                        z14 = true;
                    }
                }
            }
            return Boolean.valueOf(z14);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lyc/a;", "it", "", "invoke", "(Lyc/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.l<yc.a<Key, Value>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o3<Key, Value> f196300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i3<Key, Value> f196301b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(o3<Key, Value> o3Var, i3<Key, Value> i3Var) {
            super(1);
            this.f196300a = o3Var;
            this.f196301b = i3Var;
        }

        @Override // e23.l
        public final Unit invoke(Object obj) {
            yc.a aVar = (yc.a) obj;
            aVar.getClass();
            if (aVar.f195713d) {
                aVar.f195713d = false;
                o3<Key, Value> o3Var = this.f196300a;
                o3Var.f(o3Var.f196294c, c1.REFRESH, this.f196301b);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lyc/a;", "accessorState", "", "invoke", "(Lyc/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.l<yc.a<Key, Value>, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<c1> f196302a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<c1> list) {
            super(1);
            this.f196302a = list;
        }

        @Override // e23.l
        public final Unit invoke(Object obj) {
            yc.a aVar = (yc.a) obj;
            aVar.getClass();
            b1 b1Var = new b1(aVar.b(c1.REFRESH), aVar.b(c1.PREPEND), aVar.b(c1.APPEND));
            boolean z14 = b1Var.f195769a instanceof z0.a;
            z0.a[] aVarArr = aVar.f195711b;
            int length = aVarArr.length;
            for (int i14 = 0; i14 < length; i14++) {
                aVarArr[i14] = null;
            }
            List<c1> list = this.f196302a;
            if (z14) {
                c1 c1Var = c1.REFRESH;
                list.add(c1Var);
                aVar.d(c1Var, yc.a.EnumC3643a.UNBLOCKED);
            }
            if (b1Var.f195771c instanceof z0.a) {
                if (!z14) {
                    list.add(c1.APPEND);
                }
                aVar.a(c1.APPEND);
            }
            if (b1Var.f195770b instanceof z0.a) {
                if (!z14) {
                    list.add(c1.PREPEND);
                }
                aVar.a(c1.PREPEND);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public o3(o53.b0 b0Var, n3<Key, Value> n3Var) {
        b0Var.getClass();
        n3Var.getClass();
        this.f196292a = b0Var;
        this.f196293b = n3Var;
        this.f196294c = new yc.b<>();
        this.f196295d = new i4(false);
    }

    @Override // yc.u3
    public final void a(c1 c1Var, i3<Key, Value> i3Var) {
        c1Var.getClass();
        i3Var.getClass();
        f(this.f196294c, c1Var, i3Var);
    }

    @Override // yc.u3
    public final void b(i3<Key, Value> i3Var) {
        i3Var.getClass();
        ArrayList arrayList = new ArrayList();
        this.f196294c.a(new f(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a((c1) it.next(), i3Var);
        }
    }

    @Override // yc.u3
    public final void c() {
        this.f196294c.a(c.f196297a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // yc.t3
    public final Object d(v13.c cVar) {
        p3 p3Var;
        o3<Key, Value> o3Var;
        if (cVar instanceof p3) {
            p3Var = (p3) cVar;
            int i14 = p3Var.f196315d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p3Var.f196315d = i14 - Integer.MIN_VALUE;
            } else {
                p3Var = new p3(this, cVar);
            }
        } else {
            p3Var = new p3(this, cVar);
        }
        Object obj = p3Var.f196313b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = p3Var.f196315d;
        if (i15 == 0) {
            o13.r.b(obj);
            p3Var.f196312a = this;
            p3Var.f196315d = 1;
            obj = n3.a.LAUNCH_INITIAL_REFRESH;
            if (obj == aVar) {
                return aVar;
            }
            o3Var = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o3Var = p3Var.f196312a;
            o13.r.b(obj);
        }
        if (((n3.a) obj) == n3.a.LAUNCH_INITIAL_REFRESH) {
            o3Var.f196294c.a(q3.f196329a);
        }
        return obj;
    }

    @Override // yc.u3
    public final void e(i3<Key, Value> i3Var) {
        this.f196294c.a(new e(this, i3Var));
    }

    public final void f(yc.b<Key, Value> bVar, c1 c1Var, i3<Key, Value> i3Var) {
        if (((Boolean) bVar.a(new d(c1Var, i3Var))).booleanValue()) {
            int i14 = b.f196296a[c1Var.ordinal()];
            o53.b0 b0Var = this.f196292a;
            if (i14 == 1) {
                ge1.b.T(b0Var, null, null, new s3(this, null), 3);
            } else {
                ge1.b.T(b0Var, null, null, new r3(this, null), 3);
            }
        }
    }

    @Override // yc.t3
    public final r53.p2 getState() {
        return this.f196294c.f195760b;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lyc/o3$a;", "", "<init>", "()V", "", "PRIORITY_APPEND_PREPEND", "I", "PRIORITY_REFRESH", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
