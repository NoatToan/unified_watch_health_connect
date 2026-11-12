package com.mapbox.maps.extension.compose;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.u;
import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.internal.ViewUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.maps.MapView;
import com.mapbox.maps.extension.compose.animation.viewport.MapViewportState;
import com.mapbox.maps.extension.compose.animation.viewport.MapViewportStateKt;
import com.mapbox.maps.extension.compose.internal.ComposeTelemetryEvents;
import com.mapbox.maps.extension.compose.internal.MapApplier;
import com.mapbox.maps.extension.compose.internal.MapPreviewPlaceholderKt;
import com.mapbox.maps.extension.compose.internal.MapViewLifecycleKt;
import com.mapbox.maps.extension.compose.ornaments.attribution.MapAttributionScope;
import com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope;
import com.mapbox.maps.extension.compose.ornaments.logo.MapLogoScope;
import com.mapbox.maps.extension.compose.ornaments.scalebar.MapScaleBarScope;
import com.mapbox.maps.plugin.gestures.OnMapClickListener;
import com.mapbox.maps.plugin.gestures.OnMapLongClickListener;
import e23.p;
import e23.q;
import f5.n0;
import g6.c;
import h5.e0;
import h5.g;
import kotlin.a4;
import kotlin.l2;
import kotlin.t1;
import o13.r;
import o53.b0;
import o53.m0;
import p005kotlin.KotlinNothingValueException;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.w;
import p3.b4;
import p3.g3;
import p3.l0;
import p3.m;
import p3.n;
import p3.o;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.s;
import p3.x1;
import p3.x3;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÙ\u0001\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0013\b\u0002\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\u0016¢\u0006\u0002\b\u00172\u001b\b\u0002\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0002\b\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0082Hø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lh4/r;", "modifier", "Lcom/mapbox/maps/extension/compose/ComposeMapInitOptions;", "composeMapInitOptions", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/compose/ornaments/compass/MapCompassScope;", "", "compass", "Lcom/mapbox/maps/extension/compose/ornaments/scalebar/MapScaleBarScope;", "scaleBar", "Lcom/mapbox/maps/extension/compose/ornaments/logo/MapLogoScope;", "logo", "Lcom/mapbox/maps/extension/compose/ornaments/attribution/MapAttributionScope;", "attribution", "Lcom/mapbox/maps/extension/compose/animation/viewport/MapViewportState;", "mapViewportState", "Lcom/mapbox/maps/extension/compose/MapState;", "mapState", "Lcom/mapbox/maps/plugin/gestures/OnMapClickListener;", "onMapClickListener", "Lcom/mapbox/maps/plugin/gestures/OnMapLongClickListener;", "onMapLongClickListener", "Lkotlin/Function0;", "Lcom/mapbox/maps/extension/compose/style/MapboxStyleComposable;", TtmlNode.TAG_STYLE, "Lcom/mapbox/maps/extension/compose/MapboxMapScope;", "Lcom/mapbox/maps/extension/compose/MapboxMapComposable;", FirebaseAnalytics.Param.CONTENT, "MapboxMap", "(Lh4/r;Lcom/mapbox/maps/extension/compose/ComposeMapInitOptions;Le23/q;Le23/q;Le23/q;Le23/q;Lcom/mapbox/maps/extension/compose/animation/viewport/MapViewportState;Lcom/mapbox/maps/extension/compose/MapState;Lcom/mapbox/maps/plugin/gestures/OnMapClickListener;Lcom/mapbox/maps/plugin/gestures/OnMapLongClickListener;Le23/p;Le23/q;Lp3/m;III)V", "Lp3/o;", "composition", "disposingComposition", "(Lp3/o;Lt13/d;)Ljava/lang/Object;", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MapboxMapKt {

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapboxMapKt$MapboxMap$4, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @e(c = "com.mapbox.maps.extension.compose.MapboxMapKt$MapboxMap$4", f = "MapboxMap.kt", l = {141}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends i implements p<b0, d<? super Unit>, Object> {
        final /* synthetic */ x3<q<MapboxMapScope, m, Integer, Unit>> $currentContent$delegate;
        final /* synthetic */ x3<OnMapClickListener> $currentOnMapClickListener$delegate;
        final /* synthetic */ x3<OnMapLongClickListener> $currentOnMapLongClickListener$delegate;
        final /* synthetic */ x3<p<m, Integer, Unit>> $currentStyle$delegate;
        final /* synthetic */ MapView $mapView;
        final /* synthetic */ p3.p $parentComposition;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(MapView mapView, p3.p pVar, x3<? extends OnMapClickListener> x3Var, x3<? extends OnMapLongClickListener> x3Var2, x3<? extends p<? super m, ? super Integer, Unit>> x3Var3, x3<? extends q<? super MapboxMapScope, ? super m, ? super Integer, Unit>> x3Var4, d<? super AnonymousClass4> dVar) {
            super(2, dVar);
            this.$mapView = mapView;
            this.$parentComposition = pVar;
            this.$currentOnMapClickListener$delegate = x3Var;
            this.$currentOnMapLongClickListener$delegate = x3Var2;
            this.$currentStyle$delegate = x3Var3;
            this.$currentContent$delegate = x3Var4;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass4(this.$mapView, this.$parentComposition, this.$currentOnMapClickListener$delegate, this.$currentOnMapLongClickListener$delegate, this.$currentStyle$delegate, this.$currentContent$delegate, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((AnonymousClass4) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            o oVar;
            a aVar = a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                MapApplier mapApplier = new MapApplier(this.$mapView);
                p3.p pVar = this.$parentComposition;
                Object obj2 = s.f135268a;
                p3.r rVar = new p3.r(pVar, mapApplier);
                rVar.r(new z3.e(-398248981, true, new MapboxMapKt$MapboxMap$4$1$1(this.$currentOnMapClickListener$delegate, this.$currentOnMapLongClickListener$delegate, this.$currentStyle$delegate, this.$currentContent$delegate)));
                try {
                    this.L$0 = rVar;
                    this.label = 1;
                    if (m0.a(this) == aVar) {
                        return aVar;
                    }
                    oVar = rVar;
                } catch (Throwable th3) {
                    th = th3;
                    oVar = rVar;
                    oVar.dispose();
                    throw th;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oVar = (o) this.L$0;
                try {
                    r.b(obj);
                } catch (Throwable th4) {
                    th = th4;
                    oVar.dispose();
                    throw th;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0124  */
    /* JADX WARN: Code duplicated, block: B:101:0x0127  */
    /* JADX WARN: Code duplicated, block: B:103:0x012c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0136  */
    /* JADX WARN: Code duplicated, block: B:108:0x013d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:112:0x014b  */
    /* JADX WARN: Code duplicated, block: B:113:0x014e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0158  */
    /* JADX WARN: Code duplicated, block: B:125:0x0182  */
    /* JADX WARN: Code duplicated, block: B:127:0x0195  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c2 A[PHI: r1 r2 r3 r4 r5 r6 r7 r8 r9 r10 r11 r12 r14 r20
      0x01c2: PHI (r1v31 h4.r) = (r1v13 h4.r), (r1v32 h4.r) binds: [B:179:0x02d1, B:139:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r2v30 com.mapbox.maps.extension.compose.ComposeMapInitOptions) = 
      (r2v5 com.mapbox.maps.extension.compose.ComposeMapInitOptions)
      (r2v31 com.mapbox.maps.extension.compose.ComposeMapInitOptions)
     binds: [B:179:0x02d1, B:139:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r3v7 e23.q<? super com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope, ? super p3.m, ? super java.lang.Integer, kotlin.Unit>) = 
      (r3v3 e23.q<? super com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope, ? super p3.m, ? super java.lang.Integer, kotlin.Unit>)
      (r3v8 e23.q<? super com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope, ? super p3.m, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:179:0x02d1, B:139:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r4v8 e23.q<? super com.mapbox.maps.extension.compose.ornaments.scalebar.MapScaleBarScope, ? super p3.m, ? super java.lang.Integer, kotlin.Unit>) = 
      (r4v5 e23.q<? super com.mapbox.maps.extension.compose.ornaments.scalebar.MapScaleBarScope, ? super p3.m, ? super java.lang.Integer, kotlin.Unit>)
      (r4v9 e23.q<? super com.mapbox.maps.extension.compose.ornaments.scalebar.MapScaleBarScope, ? super p3.m, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:179:0x02d1, B:139:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r5v28 e23.q<? super com.mapbox.maps.extension.compose.ornaments.logo.MapLogoScope, ? super p3.m, ? super java.lang.Integer, kotlin.Unit>) = 
      (r5v23 e23.q<? super com.mapbox.maps.extension.compose.ornaments.logo.MapLogoScope, ? super p3.m, ? super java.lang.Integer, kotlin.Unit>)
      (r5v32 e23.q<? super com.mapbox.maps.extension.compose.ornaments.logo.MapLogoScope, ? super p3.m, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:179:0x02d1, B:139:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r6v12 e23.q<? super com.mapbox.maps.extension.compose.ornaments.attribution.MapAttributionScope, ? super p3.m, ? super java.lang.Integer, kotlin.Unit>) = 
      (r6v5 e23.q<? super com.mapbox.maps.extension.compose.ornaments.attribution.MapAttributionScope, ? super p3.m, ? super java.lang.Integer, kotlin.Unit>)
      (r6v13 e23.q<? super com.mapbox.maps.extension.compose.ornaments.attribution.MapAttributionScope, ? super p3.m, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:179:0x02d1, B:139:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r7v15 com.mapbox.maps.extension.compose.animation.viewport.MapViewportState) = 
      (r7v21 com.mapbox.maps.extension.compose.animation.viewport.MapViewportState)
      (r7v22 com.mapbox.maps.extension.compose.animation.viewport.MapViewportState)
     binds: [B:179:0x02d1, B:139:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r8v11 com.mapbox.maps.extension.compose.MapState) = (r8v23 com.mapbox.maps.extension.compose.MapState), (r8v24 com.mapbox.maps.extension.compose.MapState) binds: [B:179:0x02d1, B:139:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r9v15 com.mapbox.maps.plugin.gestures.OnMapClickListener) = (r9v3 com.mapbox.maps.plugin.gestures.OnMapClickListener), (r9v19 com.mapbox.maps.plugin.gestures.OnMapClickListener) binds: [B:179:0x02d1, B:139:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r10v14 p3.o0) = (r10v19 p3.o0), (r10v15 p3.o0) binds: [B:179:0x02d1, B:139:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r11v17 com.mapbox.maps.plugin.gestures.OnMapLongClickListener) = 
      (r11v6 com.mapbox.maps.plugin.gestures.OnMapLongClickListener)
      (r11v18 com.mapbox.maps.plugin.gestures.OnMapLongClickListener)
     binds: [B:179:0x02d1, B:139:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r12v16 e23.p<? super p3.m, ? super java.lang.Integer, kotlin.Unit>) = 
      (r12v4 e23.p<? super p3.m, ? super java.lang.Integer, kotlin.Unit>)
      (r12v17 e23.p<? super p3.m, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:179:0x02d1, B:139:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r14v21 int) = (r14v6 int), (r14v22 int) binds: [B:179:0x02d1, B:139:0x01b1] A[DONT_GENERATE, DONT_INLINE]
      0x01c2: PHI (r20v7 p3.m$a) = (r2v2 p3.m$a), (r20v8 p3.m$a) binds: [B:179:0x02d1, B:139:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:141:0x01c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:147:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:149:0x020a  */
    /* JADX WARN: Code duplicated, block: B:151:0x020f  */
    /* JADX WARN: Code duplicated, block: B:152:0x0216  */
    /* JADX WARN: Code duplicated, block: B:154:0x0219  */
    /* JADX WARN: Code duplicated, block: B:155:0x0220  */
    /* JADX WARN: Code duplicated, block: B:157:0x0223  */
    /* JADX WARN: Code duplicated, block: B:158:0x022a  */
    /* JADX WARN: Code duplicated, block: B:160:0x022e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0238  */
    /* JADX WARN: Code duplicated, block: B:164:0x0270  */
    /* JADX WARN: Code duplicated, block: B:167:0x0276  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:170:0x02af  */
    /* JADX WARN: Code duplicated, block: B:171:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:173:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:176:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:177:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:180:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:186:0x0317  */
    /* JADX WARN: Code duplicated, block: B:188:0x032a  */
    /* JADX WARN: Code duplicated, block: B:190:0x0351  */
    /* JADX WARN: Code duplicated, block: B:193:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:195:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:197:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:201:0x04e4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:202:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:204:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:95:0x010f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0116  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v45, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r1v20, types: [z3.e] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r39v3, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r42v4, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r7v14, types: [com.mapbox.maps.extension.compose.animation.viewport.MapViewportState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16, types: [com.mapbox.maps.extension.compose.animation.viewport.MapViewportState] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r8v10, types: [com.mapbox.maps.extension.compose.MapState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12, types: [com.mapbox.maps.extension.compose.MapState] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    public static final void MapboxMap(h4.r rVar, ComposeMapInitOptions composeMapInitOptions, q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar, q<? super MapScaleBarScope, ? super m, ? super Integer, Unit> qVar2, q<? super MapLogoScope, ? super m, ? super Integer, Unit> qVar3, q<? super MapAttributionScope, ? super m, ? super Integer, Unit> qVar4, MapViewportState mapViewportState, MapState mapState, OnMapClickListener onMapClickListener, OnMapLongClickListener onMapLongClickListener, p<? super m, ? super Integer, Unit> pVar, q<? super MapboxMapScope, ? super m, ? super Integer, Unit> qVar5, m mVar, int i14, int i15, int i16) {
        h4.r rVar2;
        int i17;
        ComposeMapInitOptions composeMapInitOptions2;
        q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar6;
        int i18;
        q<? super MapScaleBarScope, ? super m, ? super Integer, Unit> qVar7;
        int i19;
        int i24;
        int i25;
        int i26;
        q<? super MapAttributionScope, ? super m, ? super Integer, Unit> qVarM138getLambda4$extension_compose_release;
        int i27;
        MapViewportState mapViewportState2;
        MapState mapState2;
        int i28;
        int i29;
        int i30;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        m.a aVar;
        ComposeMapInitOptions composeMapInitOptions3;
        q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVarM135getLambda1$extension_compose_release;
        q<? super MapScaleBarScope, ? super m, ? super Integer, Unit> qVarM136getLambda2$extension_compose_release;
        q<? super MapLogoScope, ? super m, ? super Integer, Unit> qVarM137getLambda3$extension_compose_release;
        o0 o0Var;
        MapViewportState mapViewportState3;
        MapState mapState3;
        OnMapClickListener onMapClickListener2;
        OnMapLongClickListener onMapLongClickListener2;
        p<? super m, ? super Integer, Unit> pVarM139getLambda5$extension_compose_release;
        ComposeMapInitOptions composeMapInitOptions4;
        h4.r rVar3;
        q<? super MapScaleBarScope, ? super m, ? super Integer, Unit> qVar8;
        q<? super MapAttributionScope, ? super m, ? super Integer, Unit> qVar9;
        q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar10;
        int i39;
        q<? super MapLogoScope, ? super m, ? super Integer, Unit> qVar11;
        OnMapClickListener onMapClickListener3;
        MapState mapState4;
        MapViewportState mapViewportState4;
        q<? super MapboxMapScope, ? super m, ? super Integer, Unit> qVar12;
        MapState mapState5;
        c cVar;
        Object objQ;
        ?? r14;
        MapState mapState6;
        ?? r15;
        q<? super MapboxMapScope, ? super m, ? super Integer, Unit> qVar13;
        Context context;
        Object objQ2;
        int i44;
        MapView mapView;
        c2.s sVarE;
        c cVar2;
        ComposeMapInitOptions composeMapInitOptions5;
        g6.o oVar;
        p<? super m, ? super Integer, Unit> pVar2;
        a4 a4Var;
        e0.a aVar2;
        OnMapLongClickListener onMapLongClickListener3;
        h4.r rVar4;
        ?? eVar;
        OnMapClickListener onMapClickListener4;
        MapState mapState7;
        OnMapClickListener onMapClickListener5;
        q<? super MapboxMapScope, ? super m, ? super Integer, Unit> qVar14;
        OnMapLongClickListener onMapLongClickListener4;
        ?? r16;
        p<? super m, ? super Integer, Unit> pVar3;
        ComposeMapInitOptions composeMapInitOptions6;
        h4.r rVar5;
        p2 p2VarI0;
        o0 o0Var2;
        MapState mapState8;
        MapViewportState mapViewportState5;
        ?? r17;
        ?? r18;
        p2 p2VarI1;
        MapState mapState9;
        int i45;
        MapState mapState10;
        MapState mapState11;
        int i46;
        o0 o0VarE = mVar.E(-539221992);
        int i47 = i16 & 1;
        if (i47 != 0) {
            i17 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 14) == 0) {
            rVar2 = rVar;
            i17 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i17 = i14;
        }
        if ((i14 & 112) == 0) {
            if ((i16 & 2) == 0) {
                composeMapInitOptions2 = composeMapInitOptions;
                int i48 = o0VarE.B(composeMapInitOptions2) ? 32 : 16;
                i17 |= i48;
            } else {
                composeMapInitOptions2 = composeMapInitOptions;
            }
            i17 |= i48;
        } else {
            composeMapInitOptions2 = composeMapInitOptions;
        }
        int i49 = i16 & 4;
        if (i49 == 0) {
            if ((i14 & 896) == 0) {
                qVar6 = qVar;
                i17 |= o0VarE.B(qVar6) ? 256 : 128;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                if ((i14 & 7168) == 0) {
                    qVar7 = qVar2;
                    if (o0VarE.B(qVar7)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
                i24 = i16 & 16;
                if (i24 != 0) {
                    i17 |= 24576;
                } else if ((i14 & 57344) == 0) {
                    if (o0VarE.B(qVar3)) {
                        i25 = 16384;
                    } else {
                        i25 = 8192;
                    }
                    i17 |= i25;
                }
                i26 = i16 & 32;
                if (i26 != 0) {
                    i17 |= 196608;
                    qVarM138getLambda4$extension_compose_release = qVar4;
                } else {
                    qVarM138getLambda4$extension_compose_release = qVar4;
                    if ((i14 & 458752) == 0) {
                        if (o0VarE.B(qVarM138getLambda4$extension_compose_release)) {
                            i27 = 131072;
                        } else {
                            i27 = 65536;
                        }
                        i17 |= i27;
                    }
                }
                if ((i14 & 3670016) == 0) {
                    MapViewportState mapViewportState6 = mapViewportState;
                    if ((i16 & 64) == 0 || !o0VarE.B(mapViewportState6)) {
                        i46 = 524288;
                    } else {
                        i46 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    }
                    i17 |= i46;
                    mapViewportState2 = mapViewportState6;
                } else {
                    mapViewportState2 = mapViewportState;
                }
                if ((i14 & 29360128) == 0) {
                    if ((i16 & 128) == 0) {
                        mapState11 = mapState;
                        if (o0VarE.B(mapState11)) {
                            mapState9 = mapState11;
                            i45 = 8388608;
                            mapState10 = mapState11;
                        }
                        i17 |= i45;
                        mapState2 = mapState10;
                    } else {
                        mapState9 = mapState;
                    }
                    mapState9 = mapState11;
                    i45 = 4194304;
                    mapState10 = mapState9;
                    i17 |= i45;
                    mapState2 = mapState10;
                } else {
                    mapState2 = mapState;
                }
                i28 = i16 & 256;
                if (i28 != 0) {
                    i17 |= 33554432;
                }
                i29 = i16 & 512;
                if (i29 != 0) {
                    i17 |= 268435456;
                }
                i30 = i16 & 1024;
                if (i30 != 0) {
                    i34 = i15 | 6;
                } else if ((i15 & 14) == 0) {
                    if (o0VarE.B(pVar)) {
                        i35 = 4;
                    } else {
                        i35 = 2;
                    }
                    i34 = i15 | i35;
                } else {
                    i34 = i15;
                }
                i36 = i16 & 2048;
                if (i36 != 0) {
                    if ((i15 & 112) == 0) {
                        if (o0VarE.B(qVar5)) {
                            i37 = 32;
                        } else {
                            i37 = 16;
                        }
                        i34 |= i37;
                    }
                    if ((i16 & ViewUtils.EDGE_TO_EDGE_FLAGS) != 768 && (1533916891 & i17) == 306783378 && (i34 & 91) == 18 && o0VarE.b()) {
                        o0VarE.e();
                        qVar11 = qVar3;
                        onMapClickListener5 = onMapClickListener;
                        pVar3 = pVar;
                        rVar5 = rVar2;
                        composeMapInitOptions6 = composeMapInitOptions2;
                        qVar8 = qVar7;
                        qVar14 = qVar5;
                        qVar9 = qVarM138getLambda4$extension_compose_release;
                        qVar10 = qVar6;
                        onMapLongClickListener4 = onMapLongClickListener;
                        r16 = o0VarE;
                        r18 = mapViewportState2;
                        r17 = mapState2;
                    } else {
                        o0VarE.G0();
                        i38 = i14 & 1;
                        aVar = m.f135153a;
                        if (i38 != 0 || o0VarE.o0()) {
                            if (i47 != 0) {
                                rVar2 = h4.r.S;
                            }
                            if ((i16 & 2) != 0) {
                                cVar = (c) o0VarE.A(t1.f91490h);
                                o0VarE.L(-492369756);
                                objQ = o0VarE.q();
                                aVar.getClass();
                                if (objQ == m.a.f135155b) {
                                    objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                                    o0VarE.K(objQ);
                                }
                                o0VarE.g0(false);
                                composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                                i17 &= -113;
                            } else {
                                composeMapInitOptions3 = composeMapInitOptions2;
                            }
                            if (i49 != 0) {
                                qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                            } else {
                                qVarM135getLambda1$extension_compose_release = qVar6;
                            }
                            if (i18 != 0) {
                                qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                            } else {
                                qVarM136getLambda2$extension_compose_release = qVar7;
                            }
                            if (i24 != 0) {
                                qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                            } else {
                                qVarM137getLambda3$extension_compose_release = qVar3;
                            }
                            if (i26 != 0) {
                                qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                            }
                            if ((i16 & 64) != 0) {
                                o0VarE.L(-135744814);
                                Object objD = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                                o0 o0Var3 = o0VarE;
                                o0Var3.g0(false);
                                i17 &= -3670017;
                                mapViewportState3 = (MapViewportState) objD;
                                o0Var = o0Var3;
                            } else {
                                o0Var = o0VarE;
                                mapViewportState3 = mapViewportState2;
                            }
                            if ((i16 & 128) != 0) {
                                o0Var.L(-231233878);
                                mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                                o0Var.g0(false);
                                i17 &= -29360129;
                            } else {
                                mapState3 = mapState2;
                            }
                            if (i28 != 0) {
                                onMapClickListener2 = null;
                            } else {
                                onMapClickListener2 = onMapClickListener;
                            }
                            if (i29 != 0) {
                                mapState3 = mapState5;
                                onMapLongClickListener2 = null;
                            } else {
                                mapState3 = mapState5;
                                onMapLongClickListener2 = onMapLongClickListener;
                            }
                            if (i30 != 0) {
                                mapState3 = mapState5;
                                mapState3 = mapState5;
                                pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                            } else {
                                mapState3 = mapState5;
                                mapState3 = mapState5;
                                pVarM139getLambda5$extension_compose_release = pVar;
                            }
                            q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar15 = qVarM135getLambda1$extension_compose_release;
                            composeMapInitOptions4 = composeMapInitOptions3;
                            rVar3 = rVar2;
                            qVar8 = qVarM136getLambda2$extension_compose_release;
                            qVar9 = qVarM138getLambda4$extension_compose_release;
                            qVar10 = qVar15;
                            i39 = i17;
                            qVar11 = qVarM137getLambda3$extension_compose_release;
                            onMapClickListener3 = onMapClickListener2;
                            mapState4 = mapState3;
                            mapViewportState4 = mapViewportState3;
                            mapViewportState5 = mapViewportState4;
                            mapState8 = mapState4;
                            o0Var2 = o0Var;
                            if (i36 != 0) {
                                qVar12 = null;
                                r15 = mapViewportState4;
                                mapState6 = mapState4;
                                r14 = o0Var;
                            }
                            r14.h0();
                            x1 x1Var = n.f135158a;
                            qVar13 = qVar12;
                            r14.L(658990358);
                            if (((Boolean) r14.A(l2.f91259a)).booleanValue()) {
                                MapPreviewPlaceholderKt.m207MapPreviewPlaceHolderRWsq2U(rVar3, 0L, 0, 0L, r14, i39 & 14, 14);
                                r14.g0(false);
                                p2VarI0 = r14.i0();
                                if (p2VarI0 == null) {
                                    return;
                                }
                                p2VarI0.f135219d = new AnonymousClass2(rVar3, composeMapInitOptions4, qVar10, qVar8, qVar11, qVar9, r15, mapState6, onMapClickListener3, onMapLongClickListener2, pVarM139getLambda5$extension_compose_release, qVar13, i14, i15, i16);
                                return;
                            }
                            r14.g0(false);
                            r14.N(658990505, composeMapInitOptions4);
                            context = (Context) r14.A(AndroidCompositionLocals_androidKt.f6042b);
                            r14.L(-492369756);
                            objQ2 = r14.q();
                            aVar.getClass();
                            i44 = i39;
                            if (objQ2 == m.a.f135155b) {
                                ComposeTelemetryEvents.INSTANCE.getMap().increment();
                                objQ2 = new MapView(context, composeMapInitOptions4.getMapInitOptions$extension_compose_release(context));
                                r14.K(objQ2);
                            }
                            r14.g0(false);
                            mapView = (MapView) objQ2;
                            MapViewLifecycleKt.MapViewLifecycle(mapView, r14, 8);
                            r14.L(733328855);
                            h4.d.f81522a.getClass();
                            sVarE = c2.q.e(h4.d.a.f81524b, r14, 0);
                            r14.L(-1323940314);
                            cVar2 = (c) r14.A(t1.f91490h);
                            composeMapInitOptions5 = composeMapInitOptions4;
                            oVar = (g6.o) r14.A(t1.f91496n);
                            pVar2 = pVarM139getLambda5$extension_compose_release;
                            a4Var = (a4) r14.A(t1.f91502t);
                            g.V.getClass();
                            aVar2 = g.a.f81805b;
                            onMapLongClickListener3 = onMapLongClickListener2;
                            rVar4 = rVar3;
                            onMapClickListener4 = onMapClickListener3;
                            mapState7 = mapState6;
                            eVar = new z3.e(-2123382363, true, new n0(rVar3));
                            if (r14.f135177b != null) {
                                p0.l();
                                throw null;
                            }
                            r14.z();
                            if (r14.T) {
                                r14.M(aVar2);
                            } else {
                                r14.c();
                            }
                            r14.f135201z = false;
                            b4.c(g.a.f81810g, sVarE, r14);
                            b4.c(g.a.f81808e, cVar2, r14);
                            b4.c(g.a.f81811h, oVar, r14);
                            b4.c(g.a.f81812i, a4Var, r14);
                            r14.j();
                            eVar.invoke(g3.a(r14), r14, 0);
                            r14.L(2058660585);
                            r14.L(-2137368960);
                            u uVar = u.f22885a;
                            p002j6.c.b(new MapboxMapKt$MapboxMap$3$1(mapView), x2.d(h4.r.S, 1.0f), null, r14, 48, 4);
                            qVar10.invoke(new MapCompassScope(mapView, uVar), r14, Integer.valueOf((i44 >> 3) & 112));
                            qVar8.invoke(new MapScaleBarScope(mapView, uVar), r14, Integer.valueOf((i44 >> 6) & 112));
                            qVar11.invoke(new MapLogoScope(uVar), r14, Integer.valueOf((i44 >> 9) & 112));
                            qVar9.invoke(new MapAttributionScope(mapView, uVar), r14, Integer.valueOf((i44 >> 12) & 112));
                            r14.g0(false);
                            r14.g0(false);
                            r14.g0(true);
                            r14.g0(false);
                            r14.g0(false);
                            r14.N(658991134, r15);
                            r15.BindToMap$extension_compose_release(mapView, r14, ((i44 >> 15) & 112) | 8);
                            r14.g0(false);
                            ?? r19 = mapState7;
                            r14.N(658991220, r19);
                            r19.BindToMap$extension_compose_release(mapView.getMapboxMapDeprecated(), r14, ((i44 >> 18) & 112) | 8);
                            r14.g0(false);
                            onMapClickListener5 = onMapClickListener4;
                            qVar14 = qVar13;
                            l0.e(new AnonymousClass4(mapView, r14.g(), p0.q(onMapClickListener5, r14), p0.q(onMapLongClickListener3, r14), p0.q(pVar2, r14), p0.q(qVar14, r14), null), Unit.INSTANCE, r14);
                            r14.g0(false);
                            ?? r24 = r14;
                            onMapLongClickListener4 = onMapLongClickListener3;
                            r16 = r24;
                            pVar3 = pVar2;
                            composeMapInitOptions6 = composeMapInitOptions5;
                            rVar5 = rVar4;
                            r18 = r15;
                            r17 = r19;
                        } else {
                            o0VarE.e();
                            if ((i16 & 2) != 0) {
                                i17 &= -113;
                            }
                            if ((i16 & 64) != 0) {
                                i17 &= -3670017;
                            }
                            if ((i16 & 128) != 0) {
                                i17 &= -29360129;
                            }
                            onMapClickListener3 = onMapClickListener;
                            onMapLongClickListener2 = onMapLongClickListener;
                            aVar = aVar;
                            rVar3 = rVar2;
                            i39 = i17;
                            composeMapInitOptions4 = composeMapInitOptions2;
                            qVar8 = qVar7;
                            qVar11 = qVar3;
                            pVarM139getLambda5$extension_compose_release = pVar;
                            qVar9 = qVarM138getLambda4$extension_compose_release;
                            qVar10 = qVar6;
                            o0Var2 = o0VarE;
                            mapViewportState5 = mapViewportState2;
                            mapState8 = mapState2;
                        }
                        qVar12 = qVar5;
                        r15 = mapViewportState5;
                        mapState6 = mapState8;
                        r14 = o0Var2;
                        r14.h0();
                        x1 x1Var2 = n.f135158a;
                        qVar13 = qVar12;
                        r14.L(658990358);
                        if (((Boolean) r14.A(l2.f91259a)).booleanValue()) {
                            MapPreviewPlaceholderKt.m207MapPreviewPlaceHolderRWsq2U(rVar3, 0L, 0, 0L, r14, i39 & 14, 14);
                            r14.g0(false);
                            p2VarI0 = r14.i0();
                            if (p2VarI0 == null) {
                                return;
                            }
                            p2VarI0.f135219d = new AnonymousClass2(rVar3, composeMapInitOptions4, qVar10, qVar8, qVar11, qVar9, r15, mapState6, onMapClickListener3, onMapLongClickListener2, pVarM139getLambda5$extension_compose_release, qVar13, i14, i15, i16);
                            return;
                        }
                        r14.g0(false);
                        r14.N(658990505, composeMapInitOptions4);
                        context = (Context) r14.A(AndroidCompositionLocals_androidKt.f6042b);
                        r14.L(-492369756);
                        objQ2 = r14.q();
                        aVar.getClass();
                        i44 = i39;
                        if (objQ2 == m.a.f135155b) {
                            ComposeTelemetryEvents.INSTANCE.getMap().increment();
                            objQ2 = new MapView(context, composeMapInitOptions4.getMapInitOptions$extension_compose_release(context));
                            r14.K(objQ2);
                        }
                        r14.g0(false);
                        mapView = (MapView) objQ2;
                        MapViewLifecycleKt.MapViewLifecycle(mapView, r14, 8);
                        r14.L(733328855);
                        h4.d.f81522a.getClass();
                        sVarE = c2.q.e(h4.d.a.f81524b, r14, 0);
                        r14.L(-1323940314);
                        cVar2 = (c) r14.A(t1.f91490h);
                        composeMapInitOptions5 = composeMapInitOptions4;
                        oVar = (g6.o) r14.A(t1.f91496n);
                        pVar2 = pVarM139getLambda5$extension_compose_release;
                        a4Var = (a4) r14.A(t1.f91502t);
                        g.V.getClass();
                        aVar2 = g.a.f81805b;
                        onMapLongClickListener3 = onMapLongClickListener2;
                        rVar4 = rVar3;
                        onMapClickListener4 = onMapClickListener3;
                        mapState7 = mapState6;
                        eVar = new z3.e(-2123382363, true, new n0(rVar3));
                        if (r14.f135177b != null) {
                            p0.l();
                            throw null;
                        }
                        r14.z();
                        if (r14.T) {
                            r14.M(aVar2);
                        } else {
                            r14.c();
                        }
                        r14.f135201z = false;
                        b4.c(g.a.f81810g, sVarE, r14);
                        b4.c(g.a.f81808e, cVar2, r14);
                        b4.c(g.a.f81811h, oVar, r14);
                        b4.c(g.a.f81812i, a4Var, r14);
                        r14.j();
                        eVar.invoke(g3.a(r14), r14, 0);
                        r14.L(2058660585);
                        r14.L(-2137368960);
                        u uVar2 = u.f22885a;
                        p002j6.c.b(new MapboxMapKt$MapboxMap$3$1(mapView), x2.d(h4.r.S, 1.0f), null, r14, 48, 4);
                        qVar10.invoke(new MapCompassScope(mapView, uVar2), r14, Integer.valueOf((i44 >> 3) & 112));
                        qVar8.invoke(new MapScaleBarScope(mapView, uVar2), r14, Integer.valueOf((i44 >> 6) & 112));
                        qVar11.invoke(new MapLogoScope(uVar2), r14, Integer.valueOf((i44 >> 9) & 112));
                        qVar9.invoke(new MapAttributionScope(mapView, uVar2), r14, Integer.valueOf((i44 >> 12) & 112));
                        r14.g0(false);
                        r14.g0(false);
                        r14.g0(true);
                        r14.g0(false);
                        r14.g0(false);
                        r14.N(658991134, r15);
                        r15.BindToMap$extension_compose_release(mapView, r14, ((i44 >> 15) & 112) | 8);
                        r14.g0(false);
                        ?? r110 = mapState7;
                        r14.N(658991220, r110);
                        r110.BindToMap$extension_compose_release(mapView.getMapboxMapDeprecated(), r14, ((i44 >> 18) & 112) | 8);
                        r14.g0(false);
                        onMapClickListener5 = onMapClickListener4;
                        qVar14 = qVar13;
                        l0.e(new AnonymousClass4(mapView, r14.g(), p0.q(onMapClickListener5, r14), p0.q(onMapLongClickListener3, r14), p0.q(pVar2, r14), p0.q(qVar14, r14), null), Unit.INSTANCE, r14);
                        r14.g0(false);
                        ?? r25 = r14;
                        onMapLongClickListener4 = onMapLongClickListener3;
                        r16 = r25;
                        pVar3 = pVar2;
                        composeMapInitOptions6 = composeMapInitOptions5;
                        rVar5 = rVar4;
                        r18 = r15;
                        r17 = r110;
                    }
                    p2VarI1 = r16.i0();
                    if (p2VarI1 == null) {
                        return;
                    }
                    p2VarI1.f135219d = new AnonymousClass5(rVar5, composeMapInitOptions6, qVar10, qVar8, qVar11, qVar9, r18, r17, onMapClickListener5, onMapLongClickListener4, pVar3, qVar14, i14, i15, i16);
                }
                i34 |= 48;
                if ((i16 & ViewUtils.EDGE_TO_EDGE_FLAGS) != 768) {
                    o0VarE.G0();
                    i38 = i14 & 1;
                    aVar = m.f135153a;
                    if (i38 != 0) {
                        if (i47 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if ((i16 & 2) != 0) {
                            cVar = (c) o0VarE.A(t1.f91490h);
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                            i17 &= -113;
                        } else {
                            composeMapInitOptions3 = composeMapInitOptions2;
                        }
                        if (i49 != 0) {
                            qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                        } else {
                            qVarM135getLambda1$extension_compose_release = qVar6;
                        }
                        if (i18 != 0) {
                            qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                        } else {
                            qVarM136getLambda2$extension_compose_release = qVar7;
                        }
                        if (i24 != 0) {
                            qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                        } else {
                            qVarM137getLambda3$extension_compose_release = qVar3;
                        }
                        if (i26 != 0) {
                            qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                        }
                        if ((i16 & 64) != 0) {
                            o0VarE.L(-135744814);
                            Object objD2 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                            o0 o0Var4 = o0VarE;
                            o0Var4.g0(false);
                            i17 &= -3670017;
                            mapViewportState3 = (MapViewportState) objD2;
                            o0Var = o0Var4;
                        } else {
                            o0Var = o0VarE;
                            mapViewportState3 = mapViewportState2;
                        }
                        if ((i16 & 128) != 0) {
                            o0Var.L(-231233878);
                            mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                            o0Var.g0(false);
                            i17 &= -29360129;
                        } else {
                            mapState3 = mapState2;
                        }
                        if (i28 != 0) {
                            onMapClickListener2 = null;
                        } else {
                            onMapClickListener2 = onMapClickListener;
                        }
                        if (i29 != 0) {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = null;
                        } else {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = onMapLongClickListener;
                        }
                        if (i30 != 0) {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                        } else {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = pVar;
                        }
                        q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar16 = qVarM135getLambda1$extension_compose_release;
                        composeMapInitOptions4 = composeMapInitOptions3;
                        rVar3 = rVar2;
                        qVar8 = qVarM136getLambda2$extension_compose_release;
                        qVar9 = qVarM138getLambda4$extension_compose_release;
                        qVar10 = qVar16;
                        i39 = i17;
                        qVar11 = qVarM137getLambda3$extension_compose_release;
                        onMapClickListener3 = onMapClickListener2;
                        mapState4 = mapState3;
                        mapViewportState4 = mapViewportState3;
                        mapViewportState5 = mapViewportState4;
                        mapState8 = mapState4;
                        o0Var2 = o0Var;
                        if (i36 != 0) {
                            qVar12 = null;
                            r15 = mapViewportState4;
                            mapState6 = mapState4;
                            r14 = o0Var;
                        } else {
                            qVar12 = qVar5;
                            r15 = mapViewportState5;
                            mapState6 = mapState8;
                            r14 = o0Var2;
                        }
                    } else {
                        if (i47 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if ((i16 & 2) != 0) {
                            cVar = (c) o0VarE.A(t1.f91490h);
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                            i17 &= -113;
                        } else {
                            composeMapInitOptions3 = composeMapInitOptions2;
                        }
                        if (i49 != 0) {
                            qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                        } else {
                            qVarM135getLambda1$extension_compose_release = qVar6;
                        }
                        if (i18 != 0) {
                            qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                        } else {
                            qVarM136getLambda2$extension_compose_release = qVar7;
                        }
                        if (i24 != 0) {
                            qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                        } else {
                            qVarM137getLambda3$extension_compose_release = qVar3;
                        }
                        if (i26 != 0) {
                            qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                        }
                        if ((i16 & 64) != 0) {
                            o0VarE.L(-135744814);
                            Object objD3 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                            o0 o0Var5 = o0VarE;
                            o0Var5.g0(false);
                            i17 &= -3670017;
                            mapViewportState3 = (MapViewportState) objD3;
                            o0Var = o0Var5;
                        } else {
                            o0Var = o0VarE;
                            mapViewportState3 = mapViewportState2;
                        }
                        if ((i16 & 128) != 0) {
                            o0Var.L(-231233878);
                            mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                            o0Var.g0(false);
                            i17 &= -29360129;
                        } else {
                            mapState3 = mapState2;
                        }
                        if (i28 != 0) {
                            onMapClickListener2 = null;
                        } else {
                            onMapClickListener2 = onMapClickListener;
                        }
                        if (i29 != 0) {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = null;
                        } else {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = onMapLongClickListener;
                        }
                        if (i30 != 0) {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                        } else {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = pVar;
                        }
                        q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar17 = qVarM135getLambda1$extension_compose_release;
                        composeMapInitOptions4 = composeMapInitOptions3;
                        rVar3 = rVar2;
                        qVar8 = qVarM136getLambda2$extension_compose_release;
                        qVar9 = qVarM138getLambda4$extension_compose_release;
                        qVar10 = qVar17;
                        i39 = i17;
                        qVar11 = qVarM137getLambda3$extension_compose_release;
                        onMapClickListener3 = onMapClickListener2;
                        mapState4 = mapState3;
                        mapViewportState4 = mapViewportState3;
                        mapViewportState5 = mapViewportState4;
                        mapState8 = mapState4;
                        o0Var2 = o0Var;
                        if (i36 != 0) {
                            qVar12 = null;
                            r15 = mapViewportState4;
                            mapState6 = mapState4;
                            r14 = o0Var;
                        } else {
                            qVar12 = qVar5;
                            r15 = mapViewportState5;
                            mapState6 = mapState8;
                            r14 = o0Var2;
                        }
                    }
                    r14.h0();
                    x1 x1Var3 = n.f135158a;
                    qVar13 = qVar12;
                    r14.L(658990358);
                    if (((Boolean) r14.A(l2.f91259a)).booleanValue()) {
                        MapPreviewPlaceholderKt.m207MapPreviewPlaceHolderRWsq2U(rVar3, 0L, 0, 0L, r14, i39 & 14, 14);
                        r14.g0(false);
                        p2VarI0 = r14.i0();
                        if (p2VarI0 == null) {
                            return;
                        }
                        p2VarI0.f135219d = new AnonymousClass2(rVar3, composeMapInitOptions4, qVar10, qVar8, qVar11, qVar9, r15, mapState6, onMapClickListener3, onMapLongClickListener2, pVarM139getLambda5$extension_compose_release, qVar13, i14, i15, i16);
                        return;
                    }
                    r14.g0(false);
                    r14.N(658990505, composeMapInitOptions4);
                    context = (Context) r14.A(AndroidCompositionLocals_androidKt.f6042b);
                    r14.L(-492369756);
                    objQ2 = r14.q();
                    aVar.getClass();
                    i44 = i39;
                    if (objQ2 == m.a.f135155b) {
                        ComposeTelemetryEvents.INSTANCE.getMap().increment();
                        objQ2 = new MapView(context, composeMapInitOptions4.getMapInitOptions$extension_compose_release(context));
                        r14.K(objQ2);
                    }
                    r14.g0(false);
                    mapView = (MapView) objQ2;
                    MapViewLifecycleKt.MapViewLifecycle(mapView, r14, 8);
                    r14.L(733328855);
                    h4.d.f81522a.getClass();
                    sVarE = c2.q.e(h4.d.a.f81524b, r14, 0);
                    r14.L(-1323940314);
                    cVar2 = (c) r14.A(t1.f91490h);
                    composeMapInitOptions5 = composeMapInitOptions4;
                    oVar = (g6.o) r14.A(t1.f91496n);
                    pVar2 = pVarM139getLambda5$extension_compose_release;
                    a4Var = (a4) r14.A(t1.f91502t);
                    g.V.getClass();
                    aVar2 = g.a.f81805b;
                    onMapLongClickListener3 = onMapLongClickListener2;
                    rVar4 = rVar3;
                    onMapClickListener4 = onMapClickListener3;
                    mapState7 = mapState6;
                    eVar = new z3.e(-2123382363, true, new n0(rVar3));
                    if (r14.f135177b != null) {
                        p0.l();
                        throw null;
                    }
                    r14.z();
                    if (r14.T) {
                        r14.M(aVar2);
                    } else {
                        r14.c();
                    }
                    r14.f135201z = false;
                    b4.c(g.a.f81810g, sVarE, r14);
                    b4.c(g.a.f81808e, cVar2, r14);
                    b4.c(g.a.f81811h, oVar, r14);
                    b4.c(g.a.f81812i, a4Var, r14);
                    r14.j();
                    eVar.invoke(g3.a(r14), r14, 0);
                    r14.L(2058660585);
                    r14.L(-2137368960);
                    u uVar3 = u.f22885a;
                    p002j6.c.b(new MapboxMapKt$MapboxMap$3$1(mapView), x2.d(h4.r.S, 1.0f), null, r14, 48, 4);
                    qVar10.invoke(new MapCompassScope(mapView, uVar3), r14, Integer.valueOf((i44 >> 3) & 112));
                    qVar8.invoke(new MapScaleBarScope(mapView, uVar3), r14, Integer.valueOf((i44 >> 6) & 112));
                    qVar11.invoke(new MapLogoScope(uVar3), r14, Integer.valueOf((i44 >> 9) & 112));
                    qVar9.invoke(new MapAttributionScope(mapView, uVar3), r14, Integer.valueOf((i44 >> 12) & 112));
                    r14.g0(false);
                    r14.g0(false);
                    r14.g0(true);
                    r14.g0(false);
                    r14.g0(false);
                    r14.N(658991134, r15);
                    r15.BindToMap$extension_compose_release(mapView, r14, ((i44 >> 15) & 112) | 8);
                    r14.g0(false);
                    ?? r111 = mapState7;
                    r14.N(658991220, r111);
                    r111.BindToMap$extension_compose_release(mapView.getMapboxMapDeprecated(), r14, ((i44 >> 18) & 112) | 8);
                    r14.g0(false);
                    onMapClickListener5 = onMapClickListener4;
                    qVar14 = qVar13;
                    l0.e(new AnonymousClass4(mapView, r14.g(), p0.q(onMapClickListener5, r14), p0.q(onMapLongClickListener3, r14), p0.q(pVar2, r14), p0.q(qVar14, r14), null), Unit.INSTANCE, r14);
                    r14.g0(false);
                    ?? r26 = r14;
                    onMapLongClickListener4 = onMapLongClickListener3;
                    r16 = r26;
                    pVar3 = pVar2;
                    composeMapInitOptions6 = composeMapInitOptions5;
                    rVar5 = rVar4;
                    r18 = r15;
                    r17 = r111;
                } else {
                    o0VarE.G0();
                    i38 = i14 & 1;
                    aVar = m.f135153a;
                    if (i38 != 0) {
                        if (i47 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if ((i16 & 2) != 0) {
                            cVar = (c) o0VarE.A(t1.f91490h);
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                            i17 &= -113;
                        } else {
                            composeMapInitOptions3 = composeMapInitOptions2;
                        }
                        if (i49 != 0) {
                            qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                        } else {
                            qVarM135getLambda1$extension_compose_release = qVar6;
                        }
                        if (i18 != 0) {
                            qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                        } else {
                            qVarM136getLambda2$extension_compose_release = qVar7;
                        }
                        if (i24 != 0) {
                            qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                        } else {
                            qVarM137getLambda3$extension_compose_release = qVar3;
                        }
                        if (i26 != 0) {
                            qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                        }
                        if ((i16 & 64) != 0) {
                            o0VarE.L(-135744814);
                            Object objD4 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                            o0 o0Var6 = o0VarE;
                            o0Var6.g0(false);
                            i17 &= -3670017;
                            mapViewportState3 = (MapViewportState) objD4;
                            o0Var = o0Var6;
                        } else {
                            o0Var = o0VarE;
                            mapViewportState3 = mapViewportState2;
                        }
                        if ((i16 & 128) != 0) {
                            o0Var.L(-231233878);
                            mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                            o0Var.g0(false);
                            i17 &= -29360129;
                        } else {
                            mapState3 = mapState2;
                        }
                        if (i28 != 0) {
                            onMapClickListener2 = null;
                        } else {
                            onMapClickListener2 = onMapClickListener;
                        }
                        if (i29 != 0) {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = null;
                        } else {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = onMapLongClickListener;
                        }
                        if (i30 != 0) {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                        } else {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = pVar;
                        }
                        q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar18 = qVarM135getLambda1$extension_compose_release;
                        composeMapInitOptions4 = composeMapInitOptions3;
                        rVar3 = rVar2;
                        qVar8 = qVarM136getLambda2$extension_compose_release;
                        qVar9 = qVarM138getLambda4$extension_compose_release;
                        qVar10 = qVar18;
                        i39 = i17;
                        qVar11 = qVarM137getLambda3$extension_compose_release;
                        onMapClickListener3 = onMapClickListener2;
                        mapState4 = mapState3;
                        mapViewportState4 = mapViewportState3;
                        mapViewportState5 = mapViewportState4;
                        mapState8 = mapState4;
                        o0Var2 = o0Var;
                        if (i36 != 0) {
                            qVar12 = null;
                            r15 = mapViewportState4;
                            mapState6 = mapState4;
                            r14 = o0Var;
                        } else {
                            qVar12 = qVar5;
                            r15 = mapViewportState5;
                            mapState6 = mapState8;
                            r14 = o0Var2;
                        }
                    } else {
                        if (i47 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if ((i16 & 2) != 0) {
                            cVar = (c) o0VarE.A(t1.f91490h);
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                            i17 &= -113;
                        } else {
                            composeMapInitOptions3 = composeMapInitOptions2;
                        }
                        if (i49 != 0) {
                            qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                        } else {
                            qVarM135getLambda1$extension_compose_release = qVar6;
                        }
                        if (i18 != 0) {
                            qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                        } else {
                            qVarM136getLambda2$extension_compose_release = qVar7;
                        }
                        if (i24 != 0) {
                            qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                        } else {
                            qVarM137getLambda3$extension_compose_release = qVar3;
                        }
                        if (i26 != 0) {
                            qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                        }
                        if ((i16 & 64) != 0) {
                            o0VarE.L(-135744814);
                            Object objD5 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                            o0 o0Var7 = o0VarE;
                            o0Var7.g0(false);
                            i17 &= -3670017;
                            mapViewportState3 = (MapViewportState) objD5;
                            o0Var = o0Var7;
                        } else {
                            o0Var = o0VarE;
                            mapViewportState3 = mapViewportState2;
                        }
                        if ((i16 & 128) != 0) {
                            o0Var.L(-231233878);
                            mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                            o0Var.g0(false);
                            i17 &= -29360129;
                        } else {
                            mapState3 = mapState2;
                        }
                        if (i28 != 0) {
                            onMapClickListener2 = null;
                        } else {
                            onMapClickListener2 = onMapClickListener;
                        }
                        if (i29 != 0) {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = null;
                        } else {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = onMapLongClickListener;
                        }
                        if (i30 != 0) {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                        } else {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = pVar;
                        }
                        q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar19 = qVarM135getLambda1$extension_compose_release;
                        composeMapInitOptions4 = composeMapInitOptions3;
                        rVar3 = rVar2;
                        qVar8 = qVarM136getLambda2$extension_compose_release;
                        qVar9 = qVarM138getLambda4$extension_compose_release;
                        qVar10 = qVar19;
                        i39 = i17;
                        qVar11 = qVarM137getLambda3$extension_compose_release;
                        onMapClickListener3 = onMapClickListener2;
                        mapState4 = mapState3;
                        mapViewportState4 = mapViewportState3;
                        mapViewportState5 = mapViewportState4;
                        mapState8 = mapState4;
                        o0Var2 = o0Var;
                        if (i36 != 0) {
                            qVar12 = null;
                            r15 = mapViewportState4;
                            mapState6 = mapState4;
                            r14 = o0Var;
                        } else {
                            qVar12 = qVar5;
                            r15 = mapViewportState5;
                            mapState6 = mapState8;
                            r14 = o0Var2;
                        }
                    }
                    r14.h0();
                    x1 x1Var4 = n.f135158a;
                    qVar13 = qVar12;
                    r14.L(658990358);
                    if (((Boolean) r14.A(l2.f91259a)).booleanValue()) {
                        MapPreviewPlaceholderKt.m207MapPreviewPlaceHolderRWsq2U(rVar3, 0L, 0, 0L, r14, i39 & 14, 14);
                        r14.g0(false);
                        p2VarI0 = r14.i0();
                        if (p2VarI0 == null) {
                            return;
                        }
                        p2VarI0.f135219d = new AnonymousClass2(rVar3, composeMapInitOptions4, qVar10, qVar8, qVar11, qVar9, r15, mapState6, onMapClickListener3, onMapLongClickListener2, pVarM139getLambda5$extension_compose_release, qVar13, i14, i15, i16);
                        return;
                    }
                    r14.g0(false);
                    r14.N(658990505, composeMapInitOptions4);
                    context = (Context) r14.A(AndroidCompositionLocals_androidKt.f6042b);
                    r14.L(-492369756);
                    objQ2 = r14.q();
                    aVar.getClass();
                    i44 = i39;
                    if (objQ2 == m.a.f135155b) {
                        ComposeTelemetryEvents.INSTANCE.getMap().increment();
                        objQ2 = new MapView(context, composeMapInitOptions4.getMapInitOptions$extension_compose_release(context));
                        r14.K(objQ2);
                    }
                    r14.g0(false);
                    mapView = (MapView) objQ2;
                    MapViewLifecycleKt.MapViewLifecycle(mapView, r14, 8);
                    r14.L(733328855);
                    h4.d.f81522a.getClass();
                    sVarE = c2.q.e(h4.d.a.f81524b, r14, 0);
                    r14.L(-1323940314);
                    cVar2 = (c) r14.A(t1.f91490h);
                    composeMapInitOptions5 = composeMapInitOptions4;
                    oVar = (g6.o) r14.A(t1.f91496n);
                    pVar2 = pVarM139getLambda5$extension_compose_release;
                    a4Var = (a4) r14.A(t1.f91502t);
                    g.V.getClass();
                    aVar2 = g.a.f81805b;
                    onMapLongClickListener3 = onMapLongClickListener2;
                    rVar4 = rVar3;
                    onMapClickListener4 = onMapClickListener3;
                    mapState7 = mapState6;
                    eVar = new z3.e(-2123382363, true, new n0(rVar3));
                    if (r14.f135177b != null) {
                        p0.l();
                        throw null;
                    }
                    r14.z();
                    if (r14.T) {
                        r14.M(aVar2);
                    } else {
                        r14.c();
                    }
                    r14.f135201z = false;
                    b4.c(g.a.f81810g, sVarE, r14);
                    b4.c(g.a.f81808e, cVar2, r14);
                    b4.c(g.a.f81811h, oVar, r14);
                    b4.c(g.a.f81812i, a4Var, r14);
                    r14.j();
                    eVar.invoke(g3.a(r14), r14, 0);
                    r14.L(2058660585);
                    r14.L(-2137368960);
                    u uVar4 = u.f22885a;
                    p002j6.c.b(new MapboxMapKt$MapboxMap$3$1(mapView), x2.d(h4.r.S, 1.0f), null, r14, 48, 4);
                    qVar10.invoke(new MapCompassScope(mapView, uVar4), r14, Integer.valueOf((i44 >> 3) & 112));
                    qVar8.invoke(new MapScaleBarScope(mapView, uVar4), r14, Integer.valueOf((i44 >> 6) & 112));
                    qVar11.invoke(new MapLogoScope(uVar4), r14, Integer.valueOf((i44 >> 9) & 112));
                    qVar9.invoke(new MapAttributionScope(mapView, uVar4), r14, Integer.valueOf((i44 >> 12) & 112));
                    r14.g0(false);
                    r14.g0(false);
                    r14.g0(true);
                    r14.g0(false);
                    r14.g0(false);
                    r14.N(658991134, r15);
                    r15.BindToMap$extension_compose_release(mapView, r14, ((i44 >> 15) & 112) | 8);
                    r14.g0(false);
                    ?? r112 = mapState7;
                    r14.N(658991220, r112);
                    r112.BindToMap$extension_compose_release(mapView.getMapboxMapDeprecated(), r14, ((i44 >> 18) & 112) | 8);
                    r14.g0(false);
                    onMapClickListener5 = onMapClickListener4;
                    qVar14 = qVar13;
                    l0.e(new AnonymousClass4(mapView, r14.g(), p0.q(onMapClickListener5, r14), p0.q(onMapLongClickListener3, r14), p0.q(pVar2, r14), p0.q(qVar14, r14), null), Unit.INSTANCE, r14);
                    r14.g0(false);
                    ?? r27 = r14;
                    onMapLongClickListener4 = onMapLongClickListener3;
                    r16 = r27;
                    pVar3 = pVar2;
                    composeMapInitOptions6 = composeMapInitOptions5;
                    rVar5 = rVar4;
                    r18 = r15;
                    r17 = r112;
                }
                p2VarI1 = r16.i0();
                if (p2VarI1 == null) {
                    return;
                }
                p2VarI1.f135219d = new AnonymousClass5(rVar5, composeMapInitOptions6, qVar10, qVar8, qVar11, qVar9, r18, r17, onMapClickListener5, onMapLongClickListener4, pVar3, qVar14, i14, i15, i16);
            }
            i17 |= 3072;
            qVar7 = qVar2;
            i24 = i16 & 16;
            if (i24 != 0) {
                i17 |= 24576;
            } else if ((i14 & 57344) == 0) {
                if (o0VarE.B(qVar3)) {
                    i25 = 16384;
                } else {
                    i25 = 8192;
                }
                i17 |= i25;
            }
            i26 = i16 & 32;
            if (i26 != 0) {
                i17 |= 196608;
                qVarM138getLambda4$extension_compose_release = qVar4;
            } else {
                qVarM138getLambda4$extension_compose_release = qVar4;
                if ((i14 & 458752) == 0) {
                    if (o0VarE.B(qVarM138getLambda4$extension_compose_release)) {
                        i27 = 131072;
                    } else {
                        i27 = 65536;
                    }
                    i17 |= i27;
                }
            }
            if ((i14 & 3670016) == 0) {
                MapViewportState mapViewportState7 = mapViewportState;
                if ((i16 & 64) == 0) {
                    i46 = 524288;
                } else {
                    i46 = 524288;
                }
                i17 |= i46;
                mapViewportState2 = mapViewportState7;
            } else {
                mapViewportState2 = mapViewportState;
            }
            if ((i14 & 29360128) == 0) {
                if ((i16 & 128) == 0) {
                    mapState11 = mapState;
                    if (o0VarE.B(mapState11)) {
                        mapState9 = mapState11;
                        i45 = 8388608;
                        mapState10 = mapState11;
                    }
                    i17 |= i45;
                    mapState2 = mapState10;
                } else {
                    mapState9 = mapState;
                }
                mapState9 = mapState11;
                i45 = 4194304;
                mapState10 = mapState9;
                i17 |= i45;
                mapState2 = mapState10;
            } else {
                mapState2 = mapState;
            }
            i28 = i16 & 256;
            if (i28 != 0) {
                i17 |= 33554432;
            }
            i29 = i16 & 512;
            if (i29 != 0) {
                i17 |= 268435456;
            }
            i30 = i16 & 1024;
            if (i30 != 0) {
                i34 = i15 | 6;
            } else if ((i15 & 14) == 0) {
                if (o0VarE.B(pVar)) {
                    i35 = 4;
                } else {
                    i35 = 2;
                }
                i34 = i15 | i35;
            } else {
                i34 = i15;
            }
            i36 = i16 & 2048;
            if (i36 != 0) {
                if ((i15 & 112) == 0) {
                    if (o0VarE.B(qVar5)) {
                        i37 = 32;
                    } else {
                        i37 = 16;
                    }
                    i34 |= i37;
                }
                if ((i16 & ViewUtils.EDGE_TO_EDGE_FLAGS) != 768) {
                    o0VarE.G0();
                    i38 = i14 & 1;
                    aVar = m.f135153a;
                    if (i38 != 0) {
                        if (i47 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if ((i16 & 2) != 0) {
                            cVar = (c) o0VarE.A(t1.f91490h);
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                            i17 &= -113;
                        } else {
                            composeMapInitOptions3 = composeMapInitOptions2;
                        }
                        if (i49 != 0) {
                            qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                        } else {
                            qVarM135getLambda1$extension_compose_release = qVar6;
                        }
                        if (i18 != 0) {
                            qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                        } else {
                            qVarM136getLambda2$extension_compose_release = qVar7;
                        }
                        if (i24 != 0) {
                            qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                        } else {
                            qVarM137getLambda3$extension_compose_release = qVar3;
                        }
                        if (i26 != 0) {
                            qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                        }
                        if ((i16 & 64) != 0) {
                            o0VarE.L(-135744814);
                            Object objD6 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                            o0 o0Var8 = o0VarE;
                            o0Var8.g0(false);
                            i17 &= -3670017;
                            mapViewportState3 = (MapViewportState) objD6;
                            o0Var = o0Var8;
                        } else {
                            o0Var = o0VarE;
                            mapViewportState3 = mapViewportState2;
                        }
                        if ((i16 & 128) != 0) {
                            o0Var.L(-231233878);
                            mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                            o0Var.g0(false);
                            i17 &= -29360129;
                        } else {
                            mapState3 = mapState2;
                        }
                        if (i28 != 0) {
                            onMapClickListener2 = null;
                        } else {
                            onMapClickListener2 = onMapClickListener;
                        }
                        if (i29 != 0) {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = null;
                        } else {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = onMapLongClickListener;
                        }
                        if (i30 != 0) {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                        } else {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = pVar;
                        }
                        q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar110 = qVarM135getLambda1$extension_compose_release;
                        composeMapInitOptions4 = composeMapInitOptions3;
                        rVar3 = rVar2;
                        qVar8 = qVarM136getLambda2$extension_compose_release;
                        qVar9 = qVarM138getLambda4$extension_compose_release;
                        qVar10 = qVar110;
                        i39 = i17;
                        qVar11 = qVarM137getLambda3$extension_compose_release;
                        onMapClickListener3 = onMapClickListener2;
                        mapState4 = mapState3;
                        mapViewportState4 = mapViewportState3;
                        mapViewportState5 = mapViewportState4;
                        mapState8 = mapState4;
                        o0Var2 = o0Var;
                        if (i36 != 0) {
                            qVar12 = null;
                            r15 = mapViewportState4;
                            mapState6 = mapState4;
                            r14 = o0Var;
                        } else {
                            qVar12 = qVar5;
                            r15 = mapViewportState5;
                            mapState6 = mapState8;
                            r14 = o0Var2;
                        }
                    } else {
                        if (i47 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if ((i16 & 2) != 0) {
                            cVar = (c) o0VarE.A(t1.f91490h);
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                            i17 &= -113;
                        } else {
                            composeMapInitOptions3 = composeMapInitOptions2;
                        }
                        if (i49 != 0) {
                            qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                        } else {
                            qVarM135getLambda1$extension_compose_release = qVar6;
                        }
                        if (i18 != 0) {
                            qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                        } else {
                            qVarM136getLambda2$extension_compose_release = qVar7;
                        }
                        if (i24 != 0) {
                            qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                        } else {
                            qVarM137getLambda3$extension_compose_release = qVar3;
                        }
                        if (i26 != 0) {
                            qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                        }
                        if ((i16 & 64) != 0) {
                            o0VarE.L(-135744814);
                            Object objD7 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                            o0 o0Var9 = o0VarE;
                            o0Var9.g0(false);
                            i17 &= -3670017;
                            mapViewportState3 = (MapViewportState) objD7;
                            o0Var = o0Var9;
                        } else {
                            o0Var = o0VarE;
                            mapViewportState3 = mapViewportState2;
                        }
                        if ((i16 & 128) != 0) {
                            o0Var.L(-231233878);
                            mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                            o0Var.g0(false);
                            i17 &= -29360129;
                        } else {
                            mapState3 = mapState2;
                        }
                        if (i28 != 0) {
                            onMapClickListener2 = null;
                        } else {
                            onMapClickListener2 = onMapClickListener;
                        }
                        if (i29 != 0) {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = null;
                        } else {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = onMapLongClickListener;
                        }
                        if (i30 != 0) {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                        } else {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = pVar;
                        }
                        q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar111 = qVarM135getLambda1$extension_compose_release;
                        composeMapInitOptions4 = composeMapInitOptions3;
                        rVar3 = rVar2;
                        qVar8 = qVarM136getLambda2$extension_compose_release;
                        qVar9 = qVarM138getLambda4$extension_compose_release;
                        qVar10 = qVar111;
                        i39 = i17;
                        qVar11 = qVarM137getLambda3$extension_compose_release;
                        onMapClickListener3 = onMapClickListener2;
                        mapState4 = mapState3;
                        mapViewportState4 = mapViewportState3;
                        mapViewportState5 = mapViewportState4;
                        mapState8 = mapState4;
                        o0Var2 = o0Var;
                        if (i36 != 0) {
                            qVar12 = null;
                            r15 = mapViewportState4;
                            mapState6 = mapState4;
                            r14 = o0Var;
                        } else {
                            qVar12 = qVar5;
                            r15 = mapViewportState5;
                            mapState6 = mapState8;
                            r14 = o0Var2;
                        }
                    }
                    r14.h0();
                    x1 x1Var5 = n.f135158a;
                    qVar13 = qVar12;
                    r14.L(658990358);
                    if (((Boolean) r14.A(l2.f91259a)).booleanValue()) {
                        MapPreviewPlaceholderKt.m207MapPreviewPlaceHolderRWsq2U(rVar3, 0L, 0, 0L, r14, i39 & 14, 14);
                        r14.g0(false);
                        p2VarI0 = r14.i0();
                        if (p2VarI0 == null) {
                            return;
                        }
                        p2VarI0.f135219d = new AnonymousClass2(rVar3, composeMapInitOptions4, qVar10, qVar8, qVar11, qVar9, r15, mapState6, onMapClickListener3, onMapLongClickListener2, pVarM139getLambda5$extension_compose_release, qVar13, i14, i15, i16);
                        return;
                    }
                    r14.g0(false);
                    r14.N(658990505, composeMapInitOptions4);
                    context = (Context) r14.A(AndroidCompositionLocals_androidKt.f6042b);
                    r14.L(-492369756);
                    objQ2 = r14.q();
                    aVar.getClass();
                    i44 = i39;
                    if (objQ2 == m.a.f135155b) {
                        ComposeTelemetryEvents.INSTANCE.getMap().increment();
                        objQ2 = new MapView(context, composeMapInitOptions4.getMapInitOptions$extension_compose_release(context));
                        r14.K(objQ2);
                    }
                    r14.g0(false);
                    mapView = (MapView) objQ2;
                    MapViewLifecycleKt.MapViewLifecycle(mapView, r14, 8);
                    r14.L(733328855);
                    h4.d.f81522a.getClass();
                    sVarE = c2.q.e(h4.d.a.f81524b, r14, 0);
                    r14.L(-1323940314);
                    cVar2 = (c) r14.A(t1.f91490h);
                    composeMapInitOptions5 = composeMapInitOptions4;
                    oVar = (g6.o) r14.A(t1.f91496n);
                    pVar2 = pVarM139getLambda5$extension_compose_release;
                    a4Var = (a4) r14.A(t1.f91502t);
                    g.V.getClass();
                    aVar2 = g.a.f81805b;
                    onMapLongClickListener3 = onMapLongClickListener2;
                    rVar4 = rVar3;
                    onMapClickListener4 = onMapClickListener3;
                    mapState7 = mapState6;
                    eVar = new z3.e(-2123382363, true, new n0(rVar3));
                    if (r14.f135177b != null) {
                        p0.l();
                        throw null;
                    }
                    r14.z();
                    if (r14.T) {
                        r14.M(aVar2);
                    } else {
                        r14.c();
                    }
                    r14.f135201z = false;
                    b4.c(g.a.f81810g, sVarE, r14);
                    b4.c(g.a.f81808e, cVar2, r14);
                    b4.c(g.a.f81811h, oVar, r14);
                    b4.c(g.a.f81812i, a4Var, r14);
                    r14.j();
                    eVar.invoke(g3.a(r14), r14, 0);
                    r14.L(2058660585);
                    r14.L(-2137368960);
                    u uVar5 = u.f22885a;
                    p002j6.c.b(new MapboxMapKt$MapboxMap$3$1(mapView), x2.d(h4.r.S, 1.0f), null, r14, 48, 4);
                    qVar10.invoke(new MapCompassScope(mapView, uVar5), r14, Integer.valueOf((i44 >> 3) & 112));
                    qVar8.invoke(new MapScaleBarScope(mapView, uVar5), r14, Integer.valueOf((i44 >> 6) & 112));
                    qVar11.invoke(new MapLogoScope(uVar5), r14, Integer.valueOf((i44 >> 9) & 112));
                    qVar9.invoke(new MapAttributionScope(mapView, uVar5), r14, Integer.valueOf((i44 >> 12) & 112));
                    r14.g0(false);
                    r14.g0(false);
                    r14.g0(true);
                    r14.g0(false);
                    r14.g0(false);
                    r14.N(658991134, r15);
                    r15.BindToMap$extension_compose_release(mapView, r14, ((i44 >> 15) & 112) | 8);
                    r14.g0(false);
                    ?? r113 = mapState7;
                    r14.N(658991220, r113);
                    r113.BindToMap$extension_compose_release(mapView.getMapboxMapDeprecated(), r14, ((i44 >> 18) & 112) | 8);
                    r14.g0(false);
                    onMapClickListener5 = onMapClickListener4;
                    qVar14 = qVar13;
                    l0.e(new AnonymousClass4(mapView, r14.g(), p0.q(onMapClickListener5, r14), p0.q(onMapLongClickListener3, r14), p0.q(pVar2, r14), p0.q(qVar14, r14), null), Unit.INSTANCE, r14);
                    r14.g0(false);
                    ?? r28 = r14;
                    onMapLongClickListener4 = onMapLongClickListener3;
                    r16 = r28;
                    pVar3 = pVar2;
                    composeMapInitOptions6 = composeMapInitOptions5;
                    rVar5 = rVar4;
                    r18 = r15;
                    r17 = r113;
                } else {
                    o0VarE.G0();
                    i38 = i14 & 1;
                    aVar = m.f135153a;
                    if (i38 != 0) {
                        if (i47 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if ((i16 & 2) != 0) {
                            cVar = (c) o0VarE.A(t1.f91490h);
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                            i17 &= -113;
                        } else {
                            composeMapInitOptions3 = composeMapInitOptions2;
                        }
                        if (i49 != 0) {
                            qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                        } else {
                            qVarM135getLambda1$extension_compose_release = qVar6;
                        }
                        if (i18 != 0) {
                            qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                        } else {
                            qVarM136getLambda2$extension_compose_release = qVar7;
                        }
                        if (i24 != 0) {
                            qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                        } else {
                            qVarM137getLambda3$extension_compose_release = qVar3;
                        }
                        if (i26 != 0) {
                            qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                        }
                        if ((i16 & 64) != 0) {
                            o0VarE.L(-135744814);
                            Object objD8 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                            o0 o0Var10 = o0VarE;
                            o0Var10.g0(false);
                            i17 &= -3670017;
                            mapViewportState3 = (MapViewportState) objD8;
                            o0Var = o0Var10;
                        } else {
                            o0Var = o0VarE;
                            mapViewportState3 = mapViewportState2;
                        }
                        if ((i16 & 128) != 0) {
                            o0Var.L(-231233878);
                            mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                            o0Var.g0(false);
                            i17 &= -29360129;
                        } else {
                            mapState3 = mapState2;
                        }
                        if (i28 != 0) {
                            onMapClickListener2 = null;
                        } else {
                            onMapClickListener2 = onMapClickListener;
                        }
                        if (i29 != 0) {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = null;
                        } else {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = onMapLongClickListener;
                        }
                        if (i30 != 0) {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                        } else {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = pVar;
                        }
                        q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar112 = qVarM135getLambda1$extension_compose_release;
                        composeMapInitOptions4 = composeMapInitOptions3;
                        rVar3 = rVar2;
                        qVar8 = qVarM136getLambda2$extension_compose_release;
                        qVar9 = qVarM138getLambda4$extension_compose_release;
                        qVar10 = qVar112;
                        i39 = i17;
                        qVar11 = qVarM137getLambda3$extension_compose_release;
                        onMapClickListener3 = onMapClickListener2;
                        mapState4 = mapState3;
                        mapViewportState4 = mapViewportState3;
                        mapViewportState5 = mapViewportState4;
                        mapState8 = mapState4;
                        o0Var2 = o0Var;
                        if (i36 != 0) {
                            qVar12 = null;
                            r15 = mapViewportState4;
                            mapState6 = mapState4;
                            r14 = o0Var;
                        } else {
                            qVar12 = qVar5;
                            r15 = mapViewportState5;
                            mapState6 = mapState8;
                            r14 = o0Var2;
                        }
                    } else {
                        if (i47 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if ((i16 & 2) != 0) {
                            cVar = (c) o0VarE.A(t1.f91490h);
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                            i17 &= -113;
                        } else {
                            composeMapInitOptions3 = composeMapInitOptions2;
                        }
                        if (i49 != 0) {
                            qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                        } else {
                            qVarM135getLambda1$extension_compose_release = qVar6;
                        }
                        if (i18 != 0) {
                            qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                        } else {
                            qVarM136getLambda2$extension_compose_release = qVar7;
                        }
                        if (i24 != 0) {
                            qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                        } else {
                            qVarM137getLambda3$extension_compose_release = qVar3;
                        }
                        if (i26 != 0) {
                            qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                        }
                        if ((i16 & 64) != 0) {
                            o0VarE.L(-135744814);
                            Object objD9 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                            o0 o0Var11 = o0VarE;
                            o0Var11.g0(false);
                            i17 &= -3670017;
                            mapViewportState3 = (MapViewportState) objD9;
                            o0Var = o0Var11;
                        } else {
                            o0Var = o0VarE;
                            mapViewportState3 = mapViewportState2;
                        }
                        if ((i16 & 128) != 0) {
                            o0Var.L(-231233878);
                            mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                            o0Var.g0(false);
                            i17 &= -29360129;
                        } else {
                            mapState3 = mapState2;
                        }
                        if (i28 != 0) {
                            onMapClickListener2 = null;
                        } else {
                            onMapClickListener2 = onMapClickListener;
                        }
                        if (i29 != 0) {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = null;
                        } else {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = onMapLongClickListener;
                        }
                        if (i30 != 0) {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                        } else {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = pVar;
                        }
                        q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar113 = qVarM135getLambda1$extension_compose_release;
                        composeMapInitOptions4 = composeMapInitOptions3;
                        rVar3 = rVar2;
                        qVar8 = qVarM136getLambda2$extension_compose_release;
                        qVar9 = qVarM138getLambda4$extension_compose_release;
                        qVar10 = qVar113;
                        i39 = i17;
                        qVar11 = qVarM137getLambda3$extension_compose_release;
                        onMapClickListener3 = onMapClickListener2;
                        mapState4 = mapState3;
                        mapViewportState4 = mapViewportState3;
                        mapViewportState5 = mapViewportState4;
                        mapState8 = mapState4;
                        o0Var2 = o0Var;
                        if (i36 != 0) {
                            qVar12 = null;
                            r15 = mapViewportState4;
                            mapState6 = mapState4;
                            r14 = o0Var;
                        } else {
                            qVar12 = qVar5;
                            r15 = mapViewportState5;
                            mapState6 = mapState8;
                            r14 = o0Var2;
                        }
                    }
                    r14.h0();
                    x1 x1Var6 = n.f135158a;
                    qVar13 = qVar12;
                    r14.L(658990358);
                    if (((Boolean) r14.A(l2.f91259a)).booleanValue()) {
                        MapPreviewPlaceholderKt.m207MapPreviewPlaceHolderRWsq2U(rVar3, 0L, 0, 0L, r14, i39 & 14, 14);
                        r14.g0(false);
                        p2VarI0 = r14.i0();
                        if (p2VarI0 == null) {
                            return;
                        }
                        p2VarI0.f135219d = new AnonymousClass2(rVar3, composeMapInitOptions4, qVar10, qVar8, qVar11, qVar9, r15, mapState6, onMapClickListener3, onMapLongClickListener2, pVarM139getLambda5$extension_compose_release, qVar13, i14, i15, i16);
                        return;
                    }
                    r14.g0(false);
                    r14.N(658990505, composeMapInitOptions4);
                    context = (Context) r14.A(AndroidCompositionLocals_androidKt.f6042b);
                    r14.L(-492369756);
                    objQ2 = r14.q();
                    aVar.getClass();
                    i44 = i39;
                    if (objQ2 == m.a.f135155b) {
                        ComposeTelemetryEvents.INSTANCE.getMap().increment();
                        objQ2 = new MapView(context, composeMapInitOptions4.getMapInitOptions$extension_compose_release(context));
                        r14.K(objQ2);
                    }
                    r14.g0(false);
                    mapView = (MapView) objQ2;
                    MapViewLifecycleKt.MapViewLifecycle(mapView, r14, 8);
                    r14.L(733328855);
                    h4.d.f81522a.getClass();
                    sVarE = c2.q.e(h4.d.a.f81524b, r14, 0);
                    r14.L(-1323940314);
                    cVar2 = (c) r14.A(t1.f91490h);
                    composeMapInitOptions5 = composeMapInitOptions4;
                    oVar = (g6.o) r14.A(t1.f91496n);
                    pVar2 = pVarM139getLambda5$extension_compose_release;
                    a4Var = (a4) r14.A(t1.f91502t);
                    g.V.getClass();
                    aVar2 = g.a.f81805b;
                    onMapLongClickListener3 = onMapLongClickListener2;
                    rVar4 = rVar3;
                    onMapClickListener4 = onMapClickListener3;
                    mapState7 = mapState6;
                    eVar = new z3.e(-2123382363, true, new n0(rVar3));
                    if (r14.f135177b != null) {
                        p0.l();
                        throw null;
                    }
                    r14.z();
                    if (r14.T) {
                        r14.M(aVar2);
                    } else {
                        r14.c();
                    }
                    r14.f135201z = false;
                    b4.c(g.a.f81810g, sVarE, r14);
                    b4.c(g.a.f81808e, cVar2, r14);
                    b4.c(g.a.f81811h, oVar, r14);
                    b4.c(g.a.f81812i, a4Var, r14);
                    r14.j();
                    eVar.invoke(g3.a(r14), r14, 0);
                    r14.L(2058660585);
                    r14.L(-2137368960);
                    u uVar6 = u.f22885a;
                    p002j6.c.b(new MapboxMapKt$MapboxMap$3$1(mapView), x2.d(h4.r.S, 1.0f), null, r14, 48, 4);
                    qVar10.invoke(new MapCompassScope(mapView, uVar6), r14, Integer.valueOf((i44 >> 3) & 112));
                    qVar8.invoke(new MapScaleBarScope(mapView, uVar6), r14, Integer.valueOf((i44 >> 6) & 112));
                    qVar11.invoke(new MapLogoScope(uVar6), r14, Integer.valueOf((i44 >> 9) & 112));
                    qVar9.invoke(new MapAttributionScope(mapView, uVar6), r14, Integer.valueOf((i44 >> 12) & 112));
                    r14.g0(false);
                    r14.g0(false);
                    r14.g0(true);
                    r14.g0(false);
                    r14.g0(false);
                    r14.N(658991134, r15);
                    r15.BindToMap$extension_compose_release(mapView, r14, ((i44 >> 15) & 112) | 8);
                    r14.g0(false);
                    ?? r114 = mapState7;
                    r14.N(658991220, r114);
                    r114.BindToMap$extension_compose_release(mapView.getMapboxMapDeprecated(), r14, ((i44 >> 18) & 112) | 8);
                    r14.g0(false);
                    onMapClickListener5 = onMapClickListener4;
                    qVar14 = qVar13;
                    l0.e(new AnonymousClass4(mapView, r14.g(), p0.q(onMapClickListener5, r14), p0.q(onMapLongClickListener3, r14), p0.q(pVar2, r14), p0.q(qVar14, r14), null), Unit.INSTANCE, r14);
                    r14.g0(false);
                    ?? r29 = r14;
                    onMapLongClickListener4 = onMapLongClickListener3;
                    r16 = r29;
                    pVar3 = pVar2;
                    composeMapInitOptions6 = composeMapInitOptions5;
                    rVar5 = rVar4;
                    r18 = r15;
                    r17 = r114;
                }
                p2VarI1 = r16.i0();
                if (p2VarI1 == null) {
                    return;
                }
                p2VarI1.f135219d = new AnonymousClass5(rVar5, composeMapInitOptions6, qVar10, qVar8, qVar11, qVar9, r18, r17, onMapClickListener5, onMapLongClickListener4, pVar3, qVar14, i14, i15, i16);
            }
            i34 |= 48;
            if ((i16 & ViewUtils.EDGE_TO_EDGE_FLAGS) != 768) {
                o0VarE.G0();
                i38 = i14 & 1;
                aVar = m.f135153a;
                if (i38 != 0) {
                    if (i47 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if ((i16 & 2) != 0) {
                        cVar = (c) o0VarE.A(t1.f91490h);
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                        i17 &= -113;
                    } else {
                        composeMapInitOptions3 = composeMapInitOptions2;
                    }
                    if (i49 != 0) {
                        qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                    } else {
                        qVarM135getLambda1$extension_compose_release = qVar6;
                    }
                    if (i18 != 0) {
                        qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                    } else {
                        qVarM136getLambda2$extension_compose_release = qVar7;
                    }
                    if (i24 != 0) {
                        qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                    } else {
                        qVarM137getLambda3$extension_compose_release = qVar3;
                    }
                    if (i26 != 0) {
                        qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                    }
                    if ((i16 & 64) != 0) {
                        o0VarE.L(-135744814);
                        Object objD10 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                        o0 o0Var12 = o0VarE;
                        o0Var12.g0(false);
                        i17 &= -3670017;
                        mapViewportState3 = (MapViewportState) objD10;
                        o0Var = o0Var12;
                    } else {
                        o0Var = o0VarE;
                        mapViewportState3 = mapViewportState2;
                    }
                    if ((i16 & 128) != 0) {
                        o0Var.L(-231233878);
                        mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                        o0Var.g0(false);
                        i17 &= -29360129;
                    } else {
                        mapState3 = mapState2;
                    }
                    if (i28 != 0) {
                        onMapClickListener2 = null;
                    } else {
                        onMapClickListener2 = onMapClickListener;
                    }
                    if (i29 != 0) {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = null;
                    } else {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = onMapLongClickListener;
                    }
                    if (i30 != 0) {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                    } else {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = pVar;
                    }
                    q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar114 = qVarM135getLambda1$extension_compose_release;
                    composeMapInitOptions4 = composeMapInitOptions3;
                    rVar3 = rVar2;
                    qVar8 = qVarM136getLambda2$extension_compose_release;
                    qVar9 = qVarM138getLambda4$extension_compose_release;
                    qVar10 = qVar114;
                    i39 = i17;
                    qVar11 = qVarM137getLambda3$extension_compose_release;
                    onMapClickListener3 = onMapClickListener2;
                    mapState4 = mapState3;
                    mapViewportState4 = mapViewportState3;
                    mapViewportState5 = mapViewportState4;
                    mapState8 = mapState4;
                    o0Var2 = o0Var;
                    if (i36 != 0) {
                        qVar12 = null;
                        r15 = mapViewportState4;
                        mapState6 = mapState4;
                        r14 = o0Var;
                    } else {
                        qVar12 = qVar5;
                        r15 = mapViewportState5;
                        mapState6 = mapState8;
                        r14 = o0Var2;
                    }
                } else {
                    if (i47 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if ((i16 & 2) != 0) {
                        cVar = (c) o0VarE.A(t1.f91490h);
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                        i17 &= -113;
                    } else {
                        composeMapInitOptions3 = composeMapInitOptions2;
                    }
                    if (i49 != 0) {
                        qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                    } else {
                        qVarM135getLambda1$extension_compose_release = qVar6;
                    }
                    if (i18 != 0) {
                        qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                    } else {
                        qVarM136getLambda2$extension_compose_release = qVar7;
                    }
                    if (i24 != 0) {
                        qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                    } else {
                        qVarM137getLambda3$extension_compose_release = qVar3;
                    }
                    if (i26 != 0) {
                        qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                    }
                    if ((i16 & 64) != 0) {
                        o0VarE.L(-135744814);
                        Object objD11 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                        o0 o0Var13 = o0VarE;
                        o0Var13.g0(false);
                        i17 &= -3670017;
                        mapViewportState3 = (MapViewportState) objD11;
                        o0Var = o0Var13;
                    } else {
                        o0Var = o0VarE;
                        mapViewportState3 = mapViewportState2;
                    }
                    if ((i16 & 128) != 0) {
                        o0Var.L(-231233878);
                        mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                        o0Var.g0(false);
                        i17 &= -29360129;
                    } else {
                        mapState3 = mapState2;
                    }
                    if (i28 != 0) {
                        onMapClickListener2 = null;
                    } else {
                        onMapClickListener2 = onMapClickListener;
                    }
                    if (i29 != 0) {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = null;
                    } else {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = onMapLongClickListener;
                    }
                    if (i30 != 0) {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                    } else {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = pVar;
                    }
                    q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar115 = qVarM135getLambda1$extension_compose_release;
                    composeMapInitOptions4 = composeMapInitOptions3;
                    rVar3 = rVar2;
                    qVar8 = qVarM136getLambda2$extension_compose_release;
                    qVar9 = qVarM138getLambda4$extension_compose_release;
                    qVar10 = qVar115;
                    i39 = i17;
                    qVar11 = qVarM137getLambda3$extension_compose_release;
                    onMapClickListener3 = onMapClickListener2;
                    mapState4 = mapState3;
                    mapViewportState4 = mapViewportState3;
                    mapViewportState5 = mapViewportState4;
                    mapState8 = mapState4;
                    o0Var2 = o0Var;
                    if (i36 != 0) {
                        qVar12 = null;
                        r15 = mapViewportState4;
                        mapState6 = mapState4;
                        r14 = o0Var;
                    } else {
                        qVar12 = qVar5;
                        r15 = mapViewportState5;
                        mapState6 = mapState8;
                        r14 = o0Var2;
                    }
                }
                r14.h0();
                x1 x1Var7 = n.f135158a;
                qVar13 = qVar12;
                r14.L(658990358);
                if (((Boolean) r14.A(l2.f91259a)).booleanValue()) {
                    MapPreviewPlaceholderKt.m207MapPreviewPlaceHolderRWsq2U(rVar3, 0L, 0, 0L, r14, i39 & 14, 14);
                    r14.g0(false);
                    p2VarI0 = r14.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    p2VarI0.f135219d = new AnonymousClass2(rVar3, composeMapInitOptions4, qVar10, qVar8, qVar11, qVar9, r15, mapState6, onMapClickListener3, onMapLongClickListener2, pVarM139getLambda5$extension_compose_release, qVar13, i14, i15, i16);
                    return;
                }
                r14.g0(false);
                r14.N(658990505, composeMapInitOptions4);
                context = (Context) r14.A(AndroidCompositionLocals_androidKt.f6042b);
                r14.L(-492369756);
                objQ2 = r14.q();
                aVar.getClass();
                i44 = i39;
                if (objQ2 == m.a.f135155b) {
                    ComposeTelemetryEvents.INSTANCE.getMap().increment();
                    objQ2 = new MapView(context, composeMapInitOptions4.getMapInitOptions$extension_compose_release(context));
                    r14.K(objQ2);
                }
                r14.g0(false);
                mapView = (MapView) objQ2;
                MapViewLifecycleKt.MapViewLifecycle(mapView, r14, 8);
                r14.L(733328855);
                h4.d.f81522a.getClass();
                sVarE = c2.q.e(h4.d.a.f81524b, r14, 0);
                r14.L(-1323940314);
                cVar2 = (c) r14.A(t1.f91490h);
                composeMapInitOptions5 = composeMapInitOptions4;
                oVar = (g6.o) r14.A(t1.f91496n);
                pVar2 = pVarM139getLambda5$extension_compose_release;
                a4Var = (a4) r14.A(t1.f91502t);
                g.V.getClass();
                aVar2 = g.a.f81805b;
                onMapLongClickListener3 = onMapLongClickListener2;
                rVar4 = rVar3;
                onMapClickListener4 = onMapClickListener3;
                mapState7 = mapState6;
                eVar = new z3.e(-2123382363, true, new n0(rVar3));
                if (r14.f135177b != null) {
                    p0.l();
                    throw null;
                }
                r14.z();
                if (r14.T) {
                    r14.M(aVar2);
                } else {
                    r14.c();
                }
                r14.f135201z = false;
                b4.c(g.a.f81810g, sVarE, r14);
                b4.c(g.a.f81808e, cVar2, r14);
                b4.c(g.a.f81811h, oVar, r14);
                b4.c(g.a.f81812i, a4Var, r14);
                r14.j();
                eVar.invoke(g3.a(r14), r14, 0);
                r14.L(2058660585);
                r14.L(-2137368960);
                u uVar7 = u.f22885a;
                p002j6.c.b(new MapboxMapKt$MapboxMap$3$1(mapView), x2.d(h4.r.S, 1.0f), null, r14, 48, 4);
                qVar10.invoke(new MapCompassScope(mapView, uVar7), r14, Integer.valueOf((i44 >> 3) & 112));
                qVar8.invoke(new MapScaleBarScope(mapView, uVar7), r14, Integer.valueOf((i44 >> 6) & 112));
                qVar11.invoke(new MapLogoScope(uVar7), r14, Integer.valueOf((i44 >> 9) & 112));
                qVar9.invoke(new MapAttributionScope(mapView, uVar7), r14, Integer.valueOf((i44 >> 12) & 112));
                r14.g0(false);
                r14.g0(false);
                r14.g0(true);
                r14.g0(false);
                r14.g0(false);
                r14.N(658991134, r15);
                r15.BindToMap$extension_compose_release(mapView, r14, ((i44 >> 15) & 112) | 8);
                r14.g0(false);
                ?? r115 = mapState7;
                r14.N(658991220, r115);
                r115.BindToMap$extension_compose_release(mapView.getMapboxMapDeprecated(), r14, ((i44 >> 18) & 112) | 8);
                r14.g0(false);
                onMapClickListener5 = onMapClickListener4;
                qVar14 = qVar13;
                l0.e(new AnonymousClass4(mapView, r14.g(), p0.q(onMapClickListener5, r14), p0.q(onMapLongClickListener3, r14), p0.q(pVar2, r14), p0.q(qVar14, r14), null), Unit.INSTANCE, r14);
                r14.g0(false);
                ?? r210 = r14;
                onMapLongClickListener4 = onMapLongClickListener3;
                r16 = r210;
                pVar3 = pVar2;
                composeMapInitOptions6 = composeMapInitOptions5;
                rVar5 = rVar4;
                r18 = r15;
                r17 = r115;
            } else {
                o0VarE.G0();
                i38 = i14 & 1;
                aVar = m.f135153a;
                if (i38 != 0) {
                    if (i47 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if ((i16 & 2) != 0) {
                        cVar = (c) o0VarE.A(t1.f91490h);
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                        i17 &= -113;
                    } else {
                        composeMapInitOptions3 = composeMapInitOptions2;
                    }
                    if (i49 != 0) {
                        qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                    } else {
                        qVarM135getLambda1$extension_compose_release = qVar6;
                    }
                    if (i18 != 0) {
                        qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                    } else {
                        qVarM136getLambda2$extension_compose_release = qVar7;
                    }
                    if (i24 != 0) {
                        qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                    } else {
                        qVarM137getLambda3$extension_compose_release = qVar3;
                    }
                    if (i26 != 0) {
                        qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                    }
                    if ((i16 & 64) != 0) {
                        o0VarE.L(-135744814);
                        Object objD12 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                        o0 o0Var14 = o0VarE;
                        o0Var14.g0(false);
                        i17 &= -3670017;
                        mapViewportState3 = (MapViewportState) objD12;
                        o0Var = o0Var14;
                    } else {
                        o0Var = o0VarE;
                        mapViewportState3 = mapViewportState2;
                    }
                    if ((i16 & 128) != 0) {
                        o0Var.L(-231233878);
                        mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                        o0Var.g0(false);
                        i17 &= -29360129;
                    } else {
                        mapState3 = mapState2;
                    }
                    if (i28 != 0) {
                        onMapClickListener2 = null;
                    } else {
                        onMapClickListener2 = onMapClickListener;
                    }
                    if (i29 != 0) {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = null;
                    } else {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = onMapLongClickListener;
                    }
                    if (i30 != 0) {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                    } else {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = pVar;
                    }
                    q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar116 = qVarM135getLambda1$extension_compose_release;
                    composeMapInitOptions4 = composeMapInitOptions3;
                    rVar3 = rVar2;
                    qVar8 = qVarM136getLambda2$extension_compose_release;
                    qVar9 = qVarM138getLambda4$extension_compose_release;
                    qVar10 = qVar116;
                    i39 = i17;
                    qVar11 = qVarM137getLambda3$extension_compose_release;
                    onMapClickListener3 = onMapClickListener2;
                    mapState4 = mapState3;
                    mapViewportState4 = mapViewportState3;
                    mapViewportState5 = mapViewportState4;
                    mapState8 = mapState4;
                    o0Var2 = o0Var;
                    if (i36 != 0) {
                        qVar12 = null;
                        r15 = mapViewportState4;
                        mapState6 = mapState4;
                        r14 = o0Var;
                    } else {
                        qVar12 = qVar5;
                        r15 = mapViewportState5;
                        mapState6 = mapState8;
                        r14 = o0Var2;
                    }
                } else {
                    if (i47 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if ((i16 & 2) != 0) {
                        cVar = (c) o0VarE.A(t1.f91490h);
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                        i17 &= -113;
                    } else {
                        composeMapInitOptions3 = composeMapInitOptions2;
                    }
                    if (i49 != 0) {
                        qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                    } else {
                        qVarM135getLambda1$extension_compose_release = qVar6;
                    }
                    if (i18 != 0) {
                        qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                    } else {
                        qVarM136getLambda2$extension_compose_release = qVar7;
                    }
                    if (i24 != 0) {
                        qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                    } else {
                        qVarM137getLambda3$extension_compose_release = qVar3;
                    }
                    if (i26 != 0) {
                        qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                    }
                    if ((i16 & 64) != 0) {
                        o0VarE.L(-135744814);
                        Object objD13 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                        o0 o0Var15 = o0VarE;
                        o0Var15.g0(false);
                        i17 &= -3670017;
                        mapViewportState3 = (MapViewportState) objD13;
                        o0Var = o0Var15;
                    } else {
                        o0Var = o0VarE;
                        mapViewportState3 = mapViewportState2;
                    }
                    if ((i16 & 128) != 0) {
                        o0Var.L(-231233878);
                        mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                        o0Var.g0(false);
                        i17 &= -29360129;
                    } else {
                        mapState3 = mapState2;
                    }
                    if (i28 != 0) {
                        onMapClickListener2 = null;
                    } else {
                        onMapClickListener2 = onMapClickListener;
                    }
                    if (i29 != 0) {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = null;
                    } else {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = onMapLongClickListener;
                    }
                    if (i30 != 0) {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                    } else {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = pVar;
                    }
                    q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar117 = qVarM135getLambda1$extension_compose_release;
                    composeMapInitOptions4 = composeMapInitOptions3;
                    rVar3 = rVar2;
                    qVar8 = qVarM136getLambda2$extension_compose_release;
                    qVar9 = qVarM138getLambda4$extension_compose_release;
                    qVar10 = qVar117;
                    i39 = i17;
                    qVar11 = qVarM137getLambda3$extension_compose_release;
                    onMapClickListener3 = onMapClickListener2;
                    mapState4 = mapState3;
                    mapViewportState4 = mapViewportState3;
                    mapViewportState5 = mapViewportState4;
                    mapState8 = mapState4;
                    o0Var2 = o0Var;
                    if (i36 != 0) {
                        qVar12 = null;
                        r15 = mapViewportState4;
                        mapState6 = mapState4;
                        r14 = o0Var;
                    } else {
                        qVar12 = qVar5;
                        r15 = mapViewportState5;
                        mapState6 = mapState8;
                        r14 = o0Var2;
                    }
                }
                r14.h0();
                x1 x1Var8 = n.f135158a;
                qVar13 = qVar12;
                r14.L(658990358);
                if (((Boolean) r14.A(l2.f91259a)).booleanValue()) {
                    MapPreviewPlaceholderKt.m207MapPreviewPlaceHolderRWsq2U(rVar3, 0L, 0, 0L, r14, i39 & 14, 14);
                    r14.g0(false);
                    p2VarI0 = r14.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    p2VarI0.f135219d = new AnonymousClass2(rVar3, composeMapInitOptions4, qVar10, qVar8, qVar11, qVar9, r15, mapState6, onMapClickListener3, onMapLongClickListener2, pVarM139getLambda5$extension_compose_release, qVar13, i14, i15, i16);
                    return;
                }
                r14.g0(false);
                r14.N(658990505, composeMapInitOptions4);
                context = (Context) r14.A(AndroidCompositionLocals_androidKt.f6042b);
                r14.L(-492369756);
                objQ2 = r14.q();
                aVar.getClass();
                i44 = i39;
                if (objQ2 == m.a.f135155b) {
                    ComposeTelemetryEvents.INSTANCE.getMap().increment();
                    objQ2 = new MapView(context, composeMapInitOptions4.getMapInitOptions$extension_compose_release(context));
                    r14.K(objQ2);
                }
                r14.g0(false);
                mapView = (MapView) objQ2;
                MapViewLifecycleKt.MapViewLifecycle(mapView, r14, 8);
                r14.L(733328855);
                h4.d.f81522a.getClass();
                sVarE = c2.q.e(h4.d.a.f81524b, r14, 0);
                r14.L(-1323940314);
                cVar2 = (c) r14.A(t1.f91490h);
                composeMapInitOptions5 = composeMapInitOptions4;
                oVar = (g6.o) r14.A(t1.f91496n);
                pVar2 = pVarM139getLambda5$extension_compose_release;
                a4Var = (a4) r14.A(t1.f91502t);
                g.V.getClass();
                aVar2 = g.a.f81805b;
                onMapLongClickListener3 = onMapLongClickListener2;
                rVar4 = rVar3;
                onMapClickListener4 = onMapClickListener3;
                mapState7 = mapState6;
                eVar = new z3.e(-2123382363, true, new n0(rVar3));
                if (r14.f135177b != null) {
                    p0.l();
                    throw null;
                }
                r14.z();
                if (r14.T) {
                    r14.M(aVar2);
                } else {
                    r14.c();
                }
                r14.f135201z = false;
                b4.c(g.a.f81810g, sVarE, r14);
                b4.c(g.a.f81808e, cVar2, r14);
                b4.c(g.a.f81811h, oVar, r14);
                b4.c(g.a.f81812i, a4Var, r14);
                r14.j();
                eVar.invoke(g3.a(r14), r14, 0);
                r14.L(2058660585);
                r14.L(-2137368960);
                u uVar8 = u.f22885a;
                p002j6.c.b(new MapboxMapKt$MapboxMap$3$1(mapView), x2.d(h4.r.S, 1.0f), null, r14, 48, 4);
                qVar10.invoke(new MapCompassScope(mapView, uVar8), r14, Integer.valueOf((i44 >> 3) & 112));
                qVar8.invoke(new MapScaleBarScope(mapView, uVar8), r14, Integer.valueOf((i44 >> 6) & 112));
                qVar11.invoke(new MapLogoScope(uVar8), r14, Integer.valueOf((i44 >> 9) & 112));
                qVar9.invoke(new MapAttributionScope(mapView, uVar8), r14, Integer.valueOf((i44 >> 12) & 112));
                r14.g0(false);
                r14.g0(false);
                r14.g0(true);
                r14.g0(false);
                r14.g0(false);
                r14.N(658991134, r15);
                r15.BindToMap$extension_compose_release(mapView, r14, ((i44 >> 15) & 112) | 8);
                r14.g0(false);
                ?? r116 = mapState7;
                r14.N(658991220, r116);
                r116.BindToMap$extension_compose_release(mapView.getMapboxMapDeprecated(), r14, ((i44 >> 18) & 112) | 8);
                r14.g0(false);
                onMapClickListener5 = onMapClickListener4;
                qVar14 = qVar13;
                l0.e(new AnonymousClass4(mapView, r14.g(), p0.q(onMapClickListener5, r14), p0.q(onMapLongClickListener3, r14), p0.q(pVar2, r14), p0.q(qVar14, r14), null), Unit.INSTANCE, r14);
                r14.g0(false);
                ?? r211 = r14;
                onMapLongClickListener4 = onMapLongClickListener3;
                r16 = r211;
                pVar3 = pVar2;
                composeMapInitOptions6 = composeMapInitOptions5;
                rVar5 = rVar4;
                r18 = r15;
                r17 = r116;
            }
            p2VarI1 = r16.i0();
            if (p2VarI1 == null) {
                return;
            }
            p2VarI1.f135219d = new AnonymousClass5(rVar5, composeMapInitOptions6, qVar10, qVar8, qVar11, qVar9, r18, r17, onMapClickListener5, onMapLongClickListener4, pVar3, qVar14, i14, i15, i16);
        }
        i17 |= 384;
        qVar6 = qVar;
        i18 = i16 & 8;
        if (i18 != 0) {
            if ((i14 & 7168) == 0) {
                qVar7 = qVar2;
                if (o0VarE.B(qVar7)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            i24 = i16 & 16;
            if (i24 != 0) {
                i17 |= 24576;
            } else if ((i14 & 57344) == 0) {
                if (o0VarE.B(qVar3)) {
                    i25 = 16384;
                } else {
                    i25 = 8192;
                }
                i17 |= i25;
            }
            i26 = i16 & 32;
            if (i26 != 0) {
                i17 |= 196608;
                qVarM138getLambda4$extension_compose_release = qVar4;
            } else {
                qVarM138getLambda4$extension_compose_release = qVar4;
                if ((i14 & 458752) == 0) {
                    if (o0VarE.B(qVarM138getLambda4$extension_compose_release)) {
                        i27 = 131072;
                    } else {
                        i27 = 65536;
                    }
                    i17 |= i27;
                }
            }
            if ((i14 & 3670016) == 0) {
                MapViewportState mapViewportState8 = mapViewportState;
                if ((i16 & 64) == 0) {
                    i46 = 524288;
                } else {
                    i46 = 524288;
                }
                i17 |= i46;
                mapViewportState2 = mapViewportState8;
            } else {
                mapViewportState2 = mapViewportState;
            }
            if ((i14 & 29360128) == 0) {
                if ((i16 & 128) == 0) {
                    mapState11 = mapState;
                    if (o0VarE.B(mapState11)) {
                        mapState9 = mapState11;
                        i45 = 8388608;
                        mapState10 = mapState11;
                    }
                    i17 |= i45;
                    mapState2 = mapState10;
                } else {
                    mapState9 = mapState;
                }
                mapState9 = mapState11;
                i45 = 4194304;
                mapState10 = mapState9;
                i17 |= i45;
                mapState2 = mapState10;
            } else {
                mapState2 = mapState;
            }
            i28 = i16 & 256;
            if (i28 != 0) {
                i17 |= 33554432;
            }
            i29 = i16 & 512;
            if (i29 != 0) {
                i17 |= 268435456;
            }
            i30 = i16 & 1024;
            if (i30 != 0) {
                i34 = i15 | 6;
            } else if ((i15 & 14) == 0) {
                if (o0VarE.B(pVar)) {
                    i35 = 4;
                } else {
                    i35 = 2;
                }
                i34 = i15 | i35;
            } else {
                i34 = i15;
            }
            i36 = i16 & 2048;
            if (i36 != 0) {
                if ((i15 & 112) == 0) {
                    if (o0VarE.B(qVar5)) {
                        i37 = 32;
                    } else {
                        i37 = 16;
                    }
                    i34 |= i37;
                }
                if ((i16 & ViewUtils.EDGE_TO_EDGE_FLAGS) != 768) {
                    o0VarE.G0();
                    i38 = i14 & 1;
                    aVar = m.f135153a;
                    if (i38 != 0) {
                        if (i47 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if ((i16 & 2) != 0) {
                            cVar = (c) o0VarE.A(t1.f91490h);
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                            i17 &= -113;
                        } else {
                            composeMapInitOptions3 = composeMapInitOptions2;
                        }
                        if (i49 != 0) {
                            qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                        } else {
                            qVarM135getLambda1$extension_compose_release = qVar6;
                        }
                        if (i18 != 0) {
                            qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                        } else {
                            qVarM136getLambda2$extension_compose_release = qVar7;
                        }
                        if (i24 != 0) {
                            qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                        } else {
                            qVarM137getLambda3$extension_compose_release = qVar3;
                        }
                        if (i26 != 0) {
                            qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                        }
                        if ((i16 & 64) != 0) {
                            o0VarE.L(-135744814);
                            Object objD14 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                            o0 o0Var16 = o0VarE;
                            o0Var16.g0(false);
                            i17 &= -3670017;
                            mapViewportState3 = (MapViewportState) objD14;
                            o0Var = o0Var16;
                        } else {
                            o0Var = o0VarE;
                            mapViewportState3 = mapViewportState2;
                        }
                        if ((i16 & 128) != 0) {
                            o0Var.L(-231233878);
                            mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                            o0Var.g0(false);
                            i17 &= -29360129;
                        } else {
                            mapState3 = mapState2;
                        }
                        if (i28 != 0) {
                            onMapClickListener2 = null;
                        } else {
                            onMapClickListener2 = onMapClickListener;
                        }
                        if (i29 != 0) {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = null;
                        } else {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = onMapLongClickListener;
                        }
                        if (i30 != 0) {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                        } else {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = pVar;
                        }
                        q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar118 = qVarM135getLambda1$extension_compose_release;
                        composeMapInitOptions4 = composeMapInitOptions3;
                        rVar3 = rVar2;
                        qVar8 = qVarM136getLambda2$extension_compose_release;
                        qVar9 = qVarM138getLambda4$extension_compose_release;
                        qVar10 = qVar118;
                        i39 = i17;
                        qVar11 = qVarM137getLambda3$extension_compose_release;
                        onMapClickListener3 = onMapClickListener2;
                        mapState4 = mapState3;
                        mapViewportState4 = mapViewportState3;
                        mapViewportState5 = mapViewportState4;
                        mapState8 = mapState4;
                        o0Var2 = o0Var;
                        if (i36 != 0) {
                            qVar12 = null;
                            r15 = mapViewportState4;
                            mapState6 = mapState4;
                            r14 = o0Var;
                        } else {
                            qVar12 = qVar5;
                            r15 = mapViewportState5;
                            mapState6 = mapState8;
                            r14 = o0Var2;
                        }
                    } else {
                        if (i47 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if ((i16 & 2) != 0) {
                            cVar = (c) o0VarE.A(t1.f91490h);
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                            i17 &= -113;
                        } else {
                            composeMapInitOptions3 = composeMapInitOptions2;
                        }
                        if (i49 != 0) {
                            qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                        } else {
                            qVarM135getLambda1$extension_compose_release = qVar6;
                        }
                        if (i18 != 0) {
                            qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                        } else {
                            qVarM136getLambda2$extension_compose_release = qVar7;
                        }
                        if (i24 != 0) {
                            qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                        } else {
                            qVarM137getLambda3$extension_compose_release = qVar3;
                        }
                        if (i26 != 0) {
                            qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                        }
                        if ((i16 & 64) != 0) {
                            o0VarE.L(-135744814);
                            Object objD15 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                            o0 o0Var17 = o0VarE;
                            o0Var17.g0(false);
                            i17 &= -3670017;
                            mapViewportState3 = (MapViewportState) objD15;
                            o0Var = o0Var17;
                        } else {
                            o0Var = o0VarE;
                            mapViewportState3 = mapViewportState2;
                        }
                        if ((i16 & 128) != 0) {
                            o0Var.L(-231233878);
                            mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                            o0Var.g0(false);
                            i17 &= -29360129;
                        } else {
                            mapState3 = mapState2;
                        }
                        if (i28 != 0) {
                            onMapClickListener2 = null;
                        } else {
                            onMapClickListener2 = onMapClickListener;
                        }
                        if (i29 != 0) {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = null;
                        } else {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = onMapLongClickListener;
                        }
                        if (i30 != 0) {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                        } else {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = pVar;
                        }
                        q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar119 = qVarM135getLambda1$extension_compose_release;
                        composeMapInitOptions4 = composeMapInitOptions3;
                        rVar3 = rVar2;
                        qVar8 = qVarM136getLambda2$extension_compose_release;
                        qVar9 = qVarM138getLambda4$extension_compose_release;
                        qVar10 = qVar119;
                        i39 = i17;
                        qVar11 = qVarM137getLambda3$extension_compose_release;
                        onMapClickListener3 = onMapClickListener2;
                        mapState4 = mapState3;
                        mapViewportState4 = mapViewportState3;
                        mapViewportState5 = mapViewportState4;
                        mapState8 = mapState4;
                        o0Var2 = o0Var;
                        if (i36 != 0) {
                            qVar12 = null;
                            r15 = mapViewportState4;
                            mapState6 = mapState4;
                            r14 = o0Var;
                        } else {
                            qVar12 = qVar5;
                            r15 = mapViewportState5;
                            mapState6 = mapState8;
                            r14 = o0Var2;
                        }
                    }
                    r14.h0();
                    x1 x1Var9 = n.f135158a;
                    qVar13 = qVar12;
                    r14.L(658990358);
                    if (((Boolean) r14.A(l2.f91259a)).booleanValue()) {
                        MapPreviewPlaceholderKt.m207MapPreviewPlaceHolderRWsq2U(rVar3, 0L, 0, 0L, r14, i39 & 14, 14);
                        r14.g0(false);
                        p2VarI0 = r14.i0();
                        if (p2VarI0 == null) {
                            return;
                        }
                        p2VarI0.f135219d = new AnonymousClass2(rVar3, composeMapInitOptions4, qVar10, qVar8, qVar11, qVar9, r15, mapState6, onMapClickListener3, onMapLongClickListener2, pVarM139getLambda5$extension_compose_release, qVar13, i14, i15, i16);
                        return;
                    }
                    r14.g0(false);
                    r14.N(658990505, composeMapInitOptions4);
                    context = (Context) r14.A(AndroidCompositionLocals_androidKt.f6042b);
                    r14.L(-492369756);
                    objQ2 = r14.q();
                    aVar.getClass();
                    i44 = i39;
                    if (objQ2 == m.a.f135155b) {
                        ComposeTelemetryEvents.INSTANCE.getMap().increment();
                        objQ2 = new MapView(context, composeMapInitOptions4.getMapInitOptions$extension_compose_release(context));
                        r14.K(objQ2);
                    }
                    r14.g0(false);
                    mapView = (MapView) objQ2;
                    MapViewLifecycleKt.MapViewLifecycle(mapView, r14, 8);
                    r14.L(733328855);
                    h4.d.f81522a.getClass();
                    sVarE = c2.q.e(h4.d.a.f81524b, r14, 0);
                    r14.L(-1323940314);
                    cVar2 = (c) r14.A(t1.f91490h);
                    composeMapInitOptions5 = composeMapInitOptions4;
                    oVar = (g6.o) r14.A(t1.f91496n);
                    pVar2 = pVarM139getLambda5$extension_compose_release;
                    a4Var = (a4) r14.A(t1.f91502t);
                    g.V.getClass();
                    aVar2 = g.a.f81805b;
                    onMapLongClickListener3 = onMapLongClickListener2;
                    rVar4 = rVar3;
                    onMapClickListener4 = onMapClickListener3;
                    mapState7 = mapState6;
                    eVar = new z3.e(-2123382363, true, new n0(rVar3));
                    if (r14.f135177b != null) {
                        p0.l();
                        throw null;
                    }
                    r14.z();
                    if (r14.T) {
                        r14.M(aVar2);
                    } else {
                        r14.c();
                    }
                    r14.f135201z = false;
                    b4.c(g.a.f81810g, sVarE, r14);
                    b4.c(g.a.f81808e, cVar2, r14);
                    b4.c(g.a.f81811h, oVar, r14);
                    b4.c(g.a.f81812i, a4Var, r14);
                    r14.j();
                    eVar.invoke(g3.a(r14), r14, 0);
                    r14.L(2058660585);
                    r14.L(-2137368960);
                    u uVar9 = u.f22885a;
                    p002j6.c.b(new MapboxMapKt$MapboxMap$3$1(mapView), x2.d(h4.r.S, 1.0f), null, r14, 48, 4);
                    qVar10.invoke(new MapCompassScope(mapView, uVar9), r14, Integer.valueOf((i44 >> 3) & 112));
                    qVar8.invoke(new MapScaleBarScope(mapView, uVar9), r14, Integer.valueOf((i44 >> 6) & 112));
                    qVar11.invoke(new MapLogoScope(uVar9), r14, Integer.valueOf((i44 >> 9) & 112));
                    qVar9.invoke(new MapAttributionScope(mapView, uVar9), r14, Integer.valueOf((i44 >> 12) & 112));
                    r14.g0(false);
                    r14.g0(false);
                    r14.g0(true);
                    r14.g0(false);
                    r14.g0(false);
                    r14.N(658991134, r15);
                    r15.BindToMap$extension_compose_release(mapView, r14, ((i44 >> 15) & 112) | 8);
                    r14.g0(false);
                    ?? r117 = mapState7;
                    r14.N(658991220, r117);
                    r117.BindToMap$extension_compose_release(mapView.getMapboxMapDeprecated(), r14, ((i44 >> 18) & 112) | 8);
                    r14.g0(false);
                    onMapClickListener5 = onMapClickListener4;
                    qVar14 = qVar13;
                    l0.e(new AnonymousClass4(mapView, r14.g(), p0.q(onMapClickListener5, r14), p0.q(onMapLongClickListener3, r14), p0.q(pVar2, r14), p0.q(qVar14, r14), null), Unit.INSTANCE, r14);
                    r14.g0(false);
                    ?? r212 = r14;
                    onMapLongClickListener4 = onMapLongClickListener3;
                    r16 = r212;
                    pVar3 = pVar2;
                    composeMapInitOptions6 = composeMapInitOptions5;
                    rVar5 = rVar4;
                    r18 = r15;
                    r17 = r117;
                } else {
                    o0VarE.G0();
                    i38 = i14 & 1;
                    aVar = m.f135153a;
                    if (i38 != 0) {
                        if (i47 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if ((i16 & 2) != 0) {
                            cVar = (c) o0VarE.A(t1.f91490h);
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                            i17 &= -113;
                        } else {
                            composeMapInitOptions3 = composeMapInitOptions2;
                        }
                        if (i49 != 0) {
                            qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                        } else {
                            qVarM135getLambda1$extension_compose_release = qVar6;
                        }
                        if (i18 != 0) {
                            qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                        } else {
                            qVarM136getLambda2$extension_compose_release = qVar7;
                        }
                        if (i24 != 0) {
                            qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                        } else {
                            qVarM137getLambda3$extension_compose_release = qVar3;
                        }
                        if (i26 != 0) {
                            qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                        }
                        if ((i16 & 64) != 0) {
                            o0VarE.L(-135744814);
                            Object objD16 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                            o0 o0Var18 = o0VarE;
                            o0Var18.g0(false);
                            i17 &= -3670017;
                            mapViewportState3 = (MapViewportState) objD16;
                            o0Var = o0Var18;
                        } else {
                            o0Var = o0VarE;
                            mapViewportState3 = mapViewportState2;
                        }
                        if ((i16 & 128) != 0) {
                            o0Var.L(-231233878);
                            mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                            o0Var.g0(false);
                            i17 &= -29360129;
                        } else {
                            mapState3 = mapState2;
                        }
                        if (i28 != 0) {
                            onMapClickListener2 = null;
                        } else {
                            onMapClickListener2 = onMapClickListener;
                        }
                        if (i29 != 0) {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = null;
                        } else {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = onMapLongClickListener;
                        }
                        if (i30 != 0) {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                        } else {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = pVar;
                        }
                        q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar1110 = qVarM135getLambda1$extension_compose_release;
                        composeMapInitOptions4 = composeMapInitOptions3;
                        rVar3 = rVar2;
                        qVar8 = qVarM136getLambda2$extension_compose_release;
                        qVar9 = qVarM138getLambda4$extension_compose_release;
                        qVar10 = qVar1110;
                        i39 = i17;
                        qVar11 = qVarM137getLambda3$extension_compose_release;
                        onMapClickListener3 = onMapClickListener2;
                        mapState4 = mapState3;
                        mapViewportState4 = mapViewportState3;
                        mapViewportState5 = mapViewportState4;
                        mapState8 = mapState4;
                        o0Var2 = o0Var;
                        if (i36 != 0) {
                            qVar12 = null;
                            r15 = mapViewportState4;
                            mapState6 = mapState4;
                            r14 = o0Var;
                        } else {
                            qVar12 = qVar5;
                            r15 = mapViewportState5;
                            mapState6 = mapState8;
                            r14 = o0Var2;
                        }
                    } else {
                        if (i47 != 0) {
                            rVar2 = h4.r.S;
                        }
                        if ((i16 & 2) != 0) {
                            cVar = (c) o0VarE.A(t1.f91490h);
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                            i17 &= -113;
                        } else {
                            composeMapInitOptions3 = composeMapInitOptions2;
                        }
                        if (i49 != 0) {
                            qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                        } else {
                            qVarM135getLambda1$extension_compose_release = qVar6;
                        }
                        if (i18 != 0) {
                            qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                        } else {
                            qVarM136getLambda2$extension_compose_release = qVar7;
                        }
                        if (i24 != 0) {
                            qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                        } else {
                            qVarM137getLambda3$extension_compose_release = qVar3;
                        }
                        if (i26 != 0) {
                            qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                        }
                        if ((i16 & 64) != 0) {
                            o0VarE.L(-135744814);
                            Object objD17 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                            o0 o0Var19 = o0VarE;
                            o0Var19.g0(false);
                            i17 &= -3670017;
                            mapViewportState3 = (MapViewportState) objD17;
                            o0Var = o0Var19;
                        } else {
                            o0Var = o0VarE;
                            mapViewportState3 = mapViewportState2;
                        }
                        if ((i16 & 128) != 0) {
                            o0Var.L(-231233878);
                            mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                            o0Var.g0(false);
                            i17 &= -29360129;
                        } else {
                            mapState3 = mapState2;
                        }
                        if (i28 != 0) {
                            onMapClickListener2 = null;
                        } else {
                            onMapClickListener2 = onMapClickListener;
                        }
                        if (i29 != 0) {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = null;
                        } else {
                            mapState3 = mapState5;
                            onMapLongClickListener2 = onMapLongClickListener;
                        }
                        if (i30 != 0) {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                        } else {
                            mapState3 = mapState5;
                            mapState3 = mapState5;
                            pVarM139getLambda5$extension_compose_release = pVar;
                        }
                        q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar1111 = qVarM135getLambda1$extension_compose_release;
                        composeMapInitOptions4 = composeMapInitOptions3;
                        rVar3 = rVar2;
                        qVar8 = qVarM136getLambda2$extension_compose_release;
                        qVar9 = qVarM138getLambda4$extension_compose_release;
                        qVar10 = qVar1111;
                        i39 = i17;
                        qVar11 = qVarM137getLambda3$extension_compose_release;
                        onMapClickListener3 = onMapClickListener2;
                        mapState4 = mapState3;
                        mapViewportState4 = mapViewportState3;
                        mapViewportState5 = mapViewportState4;
                        mapState8 = mapState4;
                        o0Var2 = o0Var;
                        if (i36 != 0) {
                            qVar12 = null;
                            r15 = mapViewportState4;
                            mapState6 = mapState4;
                            r14 = o0Var;
                        } else {
                            qVar12 = qVar5;
                            r15 = mapViewportState5;
                            mapState6 = mapState8;
                            r14 = o0Var2;
                        }
                    }
                    r14.h0();
                    x1 x1Var10 = n.f135158a;
                    qVar13 = qVar12;
                    r14.L(658990358);
                    if (((Boolean) r14.A(l2.f91259a)).booleanValue()) {
                        MapPreviewPlaceholderKt.m207MapPreviewPlaceHolderRWsq2U(rVar3, 0L, 0, 0L, r14, i39 & 14, 14);
                        r14.g0(false);
                        p2VarI0 = r14.i0();
                        if (p2VarI0 == null) {
                            return;
                        }
                        p2VarI0.f135219d = new AnonymousClass2(rVar3, composeMapInitOptions4, qVar10, qVar8, qVar11, qVar9, r15, mapState6, onMapClickListener3, onMapLongClickListener2, pVarM139getLambda5$extension_compose_release, qVar13, i14, i15, i16);
                        return;
                    }
                    r14.g0(false);
                    r14.N(658990505, composeMapInitOptions4);
                    context = (Context) r14.A(AndroidCompositionLocals_androidKt.f6042b);
                    r14.L(-492369756);
                    objQ2 = r14.q();
                    aVar.getClass();
                    i44 = i39;
                    if (objQ2 == m.a.f135155b) {
                        ComposeTelemetryEvents.INSTANCE.getMap().increment();
                        objQ2 = new MapView(context, composeMapInitOptions4.getMapInitOptions$extension_compose_release(context));
                        r14.K(objQ2);
                    }
                    r14.g0(false);
                    mapView = (MapView) objQ2;
                    MapViewLifecycleKt.MapViewLifecycle(mapView, r14, 8);
                    r14.L(733328855);
                    h4.d.f81522a.getClass();
                    sVarE = c2.q.e(h4.d.a.f81524b, r14, 0);
                    r14.L(-1323940314);
                    cVar2 = (c) r14.A(t1.f91490h);
                    composeMapInitOptions5 = composeMapInitOptions4;
                    oVar = (g6.o) r14.A(t1.f91496n);
                    pVar2 = pVarM139getLambda5$extension_compose_release;
                    a4Var = (a4) r14.A(t1.f91502t);
                    g.V.getClass();
                    aVar2 = g.a.f81805b;
                    onMapLongClickListener3 = onMapLongClickListener2;
                    rVar4 = rVar3;
                    onMapClickListener4 = onMapClickListener3;
                    mapState7 = mapState6;
                    eVar = new z3.e(-2123382363, true, new n0(rVar3));
                    if (r14.f135177b != null) {
                        p0.l();
                        throw null;
                    }
                    r14.z();
                    if (r14.T) {
                        r14.M(aVar2);
                    } else {
                        r14.c();
                    }
                    r14.f135201z = false;
                    b4.c(g.a.f81810g, sVarE, r14);
                    b4.c(g.a.f81808e, cVar2, r14);
                    b4.c(g.a.f81811h, oVar, r14);
                    b4.c(g.a.f81812i, a4Var, r14);
                    r14.j();
                    eVar.invoke(g3.a(r14), r14, 0);
                    r14.L(2058660585);
                    r14.L(-2137368960);
                    u uVar10 = u.f22885a;
                    p002j6.c.b(new MapboxMapKt$MapboxMap$3$1(mapView), x2.d(h4.r.S, 1.0f), null, r14, 48, 4);
                    qVar10.invoke(new MapCompassScope(mapView, uVar10), r14, Integer.valueOf((i44 >> 3) & 112));
                    qVar8.invoke(new MapScaleBarScope(mapView, uVar10), r14, Integer.valueOf((i44 >> 6) & 112));
                    qVar11.invoke(new MapLogoScope(uVar10), r14, Integer.valueOf((i44 >> 9) & 112));
                    qVar9.invoke(new MapAttributionScope(mapView, uVar10), r14, Integer.valueOf((i44 >> 12) & 112));
                    r14.g0(false);
                    r14.g0(false);
                    r14.g0(true);
                    r14.g0(false);
                    r14.g0(false);
                    r14.N(658991134, r15);
                    r15.BindToMap$extension_compose_release(mapView, r14, ((i44 >> 15) & 112) | 8);
                    r14.g0(false);
                    ?? r118 = mapState7;
                    r14.N(658991220, r118);
                    r118.BindToMap$extension_compose_release(mapView.getMapboxMapDeprecated(), r14, ((i44 >> 18) & 112) | 8);
                    r14.g0(false);
                    onMapClickListener5 = onMapClickListener4;
                    qVar14 = qVar13;
                    l0.e(new AnonymousClass4(mapView, r14.g(), p0.q(onMapClickListener5, r14), p0.q(onMapLongClickListener3, r14), p0.q(pVar2, r14), p0.q(qVar14, r14), null), Unit.INSTANCE, r14);
                    r14.g0(false);
                    ?? r213 = r14;
                    onMapLongClickListener4 = onMapLongClickListener3;
                    r16 = r213;
                    pVar3 = pVar2;
                    composeMapInitOptions6 = composeMapInitOptions5;
                    rVar5 = rVar4;
                    r18 = r15;
                    r17 = r118;
                }
                p2VarI1 = r16.i0();
                if (p2VarI1 == null) {
                    return;
                }
                p2VarI1.f135219d = new AnonymousClass5(rVar5, composeMapInitOptions6, qVar10, qVar8, qVar11, qVar9, r18, r17, onMapClickListener5, onMapLongClickListener4, pVar3, qVar14, i14, i15, i16);
            }
            i34 |= 48;
            if ((i16 & ViewUtils.EDGE_TO_EDGE_FLAGS) != 768) {
                o0VarE.G0();
                i38 = i14 & 1;
                aVar = m.f135153a;
                if (i38 != 0) {
                    if (i47 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if ((i16 & 2) != 0) {
                        cVar = (c) o0VarE.A(t1.f91490h);
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                        i17 &= -113;
                    } else {
                        composeMapInitOptions3 = composeMapInitOptions2;
                    }
                    if (i49 != 0) {
                        qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                    } else {
                        qVarM135getLambda1$extension_compose_release = qVar6;
                    }
                    if (i18 != 0) {
                        qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                    } else {
                        qVarM136getLambda2$extension_compose_release = qVar7;
                    }
                    if (i24 != 0) {
                        qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                    } else {
                        qVarM137getLambda3$extension_compose_release = qVar3;
                    }
                    if (i26 != 0) {
                        qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                    }
                    if ((i16 & 64) != 0) {
                        o0VarE.L(-135744814);
                        Object objD18 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                        o0 o0Var110 = o0VarE;
                        o0Var110.g0(false);
                        i17 &= -3670017;
                        mapViewportState3 = (MapViewportState) objD18;
                        o0Var = o0Var110;
                    } else {
                        o0Var = o0VarE;
                        mapViewportState3 = mapViewportState2;
                    }
                    if ((i16 & 128) != 0) {
                        o0Var.L(-231233878);
                        mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                        o0Var.g0(false);
                        i17 &= -29360129;
                    } else {
                        mapState3 = mapState2;
                    }
                    if (i28 != 0) {
                        onMapClickListener2 = null;
                    } else {
                        onMapClickListener2 = onMapClickListener;
                    }
                    if (i29 != 0) {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = null;
                    } else {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = onMapLongClickListener;
                    }
                    if (i30 != 0) {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                    } else {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = pVar;
                    }
                    q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar1112 = qVarM135getLambda1$extension_compose_release;
                    composeMapInitOptions4 = composeMapInitOptions3;
                    rVar3 = rVar2;
                    qVar8 = qVarM136getLambda2$extension_compose_release;
                    qVar9 = qVarM138getLambda4$extension_compose_release;
                    qVar10 = qVar1112;
                    i39 = i17;
                    qVar11 = qVarM137getLambda3$extension_compose_release;
                    onMapClickListener3 = onMapClickListener2;
                    mapState4 = mapState3;
                    mapViewportState4 = mapViewportState3;
                    mapViewportState5 = mapViewportState4;
                    mapState8 = mapState4;
                    o0Var2 = o0Var;
                    if (i36 != 0) {
                        qVar12 = null;
                        r15 = mapViewportState4;
                        mapState6 = mapState4;
                        r14 = o0Var;
                    } else {
                        qVar12 = qVar5;
                        r15 = mapViewportState5;
                        mapState6 = mapState8;
                        r14 = o0Var2;
                    }
                } else {
                    if (i47 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if ((i16 & 2) != 0) {
                        cVar = (c) o0VarE.A(t1.f91490h);
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                        i17 &= -113;
                    } else {
                        composeMapInitOptions3 = composeMapInitOptions2;
                    }
                    if (i49 != 0) {
                        qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                    } else {
                        qVarM135getLambda1$extension_compose_release = qVar6;
                    }
                    if (i18 != 0) {
                        qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                    } else {
                        qVarM136getLambda2$extension_compose_release = qVar7;
                    }
                    if (i24 != 0) {
                        qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                    } else {
                        qVarM137getLambda3$extension_compose_release = qVar3;
                    }
                    if (i26 != 0) {
                        qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                    }
                    if ((i16 & 64) != 0) {
                        o0VarE.L(-135744814);
                        Object objD19 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                        o0 o0Var111 = o0VarE;
                        o0Var111.g0(false);
                        i17 &= -3670017;
                        mapViewportState3 = (MapViewportState) objD19;
                        o0Var = o0Var111;
                    } else {
                        o0Var = o0VarE;
                        mapViewportState3 = mapViewportState2;
                    }
                    if ((i16 & 128) != 0) {
                        o0Var.L(-231233878);
                        mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                        o0Var.g0(false);
                        i17 &= -29360129;
                    } else {
                        mapState3 = mapState2;
                    }
                    if (i28 != 0) {
                        onMapClickListener2 = null;
                    } else {
                        onMapClickListener2 = onMapClickListener;
                    }
                    if (i29 != 0) {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = null;
                    } else {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = onMapLongClickListener;
                    }
                    if (i30 != 0) {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                    } else {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = pVar;
                    }
                    q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar1113 = qVarM135getLambda1$extension_compose_release;
                    composeMapInitOptions4 = composeMapInitOptions3;
                    rVar3 = rVar2;
                    qVar8 = qVarM136getLambda2$extension_compose_release;
                    qVar9 = qVarM138getLambda4$extension_compose_release;
                    qVar10 = qVar1113;
                    i39 = i17;
                    qVar11 = qVarM137getLambda3$extension_compose_release;
                    onMapClickListener3 = onMapClickListener2;
                    mapState4 = mapState3;
                    mapViewportState4 = mapViewportState3;
                    mapViewportState5 = mapViewportState4;
                    mapState8 = mapState4;
                    o0Var2 = o0Var;
                    if (i36 != 0) {
                        qVar12 = null;
                        r15 = mapViewportState4;
                        mapState6 = mapState4;
                        r14 = o0Var;
                    } else {
                        qVar12 = qVar5;
                        r15 = mapViewportState5;
                        mapState6 = mapState8;
                        r14 = o0Var2;
                    }
                }
                r14.h0();
                x1 x1Var11 = n.f135158a;
                qVar13 = qVar12;
                r14.L(658990358);
                if (((Boolean) r14.A(l2.f91259a)).booleanValue()) {
                    MapPreviewPlaceholderKt.m207MapPreviewPlaceHolderRWsq2U(rVar3, 0L, 0, 0L, r14, i39 & 14, 14);
                    r14.g0(false);
                    p2VarI0 = r14.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    p2VarI0.f135219d = new AnonymousClass2(rVar3, composeMapInitOptions4, qVar10, qVar8, qVar11, qVar9, r15, mapState6, onMapClickListener3, onMapLongClickListener2, pVarM139getLambda5$extension_compose_release, qVar13, i14, i15, i16);
                    return;
                }
                r14.g0(false);
                r14.N(658990505, composeMapInitOptions4);
                context = (Context) r14.A(AndroidCompositionLocals_androidKt.f6042b);
                r14.L(-492369756);
                objQ2 = r14.q();
                aVar.getClass();
                i44 = i39;
                if (objQ2 == m.a.f135155b) {
                    ComposeTelemetryEvents.INSTANCE.getMap().increment();
                    objQ2 = new MapView(context, composeMapInitOptions4.getMapInitOptions$extension_compose_release(context));
                    r14.K(objQ2);
                }
                r14.g0(false);
                mapView = (MapView) objQ2;
                MapViewLifecycleKt.MapViewLifecycle(mapView, r14, 8);
                r14.L(733328855);
                h4.d.f81522a.getClass();
                sVarE = c2.q.e(h4.d.a.f81524b, r14, 0);
                r14.L(-1323940314);
                cVar2 = (c) r14.A(t1.f91490h);
                composeMapInitOptions5 = composeMapInitOptions4;
                oVar = (g6.o) r14.A(t1.f91496n);
                pVar2 = pVarM139getLambda5$extension_compose_release;
                a4Var = (a4) r14.A(t1.f91502t);
                g.V.getClass();
                aVar2 = g.a.f81805b;
                onMapLongClickListener3 = onMapLongClickListener2;
                rVar4 = rVar3;
                onMapClickListener4 = onMapClickListener3;
                mapState7 = mapState6;
                eVar = new z3.e(-2123382363, true, new n0(rVar3));
                if (r14.f135177b != null) {
                    p0.l();
                    throw null;
                }
                r14.z();
                if (r14.T) {
                    r14.M(aVar2);
                } else {
                    r14.c();
                }
                r14.f135201z = false;
                b4.c(g.a.f81810g, sVarE, r14);
                b4.c(g.a.f81808e, cVar2, r14);
                b4.c(g.a.f81811h, oVar, r14);
                b4.c(g.a.f81812i, a4Var, r14);
                r14.j();
                eVar.invoke(g3.a(r14), r14, 0);
                r14.L(2058660585);
                r14.L(-2137368960);
                u uVar11 = u.f22885a;
                p002j6.c.b(new MapboxMapKt$MapboxMap$3$1(mapView), x2.d(h4.r.S, 1.0f), null, r14, 48, 4);
                qVar10.invoke(new MapCompassScope(mapView, uVar11), r14, Integer.valueOf((i44 >> 3) & 112));
                qVar8.invoke(new MapScaleBarScope(mapView, uVar11), r14, Integer.valueOf((i44 >> 6) & 112));
                qVar11.invoke(new MapLogoScope(uVar11), r14, Integer.valueOf((i44 >> 9) & 112));
                qVar9.invoke(new MapAttributionScope(mapView, uVar11), r14, Integer.valueOf((i44 >> 12) & 112));
                r14.g0(false);
                r14.g0(false);
                r14.g0(true);
                r14.g0(false);
                r14.g0(false);
                r14.N(658991134, r15);
                r15.BindToMap$extension_compose_release(mapView, r14, ((i44 >> 15) & 112) | 8);
                r14.g0(false);
                ?? r119 = mapState7;
                r14.N(658991220, r119);
                r119.BindToMap$extension_compose_release(mapView.getMapboxMapDeprecated(), r14, ((i44 >> 18) & 112) | 8);
                r14.g0(false);
                onMapClickListener5 = onMapClickListener4;
                qVar14 = qVar13;
                l0.e(new AnonymousClass4(mapView, r14.g(), p0.q(onMapClickListener5, r14), p0.q(onMapLongClickListener3, r14), p0.q(pVar2, r14), p0.q(qVar14, r14), null), Unit.INSTANCE, r14);
                r14.g0(false);
                ?? r214 = r14;
                onMapLongClickListener4 = onMapLongClickListener3;
                r16 = r214;
                pVar3 = pVar2;
                composeMapInitOptions6 = composeMapInitOptions5;
                rVar5 = rVar4;
                r18 = r15;
                r17 = r119;
            } else {
                o0VarE.G0();
                i38 = i14 & 1;
                aVar = m.f135153a;
                if (i38 != 0) {
                    if (i47 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if ((i16 & 2) != 0) {
                        cVar = (c) o0VarE.A(t1.f91490h);
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                        i17 &= -113;
                    } else {
                        composeMapInitOptions3 = composeMapInitOptions2;
                    }
                    if (i49 != 0) {
                        qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                    } else {
                        qVarM135getLambda1$extension_compose_release = qVar6;
                    }
                    if (i18 != 0) {
                        qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                    } else {
                        qVarM136getLambda2$extension_compose_release = qVar7;
                    }
                    if (i24 != 0) {
                        qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                    } else {
                        qVarM137getLambda3$extension_compose_release = qVar3;
                    }
                    if (i26 != 0) {
                        qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                    }
                    if ((i16 & 64) != 0) {
                        o0VarE.L(-135744814);
                        Object objD110 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                        o0 o0Var112 = o0VarE;
                        o0Var112.g0(false);
                        i17 &= -3670017;
                        mapViewportState3 = (MapViewportState) objD110;
                        o0Var = o0Var112;
                    } else {
                        o0Var = o0VarE;
                        mapViewportState3 = mapViewportState2;
                    }
                    if ((i16 & 128) != 0) {
                        o0Var.L(-231233878);
                        mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                        o0Var.g0(false);
                        i17 &= -29360129;
                    } else {
                        mapState3 = mapState2;
                    }
                    if (i28 != 0) {
                        onMapClickListener2 = null;
                    } else {
                        onMapClickListener2 = onMapClickListener;
                    }
                    if (i29 != 0) {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = null;
                    } else {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = onMapLongClickListener;
                    }
                    if (i30 != 0) {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                    } else {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = pVar;
                    }
                    q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar1114 = qVarM135getLambda1$extension_compose_release;
                    composeMapInitOptions4 = composeMapInitOptions3;
                    rVar3 = rVar2;
                    qVar8 = qVarM136getLambda2$extension_compose_release;
                    qVar9 = qVarM138getLambda4$extension_compose_release;
                    qVar10 = qVar1114;
                    i39 = i17;
                    qVar11 = qVarM137getLambda3$extension_compose_release;
                    onMapClickListener3 = onMapClickListener2;
                    mapState4 = mapState3;
                    mapViewportState4 = mapViewportState3;
                    mapViewportState5 = mapViewportState4;
                    mapState8 = mapState4;
                    o0Var2 = o0Var;
                    if (i36 != 0) {
                        qVar12 = null;
                        r15 = mapViewportState4;
                        mapState6 = mapState4;
                        r14 = o0Var;
                    } else {
                        qVar12 = qVar5;
                        r15 = mapViewportState5;
                        mapState6 = mapState8;
                        r14 = o0Var2;
                    }
                } else {
                    if (i47 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if ((i16 & 2) != 0) {
                        cVar = (c) o0VarE.A(t1.f91490h);
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                        i17 &= -113;
                    } else {
                        composeMapInitOptions3 = composeMapInitOptions2;
                    }
                    if (i49 != 0) {
                        qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                    } else {
                        qVarM135getLambda1$extension_compose_release = qVar6;
                    }
                    if (i18 != 0) {
                        qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                    } else {
                        qVarM136getLambda2$extension_compose_release = qVar7;
                    }
                    if (i24 != 0) {
                        qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                    } else {
                        qVarM137getLambda3$extension_compose_release = qVar3;
                    }
                    if (i26 != 0) {
                        qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                    }
                    if ((i16 & 64) != 0) {
                        o0VarE.L(-135744814);
                        Object objD111 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                        o0 o0Var113 = o0VarE;
                        o0Var113.g0(false);
                        i17 &= -3670017;
                        mapViewportState3 = (MapViewportState) objD111;
                        o0Var = o0Var113;
                    } else {
                        o0Var = o0VarE;
                        mapViewportState3 = mapViewportState2;
                    }
                    if ((i16 & 128) != 0) {
                        o0Var.L(-231233878);
                        mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                        o0Var.g0(false);
                        i17 &= -29360129;
                    } else {
                        mapState3 = mapState2;
                    }
                    if (i28 != 0) {
                        onMapClickListener2 = null;
                    } else {
                        onMapClickListener2 = onMapClickListener;
                    }
                    if (i29 != 0) {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = null;
                    } else {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = onMapLongClickListener;
                    }
                    if (i30 != 0) {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                    } else {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = pVar;
                    }
                    q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar1115 = qVarM135getLambda1$extension_compose_release;
                    composeMapInitOptions4 = composeMapInitOptions3;
                    rVar3 = rVar2;
                    qVar8 = qVarM136getLambda2$extension_compose_release;
                    qVar9 = qVarM138getLambda4$extension_compose_release;
                    qVar10 = qVar1115;
                    i39 = i17;
                    qVar11 = qVarM137getLambda3$extension_compose_release;
                    onMapClickListener3 = onMapClickListener2;
                    mapState4 = mapState3;
                    mapViewportState4 = mapViewportState3;
                    mapViewportState5 = mapViewportState4;
                    mapState8 = mapState4;
                    o0Var2 = o0Var;
                    if (i36 != 0) {
                        qVar12 = null;
                        r15 = mapViewportState4;
                        mapState6 = mapState4;
                        r14 = o0Var;
                    } else {
                        qVar12 = qVar5;
                        r15 = mapViewportState5;
                        mapState6 = mapState8;
                        r14 = o0Var2;
                    }
                }
                r14.h0();
                x1 x1Var12 = n.f135158a;
                qVar13 = qVar12;
                r14.L(658990358);
                if (((Boolean) r14.A(l2.f91259a)).booleanValue()) {
                    MapPreviewPlaceholderKt.m207MapPreviewPlaceHolderRWsq2U(rVar3, 0L, 0, 0L, r14, i39 & 14, 14);
                    r14.g0(false);
                    p2VarI0 = r14.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    p2VarI0.f135219d = new AnonymousClass2(rVar3, composeMapInitOptions4, qVar10, qVar8, qVar11, qVar9, r15, mapState6, onMapClickListener3, onMapLongClickListener2, pVarM139getLambda5$extension_compose_release, qVar13, i14, i15, i16);
                    return;
                }
                r14.g0(false);
                r14.N(658990505, composeMapInitOptions4);
                context = (Context) r14.A(AndroidCompositionLocals_androidKt.f6042b);
                r14.L(-492369756);
                objQ2 = r14.q();
                aVar.getClass();
                i44 = i39;
                if (objQ2 == m.a.f135155b) {
                    ComposeTelemetryEvents.INSTANCE.getMap().increment();
                    objQ2 = new MapView(context, composeMapInitOptions4.getMapInitOptions$extension_compose_release(context));
                    r14.K(objQ2);
                }
                r14.g0(false);
                mapView = (MapView) objQ2;
                MapViewLifecycleKt.MapViewLifecycle(mapView, r14, 8);
                r14.L(733328855);
                h4.d.f81522a.getClass();
                sVarE = c2.q.e(h4.d.a.f81524b, r14, 0);
                r14.L(-1323940314);
                cVar2 = (c) r14.A(t1.f91490h);
                composeMapInitOptions5 = composeMapInitOptions4;
                oVar = (g6.o) r14.A(t1.f91496n);
                pVar2 = pVarM139getLambda5$extension_compose_release;
                a4Var = (a4) r14.A(t1.f91502t);
                g.V.getClass();
                aVar2 = g.a.f81805b;
                onMapLongClickListener3 = onMapLongClickListener2;
                rVar4 = rVar3;
                onMapClickListener4 = onMapClickListener3;
                mapState7 = mapState6;
                eVar = new z3.e(-2123382363, true, new n0(rVar3));
                if (r14.f135177b != null) {
                    p0.l();
                    throw null;
                }
                r14.z();
                if (r14.T) {
                    r14.M(aVar2);
                } else {
                    r14.c();
                }
                r14.f135201z = false;
                b4.c(g.a.f81810g, sVarE, r14);
                b4.c(g.a.f81808e, cVar2, r14);
                b4.c(g.a.f81811h, oVar, r14);
                b4.c(g.a.f81812i, a4Var, r14);
                r14.j();
                eVar.invoke(g3.a(r14), r14, 0);
                r14.L(2058660585);
                r14.L(-2137368960);
                u uVar12 = u.f22885a;
                p002j6.c.b(new MapboxMapKt$MapboxMap$3$1(mapView), x2.d(h4.r.S, 1.0f), null, r14, 48, 4);
                qVar10.invoke(new MapCompassScope(mapView, uVar12), r14, Integer.valueOf((i44 >> 3) & 112));
                qVar8.invoke(new MapScaleBarScope(mapView, uVar12), r14, Integer.valueOf((i44 >> 6) & 112));
                qVar11.invoke(new MapLogoScope(uVar12), r14, Integer.valueOf((i44 >> 9) & 112));
                qVar9.invoke(new MapAttributionScope(mapView, uVar12), r14, Integer.valueOf((i44 >> 12) & 112));
                r14.g0(false);
                r14.g0(false);
                r14.g0(true);
                r14.g0(false);
                r14.g0(false);
                r14.N(658991134, r15);
                r15.BindToMap$extension_compose_release(mapView, r14, ((i44 >> 15) & 112) | 8);
                r14.g0(false);
                ?? r1110 = mapState7;
                r14.N(658991220, r1110);
                r1110.BindToMap$extension_compose_release(mapView.getMapboxMapDeprecated(), r14, ((i44 >> 18) & 112) | 8);
                r14.g0(false);
                onMapClickListener5 = onMapClickListener4;
                qVar14 = qVar13;
                l0.e(new AnonymousClass4(mapView, r14.g(), p0.q(onMapClickListener5, r14), p0.q(onMapLongClickListener3, r14), p0.q(pVar2, r14), p0.q(qVar14, r14), null), Unit.INSTANCE, r14);
                r14.g0(false);
                ?? r215 = r14;
                onMapLongClickListener4 = onMapLongClickListener3;
                r16 = r215;
                pVar3 = pVar2;
                composeMapInitOptions6 = composeMapInitOptions5;
                rVar5 = rVar4;
                r18 = r15;
                r17 = r1110;
            }
            p2VarI1 = r16.i0();
            if (p2VarI1 == null) {
                return;
            }
            p2VarI1.f135219d = new AnonymousClass5(rVar5, composeMapInitOptions6, qVar10, qVar8, qVar11, qVar9, r18, r17, onMapClickListener5, onMapLongClickListener4, pVar3, qVar14, i14, i15, i16);
        }
        i17 |= 3072;
        qVar7 = qVar2;
        i24 = i16 & 16;
        if (i24 != 0) {
            i17 |= 24576;
        } else if ((i14 & 57344) == 0) {
            if (o0VarE.B(qVar3)) {
                i25 = 16384;
            } else {
                i25 = 8192;
            }
            i17 |= i25;
        }
        i26 = i16 & 32;
        if (i26 != 0) {
            i17 |= 196608;
            qVarM138getLambda4$extension_compose_release = qVar4;
        } else {
            qVarM138getLambda4$extension_compose_release = qVar4;
            if ((i14 & 458752) == 0) {
                if (o0VarE.B(qVarM138getLambda4$extension_compose_release)) {
                    i27 = 131072;
                } else {
                    i27 = 65536;
                }
                i17 |= i27;
            }
        }
        if ((i14 & 3670016) == 0) {
            MapViewportState mapViewportState9 = mapViewportState;
            if ((i16 & 64) == 0) {
                i46 = 524288;
            } else {
                i46 = 524288;
            }
            i17 |= i46;
            mapViewportState2 = mapViewportState9;
        } else {
            mapViewportState2 = mapViewportState;
        }
        if ((i14 & 29360128) == 0) {
            if ((i16 & 128) == 0) {
                mapState11 = mapState;
                if (o0VarE.B(mapState11)) {
                    mapState9 = mapState11;
                    i45 = 8388608;
                    mapState10 = mapState11;
                }
                i17 |= i45;
                mapState2 = mapState10;
            } else {
                mapState9 = mapState;
            }
            mapState9 = mapState11;
            i45 = 4194304;
            mapState10 = mapState9;
            i17 |= i45;
            mapState2 = mapState10;
        } else {
            mapState2 = mapState;
        }
        i28 = i16 & 256;
        if (i28 != 0) {
            i17 |= 33554432;
        }
        i29 = i16 & 512;
        if (i29 != 0) {
            i17 |= 268435456;
        }
        i30 = i16 & 1024;
        if (i30 != 0) {
            i34 = i15 | 6;
        } else if ((i15 & 14) == 0) {
            if (o0VarE.B(pVar)) {
                i35 = 4;
            } else {
                i35 = 2;
            }
            i34 = i15 | i35;
        } else {
            i34 = i15;
        }
        i36 = i16 & 2048;
        if (i36 != 0) {
            if ((i15 & 112) == 0) {
                if (o0VarE.B(qVar5)) {
                    i37 = 32;
                } else {
                    i37 = 16;
                }
                i34 |= i37;
            }
            if ((i16 & ViewUtils.EDGE_TO_EDGE_FLAGS) != 768) {
                o0VarE.G0();
                i38 = i14 & 1;
                aVar = m.f135153a;
                if (i38 != 0) {
                    if (i47 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if ((i16 & 2) != 0) {
                        cVar = (c) o0VarE.A(t1.f91490h);
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                        i17 &= -113;
                    } else {
                        composeMapInitOptions3 = composeMapInitOptions2;
                    }
                    if (i49 != 0) {
                        qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                    } else {
                        qVarM135getLambda1$extension_compose_release = qVar6;
                    }
                    if (i18 != 0) {
                        qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                    } else {
                        qVarM136getLambda2$extension_compose_release = qVar7;
                    }
                    if (i24 != 0) {
                        qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                    } else {
                        qVarM137getLambda3$extension_compose_release = qVar3;
                    }
                    if (i26 != 0) {
                        qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                    }
                    if ((i16 & 64) != 0) {
                        o0VarE.L(-135744814);
                        Object objD112 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                        o0 o0Var114 = o0VarE;
                        o0Var114.g0(false);
                        i17 &= -3670017;
                        mapViewportState3 = (MapViewportState) objD112;
                        o0Var = o0Var114;
                    } else {
                        o0Var = o0VarE;
                        mapViewportState3 = mapViewportState2;
                    }
                    if ((i16 & 128) != 0) {
                        o0Var.L(-231233878);
                        mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                        o0Var.g0(false);
                        i17 &= -29360129;
                    } else {
                        mapState3 = mapState2;
                    }
                    if (i28 != 0) {
                        onMapClickListener2 = null;
                    } else {
                        onMapClickListener2 = onMapClickListener;
                    }
                    if (i29 != 0) {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = null;
                    } else {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = onMapLongClickListener;
                    }
                    if (i30 != 0) {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                    } else {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = pVar;
                    }
                    q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar1116 = qVarM135getLambda1$extension_compose_release;
                    composeMapInitOptions4 = composeMapInitOptions3;
                    rVar3 = rVar2;
                    qVar8 = qVarM136getLambda2$extension_compose_release;
                    qVar9 = qVarM138getLambda4$extension_compose_release;
                    qVar10 = qVar1116;
                    i39 = i17;
                    qVar11 = qVarM137getLambda3$extension_compose_release;
                    onMapClickListener3 = onMapClickListener2;
                    mapState4 = mapState3;
                    mapViewportState4 = mapViewportState3;
                    mapViewportState5 = mapViewportState4;
                    mapState8 = mapState4;
                    o0Var2 = o0Var;
                    if (i36 != 0) {
                        qVar12 = null;
                        r15 = mapViewportState4;
                        mapState6 = mapState4;
                        r14 = o0Var;
                    } else {
                        qVar12 = qVar5;
                        r15 = mapViewportState5;
                        mapState6 = mapState8;
                        r14 = o0Var2;
                    }
                } else {
                    if (i47 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if ((i16 & 2) != 0) {
                        cVar = (c) o0VarE.A(t1.f91490h);
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                        i17 &= -113;
                    } else {
                        composeMapInitOptions3 = composeMapInitOptions2;
                    }
                    if (i49 != 0) {
                        qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                    } else {
                        qVarM135getLambda1$extension_compose_release = qVar6;
                    }
                    if (i18 != 0) {
                        qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                    } else {
                        qVarM136getLambda2$extension_compose_release = qVar7;
                    }
                    if (i24 != 0) {
                        qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                    } else {
                        qVarM137getLambda3$extension_compose_release = qVar3;
                    }
                    if (i26 != 0) {
                        qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                    }
                    if ((i16 & 64) != 0) {
                        o0VarE.L(-135744814);
                        Object objD113 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                        o0 o0Var115 = o0VarE;
                        o0Var115.g0(false);
                        i17 &= -3670017;
                        mapViewportState3 = (MapViewportState) objD113;
                        o0Var = o0Var115;
                    } else {
                        o0Var = o0VarE;
                        mapViewportState3 = mapViewportState2;
                    }
                    if ((i16 & 128) != 0) {
                        o0Var.L(-231233878);
                        mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                        o0Var.g0(false);
                        i17 &= -29360129;
                    } else {
                        mapState3 = mapState2;
                    }
                    if (i28 != 0) {
                        onMapClickListener2 = null;
                    } else {
                        onMapClickListener2 = onMapClickListener;
                    }
                    if (i29 != 0) {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = null;
                    } else {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = onMapLongClickListener;
                    }
                    if (i30 != 0) {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                    } else {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = pVar;
                    }
                    q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar1117 = qVarM135getLambda1$extension_compose_release;
                    composeMapInitOptions4 = composeMapInitOptions3;
                    rVar3 = rVar2;
                    qVar8 = qVarM136getLambda2$extension_compose_release;
                    qVar9 = qVarM138getLambda4$extension_compose_release;
                    qVar10 = qVar1117;
                    i39 = i17;
                    qVar11 = qVarM137getLambda3$extension_compose_release;
                    onMapClickListener3 = onMapClickListener2;
                    mapState4 = mapState3;
                    mapViewportState4 = mapViewportState3;
                    mapViewportState5 = mapViewportState4;
                    mapState8 = mapState4;
                    o0Var2 = o0Var;
                    if (i36 != 0) {
                        qVar12 = null;
                        r15 = mapViewportState4;
                        mapState6 = mapState4;
                        r14 = o0Var;
                    } else {
                        qVar12 = qVar5;
                        r15 = mapViewportState5;
                        mapState6 = mapState8;
                        r14 = o0Var2;
                    }
                }
                r14.h0();
                x1 x1Var13 = n.f135158a;
                qVar13 = qVar12;
                r14.L(658990358);
                if (((Boolean) r14.A(l2.f91259a)).booleanValue()) {
                    MapPreviewPlaceholderKt.m207MapPreviewPlaceHolderRWsq2U(rVar3, 0L, 0, 0L, r14, i39 & 14, 14);
                    r14.g0(false);
                    p2VarI0 = r14.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    p2VarI0.f135219d = new AnonymousClass2(rVar3, composeMapInitOptions4, qVar10, qVar8, qVar11, qVar9, r15, mapState6, onMapClickListener3, onMapLongClickListener2, pVarM139getLambda5$extension_compose_release, qVar13, i14, i15, i16);
                    return;
                }
                r14.g0(false);
                r14.N(658990505, composeMapInitOptions4);
                context = (Context) r14.A(AndroidCompositionLocals_androidKt.f6042b);
                r14.L(-492369756);
                objQ2 = r14.q();
                aVar.getClass();
                i44 = i39;
                if (objQ2 == m.a.f135155b) {
                    ComposeTelemetryEvents.INSTANCE.getMap().increment();
                    objQ2 = new MapView(context, composeMapInitOptions4.getMapInitOptions$extension_compose_release(context));
                    r14.K(objQ2);
                }
                r14.g0(false);
                mapView = (MapView) objQ2;
                MapViewLifecycleKt.MapViewLifecycle(mapView, r14, 8);
                r14.L(733328855);
                h4.d.f81522a.getClass();
                sVarE = c2.q.e(h4.d.a.f81524b, r14, 0);
                r14.L(-1323940314);
                cVar2 = (c) r14.A(t1.f91490h);
                composeMapInitOptions5 = composeMapInitOptions4;
                oVar = (g6.o) r14.A(t1.f91496n);
                pVar2 = pVarM139getLambda5$extension_compose_release;
                a4Var = (a4) r14.A(t1.f91502t);
                g.V.getClass();
                aVar2 = g.a.f81805b;
                onMapLongClickListener3 = onMapLongClickListener2;
                rVar4 = rVar3;
                onMapClickListener4 = onMapClickListener3;
                mapState7 = mapState6;
                eVar = new z3.e(-2123382363, true, new n0(rVar3));
                if (r14.f135177b != null) {
                    p0.l();
                    throw null;
                }
                r14.z();
                if (r14.T) {
                    r14.M(aVar2);
                } else {
                    r14.c();
                }
                r14.f135201z = false;
                b4.c(g.a.f81810g, sVarE, r14);
                b4.c(g.a.f81808e, cVar2, r14);
                b4.c(g.a.f81811h, oVar, r14);
                b4.c(g.a.f81812i, a4Var, r14);
                r14.j();
                eVar.invoke(g3.a(r14), r14, 0);
                r14.L(2058660585);
                r14.L(-2137368960);
                u uVar13 = u.f22885a;
                p002j6.c.b(new MapboxMapKt$MapboxMap$3$1(mapView), x2.d(h4.r.S, 1.0f), null, r14, 48, 4);
                qVar10.invoke(new MapCompassScope(mapView, uVar13), r14, Integer.valueOf((i44 >> 3) & 112));
                qVar8.invoke(new MapScaleBarScope(mapView, uVar13), r14, Integer.valueOf((i44 >> 6) & 112));
                qVar11.invoke(new MapLogoScope(uVar13), r14, Integer.valueOf((i44 >> 9) & 112));
                qVar9.invoke(new MapAttributionScope(mapView, uVar13), r14, Integer.valueOf((i44 >> 12) & 112));
                r14.g0(false);
                r14.g0(false);
                r14.g0(true);
                r14.g0(false);
                r14.g0(false);
                r14.N(658991134, r15);
                r15.BindToMap$extension_compose_release(mapView, r14, ((i44 >> 15) & 112) | 8);
                r14.g0(false);
                ?? r1111 = mapState7;
                r14.N(658991220, r1111);
                r1111.BindToMap$extension_compose_release(mapView.getMapboxMapDeprecated(), r14, ((i44 >> 18) & 112) | 8);
                r14.g0(false);
                onMapClickListener5 = onMapClickListener4;
                qVar14 = qVar13;
                l0.e(new AnonymousClass4(mapView, r14.g(), p0.q(onMapClickListener5, r14), p0.q(onMapLongClickListener3, r14), p0.q(pVar2, r14), p0.q(qVar14, r14), null), Unit.INSTANCE, r14);
                r14.g0(false);
                ?? r216 = r14;
                onMapLongClickListener4 = onMapLongClickListener3;
                r16 = r216;
                pVar3 = pVar2;
                composeMapInitOptions6 = composeMapInitOptions5;
                rVar5 = rVar4;
                r18 = r15;
                r17 = r1111;
            } else {
                o0VarE.G0();
                i38 = i14 & 1;
                aVar = m.f135153a;
                if (i38 != 0) {
                    if (i47 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if ((i16 & 2) != 0) {
                        cVar = (c) o0VarE.A(t1.f91490h);
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                        i17 &= -113;
                    } else {
                        composeMapInitOptions3 = composeMapInitOptions2;
                    }
                    if (i49 != 0) {
                        qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                    } else {
                        qVarM135getLambda1$extension_compose_release = qVar6;
                    }
                    if (i18 != 0) {
                        qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                    } else {
                        qVarM136getLambda2$extension_compose_release = qVar7;
                    }
                    if (i24 != 0) {
                        qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                    } else {
                        qVarM137getLambda3$extension_compose_release = qVar3;
                    }
                    if (i26 != 0) {
                        qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                    }
                    if ((i16 & 64) != 0) {
                        o0VarE.L(-135744814);
                        Object objD114 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                        o0 o0Var116 = o0VarE;
                        o0Var116.g0(false);
                        i17 &= -3670017;
                        mapViewportState3 = (MapViewportState) objD114;
                        o0Var = o0Var116;
                    } else {
                        o0Var = o0VarE;
                        mapViewportState3 = mapViewportState2;
                    }
                    if ((i16 & 128) != 0) {
                        o0Var.L(-231233878);
                        mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                        o0Var.g0(false);
                        i17 &= -29360129;
                    } else {
                        mapState3 = mapState2;
                    }
                    if (i28 != 0) {
                        onMapClickListener2 = null;
                    } else {
                        onMapClickListener2 = onMapClickListener;
                    }
                    if (i29 != 0) {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = null;
                    } else {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = onMapLongClickListener;
                    }
                    if (i30 != 0) {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                    } else {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = pVar;
                    }
                    q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar1118 = qVarM135getLambda1$extension_compose_release;
                    composeMapInitOptions4 = composeMapInitOptions3;
                    rVar3 = rVar2;
                    qVar8 = qVarM136getLambda2$extension_compose_release;
                    qVar9 = qVarM138getLambda4$extension_compose_release;
                    qVar10 = qVar1118;
                    i39 = i17;
                    qVar11 = qVarM137getLambda3$extension_compose_release;
                    onMapClickListener3 = onMapClickListener2;
                    mapState4 = mapState3;
                    mapViewportState4 = mapViewportState3;
                    mapViewportState5 = mapViewportState4;
                    mapState8 = mapState4;
                    o0Var2 = o0Var;
                    if (i36 != 0) {
                        qVar12 = null;
                        r15 = mapViewportState4;
                        mapState6 = mapState4;
                        r14 = o0Var;
                    } else {
                        qVar12 = qVar5;
                        r15 = mapViewportState5;
                        mapState6 = mapState8;
                        r14 = o0Var2;
                    }
                } else {
                    if (i47 != 0) {
                        rVar2 = h4.r.S;
                    }
                    if ((i16 & 2) != 0) {
                        cVar = (c) o0VarE.A(t1.f91490h);
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                        i17 &= -113;
                    } else {
                        composeMapInitOptions3 = composeMapInitOptions2;
                    }
                    if (i49 != 0) {
                        qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                    } else {
                        qVarM135getLambda1$extension_compose_release = qVar6;
                    }
                    if (i18 != 0) {
                        qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                    } else {
                        qVarM136getLambda2$extension_compose_release = qVar7;
                    }
                    if (i24 != 0) {
                        qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                    } else {
                        qVarM137getLambda3$extension_compose_release = qVar3;
                    }
                    if (i26 != 0) {
                        qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                    }
                    if ((i16 & 64) != 0) {
                        o0VarE.L(-135744814);
                        Object objD115 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                        o0 o0Var117 = o0VarE;
                        o0Var117.g0(false);
                        i17 &= -3670017;
                        mapViewportState3 = (MapViewportState) objD115;
                        o0Var = o0Var117;
                    } else {
                        o0Var = o0VarE;
                        mapViewportState3 = mapViewportState2;
                    }
                    if ((i16 & 128) != 0) {
                        o0Var.L(-231233878);
                        mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                        o0Var.g0(false);
                        i17 &= -29360129;
                    } else {
                        mapState3 = mapState2;
                    }
                    if (i28 != 0) {
                        onMapClickListener2 = null;
                    } else {
                        onMapClickListener2 = onMapClickListener;
                    }
                    if (i29 != 0) {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = null;
                    } else {
                        mapState3 = mapState5;
                        onMapLongClickListener2 = onMapLongClickListener;
                    }
                    if (i30 != 0) {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                    } else {
                        mapState3 = mapState5;
                        mapState3 = mapState5;
                        pVarM139getLambda5$extension_compose_release = pVar;
                    }
                    q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar1119 = qVarM135getLambda1$extension_compose_release;
                    composeMapInitOptions4 = composeMapInitOptions3;
                    rVar3 = rVar2;
                    qVar8 = qVarM136getLambda2$extension_compose_release;
                    qVar9 = qVarM138getLambda4$extension_compose_release;
                    qVar10 = qVar1119;
                    i39 = i17;
                    qVar11 = qVarM137getLambda3$extension_compose_release;
                    onMapClickListener3 = onMapClickListener2;
                    mapState4 = mapState3;
                    mapViewportState4 = mapViewportState3;
                    mapViewportState5 = mapViewportState4;
                    mapState8 = mapState4;
                    o0Var2 = o0Var;
                    if (i36 != 0) {
                        qVar12 = null;
                        r15 = mapViewportState4;
                        mapState6 = mapState4;
                        r14 = o0Var;
                    } else {
                        qVar12 = qVar5;
                        r15 = mapViewportState5;
                        mapState6 = mapState8;
                        r14 = o0Var2;
                    }
                }
                r14.h0();
                x1 x1Var14 = n.f135158a;
                qVar13 = qVar12;
                r14.L(658990358);
                if (((Boolean) r14.A(l2.f91259a)).booleanValue()) {
                    MapPreviewPlaceholderKt.m207MapPreviewPlaceHolderRWsq2U(rVar3, 0L, 0, 0L, r14, i39 & 14, 14);
                    r14.g0(false);
                    p2VarI0 = r14.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    p2VarI0.f135219d = new AnonymousClass2(rVar3, composeMapInitOptions4, qVar10, qVar8, qVar11, qVar9, r15, mapState6, onMapClickListener3, onMapLongClickListener2, pVarM139getLambda5$extension_compose_release, qVar13, i14, i15, i16);
                    return;
                }
                r14.g0(false);
                r14.N(658990505, composeMapInitOptions4);
                context = (Context) r14.A(AndroidCompositionLocals_androidKt.f6042b);
                r14.L(-492369756);
                objQ2 = r14.q();
                aVar.getClass();
                i44 = i39;
                if (objQ2 == m.a.f135155b) {
                    ComposeTelemetryEvents.INSTANCE.getMap().increment();
                    objQ2 = new MapView(context, composeMapInitOptions4.getMapInitOptions$extension_compose_release(context));
                    r14.K(objQ2);
                }
                r14.g0(false);
                mapView = (MapView) objQ2;
                MapViewLifecycleKt.MapViewLifecycle(mapView, r14, 8);
                r14.L(733328855);
                h4.d.f81522a.getClass();
                sVarE = c2.q.e(h4.d.a.f81524b, r14, 0);
                r14.L(-1323940314);
                cVar2 = (c) r14.A(t1.f91490h);
                composeMapInitOptions5 = composeMapInitOptions4;
                oVar = (g6.o) r14.A(t1.f91496n);
                pVar2 = pVarM139getLambda5$extension_compose_release;
                a4Var = (a4) r14.A(t1.f91502t);
                g.V.getClass();
                aVar2 = g.a.f81805b;
                onMapLongClickListener3 = onMapLongClickListener2;
                rVar4 = rVar3;
                onMapClickListener4 = onMapClickListener3;
                mapState7 = mapState6;
                eVar = new z3.e(-2123382363, true, new n0(rVar3));
                if (r14.f135177b != null) {
                    p0.l();
                    throw null;
                }
                r14.z();
                if (r14.T) {
                    r14.M(aVar2);
                } else {
                    r14.c();
                }
                r14.f135201z = false;
                b4.c(g.a.f81810g, sVarE, r14);
                b4.c(g.a.f81808e, cVar2, r14);
                b4.c(g.a.f81811h, oVar, r14);
                b4.c(g.a.f81812i, a4Var, r14);
                r14.j();
                eVar.invoke(g3.a(r14), r14, 0);
                r14.L(2058660585);
                r14.L(-2137368960);
                u uVar14 = u.f22885a;
                p002j6.c.b(new MapboxMapKt$MapboxMap$3$1(mapView), x2.d(h4.r.S, 1.0f), null, r14, 48, 4);
                qVar10.invoke(new MapCompassScope(mapView, uVar14), r14, Integer.valueOf((i44 >> 3) & 112));
                qVar8.invoke(new MapScaleBarScope(mapView, uVar14), r14, Integer.valueOf((i44 >> 6) & 112));
                qVar11.invoke(new MapLogoScope(uVar14), r14, Integer.valueOf((i44 >> 9) & 112));
                qVar9.invoke(new MapAttributionScope(mapView, uVar14), r14, Integer.valueOf((i44 >> 12) & 112));
                r14.g0(false);
                r14.g0(false);
                r14.g0(true);
                r14.g0(false);
                r14.g0(false);
                r14.N(658991134, r15);
                r15.BindToMap$extension_compose_release(mapView, r14, ((i44 >> 15) & 112) | 8);
                r14.g0(false);
                ?? r1112 = mapState7;
                r14.N(658991220, r1112);
                r1112.BindToMap$extension_compose_release(mapView.getMapboxMapDeprecated(), r14, ((i44 >> 18) & 112) | 8);
                r14.g0(false);
                onMapClickListener5 = onMapClickListener4;
                qVar14 = qVar13;
                l0.e(new AnonymousClass4(mapView, r14.g(), p0.q(onMapClickListener5, r14), p0.q(onMapLongClickListener3, r14), p0.q(pVar2, r14), p0.q(qVar14, r14), null), Unit.INSTANCE, r14);
                r14.g0(false);
                ?? r217 = r14;
                onMapLongClickListener4 = onMapLongClickListener3;
                r16 = r217;
                pVar3 = pVar2;
                composeMapInitOptions6 = composeMapInitOptions5;
                rVar5 = rVar4;
                r18 = r15;
                r17 = r1112;
            }
            p2VarI1 = r16.i0();
            if (p2VarI1 == null) {
                return;
            }
            p2VarI1.f135219d = new AnonymousClass5(rVar5, composeMapInitOptions6, qVar10, qVar8, qVar11, qVar9, r18, r17, onMapClickListener5, onMapLongClickListener4, pVar3, qVar14, i14, i15, i16);
        }
        i34 |= 48;
        if ((i16 & ViewUtils.EDGE_TO_EDGE_FLAGS) != 768) {
            o0VarE.G0();
            i38 = i14 & 1;
            aVar = m.f135153a;
            if (i38 != 0) {
                if (i47 != 0) {
                    rVar2 = h4.r.S;
                }
                if ((i16 & 2) != 0) {
                    cVar = (c) o0VarE.A(t1.f91490h);
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                    i17 &= -113;
                } else {
                    composeMapInitOptions3 = composeMapInitOptions2;
                }
                if (i49 != 0) {
                    qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                } else {
                    qVarM135getLambda1$extension_compose_release = qVar6;
                }
                if (i18 != 0) {
                    qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                } else {
                    qVarM136getLambda2$extension_compose_release = qVar7;
                }
                if (i24 != 0) {
                    qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                } else {
                    qVarM137getLambda3$extension_compose_release = qVar3;
                }
                if (i26 != 0) {
                    qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                }
                if ((i16 & 64) != 0) {
                    o0VarE.L(-135744814);
                    Object objD116 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                    o0 o0Var118 = o0VarE;
                    o0Var118.g0(false);
                    i17 &= -3670017;
                    mapViewportState3 = (MapViewportState) objD116;
                    o0Var = o0Var118;
                } else {
                    o0Var = o0VarE;
                    mapViewportState3 = mapViewportState2;
                }
                if ((i16 & 128) != 0) {
                    o0Var.L(-231233878);
                    mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                    o0Var.g0(false);
                    i17 &= -29360129;
                } else {
                    mapState3 = mapState2;
                }
                if (i28 != 0) {
                    onMapClickListener2 = null;
                } else {
                    onMapClickListener2 = onMapClickListener;
                }
                if (i29 != 0) {
                    mapState3 = mapState5;
                    onMapLongClickListener2 = null;
                } else {
                    mapState3 = mapState5;
                    onMapLongClickListener2 = onMapLongClickListener;
                }
                if (i30 != 0) {
                    mapState3 = mapState5;
                    mapState3 = mapState5;
                    pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                } else {
                    mapState3 = mapState5;
                    mapState3 = mapState5;
                    pVarM139getLambda5$extension_compose_release = pVar;
                }
                q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar11110 = qVarM135getLambda1$extension_compose_release;
                composeMapInitOptions4 = composeMapInitOptions3;
                rVar3 = rVar2;
                qVar8 = qVarM136getLambda2$extension_compose_release;
                qVar9 = qVarM138getLambda4$extension_compose_release;
                qVar10 = qVar11110;
                i39 = i17;
                qVar11 = qVarM137getLambda3$extension_compose_release;
                onMapClickListener3 = onMapClickListener2;
                mapState4 = mapState3;
                mapViewportState4 = mapViewportState3;
                mapViewportState5 = mapViewportState4;
                mapState8 = mapState4;
                o0Var2 = o0Var;
                if (i36 != 0) {
                    qVar12 = null;
                    r15 = mapViewportState4;
                    mapState6 = mapState4;
                    r14 = o0Var;
                } else {
                    qVar12 = qVar5;
                    r15 = mapViewportState5;
                    mapState6 = mapState8;
                    r14 = o0Var2;
                }
            } else {
                if (i47 != 0) {
                    rVar2 = h4.r.S;
                }
                if ((i16 & 2) != 0) {
                    cVar = (c) o0VarE.A(t1.f91490h);
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                    i17 &= -113;
                } else {
                    composeMapInitOptions3 = composeMapInitOptions2;
                }
                if (i49 != 0) {
                    qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                } else {
                    qVarM135getLambda1$extension_compose_release = qVar6;
                }
                if (i18 != 0) {
                    qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                } else {
                    qVarM136getLambda2$extension_compose_release = qVar7;
                }
                if (i24 != 0) {
                    qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                } else {
                    qVarM137getLambda3$extension_compose_release = qVar3;
                }
                if (i26 != 0) {
                    qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                }
                if ((i16 & 64) != 0) {
                    o0VarE.L(-135744814);
                    Object objD117 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                    o0 o0Var119 = o0VarE;
                    o0Var119.g0(false);
                    i17 &= -3670017;
                    mapViewportState3 = (MapViewportState) objD117;
                    o0Var = o0Var119;
                } else {
                    o0Var = o0VarE;
                    mapViewportState3 = mapViewportState2;
                }
                if ((i16 & 128) != 0) {
                    o0Var.L(-231233878);
                    mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                    o0Var.g0(false);
                    i17 &= -29360129;
                } else {
                    mapState3 = mapState2;
                }
                if (i28 != 0) {
                    onMapClickListener2 = null;
                } else {
                    onMapClickListener2 = onMapClickListener;
                }
                if (i29 != 0) {
                    mapState3 = mapState5;
                    onMapLongClickListener2 = null;
                } else {
                    mapState3 = mapState5;
                    onMapLongClickListener2 = onMapLongClickListener;
                }
                if (i30 != 0) {
                    mapState3 = mapState5;
                    mapState3 = mapState5;
                    pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                } else {
                    mapState3 = mapState5;
                    mapState3 = mapState5;
                    pVarM139getLambda5$extension_compose_release = pVar;
                }
                q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar11111 = qVarM135getLambda1$extension_compose_release;
                composeMapInitOptions4 = composeMapInitOptions3;
                rVar3 = rVar2;
                qVar8 = qVarM136getLambda2$extension_compose_release;
                qVar9 = qVarM138getLambda4$extension_compose_release;
                qVar10 = qVar11111;
                i39 = i17;
                qVar11 = qVarM137getLambda3$extension_compose_release;
                onMapClickListener3 = onMapClickListener2;
                mapState4 = mapState3;
                mapViewportState4 = mapViewportState3;
                mapViewportState5 = mapViewportState4;
                mapState8 = mapState4;
                o0Var2 = o0Var;
                if (i36 != 0) {
                    qVar12 = null;
                    r15 = mapViewportState4;
                    mapState6 = mapState4;
                    r14 = o0Var;
                } else {
                    qVar12 = qVar5;
                    r15 = mapViewportState5;
                    mapState6 = mapState8;
                    r14 = o0Var2;
                }
            }
            r14.h0();
            x1 x1Var15 = n.f135158a;
            qVar13 = qVar12;
            r14.L(658990358);
            if (((Boolean) r14.A(l2.f91259a)).booleanValue()) {
                MapPreviewPlaceholderKt.m207MapPreviewPlaceHolderRWsq2U(rVar3, 0L, 0, 0L, r14, i39 & 14, 14);
                r14.g0(false);
                p2VarI0 = r14.i0();
                if (p2VarI0 == null) {
                    return;
                }
                p2VarI0.f135219d = new AnonymousClass2(rVar3, composeMapInitOptions4, qVar10, qVar8, qVar11, qVar9, r15, mapState6, onMapClickListener3, onMapLongClickListener2, pVarM139getLambda5$extension_compose_release, qVar13, i14, i15, i16);
                return;
            }
            r14.g0(false);
            r14.N(658990505, composeMapInitOptions4);
            context = (Context) r14.A(AndroidCompositionLocals_androidKt.f6042b);
            r14.L(-492369756);
            objQ2 = r14.q();
            aVar.getClass();
            i44 = i39;
            if (objQ2 == m.a.f135155b) {
                ComposeTelemetryEvents.INSTANCE.getMap().increment();
                objQ2 = new MapView(context, composeMapInitOptions4.getMapInitOptions$extension_compose_release(context));
                r14.K(objQ2);
            }
            r14.g0(false);
            mapView = (MapView) objQ2;
            MapViewLifecycleKt.MapViewLifecycle(mapView, r14, 8);
            r14.L(733328855);
            h4.d.f81522a.getClass();
            sVarE = c2.q.e(h4.d.a.f81524b, r14, 0);
            r14.L(-1323940314);
            cVar2 = (c) r14.A(t1.f91490h);
            composeMapInitOptions5 = composeMapInitOptions4;
            oVar = (g6.o) r14.A(t1.f91496n);
            pVar2 = pVarM139getLambda5$extension_compose_release;
            a4Var = (a4) r14.A(t1.f91502t);
            g.V.getClass();
            aVar2 = g.a.f81805b;
            onMapLongClickListener3 = onMapLongClickListener2;
            rVar4 = rVar3;
            onMapClickListener4 = onMapClickListener3;
            mapState7 = mapState6;
            eVar = new z3.e(-2123382363, true, new n0(rVar3));
            if (r14.f135177b != null) {
                p0.l();
                throw null;
            }
            r14.z();
            if (r14.T) {
                r14.M(aVar2);
            } else {
                r14.c();
            }
            r14.f135201z = false;
            b4.c(g.a.f81810g, sVarE, r14);
            b4.c(g.a.f81808e, cVar2, r14);
            b4.c(g.a.f81811h, oVar, r14);
            b4.c(g.a.f81812i, a4Var, r14);
            r14.j();
            eVar.invoke(g3.a(r14), r14, 0);
            r14.L(2058660585);
            r14.L(-2137368960);
            u uVar15 = u.f22885a;
            p002j6.c.b(new MapboxMapKt$MapboxMap$3$1(mapView), x2.d(h4.r.S, 1.0f), null, r14, 48, 4);
            qVar10.invoke(new MapCompassScope(mapView, uVar15), r14, Integer.valueOf((i44 >> 3) & 112));
            qVar8.invoke(new MapScaleBarScope(mapView, uVar15), r14, Integer.valueOf((i44 >> 6) & 112));
            qVar11.invoke(new MapLogoScope(uVar15), r14, Integer.valueOf((i44 >> 9) & 112));
            qVar9.invoke(new MapAttributionScope(mapView, uVar15), r14, Integer.valueOf((i44 >> 12) & 112));
            r14.g0(false);
            r14.g0(false);
            r14.g0(true);
            r14.g0(false);
            r14.g0(false);
            r14.N(658991134, r15);
            r15.BindToMap$extension_compose_release(mapView, r14, ((i44 >> 15) & 112) | 8);
            r14.g0(false);
            ?? r1113 = mapState7;
            r14.N(658991220, r1113);
            r1113.BindToMap$extension_compose_release(mapView.getMapboxMapDeprecated(), r14, ((i44 >> 18) & 112) | 8);
            r14.g0(false);
            onMapClickListener5 = onMapClickListener4;
            qVar14 = qVar13;
            l0.e(new AnonymousClass4(mapView, r14.g(), p0.q(onMapClickListener5, r14), p0.q(onMapLongClickListener3, r14), p0.q(pVar2, r14), p0.q(qVar14, r14), null), Unit.INSTANCE, r14);
            r14.g0(false);
            ?? r218 = r14;
            onMapLongClickListener4 = onMapLongClickListener3;
            r16 = r218;
            pVar3 = pVar2;
            composeMapInitOptions6 = composeMapInitOptions5;
            rVar5 = rVar4;
            r18 = r15;
            r17 = r1113;
        } else {
            o0VarE.G0();
            i38 = i14 & 1;
            aVar = m.f135153a;
            if (i38 != 0) {
                if (i47 != 0) {
                    rVar2 = h4.r.S;
                }
                if ((i16 & 2) != 0) {
                    cVar = (c) o0VarE.A(t1.f91490h);
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                    i17 &= -113;
                } else {
                    composeMapInitOptions3 = composeMapInitOptions2;
                }
                if (i49 != 0) {
                    qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                } else {
                    qVarM135getLambda1$extension_compose_release = qVar6;
                }
                if (i18 != 0) {
                    qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                } else {
                    qVarM136getLambda2$extension_compose_release = qVar7;
                }
                if (i24 != 0) {
                    qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                } else {
                    qVarM137getLambda3$extension_compose_release = qVar3;
                }
                if (i26 != 0) {
                    qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                }
                if ((i16 & 64) != 0) {
                    o0VarE.L(-135744814);
                    Object objD118 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                    o0 o0Var1110 = o0VarE;
                    o0Var1110.g0(false);
                    i17 &= -3670017;
                    mapViewportState3 = (MapViewportState) objD118;
                    o0Var = o0Var1110;
                } else {
                    o0Var = o0VarE;
                    mapViewportState3 = mapViewportState2;
                }
                if ((i16 & 128) != 0) {
                    o0Var.L(-231233878);
                    mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                    o0Var.g0(false);
                    i17 &= -29360129;
                } else {
                    mapState3 = mapState2;
                }
                if (i28 != 0) {
                    onMapClickListener2 = null;
                } else {
                    onMapClickListener2 = onMapClickListener;
                }
                if (i29 != 0) {
                    mapState3 = mapState5;
                    onMapLongClickListener2 = null;
                } else {
                    mapState3 = mapState5;
                    onMapLongClickListener2 = onMapLongClickListener;
                }
                if (i30 != 0) {
                    mapState3 = mapState5;
                    mapState3 = mapState5;
                    pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                } else {
                    mapState3 = mapState5;
                    mapState3 = mapState5;
                    pVarM139getLambda5$extension_compose_release = pVar;
                }
                q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar11112 = qVarM135getLambda1$extension_compose_release;
                composeMapInitOptions4 = composeMapInitOptions3;
                rVar3 = rVar2;
                qVar8 = qVarM136getLambda2$extension_compose_release;
                qVar9 = qVarM138getLambda4$extension_compose_release;
                qVar10 = qVar11112;
                i39 = i17;
                qVar11 = qVarM137getLambda3$extension_compose_release;
                onMapClickListener3 = onMapClickListener2;
                mapState4 = mapState3;
                mapViewportState4 = mapViewportState3;
                mapViewportState5 = mapViewportState4;
                mapState8 = mapState4;
                o0Var2 = o0Var;
                if (i36 != 0) {
                    qVar12 = null;
                    r15 = mapViewportState4;
                    mapState6 = mapState4;
                    r14 = o0Var;
                } else {
                    qVar12 = qVar5;
                    r15 = mapViewportState5;
                    mapState6 = mapState8;
                    r14 = o0Var2;
                }
            } else {
                if (i47 != 0) {
                    rVar2 = h4.r.S;
                }
                if ((i16 & 2) != 0) {
                    cVar = (c) o0VarE.A(t1.f91490h);
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new ComposeMapInitOptions(cVar.getF69050b(), false, 0, (String) null, 14, (j) null);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    composeMapInitOptions3 = (ComposeMapInitOptions) objQ;
                    i17 &= -113;
                } else {
                    composeMapInitOptions3 = composeMapInitOptions2;
                }
                if (i49 != 0) {
                    qVarM135getLambda1$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m135getLambda1$extension_compose_release();
                } else {
                    qVarM135getLambda1$extension_compose_release = qVar6;
                }
                if (i18 != 0) {
                    qVarM136getLambda2$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m136getLambda2$extension_compose_release();
                } else {
                    qVarM136getLambda2$extension_compose_release = qVar7;
                }
                if (i24 != 0) {
                    qVarM137getLambda3$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m137getLambda3$extension_compose_release();
                } else {
                    qVarM137getLambda3$extension_compose_release = qVar3;
                }
                if (i26 != 0) {
                    qVarM138getLambda4$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m138getLambda4$extension_compose_release();
                }
                if ((i16 & 64) != 0) {
                    o0VarE.L(-135744814);
                    Object objD119 = d4.a.d(new Object[0], MapViewportState.INSTANCE.getSaver(), null, new MapViewportStateKt.AnonymousClass2(MapViewportStateKt.AnonymousClass1.INSTANCE), o0VarE, 72, 0);
                    o0 o0Var1111 = o0VarE;
                    o0Var1111.g0(false);
                    i17 &= -3670017;
                    mapViewportState3 = (MapViewportState) objD119;
                    o0Var = o0Var1111;
                } else {
                    o0Var = o0VarE;
                    mapViewportState3 = mapViewportState2;
                }
                if ((i16 & 128) != 0) {
                    o0Var.L(-231233878);
                    mapState5 = (MapState) d4.a.d(new Object[0], MapState.INSTANCE.getSaver(), null, new MapStateKt.AnonymousClass2(MapStateKt.AnonymousClass1.INSTANCE), o0Var, 72, 0);
                    o0Var.g0(false);
                    i17 &= -29360129;
                } else {
                    mapState3 = mapState2;
                }
                if (i28 != 0) {
                    onMapClickListener2 = null;
                } else {
                    onMapClickListener2 = onMapClickListener;
                }
                if (i29 != 0) {
                    mapState3 = mapState5;
                    onMapLongClickListener2 = null;
                } else {
                    mapState3 = mapState5;
                    onMapLongClickListener2 = onMapLongClickListener;
                }
                if (i30 != 0) {
                    mapState3 = mapState5;
                    mapState3 = mapState5;
                    pVarM139getLambda5$extension_compose_release = ComposableSingletons$MapboxMapKt.INSTANCE.m139getLambda5$extension_compose_release();
                } else {
                    mapState3 = mapState5;
                    mapState3 = mapState5;
                    pVarM139getLambda5$extension_compose_release = pVar;
                }
                q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar11113 = qVarM135getLambda1$extension_compose_release;
                composeMapInitOptions4 = composeMapInitOptions3;
                rVar3 = rVar2;
                qVar8 = qVarM136getLambda2$extension_compose_release;
                qVar9 = qVarM138getLambda4$extension_compose_release;
                qVar10 = qVar11113;
                i39 = i17;
                qVar11 = qVarM137getLambda3$extension_compose_release;
                onMapClickListener3 = onMapClickListener2;
                mapState4 = mapState3;
                mapViewportState4 = mapViewportState3;
                mapViewportState5 = mapViewportState4;
                mapState8 = mapState4;
                o0Var2 = o0Var;
                if (i36 != 0) {
                    qVar12 = null;
                    r15 = mapViewportState4;
                    mapState6 = mapState4;
                    r14 = o0Var;
                } else {
                    qVar12 = qVar5;
                    r15 = mapViewportState5;
                    mapState6 = mapState8;
                    r14 = o0Var2;
                }
            }
            r14.h0();
            x1 x1Var16 = n.f135158a;
            qVar13 = qVar12;
            r14.L(658990358);
            if (((Boolean) r14.A(l2.f91259a)).booleanValue()) {
                MapPreviewPlaceholderKt.m207MapPreviewPlaceHolderRWsq2U(rVar3, 0L, 0, 0L, r14, i39 & 14, 14);
                r14.g0(false);
                p2VarI0 = r14.i0();
                if (p2VarI0 == null) {
                    return;
                }
                p2VarI0.f135219d = new AnonymousClass2(rVar3, composeMapInitOptions4, qVar10, qVar8, qVar11, qVar9, r15, mapState6, onMapClickListener3, onMapLongClickListener2, pVarM139getLambda5$extension_compose_release, qVar13, i14, i15, i16);
                return;
            }
            r14.g0(false);
            r14.N(658990505, composeMapInitOptions4);
            context = (Context) r14.A(AndroidCompositionLocals_androidKt.f6042b);
            r14.L(-492369756);
            objQ2 = r14.q();
            aVar.getClass();
            i44 = i39;
            if (objQ2 == m.a.f135155b) {
                ComposeTelemetryEvents.INSTANCE.getMap().increment();
                objQ2 = new MapView(context, composeMapInitOptions4.getMapInitOptions$extension_compose_release(context));
                r14.K(objQ2);
            }
            r14.g0(false);
            mapView = (MapView) objQ2;
            MapViewLifecycleKt.MapViewLifecycle(mapView, r14, 8);
            r14.L(733328855);
            h4.d.f81522a.getClass();
            sVarE = c2.q.e(h4.d.a.f81524b, r14, 0);
            r14.L(-1323940314);
            cVar2 = (c) r14.A(t1.f91490h);
            composeMapInitOptions5 = composeMapInitOptions4;
            oVar = (g6.o) r14.A(t1.f91496n);
            pVar2 = pVarM139getLambda5$extension_compose_release;
            a4Var = (a4) r14.A(t1.f91502t);
            g.V.getClass();
            aVar2 = g.a.f81805b;
            onMapLongClickListener3 = onMapLongClickListener2;
            rVar4 = rVar3;
            onMapClickListener4 = onMapClickListener3;
            mapState7 = mapState6;
            eVar = new z3.e(-2123382363, true, new n0(rVar3));
            if (r14.f135177b != null) {
                p0.l();
                throw null;
            }
            r14.z();
            if (r14.T) {
                r14.M(aVar2);
            } else {
                r14.c();
            }
            r14.f135201z = false;
            b4.c(g.a.f81810g, sVarE, r14);
            b4.c(g.a.f81808e, cVar2, r14);
            b4.c(g.a.f81811h, oVar, r14);
            b4.c(g.a.f81812i, a4Var, r14);
            r14.j();
            eVar.invoke(g3.a(r14), r14, 0);
            r14.L(2058660585);
            r14.L(-2137368960);
            u uVar16 = u.f22885a;
            p002j6.c.b(new MapboxMapKt$MapboxMap$3$1(mapView), x2.d(h4.r.S, 1.0f), null, r14, 48, 4);
            qVar10.invoke(new MapCompassScope(mapView, uVar16), r14, Integer.valueOf((i44 >> 3) & 112));
            qVar8.invoke(new MapScaleBarScope(mapView, uVar16), r14, Integer.valueOf((i44 >> 6) & 112));
            qVar11.invoke(new MapLogoScope(uVar16), r14, Integer.valueOf((i44 >> 9) & 112));
            qVar9.invoke(new MapAttributionScope(mapView, uVar16), r14, Integer.valueOf((i44 >> 12) & 112));
            r14.g0(false);
            r14.g0(false);
            r14.g0(true);
            r14.g0(false);
            r14.g0(false);
            r14.N(658991134, r15);
            r15.BindToMap$extension_compose_release(mapView, r14, ((i44 >> 15) & 112) | 8);
            r14.g0(false);
            ?? r1114 = mapState7;
            r14.N(658991220, r1114);
            r1114.BindToMap$extension_compose_release(mapView.getMapboxMapDeprecated(), r14, ((i44 >> 18) & 112) | 8);
            r14.g0(false);
            onMapClickListener5 = onMapClickListener4;
            qVar14 = qVar13;
            l0.e(new AnonymousClass4(mapView, r14.g(), p0.q(onMapClickListener5, r14), p0.q(onMapLongClickListener3, r14), p0.q(pVar2, r14), p0.q(qVar14, r14), null), Unit.INSTANCE, r14);
            r14.g0(false);
            ?? r219 = r14;
            onMapLongClickListener4 = onMapLongClickListener3;
            r16 = r219;
            pVar3 = pVar2;
            composeMapInitOptions6 = composeMapInitOptions5;
            rVar5 = rVar4;
            r18 = r15;
            r17 = r1114;
        }
        p2VarI1 = r16.i0();
        if (p2VarI1 == null) {
            return;
        }
        p2VarI1.f135219d = new AnonymousClass5(rVar5, composeMapInitOptions6, qVar10, qVar8, qVar11, qVar9, r18, r17, onMapClickListener5, onMapLongClickListener4, pVar3, qVar14, i14, i15, i16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnMapClickListener MapboxMap$lambda$4(x3<? extends OnMapClickListener> x3Var) {
        return x3Var.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnMapLongClickListener MapboxMap$lambda$5(x3<? extends OnMapLongClickListener> x3Var) {
        return x3Var.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q<MapboxMapScope, m, Integer, Unit> MapboxMap$lambda$6(x3<? extends q<? super MapboxMapScope, ? super m, ? super Integer, Unit>> x3Var) {
        return (q) x3Var.getF182175a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p<m, Integer, Unit> MapboxMap$lambda$7(x3<? extends p<? super m, ? super Integer, Unit>> x3Var) {
        return (p) x3Var.getF182175a();
    }

    private static final Object disposingComposition(o oVar, d<? super Unit> dVar) {
        try {
            m0.a(dVar);
            throw new KotlinNothingValueException();
        } catch (Throwable th3) {
            oVar.dispose();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapboxMapKt$MapboxMap$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ q<MapAttributionScope, m, Integer, Unit> $attribution;
        final /* synthetic */ q<MapCompassScope, m, Integer, Unit> $compass;
        final /* synthetic */ ComposeMapInitOptions $composeMapInitOptions;
        final /* synthetic */ q<MapboxMapScope, m, Integer, Unit> $content;
        final /* synthetic */ q<MapLogoScope, m, Integer, Unit> $logo;
        final /* synthetic */ MapState $mapState;
        final /* synthetic */ MapViewportState $mapViewportState;
        final /* synthetic */ h4.r $modifier;
        final /* synthetic */ OnMapClickListener $onMapClickListener;
        final /* synthetic */ OnMapLongClickListener $onMapLongClickListener;
        final /* synthetic */ q<MapScaleBarScope, m, Integer, Unit> $scaleBar;
        final /* synthetic */ p<m, Integer, Unit> $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(h4.r rVar, ComposeMapInitOptions composeMapInitOptions, q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar, q<? super MapScaleBarScope, ? super m, ? super Integer, Unit> qVar2, q<? super MapLogoScope, ? super m, ? super Integer, Unit> qVar3, q<? super MapAttributionScope, ? super m, ? super Integer, Unit> qVar4, MapViewportState mapViewportState, MapState mapState, OnMapClickListener onMapClickListener, OnMapLongClickListener onMapLongClickListener, p<? super m, ? super Integer, Unit> pVar, q<? super MapboxMapScope, ? super m, ? super Integer, Unit> qVar5, int i14, int i15, int i16) {
            super(2);
            this.$modifier = rVar;
            this.$composeMapInitOptions = composeMapInitOptions;
            this.$compass = qVar;
            this.$scaleBar = qVar2;
            this.$logo = qVar3;
            this.$attribution = qVar4;
            this.$mapViewportState = mapViewportState;
            this.$mapState = mapState;
            this.$onMapClickListener = onMapClickListener;
            this.$onMapLongClickListener = onMapLongClickListener;
            this.$style = pVar;
            this.$content = qVar5;
            this.$$changed = i14;
            this.$$changed1 = i15;
            this.$$default = i16;
        }

        public final void invoke(m mVar, int i14) {
            MapboxMapKt.MapboxMap(this.$modifier, this.$composeMapInitOptions, this.$compass, this.$scaleBar, this.$logo, this.$attribution, this.$mapViewportState, this.$mapState, this.$onMapClickListener, this.$onMapLongClickListener, this.$style, this.$content, mVar, this.$$changed | 1, this.$$changed1, this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapboxMapKt$MapboxMap$5, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass5 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ q<MapAttributionScope, m, Integer, Unit> $attribution;
        final /* synthetic */ q<MapCompassScope, m, Integer, Unit> $compass;
        final /* synthetic */ ComposeMapInitOptions $composeMapInitOptions;
        final /* synthetic */ q<MapboxMapScope, m, Integer, Unit> $content;
        final /* synthetic */ q<MapLogoScope, m, Integer, Unit> $logo;
        final /* synthetic */ MapState $mapState;
        final /* synthetic */ MapViewportState $mapViewportState;
        final /* synthetic */ h4.r $modifier;
        final /* synthetic */ OnMapClickListener $onMapClickListener;
        final /* synthetic */ OnMapLongClickListener $onMapLongClickListener;
        final /* synthetic */ q<MapScaleBarScope, m, Integer, Unit> $scaleBar;
        final /* synthetic */ p<m, Integer, Unit> $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(h4.r rVar, ComposeMapInitOptions composeMapInitOptions, q<? super MapCompassScope, ? super m, ? super Integer, Unit> qVar, q<? super MapScaleBarScope, ? super m, ? super Integer, Unit> qVar2, q<? super MapLogoScope, ? super m, ? super Integer, Unit> qVar3, q<? super MapAttributionScope, ? super m, ? super Integer, Unit> qVar4, MapViewportState mapViewportState, MapState mapState, OnMapClickListener onMapClickListener, OnMapLongClickListener onMapLongClickListener, p<? super m, ? super Integer, Unit> pVar, q<? super MapboxMapScope, ? super m, ? super Integer, Unit> qVar5, int i14, int i15, int i16) {
            super(2);
            this.$modifier = rVar;
            this.$composeMapInitOptions = composeMapInitOptions;
            this.$compass = qVar;
            this.$scaleBar = qVar2;
            this.$logo = qVar3;
            this.$attribution = qVar4;
            this.$mapViewportState = mapViewportState;
            this.$mapState = mapState;
            this.$onMapClickListener = onMapClickListener;
            this.$onMapLongClickListener = onMapLongClickListener;
            this.$style = pVar;
            this.$content = qVar5;
            this.$$changed = i14;
            this.$$changed1 = i15;
            this.$$default = i16;
        }

        public final void invoke(m mVar, int i14) {
            MapboxMapKt.MapboxMap(this.$modifier, this.$composeMapInitOptions, this.$compass, this.$scaleBar, this.$logo, this.$attribution, this.$mapViewportState, this.$mapState, this.$onMapClickListener, this.$onMapLongClickListener, this.$style, this.$content, mVar, this.$$changed | 1, this.$$changed1, this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }
}
