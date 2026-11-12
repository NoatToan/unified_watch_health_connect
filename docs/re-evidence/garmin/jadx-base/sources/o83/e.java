package o83;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f130873a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f130874b = new b();

    public static class a implements Serializable {
        public final String toString() {
            return "Notification=>Completed";
        }
    }

    public static class b implements Serializable {
        public final String toString() {
            return "Notification=>NULL";
        }
    }

    public static final class c implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f130875a;

        public c(Throwable th3) {
            this.f130875a = th3;
        }

        public final String toString() {
            return "Notification=>Error:" + this.f130875a;
        }
    }

    private e() {
    }

    public static <T> boolean a(j83.f<? super T> fVar, Object obj) {
        if (obj == f130873a) {
            fVar.a();
            return true;
        }
        if (obj == f130874b) {
            fVar.c(null);
            return false;
        }
        if (obj.getClass() == c.class) {
            fVar.onError(((c) obj).f130875a);
            return true;
        }
        fVar.c(obj);
        return false;
    }
}
