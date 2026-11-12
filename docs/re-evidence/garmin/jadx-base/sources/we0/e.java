package we0;

import android.os.Build;
import ht.r;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.u0;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lwe0/e;", "Lht/r;", "", "feedbackKey", "", "userFeedback", "Lsd2/f;", "deviceInfo", "<init>", "(Ljava/lang/String;Ljava/lang/Object;Lsd2/f;)V", "a", "gcm-domain-feedback_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f184747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sd2.f f184748c;

    static {
        new a(null);
    }

    public e(String str, Object obj, sd2.f fVar) {
        str.getClass();
        obj.getClass();
        this.f184746a = str;
        this.f184747b = obj;
        this.f184748c = fVar;
    }

    @Override // ht.r
    public final zk.a a() {
        kc2.g gVar;
        ArrayList arrayListM = x.m(new zk.e("Screen", "Settings"));
        arrayListM.add(new zk.e("UserFeedback", this.f184747b));
        sd2.f fVar = this.f184748c;
        if (fVar != null) {
            long unitID = fVar.getUnitID();
            String productDisplayName = fVar.getProductDisplayName();
            productDisplayName.getClass();
            String partNumber = fVar.getPartNumber();
            partNumber.getClass();
            String softwareVersion = fVar.getSoftwareVersion();
            if (softwareVersion == null) {
                softwareVersion = "";
            }
            gVar = new kc2.g(unitID, productDisplayName, partNumber, softwareVersion);
        } else {
            gVar = null;
        }
        if (gVar != null) {
            arrayListM.add(new zk.e("UnitInfo", gVar));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        yt2.f.f199669a.getClass();
        yt2.a aVar = yt2.f.f199670b;
        if (aVar != null) {
            yt2.g gVarD = aVar.d();
            linkedHashMap.put("DeviceGuid", gVarD.f199677c);
            linkedHashMap.put("ApplicationInfo", u0.e(new p("Name", gVarD.f199675a), new p("Version", gVarD.f199676b)));
        }
        jc2.e.f98177a.getClass();
        linkedHashMap.put("OperatingSystemInfo", u0.e(new p("Name", (String) jc2.e.f98178b.getValue()), new p("Version", Integer.valueOf(Build.VERSION.SDK_INT))));
        String language = Locale.getDefault().getLanguage();
        String country = Locale.getDefault().getCountry();
        country.getClass();
        String upperCase = country.toUpperCase(Locale.ROOT);
        linkedHashMap.put("MobileDeviceInfo", u0.e(new p("LocaleCode", zl.a.c(upperCase, language, "_", upperCase)), new p("Model", Build.MODEL), new p("Manufacturer", Build.MANUFACTURER)));
        arrayListM.add(new zk.e("ClientInfo", linkedHashMap));
        return new zk.a(this.f184746a, arrayListM, true, 0L, 8, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f184746a.equals(eVar.f184746a) && this.f184747b.equals(eVar.f184747b) && s.g(this.f184748c, eVar.f184748c);
    }

    public final int hashCode() {
        int iHashCode = (this.f184747b.hashCode() + (this.f184746a.hashCode() * 31)) * 31;
        sd2.f fVar = this.f184748c;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }

    public final String toString() {
        return "FeedbackEvent(feedbackKey=" + this.f184746a + ", userFeedback=" + this.f184747b + ", deviceInfo=" + this.f184748c + ")";
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lwe0/e$a;", "", "<init>", "()V", "", "USER_FEEDBACK_KEY", "Ljava/lang/String;", "UNIT_INFO_KEY", "CLIENT_INFO_KEY", "GUID_KEY", "APPLICATION_INFO_KEY", "NAME_KEY", "VERSION_KEY", "MOBILE_DEVICE_INFO_KEY", "LOCAL_CODE_KEY", "MODEL_KEY", "MANUFACTURER_KEY", "OS_INFO_KEY", "gcm-domain-feedback_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
