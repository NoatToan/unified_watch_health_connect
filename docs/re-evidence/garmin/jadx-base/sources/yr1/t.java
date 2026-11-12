package yr1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lyr1/t;", "Lal2/e;", "Lkotlin/Function1;", "", "", "onSyncServerProcessingTimeout", "<init>", "(Le23/l;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t implements al2.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<String, Unit> f199128b;

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(e23.l<? super String, Unit> lVar) {
        lVar.getClass();
        this.f199128b = lVar;
    }

    @Override // al2.m
    public final void B(al2.n nVar) {
    }

    @Override // al2.e
    public final void s(al2.a aVar) {
    }

    @Override // al2.m
    public final void u(al2.l lVar) {
        lVar.getClass();
    }

    @Override // al2.e
    public final void y(al2.c cVar) {
        List<al2.j> list = cVar.f3779e;
        if (cVar.f3777c == al2.b.SUCCESS) {
            if (list == null || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((al2.j) it.next()).f3806c.getFailure() == ok2.e.B) {
                        i2.f36769a.getClass();
                        i2.a.a(a2.DEVICES, "SyncServerProcessingTimeoutListener Sync complete with failed files type DESTINATION_TIMEOUT: failedFiles=" + list);
                        this.f199128b.invoke(cVar.f3775a.getF92742f());
                        return;
                    }
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyr1/t$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
