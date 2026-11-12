package k90;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import o53.s0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lk90/d0;", "", "Ly80/n;", "deviceInfoRepository", "Lk90/m0;", "matchDeviceByCustomRuleUseCase", "Lo53/z;", "defaultDispatcher", "<init>", "(Ly80/n;Lk90/m0;Lo53/z;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y80.n f103447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f103448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o53.z f103449c;

    static {
        new a(null);
    }

    public d0(y80.n nVar, m0 m0Var, o53.z zVar) {
        nVar.getClass();
        m0Var.getClass();
        zVar.getClass();
        this.f103447a = nVar;
        this.f103448b = m0Var;
        this.f103449c = zVar;
    }

    public static final boolean a(d0 d0Var, String str, String str2) {
        d0Var.getClass();
        return (str == null || d53.w.J(str) || !d53.u.q(str, str2, true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x012b  */
    /* JADX WARN: Code duplicated, block: B:46:0x013c  */
    /* JADX WARN: Code duplicated, block: B:51:0x014b  */
    /* JADX WARN: Code duplicated, block: B:56:0x015a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0169  */
    /* JADX WARN: Code duplicated, block: B:66:0x0178  */
    /* JADX WARN: Code duplicated, block: B:71:0x0187  */
    /* JADX WARN: Code duplicated, block: B:78:0x0199 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x019b  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0217 A[PHI: r2 r3
      0x0217: PHI (r2v18 java.util.List) = (r2v12 java.util.List), (r2v21 java.util.List) binds: [B:90:0x0214, B:40:0x0129] A[DONT_GENERATE, DONT_INLINE]
      0x0217: PHI (r3v4 dk2.d) = (r3v1 dk2.d), (r3v7 dk2.d) binds: [B:90:0x0214, B:40:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x021a  */
    /* JADX WARN: Code duplicated, block: B:94:0x021d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:99:0x0240 A[RETURN] */
    public final Object b(dk2.d dVar, List list, v13.c cVar) throws Throwable {
        f0 f0Var;
        List list2;
        List list3;
        Object objC;
        long j8;
        dk2.d dVar2;
        int i14;
        List list4;
        dk2.d dVar3;
        String str;
        z80.d dVar4;
        l90.b bVar;
        Object objE0;
        l90.b bVar2;
        String str2;
        z80.d.c cVar2;
        String strA;
        String strA2;
        String strA3;
        String strA4;
        String strA5;
        String strA6;
        String str3;
        z80.d.c.C3786c c3786c;
        z80.d.c.C3786c c3786c2;
        z80.d.c.C3786c c3786c3;
        z80.d.c.C3786c c3786c4;
        z80.d.c.C3786c c3786c5;
        z80.d.c.C3786c c3786c6;
        dk2.d dVar5 = dVar;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i15 = f0Var.f103489h;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                f0Var.f103489h = i15 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        f0 f0Var2 = f0Var;
        Object objE1 = f0Var2.f103487f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = f0Var2.f103489h;
        o53.z zVar = this.f103449c;
        if (i16 == 0) {
            o13.r.b(objE1);
            a2 a2Var = a2.DEVICE_SETUP;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "GetDeviceInfoUseCase", "getDeviceInfo() - Getting device info for " + dVar5);
            Long l14 = dVar5.f60244h;
            if (l14 != null) {
                long jLongValue = l14.longValue();
                i2.a.b(a2Var, "GetDeviceInfoUseCase", "Fetch device info using unit ID: " + jLongValue);
                String str4 = dVar5.f60239c;
                String str5 = dVar5.f60237a;
                f0Var2.f103482a = dVar5;
                list3 = list;
                f0Var2.f103483b = list3;
                f0Var2.f103485d = jLongValue;
                f0Var2.f103486e = 0;
                f0Var2.f103489h = 1;
                objC = this.f103447a.c(jLongValue, str4, str5, f0Var2);
                if (objC != aVar) {
                    j8 = jLongValue;
                    dVar2 = dVar5;
                    i14 = 0;
                }
            } else {
                list2 = list;
                String str6 = dVar5.f60239c;
                String str7 = dVar5.f60237a;
                f0Var2.f103482a = null;
                f0Var2.f103483b = null;
                f0Var2.f103484c = null;
                f0Var2.f103489h = 3;
                objE0 = ge1.b.e0(zVar, new e0(str6, str7, null, str7, list2, this, null), f0Var2);
                if (objE0 != aVar) {
                    return objE0;
                }
            }
            return aVar;
        }
        if (i16 == 1) {
            i14 = f0Var2.f103486e;
            long j14 = f0Var2.f103485d;
            List list5 = f0Var2.f103483b;
            dk2.d dVar6 = f0Var2.f103482a;
            o13.r.b(objE1);
            j8 = j14;
            dVar2 = dVar6;
            objC = ((o13.q) objE1).f128597a;
            list3 = list5;
        } else {
            if (i16 != 2) {
                if (i16 == 3) {
                    o13.r.b(objE1);
                    return objE1;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dVar4 = f0Var2.f103484c;
            list4 = f0Var2.f103483b;
            dVar3 = f0Var2.f103482a;
            o13.r.b(objE1);
            str = null;
        }
        bVar2 = (l90.b) objE1;
        if (bVar2 != null) {
            str2 = dVar4.f202993i;
            cVar2 = dVar4.f202991g;
            if (cVar2 != null || (c3786c6 = cVar2.f203004c) == null) {
                strA = str;
            } else {
                strA = c3786c6.a();
            }
            if (cVar2 != null || (c3786c5 = cVar2.f203008g) == null) {
                strA2 = str;
            } else {
                strA2 = c3786c5.a();
            }
            if (cVar2 != null || (c3786c4 = cVar2.f203003b) == null) {
                strA3 = str;
            } else {
                strA3 = c3786c4.a();
            }
            if (cVar2 != null || (c3786c3 = cVar2.f203005d) == null) {
                strA4 = str;
            } else {
                strA4 = c3786c3.a();
            }
            if (cVar2 != null || (c3786c2 = cVar2.f203006e) == null) {
                strA5 = str;
            } else {
                strA5 = c3786c2.a();
            }
            if (cVar2 != null || (c3786c = cVar2.f203007f) == null) {
                strA6 = str;
            } else {
                strA6 = c3786c.a();
            }
            String str8 = dVar4.f203000p;
            o90.a aVar2 = bVar2.f111526k;
            if (str2 == null && !d53.w.J(str2)) {
                str3 = str2;
            } else if (strA == null && !d53.w.J(strA)) {
                str3 = strA;
            } else if (strA2 != null || d53.w.J(strA2)) {
                str2 = bVar2.f111526k.f130962a;
                str3 = str2;
            } else {
                str3 = strA2;
            }
            o90.a aVarB = o90.a.b(aVar2, str3, null, strA3, strA, strA4, strA5, strA6, strA2, 2);
            String str9 = bVar2.f111516a;
            boolean z14 = bVar2.f111517b;
            boolean z15 = bVar2.f111518c;
            List<String> list6 = bVar2.f111519d;
            String str10 = bVar2.f111520e;
            String str11 = bVar2.f111521f;
            String str12 = bVar2.f111522g;
            String str13 = bVar2.f111523h;
            String str14 = bVar2.f111524i;
            boolean z16 = bVar2.f111527l;
            l90.j jVar = bVar2.f111528m;
            l90.i iVar = bVar2.f111529n;
            yl2.b bVar3 = bVar2.f111530o;
            d90.d dVar7 = bVar2.f111531p;
            str9.getClass();
            str11.getClass();
            str12.getClass();
            str14.getClass();
            bVar3.getClass();
            dVar7.getClass();
            bVar = new l90.b(str9, z14, z15, list6, str10, str11, str12, str13, str14, str8, aVarB, z16, jVar, iVar, bVar3, dVar7);
        } else {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        list2 = list4;
        dVar5 = dVar3;
        String str15 = dVar5.f60239c;
        String str16 = dVar5.f60237a;
        f0Var2.f103482a = null;
        f0Var2.f103483b = null;
        f0Var2.f103484c = null;
        f0Var2.f103489h = 3;
        objE0 = ge1.b.e0(zVar, new e0(str15, str16, null, str16, list2, this, null), f0Var2);
        if (objE0 != aVar) {
            return aVar;
        }
        return objE0;
        int i17 = o13.q.f128596b;
        if (objC instanceof o13.q.b) {
            objC = null;
        }
        z80.d dVar8 = (z80.d) objC;
        if (dVar8 != null) {
            i2.f36769a.getClass();
            i2.a.b(a2.DEVICE_SETUP, "GetDeviceInfoUseCase", "Device info found for unit ID " + j8 + ": " + dVar8);
            String strF = w5.r.f(dVar8.f202998n);
            String str17 = dVar8.f202985a;
            String str18 = dVar8.f202999o;
            String str19 = dVar8.f202990f;
            String string = str19 != null ? d53.w.i0(d53.w.O(d53.w.O(str19, "Garmin "), "GARMIN ")).toString() : null;
            f0Var2.f103482a = dVar2;
            f0Var2.f103483b = list3;
            f0Var2.f103484c = dVar8;
            f0Var2.f103485d = j8;
            f0Var2.f103486e = i14;
            f0Var2.f103489h = 2;
            List list7 = list3;
            str = null;
            objE1 = ge1.b.e0(zVar, new e0(strF, str17, str18, string, list7, this, null), f0Var2);
            if (objE1 != aVar) {
                list4 = list7;
                dVar3 = dVar2;
                dVar4 = dVar8;
                bVar2 = (l90.b) objE1;
                if (bVar2 != null) {
                    str2 = dVar4.f202993i;
                    cVar2 = dVar4.f202991g;
                    if (cVar2 != null) {
                        strA = str;
                    } else {
                        strA = str;
                    }
                    if (cVar2 != null) {
                        strA2 = str;
                    } else {
                        strA2 = str;
                    }
                    if (cVar2 != null) {
                        strA3 = str;
                    } else {
                        strA3 = str;
                    }
                    if (cVar2 != null) {
                        strA4 = str;
                    } else {
                        strA4 = str;
                    }
                    if (cVar2 != null) {
                        strA5 = str;
                    } else {
                        strA5 = str;
                    }
                    if (cVar2 != null) {
                        strA6 = str;
                    } else {
                        strA6 = str;
                    }
                    String str20 = dVar4.f203000p;
                    o90.a aVar3 = bVar2.f111526k;
                    if (str2 == null) {
                        if (strA == null) {
                            if (strA2 != null) {
                            }
                            str2 = bVar2.f111526k.f130962a;
                            str3 = str2;
                        } else {
                            if (strA2 != null) {
                            }
                            str2 = bVar2.f111526k.f130962a;
                            str3 = str2;
                        }
                    } else if (strA == null) {
                        if (strA2 != null) {
                        }
                        str2 = bVar2.f111526k.f130962a;
                        str3 = str2;
                    } else {
                        if (strA2 != null) {
                        }
                        str2 = bVar2.f111526k.f130962a;
                        str3 = str2;
                    }
                    o90.a aVarB2 = o90.a.b(aVar3, str3, null, strA3, strA, strA4, strA5, strA6, strA2, 2);
                    String str21 = bVar2.f111516a;
                    boolean z17 = bVar2.f111517b;
                    boolean z18 = bVar2.f111518c;
                    List<String> list8 = bVar2.f111519d;
                    String str110 = bVar2.f111520e;
                    String str111 = bVar2.f111521f;
                    String str112 = bVar2.f111522g;
                    String str113 = bVar2.f111523h;
                    String str114 = bVar2.f111524i;
                    boolean z19 = bVar2.f111527l;
                    l90.j jVar2 = bVar2.f111528m;
                    l90.i iVar2 = bVar2.f111529n;
                    yl2.b bVar4 = bVar2.f111530o;
                    d90.d dVar9 = bVar2.f111531p;
                    str21.getClass();
                    str111.getClass();
                    str112.getClass();
                    str114.getClass();
                    bVar4.getClass();
                    dVar9.getClass();
                    bVar = new l90.b(str21, z17, z18, list8, str110, str111, str112, str113, str114, str20, aVarB2, z19, jVar2, iVar2, bVar4, dVar9);
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    return bVar;
                }
                list2 = list4;
                dVar5 = dVar3;
                String str115 = dVar5.f60239c;
                String str116 = dVar5.f60237a;
                f0Var2.f103482a = null;
                f0Var2.f103483b = null;
                f0Var2.f103484c = null;
                f0Var2.f103489h = 3;
                objE0 = ge1.b.e0(zVar, new e0(str115, str116, null, str116, list2, this, null), f0Var2);
                if (objE0 != aVar) {
                    return objE0;
                }
            }
        } else {
            list4 = list3;
            dVar3 = dVar2;
            bVar = null;
            if (bVar != null) {
                return bVar;
            }
            list2 = list4;
            dVar5 = dVar3;
            String str117 = dVar5.f60239c;
            String str118 = dVar5.f60237a;
            f0Var2.f103482a = null;
            f0Var2.f103483b = null;
            f0Var2.f103484c = null;
            f0Var2.f103489h = 3;
            objE0 = ge1.b.e0(zVar, new e0(str117, str118, null, str118, list2, this, null), f0Var2);
            if (objE0 != aVar) {
                return objE0;
            }
        }
        return aVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk90/d0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public d0(y80.n nVar, m0 m0Var, o53.z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(nVar, m0Var, (i14 & 4) != 0 ? s0.f129406a : zVar);
    }
}
