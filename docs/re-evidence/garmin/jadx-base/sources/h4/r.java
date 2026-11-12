package h4;

import androidx.compose.ui.ModifierNodeDetachedCancellationException;
import ch.qos.logback.core.joran.action.Action;
import h5.c1;
import h5.k1;
import o53.b0;
import o53.c0;
import o53.l1;
import o53.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public interface r {
    public static final a S = a.f81576a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh4/r$a;", "Lh4/r;", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f81576a = new a();

        private a() {
        }

        @Override // h4.r
        public final boolean all(e23.l<? super b, Boolean> lVar) {
            return true;
        }

        @Override // h4.r
        public final <R> R foldIn(R r14, e23.p<? super R, ? super b, ? extends R> pVar) {
            return r14;
        }

        @Override // h4.r
        public final r then(r rVar) {
            return rVar;
        }

        public final String toString() {
            return "Modifier";
        }
    }

    public interface b extends r {
        @Override // h4.r
        default boolean all(e23.l<? super b, Boolean> lVar) {
            return lVar.invoke(this).booleanValue();
        }

        @Override // h4.r
        default <R> R foldIn(R r14, e23.p<? super R, ? super b, ? extends R> pVar) {
            return pVar.invoke(r14, this);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b!\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000f\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0080\b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0003J\u001b\u0010\u001f\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\"\u0010#R*\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u00008\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010\u0003\u001a\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\"\u0010/\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00105\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u00102\"\u0004\b7\u00104R$\u00108\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010'\u001a\u0004\b9\u0010)\"\u0004\b:\u0010#R$\u0010;\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010'\u001a\u0004\b<\u0010)\"\u0004\b=\u0010#R$\u0010?\u001a\u0004\u0018\u00010>8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010%\u001a\u0004\u0018\u00010\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bF\u0010GR\"\u0010H\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010N\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bN\u0010I\u001a\u0004\bO\u0010K\"\u0004\bP\u0010MR\u0016\u0010Q\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010IR\u0016\u0010R\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010IR*\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010 R$\u0010X\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bX\u0010I\u001a\u0004\bX\u0010KR\u0011\u0010[\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u001a\u0010^\u001a\u00020\f8VX\u0096\u0004¢\u0006\f\u0012\u0004\b]\u0010\u0003\u001a\u0004\b\\\u0010K¨\u0006_"}, d2 = {"Lh4/r$c;", "Lh5/j;", "<init>", "()V", "Lh5/c1;", "coordinator", "", "updateCoordinator$ui", "(Lh5/c1;)V", "updateCoordinator", "", "kind", "", "isKind-H91voCI$ui", "(I)Z", "isKind", "markAsAttached$ui", "markAsAttached", "runAttachLifecycle$ui", "runAttachLifecycle", "runDetachLifecycle$ui", "runDetachLifecycle", "markAsDetached$ui", "markAsDetached", "reset$ui", "reset", "onAttach", "onDetach", "onReset", "Lkotlin/Function0;", "effect", "sideEffect", "(Le23/a;)V", "owner", "setAsDelegateTo$ui", "(Lh4/r$c;)V", "setAsDelegateTo", "value", "node", "Lh4/r$c;", "getNode", "()Lh4/r$c;", "getNode$annotations", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Lo53/b0;", "", "kindSet", "I", "getKindSet$ui", "()I", "setKindSet$ui", "(I)V", "aggregateChildKindSet", "getAggregateChildKindSet$ui", "setAggregateChildKindSet$ui", "parent", "getParent$ui", "setParent$ui", "child", "getChild$ui", "setChild$ui", "Lh5/k1;", "ownerScope", "Lh5/k1;", "getOwnerScope$ui", "()Lh5/k1;", "setOwnerScope$ui", "(Lh5/k1;)V", "Lh5/c1;", "getCoordinator$ui", "()Lh5/c1;", "insertedNodeAwaitingAttachForInvalidation", "Z", "getInsertedNodeAwaitingAttachForInvalidation$ui", "()Z", "setInsertedNodeAwaitingAttachForInvalidation$ui", "(Z)V", "updatedNodeAwaitingAttachForInvalidation", "getUpdatedNodeAwaitingAttachForInvalidation$ui", "setUpdatedNodeAwaitingAttachForInvalidation$ui", "onAttachRunExpected", "onDetachRunExpected", "detachedListener", "Le23/a;", "getDetachedListener$ui", "()Le23/a;", "setDetachedListener$ui", "isAttached", "getCoroutineScope", "()Lo53/b0;", "coroutineScope", "getShouldAutoInvalidate", "getShouldAutoInvalidate$annotations", "shouldAutoInvalidate", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c implements h5.j {
        public static final int $stable = 8;
        private c child;
        private c1 coordinator;
        private e23.a<Unit> detachedListener;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private boolean onAttachRunExpected;
        private boolean onDetachRunExpected;
        private k1 ownerScope;
        private c parent;
        private b0 scope;
        private boolean updatedNodeAwaitingAttachForInvalidation;
        private c node = this;
        private int aggregateChildKindSet = -1;

        public static /* synthetic */ void getNode$annotations() {
        }

        public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
        }

        public boolean X0() {
            return getIsAttached();
        }

        /* JADX INFO: renamed from: getAggregateChildKindSet$ui, reason: from getter */
        public final int getAggregateChildKindSet() {
            return this.aggregateChildKindSet;
        }

        /* JADX INFO: renamed from: getChild$ui, reason: from getter */
        public final c getChild() {
            return this.child;
        }

        /* JADX INFO: renamed from: getCoordinator$ui, reason: from getter */
        public final c1 getCoordinator() {
            return this.coordinator;
        }

        public final b0 getCoroutineScope() {
            b0 b0Var = this.scope;
            if (b0Var != null) {
                return b0Var;
            }
            u53.d dVarA = c0.a(h5.k.h(this).getCoroutineContext().plus(new m1((l1) h5.k.h(this).getCoroutineContext().get(l1.f129368i0))));
            this.scope = dVarA;
            return dVarA;
        }

        public final e23.a<Unit> getDetachedListener$ui() {
            return this.detachedListener;
        }

        /* JADX INFO: renamed from: getInsertedNodeAwaitingAttachForInvalidation$ui, reason: from getter */
        public final boolean getInsertedNodeAwaitingAttachForInvalidation() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        /* JADX INFO: renamed from: getKindSet$ui, reason: from getter */
        public final int getKindSet() {
            return this.kindSet;
        }

        @Override // h5.j
        public final c getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: getOwnerScope$ui, reason: from getter */
        public final k1 getOwnerScope() {
            return this.ownerScope;
        }

        /* JADX INFO: renamed from: getParent$ui, reason: from getter */
        public final c getParent() {
            return this.parent;
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        /* JADX INFO: renamed from: getUpdatedNodeAwaitingAttachForInvalidation$ui, reason: from getter */
        public final boolean getUpdatedNodeAwaitingAttachForInvalidation() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        /* JADX INFO: renamed from: isAttached, reason: from getter */
        public final boolean getIsAttached() {
            return this.isAttached;
        }

        /* JADX INFO: renamed from: isKind-H91voCI$ui, reason: not valid java name */
        public final boolean m321isKindH91voCI$ui(int kind) {
            return (kind & getKindSet()) != 0;
        }

        public void markAsAttached$ui() {
            if (this.isAttached) {
                e5.a.b("node attached multiple times");
            }
            if (!(this.coordinator != null)) {
                e5.a.b("attach invoked on a node without a coordinator");
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void markAsDetached$ui() {
            if (!this.isAttached) {
                e5.a.b("Cannot detach a node that is not attached");
            }
            if (this.onAttachRunExpected) {
                e5.a.b("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.onDetachRunExpected) {
                e5.a.b("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.isAttached = false;
            b0 b0Var = this.scope;
            if (b0Var != null) {
                c0.c(b0Var, new ModifierNodeDetachedCancellationException());
                this.scope = null;
            }
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }

        public void reset$ui() {
            if (!this.isAttached) {
                e5.a.b("reset() called on an unattached node");
            }
            onReset();
        }

        public void runAttachLifecycle$ui() {
            if (!this.isAttached) {
                e5.a.b("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.onAttachRunExpected) {
                e5.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.onAttachRunExpected = false;
            onAttach();
            this.onDetachRunExpected = true;
        }

        public void runDetachLifecycle$ui() {
            if (!this.isAttached) {
                e5.a.b("node detached multiple times");
            }
            if (this.coordinator == null) {
                e5.a.b("detach invoked on a node without a coordinator");
            }
            if (!this.onDetachRunExpected) {
                e5.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.onDetachRunExpected = false;
            e23.a<Unit> aVar = this.detachedListener;
            if (aVar != null) {
                aVar.invoke();
            }
            onDetach();
        }

        public final void setAggregateChildKindSet$ui(int i14) {
            this.aggregateChildKindSet = i14;
        }

        public void setAsDelegateTo$ui(c owner) {
            this.node = owner;
        }

        public final void setChild$ui(c cVar) {
            this.child = cVar;
        }

        public final void setDetachedListener$ui(e23.a<Unit> aVar) {
            this.detachedListener = aVar;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui(boolean z14) {
            this.insertedNodeAwaitingAttachForInvalidation = z14;
        }

        public final void setKindSet$ui(int i14) {
            this.kindSet = i14;
        }

        public final void setOwnerScope$ui(k1 k1Var) {
            this.ownerScope = k1Var;
        }

        public final void setParent$ui(c cVar) {
            this.parent = cVar;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui(boolean z14) {
            this.updatedNodeAwaitingAttachForInvalidation = z14;
        }

        public final void sideEffect(e23.a<Unit> effect) {
            h5.k.h(this).C(effect);
        }

        public void updateCoordinator$ui(c1 coordinator) {
            this.coordinator = coordinator;
        }
    }

    boolean all(e23.l<? super b, Boolean> lVar);

    <R> R foldIn(R r14, e23.p<? super R, ? super b, ? extends R> pVar);

    default r then(r rVar) {
        return rVar == S ? this : new h(this, rVar);
    }
}
