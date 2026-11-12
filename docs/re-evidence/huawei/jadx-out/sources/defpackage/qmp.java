package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import androidx.media3.common.C;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthXAxisRenderer;
import com.huawei.ui.commonui.linechart.common.UnixChartType;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public class qmp extends HwHealthXAxisRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UnixChartType f46491a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46492c;

    public qmp(Context context, HwHealthBaseBarLineChart hwHealthBaseBarLineChart, ViewPortHandler viewPortHandler, XAxis xAxis, Transformer transformer) {
        super(context, hwHealthBaseBarLineChart, viewPortHandler, xAxis, transformer);
        this.f46492c = C.RATE_UNSET_INT;
        this.f46491a = UnixChartType.WEEK;
    }

    public void d(UnixChartType unixChartType) {
        this.f46491a = unixChartType;
    }

    public void a(int i, int i2) {
        this.f46492c = i;
        this.mAxis.setAxisMinimum(this.f46492c);
        this.mAxis.setAxisMaximum(this.f46492c + i2);
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthXAxisRenderer, com.github.mikephil.charting.renderer.XAxisRenderer, com.github.mikephil.charting.renderer.AxisRenderer
    public void computeAxisValues(float f, float f2) {
        if (this.f46491a == UnixChartType.YEAR) {
            b(f, f2);
            computeSize();
            return;
        }
        if (this.f46491a == UnixChartType.DAY) {
            e(f, f2);
            computeSize();
            return;
        }
        if (this.f46491a == UnixChartType.ALL) {
            c(f, f2);
            computeSize();
            return;
        }
        double minutes = TimeUnit.DAYS.toMinutes(1L);
        double d = minutes / 2.0d;
        int rawOffset = (TimeZone.getDefault().getRawOffset() / 3600000) * 60;
        double dF = ((((double) (qnh.f((int) f) + rawOffset)) - d) * 1.0d) / minutes;
        double dF2 = ((((double) (qnh.f((int) f2) + rawOffset)) - d) * 1.0d) / minutes;
        int iCeil = (int) Math.ceil(dF);
        int iFloor = (((int) Math.floor(dF2)) - iCeil) + 1;
        if (this.f46491a == UnixChartType.WEEK) {
            this.mAxis.mEntryCount = iFloor;
            this.mAxis.mEntries = new float[this.mAxis.mEntryCount];
            for (int i = 0; i < this.mAxis.mEntryCount; i++) {
                this.mAxis.mEntries[i] = qnh.h((int) (((((double) (iCeil + i)) * minutes) - ((double) rawOffset)) + d));
            }
        } else if (this.f46491a == UnixChartType.MONTH) {
            a(minutes, d, rawOffset, iCeil, iFloor);
        }
        computeSize();
    }

    private void a(double d, double d2, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < i3; i4++) {
            Calendar calendar = Calendar.getInstance();
            int i5 = (int) (((((double) (i2 + i4)) * d) - ((double) i)) + d2);
            calendar.setTimeInMillis(((long) i5) * 60000);
            if (calendar.get(7) == qne.c()) {
                arrayList.add(Float.valueOf(qnh.h(i5)));
            }
        }
        this.mAxis.mEntryCount = arrayList.size();
        this.mAxis.mEntries = new float[this.mAxis.mEntryCount];
        for (int i6 = 0; i6 < this.mAxis.mEntryCount; i6++) {
            this.mAxis.mEntries[i6] = ((Float) arrayList.get(i6)).floatValue();
        }
    }

    private void e(float f, float f2) {
        Calendar calendar = Calendar.getInstance();
        long millis = TimeUnit.MINUTES.toMillis(qnh.f((int) f));
        calendar.setTimeInMillis(millis);
        if (calendar.get(11) == 23) {
            calendar.add(12, 5);
        }
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        int i = calendar.get(11);
        int iM = lsl.m(lsl.r(millis));
        if (i == 0 || i == iM) {
            this.mAxis.mDecimals = 0;
            this.mAxis.mEntryCount = 5;
            this.mAxis.mEntries = new float[this.mAxis.mEntryCount];
            calendar.set(11, 0);
            this.mAxis.mEntries[0] = qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(calendar.getTimeInMillis()));
            calendar.set(11, 6);
            this.mAxis.mEntries[1] = qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(calendar.getTimeInMillis()));
            calendar.set(11, 12);
            this.mAxis.mEntries[2] = qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(calendar.getTimeInMillis()));
            calendar.set(11, 18);
            this.mAxis.mEntries[3] = qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(calendar.getTimeInMillis()));
            calendar.set(11, 0);
            calendar.add(5, 1);
            this.mAxis.mEntries[4] = qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(calendar.getTimeInMillis()));
        }
    }

    private void b(float f, float f2) {
        int i = (int) f;
        Calendar.getInstance().setTimeInMillis(TimeUnit.MINUTES.toMillis(qnh.f(i)));
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(TimeUnit.MINUTES.toMillis(qnh.f((int) f2)));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(TimeUnit.MINUTES.toMillis(qnh.f(i)));
        calendar2.set(5, 15);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (calendar2.get(1) == calendar.get(1) && calendar2.get(2) == calendar.get(2)) {
                break;
            }
            arrayList.add(Float.valueOf(qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(calendar2.getTimeInMillis()))));
            calendar2.add(2, 1);
        }
        int minutes = (int) TimeUnit.MILLISECONDS.toMinutes(calendar2.getTimeInMillis());
        if (qnh.h(minutes) <= f2) {
            arrayList.add(Float.valueOf(qnh.h(minutes)));
        }
        this.mAxis.mEntryCount = arrayList.size();
        this.mAxis.mEntries = new float[this.mAxis.mEntryCount];
        for (int i2 = 0; i2 < this.mAxis.mEntryCount; i2++) {
            this.mAxis.mEntries[i2] = ((Float) arrayList.get(i2)).floatValue();
        }
    }

    private void c(float f, float f2) {
        int i = (int) f;
        Calendar.getInstance().setTimeInMillis(TimeUnit.MINUTES.toMillis(qnh.f(i)));
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(TimeUnit.MINUTES.toMillis(qnh.f((int) f2)));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(TimeUnit.MINUTES.toMillis(qnh.f(i)));
        calendar2.set(2, 5);
        calendar2.set(5, 30);
        ArrayList arrayList = new ArrayList();
        while (calendar2.get(1) <= calendar.get(1)) {
            arrayList.add(Float.valueOf(qnh.h((int) TimeUnit.MILLISECONDS.toMinutes(calendar2.getTimeInMillis()))));
            calendar2.add(1, 1);
        }
        this.mAxis.mEntryCount = arrayList.size();
        this.mAxis.mEntries = new float[this.mAxis.mEntryCount];
        for (int i2 = 0; i2 < this.mAxis.mEntryCount; i2++) {
            this.mAxis.mEntries[i2] = ((Float) arrayList.get(i2)).floatValue();
        }
    }

    @Override // com.huawei.ui.commonui.linechart.common.HwHealthXAxisRenderer, com.github.mikephil.charting.renderer.XAxisRenderer
    public void drawLabels(Canvas canvas, float f, MPPointF mPPointF) {
        if ((this.mAxis instanceof qmn) && ((qmn) this.mAxis).d()) {
            return;
        }
        a(canvas, f, mPPointF);
    }
}
