package xl1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import j23.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.j0;
import rl1.i;
import rm1.h;
import rm1.j;
import sl1.e;
import wr.g;
import xz.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lxl1/a;", "Lsl1/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f191306d = 0;

    static {
        new C3560a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        context.getClass();
    }

    @Override // sl1.e
    public final int B(j jVar) {
        return (jVar == null || jVar.A) ? 5 : 4;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    @Override // sl1.e
    public final float C(j jVar) {
        float fDoubleValue;
        if (!em1.e.a(jVar, i.MOVEMENT)) {
            return -100.0f;
        }
        if (jVar == null) {
            return 4.0f;
        }
        float f14 = jVar.A ? 4.0f : 3.0f;
        h hVar = jVar.f153585a;
        long j8 = hVar != null ? hVar.f153568c : 0L;
        long j14 = hVar != null ? hVar.f153570e : 0L;
        List<rm1.i> list = jVar.f153586b;
        if (list != null) {
            Iterator<T> it = list.iterator();
            Double dValueOf = null;
            if (it.hasNext()) {
                rm1.i iVar = (rm1.i) it.next();
                o oVar = new o(j8, j14);
                DateTime dateTime = iVar.f153583b;
                Long lValueOf = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
                if (lValueOf == null || !oVar.d(lValueOf.longValue())) {
                    iVar = null;
                }
                double dMax = iVar != null ? iVar.f153582a : 0.0d;
                while (it.hasNext()) {
                    rm1.i iVar2 = (rm1.i) it.next();
                    o oVar2 = new o(j8, j14);
                    DateTime dateTime2 = iVar2.f153583b;
                    Long lValueOf2 = dateTime2 != null ? Long.valueOf(dateTime2.getMillis()) : null;
                    if (lValueOf2 == null || !oVar2.d(lValueOf2.longValue())) {
                        iVar2 = null;
                    }
                    dMax = Math.max(dMax, iVar2 != null ? iVar2.f153582a : 0.0d);
                }
                dValueOf = Double.valueOf(dMax);
            }
            if (dValueOf != null) {
                fDoubleValue = (float) dValueOf.doubleValue();
            } else {
                fDoubleValue = f14;
            }
        } else {
            fDoubleValue = f14;
        }
        return (float) Math.ceil(Math.max(f14, fDoubleValue));
    }

    @Override // sl1.e
    public final float D(j jVar) {
        return em1.e.a(jVar, i.MOVEMENT) ? 0.0f : -100.0f;
    }

    @Override // sl1.e, qz.c
    /* JADX INFO: renamed from: x */
    public final List<f> u(j jVar) {
        em1.f fVar = em1.f.f64626a;
        i iVar = i.MOVEMENT;
        boolean zA = em1.e.a(jVar, iVar);
        fVar.getClass();
        return em1.f.a(this.f159983a, iVar, zA);
    }

    @Override // sl1.e
    public final List<IBarLineScatterCandleBubbleDataSet<?>> y(j jVar) {
        List<rm1.i> list;
        if (jVar == null) {
            return j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        h hVar = jVar.f153585a;
        if (hVar != null && (list = jVar.f153586b) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j8 = hVar.f153568c;
            long j14 = hVar.f153570e;
            ArrayList<rm1.i> arrayList3 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                o oVar = new o(j8, j14);
                DateTime dateTime = ((rm1.i) next).f153583b;
                Long lValueOf = dateTime != null ? Long.valueOf(dateTime.getMillis()) : null;
                if (lValueOf != null && oVar.d(lValueOf.longValue())) {
                    arrayList3.add(next);
                }
            }
            for (rm1.i iVar : arrayList3) {
                DateTime dateTime2 = iVar.f153583b;
                Integer numValueOf = dateTime2 != null ? Integer.valueOf(oc.b.u(dateTime2.getMillis(), j8)) : null;
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    double d14 = iVar.f153582a;
                    Double dValueOf = Double.valueOf(d14);
                    if (d14 <= 0.0d) {
                        dValueOf = null;
                    }
                    arrayList2.add(new Entry(iIntValue, dValueOf != null ? (float) dValueOf.doubleValue() : 0.0f));
                }
            }
            LineDataSet lineDataSet = new LineDataSet(arrayList2, "MOVEMENT");
            lineDataSet.setLineWidth(1.5f);
            lineDataSet.setColor(a7.b.getColor(this.f159983a, R.color.gcm_chart_default_data_set));
            lineDataSet.setFillFormatter(new g(11));
            lineDataSet.setDrawValues(false);
            lineDataSet.setDrawCircleHole(false);
            lineDataSet.setDrawCircles(false);
            lineDataSet.setMode(LineDataSet.Mode.LINEAR);
            lineDataSet.setHighlightEnabled(false);
            arrayList.add(lineDataSet);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: xl1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxl1/a$a;", "", "<init>", "()V", "", "SLEEP_MOVEMENT_MIN_VALUE", "F", "SLEEP_MOVEMENT_REM_NOT_SUPPORTED_MAX_VALUE", "SLEEP_MOVEMENT_REM_SUPPORTED_MAX_VALUE", "SLEEP_MOVEMENT_NO_VALUE", "", "DATA_SET_LABEL", "Ljava/lang/String;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3560a {
        public /* synthetic */ C3560a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3560a() {
        }
    }
}
