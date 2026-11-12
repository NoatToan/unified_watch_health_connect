package g1;

import androidx.camera.video.internal.encoder.InvalidConfigException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements f0.a {
    @Override // g1.f0.a
    public final f0 find(String str) {
        try {
            return i1.e.k(new h0(h1.a.a(str), str), null);
        } catch (InvalidConfigException unused) {
            return null;
        }
    }
}
