package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public class p87 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Hashtable f30113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Hashtable f30114b;
    public static final Hashtable c;

    static {
        Hashtable hashtable = new Hashtable();
        f30113a = hashtable;
        Hashtable hashtable2 = new Hashtable();
        f30114b = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        c = hashtable3;
        BigInteger bigInteger = new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639319");
        BigInteger bigInteger2 = new BigInteger("115792089237316195423570985008687907853073762908499243225378155805079068850323");
        BigInteger bigInteger3 = new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639316");
        BigInteger bigInteger4 = new BigInteger("166");
        BigInteger bigInteger5 = y77.f39884b;
        b87.e eVar = new b87.e(bigInteger, bigInteger3, bigInteger4, bigInteger2, bigInteger5);
        c87 c87Var = new c87(eVar, eVar.d(new BigInteger("1"), new BigInteger("64033881142927202683649881450433473985931760268884941288852745803908878638612")), bigInteger2);
        fe feVar = t45.u;
        hashtable2.put(feVar, c87Var);
        BigInteger bigInteger6 = new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639319");
        BigInteger bigInteger7 = new BigInteger("115792089237316195423570985008687907853073762908499243225378155805079068850323");
        b87.e eVar2 = new b87.e(bigInteger6, new BigInteger("115792089237316195423570985008687907853269984665640564039457584007913129639316"), new BigInteger("166"), bigInteger7, bigInteger5);
        c87 c87Var2 = new c87(eVar2, eVar2.d(new BigInteger("1"), new BigInteger("64033881142927202683649881450433473985931760268884941288852745803908878638612")), bigInteger7);
        fe feVar2 = t45.x;
        hashtable2.put(feVar2, c87Var2);
        BigInteger bigInteger8 = new BigInteger("57896044618658097711785492504343953926634992332820282019728792003956564823193");
        BigInteger bigInteger9 = new BigInteger("57896044618658097711785492504343953927102133160255826820068844496087732066703");
        b87.e eVar3 = new b87.e(bigInteger8, new BigInteger("57896044618658097711785492504343953926634992332820282019728792003956564823190"), new BigInteger("28091019353058090096996979000309560759124368558014865957655842872397301267595"), bigInteger9, bigInteger5);
        c87 c87Var3 = new c87(eVar3, eVar3.d(new BigInteger("1"), new BigInteger("28792665814854611296992347458380284135028636778229113005756334730996303888124")), bigInteger9);
        fe feVar3 = t45.v;
        hashtable2.put(feVar3, c87Var3);
        BigInteger bigInteger10 = new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502619");
        BigInteger bigInteger11 = new BigInteger("70390085352083305199547718019018437840920882647164081035322601458352298396601");
        b87.e eVar4 = new b87.e(bigInteger10, new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502616"), new BigInteger("32858"), bigInteger11, bigInteger5);
        c87 c87Var4 = new c87(eVar4, eVar4.d(new BigInteger("0"), new BigInteger("29818893917731240733471273240314769927240550812383695689146495261604565990247")), bigInteger11);
        fe feVar4 = t45.y;
        hashtable2.put(feVar4, c87Var4);
        BigInteger bigInteger12 = new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502619");
        BigInteger bigInteger13 = new BigInteger("70390085352083305199547718019018437840920882647164081035322601458352298396601");
        b87.e eVar5 = new b87.e(bigInteger12, new BigInteger("70390085352083305199547718019018437841079516630045180471284346843705633502616"), new BigInteger("32858"), bigInteger13, bigInteger5);
        c87 c87Var5 = new c87(eVar5, eVar5.d(new BigInteger("0"), new BigInteger("29818893917731240733471273240314769927240550812383695689146495261604565990247")), bigInteger13);
        fe feVar5 = t45.w;
        hashtable2.put(feVar5, c87Var5);
        hashtable.put("GostR3410-2001-CryptoPro-A", feVar);
        hashtable.put("GostR3410-2001-CryptoPro-B", feVar3);
        hashtable.put("GostR3410-2001-CryptoPro-C", feVar5);
        hashtable.put("GostR3410-2001-CryptoPro-XchA", feVar2);
        hashtable.put("GostR3410-2001-CryptoPro-XchB", feVar4);
        hashtable3.put(feVar, "GostR3410-2001-CryptoPro-A");
        hashtable3.put(feVar3, "GostR3410-2001-CryptoPro-B");
        hashtable3.put(feVar5, "GostR3410-2001-CryptoPro-C");
        hashtable3.put(feVar2, "GostR3410-2001-CryptoPro-XchA");
        hashtable3.put(feVar4, "GostR3410-2001-CryptoPro-XchB");
    }

    public static c87 a(String str) {
        fe feVar = (fe) f30113a.get(str);
        if (feVar != null) {
            return (c87) f30114b.get(feVar);
        }
        return null;
    }

    public static c87 b(fe feVar) {
        return (c87) f30114b.get(feVar);
    }

    public static String c(fe feVar) {
        return (String) c.get(feVar);
    }

    public static fe d(String str) {
        return (fe) f30113a.get(str);
    }
}
