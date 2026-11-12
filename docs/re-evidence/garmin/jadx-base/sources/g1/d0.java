package g1;

import android.media.MediaFormat;
import android.util.Size;
import com.google.android.gms.common.Scopes;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class d0 implements k {

    @AutoValue.Builder
    public static abstract class a {
    }

    public static d.b d() {
        d.b bVar = new d.b();
        bVar.f74687b = -1;
        bVar.f74694i = 1;
        bVar.f74690e = 2130708361;
        bVar.b(e0.f74699a);
        return bVar;
    }

    @Override // g1.k
    public final MediaFormat c() {
        Size sizeL = l();
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(((d) this).f74676a, sizeL.getWidth(), sizeL.getHeight());
        mediaFormatCreateVideoFormat.setInteger("color-format", g());
        mediaFormatCreateVideoFormat.setInteger("bitrate", e());
        mediaFormatCreateVideoFormat.setInteger("frame-rate", i());
        if (i() != f()) {
            mediaFormatCreateVideoFormat.setInteger("operating-rate", f());
            mediaFormatCreateVideoFormat.setInteger("priority", 0);
        }
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", j());
        if (k() != -1) {
            mediaFormatCreateVideoFormat.setInteger(Scopes.PROFILE, k());
        }
        e0 e0VarH = h();
        if (e0VarH.b() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-standard", e0VarH.b());
        }
        if (e0VarH.c() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-transfer", e0VarH.c());
        }
        if (e0VarH.a() != 0) {
            mediaFormatCreateVideoFormat.setInteger("color-range", e0VarH.a());
        }
        return mediaFormatCreateVideoFormat;
    }

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract e0 h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract Size l();

    public abstract d.b m();
}
