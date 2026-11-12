package com.garmin.android.apps.connectmobile.audioprompts;

import am.j;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import i.c;
import o13.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/AudioPromptsActivity;", "Li/c;", "<init>", "()V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AudioPromptsActivity extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f30189c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f30190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f30191b = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/audioprompts/AudioPromptsActivity$b", "Landroid/content/ServiceConnection;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements ServiceConnection {

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/audioprompts/AudioPromptsActivity$b$a", "", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AudioPromptsActivity f30193a;

            public a(AudioPromptsActivity audioPromptsActivity) {
                this.f30193a = audioPromptsActivity;
            }

            public final void a() {
                this.f30193a.finish();
            }
        }

        public b() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            boolean z14 = iBinder instanceof AudioPromptsService.e;
            AudioPromptsActivity audioPromptsActivity = AudioPromptsActivity.this;
            if (z14) {
                AudioPromptsService.this.f30194a = new a(audioPromptsActivity);
            }
            audioPromptsActivity.f30190a = true;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            AudioPromptsActivity.this.f30190a = false;
        }
    }

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        Object bVar;
        super.onStart();
        try {
            int i14 = q.f128596b;
            bVar = Boolean.valueOf(bindService(new Intent(this, (Class<?>) AudioPromptsService.class), this.f30191b, 1));
        } catch (Throwable th3) {
            int i15 = q.f128596b;
            bVar = new q.b(th3);
        }
        Throwable thB = q.b(bVar);
        if (thB != null) {
            String strP = j.p("Failed to bind service ", thB);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "AudioPromptsActivity", strP);
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        Object bVar;
        super.onStop();
        try {
            int i14 = q.f128596b;
            if (this.f30190a) {
                unbindService(this.f30191b);
                this.f30190a = false;
            }
            bVar = Unit.INSTANCE;
        } catch (Throwable th3) {
            int i15 = q.f128596b;
            bVar = new q.b(th3);
        }
        Throwable thB = q.b(bVar);
        if (thB != null) {
            String strP = j.p("Failed to bind service ", thB);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "AudioPromptsActivity", strP);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/AudioPromptsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
