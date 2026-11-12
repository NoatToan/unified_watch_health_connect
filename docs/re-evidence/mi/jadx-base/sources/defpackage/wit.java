package defpackage;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes5.dex */
public final class wit implements jit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileChannel f38017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f38018b;
    public final long c;

    public wit(FileChannel fileChannel, long j, long j2) {
        this.f38017a = fileChannel;
        this.f38018b = j;
        this.c = j2;
    }

    @Override // defpackage.jit
    public final void a(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.f38017a.map(FileChannel.MapMode.READ_ONLY, this.f38018b + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // defpackage.jit
    public final long zza() {
        return this.c;
    }
}
