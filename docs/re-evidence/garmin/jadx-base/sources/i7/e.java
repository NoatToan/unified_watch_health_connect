package i7;

import android.util.Base64;
import i3.e5;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<List<byte[]>> f91914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f91915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f91916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f91917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f91918h;

    public e(String str, String str2, String str3, int i14) {
        str.getClass();
        this.f91911a = str;
        str2.getClass();
        this.f91912b = str2;
        str3.getClass();
        this.f91913c = str3;
        this.f91914d = null;
        k7.h.a(i14 != 0);
        this.f91915e = i14;
        this.f91916f = null;
        this.f91917g = null;
        this.f91918h = a(str, str2, str3, null, null);
    }

    public static String a(String str, String str2, String str3, String str4, String str5) {
        return e5.h(e5.l(str, "-", str2, "-", str3), "-", str4, "-", str5);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("FontRequest {mProviderAuthority: " + this.f91911a + ", mProviderPackage: " + this.f91912b + ", mQuery: " + this.f91913c + ", mSystemFont: " + this.f91916f + ", mVariationSettings: " + this.f91917g + ", mCertificates:");
        int i14 = 0;
        while (true) {
            List<List<byte[]>> list = this.f91914d;
            if (i14 >= list.size()) {
                sb3.append(StringSubstitutor.DEFAULT_VAR_END);
                sb3.append("mCertificatesArray: " + this.f91915e);
                return sb3.toString();
            }
            sb3.append(" [");
            List<byte[]> list2 = list.get(i14);
            for (int i15 = 0; i15 < list2.size(); i15++) {
                sb3.append(" \"");
                sb3.append(Base64.encodeToString(list2.get(i15), 0));
                sb3.append("\"");
            }
            sb3.append(" ]");
            i14++;
        }
    }

    public e(String str, String str2, String str3, List<List<byte[]>> list, String str4, String str5) {
        str.getClass();
        this.f91911a = str;
        str2.getClass();
        this.f91912b = str2;
        str3.getClass();
        this.f91913c = str3;
        list.getClass();
        this.f91914d = list;
        this.f91915e = 0;
        this.f91916f = str4;
        this.f91917g = str5;
        this.f91918h = a(str, str2, str3, str4, str5);
    }

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this(str, str2, str3, list, null, null);
    }
}
