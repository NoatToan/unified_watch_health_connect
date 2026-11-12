package defpackage;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.hls.HlsTrackMetadataEntry;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class iv5 implements f9c {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22120b;
    public final boolean c;

    public iv5() {
        this(0, true);
    }

    public static void b(int i, List<Integer> list) {
        if (ahd.g(d, i) == -1 || list.contains(Integer.valueOf(i))) {
            return;
        }
        list.add(Integer.valueOf(i));
    }

    public static zna e(rfp rfpVar, Format format, List<Format> list) {
        int i = g(format) ? 4 : 0;
        if (list == null) {
            list = Collections.emptyList();
        }
        return new zna(i, rfpVar, null, list);
    }

    public static h2q f(int i, boolean z, Format format, List<Format> list, rfp rfpVar) {
        int i2 = i | 16;
        if (list != null) {
            i2 = i | 48;
        } else {
            list = z ? Collections.singletonList(new Format.b().e0("application/cea-608").E()) : Collections.emptyList();
        }
        String str = format.i;
        if (!TextUtils.isEmpty(str)) {
            if (!ayf.b(str, MIOTAudioModuleCore.COMPRESSED_AUDIO_FILE_MIME_TYPE)) {
                i2 |= 2;
            }
            if (!ayf.b(str, "video/avc")) {
                i2 |= 4;
            }
        }
        return new h2q(2, rfpVar, new tx5(i2, list));
    }

    public static boolean g(Format format) {
        Metadata metadata = format.j;
        if (metadata == null) {
            return false;
        }
        for (int i = 0; i < metadata.e(); i++) {
            Metadata.Entry entryD = metadata.d(i);
            if (entryD instanceof HlsTrackMetadataEntry) {
                return !((HlsTrackMetadataEntry) entryD).c.isEmpty();
            }
        }
        return false;
    }

    public static boolean h(il8 il8Var, jl8 jl8Var) throws IOException {
        try {
            return il8Var.g(jl8Var);
        } catch (EOFException unused) {
            return false;
        } finally {
            jl8Var.l();
        }
    }

    @Override // defpackage.f9c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n63 a(Uri uri, Format format, List<Format> list, rfp rfpVar, Map<String, List<String>> map, jl8 jl8Var) throws IOException {
        int iA = fm9.a(format.l);
        int iB = fm9.b(map);
        int iC = fm9.c(uri);
        int[] iArr = d;
        ArrayList arrayList = new ArrayList(iArr.length);
        b(iA, arrayList);
        b(iB, arrayList);
        b(iC, arrayList);
        for (int i : iArr) {
            b(i, arrayList);
        }
        jl8Var.l();
        il8 il8Var = null;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            int iIntValue = ((Integer) arrayList.get(i2)).intValue();
            il8 il8Var2 = (il8) rk1.e(d(iIntValue, format, list, rfpVar));
            if (h(il8Var2, jl8Var)) {
                return new n63(il8Var2, format, rfpVar);
            }
            if (il8Var == null && (iIntValue == iA || iIntValue == iB || iIntValue == iC || iIntValue == 11)) {
                il8Var = il8Var2;
            }
        }
        return new n63((il8) rk1.e(il8Var), format, rfpVar);
    }

    @SuppressLint({"SwitchIntDef"})
    public final il8 d(int i, Format format, List<Format> list, rfp rfpVar) {
        if (i == 0) {
            return new c20();
        }
        if (i == 1) {
            return new g20();
        }
        if (i == 2) {
            return new tu0();
        }
        if (i == 7) {
            return new c9g(0, 0L);
        }
        if (i == 8) {
            return e(rfpVar, format, list);
        }
        if (i == 11) {
            return f(this.f22120b, this.c, format, list, rfpVar);
        }
        if (i != 13) {
            return null;
        }
        return new scr(format.c, rfpVar);
    }

    public iv5(int i, boolean z) {
        this.f22120b = i;
        this.c = z;
    }
}
