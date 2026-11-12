package com.garmin.android.apps.connectmobile.gncs;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.z1;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import vg1.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gncs/TailMusicLogsActivity;", "Lcom/garmin/android/apps/connectmobile/z1;", "<init>", "()V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TailMusicLogsActivity extends z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f35739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f35740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f35741c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gncs/TailMusicLogsActivity$a;", "Ljava/lang/Thread;", "<init>", "(Lcom/garmin/android/apps/connectmobile/gncs/TailMusicLogsActivity;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends Thread {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f35742c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile boolean f35743a;

        public a() {
            super("TailMusicLogsActivity");
            this.f35743a = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() throws InterruptedException, IOException {
            getName();
            Process processExec = Runtime.getRuntime().exec("logcat -v tag MC#MusicManager:V MC#PlayerCommandRunner:V MC#MediaControllerCallback:V MC#Module:V MC#AndroidVolumeChangedBroadcastReceiver:V MC#SharedPrefs:V *:S");
            processExec.getClass();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            TailMusicLogsActivity tailMusicLogsActivity = TailMusicLogsActivity.this;
            Handler handler = tailMusicLogsActivity.f35740b;
            if (handler == null) {
                s.m("uiHandler");
                throw null;
            }
            handler.post(new wk0.b(tailMusicLogsActivity, 2));
            while (this.f35743a) {
                try {
                    if (bufferedReader.ready()) {
                        String line = bufferedReader.readLine();
                        if (TextUtils.isEmpty(line)) {
                            continue;
                        } else {
                            TailMusicLogsActivity tailMusicLogsActivity2 = TailMusicLogsActivity.this;
                            line.getClass();
                            Handler handler2 = tailMusicLogsActivity2.f35740b;
                            if (handler2 == null) {
                                s.m("uiHandler");
                                throw null;
                            }
                            handler2.post(new d(10, tailMusicLogsActivity2, line));
                        }
                    } else {
                        Thread.sleep(LocationComponentConstants.DEFAULT_TRACKING_TILT_ANIM_DURATION);
                    }
                } catch (IllegalStateException unused) {
                    TailMusicLogsActivity tailMusicLogsActivity3 = TailMusicLogsActivity.this;
                    Handler handler3 = tailMusicLogsActivity3.f35740b;
                    if (handler3 != null) {
                        handler3.postAtFrontOfQueue(new wk0.b(tailMusicLogsActivity3, 3));
                        return;
                    } else {
                        s.m("uiHandler");
                        throw null;
                    }
                }
            }
            getName();
        }
    }

    static {
        new b(null);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_tail_music_logs);
        initActionBar(true, "TailMusicLogsActivity");
        View viewFindViewById = findViewById(R.id.tail_music_logs_text);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f35739a = textView;
        textView.setMovementMethod(new ScrollingMovementMethod());
        this.f35740b = new Handler(Looper.getMainLooper());
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_tail_music_logs, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_tail_music_mark_log) {
            finish();
            return true;
        }
        Handler handler = this.f35740b;
        if (handler != null) {
            handler.post(new wk0.b(this, 0));
            return true;
        }
        s.m("uiHandler");
        throw null;
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        a aVar = this.f35741c;
        if (aVar != null) {
            aVar.getName();
            aVar.f35743a = false;
        }
        Handler handler = this.f35740b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        } else {
            s.m("uiHandler");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        Handler handler = this.f35740b;
        if (handler == null) {
            s.m("uiHandler");
            throw null;
        }
        handler.post(new wk0.b(this, 1));
        a aVar = new a();
        aVar.start();
        this.f35741c = aVar;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gncs/TailMusicLogsActivity$b;", "", "<init>", "()V", "", "MAX_CHARS", "I", "CHAR_BLOCK_TRIM_SIZE", "", "READ_WAIT_MILLIS", "J", "", "TAG", "Ljava/lang/String;", "LOGCAT_COMMAND", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
