package defpackage;

import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.CreativeType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class oxf {
    private static final List<Integer> g = Collections.unmodifiableList(Arrays.asList(14, 200, Integer.valueOf(a.D), Integer.valueOf(a.L)));
    private static final List<Integer> i = Collections.unmodifiableList(Collections.singletonList(11));
    private static final List<Integer> d = Collections.unmodifiableList(Collections.singletonList(13));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<Integer> f44956b = Collections.unmodifiableList(Arrays.asList(Integer.valueOf(a.K), Integer.valueOf(a.M)));
    private static final List<Integer> f = Collections.unmodifiableList(Collections.singletonList(12));
    private static final List<Integer> h = Collections.unmodifiableList(Arrays.asList(111, 112, Integer.valueOf(CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON), 114, 115));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<Integer> f44957c = Collections.unmodifiableList(Arrays.asList(20, 21));
    private static final List<Integer> j = Collections.unmodifiableList(Arrays.asList(18, 19, 218));
    private static final List<Integer> e = Collections.unmodifiableList(Arrays.asList(23, 24, 25));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<Integer> f44955a = Collections.unmodifiableList(Collections.singletonList(17));

    private static int c(int i2) {
        if (i2 == 3) {
            return 4;
        }
        return i2 == 4 ? 1 : 6;
    }

    private static int e(int i2) {
        if (i2 == 3) {
            return 4;
        }
        return i2 == 4 ? 1 : 0;
    }

    public static <T> List<nsj> d(T t) {
        if (!(t instanceof List)) {
            return new ArrayList(10);
        }
        return (List) t;
    }

    public static List<nsj> d(List<nsj> list, int i2) {
        ArrayList arrayList = new ArrayList(10);
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_OperationActivityRule", "getCurrentYearActivityList allActivitySimpleList is empty.");
            return arrayList;
        }
        for (nsj nsjVar : list) {
            if (nsjVar != null && oxi.d(i2, nsjVar.a(), nsjVar.c()) && !arrayList.contains(nsjVar)) {
                arrayList.add(nsjVar);
            }
        }
        return arrayList;
    }

    public static int d(int i2) {
        if (g.contains(Integer.valueOf(i2))) {
            return 1;
        }
        if (h.contains(Integer.valueOf(i2))) {
            return 5;
        }
        if (i.contains(Integer.valueOf(i2))) {
            return 2;
        }
        if (d.contains(Integer.valueOf(i2))) {
            return 3;
        }
        return f44956b.contains(Integer.valueOf(i2)) ? 4 : 0;
    }

    public static int e(List<nsj> list) {
        int i2 = 0;
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_OperationActivityRule", "generateActivityReport currentYearActivityList is empty");
            return 0;
        }
        for (nsj nsjVar : list) {
            if (nsjVar == null) {
                LogUtil.j("PLGACHIEVE_OperationActivityRule", "generateActivityReport activitySimple is null");
            } else if (nsjVar.b() >= 1) {
                i2++;
            }
        }
        return i2;
    }

    public static int d(List<nsj> list) {
        int iD;
        if (njy.e(list) || list.size() < 5) {
            LogUtil.j("PLGACHIEVE_OperationActivityRule", "generateActivityReport currentYearActivityList is empty");
            return 0;
        }
        int[] iArr = new int[6];
        for (nsj nsjVar : list) {
            if (nsjVar == null) {
                LogUtil.j("PLGACHIEVE_OperationActivityRule", "generateActivityReport activitySimple is null");
            } else {
                int iD2 = nsjVar.d();
                if (iD2 == 12) {
                    iD = e(nsjVar.e());
                } else {
                    iD = d(iD2);
                }
                iArr[iD] = iArr[iD] + 1;
            }
        }
        return a(iArr);
    }

    private static int a(int[] iArr) {
        if (iArr == null || iArr.length < 6) {
            LogUtil.j("PLGACHIEVE_OperationActivityRule", "calculateFavoriteReportActivityType activityTypeNumbers is null or length invalid.");
            return 0;
        }
        int i2 = iArr[1];
        int asInt = Arrays.stream(iArr).max().getAsInt();
        if (asInt == iArr[2]) {
            return 2;
        }
        if (asInt == iArr[5]) {
            return 5;
        }
        if (asInt == iArr[1]) {
            return 1;
        }
        if (asInt == iArr[3]) {
            return 3;
        }
        return asInt == iArr[4] ? 4 : 0;
    }

    public static int b(List<nsj> list) {
        int iB;
        if (njy.e(list) || list.size() < 5) {
            LogUtil.j("PLGACHIEVE_OperationActivityRule", "generateActivityReport currentYearActivityList is empty");
            return 0;
        }
        int[] iArr = new int[11];
        for (nsj nsjVar : list) {
            if (nsjVar == null) {
                LogUtil.j("PLGACHIEVE_OperationActivityRule", "generateActivityReport activitySimple is null");
            } else {
                int iD = nsjVar.d();
                LogUtil.a("PLGACHIEVE_OperationActivityRule", "getNewFavoriteActivityType activityType ", Integer.valueOf(iD));
                if (iD == 12) {
                    iB = c(nsjVar.e());
                } else {
                    iB = b(iD);
                }
                iArr[iB] = iArr[iB] + 1;
            }
        }
        LogUtil.a("PLGACHIEVE_OperationActivityRule", "getNewFavoriteActivityType activityTypeNumbers ", Arrays.toString(iArr));
        return d(iArr);
    }

    public static int b(int i2) {
        if (g.contains(Integer.valueOf(i2))) {
            return 1;
        }
        if (i.contains(Integer.valueOf(i2))) {
            return 2;
        }
        if (d.contains(Integer.valueOf(i2))) {
            return 3;
        }
        if (f44956b.contains(Integer.valueOf(i2))) {
            return 4;
        }
        if (h.contains(Integer.valueOf(i2))) {
            return 5;
        }
        if (f.contains(Integer.valueOf(i2))) {
            return 6;
        }
        if (f44957c.contains(Integer.valueOf(i2))) {
            return 7;
        }
        if (j.contains(Integer.valueOf(i2))) {
            return 8;
        }
        if (e.contains(Integer.valueOf(i2))) {
            return 9;
        }
        return f44955a.contains(Integer.valueOf(i2)) ? 10 : 0;
    }

    private static int d(int[] iArr) {
        if (iArr == null || iArr.length < 6) {
            LogUtil.j("PLGACHIEVE_OperationActivityRule", "getNewFavoriteActivityType activityTypeNumbers is null or length invalid.");
            return 0;
        }
        int i2 = iArr[1];
        int asInt = Arrays.stream(iArr).max().getAsInt();
        for (int i3 = 1; i3 < iArr.length; i3++) {
            if (asInt == iArr[i3]) {
                LogUtil.a("PLGACHIEVE_OperationActivityRule", "getNewFavoriteActivityType type ", Integer.valueOf(i3), " max ", Integer.valueOf(asInt));
                return i3;
            }
        }
        return 0;
    }
}
