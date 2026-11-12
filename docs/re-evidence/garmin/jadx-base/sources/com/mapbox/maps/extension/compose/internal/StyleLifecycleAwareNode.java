package com.mapbox.maps.extension.compose.internal;

import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.StyleDataLoaded;
import com.mapbox.maps.extension.compose.style.internal.StyleAwareNode;
import e23.l;
import e23.p;
import ge1.b;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.d2;
import r53.l1;
import r53.q2;
import r53.s;
import r53.z1;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001H\u0017¢\u0006\u0004\b\f\u0010\u000bJ#\u0010\u000f\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\rH\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/mapbox/maps/extension/compose/internal/StyleLifecycleAwareNode;", "Lcom/mapbox/maps/extension/compose/internal/MapNode;", "Lcom/mapbox/maps/MapboxStyleManager;", "mapStyleManager", "Lo53/b0;", "coroutineScope", "<init>", "(Lcom/mapbox/maps/MapboxStyleManager;Lo53/b0;)V", "parent", "", "updateStyleManagerState", "(Lcom/mapbox/maps/extension/compose/internal/MapNode;)V", "onAttached", "Lkotlin/Function1;", "action", "dispatchWhenReady", "(Le23/l;)V", "Lcom/mapbox/maps/MapboxStyleManager;", "Lo53/b0;", "Lr53/z1;", "styleManagerFlow", "Lr53/z1;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class StyleLifecycleAwareNode extends MapNode {
    private final b0 coroutineScope;
    private final MapboxStyleManager mapStyleManager;
    private final z1<MapboxStyleManager> styleManagerFlow;

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.internal.StyleLifecycleAwareNode$dispatchWhenReady$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
    @e(c = "com.mapbox.maps.extension.compose.internal.StyleLifecycleAwareNode$dispatchWhenReady$1", f = "StyleLifecycleAwareNode.kt", l = {49}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p<b0, d<? super Unit>, Object> {
        final /* synthetic */ l<MapboxStyleManager, Unit> $action;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(l<? super MapboxStyleManager, Unit> lVar, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$action = lVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return StyleLifecycleAwareNode.this.new AnonymousClass1(this.$action, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                l1 l1Var = new l1(StyleLifecycleAwareNode.this.styleManagerFlow);
                this.label = 1;
                obj = s.x(l1Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            this.$action.invoke((MapboxStyleManager) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.internal.StyleLifecycleAwareNode$updateStyleManagerState$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
    @e(c = "com.mapbox.maps.extension.compose.internal.StyleLifecycleAwareNode$updateStyleManagerState$1", f = "StyleLifecycleAwareNode.kt", l = {32}, m = "invokeSuspend")
    public static final class C41831 extends i implements p<b0, d<? super Unit>, Object> {
        final /* synthetic */ MapNode $parent;
        int label;
        final /* synthetic */ StyleLifecycleAwareNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41831(MapNode mapNode, StyleLifecycleAwareNode styleLifecycleAwareNode, d<? super C41831> dVar) {
            super(2, dVar);
            this.$parent = mapNode;
            this.this$0 = styleLifecycleAwareNode;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C41831(this.$parent, this.this$0, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((C41831) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                d2<StyleDataLoaded> styleDataLoaded$extension_compose_release = ((StyleAwareNode) this.$parent).getMapStyleNode().getStyleDataLoaded$extension_compose_release();
                this.label = 1;
                obj = s.y(styleDataLoaded$extension_compose_release, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            if (((StyleDataLoaded) obj) != null) {
                StyleLifecycleAwareNode styleLifecycleAwareNode = this.this$0;
                styleLifecycleAwareNode.styleManagerFlow.setValue(styleLifecycleAwareNode.mapStyleManager);
            }
            return Unit.INSTANCE;
        }
    }

    public StyleLifecycleAwareNode(MapboxStyleManager mapboxStyleManager, b0 b0Var) {
        mapboxStyleManager.getClass();
        b0Var.getClass();
        this.mapStyleManager = mapboxStyleManager;
        this.coroutineScope = b0Var;
        this.styleManagerFlow = q2.a(null);
    }

    private final void updateStyleManagerState(MapNode parent) {
        if (parent instanceof StyleAwareNode) {
            b.T(this.coroutineScope, null, null, new C41831(parent, this, null), 3);
        } else {
            this.styleManagerFlow.setValue(this.mapStyleManager);
        }
    }

    public final void dispatchWhenReady(l<? super MapboxStyleManager, Unit> action) {
        action.getClass();
        MapboxStyleManager value = this.styleManagerFlow.getValue();
        if (value != null) {
            action.invoke(value);
        } else {
            b.T(this.coroutineScope, null, null, new AnonymousClass1(action, null), 3);
        }
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onAttached(MapNode parent) {
        parent.getClass();
        super.onAttached(parent);
        updateStyleManagerState(parent);
    }
}
