package com.github.mikephil.chartingv2.data;

import com.github.mikephil.chartingv2.interfaces.datasets.IRadarDataSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class RadarData extends ChartData<IRadarDataSet> {
    public RadarData(List<String> list, IRadarDataSet iRadarDataSet) {
        super(list, toList(iRadarDataSet));
    }

    private static List<IRadarDataSet> toList(IRadarDataSet iRadarDataSet) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(iRadarDataSet);
        return arrayList;
    }

    public RadarData(List<String> list) {
        super(list);
    }

    public RadarData(String[] strArr) {
        super(strArr);
    }

    public RadarData(List<String> list, List<IRadarDataSet> list2) {
        super(list, list2);
    }

    public RadarData(String[] strArr, List<IRadarDataSet> list) {
        super(strArr, list);
    }

    public RadarData() {
    }

    public RadarData(String[] strArr, IRadarDataSet iRadarDataSet) {
        super(strArr, toList(iRadarDataSet));
    }
}
