package r81;

import android.content.Context;
import android.text.SpannableStringBuilder;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import j23.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o81.f;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import r22.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lr81/c;", "Lvz/b;", "Lu81/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lo81/f;", "supportingStat", "<init>", "(Landroid/content/Context;Lo81/f;)V", "a", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements vz.b<u81.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f151206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f151207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<l> f151208e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f151209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f151210b;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f151211a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.HILL_STRENGTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.HILL_ENDURANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f151211a = iArr;
        }
    }

    static {
        new a(null);
        l lVar = new l(0, 29);
        f151206c = lVar;
        l lVar2 = new l(30, 69);
        f151207d = lVar2;
        f151208e = x.k(lVar, lVar2, new l(70, 100));
    }

    public c(Context context, f fVar) {
        context.getClass();
        fVar.getClass();
        this.f151209a = context;
        this.f151210b = fVar;
    }

    @Override // vz.b
    public final PieDataSet a(u81.a aVar) {
        Object next;
        u81.a aVar2 = aVar;
        Context context = this.f151209a;
        ArrayList arrayListD = x.d(Integer.valueOf(a7.b.getColor(context, R.color.orange_50_static)), Integer.valueOf(a7.b.getColor(context, R.color.orange_20_static)), Integer.valueOf(a7.b.getColor(context, R.color.green_50_static)));
        float[] fArr = {30.0f, 40.0f, 31.0f};
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (int i15 = 0; i15 < 3; i15++) {
            arrayList.add(new PieEntry(fArr[i15]));
        }
        if (aVar2 != null) {
            Integer num = this.f151210b == f.HILL_ENDURANCE ? aVar2.f169463e : aVar2.f169462d;
            List<l> list = f151208e;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                l lVar = (l) next;
                if (num != null && lVar.d(num.intValue())) {
                    break;
                }
            }
            if (((l) next) != null) {
                Iterator<l> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        i14 = -1;
                        break;
                    }
                    l next2 = it3.next();
                    if (num != null && next2.d(num.intValue())) {
                        break;
                    }
                    i14++;
                }
                ((PieEntry) arrayList.get(i14)).setData(num);
            }
        }
        PieDataSet pieDataSet = new PieDataSet(arrayList, "");
        pieDataSet.setColors(arrayListD);
        return pieDataSet;
    }

    @Override // vz.b
    public final CharSequence b(u81.a aVar) {
        u81.a aVar2 = aVar;
        int i14 = b.f151211a[this.f151210b.ordinal()];
        Context context = this.f151209a;
        if (i14 == 1) {
            if ((aVar2 != null ? aVar2.f169462d : null) == null) {
                String string = context.getString(R.string.txt_empty_page_no_data);
                string.getClass();
                return string;
            }
            Integer num = aVar2.f169462d;
            return num + StringUtils.SPACE + e(num.intValue());
        }
        if ((aVar2 != null ? aVar2.f169463e : null) == null) {
            String string2 = context.getString(R.string.txt_empty_page_no_data);
            string2.getClass();
            return string2;
        }
        Integer num2 = aVar2.f169463e;
        return num2 + StringUtils.SPACE + e(num2.intValue());
    }

    @Override // vz.b
    public final /* bridge */ /* synthetic */ void c(Object obj) {
    }

    @Override // vz.b
    public final CharSequence d(u81.a aVar) {
        u81.a aVar2 = aVar;
        x1 x1Var = new x1(this.f151209a);
        int i14 = b.f151211a[this.f151210b.ordinal()];
        Integer num = null;
        if (i14 != 1) {
            if (i14 != 2) {
                num = 0;
            } else if (aVar2 != null) {
                num = aVar2.f169463e;
            }
        } else if (aVar2 != null) {
            num = aVar2.f169462d;
        }
        int iIntValue = num != null ? num.intValue() : 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) x1.b(x1Var, String.valueOf(iIntValue), R.style.PieChartCenterPrimaryValueText));
        spannableStringBuilder.append('\n');
        spannableStringBuilder.append((CharSequence) x1.b(x1Var, e(iIntValue), R.style.PieChartCenterSecondaryText));
        return spannableStringBuilder;
    }

    public final String e(int i14) {
        int i15;
        l lVar = f151206c;
        int i16 = lVar.f96796a;
        if (i14 > lVar.f96797b || i16 > i14) {
            l lVar2 = f151207d;
            i15 = (i14 > lVar2.f96797b || lVar2.f96796a > i14) ? R.string.hill_strength_endurance_score_high : R.string.hill_strength_endurance_score_moderate;
        } else {
            i15 = R.string.hill_strength_endurance_score_low;
        }
        String string = this.f151209a.getString(i15);
        string.getClass();
        return string;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lr81/c$a;", "", "<init>", "()V", "", "LOW_RANGE_SIZE", "F", "Lj23/l;", "LOW_RANGE", "Lj23/l;", "MODERATE_RANGE_SIZE", "MODERATE_RANGE", "HIGH_RANGE_SIZE", "HIGH_RANGE", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
