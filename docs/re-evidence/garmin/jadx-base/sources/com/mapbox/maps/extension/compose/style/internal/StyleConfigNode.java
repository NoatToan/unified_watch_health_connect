package com.mapbox.maps.extension.compose.style.internal;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.StyleDataLoaded;
import com.mapbox.maps.extension.compose.internal.MapNode;
import e23.l;
import e23.p;
import ge1.b;
import o13.r;
import o2.c;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import r53.d2;
import r53.j;
import r53.l1;
import r53.q2;
import r53.s;
import r53.z1;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/internal/StyleConfigNode;", "Lcom/mapbox/maps/extension/compose/internal/MapNode;", "", "importId", "configName", "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "Lo53/b0;", "coroutineScope", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/maps/MapboxMap;Lo53/b0;)V", "Lkotlin/Function1;", "Lcom/mapbox/maps/MapboxStyleManager;", "", "action", "dispatchWhenStyleDataLoaded", "(Le23/l;)V", "parent", "onAttached", "(Lcom/mapbox/maps/extension/compose/internal/MapNode;)V", "Lcom/mapbox/bindgen/Value;", "value", "setProperty", "(Lcom/mapbox/bindgen/Value;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Lcom/mapbox/maps/MapboxMap;", "Lo53/b0;", "Lr53/z1;", "styleManagerFlow", "Lr53/z1;", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StyleConfigNode extends MapNode {
    private static final String TAG = "StyleConfigNode";
    private final String configName;
    private final b0 coroutineScope;
    private final String importId;
    private final MapboxMap mapboxMap;
    private final z1<MapboxStyleManager> styleManagerFlow;

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.internal.StyleConfigNode$dispatchWhenStyleDataLoaded$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
    @e(c = "com.mapbox.maps.extension.compose.style.internal.StyleConfigNode$dispatchWhenStyleDataLoaded$1", f = "StyleConfig.kt", l = {40}, m = "invokeSuspend")
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
            return StyleConfigNode.this.new AnonymousClass1(this.$action, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                l1 l1Var = new l1(StyleConfigNode.this.styleManagerFlow);
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

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.internal.StyleConfigNode$onAttached$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
    @e(c = "com.mapbox.maps.extension.compose.style.internal.StyleConfigNode$onAttached$1", f = "StyleConfig.kt", l = {32}, m = "invokeSuspend")
    public static final class C41971 extends i implements p<b0, d<? super Unit>, Object> {
        final /* synthetic */ MapStyleNode $mapStyleNode;
        int label;
        final /* synthetic */ StyleConfigNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41971(MapStyleNode mapStyleNode, StyleConfigNode styleConfigNode, d<? super C41971> dVar) {
            super(2, dVar);
            this.$mapStyleNode = mapStyleNode;
            this.this$0 = styleConfigNode;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C41971(this.$mapStyleNode, this.this$0, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((C41971) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                d2<StyleDataLoaded> styleDataLoaded$extension_compose_release = this.$mapStyleNode.getStyleDataLoaded$extension_compose_release();
                final StyleConfigNode styleConfigNode = this.this$0;
                j<StyleDataLoaded> jVar = new j<StyleDataLoaded>() { // from class: com.mapbox.maps.extension.compose.style.internal.StyleConfigNode.onAttached.1.1
                    /* JADX INFO: renamed from: emit, reason: avoid collision after fix types in other method */
                    public final Object emit2(StyleDataLoaded styleDataLoaded, d<? super Unit> dVar) {
                        styleConfigNode.styleManagerFlow.setValue(styleConfigNode.mapboxMap);
                        return Unit.INSTANCE;
                    }

                    @Override // r53.j
                    public /* bridge */ /* synthetic */ Object emit(StyleDataLoaded styleDataLoaded, d dVar) {
                        return emit2(styleDataLoaded, (d<? super Unit>) dVar);
                    }
                };
                this.label = 1;
                if (styleDataLoaded$extension_compose_release.collect(jVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            c.f();
            return null;
        }
    }

    public StyleConfigNode(String str, String str2, MapboxMap mapboxMap, b0 b0Var) {
        str.getClass();
        str2.getClass();
        mapboxMap.getClass();
        b0Var.getClass();
        this.importId = str;
        this.configName = str2;
        this.mapboxMap = mapboxMap;
        this.coroutineScope = b0Var;
        this.styleManagerFlow = q2.a(null);
    }

    private final void dispatchWhenStyleDataLoaded(l<? super MapboxStyleManager, Unit> action) {
        b.T(this.coroutineScope, null, null, new AnonymousClass1(action, null), 3);
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onAttached(MapNode parent) {
        parent.getClass();
        b.T(this.coroutineScope, null, null, new C41971((MapStyleNode) parent, this, null), 3);
    }

    public final void setProperty(Value value) {
        value.getClass();
        dispatchWhenStyleDataLoaded(new C41981(value, this));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("StyleConfigNode(importId=");
        sb3.append(this.importId);
        sb3.append(", configName=");
        return a0.m(sb3, this.configName, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.internal.StyleConfigNode$setProperty$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/mapbox/maps/MapboxStyleManager;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C41981 extends w implements l<MapboxStyleManager, Unit> {
        final /* synthetic */ Value $value;
        final /* synthetic */ StyleConfigNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41981(Value value, StyleConfigNode styleConfigNode) {
            super(1);
            this.$value = value;
            this.this$0 = styleConfigNode;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MapboxStyleManager mapboxStyleManager) {
            mapboxStyleManager.getClass();
            MapboxLogger.logD(StyleConfigNode.TAG, "Setting style import config property " + this.$value + " for " + this.this$0);
            this.this$0.mapboxMap.setStyleImportConfigProperty(this.this$0.importId, this.this$0.configName, this.$value);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(MapboxStyleManager mapboxStyleManager) {
            invoke2(mapboxStyleManager);
            return Unit.INSTANCE;
        }
    }
}
