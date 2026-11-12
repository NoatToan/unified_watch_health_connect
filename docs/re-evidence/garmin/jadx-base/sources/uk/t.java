package uk;

import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
@v13.e(c = "com.dsi.vivoki.antble.gfdi.VivokiGfdiEmulator$handleDownloadRequest$1", f = "VivokiGfdiEmulator.kt", l = {432, 461, 480}, m = "invokeSuspend")
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.b0 f171741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.b0 f171742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f171743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteArrayOutputStream f171744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f171745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f171746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f171747g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 16})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        public a() {
            super(0);
        }

        @Override // e23.a
        public final Unit invoke() {
            t tVar = t.this;
            tVar.f171746f.f171699l.debug("File transfer complete. Removing chunker");
            tVar.f171746f.f171695h = null;
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003¸\u0006\u0000"}, d2 = {"com/dsi/vivoki/antble/gfdi/VivokiGfdiEmulator$handleDownloadRequest$1$bytes$1$1", "Ltk/g;", "", "vivoki_release"}, k = 1, mv = {1, 4, 0})
    public static final class b implements tk.g<byte[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t13.d f171749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f171750b;

        public b(t13.d dVar, t tVar) {
            this.f171749a = dVar;
            this.f171750b = tVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tk.g
        public final void a(Serializable serializable) {
            byte[] bArr = (byte[]) serializable;
            bArr.getClass();
            t tVar = this.f171750b;
            int i14 = tVar.f171747g;
            t13.d dVar = this.f171749a;
            if (i14 != 0 || tVar.f171746f.f171692e != 3) {
                int i15 = o13.q.f128596b;
                dVar.resumeWith(bArr);
                return;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(bArr, 0, 16);
            int i16 = 16;
            while (true) {
                int i17 = i16 + 16;
                if (i17 >= bArr.length) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArray.getClass();
                    int i18 = o13.q.f128596b;
                    dVar.resumeWith(byteArray);
                    return;
                }
                if (((byte) (bArr[i16 + 7] & Ascii.DLE)) == ((byte) 0)) {
                    byteArrayOutputStream.write(bArr, i16, 16);
                }
                i16 = i17;
            }
        }

        @Override // tk.g
        public final void b(String str) {
            t tVar = this.f171750b;
            tVar.f171746f.f171699l.error("Failed to read file " + tVar.f171747g + ": " + str);
            int i14 = o13.q.f128596b;
            this.f171749a.resumeWith(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(k kVar, int i14, t13.d dVar) {
        super(2, dVar);
        this.f171746f = kVar;
        this.f171747g = i14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        dVar.getClass();
        t tVar = new t(this.f171746f, this.f171747g, dVar);
        tVar.f171741a = (o53.b0) obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x010c  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0101, code lost:
    
        if (r0.c(androidx.media3.common.PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED, r14, r13) == r1) goto L45;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00b3, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r14v6, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r8v4, types: [byte[], java.io.Serializable] */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        o53.b0 b0Var;
        ?? r14;
        ByteArrayOutputStream byteArrayOutputStream;
        ?? r15;
        ?? r16;
        ?? r17;
        int length;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f171745e;
        k kVar = this.f171746f;
        try {
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    o53.b0 b0Var2 = this.f171741a;
                    this.f171742b = b0Var2;
                    this.f171743c = this;
                    this.f171745e = 1;
                    t13.i iVar = new t13.i(u13.f.b(this));
                    kVar.f171697j.e(this.f171747g, new b(iVar, this));
                    Object objA = iVar.a();
                    if (objA != aVar) {
                        b0Var = b0Var2;
                        obj = objA;
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    o53.b0 b0Var3 = this.f171742b;
                    o13.r.b(obj);
                    b0Var = b0Var3;
                } else {
                    if (i14 == 2) {
                        byteArrayOutputStream = this.f171744d;
                        r15 = (byte[]) this.f171743c;
                        b0Var = this.f171742b;
                        try {
                            o13.r.b(obj);
                            r16 = r15;
                        } catch (IOException e4) {
                            e = e4;
                            kVar.f171699l.error("Failed to send download response", (Throwable) e);
                            r16 = r15;
                        }
                        r17 = r16;
                        if (r17 != 0) {
                            if (r17.length > kVar.f171696i) {
                                kVar.f171696i = r17.length;
                                kVar.f171699l.info("EMT max file size = " + kVar.f171696i);
                            }
                            length = r17.length;
                            k.b bVar = k.f171687m;
                            if (length < 65261) {
                                ?? byteArrayOutputStream2 = new ByteArrayOutputStream();
                                byteArrayOutputStream2.write(0);
                                o72.t.d0(byteArrayOutputStream2, o72.t.r(r17.length, r17));
                                o72.t.e0(byteArrayOutputStream2, 0);
                                byteArrayOutputStream2.write(r17);
                                c0 c0Var = kVar.f171691d;
                                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                byteArray.getClass();
                                this.f171742b = b0Var;
                                this.f171743c = r17;
                                this.f171744d = byteArrayOutputStream;
                                this.f171745e = 3;
                            } else {
                                uk.b bVar2 = new uk.b(r17, kVar.f171688a, kVar.f171691d, 65261, kVar.f171699l);
                                kVar.f171695h = bVar2;
                                bVar2.f171617a = new a();
                                bVar2.a();
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i14 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
                c0 c0Var2 = kVar.f171691d;
                h hVar = h.ACK;
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                byteArray2.getClass();
                this.f171742b = b0Var;
                this.f171743c = r14;
                this.f171744d = byteArrayOutputStream;
                this.f171745e = 2;
                if (c0Var2.b(5002, hVar, byteArray2, this) != aVar) {
                    r16 = r14;
                    r17 = r16;
                    if (r17 != 0) {
                        if (r17.length > kVar.f171696i) {
                            kVar.f171696i = r17.length;
                            kVar.f171699l.info("EMT max file size = " + kVar.f171696i);
                        }
                        length = r17.length;
                        k.b bVar3 = k.f171687m;
                        if (length < 65261) {
                            ?? byteArrayOutputStream3 = new ByteArrayOutputStream();
                            byteArrayOutputStream3.write(0);
                            o72.t.d0(byteArrayOutputStream3, o72.t.r(r17.length, r17));
                            o72.t.e0(byteArrayOutputStream3, 0);
                            byteArrayOutputStream3.write(r17);
                            c0 c0Var3 = kVar.f171691d;
                            byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                            byteArray3.getClass();
                            this.f171742b = b0Var;
                            this.f171743c = r17;
                            this.f171744d = byteArrayOutputStream;
                            this.f171745e = 3;
                        } else {
                            uk.b bVar4 = new uk.b(r17, kVar.f171688a, kVar.f171691d, 65261, kVar.f171699l);
                            kVar.f171695h = bVar4;
                            bVar4.f171617a = new a();
                            bVar4.a();
                        }
                    }
                    return Unit.INSTANCE;
                }
            } catch (IOException e14) {
                e = e14;
                r15 = r14;
                kVar.f171699l.error("Failed to send download response", (Throwable) e);
                r16 = r15;
            }
            r14 = (byte[]) obj;
            byteArrayOutputStream = new ByteArrayOutputStream();
            if (r14 != 0) {
                byteArrayOutputStream.write(0);
                o72.t.e0(byteArrayOutputStream, r14.length);
            } else {
                byteArrayOutputStream.write(2);
            }
            return aVar;
        } catch (IOException e15) {
            kVar.f171699l.error("Failed to send file data", (Throwable) e15);
        }
    }
}
