package r81;

import android.content.Context;
import android.text.SpannableStringBuilder;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import j23.l;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.u;
import p13.y;
import q6.f;
import q81.k;
import r22.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lr81/a;", "Lvz/b;", "Lu81/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements vz.b<u81.a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f151204b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f151205a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((k) t7).f143336a.f96796a), Integer.valueOf(((k) t14).f143336a.f96796a));
        }
    }

    static {
        new C2844a(null);
        List listY = u.Y(k.values(), new b());
        ArrayList arrayList = new ArrayList(y.r(listY, 10));
        Iterator it = listY.iterator();
        while (it.hasNext()) {
            arrayList.add(((k) it.next()).f143336a);
        }
        f151204b = arrayList;
    }

    public a(Context context) {
        context.getClass();
        this.f151205a = context;
    }

    @Override // vz.b
    public final PieDataSet a(u81.a aVar) {
        Object next;
        u81.a aVar2 = aVar;
        List listY = u.Y(k.values(), new r81.b());
        ArrayList arrayList = new ArrayList(y.r(listY, 10));
        Iterator it = listY.iterator();
        while (it.hasNext()) {
            f.t(this.f151205a, ((k) it.next()).f143338c, arrayList);
        }
        float[] fArr = {24.0f, 25.0f, 20.0f, 15.0f, 10.0f, 6.0f};
        ArrayList arrayList2 = new ArrayList();
        int i14 = 0;
        for (int i15 = 0; i15 < 6; i15++) {
            arrayList2.add(new PieEntry(fArr[i15]));
        }
        if (aVar2 != null) {
            Integer num = aVar2.f169466h;
            ArrayList arrayList3 = f151204b;
            Iterator it3 = arrayList3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                l lVar = (l) next;
                if (num != null && lVar.d(num.intValue())) {
                    break;
                }
            }
            if (((l) next) != null) {
                Iterator it4 = arrayList3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        i14 = -1;
                        break;
                    }
                    l lVar2 = (l) it4.next();
                    if (num != null && lVar2.d(num.intValue())) {
                        break;
                    }
                    i14++;
                }
                ((PieEntry) arrayList2.get(i14)).setData(num);
            }
        }
        PieDataSet pieDataSet = new PieDataSet(arrayList2, "");
        pieDataSet.setColors(arrayList);
        return pieDataSet;
    }

    @Override // vz.b
    public final CharSequence b(u81.a aVar) {
        u81.a aVar2 = aVar;
        Integer num = aVar2 != null ? aVar2.f169466h : null;
        Context context = this.f151205a;
        if (num != null) {
            String string = context.getString(R.string.lbl_out_of_goal_1, aVar2.f169466h, 100);
            string.getClass();
            return string;
        }
        String string2 = context.getString(R.string.txt_empty_page_no_data);
        string2.getClass();
        return string2;
    }

    @Override // vz.b
    public final /* bridge */ /* synthetic */ void c(Object obj) {
    }

    @Override // vz.b
    public final CharSequence d(u81.a aVar) {
        Integer num;
        u81.a aVar2 = aVar;
        x1 x1Var = new x1(this.f151205a);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) x1.b(x1Var, String.valueOf((aVar2 == null || (num = aVar2.f169466h) == null) ? 0 : num.intValue()), R.style.PieChartCenterPrimaryValueText));
        spannableStringBuilder.append('\n');
        spannableStringBuilder.append((CharSequence) x1.b(x1Var, "100", R.style.PieChartCenterSecondaryText));
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: r81.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lr81/a$a;", "", "<init>", "()V", "", "RECREATIONAL_RANGE_SIZE", "F", "CHALLENGER_RANGE_SIZE", "TRAINED_RANGE_SIZE", "SKILLED_RANGE_SIZE", "EXPERT_RANGE_SIZE", "ELITE_RANGE_SIZE", "", "CHART_MAX", "I", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2844a {
        public /* synthetic */ C2844a(j jVar) {
            this();
        }

        private C2844a() {
        }
    }
}
