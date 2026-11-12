package f90;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o13.p;
import o13.r;
import p005kotlin.Metadata;
import p13.j0;
import p92.o;
import q92.v;
import q92.x;
import z10.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lf90/b;", "", "", "isChildAccount", "<init>", "(Z)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f69963b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f69964a;

    static {
        new a(null);
    }

    public b(boolean z14) {
        this.f69964a = z14;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:108:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x018d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x010e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0111  */
    /* JADX WARN: Code duplicated, block: B:46:0x0119  */
    /* JADX WARN: Code duplicated, block: B:49:0x0123  */
    /* JADX WARN: Code duplicated, block: B:57:0x013c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0142  */
    /* JADX WARN: Code duplicated, block: B:62:0x014c  */
    /* JADX WARN: Code duplicated, block: B:63:0x014e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0155  */
    /* JADX WARN: Code duplicated, block: B:67:0x0158  */
    /* JADX WARN: Code duplicated, block: B:70:0x0160  */
    /* JADX WARN: Code duplicated, block: B:71:0x0163  */
    /* JADX WARN: Code duplicated, block: B:75:0x0174  */
    /* JADX WARN: Code duplicated, block: B:77:0x0180  */
    /* JADX WARN: Code duplicated, block: B:78:0x0182  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0197  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:98:0x01cb  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r3 == r5) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r3 == r5) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(x xVar, boolean z14, v13.c cVar) {
        c cVar2;
        v vVar;
        x xVar2;
        v vVar2;
        s92.g gVar;
        s92.j jVar;
        List<s92.f> listF;
        List<s92.b> listB;
        String headline;
        String str;
        String grantButton;
        String str2;
        String rejectButton;
        String str3;
        ArrayList arrayList;
        List<s92.e> listD;
        ?? arrayList2;
        x xVar3;
        g90.c cVar3;
        String text;
        String url;
        String copy;
        g90.b bVar;
        Iterator it;
        Object next;
        s92.f fVar;
        x xVar4 = xVar;
        boolean z15 = z14;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f69970f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f69970f = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objC = cVar2.f69968d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f69970f;
        if (i15 == 0) {
            r.b(objC);
            if (z15) {
                o oVar = o.f136619a;
                oVar.getClass();
                v vVarN = o.n(xVar4);
                if (vVarN == null) {
                    cVar2.f69965a = xVar4;
                    cVar2.f69967c = z15;
                    cVar2.f69970f = 1;
                    objC = oVar.c(xVar4, cVar2);
                } else {
                    vVar = vVarN;
                }
            } else {
                o oVar2 = o.f136619a;
                cVar2.f69965a = xVar4;
                cVar2.f69967c = z15;
                cVar2.f69970f = 2;
                objC = oVar2.c(xVar4, cVar2);
            }
            return aVar;
        }
        if (i15 == 1) {
            boolean z16 = cVar2.f69967c;
            x xVar5 = cVar2.f69965a;
            r.b(objC);
            z15 = z16;
            xVar4 = xVar5;
            vVar = (v) objC;
        } else if (i15 == 2) {
            boolean z17 = cVar2.f69967c;
            x xVar6 = cVar2.f69965a;
            r.b(objC);
            z15 = z17;
            xVar4 = xVar6;
            vVar = (v) objC;
        } else {
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vVar2 = cVar2.f69966b;
            xVar2 = cVar2.f69965a;
            r.b(objC);
        }
        gVar = (s92.g) objC;
        if (vVar2 != null && gVar != null) {
            a2 a2Var = a2.DEVICE_SETUP;
            String strM = am.j.m("Consent text fetched for ", xVar2.f143819a, ", creating consent request route");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "CheckConsentUseCase", strM);
            String strName = xVar2.name();
            if (this.f69964a) {
                jVar = s92.j.CHILD;
            } else {
                jVar = s92.j.INDIVIDUAL;
            }
            listF = gVar.f();
            if (listF != null) {
                it = listF.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((s92.f) next).getType() != jVar);
                fVar = (s92.f) next;
                if (fVar != null || (listB = fVar.b()) == null) {
                    listB = gVar.b();
                    if (listB == null) {
                        listB = j0.f134944a;
                    }
                }
            } else {
                listB = gVar.b();
                if (listB == null) {
                    listB = j0.f134944a;
                }
            }
            headline = gVar.getHeadline();
            if (headline == null) {
                str = "";
            } else {
                str = headline;
            }
            grantButton = gVar.getGrantButton();
            if (grantButton == null) {
                str2 = "";
            } else {
                str2 = grantButton;
            }
            rejectButton = gVar.getRejectButton();
            if (rejectButton == null) {
                str3 = "";
            } else {
                str3 = rejectButton;
            }
            arrayList = new ArrayList();
            for (s92.b bVar2 : listB) {
                copy = bVar2.getCopy();
                if (copy == null) {
                    bVar = null;
                } else {
                    bVar = new g90.b(copy, bVar2.f());
                }
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
            listD = gVar.d();
            if (listD != null) {
                arrayList2 = new ArrayList();
                for (s92.e eVar : listD) {
                    if (eVar != null || (text = eVar.getText()) == null || (url = eVar.getUrl()) == null) {
                        cVar3 = null;
                    } else {
                        cVar3 = new g90.c(text, url);
                    }
                    if (cVar3 != null) {
                        arrayList2.add(cVar3);
                    }
                }
            } else {
                arrayList2 = j0.f134944a;
            }
            g90.a aVar2 = new g90.a(str, str2, str3, arrayList, arrayList2);
            d1.f200951a.getClass();
            if (d1.b.f200954a[xVar2.ordinal()] == 1) {
                xVar3 = x.DI_CONNECT_UPLOAD;
            } else {
                xVar3 = null;
            }
            return new p(new ca0.j.c(strName, aVar2, false, false, xVar3 != null ? xVar3.name() : null, 12, (p005kotlin.jvm.internal.j) null), gVar);
        }
        return null;
        a2 a2Var2 = a2.DEVICE_SETUP;
        String str4 = "Consent status for " + xVar4.f143819a + ": " + vVar;
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "CheckConsentUseCase", str4);
        if (!d1.h(xVar4, true)) {
            i2.a.b(a2Var2, "CheckConsentUseCase", "Consent type " + xVar4.f143819a + " is opted out, fetching consent text");
            o oVar3 = o.f136619a;
            cVar2.f69965a = xVar4;
            cVar2.f69966b = vVar;
            cVar2.f69967c = z15;
            cVar2.f69970f = 3;
            Object objF = oVar3.f(xVar4, Locale.getDefault(), cVar2);
            if (objF != aVar) {
                xVar2 = xVar4;
                vVar2 = vVar;
                objC = objF;
                gVar = (s92.g) objC;
                if (vVar2 != null) {
                    a2 a2Var3 = a2.DEVICE_SETUP;
                    String strM2 = am.j.m("Consent text fetched for ", xVar2.f143819a, ", creating consent request route");
                    i2.f36769a.getClass();
                    i2.a.b(a2Var3, "CheckConsentUseCase", strM2);
                    String strName2 = xVar2.name();
                    if (this.f69964a) {
                        jVar = s92.j.CHILD;
                    } else {
                        jVar = s92.j.INDIVIDUAL;
                    }
                    listF = gVar.f();
                    if (listF != null) {
                        it = listF.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((s92.f) next).getType() != jVar);
                        fVar = (s92.f) next;
                        if (fVar != null) {
                            listB = gVar.b();
                            if (listB == null) {
                                listB = j0.f134944a;
                            }
                        } else {
                            listB = gVar.b();
                            if (listB == null) {
                                listB = j0.f134944a;
                            }
                        }
                    } else {
                        listB = gVar.b();
                        if (listB == null) {
                            listB = j0.f134944a;
                        }
                    }
                    headline = gVar.getHeadline();
                    if (headline == null) {
                        str = "";
                    } else {
                        str = headline;
                    }
                    grantButton = gVar.getGrantButton();
                    if (grantButton == null) {
                        str2 = "";
                    } else {
                        str2 = grantButton;
                    }
                    rejectButton = gVar.getRejectButton();
                    if (rejectButton == null) {
                        str3 = "";
                    } else {
                        str3 = rejectButton;
                    }
                    arrayList = new ArrayList();
                    while (r4.hasNext()) {
                        copy = bVar2.getCopy();
                        if (copy == null) {
                            bVar = null;
                        } else {
                            bVar = new g90.b(copy, bVar2.f());
                        }
                        if (bVar != null) {
                            arrayList.add(bVar);
                        }
                    }
                    listD = gVar.d();
                    if (listD != null) {
                        arrayList2 = new ArrayList();
                        while (r4.hasNext()) {
                            if (eVar != null) {
                                cVar3 = null;
                            } else {
                                cVar3 = null;
                            }
                            if (cVar3 != null) {
                                arrayList2.add(cVar3);
                            }
                        }
                    } else {
                        arrayList2 = j0.f134944a;
                    }
                    g90.a aVar3 = new g90.a(str, str2, str3, arrayList, arrayList2);
                    d1.f200951a.getClass();
                    if (d1.b.f200954a[xVar2.ordinal()] == 1) {
                        xVar3 = x.DI_CONNECT_UPLOAD;
                    } else {
                        xVar3 = null;
                    }
                    return new p(new ca0.j.c(strName2, aVar3, false, false, xVar3 != null ? xVar3.name() : null, 12, (p005kotlin.jvm.internal.j) null), gVar);
                }
            }
            return aVar;
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf90/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
