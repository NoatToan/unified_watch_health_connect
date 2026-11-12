package vz0;

import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.y;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 vz0.b[], still in use, count: 1, list:
  (r0v1 vz0.b[]) from 0x003e: CONSTRUCTOR (r0v1 vz0.b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lvz0/b;", "", "", "requestId", "<init>", "(Ljava/lang/String;II)V", "a", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {
    GROUP_JOIN_REQUEST(2),
    GROUP_INVITE(3),
    DEVICE_INVITE(7),
    FOLLOW_REQUEST(8),
    AUTHORIZED_VIEWER_INVITE(-1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f180871b = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ w13.c f180878i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f180879a;

    static {
        f180878i = new w13.c(new b[]{r0, r1, r2, r3, r4});
    }

    private b(int i14) {
        super(str, i);
        this.f180879a = i14;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f180877h.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvz0/b$a;", "", "<init>", "()V", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static ArrayList a() {
            w13.c cVar = b.f180878i;
            ArrayList arrayListK = n23.j.k(cVar);
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                Object next = bVar.next();
                if (((b) next).f180879a > 0) {
                    arrayListK.add(next);
                }
            }
            ArrayList arrayList = new ArrayList(y.r(arrayListK, 10));
            Iterator it = arrayListK.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((b) it.next()).f180879a));
            }
            return arrayList;
        }

        public static b b(Integer num) {
            Object next;
            w13.c cVar = b.f180878i;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                int i14 = ((b) next).f180879a;
                if (num != null && i14 == num.intValue()) {
                    return (b) next;
                }
            }
            next = null;
            return (b) next;
        }

        private a() {
        }
    }
}
