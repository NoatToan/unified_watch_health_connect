package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import com.xiaomi.digitalkey.wearable.DigitalKeyService;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTAudioModuleCore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class ex9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17150b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f17151k;
    public final Metadata l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f17152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f17153b;

        public a(long[] jArr, long[] jArr2) {
            this.f17152a = jArr;
            this.f17153b = jArr2;
        }
    }

    public ex9(byte[] bArr, int i) {
        nkh nkhVar = new nkh(bArr);
        nkhVar.p(i * 8);
        this.f17149a = nkhVar.h(16);
        this.f17150b = nkhVar.h(16);
        this.c = nkhVar.h(24);
        this.d = nkhVar.h(24);
        int iH = nkhVar.h(20);
        this.e = iH;
        this.f = k(iH);
        this.g = nkhVar.h(3) + 1;
        int iH2 = nkhVar.h(5) + 1;
        this.h = iH2;
        this.i = f(iH2);
        this.j = nkhVar.j(36);
        this.f17151k = null;
        this.l = null;
    }

    public static Metadata a(List<String> list, List<PictureFrame> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] strArrN0 = wlq.N0(str, "=");
            if (strArrN0.length != 2) {
                String strValueOf = String.valueOf(str);
                toe.h("FlacStreamMetadata", strValueOf.length() != 0 ? "Failed to parse Vorbis comment: ".concat(strValueOf) : new String("Failed to parse Vorbis comment: "));
            } else {
                arrayList.add(new VorbisComment(strArrN0[0], strArrN0[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static int f(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int k(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case DigitalKeyService.DIGITAL_KEY_INSUFFICIENT_SE_SPACE /* 22050 */:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case MIOTAudioModuleCore.SAMPLING_RATE /* 48000 */:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public ex9 b(List<PictureFrame> list) {
        return new ex9(this.f17149a, this.f17150b, this.c, this.d, this.e, this.g, this.h, this.j, this.f17151k, i(a(Collections.emptyList(), list)));
    }

    public ex9 c(a aVar) {
        return new ex9(this.f17149a, this.f17150b, this.c, this.d, this.e, this.g, this.h, this.j, aVar, this.l);
    }

    public ex9 d(List<String> list) {
        return new ex9(this.f17149a, this.f17150b, this.c, this.d, this.e, this.g, this.h, this.j, this.f17151k, i(a(list, Collections.emptyList())));
    }

    public long e() {
        long j;
        long j2;
        int i = this.d;
        if (i > 0) {
            j = (((long) i) + ((long) this.c)) / 2;
            j2 = 1;
        } else {
            int i2 = this.f17149a;
            j = ((((i2 != this.f17150b || i2 <= 0) ? 4096L : i2) * ((long) this.g)) * ((long) this.h)) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    public long g() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * FolmeCore.NANOS_TO_MS) / ((long) this.e);
    }

    public Format h(byte[] bArr, Metadata metadata) {
        bArr[4] = -128;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        return new Format.b().e0("audio/flac").W(i).H(this.g).f0(this.e).T(Collections.singletonList(bArr)).X(i(metadata)).E();
    }

    public Metadata i(Metadata metadata) {
        Metadata metadata2 = this.l;
        return metadata2 == null ? metadata : metadata2.c(metadata);
    }

    public long j(long j) {
        return wlq.s((j * ((long) this.e)) / FolmeCore.NANOS_TO_MS, 0L, this.j - 1);
    }

    public ex9(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, a aVar, Metadata metadata) {
        this.f17149a = i;
        this.f17150b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = k(i5);
        this.g = i6;
        this.h = i7;
        this.i = f(i7);
        this.j = j;
        this.f17151k = aVar;
        this.l = metadata;
    }
}
