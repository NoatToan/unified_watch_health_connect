package androidx.work;

import androidx.annotation.RestrictTo;
import defpackage.lhe;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final AbstractC0082b.c f3186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final AbstractC0082b.C0083b f3187b;

    /* JADX INFO: renamed from: androidx.work.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0082b {

        /* JADX INFO: renamed from: androidx.work.b$b$a */
        public static final class a extends AbstractC0082b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f3188a;

            public a(Throwable th) {
                this.f3188a = th;
            }

            public String toString() {
                return "FAILURE (" + this.f3188a.getMessage() + ")";
            }
        }

        /* JADX INFO: renamed from: androidx.work.b$b$b, reason: collision with other inner class name */
        public static final class C0083b extends AbstractC0082b {
            public String toString() {
                return "IN_PROGRESS";
            }

            public C0083b() {
            }
        }

        /* JADX INFO: renamed from: androidx.work.b$b$c */
        public static final class c extends AbstractC0082b {
            public String toString() {
                return "SUCCESS";
            }

            public c() {
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public AbstractC0082b() {
        }
    }

    static {
        f3186a = new AbstractC0082b.c();
        f3187b = new AbstractC0082b.C0083b();
    }

    lhe<AbstractC0082b.c> getResult();
}
