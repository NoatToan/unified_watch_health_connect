package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfi2/c;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends ei2.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi2.d f71778c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        context.getClass();
        this.f71778c = new hi2.d("AllBottomTimeTransform", hi2.e.BOTTOM_TIME.f83902a);
    }

    @Override // ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        List listG4 = ii2.b.G4(map);
        ArrayList arrayList = new ArrayList();
        if (listG4 != null) {
            Iterator it = listG4.iterator();
            while (it.hasNext()) {
                String strE = ei2.h.e(bVar, (Map) it.next());
                this.f71778c.getClass();
                arrayList.add(Double.valueOf(strE.length() > 0 ? Double.parseDouble(strE) : 0.0d));
            }
        }
        hi2.j jVar = new hi2.j(p13.h0.P0(arrayList));
        return ((jVar.f83910b * 60) + (jVar.f83909a * DateTimeConstants.SECONDS_PER_HOUR)) + jVar.f83911c != 0 ? jVar.toString() : "--";
    }
}
