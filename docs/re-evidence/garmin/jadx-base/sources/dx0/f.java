package dx0;

import android.content.Context;
import android.graphics.Shader;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.math.MathKt;
import p13.w;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ldx0/f;", "Lqz/c;", "", "Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/charts/a;", "Lcom/github/mikephil/charting/data/BarDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements qz.c<List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a>, BarDataSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f61474a;

    static {
        new a(null);
    }

    public f(Context context) {
        context.getClass();
        this.f61474a = context;
    }

    @Override // qz.c
    public final List<BarDataSet> a(List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list) {
        ArrayList arrayList;
        float[] fArr;
        List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list2 = list;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(y.r(list2, 10));
            int i14 = 0;
            for (Object obj : list2) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a aVar = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a) obj;
                float f14 = i14;
                int iC = MathKt.c(i(list2));
                int i16 = aVar.f38779c;
                if (i16 == 0) {
                    int i17 = aVar.f38778b;
                    int i18 = aVar.f38780d;
                    int i19 = aVar.f38781e;
                    int i24 = aVar.f38782f;
                    fArr = new float[]{0.0f, i18, i19, i24, ((i17 - i18) - i19) - i24};
                } else {
                    if (iC <= 0) {
                        iC = i16;
                    }
                    fArr = new float[]{iC, 0.0f, 0.0f, 0.0f, 0.0f};
                }
                arrayList2.add(new BarEntry(f14, fArr));
                i14 = i15;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        BarDataSet barDataSet = new BarDataSet(arrayList, "");
        Context context = this.f61474a;
        barDataSet.setColors(x.k(Integer.valueOf(a7.b.getColor(context, R.color.mct_pregnancy_cycle_gray)), Integer.valueOf(a7.b.getColor(context, R.color.mct_period)), Integer.valueOf(a7.b.getColor(context, R.color.mct_cycle_gray)), Integer.valueOf(a7.b.getColor(context, R.color.mct_fertility)), Integer.valueOf(a7.b.getColor(context, R.color.mct_cycle_gray))));
        barDataSet.setBarBorderWidth(1.0f);
        barDataSet.setBarBorderColor(-16777216);
        barDataSet.setDrawValues(false);
        return w.c(barDataSet);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list) {
        List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list2 = list;
        return Integer.valueOf(list2 != null ? list2.size() : 6);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list) {
        return -0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List g(List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list) {
        return null;
    }

    @Override // qz.c
    public final Integer j(List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list) {
        List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list2 = list;
        return Integer.valueOf((list2 == null || list2.isEmpty()) ? 7 : 9);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float m(List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final List o(List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list) {
        List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list2 = list;
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(y.r(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a) it.next()).f38777a);
        }
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Integer p(List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list) {
        return null;
    }

    @Override // qz.c
    public final float q(List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list) {
        List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list2 = list;
        return (list2 != null ? list2.size() : 6) - 0.5f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float t(List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List u(List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list) {
        return null;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float w(List<? extends com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list) {
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    @Override // qz.c
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final float i(List<com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a> list) {
        int iCeil;
        ArrayList arrayList;
        Object next;
        Object next2 = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int i14 = ((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a) next).f38778b;
                    do {
                        Object next3 = it.next();
                        int i15 = ((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a) next3).f38778b;
                        if (i14 < i15) {
                            next = next3;
                            i14 = i15;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a aVar = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a) next;
            if (aVar != null) {
                iCeil = ((int) Math.ceil(aVar.f38778b / 10.0f)) * 10;
            } else {
                iCeil = 30;
            }
        } else {
            iCeil = 30;
        }
        if (iCeil == 0) {
            if (list != null) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a) obj).f38779c > 0) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (it3.hasNext()) {
                        int i16 = ((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a) next2).f38779c;
                        do {
                            Object next4 = it3.next();
                            int i17 = ((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a) next4).f38779c;
                            if (i16 < i17) {
                                next2 = next4;
                                i16 = i17;
                            }
                        } while (it3.hasNext());
                    }
                }
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a aVar2 = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.charts.a) next2;
                iCeil = aVar2 != null ? ((int) Math.ceil(aVar2.f38779c / 10.0f)) * 10 : 30;
            }
        }
        return iCeil;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ldx0/f$a;", "", "<init>", "()V", "", "DEFAULT_X_AXIS_LABELS", "I", "", "X_AXIS_OFFSET", "F", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
