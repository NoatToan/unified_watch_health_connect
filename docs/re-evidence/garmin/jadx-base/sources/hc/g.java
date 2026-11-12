package hc;

import android.util.SparseArray;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g implements f0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<androidx.media3.common.q> f82935b;

    public g(int i14) {
        this(i14, ImmutableList.of());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x005b  */
    @Override // hc.f0.c
    public final f0 a(int i14, f0.b bVar) {
        String str = bVar.f82925b;
        if (i14 != 2) {
            if (i14 == 3 || i14 == 4) {
                return new v(new q(str, bVar.a()));
            }
            if (i14 == 21) {
                return new v(new o());
            }
            if (i14 == 27) {
                if (c(4)) {
                    return null;
                }
                return new v(new m(new b0(b(bVar)), c(1), c(8)));
            }
            if (i14 == 36) {
                return new v(new n(new b0(b(bVar))));
            }
            if (i14 == 45) {
                return new v(new r());
            }
            if (i14 == 89) {
                return new v(new i(bVar.f82927d));
            }
            if (i14 == 172) {
                return new v(new d(str, bVar.a()));
            }
            if (i14 == 257) {
                return new a0(new u(MimeTypes.APPLICATION_AIT));
            }
            if (i14 != 138) {
                if (i14 == 139) {
                    return new v(new h(str, bVar.a(), 5408));
                }
                switch (i14) {
                    case 15:
                        if (c(2)) {
                            return null;
                        }
                        return new v(new f(false, str, bVar.a()));
                    case 16:
                        return new v(new l(new h0(b(bVar))));
                    case 17:
                        if (c(2)) {
                            return null;
                        }
                        return new v(new p(str, bVar.a()));
                    default:
                        switch (i14) {
                            case 128:
                                break;
                            case 129:
                                return new v(new b(str, bVar.a()));
                            case 130:
                                if (!c(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i14) {
                                    case TsExtractor.TS_STREAM_TYPE_SPLICE_INFO /* 134 */:
                                        if (c(16)) {
                                            return null;
                                        }
                                        return new a0(new u(MimeTypes.APPLICATION_SCTE35));
                                    case TsExtractor.TS_STREAM_TYPE_E_AC3 /* 135 */:
                                        return new v(new b(str, bVar.a()));
                                    case SyslogConstants.LOG_LOCAL1 /* 136 */:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new v(new h(str, bVar.a(), 4096));
        }
        return new v(new k(new h0(b(bVar))));
    }

    public final List<androidx.media3.common.q> b(f0.b bVar) {
        String str;
        int i14;
        List<byte[]> listSingletonList;
        boolean zC = c(32);
        List<androidx.media3.common.q> list = this.f82935b;
        if (zC) {
            return list;
        }
        fa.r rVar = new fa.r(bVar.f82928e);
        while (rVar.a() > 0) {
            int iU = rVar.u();
            int iU2 = rVar.f70055b + rVar.u();
            if (iU == 134) {
                ArrayList arrayList = new ArrayList();
                int iU3 = rVar.u() & 31;
                for (int i15 = 0; i15 < iU3; i15++) {
                    String strS = rVar.s(3, StandardCharsets.UTF_8);
                    int iU4 = rVar.u();
                    boolean z14 = (iU4 & 128) != 0;
                    if (z14) {
                        i14 = iU4 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i14 = 1;
                    }
                    byte bU = (byte) rVar.u();
                    rVar.H(1);
                    if (z14) {
                        boolean z15 = (bU & SignedBytes.MAX_POWER_OF_TWO) != 0;
                        byte[] bArr = fa.d.f70005a;
                        listSingletonList = Collections.singletonList(z15 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    androidx.media3.common.q.b bVar2 = new androidx.media3.common.q.b();
                    bVar2.f8411m = androidx.media3.common.x.n(str);
                    bVar2.f8402d = strS;
                    bVar2.G = i14;
                    bVar2.f8414p = listSingletonList;
                    arrayList.add(bVar2.a());
                }
                list = arrayList;
            }
            rVar.G(iU2);
        }
        return list;
    }

    public final boolean c(int i14) {
        return (i14 & this.f82934a) != 0;
    }

    @Override // hc.f0.c
    public final SparseArray<f0> createInitialPayloadReaders() {
        return new SparseArray<>();
    }

    public g() {
        this(0);
    }

    public g(int i14, List<androidx.media3.common.q> list) {
        this.f82934a = i14;
        this.f82935b = list;
    }
}
