package di;

import ch.qos.logback.core.joran.action.Action;
import ci.h;
import e23.p;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.w;
import p005kotlin.jvm.internal.y0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u000bB=\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012,\b\u0002\u0010\b\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00020\u00040\u0006j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ldi/d;", "Key", "Value", "", "", "maxSize", "Lkotlin/Function2;", "Lcom/apollographql/apollo3/cache/normalized/api/internal/Weigher;", "weigher", "<init>", "(ILe23/p;)V", "b", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class d<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f59689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<Key, Value, Integer> f59690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap<Key, b<Key, Value>> f59691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b<Key, Value> f59692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b<Key, Value> f59693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f59694f;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Key", "Value", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends w implements p<Key, Value, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f59695a = new a();

        public a() {
            super(2);
        }

        @Override // e23.p
        public final /* bridge */ /* synthetic */ Integer invoke(Object obj, Object obj2) {
            return 1;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003BG\u0012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u0000\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0018\u00010\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldi/d$b;", "Key", "Value", "", Action.KEY_ATTRIBUTE, "value", "next", "prev", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ldi/d$b;Ldi/d$b;)V", "apollo-normalized-cache-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Key f59696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Value f59697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b<Key, Value> f59698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b<Key, Value> f59699d;

        public b(Key key, Value value, b<Key, Value> bVar, b<Key, Value> bVar2) {
            this.f59696a = key;
            this.f59697b = value;
            this.f59698c = bVar;
            this.f59699d = bVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i14, p<? super Key, ? super Value, Integer> pVar) {
        pVar.getClass();
        this.f59689a = i14;
        this.f59690b = pVar;
        this.f59691c = new LinkedHashMap<>(0, 0.75f);
    }

    public final void a(b<Key, Value> bVar) {
        b<Key, Value> bVar2 = bVar.f59699d;
        if (bVar2 == null) {
            return;
        }
        bVar2.f59698c = bVar.f59698c;
        b<Key, Value> bVar3 = bVar.f59698c;
        if (bVar3 == null) {
            this.f59693e = bVar2;
        } else {
            bVar3.f59699d = bVar2;
        }
        b<Key, Value> bVar4 = this.f59692d;
        bVar.f59698c = bVar4;
        bVar.f59699d = null;
        if (bVar4 != null) {
            bVar4.f59699d = bVar;
        }
        this.f59692d = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Object obj, h.a aVar) {
        LinkedHashMap<Key, b<Key, Value>> linkedHashMap = this.f59691c;
        b<Key, Value> bVar = linkedHashMap.get(obj);
        if (bVar == null) {
            b<Key, Value> bVar2 = new b<>(obj, aVar, this.f59692d, null);
            this.f59692d = bVar2;
            b<Key, Value> bVar3 = bVar2.f59698c;
            if (bVar3 == null) {
                this.f59693e = bVar2;
            } else {
                bVar3.f59699d = bVar2;
            }
            this.f59694f = this.f59690b.invoke(obj, aVar).intValue() + this.f59694f;
            linkedHashMap.put(obj, bVar2);
        } else {
            bVar.f59697b = aVar;
            a(bVar);
        }
        b<Key, Value> bVar4 = this.f59693e;
        while (bVar4 != null && this.f59694f > this.f59689a) {
            y0.c(linkedHashMap).remove(bVar4.f59696a);
            c(bVar4);
            bVar4 = this.f59693e;
        }
    }

    public final void c(b<Key, Value> bVar) {
        b<Key, Value> bVar2 = bVar.f59699d;
        b<Key, Value> bVar3 = bVar.f59698c;
        if (bVar2 == null) {
            this.f59692d = bVar3;
        } else {
            bVar2.f59698c = bVar3;
        }
        b<Key, Value> bVar4 = bVar.f59698c;
        if (bVar4 == null) {
            this.f59693e = bVar2;
        } else {
            bVar4.f59699d = bVar2;
        }
        int i14 = this.f59694f;
        Key key = bVar.f59696a;
        key.getClass();
        this.f59694f = i14 - this.f59690b.invoke(key, bVar.f59697b).intValue();
        bVar.f59696a = null;
        bVar.f59697b = null;
        bVar.f59698c = null;
        bVar.f59699d = null;
    }

    public /* synthetic */ d(int i14, p pVar, int i15, j jVar) {
        this(i14, (i15 & 2) != 0 ? a.f59695a : pVar);
    }
}
