package wa;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import com.google.common.collect.Ordering;

/* JADX INFO: loaded from: classes.dex */
public class f implements Spatializer$OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f183740a;

    public f(e.g gVar, e eVar) {
        this.f183740a = eVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z14) {
        Ordering<Integer> ordering = e.f183652k;
        this.f183740a.l();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z14) {
        Ordering<Integer> ordering = e.f183652k;
        this.f183740a.l();
    }
}
