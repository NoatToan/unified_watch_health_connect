package u30;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.util.ArrayList;
import java.util.List;
import k30.f;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lu30/a;", "Lqz/c;", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "Lcom/github/mikephil/charting/interfaces/datasets/ILineDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements qz.c<ClimbDTO, ILineDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f168273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<LimitLine> f168274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p<p<Double, Double>, p<Double, Double>> f168275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ClimbDTO f168276d;

    static {
        new C3155a(null);
    }

    public a(Context context) {
        context.getClass();
        this.f168273a = context;
        this.f168274b = new ArrayList<>();
    }

    public static ArrayList y(ClimbDTO climbDTO) {
        List<GeoPointDTO> listM;
        if (climbDTO == null || (listM = climbDTO.m()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            Double d14 = ((GeoPointDTO) obj).distance;
            if ((d14 != null ? d14.doubleValue() : 0.0d) - climbDTO.getStartDistance() <= climbDTO.getDistance()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // qz.c
    public final List<ILineDataSet> a(ClimbDTO climbDTO) {
        return h0.Z(z(climbDTO));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer c(ClimbDTO climbDTO) {
        return 6;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(ClimbDTO climbDTO) {
        return false;
    }

    @Override // qz.c
    public final float e(ClimbDTO climbDTO) {
        p<Double, Double> pVar;
        p<p<Double, Double>, p<Double, Double>> pVarX = x(climbDTO);
        if (pVarX == null || (pVar = pVarX.f128594a) == null) {
            return -1.0f;
        }
        return (float) pVar.f128594a.doubleValue();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(ClimbDTO climbDTO) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(ClimbDTO climbDTO) {
        return null;
    }

    @Override // qz.c
    public final float i(ClimbDTO climbDTO) {
        p<Double, Double> pVar;
        p<p<Double, Double>, p<Double, Double>> pVarX = x(climbDTO);
        if (pVarX == null || (pVar = pVarX.f128595b) == null) {
            return -1.0f;
        }
        double d14 = 10;
        return (float) (Math.ceil(pVar.f128595b.doubleValue() / d14) * d14);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer j(ClimbDTO climbDTO) {
        return null;
    }

    @Override // qz.c
    public final boolean l() {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(ClimbDTO climbDTO) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List o(ClimbDTO climbDTO) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(ClimbDTO climbDTO) {
        return null;
    }

    @Override // qz.c
    public final float q(ClimbDTO climbDTO) {
        p<Double, Double> pVar;
        p<p<Double, Double>, p<Double, Double>> pVarX = x(climbDTO);
        if (pVarX == null || (pVar = pVarX.f128594a) == null) {
            return -1.0f;
        }
        return (float) pVar.f128595b.doubleValue();
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(ClimbDTO climbDTO) {
        return null;
    }

    @Override // qz.c
    public final float t(ClimbDTO climbDTO) {
        p<Double, Double> pVar;
        p<p<Double, Double>, p<Double, Double>> pVarX = x(climbDTO);
        if (pVarX == null || (pVar = pVarX.f128595b) == null) {
            return -1.0f;
        }
        double d14 = 10;
        return (float) (Math.floor(pVar.f128594a.doubleValue() / d14) * d14);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List u(ClimbDTO climbDTO) {
        return null;
    }

    @Override // qz.c
    public final List v(ClimbDTO climbDTO) {
        z(climbDTO);
        return this.f168274b;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(ClimbDTO climbDTO) {
        return 0.0f;
    }

    public final p<p<Double, Double>, p<Double, Double>> x(ClimbDTO climbDTO) {
        if (climbDTO != this.f168276d) {
            this.f168276d = climbDTO;
            this.f168275c = null;
        }
        if ((climbDTO != null ? climbDTO.m() : null) == null) {
            this.f168275c = null;
            return null;
        }
        p<p<Double, Double>, p<Double, Double>> pVar = this.f168275c;
        if (pVar != null) {
            return pVar;
        }
        Iterable<GeoPointDTO> iterableY = y(climbDTO);
        if (iterableY == null) {
            iterableY = j0.f134944a;
        }
        double d14 = Double.MAX_VALUE;
        double d15 = Double.MIN_VALUE;
        double dDoubleValue = Double.MIN_VALUE;
        double dDoubleValue2 = Double.MAX_VALUE;
        for (GeoPointDTO geoPointDTO : iterableY) {
            Double d16 = geoPointDTO.distance;
            double dDoubleValue3 = (d16 != null ? d16.doubleValue() : 0.0d) - climbDTO.getStartDistance();
            Double d17 = geoPointDTO.elevation;
            if (d17 != null) {
                if (dDoubleValue3 > d15) {
                    d15 = dDoubleValue3;
                }
                if (dDoubleValue3 < d14) {
                    d14 = dDoubleValue3;
                }
                if (d17.doubleValue() > dDoubleValue) {
                    dDoubleValue = d17.doubleValue();
                }
                if (d17.doubleValue() < dDoubleValue2) {
                    dDoubleValue2 = d17.doubleValue();
                }
            }
        }
        p<p<Double, Double>, p<Double, Double>> pVar2 = new p<>(new p(Double.valueOf(d14), Double.valueOf(d15)), new p(Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue)));
        this.f168275c = pVar2;
        return pVar2;
    }

    public final ArrayList z(ClimbDTO climbDTO) {
        ArrayList arrayList = new ArrayList();
        if ((climbDTO != null ? climbDTO.m() : null) != null) {
            for (f fVar : climbDTO.o()) {
                ArrayList arrayList2 = new ArrayList();
                Iterable iterableY = y(climbDTO);
                if (iterableY == null) {
                    iterableY = j0.f134944a;
                }
                ArrayList<GeoPointDTO> arrayList3 = new ArrayList();
                for (Object obj : iterableY) {
                    GeoPointDTO geoPointDTO = (GeoPointDTO) obj;
                    Double d14 = geoPointDTO.distance;
                    if (((int) ((d14 != null ? d14.doubleValue() : 0.0d) - climbDTO.getStartDistance())) >= ((int) fVar.getClimbStartToSectionStartDistance())) {
                        Double d15 = geoPointDTO.distance;
                        if (((int) ((d15 != null ? d15.doubleValue() : 0.0d) - climbDTO.getStartDistance())) <= ((int) fVar.getClimbStartToSectionEndDistance())) {
                            arrayList3.add(obj);
                        }
                    }
                }
                double d16 = 0.0d;
                for (GeoPointDTO geoPointDTO2 : arrayList3) {
                    Double d17 = geoPointDTO2.distance;
                    double dDoubleValue = (d17 != null ? d17.doubleValue() : 0.0d) - climbDTO.getStartDistance();
                    Double d18 = geoPointDTO2.elevation;
                    if (d18 != null) {
                        arrayList2.add(new Entry((float) dDoubleValue, (float) d18.doubleValue()));
                        if (d16 == 0.0d) {
                            d16 = dDoubleValue;
                        }
                    }
                }
                LimitLine limitLine = new LimitLine((float) d16);
                limitLine.setLineWidth(1.0f);
                Context context = this.f168273a;
                limitLine.setLineColor(context.getColor(R.color.gcm_background));
                ArrayList<LimitLine> arrayList4 = this.f168274b;
                arrayList4.clear();
                arrayList4.add(limitLine);
                List listN0 = h0.N0(arrayList2, new b());
                if (!listN0.isEmpty()) {
                    LineDataSet lineDataSet = new LineDataSet(listN0, "");
                    lineDataSet.setDrawValues(false);
                    lineDataSet.setDrawCircleHole(false);
                    lineDataSet.setDrawCircles(false);
                    lineDataSet.setDrawHorizontalHighlightIndicator(false);
                    lineDataSet.setDrawFilled(true);
                    lineDataSet.setColor(context.getColor(w13.b.i((int) fVar.getAvgGrade())));
                    lineDataSet.setFillColor(context.getColor(w13.b.i((int) fVar.getAvgGrade())));
                    lineDataSet.setFillAlpha(255);
                    lineDataSet.setHighLightColor(context.getColor(R.color.white));
                    lineDataSet.setHighlightLineWidth(1.0f);
                    arrayList.add(lineDataSet);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u30.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lu30/a$a;", "", "<init>", "()V", "", "CHART_GRID_LINE_WIDTH", "F", "", "X_AXIS_LABEL_COUNT", "I", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3155a {
        public /* synthetic */ C3155a(j jVar) {
            this();
        }

        private C3155a() {
        }
    }
}
