package sl1;

import android.content.Context;
import android.graphics.Shader;
import android.text.format.DateFormat;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import g22.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lsl1/e;", "Lqz/c;", "Lrm1/j;", "Lcom/github/mikephil/charting/interfaces/datasets/IBarLineScatterCandleBubbleDataSet;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class e implements qz.c<rm1.j, IBarLineScatterCandleBubbleDataSet<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f159983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jz.a f159984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f159985c;

    static {
        new a(null);
    }

    public e(Context context) {
        context.getClass();
        this.f159983a = context;
        this.f159984b = new jz.a(new l22.a(context));
        this.f159985c = DateFormat.is24HourFormat(context);
    }

    @Override // qz.c
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final float q(rm1.j jVar) {
        rm1.b bVar;
        Float fValueOf = (jVar == null || (bVar = jVar.D) == null) ? null : Float.valueOf(Minutes.minutesBetween(bVar.f153532a, bVar.f153533b).getMinutes());
        if (fValueOf == null || fValueOf.floatValue() <= 0.0f) {
            return 0.0f;
        }
        return fValueOf.floatValue() + 1.0f;
    }

    public int B(rm1.j jVar) {
        return 5;
    }

    public abstract float C(rm1.j jVar);

    public abstract float D(rm1.j jVar);

    @Override // qz.c
    public final List<IBarLineScatterCandleBubbleDataSet<?>> a(rm1.j jVar) {
        ArrayList arrayList = new ArrayList();
        List<IBarLineScatterCandleBubbleDataSet<?>> listY = y(jVar);
        Iterator<T> it = listY.iterator();
        while (it.hasNext()) {
            gl.b.i((IBarLineScatterCandleBubbleDataSet) it.next(), this.f159983a);
        }
        arrayList.addAll(listY);
        return arrayList;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ Shader b(float f14, float f15, Object obj) {
        return null;
    }

    @Override // qz.c
    public final Integer c(rm1.j jVar) {
        ArrayList arrayListO = o(jVar);
        int i14 = 0;
        if (!arrayListO.isEmpty()) {
            Iterator it = arrayListO.iterator();
            while (it.hasNext()) {
                if (n.d((String) it.next()) && (i14 = i14 + 1) < 0) {
                    x.p();
                    throw null;
                }
            }
        }
        return Integer.valueOf(i14);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ boolean d(rm1.j jVar) {
        return false;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ float e(rm1.j jVar) {
        return 0.0f;
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List f(rm1.j jVar) {
        return null;
    }

    @Override // qz.c
    public final List g(rm1.j jVar) {
        return oc.b.q((int) 0.0f, (int) q(jVar), this.f159983a);
    }

    @Override // qz.c
    public final float i(rm1.j jVar) {
        return C(jVar);
    }

    @Override // qz.c
    public final Integer j(rm1.j jVar) {
        return Integer.valueOf(B(jVar));
    }

    @Override // qz.c
    public final float m(rm1.j jVar) {
        return D(jVar);
    }

    @Override // qz.c
    public final Integer p(rm1.j jVar) {
        return Integer.valueOf(B(jVar));
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ String r(rm1.j jVar) {
        return null;
    }

    @Override // qz.c
    public final float t(rm1.j jVar) {
        return D(jVar);
    }

    @Override // qz.c
    public final /* bridge */ /* synthetic */ List v(rm1.j jVar) {
        return null;
    }

    @Override // qz.c
    public final float w(rm1.j jVar) {
        return C(jVar);
    }

    @Override // qz.c
    /* JADX INFO: renamed from: x */
    public /* bridge */ List<xz.f> u(rm1.j jVar) {
        return null;
    }

    public abstract List<IBarLineScatterCandleBubbleDataSet<?>> y(rm1.j jVar);

    @Override // qz.c
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final ArrayList o(rm1.j jVar) {
        rm1.b bVar;
        int iQ = ((int) q(jVar)) - ((int) 0.0f);
        if (jVar == null || (bVar = jVar.D) == null) {
            ArrayList arrayList = new ArrayList(iQ);
            for (int i14 = 0; i14 < iQ; i14++) {
                arrayList.add("");
            }
            return arrayList;
        }
        DateTime dateTimeWithMillisOfSecond = bVar.f153532a.withSecondOfMinute(0).withMillisOfSecond(0);
        DateTime dateTimeWithMillisOfSecond2 = bVar.f153533b.withSecondOfMinute(0).withMillisOfSecond(0);
        j00.f fVar = j00.f.f95974a;
        dateTimeWithMillisOfSecond.getClass();
        dateTimeWithMillisOfSecond2.getClass();
        ArrayList arrayListA = j00.f.a(fVar, dateTimeWithMillisOfSecond, dateTimeWithMillisOfSecond2, 0, 28);
        DateTime dateTime = bVar.f153536e;
        DateTime dateTime2 = bVar.f153537f;
        Context context = this.f159983a;
        return gl1.d.a0(arrayListA, context, dateTimeWithMillisOfSecond, dateTimeWithMillisOfSecond2, new b(context, dateTime, dateTime2), 32);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lsl1/e$a;", "", "<init>", "()V", "", "X_AXIS_OFFSET", "F", "", "X_AXIS_LABELS_MARGIN_MINUTES", "I", "Y_AXIS_LABELS_COUNT", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
