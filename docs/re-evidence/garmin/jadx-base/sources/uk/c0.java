package uk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Luk/c0;", "", "Ljava/io/OutputStream;", "output", "<init>", "(Ljava/io/OutputStream;)V", "a", "vivoki_release"}, k = 1, mv = {1, 4, 0})
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f171634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final it2.e f171635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f171636c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/io/ByteArrayOutputStream;", "invoke"}, k = 3, mv = {1, 1, 16})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.l<ByteArrayOutputStream, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f171637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f171638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f171639c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i14, h hVar, byte[] bArr) {
            super(1);
            this.f171637a = i14;
            this.f171638b = hVar;
            this.f171639c = bArr;
        }

        @Override // e23.l
        public final Unit invoke(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            byteArrayOutputStream2.getClass();
            o72.t.d0(byteArrayOutputStream2, this.f171637a);
            byteArrayOutputStream2.write(this.f171638b.f171681a);
            byteArrayOutputStream2.write(this.f171639c);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public c0(OutputStream outputStream) {
        outputStream.getClass();
        this.f171634a = LoggerFactory.getLogger("Vivoki#MessageWriter");
        this.f171635b = new it2.e(outputStream);
        this.f171636c = new e();
    }

    public static byte[] a(j jVar, int i14, e23.l lVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        o72.t.d0(byteArrayOutputStream, 0);
        Integer num = jVar.f171686a;
        if (num != null) {
            byteArrayOutputStream.write(i14 - 5000);
            byteArrayOutputStream.write(num.intValue() | 128);
        } else {
            o72.t.d0(byteArrayOutputStream, i14);
        }
        lVar.invoke(byteArrayOutputStream);
        if (byteArrayOutputStream.size() + 2 > 65535) {
            vb.h.C("Response payload is larger than 65535");
            return null;
        }
        o72.t.d0(byteArrayOutputStream, 0);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        int length = byteArray.length;
        byteArray[0] = (byte) (length & 255);
        byteArray[1] = (byte) ((length >> 8) & 255);
        int iR = o72.t.r(byteArray.length - 2, byteArray);
        int length2 = byteArray.length;
        byteArray[length2 - 2] = (byte) (iR & 255);
        byteArray[length2 - 1] = (byte) ((iR >> 8) & 255);
        return byteArray;
    }

    public final Object b(int i14, h hVar, byte[] bArr, t13.d<? super Unit> dVar) {
        Object objA = this.f171636c.a(1, new d0(this, am.j.h(i14, "Sending response for "), a(new j(null), 5000, new b(i14, hVar, bArr)), null), dVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objA != aVar) {
            objA = Unit.INSTANCE;
        }
        return objA == aVar ? objA : Unit.INSTANCE;
    }

    public final Object c(int i14, byte[] bArr, v13.i iVar) {
        Object objA = this.f171636c.a(0, new d0(this, v.e0.f(i14, "Sending ", " request"), a(new j(null), i14, new e0(bArr)), null), iVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objA != aVar) {
            objA = Unit.INSTANCE;
        }
        return objA == aVar ? objA : Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Luk/c0$a;", "", "<init>", "()V", "", "PRIORITY_MESSAGE", "I", "PRIORITY_RESPONSE", "", "TAG", "Ljava/lang/String;", "vivoki_release"}, k = 1, mv = {1, 4, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }
}
