package g1;

import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface y {
    boolean a();

    void b(long j8);

    void c();

    boolean cancel();

    ListenableFuture<Void> d();

    ByteBuffer i();
}
