package com.mapbox.maps.extension.compose.style.internal;

import androidx.room.a0;
import ch.qos.logback.classic.net.SyslogAppender;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.mapbox.maps.ColorTheme;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.mapbox.maps.StyleDataLoaded;
import com.mapbox.maps.StyleDataLoadedType;
import com.mapbox.maps.TransitionOptions;
import com.mapbox.maps.coroutine.MapboxMapExtKt;
import com.mapbox.maps.extension.compose.internal.MapNode;
import com.mapbox.maps.extension.compose.style.atmosphere.generated.AtmosphereState;
import com.mapbox.maps.extension.compose.style.precipitations.generated.RainState;
import com.mapbox.maps.extension.compose.style.precipitations.generated.SnowState;
import com.mapbox.maps.extension.compose.style.projection.generated.Projection;
import com.mapbox.maps.extension.compose.style.terrain.generated.TerrainState;
import ge1.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.d2;
import r53.i;
import r53.j;
import r53.k2;
import r53.l2;
import r53.m1;
import r53.s;
import u53.d;
import u53.o;
import v13.e;
import vb.h;
import x53.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 `2\u00020\u0001:\u0001`B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010.\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-J!\u00105\u001a\u00020\u00122\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u00020\u0002H\u0016¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u00107R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010=R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\u001fR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010\"R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010%R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010(R\u0017\u0010O\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020T0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR \u0010X\u001a\b\u0012\u0004\u0012\u00020T0W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R \u0010\\\u001a\b\u0012\u0004\u0012\u00020T0W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010Y\u001a\u0004\b]\u0010[R \u0010^\u001a\b\u0012\u0004\u0012\u00020T0W8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010Y\u001a\u0004\b_\u0010[¨\u0006a"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/internal/MapStyleNode;", "Lcom/mapbox/maps/extension/compose/internal/MapNode;", "", TtmlNode.TAG_STYLE, "Lcom/mapbox/maps/MapboxMap;", "mapboxMap", "Lcom/mapbox/maps/extension/compose/style/projection/generated/Projection;", "projection", "Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState;", "atmosphereState", "Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;", "rainState", "Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState;", "snowState", "Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;", "terrainState", "<init>", "(Ljava/lang/String;Lcom/mapbox/maps/MapboxMap;Lcom/mapbox/maps/extension/compose/style/projection/generated/Projection;Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState;Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState;Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;)V", "", "updateStyle", "(Ljava/lang/String;)V", "parent", "onAttached", "(Lcom/mapbox/maps/extension/compose/internal/MapNode;)V", "onRemoved", "onClear", "()V", "updateProjection$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/projection/generated/Projection;)V", "updateProjection", "updateAtmosphere$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState;)V", "updateAtmosphere", "updateRain$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;)V", "updateRain", "updateSnow$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState;)V", "updateSnow", "updateTerrain$extension_compose_release", "(Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;)V", "updateTerrain", "Lcom/mapbox/maps/TransitionOptions;", "transition", "updateStyleTransition$extension_compose_release", "(Lcom/mapbox/maps/TransitionOptions;)V", "updateStyleTransition", "Lcom/mapbox/maps/ColorTheme;", "colorTheme", "", "isStyleDefault", "updateStyleColorTheme$extension_compose_release", "(Lcom/mapbox/maps/ColorTheme;Z)V", "updateStyleColorTheme", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getStyle", "Lcom/mapbox/maps/MapboxMap;", "getMapboxMap", "()Lcom/mapbox/maps/MapboxMap;", "Lcom/mapbox/maps/extension/compose/style/projection/generated/Projection;", "Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState;", "getAtmosphereState", "()Lcom/mapbox/maps/extension/compose/style/atmosphere/generated/AtmosphereState;", "setAtmosphereState", "Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;", "getRainState", "()Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;", "setRainState", "Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState;", "getSnowState", "()Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState;", "setSnowState", "Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;", "getTerrainState", "()Lcom/mapbox/maps/extension/compose/style/terrain/generated/TerrainState;", "setTerrainState", "Lo53/b0;", "coroutineScope", "Lo53/b0;", "getCoroutineScope", "()Lo53/b0;", "Lr53/i;", "Lcom/mapbox/maps/StyleDataLoaded;", "styleDataLoadedFlow", "Lr53/i;", "Lr53/d2;", "styleSourcesLoaded", "Lr53/d2;", "getStyleSourcesLoaded$extension_compose_release", "()Lr53/d2;", "styleDataLoaded", "getStyleDataLoaded$extension_compose_release", "styleSpritesLoaded", "getStyleSpritesLoaded$extension_compose_release", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapStyleNode extends MapNode {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "MapStyleNode";
    private AtmosphereState atmosphereState;
    private final b0 coroutineScope;
    private final MapboxMap mapboxMap;
    private final Projection projection;
    private RainState rainState;
    private SnowState snowState;
    private final String style;
    private final d2<StyleDataLoaded> styleDataLoaded;
    private final i<StyleDataLoaded> styleDataLoadedFlow;
    private final d2<StyleDataLoaded> styleSourcesLoaded;
    private final d2<StyleDataLoaded> styleSpritesLoaded;
    private TerrainState terrainState;

    public MapStyleNode(String str, MapboxMap mapboxMap, Projection projection, AtmosphereState atmosphereState, RainState rainState, SnowState snowState, TerrainState terrainState) {
        str.getClass();
        mapboxMap.getClass();
        projection.getClass();
        atmosphereState.getClass();
        rainState.getClass();
        snowState.getClass();
        terrainState.getClass();
        this.style = str;
        this.mapboxMap = mapboxMap;
        this.projection = projection;
        this.atmosphereState = atmosphereState;
        this.rainState = rainState;
        this.snowState = snowState;
        this.terrainState = terrainState;
        c cVar = s0.f129406a;
        d dVarE = zl.a.e("MapStyleNodeScope", o.f168762a.H().plus(b.h()));
        this.coroutineScope = dVarE;
        final i<StyleDataLoaded> styleDataLoadedEvents = MapboxMapExtKt.getStyleDataLoadedEvents(mapboxMap);
        this.styleDataLoadedFlow = styleDataLoadedEvents;
        m1 m1Var = new m1(new i<StyleDataLoaded>() { // from class: com.mapbox.maps.extension.compose.style.internal.MapStyleNode$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.internal.MapStyleNode$special$$inlined$filter$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.internal.MapStyleNode$special$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @e(c = "com.mapbox.maps.extension.compose.style.internal.MapStyleNode$special$$inlined$filter$1$2", f = "MapStyleNode.kt", l = {223}, m = "emit")
                public static final class AnonymousClass1 extends v13.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i14 = anonymousClass1.label;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i14 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(dVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(dVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = anonymousClass1.label;
                    if (i15 == 0) {
                        r.b(obj2);
                        j jVar = this.$this_unsafeFlow;
                        if (((StyleDataLoaded) obj).getType() == StyleDataLoadedType.SOURCES) {
                            anonymousClass1.label = 1;
                            if (jVar.emit(obj, anonymousClass1) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i15 != 1) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // r53.i
            public Object collect(j<? super StyleDataLoaded> jVar, t13.d dVar) {
                Object objCollect = styleDataLoadedEvents.collect(new AnonymousClass2(jVar), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }, new MapStyleNode$styleSourcesLoaded$2(this, null));
        k2.f150703a.getClass();
        l2 l2Var = k2.a.f150705b;
        this.styleSourcesLoaded = s.G(m1Var, dVarE, l2Var);
        this.styleDataLoaded = s.G(new m1(new i<StyleDataLoaded>() { // from class: com.mapbox.maps.extension.compose.style.internal.MapStyleNode$special$$inlined$filter$2

            /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.internal.MapStyleNode$special$$inlined$filter$2$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.internal.MapStyleNode$special$$inlined$filter$2$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @e(c = "com.mapbox.maps.extension.compose.style.internal.MapStyleNode$special$$inlined$filter$2$2", f = "MapStyleNode.kt", l = {223}, m = "emit")
                public static final class AnonymousClass1 extends v13.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i14 = anonymousClass1.label;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i14 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(dVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(dVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = anonymousClass1.label;
                    if (i15 == 0) {
                        r.b(obj2);
                        j jVar = this.$this_unsafeFlow;
                        if (((StyleDataLoaded) obj).getType() == StyleDataLoadedType.STYLE) {
                            anonymousClass1.label = 1;
                            if (jVar.emit(obj, anonymousClass1) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i15 != 1) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // r53.i
            public Object collect(j<? super StyleDataLoaded> jVar, t13.d dVar) {
                Object objCollect = styleDataLoadedEvents.collect(new AnonymousClass2(jVar), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }, new MapStyleNode$styleDataLoaded$2(this, null)), dVarE, l2Var);
        this.styleSpritesLoaded = s.G(new m1(new i<StyleDataLoaded>() { // from class: com.mapbox.maps.extension.compose.style.internal.MapStyleNode$special$$inlined$filter$3

            /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.internal.MapStyleNode$special$$inlined$filter$3$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            public static final class AnonymousClass2<T> implements j {
                final /* synthetic */ j $this_unsafeFlow;

                /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.internal.MapStyleNode$special$$inlined$filter$3$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @e(c = "com.mapbox.maps.extension.compose.style.internal.MapStyleNode$special$$inlined$filter$3$2", f = "MapStyleNode.kt", l = {223}, m = "emit")
                public static final class AnonymousClass1 extends v13.c {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(t13.d dVar) {
                        super(dVar);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // r53.j
                public final Object emit(Object obj, t13.d dVar) {
                    AnonymousClass1 anonymousClass1;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i14 = anonymousClass1.label;
                        if ((i14 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i14 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(dVar);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(dVar);
                    }
                    Object obj2 = anonymousClass1.result;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i15 = anonymousClass1.label;
                    if (i15 == 0) {
                        r.b(obj2);
                        j jVar = this.$this_unsafeFlow;
                        if (((StyleDataLoaded) obj).getType() == StyleDataLoadedType.SPRITE) {
                            anonymousClass1.label = 1;
                            if (jVar.emit(obj, anonymousClass1) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i15 != 1) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // r53.i
            public Object collect(j<? super StyleDataLoaded> jVar, t13.d dVar) {
                Object objCollect = styleDataLoadedEvents.collect(new AnonymousClass2(jVar), dVar);
                return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
            }
        }, new MapStyleNode$styleSpritesLoaded$2(this, null)), dVarE, l2Var);
    }

    private final void updateStyle(final String style) {
        MapboxLogger.logD(TAG, "loadStyle " + style + " started");
        this.mapboxMap.loadStyle(style, new Style.OnStyleLoaded() { // from class: com.mapbox.maps.extension.compose.style.internal.MapStyleNode.updateStyle.1
            @Override // com.mapbox.maps.Style.OnStyleLoaded
            public final void onStyleLoaded(Style style2) {
                style2.getClass();
                MapboxLogger.logD(MapStyleNode.TAG, "loadStyle " + style + " finished");
            }
        });
    }

    public final AtmosphereState getAtmosphereState() {
        return this.atmosphereState;
    }

    public final b0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final MapboxMap getMapboxMap() {
        return this.mapboxMap;
    }

    public final RainState getRainState() {
        return this.rainState;
    }

    public final SnowState getSnowState() {
        return this.snowState;
    }

    public final String getStyle() {
        return this.style;
    }

    public final d2<StyleDataLoaded> getStyleDataLoaded$extension_compose_release() {
        return this.styleDataLoaded;
    }

    public final d2<StyleDataLoaded> getStyleSourcesLoaded$extension_compose_release() {
        return this.styleSourcesLoaded;
    }

    public final d2<StyleDataLoaded> getStyleSpritesLoaded$extension_compose_release() {
        return this.styleSpritesLoaded;
    }

    public final TerrainState getTerrainState() {
        return this.terrainState;
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onAttached(MapNode parent) {
        parent.getClass();
        MapboxLogger.logD(TAG, "onAttached: parent=" + parent);
        updateStyle(this.style);
        updateProjection$extension_compose_release(this.projection);
        updateAtmosphere$extension_compose_release(this.atmosphereState);
        updateRain$extension_compose_release(this.rainState);
        updateSnow$extension_compose_release(this.snowState);
        updateTerrain$extension_compose_release(this.terrainState);
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onClear() {
        super.onClear();
        this.atmosphereState.getApplier().detach$extension_compose_release();
        this.rainState.getApplier().detach$extension_compose_release();
        this.snowState.getApplier().detach$extension_compose_release();
        this.terrainState.getApplier().detach$extension_compose_release();
        Iterator<T> it = getChildren().iterator();
        while (it.hasNext()) {
            ((MapNode) it.next()).onClear();
        }
    }

    @Override // com.mapbox.maps.extension.compose.internal.MapNode
    public void onRemoved(MapNode parent) {
        parent.getClass();
        MapboxLogger.logD(TAG, "onRemoved: parent=" + parent);
        c0.c(this.coroutineScope, null);
        List<MapNode> children = parent.getChildren();
        ArrayList arrayList = new ArrayList();
        for (Object obj : children) {
            if (obj instanceof MapStyleNode) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 1) {
            updateStyle("{}");
        } else {
            MapboxLogger.logW(TAG, "Multiple style node detected in the tree:");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MapboxLogger.logW(TAG, SyslogAppender.DEFAULT_STACKTRACE_PATTERN + ((MapStyleNode) it.next()).style);
            }
        }
        Iterator<T> it3 = getChildren().iterator();
        while (it3.hasNext()) {
            ((MapNode) it3.next()).onRemoved(this);
        }
    }

    public final void setAtmosphereState(AtmosphereState atmosphereState) {
        atmosphereState.getClass();
        this.atmosphereState = atmosphereState;
    }

    public final void setRainState(RainState rainState) {
        rainState.getClass();
        this.rainState = rainState;
    }

    public final void setSnowState(SnowState snowState) {
        snowState.getClass();
        this.snowState = snowState;
    }

    public final void setTerrainState(TerrainState terrainState) {
        terrainState.getClass();
        this.terrainState = terrainState;
    }

    public String toString() {
        return a0.m(new StringBuilder("MapStyleNode(style="), this.style, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public final void updateAtmosphere$extension_compose_release(AtmosphereState atmosphereState) {
        atmosphereState.getClass();
        this.atmosphereState.getApplier().detach$extension_compose_release();
        this.atmosphereState = atmosphereState;
        b.T(this.coroutineScope, null, null, new MapStyleNode$updateAtmosphere$1(this, atmosphereState, null), 3);
    }

    public final void updateProjection$extension_compose_release(Projection projection) {
        projection.getClass();
        if (projection.getNotInitial$extension_compose_release()) {
            b.T(this.coroutineScope, null, null, new MapStyleNode$updateProjection$1(this, projection, null), 3);
        }
    }

    public final void updateRain$extension_compose_release(RainState rainState) {
        rainState.getClass();
        this.rainState.getApplier().detach$extension_compose_release();
        this.rainState = rainState;
        b.T(this.coroutineScope, null, null, new MapStyleNode$updateRain$1(this, rainState, null), 3);
    }

    public final void updateSnow$extension_compose_release(SnowState snowState) {
        snowState.getClass();
        this.snowState.getApplier().detach$extension_compose_release();
        this.snowState = snowState;
        b.T(this.coroutineScope, null, null, new MapStyleNode$updateSnow$1(this, snowState, null), 3);
    }

    public final void updateStyleColorTheme$extension_compose_release(ColorTheme colorTheme, boolean isStyleDefault) {
        b.T(this.coroutineScope, null, null, new MapStyleNode$updateStyleColorTheme$1(this, isStyleDefault, colorTheme, null), 3);
    }

    public final void updateStyleTransition$extension_compose_release(TransitionOptions transition) {
        transition.getClass();
        b.T(this.coroutineScope, null, null, new MapStyleNode$updateStyleTransition$1(this, transition, null), 3);
    }

    public final void updateTerrain$extension_compose_release(TerrainState terrainState) {
        terrainState.getClass();
        TerrainState terrainState2 = this.terrainState;
        this.terrainState = terrainState;
        terrainState2.getApplier().detach$extension_compose_release();
        b.T(this.coroutineScope, null, null, new MapStyleNode$updateTerrain$1(this, terrainState2, terrainState, null), 3);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/mapbox/maps/extension/compose/style/internal/MapStyleNode$Companion;", "", "()V", "TAG", "", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private Companion() {
        }
    }
}
