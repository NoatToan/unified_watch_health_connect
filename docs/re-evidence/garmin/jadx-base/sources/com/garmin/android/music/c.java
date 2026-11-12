package com.garmin.android.music;

import com.mapbox.maps.threading.AnimationThreadController;
import kotlin.m;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f50587b;

    public /* synthetic */ c(e23.a aVar, int i14) {
        this.f50586a = i14;
        this.f50587b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f50586a;
        e23.a aVar = this.f50587b;
        switch (i14) {
            case 0:
                MusicPlayerUtilKt.startMusicPlayerActivity$lambda$9(aVar);
                break;
            case 1:
                aVar.invoke();
                break;
            case 2:
                m.a aVar2 = m.K1;
                aVar.invoke();
                break;
            case 3:
                aVar.invoke();
                break;
            case 4:
                j6.a.b bVar = p002j6.a.C;
                aVar.invoke();
                break;
            case 5:
                j6.a.b bVar2 = j6.a.b.f97163a;
                aVar.invoke();
                break;
            case 6:
                aVar.invoke();
                break;
            case 7:
                aVar.invoke();
                break;
            case 8:
                aVar.invoke();
                break;
            case 9:
                AnimationThreadController.postOnAnimatorThread$lambda$3$lambda$2(aVar);
                break;
            case 10:
                AnimationThreadController.postOnMainThread$lambda$1(aVar);
                break;
            default:
                aVar.invoke();
                break;
        }
    }
}
