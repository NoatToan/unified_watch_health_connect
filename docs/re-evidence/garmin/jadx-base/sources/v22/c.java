package v22;

import android.widget.TextView;
import com.google.android.material.R;
import com.google.android.material.snackbar.Snackbar;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static final void a(Snackbar snackbar) {
        TextView textView = (TextView) snackbar.getView().findViewById(R.id.snackbar_text);
        if (textView != null) {
            textView.setTextColor(a7.b.getColor(snackbar.getContext(), com.garmin.android.apps.connectmobile.R.color.gcm_snackbar_text_primary));
        }
    }
}
