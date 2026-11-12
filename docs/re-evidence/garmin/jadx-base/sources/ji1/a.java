package ji1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import j22.g;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lji1/a;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lmv0/e;", "locationProvider", "<init>", "(Landroid/content/Context;Lmv0/e;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f98810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mv0.e f98811b;

    static {
        new C1902a(null);
    }

    public a(Context context, mv0.e eVar) {
        context.getClass();
        eVar.getClass();
        this.f98810a = context;
        this.f98811b = eVar;
    }

    public final f a() {
        j22.b bVar = j22.b.f96736a;
        List listC = w.c(g.f96765j);
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listC) {
            j22.b.f96736a.getClass();
            if (!j22.b.p(this.f98810a, (g) obj)) {
                arrayList2.add(obj);
            }
        }
        arrayList.addAll(new ArrayList(arrayList2));
        j22.b.f96737b.debug("getDeniedPermissions: returning list of size " + arrayList.size());
        if (arrayList.isEmpty()) {
            return !this.f98811b.a("CheckPhoneLocationPermissionUseCase") ? f.c.f98826a : f.a.f98824a;
        }
        return f.b.f98825a;
    }

    /* JADX INFO: renamed from: ji1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lji1/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1902a {
        public /* synthetic */ C1902a(j jVar) {
            this();
        }

        private C1902a() {
        }
    }
}
