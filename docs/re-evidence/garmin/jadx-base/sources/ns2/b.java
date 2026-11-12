package ns2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.Gson;
import d53.w;
import java.util.ArrayList;
import java.util.List;
import o13.m;
import o13.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lns2/b;", "", "Lhs2/a;", TtmlNode.TAG_METADATA, "", "restrictedDeviceJSON", "restrictedBusinessOperatorsJSON", "<init>", "(Lhs2/a;Ljava/lang/String;Ljava/lang/String;)V", "a", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f127817g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hs2.a f127818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f127820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f127821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f127822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f127823f;

    /* JADX INFO: renamed from: ns2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class C2451b extends q implements e23.a<List<? extends String>> {
        public C2451b(Object obj) {
            super(0, obj, b.class, "loadRestrictedBusinessOperators", "loadRestrictedBusinessOperators()Ljava/util/List;", 0);
        }

        @Override // e23.a
        public final List<? extends String> invoke() {
            b bVar = (b) this.receiver;
            String str = bVar.f127820c;
            if (str != null && str.length() != 0) {
                try {
                    return w.W(bVar.f127820c, new String[]{","});
                } catch (Exception e4) {
                    b.f127817g.error("loadRestrictedBusinessOperators : " + e4);
                }
            }
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements e23.a<os2.a> {
        public c(Object obj) {
            super(0, obj, b.class, "loadRestrictedDevice", "loadRestrictedDevice()Lcom/garmin/garminpay/util/restricted/RestrictedDevice;", 0);
        }

        @Override // e23.a
        public final os2.a invoke() {
            os2.a[] aVarArr;
            b bVar = (b) this.receiver;
            String str = bVar.f127819b;
            if (str == null || (aVarArr = (os2.a[]) new Gson().fromJson(str, os2.a[].class)) == null) {
                return null;
            }
            for (os2.a aVar : aVarArr) {
                Integer num = aVar.f133554a;
                int productNumber = bVar.f127818a.getProductNumber();
                if (num != null && num.intValue() == productNumber) {
                    return aVar;
                }
            }
            return null;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f127817g = gt2.b.f79005a.h("PAY#CORE#BusinessOperatorRestrictionsBuilder");
    }

    public b(hs2.a aVar, String str, String str2) {
        aVar.getClass();
        this.f127818a = aVar;
        this.f127819b = str;
        this.f127820c = str2;
        this.f127821d = m.b(new c(this));
        this.f127822e = m.b(new C2451b(this));
        this.f127823f = new ArrayList();
    }

    public final ArrayList a(qs2.a aVar) {
        ArrayList arrayList = this.f127823f;
        arrayList.clear();
        os2.a aVar2 = (os2.a) this.f127821d.getValue();
        Logger logger = f127817g;
        if (aVar2 != null) {
            if (aVar2.f133556c != null) {
                hs2.a aVar3 = this.f127818a;
                if (aVar3.getFirmwareVersion() < aVar2.f133556c.intValue()) {
                    String displayName = aVar3.getDisplayName();
                    long unitId = aVar3.getUnitId();
                    int firmwareVersion = aVar3.getFirmwareVersion();
                    Integer num = aVar2.f133556c;
                    StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(unitId, "Device \"", displayName, "\" (");
                    sbJ.append(") is below the minimum required firmware version. Current: ");
                    sbJ.append(firmwareVersion);
                    sbJ.append(", Required: ");
                    sbJ.append(num);
                    logger.info(sbJ.toString());
                    arrayList.add(qs2.b.FIRMWARE_VERSION_TOO_LOW);
                }
            }
            if (aVar2.f133555b != null) {
                ps2.w.f140538a.getClass();
                if (ps2.w.f140547j < aVar2.f133555b.intValue()) {
                    logger.info("App version is below the minimum required app version. Current: " + ps2.w.f140547j + ", Required: " + aVar2.f133555b);
                    arrayList.add(qs2.b.APP_VERSION_TOO_LOW);
                }
            }
            List<String> list = aVar2.f133557d;
            if (list != null) {
                for (String str : list) {
                    if (aVar != null && s.g(aVar.name(), str)) {
                        logger.info("Unapproved network: " + str);
                        arrayList.add(qs2.b.UNAPPROVED);
                    }
                }
            }
        }
        List<String> list2 = (List) this.f127822e.getValue();
        if (list2 != null) {
            for (String str2 : list2) {
                if (aVar != null && s.g(aVar.name(), str2)) {
                    logger.info("Restricted network: " + str2);
                    arrayList.add(qs2.b.REMOTE_CONFIG_DISABLED);
                }
            }
        }
        return arrayList;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lns2/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay-core_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
