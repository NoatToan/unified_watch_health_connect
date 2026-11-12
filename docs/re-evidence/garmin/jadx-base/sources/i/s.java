package i;

import android.content.Context;
import android.location.LocationManager;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static s f86663d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f86664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocationManager f86665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f86666c = new a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f86667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f86668b;
    }

    public s(Context context, LocationManager locationManager) {
        this.f86664a = context;
        this.f86665b = locationManager;
    }
}
