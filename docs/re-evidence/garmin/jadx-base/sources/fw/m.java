package fw;

import com.garmin.android.lib.networking.exceptions.NoNetworkException;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\fB1\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lfw/m;", "T", "", "", "requestId", "Lfw/p;", "status", "data", "Lfw/c;", "errorType", "<init>", "(Ljava/lang/Long;Lfw/p;Ljava/lang/Object;Lfw/c;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f73767e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f73768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f73769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f73770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f73771d;

    public m(Long l14, p pVar, T t7, c cVar) {
        pVar.getClass();
        this.f73768a = l14;
        this.f73769b = pVar;
        this.f73770c = t7;
        this.f73771d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return p005kotlin.jvm.internal.s.g(this.f73768a, mVar.f73768a) && this.f73769b == mVar.f73769b && p005kotlin.jvm.internal.s.g(this.f73770c, mVar.f73770c) && p005kotlin.jvm.internal.s.g(this.f73771d, mVar.f73771d);
    }

    public final int hashCode() {
        Long l14 = this.f73768a;
        int iHashCode = (this.f73769b.hashCode() + ((l14 == null ? 0 : l14.hashCode()) * 31)) * 31;
        T t7 = this.f73770c;
        int iHashCode2 = (iHashCode + (t7 == null ? 0 : t7.hashCode())) * 31;
        c cVar = this.f73771d;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "Resource(requestId=" + this.f73768a + ", status=" + this.f73769b + ", data=" + this.f73770c + ", errorType=" + this.f73771d + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfw/m$a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: fw.m$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1495a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f73772a;

            static {
                int[] iArr = new int[com.garmin.android.library.backgroundtaskmanagement.b.c.values().length];
                try {
                    iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.RECOVERABLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.SERVER_UNAVAILABLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.UNAUTHORIZED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.USER_NOT_AUTHENTICATED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.USER_NOT_AUTHORIZED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.DEVICE_TIMEOUT.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.CONTEXT_NULL.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                f73772a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static m a(Object obj, Throwable th3) {
            th3.getClass();
            return th3 instanceof NoNetworkException ? new m(null, p.ERROR, obj, new h()) : new m(null, p.ERROR, obj, new r());
        }

        public static m b(a aVar, c cVar, Object obj, int i14) {
            if ((i14 & 4) != 0) {
                obj = null;
            }
            aVar.getClass();
            return new m(null, p.ERROR, obj, cVar);
        }

        public static m c(a aVar, Long l14, com.garmin.android.library.backgroundtaskmanagement.b.c cVar, int i14) {
            c lVar;
            if ((i14 & 1) != 0) {
                l14 = null;
            }
            aVar.getClass();
            cVar.getClass();
            switch (C1495a.f73772a[cVar.ordinal()]) {
                case 1:
                    lVar = new l();
                    break;
                case 2:
                    lVar = new h();
                    break;
                case 3:
                    lVar = new g();
                    break;
                case 4:
                    lVar = new o();
                    break;
                case 5:
                    lVar = new q();
                    break;
                case 6:
                    lVar = new s();
                    break;
                case 7:
                    lVar = new t();
                    break;
                case 8:
                    lVar = new b();
                    break;
                case 9:
                    lVar = new r();
                    break;
                case 10:
                    lVar = new fw.a();
                    break;
                default:
                    lVar = new r();
                    break;
            }
            return new m(l14, p.ERROR, null, lVar);
        }

        public static /* synthetic */ m d(a aVar, Throwable th3) {
            aVar.getClass();
            return a(null, th3);
        }

        public static m f(a aVar, Long l14, List list, int i14) {
            Long l15 = (i14 & 1) != 0 ? null : l14;
            List list2 = (i14 & 2) != 0 ? null : list;
            aVar.getClass();
            return new m(l15, p.LOADING, list2, null, 8, null);
        }

        public static m g(a aVar, Object obj, int i14) {
            if ((i14 & 2) != 0) {
                obj = null;
            }
            aVar.getClass();
            return new m(null, p.SUCCESS, obj, null, 8, null);
        }

        public final m e(Exception exc, Integer num) {
            exc.getClass();
            if (num != null && num.intValue() == 401) {
                return b(this, new q(), null, 5);
            }
            if (num != null && num.intValue() == 403) {
                return b(this, new t(), null, 5);
            }
            if (num != null && num.intValue() == 404) {
                return b(this, new k(), null, 5);
            }
            if (num != null && num.intValue() == 503) {
                return b(this, new o(), null, 5);
            }
            return (num != null && num.intValue() == 504) ? b(this, new n(), null, 5) : a(null, exc);
        }

        private a() {
        }
    }

    public /* synthetic */ m(Long l14, p pVar, Object obj, c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, pVar, obj, (i14 & 8) != 0 ? null : cVar);
    }
}
