package uk;

import androidx.media3.common.PlaybackException;
import bs2.q4;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Luk/b;", "", "", "data", "Lo53/b0;", "coroutineScope", "Luk/c0;", "writer", "", "maxPayloadSize", "Lorg/slf4j/Logger;", "logger", "<init>", "([BLo53/b0;Luk/c0;ILorg/slf4j/Logger;)V", "a", "vivoki_release"}, k = 1, mv = {1, 4, 0})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t.a f171617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f171618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f171619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f171620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o53.b0 f171621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c0 f171622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f171623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Logger f171624h;

    /* JADX INFO: renamed from: uk.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    @v13.e(c = "com.dsi.vivoki.antble.gfdi.FileDataChunker$sendNextPacket$1", f = "FileDataChunker.kt", l = {71}, m = "invokeSuspend")
    public static final class C3193b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o53.b0 f171625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o53.b0 f171626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f171627c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ByteArrayOutputStream f171629e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3193b(ByteArrayOutputStream byteArrayOutputStream, t13.d dVar) {
            super(2, dVar);
            this.f171629e = byteArrayOutputStream;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            dVar.getClass();
            C3193b c3193b = b.this.new C3193b(this.f171629e, dVar);
            c3193b.f171625a = (o53.b0) obj;
            return c3193b;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C3193b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f171627c;
            b bVar = b.this;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    o53.b0 b0Var = this.f171625a;
                    c0 c0Var = bVar.f171622f;
                    byte[] byteArray = this.f171629e.toByteArray();
                    byteArray.getClass();
                    this.f171626b = b0Var;
                    this.f171627c = 1;
                    if (c0Var.c(PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED, byteArray, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
            } catch (IOException e4) {
                bVar.f171624h.error("Failed to send file transfer data", (Throwable) e4);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public b(byte[] bArr, o53.b0 b0Var, c0 c0Var, int i14, Logger logger) {
        bArr.getClass();
        b0Var.getClass();
        c0Var.getClass();
        logger.getClass();
        this.f171620d = bArr;
        this.f171621e = b0Var;
        this.f171622f = c0Var;
        this.f171623g = i14;
        this.f171624h = logger;
    }

    public final void a() {
        byte[] bArr = this.f171620d;
        int iMin = Math.min(bArr.length - this.f171618b, this.f171623g);
        byte[] bArr2 = new byte[iMin];
        for (int i14 = 0; i14 < iMin; i14++) {
            byte b14 = bArr[this.f171618b + i14];
            this.f171619c = q4.a(b14, this.f171619c);
            bArr2[i14] = b14;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        o72.t.d0(byteArrayOutputStream, this.f171619c);
        o72.t.e0(byteArrayOutputStream, this.f171618b);
        byteArrayOutputStream.write(bArr2);
        this.f171624h.debug("Sending bytes " + this.f171618b + '-' + (this.f171618b + iMin));
        this.f171618b = this.f171618b + iMin;
        x53.c cVar = s0.f129406a;
        ge1.b.T(this.f171621e, x53.b.f189152a, null, new C3193b(byteArrayOutputStream, null), 2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luk/b$a;", "", "<init>", "()V", "", "DATA_MESSAGE_OVERHEAD", "I", "vivoki_release"}, k = 1, mv = {1, 4, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }
}
