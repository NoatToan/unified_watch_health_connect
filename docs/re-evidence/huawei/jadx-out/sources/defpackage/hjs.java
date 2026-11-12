package defpackage;

import android.text.TextUtils;
import com.huawei.health.suggestion.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.FitWorkout;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class hjs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f36817a = new Object();
    private static final String e = "Suggestion_HistoryOrderHelper";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f36818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f36819c;
    private List<FitWorkout> d;
    private List<FitWorkout> f;
    private List<FitWorkout> j;

    static class c {
        public static final hjs d = new hjs();
    }

    private hjs() {
        this.f36819c = "";
        this.j = new ArrayList(10);
        this.d = new ArrayList(10);
        this.f = new ArrayList(10);
        if (TextUtils.isEmpty(this.f36819c)) {
            String strE = buh.e("trained_order");
            this.f36818b = strE;
            this.f36819c = strE;
            LogUtil.e(e, "origin order in sp : ", strE);
        }
    }

    public static hjs b() {
        return c.d;
    }

    private String j(List<FitWorkout> list) {
        if (njy.b(list)) {
            StringBuilder sb = new StringBuilder();
            for (FitWorkout fitWorkout : list) {
                if (fitWorkout != null) {
                    sb.append(fitWorkout.acquireId());
                    sb.append(",");
                }
            }
            return sb.substring(0, sb.length() - 1);
        }
        return "";
    }

    public hjs e(FitWorkout fitWorkout) {
        if (fitWorkout != null) {
            String str = e;
            LogUtil.a(str, "updateOrder: move name:", fitWorkout.acquireName(), " id: ", fitWorkout.acquireId());
            int iIndexOf = this.d.indexOf(fitWorkout);
            if (iIndexOf > 0) {
                LogUtil.a(str, "updateOrder: move:", fitWorkout.acquireName(), " to first");
                this.d.remove(fitWorkout);
                this.d.add(0, fitWorkout);
                this.f36819c = j(this.d);
            } else if (iIndexOf == -1) {
                LogUtil.a(str, "updateOrder: add new workout:", fitWorkout.acquireName(), " to first");
                this.d.add(0, fitWorkout);
                this.f36819c = j(this.d);
            }
            LogUtil.a(str, "updateOrder joined workout all size:", Integer.valueOf(this.d.size()));
        }
        return this;
    }

    public hjs e() {
        btt.d().c(new Runnable() { // from class: hjs.5
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a(hjs.e, "on destroy saveNewOrder-----", hjs.this.f36819c);
                if (hjs.this.d.isEmpty()) {
                    LogUtil.e(hjs.e, "mOrderWorkouts.isEmpty()");
                } else {
                    if (hjs.this.f36819c.equals(hjs.this.f36818b)) {
                        return;
                    }
                    LogUtil.a(hjs.e, "origin_order: ", hjs.this.f36818b, "new_order: ", hjs.this.f36819c);
                    hjs hjsVar = hjs.this;
                    hjsVar.f36818b = hjsVar.f36819c;
                    buh.d("trained_order", hjs.this.f36818b);
                }
            }
        });
        return this;
    }

    public List<FitWorkout> a(List<FitWorkout> list) {
        if (njy.e(list)) {
            LogUtil.e(e, "reorderList workouts is null");
            return list;
        }
        this.j = list;
        this.d = list;
        if (TextUtils.isEmpty(this.f36818b)) {
            LogUtil.e(e, "have no origin order, use the default order of the joined list");
            String strJ = j(list);
            this.f36818b = strJ;
            this.f36819c = strJ;
            buh.d("trained_order", strJ);
            return list;
        }
        return d(list, this.f36819c);
    }

    private List<FitWorkout> d(List<FitWorkout> list, String str) {
        final List<String> listAsList = Arrays.asList(str.split(","));
        boolean zA = a(listAsList, list);
        LogUtil.a(e, "isSort:", Boolean.valueOf(zA), "reorderList: ", str, "-originOrder.size()", Integer.valueOf(listAsList.size()), "-workouts.size():", Integer.valueOf(list.size()));
        if (zA) {
            Collections.sort(list, new Comparator<FitWorkout>() { // from class: hjs.1
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(FitWorkout fitWorkout, FitWorkout fitWorkout2) {
                    return hjs.this.e(listAsList, fitWorkout) - hjs.this.e(listAsList, fitWorkout2);
                }
            });
            this.f36819c = str;
        } else {
            ArrayList<FitWorkout> arrayList = new ArrayList(10);
            for (FitWorkout fitWorkout : list) {
                if (fitWorkout != null && listAsList.contains(fitWorkout.acquireId())) {
                    arrayList.add(fitWorkout);
                }
            }
            Collections.sort(arrayList, new Comparator<FitWorkout>() { // from class: hjs.3
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public int compare(FitWorkout fitWorkout2, FitWorkout fitWorkout3) {
                    return hjs.this.e(listAsList, fitWorkout2) - hjs.this.e(listAsList, fitWorkout3);
                }
            });
            for (FitWorkout fitWorkout2 : arrayList) {
                if (fitWorkout2 != null) {
                    list.remove(fitWorkout2);
                }
            }
            list.addAll(0, arrayList);
            this.f36819c = j(list);
        }
        this.d = list;
        LogUtil.a(e, "joined workout all size:", Integer.valueOf(list.size()));
        return this.d;
    }

    private boolean a(List<String> list, List<FitWorkout> list2) {
        return (list == null || list2 == null || list.size() != list2.size()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e(List<String> list, FitWorkout fitWorkout) {
        if (list.indexOf(fitWorkout.acquireId()) == -1) {
            LogUtil.j(e, "reorderList data from net diff between db have add new workout:", fitWorkout.acquireName(), " id: ", fitWorkout.acquireId());
        }
        return list.indexOf(fitWorkout.acquireId()) + 1;
    }

    public void d(List<FitWorkout> list) {
        this.d.removeAll(list);
        this.j.removeAll(list);
        String strJ = j(this.d);
        this.f36819c = strJ;
        String str = e;
        LogUtil.a(str, "removeWorkout-->>mNewOrder:", strJ);
        LogUtil.a(str, "joined workout all size:", Integer.valueOf(this.d.size()));
    }

    public hjs c(List<FitWorkout> list) {
        synchronized (f36817a) {
            LogUtil.a(e, "add fitworkout list from data to mTempListOne");
            if (njy.e(list)) {
                return this;
            }
            for (FitWorkout fitWorkout : list) {
                if (fitWorkout != null) {
                    if (!this.f.contains(fitWorkout)) {
                        this.f.add(fitWorkout);
                    } else {
                        LogUtil.a(e, "mTempListOne have already contains fitworkout:", fitWorkout.acquireName());
                    }
                }
            }
            return this;
        }
    }

    public ArrayList<FitWorkout> e(List<FitWorkout> list) {
        synchronized (f36817a) {
            ArrayList<FitWorkout> arrayList = new ArrayList<>(10);
            if (njy.e(list)) {
                LogUtil.e(e, "getFitworkList list is null");
                return arrayList;
            }
            LogUtil.a(e, "origin size: ", Integer.valueOf(list.size()));
            for (FitWorkout fitWorkout : list) {
                if (fitWorkout != null) {
                    int iIndexOf = this.f.indexOf(fitWorkout);
                    if (iIndexOf != -1) {
                        arrayList.add(this.f.get(iIndexOf));
                    } else {
                        LogUtil.e(e, "----mTempListOne have no: ", fitWorkout.acquireName());
                    }
                }
            }
            LogUtil.a(e, "----return size: ", Integer.valueOf(arrayList.size()));
            return arrayList;
        }
    }

    public static String a(long j) {
        return gzx.c(btx.c(), R.string.IDS_hwh_motiontrack_sport_data_share_date, UnitUtil.d("yyyy/MM/dd", j), btx.c().getString(R.string.sug_plan_create));
    }

    public void b(List<FitWorkout> list) {
        if (njy.e(list)) {
            LogUtil.e(e, "sortCustomCourseByPublishDate list is null");
        } else {
            Collections.sort(list, new Comparator<FitWorkout>() { // from class: hjs.2
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public int compare(FitWorkout fitWorkout, FitWorkout fitWorkout2) {
                    if (fitWorkout == null || fitWorkout2 == null) {
                        return fitWorkout == null ? -1 : 1;
                    }
                    long publishDate = fitWorkout.getPublishDate();
                    if (publishDate < 0) {
                        publishDate += 1000;
                    }
                    long publishDate2 = fitWorkout2.getPublishDate();
                    if (publishDate2 < 0) {
                        publishDate2 += 1000;
                    }
                    return publishDate - publishDate2 > 0 ? -1 : 1;
                }
            });
        }
    }
}
