package du1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ldu1/c;", "Lvz/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements vz.b<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f61263a;

    static {
        new a(null);
    }

    public c(Context context) {
        context.getClass();
        this.f61263a = context;
    }

    @Override // vz.b
    public final PieDataSet a(Integer num) {
        Integer num2 = num;
        int[] iArr = {10, 40, 40, 10};
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (int i15 = 0; i15 < 4; i15++) {
            arrayList.add(new PieEntry(iArr[i15]));
        }
        Context context = this.f61263a;
        ArrayList arrayListD = x.d(Integer.valueOf(a7.b.getColor(context, R.color.palette_ruby_2)), Integer.valueOf(a7.b.getColor(context, R.color.palette_mango_2)), Integer.valueOf(a7.b.getColor(context, R.color.palette_swagger_1)), Integer.valueOf(a7.b.getColor(context, R.color.palette_berry_2)));
        int iIntValue = num2 != null ? num2.intValue() : Integer.MIN_VALUE;
        if (iIntValue >= 0 && iIntValue < 101) {
            if (iIntValue >= 90) {
                i14 = 3;
            } else if (iIntValue > 50) {
                i14 = 2;
            } else if (iIntValue > 10) {
                i14 = 1;
            }
            ((PieEntry) arrayList.get(i14)).setData(Integer.valueOf(iIntValue));
        }
        PieDataSet pieDataSet = new PieDataSet(arrayList, "");
        pieDataSet.setColors(arrayListD);
        return pieDataSet;
    }

    @Override // vz.b
    public final CharSequence b(Integer num) {
        String string;
        Integer num2 = num;
        Context context = this.f61263a;
        if (num2 != null && (string = context.getString(R.string.lbl_value_percent, String.valueOf(num2.intValue()))) != null) {
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
    public final /* bridge */ /* synthetic */ CharSequence d(Integer num) {
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Ldu1/c$a;", "", "<init>", "()V", "", "CONFIDENCE_MIN", "I", "CONFIDENCE_INTERVAL_1", "CONFIDENCE_INTERVAL_2", "CONFIDENCE_INTERVAL_3", "CONFIDENCE_MAX", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
