package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.frame.server_compact.ServerConstants;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes3.dex */
public class qt1 extends a20 {
    public static final ee A;
    public static final ee B;
    public static final ee C;
    public static final ee D;
    public static final ee E;
    public static final ee F;
    public static final ee G;
    public static final ee H;
    public static final ee I;
    public static final ee J;
    public static final ee K;
    public static final ee L;
    public static final Hashtable M;
    public static final Hashtable N;
    public static final opr O;
    public static final ee c;
    public static final ee d;
    public static final ee e;
    public static final ee f;
    public static final ee g;
    public static final ee h;
    public static final ee i;
    public static final ee j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ee f31815k;
    public static final ee l;
    public static final ee m;
    public static final ee n;
    public static final ee o;
    public static final ee p;
    public static final ee q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ee f31816r;
    public static final ee s;
    public static final ee t;
    public static final ee u;
    public static final ee v;
    public static final ee w;
    public static final ee x;
    public static final ee y;
    public static final ee z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Hashtable f31818b = a20.e(M);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Hashtable f31817a = a20.e(N);

    static {
        ee eeVarX = new ee("2.5.4.6").x();
        c = eeVarX;
        ee eeVarX2 = new ee("2.5.4.10").x();
        d = eeVarX2;
        ee eeVarX3 = new ee("2.5.4.11").x();
        e = eeVarX3;
        ee eeVarX4 = new ee("2.5.4.12").x();
        f = eeVarX4;
        ee eeVarX5 = new ee("2.5.4.3").x();
        g = eeVarX5;
        ee eeVarX6 = new ee("2.5.4.5").x();
        h = eeVarX6;
        ee eeVarX7 = new ee("2.5.4.9").x();
        i = eeVarX7;
        j = eeVarX6;
        ee eeVarX8 = new ee("2.5.4.7").x();
        f31815k = eeVarX8;
        ee eeVarX9 = new ee("2.5.4.8").x();
        l = eeVarX9;
        ee eeVarX10 = new ee("2.5.4.4").x();
        m = eeVarX10;
        ee eeVarX11 = new ee("2.5.4.42").x();
        n = eeVarX11;
        ee eeVarX12 = new ee("2.5.4.43").x();
        o = eeVarX12;
        ee eeVarX13 = new ee("2.5.4.44").x();
        p = eeVarX13;
        ee eeVarX14 = new ee("2.5.4.45").x();
        q = eeVarX14;
        ee eeVarX15 = new ee("2.5.4.15").x();
        f31816r = eeVarX15;
        ee eeVarX16 = new ee("2.5.4.17").x();
        s = eeVarX16;
        ee eeVarX17 = new ee("2.5.4.46").x();
        t = eeVarX17;
        ee eeVarX18 = new ee("2.5.4.65").x();
        u = eeVarX18;
        ee eeVarX19 = new ee("1.3.6.1.5.5.7.9.1").x();
        v = eeVarX19;
        ee eeVarX20 = new ee("1.3.6.1.5.5.7.9.2").x();
        w = eeVarX20;
        ee eeVarX21 = new ee("1.3.6.1.5.5.7.9.3").x();
        x = eeVarX21;
        ee eeVarX22 = new ee("1.3.6.1.5.5.7.9.4").x();
        y = eeVarX22;
        ee eeVarX23 = new ee("1.3.6.1.5.5.7.9.5").x();
        z = eeVarX23;
        ee eeVarX24 = new ee("1.3.36.8.3.14").x();
        A = eeVarX24;
        ee eeVarX25 = new ee("2.5.4.16").x();
        B = eeVarX25;
        C = new ee("2.5.4.54").x();
        ee eeVar = wpr.g;
        D = eeVar;
        ee eeVar2 = wpr.h;
        E = eeVar2;
        ee eeVar3 = wpr.i;
        F = eeVar3;
        ee eeVar4 = jgh.l7;
        G = eeVar4;
        ee eeVar5 = jgh.m7;
        H = eeVar5;
        ee eeVar6 = jgh.t7;
        I = eeVar6;
        J = eeVar4;
        ee eeVar7 = new ee("0.9.2342.19200300.100.1.25");
        K = eeVar7;
        ee eeVar8 = new ee("0.9.2342.19200300.100.1.1");
        L = eeVar8;
        Hashtable hashtable = new Hashtable();
        M = hashtable;
        Hashtable hashtable2 = new Hashtable();
        N = hashtable2;
        hashtable.put(eeVarX, "C");
        hashtable.put(eeVarX2, "O");
        hashtable.put(eeVarX4, "T");
        hashtable.put(eeVarX3, "OU");
        hashtable.put(eeVarX5, ServerConstants.NEW_CN_COUNTRY_CODE);
        hashtable.put(eeVarX8, "L");
        hashtable.put(eeVarX9, "ST");
        hashtable.put(eeVarX6, "SERIALNUMBER");
        hashtable.put(eeVar4, "E");
        hashtable.put(eeVar7, "DC");
        hashtable.put(eeVar8, "UID");
        hashtable.put(eeVarX7, "STREET");
        hashtable.put(eeVarX10, "SURNAME");
        hashtable.put(eeVarX11, "GIVENNAME");
        hashtable.put(eeVarX12, "INITIALS");
        hashtable.put(eeVarX13, "GENERATION");
        hashtable.put(eeVar6, "unstructuredAddress");
        hashtable.put(eeVar5, "unstructuredName");
        hashtable.put(eeVarX14, "UniqueIdentifier");
        hashtable.put(eeVarX17, "DN");
        hashtable.put(eeVarX18, "Pseudonym");
        hashtable.put(eeVarX25, "PostalAddress");
        hashtable.put(eeVarX24, "NameAtBirth");
        hashtable.put(eeVarX22, "CountryOfCitizenship");
        hashtable.put(eeVarX23, "CountryOfResidence");
        hashtable.put(eeVarX21, "Gender");
        hashtable.put(eeVarX20, "PlaceOfBirth");
        hashtable.put(eeVarX19, "DateOfBirth");
        hashtable.put(eeVarX16, "PostalCode");
        hashtable.put(eeVarX15, "BusinessCategory");
        hashtable.put(eeVar, "TelephoneNumber");
        hashtable.put(eeVar2, "Name");
        hashtable.put(eeVar3, "organizationIdentifier");
        hashtable2.put(PluginDeviceInfo.FICONON, eeVarX);
        hashtable2.put(DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, eeVarX2);
        hashtable2.put(DeviceTagInterface.CUSTOM_TAG_TYPE, eeVarX4);
        hashtable2.put("ou", eeVarX3);
        hashtable2.put("cn", eeVarX5);
        hashtable2.put(e.f13808a, eeVarX8);
        hashtable2.put("st", eeVarX9);
        hashtable2.put("sn", eeVarX6);
        hashtable2.put("serialnumber", eeVarX6);
        hashtable2.put("street", eeVarX7);
        hashtable2.put("emailaddress", eeVar4);
        hashtable2.put("dc", eeVar7);
        hashtable2.put(PluginDeviceInfo.FICONOFFLINE, eeVar4);
        hashtable2.put("uid", eeVar8);
        hashtable2.put("surname", eeVarX10);
        hashtable2.put("givenname", eeVarX11);
        hashtable2.put("initials", eeVarX12);
        hashtable2.put("generation", eeVarX13);
        hashtable2.put("unstructuredaddress", eeVar6);
        hashtable2.put("unstructuredname", eeVar5);
        hashtable2.put("uniqueidentifier", eeVarX14);
        hashtable2.put("dn", eeVarX17);
        hashtable2.put("pseudonym", eeVarX18);
        hashtable2.put("postaladdress", eeVarX25);
        hashtable2.put("nameofbirth", eeVarX24);
        hashtable2.put("countryofcitizenship", eeVarX22);
        hashtable2.put("countryofresidence", eeVarX23);
        hashtable2.put("gender", eeVarX21);
        hashtable2.put("placeofbirth", eeVarX20);
        hashtable2.put("dateofbirth", eeVarX19);
        hashtable2.put("postalcode", eeVarX16);
        hashtable2.put("businesscategory", eeVarX15);
        hashtable2.put("telephonenumber", eeVar);
        hashtable2.put("name", eeVar2);
        hashtable2.put("organizationidentifier", eeVar3);
        O = new qt1();
    }

    @Override // defpackage.opr
    public String b(mpr mprVar) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z2 = true;
        for (s6j s6jVar : mprVar.j()) {
            if (z2) {
                z2 = false;
            } else {
                stringBuffer.append(',');
            }
            vrc.a(stringBuffer, s6jVar, this.f31818b);
        }
        return stringBuffer.toString();
    }
}
