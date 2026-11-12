package c03;

import android.content.Context;
import android.util.LruCache;
import ch.qos.logback.core.CoreConstants;
import e23.l;
import j20.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.w;
import p13.h0;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB)\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nBM\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\b\u0010\u0017B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\u0018¨\u0006\u001b"}, d2 = {"Lc03/d;", "Ld03/d;", "Lvd/d;", "openHelper", "Lvd/c;", "database", "", "cacheSize", "<init>", "(Lvd/d;Lvd/c;I)V", "(Lvd/d;)V", "Ld03/d$a;", "schema", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "name", "Lvd/d$c;", "factory", "Lvd/d$a;", "callback", "", "useNoBackupDirectory", "(Ld03/d$a;Landroid/content/Context;Ljava/lang/String;Lvd/d$c;Lvd/d$a;IZ)V", "(Lvd/c;I)V", "a", "b", "sqldelight-android-driver_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class d implements d03.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd.d f22417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal<b03.c.a> f22418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f22419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f22420d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lc03/d$b;", "Lb03/c$a;", "enclosingTransaction", "<init>", "(Lc03/d;Lb03/c$a;)V", "sqldelight-android-driver_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class b extends b03.c.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b03.c.a f22423g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ d f22424h;

        public b(d dVar, b03.c.a aVar) {
            dVar.getClass();
            this.f22424h = dVar;
            this.f22423g = aVar;
        }

        @Override // b03.c.a
        public final void a(boolean z14) {
            d dVar = this.f22424h;
            b03.c.a aVar = this.f22423g;
            if (aVar == null) {
                if (z14) {
                    dVar.c().t3();
                    dVar.c().y3();
                } else {
                    dVar.c().y3();
                }
            }
            dVar.f22418b.set(aVar);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lvd/c;", "<anonymous>", "()Lvd/c;"}, k = 3, mv = {1, 5, 1})
    public static final class c extends w implements e23.a<vd.c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ vd.c f22426b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(vd.c cVar) {
            super(0);
            this.f22426b = cVar;
        }

        @Override // e23.a
        public final vd.c invoke() {
            vd.d dVar = d.this.f22417a;
            vd.c writableDatabase = dVar == null ? null : dVar.getWritableDatabase();
            if (writableDatabase != null) {
                return writableDatabase;
            }
            vd.c cVar = this.f22426b;
            cVar.getClass();
            return cVar;
        }
    }

    /* JADX INFO: renamed from: c03.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lc03/g;", "<anonymous>", "()Lc03/g;"}, k = 3, mv = {1, 5, 1})
    public static final class C0338d extends w implements e23.a<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f22427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f22428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f22429c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0338d(String str, d dVar, int i14) {
            super(0);
            this.f22427a = str;
            this.f22428b = dVar;
            this.f22429c = i14;
        }

        @Override // e23.a
        public final g invoke() {
            return new c03.c(this.f22427a, this.f22428b.c(), this.f22429c);
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class e extends q implements l<g, d03.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f22430a = new e();

        public e() {
            super(1, g.class, "executeQuery", "executeQuery()Lcom/squareup/sqldelight/db/SqlCursor;", 0);
        }

        @Override // e23.l
        public final d03.c invoke(g gVar) {
            g gVar2 = gVar;
            gVar2.getClass();
            return gVar2.b();
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"c03/d$f", "Landroid/util/LruCache;", "", "Lc03/g;", "sqldelight-android-driver_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class f extends LruCache<Integer, g> {
        public f(int i14) {
            super(i14);
        }

        @Override // android.util.LruCache
        public final void entryRemoved(boolean z14, Integer num, g gVar, g gVar2) {
            num.intValue();
            g gVar3 = gVar;
            gVar3.getClass();
            if (z14) {
                gVar3.close();
            }
        }
    }

    private d(vd.d dVar, vd.c cVar, int i14) {
        this.f22417a = dVar;
        if (!((dVar != null) ^ (cVar != null))) {
            h.s("Failed requirement.");
            throw null;
        }
        this.f22418b = new ThreadLocal<>();
        this.f22419c = m.b(new c(cVar));
        this.f22420d = new f(i14);
    }

    @Override // d03.d
    public final void Z2(Integer num, String str, l lVar) {
        a(num, new c03.e(this, str), lVar, c03.f.f22433a);
    }

    public final <T> T a(Integer num, e23.a<? extends g> aVar, l<? super d03.g, Unit> lVar, l<? super g, ? extends T> lVar2) {
        f fVar = this.f22420d;
        g gVarRemove = num != null ? fVar.remove(num) : null;
        if (gVarRemove == null) {
            gVarRemove = aVar.invoke();
        }
        if (lVar != null) {
            try {
                lVar.invoke(gVarRemove);
            } finally {
                if (num != null) {
                    g gVarPut = fVar.put(num, gVarRemove);
                    if (gVarPut != null) {
                        gVarPut.close();
                    }
                } else {
                    gVarRemove.close();
                }
            }
        }
        T tInvoke = lVar2.invoke(gVarRemove);
        return tInvoke;
    }

    public final vd.c c() {
        return (vd.c) this.f22419c.getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Unit unit;
        this.f22420d.evictAll();
        vd.d dVar = this.f22417a;
        if (dVar == null) {
            unit = null;
        } else {
            dVar.close();
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            c().close();
        }
    }

    @Override // d03.d
    public final d03.c g0(Integer num, String str, int i14, l<? super d03.g, Unit> lVar) {
        return (d03.c) a(num, new C0338d(str, this, i14), lVar, e.f22430a);
    }

    @Override // d03.d
    public final b03.c.a p0() {
        return this.f22418b.get();
    }

    @Override // d03.d
    public final b x1() {
        ThreadLocal<b03.c.a> threadLocal = this.f22418b;
        b03.c.a aVar = threadLocal.get();
        b bVar = new b(this, aVar);
        threadLocal.set(bVar);
        if (aVar == null) {
            c().g2();
        }
        return bVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(d03.d.a aVar, Context context, String str) {
        this(aVar, context, str, null, null, 0, false, 120, null);
        aVar.getClass();
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(d03.d.a aVar, Context context, String str, vd.d.c cVar) {
        this(aVar, context, str, cVar, null, 0, false, 112, null);
        aVar.getClass();
        context.getClass();
        cVar.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(d03.d.a aVar, Context context, String str, vd.d.c cVar, vd.d.a aVar2) {
        this(aVar, context, str, cVar, aVar2, 0, false, 96, null);
        aVar.getClass();
        context.getClass();
        cVar.getClass();
        aVar2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(d03.d.a aVar, Context context, String str, vd.d.c cVar, vd.d.a aVar2, int i14) {
        this(aVar, context, str, cVar, aVar2, i14, false, 64, null);
        aVar.getClass();
        context.getClass();
        cVar.getClass();
        aVar2.getClass();
    }

    public d(d03.d.a aVar, Context context, String str, vd.d.c cVar, vd.d.a aVar2, int i14, boolean z14) {
        aVar.getClass();
        context.getClass();
        cVar.getClass();
        aVar2.getClass();
        vd.d.b.f177135f.getClass();
        vd.d.b.a aVar3 = new vd.d.b.a(context);
        aVar3.f177143c = aVar2;
        aVar3.f177142b = str;
        aVar3.f177144d = z14;
        this(cVar.b(aVar3.a()), (vd.c) null, i14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(vd.c cVar) {
        this(cVar, 0, 2, (j) null);
        cVar.getClass();
    }

    public /* synthetic */ d(vd.d dVar, vd.c cVar, int i14, j jVar) {
        this(dVar, cVar, i14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(d03.d.a aVar, Context context) {
        this(aVar, context, null, null, null, 0, false, 124, null);
        aVar.getClass();
        context.getClass();
    }

    public /* synthetic */ d(vd.d dVar, vd.c cVar, int i14, int i15, j jVar) {
        this((i15 & 1) != 0 ? null : dVar, (i15 & 2) != 0 ? null : cVar, i14);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tB%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0004\"\u00020\n¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lc03/d$a;", "Lvd/d$a;", "Ld03/d$a;", "schema", "", "Ld03/b;", "callbacks", "<init>", "(Ld03/d$a;[Ld03/b;)V", "(Ld03/d$a;)V", "Ld03/a;", "(Ld03/d$a;[Ld03/a;)V", "sqldelight-android-driver_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static class a extends vd.d.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d03.d.a f22421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d03.b[] f22422c;

        public a(d03.d.a aVar, d03.a... aVarArr) {
            aVar.getClass();
            aVarArr.getClass();
            ArrayList arrayList = new ArrayList(aVarArr.length);
            for (d03.a aVar2 : aVarArr) {
                aVar2.getClass();
                arrayList.add(new d03.b(aVar2.f57025a, new d03.f(aVar2)));
            }
            Object[] array = arrayList.toArray(new d03.b[0]);
            if (array == null) {
                x.l("null cannot be cast to non-null type kotlin.Array<T>");
                throw null;
            }
            d03.b[] bVarArr = (d03.b[]) array;
            this(aVar, (d03.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vd.d.a
        public final void c(wd.b bVar) {
            this.f22421b.a(new d((vd.d) null, (vd.c) bVar, 1, (j) (0 == true ? 1 : 0)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vd.d.a
        public final void f(wd.b bVar, int i14, int i15) {
            d03.b[] bVarArr = this.f22422c;
            int i16 = 1;
            Object[] objArr = bVarArr.length == 0;
            vd.d dVar = null;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            d03.d.a aVar = this.f22421b;
            if (objArr == true) {
                aVar.b(new d((vd.d) (objArr3 == true ? 1 : 0), (vd.c) bVar, i16, (j) (objArr2 == true ? 1 : 0)));
                return;
            }
            d dVar2 = new d(dVar, (vd.c) bVar, i16, (j) (objArr4 == true ? 1 : 0));
            d03.b[] bVarArr2 = (d03.b[]) Arrays.copyOf(bVarArr, bVarArr.length);
            aVar.getClass();
            ArrayList arrayList = new ArrayList();
            for (d03.b bVar2 : bVarArr2) {
                int i17 = bVar2.f57027a;
                if (i14 <= i17 && i17 < i15) {
                    arrayList.add(bVar2);
                }
            }
            for (d03.b bVar3 : h0.N0(arrayList, new d03.e())) {
                int i18 = bVar3.f57027a;
                aVar.b(dVar2);
                bVar3.f57028b.invoke(dVar2);
                i14 = bVar3.f57027a + 1;
            }
            if (i14 < i15) {
                aVar.b(dVar2);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(d03.d.a aVar) {
            this(aVar, (d03.b[]) Arrays.copyOf(new d03.b[0], 0));
            aVar.getClass();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d03.d.a aVar, d03.b... bVarArr) {
            super(1);
            aVar.getClass();
            bVarArr.getClass();
            this.f22421b = aVar;
            this.f22422c = bVarArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(vd.d dVar) {
        this(dVar, (vd.c) null, 20);
        dVar.getClass();
    }

    public /* synthetic */ d(d03.d.a aVar, Context context, String str, vd.d.c cVar, vd.d.a aVar2, int i14, boolean z14, int i15, j jVar) {
        this(aVar, context, (i15 & 4) != 0 ? null : str, (i15 & 8) != 0 ? new wd.f() : cVar, (i15 & 16) != 0 ? new a(aVar) : aVar2, (i15 & 32) != 0 ? 20 : i14, (i15 & 64) != 0 ? false : z14);
    }

    public /* synthetic */ d(vd.c cVar, int i14, int i15, j jVar) {
        this(cVar, (i15 & 2) != 0 ? 20 : i14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(vd.c cVar, int i14) {
        this((vd.d) null, cVar, i14);
        cVar.getClass();
    }
}
