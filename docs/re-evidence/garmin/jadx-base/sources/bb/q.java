package bb;

import androidx.media3.common.ParserException;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    private q() {
    }

    public static void a(boolean z14, String str) throws ParserException {
        if (!z14) {
            throw ParserException.createForMalformedContainer(str, null);
        }
    }
}
