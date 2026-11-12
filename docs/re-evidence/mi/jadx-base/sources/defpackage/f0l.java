package defpackage;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;

/* JADX INFO: loaded from: classes4.dex */
public final class f0l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzk f17264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f17265b;

    public f0l(ijf ijfVar, Uri uri) {
        rk1.a(ijfVar.i.containsKey("control"));
        this.f17264a = a(ijfVar);
        this.f17265b = uri.buildUpon().appendEncodedPath((String) wlq.j(ijfVar.i.get("control"))).build();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    @VisibleForTesting
    public static zzk a(ijf ijfVar) {
        int iC;
        Format.b bVar = new Format.b();
        int i = ijfVar.e;
        if (i > 0) {
            bVar.G(i);
        }
        rk1.a(ijfVar.i.containsKey("rtpmap"));
        byte b2 = 2;
        rk1.a(wlq.M0((String) wlq.j(ijfVar.i.get("rtpmap")), " ").length == 2);
        ijf.c cVar = ijfVar.j;
        int i2 = cVar.f21225a;
        String strA = zzk.a(cVar.f21226b);
        bVar.e0(strA);
        int i3 = ijfVar.j.c;
        if ("audio".equals(ijfVar.f21221a)) {
            iC = c(ijfVar.j.d, strA);
            bVar.f0(i3).H(iC);
        } else {
            iC = -1;
        }
        ImmutableMap<String, String> immutableMapA = ijfVar.a();
        int iHashCode = strA.hashCode();
        if (iHashCode != -53558318) {
            if (iHashCode != 187078296) {
                if (iHashCode == 1331836730 && strA.equals("video/avc")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (!strA.equals("audio/ac3")) {
                b2 = -1;
            }
        } else if (strA.equals(MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE)) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            rk1.a(iC != -1);
            rk1.a(!immutableMapA.isEmpty());
            d(bVar, immutableMapA, iC, i3);
        } else if (b2 == 1) {
            rk1.a(!immutableMapA.isEmpty());
            e(bVar, immutableMapA);
        }
        rk1.a(i3 > 0);
        rk1.a(i2 >= 96);
        return new zzk(bVar.E(), i2, i3, immutableMapA);
    }

    public static byte[] b(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        int length = bArrDecode.length;
        byte[] bArr = kgg.f23821a;
        byte[] bArr2 = new byte[length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bArrDecode, 0, bArr2, bArr.length, bArrDecode.length);
        return bArr2;
    }

    public static int c(int i, String str) {
        if (i != -1) {
            return i;
        }
        return str.equals("audio/ac3") ? 6 : 1;
    }

    public static void d(Format.b bVar, ImmutableMap<String, String> immutableMap, int i, int i2) {
        rk1.a(immutableMap.containsKey("profile-level-id"));
        String strValueOf = String.valueOf((String) rk1.e(immutableMap.get("profile-level-id")));
        bVar.I(strValueOf.length() != 0 ? "mp4a.40.".concat(strValueOf) : new String("mp4a.40."));
        bVar.T(ImmutableList.of(C3515if.a(i2, i)));
    }

    public static void e(Format.b bVar, ImmutableMap<String, String> immutableMap) {
        rk1.a(immutableMap.containsKey("profile-level-id"));
        String strValueOf = String.valueOf((String) rk1.e(immutableMap.get("profile-level-id")));
        bVar.I(strValueOf.length() != 0 ? "avc1.".concat(strValueOf) : new String("avc1."));
        rk1.a(immutableMap.containsKey("sprop-parameter-sets"));
        String[] strArrM0 = wlq.M0((String) rk1.e(immutableMap.get("sprop-parameter-sets")), ",");
        rk1.a(strArrM0.length == 2);
        ImmutableList immutableListOf = ImmutableList.of(b(strArrM0[0]), b(strArrM0[1]));
        bVar.T(immutableListOf);
        byte[] bArr = immutableListOf.get(0);
        kgg.b bVarI = kgg.i(bArr, kgg.f23821a.length, bArr.length);
        bVar.a0(bVarI.g);
        bVar.Q(bVarI.f);
        bVar.j0(bVarI.e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0l.class != obj.getClass()) {
            return false;
        }
        f0l f0lVar = (f0l) obj;
        return this.f17264a.equals(f0lVar.f17264a) && this.f17265b.equals(f0lVar.f17265b);
    }

    public int hashCode() {
        return ((217 + this.f17264a.hashCode()) * 31) + this.f17265b.hashCode();
    }
}
