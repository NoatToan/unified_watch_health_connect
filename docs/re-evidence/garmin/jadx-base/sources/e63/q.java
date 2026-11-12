package e63;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p005kotlin.Metadata;
import p13.j0;
import p13.t0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\fB7\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Le63/q;", "Target", "Type", "Le63/l;", "Le63/n;", "field", "", "", "mapping", "name", "<init>", "(Le63/n;Ljava/util/Map;Ljava/lang/String;)V", "a", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class q<Target, Type> implements l<Target> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n<Target, Type> f63259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Type, String> f63260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f63262d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Le63/q$a;", "Lg63/a;", "", "<init>", "(Le63/q;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements g63.a<Target, String> {
        public a() {
        }

        @Override // g63.a
        public final String c(Object obj, String str) {
            String str2 = str;
            str2.getClass();
            q<Target, Type> qVar = q.this;
            e63.b<Target, Type> bVarA = qVar.f63259a.a();
            Object obj2 = qVar.f63262d.get(str2);
            obj2.getClass();
            Type typeC = bVarA.c(obj, obj2);
            if (typeC != null) {
                return qVar.f63260b.get(typeC);
            }
            return null;
        }

        @Override // g63.a
        /* JADX INFO: renamed from: getName */
        public final String getF63275b() {
            return q.this.f63261c;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.l<Target, String> {
        public b(Object obj) {
            super(1, obj, q.class, "getStringValue", "getStringValue(Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // e23.l
        public final String invoke(Object obj) {
            q qVar = (q) this.receiver;
            n<Target, Type> nVar = qVar.f63259a;
            Type typeB = nVar.a().b(obj);
            String str = qVar.f63260b.get(nVar.a().b(obj));
            if (str != null) {
                return str;
            }
            return "The value " + typeB + " of " + nVar.getF63256b() + " does not have a corresponding string representation";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(n<? super Target, Type> nVar, Map<Type, String> map, String str) {
        nVar.getClass();
        map.getClass();
        str.getClass();
        this.f63259a = nVar;
        this.f63260b = map;
        this.f63261c = str;
        Set<Map.Entry<Type, String>> setEntrySet = map.entrySet();
        int iA = t0.a(p13.y.r(setEntrySet, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            o13.p pVar = new o13.p(entry.getValue(), entry.getKey());
            linkedHashMap.put(pVar.f128594a, pVar.f128595b);
        }
        this.f63262d = linkedHashMap;
    }

    @Override // e63.l
    public final f63.e<Target> a() {
        return new f63.j(new b(this));
    }

    @Override // e63.l
    public final g63.o<Target> b() {
        Map<Type, String> map = this.f63260b;
        return new g63.o<>(p13.w.c(new g63.u(map.values(), new a(), "one of " + map.values() + " for " + this.f63261c)), j0.f134944a);
    }

    @Override // e63.l
    public final n<Target, Type> c() {
        return this.f63259a;
    }
}
