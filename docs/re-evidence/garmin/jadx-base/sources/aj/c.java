package aj;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class c implements ui.d<ByteBuffer> {
    @Override // ui.d
    public final boolean b(ByteBuffer byteBuffer, File file, ui.h hVar) throws Throwable {
        try {
            qj.a.d(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
