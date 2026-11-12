package ly1;

import am.x0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import java.util.ArrayList;
import p005kotlin.jvm.internal.s;
import ps.o1;
import qs.x;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: ly1.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C2197a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f115387a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.D2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.f4352y2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.f4356z2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.I1.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x0.R0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f115387a = iArr;
        }
    }

    public static final o1 a(ActivityListItemDTO activityListItemDTO) {
        x xVar;
        ArrayList arrayList;
        x0 x0Var = activityListItemDTO.f29265g;
        int i14 = x0Var == null ? -1 : C2197a.f115387a[x0Var.ordinal()];
        Object obj = null;
        if (i14 == 1) {
            xVar = x.RUN_ACTIVE;
        } else if (i14 == 2 || i14 == 3) {
            xVar = x.CLIMB_ACTIVE;
        } else if (i14 != 4) {
            xVar = i14 != 5 ? null : x.DOWNHILL_RUN;
        } else {
            xVar = x.SURF_ACTIVE;
        }
        if (xVar == null || (arrayList = activityListItemDTO.E1) == null) {
            return null;
        }
        for (Object obj2 : arrayList) {
            if (s.g(((o1) obj2).getSplitType(), xVar.f147220a)) {
                obj = obj2;
                break;
            }
        }
        return (o1) obj;
    }
}
