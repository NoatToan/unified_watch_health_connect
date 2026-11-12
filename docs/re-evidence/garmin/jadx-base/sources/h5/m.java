package h5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh5/m;", "Lh4/r$c;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class m extends h4.r.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81887a = g1.f(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h4.r.c f81888b;

    public final void U1(j jVar) {
        h4.r.c node = jVar.getNode();
        if (node != jVar) {
            h4.r.c cVar = jVar instanceof h4.r.c ? (h4.r.c) jVar : null;
            h4.r.c parent = cVar != null ? cVar.getParent() : null;
            if (node == getNode() && p005kotlin.jvm.internal.s.g(parent, this)) {
                return;
            }
            vb.h.z("Cannot delegate to an already delegated node");
            return;
        }
        if (node.getIsAttached()) {
            e5.a.b("Cannot delegate to an already attached node");
        }
        node.setAsDelegateTo$ui(getNode());
        int kindSet = getKindSet();
        int iG = g1.g(node);
        node.setKindSet$ui(iG);
        int kindSet2 = getKindSet();
        int i14 = iG & 2;
        if (i14 != 0 && (kindSet2 & 2) != 0 && !(this instanceof c0)) {
            e5.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + node);
        }
        node.setChild$ui(this.f81888b);
        this.f81888b = node;
        node.setParent$ui(this);
        W1(iG | getKindSet(), false);
        if (getIsAttached()) {
            if (i14 == 0 || (kindSet & 2) != 0) {
                updateCoordinator$ui(getCoordinator());
            } else {
                a1 a1Var = k.g(this).P;
                getNode().updateCoordinator$ui(null);
                a1Var.g();
            }
            node.markAsAttached$ui();
            node.runAttachLifecycle$ui();
            g1.a(node);
        }
    }

    public final void V1(j jVar) {
        h4.r.c cVar = null;
        for (h4.r.c child = this.f81888b; child != null; child = child.getChild()) {
            if (child == jVar) {
                if (child.getIsAttached()) {
                    p1.p0<Object> p0Var = g1.f81824a;
                    if (!child.getIsAttached()) {
                        e5.a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    g1.b(child, -1, 2);
                    child.runDetachLifecycle$ui();
                    child.markAsDetached$ui();
                }
                child.setAsDelegateTo$ui(child);
                child.setAggregateChildKindSet$ui(0);
                if (cVar == null) {
                    this.f81888b = child.getChild();
                } else {
                    cVar.setChild$ui(child.getChild());
                }
                child.setChild$ui(null);
                child.setParent$ui(null);
                int kindSet = getKindSet();
                int iG = g1.g(this);
                W1(iG, true);
                if (getIsAttached() && (kindSet & 2) != 0 && (iG & 2) == 0) {
                    a1 a1Var = k.g(this).P;
                    getNode().updateCoordinator$ui(null);
                    a1Var.g();
                    return;
                }
                return;
            }
            cVar = child;
        }
        ds.e0.t(jVar, "Could not find delegate: ");
    }

    public final void W1(int i14, boolean z14) {
        h4.r.c child;
        int kindSet = getKindSet();
        setKindSet$ui(i14);
        if (kindSet != i14) {
            if (getNode() == this) {
                setAggregateChildKindSet$ui(i14);
            }
            if (getIsAttached()) {
                h4.r.c node = getNode();
                h4.r.c parent = this;
                while (parent != null) {
                    i14 |= parent.getKindSet();
                    parent.setKindSet$ui(i14);
                    if (parent == node) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (z14 && parent == node) {
                    i14 = g1.g(node);
                    node.setKindSet$ui(i14);
                }
                int aggregateChildKindSet = i14 | ((parent == null || (child = parent.getChild()) == null) ? 0 : child.getAggregateChildKindSet());
                while (parent != null) {
                    aggregateChildKindSet |= parent.getKindSet();
                    parent.setAggregateChildKindSet$ui(aggregateChildKindSet);
                    parent = parent.getParent();
                }
            }
        }
    }

    @Override // h4.r.c
    public final void markAsAttached$ui() {
        super.markAsAttached$ui();
        for (h4.r.c child = this.f81888b; child != null; child = child.getChild()) {
            child.updateCoordinator$ui(getCoordinator());
            if (!child.getIsAttached()) {
                child.markAsAttached$ui();
            }
        }
    }

    @Override // h4.r.c
    public final void markAsDetached$ui() {
        for (h4.r.c child = this.f81888b; child != null; child = child.getChild()) {
            child.markAsDetached$ui();
        }
        super.markAsDetached$ui();
    }

    @Override // h4.r.c
    public final void reset$ui() {
        super.reset$ui();
        for (h4.r.c child = this.f81888b; child != null; child = child.getChild()) {
            child.reset$ui();
        }
    }

    @Override // h4.r.c
    public final void runAttachLifecycle$ui() {
        for (h4.r.c child = this.f81888b; child != null; child = child.getChild()) {
            child.runAttachLifecycle$ui();
        }
        super.runAttachLifecycle$ui();
    }

    @Override // h4.r.c
    public final void runDetachLifecycle$ui() {
        super.runDetachLifecycle$ui();
        for (h4.r.c child = this.f81888b; child != null; child = child.getChild()) {
            child.runDetachLifecycle$ui();
        }
    }

    @Override // h4.r.c
    public final void setAsDelegateTo$ui(h4.r.c cVar) {
        super.setAsDelegateTo$ui(cVar);
        for (h4.r.c child = this.f81888b; child != null; child = child.getChild()) {
            child.setAsDelegateTo$ui(cVar);
        }
    }

    @Override // h4.r.c
    public final void updateCoordinator$ui(c1 c1Var) {
        super.updateCoordinator$ui(c1Var);
        for (h4.r.c child = this.f81888b; child != null; child = child.getChild()) {
            child.updateCoordinator$ui(c1Var);
        }
    }
}
