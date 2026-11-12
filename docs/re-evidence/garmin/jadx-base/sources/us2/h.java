package us2;

import e23.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o13.r;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import rs2.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lus2/h;", "Lus2/g;", "<init>", "()V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f172507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f172508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f172509c;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0012\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.gfdi.core.QueuingOutgoingStrategy$execute$2", f = "QueuingOutgoingStrategy.kt", l = {46}, m = "invokeSuspend")
    public static final class a extends v13.i implements l<t13.d<? super byte[]>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f172510a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f172512c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, t13.d<? super a> dVar) {
            super(1, dVar);
            this.f172512c = jVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return h.this.new a(this.f172512c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super byte[]> dVar) {
            return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f172510a;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    h hVar = h.this;
                    LinkedHashMap linkedHashMap = hVar.f172509c;
                    j jVar = this.f172512c;
                    synchronized (linkedHashMap) {
                        hVar.f172509c.put(new Integer(jVar.f172524c), jVar);
                        Unit unit = Unit.INSTANCE;
                    }
                    j jVar2 = this.f172512c;
                    this.f172510a = 1;
                    jVar2.getClass();
                    obj = ge1.b.Y(new i(jVar2, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                byte[] bArr = (byte[]) obj;
                h hVar2 = h.this;
                LinkedHashMap linkedHashMap2 = hVar2.f172509c;
                j jVar3 = this.f172512c;
                synchronized (linkedHashMap2) {
                }
                return bArr;
            } catch (Throwable th3) {
                h hVar3 = h.this;
                LinkedHashMap linkedHashMap3 = hVar3.f172509c;
                j jVar4 = this.f172512c;
                synchronized (linkedHashMap3) {
                    throw th3;
                }
            }
        }
    }

    public h() {
        rs2.d.f154380a.getClass();
        this.f172507a = LoggerFactory.getLogger(rs2.d.a("QueuingOutgoingStrategy", -1L, this, null));
        this.f172508b = new LinkedHashMap();
        this.f172509c = new LinkedHashMap();
    }

    @Override // us2.g
    public final Object a(j jVar, t13.d<? super byte[]> dVar) {
        ft2.c cVar;
        synchronized (this.f172508b) {
            try {
                LinkedHashMap linkedHashMap = this.f172508b;
                Integer num = new Integer(jVar.f172524c);
                Object cVar2 = linkedHashMap.get(num);
                if (cVar2 == null) {
                    cVar2 = new ft2.c();
                    linkedHashMap.put(num, cVar2);
                }
                cVar = (ft2.c) cVar2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return cVar.b(0, new a(jVar, null), dVar);
    }

    @Override // us2.g
    public final ct2.h b() {
        return new ct2.h(null);
    }

    @Override // us2.g
    public final boolean c(ct2.h hVar, int i14, y yVar, byte[] bArr) {
        j jVar;
        yVar.getClass();
        synchronized (this.f172509c) {
            jVar = (j) this.f172509c.get(Integer.valueOf(i14));
        }
        if (jVar == null) {
            return false;
        }
        jVar.a(yVar, bArr);
        return true;
    }

    @Override // us2.g
    public final void close() {
        List listB1;
        synchronized (this.f172508b) {
            listB1 = h0.b1(this.f172508b.values());
            this.f172508b.clear();
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = listB1.iterator();
        while (it.hasNext()) {
            ((ft2.c) it.next()).a();
        }
    }
}
