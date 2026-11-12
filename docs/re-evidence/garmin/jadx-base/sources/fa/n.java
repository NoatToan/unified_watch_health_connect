package fa;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    private n() {
    }

    public static void a(MediaFormat mediaFormat, String str, int i14) {
        if (i14 != -1) {
            mediaFormat.setInteger(str, i14);
        }
    }

    public static void b(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i14 = 0; i14 < list.size(); i14++) {
            mediaFormat.setByteBuffer(am.j.h(i14, "csd-"), ByteBuffer.wrap(list.get(i14)));
        }
    }
}
