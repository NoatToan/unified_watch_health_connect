package nt2;

import lc.u0;
import mt2.k;
import mt2.l;
import o13.r;
import o73.u;
import o73.v;
import ot2.n;
import p005kotlin.Metadata;
import p13.w;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lnt2/f;", "", "Llt2/h;", "userSettings", "Llt2/f;", "workout", "Llt2/g;", "workoutStep", "<init>", "(Llt2/h;Llt2/f;Llt2/g;)V", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lt2.h f127846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lt2.f f127847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lt2.g f127848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f127849d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127850a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.StepType.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.ExerciseName.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.EndCondition.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.PrimaryTarget.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.SecondaryTarget.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d.StrokeType.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d.EquipmentType.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[d.NoValue.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f127850a = iArr;
        }
    }

    public f(lt2.h hVar, lt2.f fVar, lt2.g gVar) {
        i iVar;
        i iVar2;
        hVar.getClass();
        fVar.getClass();
        gVar.getClass();
        this.f127846a = hVar;
        this.f127847b = fVar;
        this.f127848c = gVar;
        k kVar = fVar.f114885a;
        boolean z14 = fVar.f114887c;
        l lVar = gVar.f114889a;
        kVar.getClass();
        lVar.getClass();
        if (z14) {
            iVar = new i(null, d.ExerciseName, d.StepType, x.k(d.EndCondition, d.PrimaryTarget, d.SecondaryTarget), new c(nt2.a.StepsPerMinute));
        } else {
            switch (b.f127833a[kVar.ordinal()]) {
                case 1:
                    iVar = new i(null, d.StepType, d.NoValue, x.k(d.EndCondition, d.PrimaryTarget, d.SecondaryTarget), new c(nt2.a.RevolutionsPerMinute));
                    break;
                case 2:
                    iVar = new i(null, d.StepType, d.NoValue, lVar == l.REST ? w.c(d.EndCondition) : x.k(d.EndCondition, d.StrokeType, d.EquipmentType), new c(nt2.a.StepsPerMinute));
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    if (lVar != l.REST) {
                        iVar2 = new i(d.StepType, d.ExerciseName, d.NoValue, w.c(d.EndCondition), new c(nt2.a.StepsPerMinute));
                        iVar = iVar2;
                    } else {
                        iVar = new i(null, d.StepType, d.NoValue, w.c(d.EndCondition), new c(nt2.a.StepsPerMinute));
                    }
                    break;
                case 8:
                    if (lVar != l.REST) {
                        iVar2 = new i(d.StepType, d.ExerciseName, d.NoValue, x.k(d.EndCondition, d.PrimaryTarget), new c(nt2.a.StepsPerMinute));
                        iVar = iVar2;
                    } else {
                        iVar = new i(null, d.StepType, d.NoValue, x.k(d.EndCondition, d.PrimaryTarget), new c(nt2.a.StepsPerMinute));
                    }
                    break;
                case 9:
                case 10:
                    iVar = new i(null, d.StepType, d.NoValue, x.k(d.EndCondition, d.PrimaryTarget, d.SecondaryTarget), new c(nt2.a.StepsPerMinute));
                    break;
                default:
                    u0.r();
                    throw null;
            }
        }
        this.f127849d = iVar;
    }

    public static Object b(f fVar, d dVar, boolean z14, v13.c cVar, int i14) {
        u uVar;
        Object objA;
        Object objA2;
        boolean z15 = (i14 & 2) == 0;
        boolean z16 = (i14 & 4) == 0 ? z14 : false;
        lt2.f fVar2 = fVar.f127847b;
        i iVar = fVar.f127849d;
        lt2.h hVar = fVar.f127846a;
        lt2.g gVar = fVar.f127848c;
        switch (dVar == null ? -1 : a.f127850a[dVar.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                u0.r();
                return null;
            case 1:
                l lVar = gVar.f114889a;
                boolean z17 = hVar.f114899b;
                k kVar = fVar2.f114885a;
                lVar.getClass();
                switch (l.a.f121081b[lVar.ordinal()]) {
                    case 1:
                        switch (l.a.f121080a[kVar.ordinal()]) {
                            case 1:
                                if (!z17) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    uVar = (u) kt2.e.P.getValue();
                                } else {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    uVar = (u) kt2.e.f106496m.getValue();
                                }
                                break;
                            case 2:
                                if (!z17) {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    uVar = (u) kt2.e.B0.getValue();
                                } else {
                                    kt2.f.f106534a.getClass();
                                    kt2.e.f106460a.getClass();
                                    uVar = (u) kt2.e.f106499n.getValue();
                                }
                                break;
                            case 3:
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                uVar = (u) kt2.e.H0.getValue();
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                uVar = (u) kt2.e.L0.getValue();
                                break;
                            case 9:
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                uVar = (u) kt2.e.U.getValue();
                                break;
                            case 10:
                                kt2.f.f106534a.getClass();
                                kt2.e.f106460a.getClass();
                                uVar = (u) kt2.e.X.getValue();
                                break;
                            default:
                                u0.r();
                                return null;
                        }
                        break;
                    case 2:
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        uVar = (u) kt2.e.f106510q1.getValue();
                        break;
                    case 3:
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        uVar = (u) kt2.e.f106501n1.getValue();
                        break;
                    case 4:
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        uVar = (u) kt2.e.f106489j1.getValue();
                        break;
                    case 5:
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        uVar = (u) kt2.e.f106507p1.getValue();
                        break;
                    case 6:
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        uVar = (u) kt2.e.f106504o1.getValue();
                        break;
                    default:
                        u0.r();
                        return null;
                }
                Object objA3 = v.a(uVar, cVar);
                return objA3 == u13.a.COROUTINE_SUSPENDED ? objA3 : (String) objA3;
            case 2:
                return gVar.f114890b;
            case 3:
                return ot2.b.f(z15, z16, hVar.f114898a, fVar2.f114885a, fVar2.f114886b, fVar2.f114888d, gVar.f114892d, gVar.f114895g, cVar);
            case 4:
                boolean z18 = z15;
                boolean z19 = z16;
                lt2.b bVar = gVar.f114893e;
                if (bVar == null) {
                    return null;
                }
                Object objE = n.e(z18, z19, hVar.f114898a, hVar.f114900c, hVar.f114901d, iVar.f127869e.f127834a, bVar, cVar);
                return objE == u13.a.COROUTINE_SUSPENDED ? objE : (String) objE;
            case 5:
                lt2.b bVar2 = gVar.f114894f;
                if (bVar2 == null) {
                    return null;
                }
                Object objE2 = n.e(z15, z16, hVar.f114898a, hVar.f114900c, hVar.f114901d, iVar.f127869e.f127834a, bVar2, cVar);
                return objE2 == u13.a.COROUTINE_SUSPENDED ? objE2 : (String) objE2;
            case 6:
                mt2.h hVar2 = gVar.f114896h;
                if (hVar2 == null) {
                    return null;
                }
                switch (mt2.h.a.f121043a[hVar2.ordinal()]) {
                    case 1:
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        objA = v.a((u) kt2.e.f106472e.getValue(), cVar);
                        break;
                    case 2:
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        objA = v.a((u) kt2.e.f106475f.getValue(), cVar);
                        break;
                    case 3:
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        objA = v.a((u) kt2.e.f106478g.getValue(), cVar);
                        break;
                    case 4:
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        objA = v.a((u) kt2.e.f106481h.getValue(), cVar);
                        break;
                    case 5:
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        objA = v.a((u) kt2.e.f106469d.getValue(), cVar);
                        break;
                    case 6:
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        objA = v.a((u) kt2.e.f106484i.getValue(), cVar);
                        break;
                    case 7:
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        objA = v.a((u) kt2.e.f106487j.getValue(), cVar);
                        break;
                    case 8:
                        kt2.f.f106534a.getClass();
                        kt2.e.f106460a.getClass();
                        objA = v.a((u) kt2.e.f106490k.getValue(), cVar);
                        break;
                    default:
                        u0.r();
                        return null;
                }
                return objA == u13.a.COROUTINE_SUSPENDED ? objA : (String) objA;
            case 7:
                mt2.g gVar2 = gVar.f114897i;
                if (gVar2 == null) {
                    return null;
                }
                int i15 = mt2.g.a.f121033a[gVar2.ordinal()];
                if (i15 == 1) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    objA2 = v.a((u) kt2.e.D.getValue(), cVar);
                } else if (i15 == 2) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    objA2 = v.a((u) kt2.e.E.getValue(), cVar);
                } else if (i15 == 3) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    objA2 = v.a((u) kt2.e.F.getValue(), cVar);
                } else if (i15 == 4) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    objA2 = v.a((u) kt2.e.G.getValue(), cVar);
                } else {
                    if (i15 != 5) {
                        u0.r();
                        return null;
                    }
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    objA2 = v.a((u) kt2.e.H.getValue(), cVar);
                }
                return objA2 == u13.a.COROUTINE_SUSPENDED ? objA2 : (String) objA2;
            case 8:
                if (z15) {
                    kt2.f.f106534a.getClass();
                    kt2.e.f106460a.getClass();
                    Object objA4 = v.a((u) kt2.e.Z0.getValue(), cVar);
                    return objA4 == u13.a.COROUTINE_SUSPENDED ? objA4 : (String) objA4;
                }
                kt2.f.f106534a.getClass();
                kt2.e.f106460a.getClass();
                Object objA5 = v.a((u) kt2.e.P0.getValue(), cVar);
                return objA5 == u13.a.COROUTINE_SUSPENDED ? objA5 : (String) objA5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0076  */
    /* JADX WARN: Code duplicated, block: B:22:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0095 -> B:23:0x0096). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00dc -> B:33:0x00dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e9 -> B:39:0x00ea). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(boolean r11, v13.c r12) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nt2.f.a(boolean, v13.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00af  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        if (r11 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(v13.c cVar) {
        h hVar;
        f fVar;
        String str;
        f fVar2;
        Object objB;
        String str2;
        String str3;
        String str4;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f127864e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f127864e = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objB2 = hVar.f127862c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f127864e;
        if (i15 == 0) {
            r.b(objB2);
            d dVar = this.f127849d.f127866b;
            hVar.f127860a = this;
            hVar.f127864e = 1;
            objB2 = b(this, dVar, false, hVar, 6);
            if (objB2 != aVar) {
                fVar = this;
            }
            return aVar;
        }
        if (i15 == 1) {
            fVar = (f) hVar.f127860a;
            r.b(objB2);
        } else {
            if (i15 == 2) {
                fVar = (f) hVar.f127860a;
                r.b(objB2);
                str = (String) objB2;
                if (str == null) {
                    str = "";
                }
                fVar2 = fVar;
                d dVar2 = fVar2.f127849d.f127866b;
                hVar.f127860a = fVar2;
                hVar.f127861b = str;
                hVar.f127864e = 3;
                objB = b(fVar2, dVar2, false, hVar, 4);
                if (objB != aVar) {
                    str2 = str;
                    objB2 = objB;
                    str3 = (String) objB2;
                    if (str3 == null) {
                        d dVar3 = fVar2.f127849d.f127867c;
                        hVar.f127860a = str2;
                        hVar.f127861b = null;
                        hVar.f127864e = 4;
                        objB2 = b(fVar2, dVar3, false, hVar, 4);
                        if (objB2 != aVar) {
                            str4 = str2;
                        }
                    }
                    return new e(str2, str3);
                }
                return aVar;
            }
            if (i15 == 3) {
                str2 = hVar.f127861b;
                fVar2 = (f) hVar.f127860a;
                r.b(objB2);
                str3 = (String) objB2;
                if (str3 == null) {
                    d dVar4 = fVar2.f127849d.f127867c;
                    hVar.f127860a = str2;
                    hVar.f127861b = null;
                    hVar.f127864e = 4;
                    objB2 = b(fVar2, dVar4, false, hVar, 4);
                    if (objB2 != aVar) {
                        str4 = str2;
                    }
                    return aVar;
                }
                return new e(str2, str3);
            }
            if (i15 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str4 = (String) hVar.f127860a;
            r.b(objB2);
        }
        str3 = (String) objB2;
        if (str3 == null) {
            str3 = str4;
            str2 = str3;
        } else {
            str2 = str4;
        }
        return new e(str2, str3);
        str = (String) objB2;
        if (str == null) {
            d dVar5 = fVar.f127849d.f127867c;
            hVar.f127860a = fVar;
            hVar.f127864e = 2;
            objB2 = b(fVar, dVar5, false, hVar, 6);
        } else {
            fVar2 = fVar;
            d dVar6 = fVar2.f127849d.f127866b;
            hVar.f127860a = fVar2;
            hVar.f127861b = str;
            hVar.f127864e = 3;
            objB = b(fVar2, dVar6, false, hVar, 4);
            if (objB != aVar) {
                str2 = str;
                objB2 = objB;
                str3 = (String) objB2;
                if (str3 == null) {
                    d dVar7 = fVar2.f127849d.f127867c;
                    hVar.f127860a = str2;
                    hVar.f127861b = null;
                    hVar.f127864e = 4;
                    objB2 = b(fVar2, dVar7, false, hVar, 4);
                    if (objB2 != aVar) {
                        str4 = str2;
                        str3 = (String) objB2;
                        if (str3 == null) {
                            str3 = str4;
                            str2 = str3;
                        } else {
                            str2 = str4;
                        }
                    }
                }
                return new e(str2, str3);
            }
        }
        return aVar;
    }
}
