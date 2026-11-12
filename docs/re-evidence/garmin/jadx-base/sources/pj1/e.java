package pj1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import lc.u0;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.h0;
import p13.j0;
import p13.w0;
import ui1.o0;
import ui1.x0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpj1/e;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e extends u1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f137898o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o13.t f137899a = o13.m.b(new p40.f(20));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f137900b = o13.m.b(new p40.f(21));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f137901c = o13.m.b(new p40.f(22));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f137902d = o13.m.b(new p40.f(23));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vi1.b f137903e = ((vi1.a) KoinJavaComponent.get$default(vi1.a.class, null, null, 6, null)).a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public tj1.v f137904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0<g3<List<String>>> f137905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0 f137906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0<Map<Object, String>> f137907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0 f137908j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0<Map<Object, String>> f137909k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0 f137910l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f137911m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o13.t f137912n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.BaseSafetyFeaturesViewModel$getECCSupportedCountriesISO$1", f = "BaseSafetyFeaturesViewModel.kt", l = {181}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f137913a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f137913a;
            if (i14 == 0) {
                o13.r.b(obj);
                e eVar = e.this;
                eVar.f137905g.m(g3.a.c(g3.f35298f));
                this.f137913a = 1;
                if (eVar.A4(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b((String) ((o13.p) t7).f128595b, (String) ((o13.p) t14).f128595b);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b((String) ((o13.p) t7).f128595b, (String) ((o13.p) t14).f128595b);
        }
    }

    static {
        new a(null);
    }

    public e() {
        y0<g3<List<String>>> y0Var = new y0<>();
        this.f137905g = y0Var;
        this.f137906h = y0Var;
        y0<Map<Object, String>> y0Var2 = new y0<>();
        this.f137907i = y0Var2;
        this.f137908j = y0Var2;
        y0<Map<Object, String>> y0Var3 = new y0<>();
        this.f137909k = y0Var3;
        this.f137910l = y0Var3;
        this.f137912n = o13.m.b(new p40.f(24));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object A4(v13.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i14 = hVar.f137923c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f137923c = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objJ = hVar.f137921a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f137923c;
        if (i15 == 0) {
            o13.r.b(objJ);
            tj1.h hVar2 = (tj1.h) this.f137899a.getValue();
            hVar.f137923c = 1;
            hVar2.getClass();
            objJ = f0.J(hVar2, new tj1.i(hVar2, null), hVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        boolean z14 = v2Var instanceof v2.b;
        y0<g3<List<String>>> y0Var = this.f137905g;
        if (z14) {
            tj1.g gVar = (tj1.g) ((v2.b) v2Var).f47386a;
            if (gVar != null) {
                g3.a aVar2 = g3.f35298f;
                List<String> listA = gVar.a();
                aVar2.getClass();
                y0Var.j(g3.a.d(listA));
                G4();
                F4();
            }
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            g3.a aVar3 = g3.f35298f;
            v2.a aVar4 = (v2.a) v2Var;
            Exception exc = aVar4.f47383a;
            y0Var.j(g3.a.a(aVar3, exc.getMessage(), null, null, null, 14));
            String str = "Error occurred while fetching supported countries info " + aVar4.f47384b + StringUtils.SPACE + exc;
            i2.a aVar5 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar5.getClass();
            i2.a.f(a2Var, "BaseSafetyFeaturesViewModel", str);
        }
        return Unit.INSTANCE;
    }

    public final void B4() {
        List<String> list;
        g3<List<String>> g3VarD = this.f137905g.d();
        if (g3VarD == null || (list = g3VarD.f35301b) == null || !(!list.isEmpty())) {
            ge1.b.T(v1.a(this), null, null, new b(null), 3);
        } else {
            G4();
            F4();
        }
    }

    public final y0<g3<tj1.e>> C4() {
        return (y0) this.f137912n.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object D4(v13.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f137926c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f137926c = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object objH = iVar.f137924a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f137926c;
        if (i15 == 0) {
            o13.r.b(objH);
            o0 o0Var = (o0) this.f137900b.getValue();
            iVar.f137926c = 1;
            objH = o0Var.h(iVar);
            if (objH == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objH);
        }
        v2 v2Var = (v2) objH;
        if (v2Var instanceof v2.b) {
            this.f137904f = (tj1.v) ((v2.b) v2Var).f47386a;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:108:0x01db  */
    /* JADX WARN: Code duplicated, block: B:111:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:117:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:120:0x0208  */
    /* JADX WARN: Code duplicated, block: B:123:0x0214  */
    /* JADX WARN: Code duplicated, block: B:125:0x021a  */
    /* JADX WARN: Code duplicated, block: B:128:0x022f A[LOOP:0: B:126:0x0229->B:128:0x022f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x0279  */
    /* JADX WARN: Code duplicated, block: B:133:0x0280  */
    /* JADX WARN: Code duplicated, block: B:136:0x0289  */
    /* JADX WARN: Code duplicated, block: B:173:0x0392  */
    /* JADX WARN: Code duplicated, block: B:175:0x039d  */
    /* JADX WARN: Code duplicated, block: B:178:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:181:0x042d  */
    /* JADX WARN: Code duplicated, block: B:182:0x042f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0436  */
    /* JADX WARN: Code duplicated, block: B:186:0x0439  */
    /* JADX WARN: Code duplicated, block: B:189:0x0448  */
    /* JADX WARN: Code duplicated, block: B:191:0x044e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0455  */
    /* JADX WARN: Code duplicated, block: B:196:0x045d  */
    /* JADX WARN: Code duplicated, block: B:198:0x0469  */
    /* JADX WARN: Code duplicated, block: B:199:0x0475  */
    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:76:0x010d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0116  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x011e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0150  */
    /* JADX WARN: Code duplicated, block: B:84:0x0152  */
    /* JADX WARN: Code duplicated, block: B:90:0x0161  */
    /* JADX WARN: Code duplicated, block: B:93:0x019d  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bc  */
    /* JADX WARN: Instruction removed from duplicated block: B:80:0x011e, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [T] */
    /* JADX WARN: Type inference failed for: r2v10, types: [T, tj1.e] */
    /* JADX WARN: Type inference failed for: r48v0, types: [pj1.e] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final Object E4(v13.c cVar) {
        j jVar;
        v2 v2Var;
        r0 r0Var;
        l20.r userContactsDTO;
        l20.q selfUserContactDTO;
        String addressLine1;
        r0 r0Var2;
        List<l20.c> listS;
        List<l20.c> listJ;
        String zipCode;
        String country;
        Object objB;
        tj1.e eVar;
        tj1.v vVar;
        l20.q qVar;
        String countryCode;
        String firstName;
        String lastName;
        String addressLine2;
        String addressLine3;
        String city;
        String stateOrProvince;
        String zipCode2;
        ?? arrayList;
        List<l20.c> listS2;
        ArrayList arrayList2;
        String primaryPhone;
        String cellPhone;
        String country2;
        String str;
        String countryOfCitizenship;
        String str2;
        l20.q qVarB;
        l20.r userContactsDTO2;
        l20.r rVarB;
        String primaryPhone2;
        String cellPhone2;
        List<String> listI;
        Iterator it;
        Locale locale;
        String displayCountry;
        l20.r userContactsDTO3;
        l20.q selfUserContactDTO2;
        Boolean bool;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i14 = jVar.f137930d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f137930d = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objJ = jVar.f137928b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f137930d;
        vi1.b bVar = this.f137903e;
        tj1.e eVarB = null;
        if (i15 == 0) {
            o13.r.b(objJ);
            if (this.f137911m && !bVar.j()) {
                jVar.f137930d = 1;
                if (D4(jVar) != aVar) {
                }
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(objJ);
        } else {
            if (i15 == 2) {
                o13.r.b(objJ);
                v2Var = (v2) objJ;
                if (v2Var instanceof v2.b) {
                    r0Var = new r0();
                    ?? r14 = ((v2.b) v2Var).f47386a;
                    r0Var.f105810a = r14;
                    c22.g.f23056a.getClass();
                    c22.g.a("assistancePlusFetchSuccess");
                    userContactsDTO = ((tj1.e) r14).getUserContactsDTO();
                    if (userContactsDTO != null) {
                        selfUserContactDTO = userContactsDTO.getSelfUserContactDTO();
                    } else {
                        selfUserContactDTO = null;
                    }
                    if (!this.f137911m && bVar.j() && this.f137904f == null && selfUserContactDTO != null && ((addressLine1 = selfUserContactDTO.getAddressLine1()) == null || addressLine1.length() == 0 || (listS = selfUserContactDTO.s()) == null || listS.isEmpty() || (listJ = selfUserContactDTO.j()) == null || listJ.isEmpty() || (zipCode = selfUserContactDTO.getZipCode()) == null || zipCode.length() == 0 || (country = selfUserContactDTO.getCountry()) == null || country.length() == 0 || g22.n.d(selfUserContactDTO.getCountryOfCitizenship()))) {
                        jVar.f137927a = r0Var;
                        jVar.f137930d = 3;
                        if (D4(jVar) != aVar) {
                            r0Var2 = r0Var;
                        }
                        return aVar;
                    }
                    if (this.f137904f != null) {
                        bVar.i(true);
                        objB = bVar.b();
                        if (objB != null) {
                            bool = Boolean.FALSE;
                            if (objB.equals(bool)) {
                                r0Var.f105810a = tj1.e.b((tj1.e) r0Var.f105810a, bool, null, 2);
                                i2.a aVar2 = i2.f36769a;
                                a2 a2Var = a2.GENERAL;
                                aVar2.getClass();
                                i2.a.b(a2Var, "BaseSafetyFeaturesViewModel", "getECCContacts() disable assistance plus " + objB);
                            }
                        }
                        y0<g3<tj1.e>> y0VarC4 = C4();
                        g3.a aVar3 = g3.f35298f;
                        eVar = (tj1.e) r0Var.f105810a;
                        vVar = this.f137904f;
                        if (vVar != null) {
                            if (eVar != null || (userContactsDTO3 = eVar.getUserContactsDTO()) == null || (selfUserContactDTO2 = userContactsDTO3.getSelfUserContactDTO()) == null) {
                                qVar = new l20.q(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, FlexItem.MAX_SIZE, null);
                            } else {
                                qVar = selfUserContactDTO2;
                            }
                            countryCode = vVar.getCountryCode();
                            if (countryCode != null) {
                                locale = new Locale(Locale.getDefault().getLanguage(), countryCode);
                                displayCountry = locale.getDisplayCountry();
                                if (displayCountry != null && displayCountry.length() != 0) {
                                    countryCode = locale.getDisplayCountry();
                                }
                            } else {
                                countryCode = null;
                            }
                            firstName = qVar.getFirstName();
                            if (firstName == null) {
                                firstName = vVar.getFirstName();
                            }
                            String str3 = firstName;
                            lastName = qVar.getLastName();
                            if (lastName == null) {
                                lastName = vVar.getLastName();
                            }
                            String str4 = lastName;
                            addressLine2 = qVar.getAddressLine1();
                            if (addressLine2 == null) {
                                addressLine2 = vVar.getAddress1();
                            }
                            String str5 = addressLine2;
                            addressLine3 = qVar.getAddressLine2();
                            if (addressLine3 == null) {
                                addressLine3 = vVar.getAddress2();
                            }
                            String str6 = addressLine3;
                            city = qVar.getCity();
                            if (city == null) {
                                city = vVar.getCity();
                            }
                            String str7 = city;
                            stateOrProvince = qVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String();
                            if (stateOrProvince == null) {
                                stateOrProvince = vVar.getStateOrProvince();
                            }
                            String str8 = stateOrProvince;
                            zipCode2 = qVar.getZipCode();
                            if (zipCode2 == null) {
                                zipCode2 = vVar.getPostalCode();
                            }
                            String str9 = zipCode2;
                            if (qVar.j() == null) {
                                arrayList = j0.f134944a;
                            } else {
                                listI = vVar.i();
                                if (listI != null) {
                                    arrayList = new ArrayList(p13.y.r(listI, 10));
                                    it = listI.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(new l20.c(null, (String) it.next(), null, Integer.valueOf(l20.m.NONE.f109026a), Integer.valueOf(l20.k.OTHER.f109012a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048549, null));
                                    }
                                } else {
                                    arrayList = 0;
                                }
                                if (arrayList == 0) {
                                    arrayList = j0.f134944a;
                                }
                            }
                            ?? r17 = arrayList;
                            listS2 = qVar.s();
                            if (listS2 != null || listS2.isEmpty()) {
                                arrayList2 = new ArrayList();
                                primaryPhone = vVar.getPrimaryPhone();
                                if (primaryPhone != null) {
                                    arrayList2.add(new l20.c(null, primaryPhone, Boolean.TRUE, Integer.valueOf(l20.m.PRIMARY.f109026a), Integer.valueOf(l20.p.MOBILE.f109040a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048545, null));
                                }
                                cellPhone = vVar.getCellPhone();
                                if (cellPhone != null) {
                                    arrayList2.add(new l20.c(null, cellPhone, Boolean.FALSE, Integer.valueOf(l20.m.NONE.f109026a), Integer.valueOf(l20.p.MOBILE.f109040a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048545, null));
                                }
                            } else {
                                List<l20.c> listS3 = qVar.s();
                                arrayList2 = listS3 != null ? new ArrayList(listS3) : new ArrayList();
                                if (arrayList2.isEmpty()) {
                                    primaryPhone2 = vVar.getPrimaryPhone();
                                    if (primaryPhone2 != null && primaryPhone2.length() != 0) {
                                        arrayList2.add(new l20.c(null, vVar.getPrimaryPhone(), Boolean.TRUE, Integer.valueOf(l20.m.PRIMARY.f109026a), Integer.valueOf(l20.p.MOBILE.f109040a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048545, null));
                                    }
                                } else {
                                    Iterator it3 = arrayList2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            primaryPhone2 = vVar.getPrimaryPhone();
                                            if (primaryPhone2 != null) {
                                                arrayList2.add(new l20.c(null, vVar.getPrimaryPhone(), Boolean.TRUE, Integer.valueOf(l20.m.PRIMARY.f109026a), Integer.valueOf(l20.p.MOBILE.f109040a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048545, null));
                                            }
                                        } else if (p005kotlin.jvm.internal.s.g(((l20.c) it3.next()).getIsPrimary(), Boolean.TRUE)) {
                                        }
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                    cellPhone2 = vVar.getCellPhone();
                                    if (cellPhone2 != null && cellPhone2.length() != 0) {
                                        arrayList2.add(new l20.c(null, vVar.getCellPhone(), Boolean.FALSE, Integer.valueOf(l20.m.NONE.f109026a), Integer.valueOf(l20.p.MOBILE.f109040a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048545, null));
                                    }
                                } else {
                                    Iterator it4 = arrayList2.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            cellPhone2 = vVar.getCellPhone();
                                            if (cellPhone2 != null) {
                                                arrayList2.add(new l20.c(null, vVar.getCellPhone(), Boolean.FALSE, Integer.valueOf(l20.m.NONE.f109026a), Integer.valueOf(l20.p.MOBILE.f109040a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048545, null));
                                            }
                                        } else if (!p005kotlin.jvm.internal.s.g(((l20.c) it4.next()).getIsPrimary(), Boolean.TRUE)) {
                                        }
                                    }
                                }
                            }
                            ArrayList arrayList3 = arrayList2;
                            country2 = qVar.getCountry();
                            if (country2 == null) {
                                str = countryCode;
                            } else {
                                str = country2;
                            }
                            countryOfCitizenship = qVar.getCountryOfCitizenship();
                            if (countryOfCitizenship == null) {
                                str2 = countryCode;
                            } else {
                                str2 = countryOfCitizenship;
                            }
                            qVarB = l20.q.b(qVar, str5, str6, str7, str, str2, r17, null, null, str3, str4, arrayList3, str8, str9, 7043912);
                            if (eVar != null) {
                                userContactsDTO2 = eVar.getUserContactsDTO();
                                if (userContactsDTO2 != null) {
                                    rVarB = l20.r.b(userContactsDTO2, null, null, qVarB, 55);
                                } else {
                                    rVarB = null;
                                }
                                eVarB = tj1.e.b(eVar, null, rVarB, 1);
                            }
                            if (eVarB != null) {
                                eVar = eVarB;
                            }
                        }
                        aVar3.getClass();
                        y0VarC4.j(g3.a.d(eVar));
                    } else {
                        u62.z.h(g3.f35298f, r0Var.f105810a, C4());
                    }
                } else {
                    c22.g.f23056a.getClass();
                    c22.g.a("“assistancePlusFetchFailure”");
                    C4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
                }
                return Unit.INSTANCE;
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0Var2 = jVar.f137927a;
            o13.r.b(objJ);
        }
        r0Var = r0Var2;
        if (this.f137904f != null) {
            bVar.i(true);
            objB = bVar.b();
            if (objB != null) {
                bool = Boolean.FALSE;
                if (objB.equals(bool)) {
                    r0Var.f105810a = tj1.e.b((tj1.e) r0Var.f105810a, bool, null, 2);
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.b(a2Var2, "BaseSafetyFeaturesViewModel", "getECCContacts() disable assistance plus " + objB);
                }
            }
            y0<g3<tj1.e>> y0VarC5 = C4();
            g3.a aVar5 = g3.f35298f;
            eVar = (tj1.e) r0Var.f105810a;
            vVar = this.f137904f;
            if (vVar != null) {
                if (eVar != null) {
                    qVar = new l20.q(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, FlexItem.MAX_SIZE, null);
                } else {
                    qVar = new l20.q(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, FlexItem.MAX_SIZE, null);
                }
                countryCode = vVar.getCountryCode();
                if (countryCode != null) {
                    locale = new Locale(Locale.getDefault().getLanguage(), countryCode);
                    displayCountry = locale.getDisplayCountry();
                    if (displayCountry != null) {
                        countryCode = locale.getDisplayCountry();
                    }
                } else {
                    countryCode = null;
                }
                firstName = qVar.getFirstName();
                if (firstName == null) {
                    firstName = vVar.getFirstName();
                }
                String str10 = firstName;
                lastName = qVar.getLastName();
                if (lastName == null) {
                    lastName = vVar.getLastName();
                }
                String str11 = lastName;
                addressLine2 = qVar.getAddressLine1();
                if (addressLine2 == null) {
                    addressLine2 = vVar.getAddress1();
                }
                String str12 = addressLine2;
                addressLine3 = qVar.getAddressLine2();
                if (addressLine3 == null) {
                    addressLine3 = vVar.getAddress2();
                }
                String str13 = addressLine3;
                city = qVar.getCity();
                if (city == null) {
                    city = vVar.getCity();
                }
                String str14 = city;
                stateOrProvince = qVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String();
                if (stateOrProvince == null) {
                    stateOrProvince = vVar.getStateOrProvince();
                }
                String str15 = stateOrProvince;
                zipCode2 = qVar.getZipCode();
                if (zipCode2 == null) {
                    zipCode2 = vVar.getPostalCode();
                }
                String str16 = zipCode2;
                if (qVar.j() == null) {
                    arrayList = j0.f134944a;
                } else {
                    listI = vVar.i();
                    if (listI != null) {
                        arrayList = new ArrayList(p13.y.r(listI, 10));
                        it = listI.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new l20.c(null, (String) it.next(), null, Integer.valueOf(l20.m.NONE.f109026a), Integer.valueOf(l20.k.OTHER.f109012a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048549, null));
                        }
                    } else {
                        arrayList = 0;
                    }
                    if (arrayList == 0) {
                        arrayList = j0.f134944a;
                    }
                }
                ?? r18 = arrayList;
                listS2 = qVar.s();
                if (listS2 != null) {
                    arrayList2 = new ArrayList();
                    primaryPhone = vVar.getPrimaryPhone();
                    if (primaryPhone != null) {
                        arrayList2.add(new l20.c(null, primaryPhone, Boolean.TRUE, Integer.valueOf(l20.m.PRIMARY.f109026a), Integer.valueOf(l20.p.MOBILE.f109040a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048545, null));
                    }
                    cellPhone = vVar.getCellPhone();
                    if (cellPhone != null) {
                        arrayList2.add(new l20.c(null, cellPhone, Boolean.FALSE, Integer.valueOf(l20.m.NONE.f109026a), Integer.valueOf(l20.p.MOBILE.f109040a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048545, null));
                    }
                } else {
                    arrayList2 = new ArrayList();
                    primaryPhone = vVar.getPrimaryPhone();
                    if (primaryPhone != null) {
                        arrayList2.add(new l20.c(null, primaryPhone, Boolean.TRUE, Integer.valueOf(l20.m.PRIMARY.f109026a), Integer.valueOf(l20.p.MOBILE.f109040a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048545, null));
                    }
                    cellPhone = vVar.getCellPhone();
                    if (cellPhone != null) {
                        arrayList2.add(new l20.c(null, cellPhone, Boolean.FALSE, Integer.valueOf(l20.m.NONE.f109026a), Integer.valueOf(l20.p.MOBILE.f109040a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048545, null));
                    }
                }
                ArrayList arrayList4 = arrayList2;
                country2 = qVar.getCountry();
                if (country2 == null) {
                    str = countryCode;
                } else {
                    str = country2;
                }
                countryOfCitizenship = qVar.getCountryOfCitizenship();
                if (countryOfCitizenship == null) {
                    str2 = countryCode;
                } else {
                    str2 = countryOfCitizenship;
                }
                qVarB = l20.q.b(qVar, str12, str13, str14, str, str2, r18, null, null, str10, str11, arrayList4, str15, str16, 7043912);
                if (eVar != null) {
                    userContactsDTO2 = eVar.getUserContactsDTO();
                    if (userContactsDTO2 != null) {
                        rVarB = l20.r.b(userContactsDTO2, null, null, qVarB, 55);
                    } else {
                        rVarB = null;
                    }
                    eVarB = tj1.e.b(eVar, null, rVarB, 1);
                }
                if (eVarB != null) {
                    eVar = eVarB;
                }
            }
            aVar5.getClass();
            y0VarC5.j(g3.a.d(eVar));
        } else {
            u62.z.h(g3.f35298f, r0Var.f105810a, C4());
        }
        return Unit.INSTANCE;
        m20.z zVar = (m20.z) this.f137901c.getValue();
        jVar.f137930d = 2;
        zVar.getClass();
        objJ = f0.J(zVar, new m20.o(zVar, null), jVar);
        if (objJ != aVar) {
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.b) {
                r0Var = new r0();
                ?? r15 = ((v2.b) v2Var).f47386a;
                r0Var.f105810a = r15;
                c22.g.f23056a.getClass();
                c22.g.a("assistancePlusFetchSuccess");
                userContactsDTO = ((tj1.e) r15).getUserContactsDTO();
                if (userContactsDTO != null) {
                    selfUserContactDTO = userContactsDTO.getSelfUserContactDTO();
                } else {
                    selfUserContactDTO = null;
                }
                if (!this.f137911m) {
                }
                if (this.f137904f != null) {
                    bVar.i(true);
                    objB = bVar.b();
                    if (objB != null) {
                        bool = Boolean.FALSE;
                        if (objB.equals(bool)) {
                            r0Var.f105810a = tj1.e.b((tj1.e) r0Var.f105810a, bool, null, 2);
                            i2.a aVar6 = i2.f36769a;
                            a2 a2Var3 = a2.GENERAL;
                            aVar6.getClass();
                            i2.a.b(a2Var3, "BaseSafetyFeaturesViewModel", "getECCContacts() disable assistance plus " + objB);
                        }
                    }
                    y0<g3<tj1.e>> y0VarC6 = C4();
                    g3.a aVar7 = g3.f35298f;
                    eVar = (tj1.e) r0Var.f105810a;
                    vVar = this.f137904f;
                    if (vVar != null) {
                        if (eVar != null) {
                            qVar = new l20.q(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, FlexItem.MAX_SIZE, null);
                        } else {
                            qVar = new l20.q(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, FlexItem.MAX_SIZE, null);
                        }
                        countryCode = vVar.getCountryCode();
                        if (countryCode != null) {
                            locale = new Locale(Locale.getDefault().getLanguage(), countryCode);
                            displayCountry = locale.getDisplayCountry();
                            if (displayCountry != null) {
                                countryCode = locale.getDisplayCountry();
                            }
                        } else {
                            countryCode = null;
                        }
                        firstName = qVar.getFirstName();
                        if (firstName == null) {
                            firstName = vVar.getFirstName();
                        }
                        String str17 = firstName;
                        lastName = qVar.getLastName();
                        if (lastName == null) {
                            lastName = vVar.getLastName();
                        }
                        String str18 = lastName;
                        addressLine2 = qVar.getAddressLine1();
                        if (addressLine2 == null) {
                            addressLine2 = vVar.getAddress1();
                        }
                        String str19 = addressLine2;
                        addressLine3 = qVar.getAddressLine2();
                        if (addressLine3 == null) {
                            addressLine3 = vVar.getAddress2();
                        }
                        String str110 = addressLine3;
                        city = qVar.getCity();
                        if (city == null) {
                            city = vVar.getCity();
                        }
                        String str111 = city;
                        stateOrProvince = qVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String();
                        if (stateOrProvince == null) {
                            stateOrProvince = vVar.getStateOrProvince();
                        }
                        String str112 = stateOrProvince;
                        zipCode2 = qVar.getZipCode();
                        if (zipCode2 == null) {
                            zipCode2 = vVar.getPostalCode();
                        }
                        String str113 = zipCode2;
                        if (qVar.j() == null) {
                            arrayList = j0.f134944a;
                        } else {
                            listI = vVar.i();
                            if (listI != null) {
                                arrayList = new ArrayList(p13.y.r(listI, 10));
                                it = listI.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(new l20.c(null, (String) it.next(), null, Integer.valueOf(l20.m.NONE.f109026a), Integer.valueOf(l20.k.OTHER.f109012a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048549, null));
                                }
                            } else {
                                arrayList = 0;
                            }
                            if (arrayList == 0) {
                                arrayList = j0.f134944a;
                            }
                        }
                        ?? r19 = arrayList;
                        listS2 = qVar.s();
                        if (listS2 != null) {
                            arrayList2 = new ArrayList();
                            primaryPhone = vVar.getPrimaryPhone();
                            if (primaryPhone != null) {
                                arrayList2.add(new l20.c(null, primaryPhone, Boolean.TRUE, Integer.valueOf(l20.m.PRIMARY.f109026a), Integer.valueOf(l20.p.MOBILE.f109040a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048545, null));
                            }
                            cellPhone = vVar.getCellPhone();
                            if (cellPhone != null) {
                                arrayList2.add(new l20.c(null, cellPhone, Boolean.FALSE, Integer.valueOf(l20.m.NONE.f109026a), Integer.valueOf(l20.p.MOBILE.f109040a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048545, null));
                            }
                        } else {
                            arrayList2 = new ArrayList();
                            primaryPhone = vVar.getPrimaryPhone();
                            if (primaryPhone != null) {
                                arrayList2.add(new l20.c(null, primaryPhone, Boolean.TRUE, Integer.valueOf(l20.m.PRIMARY.f109026a), Integer.valueOf(l20.p.MOBILE.f109040a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048545, null));
                            }
                            cellPhone = vVar.getCellPhone();
                            if (cellPhone != null) {
                                arrayList2.add(new l20.c(null, cellPhone, Boolean.FALSE, Integer.valueOf(l20.m.NONE.f109026a), Integer.valueOf(l20.p.MOBILE.f109040a), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048545, null));
                            }
                        }
                        ArrayList arrayList5 = arrayList2;
                        country2 = qVar.getCountry();
                        if (country2 == null) {
                            str = countryCode;
                        } else {
                            str = country2;
                        }
                        countryOfCitizenship = qVar.getCountryOfCitizenship();
                        if (countryOfCitizenship == null) {
                            str2 = countryCode;
                        } else {
                            str2 = countryOfCitizenship;
                        }
                        qVarB = l20.q.b(qVar, str19, str110, str111, str, str2, r19, null, null, str17, str18, arrayList5, str112, str113, 7043912);
                        if (eVar != null) {
                            userContactsDTO2 = eVar.getUserContactsDTO();
                            if (userContactsDTO2 != null) {
                                rVarB = l20.r.b(userContactsDTO2, null, null, qVarB, 55);
                            } else {
                                rVarB = null;
                            }
                            eVarB = tj1.e.b(eVar, null, rVarB, 1);
                        }
                        if (eVarB != null) {
                            eVar = eVarB;
                        }
                    }
                    aVar7.getClass();
                    y0VarC6.j(g3.a.d(eVar));
                } else {
                    u62.z.h(g3.f35298f, r0Var.f105810a, C4());
                }
            } else {
                c22.g.f23056a.getClass();
                c22.g.a("“assistancePlusFetchFailure”");
                C4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }

    public final void F4() {
        Object objPut;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ((tj1.h) this.f137899a.getValue()).getClass();
        LinkedHashMap linkedHashMapA = tj1.h.a();
        ArrayList arrayList = new ArrayList(linkedHashMapA.size());
        for (Map.Entry entry : linkedHashMapA.entrySet()) {
            Locale locale = new Locale(Locale.getDefault().getLanguage(), (String) entry.getKey());
            if (g22.n.d(locale.getDisplayCountry())) {
                Object key = entry.getKey();
                key.getClass();
                String displayCountry = locale.getDisplayCountry();
                displayCountry.getClass();
                objPut = linkedHashMap.put(key, displayCountry);
            } else {
                Object key2 = entry.getKey();
                key2.getClass();
                objPut = linkedHashMap.put(key2, entry.toString());
            }
            arrayList.add((String) objPut);
        }
        this.f137909k.j(p13.u0.l(h0.N0(w0.o(linkedHashMap), new c())));
    }

    public final void G4() {
        List<String> list;
        List<String> list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        y0<g3<List<String>>> y0Var = this.f137905g;
        g3<List<String>> g3VarD = y0Var.d();
        if (g3VarD == null || (list2 = g3VarD.f35301b) == null) {
            g3<List<String>> g3VarD2 = y0Var.d();
            String strG = androidx.room.a0.g((g3VarD2 == null || (list = g3VarD2.f35301b) == null) ? null : Integer.valueOf(list.size()), "Error supported country iso codes  :: ");
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "BaseSafetyFeaturesViewModel", strG);
        } else {
            for (String str : list2) {
                Locale locale = new Locale(Locale.getDefault().getLanguage(), str);
                if (g22.n.d(locale.getDisplayCountry())) {
                    linkedHashMap.put(str, locale.getDisplayCountry());
                } else {
                    linkedHashMap.put(str, str);
                }
            }
        }
        Map<Object, String> mapL = p13.u0.l(h0.N0(w0.o(linkedHashMap), new d()));
        boolean zIsEmpty = mapL.isEmpty();
        y0<Map<Object, String>> y0Var2 = this.f137907i;
        if (zIsEmpty) {
            y0Var2.j(linkedHashMap);
        } else {
            y0Var2.j(mapL);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object x4(v13.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f137917c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f137917c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objF = fVar.f137915a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f137917c;
        if (i15 == 0) {
            o13.r.b(objF);
            o0 o0Var = (o0) this.f137900b.getValue();
            fVar.f137917c = 1;
            o0.a aVar2 = o0.f171346d;
            objF = o0Var.f(null, fVar);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objF);
        }
        v2 v2Var = (v2) objF;
        if (v2Var instanceof v2.b) {
            this.f137911m = ui1.y0.b((x0) ((v2.b) v2Var).f47386a);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object y4(hl.a.b bVar, v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f137920c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f137920c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objJ = gVar.f137918a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f137920c;
        if (i15 == 0) {
            o13.r.b(objJ);
            re0.o oVar = (re0.o) this.f137902d.getValue();
            long j8 = bVar.f84252b;
            gVar.f137920c = 1;
            objJ = oVar.j(j8, gVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            tj1.e eVar = (tj1.e) ((v2.b) v2Var).f47386a;
            y0<g3<tj1.e>> y0VarC4 = C4();
            g3.f35298f.getClass();
            y0VarC4.j(g3.a.d(eVar));
        } else {
            C4().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }

    public final Object z4(hl.a aVar, v13.i iVar) {
        if (p005kotlin.jvm.internal.s.g(aVar, hl.a.c.f84256b)) {
            Object objE4 = E4(iVar);
            return objE4 == u13.a.COROUTINE_SUSPENDED ? objE4 : Unit.INSTANCE;
        }
        if (aVar instanceof hl.a.b) {
            Object objY4 = y4((hl.a.b) aVar, iVar);
            return objY4 == u13.a.COROUTINE_SUSPENDED ? objY4 : Unit.INSTANCE;
        }
        u0.r();
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpj1/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
