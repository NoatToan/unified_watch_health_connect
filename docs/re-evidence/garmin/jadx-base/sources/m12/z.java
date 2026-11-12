package m12;

import java.util.concurrent.ConcurrentHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lm12/z;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "Lj12/k;", "", "displayName", "<init>", "(Ljava/lang/String;)V", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z extends com.garmin.android.library.backgroundtaskmanagement.b<j12.k> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f115914l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public o53.s f115915m;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(String str) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, null);
        str.getClass();
        this.f115914l = str;
        b(new a0(this));
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b
    public final void g() {
        super.g();
        if (this.f115915m != null) {
            com.garmin.android.library.backgroundtaskmanagement.b.c cVar = this.f50094d.get();
            com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
            ConcurrentHashMap concurrentHashMap = this.f50097g;
            j12.k kVar = (j12.k) concurrentHashMap.get(eVar);
            if (kVar == null) {
                eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.CACHED;
                kVar = (j12.k) concurrentHashMap.get(eVar);
            }
            o53.s sVar = this.f115915m;
            if (sVar != null) {
                sVar.g0(new o13.u(cVar, eVar, kVar));
            } else {
                p005kotlin.jvm.internal.s.m("deferredResult");
                throw null;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lm12/z$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
