package xm;

import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.github.mikephil.charting.formatter.ValueFormatter;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lxm/b;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "", "labels", "", "minValue", "<init>", "(Landroid/content/Context;Ljava/util/List;F)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends ValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f191323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f191324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f191325c;

    public b(Context context, List<String> list, float f14) {
        context.getClass();
        this.f191323a = context;
        this.f191324b = list;
        this.f191325c = f14;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        Context context = this.f191323a;
        if (f14 < 1.0f) {
            String string = context.getString(R.string.lbl_off);
            string.getClass();
            return string;
        }
        int i14 = ((int) f14) - ((int) this.f191325c);
        List<String> list = this.f191324b;
        if (list != null && !list.isEmpty() && i14 < list.size()) {
            return list.get(i14);
        }
        if (f14 >= 1.0f) {
            l3.f23124b.getClass();
            return l3.a.B(f14);
        }
        String string2 = context.getString(R.string.lbl_off);
        string2.getClass();
        return string2;
    }
}
