package je2;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.LatLng;
import cw1.c1;
import h4.r;
import i53.c;
import ie2.l;
import java.util.List;
import le2.d;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import z3.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lje2/b;", "T", "", "Lje2/a;", "cameraSettings", "<init>", "(Lje2/a;)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f98597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f98598b;

    public b(a aVar) {
        aVar.getClass();
        this.f98597a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011a  */
    /* JADX WARN: Code duplicated, block: B:101:0x011d  */
    /* JADX WARN: Code duplicated, block: B:103:0x013e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0149  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:95:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0113  */
    /* JADX WARN: Code duplicated, block: B:98:0x0116  */
    public final void a(r rVar, l lVar, le2.b bVar, boolean z14, boolean z15, boolean z16, e23.l<? super ke2.b, Unit> lVar2, e23.r<? super ke2.b, ? super Float, ? super LatLng, ? super LatLng, Unit> rVar2, e23.l<? super Float, Unit> lVar3, m mVar, int i14, int i15) {
        int i16;
        e23.l<? super ke2.b, Unit> lVar4;
        int i17;
        e23.r<? super ke2.b, ? super Float, ? super LatLng, ? super LatLng, Unit> rVar3;
        int i18;
        int i19;
        e23.l<? super Float, Unit> lVar5;
        int i24;
        int i25;
        int i26;
        boolean z17;
        e23.r<? super ke2.b, ? super Float, ? super LatLng, ? super LatLng, Unit> rVar4;
        e23.l<? super Float, Unit> lVar6;
        p2 p2VarI0;
        e23.l<? super ke2.b, Unit> lVar7;
        e23.r<? super ke2.b, ? super Float, ? super LatLng, ? super LatLng, Unit> rVar5;
        e23.l<? super Float, Unit> lVar8;
        int i27;
        rVar.getClass();
        bVar.getClass();
        o0 o0VarE = mVar.E(-825882761);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(bVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.h(z15) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.h(z16) ? 131072 : 65536;
        }
        int i28 = i15 & 64;
        if (i28 == 0) {
            if ((1572864 & i14) == 0) {
                lVar4 = lVar2;
                i16 |= o0VarE.r(lVar4) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
            i17 = i15 & 128;
            if (i17 != 0) {
                if ((12582912 & i14) == 0) {
                    rVar3 = rVar2;
                    if (o0VarE.r(rVar3)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 256;
                if (i19 != 0) {
                    if ((100663296 & i14) == 0) {
                        lVar5 = lVar3;
                        if (o0VarE.r(lVar5)) {
                            i24 = 67108864;
                        } else {
                            i24 = 33554432;
                        }
                        i16 |= i24;
                    }
                    i25 = i16;
                    if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(this)) {
                            i27 = 536870912;
                        } else {
                            i27 = 268435456;
                        }
                        i26 = i25 | i27;
                    } else {
                        i26 = i25;
                    }
                    if ((i26 & 306783379) != 306783378) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (o0VarE.n(i26 & 1, z17)) {
                        if (i28 != 0) {
                            lVar7 = null;
                        } else {
                            lVar7 = lVar4;
                        }
                        if (i17 != 0) {
                            rVar5 = null;
                        } else {
                            rVar5 = rVar3;
                        }
                        if (i19 != 0) {
                            lVar8 = null;
                        } else {
                            lVar8 = lVar5;
                        }
                        x1 x1Var = n.f135158a;
                        d(rVar, lVar, bVar, z14, z15, z16, lVar7, rVar5, lVar8).invoke(o0VarE, 0);
                        lVar4 = lVar7;
                        rVar4 = rVar5;
                        lVar6 = lVar8;
                    } else {
                        o0VarE.e();
                        rVar4 = rVar3;
                        lVar6 = lVar5;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new da0.a(this, rVar, lVar, bVar, z14, z15, z16, lVar4, rVar4, lVar6, i14, i15);
                    }
                }
                i16 |= 100663296;
                lVar5 = lVar3;
                i25 = i16;
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(this)) {
                        i27 = 536870912;
                    } else {
                        i27 = 268435456;
                    }
                    i26 = i25 | i27;
                } else {
                    i26 = i25;
                }
                if ((i26 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (o0VarE.n(i26 & 1, z17)) {
                    if (i28 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar4;
                    }
                    if (i17 != 0) {
                        rVar5 = null;
                    } else {
                        rVar5 = rVar3;
                    }
                    if (i19 != 0) {
                        lVar8 = null;
                    } else {
                        lVar8 = lVar5;
                    }
                    x1 x1Var2 = n.f135158a;
                    d(rVar, lVar, bVar, z14, z15, z16, lVar7, rVar5, lVar8).invoke(o0VarE, 0);
                    lVar4 = lVar7;
                    rVar4 = rVar5;
                    lVar6 = lVar8;
                } else {
                    o0VarE.e();
                    rVar4 = rVar3;
                    lVar6 = lVar5;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new da0.a(this, rVar, lVar, bVar, z14, z15, z16, lVar4, rVar4, lVar6, i14, i15);
                }
            }
            i16 |= 12582912;
            rVar3 = rVar2;
            i19 = i15 & 256;
            if (i19 != 0) {
                if ((100663296 & i14) == 0) {
                    lVar5 = lVar3;
                    if (o0VarE.r(lVar5)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i16 |= i24;
                }
                i25 = i16;
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(this)) {
                        i27 = 536870912;
                    } else {
                        i27 = 268435456;
                    }
                    i26 = i25 | i27;
                } else {
                    i26 = i25;
                }
                if ((i26 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (o0VarE.n(i26 & 1, z17)) {
                    if (i28 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar4;
                    }
                    if (i17 != 0) {
                        rVar5 = null;
                    } else {
                        rVar5 = rVar3;
                    }
                    if (i19 != 0) {
                        lVar8 = null;
                    } else {
                        lVar8 = lVar5;
                    }
                    x1 x1Var3 = n.f135158a;
                    d(rVar, lVar, bVar, z14, z15, z16, lVar7, rVar5, lVar8).invoke(o0VarE, 0);
                    lVar4 = lVar7;
                    rVar4 = rVar5;
                    lVar6 = lVar8;
                } else {
                    o0VarE.e();
                    rVar4 = rVar3;
                    lVar6 = lVar5;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new da0.a(this, rVar, lVar, bVar, z14, z15, z16, lVar4, rVar4, lVar6, i14, i15);
                }
            }
            i16 |= 100663296;
            lVar5 = lVar3;
            i25 = i16;
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(this)) {
                    i27 = 536870912;
                } else {
                    i27 = 268435456;
                }
                i26 = i25 | i27;
            } else {
                i26 = i25;
            }
            if ((i26 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i26 & 1, z17)) {
                if (i28 != 0) {
                    lVar7 = null;
                } else {
                    lVar7 = lVar4;
                }
                if (i17 != 0) {
                    rVar5 = null;
                } else {
                    rVar5 = rVar3;
                }
                if (i19 != 0) {
                    lVar8 = null;
                } else {
                    lVar8 = lVar5;
                }
                x1 x1Var4 = n.f135158a;
                d(rVar, lVar, bVar, z14, z15, z16, lVar7, rVar5, lVar8).invoke(o0VarE, 0);
                lVar4 = lVar7;
                rVar4 = rVar5;
                lVar6 = lVar8;
            } else {
                o0VarE.e();
                rVar4 = rVar3;
                lVar6 = lVar5;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.a(this, rVar, lVar, bVar, z14, z15, z16, lVar4, rVar4, lVar6, i14, i15);
            }
        }
        i16 |= 1572864;
        lVar4 = lVar2;
        i17 = i15 & 128;
        if (i17 != 0) {
            if ((12582912 & i14) == 0) {
                rVar3 = rVar2;
                if (o0VarE.r(rVar3)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i16 |= i18;
            }
            i19 = i15 & 256;
            if (i19 != 0) {
                if ((100663296 & i14) == 0) {
                    lVar5 = lVar3;
                    if (o0VarE.r(lVar5)) {
                        i24 = 67108864;
                    } else {
                        i24 = 33554432;
                    }
                    i16 |= i24;
                }
                i25 = i16;
                if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(this)) {
                        i27 = 536870912;
                    } else {
                        i27 = 268435456;
                    }
                    i26 = i25 | i27;
                } else {
                    i26 = i25;
                }
                if ((i26 & 306783379) != 306783378) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (o0VarE.n(i26 & 1, z17)) {
                    if (i28 != 0) {
                        lVar7 = null;
                    } else {
                        lVar7 = lVar4;
                    }
                    if (i17 != 0) {
                        rVar5 = null;
                    } else {
                        rVar5 = rVar3;
                    }
                    if (i19 != 0) {
                        lVar8 = null;
                    } else {
                        lVar8 = lVar5;
                    }
                    x1 x1Var5 = n.f135158a;
                    d(rVar, lVar, bVar, z14, z15, z16, lVar7, rVar5, lVar8).invoke(o0VarE, 0);
                    lVar4 = lVar7;
                    rVar4 = rVar5;
                    lVar6 = lVar8;
                } else {
                    o0VarE.e();
                    rVar4 = rVar3;
                    lVar6 = lVar5;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new da0.a(this, rVar, lVar, bVar, z14, z15, z16, lVar4, rVar4, lVar6, i14, i15);
                }
            }
            i16 |= 100663296;
            lVar5 = lVar3;
            i25 = i16;
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(this)) {
                    i27 = 536870912;
                } else {
                    i27 = 268435456;
                }
                i26 = i25 | i27;
            } else {
                i26 = i25;
            }
            if ((i26 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i26 & 1, z17)) {
                if (i28 != 0) {
                    lVar7 = null;
                } else {
                    lVar7 = lVar4;
                }
                if (i17 != 0) {
                    rVar5 = null;
                } else {
                    rVar5 = rVar3;
                }
                if (i19 != 0) {
                    lVar8 = null;
                } else {
                    lVar8 = lVar5;
                }
                x1 x1Var6 = n.f135158a;
                d(rVar, lVar, bVar, z14, z15, z16, lVar7, rVar5, lVar8).invoke(o0VarE, 0);
                lVar4 = lVar7;
                rVar4 = rVar5;
                lVar6 = lVar8;
            } else {
                o0VarE.e();
                rVar4 = rVar3;
                lVar6 = lVar5;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.a(this, rVar, lVar, bVar, z14, z15, z16, lVar4, rVar4, lVar6, i14, i15);
            }
        }
        i16 |= 12582912;
        rVar3 = rVar2;
        i19 = i15 & 256;
        if (i19 != 0) {
            if ((100663296 & i14) == 0) {
                lVar5 = lVar3;
                if (o0VarE.r(lVar5)) {
                    i24 = 67108864;
                } else {
                    i24 = 33554432;
                }
                i16 |= i24;
            }
            i25 = i16;
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(this)) {
                    i27 = 536870912;
                } else {
                    i27 = 268435456;
                }
                i26 = i25 | i27;
            } else {
                i26 = i25;
            }
            if ((i26 & 306783379) != 306783378) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i26 & 1, z17)) {
                if (i28 != 0) {
                    lVar7 = null;
                } else {
                    lVar7 = lVar4;
                }
                if (i17 != 0) {
                    rVar5 = null;
                } else {
                    rVar5 = rVar3;
                }
                if (i19 != 0) {
                    lVar8 = null;
                } else {
                    lVar8 = lVar5;
                }
                x1 x1Var7 = n.f135158a;
                d(rVar, lVar, bVar, z14, z15, z16, lVar7, rVar5, lVar8).invoke(o0VarE, 0);
                lVar4 = lVar7;
                rVar4 = rVar5;
                lVar6 = lVar8;
            } else {
                o0VarE.e();
                rVar4 = rVar3;
                lVar6 = lVar5;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.a(this, rVar, lVar, bVar, z14, z15, z16, lVar4, rVar4, lVar6, i14, i15);
            }
        }
        i16 |= 100663296;
        lVar5 = lVar3;
        i25 = i16;
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarE.r(this)) {
                i27 = 536870912;
            } else {
                i27 = 268435456;
            }
            i26 = i25 | i27;
        } else {
            i26 = i25;
        }
        if ((i26 & 306783379) != 306783378) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (o0VarE.n(i26 & 1, z17)) {
            if (i28 != 0) {
                lVar7 = null;
            } else {
                lVar7 = lVar4;
            }
            if (i17 != 0) {
                rVar5 = null;
            } else {
                rVar5 = rVar3;
            }
            if (i19 != 0) {
                lVar8 = null;
            } else {
                lVar8 = lVar5;
            }
            x1 x1Var8 = n.f135158a;
            d(rVar, lVar, bVar, z14, z15, z16, lVar7, rVar5, lVar8).invoke(o0VarE, 0);
            lVar4 = lVar7;
            rVar4 = rVar5;
            lVar6 = lVar8;
        } else {
            o0VarE.e();
            rVar4 = rVar3;
            lVar6 = lVar5;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.a(this, rVar, lVar, bVar, z14, z15, z16, lVar4, rVar4, lVar6, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0134 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0136  */
    /* JADX WARN: Code duplicated, block: B:104:0x0139  */
    /* JADX WARN: Code duplicated, block: B:106:0x013c  */
    /* JADX WARN: Code duplicated, block: B:107:0x013f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0143  */
    /* JADX WARN: Code duplicated, block: B:111:0x0145  */
    /* JADX WARN: Code duplicated, block: B:113:0x0148  */
    /* JADX WARN: Code duplicated, block: B:114:0x014b  */
    /* JADX WARN: Code duplicated, block: B:116:0x014e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0150  */
    /* JADX WARN: Code duplicated, block: B:119:0x016e  */
    /* JADX WARN: Code duplicated, block: B:122:0x017d  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x010c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:98:0x0127  */
    /* JADX WARN: Code duplicated, block: B:99:0x012a  */
    public final void b(r rVar, c<d> cVar, c<le2.c> cVar2, List<ke2.b> list, int i14, boolean z14, e23.a<Unit> aVar, boolean z15, e23.l<? super Float, Unit> lVar, m mVar, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        boolean z16;
        int i24;
        int i25;
        e23.a<Unit> aVar2;
        int i26;
        int i27;
        boolean z17;
        int i28;
        int i29;
        int i30;
        int i34;
        int i35;
        boolean z18;
        boolean z19;
        e23.a<Unit> aVar3;
        boolean z24;
        e23.l<? super Float, Unit> lVar2;
        p2 p2VarI0;
        int i36;
        boolean z25;
        e23.a<Unit> aVar4;
        boolean z26;
        e23.l<? super Float, Unit> lVar3;
        int i37;
        rVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        list.getClass();
        o0 o0VarE = mVar.E(-1023877888);
        if ((i15 & 6) == 0) {
            i17 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= (i15 & 64) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.B(cVar2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= o0VarE.r(list) ? 2048 : 1024;
        }
        int i38 = i16 & 16;
        if (i38 == 0) {
            if ((i15 & 24576) == 0) {
                i18 = i14;
                i17 |= o0VarE.k(i18) ? 16384 : 8192;
            }
            i19 = i16 & 32;
            if (i19 != 0) {
                if ((196608 & i15) == 0) {
                    z16 = z14;
                    if (o0VarE.h(z16)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i17 |= i24;
                }
                i25 = i16 & 64;
                if (i25 != 0) {
                    if ((1572864 & i15) == 0) {
                        aVar2 = aVar;
                        if (o0VarE.r(aVar2)) {
                            i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i26 = 524288;
                        }
                        i17 |= i26;
                    }
                    i27 = i16 & 128;
                    if (i27 != 0) {
                        if ((12582912 & i15) == 0) {
                            z17 = z15;
                            if (o0VarE.h(z17)) {
                                i28 = 8388608;
                            } else {
                                i28 = 4194304;
                            }
                            i17 |= i28;
                        }
                        i29 = i17;
                        i30 = i16 & 256;
                        if (i30 != 0) {
                            i34 = i29 | 100663296;
                        } else if ((i15 & 100663296) == 0) {
                            if (o0VarE.r(lVar)) {
                                i35 = 67108864;
                            } else {
                                i35 = 33554432;
                            }
                            i34 = i29 | i35;
                        } else {
                            i34 = i29;
                        }
                        if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                            if (o0VarE.r(this)) {
                                i37 = 536870912;
                            } else {
                                i37 = 268435456;
                            }
                            i34 |= i37;
                        }
                        if ((i34 & 306783379) != 306783378) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (o0VarE.n(i34 & 1, z18)) {
                            if (i38 != 0) {
                                i36 = 3;
                            } else {
                                i36 = i18;
                            }
                            if (i19 != 0) {
                                z25 = false;
                            } else {
                                z25 = z16;
                            }
                            if (i25 != 0) {
                                aVar4 = null;
                            } else {
                                aVar4 = aVar2;
                            }
                            if (i27 != 0) {
                                z26 = false;
                            } else {
                                z26 = z17;
                            }
                            if (i30 != 0) {
                                lVar3 = null;
                            } else {
                                lVar3 = lVar;
                            }
                            x1 x1Var = n.f135158a;
                            e(rVar, cVar, cVar2, list, i36, z25, aVar4, z26, lVar3).invoke(o0VarE, 0);
                            lVar2 = lVar3;
                            z24 = z26;
                            aVar3 = aVar4;
                            z19 = z25;
                            i18 = i36;
                        } else {
                            o0VarE.e();
                            z19 = z16;
                            aVar3 = aVar2;
                            z24 = z17;
                            lVar2 = lVar;
                        }
                        p2VarI0 = o0VarE.i0();
                        if (p2VarI0 != null) {
                            p2VarI0.f135219d = new c1(this, rVar, cVar, cVar2, list, i18, z19, aVar3, z24, lVar2, i15, i16);
                        }
                    }
                    i17 |= 12582912;
                    z17 = z15;
                    i29 = i17;
                    i30 = i16 & 256;
                    if (i30 != 0) {
                        i34 = i29 | 100663296;
                    } else if ((i15 & 100663296) == 0) {
                        if (o0VarE.r(lVar)) {
                            i35 = 67108864;
                        } else {
                            i35 = 33554432;
                        }
                        i34 = i29 | i35;
                    } else {
                        i34 = i29;
                    }
                    if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(this)) {
                            i37 = 536870912;
                        } else {
                            i37 = 268435456;
                        }
                        i34 |= i37;
                    }
                    if ((i34 & 306783379) != 306783378) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (o0VarE.n(i34 & 1, z18)) {
                        if (i38 != 0) {
                            i36 = 3;
                        } else {
                            i36 = i18;
                        }
                        if (i19 != 0) {
                            z25 = false;
                        } else {
                            z25 = z16;
                        }
                        if (i25 != 0) {
                            aVar4 = null;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i27 != 0) {
                            z26 = false;
                        } else {
                            z26 = z17;
                        }
                        if (i30 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        x1 x1Var2 = n.f135158a;
                        e(rVar, cVar, cVar2, list, i36, z25, aVar4, z26, lVar3).invoke(o0VarE, 0);
                        lVar2 = lVar3;
                        z24 = z26;
                        aVar3 = aVar4;
                        z19 = z25;
                        i18 = i36;
                    } else {
                        o0VarE.e();
                        z19 = z16;
                        aVar3 = aVar2;
                        z24 = z17;
                        lVar2 = lVar;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new c1(this, rVar, cVar, cVar2, list, i18, z19, aVar3, z24, lVar2, i15, i16);
                    }
                }
                i17 |= 1572864;
                aVar2 = aVar;
                i27 = i16 & 128;
                if (i27 != 0) {
                    if ((12582912 & i15) == 0) {
                        z17 = z15;
                        if (o0VarE.h(z17)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i17 |= i28;
                    }
                    i29 = i17;
                    i30 = i16 & 256;
                    if (i30 != 0) {
                        i34 = i29 | 100663296;
                    } else if ((i15 & 100663296) == 0) {
                        if (o0VarE.r(lVar)) {
                            i35 = 67108864;
                        } else {
                            i35 = 33554432;
                        }
                        i34 = i29 | i35;
                    } else {
                        i34 = i29;
                    }
                    if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(this)) {
                            i37 = 536870912;
                        } else {
                            i37 = 268435456;
                        }
                        i34 |= i37;
                    }
                    if ((i34 & 306783379) != 306783378) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (o0VarE.n(i34 & 1, z18)) {
                        if (i38 != 0) {
                            i36 = 3;
                        } else {
                            i36 = i18;
                        }
                        if (i19 != 0) {
                            z25 = false;
                        } else {
                            z25 = z16;
                        }
                        if (i25 != 0) {
                            aVar4 = null;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i27 != 0) {
                            z26 = false;
                        } else {
                            z26 = z17;
                        }
                        if (i30 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        x1 x1Var3 = n.f135158a;
                        e(rVar, cVar, cVar2, list, i36, z25, aVar4, z26, lVar3).invoke(o0VarE, 0);
                        lVar2 = lVar3;
                        z24 = z26;
                        aVar3 = aVar4;
                        z19 = z25;
                        i18 = i36;
                    } else {
                        o0VarE.e();
                        z19 = z16;
                        aVar3 = aVar2;
                        z24 = z17;
                        lVar2 = lVar;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new c1(this, rVar, cVar, cVar2, list, i18, z19, aVar3, z24, lVar2, i15, i16);
                    }
                }
                i17 |= 12582912;
                z17 = z15;
                i29 = i17;
                i30 = i16 & 256;
                if (i30 != 0) {
                    i34 = i29 | 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (o0VarE.r(lVar)) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i34 = i29 | i35;
                } else {
                    i34 = i29;
                }
                if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(this)) {
                        i37 = 536870912;
                    } else {
                        i37 = 268435456;
                    }
                    i34 |= i37;
                }
                if ((i34 & 306783379) != 306783378) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i34 & 1, z18)) {
                    if (i38 != 0) {
                        i36 = 3;
                    } else {
                        i36 = i18;
                    }
                    if (i19 != 0) {
                        z25 = false;
                    } else {
                        z25 = z16;
                    }
                    if (i25 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i27 != 0) {
                        z26 = false;
                    } else {
                        z26 = z17;
                    }
                    if (i30 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    x1 x1Var4 = n.f135158a;
                    e(rVar, cVar, cVar2, list, i36, z25, aVar4, z26, lVar3).invoke(o0VarE, 0);
                    lVar2 = lVar3;
                    z24 = z26;
                    aVar3 = aVar4;
                    z19 = z25;
                    i18 = i36;
                } else {
                    o0VarE.e();
                    z19 = z16;
                    aVar3 = aVar2;
                    z24 = z17;
                    lVar2 = lVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new c1(this, rVar, cVar, cVar2, list, i18, z19, aVar3, z24, lVar2, i15, i16);
                }
            }
            i17 |= 196608;
            z16 = z14;
            i25 = i16 & 64;
            if (i25 != 0) {
                if ((1572864 & i15) == 0) {
                    aVar2 = aVar;
                    if (o0VarE.r(aVar2)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 128;
                if (i27 != 0) {
                    if ((12582912 & i15) == 0) {
                        z17 = z15;
                        if (o0VarE.h(z17)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i17 |= i28;
                    }
                    i29 = i17;
                    i30 = i16 & 256;
                    if (i30 != 0) {
                        i34 = i29 | 100663296;
                    } else if ((i15 & 100663296) == 0) {
                        if (o0VarE.r(lVar)) {
                            i35 = 67108864;
                        } else {
                            i35 = 33554432;
                        }
                        i34 = i29 | i35;
                    } else {
                        i34 = i29;
                    }
                    if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(this)) {
                            i37 = 536870912;
                        } else {
                            i37 = 268435456;
                        }
                        i34 |= i37;
                    }
                    if ((i34 & 306783379) != 306783378) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (o0VarE.n(i34 & 1, z18)) {
                        if (i38 != 0) {
                            i36 = 3;
                        } else {
                            i36 = i18;
                        }
                        if (i19 != 0) {
                            z25 = false;
                        } else {
                            z25 = z16;
                        }
                        if (i25 != 0) {
                            aVar4 = null;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i27 != 0) {
                            z26 = false;
                        } else {
                            z26 = z17;
                        }
                        if (i30 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        x1 x1Var5 = n.f135158a;
                        e(rVar, cVar, cVar2, list, i36, z25, aVar4, z26, lVar3).invoke(o0VarE, 0);
                        lVar2 = lVar3;
                        z24 = z26;
                        aVar3 = aVar4;
                        z19 = z25;
                        i18 = i36;
                    } else {
                        o0VarE.e();
                        z19 = z16;
                        aVar3 = aVar2;
                        z24 = z17;
                        lVar2 = lVar;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new c1(this, rVar, cVar, cVar2, list, i18, z19, aVar3, z24, lVar2, i15, i16);
                    }
                }
                i17 |= 12582912;
                z17 = z15;
                i29 = i17;
                i30 = i16 & 256;
                if (i30 != 0) {
                    i34 = i29 | 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (o0VarE.r(lVar)) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i34 = i29 | i35;
                } else {
                    i34 = i29;
                }
                if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(this)) {
                        i37 = 536870912;
                    } else {
                        i37 = 268435456;
                    }
                    i34 |= i37;
                }
                if ((i34 & 306783379) != 306783378) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i34 & 1, z18)) {
                    if (i38 != 0) {
                        i36 = 3;
                    } else {
                        i36 = i18;
                    }
                    if (i19 != 0) {
                        z25 = false;
                    } else {
                        z25 = z16;
                    }
                    if (i25 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i27 != 0) {
                        z26 = false;
                    } else {
                        z26 = z17;
                    }
                    if (i30 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    x1 x1Var6 = n.f135158a;
                    e(rVar, cVar, cVar2, list, i36, z25, aVar4, z26, lVar3).invoke(o0VarE, 0);
                    lVar2 = lVar3;
                    z24 = z26;
                    aVar3 = aVar4;
                    z19 = z25;
                    i18 = i36;
                } else {
                    o0VarE.e();
                    z19 = z16;
                    aVar3 = aVar2;
                    z24 = z17;
                    lVar2 = lVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new c1(this, rVar, cVar, cVar2, list, i18, z19, aVar3, z24, lVar2, i15, i16);
                }
            }
            i17 |= 1572864;
            aVar2 = aVar;
            i27 = i16 & 128;
            if (i27 != 0) {
                if ((12582912 & i15) == 0) {
                    z17 = z15;
                    if (o0VarE.h(z17)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i17 |= i28;
                }
                i29 = i17;
                i30 = i16 & 256;
                if (i30 != 0) {
                    i34 = i29 | 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (o0VarE.r(lVar)) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i34 = i29 | i35;
                } else {
                    i34 = i29;
                }
                if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(this)) {
                        i37 = 536870912;
                    } else {
                        i37 = 268435456;
                    }
                    i34 |= i37;
                }
                if ((i34 & 306783379) != 306783378) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i34 & 1, z18)) {
                    if (i38 != 0) {
                        i36 = 3;
                    } else {
                        i36 = i18;
                    }
                    if (i19 != 0) {
                        z25 = false;
                    } else {
                        z25 = z16;
                    }
                    if (i25 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i27 != 0) {
                        z26 = false;
                    } else {
                        z26 = z17;
                    }
                    if (i30 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    x1 x1Var7 = n.f135158a;
                    e(rVar, cVar, cVar2, list, i36, z25, aVar4, z26, lVar3).invoke(o0VarE, 0);
                    lVar2 = lVar3;
                    z24 = z26;
                    aVar3 = aVar4;
                    z19 = z25;
                    i18 = i36;
                } else {
                    o0VarE.e();
                    z19 = z16;
                    aVar3 = aVar2;
                    z24 = z17;
                    lVar2 = lVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new c1(this, rVar, cVar, cVar2, list, i18, z19, aVar3, z24, lVar2, i15, i16);
                }
            }
            i17 |= 12582912;
            z17 = z15;
            i29 = i17;
            i30 = i16 & 256;
            if (i30 != 0) {
                i34 = i29 | 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (o0VarE.r(lVar)) {
                    i35 = 67108864;
                } else {
                    i35 = 33554432;
                }
                i34 = i29 | i35;
            } else {
                i34 = i29;
            }
            if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(this)) {
                    i37 = 536870912;
                } else {
                    i37 = 268435456;
                }
                i34 |= i37;
            }
            if ((i34 & 306783379) != 306783378) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i34 & 1, z18)) {
                if (i38 != 0) {
                    i36 = 3;
                } else {
                    i36 = i18;
                }
                if (i19 != 0) {
                    z25 = false;
                } else {
                    z25 = z16;
                }
                if (i25 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                if (i27 != 0) {
                    z26 = false;
                } else {
                    z26 = z17;
                }
                if (i30 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                x1 x1Var8 = n.f135158a;
                e(rVar, cVar, cVar2, list, i36, z25, aVar4, z26, lVar3).invoke(o0VarE, 0);
                lVar2 = lVar3;
                z24 = z26;
                aVar3 = aVar4;
                z19 = z25;
                i18 = i36;
            } else {
                o0VarE.e();
                z19 = z16;
                aVar3 = aVar2;
                z24 = z17;
                lVar2 = lVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new c1(this, rVar, cVar, cVar2, list, i18, z19, aVar3, z24, lVar2, i15, i16);
            }
        }
        i17 |= 24576;
        i18 = i14;
        i19 = i16 & 32;
        if (i19 != 0) {
            if ((196608 & i15) == 0) {
                z16 = z14;
                if (o0VarE.h(z16)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i17 |= i24;
            }
            i25 = i16 & 64;
            if (i25 != 0) {
                if ((1572864 & i15) == 0) {
                    aVar2 = aVar;
                    if (o0VarE.r(aVar2)) {
                        i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i26 = 524288;
                    }
                    i17 |= i26;
                }
                i27 = i16 & 128;
                if (i27 != 0) {
                    if ((12582912 & i15) == 0) {
                        z17 = z15;
                        if (o0VarE.h(z17)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i17 |= i28;
                    }
                    i29 = i17;
                    i30 = i16 & 256;
                    if (i30 != 0) {
                        i34 = i29 | 100663296;
                    } else if ((i15 & 100663296) == 0) {
                        if (o0VarE.r(lVar)) {
                            i35 = 67108864;
                        } else {
                            i35 = 33554432;
                        }
                        i34 = i29 | i35;
                    } else {
                        i34 = i29;
                    }
                    if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                        if (o0VarE.r(this)) {
                            i37 = 536870912;
                        } else {
                            i37 = 268435456;
                        }
                        i34 |= i37;
                    }
                    if ((i34 & 306783379) != 306783378) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (o0VarE.n(i34 & 1, z18)) {
                        if (i38 != 0) {
                            i36 = 3;
                        } else {
                            i36 = i18;
                        }
                        if (i19 != 0) {
                            z25 = false;
                        } else {
                            z25 = z16;
                        }
                        if (i25 != 0) {
                            aVar4 = null;
                        } else {
                            aVar4 = aVar2;
                        }
                        if (i27 != 0) {
                            z26 = false;
                        } else {
                            z26 = z17;
                        }
                        if (i30 != 0) {
                            lVar3 = null;
                        } else {
                            lVar3 = lVar;
                        }
                        x1 x1Var9 = n.f135158a;
                        e(rVar, cVar, cVar2, list, i36, z25, aVar4, z26, lVar3).invoke(o0VarE, 0);
                        lVar2 = lVar3;
                        z24 = z26;
                        aVar3 = aVar4;
                        z19 = z25;
                        i18 = i36;
                    } else {
                        o0VarE.e();
                        z19 = z16;
                        aVar3 = aVar2;
                        z24 = z17;
                        lVar2 = lVar;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new c1(this, rVar, cVar, cVar2, list, i18, z19, aVar3, z24, lVar2, i15, i16);
                    }
                }
                i17 |= 12582912;
                z17 = z15;
                i29 = i17;
                i30 = i16 & 256;
                if (i30 != 0) {
                    i34 = i29 | 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (o0VarE.r(lVar)) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i34 = i29 | i35;
                } else {
                    i34 = i29;
                }
                if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(this)) {
                        i37 = 536870912;
                    } else {
                        i37 = 268435456;
                    }
                    i34 |= i37;
                }
                if ((i34 & 306783379) != 306783378) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i34 & 1, z18)) {
                    if (i38 != 0) {
                        i36 = 3;
                    } else {
                        i36 = i18;
                    }
                    if (i19 != 0) {
                        z25 = false;
                    } else {
                        z25 = z16;
                    }
                    if (i25 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i27 != 0) {
                        z26 = false;
                    } else {
                        z26 = z17;
                    }
                    if (i30 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    x1 x1Var10 = n.f135158a;
                    e(rVar, cVar, cVar2, list, i36, z25, aVar4, z26, lVar3).invoke(o0VarE, 0);
                    lVar2 = lVar3;
                    z24 = z26;
                    aVar3 = aVar4;
                    z19 = z25;
                    i18 = i36;
                } else {
                    o0VarE.e();
                    z19 = z16;
                    aVar3 = aVar2;
                    z24 = z17;
                    lVar2 = lVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new c1(this, rVar, cVar, cVar2, list, i18, z19, aVar3, z24, lVar2, i15, i16);
                }
            }
            i17 |= 1572864;
            aVar2 = aVar;
            i27 = i16 & 128;
            if (i27 != 0) {
                if ((12582912 & i15) == 0) {
                    z17 = z15;
                    if (o0VarE.h(z17)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i17 |= i28;
                }
                i29 = i17;
                i30 = i16 & 256;
                if (i30 != 0) {
                    i34 = i29 | 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (o0VarE.r(lVar)) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i34 = i29 | i35;
                } else {
                    i34 = i29;
                }
                if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(this)) {
                        i37 = 536870912;
                    } else {
                        i37 = 268435456;
                    }
                    i34 |= i37;
                }
                if ((i34 & 306783379) != 306783378) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i34 & 1, z18)) {
                    if (i38 != 0) {
                        i36 = 3;
                    } else {
                        i36 = i18;
                    }
                    if (i19 != 0) {
                        z25 = false;
                    } else {
                        z25 = z16;
                    }
                    if (i25 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i27 != 0) {
                        z26 = false;
                    } else {
                        z26 = z17;
                    }
                    if (i30 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    x1 x1Var11 = n.f135158a;
                    e(rVar, cVar, cVar2, list, i36, z25, aVar4, z26, lVar3).invoke(o0VarE, 0);
                    lVar2 = lVar3;
                    z24 = z26;
                    aVar3 = aVar4;
                    z19 = z25;
                    i18 = i36;
                } else {
                    o0VarE.e();
                    z19 = z16;
                    aVar3 = aVar2;
                    z24 = z17;
                    lVar2 = lVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new c1(this, rVar, cVar, cVar2, list, i18, z19, aVar3, z24, lVar2, i15, i16);
                }
            }
            i17 |= 12582912;
            z17 = z15;
            i29 = i17;
            i30 = i16 & 256;
            if (i30 != 0) {
                i34 = i29 | 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (o0VarE.r(lVar)) {
                    i35 = 67108864;
                } else {
                    i35 = 33554432;
                }
                i34 = i29 | i35;
            } else {
                i34 = i29;
            }
            if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(this)) {
                    i37 = 536870912;
                } else {
                    i37 = 268435456;
                }
                i34 |= i37;
            }
            if ((i34 & 306783379) != 306783378) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i34 & 1, z18)) {
                if (i38 != 0) {
                    i36 = 3;
                } else {
                    i36 = i18;
                }
                if (i19 != 0) {
                    z25 = false;
                } else {
                    z25 = z16;
                }
                if (i25 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                if (i27 != 0) {
                    z26 = false;
                } else {
                    z26 = z17;
                }
                if (i30 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                x1 x1Var12 = n.f135158a;
                e(rVar, cVar, cVar2, list, i36, z25, aVar4, z26, lVar3).invoke(o0VarE, 0);
                lVar2 = lVar3;
                z24 = z26;
                aVar3 = aVar4;
                z19 = z25;
                i18 = i36;
            } else {
                o0VarE.e();
                z19 = z16;
                aVar3 = aVar2;
                z24 = z17;
                lVar2 = lVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new c1(this, rVar, cVar, cVar2, list, i18, z19, aVar3, z24, lVar2, i15, i16);
            }
        }
        i17 |= 196608;
        z16 = z14;
        i25 = i16 & 64;
        if (i25 != 0) {
            if ((1572864 & i15) == 0) {
                aVar2 = aVar;
                if (o0VarE.r(aVar2)) {
                    i26 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i26 = 524288;
                }
                i17 |= i26;
            }
            i27 = i16 & 128;
            if (i27 != 0) {
                if ((12582912 & i15) == 0) {
                    z17 = z15;
                    if (o0VarE.h(z17)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i17 |= i28;
                }
                i29 = i17;
                i30 = i16 & 256;
                if (i30 != 0) {
                    i34 = i29 | 100663296;
                } else if ((i15 & 100663296) == 0) {
                    if (o0VarE.r(lVar)) {
                        i35 = 67108864;
                    } else {
                        i35 = 33554432;
                    }
                    i34 = i29 | i35;
                } else {
                    i34 = i29;
                }
                if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                    if (o0VarE.r(this)) {
                        i37 = 536870912;
                    } else {
                        i37 = 268435456;
                    }
                    i34 |= i37;
                }
                if ((i34 & 306783379) != 306783378) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i34 & 1, z18)) {
                    if (i38 != 0) {
                        i36 = 3;
                    } else {
                        i36 = i18;
                    }
                    if (i19 != 0) {
                        z25 = false;
                    } else {
                        z25 = z16;
                    }
                    if (i25 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (i27 != 0) {
                        z26 = false;
                    } else {
                        z26 = z17;
                    }
                    if (i30 != 0) {
                        lVar3 = null;
                    } else {
                        lVar3 = lVar;
                    }
                    x1 x1Var13 = n.f135158a;
                    e(rVar, cVar, cVar2, list, i36, z25, aVar4, z26, lVar3).invoke(o0VarE, 0);
                    lVar2 = lVar3;
                    z24 = z26;
                    aVar3 = aVar4;
                    z19 = z25;
                    i18 = i36;
                } else {
                    o0VarE.e();
                    z19 = z16;
                    aVar3 = aVar2;
                    z24 = z17;
                    lVar2 = lVar;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new c1(this, rVar, cVar, cVar2, list, i18, z19, aVar3, z24, lVar2, i15, i16);
                }
            }
            i17 |= 12582912;
            z17 = z15;
            i29 = i17;
            i30 = i16 & 256;
            if (i30 != 0) {
                i34 = i29 | 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (o0VarE.r(lVar)) {
                    i35 = 67108864;
                } else {
                    i35 = 33554432;
                }
                i34 = i29 | i35;
            } else {
                i34 = i29;
            }
            if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(this)) {
                    i37 = 536870912;
                } else {
                    i37 = 268435456;
                }
                i34 |= i37;
            }
            if ((i34 & 306783379) != 306783378) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i34 & 1, z18)) {
                if (i38 != 0) {
                    i36 = 3;
                } else {
                    i36 = i18;
                }
                if (i19 != 0) {
                    z25 = false;
                } else {
                    z25 = z16;
                }
                if (i25 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                if (i27 != 0) {
                    z26 = false;
                } else {
                    z26 = z17;
                }
                if (i30 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                x1 x1Var14 = n.f135158a;
                e(rVar, cVar, cVar2, list, i36, z25, aVar4, z26, lVar3).invoke(o0VarE, 0);
                lVar2 = lVar3;
                z24 = z26;
                aVar3 = aVar4;
                z19 = z25;
                i18 = i36;
            } else {
                o0VarE.e();
                z19 = z16;
                aVar3 = aVar2;
                z24 = z17;
                lVar2 = lVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new c1(this, rVar, cVar, cVar2, list, i18, z19, aVar3, z24, lVar2, i15, i16);
            }
        }
        i17 |= 1572864;
        aVar2 = aVar;
        i27 = i16 & 128;
        if (i27 != 0) {
            if ((12582912 & i15) == 0) {
                z17 = z15;
                if (o0VarE.h(z17)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i17 |= i28;
            }
            i29 = i17;
            i30 = i16 & 256;
            if (i30 != 0) {
                i34 = i29 | 100663296;
            } else if ((i15 & 100663296) == 0) {
                if (o0VarE.r(lVar)) {
                    i35 = 67108864;
                } else {
                    i35 = 33554432;
                }
                i34 = i29 | i35;
            } else {
                i34 = i29;
            }
            if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(this)) {
                    i37 = 536870912;
                } else {
                    i37 = 268435456;
                }
                i34 |= i37;
            }
            if ((i34 & 306783379) != 306783378) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i34 & 1, z18)) {
                if (i38 != 0) {
                    i36 = 3;
                } else {
                    i36 = i18;
                }
                if (i19 != 0) {
                    z25 = false;
                } else {
                    z25 = z16;
                }
                if (i25 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                if (i27 != 0) {
                    z26 = false;
                } else {
                    z26 = z17;
                }
                if (i30 != 0) {
                    lVar3 = null;
                } else {
                    lVar3 = lVar;
                }
                x1 x1Var15 = n.f135158a;
                e(rVar, cVar, cVar2, list, i36, z25, aVar4, z26, lVar3).invoke(o0VarE, 0);
                lVar2 = lVar3;
                z24 = z26;
                aVar3 = aVar4;
                z19 = z25;
                i18 = i36;
            } else {
                o0VarE.e();
                z19 = z16;
                aVar3 = aVar2;
                z24 = z17;
                lVar2 = lVar;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new c1(this, rVar, cVar, cVar2, list, i18, z19, aVar3, z24, lVar2, i15, i16);
            }
        }
        i17 |= 12582912;
        z17 = z15;
        i29 = i17;
        i30 = i16 & 256;
        if (i30 != 0) {
            i34 = i29 | 100663296;
        } else if ((i15 & 100663296) == 0) {
            if (o0VarE.r(lVar)) {
                i35 = 67108864;
            } else {
                i35 = 33554432;
            }
            i34 = i29 | i35;
        } else {
            i34 = i29;
        }
        if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarE.r(this)) {
                i37 = 536870912;
            } else {
                i37 = 268435456;
            }
            i34 |= i37;
        }
        if ((i34 & 306783379) != 306783378) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (o0VarE.n(i34 & 1, z18)) {
            if (i38 != 0) {
                i36 = 3;
            } else {
                i36 = i18;
            }
            if (i19 != 0) {
                z25 = false;
            } else {
                z25 = z16;
            }
            if (i25 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar2;
            }
            if (i27 != 0) {
                z26 = false;
            } else {
                z26 = z17;
            }
            if (i30 != 0) {
                lVar3 = null;
            } else {
                lVar3 = lVar;
            }
            x1 x1Var16 = n.f135158a;
            e(rVar, cVar, cVar2, list, i36, z25, aVar4, z26, lVar3).invoke(o0VarE, 0);
            lVar2 = lVar3;
            z24 = z26;
            aVar3 = aVar4;
            z19 = z25;
            i18 = i36;
        } else {
            o0VarE.e();
            z19 = z16;
            aVar3 = aVar2;
            z24 = z17;
            lVar2 = lVar;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c1(this, rVar, cVar, cVar2, list, i18, z19, aVar3, z24, lVar2, i15, i16);
        }
    }

    public abstract Object c(List<ke2.b> list, e23.l<? super Boolean, Unit> lVar, t13.d<? super Unit> dVar);

    public abstract e d(r rVar, l lVar, le2.b bVar, boolean z14, boolean z15, boolean z16, e23.l lVar2, e23.r rVar2, e23.l lVar3);

    public abstract e e(r rVar, c cVar, c cVar2, List list, int i14, boolean z14, e23.a aVar, boolean z15, e23.l lVar);

    public abstract Object f(List<ke2.b> list, t13.d<? super Unit> dVar);

    public abstract Unit g(ke2.b bVar);

    public abstract Object h(t13.d<? super Unit> dVar);

    public final void i(a aVar) {
        aVar.getClass();
        if (!s.g(this.f98597a, aVar)) {
            j(aVar);
        }
        this.f98597a = aVar;
    }

    public abstract void j(a aVar);
}
