package ed;

import android.net.Uri;
import android.view.InputEvent;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.common.util.concurrent.ListenableFuture;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.p;
import fd.j;
import fd.l;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Led/a;", "", "<init>", "()V", "a", "b", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f63802a = new b(null);

    /* JADX INFO: renamed from: ed.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0016\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\bH\u0017¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Led/a$a;", "Led/a;", "Lfd/c;", "mMeasurementManager", "<init>", "(Lfd/c;)V", "Lfd/a;", "deletionRequest", "Lcom/google/common/util/concurrent/ListenableFuture;", "", "c", "(Lfd/a;)Lcom/google/common/util/concurrent/ListenableFuture;", "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "d", "(Landroid/net/Uri;Landroid/view/InputEvent;)Lcom/google/common/util/concurrent/ListenableFuture;", "Lfd/g;", "request", JWKParameterNames.RSA_EXPONENT, "(Lfd/g;)Lcom/google/common/util/concurrent/ListenableFuture;", "trigger", "b", "(Landroid/net/Uri;)Lcom/google/common/util/concurrent/ListenableFuture;", "Lfd/j;", "f", "(Lfd/j;)Lcom/google/common/util/concurrent/ListenableFuture;", "Lfd/l;", "g", "(Lfd/l;)Lcom/google/common/util/concurrent/ListenableFuture;", "", "a", "()Lcom/google/common/util/concurrent/ListenableFuture;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C1347a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final fd.c f63803b;

        /* JADX INFO: renamed from: ed.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", f = "MeasurementManagerFutures.kt", l = {132}, m = "invokeSuspend")
        public static final class C1348a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f63804a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ fd.a f63806c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1348a(fd.a aVar, t13.d<? super C1348a> dVar) {
                super(2, dVar);
                this.f63806c = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return C1347a.this.new C1348a(this.f63806c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C1348a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f63804a;
                if (i14 == 0) {
                    r.b(obj);
                    fd.c cVar = C1347a.this.f63803b;
                    this.f63804a = 1;
                    if (cVar.a(this.f63806c, this) == aVar) {
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

        /* JADX INFO: renamed from: ed.a$a$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)I"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {190}, m = "invokeSuspend")
        public static final class b extends i implements p<b0, t13.d<? super Integer>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f63807a;

            public b(t13.d<? super b> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return C1347a.this.new b(dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Integer> dVar) {
                return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f63807a;
                if (i14 != 0) {
                    if (i14 == 1) {
                        r.b(obj);
                        return obj;
                    }
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                fd.c cVar = C1347a.this.f63803b;
                this.f63807a = 1;
                Object objB = cVar.b(this);
                return objB == aVar ? aVar : objB;
            }
        }

        /* JADX INFO: renamed from: ed.a$a$c */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {143}, m = "invokeSuspend")
        public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f63809a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Uri f63811c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ InputEvent f63812d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, InputEvent inputEvent, t13.d<? super c> dVar) {
                super(2, dVar);
                this.f63811c = uri;
                this.f63812d = inputEvent;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return C1347a.this.new c(this.f63811c, this.f63812d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f63809a;
                if (i14 == 0) {
                    r.b(obj);
                    fd.c cVar = C1347a.this.f63803b;
                    this.f63809a = 1;
                    if (cVar.c(this.f63811c, this.f63812d, this) == aVar) {
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

        /* JADX INFO: renamed from: ed.a$a$d */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$2", f = "MeasurementManagerFutures.kt", l = {154}, m = "invokeSuspend")
        public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f63813a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ fd.g f63815c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(fd.g gVar, t13.d<? super d> dVar) {
                super(2, dVar);
                this.f63815c = gVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return C1347a.this.new d(this.f63815c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f63813a;
                if (i14 == 0) {
                    r.b(obj);
                    fd.c cVar = C1347a.this.f63803b;
                    this.f63813a = 1;
                    if (cVar.d(this.f63815c, this) == aVar) {
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

        /* JADX INFO: renamed from: ed.a$a$e */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {162}, m = "invokeSuspend")
        public static final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f63816a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Uri f63818c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Uri uri, t13.d<? super e> dVar) {
                super(2, dVar);
                this.f63818c = uri;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return C1347a.this.new e(this.f63818c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f63816a;
                if (i14 == 0) {
                    r.b(obj);
                    fd.c cVar = C1347a.this.f63803b;
                    this.f63816a = 1;
                    if (cVar.e(this.f63818c, this) == aVar) {
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

        /* JADX INFO: renamed from: ed.a$a$f */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {TsExtractor.TS_STREAM_TYPE_AC4}, m = "invokeSuspend")
        public static final class f extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f63819a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f63821c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(j jVar, t13.d<? super f> dVar) {
                super(2, dVar);
                this.f63821c = jVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return C1347a.this.new f(this.f63821c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f63819a;
                if (i14 == 0) {
                    r.b(obj);
                    fd.c cVar = C1347a.this.f63803b;
                    this.f63819a = 1;
                    if (cVar.f(this.f63821c, this) == aVar) {
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

        /* JADX INFO: renamed from: ed.a$a$g */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 8, 0})
        @v13.e(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {182}, m = "invokeSuspend")
        public static final class g extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f63822a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l f63824c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(l lVar, t13.d<? super g> dVar) {
                super(2, dVar);
                this.f63824c = lVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return C1347a.this.new g(this.f63824c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f63822a;
                if (i14 == 0) {
                    r.b(obj);
                    fd.c cVar = C1347a.this.f63803b;
                    this.f63822a = 1;
                    if (cVar.g(this.f63824c, this) == aVar) {
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

        public C1347a(fd.c cVar) {
            cVar.getClass();
            this.f63803b = cVar;
        }

        @Override // ed.a
        public ListenableFuture<Integer> a() {
            return dd.b.a(ge1.b.j(c0.a(s0.f129406a), null, null, new b(null), 3));
        }

        @Override // ed.a
        public ListenableFuture<Unit> b(Uri trigger) {
            trigger.getClass();
            return dd.b.a(ge1.b.j(c0.a(s0.f129406a), null, null, new e(trigger, null), 3));
        }

        public ListenableFuture<Unit> c(fd.a deletionRequest) {
            deletionRequest.getClass();
            return dd.b.a(ge1.b.j(c0.a(s0.f129406a), null, null, new C1348a(deletionRequest, null), 3));
        }

        public ListenableFuture<Unit> d(Uri attributionSource, InputEvent inputEvent) {
            attributionSource.getClass();
            return dd.b.a(ge1.b.j(c0.a(s0.f129406a), null, null, new c(attributionSource, inputEvent, null), 3));
        }

        public ListenableFuture<Unit> e(fd.g request) {
            request.getClass();
            return dd.b.a(ge1.b.j(c0.a(s0.f129406a), null, null, new d(request, null), 3));
        }

        public ListenableFuture<Unit> f(j request) {
            request.getClass();
            return dd.b.a(ge1.b.j(c0.a(s0.f129406a), null, null, new f(request, null), 3));
        }

        public ListenableFuture<Unit> g(l request) {
            request.getClass();
            return dd.b.a(ge1.b.j(c0.a(s0.f129406a), null, null, new g(request, null), 3));
        }
    }

    public abstract ListenableFuture<Integer> a();

    public abstract ListenableFuture<Unit> b(Uri uri);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Led/a$b;", "", "<init>", "()V", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }
}
