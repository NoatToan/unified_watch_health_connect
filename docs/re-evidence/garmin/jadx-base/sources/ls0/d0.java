package ls0;

import androidx.lifecycle.u1;
import androidx.lifecycle.x1;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lls0/d0;", "Landroidx/lifecycle/x1$c;", "Lyr0/o;", "editedTrip", "", "notEditedTrips", "<init>", "(Lyr0/o;Ljava/util/List;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d0 implements x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yr0.o f114712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<yr0.o> f114713b;

    public d0(yr0.o oVar, List<yr0.o> list) {
        list.getClass();
        this.f114712a = oVar;
        this.f114713b = list;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends u1> T create(Class<T> cls) {
        cls.getClass();
        if (cls.isAssignableFrom(com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e.class)) {
            return new com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.e(this.f114712a, this.f114713b);
        }
        vb.h.s("Unknown ViewModel class");
        return null;
    }
}
