package defpackage;

import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsportmodel.CommonSegment;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes10.dex */
public class jrq extends jrk {
    private static final String j = "Track_SegmentLineDataPreprocessor";

    public jrq(List<MotionData> list, MotionPathSimplify motionPathSimplify) {
        super(list, motionPathSimplify);
    }

    @Override // defpackage.jrk, com.huawei.healthcloud.plugintrack.ui.map.datapreprocess.MapDataPreprocessor
    public List<jrp> preprocess() {
        List<jrp> listPreprocess = super.preprocess();
        for (int i = 0; i < listPreprocess.size(); i++) {
            if (this.h.size() > i) {
                List<CommonSegment> listRequestSegmentList = this.h.get(i).requestSegmentList();
                if (njy.b((Object) listRequestSegmentList, nts.class)) {
                    d(listPreprocess, listRequestSegmentList, i);
                } else {
                    LogUtil.j(j, "Unexpected segment type");
                }
            }
        }
        LogUtil.a(j, "checkOutput ", listPreprocess.toString());
        return listPreprocess;
    }

    private void d(List<jrp> list, List<CommonSegment> list2, int i) {
        LinkedList linkedList = new LinkedList();
        for (CommonSegment commonSegment : list2) {
            if (commonSegment instanceof nts) {
                nts ntsVar = (nts) commonSegment;
                b(ntsVar);
                linkedList.offer(ntsVar);
            }
        }
        a(list, linkedList, i);
    }

    private void b(nts ntsVar) {
        if (c(ntsVar)) {
            ntsVar.d(0L);
            ntsVar.e(0L);
        }
        if (a(ntsVar)) {
            ntsVar.e(ntsVar.r() - 1);
        }
    }

    private boolean c(nts ntsVar) {
        return ntsVar.i() >= ntsVar.f() || ntsVar.i() >= ntsVar.r() - 1;
    }

    private boolean a(nts ntsVar) {
        return ntsVar.f() != 0 && ntsVar.f() >= ntsVar.r();
    }

    private void a(List<jrp> list, Queue<nts> queue, int i) {
        int i2;
        int i3;
        int color;
        nts ntsVarD = d(queue);
        ArrayList arrayList = new ArrayList(this.h.get(i).getLbsDataMap().values());
        List<jpf> listA = list.get(i).a();
        ArrayList arrayList2 = new ArrayList();
        char c2 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < arrayList.size()) {
            if (ntsVarD != null && i4 == ntsVarD.r()) {
                e(arrayList, i4, list.get(i));
            }
            double[] dArr = arrayList.get(i4);
            if (dArr.length < 2) {
                i2 = i4;
            } else {
                i2 = i4;
                if (izt.d(dArr[c2], dArr[1]) && !njy.e(arrayList2)) {
                    c(listA, i5, arrayList2, 0);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(Integer.valueOf(BaseApplication.getContext().getResources().getColor(R.color.pause_line)));
                    c(listA, i5 + 1, arrayList3, 2);
                    arrayList2 = new ArrayList();
                    i5 += 2;
                } else {
                    if (izt.d(dArr[0], dArr[1])) {
                    }
                    i4 = i3 + 1;
                    c2 = 0;
                }
                i3 = i2;
                if (ntsVarD != null && i3 > ntsVarD.h()) {
                    ntsVarD = d(queue);
                }
                if (d(ntsVarD, i3)) {
                    color = BaseApplication.getContext().getResources().getColor(R.color.ski_line);
                } else if (a(ntsVarD, i3)) {
                    color = BaseApplication.getContext().getResources().getColor(R.color.ski_cable_line);
                } else {
                    color = BaseApplication.getContext().getResources().getColor(R.color.ski_free_line);
                }
                d(color, arrayList2, i5, listA);
                i4 = i3 + 1;
                c2 = 0;
            }
            i3 = i2;
            i4 = i3 + 1;
            c2 = 0;
        }
        if (arrayList2.size() > 1) {
            c(listA, i5, arrayList2, 0);
        }
        d(list.get(i));
    }

    private nts d(Queue<nts> queue) {
        while (!queue.isEmpty()) {
            nts ntsVarPoll = queue.poll();
            if (ntsVarPoll != null && (e(ntsVarPoll) || d(ntsVarPoll))) {
                return ntsVarPoll;
            }
        }
        return null;
    }

    private boolean e(nts ntsVar) {
        return ntsVar.f() > ntsVar.i() && ntsVar.h() > ntsVar.r() && ntsVar.r() > ntsVar.f();
    }

    private boolean d(nts ntsVar) {
        return ntsVar.i() == ntsVar.f() && ntsVar.r() < ntsVar.h();
    }

    private boolean d(nts ntsVar, int i) {
        if (ntsVar == null || ntsVar.r() >= ntsVar.h()) {
            return false;
        }
        long j2 = i;
        return j2 >= ntsVar.r() && j2 <= ntsVar.h();
    }

    private boolean a(nts ntsVar, int i) {
        if (ntsVar == null || ntsVar.i() >= ntsVar.f()) {
            return false;
        }
        long j2 = i;
        return j2 >= ntsVar.i() && j2 <= ntsVar.f();
    }

    private void d(int i, List<Integer> list, int i2, List<jpf> list2) {
        if (i2 >= list2.size() || list.size() >= list2.get(i2).d().size()) {
            return;
        }
        list.add(Integer.valueOf(i));
    }

    private void c(List<jpf> list, int i, List<Integer> list2, int i2) {
        if (njy.e(list, i)) {
            LogUtil.j(j, "setTypeAndColors lineIndex out of bounds");
        } else {
            list.get(i).c(list2);
            list.get(i).c(i2);
        }
    }

    private void e(List<double[]> list, int i, jrp jrpVar) {
        while (i >= 0) {
            double[] dArr = list.get(i);
            if (dArr.length >= 2 && !izt.d(dArr[0], dArr[1])) {
                List<jpg> listB = jrpVar.b();
                listB.add(new jpg(dArr[0], dArr[1]));
                jrpVar.b(listB);
                return;
            }
            i--;
        }
    }

    private void d(jrp jrpVar) {
        List<jpf> listA = jrpVar.a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listA.size(); i++) {
            d(arrayList, listA.get(i).a(), listA.get(i).d(), listA.get(i).b());
        }
        jrpVar.e(arrayList);
    }

    private void d(List<jpf> list, int i, List<jpg> list2, List<Integer> list3) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                b(i, list3, list2, list);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        int iIntValue = list3.size() > 0 ? list3.get(0).intValue() : 0;
        for (int i2 = 0; i2 < list3.size(); i2++) {
            if (iIntValue == list3.get(i2).intValue() && i2 < list2.size()) {
                arrayList.add(list2.get(i2));
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Integer.valueOf(iIntValue));
                arrayList.add(list2.get(i2));
                b(1, arrayList2, arrayList, list);
                int iIntValue2 = list3.get(i2).intValue();
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(list2.get(i2));
                iIntValue = iIntValue2;
                arrayList = arrayList3;
            }
        }
        if (njy.e(arrayList)) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(Integer.valueOf(iIntValue));
        b(1, arrayList4, arrayList, list);
    }

    private void b(int i, List<Integer> list, List<jpg> list2, List<jpf> list3) {
        if (list2 == null || list2.size() <= 1) {
            LogUtil.j(j, "invalid new line");
        } else {
            list3.add(new jpf(i, list, list2));
        }
    }
}
