package xg1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import ig1.l0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class r<T> {
    public abstract String a(T t7);

    public String b(Context context, T t7) {
        return oi0.d.a(context, a(t7), new l0(16));
    }

    public int c(T t7) {
        return R.color.gcm_text_secondary;
    }
}
