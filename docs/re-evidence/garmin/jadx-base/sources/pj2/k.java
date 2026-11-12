package pj2;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public interface k {
    void a(l lVar, UUID uuid, UUID uuid2);

    ListenableFuture<Void> c(UUID uuid, UUID uuid2, byte[] bArr);

    void e(l lVar, UUID uuid, UUID uuid2);

    qj2.b f(UUID uuid, UUID uuid2);

    String getMacAddress();

    String getName();

    ListenableFuture<Void> j(UUID uuid, UUID uuid2, byte[] bArr);

    qj2.a k(UUID uuid, UUID uuid2);

    int l();

    List<UUID> n(UUID uuid);

    List<UUID> p();

    ListenableFuture<Void> s(UUID uuid, UUID uuid2, boolean z14);

    ListenableFuture<byte[]> v(UUID uuid, UUID uuid2);

    void w(l lVar);
}
