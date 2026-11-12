package dg1;

import c22.l3;
import com.github.mikephil.charting.formatter.ValueFormatter;
import f12.l;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldg1/c;", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends ValueFormatter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f59521a;

    public c(a aVar) {
        this.f59521a = aVar;
    }

    @Override // com.github.mikephil.charting.formatter.ValueFormatter
    public final String getFormattedValue(float f14) {
        int i14 = a.f59515e;
        this.f59521a.getClass();
        l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
        String str = l3.f23126d.format(a.a(f14 * ((lVar.y() || lVar.C1()) ? 1.0f : 3.28084f), 5));
        str.getClass();
        return str;
    }
}
