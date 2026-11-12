package dj2;

import android.annotation.SuppressLint;
import ch.qos.logback.classic.Logger;
import com.garmin.customermanagementlib.CustomerManagementException;
import com.google.gson.Gson;
import java.util.List;
import lc.u0;
import o53.l1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ldj2/a;", "Ldj2/s0;", "Lhj2/b;", "customerManagementITApi", "Lhj2/a;", "customerManagementGarminApi", "Lhj2/e;", "loqateApi", "<init>", "(Lhj2/b;Lhj2/a;Lhj2/e;)V", "a", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hj2.b f59957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj2.a f59958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hj2.e f59959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f59960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ij2.a f59961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ej2.a f59962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f59963g;

    /* JADX INFO: renamed from: dj2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldj2/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum EnumC1278a {
        /* JADX INFO: Fake field, exist only in values array */
        GetZipCodeValidations,
        GetAddresses,
        GetAddress,
        AddAddress,
        UpdateAddress,
        DeleteAddress,
        GetPhoneNumbers,
        GetPhoneNumber,
        UpdatePhoneNumber,
        DeletePhoneNumber,
        AddPhoneNumber,
        GetCountries,
        GetStates,
        GetDistrictsProvinces,
        GetCitiesWards,
        ValidateAddress,
        FindAddresses,
        RetrieveAddressDetail
    }

    public a(hj2.b bVar, hj2.a aVar, hj2.e eVar) {
        bVar.getClass();
        aVar.getClass();
        eVar.getClass();
        this.f59957a = bVar;
        this.f59958b = aVar;
        this.f59959c = eVar;
        this.f59960d = o13.m.b(new dh0.j(1));
        ij2.a aVar2 = (ij2.a) KoinJavaComponent.get$default(ij2.a.class, null, null, 6, null);
        this.f59961e = aVar2;
        this.f59962f = (ej2.a) new Gson().fromJson(aVar2.k(), ej2.a.class);
        this.f59963g = aVar2.g();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(gj2.a aVar, v13.c cVar) throws CustomerManagementException {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f59987c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f59987c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objA = bVar.f59985a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f59987c;
        if (i15 == 0) {
            o13.r.b(objA);
            EnumC1278a enumC1278a = EnumC1278a.AddAddress;
            c cVar2 = new c(this, aVar, null);
            bVar.f59987c = 1;
            objA = s0.a(enumC1278a, cVar2, bVar);
            if (objA == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        Object objJ = j((hj2.j) objA);
        objJ.getClass();
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"CheckResult"})
    public final Object c(gj2.a aVar, gj2.d dVar, v13.c cVar) throws Throwable {
        d dVar2;
        p005kotlin.jvm.internal.r0 r0VarS;
        gj2.a aVar2;
        p005kotlin.jvm.internal.r0 r0Var;
        fj2.h hVar;
        String strH;
        Object objB;
        if (cVar instanceof d) {
            dVar2 = (d) cVar;
            int i14 = dVar2.f60005e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar2.f60005e = i14 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(this, cVar);
            }
        } else {
            dVar2 = new d(this, cVar);
        }
        Object obj = dVar2.f60003c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar2.f60005e;
        if (i15 == 0) {
            r0VarS = wr.g.s(obj);
            p005kotlin.jvm.internal.r0 r0Var2 = new p005kotlin.jvm.internal.r0();
            ge1.b.W(t13.h.f161748a, new e(r0Var2, r0VarS, this, dVar, null));
            l1 l1Var = (l1) r0Var2.f105810a;
            if (l1Var != null) {
                dVar2.f60001a = aVar;
                dVar2.f60002b = r0VarS;
                dVar2.f60005e = 1;
                if (l1Var.P(dVar2) != obj2) {
                    aVar2 = aVar;
                    r0Var = r0VarS;
                }
            } else {
                hVar = (fj2.h) r0VarS.f105810a;
                if (hVar != null) {
                    strH = hVar.getPhoneNumberId();
                } else {
                    strH = null;
                }
                aVar.o(strH);
                dVar2.f60001a = null;
                dVar2.f60002b = null;
                dVar2.f60005e = 2;
                objB = b(aVar, dVar2);
                if (objB != obj2) {
                    return objB;
                }
            }
            return obj2;
        }
        if (i15 != 1) {
            if (i15 == 2) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r0Var = dVar2.f60002b;
        aVar2 = dVar2.f60001a;
        o13.r.b(obj);
        r0VarS = r0Var;
        aVar = aVar2;
        hVar = (fj2.h) r0VarS.f105810a;
        if (hVar != null) {
            strH = hVar.getPhoneNumberId();
        } else {
            strH = null;
        }
        aVar.o(strH);
        dVar2.f60001a = null;
        dVar2.f60002b = null;
        dVar2.f60005e = 2;
        objB = b(aVar, dVar2);
        if (objB != obj2) {
            return obj2;
        }
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(gj2.d dVar, v13.c cVar) throws CustomerManagementException {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f60022c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f60022c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objA = fVar.f60020a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f60022c;
        if (i15 == 0) {
            o13.r.b(objA);
            EnumC1278a enumC1278a = EnumC1278a.AddPhoneNumber;
            g gVar = new g(this, dVar, null);
            fVar.f60022c = 1;
            objA = s0.a(enumC1278a, gVar, fVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        hj2.j jVar = (hj2.j) objA;
        if (jVar instanceof hj2.j.a) {
            hj2.j.a aVar2 = (hj2.j.a) jVar;
            String str = aVar2.f84035b;
            Integer num = aVar2.f84034a;
            if (num != null && num.intValue() == 400) {
                ((Logger) this.f59960d.getValue()).error("Error adding phone number: " + str);
                throw new CustomerManagementException(String.valueOf(str), cj2.b.ERROR_WEB_RESPONSE);
            }
        }
        Object objJ = j(jVar);
        objJ.getClass();
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, v13.c cVar) throws CustomerManagementException {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f60036c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f60036c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objA = hVar.f60034a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f60036c;
        boolean z14 = true;
        if (i15 == 0) {
            o13.r.b(objA);
            EnumC1278a enumC1278a = EnumC1278a.DeleteAddress;
            i iVar = new i(this, str, null);
            hVar.f60036c = 1;
            objA = s0.a(enumC1278a, iVar, hVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        hj2.j jVar = (hj2.j) objA;
        if (!(jVar instanceof hj2.j.b)) {
            if (!(jVar instanceof hj2.j.a)) {
                u0.r();
                return null;
            }
            j(jVar);
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, v13.c cVar) throws CustomerManagementException {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f60050c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f60050c = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objA = jVar.f60048a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f60050c;
        boolean z14 = true;
        if (i15 == 0) {
            o13.r.b(objA);
            EnumC1278a enumC1278a = EnumC1278a.DeletePhoneNumber;
            k kVar = new k(this, str, null);
            jVar.f60050c = 1;
            objA = s0.a(enumC1278a, kVar, jVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        hj2.j jVar2 = (hj2.j) objA;
        if (!(jVar2 instanceof hj2.j.b)) {
            if (!(jVar2 instanceof hj2.j.a)) {
                u0.r();
                return null;
            }
            j(jVar2);
            z14 = false;
        }
        return Boolean.valueOf(z14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(String str, String str2, String str3, v13.c cVar) throws CustomerManagementException {
        l lVar;
        String str4;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i14 = lVar.f60066c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar.f60066c = i14 - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objA = lVar.f60064a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar.f60066c;
        if (i15 == 0) {
            o13.r.b(objA);
            EnumC1278a enumC1278a = EnumC1278a.FindAddresses;
            m mVar = new m(this, str, str2, str3, null);
            lVar.f60066c = 1;
            objA = s0.a(enumC1278a, mVar, lVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        Object objJ = j((hj2.j) objA);
        objJ.getClass();
        List list = (List) objJ;
        fj2.f fVar = (fj2.f) p13.h0.e0(0, list);
        if (fVar == null || (str4 = fVar.getCom.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR java.lang.String()) == null) {
            return list;
        }
        throw new CustomerManagementException(str4, cj2.b.ERROR_LOQATE);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0081 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r9 == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, boolean z14, v13.c cVar) {
        n nVar;
        fj2.a aVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f60093e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f60093e = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objA = nVar.f60091c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f60093e;
        if (i15 == 0) {
            o13.r.b(objA);
            EnumC1278a enumC1278a = EnumC1278a.GetAddress;
            o oVar = new o(this, str, null);
            nVar.f60090b = z14;
            nVar.f60093e = 1;
            objA = s0.a(enumC1278a, oVar, nVar);
            if (objA != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            z14 = nVar.f60090b;
            o13.r.b(objA);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = nVar.f60089a;
            o13.r.b(objA);
        }
        fj2.b bVar = (fj2.b) objA;
        if (bVar == null || !bVar.getValid()) {
            aVar = null;
        }
        if (aVar != null) {
            return null;
        }
        return aVar;
        aVar = (fj2.a) j((hj2.j) objA);
        if (aVar != null) {
            if (z14 && !aVar.getPredicted()) {
                gj2.b bVarO = gl.b.O(aVar);
                nVar.f60089a = aVar;
                nVar.f60090b = z14;
                nVar.f60093e = 2;
                objA = u(bVarO, nVar);
            }
            if (aVar != null) {
                return aVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x009a -> B:29:0x009d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i(v13.c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof dj2.p
            if (r0 == 0) goto L13
            r0 = r12
            dj2.p r0 = (dj2.p) r0
            int r1 = r0.f60115h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60115h = r1
            goto L18
        L13:
            dj2.p r0 = new dj2.p
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f60113f
            u13.a r1 = u13.a.COROUTINE_SUSPENDED
            int r2 = r0.f60115h
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3e
            if (r2 != r3) goto L37
            int r2 = r0.f60112e
            int r6 = r0.f60111d
            java.lang.Object r7 = r0.f60110c
            java.util.Iterator r8 = r0.f60109b
            java.util.Collection r9 = r0.f60108a
            java.util.Collection r9 = (java.util.Collection) r9
            o13.r.b(r12)
            goto L9d
        L37:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            vb.h.z(r12)
            r12 = 0
            return r12
        L3e:
            o13.r.b(r12)
            goto L56
        L42:
            o13.r.b(r12)
            dj2.a$a r12 = dj2.a.EnumC1278a.GetAddresses
            dj2.q r2 = new dj2.q
            r6 = 0
            r2.<init>(r11, r6)
            r0.f60115h = r5
            java.lang.Object r12 = dj2.s0.a(r12, r2, r0)
            if (r12 != r1) goto L56
            goto L9c
        L56:
            hj2.j r12 = (hj2.j) r12
            java.lang.Object r12 = r11.j(r12)
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto Lb6
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r12 = r12.iterator()
            r8 = r12
            r9 = r2
            r2 = r4
            r6 = r2
        L6d:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto Lb1
            java.lang.Object r7 = r8.next()
            r12 = r7
            fj2.a r12 = (fj2.a) r12
            boolean r10 = r12.getPredicted()
            if (r10 != 0) goto Laa
            gj2.b r12 = gl.b.O(r12)
            r0.getClass()
            r10 = r9
            java.util.Collection r10 = (java.util.Collection) r10
            r0.f60108a = r10
            r0.f60109b = r8
            r0.f60110c = r7
            r0.f60111d = r6
            r0.f60112e = r2
            r0.f60115h = r3
            java.lang.Object r12 = r11.u(r12, r0)
            if (r12 != r1) goto L9d
        L9c:
            return r1
        L9d:
            fj2.b r12 = (fj2.b) r12
            if (r12 == 0) goto La8
            boolean r12 = r12.getValid()
            if (r12 != r5) goto La8
            goto Laa
        La8:
            r12 = r4
            goto Lab
        Laa:
            r12 = r5
        Lab:
            if (r12 == 0) goto L6d
            r9.add(r7)
            goto L6d
        Lb1:
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto Lb6
            return r9
        Lb6:
            p13.j0 r12 = p13.j0.f134944a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: dj2.a.i(v13.c):java.lang.Object");
    }

    public final <T> T j(hj2.j<T> jVar) throws CustomerManagementException {
        String str;
        boolean z14 = jVar instanceof hj2.j.b;
        o13.t tVar = this.f59960d;
        if (z14) {
            Logger logger = (Logger) tVar.getValue();
            hj2.j.b bVar = (hj2.j.b) jVar;
            String str2 = bVar.f84039c;
            Integer num = bVar.f84037a;
            logger.debug("Successful response. Code: " + num + ". Method: " + str2);
            if (num == null || num.intValue() != 205) {
                T t7 = bVar.f84038b;
                if (t7 != null) {
                    return t7;
                }
                throw new CustomerManagementException(tn.k.g(str2, ": Null object"), cj2.b.RESPONSE_IS_EMPTY);
            }
        } else {
            if (!(jVar instanceof hj2.j.a)) {
                u0.r();
                return null;
            }
            Logger logger2 = (Logger) tVar.getValue();
            hj2.j.a aVar = (hj2.j.a) jVar;
            String str3 = aVar.f84036c;
            logger2.debug("Error response. Code: " + aVar.f84034a + ". Method: " + str3);
            if (!p005kotlin.jvm.internal.s.g(str3, "ValidateAddress") && (str = aVar.f84035b) != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    throw new CustomerManagementException(str, cj2.b.ERROR_WEB_RESPONSE);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, String str2, String str3, v13.c cVar) throws CustomerManagementException {
        s sVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i14 = sVar.f60132c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                sVar.f60132c = i14 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object objA = sVar.f60130a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = sVar.f60132c;
        if (i15 == 0) {
            o13.r.b(objA);
            EnumC1278a enumC1278a = EnumC1278a.GetCitiesWards;
            t tVar = new t(this, str, str2, str3, null);
            sVar.f60132c = 1;
            objA = s0.a(enumC1278a, tVar, sVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        Object objJ = j((hj2.j) objA);
        objJ.getClass();
        return p13.h0.N0((Iterable) objJ, new r());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(v13.c cVar) throws CustomerManagementException {
        v vVar;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f60145c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f60145c = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object objA = vVar.f60143a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f60145c;
        if (i15 == 0) {
            o13.r.b(objA);
            EnumC1278a enumC1278a = EnumC1278a.GetCountries;
            w wVar = new w(this, null);
            vVar.f60145c = 1;
            objA = s0.a(enumC1278a, wVar, vVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        Object objJ = j((hj2.j) objA);
        objJ.getClass();
        return p13.h0.N0((Iterable) objJ, new u());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(String str, String str2, v13.c cVar) throws CustomerManagementException {
        y yVar;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i14 = yVar.f60150c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                yVar.f60150c = i14 - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, cVar);
            }
        } else {
            yVar = new y(this, cVar);
        }
        Object objA = yVar.f60148a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = yVar.f60150c;
        if (i15 == 0) {
            o13.r.b(objA);
            EnumC1278a enumC1278a = EnumC1278a.GetDistrictsProvinces;
            z zVar = new z(this, str, str2, null);
            yVar.f60150c = 1;
            objA = s0.a(enumC1278a, zVar, yVar);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        Object objJ = j((hj2.j) objA);
        objJ.getClass();
        return p13.h0.N0((Iterable) objJ, new x());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(String str, v13.c cVar) throws CustomerManagementException {
        a0 a0Var;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i14 = a0Var.f59984c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                a0Var.f59984c = i14 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(this, cVar);
            }
        } else {
            a0Var = new a0(this, cVar);
        }
        Object objA = a0Var.f59982a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = a0Var.f59984c;
        if (i15 == 0) {
            o13.r.b(objA);
            EnumC1278a enumC1278a = EnumC1278a.GetPhoneNumber;
            b0 b0Var = new b0(this, str, null);
            a0Var.f59984c = 1;
            objA = s0.a(enumC1278a, b0Var, a0Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        Object objJ = j((hj2.j) objA);
        objJ.getClass();
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(v13.c cVar) throws CustomerManagementException {
        c0 c0Var;
        if (cVar instanceof c0) {
            c0Var = (c0) cVar;
            int i14 = c0Var.f60000c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c0Var.f60000c = i14 - Integer.MIN_VALUE;
            } else {
                c0Var = new c0(this, cVar);
            }
        } else {
            c0Var = new c0(this, cVar);
        }
        Object objA = c0Var.f59998a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c0Var.f60000c;
        if (i15 == 0) {
            o13.r.b(objA);
            EnumC1278a enumC1278a = EnumC1278a.GetPhoneNumbers;
            d0 d0Var = new d0(this, null);
            c0Var.f60000c = 1;
            objA = s0.a(enumC1278a, d0Var, c0Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        Object objJ = j((hj2.j) objA);
        objJ.getClass();
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(String str, v13.c cVar) throws CustomerManagementException {
        f0 f0Var;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i14 = f0Var.f60025c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f60025c = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        Object objA = f0Var.f60023a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var.f60025c;
        if (i15 == 0) {
            o13.r.b(objA);
            EnumC1278a enumC1278a = EnumC1278a.GetStates;
            g0 g0Var = new g0(this, str, null);
            f0Var.f60025c = 1;
            objA = s0.a(enumC1278a, g0Var, f0Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        Object objJ = j((hj2.j) objA);
        objJ.getClass();
        return p13.h0.N0((Iterable) objJ, new e0());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(String str, v13.c cVar) throws CustomerManagementException {
        h0 h0Var;
        String str2;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i14 = h0Var.f60039c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h0Var.f60039c = i14 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(this, cVar);
            }
        } else {
            h0Var = new h0(this, cVar);
        }
        Object objA = h0Var.f60037a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = h0Var.f60039c;
        if (i15 == 0) {
            o13.r.b(objA);
            EnumC1278a enumC1278a = EnumC1278a.RetrieveAddressDetail;
            i0 i0Var = new i0(this, str, null);
            h0Var.f60039c = 1;
            objA = s0.a(enumC1278a, i0Var, h0Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        Object objJ = j((hj2.j) objA);
        objJ.getClass();
        List list = (List) objJ;
        fj2.i iVar = (fj2.i) p13.h0.e0(0, list);
        if (iVar == null || (str2 = iVar.getCom.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR java.lang.String()) == null) {
            return list;
        }
        throw new CustomerManagementException(str2, cj2.b.ERROR_LOQATE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(gj2.a aVar, v13.c cVar) throws CustomerManagementException {
        j0 j0Var;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i14 = j0Var.f60053c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                j0Var.f60053c = i14 - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(this, cVar);
            }
        } else {
            j0Var = new j0(this, cVar);
        }
        Object objA = j0Var.f60051a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = j0Var.f60053c;
        if (i15 == 0) {
            o13.r.b(objA);
            EnumC1278a enumC1278a = EnumC1278a.UpdateAddress;
            k0 k0Var = new k0(this, aVar, null);
            j0Var.f60053c = 1;
            objA = s0.a(enumC1278a, k0Var, j0Var);
            if (objA == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        Object objJ = j((hj2.j) objA);
        objJ.getClass();
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
    
        if (r0.P(r6) == r7) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"CheckResult"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(String str, gj2.a aVar, gj2.d dVar, v13.c cVar) throws Throwable {
        l0 l0Var;
        gj2.d dVar2;
        String str2;
        gj2.a aVar2;
        p005kotlin.jvm.internal.r0 r0Var;
        gj2.d dVar3;
        gj2.a aVar3;
        Object objR;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i14 = l0Var.f60073g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                l0Var.f60073g = i14 - Integer.MIN_VALUE;
            } else {
                l0Var = new l0(this, cVar);
            }
        } else {
            l0Var = new l0(this, cVar);
        }
        l0 l0Var2 = l0Var;
        Object objT = l0Var2.f60071e;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = l0Var2.f60073g;
        if (i15 != 0) {
            if (i15 == 1) {
                p005kotlin.jvm.internal.r0 r0Var2 = l0Var2.f60070d;
                dVar3 = l0Var2.f60069c;
                aVar2 = l0Var2.f60068b;
                String str3 = l0Var2.f60067a;
                o13.r.b(objT);
                r0Var = r0Var2;
                str2 = str3;
            } else {
                if (i15 == 2) {
                    o13.r.b(objT);
                    return objT;
                }
                if (i15 != 3) {
                    if (i15 == 4) {
                        o13.r.b(objT);
                        return objT;
                    }
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar3 = l0Var2.f60068b;
                o13.r.b(objT);
            }
            aVar2 = aVar3;
            l0Var2.f60067a = null;
            l0Var2.f60068b = null;
            l0Var2.f60069c = null;
            l0Var2.f60070d = null;
            l0Var2.f60073g = 4;
            objR = r(aVar2, l0Var2);
            if (objR == obj) {
                return obj;
            }
            return objR;
        }
        p005kotlin.jvm.internal.r0 r0VarS = wr.g.s(objT);
        p005kotlin.jvm.internal.r0 r0Var3 = new p005kotlin.jvm.internal.r0();
        ge1.b.W(t13.h.f161748a, new m0(r0Var3, r0VarS, dVar, this, null));
        l1 l1Var = (l1) r0Var3.f105810a;
        if (l1Var != null) {
            l0Var2.f60067a = str;
            l0Var2.f60068b = aVar;
            dVar2 = dVar;
            l0Var2.f60069c = dVar2;
            l0Var2.f60070d = r0VarS;
            l0Var2.f60073g = 1;
        } else {
            dVar2 = dVar;
        }
        str2 = str;
        aVar2 = aVar;
        r0Var = r0VarS;
        dVar3 = dVar2;
        fj2.h hVar = (fj2.h) r0Var.f105810a;
        if (p005kotlin.jvm.internal.s.g(hVar != null ? hVar.getPhoneNumber() : null, dVar3.getPhoneNumber())) {
            l0Var2.f60067a = null;
            l0Var2.f60068b = null;
            l0Var2.f60069c = null;
            l0Var2.f60070d = null;
            l0Var2.f60073g = 2;
            Object objR2 = r(aVar2, l0Var2);
            if (objR2 != obj) {
                return objR2;
            }
        } else {
            String strD = dVar3.getPhoneNumberId();
            if (strD != null) {
                l0Var2.f60067a = str2;
                l0Var2.f60068b = aVar2;
                l0Var2.f60069c = null;
                l0Var2.f60070d = null;
                l0Var2.f60073g = 3;
                objT = t(strD, dVar3, l0Var2);
                if (objT != obj) {
                    aVar3 = aVar2;
                    aVar2 = aVar3;
                    l0Var2.f60067a = null;
                    l0Var2.f60068b = null;
                    l0Var2.f60069c = null;
                    l0Var2.f60070d = null;
                    l0Var2.f60073g = 4;
                    objR = r(aVar2, l0Var2);
                    if (objR == obj) {
                        return objR;
                    }
                }
            } else {
                l0Var2.f60067a = null;
                l0Var2.f60068b = null;
                l0Var2.f60069c = null;
                l0Var2.f60070d = null;
                l0Var2.f60073g = 4;
                objR = r(aVar2, l0Var2);
                if (objR == obj) {
                    return objR;
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(String str, gj2.d dVar, v13.c cVar) throws CustomerManagementException {
        n0 n0Var;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i14 = n0Var.f60096c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n0Var.f60096c = i14 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(this, cVar);
            }
        } else {
            n0Var = new n0(this, cVar);
        }
        Object objA = n0Var.f60094a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = n0Var.f60096c;
        if (i15 == 0) {
            o13.r.b(objA);
            EnumC1278a enumC1278a = EnumC1278a.UpdatePhoneNumber;
            o0 o0Var = new o0(this, str, dVar, null);
            n0Var.f60096c = 1;
            objA = s0.a(enumC1278a, o0Var, n0Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        Object objJ = j((hj2.j) objA);
        objJ.getClass();
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(gj2.b bVar, v13.c cVar) {
        p0 p0Var;
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i14 = p0Var.f60118c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                p0Var.f60118c = i14 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(this, cVar);
            }
        } else {
            p0Var = new p0(this, cVar);
        }
        Object objA = p0Var.f60116a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = p0Var.f60118c;
        if (i15 == 0) {
            o13.r.b(objA);
            EnumC1278a enumC1278a = EnumC1278a.ValidateAddress;
            q0 q0Var = new q0(this, bVar, null);
            p0Var.f60118c = 1;
            objA = s0.a(enumC1278a, q0Var, p0Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        return j((hj2.j) objA);
    }
}
