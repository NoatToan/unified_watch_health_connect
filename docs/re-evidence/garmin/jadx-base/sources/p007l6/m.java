package p007l6;

import ch.qos.logback.core.joran.action.ActionConst;
import e23.l;
import f5.s1;
import g6.c;
import h4.r;
import java.util.ArrayList;
import kotlin.k2;
import kotlin.n2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Ll6/m;", "Ll6/h;", "<init>", "()V", "a", "b", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f110483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f110484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<e> f110485d;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll6/m$a;", "Lf5/s1;", "Li5/n2;", "Ll6/e;", ActionConst.REF_ATTRIBUTE, "Lkotlin/Function1;", "Ll6/d;", "", "constrainBlock", "<init>", "(Ll6/e;Le23/l;)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends n2 implements s1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f110486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l<d, Unit> f110487c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e eVar, l<? super d, Unit> lVar) {
            super(k2.f91249a);
            this.f110486b = eVar;
            this.f110487c = lVar;
        }

        public final boolean equals(Object obj) {
            a aVar = obj instanceof a ? (a) obj : null;
            return this.f110487c == (aVar != null ? aVar.f110487c : null);
        }

        public final int hashCode() {
            return this.f110487c.hashCode();
        }

        @Override // f5.s1
        public final Object r(c cVar, Object obj) {
            return new l(this.f110486b, this.f110487c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll6/m$b;", "", "<init>", "(Ll6/m;)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b {
        public b() {
        }
    }

    public m() {
        super(null);
        this.f110484c = 0;
        this.f110485d = new ArrayList<>();
    }

    public static r a(r rVar, e eVar, l lVar) {
        return rVar.then(new a(eVar, lVar));
    }

    public final e b() {
        int i14 = this.f110484c;
        this.f110484c = i14 + 1;
        ArrayList<e> arrayList = this.f110485d;
        e eVar = (e) h0.e0(i14, arrayList);
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(Integer.valueOf(this.f110484c));
        arrayList.add(eVar2);
        return eVar2;
    }

    public final void c() {
        this.f110470a.f136192e.clear();
        this.f110484c = 0;
    }
}
