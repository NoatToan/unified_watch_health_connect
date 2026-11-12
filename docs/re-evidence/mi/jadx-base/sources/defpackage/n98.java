package defpackage;

import com.facebook.common.memory.PooledByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class n98 {

    public static class a implements nnq<PooledByteBuffer> {
        @Override // defpackage.nnq
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(PooledByteBuffer pooledByteBuffer) {
            return pooledByteBuffer.size();
        }
    }

    public static yl4<c93, PooledByteBuffer> a(tpo<hpf> tpoVar, spf spfVar) {
        yl4<c93, PooledByteBuffer> yl4Var = new yl4<>(new a(), new vhg(), tpoVar);
        spfVar.registerMemoryTrimmable(yl4Var);
        return yl4Var;
    }
}
