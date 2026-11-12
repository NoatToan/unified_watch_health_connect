package g2;

import g2.u.a;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lg2/u;", "Lg2/u$a;", "Interval", "", "<init>", "()V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class u<Interval extends a> {

    public interface a {

        /* JADX INFO: renamed from: g2.u$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C1517a implements e23.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1517a f75245a = new C1517a();

            @Override // e23.l
            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return null;
            }
        }

        default e23.l<Integer, Object> getKey() {
            return null;
        }

        default e23.l<Integer, Object> getType() {
            return C1517a.f75245a;
        }
    }

    public abstract p1 m();

    public final Object n(int i14) {
        Object objInvoke;
        j jVarB = m().b(i14);
        int i15 = i14 - jVarB.f75138a;
        e23.l<Integer, Object> key = ((a) jVarB.f75140c).getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i15))) == null) ? new h(i14) : objInvoke;
    }
}
