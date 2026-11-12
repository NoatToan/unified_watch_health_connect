package gw;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class h extends com.garmin.android.library.backgroundtaskmanagement.b<ArrayList<String>> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f79503l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<String> f79504m;

    public h(Context context, List<String> list, long j8, com.garmin.android.library.backgroundtaskmanagement.b.a aVar) {
        super(com.garmin.android.library.backgroundtaskmanagement.b.d.UI_PRIORITY, aVar, false);
        WeakReference weakReference = new WeakReference(context);
        this.f79503l = j8;
        this.f79504m = list;
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new ArrayList());
        Context context2 = (Context) weakReference.get();
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            arrayList.add(new jw.g(this, context2, str, this.f79503l, new com.google.android.exoplayer2.analytics.q(26, this, str)));
        }
        c(arrayList);
    }
}
