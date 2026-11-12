package com.mapbox.maps.renderer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.garmin.android.apps.connectmobile.u1;
import java.util.Random;
import o53.j;
import o53.s0;
import u53.o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f54603b;

    public /* synthetic */ b(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f54602a = 1;
        this.f54603b = context;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j8) {
        int i14 = this.f54602a;
        Object obj = this.f54603b;
        switch (i14) {
            case 0:
                MapboxRenderThread.draw$lambda$6((MapboxRenderThread) obj, j8);
                break;
            case 1:
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new u1((Context) obj, 3), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case 2:
                x53.c cVar = s0.f129406a;
                ((j) obj).F(o.f168762a, Long.valueOf(j8));
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }

    public /* synthetic */ b(Object obj, int i14) {
        this.f54602a = i14;
        this.f54603b = obj;
    }
}
