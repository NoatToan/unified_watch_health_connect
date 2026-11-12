package androidx.media3.exoplayer;

import android.util.Base64;
import com.google.android.exoplayer2.analytics.DefaultPlaybackSessionManager;
import com.google.common.base.Supplier;
import yc.l2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9292a;

    public /* synthetic */ o(int i14) {
        this.f9292a = i14;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        switch (this.f9292a) {
            case 0:
                return new j();
            case 1:
                return DefaultPlaybackSessionManager.generateDefaultSessionId();
            case 2:
                byte[] bArr = new byte[12];
                ja.n.f98000j.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            default:
                Supplier<androidx.media3.common.i0.a> supplier = androidx.media3.exoplayer.video.c.f.f9843a;
                try {
                    Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                    objInvoke.getClass();
                    return (androidx.media3.common.i0.a) objInvoke;
                } catch (Exception e4) {
                    l2.p(e4);
                    return null;
                }
        }
    }
}
