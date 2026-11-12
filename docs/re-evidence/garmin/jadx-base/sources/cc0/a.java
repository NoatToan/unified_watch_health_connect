package cc0;

import java.util.ArrayList;
import jw.i;
import jw.u;

/* JADX INFO: loaded from: classes8.dex */
public class a extends com.garmin.android.library.backgroundtaskmanagement.e<dc0.a> {
    public a(long j8, int i14, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar);
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new dc0.a());
        ArrayList arrayList = new ArrayList();
        dc0.a.C1256a c1256a = dc0.a.f59105c;
        c1256a.getClass();
        if (dc0.a.C1256a.a(i14, 2)) {
            arrayList.add(new i(this, j8, new a73.b(this, j8, 1)));
        }
        c1256a.getClass();
        if (dc0.a.C1256a.a(i14, 4)) {
            b(new u(this, new bd0.e(this, 3)));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        c(arrayList);
    }
}
