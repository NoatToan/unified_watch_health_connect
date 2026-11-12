package defpackage;

import com.github.mikephil.charting.components.XAxis;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class hfp extends XAxis {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20024a;

    public void a(float f) {
        setAxisMaximum(f);
    }

    @Override // defpackage.ft1
    public int getLabelCount() {
        int i;
        float axisMaximum = getAxisMaximum();
        float axisMinimum = getAxisMinimum();
        float f = axisMaximum - axisMinimum;
        int i2 = (int) f;
        this.f20024a = i2 / 3;
        if (f < 60.0f) {
            this.f20024a = i2;
            i = 2;
        } else {
            i = 4;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(axisMinimum));
        arrayList.add(Float.valueOf(this.f20024a + axisMinimum));
        arrayList.add(Float.valueOf(axisMinimum + (this.f20024a * 2)));
        arrayList.add(Float.valueOf(axisMaximum));
        this.mEntryCount = i;
        if (this.mEntries.length < i) {
            this.mEntries = new float[i];
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.mEntries[i3] = ((Float) arrayList.get(i3)).floatValue();
        }
        return i;
    }
}
