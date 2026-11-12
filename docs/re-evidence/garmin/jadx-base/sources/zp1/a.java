package zp1;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import ps.r1;
import w13.c;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 zp1.a[], still in use, count: 1, list:
  (r0v1 zp1.a[]) from 0x0053: CONSTRUCTOR (r0v1 zp1.a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lzp1/a;", "", "", TtmlNode.ATTR_ID, "labelStringResId", "colorResId", "<init>", "(Ljava/lang/String;IIII)V", "a", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {
    EASY(1, R.string.lbl_easy, R.color.gds_data_viz_blue_secondary),
    /* JADX INFO: Fake field, exist only in values array */
    MODERATE(2, R.string.lbl_moderate, R.color.gds_data_viz_green_primary),
    /* JADX INFO: Fake field, exist only in values array */
    COMF_HARD(3, R.string.lbl_comf_hard, R.color.gds_data_viz_yellow_primary),
    /* JADX INFO: Fake field, exist only in values array */
    HARD(4, R.string.lbl_hard, R.color.gds_data_viz_orange_primary),
    MAXIMUM(5, R.string.lbl_maximum, R.color.gds_data_viz_red_primary);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C3847a f206590d = new C3847a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ c f206594h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f206595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f206596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f206597c;

    static {
        f206594h = new c(new a[]{r0, r1, r2, r3, r4});
    }

    private a(int i14, int i15, int i16) {
        super(str, i);
        this.f206595a = i14;
        this.f206596b = i15;
        this.f206597c = i16;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f206593g.clone();
    }

    /* JADX INFO: renamed from: zp1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzp1/a$a;", "", "<init>", "()V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3847a {

        /* JADX INFO: renamed from: zp1.a$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3848a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                return r13.a.b(((r1) t7).getZoneNumber(), ((r1) t14).getZoneNumber());
            }
        }

        /* JADX INFO: renamed from: zp1.a$a$b */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t14) {
                return r13.a.b(((r1) t7).getZoneNumber(), ((r1) t14).getZoneNumber());
            }
        }

        public /* synthetic */ C3847a(j jVar) {
            this();
        }

        public static a a(Integer num) {
            Object next;
            c cVar = a.f206594h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                int i14 = ((a) next).f206595a;
                if (num != null && i14 == num.intValue()) {
                    return (a) next;
                }
            }
            next = null;
            return (a) next;
        }

        public static a b(List list, double d14) {
            Double zoneLowBoundary;
            Double zoneLowBoundary2;
            list.getClass();
            List listN0 = h0.N0(list, new C3848a());
            int i14 = 1;
            r1 r1Var = (r1) h0.e0(1, listN0);
            if (d14 < ((r1Var == null || (zoneLowBoundary2 = r1Var.getZoneLowBoundary()) == null) ? Double.MAX_VALUE : zoneLowBoundary2.doubleValue())) {
                return a.EASY;
            }
            r1 r1Var2 = (r1) h0.n0(listN0);
            if (d14 >= ((r1Var2 == null || (zoneLowBoundary = r1Var2.getZoneLowBoundary()) == null) ? Double.MAX_VALUE : zoneLowBoundary.doubleValue())) {
                return a.MAXIMUM;
            }
            int size = listN0.size() - 1;
            while (i14 < size) {
                int i15 = i14 + 1;
                Double zoneLowBoundary3 = ((r1) listN0.get(i15)).getZoneLowBoundary();
                if (d14 < (zoneLowBoundary3 != null ? zoneLowBoundary3.doubleValue() : Double.MAX_VALUE)) {
                    a aVarA = a(((r1) listN0.get(i14)).getZoneNumber());
                    return aVarA == null ? a.EASY : aVarA;
                }
                i14 = i15;
            }
            return a.MAXIMUM;
        }

        public static a c(List list, double d14) {
            Double zoneLowBoundaryWithPrecision;
            Double zoneLowBoundaryWithPrecision2;
            list.getClass();
            List listN0 = h0.N0(list, new b());
            int i14 = 1;
            r1 r1Var = (r1) h0.e0(1, listN0);
            if (d14 < ((r1Var == null || (zoneLowBoundaryWithPrecision2 = r1Var.getZoneLowBoundaryWithPrecision()) == null) ? Double.MAX_VALUE : zoneLowBoundaryWithPrecision2.doubleValue())) {
                return a.EASY;
            }
            r1 r1Var2 = (r1) h0.n0(listN0);
            if (d14 >= ((r1Var2 == null || (zoneLowBoundaryWithPrecision = r1Var2.getZoneLowBoundaryWithPrecision()) == null) ? Double.MAX_VALUE : zoneLowBoundaryWithPrecision.doubleValue())) {
                return a.MAXIMUM;
            }
            int size = listN0.size() - 1;
            while (i14 < size) {
                int i15 = i14 + 1;
                Double zoneLowBoundaryWithPrecision3 = ((r1) listN0.get(i15)).getZoneLowBoundaryWithPrecision();
                if (d14 < (zoneLowBoundaryWithPrecision3 != null ? zoneLowBoundaryWithPrecision3.doubleValue() : Double.MAX_VALUE)) {
                    a aVarA = a(((r1) listN0.get(i14)).getZoneNumber());
                    return aVarA == null ? a.EASY : aVarA;
                }
                i14 = i15;
            }
            return a.MAXIMUM;
        }

        private C3847a() {
        }
    }
}
