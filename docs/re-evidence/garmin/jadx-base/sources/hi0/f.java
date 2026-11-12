package hi0;

import lc.u0;
import li0.b0;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83827a;

        static {
            int[] iArr = new int[e.b.values().length];
            try {
                iArr[e.b.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.b.FOLLOWED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.b.FOLLOWING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.b.MUTUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f83827a = iArr;
        }
    }

    public static final b0 a(e eVar) {
        Boolean blocking = eVar.getBlocking();
        Boolean bool = Boolean.TRUE;
        if (s.g(blocking, bool)) {
            return b0.UNBLOCK;
        }
        if (s.g(eVar.getBlocked(), bool)) {
            return b0.IDLE;
        }
        e.b relationshipStatus = eVar.getRelationshipStatus();
        int i14 = relationshipStatus == null ? -1 : a.f83827a[relationshipStatus.ordinal()];
        if (i14 == -1 || i14 == 1) {
            return (eVar.getSentRequest() == null || eVar.getSentRequest().getRequestStatus() != c.b.CREATED) ? b0.FOLLOW : b0.REQUEST_SENT;
        }
        if (i14 == 2) {
            return (eVar.getSentRequest() == null || eVar.getSentRequest().getRequestStatus() != c.b.CREATED) ? b0.FOLLOW_BACK : b0.REQUEST_SENT;
        }
        if (i14 != 3 && i14 != 4) {
            u0.r();
            return null;
        }
        if (s.g(eVar.getMuting(), bool)) {
            return b0.MUTED;
        }
        return s.g(eVar.getFavorite(), bool) ? b0.FAVORITE : b0.FOLLOWING;
    }
}
