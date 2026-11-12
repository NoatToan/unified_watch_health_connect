package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import com.google.android.gms.common.Scopes;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class mqq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f27110b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final MediaCodecInfo.CodecProfileLevel h;

    public mqq(int i, int i2, int i3, int i4, int i5, String str, String str2, MediaCodecInfo.CodecProfileLevel codecProfileLevel) {
        this.f27109a = i;
        this.f27110b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = str;
        Objects.requireNonNull(str2);
        this.g = str2;
        this.h = codecProfileLevel;
    }

    public MediaFormat a() {
        int i;
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.g, this.f27109a, this.f27110b);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.c);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.d);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", this.e);
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = this.h;
        if (codecProfileLevel != null && (i = codecProfileLevel.profile) != 0 && codecProfileLevel.level != 0) {
            mediaFormatCreateVideoFormat.setInteger(Scopes.PROFILE, i);
            mediaFormatCreateVideoFormat.setInteger("level", this.h.level);
        }
        return mediaFormatCreateVideoFormat;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VideoEncodeConfig{width=");
        sb.append(this.f27109a);
        sb.append(", height=");
        sb.append(this.f27110b);
        sb.append(", bitrate=");
        sb.append(this.c);
        sb.append(", framerate=");
        sb.append(this.d);
        sb.append(", iframeInterval=");
        sb.append(this.e);
        sb.append(", codecName='");
        sb.append(this.f);
        sb.append('\'');
        sb.append(", mimeType='");
        sb.append(this.g);
        sb.append('\'');
        sb.append(", codecProfileLevel=");
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = this.h;
        sb.append(codecProfileLevel == null ? "" : vgl.a(codecProfileLevel));
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
