package cr1;

import d53.u;
import gg1.v0;
import i83.y;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J)\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcr1/d;", "", "", "cmsManifestUrl", "Lbr1/c;", "notificationDTO", "Lc83/d;", "a", "(Ljava/lang/String;Lbr1/c;)Lc83/d;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f55359a = a.f55360a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcr1/d$a;", "", "<init>", "()V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f55360a = new a();

        private a() {
        }

        public static String a() {
            return u.v(((zy0.l) KoinJavaComponent.get$default(zy0.l.class, null, null, 6, null)).k(ez0.c.GCS), "https://" + v0.TestServerEnvironment.f77336b, "https://vivokidmission-test.garmin.com", false).concat("/asset-service/download-manifest/");
        }
    }

    @i83.o
    c83.d<String> a(@y String cmsManifestUrl, @i83.a br1.c notificationDTO);
}
