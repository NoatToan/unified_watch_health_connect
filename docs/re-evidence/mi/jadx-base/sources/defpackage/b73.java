package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class b73 implements x98<ByteBuffer> {
    @Override // defpackage.x98
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, File file, cch cchVar) throws Throwable {
        try {
            f73.f(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
