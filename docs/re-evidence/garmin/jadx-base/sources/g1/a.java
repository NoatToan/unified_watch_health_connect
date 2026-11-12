package g1;

import android.media.MediaFormat;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.common.Scopes;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class a implements k {
    @Override // g1.k
    public final MediaFormat c() {
        int iG = g();
        int iF = f();
        String str = ((c) this).f74669a;
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(str, iG, iF);
        mediaFormatCreateAudioFormat.setInteger("bitrate", d());
        if (h() != -1) {
            if (str.equals(MimeTypes.AUDIO_AAC)) {
                mediaFormatCreateAudioFormat.setInteger("aac-profile", h());
                return mediaFormatCreateAudioFormat;
            }
            mediaFormatCreateAudioFormat.setInteger(Scopes.PROFILE, h());
        }
        return mediaFormatCreateAudioFormat;
    }

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();
}
