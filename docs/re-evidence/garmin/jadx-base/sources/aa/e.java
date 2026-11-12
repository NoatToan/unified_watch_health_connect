package aa;

import android.media.VolumeProvider;

/* JADX INFO: loaded from: classes.dex */
public class e extends VolumeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f2180a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, int i14, int i15, int i16, String str) {
        super(i14, i15, i16, str);
        this.f2180a = gVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i14) {
        this.f2180a.getClass();
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i14) {
        this.f2180a.getClass();
    }
}
