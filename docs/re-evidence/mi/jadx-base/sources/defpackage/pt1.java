package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public class pt1 extends z10 {
    public static final fe A;
    public static final fe B;
    public static final fe C;
    public static final fe D;
    public static final fe E;
    public static final fe F;
    public static final fe G;
    public static final fe H;
    public static final fe I;
    public static final fe J;
    public static final fe K;
    public static final Hashtable L;
    public static final Hashtable M;
    public static final npr N;
    public static final fe c;
    public static final fe d;
    public static final fe e;
    public static final fe f;
    public static final fe g;
    public static final fe h;
    public static final fe i;
    public static final fe j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final fe f30726k;
    public static final fe l;
    public static final fe m;
    public static final fe n;
    public static final fe o;
    public static final fe p;
    public static final fe q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final fe f30727r;
    public static final fe s;
    public static final fe t;
    public static final fe u;
    public static final fe v;
    public static final fe w;
    public static final fe x;
    public static final fe y;
    public static final fe z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Hashtable f30729b = z10.e(L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hashtable f30728a = z10.e(M);

    static {
        fe feVarX = new fe("2.5.4.6").x();
        c = feVarX;
        fe feVarX2 = new fe("2.5.4.10").x();
        d = feVarX2;
        fe feVarX3 = new fe("2.5.4.11").x();
        e = feVarX3;
        fe feVarX4 = new fe("2.5.4.12").x();
        f = feVarX4;
        fe feVarX5 = new fe("2.5.4.3").x();
        g = feVarX5;
        fe feVarX6 = new fe("2.5.4.5").x();
        h = feVarX6;
        fe feVarX7 = new fe("2.5.4.9").x();
        i = feVarX7;
        j = feVarX6;
        fe feVarX8 = new fe("2.5.4.7").x();
        f30726k = feVarX8;
        fe feVarX9 = new fe("2.5.4.8").x();
        l = feVarX9;
        fe feVarX10 = new fe("2.5.4.4").x();
        m = feVarX10;
        fe feVarX11 = new fe("2.5.4.42").x();
        n = feVarX11;
        fe feVarX12 = new fe("2.5.4.43").x();
        o = feVarX12;
        fe feVarX13 = new fe("2.5.4.44").x();
        p = feVarX13;
        fe feVarX14 = new fe("2.5.4.45").x();
        q = feVarX14;
        fe feVarX15 = new fe("2.5.4.15").x();
        f30727r = feVarX15;
        fe feVarX16 = new fe("2.5.4.17").x();
        s = feVarX16;
        fe feVarX17 = new fe("2.5.4.46").x();
        t = feVarX17;
        fe feVarX18 = new fe("2.5.4.65").x();
        u = feVarX18;
        fe feVarX19 = new fe("1.3.6.1.5.5.7.9.1").x();
        v = feVarX19;
        fe feVarX20 = new fe("1.3.6.1.5.5.7.9.2").x();
        w = feVarX20;
        fe feVarX21 = new fe("1.3.6.1.5.5.7.9.3").x();
        x = feVarX21;
        fe feVarX22 = new fe("1.3.6.1.5.5.7.9.4").x();
        y = feVarX22;
        fe feVarX23 = new fe("1.3.6.1.5.5.7.9.5").x();
        z = feVarX23;
        fe feVarX24 = new fe("1.3.36.8.3.14").x();
        A = feVarX24;
        fe feVarX25 = new fe("2.5.4.16").x();
        B = feVarX25;
        C = new fe("2.5.4.54").x();
        fe feVar = vpr.g;
        D = feVar;
        fe feVar2 = vpr.h;
        E = feVar2;
        fe feVar3 = igh.v4;
        F = feVar3;
        fe feVar4 = igh.w4;
        G = feVar4;
        fe feVar5 = igh.D4;
        H = feVar5;
        I = feVar3;
        fe feVar6 = new fe("0.9.2342.19200300.100.1.25");
        J = feVar6;
        fe feVar7 = new fe("0.9.2342.19200300.100.1.1");
        K = feVar7;
        Hashtable hashtable = new Hashtable();
        L = hashtable;
        Hashtable hashtable2 = new Hashtable();
        M = hashtable2;
        hashtable.put(feVarX, "C");
        hashtable.put(feVarX2, "O");
        hashtable.put(feVarX4, "T");
        hashtable.put(feVarX3, "OU");
        hashtable.put(feVarX5, ServerConstants.NEW_CN_COUNTRY_CODE);
        hashtable.put(feVarX8, "L");
        hashtable.put(feVarX9, "ST");
        hashtable.put(feVarX6, "SERIALNUMBER");
        hashtable.put(feVar3, "E");
        hashtable.put(feVar6, "DC");
        hashtable.put(feVar7, "UID");
        hashtable.put(feVarX7, "STREET");
        hashtable.put(feVarX10, "SURNAME");
        hashtable.put(feVarX11, "GIVENNAME");
        hashtable.put(feVarX12, "INITIALS");
        hashtable.put(feVarX13, "GENERATION");
        hashtable.put(feVar5, "unstructuredAddress");
        hashtable.put(feVar4, "unstructuredName");
        hashtable.put(feVarX14, "UniqueIdentifier");
        hashtable.put(feVarX17, "DN");
        hashtable.put(feVarX18, "Pseudonym");
        hashtable.put(feVarX25, "PostalAddress");
        hashtable.put(feVarX24, "NameAtBirth");
        hashtable.put(feVarX22, "CountryOfCitizenship");
        hashtable.put(feVarX23, "CountryOfResidence");
        hashtable.put(feVarX21, "Gender");
        hashtable.put(feVarX20, "PlaceOfBirth");
        hashtable.put(feVarX19, "DateOfBirth");
        hashtable.put(feVarX16, "PostalCode");
        hashtable.put(feVarX15, "BusinessCategory");
        hashtable.put(feVar, "TelephoneNumber");
        hashtable.put(feVar2, "Name");
        hashtable2.put(PluginDeviceInfo.FICONON, feVarX);
        hashtable2.put(DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, feVarX2);
        hashtable2.put(DeviceTagInterface.CUSTOM_TAG_TYPE, feVarX4);
        hashtable2.put("ou", feVarX3);
        hashtable2.put("cn", feVarX5);
        hashtable2.put(e.f13808a, feVarX8);
        hashtable2.put("st", feVarX9);
        hashtable2.put("sn", feVarX6);
        hashtable2.put("serialnumber", feVarX6);
        hashtable2.put("street", feVarX7);
        hashtable2.put("emailaddress", feVar3);
        hashtable2.put("dc", feVar6);
        hashtable2.put(PluginDeviceInfo.FICONOFFLINE, feVar3);
        hashtable2.put("uid", feVar7);
        hashtable2.put("surname", feVarX10);
        hashtable2.put("givenname", feVarX11);
        hashtable2.put("initials", feVarX12);
        hashtable2.put("generation", feVarX13);
        hashtable2.put("unstructuredaddress", feVar5);
        hashtable2.put("unstructuredname", feVar4);
        hashtable2.put("uniqueidentifier", feVarX14);
        hashtable2.put("dn", feVarX17);
        hashtable2.put("pseudonym", feVarX18);
        hashtable2.put("postaladdress", feVarX25);
        hashtable2.put("nameofbirth", feVarX24);
        hashtable2.put("countryofcitizenship", feVarX22);
        hashtable2.put("countryofresidence", feVarX23);
        hashtable2.put("gender", feVarX21);
        hashtable2.put("placeofbirth", feVarX20);
        hashtable2.put("dateofbirth", feVarX19);
        hashtable2.put("postalcode", feVarX16);
        hashtable2.put("businesscategory", feVarX15);
        hashtable2.put("telephonenumber", feVar);
        hashtable2.put("name", feVar2);
        N = new pt1();
    }

    @Override // defpackage.npr
    public String a(lpr lprVar) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z2 = true;
        for (r6j r6jVar : lprVar.j()) {
            if (z2) {
                z2 = false;
            } else {
                stringBuffer.append(',');
            }
            urc.a(stringBuffer, r6jVar, this.f30729b);
        }
        return stringBuffer.toString();
    }
}
