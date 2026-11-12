package du2;

import android.location.Location;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.common.HttpHeaders;
import java.util.function.Consumer;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "kotlin.jvm.PlatformType", HttpHeaders.ACCEPT}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class h<T> implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f61309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t13.d<Location> f61310b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(g gVar, t13.d<? super Location> dVar) {
        this.f61309a = gVar;
        this.f61310b = dVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        g.a(this.f61309a, (Location) obj, this.f61310b);
    }
}
