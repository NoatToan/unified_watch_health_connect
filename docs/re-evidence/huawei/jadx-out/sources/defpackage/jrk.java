package defpackage;

import android.graphics.Color;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.healthcloud.plugintrack.ui.fragment.TrackScreenFrag;
import com.huawei.healthcloud.plugintrack.ui.map.datapreprocess.MapDataPreprocessor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSleepType;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSportType;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwWorkoutServiceUtils;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jrk implements MapDataPreprocessor {
    private static final String i = "Track_LineDataPreprocessor";
    protected int f;
    protected List<Integer> g = new ArrayList();
    protected List<MotionData> h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final int f38935c = Color.rgb(107, FitnessSleepType.HW_FITNESS_NOON, HwWorkoutServiceUtils.HEART_RATE_TRUST_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final int f38933a = Color.rgb(49, FitnessSportType.HW_FITNESS_SPORT_ALL, 251);
    protected static final int d = Color.parseColor("#FFFFA11C");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final int f38934b = Color.parseColor("#FF00BFC9");
    protected static final int e = Color.parseColor("#FFFF1745");

    public jrk(List<MotionData> list, MotionPathSimplify motionPathSimplify) {
        this.h = list;
        this.f = motionPathSimplify.requestSportType();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.map.datapreprocess.MapDataPreprocessor
    public List<jrp> preprocess() {
        ArrayList arrayList = new ArrayList();
        for (MotionData motionData : this.h) {
            if (motionData != null) {
                Map<Long, double[]> lbsDataMap = motionData.getLbsDataMap();
                e(lbsDataMap);
                jrp jrpVar = new jrp();
                jrpVar.c(motionData.getSportType());
                a(lbsDataMap, jrpVar);
                e(jrpVar);
                arrayList.add(jrpVar);
            }
        }
        LogUtil.a(i, "checkOutput ", arrayList.toString());
        return arrayList;
    }

    protected void e(Map<Long, double[]> map) {
        Iterator<Map.Entry<Long, double[]>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Long, double[]> next = it.next();
            if (next == null) {
                LogUtil.j(i, "entry is null");
            } else {
                double[] value = next.getValue();
                if (value == null || value.length < 2) {
                    LogUtil.j(i, "values is null or length < 2");
                } else if (!izt.a(new jpg(value[0], value[1]))) {
                    return;
                } else {
                    it.remove();
                }
            }
        }
    }

    protected void a(Map<Long, double[]> map, jrp jrpVar) {
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        char c2 = 0;
        boolean z = false;
        int i2 = 0;
        for (Map.Entry<Long, double[]> entry : map.entrySet()) {
            if (entry == null) {
                LogUtil.j(i, "entry is null");
                sb = sb2;
            } else {
                double[] value = entry.getValue();
                if (value == null || value.length < 2) {
                    sb = sb2;
                    LogUtil.j(i, "values is null or length < 2");
                } else if (izt.b(value[c2]) || izt.d(value[1])) {
                    sb = sb2;
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(Arrays.toString(value));
                } else {
                    StringBuilder sb3 = sb2;
                    jpg jpgVar = new jpg(value[c2], value[1]);
                    if (z) {
                        if (!izt.a(jpgVar)) {
                            arrayList2.add(jpgVar);
                            c(arrayList, arrayList2, 2, jrpVar.h());
                            arrayList2 = new ArrayList();
                            arrayList2.add(jpgVar);
                            z = false;
                        } else {
                            this.g.add(Integer.valueOf(i2));
                        }
                    } else if (izt.a(jpgVar) && arrayList2.size() != 0) {
                        jpg jpgVar2 = arrayList2.get(arrayList2.size() - 1);
                        c(arrayList, arrayList2, 1, jrpVar.h());
                        arrayList2 = new ArrayList();
                        arrayList2.add(new jpg(jpgVar2.d, jpgVar2.f38787a));
                        this.g.add(Integer.valueOf(i2));
                        z = true;
                    } else {
                        arrayList2.add(jpgVar);
                    }
                    i2++;
                    sb = sb3;
                }
            }
            sb2 = sb;
            c2 = 0;
        }
        StringBuilder sb4 = sb2;
        if (arrayList2.size() > 1) {
            c(arrayList, arrayList2, 1, jrpVar.h());
        }
        LogUtil.e(i, "invalidLbs: ", sb4.toString());
        jrpVar.a().addAll(arrayList);
    }

    private void c(List<jpf> list, List<jpg> list2, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(b(i3, i2)));
        list.add(new jpf(i2, arrayList, list2));
    }

    protected int b(int i2, int i3) {
        if (i3 == 2) {
            return BaseApplication.getContext().getResources().getColor(R.color.pause_line);
        }
        if (this.f == 512) {
            return e(i2);
        }
        if (i2 == 266) {
            return f38933a;
        }
        if (i2 == 222) {
            return TrackScreenFrag.f11136a;
        }
        return izw.y;
    }

    private int e(int i2) {
        if (i2 == 258) {
            return d;
        }
        if (i2 == 266) {
            return f38934b;
        }
        if (i2 == 259) {
            return e;
        }
        return f38935c;
    }

    protected void e(jrp jrpVar) {
        List<jpf> listA = jrpVar.a();
        for (jpf jpfVar : listA) {
            if (jpfVar.a() != 2) {
                List<jpg> listD = jpfVar.d();
                if (listD.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(listD.get(0));
                    jrpVar.a(arrayList);
                    break;
                }
            }
        }
        for (int size = listA.size() - 1; size >= 0; size--) {
            jpf jpfVar2 = listA.get(size);
            if (jpfVar2.a() != 2) {
                List<jpg> listD2 = jpfVar2.d();
                if (listD2.size() > 0) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(listD2.get(listD2.size() - 1));
                    jrpVar.c(arrayList2);
                    return;
                }
            }
        }
    }
}
