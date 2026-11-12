package h5;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.MapboxMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lh5/a1;", "", "Lh5/e0;", "layoutNode", "<init>", "(Lh5/e0;)V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f81680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f81681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f81682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c1 f81683d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f81684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h4.r.c f81685f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q3.c<h4.r.b> f81686g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public q3.c<h4.r.b> f81687h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q3.c<h4.r> f81688i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f81689j;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lh5/a1$a;", "", "Lh4/r$c;", "node", "", MapboxMap.QFE_OFFSET, "Lq3/c;", "Lh4/r$b;", TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_AFTER, "", "shouldAttachOnInsert", "<init>", "(Lh5/a1;Lh4/r$c;ILq3/c;Lq3/c;Z)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h4.r.c f81690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f81691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public q3.c<h4.r.b> f81692c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public q3.c<h4.r.b> f81693d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f81694e;

        public a(h4.r.c cVar, int i14, q3.c<h4.r.b> cVar2, q3.c<h4.r.b> cVar3, boolean z14) {
            this.f81690a = cVar;
            this.f81691b = i14;
            this.f81692c = cVar2;
            this.f81693d = cVar3;
            this.f81694e = z14;
        }

        public final boolean a(int i14, int i15) {
            q3.c<h4.r.b> cVar = this.f81692c;
            int i16 = this.f81691b;
            h4.r.b bVar = cVar.f142356a[i14 + i16];
            h4.r.b bVar2 = this.f81693d.f142356a[i16 + i15];
            return p005kotlin.jvm.internal.s.g(bVar, bVar2) || bVar.getClass() == bVar2.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h5/a1$b", "Lh4/r$c;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends h4.r.c {
        public final String toString() {
            return "<Head>";
        }
    }

    public a1(e0 e0Var) {
        this.f81680a = e0Var;
        b bVar = new b();
        bVar.setAggregateChildKindSet$ui(-1);
        this.f81681b = bVar;
        w wVar = new w(e0Var);
        this.f81682c = wVar;
        this.f81683d = wVar;
        b2 b2Var = wVar.U0;
        this.f81684e = b2Var;
        this.f81685f = b2Var;
        this.f81688i = new q3.c<>(new h4.r[16], 0);
    }

    public static final void a(a1 a1Var, h4.r.c cVar, c1 c1Var) {
        a1Var.getClass();
        for (h4.r.c parent = cVar.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == a1Var.f81681b) {
                e0 e0VarK = a1Var.f81680a.K();
                c1Var.f81715v = e0VarK != null ? e0VarK.P.f81682c : null;
                a1Var.f81683d = c1Var;
                return;
            } else {
                if ((parent.getKindSet() & 2) != 0) {
                    return;
                }
                parent.updateCoordinator$ui(c1Var);
            }
        }
    }

    public static h4.r.c b(h4.r.b bVar, h4.r.c cVar) {
        h4.r.c cVar2;
        if (bVar instanceof x0) {
            cVar2 = ((x0) bVar).create();
            cVar2.setKindSet$ui(g1.g(cVar2));
        } else {
            cVar2 = new c(bVar);
        }
        if (cVar2.getIsAttached()) {
            e5.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        cVar2.setInsertedNodeAwaitingAttachForInvalidation$ui(true);
        h4.r.c child = cVar.getChild();
        if (child != null) {
            child.setParent$ui(cVar2);
            cVar2.setChild$ui(child);
        }
        cVar.setChild$ui(cVar2);
        cVar2.setParent$ui(cVar);
        return cVar2;
    }

    public static h4.r.c c(h4.r.c cVar) {
        if (cVar.getIsAttached()) {
            p1.p0<Object> p0Var = g1.f81824a;
            if (!cVar.getIsAttached()) {
                e5.a.b("autoInvalidateRemovedNode called on unattached node");
            }
            g1.b(cVar, -1, 2);
            cVar.runDetachLifecycle$ui();
            cVar.markAsDetached$ui();
        }
        h4.r.c child = cVar.getChild();
        h4.r.c parent = cVar.getParent();
        if (child != null) {
            child.setParent$ui(parent);
            cVar.setChild$ui(null);
        }
        if (parent != null) {
            parent.setChild$ui(child);
            cVar.setParent$ui(null);
        }
        parent.getClass();
        return parent;
    }

    public static void h(h4.r.b bVar, h4.r.b bVar2, h4.r.c cVar) {
        if ((bVar instanceof x0) && (bVar2 instanceof x0)) {
            cVar.getClass();
            ((x0) bVar2).update(cVar);
            if (cVar.getIsAttached()) {
                g1.d(cVar);
                return;
            } else {
                cVar.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
                return;
            }
        }
        if (!(cVar instanceof c)) {
            e5.a.b("Unknown Modifier.Node type");
            return;
        }
        c cVar2 = (c) cVar;
        if (cVar2.getIsAttached()) {
            cVar2.V1();
        }
        cVar2.f81698a = bVar2;
        cVar2.setKindSet$ui(g1.e(bVar2));
        if (cVar2.getIsAttached()) {
            cVar2.U1(false);
        }
        if (cVar.getIsAttached()) {
            g1.d(cVar);
        } else {
            cVar.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
        }
    }

    public final boolean d(int i14) {
        return (i14 & this.f81685f.getAggregateChildKindSet()) != 0;
    }

    public final void e() {
        for (h4.r.c child = this.f81685f; child != null; child = child.getChild()) {
            child.runAttachLifecycle$ui();
            if (child.getInsertedNodeAwaitingAttachForInvalidation()) {
                g1.a(child);
            }
            if (child.getUpdatedNodeAwaitingAttachForInvalidation()) {
                g1.d(child);
            }
            child.setInsertedNodeAwaitingAttachForInvalidation$ui(false);
            child.setUpdatedNodeAwaitingAttachForInvalidation$ui(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0140 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0109 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x011c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0126  */
    /* JADX WARN: Code duplicated, block: B:53:0x013e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0188  */
    /* JADX WARN: Code duplicated, block: B:73:0x018b  */
    /* JADX WARN: Code duplicated, block: B:75:0x018f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0192  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x019e
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void f(int r32, q3.c<h4.r.b> r33, q3.c<h4.r.b> r34, h4.r.c r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.a1.f(int, q3.c, q3.c, h4.r$c, boolean):void");
    }

    public final void g() {
        e0 e0Var;
        d0 d0Var;
        n1 n1Var;
        h4.r.c parent = this.f81684e.getParent();
        c1 c1Var = this.f81682c;
        while (true) {
            e0Var = this.f81680a;
            if (parent == null) {
                break;
            }
            c0 c0VarC = k.c(parent);
            if (c0VarC != null) {
                if (parent.getCoordinator() != null) {
                    c1 coordinator = parent.getCoordinator();
                    coordinator.getClass();
                    d0Var = (d0) coordinator;
                    c0 c0Var = d0Var.U0;
                    d0Var.o2(c0VarC);
                    if (c0Var != parent && (n1Var = d0Var.K0) != null) {
                        n1Var.invalidate();
                    }
                } else {
                    d0 d0Var2 = new d0(e0Var, c0VarC);
                    parent.updateCoordinator$ui(d0Var2);
                    d0Var = d0Var2;
                }
                c1Var.f81715v = d0Var;
                d0Var.f81714t = c1Var;
                c1Var = d0Var;
            } else {
                parent.updateCoordinator$ui(c1Var);
            }
            parent = parent.getParent();
        }
        e0 e0VarK = e0Var.K();
        c1Var.f81715v = e0VarK != null ? e0VarK.P.f81682c : null;
        this.f81683d = c1Var;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("[");
        h4.r.c child = this.f81685f;
        b2 b2Var = this.f81684e;
        if (child == b2Var) {
            sb3.append("]");
        } else {
            while (child != null && child != b2Var) {
                sb3.append(String.valueOf(child));
                if (child.getChild() == b2Var) {
                    sb3.append("]");
                    break;
                }
                sb3.append(",");
                child = child.getChild();
            }
        }
        return sb3.toString();
    }
}
