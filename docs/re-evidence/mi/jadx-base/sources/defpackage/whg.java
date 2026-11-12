package defpackage;

import com.facebook.imagepipeline.memory.NativeMemoryChunk;
import com.facebook.imagepipeline.memory.b;

/* JADX INFO: loaded from: classes4.dex */
public class whg extends b {
    public whg(spf spfVar, j3i j3iVar, k3i k3iVar) {
        super(spfVar, j3iVar, k3iVar);
    }

    @Override // com.facebook.imagepipeline.memory.b
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public NativeMemoryChunk a(int i) {
        return new NativeMemoryChunk(i);
    }
}
