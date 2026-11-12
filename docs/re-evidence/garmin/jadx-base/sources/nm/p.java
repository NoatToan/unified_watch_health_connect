package nm;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import o4.f0;
import p005kotlin.Metadata;
import p13.h0;
import p13.w;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnm/p;", "Lnm/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lzm/p;", "mainChartData", "overlayChartData", "<init>", "(Landroid/content/Context;Lzm/p;Lzm/p;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, zm.p pVar, zm.p pVar2) {
        super(context, pVar, pVar2);
        context.getClass();
        pVar.getClass();
    }

    @Override // nm.b
    public final i53.c<j82.f> b() {
        w13.c cVar = zp1.a.f206594h;
        ArrayList arrayList = new ArrayList(y.r(cVar, 10));
        p13.c.b bVar = new p13.c.b();
        while (bVar.hasNext()) {
            zp1.a aVar = (zp1.a) bVar.next();
            int i14 = aVar.f206596b;
            Context context = this.f126526a;
            String string = context.getString(i14);
            string.getClass();
            arrayList.add(new j82.f(string, new j82.g.a(f0.b(a7.b.getColor(context, aVar.f206597c)), null), null, 4, null));
        }
        return i53.a.e(h0.G0(arrayList));
    }

    @Override // nm.b
    public final List<Integer> c() {
        return w.c(89);
    }

    @Override // nm.b
    public final boolean d() {
        if (!c().contains(Integer.valueOf(this.f126527b.getF113498h1()))) {
            return false;
        }
        zm.p pVar = this.f126528c;
        return pVar == null || pVar.getF113498h1() != 54;
    }
}
