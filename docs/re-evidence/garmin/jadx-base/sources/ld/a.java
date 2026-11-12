package ld;

import android.os.SystemClock;
import androidx.room.o;
import e23.l;
import e23.p;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import lc.u0;
import o13.r;
import o53.b0;
import o53.c2;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\n\u000bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lld/a;", "", "", "timeoutAmount", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Lld/a$b;", "watch", "<init>", "(JLjava/util/concurrent/TimeUnit;Lld/a$b;)V", "b", "a", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f111989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vd.d f111990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b0 f111991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f111992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f111993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f111994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicInteger f111995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicLong f111996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public vd.c f111997i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f111998j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c2 f111999k;

    public interface b {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "androidx.room.support.AutoCloser$decrementCountAndScheduleClose$2", f = "AutoCloser.android.kt", l = {167}, m = "invokeSuspend")
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f112000a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f112000a;
            if (i14 == 0) {
                r.b(obj);
                long j8 = a.this.f111994f;
                this.f112000a = 1;
                if (m0.b(j8, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            a aVar2 = a.this;
            synchronized (aVar2.f111993e) {
                try {
                    ((u0) aVar2.f111989a).getClass();
                    if (SystemClock.uptimeMillis() - aVar2.f111996h.get() >= aVar2.f111994f && aVar2.f111995g.get() == 0) {
                        o oVar = aVar2.f111992d;
                        if (oVar == null) {
                            throw new IllegalStateException("onAutoCloseCallback is null but it should  have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                        }
                        oVar.invoke();
                        vd.c cVar = aVar2.f111997i;
                        if (cVar != null && cVar.isOpen()) {
                            cVar.close();
                        }
                        aVar2.f111997i = null;
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new C2146a(null);
    }

    public a(long j8, TimeUnit timeUnit, b bVar) {
        timeUnit.getClass();
        bVar.getClass();
        this.f111989a = bVar;
        this.f111993e = new Object();
        this.f111994f = timeUnit.toMillis(j8);
        this.f111995g = new AtomicInteger(0);
        this.f111996h = new AtomicLong(SystemClock.uptimeMillis());
    }

    public final void a() {
        int iDecrementAndGet = this.f111995g.decrementAndGet();
        if (iDecrementAndGet < 0) {
            h.z("Unbalanced reference count.");
            return;
        }
        ((u0) this.f111989a).getClass();
        this.f111996h.set(SystemClock.uptimeMillis());
        if (iDecrementAndGet == 0) {
            b0 b0Var = this.f111991c;
            if (b0Var != null) {
                this.f111999k = ge1.b.T(b0Var, null, null, new c(null), 3);
            } else {
                s.m("coroutineScope");
                throw null;
            }
        }
    }

    public final <V> V b(l<? super vd.c, ? extends V> lVar) {
        lVar.getClass();
        try {
            return lVar.invoke(c());
        } finally {
            a();
        }
    }

    public final vd.c c() {
        c2 c2Var = this.f111999k;
        if (c2Var != null) {
            c2Var.c(null);
        }
        this.f111999k = null;
        this.f111995g.incrementAndGet();
        if (this.f111998j) {
            h.z("Attempting to open already closed database.");
            return null;
        }
        synchronized (this.f111993e) {
            vd.c cVar = this.f111997i;
            if (cVar != null && cVar.isOpen()) {
                return cVar;
            }
            vd.d dVar = this.f111990b;
            if (dVar == null) {
                s.m("delegateOpenHelper");
                throw null;
            }
            vd.c writableDatabase = dVar.getWritableDatabase();
            this.f111997i = writableDatabase;
            return writableDatabase;
        }
    }

    /* JADX INFO: renamed from: ld.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lld/a$a;", "", "<init>", "()V", "", "BUG_LINK", "Ljava/lang/String;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2146a {
        public /* synthetic */ C2146a(j jVar) {
            this();
        }

        private C2146a() {
        }
    }

    public /* synthetic */ a(long j8, TimeUnit timeUnit, b bVar, int i14, j jVar) {
        this(j8, timeUnit, (i14 & 4) != 0 ? new u0(2) : bVar);
    }
}
