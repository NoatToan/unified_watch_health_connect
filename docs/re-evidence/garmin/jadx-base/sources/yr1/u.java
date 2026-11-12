package yr1;

import java.util.List;
import p005kotlin.Metadata;
import p13.w;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lyr1/u;", "", "", "Lyr1/o;", "dataTypes", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "a", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum u {
    DEFAULT_TIER_ONE(x.k(o.SPORT_BACKUPS, o.SETTINGS, o.SETTINGS_CHANGE_LOG, o.GOALS, o.PRIMARY_DEVICE_BACKUPS)),
    SOFTWARE_UPDATE_REQUIRED_TIER_ONE(w.c(o.SOFTWARE_UPDATE));


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f199129b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<o> f199133a;

    u(List list) {
        this.f199133a = list;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyr1/u$a;", "", "<init>", "()V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: yr1.u$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3723a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f199134a;

            static {
                int[] iArr = new int[yl2.b.values().length];
                try {
                    iArr[yl2.b.f197803v6.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[yl2.b.f197810w6.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[yl2.b.f197796u6.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f199134a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static u a(yl2.b bVar, boolean z14) {
            int i14 = bVar == null ? -1 : C3723a.f199134a[bVar.ordinal()];
            if ((i14 == 1 || i14 == 2 || i14 == 3) && z14) {
                return u.SOFTWARE_UPDATE_REQUIRED_TIER_ONE;
            }
            return u.DEFAULT_TIER_ONE;
        }

        private a() {
        }
    }
}
