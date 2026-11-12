package u52;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.workouts.data.model.v;
import com.github.mikephil.charting.formatter.ValueFormatter;
import java.util.List;
import p005kotlin.Metadata;
import v52.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu52/a;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "", "Lcom/garmin/android/apps/connectmobile/workouts/data/model/v;", "targetList", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Ljava/util/List;Landroid/content/Context;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends ValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<v> f168703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f168704b;

    public a(List<v> list, Context context) {
        list.getClass();
        context.getClass();
        this.f168703a = list;
        this.f168704b = context;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        return f.h(this.f168704b, this.f168703a.get((int) f14).getDuration());
    }
}
