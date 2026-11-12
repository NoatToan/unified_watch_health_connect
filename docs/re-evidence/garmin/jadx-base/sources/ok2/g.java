package ok2;

import android.content.Context;
import android.os.SystemClock;
import b21.s4;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.garmin.device.filetransfer.core.util.DeviceNotConnectedException;
import com.garmin.proto.generated.GDIFileAccess;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o53.j2;
import o53.m0;
import o53.s0;
import org.joda.time.DateTimeConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.c1;
import p13.l0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000eB)\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lok2/g;", "Llk2/c;", "Lbl2/b$b;", "Lbl2/o$b;", "Lrs2/c;", "device", "Lok2/b;", "helper", "Lal2/f;", "eventNotifier", "Lcom/garmin/device/filetransfer/core/background/a;", "scheduler", "<init>", "(Lrs2/c;Lok2/b;Lal2/f;Lcom/garmin/device/filetransfer/core/background/a;)V", "b", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements lk2.c, bl2.b.InterfaceC0272b, bl2.o.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f132677s = new b(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g0 f132678t = g0.USER_INITIATED_HIGHEST;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final g0 f132679u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Set<g0> f132680v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f132681w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rs2.c f132682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ok2.b f132683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final al2.f f132684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.garmin.device.filetransfer.core.background.a f132685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f132686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u53.d f132687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Logger f132688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final al2.q f132689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zk2.j f132690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f0 f132691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ok2.c f132692k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o53.s f132693l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicReference<bl2.b> f132694m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zk2.d f132695n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final pk2.b f132696o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o13.t f132697p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o13.t f132698q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ConcurrentHashMap<UUID, lk2.w> f132699r;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$1", f = "CoreTransferManager.kt", l = {}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            cl2.h hVar = cl2.h.f27950a;
            long f92746j = g.this.f132682a.getF92746j();
            hVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() - ((long) DateTimeConstants.MILLIS_PER_WEEK);
            Logger logger = cl2.h.f27951b;
            for (File file : cl2.h.c(wk2.h.DEVICE_TO_PHONE, f92746j)) {
                if (file.isFile() && file.lastModified() < jCurrentTimeMillis && !file.delete()) {
                    com.airbnb.lottie.animation.keyframe.a.w("deleteExpiredFiles: Did not delete file ", file.getName(), logger);
                }
            }
            for (File file2 : cl2.h.c(wk2.h.PHONE_TO_DEVICE, f92746j)) {
                if (file2.isFile() && file2.lastModified() < jCurrentTimeMillis && !file2.delete()) {
                    com.airbnb.lottie.animation.keyframe.a.w("deleteExpiredFiles: Did not delete file ", file2.getName(), logger);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132702a;

        static {
            int[] iArr = new int[al2.b.values().length];
            try {
                iArr[al2.b.INTERRUPTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f132702a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$completeBatch$1$2", f = "CoreTransferManager.kt", l = {866}, m = "invokeSuspend")
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f132703a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f132703a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f132703a = 1;
                if (g.u(g.this, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$onFlagsUpdated$1", f = "CoreTransferManager.kt", l = {1231}, m = "invokeSuspend")
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f132705a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lk2.w f132707c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(lk2.w wVar, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f132707c = wVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new e(this.f132707c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f132705a;
            if (i14 == 0) {
                o13.r.b(obj);
                g.f132677s.getClass();
                long j8 = g.f132681w;
                this.f132705a = 1;
                if (m0.b(j8, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            g.this.f132699r.remove(this.f132707c.f113306a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class f extends p005kotlin.jvm.internal.q implements e23.l<wk2.f, Boolean> {
        public f(Object obj) {
            super(1, obj, g.class, "hasNoUploadAgent", "hasNoUploadAgent(Lcom/garmin/device/filetransfer/core/data/FileMetadata;)Z", 0);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x006a  */
        @Override // e23.l
        public final Boolean invoke(wk2.f fVar) {
            boolean z14;
            wk2.f fVar2 = fVar;
            fVar2.getClass();
            g gVar = (g) this.receiver;
            b bVar = g.f132677s;
            gVar.getClass();
            Set<UUID> set = fVar2.f185846e;
            UUID uuid = fVar2.f185842a;
            if (set == null) {
                z14 = false;
            } else {
                bl2.b bVar2 = gVar.f132694m.get();
                if (p005kotlin.jvm.internal.s.g(bVar2 != null ? bVar2.f18603d.getId() : null, uuid)) {
                    z14 = false;
                } else {
                    Iterator<T> it = gVar.f132683b.getConfiguration().f132627g.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            pk2.f0 f0Var = (pk2.f0) it.next();
                            if (!set.containsAll(f0Var.getF159941g().f113303b) && f0Var.m(gVar.f132682a, fVar2)) {
                                break;
                            }
                        } else {
                            wk2.i iVarE = gVar.f132695n.e(uuid);
                            if ((iVarE != null ? iVarE.getF205163m() : null) != null) {
                                break;
                            }
                            z14 = true;
                        }
                    }
                    z14 = false;
                }
            }
            return Boolean.valueOf(z14);
        }
    }

    /* JADX INFO: renamed from: ok2.g$g, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$onResourceUpdated$3", f = "CoreTransferManager.kt", l = {1323}, m = "invokeSuspend")
    public static final class C2521g extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f132708a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lk2.z f132710c;

        /* JADX INFO: renamed from: ok2.g$g$a */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$onResourceUpdated$3$1", f = "CoreTransferManager.kt", l = {}, m = "invokeSuspend")
        public static final class a extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f132711a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ lk2.z f132712b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, lk2.z zVar, t13.d<? super a> dVar) {
                super(1, dVar);
                this.f132711a = gVar;
                this.f132712b = zVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new a(this.f132711a, this.f132712b, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super Unit> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                g.J(this.f132711a, String.valueOf(this.f132712b), null, false, 6);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2521g(lk2.z zVar, t13.d<? super C2521g> dVar) {
            super(2, dVar);
            this.f132710c = zVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return g.this.new C2521g(this.f132710c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C2521g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f132708a;
            if (i14 == 0) {
                o13.r.b(obj);
                g gVar = g.this;
                cz2.j jVar = (cz2.j) gVar.f132698q.getValue();
                a aVar2 = new a(gVar, this.f132710c, null);
                this.f132708a = 1;
                if (jVar.c(750L, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$startNextTask$1$1", f = "CoreTransferManager.kt", l = {396}, m = "invokeSuspend")
    public static final class h extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f132713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ bl2.b f132714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g0 f132715c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f132716d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ bl2.b f132717e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(bl2.b bVar, g0 g0Var, g gVar, bl2.b bVar2, t13.d<? super h> dVar) {
            super(1, dVar);
            this.f132714b = bVar;
            this.f132715c = g0Var;
            this.f132716d = gVar;
            this.f132717e = bVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new h(this.f132714b, this.f132715c, this.f132716d, this.f132717e, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f132713a;
            g gVar = this.f132716d;
            if (i14 == 0) {
                o13.r.b(obj);
                bl2.b bVar = this.f132714b;
                if (bVar != null) {
                    gVar.f132688g.debug("await finish/cancel isComplete=" + bVar.e() + " for " + bVar.f18603d.getId());
                    this.f132713a = 1;
                    if (bVar.b(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            g0 g0Var = this.f132715c;
            if (g0Var != null && !cl2.c.g(gVar.f132683b, g0Var).contains(this.f132717e.f18603d.getF205155e())) {
                g0 g0Var2 = gVar.f132692k.f132603e;
                if (g0Var2 != null) {
                    g0Var = g0Var2;
                }
                gVar.y(g0Var);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$startNextTask$1$2", f = "CoreTransferManager.kt", l = {}, m = "invokeSuspend")
    public static final class i extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.device.filetransfer.core.CoreTransferManager$startNextTask$1$2$1", f = "CoreTransferManager.kt", l = {}, m = "invokeSuspend")
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ g f132719a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g gVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f132719a = gVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f132719a, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                g.J(this.f132719a, "continue nextItem", null, false, 6);
                return Unit.INSTANCE;
            }
        }

        public i(t13.d<? super i> dVar) {
            super(1, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return g.this.new i(dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            g gVar = g.this;
            ge1.b.T(gVar.f132687f, null, null, new a(gVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    static {
        g0 g0Var = g0.USER_INITIATED_PREFERRED;
        f132679u = g0Var;
        f132680v = p13.u.m0(new g0[]{g0.USER_INITIATED_GENERAL, g0Var});
        f132681w = 30000L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(rs2.c cVar, ok2.b bVar, al2.f fVar, com.garmin.device.filetransfer.core.background.a aVar) {
        cVar.getClass();
        bVar.getClass();
        fVar.getClass();
        aVar.getClass();
        this.f132682a = cVar;
        this.f132683b = bVar;
        this.f132684c = fVar;
        this.f132685d = aVar;
        this.f132686e = new AtomicBoolean(true);
        x53.c cVar2 = s0.f129406a;
        u53.d dVarE = zl.a.e("CoreTransferManager", x53.b.f189152a.plus(ge1.b.h()));
        this.f132687f = dVarE;
        Logger logger = LoggerFactory.getLogger("CFT#TransferManager@" + cVar.getF92741e());
        logger.getClass();
        this.f132688g = logger;
        this.f132689h = new al2.q(bVar.getConfiguration(), fVar);
        zk2.j jVar = new zk2.j(bVar, cVar, dVarE);
        this.f132690i = jVar;
        this.f132691j = new f0(this);
        this.f132692k = new ok2.c(bVar, logger);
        this.f132693l = gl.b.b();
        this.f132694m = new AtomicReference<>(null);
        zk2.d dVar = new zk2.d(jVar, false, 2, null);
        this.f132695n = dVar;
        this.f132696o = new pk2.b(dVar, cVar, bVar, dVarE);
        this.f132697p = o13.m.b(new ok2.f(this, 0 == true ? 1 : 0));
        this.f132698q = o13.m.b(new ok2.f(this, 1));
        this.f132699r = new ConcurrentHashMap<>();
        ge1.b.T(dVarE, null, null, new a(null), 3);
        ge1.b.T(dVarE, null, null, new m(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0158  */
    public static void J(g gVar, String str, e23.p pVar, boolean z14, int i14) {
        bl2.b bVarE;
        g0 g0Var;
        zk2.k kVarL;
        e23.p pVar2 = (i14 & 2) != 0 ? null : pVar;
        boolean z15 = true;
        boolean z16 = (i14 & 4) != 0 ? true : z14;
        gVar.getClass();
        synchronized (gVar.f132692k.f132601c) {
            try {
                bl2.b bVar = gVar.f132694m.get();
                zk2.k kVarN = zk2.d.n(gVar.f132695n, (!z16 || bVar == null) ? null : bVar.f18603d.getId());
                gVar.f132688g.debug("startNextItem: ".concat(str));
                int iA = 0;
                if (!p13.h0.R(f132680v, kVarN != null ? kVarN.f205155e : null) || gVar.f132683b.getConfiguration().p()) {
                    z15 = false;
                }
                if (z15 && (kVarL = gVar.L(bVar)) != null) {
                    kVarN = kVarL;
                }
                ok2.c cVar = gVar.f132692k;
                if (kVarN != null && (g0Var = kVarN.f205155e) != null) {
                    iA = g0Var.a();
                }
                if (!cVar.b()) {
                    o13.p<Integer, Long> pVar3 = cVar.f132606h.get();
                    int iIntValue = pVar3.f128594a.intValue();
                    long jLongValue = pVar3.f128595b.longValue();
                    if (iIntValue > -1) {
                        if (iA <= iIntValue) {
                            cVar.f132599a.a();
                            if (300000 >= SystemClock.elapsedRealtime() - jLongValue) {
                                String str2 = "Device already busy with transfer at least priority " + gVar.f132692k.f132606h.get().f128594a.intValue();
                                gVar.f132688g.debug("Ignoring startNextItem: ".concat(str2));
                                if (pVar2 != null) {
                                    pVar2.invoke(al2.b.REJECTED, new CoreTransferException(ok2.e.f132637e, str2, null, 4, null));
                                }
                                return;
                            }
                        }
                        cVar.c();
                    }
                }
                gVar.f132688g.info("startNextItem: next: " + kVarN + ", current: " + (bVar != null ? bVar.f18603d : null));
                if (bVar == null || bVar.e()) {
                    bVarE = null;
                } else if (kVarN != null) {
                    if (p005kotlin.jvm.internal.s.g(bVar.f18603d, kVarN)) {
                        gVar.v(kVarN, pVar2);
                        return;
                    } else if (bVar.f18603d.getF205158h() == null || gVar.f132695n.e(bVar.f18603d.getId()) == null) {
                        bVarE = gVar.D();
                    } else {
                        bVarE = null;
                    }
                } else if (gVar.f132695n.e(bVar.f18603d.getId()) == null) {
                    bVarE = gVar.D();
                } else {
                    bVarE = null;
                }
                if (kVarN == null) {
                    gVar.f132694m.set(null);
                    ge1.b.T(gVar.f132687f, null, null, new ok2.i(bVarE, gVar, pVar2, null), 3);
                    return;
                }
                if (gVar.f132692k.b() && pVar2 != null) {
                    gVar.v(null, pVar2);
                }
                if (gVar.A().c() != null) {
                    if (bVarE == null) {
                        bVarE = gVar.A().e(kVarN.f205155e, pk2.x.a.c(pk2.x.f138495e, ok2.e.f132639g, null, null, 6));
                    } else {
                        gVar.f132688g.warn("Unexpected active item for both Batch and AdHocQueue");
                    }
                }
                bl2.b bVar2 = bVarE;
                bl2.b.f18599l.getClass();
                bl2.b bVarA = bl2.b.a.a(gVar.f132683b, gVar.f132687f, gVar.f132682a, kVarN, gVar, gVar);
                if (pVar2 != null) {
                    bl2.o oVar = bVarA.f18607h;
                    oVar.getClass();
                    oVar.f18694b = pVar2;
                }
                gVar.K(bVarA, bVar2);
                gVar.f132694m.set(bVarA);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004b -> B:21:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0081 -> B:28:0x0085). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object u(ok2.g r13, v13.c r14) {
        /*
            r13.getClass()
            boolean r0 = r14 instanceof ok2.j
            if (r0 == 0) goto L16
            r0 = r14
            ok2.j r0 = (ok2.j) r0
            int r1 = r0.f132749i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f132749i = r1
            goto L1b
        L16:
            ok2.j r0 = new ok2.j
            r0.<init>(r13, r14)
        L1b:
            java.lang.Object r14 = r0.f132747g
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f132749i
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L39
            int r13 = r0.f132746f
            int r2 = r0.f132745e
            java.util.Iterator r4 = r0.f132744d
            wk2.h r5 = r0.f132743c
            wk2.h[] r6 = r0.f132742b
            ok2.g r7 = r0.f132741a
            o13.r.b(r14)     // Catch: java.lang.Exception -> L36
            goto L85
        L36:
            r14 = move-exception
            goto L91
        L39:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r13)
            r13 = 0
            return r13
        L40:
            o13.r.b(r14)
            wk2.h[] r14 = wk2.h.values()
            int r2 = r14.length
            r4 = 0
        L49:
            if (r4 >= r2) goto Lb2
            r5 = r14[r4]
            ok2.b r6 = r13.f132683b
            ok2.d r6 = r6.getConfiguration()
            java.util.List r6 = r6.k(r5)
            java.util.Iterator r6 = r6.iterator()
            r12 = r4
            r4 = r2
            r2 = r12
        L5e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lac
            java.lang.Object r7 = r6.next()
            pk2.z r7 = (pk2.z) r7
            rs2.c r8 = r13.f132682a     // Catch: java.lang.Exception -> L8a
            r0.f132741a = r13     // Catch: java.lang.Exception -> L8a
            r0.f132742b = r14     // Catch: java.lang.Exception -> L8a
            r0.f132743c = r5     // Catch: java.lang.Exception -> L8a
            r0.f132744d = r6     // Catch: java.lang.Exception -> L8a
            r0.f132745e = r2     // Catch: java.lang.Exception -> L8a
            r0.f132746f = r4     // Catch: java.lang.Exception -> L8a
            r0.f132749i = r3     // Catch: java.lang.Exception -> L8a
            java.lang.Object r7 = r7.e(r8, r0)     // Catch: java.lang.Exception -> L8a
            if (r7 != r1) goto L81
            goto Lb4
        L81:
            r7 = r13
            r13 = r4
            r4 = r6
            r6 = r14
        L85:
            r14 = r6
            r6 = r4
            r4 = r13
            r13 = r7
            goto L5e
        L8a:
            r7 = move-exception
            r12 = r7
            r7 = r13
            r13 = r4
            r4 = r6
            r6 = r14
            r14 = r12
        L91:
            org.slf4j.Logger r8 = r7.f132688g
            java.lang.String r9 = r5.f185854a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Failed to finish "
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r9 = " Agent"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.error(r9, r14)
            goto L85
        Lac:
            int r2 = r2 + 1
            r12 = r4
            r4 = r2
            r2 = r12
            goto L49
        Lb2:
            kotlin.Unit r1 = p005kotlin.Unit.INSTANCE
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ok2.g.u(ok2.g, v13.c):java.lang.Object");
    }

    public final zk2.a A() {
        return (zk2.a) this.f132697p.getValue();
    }

    public final lk2.b B() {
        return this.f132683b.c(this.f132682a.getF92741e());
    }

    public final al2.k C(UUID uuid) {
        uuid.getClass();
        bl2.b bVar = this.f132694m.get();
        if (p005kotlin.jvm.internal.s.g(bVar != null ? bVar.f18603d.getId() : null, uuid) && !bVar.e() && bVar.f18603d.getF205158h() == null) {
            return al2.k.STARTED;
        }
        wk2.i iVarE = this.f132695n.e(uuid);
        if (iVarE == null) {
            return null;
        }
        pk2.x f205158h = iVarE.getF205158h();
        if ((f205158h != null ? f205158h.f138496a : null) != pk2.y.SUCCESS) {
            pk2.x f205158h2 = iVarE.getF205158h();
            if ((f205158h2 != null ? f205158h2.f138496a : null) != pk2.y.TREAT_AS_SUCCESS) {
                pk2.x f205158h3 = iVarE.getF205158h();
                if (f205158h3 == null) {
                    return al2.k.QUEUED;
                }
                al2.k.f3808b.getClass();
                return al2.k.a.a(f205158h3, true);
            }
        }
        return al2.k.SUCCESS;
    }

    public final bl2.b D() {
        bl2.b bVar;
        synchronized (this.f132692k.f132601c) {
            try {
                bVar = this.f132694m.get();
                pk2.x xVarC = pk2.x.a.c(pk2.x.f138495e, ok2.e.f132639g, null, null, 6);
                this.f132695n.r(bVar != null ? bVar.f18603d.getId() : null, xVarC);
                if (bVar != null) {
                    bVar.m(true, xVarC.f138498c);
                }
                this.f132688g.debug("startNextItem: interrupt active item " + (bVar != null ? bVar.f18603d.getId() : null));
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return bVar;
    }

    public final void E(zk2.k kVar) {
        String andSet;
        String str = kVar.f205152b.f185844c == wk2.h.PHONE_TO_DEVICE ? "Download" : "Upload";
        zk2.a aVarA = A();
        o oVar = new o(this);
        aVarA.getClass();
        if (kVar.f205152b.a() && kVar.f205155e.a() <= 36) {
            wk2.f fVar = kVar.f205152b;
            pk2.c0 c0VarInvoke = aVarA.f205102f.invoke();
            if ((c0VarInvoke != null ? cl2.c.l(c0VarInvoke, aVarA.f205099c, fVar) : false) && aVarA.g()) {
                if (aVarA.g() && (andSet = aVarA.f205107k.getAndSet(null)) != null) {
                    aVarA.f205103g.debug("Clear stale interrupt: ".concat(andSet));
                }
                ge1.b.T(aVarA.f205100d, null, null, new zk2.b(aVarA, kVar, oVar, null), 3);
                return;
            }
        }
        F(kVar, false, am.j.m("onNew", str, "Available"));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:27:0x00af  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b2  */
    public final void F(wk2.i iVar, boolean z14, String str) {
        String str2;
        wk2.e f205153c;
        wk2.o oVar;
        iVar.getClass();
        if (str == null) {
            str2 = iVar.getDirection() == wk2.h.PHONE_TO_DEVICE ? "sendFileToDevice" : "readFileFromDevice";
        } else {
            str2 = str;
        }
        zk2.d dVar = this.f132695n;
        dVar.getClass();
        dVar.c(iVar, false);
        lk2.b bVarB = B();
        rs2.c cVar = this.f132682a;
        Logger logger = this.f132688g;
        if (bVarB == null) {
            logger.warn(str2 + " when not connected. Queued: " + iVar + " for later");
            al2.l lVar = new al2.l(cVar, iVar.getF205155e(), iVar.getF205152b(), al2.k.REJECTED, null, null, null, new DeviceNotConnectedException(), null, null, 880, null);
            al2.m f205159i = iVar.getF205159i();
            if (f205159i != null) {
                f205159i.u(lVar);
                return;
            }
            return;
        }
        bl2.b bVar = this.f132694m.get();
        if (z14 || bVar == null) {
            f205153c = iVar.getF205153c();
            if (f205153c instanceof wk2.o) {
                oVar = (wk2.o) f205153c;
            } else {
                oVar = null;
            }
            if (oVar != null) {
                oVar.j();
            }
            J(this, str2, null, false, 6);
        } else {
            wk2.i iVar2 = bVar.f18603d;
            if (bVar.e() || !cl2.c.g(this.f132683b, iVar.getF205155e()).contains(iVar2.getF205155e()) || iVar2.getF205155e().a() < 20) {
                f205153c = iVar.getF205153c();
                if (f205153c instanceof wk2.o) {
                    oVar = (wk2.o) f205153c;
                } else {
                    oVar = null;
                }
                if (oVar != null) {
                    oVar.j();
                }
                J(this, str2, null, false, 6);
            }
        }
        al2.k kVarC = C(iVar.getId());
        al2.k kVar = al2.k.QUEUED;
        if (kVarC == kVar) {
            logger.debug(str2 + " when device is busy. Queued: " + iVar + " for later");
            al2.m f205159i2 = iVar.getF205159i();
            if (f205159i2 != null) {
                f205159i2.u(new al2.l(cVar, iVar, kVar));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G(wk2.i iVar, boolean z14, v13.c cVar) {
        r rVar;
        g gVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f132793f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f132793f = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        Object obj = rVar.f132791d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f132793f;
        if (i15 == 0) {
            o13.r.b(obj);
            s sVar = new s(this, null);
            rVar.f132788a = this;
            rVar.f132789b = iVar;
            rVar.f132790c = z14;
            rVar.f132793f = 1;
            if (j2.c(1000L, sVar, rVar) == aVar) {
                return aVar;
            }
            gVar = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z14 = rVar.f132790c;
            iVar = rVar.f132789b;
            gVar = rVar.f132788a;
            o13.r.b(obj);
        }
        gVar.F(iVar, z14, null);
        return Unit.INSTANCE;
    }

    public final void H(y yVar, e23.p<? super al2.b, ? super CoreTransferException, Unit> pVar) {
        yVar.getClass();
        long j8 = SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US / ((long) 2);
        g0 g0Var = yVar.f132811e;
        lk2.b bVarB = B();
        boolean z14 = yVar.f132812f;
        if (bVarB != null) {
            if (z14 || yVar.f132813g == y.b.NO_CACHE_ALLOWED) {
                this.f132692k.c();
            }
            ge1.b.T(this.f132687f, null, null, new t(j8, yVar, this, pVar, null), 3);
            return;
        }
        if (z14) {
            this.f132686e.set(true);
        }
        y.a aVar = new y.a(yVar);
        aVar.f132814a = l0.f134950a;
        y.d dVar = y.d.BLOCKED;
        dVar.getClass();
        aVar.f132816c = dVar;
        aVar.f132818e = g0Var;
        this.f132696o.k(new y(aVar));
        this.f132688g.warn("requestSync(" + g0Var + ") when not connected. Download items will be queued for later");
        if (pVar != null) {
            pVar.invoke(al2.b.REJECTED, new DeviceNotConnectedException());
        }
    }

    public final boolean I(Integer num, String str) {
        str.getClass();
        bl2.b bVar = this.f132694m.get();
        UUID id3 = bVar != null ? bVar.f18603d.getId() : null;
        this.f132688g.debug(str + " shouldAttemptSync minPriority=" + num + ", active=" + id3 + ", batch=" + this.f132692k.f132603e);
        return this.f132695n.h(num != null ? num.intValue() : 0, id3, false);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    public final void K(bl2.b bVar, bl2.b bVar2) throws Throwable {
        Throwable th3;
        g0 f205155e;
        synchronized (this.f132692k.f132601c) {
            try {
                bl2.b bVar3 = this.f132694m.get();
                if (bVar3 != null) {
                    try {
                        wk2.i iVar = bVar3.f18603d;
                        if (iVar != null) {
                            f205155e = iVar.getF205155e();
                        } else {
                            f205155e = null;
                        }
                    } catch (Throwable th4) {
                        th3 = th4;
                        throw th3;
                    }
                } else {
                    f205155e = null;
                }
                try {
                    bVar.l(new h(bVar2, f205155e, this, bVar, null), new i(null), new oe.j(4, this, bVar));
                } catch (Throwable th5) {
                    th = th5;
                    th3 = th;
                    throw th3;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    public final zk2.k L(bl2.b bVar) {
        synchronized (this.f132692k.f132601c) {
            try {
                ArrayList arrayListS = this.f132695n.s(new oe2.g(8), new nw0.f(this, 15));
                if (arrayListS.isEmpty()) {
                    return null;
                }
                if (bVar != null && arrayListS.contains(bVar.f18603d)) {
                    this.f132688g.info("Downgrading priority of transfer " + bVar.f18603d);
                    ge1.b.T(bVar.f18601b, null, null, new bl2.k(bVar, null), 3);
                }
                zk2.k kVarN = zk2.d.n(this.f132695n, bVar != null ? bVar.f18603d.getId() : null);
                if (bVar != null && kVarN != null) {
                    this.f132692k.e(bVar.f18603d.getF205155e(), kVarN.f205155e);
                }
                return kVarN;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // bl2.o.b
    public final void a(al2.l lVar, al2.m mVar) {
        b bVar = f132677s;
        Logger logger = this.f132688g;
        bVar.getClass();
        b.a(logger, "notifyFileEvent", lVar);
        if (mVar != null) {
            mVar.u(lVar);
        }
        this.f132684c.u(lVar);
        al2.q qVar = this.f132689h;
        qVar.getClass();
        al2.k kVar = lVar.f3822d;
        if (kVar.f3817a) {
            if (kVar == al2.k.SKIPPED) {
                CoreTransferException coreTransferException = lVar.f3826h;
                if ((coreTransferException != null ? coreTransferException.getFailure() : null) == ok2.e.D) {
                    return;
                }
            }
            synchronized (qVar.f3842c) {
                qVar.f3844e.add(lVar);
            }
        }
    }

    @Override // ok2.z
    public final g0 c() {
        wk2.i iVar;
        bl2.b bVar = this.f132694m.get();
        if ((bVar != null && bVar.e()) || bVar == null || (iVar = bVar.f18603d) == null) {
            return null;
        }
        return iVar.getF205155e();
    }

    @Override // lk2.c
    public final void d() {
        if (B() == null) {
            this.f132688g.warn("onCommunicationReady called but missing fileTransferHandler, likely due to disconnect");
        } else {
            ge1.b.T(this.f132687f, null, null, new l(this, null), 3);
        }
    }

    @Override // lk2.c
    public final void e() {
        this.f132688g.debug("onSyncNotification");
        y.d dVar = y.d.DEFAULT;
        H(new y(new y.a(null, null, dVar, dVar, f132679u, true, y.b.DOWNLOAD_CACHE_PREFERRED, 3, null)), null);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000d A[PHI: r2
      0x000d: PHI (r2v22 int) = (r2v20 int), (r2v21 int) binds: [B:5:0x000b, B:8:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // lk2.c
    public final void g(lk2.z zVar) {
        Integer numValueOf;
        Integer num = zVar.f113315b;
        if (num != null) {
            int iIntValue = num.intValue();
            int i14 = 19;
            if (iIntValue <= 19) {
                iIntValue = i14;
            } else {
                i14 = 29;
                if (iIntValue <= 29) {
                    iIntValue = i14;
                }
            }
            numValueOf = Integer.valueOf(iIntValue);
        } else {
            numValueOf = null;
        }
        boolean z14 = false;
        if (zVar.f113314a == GDIFileAccess.ResourceUpdateNotification.Status.FILE_SPACE_FREED) {
            this.f132688g.debug("onResourceUpdated: any no space errors can be re-tried");
            zk2.d dVar = this.f132695n;
            Logger logger = zk2.d.f205126e;
            Map<UUID, zk2.k> map = dVar.f205129c;
            map.getClass();
            synchronized (map) {
                try {
                    Map<UUID, zk2.k> map2 = dVar.f205129c;
                    map2.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<UUID, zk2.k> entry : map2.entrySet()) {
                        zk2.k value = entry.getValue();
                        if (value.f205152b.f185844c == wk2.h.PHONE_TO_DEVICE) {
                            pk2.x xVar = value.f205158h;
                            if ((xVar != null ? xVar.f138498c : null) == ok2.e.f132654x && value.f205160j != null) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        zk2.k kVar = (zk2.k) ((Map.Entry) it.next()).getValue();
                        Long l14 = kVar.f205160j;
                        kVar.f205160j = Long.valueOf((l14 != null ? l14.longValue() : 0L) - dVar.f205127a.b());
                        kVar.f205161k--;
                        z14 = true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        ok2.c cVar = this.f132692k;
        int iIntValue2 = cVar.f132606h.get().f128594a.intValue();
        boolean z15 = cVar.f132607i.get();
        if (numValueOf == null || numValueOf.intValue() < iIntValue2) {
            cVar.c();
            cVar.f132600b.debug("Clearing lastRejectedPriority since " + numValueOf + " was lower");
        }
        if (iIntValue2 > -1 || z15 || A().f205107k.get() != null) {
            z14 = true;
        }
        bl2.b bVar = this.f132694m.get();
        if (bVar != null && !bVar.e()) {
            this.f132688g.debug("Ignoring onResourceUpdated: " + bVar.f18603d.getId() + " is already active");
            return;
        }
        if (z14) {
            if (I(numValueOf != null ? Integer.valueOf(numValueOf.intValue() + 1) : null, "onResourceUpdated")) {
                ge1.b.T(this.f132687f, null, null, new C2521g(zVar, null), 3);
                return;
            }
        }
        Logger logger2 = this.f132688g;
        if (!z14) {
            logger2.debug("Ignoring onResourceUpdated: no rejected/interrupted transfer");
            return;
        }
        logger2.debug("Ignoring onResourceUpdated: no queued items above " + numValueOf + " priority");
    }

    @Override // bl2.b.InterfaceC0272b
    public final boolean h(int i14, UUID uuid) {
        return this.f132695n.h(i14, uuid, true);
    }

    @Override // bl2.o.b
    public final void i(wk2.i iVar, al2.l lVar) {
        iVar.getClass();
        if (iVar.getF205158h() == null) {
            this.f132688g.warn("Cannot complete file " + iVar.getId() + " unknown status");
            return;
        }
        boolean z14 = lVar.f3822d.f3817a;
        ok2.c cVar = this.f132692k;
        if (z14) {
            cVar.f132604f.set(0L);
        }
        a(lVar, iVar.getF205159i());
        al2.a.C0065a c0065a = al2.a.f3758i;
        g0 f205155e = iVar.getF205155e();
        Float f14 = cVar.f132605g.get();
        f14.getClass();
        float fFloatValue = f14.floatValue();
        Collection<g0> collectionG = cl2.c.g(this.f132683b, iVar.getF205155e());
        iVar.getId();
        zk2.d.c cVarG = this.f132695n.g(collectionG);
        c0065a.getClass();
        f205155e.getClass();
        al2.a aVar = new al2.a(this.f132682a, f205155e, cVarG.f205131a, cVarG.f205132b, fFloatValue, cVarG.f205133c > 0, 100.0f);
        cVar.f132605g.set(Float.valueOf(aVar.a()));
        this.f132684c.s(aVar);
    }

    @Override // bl2.b.InterfaceC0272b
    public final Unit j(wk2.i iVar, pk2.x xVar) {
        iVar.getClass();
        this.f132695n.r(iVar.getId(), xVar);
        return Unit.INSTANCE;
    }

    @Override // bl2.o.b
    public final void k(wk2.i iVar, s4 s4Var) {
        wk2.i iVar2;
        g0 f205155e;
        iVar.getClass();
        cz2.g<Unit> gVar = this.f132692k.f132602d.get();
        gVar.f56899c.set(gVar.f56898b.millis());
        synchronized (this.f132692k.f132601c) {
            if (!this.f132692k.b()) {
                s4Var.invoke();
                bl2.b bVar = this.f132694m.get();
                if (bVar != null && (iVar2 = bVar.f18603d) != null && (f205155e = iVar2.getF205155e()) != null) {
                    this.f132692k.d(f205155e);
                    Unit unit = Unit.INSTANCE;
                    u53.d dVar = this.f132687f;
                    x53.c cVar = s0.f129406a;
                    ge1.b.T(dVar, x53.b.f189152a, null, new k(this, null), 2);
                    this.f132688g.info("notifyStartBatch(" + f205155e + ")");
                    zk2.a aVarA = A();
                    String andSet = aVarA.f205107k.getAndSet(null);
                    if (andSet != null) {
                        aVarA.f205103g.debug("Clear stale interrupt: ".concat(andSet));
                    }
                    al2.c cVar2 = new al2.c(this.f132682a, f205155e, al2.b.STARTED, null, null, 0, false, false, 248, null);
                    this.f132684c.y(cVar2);
                    this.f132689h.a(cVar2);
                }
            }
        }
        a(new al2.l(this.f132682a, iVar, al2.k.STARTED), iVar.getF205159i());
    }

    @Override // bl2.o.b
    public final void m(wk2.i iVar, long j8, long j14) {
        iVar.getClass();
        ok2.c cVar = this.f132692k;
        cz2.g<Unit> gVar = cVar.f132602d.get();
        gVar.f56899c.set(gVar.f56898b.millis());
        cVar.f132599a.a();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = cVar.f132604f;
        if (jElapsedRealtime - atomicLong.get() >= 500) {
            atomicLong.set(jElapsedRealtime);
            g0 f205155e = iVar.getF205155e();
            wk2.f f205152b = iVar.getF205152b();
            rs2.c cVar2 = this.f132682a;
            al2.n nVar = new al2.n(cVar2, f205155e, f205152b, j8, j14);
            al2.m f205159i = iVar.getF205159i();
            if (f205159i != null) {
                f205159i.B(nVar);
            }
            al2.f fVar = this.f132684c;
            fVar.B(nVar);
            al2.a.C0065a c0065a = al2.a.f3758i;
            g0 f205155e2 = iVar.getF205155e();
            Float f14 = cVar.f132605g.get();
            f14.getClass();
            float fFloatValue = f14.floatValue();
            g0 f205155e3 = iVar.getF205155e();
            ok2.b bVar = this.f132683b;
            Collection<g0> collectionG = cl2.c.g(bVar, f205155e3);
            iVar.getId();
            zk2.d.c cVarG = this.f132695n.g(collectionG);
            c0065a.getClass();
            f205155e2.getClass();
            al2.a aVar = new al2.a(cVar2, f205155e2, cVarG.f205131a, cVarG.f205132b, fFloatValue, cVarG.f205133c > 0, 99.9f);
            cVar.f132605g.set(Float.valueOf(aVar.a()));
            fVar.s(aVar);
            if (!p13.h0.R(f132680v, iVar.getF205155e()) || bVar.getConfiguration().p()) {
                return;
            }
            J(this, "app backgrounded", null, false, 6);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.garmin.device.filetransfer.core.background.a$b, java.lang.Object] */
    @Override // lk2.c
    public final void n(ArrayList arrayList) {
        g gVar = this;
        if (arrayList.isEmpty()) {
            return;
        }
        ok2.d configuration = gVar.f132683b.getConfiguration();
        List<pk2.f0> list = configuration.f132627g;
        r0 r0Var = new r0();
        ?? A = gVar.f132685d.a(System.currentTimeMillis(), arrayList);
        r0Var.f105810a = A;
        com.garmin.device.filetransfer.core.background.a.b.f50787e.getClass();
        boolean zG = p005kotlin.jvm.internal.s.g(A, com.garmin.device.filetransfer.core.background.a.b.f50788f);
        Logger logger = gVar.f132688g;
        if (!zG) {
            logger.debug("delayAttempt(" + r0Var.f105810a + ")");
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        ConcurrentLinkedQueue concurrentLinkedQueue2 = new ConcurrentLinkedQueue();
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            wk2.f fVarN = cl2.c.n((lk2.a) it.next());
            UUID uuid = fVarN.f185842a;
            lk2.w wVar = gVar.f132699r.get(uuid);
            if (wVar != null) {
                Set<UUID> set = wVar.f113307b;
                Set<UUID> set2 = fVarN.f185846e;
                Set setF1 = set2 != null ? p13.h0.f1(set2) : new LinkedHashSet();
                setF1.addAll(set);
                logger.debug("Reconciling early flags update for " + uuid + ", added " + set);
                wk2.f.f185841i.getClass();
                fVarN = wk2.f.a.b(fVarN, setF1, null);
            }
            arrayList2.add(fVarN);
            concurrentLinkedQueue2 = concurrentLinkedQueue2;
        }
        ConcurrentLinkedQueue concurrentLinkedQueue3 = concurrentLinkedQueue2;
        Iterator<T> it3 = list.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            u53.d dVar = gVar.f132687f;
            if (!zHasNext) {
                ge1.b.T(dVar, null, null, new q(concurrentLinkedQueue, arrayList2, concurrentLinkedQueue3, r0Var, atomicBoolean, arrayList, this, configuration, null), 3);
                return;
            }
            ArrayList arrayList3 = arrayList2;
            AtomicBoolean atomicBoolean2 = atomicBoolean;
            atomicBoolean = atomicBoolean2;
            concurrentLinkedQueue.add(ge1.b.T(dVar, null, null, new p(gVar, arrayList3, (pk2.f0) it3.next(), list, concurrentLinkedQueue3, r0Var, atomicBoolean2, null), 3));
            gVar = this;
            arrayList2 = arrayList3;
        }
    }

    @Override // bl2.b.InterfaceC0272b
    public final Integer o(wk2.i iVar) {
        Object next;
        iVar.getClass();
        Iterator<T> it = cl2.c.g(this.f132683b, iVar.getF205155e()).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iA = ((g0) next).a();
                do {
                    Object next2 = it.next();
                    int iA2 = ((g0) next2).a();
                    if (iA > iA2) {
                        next = next2;
                        iA = iA2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        g0 g0Var = (g0) next;
        if (!h(g0Var != null ? g0Var.a() : 0, iVar.getId())) {
            return null;
        }
        g0 g0Var2 = this.f132692k.f132603e;
        return Integer.valueOf(g0Var2 != null ? g0Var2.a() : iVar.getF205155e().a());
    }

    @Override // lk2.c
    public final void t(lk2.w wVar) {
        zk2.k kVar;
        lk2.w wVar2;
        pk2.x xVar;
        zk2.d dVar = this.f132695n;
        f fVar = new f(this);
        dVar.getClass();
        UUID uuid = wVar.f113306a;
        Map<UUID, zk2.k> map = dVar.f205129c;
        map.getClass();
        synchronized (map) {
            try {
                kVar = dVar.f205129c.get(uuid);
                if (kVar == null) {
                    kVar = null;
                } else {
                    Set<UUID> set = kVar.f205152b.f185846e;
                    Set setF1 = set != null ? p13.h0.f1(set) : new LinkedHashSet();
                    Iterator<T> it = wVar.f113308c.iterator();
                    while (it.hasNext()) {
                        setF1.remove((UUID) it.next());
                    }
                    setF1.addAll(wVar.f113307b);
                    wk2.f.a aVar = wk2.f.f185841i;
                    wk2.f fVar2 = kVar.f205152b;
                    aVar.getClass();
                    wk2.f fVarB = wk2.f.a.b(fVar2, setF1, null);
                    kVar.f205152b = fVarB;
                    if (((Boolean) fVar.invoke(fVarB)).booleanValue()) {
                        zk2.d.f205126e.warn("Remove " + kVar.f205152b + " that was archived on device by another app");
                        dVar.r(uuid, pk2.x.a.c(pk2.x.f138495e, ok2.e.D, null, pk2.y.TREAT_AS_SUCCESS, 2));
                        dVar.o(uuid);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (((kVar == null || (xVar = kVar.f205158h) == null) ? null : xVar.f138498c) == ok2.e.D) {
            a(new al2.l(this.f132682a, kVar, al2.k.SKIPPED), kVar.f205159i);
        } else if (kVar == null && !wVar.f113307b.isEmpty()) {
            lk2.w wVar3 = this.f132699r.get(wVar.f113306a);
            if (wVar3 != null) {
                Set setF2 = p13.h0.f1(wVar3.f113307b);
                setF2.addAll(wVar.f113307b);
                wVar2 = new lk2.w(wVar.f113306a, setF2, c1.h(wVar3.f113308c, wVar.f113308c));
            } else {
                wVar2 = wVar;
            }
            this.f132699r.put(wVar.f113306a, wVar2);
            ge1.b.T(this.f132687f, null, null, new e(wVar, null), 3);
        }
        bl2.b bVar = this.f132694m.get();
        if (bVar == null || bVar.e() || !(bVar instanceof bl2.r) || !p005kotlin.jvm.internal.s.g(bVar.f18603d.getId(), wVar.f113306a) || wVar.f113307b.isEmpty()) {
            return;
        }
        this.f132688g.debug("Active item " + bVar.f18603d.getId() + " had flags updated: " + wVar.f113307b + ", removed: " + wVar.f113308c);
        ((bl2.r) bVar).f18711m.addAll(wVar.f113307b);
    }

    public final void v(zk2.k kVar, e23.p pVar) {
        synchronized (this.f132692k.f132601c) {
            try {
                this.f132688g.debug("startNextItem: already processing " + (kVar == null ? this.f132692k.f132603e : kVar));
                if (pVar != null) {
                    pVar.invoke(al2.b.REJECTED, new CoreTransferException(ok2.e.f132641i, "Sync is already running " + (kVar != null ? kVar.f205152b.f185842a : null), null, 4, null));
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void w(String str, pk2.x xVar) {
        bl2.b bVar = this.f132694m.get();
        if (bVar != null) {
            wk2.i iVar = bVar.f18603d;
            this.f132688g.warn(str + ": cancelling active item " + iVar.getId());
            this.f132695n.r(iVar.getId(), xVar);
            bVar.m(false, xVar.f138498c);
        }
        A().e(null, xVar);
    }

    public final void x(String str) {
        this.f132688g.info("close(" + str + ")");
        ge1.b.T(this.f132687f, null, null, new ok2.h(this, str, null), 3);
    }

    public final boolean y(g0 g0Var) {
        synchronized (this.f132692k.f132601c) {
            try {
                if (!this.f132692k.a()) {
                    return false;
                }
                o13.p<Integer, List<al2.j>> pVarD = this.f132695n.d();
                int iIntValue = pVarD.f128594a.intValue();
                List<al2.j> list = pVarD.f128595b;
                al2.c.a.C0066a c0066a = al2.c.a.f3783h;
                rs2.c cVar = this.f132682a;
                boolean z14 = B() != null;
                c0066a.getClass();
                g0Var.getClass();
                al2.c.a aVar = new al2.c.a(cVar, g0Var, null, null, null, iIntValue, z14, 28, null);
                aVar.a(list);
                this.f132683b.getConfiguration();
                Logger logger = this.f132688g;
                logger.getClass();
                if (aVar.f3790g.f3774a) {
                    try {
                        ok2.d.m(aVar);
                    } catch (Exception e4) {
                        logger.error("Failed filterBatchResult", (Throwable) e4);
                    }
                }
                al2.c cVar2 = new al2.c(aVar.f3784a, aVar.f3785b, aVar.f3790g, aVar.f3786c, aVar.f3787d, aVar.f3788e, aVar.f3789f, false, 128, null);
                int i14 = c.f132702a[cVar2.f3777c.ordinal()];
                Logger logger2 = this.f132688g;
                if (i14 == 1) {
                    logger2.warn("notifyCompleteBatch(" + g0Var + "): " + cVar2);
                } else {
                    String str = "notifyCompleteBatch(" + g0Var + "): " + cVar2;
                    logger2.getClass();
                    if (cVar2.f3777c != al2.b.SUCCESS) {
                        logger2.error(str);
                    } else {
                        logger2.debug(str);
                    }
                }
                this.f132684c.y(cVar2);
                this.f132689h.a(cVar2);
                ge1.b.T(this.f132687f, null, null, new d(null), 3);
                al2.b bVar = cVar2.f3777c;
                al2.b bVar2 = al2.b.SUCCESS;
                ok2.c cVar3 = this.f132692k;
                if (bVar != bVar2) {
                    cVar3.f(cVar2.f3776b, cVar2.f3778d);
                    try {
                        ok2.d configuration = this.f132683b.getConfiguration();
                        this.f132690i.b();
                        h23.c.f81216a.getClass();
                        long jC = 300000 + ((long) (h23.c.f81217b.c(6) * DateTimeConstants.MILLIS_PER_MINUTE));
                        Context context = configuration.f132622b;
                        if (context != null) {
                            String f92741e = this.f132682a.getF92741e();
                            vk2.a aVarB = this.f132683b.b();
                            com.garmin.device.filetransfer.core.background.a.C1027a c1027a = com.garmin.device.filetransfer.core.background.a.f50783c;
                            com.garmin.device.filetransfer.core.background.a.b(context, jC, f92741e, aVarB, ue.l.APPEND_OR_REPLACE);
                        }
                    } catch (Throwable th3) {
                        this.f132688g.error("Failed to scheduleBackgroundRetry. Retry will occur on next appropriate sync: " + th3.getMessage());
                    }
                } else {
                    cVar3.c();
                }
                return true;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final ArrayList z() {
        ok2.d configuration = this.f132683b.getConfiguration();
        Set setH1 = p13.h0.h1(configuration.f132621a, configuration.f132627g);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setH1) {
            if (obj instanceof pk2.a0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lok2/g$b;", "", "<init>", "()V", "", "PROGRESS_NOTIFICATION_INTERVAL", "I", "", "INACTIVE_SYNC_TIMEOUT", "J", "DEVICE_NOTIFICATION_BATCH_DELAY", "MIN_PRIORITY", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f132701a;

            static {
                int[] iArr = new int[al2.k.values().length];
                try {
                    iArr[al2.k.REJECTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[al2.k.INTERRUPTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[al2.k.SKIPPED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f132701a = iArr;
            }
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static void a(Logger logger, String str, al2.l lVar) {
            logger.getClass();
            str.getClass();
            al2.k kVar = lVar.f3822d;
            String str2 = str + "(" + kVar + "): " + lVar;
            int i14 = a.f132701a[kVar.ordinal()];
            if (i14 == 1 || i14 == 2 || i14 == 3) {
                logger.warn(str2);
                return;
            }
            boolean z14 = kVar.f3817a;
            if (p005kotlin.jvm.internal.s.g(lVar.a(), Boolean.FALSE)) {
                logger.error(str2);
            } else if (z14) {
                logger.info(str2);
            } else {
                logger.debug(str2);
            }
        }

        private b() {
        }
    }
}
