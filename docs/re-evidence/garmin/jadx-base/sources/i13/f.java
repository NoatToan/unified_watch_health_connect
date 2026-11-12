package i13;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public enum f {
    COMPLETE;

    public static final class a implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s03.b f87109a;

        public a(s03.b bVar) {
            this.f87109a = bVar;
        }

        public final String toString() {
            return "NotificationLite.Disposable[" + this.f87109a + "]";
        }
    }

    public static final class b implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f87110a;

        public b(Throwable th3) {
            this.f87110a = th3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            Object obj2 = ((b) obj).f87110a;
            int i14 = w03.b.f181178a;
            Throwable th3 = this.f87110a;
            if (th3 != obj2) {
                return th3 != null && th3.equals(obj2);
            }
            return true;
        }

        public final int hashCode() {
            return this.f87110a.hashCode();
        }

        public final String toString() {
            return "NotificationLite.Error[" + this.f87110a + "]";
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
