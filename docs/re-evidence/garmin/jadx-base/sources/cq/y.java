package cq;

import am.x0;
import am.z0;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import ps.x1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcq/y;", "", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f55115a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcq/y$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: cq.y$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1198a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f55116a;

            static {
                int[] iArr = new int[qs.x.values().length];
                try {
                    iArr[qs.x.CLIMB_PRO_CYCLING_CLIMB.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[qs.x.CLIMB_PRO_CYCLING_CLIMB_SECTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f55116a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static List a(List list) {
            ArrayList arrayList;
            qs.x xVarA2;
            int i14;
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    x1 x1Var = (x1) obj;
                    y.f55115a.getClass();
                    if (x1Var != null && (xVarA2 = x1Var.a2()) != null && ((i14 = C1198a.f55116a[xVarA2.ordinal()]) == 1 || i14 == 2)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            return arrayList == null ? j0.f134944a : arrayList;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static int b(String str) {
            String str2;
            if (str != null) {
                switch (str.hashCode()) {
                    case -2093145769:
                        if (str.equals("STEEPEST")) {
                            return R.color.red_70_static;
                        }
                        break;
                    case -2020130662:
                        str2 = "DESCENT";
                        str.equals(str2);
                        return R.color.lime_20_static;
                    case -1175899492:
                        if (str.equals("STEEPER")) {
                            return R.color.red_30_static;
                        }
                        break;
                    case 75572:
                        str2 = "LOW";
                        str.equals(str2);
                        return R.color.lime_20_static;
                    case 79223215:
                        if (str.equals("STEEP")) {
                            return R.color.orange_30_static;
                        }
                        break;
                    case 163769603:
                        if (str.equals("MODERATE")) {
                            return R.color.yellow_50_static;
                        }
                        break;
                }
            }
            return R.color.lime_20_static;
        }

        public static boolean c(x0 x0Var) {
            x0Var.getClass();
            String str = x0Var.f4358a;
            z0 z0Var = z0.f4390a;
            return z0.b(x0.f4312o, str);
        }

        private a() {
        }
    }
}
