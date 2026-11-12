package rs2;

import com.garmin.proto.generated.GDICore;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface u {
    Set<Integer> a(c cVar);

    void b(c cVar, GDICore.FeatureCapabilitiesResponse.GuidStatus guidStatus, t tVar);

    byte[] c();

    String e();

    List<h> f(c cVar);

    f g(String str);

    int getAppVersion();

    String getFriendlyName();

    ss2.b h(String str);

    List<dt2.a> j(c cVar);
}
