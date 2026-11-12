package xm;

import android.content.Context;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.github.mikephil.charting.formatter.ValueFormatter;
import f12.l;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxm/a;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "axisMaximum", "<init>", "(Landroid/content/Context;F)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends ValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f191321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f191322b;

    public a(Context context, float f14) {
        context.getClass();
        this.f191321a = context;
        this.f191322b = f14;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        double d14 = this.f191322b - f14;
        l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
        l3.a aVar = l3.f23124b;
        if (d14 <= 0.0d) {
            d14 = 0.0d;
        }
        boolean zY = lVar.y();
        aVar.getClass();
        return l3.a.M(this.f191321a, d14, zY, false);
    }
}
