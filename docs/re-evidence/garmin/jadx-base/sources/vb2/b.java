package vb2;

import com.google.common.util.concurrent.ListenableFuture;
import dz2.c;
import e23.p;
import eh2.e;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ml2.l;
import ml2.r;
import ml2.y;
import o53.b0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import r1.q2;
import u53.d;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lvb2/b;", "Leh2/e;", "Lml2/l;", "mCommunicator", "", "mIntervalSeconds", "<init>", "(Lml2/l;I)V", "a", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f176922e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f176923f = LoggerFactory.getLogger("KeepAlive");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f176924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f176925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f176926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f176927d;

    /* JADX INFO: renamed from: vb2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.keepalive.KeepAlive$startService$1", f = "KeepAlive.kt", l = {78, 105}, m = "invokeSuspend")
    public static final class C3309b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f176928a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f176930c;

        /* JADX INFO: renamed from: vb2.b$b$a */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"vb2/b$b$a", "Lml2/y;", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements y {
            @Override // ml2.y
            public final void a(int i14, byte[] bArr) {
                bArr.getClass();
                try {
                    if (bArr.length < 2) {
                        b.f176923f.warn("Invalid KeepAlive message size:" + c.a(bArr));
                        return;
                    }
                    byte b14 = bArr[0];
                    if (b14 != 0) {
                        if (b14 != 2) {
                            b.f176923f.warn("Unexpected device KeepAlive request:" + c.a(bArr));
                            return;
                        }
                        if (bArr[1] != 0) {
                            b.f176923f.error("Failed to enable KeepAlive:" + c.a(bArr));
                        }
                    }
                } catch (Throwable th3) {
                    b.f176923f.error("Failed to parse KeepAlive data:" + c.a(bArr), th3);
                }
            }

            @Override // ml2.y
            public final void c(int i14) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3309b(int i14, t13.d<? super C3309b> dVar) {
            super(2, dVar);
            this.f176930c = i14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new C3309b(this.f176930c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C3309b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
        
            if (r4.a(r7, r6) == r0) goto L24;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f176928a;
            b bVar = b.this;
            try {
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                    } else {
                        if (i14 != 2) {
                            h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(obj);
                ListenableFuture<r> listenableFutureL = bVar.f176924a.l(this.f176930c, false);
                listenableFutureL.getClass();
                this.f176928a = 1;
                obj = t53.c.b(listenableFutureL, this);
                if (obj == aVar) {
                }
                return aVar;
                r rVar = (r) obj;
                if (rVar == null) {
                    return Unit.INSTANCE;
                }
                bVar.f176927d = rVar;
                rVar.d(new a());
                int i15 = bVar.f176925b;
                this.f176928a = 2;
            } catch (Throwable th3) {
                b.f176923f.error("Failed to start KeepAlive", th3);
            }
        }
    }

    private b(l lVar, int i14) {
        this.f176924a = lVar;
        this.f176925b = i14;
        this.f176926c = q2.l("KeepAlive");
    }

    public final Object a(int i14, C3309b c3309b) {
        if (i14 < 0) {
            i14 = 0;
        }
        this.f176925b = i14;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.putInt(1, i14);
        byte[] bArrArray = byteBufferAllocate.array();
        f176923f.debug("enableKeepAlive:" + i14 + " seconds; msg:" + c.a(bArrArray));
        r rVar = this.f176927d;
        if (rVar == null) {
            return Unit.INSTANCE;
        }
        bArrArray.getClass();
        Object objA = rVar.a(bArrArray, c3309b);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    @Override // eh2.e
    public final void b(int i14) {
        ge1.b.T(this.f176926c, null, null, new C3309b(i14, null), 3);
    }

    @Override // eh2.e
    public final void onDeviceDisconnect() {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lvb2/b$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "LOGGER", "Lorg/slf4j/Logger;", "", "DEFAULT_INTERVAL_SECONDS", "I", "", "KEEP_ALIVE_ID", "B", "ENABLE_KEEP_ALIVE_ID", "ENABLE_KEEP_ALIVE_RESPONSE_ID", "ENABLE_KEEP_ALIVE_RESPONSE_SUCCESS", "garmin-fitness-device-interface_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ b(l lVar, int i14, j jVar) {
        this(lVar, i14);
    }
}
