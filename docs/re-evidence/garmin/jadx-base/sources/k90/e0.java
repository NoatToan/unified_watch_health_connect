package k90;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Ll90/b;", "<anonymous>", "(Lo53/b0;)Ll90/b;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.GetDeviceInfoUseCase$findDeviceInfo$2", f = "GetDeviceInfoUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e0 extends v13.i implements e23.p<o53.b0, t13.d<? super l90.b>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f103463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f103464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f103465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f103466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f103467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<l90.b> f103468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d0 f103469g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(String str, String str2, String str3, String str4, List<l90.b> list, d0 d0Var, t13.d<? super e0> dVar) {
        super(2, dVar);
        this.f103464b = str;
        this.f103465c = str2;
        this.f103466d = str3;
        this.f103467e = str4;
        this.f103468f = list;
        this.f103469g = d0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e0 e0Var = new e0(this.f103464b, this.f103465c, this.f103466d, this.f103467e, this.f103468f, this.f103469g, dVar);
        e0Var.f103463a = obj;
        return e0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super l90.b> dVar) {
        return ((e0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0460 A[LOOP:3: B:35:0x0169->B:128:0x0460, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x045d A[SYNTHETIC] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        d0 d0Var;
        String str;
        String str2;
        ArrayList arrayList;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Object obj2;
        Object obj3;
        Object obj4;
        Iterator it;
        Object obj5;
        String str8;
        d0 d0Var2;
        String str9;
        boolean z14;
        yl2.b bVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        a2 a2Var = a2.DEVICE_SETUP;
        String str10 = this.f103464b;
        String str11 = ", application key: ";
        String str12 = this.f103465c;
        StringBuilder sbI = p6.b.i("Searching for device by product number: ", str10, ", application key: ", str12, ", product SKU: ");
        String str13 = this.f103466d;
        String str14 = ", product display name: ";
        String str15 = this.f103467e;
        String strH = v.e0.h(sbI, str13, ", product display name: ", str15);
        i2.f36769a.getClass();
        i2.a.b(a2Var, "GetDeviceInfoUseCase", strH);
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it3 = this.f103468f.iterator();
        while (true) {
            boolean zHasNext = it3.hasNext();
            d0Var = this.f103469g;
            if (!zHasNext) {
                break;
            }
            Object next = it3.next();
            if (d0.a(d0Var, ((l90.b) next).f111522g, str10)) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() == 1) {
            a2 a2Var2 = a2.DEVICE_SETUP;
            String strG = v.e0.g("Single device found for product number: ", str10, " (", ((l90.b) p13.h0.b0(arrayList2)).f111521f, ")");
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "GetDeviceInfoUseCase", strG);
            return (l90.b) p13.h0.b0(arrayList2);
        }
        a2 a2Var3 = a2.DEVICE_SETUP;
        ArrayList arrayList3 = new ArrayList(p13.y.r(arrayList2, 10));
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            arrayList3.add(((l90.b) it4.next()).f111521f);
        }
        i2.f36769a.getClass();
        i2.a.b(a2Var3, "GetDeviceInfoUseCase", "Multiple devices found for product number: " + str10 + " (" + arrayList3 + ")");
        Iterator it5 = arrayList2.iterator();
        while (true) {
            boolean zHasNext2 = it5.hasNext();
            str = "";
            str2 = StringUtils.SPACE;
            if (!zHasNext2) {
                arrayList = arrayList2;
                str3 = str10;
                str4 = str11;
                str5 = str12;
                str6 = str13;
                str7 = str14;
                obj2 = null;
                obj3 = null;
                break;
            }
            Object next2 = it5.next();
            obj2 = null;
            l90.b bVar2 = (l90.b) next2;
            String str16 = bVar2.f111516a;
            Iterator it6 = it5;
            String str17 = bVar2.f111521f;
            String str18 = bVar2.f111523h;
            arrayList = arrayList2;
            boolean zA = d0.a(d0Var, str16, str12);
            boolean zA2 = d0.a(d0Var, str18, str13);
            str6 = str13;
            boolean zA3 = d0.a(d0Var, str17, str15);
            str7 = str14;
            boolean zA4 = d0.a(d0Var, str16, str15 != null ? d53.u.v(str15, StringUtils.SPACE, "", false) : null);
            str3 = str10;
            a2 a2Var4 = a2.DEVICE_SETUP;
            str4 = str11;
            str5 = str12;
            StringBuilder sbI2 = p6.b.i("Checking device name[", str17, "], sku[", str18, "], sku[");
            v.h.C(str16, "]: sameApplicationKey=", ", sameProductSku=", sbI2, zA);
            kg.f.q(", sameDisplayName=", ", applicationKeyMatchName=", sbI2, zA2, zA3);
            sbI2.append(zA4);
            String string = sbI2.toString();
            i2.f36769a.getClass();
            i2.a.b(a2Var4, "GetDeviceInfoUseCase", string);
            if (zA || zA2 || zA3 || zA4) {
                obj3 = next2;
                break;
            }
            it5 = it6;
            arrayList2 = arrayList;
            str13 = str6;
            str14 = str7;
            str10 = str3;
            str11 = str4;
            str12 = str5;
        }
        l90.b bVar3 = (l90.b) obj3;
        if (bVar3 != null) {
            return bVar3;
        }
        Iterator it7 = arrayList.iterator();
        while (true) {
            if (!it7.hasNext()) {
                obj4 = obj2;
                break;
            }
            Object next3 = it7.next();
            l90.b bVar4 = (l90.b) next3;
            if (str15 != null) {
                d0Var.f103448b.getClass();
                bVar4.getClass();
                String str19 = bVar4.f111516a;
                String str20 = bVar4.f111521f;
                String strV = d53.u.v(str15, str2, str, false);
                yl2.b bVar5 = yl2.b.Y2;
                HashSet hashSetB = yl2.b.b(p13.w.c(bVar5));
                String str21 = bVar4.f111522g;
                it = it7;
                obj5 = next3;
                str8 = str;
                if (hashSetB.contains(str21) && m0.b(bVar4) && d53.w.z(strV, "quatix", true)) {
                    i2.a aVar2 = i2.f36769a;
                    a2 a2Var5 = a2.GENERAL;
                    aVar2.getClass();
                    i2.a.b(a2Var5, "MatchDeviceByCustomRuleUseCase", "Device " + bVar4 + " matched as Quatix 6 with BT friendly name [" + str15 + "]");
                } else if (m0.a(bVar5, bVar4, strV)) {
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var6 = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.b(a2Var6, "MatchDeviceByCustomRuleUseCase", "Device " + bVar4 + " matched as Fenix 6 Pro Solar with BT friendly name [" + str15 + "]");
                } else if (m0.a(yl2.b.Z2, bVar4, strV)) {
                    i2.a aVar4 = i2.f36769a;
                    a2 a2Var7 = a2.GENERAL;
                    aVar4.getClass();
                    i2.a.b(a2Var7, "MatchDeviceByCustomRuleUseCase", "Device " + bVar4 + " matched as Fenix 6S Pro Solar with BT friendly name [" + str15 + "]");
                } else if (m0.a(yl2.b.f197665b3, bVar4, strV)) {
                    i2.a aVar5 = i2.f36769a;
                    a2 a2Var8 = a2.GENERAL;
                    aVar5.getClass();
                    i2.a.b(a2Var8, "MatchDeviceByCustomRuleUseCase", "Device " + bVar4 + " matched as Fenix 6 Sport Solar with BT friendly name [" + str15 + "]");
                } else {
                    if (m0.a(yl2.b.f197683e3, bVar4, strV)) {
                        i2.a aVar6 = i2.f36769a;
                        a2 a2Var9 = a2.GENERAL;
                        aVar6.getClass();
                        i2.a.b(a2Var9, "MatchDeviceByCustomRuleUseCase", "Device " + bVar4 + " matched as Fenix 6S Sport Solar with BT friendly name [" + str15 + "]");
                    } else {
                        yl2.b bVar6 = yl2.b.f197659a3;
                        d0Var2 = d0Var;
                        if (yl2.b.b(p13.w.c(bVar6)).contains(str21) && m0.b(bVar4) && m0.c(bVar4) && d53.w.z(strV, "quatix", true)) {
                            if (d53.w.z(strV, "solar", true)) {
                                str9 = str2;
                            } else {
                                str9 = str2;
                                if (d53.w.z(strV, "dualpower", true)) {
                                }
                                z14 = true;
                            }
                            i2.a aVar7 = i2.f36769a;
                            a2 a2Var10 = a2.GENERAL;
                            aVar7.getClass();
                            i2.a.b(a2Var10, "MatchDeviceByCustomRuleUseCase", "Device " + bVar4 + " matched as Quatix 6X Solar with BT friendly name [" + str15 + "]");
                            z14 = true;
                        } else {
                            str9 = str2;
                        }
                        if (m0.a(bVar6, bVar4, strV)) {
                            i2.a aVar8 = i2.f36769a;
                            a2 a2Var11 = a2.GENERAL;
                            aVar8.getClass();
                            i2.a.b(a2Var11, "MatchDeviceByCustomRuleUseCase", "Device " + bVar4 + " matched as Fenix 6X Solar with BT friendly name [" + str15 + "]");
                        } else {
                            if (yl2.b.b(p13.w.c(bVar6)).contains(str21) && (d53.w.z(str19, "tactixdelta", true) || d53.w.z(str20, "tactixdelta", true))) {
                                bVar = bVar6;
                                if ((d53.w.z(str19, "solar", true) || d53.w.z(str20, "solar", true) || d53.w.z(str19, "ballistic", true) || d53.w.z(str20, "ballistic", true)) && d53.w.z(strV, "tactixdelta", true) && (d53.w.z(strV, "solar", true) || d53.w.z(strV, "ballistic", true))) {
                                    i2.a aVar9 = i2.f36769a;
                                    a2 a2Var12 = a2.GENERAL;
                                    aVar9.getClass();
                                    i2.a.b(a2Var12, "MatchDeviceByCustomRuleUseCase", "Device " + bVar4 + " matched as Tactix Delta Solar with BT friendly name [" + str15 + "]");
                                }
                            } else {
                                bVar = bVar6;
                            }
                            if (yl2.b.b(p13.w.c(bVar)).contains(str21) && ((d53.w.z(str19, "tactixdelta", true) || d53.w.z(str20, "tactixdelta", true)) && d53.w.z(strV, "tactixdelta", true))) {
                                i2.a aVar10 = i2.f36769a;
                                a2 a2Var13 = a2.GENERAL;
                                aVar10.getClass();
                                i2.a.b(a2Var13, "MatchDeviceByCustomRuleUseCase", "Device " + bVar4 + " matched as Tactix Delta with BT friendly name [" + str15 + "]");
                            } else if (m0.b(bVar4) && d53.w.z(str15, "quatix", true)) {
                                i2.a aVar11 = i2.f36769a;
                                a2 a2Var14 = a2.GENERAL;
                                aVar11.getClass();
                                i2.a.b(a2Var14, "MatchDeviceByCustomRuleUseCase", "Device " + bVar4 + " matched as Quatix with BT friendly name [" + str15 + "]");
                            } else if ((d53.w.z(str19, "tactix", true) || d53.w.z(str20, "tactix", true)) && d53.w.z(str15, "tactix", true)) {
                                i2.a aVar12 = i2.f36769a;
                                a2 a2Var15 = a2.GENERAL;
                                aVar12.getClass();
                                i2.a.b(a2Var15, "MatchDeviceByCustomRuleUseCase", "Device " + bVar4 + " matched as Tactix with BT friendly name [" + str15 + "]");
                                z14 = true;
                            }
                        }
                        z14 = true;
                    }
                    a2 a2Var16 = a2.DEVICE_SETUP;
                    String str22 = "Custom check name[" + bVar4.f111521f + "]: customDeviceMatch=" + z14;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var16, "GetDeviceInfoUseCase", str22);
                    if (z14) {
                        obj4 = obj5;
                        break;
                    }
                    it7 = it;
                    str = str8;
                    d0Var = d0Var2;
                    str2 = str9;
                }
                d0Var2 = d0Var;
                str9 = str2;
                z14 = true;
                a2 a2Var17 = a2.DEVICE_SETUP;
                String str23 = "Custom check name[" + bVar4.f111521f + "]: customDeviceMatch=" + z14;
                i2.f36769a.getClass();
                i2.a.b(a2Var17, "GetDeviceInfoUseCase", str23);
                if (z14) {
                    obj4 = obj5;
                    break;
                }
                it7 = it;
                str = str8;
                d0Var = d0Var2;
                str2 = str9;
            } else {
                it = it7;
                obj5 = next3;
                str8 = str;
                d0Var2 = d0Var;
                str9 = str2;
            }
            z14 = false;
            a2 a2Var18 = a2.DEVICE_SETUP;
            String str24 = "Custom check name[" + bVar4.f111521f + "]: customDeviceMatch=" + z14;
            i2.f36769a.getClass();
            i2.a.b(a2Var18, "GetDeviceInfoUseCase", str24);
            if (z14) {
                obj4 = obj5;
                break;
            }
            it7 = it;
            str = str8;
            d0Var = d0Var2;
            str2 = str9;
        }
        l90.b bVar7 = (l90.b) obj4;
        if (bVar7 != null) {
            return bVar7;
        }
        a2 a2Var19 = a2.DEVICE_SETUP;
        String strH2 = v.e0.h(p6.b.i("No matching device found for product number ", str3, str4, str5, ", product SKU: "), str6, str7, str15);
        i2.f36769a.getClass();
        i2.a.b(a2Var19, "GetDeviceInfoUseCase", strH2);
        return obj2;
    }
}
