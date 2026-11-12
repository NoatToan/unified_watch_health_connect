package com.xiaomi.ai.domain.phonecall.provider;

import com.xiaomi.ai.nlp.contact.common.a;
import defpackage.mjh;
import defpackage.mre;
import defpackage.t08;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class NameMatcherTool {
    private final String MODEL_FILE = "name-matcher-lr.model";
    private mre lrModel;

    public NameMatcherTool() throws Exception {
        mre mreVar = new mre();
        this.lrModel = mreVar;
        mreVar.b(t08.a("name-matcher-lr.model"));
    }

    private List<mjh<a.C0349a, a.C0349a>> genSlideWindowPairs(a.C0349a c0349a, a.C0349a c0349a2) {
        ArrayList arrayList = new ArrayList();
        if (FeatureExtractor.pinyinResultOrder(c0349a, c0349a2) > 0) {
            c0349a2 = c0349a;
            c0349a = c0349a2;
        }
        int size = c0349a.e().size();
        int size2 = c0349a2.e().size();
        for (int i = 0; i < (size2 - size) + 1; i++) {
            arrayList.add(new mjh(new a.C0349a(c0349a.e()), new a.C0349a(c0349a2.e().subList(i, i + size))));
        }
        return arrayList;
    }

    public double predict(a.C0349a c0349a, a.C0349a c0349a2, Double d) {
        ArrayList arrayList = new ArrayList();
        int iMax = Math.max(c0349a.e().size(), c0349a2.e().size());
        double dMin = (((double) (iMax - Math.min(c0349a.e().size(), c0349a2.e().size()))) * 0.5d) / ((double) iMax);
        for (mjh<a.C0349a, a.C0349a> mjhVar : genSlideWindowPairs(c0349a, c0349a2)) {
            arrayList.add(Double.valueOf(Double.parseDouble(String.format("%.3f", Double.valueOf(d.doubleValue() * (this.lrModel.a(FeatureExtractor.getInstance().genFeatures(mjhVar.b(), mjhVar.c())) - dMin))))));
        }
        return ((Double) Collections.max(arrayList)).doubleValue();
    }
}
