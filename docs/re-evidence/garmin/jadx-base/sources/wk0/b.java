package wk0;

import android.widget.TextView;
import com.garmin.android.apps.connectmobile.gncs.TailMusicLogsActivity;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TailMusicLogsActivity f185806b;

    public /* synthetic */ b(TailMusicLogsActivity tailMusicLogsActivity, int i14) {
        this.f185805a = i14;
        this.f185806b = tailMusicLogsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f185805a;
        TailMusicLogsActivity tailMusicLogsActivity = this.f185806b;
        switch (i14) {
            case 0:
                TextView textView = tailMusicLogsActivity.f35739a;
                if (textView != null) {
                    textView.append("-------------------------------------- MARK --------------------------------------\n\n");
                    return;
                } else {
                    s.m("logTextView");
                    throw null;
                }
            case 1:
                TextView textView2 = tailMusicLogsActivity.f35739a;
                if (textView2 != null) {
                    textView2.setText("");
                    return;
                } else {
                    s.m("logTextView");
                    throw null;
                }
            case 2:
                int i15 = TailMusicLogsActivity.a.f35742c;
                TextView textView3 = tailMusicLogsActivity.f35739a;
                if (textView3 != null) {
                    textView3.append("> logcat -v tag MC#MusicManager:V MC#PlayerCommandRunner:V MC#MediaControllerCallback:V MC#Module:V MC#AndroidVolumeChangedBroadcastReceiver:V MC#SharedPrefs:V *:S\n\n");
                    return;
                } else {
                    s.m("logTextView");
                    throw null;
                }
            default:
                int i16 = TailMusicLogsActivity.a.f35742c;
                tailMusicLogsActivity.onBackPressed();
                return;
        }
    }
}
