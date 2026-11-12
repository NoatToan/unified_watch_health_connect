package defpackage;

import android.bluetooth.BluetoothDevice;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public interface jpc {
    boolean a(UUID uuid, UUID uuid2);

    void b(ht2<Void> ht2Var);

    void c(String str, ht2<String> ht2Var);

    void close();

    void d(UUID uuid, UUID uuid2, ht2<byte[]> ht2Var);

    void destroy();

    boolean e();

    boolean f(UUID uuid, UUID uuid2);

    void g(UUID uuid, UUID uuid2, byte[] bArr, ht2<Void> ht2Var);

    int getVersion();

    String getVersionName();

    BluetoothDevice h();

    boolean isConnected();

    void j(ht2<Void> ht2Var);

    void k(UUID uuid, UUID uuid2, ht2<Void> ht2Var);

    void l(UUID uuid, UUID uuid2, ht2<byte[]> ht2Var);

    void n(ht2<Void> ht2Var);

    int o();

    void p(UUID uuid, UUID uuid2, ht2<Void> ht2Var);
}
