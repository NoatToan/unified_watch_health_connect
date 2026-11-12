package ct2;

import bs2.q4;
import e23.l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import rs2.p;
import rs2.y;
import ss2.s;
import ss2.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001:\u0001\nB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lct2/f;", "", "Ljava/io/OutputStream;", "output", "Lrs2/f;", "customLogger", "Lrs2/p;", "gfdiWatchdog", "<init>", "(Ljava/io/OutputStream;Lrs2/f;Lrs2/p;)V", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f55541g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rs2.f f55542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f55543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Logger f55544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final it2.e f55545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft2.c f55546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference<s> f55547f;

    static {
        new a(null);
    }

    public f(OutputStream outputStream, rs2.f fVar, p pVar) {
        outputStream.getClass();
        this.f55542a = fVar;
        this.f55543b = pVar;
        rs2.d.f154380a.getClass();
        this.f55544c = LoggerFactory.getLogger(rs2.d.a("MessageWriter", -1L, this, null));
        this.f55545d = new it2.e(outputStream);
        this.f55546e = new ft2.c();
        this.f55547f = new AtomicReference<>(new u());
    }

    public final byte[] a(h hVar, int i14, l<? super ByteArrayOutputStream, Unit> lVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        lg.d.P(byteArrayOutputStream, 0);
        Integer num = hVar.f55555a;
        if (num != null) {
            byteArrayOutputStream.write(i14 - 5000);
            byteArrayOutputStream.write(num.intValue() | 128);
        } else {
            lg.d.P(byteArrayOutputStream, i14);
        }
        lVar.invoke(byteArrayOutputStream);
        if (byteArrayOutputStream.size() + 2 > 65535) {
            vb.h.C("Response payload is larger than 65535");
            return null;
        }
        lg.d.P(byteArrayOutputStream, 0);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        jg.b.T(0, byteArray.length, byteArray);
        int length = byteArray.length - 2;
        int iA = 0;
        for (int i15 = 0; i15 < length; i15++) {
            iA = q4.a(byteArray[i15], iA);
        }
        jg.b.T(byteArray.length - 2, iA, byteArray);
        return (i14 == 5000 && jg.b.K(4, byteArray) == 5111) ? byteArray : this.f55547f.get().encrypt(byteArray);
    }

    public final Object b(h hVar, int i14, y yVar, byte[] bArr, t13.d<? super Unit> dVar) throws IOException {
        byte[] bArrA = a(hVar, 5000, new e(i14, yVar, bArr));
        rs2.f fVar = this.f55542a;
        if (fVar != null) {
            fVar.onWrite(hVar.f55555a, i14, yVar, bArr);
        }
        c.f55534a.getClass();
        Object objB = this.f55546e.b(2, new g(this, "Sending response for " + c.a(i14) + " - " + yVar, bArrA, null), dVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objB != aVar) {
            objB = Unit.INSTANCE;
        }
        return objB == aVar ? objB : Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lct2/f$a;", "", "<init>", "()V", "", "PRIORITY_LOW_MESSAGE", "I", "PRIORITY_MESSAGE", "PRIORITY_RESPONSE", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ f(OutputStream outputStream, rs2.f fVar, p pVar, int i14, j jVar) {
        this(outputStream, (i14 & 2) != 0 ? null : fVar, (i14 & 4) != 0 ? null : pVar);
    }
}
