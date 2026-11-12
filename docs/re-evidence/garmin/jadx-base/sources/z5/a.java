package z5;

import a6.r;
import android.os.LocaleList;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz5/a;", "", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocaleList f202436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f202437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f202438c = new r();

    public final c a() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f202438c) {
            c cVar = this.f202437b;
            if (cVar != null && localeList == this.f202436a) {
                return cVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i14 = 0; i14 < size; i14++) {
                arrayList.add(new b(localeList.get(i14)));
            }
            c cVar2 = new c(arrayList);
            this.f202436a = localeList;
            this.f202437b = cVar2;
            return cVar2;
        }
    }
}
