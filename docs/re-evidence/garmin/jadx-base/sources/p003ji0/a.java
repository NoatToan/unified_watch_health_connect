package p003ji0;

import d4.k;
import d4.n;
import p005kotlin.Metadata;
import p3.a2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lji0/a;", "", "<init>", "()V", "a", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f98765a = new a2(0);

    /* JADX INFO: renamed from: ji0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lji0/a$a;", "Ld4/k;", "Lji0/a;", "", "<init>", "()V", "gcm-follow_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1901a implements k<a, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1901a f98766a = new C1901a();

        private C1901a() {
        }

        @Override // d4.k
        public final a a(Object obj) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            a aVar = new a();
            aVar.f98765a.t(iIntValue);
            return aVar;
        }

        @Override // d4.k
        public final Object b(n nVar, a aVar) {
            a aVar2 = aVar;
            nVar.getClass();
            aVar2.getClass();
            return Integer.valueOf(aVar2.f98765a.getIntValue());
        }
    }
}
