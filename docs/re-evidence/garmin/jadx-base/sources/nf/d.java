package nf;

import java.nio.ByteBuffer;
import lf.r;
import p005kotlin.Metadata;
import w63.b0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lnf/d;", "Lnf/j;", "Ljava/nio/ByteBuffer;", "data", "Lwf/m;", "options", "<init>", "(Ljava/nio/ByteBuffer;Lwf/m;)V", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f125743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf.m f125744b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lnf/d$a;", "Lnf/j$a;", "Ljava/nio/ByteBuffer;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements j.a<ByteBuffer> {
        @Override // nf.j.a
        public final j a(ByteBuffer byteBuffer, wf.m mVar, hf.j jVar) {
            return new d(byteBuffer, mVar);
        }
    }

    public d(ByteBuffer byteBuffer, wf.m mVar) {
        this.f125743a = byteBuffer;
        this.f125744b = mVar;
    }

    @Override // nf.j
    public final Object a(t13.d<? super i> dVar) {
        ByteBuffer byteBuffer = this.f125743a;
        return new o(new r(new b0(new e(byteBuffer)), this.f125744b.f185001f, new lf.c(byteBuffer)), null, lf.e.MEMORY);
    }
}
