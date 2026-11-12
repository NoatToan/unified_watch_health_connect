package zm;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import p13.p0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lzm/f0;", "Lzm/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzm/p;", "activityChartData", "overlayChartData", "", "fullScreen", "Lfz/c;", "xAxisType", "<init>", "(Landroid/content/Context;Lzm/p;Lzm/p;ZLfz/c;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, p pVar, p pVar2, boolean z14, fz.c cVar) {
        super(context, pVar, pVar2, null, z14, cVar);
        context.getClass();
        pVar.getClass();
        cVar.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [zm.c, zm.f0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.ArrayList] */
    @Override // zm.c
    public final ArrayList v() {
        ?? arrayList;
        Object next;
        ArrayList arrayList2 = new ArrayList();
        List<o20.a> listP = this.f205203b.P(0);
        if (listP.isEmpty()) {
            arrayList = j0.f134944a;
        } else {
            Iterator it = listP.iterator();
            if (!it.hasNext()) {
                c22.t.g();
                return null;
            }
            int iC = (int) ((o20.a) it.next()).C();
            while (it.hasNext()) {
                int iC2 = (int) ((o20.a) it.next()).C();
                if (iC > iC2) {
                    iC = iC2;
                }
            }
            Iterator it3 = listP.iterator();
            if (!it3.hasNext()) {
                c22.t.g();
                return null;
            }
            int iC3 = (int) ((o20.a) it3.next()).C();
            while (it3.hasNext()) {
                int iC4 = (int) ((o20.a) it3.next()).C();
                if (iC3 < iC4) {
                    iC3 = iC4;
                }
            }
            j23.l lVar = new j23.l(iC, iC3);
            arrayList = new ArrayList(p13.y.r(lVar, 10));
            Iterator<Integer> it4 = lVar.iterator();
            while (((j23.k) it4).f96801c) {
                int iNextInt = ((p0) it4).nextInt();
                Iterator it5 = listP.iterator();
                do {
                    if (!it5.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it5.next();
                } while (((int) ((o20.a) next).C()) != iNextInt);
                o20.a aVar = (o20.a) next;
                if (aVar == null) {
                    aVar = new o20.a(iNextInt, Double.NaN);
                }
                arrayList.add(aVar);
            }
        }
        arrayList2.add(u(arrayList));
        Iterable<o20.a> iterable = (Iterable) arrayList;
        ArrayList arrayList3 = new ArrayList(p13.y.r(iterable, 10));
        for (o20.a aVar2 : iterable) {
            int iD = (int) aVar2.D();
            if (iD < 0 || iD >= 26) {
                aVar2 = new o20.a(aVar2.C(), Double.NaN);
            }
            arrayList3.add(aVar2);
        }
        xz.d dVarU = u(arrayList3);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.BOTTOM_TOP;
        Context context = this.f205202a;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{a7.b.getColor(context, R.color.gcm_stress_level_rest), a7.b.getColor(context, R.color.gcm_stress_level_rest)});
        gradientDrawable.setAlpha(this.f205213l ? 127 : 255);
        dVarU.setFillDrawable(gradientDrawable);
        arrayList2.add(dVarU);
        return arrayList2;
    }

    public /* synthetic */ f0(Context context, p pVar, p pVar2, boolean z14, fz.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, pVar, (i14 & 4) != 0 ? null : pVar2, (i14 & 8) != 0 ? true : z14, cVar);
    }
}
