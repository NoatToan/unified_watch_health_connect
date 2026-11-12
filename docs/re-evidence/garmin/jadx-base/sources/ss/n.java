package ss;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lss/n;", "", "<init>", "()V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f160608a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lss/n$a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static boolean a(Boolean bool, qs.d dVar) {
            e.f160596a.getClass();
            boolean zC = ((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).c("workout_benefit");
            kg1.a.f104701a.getClass();
            boolean zK = kg1.a.C2003a.a().K();
            if ((zC || zK) && bool != null) {
                return dVar != qs.d.GARMIN || bool.booleanValue();
            }
            return false;
        }

        public static boolean b(Boolean bool, qs.d dVar) {
            e.f160596a.getClass();
            boolean zC = ((c22.k) KoinJavaComponent.get$default(c22.k.class, null, null, 6, null)).c("workout_benefit");
            kg1.a.f104701a.getClass();
            return (zC || kg1.a.C2003a.a().K()) && bool != null && dVar == qs.d.GARMIN && bool.booleanValue();
        }

        private a() {
        }
    }
}
