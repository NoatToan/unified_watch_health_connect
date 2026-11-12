package lq0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Llq0/b;", "Lkq0/b;", "", "isDebugEnabled", "<init>", "(Z)V", "a", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements kq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f114314a;

    static {
        new a(null);
    }

    public /* synthetic */ b(boolean z14, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14);
    }

    @Override // kq0.b
    public final void a(com.garmin.android.apps.connectmobile.incidentdetection.service.a aVar, kq0.g gVar, kq0.h hVar) {
        aVar.getClass();
        gVar.getClass();
        if (this.f114314a) {
            StringBuilder sbK = androidx.core.view.j.k(aVar.f36879a, "Processing action ", aVar.f36880b, " [", " with state [");
            sbK.append(gVar);
            sbK.append("]]");
            String string = sbK.toString();
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.INCIDENT_DETECTION;
            aVar2.getClass();
            i2.a.a(a2Var, string);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llq0/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-incident-detection_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(boolean z14) {
        this.f114314a = z14;
    }

    public b() {
        this(false, 1, null);
    }
}
