package com.mapbox.maps.extension.compose.ornaments.compass;

import b5.a0;
import b5.c;
import b5.h0;
import b5.q;
import b5.r0;
import b5.s;
import b5.s0;
import c2.h2;
import c2.l;
import c2.t;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.MapView;
import com.mapbox.maps.extension.compose.MapboxMapScopeMarker;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsUtils;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import com.mapbox.maps.plugin.animation.MapAnimationOwnerRegistry;
import e23.a;
import e23.p;
import g6.f;
import l4.k;
import o13.r;
import o53.b0;
import o53.c0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p008y1.h1;
import p008y1.k3;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.e0;
import r1.u0;
import r1.v1;
import t13.d;
import v13.e;
import v13.h;
import v13.i;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\u00020\b*\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014JQ\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\r2\b\b\u0002\u0010\u001c\u001a\u00020\r2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/mapbox/maps/extension/compose/ornaments/compass/MapCompassScope;", "", "Lcom/mapbox/maps/MapView;", "mapView", "Lc2/t;", "boxScope", "<init>", "(Lcom/mapbox/maps/MapView;Lc2/t;)V", "", "resetToFacingNorth", "()V", "", "rotation", "", "isFacingNorth", "(F)Z", "Lb5/h0;", "Lkotlin/Function0;", "onTap", "detectTapWithoutConsume", "(Lb5/h0;Le23/a;Lt13/d;)Ljava/lang/Object;", "Lh4/r;", "modifier", "Lc2/h2;", "contentPadding", "Lh4/d;", "alignment", "fadeWhenFacingNorth", "resetToNorthUponClick", FirebaseAnalytics.Param.CONTENT, "Compass", "(Lh4/r;Lc2/h2;Lh4/d;ZZLe23/p;Lp3/m;II)V", "Lcom/mapbox/maps/MapView;", "Lc2/t;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxMapScopeMarker
public final class MapCompassScope {
    private final t boxScope;
    private final MapView mapView;

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope$detectTapWithoutConsume$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
    @e(c = "com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope$detectTapWithoutConsume$2", f = "MapCompassScope.kt", l = {143}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p<b0, d<? super Unit>, Object> {
        final /* synthetic */ a<Unit> $onTap;
        final /* synthetic */ h0 $this_detectTapWithoutConsume;
        int label;

        /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope$detectTapWithoutConsume$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/h0;", "", "<anonymous>", "(Lb5/h0;)V"}, k = 3, mv = {1, 7, 1})
        @e(c = "com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope$detectTapWithoutConsume$2$1", f = "MapCompassScope.kt", l = {SyslogConstants.LOG_LOCAL2}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends i implements p<h0, d<? super Unit>, Object> {
            final /* synthetic */ a<Unit> $onTap;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope$detectTapWithoutConsume$2$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lb5/c;", "", "<anonymous>", "(Lb5/c;)V"}, k = 3, mv = {1, 7, 1})
            @e(c = "com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope$detectTapWithoutConsume$2$1$1", f = "MapCompassScope.kt", l = {145, 146}, m = "invokeSuspend")
            public static final class C11641 extends h implements p<c, d<? super Unit>, Object> {
                final /* synthetic */ a<Unit> $onTap;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C11641(a<Unit> aVar, d<? super C11641> dVar) {
                    super(2, dVar);
                    this.$onTap = aVar;
                }

                @Override // v13.a
                public final d<Unit> create(Object obj, d<?> dVar) {
                    C11641 c11641 = new C11641(this.$onTap, dVar);
                    c11641.L$0 = obj;
                    return c11641;
                }

                @Override // e23.p
                public final Object invoke(c cVar, d<? super Unit> dVar) {
                    return ((C11641) create(cVar, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
                
                    if (r6 == r0) goto L15;
                 */
                @Override // v13.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    c cVar;
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i14 = this.label;
                    if (i14 == 0) {
                        r.b(obj);
                        cVar = (c) this.L$0;
                        this.L$0 = cVar;
                        this.label = 1;
                        k3.a aVar2 = k3.f193358a;
                        if (k3.b(cVar, true, s.Main, this) != aVar) {
                        }
                        return aVar;
                    }
                    if (i14 == 1) {
                        cVar = (c) this.L$0;
                        r.b(obj);
                    } else {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                    if (((a0) obj) != null) {
                        this.$onTap.invoke();
                    }
                    return Unit.INSTANCE;
                    this.L$0 = null;
                    this.label = 2;
                    k3.a aVar3 = k3.f193358a;
                    obj = k3.j(cVar, s.Main, this);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(a<Unit> aVar, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$onTap = aVar;
            }

            @Override // v13.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onTap, dVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // e23.p
            public final Object invoke(h0 h0Var, d<? super Unit> dVar) {
                return ((AnonymousClass1) create(h0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    r.b(obj);
                    h0 h0Var = (h0) this.L$0;
                    C11641 c11641 = new C11641(this.$onTap, null);
                    this.label = 1;
                    if (h0Var.R(c11641, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(h0 h0Var, a<Unit> aVar, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$this_detectTapWithoutConsume = h0Var;
            this.$onTap = aVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$this_detectTapWithoutConsume, this.$onTap, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                h0 h0Var = this.$this_detectTapWithoutConsume;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onTap, null);
                this.label = 1;
                if (h1.d(h0Var, anonymousClass1, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public MapCompassScope(MapView mapView, t tVar) {
        mapView.getClass();
        tVar.getClass();
        this.mapView = mapView;
        this.boxScope = tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Compass$lambda$1(p1<Float> p1Var) {
        return p1Var.getF182175a().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Compass$lambda$2(p1<Float> p1Var, float f14) {
        p1Var.setValue(Float.valueOf(f14));
    }

    private static final boolean Compass$lambda$4(p1<Boolean> p1Var) {
        return p1Var.getF182175a().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Compass$lambda$5(p1<Boolean> p1Var, boolean z14) {
        p1Var.setValue(Boolean.valueOf(z14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object detectTapWithoutConsume(h0 h0Var, a<Unit> aVar, d<? super Unit> dVar) {
        Object objE = c0.e(new AnonymousClass2(h0Var, aVar, null), dVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFacingNorth(float rotation) {
        double dAbs = Math.abs(rotation);
        return dAbs >= 359.0d || dAbs <= 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetToFacingNorth() {
        CameraAnimationsPlugin camera = CameraAnimationsUtils.getCamera(this.mapView);
        CameraOptions.Builder builder = new CameraOptions.Builder();
        builder.bearing(Double.valueOf(0.0d));
        CameraOptions cameraOptionsBuild = builder.build();
        cameraOptionsBuild.getClass();
        MapAnimationOptions.Companion companion = MapAnimationOptions.INSTANCE;
        MapAnimationOptions.Builder builder2 = new MapAnimationOptions.Builder();
        builder2.owner(MapAnimationOwnerRegistry.GESTURES);
        Unit unit = Unit.INSTANCE;
        CameraAnimationsPlugin.DefaultImpls.easeTo$default(camera, cameraOptionsBuild, builder2.build(), null, 4, null);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012f  */
    /* JADX WARN: Code duplicated, block: B:104:0x014a  */
    /* JADX WARN: Code duplicated, block: B:108:0x016e A[LOOP:0: B:106:0x016b->B:108:0x016e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x017f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0189  */
    /* JADX WARN: Code duplicated, block: B:119:0x0200  */
    /* JADX WARN: Code duplicated, block: B:123:0x0207  */
    /* JADX WARN: Code duplicated, block: B:127:0x0260 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:128:0x0261  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0107  */
    /* JADX WARN: Code duplicated, block: B:90:0x010f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x0117  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a  */
    public final void Compass(h4.r rVar, h2 h2Var, h4.d dVar, boolean z14, boolean z15, p<? super m, ? super Integer, Unit> pVar, m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        h2 h2VarA;
        int i17;
        h4.d dVar2;
        int i18;
        int i19;
        boolean z16;
        int i24;
        int i25;
        boolean z17;
        int i26;
        int i27;
        p<? super m, ? super Integer, Unit> pVarM213getLambda1$extension_compose_release;
        int i28;
        int i29;
        h4.r rVar3;
        h4.d dVar3;
        boolean z18;
        Object objK;
        m.a.C2565a c2565a;
        p1 p1Var;
        Object objQ;
        p1 p1Var2;
        Object[] objArr;
        int i30;
        boolean zB;
        Object objQ2;
        boolean z19;
        p1 p1Var3;
        boolean zB2;
        Object objQ3;
        p<? super m, ? super Integer, Unit> pVar2;
        h2 h2Var2;
        boolean z24;
        boolean z25;
        h4.d dVar4;
        h4.r rVar4;
        p2 p2VarI0;
        o0 o0VarE = mVar.E(-1104667576);
        int i34 = i15 & 1;
        if (i34 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 14) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        int i35 = i15 & 2;
        if (i35 == 0) {
            if ((i14 & 112) == 0) {
                h2VarA = h2Var;
                i16 |= o0VarE.B(h2VarA) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 896) == 0) {
                    dVar2 = dVar;
                    if (o0VarE.B(dVar2)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 8;
                if (i19 != 0) {
                    if ((i14 & 7168) == 0) {
                        z16 = z14;
                        if (o0VarE.h(z16)) {
                            i24 = 2048;
                        } else {
                            i24 = 1024;
                        }
                        i16 |= i24;
                    }
                    i25 = i15 & 16;
                    if (i25 != 0) {
                        if ((57344 & i14) == 0) {
                            z17 = z15;
                            if (o0VarE.h(z17)) {
                                i26 = 16384;
                            } else {
                                i26 = 8192;
                            }
                            i16 |= i26;
                        }
                        i27 = i15 & 32;
                        if (i27 != 0) {
                            i16 |= 196608;
                            pVarM213getLambda1$extension_compose_release = pVar;
                        } else {
                            pVarM213getLambda1$extension_compose_release = pVar;
                            if ((i14 & 458752) == 0) {
                                if (o0VarE.B(pVarM213getLambda1$extension_compose_release)) {
                                    i28 = 131072;
                                } else {
                                    i28 = 65536;
                                }
                                i16 |= i28;
                            }
                        }
                        if ((i15 & 64) != 0) {
                            if ((i14 & 3670016) == 0) {
                                if (o0VarE.B(this)) {
                                    i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                } else {
                                    i29 = 524288;
                                }
                            }
                            if ((i16 & 2995931) == 599186 || !o0VarE.b()) {
                                if (i34 != 0) {
                                    rVar3 = h4.r.S;
                                } else {
                                    rVar3 = rVar2;
                                }
                                if (i35 != 0) {
                                    f.a aVar = f.f75994b;
                                    h2VarA = l.a(4);
                                }
                                if (i17 != 0) {
                                    h4.d.f81522a.getClass();
                                    dVar3 = h4.d.a.f81526d;
                                } else {
                                    dVar3 = dVar2;
                                }
                                if (i19 != 0) {
                                    z16 = true;
                                }
                                z18 = i25 == 0 ? z17 : true;
                                if (i27 != 0) {
                                    pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                                }
                                x1 x1Var = n.f135158a;
                                objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                                c2565a = m.a.f135155b;
                                if (objK == c2565a) {
                                    objK = p0.n(Float.valueOf(0.0f));
                                    o0VarE.K(objK);
                                }
                                o0VarE.g0(false);
                                p1Var = (p1) objK;
                                o0VarE.L(-492369756);
                                objQ = o0VarE.q();
                                if (objQ == c2565a) {
                                    objQ = p0.n(Boolean.FALSE);
                                    o0VarE.K(objQ);
                                }
                                o0VarE.g0(false);
                                p1Var2 = (p1) objQ;
                                Unit unit = Unit.INSTANCE;
                                objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                                o0VarE.L(-568225417);
                                zB = false;
                                for (i30 = 0; i30 < 4; i30++) {
                                    zB |= o0VarE.B(objArr[i30]);
                                }
                                objQ2 = o0VarE.q();
                                if (!zB || objQ2 == m.a.f135155b) {
                                    boolean z26 = z16;
                                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z26, p1Var2, null);
                                    z19 = z26;
                                    p1Var3 = p1Var2;
                                    o0VarE.K(objQ2);
                                } else {
                                    boolean z27 = z16;
                                    p1Var3 = p1Var2;
                                    z19 = z27;
                                }
                                o0VarE.g0(false);
                                l0.e((p) objQ2, unit, o0VarE);
                                boolean zCompass$lambda$4 = Compass$lambda$4(p1Var3);
                                v1 v1VarD = u0.d(s1.l.d(500, 0, null, 6), 2);
                                boolean z28 = z19;
                                r1.x1 x1VarE = u0.e(s1.l.d(500, 500, null, 4), 2);
                                o0VarE.L(1868333135);
                                h4.r rVarG = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                                Unit unit2 = Unit.INSTANCE;
                                Boolean boolValueOf = Boolean.valueOf(z18);
                                o0VarE.L(511388516);
                                zB2 = o0VarE.B(boolValueOf) | o0VarE.B(this);
                                objQ3 = o0VarE.q();
                                if (zB2 || objQ3 == m.a.f135155b) {
                                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                    o0VarE.K(objQ3);
                                }
                                o0VarE.g0(false);
                                q qVar = s0.f15885a;
                                h4.r rVarThen = rVarG.then(new r0(unit2, null, null, new s0.a((p) objQ3), 6, null));
                                o0VarE.g0(false);
                                r1.c0.e(zCompass$lambda$4, rVarThen, v1VarD, x1VarE, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                                x1 x1Var2 = n.f135158a;
                                h2 h2Var3 = h2VarA;
                                pVar2 = pVarM213getLambda1$extension_compose_release;
                                h2Var2 = h2Var3;
                                z24 = z28;
                                z25 = z18;
                                dVar4 = dVar3;
                                rVar4 = rVar3;
                            } else {
                                o0VarE.e();
                                h2 h2Var4 = h2VarA;
                                pVar2 = pVarM213getLambda1$extension_compose_release;
                                h2Var2 = h2Var4;
                                rVar4 = rVar2;
                                dVar4 = dVar2;
                                z24 = z16;
                                z25 = z17;
                            }
                            p2VarI0 = o0VarE.i0();
                            if (p2VarI0 == null) {
                                return;
                            }
                            p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
                        }
                        i29 = 1572864;
                        i16 |= i29;
                        if ((i16 & 2995931) == 599186) {
                            if (i34 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i35 != 0) {
                                f.a aVar2 = f.f75994b;
                                h2VarA = l.a(4);
                            }
                            if (i17 != 0) {
                                h4.d.f81522a.getClass();
                                dVar3 = h4.d.a.f81526d;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            }
                            if (i25 == 0) {
                            }
                            if (i27 != 0) {
                                pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                            }
                            x1 x1Var3 = n.f135158a;
                            objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                            c2565a = m.a.f135155b;
                            if (objK == c2565a) {
                                objK = p0.n(Float.valueOf(0.0f));
                                o0VarE.K(objK);
                            }
                            o0VarE.g0(false);
                            p1Var = (p1) objK;
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            if (objQ == c2565a) {
                                objQ = p0.n(Boolean.FALSE);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            p1Var2 = (p1) objQ;
                            Unit unit3 = Unit.INSTANCE;
                            objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                            o0VarE.L(-568225417);
                            zB = false;
                            while (i30 < 4) {
                                zB |= o0VarE.B(objArr[i30]);
                            }
                            objQ2 = o0VarE.q();
                            if (zB) {
                                boolean z29 = z16;
                                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z29, p1Var2, null);
                                z19 = z29;
                                p1Var3 = p1Var2;
                                o0VarE.K(objQ2);
                            } else {
                                boolean z210 = z16;
                                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z210, p1Var2, null);
                                z19 = z210;
                                p1Var3 = p1Var2;
                                o0VarE.K(objQ2);
                            }
                            o0VarE.g0(false);
                            l0.e((p) objQ2, unit3, o0VarE);
                            boolean zCompass$lambda$5 = Compass$lambda$4(p1Var3);
                            v1 v1VarD2 = u0.d(s1.l.d(500, 0, null, 6), 2);
                            boolean z211 = z19;
                            r1.x1 x1VarE2 = u0.e(s1.l.d(500, 500, null, 4), 2);
                            o0VarE.L(1868333135);
                            h4.r rVarG2 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                            Unit unit4 = Unit.INSTANCE;
                            Boolean boolValueOf2 = Boolean.valueOf(z18);
                            o0VarE.L(511388516);
                            zB2 = o0VarE.B(boolValueOf2) | o0VarE.B(this);
                            objQ3 = o0VarE.q();
                            if (zB2) {
                                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                o0VarE.K(objQ3);
                            } else {
                                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                o0VarE.K(objQ3);
                            }
                            o0VarE.g0(false);
                            q qVar2 = s0.f15885a;
                            h4.r rVarThen2 = rVarG2.then(new r0(unit4, null, null, new s0.a((p) objQ3), 6, null));
                            o0VarE.g0(false);
                            r1.c0.e(zCompass$lambda$5, rVarThen2, v1VarD2, x1VarE2, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                            x1 x1Var4 = n.f135158a;
                            h2 h2Var5 = h2VarA;
                            pVar2 = pVarM213getLambda1$extension_compose_release;
                            h2Var2 = h2Var5;
                            z24 = z211;
                            z25 = z18;
                            dVar4 = dVar3;
                            rVar4 = rVar3;
                        } else {
                            if (i34 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i35 != 0) {
                                f.a aVar3 = f.f75994b;
                                h2VarA = l.a(4);
                            }
                            if (i17 != 0) {
                                h4.d.f81522a.getClass();
                                dVar3 = h4.d.a.f81526d;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            }
                            if (i25 == 0) {
                            }
                            if (i27 != 0) {
                                pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                            }
                            x1 x1Var5 = n.f135158a;
                            objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                            c2565a = m.a.f135155b;
                            if (objK == c2565a) {
                                objK = p0.n(Float.valueOf(0.0f));
                                o0VarE.K(objK);
                            }
                            o0VarE.g0(false);
                            p1Var = (p1) objK;
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            if (objQ == c2565a) {
                                objQ = p0.n(Boolean.FALSE);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            p1Var2 = (p1) objQ;
                            Unit unit5 = Unit.INSTANCE;
                            objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                            o0VarE.L(-568225417);
                            zB = false;
                            while (i30 < 4) {
                                zB |= o0VarE.B(objArr[i30]);
                            }
                            objQ2 = o0VarE.q();
                            if (zB) {
                                boolean z212 = z16;
                                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z212, p1Var2, null);
                                z19 = z212;
                                p1Var3 = p1Var2;
                                o0VarE.K(objQ2);
                            } else {
                                boolean z213 = z16;
                                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z213, p1Var2, null);
                                z19 = z213;
                                p1Var3 = p1Var2;
                                o0VarE.K(objQ2);
                            }
                            o0VarE.g0(false);
                            l0.e((p) objQ2, unit5, o0VarE);
                            boolean zCompass$lambda$6 = Compass$lambda$4(p1Var3);
                            v1 v1VarD3 = u0.d(s1.l.d(500, 0, null, 6), 2);
                            boolean z214 = z19;
                            r1.x1 x1VarE3 = u0.e(s1.l.d(500, 500, null, 4), 2);
                            o0VarE.L(1868333135);
                            h4.r rVarG3 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                            Unit unit6 = Unit.INSTANCE;
                            Boolean boolValueOf3 = Boolean.valueOf(z18);
                            o0VarE.L(511388516);
                            zB2 = o0VarE.B(boolValueOf3) | o0VarE.B(this);
                            objQ3 = o0VarE.q();
                            if (zB2) {
                                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                o0VarE.K(objQ3);
                            } else {
                                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                o0VarE.K(objQ3);
                            }
                            o0VarE.g0(false);
                            q qVar3 = s0.f15885a;
                            h4.r rVarThen3 = rVarG3.then(new r0(unit6, null, null, new s0.a((p) objQ3), 6, null));
                            o0VarE.g0(false);
                            r1.c0.e(zCompass$lambda$6, rVarThen3, v1VarD3, x1VarE3, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                            x1 x1Var6 = n.f135158a;
                            h2 h2Var6 = h2VarA;
                            pVar2 = pVarM213getLambda1$extension_compose_release;
                            h2Var2 = h2Var6;
                            z24 = z214;
                            z25 = z18;
                            dVar4 = dVar3;
                            rVar4 = rVar3;
                        }
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 == null) {
                            return;
                        }
                        p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
                    }
                    i16 |= 24576;
                    z17 = z15;
                    i27 = i15 & 32;
                    if (i27 != 0) {
                        i16 |= 196608;
                        pVarM213getLambda1$extension_compose_release = pVar;
                    } else {
                        pVarM213getLambda1$extension_compose_release = pVar;
                        if ((i14 & 458752) == 0) {
                            if (o0VarE.B(pVarM213getLambda1$extension_compose_release)) {
                                i28 = 131072;
                            } else {
                                i28 = 65536;
                            }
                            i16 |= i28;
                        }
                    }
                    if ((i15 & 64) != 0) {
                        if ((i14 & 3670016) == 0) {
                            if (o0VarE.B(this)) {
                                i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            } else {
                                i29 = 524288;
                            }
                        }
                        if ((i16 & 2995931) == 599186) {
                            if (i34 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i35 != 0) {
                                f.a aVar4 = f.f75994b;
                                h2VarA = l.a(4);
                            }
                            if (i17 != 0) {
                                h4.d.f81522a.getClass();
                                dVar3 = h4.d.a.f81526d;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            }
                            if (i25 == 0) {
                            }
                            if (i27 != 0) {
                                pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                            }
                            x1 x1Var7 = n.f135158a;
                            objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                            c2565a = m.a.f135155b;
                            if (objK == c2565a) {
                                objK = p0.n(Float.valueOf(0.0f));
                                o0VarE.K(objK);
                            }
                            o0VarE.g0(false);
                            p1Var = (p1) objK;
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            if (objQ == c2565a) {
                                objQ = p0.n(Boolean.FALSE);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            p1Var2 = (p1) objQ;
                            Unit unit7 = Unit.INSTANCE;
                            objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                            o0VarE.L(-568225417);
                            zB = false;
                            while (i30 < 4) {
                                zB |= o0VarE.B(objArr[i30]);
                            }
                            objQ2 = o0VarE.q();
                            if (zB) {
                                boolean z215 = z16;
                                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z215, p1Var2, null);
                                z19 = z215;
                                p1Var3 = p1Var2;
                                o0VarE.K(objQ2);
                            } else {
                                boolean z216 = z16;
                                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z216, p1Var2, null);
                                z19 = z216;
                                p1Var3 = p1Var2;
                                o0VarE.K(objQ2);
                            }
                            o0VarE.g0(false);
                            l0.e((p) objQ2, unit7, o0VarE);
                            boolean zCompass$lambda$7 = Compass$lambda$4(p1Var3);
                            v1 v1VarD4 = u0.d(s1.l.d(500, 0, null, 6), 2);
                            boolean z217 = z19;
                            r1.x1 x1VarE4 = u0.e(s1.l.d(500, 500, null, 4), 2);
                            o0VarE.L(1868333135);
                            h4.r rVarG4 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                            Unit unit8 = Unit.INSTANCE;
                            Boolean boolValueOf4 = Boolean.valueOf(z18);
                            o0VarE.L(511388516);
                            zB2 = o0VarE.B(boolValueOf4) | o0VarE.B(this);
                            objQ3 = o0VarE.q();
                            if (zB2) {
                                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                o0VarE.K(objQ3);
                            } else {
                                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                o0VarE.K(objQ3);
                            }
                            o0VarE.g0(false);
                            q qVar4 = s0.f15885a;
                            h4.r rVarThen4 = rVarG4.then(new r0(unit8, null, null, new s0.a((p) objQ3), 6, null));
                            o0VarE.g0(false);
                            r1.c0.e(zCompass$lambda$7, rVarThen4, v1VarD4, x1VarE4, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                            x1 x1Var8 = n.f135158a;
                            h2 h2Var7 = h2VarA;
                            pVar2 = pVarM213getLambda1$extension_compose_release;
                            h2Var2 = h2Var7;
                            z24 = z217;
                            z25 = z18;
                            dVar4 = dVar3;
                            rVar4 = rVar3;
                        } else {
                            if (i34 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i35 != 0) {
                                f.a aVar5 = f.f75994b;
                                h2VarA = l.a(4);
                            }
                            if (i17 != 0) {
                                h4.d.f81522a.getClass();
                                dVar3 = h4.d.a.f81526d;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            }
                            if (i25 == 0) {
                            }
                            if (i27 != 0) {
                                pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                            }
                            x1 x1Var9 = n.f135158a;
                            objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                            c2565a = m.a.f135155b;
                            if (objK == c2565a) {
                                objK = p0.n(Float.valueOf(0.0f));
                                o0VarE.K(objK);
                            }
                            o0VarE.g0(false);
                            p1Var = (p1) objK;
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            if (objQ == c2565a) {
                                objQ = p0.n(Boolean.FALSE);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            p1Var2 = (p1) objQ;
                            Unit unit9 = Unit.INSTANCE;
                            objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                            o0VarE.L(-568225417);
                            zB = false;
                            while (i30 < 4) {
                                zB |= o0VarE.B(objArr[i30]);
                            }
                            objQ2 = o0VarE.q();
                            if (zB) {
                                boolean z218 = z16;
                                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z218, p1Var2, null);
                                z19 = z218;
                                p1Var3 = p1Var2;
                                o0VarE.K(objQ2);
                            } else {
                                boolean z219 = z16;
                                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z219, p1Var2, null);
                                z19 = z219;
                                p1Var3 = p1Var2;
                                o0VarE.K(objQ2);
                            }
                            o0VarE.g0(false);
                            l0.e((p) objQ2, unit9, o0VarE);
                            boolean zCompass$lambda$8 = Compass$lambda$4(p1Var3);
                            v1 v1VarD5 = u0.d(s1.l.d(500, 0, null, 6), 2);
                            boolean z2110 = z19;
                            r1.x1 x1VarE5 = u0.e(s1.l.d(500, 500, null, 4), 2);
                            o0VarE.L(1868333135);
                            h4.r rVarG5 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                            Unit unit10 = Unit.INSTANCE;
                            Boolean boolValueOf5 = Boolean.valueOf(z18);
                            o0VarE.L(511388516);
                            zB2 = o0VarE.B(boolValueOf5) | o0VarE.B(this);
                            objQ3 = o0VarE.q();
                            if (zB2) {
                                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                o0VarE.K(objQ3);
                            } else {
                                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                o0VarE.K(objQ3);
                            }
                            o0VarE.g0(false);
                            q qVar5 = s0.f15885a;
                            h4.r rVarThen5 = rVarG5.then(new r0(unit10, null, null, new s0.a((p) objQ3), 6, null));
                            o0VarE.g0(false);
                            r1.c0.e(zCompass$lambda$8, rVarThen5, v1VarD5, x1VarE5, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                            x1 x1Var10 = n.f135158a;
                            h2 h2Var8 = h2VarA;
                            pVar2 = pVarM213getLambda1$extension_compose_release;
                            h2Var2 = h2Var8;
                            z24 = z2110;
                            z25 = z18;
                            dVar4 = dVar3;
                            rVar4 = rVar3;
                        }
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 == null) {
                            return;
                        }
                        p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
                    }
                    i29 = 1572864;
                    i16 |= i29;
                    if ((i16 & 2995931) == 599186) {
                        if (i34 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i35 != 0) {
                            f.a aVar6 = f.f75994b;
                            h2VarA = l.a(4);
                        }
                        if (i17 != 0) {
                            h4.d.f81522a.getClass();
                            dVar3 = h4.d.a.f81526d;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                        }
                        x1 x1Var11 = n.f135158a;
                        objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                        c2565a = m.a.f135155b;
                        if (objK == c2565a) {
                            objK = p0.n(Float.valueOf(0.0f));
                            o0VarE.K(objK);
                        }
                        o0VarE.g0(false);
                        p1Var = (p1) objK;
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        if (objQ == c2565a) {
                            objQ = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        p1Var2 = (p1) objQ;
                        Unit unit11 = Unit.INSTANCE;
                        objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                        o0VarE.L(-568225417);
                        zB = false;
                        while (i30 < 4) {
                            zB |= o0VarE.B(objArr[i30]);
                        }
                        objQ2 = o0VarE.q();
                        if (zB) {
                            boolean z2111 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111, p1Var2, null);
                            z19 = z2111;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        } else {
                            boolean z2112 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2112, p1Var2, null);
                            z19 = z2112;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        }
                        o0VarE.g0(false);
                        l0.e((p) objQ2, unit11, o0VarE);
                        boolean zCompass$lambda$9 = Compass$lambda$4(p1Var3);
                        v1 v1VarD6 = u0.d(s1.l.d(500, 0, null, 6), 2);
                        boolean z2113 = z19;
                        r1.x1 x1VarE6 = u0.e(s1.l.d(500, 500, null, 4), 2);
                        o0VarE.L(1868333135);
                        h4.r rVarG6 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                        Unit unit12 = Unit.INSTANCE;
                        Boolean boolValueOf6 = Boolean.valueOf(z18);
                        o0VarE.L(511388516);
                        zB2 = o0VarE.B(boolValueOf6) | o0VarE.B(this);
                        objQ3 = o0VarE.q();
                        if (zB2) {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        }
                        o0VarE.g0(false);
                        q qVar6 = s0.f15885a;
                        h4.r rVarThen6 = rVarG6.then(new r0(unit12, null, null, new s0.a((p) objQ3), 6, null));
                        o0VarE.g0(false);
                        r1.c0.e(zCompass$lambda$9, rVarThen6, v1VarD6, x1VarE6, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                        x1 x1Var12 = n.f135158a;
                        h2 h2Var9 = h2VarA;
                        pVar2 = pVarM213getLambda1$extension_compose_release;
                        h2Var2 = h2Var9;
                        z24 = z2113;
                        z25 = z18;
                        dVar4 = dVar3;
                        rVar4 = rVar3;
                    } else {
                        if (i34 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i35 != 0) {
                            f.a aVar7 = f.f75994b;
                            h2VarA = l.a(4);
                        }
                        if (i17 != 0) {
                            h4.d.f81522a.getClass();
                            dVar3 = h4.d.a.f81526d;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                        }
                        x1 x1Var13 = n.f135158a;
                        objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                        c2565a = m.a.f135155b;
                        if (objK == c2565a) {
                            objK = p0.n(Float.valueOf(0.0f));
                            o0VarE.K(objK);
                        }
                        o0VarE.g0(false);
                        p1Var = (p1) objK;
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        if (objQ == c2565a) {
                            objQ = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        p1Var2 = (p1) objQ;
                        Unit unit13 = Unit.INSTANCE;
                        objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                        o0VarE.L(-568225417);
                        zB = false;
                        while (i30 < 4) {
                            zB |= o0VarE.B(objArr[i30]);
                        }
                        objQ2 = o0VarE.q();
                        if (zB) {
                            boolean z2114 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2114, p1Var2, null);
                            z19 = z2114;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        } else {
                            boolean z2115 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2115, p1Var2, null);
                            z19 = z2115;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        }
                        o0VarE.g0(false);
                        l0.e((p) objQ2, unit13, o0VarE);
                        boolean zCompass$lambda$10 = Compass$lambda$4(p1Var3);
                        v1 v1VarD7 = u0.d(s1.l.d(500, 0, null, 6), 2);
                        boolean z2116 = z19;
                        r1.x1 x1VarE7 = u0.e(s1.l.d(500, 500, null, 4), 2);
                        o0VarE.L(1868333135);
                        h4.r rVarG7 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                        Unit unit14 = Unit.INSTANCE;
                        Boolean boolValueOf7 = Boolean.valueOf(z18);
                        o0VarE.L(511388516);
                        zB2 = o0VarE.B(boolValueOf7) | o0VarE.B(this);
                        objQ3 = o0VarE.q();
                        if (zB2) {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        }
                        o0VarE.g0(false);
                        q qVar7 = s0.f15885a;
                        h4.r rVarThen7 = rVarG7.then(new r0(unit14, null, null, new s0.a((p) objQ3), 6, null));
                        o0VarE.g0(false);
                        r1.c0.e(zCompass$lambda$10, rVarThen7, v1VarD7, x1VarE7, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                        x1 x1Var14 = n.f135158a;
                        h2 h2Var10 = h2VarA;
                        pVar2 = pVarM213getLambda1$extension_compose_release;
                        h2Var2 = h2Var10;
                        z24 = z2116;
                        z25 = z18;
                        dVar4 = dVar3;
                        rVar4 = rVar3;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
                }
                i16 |= 3072;
                z16 = z14;
                i25 = i15 & 16;
                if (i25 != 0) {
                    if ((57344 & i14) == 0) {
                        z17 = z15;
                        if (o0VarE.h(z17)) {
                            i26 = 16384;
                        } else {
                            i26 = 8192;
                        }
                        i16 |= i26;
                    }
                    i27 = i15 & 32;
                    if (i27 != 0) {
                        i16 |= 196608;
                        pVarM213getLambda1$extension_compose_release = pVar;
                    } else {
                        pVarM213getLambda1$extension_compose_release = pVar;
                        if ((i14 & 458752) == 0) {
                            if (o0VarE.B(pVarM213getLambda1$extension_compose_release)) {
                                i28 = 131072;
                            } else {
                                i28 = 65536;
                            }
                            i16 |= i28;
                        }
                    }
                    if ((i15 & 64) != 0) {
                        if ((i14 & 3670016) == 0) {
                            if (o0VarE.B(this)) {
                                i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            } else {
                                i29 = 524288;
                            }
                        }
                        if ((i16 & 2995931) == 599186) {
                            if (i34 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i35 != 0) {
                                f.a aVar8 = f.f75994b;
                                h2VarA = l.a(4);
                            }
                            if (i17 != 0) {
                                h4.d.f81522a.getClass();
                                dVar3 = h4.d.a.f81526d;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            }
                            if (i25 == 0) {
                            }
                            if (i27 != 0) {
                                pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                            }
                            x1 x1Var15 = n.f135158a;
                            objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                            c2565a = m.a.f135155b;
                            if (objK == c2565a) {
                                objK = p0.n(Float.valueOf(0.0f));
                                o0VarE.K(objK);
                            }
                            o0VarE.g0(false);
                            p1Var = (p1) objK;
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            if (objQ == c2565a) {
                                objQ = p0.n(Boolean.FALSE);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            p1Var2 = (p1) objQ;
                            Unit unit15 = Unit.INSTANCE;
                            objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                            o0VarE.L(-568225417);
                            zB = false;
                            while (i30 < 4) {
                                zB |= o0VarE.B(objArr[i30]);
                            }
                            objQ2 = o0VarE.q();
                            if (zB) {
                                boolean z2117 = z16;
                                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2117, p1Var2, null);
                                z19 = z2117;
                                p1Var3 = p1Var2;
                                o0VarE.K(objQ2);
                            } else {
                                boolean z2118 = z16;
                                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2118, p1Var2, null);
                                z19 = z2118;
                                p1Var3 = p1Var2;
                                o0VarE.K(objQ2);
                            }
                            o0VarE.g0(false);
                            l0.e((p) objQ2, unit15, o0VarE);
                            boolean zCompass$lambda$11 = Compass$lambda$4(p1Var3);
                            v1 v1VarD8 = u0.d(s1.l.d(500, 0, null, 6), 2);
                            boolean z2119 = z19;
                            r1.x1 x1VarE8 = u0.e(s1.l.d(500, 500, null, 4), 2);
                            o0VarE.L(1868333135);
                            h4.r rVarG8 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                            Unit unit16 = Unit.INSTANCE;
                            Boolean boolValueOf8 = Boolean.valueOf(z18);
                            o0VarE.L(511388516);
                            zB2 = o0VarE.B(boolValueOf8) | o0VarE.B(this);
                            objQ3 = o0VarE.q();
                            if (zB2) {
                                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                o0VarE.K(objQ3);
                            } else {
                                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                o0VarE.K(objQ3);
                            }
                            o0VarE.g0(false);
                            q qVar8 = s0.f15885a;
                            h4.r rVarThen8 = rVarG8.then(new r0(unit16, null, null, new s0.a((p) objQ3), 6, null));
                            o0VarE.g0(false);
                            r1.c0.e(zCompass$lambda$11, rVarThen8, v1VarD8, x1VarE8, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                            x1 x1Var16 = n.f135158a;
                            h2 h2Var11 = h2VarA;
                            pVar2 = pVarM213getLambda1$extension_compose_release;
                            h2Var2 = h2Var11;
                            z24 = z2119;
                            z25 = z18;
                            dVar4 = dVar3;
                            rVar4 = rVar3;
                        } else {
                            if (i34 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i35 != 0) {
                                f.a aVar9 = f.f75994b;
                                h2VarA = l.a(4);
                            }
                            if (i17 != 0) {
                                h4.d.f81522a.getClass();
                                dVar3 = h4.d.a.f81526d;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            }
                            if (i25 == 0) {
                            }
                            if (i27 != 0) {
                                pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                            }
                            x1 x1Var17 = n.f135158a;
                            objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                            c2565a = m.a.f135155b;
                            if (objK == c2565a) {
                                objK = p0.n(Float.valueOf(0.0f));
                                o0VarE.K(objK);
                            }
                            o0VarE.g0(false);
                            p1Var = (p1) objK;
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            if (objQ == c2565a) {
                                objQ = p0.n(Boolean.FALSE);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            p1Var2 = (p1) objQ;
                            Unit unit17 = Unit.INSTANCE;
                            objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                            o0VarE.L(-568225417);
                            zB = false;
                            while (i30 < 4) {
                                zB |= o0VarE.B(objArr[i30]);
                            }
                            objQ2 = o0VarE.q();
                            if (zB) {
                                boolean z21110 = z16;
                                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21110, p1Var2, null);
                                z19 = z21110;
                                p1Var3 = p1Var2;
                                o0VarE.K(objQ2);
                            } else {
                                boolean z21111 = z16;
                                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111, p1Var2, null);
                                z19 = z21111;
                                p1Var3 = p1Var2;
                                o0VarE.K(objQ2);
                            }
                            o0VarE.g0(false);
                            l0.e((p) objQ2, unit17, o0VarE);
                            boolean zCompass$lambda$12 = Compass$lambda$4(p1Var3);
                            v1 v1VarD9 = u0.d(s1.l.d(500, 0, null, 6), 2);
                            boolean z21112 = z19;
                            r1.x1 x1VarE9 = u0.e(s1.l.d(500, 500, null, 4), 2);
                            o0VarE.L(1868333135);
                            h4.r rVarG9 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                            Unit unit18 = Unit.INSTANCE;
                            Boolean boolValueOf9 = Boolean.valueOf(z18);
                            o0VarE.L(511388516);
                            zB2 = o0VarE.B(boolValueOf9) | o0VarE.B(this);
                            objQ3 = o0VarE.q();
                            if (zB2) {
                                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                o0VarE.K(objQ3);
                            } else {
                                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                o0VarE.K(objQ3);
                            }
                            o0VarE.g0(false);
                            q qVar9 = s0.f15885a;
                            h4.r rVarThen9 = rVarG9.then(new r0(unit18, null, null, new s0.a((p) objQ3), 6, null));
                            o0VarE.g0(false);
                            r1.c0.e(zCompass$lambda$12, rVarThen9, v1VarD9, x1VarE9, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                            x1 x1Var18 = n.f135158a;
                            h2 h2Var12 = h2VarA;
                            pVar2 = pVarM213getLambda1$extension_compose_release;
                            h2Var2 = h2Var12;
                            z24 = z21112;
                            z25 = z18;
                            dVar4 = dVar3;
                            rVar4 = rVar3;
                        }
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 == null) {
                            return;
                        }
                        p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
                    }
                    i29 = 1572864;
                    i16 |= i29;
                    if ((i16 & 2995931) == 599186) {
                        if (i34 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i35 != 0) {
                            f.a aVar10 = f.f75994b;
                            h2VarA = l.a(4);
                        }
                        if (i17 != 0) {
                            h4.d.f81522a.getClass();
                            dVar3 = h4.d.a.f81526d;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                        }
                        x1 x1Var19 = n.f135158a;
                        objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                        c2565a = m.a.f135155b;
                        if (objK == c2565a) {
                            objK = p0.n(Float.valueOf(0.0f));
                            o0VarE.K(objK);
                        }
                        o0VarE.g0(false);
                        p1Var = (p1) objK;
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        if (objQ == c2565a) {
                            objQ = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        p1Var2 = (p1) objQ;
                        Unit unit19 = Unit.INSTANCE;
                        objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                        o0VarE.L(-568225417);
                        zB = false;
                        while (i30 < 4) {
                            zB |= o0VarE.B(objArr[i30]);
                        }
                        objQ2 = o0VarE.q();
                        if (zB) {
                            boolean z21113 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21113, p1Var2, null);
                            z19 = z21113;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        } else {
                            boolean z21114 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21114, p1Var2, null);
                            z19 = z21114;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        }
                        o0VarE.g0(false);
                        l0.e((p) objQ2, unit19, o0VarE);
                        boolean zCompass$lambda$13 = Compass$lambda$4(p1Var3);
                        v1 v1VarD10 = u0.d(s1.l.d(500, 0, null, 6), 2);
                        boolean z21115 = z19;
                        r1.x1 x1VarE10 = u0.e(s1.l.d(500, 500, null, 4), 2);
                        o0VarE.L(1868333135);
                        h4.r rVarG10 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                        Unit unit110 = Unit.INSTANCE;
                        Boolean boolValueOf10 = Boolean.valueOf(z18);
                        o0VarE.L(511388516);
                        zB2 = o0VarE.B(boolValueOf10) | o0VarE.B(this);
                        objQ3 = o0VarE.q();
                        if (zB2) {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        }
                        o0VarE.g0(false);
                        q qVar10 = s0.f15885a;
                        h4.r rVarThen10 = rVarG10.then(new r0(unit110, null, null, new s0.a((p) objQ3), 6, null));
                        o0VarE.g0(false);
                        r1.c0.e(zCompass$lambda$13, rVarThen10, v1VarD10, x1VarE10, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                        x1 x1Var110 = n.f135158a;
                        h2 h2Var13 = h2VarA;
                        pVar2 = pVarM213getLambda1$extension_compose_release;
                        h2Var2 = h2Var13;
                        z24 = z21115;
                        z25 = z18;
                        dVar4 = dVar3;
                        rVar4 = rVar3;
                    } else {
                        if (i34 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i35 != 0) {
                            f.a aVar11 = f.f75994b;
                            h2VarA = l.a(4);
                        }
                        if (i17 != 0) {
                            h4.d.f81522a.getClass();
                            dVar3 = h4.d.a.f81526d;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                        }
                        x1 x1Var111 = n.f135158a;
                        objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                        c2565a = m.a.f135155b;
                        if (objK == c2565a) {
                            objK = p0.n(Float.valueOf(0.0f));
                            o0VarE.K(objK);
                        }
                        o0VarE.g0(false);
                        p1Var = (p1) objK;
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        if (objQ == c2565a) {
                            objQ = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        p1Var2 = (p1) objQ;
                        Unit unit111 = Unit.INSTANCE;
                        objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                        o0VarE.L(-568225417);
                        zB = false;
                        while (i30 < 4) {
                            zB |= o0VarE.B(objArr[i30]);
                        }
                        objQ2 = o0VarE.q();
                        if (zB) {
                            boolean z21116 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21116, p1Var2, null);
                            z19 = z21116;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        } else {
                            boolean z21117 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21117, p1Var2, null);
                            z19 = z21117;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        }
                        o0VarE.g0(false);
                        l0.e((p) objQ2, unit111, o0VarE);
                        boolean zCompass$lambda$14 = Compass$lambda$4(p1Var3);
                        v1 v1VarD11 = u0.d(s1.l.d(500, 0, null, 6), 2);
                        boolean z21118 = z19;
                        r1.x1 x1VarE11 = u0.e(s1.l.d(500, 500, null, 4), 2);
                        o0VarE.L(1868333135);
                        h4.r rVarG11 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                        Unit unit112 = Unit.INSTANCE;
                        Boolean boolValueOf11 = Boolean.valueOf(z18);
                        o0VarE.L(511388516);
                        zB2 = o0VarE.B(boolValueOf11) | o0VarE.B(this);
                        objQ3 = o0VarE.q();
                        if (zB2) {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        }
                        o0VarE.g0(false);
                        q qVar11 = s0.f15885a;
                        h4.r rVarThen11 = rVarG11.then(new r0(unit112, null, null, new s0.a((p) objQ3), 6, null));
                        o0VarE.g0(false);
                        r1.c0.e(zCompass$lambda$14, rVarThen11, v1VarD11, x1VarE11, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                        x1 x1Var112 = n.f135158a;
                        h2 h2Var14 = h2VarA;
                        pVar2 = pVarM213getLambda1$extension_compose_release;
                        h2Var2 = h2Var14;
                        z24 = z21118;
                        z25 = z18;
                        dVar4 = dVar3;
                        rVar4 = rVar3;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
                }
                i16 |= 24576;
                z17 = z15;
                i27 = i15 & 32;
                if (i27 != 0) {
                    i16 |= 196608;
                    pVarM213getLambda1$extension_compose_release = pVar;
                } else {
                    pVarM213getLambda1$extension_compose_release = pVar;
                    if ((i14 & 458752) == 0) {
                        if (o0VarE.B(pVarM213getLambda1$extension_compose_release)) {
                            i28 = 131072;
                        } else {
                            i28 = 65536;
                        }
                        i16 |= i28;
                    }
                }
                if ((i15 & 64) != 0) {
                    if ((i14 & 3670016) == 0) {
                        if (o0VarE.B(this)) {
                            i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i29 = 524288;
                        }
                    }
                    if ((i16 & 2995931) == 599186) {
                        if (i34 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i35 != 0) {
                            f.a aVar12 = f.f75994b;
                            h2VarA = l.a(4);
                        }
                        if (i17 != 0) {
                            h4.d.f81522a.getClass();
                            dVar3 = h4.d.a.f81526d;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                        }
                        x1 x1Var113 = n.f135158a;
                        objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                        c2565a = m.a.f135155b;
                        if (objK == c2565a) {
                            objK = p0.n(Float.valueOf(0.0f));
                            o0VarE.K(objK);
                        }
                        o0VarE.g0(false);
                        p1Var = (p1) objK;
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        if (objQ == c2565a) {
                            objQ = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        p1Var2 = (p1) objQ;
                        Unit unit113 = Unit.INSTANCE;
                        objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                        o0VarE.L(-568225417);
                        zB = false;
                        while (i30 < 4) {
                            zB |= o0VarE.B(objArr[i30]);
                        }
                        objQ2 = o0VarE.q();
                        if (zB) {
                            boolean z21119 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21119, p1Var2, null);
                            z19 = z21119;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        } else {
                            boolean z211110 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211110, p1Var2, null);
                            z19 = z211110;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        }
                        o0VarE.g0(false);
                        l0.e((p) objQ2, unit113, o0VarE);
                        boolean zCompass$lambda$15 = Compass$lambda$4(p1Var3);
                        v1 v1VarD12 = u0.d(s1.l.d(500, 0, null, 6), 2);
                        boolean z211111 = z19;
                        r1.x1 x1VarE12 = u0.e(s1.l.d(500, 500, null, 4), 2);
                        o0VarE.L(1868333135);
                        h4.r rVarG12 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                        Unit unit114 = Unit.INSTANCE;
                        Boolean boolValueOf12 = Boolean.valueOf(z18);
                        o0VarE.L(511388516);
                        zB2 = o0VarE.B(boolValueOf12) | o0VarE.B(this);
                        objQ3 = o0VarE.q();
                        if (zB2) {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        }
                        o0VarE.g0(false);
                        q qVar12 = s0.f15885a;
                        h4.r rVarThen12 = rVarG12.then(new r0(unit114, null, null, new s0.a((p) objQ3), 6, null));
                        o0VarE.g0(false);
                        r1.c0.e(zCompass$lambda$15, rVarThen12, v1VarD12, x1VarE12, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                        x1 x1Var114 = n.f135158a;
                        h2 h2Var15 = h2VarA;
                        pVar2 = pVarM213getLambda1$extension_compose_release;
                        h2Var2 = h2Var15;
                        z24 = z211111;
                        z25 = z18;
                        dVar4 = dVar3;
                        rVar4 = rVar3;
                    } else {
                        if (i34 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i35 != 0) {
                            f.a aVar13 = f.f75994b;
                            h2VarA = l.a(4);
                        }
                        if (i17 != 0) {
                            h4.d.f81522a.getClass();
                            dVar3 = h4.d.a.f81526d;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                        }
                        x1 x1Var115 = n.f135158a;
                        objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                        c2565a = m.a.f135155b;
                        if (objK == c2565a) {
                            objK = p0.n(Float.valueOf(0.0f));
                            o0VarE.K(objK);
                        }
                        o0VarE.g0(false);
                        p1Var = (p1) objK;
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        if (objQ == c2565a) {
                            objQ = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        p1Var2 = (p1) objQ;
                        Unit unit115 = Unit.INSTANCE;
                        objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                        o0VarE.L(-568225417);
                        zB = false;
                        while (i30 < 4) {
                            zB |= o0VarE.B(objArr[i30]);
                        }
                        objQ2 = o0VarE.q();
                        if (zB) {
                            boolean z211112 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211112, p1Var2, null);
                            z19 = z211112;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        } else {
                            boolean z211113 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211113, p1Var2, null);
                            z19 = z211113;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        }
                        o0VarE.g0(false);
                        l0.e((p) objQ2, unit115, o0VarE);
                        boolean zCompass$lambda$16 = Compass$lambda$4(p1Var3);
                        v1 v1VarD13 = u0.d(s1.l.d(500, 0, null, 6), 2);
                        boolean z211114 = z19;
                        r1.x1 x1VarE13 = u0.e(s1.l.d(500, 500, null, 4), 2);
                        o0VarE.L(1868333135);
                        h4.r rVarG13 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                        Unit unit116 = Unit.INSTANCE;
                        Boolean boolValueOf13 = Boolean.valueOf(z18);
                        o0VarE.L(511388516);
                        zB2 = o0VarE.B(boolValueOf13) | o0VarE.B(this);
                        objQ3 = o0VarE.q();
                        if (zB2) {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        }
                        o0VarE.g0(false);
                        q qVar13 = s0.f15885a;
                        h4.r rVarThen13 = rVarG13.then(new r0(unit116, null, null, new s0.a((p) objQ3), 6, null));
                        o0VarE.g0(false);
                        r1.c0.e(zCompass$lambda$16, rVarThen13, v1VarD13, x1VarE13, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                        x1 x1Var116 = n.f135158a;
                        h2 h2Var16 = h2VarA;
                        pVar2 = pVarM213getLambda1$extension_compose_release;
                        h2Var2 = h2Var16;
                        z24 = z211114;
                        z25 = z18;
                        dVar4 = dVar3;
                        rVar4 = rVar3;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
                }
                i29 = 1572864;
                i16 |= i29;
                if ((i16 & 2995931) == 599186) {
                    if (i34 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i35 != 0) {
                        f.a aVar14 = f.f75994b;
                        h2VarA = l.a(4);
                    }
                    if (i17 != 0) {
                        h4.d.f81522a.getClass();
                        dVar3 = h4.d.a.f81526d;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                    }
                    x1 x1Var117 = n.f135158a;
                    objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = p0.n(Float.valueOf(0.0f));
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    p1Var = (p1) objK;
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    p1Var2 = (p1) objQ;
                    Unit unit117 = Unit.INSTANCE;
                    objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                    o0VarE.L(-568225417);
                    zB = false;
                    while (i30 < 4) {
                        zB |= o0VarE.B(objArr[i30]);
                    }
                    objQ2 = o0VarE.q();
                    if (zB) {
                        boolean z211115 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211115, p1Var2, null);
                        z19 = z211115;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    } else {
                        boolean z211116 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211116, p1Var2, null);
                        z19 = z211116;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    }
                    o0VarE.g0(false);
                    l0.e((p) objQ2, unit117, o0VarE);
                    boolean zCompass$lambda$17 = Compass$lambda$4(p1Var3);
                    v1 v1VarD14 = u0.d(s1.l.d(500, 0, null, 6), 2);
                    boolean z211117 = z19;
                    r1.x1 x1VarE14 = u0.e(s1.l.d(500, 500, null, 4), 2);
                    o0VarE.L(1868333135);
                    h4.r rVarG14 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                    Unit unit118 = Unit.INSTANCE;
                    Boolean boolValueOf14 = Boolean.valueOf(z18);
                    o0VarE.L(511388516);
                    zB2 = o0VarE.B(boolValueOf14) | o0VarE.B(this);
                    objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    }
                    o0VarE.g0(false);
                    q qVar14 = s0.f15885a;
                    h4.r rVarThen14 = rVarG14.then(new r0(unit118, null, null, new s0.a((p) objQ3), 6, null));
                    o0VarE.g0(false);
                    r1.c0.e(zCompass$lambda$17, rVarThen14, v1VarD14, x1VarE14, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                    x1 x1Var118 = n.f135158a;
                    h2 h2Var17 = h2VarA;
                    pVar2 = pVarM213getLambda1$extension_compose_release;
                    h2Var2 = h2Var17;
                    z24 = z211117;
                    z25 = z18;
                    dVar4 = dVar3;
                    rVar4 = rVar3;
                } else {
                    if (i34 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i35 != 0) {
                        f.a aVar15 = f.f75994b;
                        h2VarA = l.a(4);
                    }
                    if (i17 != 0) {
                        h4.d.f81522a.getClass();
                        dVar3 = h4.d.a.f81526d;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                    }
                    x1 x1Var119 = n.f135158a;
                    objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = p0.n(Float.valueOf(0.0f));
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    p1Var = (p1) objK;
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    p1Var2 = (p1) objQ;
                    Unit unit119 = Unit.INSTANCE;
                    objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                    o0VarE.L(-568225417);
                    zB = false;
                    while (i30 < 4) {
                        zB |= o0VarE.B(objArr[i30]);
                    }
                    objQ2 = o0VarE.q();
                    if (zB) {
                        boolean z211118 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211118, p1Var2, null);
                        z19 = z211118;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    } else {
                        boolean z211119 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211119, p1Var2, null);
                        z19 = z211119;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    }
                    o0VarE.g0(false);
                    l0.e((p) objQ2, unit119, o0VarE);
                    boolean zCompass$lambda$18 = Compass$lambda$4(p1Var3);
                    v1 v1VarD15 = u0.d(s1.l.d(500, 0, null, 6), 2);
                    boolean z2111110 = z19;
                    r1.x1 x1VarE15 = u0.e(s1.l.d(500, 500, null, 4), 2);
                    o0VarE.L(1868333135);
                    h4.r rVarG15 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                    Unit unit1110 = Unit.INSTANCE;
                    Boolean boolValueOf15 = Boolean.valueOf(z18);
                    o0VarE.L(511388516);
                    zB2 = o0VarE.B(boolValueOf15) | o0VarE.B(this);
                    objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    }
                    o0VarE.g0(false);
                    q qVar15 = s0.f15885a;
                    h4.r rVarThen15 = rVarG15.then(new r0(unit1110, null, null, new s0.a((p) objQ3), 6, null));
                    o0VarE.g0(false);
                    r1.c0.e(zCompass$lambda$18, rVarThen15, v1VarD15, x1VarE15, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                    x1 x1Var1110 = n.f135158a;
                    h2 h2Var18 = h2VarA;
                    pVar2 = pVarM213getLambda1$extension_compose_release;
                    h2Var2 = h2Var18;
                    z24 = z2111110;
                    z25 = z18;
                    dVar4 = dVar3;
                    rVar4 = rVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
            }
            i16 |= 384;
            dVar2 = dVar;
            i19 = i15 & 8;
            if (i19 != 0) {
                if ((i14 & 7168) == 0) {
                    z16 = z14;
                    if (o0VarE.h(z16)) {
                        i24 = 2048;
                    } else {
                        i24 = 1024;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 16;
                if (i25 != 0) {
                    if ((57344 & i14) == 0) {
                        z17 = z15;
                        if (o0VarE.h(z17)) {
                            i26 = 16384;
                        } else {
                            i26 = 8192;
                        }
                        i16 |= i26;
                    }
                    i27 = i15 & 32;
                    if (i27 != 0) {
                        i16 |= 196608;
                        pVarM213getLambda1$extension_compose_release = pVar;
                    } else {
                        pVarM213getLambda1$extension_compose_release = pVar;
                        if ((i14 & 458752) == 0) {
                            if (o0VarE.B(pVarM213getLambda1$extension_compose_release)) {
                                i28 = 131072;
                            } else {
                                i28 = 65536;
                            }
                            i16 |= i28;
                        }
                    }
                    if ((i15 & 64) != 0) {
                        if ((i14 & 3670016) == 0) {
                            if (o0VarE.B(this)) {
                                i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            } else {
                                i29 = 524288;
                            }
                        }
                        if ((i16 & 2995931) == 599186) {
                            if (i34 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i35 != 0) {
                                f.a aVar16 = f.f75994b;
                                h2VarA = l.a(4);
                            }
                            if (i17 != 0) {
                                h4.d.f81522a.getClass();
                                dVar3 = h4.d.a.f81526d;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            }
                            if (i25 == 0) {
                            }
                            if (i27 != 0) {
                                pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                            }
                            x1 x1Var1111 = n.f135158a;
                            objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                            c2565a = m.a.f135155b;
                            if (objK == c2565a) {
                                objK = p0.n(Float.valueOf(0.0f));
                                o0VarE.K(objK);
                            }
                            o0VarE.g0(false);
                            p1Var = (p1) objK;
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            if (objQ == c2565a) {
                                objQ = p0.n(Boolean.FALSE);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            p1Var2 = (p1) objQ;
                            Unit unit1111 = Unit.INSTANCE;
                            objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                            o0VarE.L(-568225417);
                            zB = false;
                            while (i30 < 4) {
                                zB |= o0VarE.B(objArr[i30]);
                            }
                            objQ2 = o0VarE.q();
                            if (zB) {
                                boolean z2111111 = z16;
                                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111, p1Var2, null);
                                z19 = z2111111;
                                p1Var3 = p1Var2;
                                o0VarE.K(objQ2);
                            } else {
                                boolean z2111112 = z16;
                                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111112, p1Var2, null);
                                z19 = z2111112;
                                p1Var3 = p1Var2;
                                o0VarE.K(objQ2);
                            }
                            o0VarE.g0(false);
                            l0.e((p) objQ2, unit1111, o0VarE);
                            boolean zCompass$lambda$19 = Compass$lambda$4(p1Var3);
                            v1 v1VarD16 = u0.d(s1.l.d(500, 0, null, 6), 2);
                            boolean z2111113 = z19;
                            r1.x1 x1VarE16 = u0.e(s1.l.d(500, 500, null, 4), 2);
                            o0VarE.L(1868333135);
                            h4.r rVarG16 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                            Unit unit1112 = Unit.INSTANCE;
                            Boolean boolValueOf16 = Boolean.valueOf(z18);
                            o0VarE.L(511388516);
                            zB2 = o0VarE.B(boolValueOf16) | o0VarE.B(this);
                            objQ3 = o0VarE.q();
                            if (zB2) {
                                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                o0VarE.K(objQ3);
                            } else {
                                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                o0VarE.K(objQ3);
                            }
                            o0VarE.g0(false);
                            q qVar16 = s0.f15885a;
                            h4.r rVarThen16 = rVarG16.then(new r0(unit1112, null, null, new s0.a((p) objQ3), 6, null));
                            o0VarE.g0(false);
                            r1.c0.e(zCompass$lambda$19, rVarThen16, v1VarD16, x1VarE16, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                            x1 x1Var1112 = n.f135158a;
                            h2 h2Var19 = h2VarA;
                            pVar2 = pVarM213getLambda1$extension_compose_release;
                            h2Var2 = h2Var19;
                            z24 = z2111113;
                            z25 = z18;
                            dVar4 = dVar3;
                            rVar4 = rVar3;
                        } else {
                            if (i34 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i35 != 0) {
                                f.a aVar17 = f.f75994b;
                                h2VarA = l.a(4);
                            }
                            if (i17 != 0) {
                                h4.d.f81522a.getClass();
                                dVar3 = h4.d.a.f81526d;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            }
                            if (i25 == 0) {
                            }
                            if (i27 != 0) {
                                pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                            }
                            x1 x1Var1113 = n.f135158a;
                            objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                            c2565a = m.a.f135155b;
                            if (objK == c2565a) {
                                objK = p0.n(Float.valueOf(0.0f));
                                o0VarE.K(objK);
                            }
                            o0VarE.g0(false);
                            p1Var = (p1) objK;
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            if (objQ == c2565a) {
                                objQ = p0.n(Boolean.FALSE);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            p1Var2 = (p1) objQ;
                            Unit unit1113 = Unit.INSTANCE;
                            objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                            o0VarE.L(-568225417);
                            zB = false;
                            while (i30 < 4) {
                                zB |= o0VarE.B(objArr[i30]);
                            }
                            objQ2 = o0VarE.q();
                            if (zB) {
                                boolean z2111114 = z16;
                                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111114, p1Var2, null);
                                z19 = z2111114;
                                p1Var3 = p1Var2;
                                o0VarE.K(objQ2);
                            } else {
                                boolean z2111115 = z16;
                                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111115, p1Var2, null);
                                z19 = z2111115;
                                p1Var3 = p1Var2;
                                o0VarE.K(objQ2);
                            }
                            o0VarE.g0(false);
                            l0.e((p) objQ2, unit1113, o0VarE);
                            boolean zCompass$lambda$110 = Compass$lambda$4(p1Var3);
                            v1 v1VarD17 = u0.d(s1.l.d(500, 0, null, 6), 2);
                            boolean z2111116 = z19;
                            r1.x1 x1VarE17 = u0.e(s1.l.d(500, 500, null, 4), 2);
                            o0VarE.L(1868333135);
                            h4.r rVarG17 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                            Unit unit1114 = Unit.INSTANCE;
                            Boolean boolValueOf17 = Boolean.valueOf(z18);
                            o0VarE.L(511388516);
                            zB2 = o0VarE.B(boolValueOf17) | o0VarE.B(this);
                            objQ3 = o0VarE.q();
                            if (zB2) {
                                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                o0VarE.K(objQ3);
                            } else {
                                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                o0VarE.K(objQ3);
                            }
                            o0VarE.g0(false);
                            q qVar17 = s0.f15885a;
                            h4.r rVarThen17 = rVarG17.then(new r0(unit1114, null, null, new s0.a((p) objQ3), 6, null));
                            o0VarE.g0(false);
                            r1.c0.e(zCompass$lambda$110, rVarThen17, v1VarD17, x1VarE17, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                            x1 x1Var1114 = n.f135158a;
                            h2 h2Var110 = h2VarA;
                            pVar2 = pVarM213getLambda1$extension_compose_release;
                            h2Var2 = h2Var110;
                            z24 = z2111116;
                            z25 = z18;
                            dVar4 = dVar3;
                            rVar4 = rVar3;
                        }
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 == null) {
                            return;
                        }
                        p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
                    }
                    i29 = 1572864;
                    i16 |= i29;
                    if ((i16 & 2995931) == 599186) {
                        if (i34 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i35 != 0) {
                            f.a aVar18 = f.f75994b;
                            h2VarA = l.a(4);
                        }
                        if (i17 != 0) {
                            h4.d.f81522a.getClass();
                            dVar3 = h4.d.a.f81526d;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                        }
                        x1 x1Var1115 = n.f135158a;
                        objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                        c2565a = m.a.f135155b;
                        if (objK == c2565a) {
                            objK = p0.n(Float.valueOf(0.0f));
                            o0VarE.K(objK);
                        }
                        o0VarE.g0(false);
                        p1Var = (p1) objK;
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        if (objQ == c2565a) {
                            objQ = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        p1Var2 = (p1) objQ;
                        Unit unit1115 = Unit.INSTANCE;
                        objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                        o0VarE.L(-568225417);
                        zB = false;
                        while (i30 < 4) {
                            zB |= o0VarE.B(objArr[i30]);
                        }
                        objQ2 = o0VarE.q();
                        if (zB) {
                            boolean z2111117 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111117, p1Var2, null);
                            z19 = z2111117;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        } else {
                            boolean z2111118 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111118, p1Var2, null);
                            z19 = z2111118;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        }
                        o0VarE.g0(false);
                        l0.e((p) objQ2, unit1115, o0VarE);
                        boolean zCompass$lambda$111 = Compass$lambda$4(p1Var3);
                        v1 v1VarD18 = u0.d(s1.l.d(500, 0, null, 6), 2);
                        boolean z2111119 = z19;
                        r1.x1 x1VarE18 = u0.e(s1.l.d(500, 500, null, 4), 2);
                        o0VarE.L(1868333135);
                        h4.r rVarG18 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                        Unit unit1116 = Unit.INSTANCE;
                        Boolean boolValueOf18 = Boolean.valueOf(z18);
                        o0VarE.L(511388516);
                        zB2 = o0VarE.B(boolValueOf18) | o0VarE.B(this);
                        objQ3 = o0VarE.q();
                        if (zB2) {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        }
                        o0VarE.g0(false);
                        q qVar18 = s0.f15885a;
                        h4.r rVarThen18 = rVarG18.then(new r0(unit1116, null, null, new s0.a((p) objQ3), 6, null));
                        o0VarE.g0(false);
                        r1.c0.e(zCompass$lambda$111, rVarThen18, v1VarD18, x1VarE18, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                        x1 x1Var1116 = n.f135158a;
                        h2 h2Var111 = h2VarA;
                        pVar2 = pVarM213getLambda1$extension_compose_release;
                        h2Var2 = h2Var111;
                        z24 = z2111119;
                        z25 = z18;
                        dVar4 = dVar3;
                        rVar4 = rVar3;
                    } else {
                        if (i34 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i35 != 0) {
                            f.a aVar19 = f.f75994b;
                            h2VarA = l.a(4);
                        }
                        if (i17 != 0) {
                            h4.d.f81522a.getClass();
                            dVar3 = h4.d.a.f81526d;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                        }
                        x1 x1Var1117 = n.f135158a;
                        objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                        c2565a = m.a.f135155b;
                        if (objK == c2565a) {
                            objK = p0.n(Float.valueOf(0.0f));
                            o0VarE.K(objK);
                        }
                        o0VarE.g0(false);
                        p1Var = (p1) objK;
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        if (objQ == c2565a) {
                            objQ = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        p1Var2 = (p1) objQ;
                        Unit unit1117 = Unit.INSTANCE;
                        objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                        o0VarE.L(-568225417);
                        zB = false;
                        while (i30 < 4) {
                            zB |= o0VarE.B(objArr[i30]);
                        }
                        objQ2 = o0VarE.q();
                        if (zB) {
                            boolean z21111110 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111110, p1Var2, null);
                            z19 = z21111110;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        } else {
                            boolean z21111111 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111, p1Var2, null);
                            z19 = z21111111;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        }
                        o0VarE.g0(false);
                        l0.e((p) objQ2, unit1117, o0VarE);
                        boolean zCompass$lambda$112 = Compass$lambda$4(p1Var3);
                        v1 v1VarD19 = u0.d(s1.l.d(500, 0, null, 6), 2);
                        boolean z21111112 = z19;
                        r1.x1 x1VarE19 = u0.e(s1.l.d(500, 500, null, 4), 2);
                        o0VarE.L(1868333135);
                        h4.r rVarG19 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                        Unit unit1118 = Unit.INSTANCE;
                        Boolean boolValueOf19 = Boolean.valueOf(z18);
                        o0VarE.L(511388516);
                        zB2 = o0VarE.B(boolValueOf19) | o0VarE.B(this);
                        objQ3 = o0VarE.q();
                        if (zB2) {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        }
                        o0VarE.g0(false);
                        q qVar19 = s0.f15885a;
                        h4.r rVarThen19 = rVarG19.then(new r0(unit1118, null, null, new s0.a((p) objQ3), 6, null));
                        o0VarE.g0(false);
                        r1.c0.e(zCompass$lambda$112, rVarThen19, v1VarD19, x1VarE19, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                        x1 x1Var1118 = n.f135158a;
                        h2 h2Var112 = h2VarA;
                        pVar2 = pVarM213getLambda1$extension_compose_release;
                        h2Var2 = h2Var112;
                        z24 = z21111112;
                        z25 = z18;
                        dVar4 = dVar3;
                        rVar4 = rVar3;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
                }
                i16 |= 24576;
                z17 = z15;
                i27 = i15 & 32;
                if (i27 != 0) {
                    i16 |= 196608;
                    pVarM213getLambda1$extension_compose_release = pVar;
                } else {
                    pVarM213getLambda1$extension_compose_release = pVar;
                    if ((i14 & 458752) == 0) {
                        if (o0VarE.B(pVarM213getLambda1$extension_compose_release)) {
                            i28 = 131072;
                        } else {
                            i28 = 65536;
                        }
                        i16 |= i28;
                    }
                }
                if ((i15 & 64) != 0) {
                    if ((i14 & 3670016) == 0) {
                        if (o0VarE.B(this)) {
                            i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i29 = 524288;
                        }
                    }
                    if ((i16 & 2995931) == 599186) {
                        if (i34 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i35 != 0) {
                            f.a aVar110 = f.f75994b;
                            h2VarA = l.a(4);
                        }
                        if (i17 != 0) {
                            h4.d.f81522a.getClass();
                            dVar3 = h4.d.a.f81526d;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                        }
                        x1 x1Var1119 = n.f135158a;
                        objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                        c2565a = m.a.f135155b;
                        if (objK == c2565a) {
                            objK = p0.n(Float.valueOf(0.0f));
                            o0VarE.K(objK);
                        }
                        o0VarE.g0(false);
                        p1Var = (p1) objK;
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        if (objQ == c2565a) {
                            objQ = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        p1Var2 = (p1) objQ;
                        Unit unit1119 = Unit.INSTANCE;
                        objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                        o0VarE.L(-568225417);
                        zB = false;
                        while (i30 < 4) {
                            zB |= o0VarE.B(objArr[i30]);
                        }
                        objQ2 = o0VarE.q();
                        if (zB) {
                            boolean z21111113 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111113, p1Var2, null);
                            z19 = z21111113;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        } else {
                            boolean z21111114 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111114, p1Var2, null);
                            z19 = z21111114;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        }
                        o0VarE.g0(false);
                        l0.e((p) objQ2, unit1119, o0VarE);
                        boolean zCompass$lambda$113 = Compass$lambda$4(p1Var3);
                        v1 v1VarD110 = u0.d(s1.l.d(500, 0, null, 6), 2);
                        boolean z21111115 = z19;
                        r1.x1 x1VarE110 = u0.e(s1.l.d(500, 500, null, 4), 2);
                        o0VarE.L(1868333135);
                        h4.r rVarG110 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                        Unit unit11110 = Unit.INSTANCE;
                        Boolean boolValueOf110 = Boolean.valueOf(z18);
                        o0VarE.L(511388516);
                        zB2 = o0VarE.B(boolValueOf110) | o0VarE.B(this);
                        objQ3 = o0VarE.q();
                        if (zB2) {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        }
                        o0VarE.g0(false);
                        q qVar110 = s0.f15885a;
                        h4.r rVarThen110 = rVarG110.then(new r0(unit11110, null, null, new s0.a((p) objQ3), 6, null));
                        o0VarE.g0(false);
                        r1.c0.e(zCompass$lambda$113, rVarThen110, v1VarD110, x1VarE110, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                        x1 x1Var11110 = n.f135158a;
                        h2 h2Var113 = h2VarA;
                        pVar2 = pVarM213getLambda1$extension_compose_release;
                        h2Var2 = h2Var113;
                        z24 = z21111115;
                        z25 = z18;
                        dVar4 = dVar3;
                        rVar4 = rVar3;
                    } else {
                        if (i34 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i35 != 0) {
                            f.a aVar111 = f.f75994b;
                            h2VarA = l.a(4);
                        }
                        if (i17 != 0) {
                            h4.d.f81522a.getClass();
                            dVar3 = h4.d.a.f81526d;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                        }
                        x1 x1Var11111 = n.f135158a;
                        objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                        c2565a = m.a.f135155b;
                        if (objK == c2565a) {
                            objK = p0.n(Float.valueOf(0.0f));
                            o0VarE.K(objK);
                        }
                        o0VarE.g0(false);
                        p1Var = (p1) objK;
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        if (objQ == c2565a) {
                            objQ = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        p1Var2 = (p1) objQ;
                        Unit unit11111 = Unit.INSTANCE;
                        objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                        o0VarE.L(-568225417);
                        zB = false;
                        while (i30 < 4) {
                            zB |= o0VarE.B(objArr[i30]);
                        }
                        objQ2 = o0VarE.q();
                        if (zB) {
                            boolean z21111116 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111116, p1Var2, null);
                            z19 = z21111116;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        } else {
                            boolean z21111117 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111117, p1Var2, null);
                            z19 = z21111117;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        }
                        o0VarE.g0(false);
                        l0.e((p) objQ2, unit11111, o0VarE);
                        boolean zCompass$lambda$114 = Compass$lambda$4(p1Var3);
                        v1 v1VarD111 = u0.d(s1.l.d(500, 0, null, 6), 2);
                        boolean z21111118 = z19;
                        r1.x1 x1VarE111 = u0.e(s1.l.d(500, 500, null, 4), 2);
                        o0VarE.L(1868333135);
                        h4.r rVarG111 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                        Unit unit11112 = Unit.INSTANCE;
                        Boolean boolValueOf111 = Boolean.valueOf(z18);
                        o0VarE.L(511388516);
                        zB2 = o0VarE.B(boolValueOf111) | o0VarE.B(this);
                        objQ3 = o0VarE.q();
                        if (zB2) {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        }
                        o0VarE.g0(false);
                        q qVar111 = s0.f15885a;
                        h4.r rVarThen111 = rVarG111.then(new r0(unit11112, null, null, new s0.a((p) objQ3), 6, null));
                        o0VarE.g0(false);
                        r1.c0.e(zCompass$lambda$114, rVarThen111, v1VarD111, x1VarE111, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                        x1 x1Var11112 = n.f135158a;
                        h2 h2Var114 = h2VarA;
                        pVar2 = pVarM213getLambda1$extension_compose_release;
                        h2Var2 = h2Var114;
                        z24 = z21111118;
                        z25 = z18;
                        dVar4 = dVar3;
                        rVar4 = rVar3;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
                }
                i29 = 1572864;
                i16 |= i29;
                if ((i16 & 2995931) == 599186) {
                    if (i34 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i35 != 0) {
                        f.a aVar112 = f.f75994b;
                        h2VarA = l.a(4);
                    }
                    if (i17 != 0) {
                        h4.d.f81522a.getClass();
                        dVar3 = h4.d.a.f81526d;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                    }
                    x1 x1Var11113 = n.f135158a;
                    objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = p0.n(Float.valueOf(0.0f));
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    p1Var = (p1) objK;
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    p1Var2 = (p1) objQ;
                    Unit unit11113 = Unit.INSTANCE;
                    objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                    o0VarE.L(-568225417);
                    zB = false;
                    while (i30 < 4) {
                        zB |= o0VarE.B(objArr[i30]);
                    }
                    objQ2 = o0VarE.q();
                    if (zB) {
                        boolean z21111119 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111119, p1Var2, null);
                        z19 = z21111119;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    } else {
                        boolean z211111110 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111110, p1Var2, null);
                        z19 = z211111110;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    }
                    o0VarE.g0(false);
                    l0.e((p) objQ2, unit11113, o0VarE);
                    boolean zCompass$lambda$115 = Compass$lambda$4(p1Var3);
                    v1 v1VarD112 = u0.d(s1.l.d(500, 0, null, 6), 2);
                    boolean z211111111 = z19;
                    r1.x1 x1VarE112 = u0.e(s1.l.d(500, 500, null, 4), 2);
                    o0VarE.L(1868333135);
                    h4.r rVarG112 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                    Unit unit11114 = Unit.INSTANCE;
                    Boolean boolValueOf112 = Boolean.valueOf(z18);
                    o0VarE.L(511388516);
                    zB2 = o0VarE.B(boolValueOf112) | o0VarE.B(this);
                    objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    }
                    o0VarE.g0(false);
                    q qVar112 = s0.f15885a;
                    h4.r rVarThen112 = rVarG112.then(new r0(unit11114, null, null, new s0.a((p) objQ3), 6, null));
                    o0VarE.g0(false);
                    r1.c0.e(zCompass$lambda$115, rVarThen112, v1VarD112, x1VarE112, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                    x1 x1Var11114 = n.f135158a;
                    h2 h2Var115 = h2VarA;
                    pVar2 = pVarM213getLambda1$extension_compose_release;
                    h2Var2 = h2Var115;
                    z24 = z211111111;
                    z25 = z18;
                    dVar4 = dVar3;
                    rVar4 = rVar3;
                } else {
                    if (i34 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i35 != 0) {
                        f.a aVar113 = f.f75994b;
                        h2VarA = l.a(4);
                    }
                    if (i17 != 0) {
                        h4.d.f81522a.getClass();
                        dVar3 = h4.d.a.f81526d;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                    }
                    x1 x1Var11115 = n.f135158a;
                    objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = p0.n(Float.valueOf(0.0f));
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    p1Var = (p1) objK;
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    p1Var2 = (p1) objQ;
                    Unit unit11115 = Unit.INSTANCE;
                    objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                    o0VarE.L(-568225417);
                    zB = false;
                    while (i30 < 4) {
                        zB |= o0VarE.B(objArr[i30]);
                    }
                    objQ2 = o0VarE.q();
                    if (zB) {
                        boolean z211111112 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111112, p1Var2, null);
                        z19 = z211111112;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    } else {
                        boolean z211111113 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111113, p1Var2, null);
                        z19 = z211111113;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    }
                    o0VarE.g0(false);
                    l0.e((p) objQ2, unit11115, o0VarE);
                    boolean zCompass$lambda$116 = Compass$lambda$4(p1Var3);
                    v1 v1VarD113 = u0.d(s1.l.d(500, 0, null, 6), 2);
                    boolean z211111114 = z19;
                    r1.x1 x1VarE113 = u0.e(s1.l.d(500, 500, null, 4), 2);
                    o0VarE.L(1868333135);
                    h4.r rVarG113 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                    Unit unit11116 = Unit.INSTANCE;
                    Boolean boolValueOf113 = Boolean.valueOf(z18);
                    o0VarE.L(511388516);
                    zB2 = o0VarE.B(boolValueOf113) | o0VarE.B(this);
                    objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    }
                    o0VarE.g0(false);
                    q qVar113 = s0.f15885a;
                    h4.r rVarThen113 = rVarG113.then(new r0(unit11116, null, null, new s0.a((p) objQ3), 6, null));
                    o0VarE.g0(false);
                    r1.c0.e(zCompass$lambda$116, rVarThen113, v1VarD113, x1VarE113, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                    x1 x1Var11116 = n.f135158a;
                    h2 h2Var116 = h2VarA;
                    pVar2 = pVarM213getLambda1$extension_compose_release;
                    h2Var2 = h2Var116;
                    z24 = z211111114;
                    z25 = z18;
                    dVar4 = dVar3;
                    rVar4 = rVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
            }
            i16 |= 3072;
            z16 = z14;
            i25 = i15 & 16;
            if (i25 != 0) {
                if ((57344 & i14) == 0) {
                    z17 = z15;
                    if (o0VarE.h(z17)) {
                        i26 = 16384;
                    } else {
                        i26 = 8192;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 32;
                if (i27 != 0) {
                    i16 |= 196608;
                    pVarM213getLambda1$extension_compose_release = pVar;
                } else {
                    pVarM213getLambda1$extension_compose_release = pVar;
                    if ((i14 & 458752) == 0) {
                        if (o0VarE.B(pVarM213getLambda1$extension_compose_release)) {
                            i28 = 131072;
                        } else {
                            i28 = 65536;
                        }
                        i16 |= i28;
                    }
                }
                if ((i15 & 64) != 0) {
                    if ((i14 & 3670016) == 0) {
                        if (o0VarE.B(this)) {
                            i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i29 = 524288;
                        }
                    }
                    if ((i16 & 2995931) == 599186) {
                        if (i34 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i35 != 0) {
                            f.a aVar114 = f.f75994b;
                            h2VarA = l.a(4);
                        }
                        if (i17 != 0) {
                            h4.d.f81522a.getClass();
                            dVar3 = h4.d.a.f81526d;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                        }
                        x1 x1Var11117 = n.f135158a;
                        objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                        c2565a = m.a.f135155b;
                        if (objK == c2565a) {
                            objK = p0.n(Float.valueOf(0.0f));
                            o0VarE.K(objK);
                        }
                        o0VarE.g0(false);
                        p1Var = (p1) objK;
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        if (objQ == c2565a) {
                            objQ = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        p1Var2 = (p1) objQ;
                        Unit unit11117 = Unit.INSTANCE;
                        objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                        o0VarE.L(-568225417);
                        zB = false;
                        while (i30 < 4) {
                            zB |= o0VarE.B(objArr[i30]);
                        }
                        objQ2 = o0VarE.q();
                        if (zB) {
                            boolean z211111115 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111115, p1Var2, null);
                            z19 = z211111115;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        } else {
                            boolean z211111116 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111116, p1Var2, null);
                            z19 = z211111116;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        }
                        o0VarE.g0(false);
                        l0.e((p) objQ2, unit11117, o0VarE);
                        boolean zCompass$lambda$117 = Compass$lambda$4(p1Var3);
                        v1 v1VarD114 = u0.d(s1.l.d(500, 0, null, 6), 2);
                        boolean z211111117 = z19;
                        r1.x1 x1VarE114 = u0.e(s1.l.d(500, 500, null, 4), 2);
                        o0VarE.L(1868333135);
                        h4.r rVarG114 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                        Unit unit11118 = Unit.INSTANCE;
                        Boolean boolValueOf114 = Boolean.valueOf(z18);
                        o0VarE.L(511388516);
                        zB2 = o0VarE.B(boolValueOf114) | o0VarE.B(this);
                        objQ3 = o0VarE.q();
                        if (zB2) {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        }
                        o0VarE.g0(false);
                        q qVar114 = s0.f15885a;
                        h4.r rVarThen114 = rVarG114.then(new r0(unit11118, null, null, new s0.a((p) objQ3), 6, null));
                        o0VarE.g0(false);
                        r1.c0.e(zCompass$lambda$117, rVarThen114, v1VarD114, x1VarE114, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                        x1 x1Var11118 = n.f135158a;
                        h2 h2Var117 = h2VarA;
                        pVar2 = pVarM213getLambda1$extension_compose_release;
                        h2Var2 = h2Var117;
                        z24 = z211111117;
                        z25 = z18;
                        dVar4 = dVar3;
                        rVar4 = rVar3;
                    } else {
                        if (i34 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i35 != 0) {
                            f.a aVar115 = f.f75994b;
                            h2VarA = l.a(4);
                        }
                        if (i17 != 0) {
                            h4.d.f81522a.getClass();
                            dVar3 = h4.d.a.f81526d;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                        }
                        x1 x1Var11119 = n.f135158a;
                        objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                        c2565a = m.a.f135155b;
                        if (objK == c2565a) {
                            objK = p0.n(Float.valueOf(0.0f));
                            o0VarE.K(objK);
                        }
                        o0VarE.g0(false);
                        p1Var = (p1) objK;
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        if (objQ == c2565a) {
                            objQ = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        p1Var2 = (p1) objQ;
                        Unit unit11119 = Unit.INSTANCE;
                        objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                        o0VarE.L(-568225417);
                        zB = false;
                        while (i30 < 4) {
                            zB |= o0VarE.B(objArr[i30]);
                        }
                        objQ2 = o0VarE.q();
                        if (zB) {
                            boolean z211111118 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111118, p1Var2, null);
                            z19 = z211111118;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        } else {
                            boolean z211111119 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111119, p1Var2, null);
                            z19 = z211111119;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        }
                        o0VarE.g0(false);
                        l0.e((p) objQ2, unit11119, o0VarE);
                        boolean zCompass$lambda$118 = Compass$lambda$4(p1Var3);
                        v1 v1VarD115 = u0.d(s1.l.d(500, 0, null, 6), 2);
                        boolean z2111111110 = z19;
                        r1.x1 x1VarE115 = u0.e(s1.l.d(500, 500, null, 4), 2);
                        o0VarE.L(1868333135);
                        h4.r rVarG115 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                        Unit unit111110 = Unit.INSTANCE;
                        Boolean boolValueOf115 = Boolean.valueOf(z18);
                        o0VarE.L(511388516);
                        zB2 = o0VarE.B(boolValueOf115) | o0VarE.B(this);
                        objQ3 = o0VarE.q();
                        if (zB2) {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        }
                        o0VarE.g0(false);
                        q qVar115 = s0.f15885a;
                        h4.r rVarThen115 = rVarG115.then(new r0(unit111110, null, null, new s0.a((p) objQ3), 6, null));
                        o0VarE.g0(false);
                        r1.c0.e(zCompass$lambda$118, rVarThen115, v1VarD115, x1VarE115, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                        x1 x1Var111110 = n.f135158a;
                        h2 h2Var118 = h2VarA;
                        pVar2 = pVarM213getLambda1$extension_compose_release;
                        h2Var2 = h2Var118;
                        z24 = z2111111110;
                        z25 = z18;
                        dVar4 = dVar3;
                        rVar4 = rVar3;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
                }
                i29 = 1572864;
                i16 |= i29;
                if ((i16 & 2995931) == 599186) {
                    if (i34 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i35 != 0) {
                        f.a aVar116 = f.f75994b;
                        h2VarA = l.a(4);
                    }
                    if (i17 != 0) {
                        h4.d.f81522a.getClass();
                        dVar3 = h4.d.a.f81526d;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                    }
                    x1 x1Var111111 = n.f135158a;
                    objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = p0.n(Float.valueOf(0.0f));
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    p1Var = (p1) objK;
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    p1Var2 = (p1) objQ;
                    Unit unit111111 = Unit.INSTANCE;
                    objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                    o0VarE.L(-568225417);
                    zB = false;
                    while (i30 < 4) {
                        zB |= o0VarE.B(objArr[i30]);
                    }
                    objQ2 = o0VarE.q();
                    if (zB) {
                        boolean z2111111111 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111111, p1Var2, null);
                        z19 = z2111111111;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    } else {
                        boolean z2111111112 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111112, p1Var2, null);
                        z19 = z2111111112;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    }
                    o0VarE.g0(false);
                    l0.e((p) objQ2, unit111111, o0VarE);
                    boolean zCompass$lambda$119 = Compass$lambda$4(p1Var3);
                    v1 v1VarD116 = u0.d(s1.l.d(500, 0, null, 6), 2);
                    boolean z2111111113 = z19;
                    r1.x1 x1VarE116 = u0.e(s1.l.d(500, 500, null, 4), 2);
                    o0VarE.L(1868333135);
                    h4.r rVarG116 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                    Unit unit111112 = Unit.INSTANCE;
                    Boolean boolValueOf116 = Boolean.valueOf(z18);
                    o0VarE.L(511388516);
                    zB2 = o0VarE.B(boolValueOf116) | o0VarE.B(this);
                    objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    }
                    o0VarE.g0(false);
                    q qVar116 = s0.f15885a;
                    h4.r rVarThen116 = rVarG116.then(new r0(unit111112, null, null, new s0.a((p) objQ3), 6, null));
                    o0VarE.g0(false);
                    r1.c0.e(zCompass$lambda$119, rVarThen116, v1VarD116, x1VarE116, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                    x1 x1Var111112 = n.f135158a;
                    h2 h2Var119 = h2VarA;
                    pVar2 = pVarM213getLambda1$extension_compose_release;
                    h2Var2 = h2Var119;
                    z24 = z2111111113;
                    z25 = z18;
                    dVar4 = dVar3;
                    rVar4 = rVar3;
                } else {
                    if (i34 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i35 != 0) {
                        f.a aVar117 = f.f75994b;
                        h2VarA = l.a(4);
                    }
                    if (i17 != 0) {
                        h4.d.f81522a.getClass();
                        dVar3 = h4.d.a.f81526d;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                    }
                    x1 x1Var111113 = n.f135158a;
                    objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = p0.n(Float.valueOf(0.0f));
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    p1Var = (p1) objK;
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    p1Var2 = (p1) objQ;
                    Unit unit111113 = Unit.INSTANCE;
                    objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                    o0VarE.L(-568225417);
                    zB = false;
                    while (i30 < 4) {
                        zB |= o0VarE.B(objArr[i30]);
                    }
                    objQ2 = o0VarE.q();
                    if (zB) {
                        boolean z2111111114 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111114, p1Var2, null);
                        z19 = z2111111114;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    } else {
                        boolean z2111111115 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111115, p1Var2, null);
                        z19 = z2111111115;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    }
                    o0VarE.g0(false);
                    l0.e((p) objQ2, unit111113, o0VarE);
                    boolean zCompass$lambda$1110 = Compass$lambda$4(p1Var3);
                    v1 v1VarD117 = u0.d(s1.l.d(500, 0, null, 6), 2);
                    boolean z2111111116 = z19;
                    r1.x1 x1VarE117 = u0.e(s1.l.d(500, 500, null, 4), 2);
                    o0VarE.L(1868333135);
                    h4.r rVarG117 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                    Unit unit111114 = Unit.INSTANCE;
                    Boolean boolValueOf117 = Boolean.valueOf(z18);
                    o0VarE.L(511388516);
                    zB2 = o0VarE.B(boolValueOf117) | o0VarE.B(this);
                    objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    }
                    o0VarE.g0(false);
                    q qVar117 = s0.f15885a;
                    h4.r rVarThen117 = rVarG117.then(new r0(unit111114, null, null, new s0.a((p) objQ3), 6, null));
                    o0VarE.g0(false);
                    r1.c0.e(zCompass$lambda$1110, rVarThen117, v1VarD117, x1VarE117, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                    x1 x1Var111114 = n.f135158a;
                    h2 h2Var1110 = h2VarA;
                    pVar2 = pVarM213getLambda1$extension_compose_release;
                    h2Var2 = h2Var1110;
                    z24 = z2111111116;
                    z25 = z18;
                    dVar4 = dVar3;
                    rVar4 = rVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
            }
            i16 |= 24576;
            z17 = z15;
            i27 = i15 & 32;
            if (i27 != 0) {
                i16 |= 196608;
                pVarM213getLambda1$extension_compose_release = pVar;
            } else {
                pVarM213getLambda1$extension_compose_release = pVar;
                if ((i14 & 458752) == 0) {
                    if (o0VarE.B(pVarM213getLambda1$extension_compose_release)) {
                        i28 = 131072;
                    } else {
                        i28 = 65536;
                    }
                    i16 |= i28;
                }
            }
            if ((i15 & 64) != 0) {
                if ((i14 & 3670016) == 0) {
                    if (o0VarE.B(this)) {
                        i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i29 = 524288;
                    }
                }
                if ((i16 & 2995931) == 599186) {
                    if (i34 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i35 != 0) {
                        f.a aVar118 = f.f75994b;
                        h2VarA = l.a(4);
                    }
                    if (i17 != 0) {
                        h4.d.f81522a.getClass();
                        dVar3 = h4.d.a.f81526d;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                    }
                    x1 x1Var111115 = n.f135158a;
                    objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = p0.n(Float.valueOf(0.0f));
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    p1Var = (p1) objK;
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    p1Var2 = (p1) objQ;
                    Unit unit111115 = Unit.INSTANCE;
                    objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                    o0VarE.L(-568225417);
                    zB = false;
                    while (i30 < 4) {
                        zB |= o0VarE.B(objArr[i30]);
                    }
                    objQ2 = o0VarE.q();
                    if (zB) {
                        boolean z2111111117 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111117, p1Var2, null);
                        z19 = z2111111117;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    } else {
                        boolean z2111111118 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111118, p1Var2, null);
                        z19 = z2111111118;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    }
                    o0VarE.g0(false);
                    l0.e((p) objQ2, unit111115, o0VarE);
                    boolean zCompass$lambda$1111 = Compass$lambda$4(p1Var3);
                    v1 v1VarD118 = u0.d(s1.l.d(500, 0, null, 6), 2);
                    boolean z2111111119 = z19;
                    r1.x1 x1VarE118 = u0.e(s1.l.d(500, 500, null, 4), 2);
                    o0VarE.L(1868333135);
                    h4.r rVarG118 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                    Unit unit111116 = Unit.INSTANCE;
                    Boolean boolValueOf118 = Boolean.valueOf(z18);
                    o0VarE.L(511388516);
                    zB2 = o0VarE.B(boolValueOf118) | o0VarE.B(this);
                    objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    }
                    o0VarE.g0(false);
                    q qVar118 = s0.f15885a;
                    h4.r rVarThen118 = rVarG118.then(new r0(unit111116, null, null, new s0.a((p) objQ3), 6, null));
                    o0VarE.g0(false);
                    r1.c0.e(zCompass$lambda$1111, rVarThen118, v1VarD118, x1VarE118, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                    x1 x1Var111116 = n.f135158a;
                    h2 h2Var1111 = h2VarA;
                    pVar2 = pVarM213getLambda1$extension_compose_release;
                    h2Var2 = h2Var1111;
                    z24 = z2111111119;
                    z25 = z18;
                    dVar4 = dVar3;
                    rVar4 = rVar3;
                } else {
                    if (i34 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i35 != 0) {
                        f.a aVar119 = f.f75994b;
                        h2VarA = l.a(4);
                    }
                    if (i17 != 0) {
                        h4.d.f81522a.getClass();
                        dVar3 = h4.d.a.f81526d;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                    }
                    x1 x1Var111117 = n.f135158a;
                    objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = p0.n(Float.valueOf(0.0f));
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    p1Var = (p1) objK;
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    p1Var2 = (p1) objQ;
                    Unit unit111117 = Unit.INSTANCE;
                    objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                    o0VarE.L(-568225417);
                    zB = false;
                    while (i30 < 4) {
                        zB |= o0VarE.B(objArr[i30]);
                    }
                    objQ2 = o0VarE.q();
                    if (zB) {
                        boolean z21111111110 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111110, p1Var2, null);
                        z19 = z21111111110;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    } else {
                        boolean z21111111111 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111, p1Var2, null);
                        z19 = z21111111111;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    }
                    o0VarE.g0(false);
                    l0.e((p) objQ2, unit111117, o0VarE);
                    boolean zCompass$lambda$1112 = Compass$lambda$4(p1Var3);
                    v1 v1VarD119 = u0.d(s1.l.d(500, 0, null, 6), 2);
                    boolean z21111111112 = z19;
                    r1.x1 x1VarE119 = u0.e(s1.l.d(500, 500, null, 4), 2);
                    o0VarE.L(1868333135);
                    h4.r rVarG119 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                    Unit unit111118 = Unit.INSTANCE;
                    Boolean boolValueOf119 = Boolean.valueOf(z18);
                    o0VarE.L(511388516);
                    zB2 = o0VarE.B(boolValueOf119) | o0VarE.B(this);
                    objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    }
                    o0VarE.g0(false);
                    q qVar119 = s0.f15885a;
                    h4.r rVarThen119 = rVarG119.then(new r0(unit111118, null, null, new s0.a((p) objQ3), 6, null));
                    o0VarE.g0(false);
                    r1.c0.e(zCompass$lambda$1112, rVarThen119, v1VarD119, x1VarE119, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                    x1 x1Var111118 = n.f135158a;
                    h2 h2Var1112 = h2VarA;
                    pVar2 = pVarM213getLambda1$extension_compose_release;
                    h2Var2 = h2Var1112;
                    z24 = z21111111112;
                    z25 = z18;
                    dVar4 = dVar3;
                    rVar4 = rVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
            }
            i29 = 1572864;
            i16 |= i29;
            if ((i16 & 2995931) == 599186) {
                if (i34 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i35 != 0) {
                    f.a aVar1110 = f.f75994b;
                    h2VarA = l.a(4);
                }
                if (i17 != 0) {
                    h4.d.f81522a.getClass();
                    dVar3 = h4.d.a.f81526d;
                } else {
                    dVar3 = dVar2;
                }
                if (i19 != 0) {
                    z16 = true;
                }
                if (i25 == 0) {
                }
                if (i27 != 0) {
                    pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                }
                x1 x1Var111119 = n.f135158a;
                objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                c2565a = m.a.f135155b;
                if (objK == c2565a) {
                    objK = p0.n(Float.valueOf(0.0f));
                    o0VarE.K(objK);
                }
                o0VarE.g0(false);
                p1Var = (p1) objK;
                o0VarE.L(-492369756);
                objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                o0VarE.g0(false);
                p1Var2 = (p1) objQ;
                Unit unit111119 = Unit.INSTANCE;
                objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                o0VarE.L(-568225417);
                zB = false;
                while (i30 < 4) {
                    zB |= o0VarE.B(objArr[i30]);
                }
                objQ2 = o0VarE.q();
                if (zB) {
                    boolean z21111111113 = z16;
                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111113, p1Var2, null);
                    z19 = z21111111113;
                    p1Var3 = p1Var2;
                    o0VarE.K(objQ2);
                } else {
                    boolean z21111111114 = z16;
                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111114, p1Var2, null);
                    z19 = z21111111114;
                    p1Var3 = p1Var2;
                    o0VarE.K(objQ2);
                }
                o0VarE.g0(false);
                l0.e((p) objQ2, unit111119, o0VarE);
                boolean zCompass$lambda$1113 = Compass$lambda$4(p1Var3);
                v1 v1VarD1110 = u0.d(s1.l.d(500, 0, null, 6), 2);
                boolean z21111111115 = z19;
                r1.x1 x1VarE1110 = u0.e(s1.l.d(500, 500, null, 4), 2);
                o0VarE.L(1868333135);
                h4.r rVarG1110 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                Unit unit1111110 = Unit.INSTANCE;
                Boolean boolValueOf1110 = Boolean.valueOf(z18);
                o0VarE.L(511388516);
                zB2 = o0VarE.B(boolValueOf1110) | o0VarE.B(this);
                objQ3 = o0VarE.q();
                if (zB2) {
                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                    o0VarE.K(objQ3);
                }
                o0VarE.g0(false);
                q qVar1110 = s0.f15885a;
                h4.r rVarThen1110 = rVarG1110.then(new r0(unit1111110, null, null, new s0.a((p) objQ3), 6, null));
                o0VarE.g0(false);
                r1.c0.e(zCompass$lambda$1113, rVarThen1110, v1VarD1110, x1VarE1110, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                x1 x1Var1111110 = n.f135158a;
                h2 h2Var1113 = h2VarA;
                pVar2 = pVarM213getLambda1$extension_compose_release;
                h2Var2 = h2Var1113;
                z24 = z21111111115;
                z25 = z18;
                dVar4 = dVar3;
                rVar4 = rVar3;
            } else {
                if (i34 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i35 != 0) {
                    f.a aVar1111 = f.f75994b;
                    h2VarA = l.a(4);
                }
                if (i17 != 0) {
                    h4.d.f81522a.getClass();
                    dVar3 = h4.d.a.f81526d;
                } else {
                    dVar3 = dVar2;
                }
                if (i19 != 0) {
                    z16 = true;
                }
                if (i25 == 0) {
                }
                if (i27 != 0) {
                    pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                }
                x1 x1Var1111111 = n.f135158a;
                objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                c2565a = m.a.f135155b;
                if (objK == c2565a) {
                    objK = p0.n(Float.valueOf(0.0f));
                    o0VarE.K(objK);
                }
                o0VarE.g0(false);
                p1Var = (p1) objK;
                o0VarE.L(-492369756);
                objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                o0VarE.g0(false);
                p1Var2 = (p1) objQ;
                Unit unit1111111 = Unit.INSTANCE;
                objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                o0VarE.L(-568225417);
                zB = false;
                while (i30 < 4) {
                    zB |= o0VarE.B(objArr[i30]);
                }
                objQ2 = o0VarE.q();
                if (zB) {
                    boolean z21111111116 = z16;
                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111116, p1Var2, null);
                    z19 = z21111111116;
                    p1Var3 = p1Var2;
                    o0VarE.K(objQ2);
                } else {
                    boolean z21111111117 = z16;
                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111117, p1Var2, null);
                    z19 = z21111111117;
                    p1Var3 = p1Var2;
                    o0VarE.K(objQ2);
                }
                o0VarE.g0(false);
                l0.e((p) objQ2, unit1111111, o0VarE);
                boolean zCompass$lambda$1114 = Compass$lambda$4(p1Var3);
                v1 v1VarD1111 = u0.d(s1.l.d(500, 0, null, 6), 2);
                boolean z21111111118 = z19;
                r1.x1 x1VarE1111 = u0.e(s1.l.d(500, 500, null, 4), 2);
                o0VarE.L(1868333135);
                h4.r rVarG1111 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                Unit unit1111112 = Unit.INSTANCE;
                Boolean boolValueOf1111 = Boolean.valueOf(z18);
                o0VarE.L(511388516);
                zB2 = o0VarE.B(boolValueOf1111) | o0VarE.B(this);
                objQ3 = o0VarE.q();
                if (zB2) {
                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                    o0VarE.K(objQ3);
                }
                o0VarE.g0(false);
                q qVar1111 = s0.f15885a;
                h4.r rVarThen1111 = rVarG1111.then(new r0(unit1111112, null, null, new s0.a((p) objQ3), 6, null));
                o0VarE.g0(false);
                r1.c0.e(zCompass$lambda$1114, rVarThen1111, v1VarD1111, x1VarE1111, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                x1 x1Var1111112 = n.f135158a;
                h2 h2Var1114 = h2VarA;
                pVar2 = pVarM213getLambda1$extension_compose_release;
                h2Var2 = h2Var1114;
                z24 = z21111111118;
                z25 = z18;
                dVar4 = dVar3;
                rVar4 = rVar3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 == null) {
                return;
            }
            p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
        }
        i16 |= 48;
        h2VarA = h2Var;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 896) == 0) {
                dVar2 = dVar;
                if (o0VarE.B(dVar2)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            i19 = i15 & 8;
            if (i19 != 0) {
                if ((i14 & 7168) == 0) {
                    z16 = z14;
                    if (o0VarE.h(z16)) {
                        i24 = 2048;
                    } else {
                        i24 = 1024;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 16;
                if (i25 != 0) {
                    if ((57344 & i14) == 0) {
                        z17 = z15;
                        if (o0VarE.h(z17)) {
                            i26 = 16384;
                        } else {
                            i26 = 8192;
                        }
                        i16 |= i26;
                    }
                    i27 = i15 & 32;
                    if (i27 != 0) {
                        i16 |= 196608;
                        pVarM213getLambda1$extension_compose_release = pVar;
                    } else {
                        pVarM213getLambda1$extension_compose_release = pVar;
                        if ((i14 & 458752) == 0) {
                            if (o0VarE.B(pVarM213getLambda1$extension_compose_release)) {
                                i28 = 131072;
                            } else {
                                i28 = 65536;
                            }
                            i16 |= i28;
                        }
                    }
                    if ((i15 & 64) != 0) {
                        if ((i14 & 3670016) == 0) {
                            if (o0VarE.B(this)) {
                                i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                            } else {
                                i29 = 524288;
                            }
                        }
                        if ((i16 & 2995931) == 599186) {
                            if (i34 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i35 != 0) {
                                f.a aVar1112 = f.f75994b;
                                h2VarA = l.a(4);
                            }
                            if (i17 != 0) {
                                h4.d.f81522a.getClass();
                                dVar3 = h4.d.a.f81526d;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            }
                            if (i25 == 0) {
                            }
                            if (i27 != 0) {
                                pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                            }
                            x1 x1Var1111113 = n.f135158a;
                            objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                            c2565a = m.a.f135155b;
                            if (objK == c2565a) {
                                objK = p0.n(Float.valueOf(0.0f));
                                o0VarE.K(objK);
                            }
                            o0VarE.g0(false);
                            p1Var = (p1) objK;
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            if (objQ == c2565a) {
                                objQ = p0.n(Boolean.FALSE);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            p1Var2 = (p1) objQ;
                            Unit unit1111113 = Unit.INSTANCE;
                            objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                            o0VarE.L(-568225417);
                            zB = false;
                            while (i30 < 4) {
                                zB |= o0VarE.B(objArr[i30]);
                            }
                            objQ2 = o0VarE.q();
                            if (zB) {
                                boolean z21111111119 = z16;
                                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111119, p1Var2, null);
                                z19 = z21111111119;
                                p1Var3 = p1Var2;
                                o0VarE.K(objQ2);
                            } else {
                                boolean z211111111110 = z16;
                                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111110, p1Var2, null);
                                z19 = z211111111110;
                                p1Var3 = p1Var2;
                                o0VarE.K(objQ2);
                            }
                            o0VarE.g0(false);
                            l0.e((p) objQ2, unit1111113, o0VarE);
                            boolean zCompass$lambda$1115 = Compass$lambda$4(p1Var3);
                            v1 v1VarD1112 = u0.d(s1.l.d(500, 0, null, 6), 2);
                            boolean z211111111111 = z19;
                            r1.x1 x1VarE1112 = u0.e(s1.l.d(500, 500, null, 4), 2);
                            o0VarE.L(1868333135);
                            h4.r rVarG1112 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                            Unit unit1111114 = Unit.INSTANCE;
                            Boolean boolValueOf1112 = Boolean.valueOf(z18);
                            o0VarE.L(511388516);
                            zB2 = o0VarE.B(boolValueOf1112) | o0VarE.B(this);
                            objQ3 = o0VarE.q();
                            if (zB2) {
                                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                o0VarE.K(objQ3);
                            } else {
                                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                o0VarE.K(objQ3);
                            }
                            o0VarE.g0(false);
                            q qVar1112 = s0.f15885a;
                            h4.r rVarThen1112 = rVarG1112.then(new r0(unit1111114, null, null, new s0.a((p) objQ3), 6, null));
                            o0VarE.g0(false);
                            r1.c0.e(zCompass$lambda$1115, rVarThen1112, v1VarD1112, x1VarE1112, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                            x1 x1Var1111114 = n.f135158a;
                            h2 h2Var1115 = h2VarA;
                            pVar2 = pVarM213getLambda1$extension_compose_release;
                            h2Var2 = h2Var1115;
                            z24 = z211111111111;
                            z25 = z18;
                            dVar4 = dVar3;
                            rVar4 = rVar3;
                        } else {
                            if (i34 != 0) {
                                rVar3 = h4.r.S;
                            } else {
                                rVar3 = rVar2;
                            }
                            if (i35 != 0) {
                                f.a aVar1113 = f.f75994b;
                                h2VarA = l.a(4);
                            }
                            if (i17 != 0) {
                                h4.d.f81522a.getClass();
                                dVar3 = h4.d.a.f81526d;
                            } else {
                                dVar3 = dVar2;
                            }
                            if (i19 != 0) {
                                z16 = true;
                            }
                            if (i25 == 0) {
                            }
                            if (i27 != 0) {
                                pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                            }
                            x1 x1Var1111115 = n.f135158a;
                            objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                            c2565a = m.a.f135155b;
                            if (objK == c2565a) {
                                objK = p0.n(Float.valueOf(0.0f));
                                o0VarE.K(objK);
                            }
                            o0VarE.g0(false);
                            p1Var = (p1) objK;
                            o0VarE.L(-492369756);
                            objQ = o0VarE.q();
                            if (objQ == c2565a) {
                                objQ = p0.n(Boolean.FALSE);
                                o0VarE.K(objQ);
                            }
                            o0VarE.g0(false);
                            p1Var2 = (p1) objQ;
                            Unit unit1111115 = Unit.INSTANCE;
                            objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                            o0VarE.L(-568225417);
                            zB = false;
                            while (i30 < 4) {
                                zB |= o0VarE.B(objArr[i30]);
                            }
                            objQ2 = o0VarE.q();
                            if (zB) {
                                boolean z211111111112 = z16;
                                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111112, p1Var2, null);
                                z19 = z211111111112;
                                p1Var3 = p1Var2;
                                o0VarE.K(objQ2);
                            } else {
                                boolean z211111111113 = z16;
                                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111113, p1Var2, null);
                                z19 = z211111111113;
                                p1Var3 = p1Var2;
                                o0VarE.K(objQ2);
                            }
                            o0VarE.g0(false);
                            l0.e((p) objQ2, unit1111115, o0VarE);
                            boolean zCompass$lambda$1116 = Compass$lambda$4(p1Var3);
                            v1 v1VarD1113 = u0.d(s1.l.d(500, 0, null, 6), 2);
                            boolean z211111111114 = z19;
                            r1.x1 x1VarE1113 = u0.e(s1.l.d(500, 500, null, 4), 2);
                            o0VarE.L(1868333135);
                            h4.r rVarG1113 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                            Unit unit1111116 = Unit.INSTANCE;
                            Boolean boolValueOf1113 = Boolean.valueOf(z18);
                            o0VarE.L(511388516);
                            zB2 = o0VarE.B(boolValueOf1113) | o0VarE.B(this);
                            objQ3 = o0VarE.q();
                            if (zB2) {
                                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                o0VarE.K(objQ3);
                            } else {
                                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                                o0VarE.K(objQ3);
                            }
                            o0VarE.g0(false);
                            q qVar1113 = s0.f15885a;
                            h4.r rVarThen1113 = rVarG1113.then(new r0(unit1111116, null, null, new s0.a((p) objQ3), 6, null));
                            o0VarE.g0(false);
                            r1.c0.e(zCompass$lambda$1116, rVarThen1113, v1VarD1113, x1VarE1113, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                            x1 x1Var1111116 = n.f135158a;
                            h2 h2Var1116 = h2VarA;
                            pVar2 = pVarM213getLambda1$extension_compose_release;
                            h2Var2 = h2Var1116;
                            z24 = z211111111114;
                            z25 = z18;
                            dVar4 = dVar3;
                            rVar4 = rVar3;
                        }
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 == null) {
                            return;
                        }
                        p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
                    }
                    i29 = 1572864;
                    i16 |= i29;
                    if ((i16 & 2995931) == 599186) {
                        if (i34 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i35 != 0) {
                            f.a aVar1114 = f.f75994b;
                            h2VarA = l.a(4);
                        }
                        if (i17 != 0) {
                            h4.d.f81522a.getClass();
                            dVar3 = h4.d.a.f81526d;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                        }
                        x1 x1Var1111117 = n.f135158a;
                        objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                        c2565a = m.a.f135155b;
                        if (objK == c2565a) {
                            objK = p0.n(Float.valueOf(0.0f));
                            o0VarE.K(objK);
                        }
                        o0VarE.g0(false);
                        p1Var = (p1) objK;
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        if (objQ == c2565a) {
                            objQ = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        p1Var2 = (p1) objQ;
                        Unit unit1111117 = Unit.INSTANCE;
                        objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                        o0VarE.L(-568225417);
                        zB = false;
                        while (i30 < 4) {
                            zB |= o0VarE.B(objArr[i30]);
                        }
                        objQ2 = o0VarE.q();
                        if (zB) {
                            boolean z211111111115 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111115, p1Var2, null);
                            z19 = z211111111115;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        } else {
                            boolean z211111111116 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111116, p1Var2, null);
                            z19 = z211111111116;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        }
                        o0VarE.g0(false);
                        l0.e((p) objQ2, unit1111117, o0VarE);
                        boolean zCompass$lambda$1117 = Compass$lambda$4(p1Var3);
                        v1 v1VarD1114 = u0.d(s1.l.d(500, 0, null, 6), 2);
                        boolean z211111111117 = z19;
                        r1.x1 x1VarE1114 = u0.e(s1.l.d(500, 500, null, 4), 2);
                        o0VarE.L(1868333135);
                        h4.r rVarG1114 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                        Unit unit1111118 = Unit.INSTANCE;
                        Boolean boolValueOf1114 = Boolean.valueOf(z18);
                        o0VarE.L(511388516);
                        zB2 = o0VarE.B(boolValueOf1114) | o0VarE.B(this);
                        objQ3 = o0VarE.q();
                        if (zB2) {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        }
                        o0VarE.g0(false);
                        q qVar1114 = s0.f15885a;
                        h4.r rVarThen1114 = rVarG1114.then(new r0(unit1111118, null, null, new s0.a((p) objQ3), 6, null));
                        o0VarE.g0(false);
                        r1.c0.e(zCompass$lambda$1117, rVarThen1114, v1VarD1114, x1VarE1114, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                        x1 x1Var1111118 = n.f135158a;
                        h2 h2Var1117 = h2VarA;
                        pVar2 = pVarM213getLambda1$extension_compose_release;
                        h2Var2 = h2Var1117;
                        z24 = z211111111117;
                        z25 = z18;
                        dVar4 = dVar3;
                        rVar4 = rVar3;
                    } else {
                        if (i34 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i35 != 0) {
                            f.a aVar1115 = f.f75994b;
                            h2VarA = l.a(4);
                        }
                        if (i17 != 0) {
                            h4.d.f81522a.getClass();
                            dVar3 = h4.d.a.f81526d;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                        }
                        x1 x1Var1111119 = n.f135158a;
                        objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                        c2565a = m.a.f135155b;
                        if (objK == c2565a) {
                            objK = p0.n(Float.valueOf(0.0f));
                            o0VarE.K(objK);
                        }
                        o0VarE.g0(false);
                        p1Var = (p1) objK;
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        if (objQ == c2565a) {
                            objQ = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        p1Var2 = (p1) objQ;
                        Unit unit1111119 = Unit.INSTANCE;
                        objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                        o0VarE.L(-568225417);
                        zB = false;
                        while (i30 < 4) {
                            zB |= o0VarE.B(objArr[i30]);
                        }
                        objQ2 = o0VarE.q();
                        if (zB) {
                            boolean z211111111118 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111118, p1Var2, null);
                            z19 = z211111111118;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        } else {
                            boolean z211111111119 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111119, p1Var2, null);
                            z19 = z211111111119;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        }
                        o0VarE.g0(false);
                        l0.e((p) objQ2, unit1111119, o0VarE);
                        boolean zCompass$lambda$1118 = Compass$lambda$4(p1Var3);
                        v1 v1VarD1115 = u0.d(s1.l.d(500, 0, null, 6), 2);
                        boolean z2111111111110 = z19;
                        r1.x1 x1VarE1115 = u0.e(s1.l.d(500, 500, null, 4), 2);
                        o0VarE.L(1868333135);
                        h4.r rVarG1115 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                        Unit unit11111110 = Unit.INSTANCE;
                        Boolean boolValueOf1115 = Boolean.valueOf(z18);
                        o0VarE.L(511388516);
                        zB2 = o0VarE.B(boolValueOf1115) | o0VarE.B(this);
                        objQ3 = o0VarE.q();
                        if (zB2) {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        }
                        o0VarE.g0(false);
                        q qVar1115 = s0.f15885a;
                        h4.r rVarThen1115 = rVarG1115.then(new r0(unit11111110, null, null, new s0.a((p) objQ3), 6, null));
                        o0VarE.g0(false);
                        r1.c0.e(zCompass$lambda$1118, rVarThen1115, v1VarD1115, x1VarE1115, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                        x1 x1Var11111110 = n.f135158a;
                        h2 h2Var1118 = h2VarA;
                        pVar2 = pVarM213getLambda1$extension_compose_release;
                        h2Var2 = h2Var1118;
                        z24 = z2111111111110;
                        z25 = z18;
                        dVar4 = dVar3;
                        rVar4 = rVar3;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
                }
                i16 |= 24576;
                z17 = z15;
                i27 = i15 & 32;
                if (i27 != 0) {
                    i16 |= 196608;
                    pVarM213getLambda1$extension_compose_release = pVar;
                } else {
                    pVarM213getLambda1$extension_compose_release = pVar;
                    if ((i14 & 458752) == 0) {
                        if (o0VarE.B(pVarM213getLambda1$extension_compose_release)) {
                            i28 = 131072;
                        } else {
                            i28 = 65536;
                        }
                        i16 |= i28;
                    }
                }
                if ((i15 & 64) != 0) {
                    if ((i14 & 3670016) == 0) {
                        if (o0VarE.B(this)) {
                            i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i29 = 524288;
                        }
                    }
                    if ((i16 & 2995931) == 599186) {
                        if (i34 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i35 != 0) {
                            f.a aVar1116 = f.f75994b;
                            h2VarA = l.a(4);
                        }
                        if (i17 != 0) {
                            h4.d.f81522a.getClass();
                            dVar3 = h4.d.a.f81526d;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                        }
                        x1 x1Var11111111 = n.f135158a;
                        objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                        c2565a = m.a.f135155b;
                        if (objK == c2565a) {
                            objK = p0.n(Float.valueOf(0.0f));
                            o0VarE.K(objK);
                        }
                        o0VarE.g0(false);
                        p1Var = (p1) objK;
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        if (objQ == c2565a) {
                            objQ = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        p1Var2 = (p1) objQ;
                        Unit unit11111111 = Unit.INSTANCE;
                        objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                        o0VarE.L(-568225417);
                        zB = false;
                        while (i30 < 4) {
                            zB |= o0VarE.B(objArr[i30]);
                        }
                        objQ2 = o0VarE.q();
                        if (zB) {
                            boolean z2111111111111 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111111111, p1Var2, null);
                            z19 = z2111111111111;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        } else {
                            boolean z2111111111112 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111111112, p1Var2, null);
                            z19 = z2111111111112;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        }
                        o0VarE.g0(false);
                        l0.e((p) objQ2, unit11111111, o0VarE);
                        boolean zCompass$lambda$1119 = Compass$lambda$4(p1Var3);
                        v1 v1VarD1116 = u0.d(s1.l.d(500, 0, null, 6), 2);
                        boolean z2111111111113 = z19;
                        r1.x1 x1VarE1116 = u0.e(s1.l.d(500, 500, null, 4), 2);
                        o0VarE.L(1868333135);
                        h4.r rVarG1116 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                        Unit unit11111112 = Unit.INSTANCE;
                        Boolean boolValueOf1116 = Boolean.valueOf(z18);
                        o0VarE.L(511388516);
                        zB2 = o0VarE.B(boolValueOf1116) | o0VarE.B(this);
                        objQ3 = o0VarE.q();
                        if (zB2) {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        }
                        o0VarE.g0(false);
                        q qVar1116 = s0.f15885a;
                        h4.r rVarThen1116 = rVarG1116.then(new r0(unit11111112, null, null, new s0.a((p) objQ3), 6, null));
                        o0VarE.g0(false);
                        r1.c0.e(zCompass$lambda$1119, rVarThen1116, v1VarD1116, x1VarE1116, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                        x1 x1Var11111112 = n.f135158a;
                        h2 h2Var1119 = h2VarA;
                        pVar2 = pVarM213getLambda1$extension_compose_release;
                        h2Var2 = h2Var1119;
                        z24 = z2111111111113;
                        z25 = z18;
                        dVar4 = dVar3;
                        rVar4 = rVar3;
                    } else {
                        if (i34 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i35 != 0) {
                            f.a aVar1117 = f.f75994b;
                            h2VarA = l.a(4);
                        }
                        if (i17 != 0) {
                            h4.d.f81522a.getClass();
                            dVar3 = h4.d.a.f81526d;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                        }
                        x1 x1Var11111113 = n.f135158a;
                        objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                        c2565a = m.a.f135155b;
                        if (objK == c2565a) {
                            objK = p0.n(Float.valueOf(0.0f));
                            o0VarE.K(objK);
                        }
                        o0VarE.g0(false);
                        p1Var = (p1) objK;
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        if (objQ == c2565a) {
                            objQ = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        p1Var2 = (p1) objQ;
                        Unit unit11111113 = Unit.INSTANCE;
                        objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                        o0VarE.L(-568225417);
                        zB = false;
                        while (i30 < 4) {
                            zB |= o0VarE.B(objArr[i30]);
                        }
                        objQ2 = o0VarE.q();
                        if (zB) {
                            boolean z2111111111114 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111111114, p1Var2, null);
                            z19 = z2111111111114;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        } else {
                            boolean z2111111111115 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111111115, p1Var2, null);
                            z19 = z2111111111115;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        }
                        o0VarE.g0(false);
                        l0.e((p) objQ2, unit11111113, o0VarE);
                        boolean zCompass$lambda$11110 = Compass$lambda$4(p1Var3);
                        v1 v1VarD1117 = u0.d(s1.l.d(500, 0, null, 6), 2);
                        boolean z2111111111116 = z19;
                        r1.x1 x1VarE1117 = u0.e(s1.l.d(500, 500, null, 4), 2);
                        o0VarE.L(1868333135);
                        h4.r rVarG1117 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                        Unit unit11111114 = Unit.INSTANCE;
                        Boolean boolValueOf1117 = Boolean.valueOf(z18);
                        o0VarE.L(511388516);
                        zB2 = o0VarE.B(boolValueOf1117) | o0VarE.B(this);
                        objQ3 = o0VarE.q();
                        if (zB2) {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        }
                        o0VarE.g0(false);
                        q qVar1117 = s0.f15885a;
                        h4.r rVarThen1117 = rVarG1117.then(new r0(unit11111114, null, null, new s0.a((p) objQ3), 6, null));
                        o0VarE.g0(false);
                        r1.c0.e(zCompass$lambda$11110, rVarThen1117, v1VarD1117, x1VarE1117, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                        x1 x1Var11111114 = n.f135158a;
                        h2 h2Var11110 = h2VarA;
                        pVar2 = pVarM213getLambda1$extension_compose_release;
                        h2Var2 = h2Var11110;
                        z24 = z2111111111116;
                        z25 = z18;
                        dVar4 = dVar3;
                        rVar4 = rVar3;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
                }
                i29 = 1572864;
                i16 |= i29;
                if ((i16 & 2995931) == 599186) {
                    if (i34 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i35 != 0) {
                        f.a aVar1118 = f.f75994b;
                        h2VarA = l.a(4);
                    }
                    if (i17 != 0) {
                        h4.d.f81522a.getClass();
                        dVar3 = h4.d.a.f81526d;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                    }
                    x1 x1Var11111115 = n.f135158a;
                    objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = p0.n(Float.valueOf(0.0f));
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    p1Var = (p1) objK;
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    p1Var2 = (p1) objQ;
                    Unit unit11111115 = Unit.INSTANCE;
                    objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                    o0VarE.L(-568225417);
                    zB = false;
                    while (i30 < 4) {
                        zB |= o0VarE.B(objArr[i30]);
                    }
                    objQ2 = o0VarE.q();
                    if (zB) {
                        boolean z2111111111117 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111111117, p1Var2, null);
                        z19 = z2111111111117;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    } else {
                        boolean z2111111111118 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111111118, p1Var2, null);
                        z19 = z2111111111118;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    }
                    o0VarE.g0(false);
                    l0.e((p) objQ2, unit11111115, o0VarE);
                    boolean zCompass$lambda$11111 = Compass$lambda$4(p1Var3);
                    v1 v1VarD1118 = u0.d(s1.l.d(500, 0, null, 6), 2);
                    boolean z2111111111119 = z19;
                    r1.x1 x1VarE1118 = u0.e(s1.l.d(500, 500, null, 4), 2);
                    o0VarE.L(1868333135);
                    h4.r rVarG1118 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                    Unit unit11111116 = Unit.INSTANCE;
                    Boolean boolValueOf1118 = Boolean.valueOf(z18);
                    o0VarE.L(511388516);
                    zB2 = o0VarE.B(boolValueOf1118) | o0VarE.B(this);
                    objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    }
                    o0VarE.g0(false);
                    q qVar1118 = s0.f15885a;
                    h4.r rVarThen1118 = rVarG1118.then(new r0(unit11111116, null, null, new s0.a((p) objQ3), 6, null));
                    o0VarE.g0(false);
                    r1.c0.e(zCompass$lambda$11111, rVarThen1118, v1VarD1118, x1VarE1118, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                    x1 x1Var11111116 = n.f135158a;
                    h2 h2Var11111 = h2VarA;
                    pVar2 = pVarM213getLambda1$extension_compose_release;
                    h2Var2 = h2Var11111;
                    z24 = z2111111111119;
                    z25 = z18;
                    dVar4 = dVar3;
                    rVar4 = rVar3;
                } else {
                    if (i34 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i35 != 0) {
                        f.a aVar1119 = f.f75994b;
                        h2VarA = l.a(4);
                    }
                    if (i17 != 0) {
                        h4.d.f81522a.getClass();
                        dVar3 = h4.d.a.f81526d;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                    }
                    x1 x1Var11111117 = n.f135158a;
                    objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = p0.n(Float.valueOf(0.0f));
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    p1Var = (p1) objK;
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    p1Var2 = (p1) objQ;
                    Unit unit11111117 = Unit.INSTANCE;
                    objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                    o0VarE.L(-568225417);
                    zB = false;
                    while (i30 < 4) {
                        zB |= o0VarE.B(objArr[i30]);
                    }
                    objQ2 = o0VarE.q();
                    if (zB) {
                        boolean z21111111111110 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111110, p1Var2, null);
                        z19 = z21111111111110;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    } else {
                        boolean z21111111111111 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111111, p1Var2, null);
                        z19 = z21111111111111;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    }
                    o0VarE.g0(false);
                    l0.e((p) objQ2, unit11111117, o0VarE);
                    boolean zCompass$lambda$11112 = Compass$lambda$4(p1Var3);
                    v1 v1VarD1119 = u0.d(s1.l.d(500, 0, null, 6), 2);
                    boolean z21111111111112 = z19;
                    r1.x1 x1VarE1119 = u0.e(s1.l.d(500, 500, null, 4), 2);
                    o0VarE.L(1868333135);
                    h4.r rVarG1119 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                    Unit unit11111118 = Unit.INSTANCE;
                    Boolean boolValueOf1119 = Boolean.valueOf(z18);
                    o0VarE.L(511388516);
                    zB2 = o0VarE.B(boolValueOf1119) | o0VarE.B(this);
                    objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    }
                    o0VarE.g0(false);
                    q qVar1119 = s0.f15885a;
                    h4.r rVarThen1119 = rVarG1119.then(new r0(unit11111118, null, null, new s0.a((p) objQ3), 6, null));
                    o0VarE.g0(false);
                    r1.c0.e(zCompass$lambda$11112, rVarThen1119, v1VarD1119, x1VarE1119, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                    x1 x1Var11111118 = n.f135158a;
                    h2 h2Var11112 = h2VarA;
                    pVar2 = pVarM213getLambda1$extension_compose_release;
                    h2Var2 = h2Var11112;
                    z24 = z21111111111112;
                    z25 = z18;
                    dVar4 = dVar3;
                    rVar4 = rVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
            }
            i16 |= 3072;
            z16 = z14;
            i25 = i15 & 16;
            if (i25 != 0) {
                if ((57344 & i14) == 0) {
                    z17 = z15;
                    if (o0VarE.h(z17)) {
                        i26 = 16384;
                    } else {
                        i26 = 8192;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 32;
                if (i27 != 0) {
                    i16 |= 196608;
                    pVarM213getLambda1$extension_compose_release = pVar;
                } else {
                    pVarM213getLambda1$extension_compose_release = pVar;
                    if ((i14 & 458752) == 0) {
                        if (o0VarE.B(pVarM213getLambda1$extension_compose_release)) {
                            i28 = 131072;
                        } else {
                            i28 = 65536;
                        }
                        i16 |= i28;
                    }
                }
                if ((i15 & 64) != 0) {
                    if ((i14 & 3670016) == 0) {
                        if (o0VarE.B(this)) {
                            i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i29 = 524288;
                        }
                    }
                    if ((i16 & 2995931) == 599186) {
                        if (i34 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i35 != 0) {
                            f.a aVar11110 = f.f75994b;
                            h2VarA = l.a(4);
                        }
                        if (i17 != 0) {
                            h4.d.f81522a.getClass();
                            dVar3 = h4.d.a.f81526d;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                        }
                        x1 x1Var11111119 = n.f135158a;
                        objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                        c2565a = m.a.f135155b;
                        if (objK == c2565a) {
                            objK = p0.n(Float.valueOf(0.0f));
                            o0VarE.K(objK);
                        }
                        o0VarE.g0(false);
                        p1Var = (p1) objK;
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        if (objQ == c2565a) {
                            objQ = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        p1Var2 = (p1) objQ;
                        Unit unit11111119 = Unit.INSTANCE;
                        objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                        o0VarE.L(-568225417);
                        zB = false;
                        while (i30 < 4) {
                            zB |= o0VarE.B(objArr[i30]);
                        }
                        objQ2 = o0VarE.q();
                        if (zB) {
                            boolean z21111111111113 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111113, p1Var2, null);
                            z19 = z21111111111113;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        } else {
                            boolean z21111111111114 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111114, p1Var2, null);
                            z19 = z21111111111114;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        }
                        o0VarE.g0(false);
                        l0.e((p) objQ2, unit11111119, o0VarE);
                        boolean zCompass$lambda$11113 = Compass$lambda$4(p1Var3);
                        v1 v1VarD11110 = u0.d(s1.l.d(500, 0, null, 6), 2);
                        boolean z21111111111115 = z19;
                        r1.x1 x1VarE11110 = u0.e(s1.l.d(500, 500, null, 4), 2);
                        o0VarE.L(1868333135);
                        h4.r rVarG11110 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                        Unit unit111111110 = Unit.INSTANCE;
                        Boolean boolValueOf11110 = Boolean.valueOf(z18);
                        o0VarE.L(511388516);
                        zB2 = o0VarE.B(boolValueOf11110) | o0VarE.B(this);
                        objQ3 = o0VarE.q();
                        if (zB2) {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        }
                        o0VarE.g0(false);
                        q qVar11110 = s0.f15885a;
                        h4.r rVarThen11110 = rVarG11110.then(new r0(unit111111110, null, null, new s0.a((p) objQ3), 6, null));
                        o0VarE.g0(false);
                        r1.c0.e(zCompass$lambda$11113, rVarThen11110, v1VarD11110, x1VarE11110, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                        x1 x1Var111111110 = n.f135158a;
                        h2 h2Var11113 = h2VarA;
                        pVar2 = pVarM213getLambda1$extension_compose_release;
                        h2Var2 = h2Var11113;
                        z24 = z21111111111115;
                        z25 = z18;
                        dVar4 = dVar3;
                        rVar4 = rVar3;
                    } else {
                        if (i34 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i35 != 0) {
                            f.a aVar11111 = f.f75994b;
                            h2VarA = l.a(4);
                        }
                        if (i17 != 0) {
                            h4.d.f81522a.getClass();
                            dVar3 = h4.d.a.f81526d;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                        }
                        x1 x1Var111111111 = n.f135158a;
                        objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                        c2565a = m.a.f135155b;
                        if (objK == c2565a) {
                            objK = p0.n(Float.valueOf(0.0f));
                            o0VarE.K(objK);
                        }
                        o0VarE.g0(false);
                        p1Var = (p1) objK;
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        if (objQ == c2565a) {
                            objQ = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        p1Var2 = (p1) objQ;
                        Unit unit111111111 = Unit.INSTANCE;
                        objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                        o0VarE.L(-568225417);
                        zB = false;
                        while (i30 < 4) {
                            zB |= o0VarE.B(objArr[i30]);
                        }
                        objQ2 = o0VarE.q();
                        if (zB) {
                            boolean z21111111111116 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111116, p1Var2, null);
                            z19 = z21111111111116;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        } else {
                            boolean z21111111111117 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111117, p1Var2, null);
                            z19 = z21111111111117;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        }
                        o0VarE.g0(false);
                        l0.e((p) objQ2, unit111111111, o0VarE);
                        boolean zCompass$lambda$11114 = Compass$lambda$4(p1Var3);
                        v1 v1VarD11111 = u0.d(s1.l.d(500, 0, null, 6), 2);
                        boolean z21111111111118 = z19;
                        r1.x1 x1VarE11111 = u0.e(s1.l.d(500, 500, null, 4), 2);
                        o0VarE.L(1868333135);
                        h4.r rVarG11111 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                        Unit unit111111112 = Unit.INSTANCE;
                        Boolean boolValueOf11111 = Boolean.valueOf(z18);
                        o0VarE.L(511388516);
                        zB2 = o0VarE.B(boolValueOf11111) | o0VarE.B(this);
                        objQ3 = o0VarE.q();
                        if (zB2) {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        }
                        o0VarE.g0(false);
                        q qVar11111 = s0.f15885a;
                        h4.r rVarThen11111 = rVarG11111.then(new r0(unit111111112, null, null, new s0.a((p) objQ3), 6, null));
                        o0VarE.g0(false);
                        r1.c0.e(zCompass$lambda$11114, rVarThen11111, v1VarD11111, x1VarE11111, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                        x1 x1Var111111112 = n.f135158a;
                        h2 h2Var11114 = h2VarA;
                        pVar2 = pVarM213getLambda1$extension_compose_release;
                        h2Var2 = h2Var11114;
                        z24 = z21111111111118;
                        z25 = z18;
                        dVar4 = dVar3;
                        rVar4 = rVar3;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
                }
                i29 = 1572864;
                i16 |= i29;
                if ((i16 & 2995931) == 599186) {
                    if (i34 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i35 != 0) {
                        f.a aVar11112 = f.f75994b;
                        h2VarA = l.a(4);
                    }
                    if (i17 != 0) {
                        h4.d.f81522a.getClass();
                        dVar3 = h4.d.a.f81526d;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                    }
                    x1 x1Var111111113 = n.f135158a;
                    objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = p0.n(Float.valueOf(0.0f));
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    p1Var = (p1) objK;
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    p1Var2 = (p1) objQ;
                    Unit unit111111113 = Unit.INSTANCE;
                    objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                    o0VarE.L(-568225417);
                    zB = false;
                    while (i30 < 4) {
                        zB |= o0VarE.B(objArr[i30]);
                    }
                    objQ2 = o0VarE.q();
                    if (zB) {
                        boolean z21111111111119 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111119, p1Var2, null);
                        z19 = z21111111111119;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    } else {
                        boolean z211111111111110 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111111110, p1Var2, null);
                        z19 = z211111111111110;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    }
                    o0VarE.g0(false);
                    l0.e((p) objQ2, unit111111113, o0VarE);
                    boolean zCompass$lambda$11115 = Compass$lambda$4(p1Var3);
                    v1 v1VarD11112 = u0.d(s1.l.d(500, 0, null, 6), 2);
                    boolean z211111111111111 = z19;
                    r1.x1 x1VarE11112 = u0.e(s1.l.d(500, 500, null, 4), 2);
                    o0VarE.L(1868333135);
                    h4.r rVarG11112 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                    Unit unit111111114 = Unit.INSTANCE;
                    Boolean boolValueOf11112 = Boolean.valueOf(z18);
                    o0VarE.L(511388516);
                    zB2 = o0VarE.B(boolValueOf11112) | o0VarE.B(this);
                    objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    }
                    o0VarE.g0(false);
                    q qVar11112 = s0.f15885a;
                    h4.r rVarThen11112 = rVarG11112.then(new r0(unit111111114, null, null, new s0.a((p) objQ3), 6, null));
                    o0VarE.g0(false);
                    r1.c0.e(zCompass$lambda$11115, rVarThen11112, v1VarD11112, x1VarE11112, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                    x1 x1Var111111114 = n.f135158a;
                    h2 h2Var11115 = h2VarA;
                    pVar2 = pVarM213getLambda1$extension_compose_release;
                    h2Var2 = h2Var11115;
                    z24 = z211111111111111;
                    z25 = z18;
                    dVar4 = dVar3;
                    rVar4 = rVar3;
                } else {
                    if (i34 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i35 != 0) {
                        f.a aVar11113 = f.f75994b;
                        h2VarA = l.a(4);
                    }
                    if (i17 != 0) {
                        h4.d.f81522a.getClass();
                        dVar3 = h4.d.a.f81526d;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                    }
                    x1 x1Var111111115 = n.f135158a;
                    objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = p0.n(Float.valueOf(0.0f));
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    p1Var = (p1) objK;
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    p1Var2 = (p1) objQ;
                    Unit unit111111115 = Unit.INSTANCE;
                    objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                    o0VarE.L(-568225417);
                    zB = false;
                    while (i30 < 4) {
                        zB |= o0VarE.B(objArr[i30]);
                    }
                    objQ2 = o0VarE.q();
                    if (zB) {
                        boolean z211111111111112 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111111112, p1Var2, null);
                        z19 = z211111111111112;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    } else {
                        boolean z211111111111113 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111111113, p1Var2, null);
                        z19 = z211111111111113;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    }
                    o0VarE.g0(false);
                    l0.e((p) objQ2, unit111111115, o0VarE);
                    boolean zCompass$lambda$11116 = Compass$lambda$4(p1Var3);
                    v1 v1VarD11113 = u0.d(s1.l.d(500, 0, null, 6), 2);
                    boolean z211111111111114 = z19;
                    r1.x1 x1VarE11113 = u0.e(s1.l.d(500, 500, null, 4), 2);
                    o0VarE.L(1868333135);
                    h4.r rVarG11113 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                    Unit unit111111116 = Unit.INSTANCE;
                    Boolean boolValueOf11113 = Boolean.valueOf(z18);
                    o0VarE.L(511388516);
                    zB2 = o0VarE.B(boolValueOf11113) | o0VarE.B(this);
                    objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    }
                    o0VarE.g0(false);
                    q qVar11113 = s0.f15885a;
                    h4.r rVarThen11113 = rVarG11113.then(new r0(unit111111116, null, null, new s0.a((p) objQ3), 6, null));
                    o0VarE.g0(false);
                    r1.c0.e(zCompass$lambda$11116, rVarThen11113, v1VarD11113, x1VarE11113, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                    x1 x1Var111111116 = n.f135158a;
                    h2 h2Var11116 = h2VarA;
                    pVar2 = pVarM213getLambda1$extension_compose_release;
                    h2Var2 = h2Var11116;
                    z24 = z211111111111114;
                    z25 = z18;
                    dVar4 = dVar3;
                    rVar4 = rVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
            }
            i16 |= 24576;
            z17 = z15;
            i27 = i15 & 32;
            if (i27 != 0) {
                i16 |= 196608;
                pVarM213getLambda1$extension_compose_release = pVar;
            } else {
                pVarM213getLambda1$extension_compose_release = pVar;
                if ((i14 & 458752) == 0) {
                    if (o0VarE.B(pVarM213getLambda1$extension_compose_release)) {
                        i28 = 131072;
                    } else {
                        i28 = 65536;
                    }
                    i16 |= i28;
                }
            }
            if ((i15 & 64) != 0) {
                if ((i14 & 3670016) == 0) {
                    if (o0VarE.B(this)) {
                        i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i29 = 524288;
                    }
                }
                if ((i16 & 2995931) == 599186) {
                    if (i34 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i35 != 0) {
                        f.a aVar11114 = f.f75994b;
                        h2VarA = l.a(4);
                    }
                    if (i17 != 0) {
                        h4.d.f81522a.getClass();
                        dVar3 = h4.d.a.f81526d;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                    }
                    x1 x1Var111111117 = n.f135158a;
                    objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = p0.n(Float.valueOf(0.0f));
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    p1Var = (p1) objK;
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    p1Var2 = (p1) objQ;
                    Unit unit111111117 = Unit.INSTANCE;
                    objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                    o0VarE.L(-568225417);
                    zB = false;
                    while (i30 < 4) {
                        zB |= o0VarE.B(objArr[i30]);
                    }
                    objQ2 = o0VarE.q();
                    if (zB) {
                        boolean z211111111111115 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111111115, p1Var2, null);
                        z19 = z211111111111115;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    } else {
                        boolean z211111111111116 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111111116, p1Var2, null);
                        z19 = z211111111111116;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    }
                    o0VarE.g0(false);
                    l0.e((p) objQ2, unit111111117, o0VarE);
                    boolean zCompass$lambda$11117 = Compass$lambda$4(p1Var3);
                    v1 v1VarD11114 = u0.d(s1.l.d(500, 0, null, 6), 2);
                    boolean z211111111111117 = z19;
                    r1.x1 x1VarE11114 = u0.e(s1.l.d(500, 500, null, 4), 2);
                    o0VarE.L(1868333135);
                    h4.r rVarG11114 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                    Unit unit111111118 = Unit.INSTANCE;
                    Boolean boolValueOf11114 = Boolean.valueOf(z18);
                    o0VarE.L(511388516);
                    zB2 = o0VarE.B(boolValueOf11114) | o0VarE.B(this);
                    objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    }
                    o0VarE.g0(false);
                    q qVar11114 = s0.f15885a;
                    h4.r rVarThen11114 = rVarG11114.then(new r0(unit111111118, null, null, new s0.a((p) objQ3), 6, null));
                    o0VarE.g0(false);
                    r1.c0.e(zCompass$lambda$11117, rVarThen11114, v1VarD11114, x1VarE11114, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                    x1 x1Var111111118 = n.f135158a;
                    h2 h2Var11117 = h2VarA;
                    pVar2 = pVarM213getLambda1$extension_compose_release;
                    h2Var2 = h2Var11117;
                    z24 = z211111111111117;
                    z25 = z18;
                    dVar4 = dVar3;
                    rVar4 = rVar3;
                } else {
                    if (i34 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i35 != 0) {
                        f.a aVar11115 = f.f75994b;
                        h2VarA = l.a(4);
                    }
                    if (i17 != 0) {
                        h4.d.f81522a.getClass();
                        dVar3 = h4.d.a.f81526d;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                    }
                    x1 x1Var111111119 = n.f135158a;
                    objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = p0.n(Float.valueOf(0.0f));
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    p1Var = (p1) objK;
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    p1Var2 = (p1) objQ;
                    Unit unit111111119 = Unit.INSTANCE;
                    objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                    o0VarE.L(-568225417);
                    zB = false;
                    while (i30 < 4) {
                        zB |= o0VarE.B(objArr[i30]);
                    }
                    objQ2 = o0VarE.q();
                    if (zB) {
                        boolean z211111111111118 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111111118, p1Var2, null);
                        z19 = z211111111111118;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    } else {
                        boolean z211111111111119 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111111119, p1Var2, null);
                        z19 = z211111111111119;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    }
                    o0VarE.g0(false);
                    l0.e((p) objQ2, unit111111119, o0VarE);
                    boolean zCompass$lambda$11118 = Compass$lambda$4(p1Var3);
                    v1 v1VarD11115 = u0.d(s1.l.d(500, 0, null, 6), 2);
                    boolean z2111111111111110 = z19;
                    r1.x1 x1VarE11115 = u0.e(s1.l.d(500, 500, null, 4), 2);
                    o0VarE.L(1868333135);
                    h4.r rVarG11115 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                    Unit unit1111111110 = Unit.INSTANCE;
                    Boolean boolValueOf11115 = Boolean.valueOf(z18);
                    o0VarE.L(511388516);
                    zB2 = o0VarE.B(boolValueOf11115) | o0VarE.B(this);
                    objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    }
                    o0VarE.g0(false);
                    q qVar11115 = s0.f15885a;
                    h4.r rVarThen11115 = rVarG11115.then(new r0(unit1111111110, null, null, new s0.a((p) objQ3), 6, null));
                    o0VarE.g0(false);
                    r1.c0.e(zCompass$lambda$11118, rVarThen11115, v1VarD11115, x1VarE11115, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                    x1 x1Var1111111110 = n.f135158a;
                    h2 h2Var11118 = h2VarA;
                    pVar2 = pVarM213getLambda1$extension_compose_release;
                    h2Var2 = h2Var11118;
                    z24 = z2111111111111110;
                    z25 = z18;
                    dVar4 = dVar3;
                    rVar4 = rVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
            }
            i29 = 1572864;
            i16 |= i29;
            if ((i16 & 2995931) == 599186) {
                if (i34 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i35 != 0) {
                    f.a aVar11116 = f.f75994b;
                    h2VarA = l.a(4);
                }
                if (i17 != 0) {
                    h4.d.f81522a.getClass();
                    dVar3 = h4.d.a.f81526d;
                } else {
                    dVar3 = dVar2;
                }
                if (i19 != 0) {
                    z16 = true;
                }
                if (i25 == 0) {
                }
                if (i27 != 0) {
                    pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                }
                x1 x1Var1111111111 = n.f135158a;
                objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                c2565a = m.a.f135155b;
                if (objK == c2565a) {
                    objK = p0.n(Float.valueOf(0.0f));
                    o0VarE.K(objK);
                }
                o0VarE.g0(false);
                p1Var = (p1) objK;
                o0VarE.L(-492369756);
                objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                o0VarE.g0(false);
                p1Var2 = (p1) objQ;
                Unit unit1111111111 = Unit.INSTANCE;
                objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                o0VarE.L(-568225417);
                zB = false;
                while (i30 < 4) {
                    zB |= o0VarE.B(objArr[i30]);
                }
                objQ2 = o0VarE.q();
                if (zB) {
                    boolean z2111111111111111 = z16;
                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111111111111, p1Var2, null);
                    z19 = z2111111111111111;
                    p1Var3 = p1Var2;
                    o0VarE.K(objQ2);
                } else {
                    boolean z2111111111111112 = z16;
                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111111111112, p1Var2, null);
                    z19 = z2111111111111112;
                    p1Var3 = p1Var2;
                    o0VarE.K(objQ2);
                }
                o0VarE.g0(false);
                l0.e((p) objQ2, unit1111111111, o0VarE);
                boolean zCompass$lambda$11119 = Compass$lambda$4(p1Var3);
                v1 v1VarD11116 = u0.d(s1.l.d(500, 0, null, 6), 2);
                boolean z2111111111111113 = z19;
                r1.x1 x1VarE11116 = u0.e(s1.l.d(500, 500, null, 4), 2);
                o0VarE.L(1868333135);
                h4.r rVarG11116 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                Unit unit1111111112 = Unit.INSTANCE;
                Boolean boolValueOf11116 = Boolean.valueOf(z18);
                o0VarE.L(511388516);
                zB2 = o0VarE.B(boolValueOf11116) | o0VarE.B(this);
                objQ3 = o0VarE.q();
                if (zB2) {
                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                    o0VarE.K(objQ3);
                }
                o0VarE.g0(false);
                q qVar11116 = s0.f15885a;
                h4.r rVarThen11116 = rVarG11116.then(new r0(unit1111111112, null, null, new s0.a((p) objQ3), 6, null));
                o0VarE.g0(false);
                r1.c0.e(zCompass$lambda$11119, rVarThen11116, v1VarD11116, x1VarE11116, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                x1 x1Var1111111112 = n.f135158a;
                h2 h2Var11119 = h2VarA;
                pVar2 = pVarM213getLambda1$extension_compose_release;
                h2Var2 = h2Var11119;
                z24 = z2111111111111113;
                z25 = z18;
                dVar4 = dVar3;
                rVar4 = rVar3;
            } else {
                if (i34 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i35 != 0) {
                    f.a aVar11117 = f.f75994b;
                    h2VarA = l.a(4);
                }
                if (i17 != 0) {
                    h4.d.f81522a.getClass();
                    dVar3 = h4.d.a.f81526d;
                } else {
                    dVar3 = dVar2;
                }
                if (i19 != 0) {
                    z16 = true;
                }
                if (i25 == 0) {
                }
                if (i27 != 0) {
                    pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                }
                x1 x1Var1111111113 = n.f135158a;
                objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                c2565a = m.a.f135155b;
                if (objK == c2565a) {
                    objK = p0.n(Float.valueOf(0.0f));
                    o0VarE.K(objK);
                }
                o0VarE.g0(false);
                p1Var = (p1) objK;
                o0VarE.L(-492369756);
                objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                o0VarE.g0(false);
                p1Var2 = (p1) objQ;
                Unit unit1111111113 = Unit.INSTANCE;
                objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                o0VarE.L(-568225417);
                zB = false;
                while (i30 < 4) {
                    zB |= o0VarE.B(objArr[i30]);
                }
                objQ2 = o0VarE.q();
                if (zB) {
                    boolean z2111111111111114 = z16;
                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111111111114, p1Var2, null);
                    z19 = z2111111111111114;
                    p1Var3 = p1Var2;
                    o0VarE.K(objQ2);
                } else {
                    boolean z2111111111111115 = z16;
                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111111111115, p1Var2, null);
                    z19 = z2111111111111115;
                    p1Var3 = p1Var2;
                    o0VarE.K(objQ2);
                }
                o0VarE.g0(false);
                l0.e((p) objQ2, unit1111111113, o0VarE);
                boolean zCompass$lambda$111110 = Compass$lambda$4(p1Var3);
                v1 v1VarD11117 = u0.d(s1.l.d(500, 0, null, 6), 2);
                boolean z2111111111111116 = z19;
                r1.x1 x1VarE11117 = u0.e(s1.l.d(500, 500, null, 4), 2);
                o0VarE.L(1868333135);
                h4.r rVarG11117 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                Unit unit1111111114 = Unit.INSTANCE;
                Boolean boolValueOf11117 = Boolean.valueOf(z18);
                o0VarE.L(511388516);
                zB2 = o0VarE.B(boolValueOf11117) | o0VarE.B(this);
                objQ3 = o0VarE.q();
                if (zB2) {
                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                    o0VarE.K(objQ3);
                }
                o0VarE.g0(false);
                q qVar11117 = s0.f15885a;
                h4.r rVarThen11117 = rVarG11117.then(new r0(unit1111111114, null, null, new s0.a((p) objQ3), 6, null));
                o0VarE.g0(false);
                r1.c0.e(zCompass$lambda$111110, rVarThen11117, v1VarD11117, x1VarE11117, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                x1 x1Var1111111114 = n.f135158a;
                h2 h2Var111110 = h2VarA;
                pVar2 = pVarM213getLambda1$extension_compose_release;
                h2Var2 = h2Var111110;
                z24 = z2111111111111116;
                z25 = z18;
                dVar4 = dVar3;
                rVar4 = rVar3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 == null) {
                return;
            }
            p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
        }
        i16 |= 384;
        dVar2 = dVar;
        i19 = i15 & 8;
        if (i19 != 0) {
            if ((i14 & 7168) == 0) {
                z16 = z14;
                if (o0VarE.h(z16)) {
                    i24 = 2048;
                } else {
                    i24 = 1024;
                }
                i16 |= i24;
            }
            i25 = i15 & 16;
            if (i25 != 0) {
                if ((57344 & i14) == 0) {
                    z17 = z15;
                    if (o0VarE.h(z17)) {
                        i26 = 16384;
                    } else {
                        i26 = 8192;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 32;
                if (i27 != 0) {
                    i16 |= 196608;
                    pVarM213getLambda1$extension_compose_release = pVar;
                } else {
                    pVarM213getLambda1$extension_compose_release = pVar;
                    if ((i14 & 458752) == 0) {
                        if (o0VarE.B(pVarM213getLambda1$extension_compose_release)) {
                            i28 = 131072;
                        } else {
                            i28 = 65536;
                        }
                        i16 |= i28;
                    }
                }
                if ((i15 & 64) != 0) {
                    if ((i14 & 3670016) == 0) {
                        if (o0VarE.B(this)) {
                            i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i29 = 524288;
                        }
                    }
                    if ((i16 & 2995931) == 599186) {
                        if (i34 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i35 != 0) {
                            f.a aVar11118 = f.f75994b;
                            h2VarA = l.a(4);
                        }
                        if (i17 != 0) {
                            h4.d.f81522a.getClass();
                            dVar3 = h4.d.a.f81526d;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                        }
                        x1 x1Var1111111115 = n.f135158a;
                        objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                        c2565a = m.a.f135155b;
                        if (objK == c2565a) {
                            objK = p0.n(Float.valueOf(0.0f));
                            o0VarE.K(objK);
                        }
                        o0VarE.g0(false);
                        p1Var = (p1) objK;
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        if (objQ == c2565a) {
                            objQ = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        p1Var2 = (p1) objQ;
                        Unit unit1111111115 = Unit.INSTANCE;
                        objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                        o0VarE.L(-568225417);
                        zB = false;
                        while (i30 < 4) {
                            zB |= o0VarE.B(objArr[i30]);
                        }
                        objQ2 = o0VarE.q();
                        if (zB) {
                            boolean z2111111111111117 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111111111117, p1Var2, null);
                            z19 = z2111111111111117;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        } else {
                            boolean z2111111111111118 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111111111118, p1Var2, null);
                            z19 = z2111111111111118;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        }
                        o0VarE.g0(false);
                        l0.e((p) objQ2, unit1111111115, o0VarE);
                        boolean zCompass$lambda$111111 = Compass$lambda$4(p1Var3);
                        v1 v1VarD11118 = u0.d(s1.l.d(500, 0, null, 6), 2);
                        boolean z2111111111111119 = z19;
                        r1.x1 x1VarE11118 = u0.e(s1.l.d(500, 500, null, 4), 2);
                        o0VarE.L(1868333135);
                        h4.r rVarG11118 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                        Unit unit1111111116 = Unit.INSTANCE;
                        Boolean boolValueOf11118 = Boolean.valueOf(z18);
                        o0VarE.L(511388516);
                        zB2 = o0VarE.B(boolValueOf11118) | o0VarE.B(this);
                        objQ3 = o0VarE.q();
                        if (zB2) {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        }
                        o0VarE.g0(false);
                        q qVar11118 = s0.f15885a;
                        h4.r rVarThen11118 = rVarG11118.then(new r0(unit1111111116, null, null, new s0.a((p) objQ3), 6, null));
                        o0VarE.g0(false);
                        r1.c0.e(zCompass$lambda$111111, rVarThen11118, v1VarD11118, x1VarE11118, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                        x1 x1Var1111111116 = n.f135158a;
                        h2 h2Var111111 = h2VarA;
                        pVar2 = pVarM213getLambda1$extension_compose_release;
                        h2Var2 = h2Var111111;
                        z24 = z2111111111111119;
                        z25 = z18;
                        dVar4 = dVar3;
                        rVar4 = rVar3;
                    } else {
                        if (i34 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i35 != 0) {
                            f.a aVar11119 = f.f75994b;
                            h2VarA = l.a(4);
                        }
                        if (i17 != 0) {
                            h4.d.f81522a.getClass();
                            dVar3 = h4.d.a.f81526d;
                        } else {
                            dVar3 = dVar2;
                        }
                        if (i19 != 0) {
                            z16 = true;
                        }
                        if (i25 == 0) {
                        }
                        if (i27 != 0) {
                            pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                        }
                        x1 x1Var1111111117 = n.f135158a;
                        objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                        c2565a = m.a.f135155b;
                        if (objK == c2565a) {
                            objK = p0.n(Float.valueOf(0.0f));
                            o0VarE.K(objK);
                        }
                        o0VarE.g0(false);
                        p1Var = (p1) objK;
                        o0VarE.L(-492369756);
                        objQ = o0VarE.q();
                        if (objQ == c2565a) {
                            objQ = p0.n(Boolean.FALSE);
                            o0VarE.K(objQ);
                        }
                        o0VarE.g0(false);
                        p1Var2 = (p1) objQ;
                        Unit unit1111111117 = Unit.INSTANCE;
                        objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                        o0VarE.L(-568225417);
                        zB = false;
                        while (i30 < 4) {
                            zB |= o0VarE.B(objArr[i30]);
                        }
                        objQ2 = o0VarE.q();
                        if (zB) {
                            boolean z21111111111111110 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111111110, p1Var2, null);
                            z19 = z21111111111111110;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        } else {
                            boolean z21111111111111111 = z16;
                            objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111111111, p1Var2, null);
                            z19 = z21111111111111111;
                            p1Var3 = p1Var2;
                            o0VarE.K(objQ2);
                        }
                        o0VarE.g0(false);
                        l0.e((p) objQ2, unit1111111117, o0VarE);
                        boolean zCompass$lambda$111112 = Compass$lambda$4(p1Var3);
                        v1 v1VarD11119 = u0.d(s1.l.d(500, 0, null, 6), 2);
                        boolean z21111111111111112 = z19;
                        r1.x1 x1VarE11119 = u0.e(s1.l.d(500, 500, null, 4), 2);
                        o0VarE.L(1868333135);
                        h4.r rVarG11119 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                        Unit unit1111111118 = Unit.INSTANCE;
                        Boolean boolValueOf11119 = Boolean.valueOf(z18);
                        o0VarE.L(511388516);
                        zB2 = o0VarE.B(boolValueOf11119) | o0VarE.B(this);
                        objQ3 = o0VarE.q();
                        if (zB2) {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                            o0VarE.K(objQ3);
                        }
                        o0VarE.g0(false);
                        q qVar11119 = s0.f15885a;
                        h4.r rVarThen11119 = rVarG11119.then(new r0(unit1111111118, null, null, new s0.a((p) objQ3), 6, null));
                        o0VarE.g0(false);
                        r1.c0.e(zCompass$lambda$111112, rVarThen11119, v1VarD11119, x1VarE11119, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                        x1 x1Var1111111118 = n.f135158a;
                        h2 h2Var111112 = h2VarA;
                        pVar2 = pVarM213getLambda1$extension_compose_release;
                        h2Var2 = h2Var111112;
                        z24 = z21111111111111112;
                        z25 = z18;
                        dVar4 = dVar3;
                        rVar4 = rVar3;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
                }
                i29 = 1572864;
                i16 |= i29;
                if ((i16 & 2995931) == 599186) {
                    if (i34 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i35 != 0) {
                        f.a aVar111110 = f.f75994b;
                        h2VarA = l.a(4);
                    }
                    if (i17 != 0) {
                        h4.d.f81522a.getClass();
                        dVar3 = h4.d.a.f81526d;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                    }
                    x1 x1Var1111111119 = n.f135158a;
                    objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = p0.n(Float.valueOf(0.0f));
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    p1Var = (p1) objK;
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    p1Var2 = (p1) objQ;
                    Unit unit1111111119 = Unit.INSTANCE;
                    objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                    o0VarE.L(-568225417);
                    zB = false;
                    while (i30 < 4) {
                        zB |= o0VarE.B(objArr[i30]);
                    }
                    objQ2 = o0VarE.q();
                    if (zB) {
                        boolean z21111111111111113 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111111113, p1Var2, null);
                        z19 = z21111111111111113;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    } else {
                        boolean z21111111111111114 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111111114, p1Var2, null);
                        z19 = z21111111111111114;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    }
                    o0VarE.g0(false);
                    l0.e((p) objQ2, unit1111111119, o0VarE);
                    boolean zCompass$lambda$111113 = Compass$lambda$4(p1Var3);
                    v1 v1VarD111110 = u0.d(s1.l.d(500, 0, null, 6), 2);
                    boolean z21111111111111115 = z19;
                    r1.x1 x1VarE111110 = u0.e(s1.l.d(500, 500, null, 4), 2);
                    o0VarE.L(1868333135);
                    h4.r rVarG111110 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                    Unit unit11111111110 = Unit.INSTANCE;
                    Boolean boolValueOf111110 = Boolean.valueOf(z18);
                    o0VarE.L(511388516);
                    zB2 = o0VarE.B(boolValueOf111110) | o0VarE.B(this);
                    objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    }
                    o0VarE.g0(false);
                    q qVar111110 = s0.f15885a;
                    h4.r rVarThen111110 = rVarG111110.then(new r0(unit11111111110, null, null, new s0.a((p) objQ3), 6, null));
                    o0VarE.g0(false);
                    r1.c0.e(zCompass$lambda$111113, rVarThen111110, v1VarD111110, x1VarE111110, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                    x1 x1Var11111111110 = n.f135158a;
                    h2 h2Var111113 = h2VarA;
                    pVar2 = pVarM213getLambda1$extension_compose_release;
                    h2Var2 = h2Var111113;
                    z24 = z21111111111111115;
                    z25 = z18;
                    dVar4 = dVar3;
                    rVar4 = rVar3;
                } else {
                    if (i34 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i35 != 0) {
                        f.a aVar111111 = f.f75994b;
                        h2VarA = l.a(4);
                    }
                    if (i17 != 0) {
                        h4.d.f81522a.getClass();
                        dVar3 = h4.d.a.f81526d;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                    }
                    x1 x1Var11111111111 = n.f135158a;
                    objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = p0.n(Float.valueOf(0.0f));
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    p1Var = (p1) objK;
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    p1Var2 = (p1) objQ;
                    Unit unit11111111111 = Unit.INSTANCE;
                    objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                    o0VarE.L(-568225417);
                    zB = false;
                    while (i30 < 4) {
                        zB |= o0VarE.B(objArr[i30]);
                    }
                    objQ2 = o0VarE.q();
                    if (zB) {
                        boolean z21111111111111116 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111111116, p1Var2, null);
                        z19 = z21111111111111116;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    } else {
                        boolean z21111111111111117 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111111117, p1Var2, null);
                        z19 = z21111111111111117;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    }
                    o0VarE.g0(false);
                    l0.e((p) objQ2, unit11111111111, o0VarE);
                    boolean zCompass$lambda$111114 = Compass$lambda$4(p1Var3);
                    v1 v1VarD111111 = u0.d(s1.l.d(500, 0, null, 6), 2);
                    boolean z21111111111111118 = z19;
                    r1.x1 x1VarE111111 = u0.e(s1.l.d(500, 500, null, 4), 2);
                    o0VarE.L(1868333135);
                    h4.r rVarG111111 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                    Unit unit11111111112 = Unit.INSTANCE;
                    Boolean boolValueOf111111 = Boolean.valueOf(z18);
                    o0VarE.L(511388516);
                    zB2 = o0VarE.B(boolValueOf111111) | o0VarE.B(this);
                    objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    }
                    o0VarE.g0(false);
                    q qVar111111 = s0.f15885a;
                    h4.r rVarThen111111 = rVarG111111.then(new r0(unit11111111112, null, null, new s0.a((p) objQ3), 6, null));
                    o0VarE.g0(false);
                    r1.c0.e(zCompass$lambda$111114, rVarThen111111, v1VarD111111, x1VarE111111, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                    x1 x1Var11111111112 = n.f135158a;
                    h2 h2Var111114 = h2VarA;
                    pVar2 = pVarM213getLambda1$extension_compose_release;
                    h2Var2 = h2Var111114;
                    z24 = z21111111111111118;
                    z25 = z18;
                    dVar4 = dVar3;
                    rVar4 = rVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
            }
            i16 |= 24576;
            z17 = z15;
            i27 = i15 & 32;
            if (i27 != 0) {
                i16 |= 196608;
                pVarM213getLambda1$extension_compose_release = pVar;
            } else {
                pVarM213getLambda1$extension_compose_release = pVar;
                if ((i14 & 458752) == 0) {
                    if (o0VarE.B(pVarM213getLambda1$extension_compose_release)) {
                        i28 = 131072;
                    } else {
                        i28 = 65536;
                    }
                    i16 |= i28;
                }
            }
            if ((i15 & 64) != 0) {
                if ((i14 & 3670016) == 0) {
                    if (o0VarE.B(this)) {
                        i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i29 = 524288;
                    }
                }
                if ((i16 & 2995931) == 599186) {
                    if (i34 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i35 != 0) {
                        f.a aVar111112 = f.f75994b;
                        h2VarA = l.a(4);
                    }
                    if (i17 != 0) {
                        h4.d.f81522a.getClass();
                        dVar3 = h4.d.a.f81526d;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                    }
                    x1 x1Var11111111113 = n.f135158a;
                    objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = p0.n(Float.valueOf(0.0f));
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    p1Var = (p1) objK;
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    p1Var2 = (p1) objQ;
                    Unit unit11111111113 = Unit.INSTANCE;
                    objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                    o0VarE.L(-568225417);
                    zB = false;
                    while (i30 < 4) {
                        zB |= o0VarE.B(objArr[i30]);
                    }
                    objQ2 = o0VarE.q();
                    if (zB) {
                        boolean z21111111111111119 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111111119, p1Var2, null);
                        z19 = z21111111111111119;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    } else {
                        boolean z211111111111111110 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111111111110, p1Var2, null);
                        z19 = z211111111111111110;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    }
                    o0VarE.g0(false);
                    l0.e((p) objQ2, unit11111111113, o0VarE);
                    boolean zCompass$lambda$111115 = Compass$lambda$4(p1Var3);
                    v1 v1VarD111112 = u0.d(s1.l.d(500, 0, null, 6), 2);
                    boolean z211111111111111111 = z19;
                    r1.x1 x1VarE111112 = u0.e(s1.l.d(500, 500, null, 4), 2);
                    o0VarE.L(1868333135);
                    h4.r rVarG111112 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                    Unit unit11111111114 = Unit.INSTANCE;
                    Boolean boolValueOf111112 = Boolean.valueOf(z18);
                    o0VarE.L(511388516);
                    zB2 = o0VarE.B(boolValueOf111112) | o0VarE.B(this);
                    objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    }
                    o0VarE.g0(false);
                    q qVar111112 = s0.f15885a;
                    h4.r rVarThen111112 = rVarG111112.then(new r0(unit11111111114, null, null, new s0.a((p) objQ3), 6, null));
                    o0VarE.g0(false);
                    r1.c0.e(zCompass$lambda$111115, rVarThen111112, v1VarD111112, x1VarE111112, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                    x1 x1Var11111111114 = n.f135158a;
                    h2 h2Var111115 = h2VarA;
                    pVar2 = pVarM213getLambda1$extension_compose_release;
                    h2Var2 = h2Var111115;
                    z24 = z211111111111111111;
                    z25 = z18;
                    dVar4 = dVar3;
                    rVar4 = rVar3;
                } else {
                    if (i34 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i35 != 0) {
                        f.a aVar111113 = f.f75994b;
                        h2VarA = l.a(4);
                    }
                    if (i17 != 0) {
                        h4.d.f81522a.getClass();
                        dVar3 = h4.d.a.f81526d;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                    }
                    x1 x1Var11111111115 = n.f135158a;
                    objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = p0.n(Float.valueOf(0.0f));
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    p1Var = (p1) objK;
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    p1Var2 = (p1) objQ;
                    Unit unit11111111115 = Unit.INSTANCE;
                    objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                    o0VarE.L(-568225417);
                    zB = false;
                    while (i30 < 4) {
                        zB |= o0VarE.B(objArr[i30]);
                    }
                    objQ2 = o0VarE.q();
                    if (zB) {
                        boolean z211111111111111112 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111111111112, p1Var2, null);
                        z19 = z211111111111111112;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    } else {
                        boolean z211111111111111113 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111111111113, p1Var2, null);
                        z19 = z211111111111111113;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    }
                    o0VarE.g0(false);
                    l0.e((p) objQ2, unit11111111115, o0VarE);
                    boolean zCompass$lambda$111116 = Compass$lambda$4(p1Var3);
                    v1 v1VarD111113 = u0.d(s1.l.d(500, 0, null, 6), 2);
                    boolean z211111111111111114 = z19;
                    r1.x1 x1VarE111113 = u0.e(s1.l.d(500, 500, null, 4), 2);
                    o0VarE.L(1868333135);
                    h4.r rVarG111113 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                    Unit unit11111111116 = Unit.INSTANCE;
                    Boolean boolValueOf111113 = Boolean.valueOf(z18);
                    o0VarE.L(511388516);
                    zB2 = o0VarE.B(boolValueOf111113) | o0VarE.B(this);
                    objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    }
                    o0VarE.g0(false);
                    q qVar111113 = s0.f15885a;
                    h4.r rVarThen111113 = rVarG111113.then(new r0(unit11111111116, null, null, new s0.a((p) objQ3), 6, null));
                    o0VarE.g0(false);
                    r1.c0.e(zCompass$lambda$111116, rVarThen111113, v1VarD111113, x1VarE111113, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                    x1 x1Var11111111116 = n.f135158a;
                    h2 h2Var111116 = h2VarA;
                    pVar2 = pVarM213getLambda1$extension_compose_release;
                    h2Var2 = h2Var111116;
                    z24 = z211111111111111114;
                    z25 = z18;
                    dVar4 = dVar3;
                    rVar4 = rVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
            }
            i29 = 1572864;
            i16 |= i29;
            if ((i16 & 2995931) == 599186) {
                if (i34 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i35 != 0) {
                    f.a aVar111114 = f.f75994b;
                    h2VarA = l.a(4);
                }
                if (i17 != 0) {
                    h4.d.f81522a.getClass();
                    dVar3 = h4.d.a.f81526d;
                } else {
                    dVar3 = dVar2;
                }
                if (i19 != 0) {
                    z16 = true;
                }
                if (i25 == 0) {
                }
                if (i27 != 0) {
                    pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                }
                x1 x1Var11111111117 = n.f135158a;
                objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                c2565a = m.a.f135155b;
                if (objK == c2565a) {
                    objK = p0.n(Float.valueOf(0.0f));
                    o0VarE.K(objK);
                }
                o0VarE.g0(false);
                p1Var = (p1) objK;
                o0VarE.L(-492369756);
                objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                o0VarE.g0(false);
                p1Var2 = (p1) objQ;
                Unit unit11111111117 = Unit.INSTANCE;
                objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                o0VarE.L(-568225417);
                zB = false;
                while (i30 < 4) {
                    zB |= o0VarE.B(objArr[i30]);
                }
                objQ2 = o0VarE.q();
                if (zB) {
                    boolean z211111111111111115 = z16;
                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111111111115, p1Var2, null);
                    z19 = z211111111111111115;
                    p1Var3 = p1Var2;
                    o0VarE.K(objQ2);
                } else {
                    boolean z211111111111111116 = z16;
                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111111111116, p1Var2, null);
                    z19 = z211111111111111116;
                    p1Var3 = p1Var2;
                    o0VarE.K(objQ2);
                }
                o0VarE.g0(false);
                l0.e((p) objQ2, unit11111111117, o0VarE);
                boolean zCompass$lambda$111117 = Compass$lambda$4(p1Var3);
                v1 v1VarD111114 = u0.d(s1.l.d(500, 0, null, 6), 2);
                boolean z211111111111111117 = z19;
                r1.x1 x1VarE111114 = u0.e(s1.l.d(500, 500, null, 4), 2);
                o0VarE.L(1868333135);
                h4.r rVarG111114 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                Unit unit11111111118 = Unit.INSTANCE;
                Boolean boolValueOf111114 = Boolean.valueOf(z18);
                o0VarE.L(511388516);
                zB2 = o0VarE.B(boolValueOf111114) | o0VarE.B(this);
                objQ3 = o0VarE.q();
                if (zB2) {
                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                    o0VarE.K(objQ3);
                }
                o0VarE.g0(false);
                q qVar111114 = s0.f15885a;
                h4.r rVarThen111114 = rVarG111114.then(new r0(unit11111111118, null, null, new s0.a((p) objQ3), 6, null));
                o0VarE.g0(false);
                r1.c0.e(zCompass$lambda$111117, rVarThen111114, v1VarD111114, x1VarE111114, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                x1 x1Var11111111118 = n.f135158a;
                h2 h2Var111117 = h2VarA;
                pVar2 = pVarM213getLambda1$extension_compose_release;
                h2Var2 = h2Var111117;
                z24 = z211111111111111117;
                z25 = z18;
                dVar4 = dVar3;
                rVar4 = rVar3;
            } else {
                if (i34 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i35 != 0) {
                    f.a aVar111115 = f.f75994b;
                    h2VarA = l.a(4);
                }
                if (i17 != 0) {
                    h4.d.f81522a.getClass();
                    dVar3 = h4.d.a.f81526d;
                } else {
                    dVar3 = dVar2;
                }
                if (i19 != 0) {
                    z16 = true;
                }
                if (i25 == 0) {
                }
                if (i27 != 0) {
                    pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                }
                x1 x1Var11111111119 = n.f135158a;
                objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                c2565a = m.a.f135155b;
                if (objK == c2565a) {
                    objK = p0.n(Float.valueOf(0.0f));
                    o0VarE.K(objK);
                }
                o0VarE.g0(false);
                p1Var = (p1) objK;
                o0VarE.L(-492369756);
                objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                o0VarE.g0(false);
                p1Var2 = (p1) objQ;
                Unit unit11111111119 = Unit.INSTANCE;
                objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                o0VarE.L(-568225417);
                zB = false;
                while (i30 < 4) {
                    zB |= o0VarE.B(objArr[i30]);
                }
                objQ2 = o0VarE.q();
                if (zB) {
                    boolean z211111111111111118 = z16;
                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111111111118, p1Var2, null);
                    z19 = z211111111111111118;
                    p1Var3 = p1Var2;
                    o0VarE.K(objQ2);
                } else {
                    boolean z211111111111111119 = z16;
                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111111111119, p1Var2, null);
                    z19 = z211111111111111119;
                    p1Var3 = p1Var2;
                    o0VarE.K(objQ2);
                }
                o0VarE.g0(false);
                l0.e((p) objQ2, unit11111111119, o0VarE);
                boolean zCompass$lambda$111118 = Compass$lambda$4(p1Var3);
                v1 v1VarD111115 = u0.d(s1.l.d(500, 0, null, 6), 2);
                boolean z2111111111111111110 = z19;
                r1.x1 x1VarE111115 = u0.e(s1.l.d(500, 500, null, 4), 2);
                o0VarE.L(1868333135);
                h4.r rVarG111115 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                Unit unit111111111110 = Unit.INSTANCE;
                Boolean boolValueOf111115 = Boolean.valueOf(z18);
                o0VarE.L(511388516);
                zB2 = o0VarE.B(boolValueOf111115) | o0VarE.B(this);
                objQ3 = o0VarE.q();
                if (zB2) {
                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                    o0VarE.K(objQ3);
                }
                o0VarE.g0(false);
                q qVar111115 = s0.f15885a;
                h4.r rVarThen111115 = rVarG111115.then(new r0(unit111111111110, null, null, new s0.a((p) objQ3), 6, null));
                o0VarE.g0(false);
                r1.c0.e(zCompass$lambda$111118, rVarThen111115, v1VarD111115, x1VarE111115, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                x1 x1Var111111111110 = n.f135158a;
                h2 h2Var111118 = h2VarA;
                pVar2 = pVarM213getLambda1$extension_compose_release;
                h2Var2 = h2Var111118;
                z24 = z2111111111111111110;
                z25 = z18;
                dVar4 = dVar3;
                rVar4 = rVar3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 == null) {
                return;
            }
            p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
        }
        i16 |= 3072;
        z16 = z14;
        i25 = i15 & 16;
        if (i25 != 0) {
            if ((57344 & i14) == 0) {
                z17 = z15;
                if (o0VarE.h(z17)) {
                    i26 = 16384;
                } else {
                    i26 = 8192;
                }
                i16 |= i26;
            }
            i27 = i15 & 32;
            if (i27 != 0) {
                i16 |= 196608;
                pVarM213getLambda1$extension_compose_release = pVar;
            } else {
                pVarM213getLambda1$extension_compose_release = pVar;
                if ((i14 & 458752) == 0) {
                    if (o0VarE.B(pVarM213getLambda1$extension_compose_release)) {
                        i28 = 131072;
                    } else {
                        i28 = 65536;
                    }
                    i16 |= i28;
                }
            }
            if ((i15 & 64) != 0) {
                if ((i14 & 3670016) == 0) {
                    if (o0VarE.B(this)) {
                        i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i29 = 524288;
                    }
                }
                if ((i16 & 2995931) == 599186) {
                    if (i34 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i35 != 0) {
                        f.a aVar111116 = f.f75994b;
                        h2VarA = l.a(4);
                    }
                    if (i17 != 0) {
                        h4.d.f81522a.getClass();
                        dVar3 = h4.d.a.f81526d;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                    }
                    x1 x1Var111111111111 = n.f135158a;
                    objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = p0.n(Float.valueOf(0.0f));
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    p1Var = (p1) objK;
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    p1Var2 = (p1) objQ;
                    Unit unit111111111111 = Unit.INSTANCE;
                    objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                    o0VarE.L(-568225417);
                    zB = false;
                    while (i30 < 4) {
                        zB |= o0VarE.B(objArr[i30]);
                    }
                    objQ2 = o0VarE.q();
                    if (zB) {
                        boolean z2111111111111111111 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111111111111111, p1Var2, null);
                        z19 = z2111111111111111111;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    } else {
                        boolean z2111111111111111112 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111111111111112, p1Var2, null);
                        z19 = z2111111111111111112;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    }
                    o0VarE.g0(false);
                    l0.e((p) objQ2, unit111111111111, o0VarE);
                    boolean zCompass$lambda$111119 = Compass$lambda$4(p1Var3);
                    v1 v1VarD111116 = u0.d(s1.l.d(500, 0, null, 6), 2);
                    boolean z2111111111111111113 = z19;
                    r1.x1 x1VarE111116 = u0.e(s1.l.d(500, 500, null, 4), 2);
                    o0VarE.L(1868333135);
                    h4.r rVarG111116 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                    Unit unit111111111112 = Unit.INSTANCE;
                    Boolean boolValueOf111116 = Boolean.valueOf(z18);
                    o0VarE.L(511388516);
                    zB2 = o0VarE.B(boolValueOf111116) | o0VarE.B(this);
                    objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    }
                    o0VarE.g0(false);
                    q qVar111116 = s0.f15885a;
                    h4.r rVarThen111116 = rVarG111116.then(new r0(unit111111111112, null, null, new s0.a((p) objQ3), 6, null));
                    o0VarE.g0(false);
                    r1.c0.e(zCompass$lambda$111119, rVarThen111116, v1VarD111116, x1VarE111116, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                    x1 x1Var111111111112 = n.f135158a;
                    h2 h2Var111119 = h2VarA;
                    pVar2 = pVarM213getLambda1$extension_compose_release;
                    h2Var2 = h2Var111119;
                    z24 = z2111111111111111113;
                    z25 = z18;
                    dVar4 = dVar3;
                    rVar4 = rVar3;
                } else {
                    if (i34 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i35 != 0) {
                        f.a aVar111117 = f.f75994b;
                        h2VarA = l.a(4);
                    }
                    if (i17 != 0) {
                        h4.d.f81522a.getClass();
                        dVar3 = h4.d.a.f81526d;
                    } else {
                        dVar3 = dVar2;
                    }
                    if (i19 != 0) {
                        z16 = true;
                    }
                    if (i25 == 0) {
                    }
                    if (i27 != 0) {
                        pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                    }
                    x1 x1Var111111111113 = n.f135158a;
                    objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                    c2565a = m.a.f135155b;
                    if (objK == c2565a) {
                        objK = p0.n(Float.valueOf(0.0f));
                        o0VarE.K(objK);
                    }
                    o0VarE.g0(false);
                    p1Var = (p1) objK;
                    o0VarE.L(-492369756);
                    objQ = o0VarE.q();
                    if (objQ == c2565a) {
                        objQ = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ);
                    }
                    o0VarE.g0(false);
                    p1Var2 = (p1) objQ;
                    Unit unit111111111113 = Unit.INSTANCE;
                    objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                    o0VarE.L(-568225417);
                    zB = false;
                    while (i30 < 4) {
                        zB |= o0VarE.B(objArr[i30]);
                    }
                    objQ2 = o0VarE.q();
                    if (zB) {
                        boolean z2111111111111111114 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111111111111114, p1Var2, null);
                        z19 = z2111111111111111114;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    } else {
                        boolean z2111111111111111115 = z16;
                        objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111111111111115, p1Var2, null);
                        z19 = z2111111111111111115;
                        p1Var3 = p1Var2;
                        o0VarE.K(objQ2);
                    }
                    o0VarE.g0(false);
                    l0.e((p) objQ2, unit111111111113, o0VarE);
                    boolean zCompass$lambda$1111110 = Compass$lambda$4(p1Var3);
                    v1 v1VarD111117 = u0.d(s1.l.d(500, 0, null, 6), 2);
                    boolean z2111111111111111116 = z19;
                    r1.x1 x1VarE111117 = u0.e(s1.l.d(500, 500, null, 4), 2);
                    o0VarE.L(1868333135);
                    h4.r rVarG111117 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                    Unit unit111111111114 = Unit.INSTANCE;
                    Boolean boolValueOf111117 = Boolean.valueOf(z18);
                    o0VarE.L(511388516);
                    zB2 = o0VarE.B(boolValueOf111117) | o0VarE.B(this);
                    objQ3 = o0VarE.q();
                    if (zB2) {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                        o0VarE.K(objQ3);
                    }
                    o0VarE.g0(false);
                    q qVar111117 = s0.f15885a;
                    h4.r rVarThen111117 = rVarG111117.then(new r0(unit111111111114, null, null, new s0.a((p) objQ3), 6, null));
                    o0VarE.g0(false);
                    r1.c0.e(zCompass$lambda$1111110, rVarThen111117, v1VarD111117, x1VarE111117, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                    x1 x1Var111111111114 = n.f135158a;
                    h2 h2Var1111110 = h2VarA;
                    pVar2 = pVarM213getLambda1$extension_compose_release;
                    h2Var2 = h2Var1111110;
                    z24 = z2111111111111111116;
                    z25 = z18;
                    dVar4 = dVar3;
                    rVar4 = rVar3;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
            }
            i29 = 1572864;
            i16 |= i29;
            if ((i16 & 2995931) == 599186) {
                if (i34 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i35 != 0) {
                    f.a aVar111118 = f.f75994b;
                    h2VarA = l.a(4);
                }
                if (i17 != 0) {
                    h4.d.f81522a.getClass();
                    dVar3 = h4.d.a.f81526d;
                } else {
                    dVar3 = dVar2;
                }
                if (i19 != 0) {
                    z16 = true;
                }
                if (i25 == 0) {
                }
                if (i27 != 0) {
                    pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                }
                x1 x1Var111111111115 = n.f135158a;
                objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                c2565a = m.a.f135155b;
                if (objK == c2565a) {
                    objK = p0.n(Float.valueOf(0.0f));
                    o0VarE.K(objK);
                }
                o0VarE.g0(false);
                p1Var = (p1) objK;
                o0VarE.L(-492369756);
                objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                o0VarE.g0(false);
                p1Var2 = (p1) objQ;
                Unit unit111111111115 = Unit.INSTANCE;
                objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                o0VarE.L(-568225417);
                zB = false;
                while (i30 < 4) {
                    zB |= o0VarE.B(objArr[i30]);
                }
                objQ2 = o0VarE.q();
                if (zB) {
                    boolean z2111111111111111117 = z16;
                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111111111111117, p1Var2, null);
                    z19 = z2111111111111111117;
                    p1Var3 = p1Var2;
                    o0VarE.K(objQ2);
                } else {
                    boolean z2111111111111111118 = z16;
                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z2111111111111111118, p1Var2, null);
                    z19 = z2111111111111111118;
                    p1Var3 = p1Var2;
                    o0VarE.K(objQ2);
                }
                o0VarE.g0(false);
                l0.e((p) objQ2, unit111111111115, o0VarE);
                boolean zCompass$lambda$1111111 = Compass$lambda$4(p1Var3);
                v1 v1VarD111118 = u0.d(s1.l.d(500, 0, null, 6), 2);
                boolean z2111111111111111119 = z19;
                r1.x1 x1VarE111118 = u0.e(s1.l.d(500, 500, null, 4), 2);
                o0VarE.L(1868333135);
                h4.r rVarG111118 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                Unit unit111111111116 = Unit.INSTANCE;
                Boolean boolValueOf111118 = Boolean.valueOf(z18);
                o0VarE.L(511388516);
                zB2 = o0VarE.B(boolValueOf111118) | o0VarE.B(this);
                objQ3 = o0VarE.q();
                if (zB2) {
                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                    o0VarE.K(objQ3);
                }
                o0VarE.g0(false);
                q qVar111118 = s0.f15885a;
                h4.r rVarThen111118 = rVarG111118.then(new r0(unit111111111116, null, null, new s0.a((p) objQ3), 6, null));
                o0VarE.g0(false);
                r1.c0.e(zCompass$lambda$1111111, rVarThen111118, v1VarD111118, x1VarE111118, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                x1 x1Var111111111116 = n.f135158a;
                h2 h2Var1111111 = h2VarA;
                pVar2 = pVarM213getLambda1$extension_compose_release;
                h2Var2 = h2Var1111111;
                z24 = z2111111111111111119;
                z25 = z18;
                dVar4 = dVar3;
                rVar4 = rVar3;
            } else {
                if (i34 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i35 != 0) {
                    f.a aVar111119 = f.f75994b;
                    h2VarA = l.a(4);
                }
                if (i17 != 0) {
                    h4.d.f81522a.getClass();
                    dVar3 = h4.d.a.f81526d;
                } else {
                    dVar3 = dVar2;
                }
                if (i19 != 0) {
                    z16 = true;
                }
                if (i25 == 0) {
                }
                if (i27 != 0) {
                    pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                }
                x1 x1Var111111111117 = n.f135158a;
                objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                c2565a = m.a.f135155b;
                if (objK == c2565a) {
                    objK = p0.n(Float.valueOf(0.0f));
                    o0VarE.K(objK);
                }
                o0VarE.g0(false);
                p1Var = (p1) objK;
                o0VarE.L(-492369756);
                objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                o0VarE.g0(false);
                p1Var2 = (p1) objQ;
                Unit unit111111111117 = Unit.INSTANCE;
                objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                o0VarE.L(-568225417);
                zB = false;
                while (i30 < 4) {
                    zB |= o0VarE.B(objArr[i30]);
                }
                objQ2 = o0VarE.q();
                if (zB) {
                    boolean z21111111111111111110 = z16;
                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111111111110, p1Var2, null);
                    z19 = z21111111111111111110;
                    p1Var3 = p1Var2;
                    o0VarE.K(objQ2);
                } else {
                    boolean z21111111111111111111 = z16;
                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111111111111, p1Var2, null);
                    z19 = z21111111111111111111;
                    p1Var3 = p1Var2;
                    o0VarE.K(objQ2);
                }
                o0VarE.g0(false);
                l0.e((p) objQ2, unit111111111117, o0VarE);
                boolean zCompass$lambda$1111112 = Compass$lambda$4(p1Var3);
                v1 v1VarD111119 = u0.d(s1.l.d(500, 0, null, 6), 2);
                boolean z21111111111111111112 = z19;
                r1.x1 x1VarE111119 = u0.e(s1.l.d(500, 500, null, 4), 2);
                o0VarE.L(1868333135);
                h4.r rVarG111119 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                Unit unit111111111118 = Unit.INSTANCE;
                Boolean boolValueOf111119 = Boolean.valueOf(z18);
                o0VarE.L(511388516);
                zB2 = o0VarE.B(boolValueOf111119) | o0VarE.B(this);
                objQ3 = o0VarE.q();
                if (zB2) {
                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                    o0VarE.K(objQ3);
                }
                o0VarE.g0(false);
                q qVar111119 = s0.f15885a;
                h4.r rVarThen111119 = rVarG111119.then(new r0(unit111111111118, null, null, new s0.a((p) objQ3), 6, null));
                o0VarE.g0(false);
                r1.c0.e(zCompass$lambda$1111112, rVarThen111119, v1VarD111119, x1VarE111119, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                x1 x1Var111111111118 = n.f135158a;
                h2 h2Var1111112 = h2VarA;
                pVar2 = pVarM213getLambda1$extension_compose_release;
                h2Var2 = h2Var1111112;
                z24 = z21111111111111111112;
                z25 = z18;
                dVar4 = dVar3;
                rVar4 = rVar3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 == null) {
                return;
            }
            p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
        }
        i16 |= 24576;
        z17 = z15;
        i27 = i15 & 32;
        if (i27 != 0) {
            i16 |= 196608;
            pVarM213getLambda1$extension_compose_release = pVar;
        } else {
            pVarM213getLambda1$extension_compose_release = pVar;
            if ((i14 & 458752) == 0) {
                if (o0VarE.B(pVarM213getLambda1$extension_compose_release)) {
                    i28 = 131072;
                } else {
                    i28 = 65536;
                }
                i16 |= i28;
            }
        }
        if ((i15 & 64) != 0) {
            if ((i14 & 3670016) == 0) {
                if (o0VarE.B(this)) {
                    i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i29 = 524288;
                }
            }
            if ((i16 & 2995931) == 599186) {
                if (i34 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i35 != 0) {
                    f.a aVar1111110 = f.f75994b;
                    h2VarA = l.a(4);
                }
                if (i17 != 0) {
                    h4.d.f81522a.getClass();
                    dVar3 = h4.d.a.f81526d;
                } else {
                    dVar3 = dVar2;
                }
                if (i19 != 0) {
                    z16 = true;
                }
                if (i25 == 0) {
                }
                if (i27 != 0) {
                    pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                }
                x1 x1Var111111111119 = n.f135158a;
                objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                c2565a = m.a.f135155b;
                if (objK == c2565a) {
                    objK = p0.n(Float.valueOf(0.0f));
                    o0VarE.K(objK);
                }
                o0VarE.g0(false);
                p1Var = (p1) objK;
                o0VarE.L(-492369756);
                objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                o0VarE.g0(false);
                p1Var2 = (p1) objQ;
                Unit unit111111111119 = Unit.INSTANCE;
                objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                o0VarE.L(-568225417);
                zB = false;
                while (i30 < 4) {
                    zB |= o0VarE.B(objArr[i30]);
                }
                objQ2 = o0VarE.q();
                if (zB) {
                    boolean z21111111111111111113 = z16;
                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111111111113, p1Var2, null);
                    z19 = z21111111111111111113;
                    p1Var3 = p1Var2;
                    o0VarE.K(objQ2);
                } else {
                    boolean z21111111111111111114 = z16;
                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111111111114, p1Var2, null);
                    z19 = z21111111111111111114;
                    p1Var3 = p1Var2;
                    o0VarE.K(objQ2);
                }
                o0VarE.g0(false);
                l0.e((p) objQ2, unit111111111119, o0VarE);
                boolean zCompass$lambda$1111113 = Compass$lambda$4(p1Var3);
                v1 v1VarD1111110 = u0.d(s1.l.d(500, 0, null, 6), 2);
                boolean z21111111111111111115 = z19;
                r1.x1 x1VarE1111110 = u0.e(s1.l.d(500, 500, null, 4), 2);
                o0VarE.L(1868333135);
                h4.r rVarG1111110 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                Unit unit1111111111110 = Unit.INSTANCE;
                Boolean boolValueOf1111110 = Boolean.valueOf(z18);
                o0VarE.L(511388516);
                zB2 = o0VarE.B(boolValueOf1111110) | o0VarE.B(this);
                objQ3 = o0VarE.q();
                if (zB2) {
                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                    o0VarE.K(objQ3);
                }
                o0VarE.g0(false);
                q qVar1111110 = s0.f15885a;
                h4.r rVarThen1111110 = rVarG1111110.then(new r0(unit1111111111110, null, null, new s0.a((p) objQ3), 6, null));
                o0VarE.g0(false);
                r1.c0.e(zCompass$lambda$1111113, rVarThen1111110, v1VarD1111110, x1VarE1111110, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                x1 x1Var1111111111110 = n.f135158a;
                h2 h2Var1111113 = h2VarA;
                pVar2 = pVarM213getLambda1$extension_compose_release;
                h2Var2 = h2Var1111113;
                z24 = z21111111111111111115;
                z25 = z18;
                dVar4 = dVar3;
                rVar4 = rVar3;
            } else {
                if (i34 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i35 != 0) {
                    f.a aVar1111111 = f.f75994b;
                    h2VarA = l.a(4);
                }
                if (i17 != 0) {
                    h4.d.f81522a.getClass();
                    dVar3 = h4.d.a.f81526d;
                } else {
                    dVar3 = dVar2;
                }
                if (i19 != 0) {
                    z16 = true;
                }
                if (i25 == 0) {
                }
                if (i27 != 0) {
                    pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
                }
                x1 x1Var1111111111111 = n.f135158a;
                objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
                c2565a = m.a.f135155b;
                if (objK == c2565a) {
                    objK = p0.n(Float.valueOf(0.0f));
                    o0VarE.K(objK);
                }
                o0VarE.g0(false);
                p1Var = (p1) objK;
                o0VarE.L(-492369756);
                objQ = o0VarE.q();
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                o0VarE.g0(false);
                p1Var2 = (p1) objQ;
                Unit unit1111111111111 = Unit.INSTANCE;
                objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
                o0VarE.L(-568225417);
                zB = false;
                while (i30 < 4) {
                    zB |= o0VarE.B(objArr[i30]);
                }
                objQ2 = o0VarE.q();
                if (zB) {
                    boolean z21111111111111111116 = z16;
                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111111111116, p1Var2, null);
                    z19 = z21111111111111111116;
                    p1Var3 = p1Var2;
                    o0VarE.K(objQ2);
                } else {
                    boolean z21111111111111111117 = z16;
                    objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111111111117, p1Var2, null);
                    z19 = z21111111111111111117;
                    p1Var3 = p1Var2;
                    o0VarE.K(objQ2);
                }
                o0VarE.g0(false);
                l0.e((p) objQ2, unit1111111111111, o0VarE);
                boolean zCompass$lambda$1111114 = Compass$lambda$4(p1Var3);
                v1 v1VarD1111111 = u0.d(s1.l.d(500, 0, null, 6), 2);
                boolean z21111111111111111118 = z19;
                r1.x1 x1VarE1111111 = u0.e(s1.l.d(500, 500, null, 4), 2);
                o0VarE.L(1868333135);
                h4.r rVarG1111111 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
                Unit unit1111111111112 = Unit.INSTANCE;
                Boolean boolValueOf1111111 = Boolean.valueOf(z18);
                o0VarE.L(511388516);
                zB2 = o0VarE.B(boolValueOf1111111) | o0VarE.B(this);
                objQ3 = o0VarE.q();
                if (zB2) {
                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                    o0VarE.K(objQ3);
                }
                o0VarE.g0(false);
                q qVar1111111 = s0.f15885a;
                h4.r rVarThen1111111 = rVarG1111111.then(new r0(unit1111111111112, null, null, new s0.a((p) objQ3), 6, null));
                o0VarE.g0(false);
                r1.c0.e(zCompass$lambda$1111114, rVarThen1111111, v1VarD1111111, x1VarE1111111, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
                x1 x1Var1111111111112 = n.f135158a;
                h2 h2Var1111114 = h2VarA;
                pVar2 = pVarM213getLambda1$extension_compose_release;
                h2Var2 = h2Var1111114;
                z24 = z21111111111111111118;
                z25 = z18;
                dVar4 = dVar3;
                rVar4 = rVar3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 == null) {
                return;
            }
            p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
        }
        i29 = 1572864;
        i16 |= i29;
        if ((i16 & 2995931) == 599186) {
            if (i34 != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar2;
            }
            if (i35 != 0) {
                f.a aVar1111112 = f.f75994b;
                h2VarA = l.a(4);
            }
            if (i17 != 0) {
                h4.d.f81522a.getClass();
                dVar3 = h4.d.a.f81526d;
            } else {
                dVar3 = dVar2;
            }
            if (i19 != 0) {
                z16 = true;
            }
            if (i25 == 0) {
            }
            if (i27 != 0) {
                pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
            }
            x1 x1Var1111111111113 = n.f135158a;
            objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
            c2565a = m.a.f135155b;
            if (objK == c2565a) {
                objK = p0.n(Float.valueOf(0.0f));
                o0VarE.K(objK);
            }
            o0VarE.g0(false);
            p1Var = (p1) objK;
            o0VarE.L(-492369756);
            objQ = o0VarE.q();
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            o0VarE.g0(false);
            p1Var2 = (p1) objQ;
            Unit unit1111111111113 = Unit.INSTANCE;
            objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
            o0VarE.L(-568225417);
            zB = false;
            while (i30 < 4) {
                zB |= o0VarE.B(objArr[i30]);
            }
            objQ2 = o0VarE.q();
            if (zB) {
                boolean z21111111111111111119 = z16;
                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z21111111111111111119, p1Var2, null);
                z19 = z21111111111111111119;
                p1Var3 = p1Var2;
                o0VarE.K(objQ2);
            } else {
                boolean z211111111111111111110 = z16;
                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111111111111110, p1Var2, null);
                z19 = z211111111111111111110;
                p1Var3 = p1Var2;
                o0VarE.K(objQ2);
            }
            o0VarE.g0(false);
            l0.e((p) objQ2, unit1111111111113, o0VarE);
            boolean zCompass$lambda$1111115 = Compass$lambda$4(p1Var3);
            v1 v1VarD1111112 = u0.d(s1.l.d(500, 0, null, 6), 2);
            boolean z211111111111111111111 = z19;
            r1.x1 x1VarE1111112 = u0.e(s1.l.d(500, 500, null, 4), 2);
            o0VarE.L(1868333135);
            h4.r rVarG1111112 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
            Unit unit1111111111114 = Unit.INSTANCE;
            Boolean boolValueOf1111112 = Boolean.valueOf(z18);
            o0VarE.L(511388516);
            zB2 = o0VarE.B(boolValueOf1111112) | o0VarE.B(this);
            objQ3 = o0VarE.q();
            if (zB2) {
                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                o0VarE.K(objQ3);
            }
            o0VarE.g0(false);
            q qVar1111112 = s0.f15885a;
            h4.r rVarThen1111112 = rVarG1111112.then(new r0(unit1111111111114, null, null, new s0.a((p) objQ3), 6, null));
            o0VarE.g0(false);
            r1.c0.e(zCompass$lambda$1111115, rVarThen1111112, v1VarD1111112, x1VarE1111112, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
            x1 x1Var1111111111114 = n.f135158a;
            h2 h2Var1111115 = h2VarA;
            pVar2 = pVarM213getLambda1$extension_compose_release;
            h2Var2 = h2Var1111115;
            z24 = z211111111111111111111;
            z25 = z18;
            dVar4 = dVar3;
            rVar4 = rVar3;
        } else {
            if (i34 != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar2;
            }
            if (i35 != 0) {
                f.a aVar1111113 = f.f75994b;
                h2VarA = l.a(4);
            }
            if (i17 != 0) {
                h4.d.f81522a.getClass();
                dVar3 = h4.d.a.f81526d;
            } else {
                dVar3 = dVar2;
            }
            if (i19 != 0) {
                z16 = true;
            }
            if (i25 == 0) {
            }
            if (i27 != 0) {
                pVarM213getLambda1$extension_compose_release = ComposableSingletons$MapCompassScopeKt.INSTANCE.m213getLambda1$extension_compose_release();
            }
            x1 x1Var1111111111115 = n.f135158a;
            objK = fb1.c.k(o0VarE, -492369756, m.f135153a);
            c2565a = m.a.f135155b;
            if (objK == c2565a) {
                objK = p0.n(Float.valueOf(0.0f));
                o0VarE.K(objK);
            }
            o0VarE.g0(false);
            p1Var = (p1) objK;
            o0VarE.L(-492369756);
            objQ = o0VarE.q();
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            o0VarE.g0(false);
            p1Var2 = (p1) objQ;
            Unit unit1111111111115 = Unit.INSTANCE;
            objArr = new Object[]{p1Var, this, p1Var2, Boolean.valueOf(z16)};
            o0VarE.L(-568225417);
            zB = false;
            while (i30 < 4) {
                zB |= o0VarE.B(objArr[i30]);
            }
            objQ2 = o0VarE.q();
            if (zB) {
                boolean z211111111111111111112 = z16;
                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111111111111112, p1Var2, null);
                z19 = z211111111111111111112;
                p1Var3 = p1Var2;
                o0VarE.K(objQ2);
            } else {
                boolean z211111111111111111113 = z16;
                objQ2 = new MapCompassScope$Compass$1$1(this, p1Var, z211111111111111111113, p1Var2, null);
                z19 = z211111111111111111113;
                p1Var3 = p1Var2;
                o0VarE.K(objQ2);
            }
            o0VarE.g0(false);
            l0.e((p) objQ2, unit1111111111115, o0VarE);
            boolean zCompass$lambda$1111116 = Compass$lambda$4(p1Var3);
            v1 v1VarD1111113 = u0.d(s1.l.d(500, 0, null, 6), 2);
            boolean z211111111111111111114 = z19;
            r1.x1 x1VarE1111113 = u0.e(s1.l.d(500, 500, null, 4), 2);
            o0VarE.L(1868333135);
            h4.r rVarG1111113 = k.g(this.boxScope.c(l.x(h4.r.S, h2VarA).then(rVar3), dVar3), Compass$lambda$1(p1Var));
            Unit unit1111111111116 = Unit.INSTANCE;
            Boolean boolValueOf1111113 = Boolean.valueOf(z18);
            o0VarE.L(511388516);
            zB2 = o0VarE.B(boolValueOf1111113) | o0VarE.B(this);
            objQ3 = o0VarE.q();
            if (zB2) {
                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new MapCompassScope$Compass$2$1$1(this, z18, null);
                o0VarE.K(objQ3);
            }
            o0VarE.g0(false);
            q qVar1111113 = s0.f15885a;
            h4.r rVarThen1111113 = rVarG1111113.then(new r0(unit1111111111116, null, null, new s0.a((p) objQ3), 6, null));
            o0VarE.g0(false);
            r1.c0.e(zCompass$lambda$1111116, rVarThen1111113, v1VarD1111113, x1VarE1111113, null, z3.f.b(-1301860064, new AnonymousClass3(pVarM213getLambda1$extension_compose_release, i16), o0VarE), o0VarE, 200064, 16);
            x1 x1Var1111111111116 = n.f135158a;
            h2 h2Var1111116 = h2VarA;
            pVar2 = pVarM213getLambda1$extension_compose_release;
            h2Var2 = h2Var1111116;
            z24 = z211111111111111111114;
            z25 = z18;
            dVar4 = dVar3;
            rVar4 = rVar3;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass4(rVar4, h2Var2, dVar4, z24, z25, pVar2, i14, i15);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope$Compass$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass3 extends w implements e23.q<e0, m, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ p<m, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(p<? super m, ? super Integer, Unit> pVar, int i14) {
            super(3);
            this.$content = pVar;
            this.$$dirty = i14;
        }

        public final void invoke(e0 e0Var, m mVar, int i14) {
            e0Var.getClass();
            x1 x1Var = n.f135158a;
            this.$content.invoke(mVar, Integer.valueOf((this.$$dirty >> 15) & 14));
        }

        @Override // e23.q
        public /* bridge */ /* synthetic */ Unit invoke(e0 e0Var, m mVar, Integer num) {
            invoke(e0Var, mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope$Compass$4, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass4 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ h4.d $alignment;
        final /* synthetic */ p<m, Integer, Unit> $content;
        final /* synthetic */ h2 $contentPadding;
        final /* synthetic */ boolean $fadeWhenFacingNorth;
        final /* synthetic */ h4.r $modifier;
        final /* synthetic */ boolean $resetToNorthUponClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(h4.r rVar, h2 h2Var, h4.d dVar, boolean z14, boolean z15, p<? super m, ? super Integer, Unit> pVar, int i14, int i15) {
            super(2);
            this.$modifier = rVar;
            this.$contentPadding = h2Var;
            this.$alignment = dVar;
            this.$fadeWhenFacingNorth = z14;
            this.$resetToNorthUponClick = z15;
            this.$content = pVar;
            this.$$changed = i14;
            this.$$default = i15;
        }

        public final void invoke(m mVar, int i14) {
            MapCompassScope.this.Compass(this.$modifier, this.$contentPadding, this.$alignment, this.$fadeWhenFacingNorth, this.$resetToNorthUponClick, this.$content, mVar, this.$$changed | 1, this.$$default);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }
}
