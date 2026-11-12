package d1;

import android.content.Context;
import android.media.AudioRecord;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private b() {
    }

    public static void a(AudioRecord.Builder builder, Context context) {
        builder.setContext(context);
    }
}
