package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.common.collect.ImmutableMap;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41835b;
    public final Format c;
    public final ImmutableMap<String, String> d;

    public zzk(Format format, int i, int i2, Map<String, String> map) {
        this.f41834a = i;
        this.f41835b = i2;
        this.c = format;
        this.d = ImmutableMap.copyOf((Map) map);
    }

    public static String a(String str) {
        String strG = fk1.g(str);
        strG.hashCode();
        switch (strG) {
            case "MPEG4-GENERIC":
                return MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE;
            case "AC3":
                return "audio/ac3";
            case "H264":
                return "video/avc";
            default:
                throw new IllegalArgumentException(str);
        }
    }

    public static boolean b(ijf ijfVar) {
        String strG = fk1.g(ijfVar.j.f21226b);
        strG.hashCode();
        switch (strG) {
            case "MPEG4-GENERIC":
            case "AC3":
            case "H264":
                return true;
            default:
                return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzk.class != obj.getClass()) {
            return false;
        }
        zzk zzkVar = (zzk) obj;
        return this.f41834a == zzkVar.f41834a && this.f41835b == zzkVar.f41835b && this.c.equals(zzkVar.c) && this.d.equals(zzkVar.d);
    }

    public int hashCode() {
        return ((((((217 + this.f41834a) * 31) + this.f41835b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }
}
