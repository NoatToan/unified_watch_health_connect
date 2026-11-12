package ws2;

import e23.p;
import java.io.IOException;
import o13.r;
import o53.b0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.u;
import rs2.x;
import rs2.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.gfdi.file.FileManager$handleFileData$1", f = "FileManager.kt", l = {573}, m = "invokeSuspend")
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f186984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f186985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f186986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.gfdi.file.a f186987e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i14, byte[] bArr, x xVar, com.garmin.gfdi.file.a aVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f186984b = i14;
        this.f186985c = bArr;
        this.f186986d = xVar;
        this.f186987e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f186984b, this.f186985c, this.f186986d, this.f186987e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        byte[] bArr;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f186983a;
        try {
            if (i14 == 0) {
                r.b(obj);
                if (this.f186984b == 5004) {
                    bArr = new byte[]{2};
                } else {
                    Byte bF = u.F(this.f186985c);
                    bArr = new byte[]{bF != null ? bF.byteValue() : (byte) 0, 1};
                }
                x xVar = this.f186986d;
                y yVar = y.ACK;
                this.f186983a = 1;
                if (xVar.a(yVar, bArr, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (IOException e4) {
            Logger logger = this.f186987e.f52361b;
            if (logger == null) {
                s.m("logger");
                throw null;
            }
            logger.warn("Failed to send file transfer response", (Throwable) e4);
        }
        return Unit.INSTANCE;
    }
}
