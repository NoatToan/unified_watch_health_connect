package pc0;

import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lpc0/m0;", "Lpc0/i;", "Lf12/l;", "prefs", "<init>", "(Lf12/l;)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m0 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.l f137260a;

    static {
        new a(null);
    }

    public m0(f12.l lVar) {
        lVar.getClass();
        this.f137260a = lVar;
    }

    @Override // pc0.i
    public final Set<String> a() {
        return this.f137260a.L1("key_pair_supported_product_numbers");
    }

    @Override // pc0.i
    public final void b(Set<String> set) {
        set.getClass();
        this.f137260a.X1("key_pair_supported_product_numbers", set);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpc0/m0$a;", "", "<init>", "()V", "", "KEY_PAIR_SUPPORTED_PRODUCT_NB", "Ljava/lang/String;", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
