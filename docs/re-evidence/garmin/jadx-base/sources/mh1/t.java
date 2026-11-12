package mh1;

import android.view.KeyEvent;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.settings.devices.index.InviteByEmailActivity;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements TextView.OnEditorActionListener {
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i14, KeyEvent keyEvent) {
        InviteByEmailActivity.a aVar = InviteByEmailActivity.f43034c;
        if (i14 != 6) {
            return false;
        }
        textView.clearFocus();
        return false;
    }
}
