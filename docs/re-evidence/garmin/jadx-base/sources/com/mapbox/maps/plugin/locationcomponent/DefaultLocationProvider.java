package com.mapbox.maps.plugin.locationcomponent;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mapbox.android.core.permissions.PermissionsManager;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.Cancelable;
import com.mapbox.common.location.AccuracyLevel;
import com.mapbox.common.location.DeviceLocationProvider;
import com.mapbox.common.location.IntervalSettings;
import com.mapbox.common.location.Location;
import com.mapbox.common.location.LocationError;
import com.mapbox.common.location.LocationErrorCode;
import com.mapbox.common.location.LocationObserver;
import com.mapbox.common.location.LocationProviderRequest;
import com.mapbox.common.location.LocationService;
import com.mapbox.common.location.LocationServiceFactory;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.plugin.PuckBearing;
import e23.l;
import e23.p;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o13.r;
import o53.b0;
import o53.c0;
import o53.l1;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p13.h0;
import q53.t;
import r53.i;
import r53.j;
import r53.k2;
import r53.q2;
import r53.s;
import r53.z1;
import s53.k;
import t13.g;
import u53.o;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0011\u0018\u0000 @2\u00020\u0001:\u0001@B)\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\fJ#\u0010\u0012\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001d\u001a\u00020\u001b2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b%\u0010$J\u0015\u0010(\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b*\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R$\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000e088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00160=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/DefaultLocationProvider;", "Lcom/mapbox/maps/plugin/locationcomponent/LocationProvider;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/mapbox/maps/plugin/locationcomponent/LocationCompassEngine;", "locationCompassEngine", "Lcom/mapbox/common/location/LocationService;", "locationService", "Lo53/z;", "mainCoroutineDispatcher", "<init>", "(Landroid/content/Context;Lcom/mapbox/maps/plugin/locationcomponent/LocationCompassEngine;Lcom/mapbox/common/location/LocationService;Lo53/z;)V", "(Landroid/content/Context;)V", "Lq53/t;", "Lcom/mapbox/common/location/Location;", "Lcom/mapbox/common/Cancelable;", "lastLocationCancelable", "com/mapbox/maps/plugin/locationcomponent/DefaultLocationProvider$locationObserver$1", "locationObserver", "(Lq53/t;Lcom/mapbox/common/Cancelable;)Lcom/mapbox/maps/plugin/locationcomponent/DefaultLocationProvider$locationObserver$1;", "Lcom/mapbox/maps/plugin/locationcomponent/LocationConsumer;", "locationConsumer", "Lo53/l1;", "collectLocationFlow", "(Lcom/mapbox/maps/plugin/locationcomponent/LocationConsumer;)Lo53/l1;", "Lkotlin/Function1;", "Landroid/animation/ValueAnimator;", "", "options", "locationAnimatorOptions", "(Le23/l;)V", "Lcom/mapbox/maps/plugin/PuckBearing;", "source", "updatePuckBearing", "(Lcom/mapbox/maps/plugin/PuckBearing;)V", "registerLocationConsumer", "(Lcom/mapbox/maps/plugin/locationcomponent/LocationConsumer;)V", "unRegisterLocationConsumer", "Lcom/mapbox/maps/plugin/locationcomponent/LocationCompassCalibrationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnCompassCalibrationListener", "(Lcom/mapbox/maps/plugin/locationcomponent/LocationCompassCalibrationListener;)V", "removeCompassCalibrationListener", "Lcom/mapbox/maps/plugin/locationcomponent/LocationCompassEngine;", "Lo53/z;", "_locationAnimatorOptions", "Le23/l;", "Lcom/mapbox/common/location/LocationError;", "locationProviderNotAvailable", "Lcom/mapbox/common/location/LocationError;", "Lo53/b0;", Action.SCOPE_ATTRIBUTE, "Lo53/b0;", "Lr53/z1;", "puckBearingFlow", "Lr53/z1;", "Lr53/i;", "", "deviceOrientationFlow", "Lr53/i;", "locationUpdatesFlow", "Ljava/util/concurrent/ConcurrentHashMap;", "locationConsumersJobs", "Ljava/util/concurrent/ConcurrentHashMap;", "Companion", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DefaultLocationProvider implements LocationProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long INIT_UPDATE_DELAY = 500;
    public static final String LIVE_TRACKING_CLIENT_NOT_AVAILABLE = "LiveTrackingClient not available";
    public static final long MAX_UPDATE_DELAY = 5000;
    private static final String MISSING_PERMISSION_MSG = "Missing location permission, location component will not take effect before location permission is granted.";
    private static final String TAG = "MapboxLocationProvider";
    private l<? super ValueAnimator, Unit> _locationAnimatorOptions;
    private final i<Double> deviceOrientationFlow;
    private final LocationCompassEngine locationCompassEngine;
    private final ConcurrentHashMap<LocationConsumer, l1> locationConsumersJobs;
    private LocationError locationProviderNotAvailable;
    private final i<Location> locationUpdatesFlow;
    private final z mainCoroutineDispatcher;
    private final z1<PuckBearing> puckBearingFlow;
    private final b0 scope;

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
    @v13.e(c = "com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1", f = "DefaultLocationProvider.kt", l = {}, m = "invokeSuspend")
    public static final class C42431 extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ LocationConsumer $locationConsumer;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
        @v13.e(c = "com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1$1", f = "DefaultLocationProvider.kt", l = {232}, m = "invokeSuspend")
        public static final class C11801 extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
            final /* synthetic */ LocationConsumer $locationConsumer;
            final /* synthetic */ i<Location> $locationFlow;
            int label;
            final /* synthetic */ DefaultLocationProvider this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C11801(i<? extends Location> iVar, LocationConsumer locationConsumer, DefaultLocationProvider defaultLocationProvider, t13.d<? super C11801> dVar) {
                super(2, dVar);
                this.$locationFlow = iVar;
                this.$locationConsumer = locationConsumer;
                this.this$0 = defaultLocationProvider;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C11801(this.$locationFlow, this.$locationConsumer, this.this$0, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C11801) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    r.b(obj);
                    final i<Location> iVar = this.$locationFlow;
                    i<Point> iVar2 = new i<Point>() { // from class: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1$1$invokeSuspend$$inlined$map$1

                        /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
                        public static final class AnonymousClass2<T> implements j {
                            final /* synthetic */ j $this_unsafeFlow;

                            /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                            @v13.e(c = "com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1$1$invokeSuspend$$inlined$map$1$2", f = "DefaultLocationProvider.kt", l = {223}, m = "emit")
                            public static final class AnonymousClass1 extends v13.c {
                                Object L$0;
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

                            /* JADX WARN: Code duplicated, block: B:18:0x0054  */
                            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                            @Override // r53.j
                            public final Object emit(Object obj, t13.d dVar) {
                                AnonymousClass1 anonymousClass1;
                                Point pointFromLngLat;
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
                                    Location location = (Location) obj;
                                    if (location.getAltitude() != null) {
                                        double longitude = location.getLongitude();
                                        double latitude = location.getLatitude();
                                        Double altitude = location.getAltitude();
                                        altitude.getClass();
                                        pointFromLngLat = Point.fromLngLat(longitude, latitude, altitude.doubleValue());
                                        if (pointFromLngLat == null) {
                                            pointFromLngLat = Point.fromLngLat(location.getLongitude(), location.getLatitude());
                                        }
                                    } else {
                                        pointFromLngLat = Point.fromLngLat(location.getLongitude(), location.getLatitude());
                                    }
                                    anonymousClass1.label = 1;
                                    if (jVar.emit(pointFromLngLat, anonymousClass1) == aVar) {
                                        return aVar;
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
                        public Object collect(j<? super Point> jVar, t13.d dVar) {
                            Object objCollect = iVar.collect(new AnonymousClass2(jVar), dVar);
                            return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
                        }
                    };
                    final LocationConsumer locationConsumer = this.$locationConsumer;
                    final DefaultLocationProvider defaultLocationProvider = this.this$0;
                    j<? super Point> jVar = new j() { // from class: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider.collectLocationFlow.1.1.2
                        public final Object emit(Point point, t13.d<? super Unit> dVar) {
                            LocationConsumer locationConsumer2 = locationConsumer;
                            point.getClass();
                            locationConsumer2.onLocationUpdated(new Point[]{point}, defaultLocationProvider._locationAnimatorOptions);
                            return Unit.INSTANCE;
                        }

                        @Override // r53.j
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, t13.d dVar) {
                            return emit((Point) obj2, (t13.d<? super Unit>) dVar);
                        }
                    };
                    this.label = 1;
                    if (iVar2.collect(jVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
        @v13.e(c = "com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1$2", f = "DefaultLocationProvider.kt", l = {250}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
            final /* synthetic */ LocationConsumer $locationConsumer;
            final /* synthetic */ i<Location> $locationFlow;
            int label;
            final /* synthetic */ DefaultLocationProvider this$0;

            /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1$2$WhenMappings */
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PuckBearing.values().length];
                    try {
                        iArr[PuckBearing.HEADING.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PuckBearing.COURSE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(DefaultLocationProvider defaultLocationProvider, i<? extends Location> iVar, LocationConsumer locationConsumer, t13.d<? super AnonymousClass2> dVar) {
                super(2, dVar);
                this.this$0 = defaultLocationProvider;
                this.$locationFlow = iVar;
                this.$locationConsumer = locationConsumer;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new AnonymousClass2(this.this$0, this.$locationFlow, this.$locationConsumer, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((AnonymousClass2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    r.b(obj);
                    k kVarN = s.N(this.this$0.puckBearingFlow, new DefaultLocationProvider$collectLocationFlow$1$2$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0, this.$locationFlow));
                    final LocationConsumer locationConsumer = this.$locationConsumer;
                    j jVar = new j() { // from class: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider.collectLocationFlow.1.2.2
                        public final Object emit(double d14, t13.d<? super Unit> dVar) {
                            LocationConsumer.DefaultImpls.onBearingUpdated$default(locationConsumer, new double[]{d14}, null, 2, null);
                            return Unit.INSTANCE;
                        }

                        @Override // r53.j
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, t13.d dVar) {
                            return emit(((Number) obj2).doubleValue(), (t13.d<? super Unit>) dVar);
                        }
                    };
                    this.label = 1;
                    if (kVarN.collect(jVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
        @v13.e(c = "com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1$3", f = "DefaultLocationProvider.kt", l = {TsExtractor.TS_STREAM_TYPE_AIT}, m = "invokeSuspend")
        public static final class AnonymousClass3 extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
            final /* synthetic */ LocationConsumer $locationConsumer;
            final /* synthetic */ i<Location> $locationFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass3(i<? extends Location> iVar, LocationConsumer locationConsumer, t13.d<? super AnonymousClass3> dVar) {
                super(2, dVar);
                this.$locationFlow = iVar;
                this.$locationConsumer = locationConsumer;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new AnonymousClass3(this.$locationFlow, this.$locationConsumer, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((AnonymousClass3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    r.b(obj);
                    i<Location> iVar = this.$locationFlow;
                    final LocationConsumer locationConsumer = this.$locationConsumer;
                    j<? super Location> jVar = new j() { // from class: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider.collectLocationFlow.1.3.1
                        public final Object emit(Location location, t13.d<? super Unit> dVar) {
                            Double horizontalAccuracy = location.getHorizontalAccuracy();
                            if (horizontalAccuracy != null) {
                                LocationConsumer.DefaultImpls.onHorizontalAccuracyRadiusUpdated$default(locationConsumer, new double[]{horizontalAccuracy.doubleValue()}, null, 2, null);
                            }
                            return Unit.INSTANCE;
                        }

                        @Override // r53.j
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, t13.d dVar) {
                            return emit((Location) obj2, (t13.d<? super Unit>) dVar);
                        }
                    };
                    this.label = 1;
                    if (iVar.collect(jVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42431(LocationConsumer locationConsumer, t13.d<? super C42431> dVar) {
            super(2, dVar);
            this.$locationConsumer = locationConsumer;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C42431 c42431 = DefaultLocationProvider.this.new C42431(this.$locationConsumer, dVar);
            c42431.L$0 = obj;
            return c42431;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C42431) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            b0 b0Var = (b0) this.L$0;
            i iVar = DefaultLocationProvider.this.locationUpdatesFlow;
            ge1.b.T(b0Var, null, null, new C11801(iVar, this.$locationConsumer, DefaultLocationProvider.this, null), 3);
            ge1.b.T(b0Var, null, null, new AnonymousClass2(DefaultLocationProvider.this, iVar, this.$locationConsumer, null), 3);
            ge1.b.T(b0Var, null, null, new AnonymousClass3(iVar, this.$locationConsumer, null), 3);
            return Unit.INSTANCE;
        }
    }

    public DefaultLocationProvider(Context context, LocationCompassEngine locationCompassEngine, LocationService locationService, z zVar) {
        i<Location> iVarG;
        context.getClass();
        locationCompassEngine.getClass();
        locationService.getClass();
        zVar.getClass();
        this.locationCompassEngine = locationCompassEngine;
        this.mainCoroutineDispatcher = zVar;
        u53.d dVarA = c0.a(g.a.C3052a.d(zVar, ge1.b.h()));
        this.scope = dVarA;
        this.puckBearingFlow = q2.a(PuckBearing.COURSE);
        r53.b bVarF = s.f(new DefaultLocationProvider$deviceOrientationFlow$1(this, null));
        k2.a aVar = k2.f150703a;
        this.deviceOrientationFlow = s.G(bVarF, dVarA, k2.a.a(aVar, 1));
        this.locationConsumersJobs = new ConcurrentHashMap<>();
        Expected<LocationError, DeviceLocationProvider> deviceLocationProvider = locationService.getDeviceLocationProvider(new LocationProviderRequest.Builder().accuracy(AccuracyLevel.HIGH).interval(new IntervalSettings.Builder().minimumInterval(1000L).interval(1000L).build()).displacement(Float.valueOf(0.1f)).build());
        if (deviceLocationProvider.isValue()) {
            Context applicationContext = context.getApplicationContext();
            DeviceLocationProvider value = deviceLocationProvider.getValue();
            value.getClass();
            iVarG = s.G(s.f(new AnonymousClass1(applicationContext, value, this, null)), dVarA, k2.a.a(aVar, 1));
        } else {
            LocationError error = deviceLocationProvider.getError();
            error.getClass();
            MapboxLogger.logE(TAG, "LocationService error: " + error);
            this.locationProviderNotAvailable = new LocationError(LocationErrorCode.NOT_AVAILABLE, LIVE_TRACKING_CLIENT_NOT_AVAILABLE);
            iVarG = r53.h.f150634a;
        }
        this.locationUpdatesFlow = iVarG;
    }

    private final l1 collectLocationFlow(LocationConsumer locationConsumer) {
        return ge1.b.T(c0.a(g.a.C3052a.d(this.mainCoroutineDispatcher, g8.i.c())), null, null, new C42431(locationConsumer, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$locationObserver$1] */
    public final C42441 locationObserver(t<? super Location> tVar, Cancelable cancelable) {
        return new LocationObserver(tVar) { // from class: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider.locationObserver.1
            final /* synthetic */ t<Location> $this_locationObserver;
            private boolean lastLocationCanBeCanceled;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$this_locationObserver = tVar;
                this.lastLocationCanBeCanceled = this.$lastLocationCancelable != null;
            }

            public final boolean getLastLocationCanBeCanceled() {
                return this.lastLocationCanBeCanceled;
            }

            @Override // com.mapbox.common.location.LocationObserver
            public void onLocationUpdateReceived(List<? extends Location> locations) {
                locations.getClass();
                if (this.lastLocationCanBeCanceled) {
                    Cancelable cancelable2 = this.$lastLocationCancelable;
                    if (cancelable2 != null) {
                        cancelable2.cancel();
                    }
                    this.lastLocationCanBeCanceled = false;
                }
                og.a.d0(this.$this_locationObserver, h0.m0(locations));
            }

            public final void setLastLocationCanBeCanceled(boolean z14) {
                this.lastLocationCanBeCanceled = z14;
            }
        };
    }

    public final void addOnCompassCalibrationListener(LocationCompassCalibrationListener listener) {
        listener.getClass();
        this.locationCompassEngine.addCalibrationListener(listener);
    }

    public final void locationAnimatorOptions(l<? super ValueAnimator, Unit> options) {
        this._locationAnimatorOptions = options;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationProvider
    @SuppressLint({"MissingPermission"})
    public void registerLocationConsumer(LocationConsumer locationConsumer) {
        locationConsumer.getClass();
        LocationError locationError = this.locationProviderNotAvailable;
        if (locationError != null) {
            locationConsumer.onError(locationError);
            return;
        }
        l1 l1VarPut = this.locationConsumersJobs.put(locationConsumer, collectLocationFlow(locationConsumer));
        if (l1VarPut != null) {
            l1VarPut.c(null);
        }
    }

    public final void removeCompassCalibrationListener(LocationCompassCalibrationListener listener) {
        listener.getClass();
        this.locationCompassEngine.removeCalibrationListener(listener);
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationProvider
    public void unRegisterLocationConsumer(LocationConsumer locationConsumer) {
        locationConsumer.getClass();
        l1 l1VarRemove = this.locationConsumersJobs.remove(locationConsumer);
        if (l1VarRemove != null) {
            l1VarRemove.c(null);
        }
    }

    public final void updatePuckBearing(PuckBearing source) {
        this.puckBearingFlow.setValue(source);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00078\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u0016\u0010\t\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/plugin/locationcomponent/DefaultLocationProvider$Companion;", "", "()V", "INIT_UPDATE_DELAY", "", "getINIT_UPDATE_DELAY$plugin_locationcomponent_release$annotations", "LIVE_TRACKING_CLIENT_NOT_AVAILABLE", "", "getLIVE_TRACKING_CLIENT_NOT_AVAILABLE$plugin_locationcomponent_release$annotations", "MAX_UPDATE_DELAY", "getMAX_UPDATE_DELAY$plugin_locationcomponent_release$annotations", "MISSING_PERMISSION_MSG", "TAG", "plugin-locationcomponent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static /* synthetic */ void getINIT_UPDATE_DELAY$plugin_locationcomponent_release$annotations() {
        }

        public static /* synthetic */ void getLIVE_TRACKING_CLIENT_NOT_AVAILABLE$plugin_locationcomponent_release$annotations() {
        }

        public static /* synthetic */ void getMAX_UPDATE_DELAY$plugin_locationcomponent_release$annotations() {
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/mapbox/common/location/Location;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {1, 7, 1})
    @v13.e(c = "com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$1", f = "DefaultLocationProvider.kt", l = {131, SyslogConstants.LOG_LOCAL2}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends v13.i implements p<t<? super Location>, t13.d<? super Unit>, Object> {
        final /* synthetic */ Context $applicationContext;
        final /* synthetic */ DeviceLocationProvider $locationProvider;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DefaultLocationProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, DeviceLocationProvider deviceLocationProvider, DefaultLocationProvider defaultLocationProvider, t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$applicationContext = context;
            this.$locationProvider = deviceLocationProvider;
            this.this$0 = defaultLocationProvider;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(t tVar, Location location) {
            if (location != null) {
                tVar.i(location);
            }
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$applicationContext, this.$locationProvider, this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // e23.p
        public final Object invoke(t<? super Location> tVar, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0039  */
        /* JADX WARN: Code duplicated, block: B:19:0x0057  */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            if (o53.m0.b(r4, r8) == r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
        
            if (q53.r.a(r1, r2, r8) == r0) goto L21;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004a -> B:16:0x004d). Please report as a decompilation issue!!! */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j8;
            t tVar;
            PermissionsManager.Companion companion;
            Context context;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                j8 = 500;
                tVar = (t) this.L$0;
                companion = PermissionsManager.INSTANCE;
                context = this.$applicationContext;
                context.getClass();
                if (companion.areLocationPermissionsGranted(context)) {
                    C42441 c42441LocationObserver = this.this$0.locationObserver(tVar, this.$locationProvider.getLastLocation(new a(tVar)));
                    this.$locationProvider.addLocationObserver(c42441LocationObserver);
                    C11791 c11791 = new C11791(this.$locationProvider, c42441LocationObserver);
                    this.L$0 = null;
                    this.label = 2;
                } else {
                    MapboxLogger.logW(DefaultLocationProvider.TAG, DefaultLocationProvider.MISSING_PERMISSION_MSG);
                    this.L$0 = tVar;
                    this.J$0 = j8;
                    this.label = 1;
                }
                return aVar;
            }
            if (i14 == 1) {
                j8 = this.J$0;
                tVar = (t) this.L$0;
                r.b(obj);
                j8 *= (long) 2;
                if (j8 > 5000) {
                    j8 = 5000;
                }
                companion = PermissionsManager.INSTANCE;
                context = this.$applicationContext;
                context.getClass();
                if (companion.areLocationPermissionsGranted(context)) {
                    MapboxLogger.logW(DefaultLocationProvider.TAG, DefaultLocationProvider.MISSING_PERMISSION_MSG);
                    this.L$0 = tVar;
                    this.J$0 = j8;
                    this.label = 1;
                } else {
                    C42441 c42441LocationObserver2 = this.this$0.locationObserver(tVar, this.$locationProvider.getLastLocation(new a(tVar)));
                    this.$locationProvider.addLocationObserver(c42441LocationObserver2);
                    C11791 c11792 = new C11791(this.$locationProvider, c42441LocationObserver2);
                    this.L$0 = null;
                    this.label = 2;
                }
                return aVar;
            }
            if (i14 != 2) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class C11791 extends w implements e23.a<Unit> {
            final /* synthetic */ DeviceLocationProvider $locationProvider;
            final /* synthetic */ C42441 $observer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11791(DeviceLocationProvider deviceLocationProvider, C42441 c42441) {
                super(0);
                this.$locationProvider = deviceLocationProvider;
                this.$observer = c42441;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$locationProvider.removeLocationObserver(this.$observer);
            }

            @Override // e23.a
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }
    }

    public DefaultLocationProvider(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        LocationCompassEngine locationCompassEngine = new LocationCompassEngine(applicationContext);
        LocationService orCreate = LocationServiceFactory.getOrCreate();
        orCreate.getClass();
        x53.c cVar = s0.f129406a;
        this(context, locationCompassEngine, orCreate, o.f168762a.H());
    }
}
