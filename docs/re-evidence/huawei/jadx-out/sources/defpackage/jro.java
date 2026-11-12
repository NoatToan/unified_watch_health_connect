package defpackage;

import android.graphics.Color;
import androidx.media3.exoplayer.DefaultLoadControl;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.healthcloud.plugintrack.ui.map.datapreprocess.MapDataPreprocessor;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSleepType;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwWorkoutServiceUtils;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class jro extends jrk implements MapDataPreprocessor {
    private static final String o = "Track_PaceMapLineDataPreprocessor";
    private List<Integer> k;
    private int m;
    private static final int i = Color.rgb(107, FitnessSleepType.HW_FITNESS_NOON, HwWorkoutServiceUtils.HEART_RATE_TRUST_VALUE);
    private static final int l = Color.parseColor("#FF00BFC9");
    private static final int j = Color.parseColor(Constants.CHOOSE_TEXT_COLOR);

    public jro(List<MotionData> list, MotionPathSimplify motionPathSimplify) {
        super(list, motionPathSimplify);
    }

    @Override // defpackage.jrk, com.huawei.healthcloud.plugintrack.ui.map.datapreprocess.MapDataPreprocessor
    public List<jrp> preprocess() {
        List<jrp> listPreprocess = super.preprocess();
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            jrp jrpVar = listPreprocess.get(i2);
            this.m = 0;
            for (jpf jpfVar : jrpVar.a()) {
                if (jpfVar.a() != 2) {
                    this.m += jpfVar.d().size();
                }
            }
            List<njj> paceList = this.h.get(i2).getPaceList();
            if (!njy.e(this.k)) {
                this.k = null;
            }
            a(jrpVar, i2);
            c(jrpVar, paceList);
        }
        LogUtil.a(o, "checkOutput ", listPreprocess.toString());
        return listPreprocess;
    }

    private void a(jrp jrpVar, int i2) {
        b(new ArrayList(this.h.get(i2).getLbsDataMap().values()), this.h.get(i2).getPaceList(), jrpVar);
    }

    private void b(List<double[]> list, List<njj> list2, jrp jrpVar) {
        int size = list2.size();
        Integer[] numArr = new Integer[size];
        Integer[] numArr2 = new Integer[size];
        int i2 = 0;
        for (njj njjVar : list2) {
            if (njjVar.c() % 1000 == 0) {
                if (njjVar.c() > 0) {
                    numArr[i2] = Integer.valueOf(njjVar.e() + 1);
                    numArr2[i2] = Integer.valueOf(njjVar.c() / 1000);
                } else {
                    numArr[i2] = Integer.valueOf(njjVar.e() + 1);
                    numArr2[i2] = Integer.valueOf(i2 + 1);
                }
                i2++;
            }
        }
        a(list, numArr, numArr2, i2, jrpVar);
    }

    private void a(List<double[]> list, Integer[] numArr, Integer[] numArr2, int i2, jrp jrpVar) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2 && i3 < numArr.length && i3 < numArr2.length; i3++) {
            if (numArr2[i3].intValue() != 0) {
                int iIntValue = numArr[i3].intValue();
                if (iIntValue > list.size()) {
                    break;
                }
                if (iIntValue == list.size() && list.size() > 0) {
                    iIntValue--;
                }
                jpg jpgVarB = b(list, iIntValue);
                if (jpgVarB == null) {
                    break;
                } else {
                    arrayList.add(jpgVarB);
                }
            }
        }
        jrpVar.b(arrayList);
    }

    private jpg b(List<double[]> list, int i2) {
        while (i2 >= 0) {
            double[] dArr = list.get(i2);
            if (dArr.length >= 2) {
                jpg jpgVar = new jpg(dArr[0], dArr[1]);
                if (!izt.a(jpgVar)) {
                    return jpgVar;
                }
            }
            i2--;
        }
        return null;
    }

    private void c(jrp jrpVar, List<njj> list) {
        int iH = jrpVar.h();
        List<jpf> listA = jrpVar.a();
        int i2 = 0;
        for (int i3 = 0; i3 < listA.size(); i3++) {
            jpf jpfVar = listA.get(i3);
            if (jpfVar.a() == 2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(BaseApplication.getContext().getResources().getColor(R.color.pause_line)));
                jpfVar.c(arrayList);
                jpfVar.c(2);
            } else {
                ArrayList arrayList2 = new ArrayList();
                if (iH == 233) {
                    arrayList2.add(Integer.valueOf(j));
                    jpfVar.c(arrayList2);
                    jpfVar.c(1);
                } else if (iH == 266) {
                    arrayList2.add(Integer.valueOf(l));
                    jpfVar.c(arrayList2);
                    jpfVar.c(1);
                } else if (njy.e(list) || b(list)) {
                    arrayList2.add(Integer.valueOf(i));
                    jpfVar.c(arrayList2);
                    jpfVar.c(1);
                } else if (list.size() == 1) {
                    arrayList2.add(Integer.valueOf(d(list, iH)));
                    jpfVar.c(arrayList2);
                    jpfVar.c(1);
                } else {
                    e(list, iH);
                    int size = jpfVar.d().size();
                    b(e(jrpVar, i3, i2), arrayList2, jpfVar);
                    i2 += size;
                }
            }
        }
    }

    private boolean b(List<njj> list) {
        boolean z = false;
        for (njj njjVar : list) {
            if (njjVar.c() <= 0 && njjVar.e() <= 0) {
                return true;
            }
            if (njjVar.e() != 0) {
                z = true;
            }
        }
        return !z;
    }

    private int d(List<njj> list, int i2) {
        Iterator<njj> it = list.iterator();
        float fD = 0.0f;
        while (it.hasNext()) {
            fD = it.next().d();
        }
        return izt.c(fD, i2);
    }

    private List<Integer> e(jrp jrpVar, int i2, int i3) {
        if (this.k == null) {
            LogUtil.j(o, "mTotalColorList is null");
            return new ArrayList();
        }
        List<jpg> listD = jrpVar.a().get(i2).d();
        List<jpg> listB = jrpVar.b();
        int size = listD.size();
        int i4 = size / DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (i4 > 1) {
            for (int i5 = 0; i5 < size; i5++) {
                if (i5 % i4 == 0 || i5 == size - 1 || (listB != null && listB.contains(listD.get(i5)))) {
                    arrayList.add(listD.get(i5));
                    b(i3, this.k, arrayList2, i5);
                }
            }
        } else {
            arrayList.addAll(listD);
            while (i3 < this.k.size() && arrayList2.size() != arrayList.size()) {
                if (njy.e(this.k, i3)) {
                    LogUtil.e(o, "mTotalColorList is out of bound");
                    break;
                }
                arrayList2.add(this.k.get(i3));
                i3++;
            }
        }
        int size2 = arrayList.size();
        int size3 = arrayList2.size();
        if (size2 > 1 && size3 < size2) {
            int iIntValue = size3 == 0 ? i : arrayList2.get(size3 - 1).intValue();
            for (int i6 = 0; i6 < arrayList.size() - size3; i6++) {
                arrayList2.add(Integer.valueOf(iIntValue));
            }
        }
        jrpVar.a().get(i2).a(arrayList);
        return arrayList2;
    }

    private void e(List<njj> list, int i2) {
        int iIntValue;
        if (njy.e(this.k)) {
            float[] fArr = new float[list.size()];
            Integer[] numArr = new Integer[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                njj njjVar = list.get(i3);
                fArr[i3] = njjVar.e();
                numArr[i3] = Integer.valueOf(izt.c(njjVar.d(), i2));
            }
            d(fArr);
            List<Integer> listA = izt.a(fArr, numArr);
            this.k = listA;
            if (listA == null) {
                LogUtil.j(o, "colorList is null");
                return;
            }
            LogUtil.a(o, "colorList ", Integer.valueOf(listA.size()), " pointSize ", Integer.valueOf(this.m));
            int size = this.k.size();
            if (size < this.m) {
                if (size == 0) {
                    iIntValue = i;
                } else {
                    iIntValue = this.k.get(size - 1).intValue();
                }
                for (int i4 = 0; i4 < this.m - size; i4++) {
                    this.k.add(Integer.valueOf(iIntValue));
                }
            }
        }
    }

    private void d(float[] fArr) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < fArr.length; i4++) {
            int i5 = (int) fArr[i4];
            while (i2 < this.g.size() && this.g.get(i2).intValue() <= i5) {
                i3++;
                i2++;
            }
            float f = fArr[i4];
            float f2 = i3;
            if (f > f2) {
                fArr[i4] = f - f2;
            }
        }
    }

    private void b(int i2, List<Integer> list, List<Integer> list2, int i3) {
        int i4 = i3 + i2;
        if (i4 < list.size()) {
            list2.add(list.get(i4));
        }
    }

    private void b(List<Integer> list, List<Integer> list2, jpf jpfVar) {
        if (njy.e(list)) {
            list2.add(Integer.valueOf(i));
            jpfVar.c(list2);
            jpfVar.c(1);
        } else if (list.size() == 1) {
            list2.add(list.get(0));
            jpfVar.c(list2);
            jpfVar.c(1);
        } else {
            jpfVar.c(list);
            jpfVar.c(0);
        }
    }
}
