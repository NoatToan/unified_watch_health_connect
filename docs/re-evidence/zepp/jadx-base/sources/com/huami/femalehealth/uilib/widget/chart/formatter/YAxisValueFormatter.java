package com.huami.femalehealth.uilib.widget.chart.formatter;

import com.github.mikephil.charting.formatter.ValueFormatter;
import com.huami.femalehealth.logiclib.dto.Degree;
import com.huami.femalehealth.logiclib.dto.SymptomType;
import com.huami.femalehealth.uilib.R;
import com.huami.femalehealth.uilib.helper.ResourceHelper;

/* JADX INFO: loaded from: classes4.dex */
public class YAxisValueFormatter extends ValueFormatter {
    private static final String b = "YAxisValueFormatter";
    private SymptomType a;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Degree.values().length];
            a = iArr;
            try {
                iArr[Degree.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Degree.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Degree.HEAVY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Degree.UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public YAxisValueFormatter(SymptomType symptomType) {
        this.a = symptomType;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public String getFormattedValue(float f) {
        SymptomType symptomType = this.a;
        if (symptomType == SymptomType.MOOD) {
            int i = a.a[Degree.INSTANCE.covertByIntType(Integer.valueOf((int) f)).ordinal()];
            if (i == 1) {
                return ResourceHelper.INSTANCE.getString(R.string.fh_mood_degree_light);
            }
            if (i != 2) {
                return i != 3 ? "" : ResourceHelper.INSTANCE.getString(R.string.fh_mood_degree_heavy);
            }
            return ResourceHelper.INSTANCE.getString(R.string.fh_mood_degree_middle);
        }
        if (symptomType == SymptomType.BLOOD) {
            int i2 = a.a[Degree.INSTANCE.covertByIntType(Integer.valueOf((int) f)).ordinal()];
            if (i2 == 1) {
                return ResourceHelper.INSTANCE.getString(R.string.fh_blood_degree_light);
            }
            if (i2 != 2) {
                return i2 != 3 ? "" : ResourceHelper.INSTANCE.getString(R.string.fh_blood_degree_heavy);
            }
            return ResourceHelper.INSTANCE.getString(R.string.fh_blood_degree_middle);
        }
        if (symptomType != SymptomType.PAIN) {
            return "";
        }
        int i3 = a.a[Degree.INSTANCE.covertByIntType(Integer.valueOf((int) f)).ordinal()];
        if (i3 == 1) {
            return ResourceHelper.INSTANCE.getString(R.string.fh_pain_degree_light);
        }
        if (i3 != 2) {
            return i3 != 3 ? "" : ResourceHelper.INSTANCE.getString(R.string.fh_pain_degree_heavy);
        }
        return ResourceHelper.INSTANCE.getString(R.string.fh_pain_degree_middle);
    }
}
