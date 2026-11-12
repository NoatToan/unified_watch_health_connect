package db;

import androidx.media3.common.q;
import androidx.media3.common.x;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import fa.k;
import fa.r;
import fa.z;

/* JADX INFO: loaded from: classes.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList<a> f58955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58956b;

    private f(int i14, ImmutableList<a> immutableList) {
        this.f58956b = i14;
        this.f58955a = immutableList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i14, r rVar) {
        String str;
        a gVar;
        String str2;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int i15 = rVar.f70056c;
        int i16 = -2;
        while (rVar.a() > 8) {
            int i17 = rVar.i();
            int i18 = rVar.f70055b + rVar.i();
            rVar.F(i18);
            if (i17 != 1414744396) {
                g gVar2 = null;
                switch (i17) {
                    case 1718776947:
                        if (i16 != 2) {
                            if (i16 == 1) {
                                int iN = rVar.n();
                                if (iN == 1) {
                                    str = MimeTypes.AUDIO_RAW;
                                } else if (iN == 85) {
                                    str = MimeTypes.AUDIO_MPEG;
                                } else if (iN == 255) {
                                    str = MimeTypes.AUDIO_AAC;
                                } else if (iN != 8192) {
                                    str = iN != 8193 ? null : MimeTypes.AUDIO_DTS;
                                } else {
                                    str = MimeTypes.AUDIO_AC3;
                                }
                                if (str != null) {
                                    int iN2 = rVar.n();
                                    int i19 = rVar.i();
                                    rVar.H(6);
                                    int iX = z.x(rVar.n());
                                    int iN3 = rVar.a() > 0 ? rVar.n() : 0;
                                    byte[] bArr = new byte[iN3];
                                    rVar.e(bArr, 0, iN3);
                                    q.b bVar = new q.b();
                                    bVar.f8411m = x.n(str);
                                    bVar.B = iN2;
                                    bVar.C = i19;
                                    if (MimeTypes.AUDIO_RAW.equals(str) && iX != 0) {
                                        bVar.D = iX;
                                    }
                                    if (MimeTypes.AUDIO_AAC.equals(str) && iN3 > 0) {
                                        bVar.f8414p = ImmutableList.of(bArr);
                                    }
                                    gVar = new g(bVar.a());
                                } else {
                                    fb1.c.r(iN, "Ignoring track with unsupported format tag ");
                                }
                            } else {
                                k.g("Ignoring strf box for unsupported track type: ".concat(z.C(i16)));
                            }
                            break;
                        } else {
                            rVar.H(4);
                            int i24 = rVar.i();
                            int i25 = rVar.i();
                            rVar.H(4);
                            int i26 = rVar.i();
                            switch (i26) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = MimeTypes.VIDEO_MP4V;
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = MimeTypes.VIDEO_H264;
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                fb1.c.r(i26, "Ignoring track with unsupported compression ");
                            } else {
                                q.b bVar2 = new q.b();
                                bVar2.f8418t = i24;
                                bVar2.f8419u = i25;
                                bVar2.f8411m = x.n(str2);
                                gVar2 = new g(bVar2.a());
                            }
                        }
                        gVar = gVar2;
                        break;
                    case 1751742049:
                        gVar = c.a(rVar);
                        break;
                    case 1752331379:
                        gVar = d.a(rVar);
                        break;
                    case 1852994675:
                        gVar = h.a(rVar);
                        break;
                    default:
                        gVar = gVar2;
                        break;
                }
            } else {
                gVar = b(rVar.i(), rVar);
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    int i27 = ((d) gVar).f58937a;
                    if (i27 == 1935960438) {
                        i16 = 2;
                    } else if (i27 == 1935963489) {
                        i16 = 1;
                    } else if (i27 != 1937012852) {
                        k.g("Found unsupported streamType fourCC: " + Integer.toHexString(i27));
                        i16 = -1;
                    } else {
                        i16 = 3;
                    }
                }
                builder.add(gVar);
            }
            rVar.G(i18);
            rVar.F(i15);
        }
        return new f(i14, builder.build());
    }

    public final <T extends a> T a(Class<T> cls) {
        UnmodifiableIterator<a> it = this.f58955a.iterator();
        while (it.hasNext()) {
            T t7 = (T) it.next();
            if (t7.getClass() == cls) {
                return t7;
            }
        }
        return null;
    }

    @Override // db.a
    public final int getType() {
        return this.f58956b;
    }
}
