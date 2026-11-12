package fd;

import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerParams;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.health.connect.HealthConnectManager;
import android.health.connect.InsertRecordsResponse;
import android.net.Uri;
import android.text.GraphemeClusterSegmentFinder;
import android.text.TextPaint;
import android.window.SurfaceSyncGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i {
    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* synthetic */ WebSourceRegistrationRequest.Builder d(ArrayList arrayList, Uri uri) {
        return new WebSourceRegistrationRequest.Builder(arrayList, uri);
    }

    public static /* synthetic */ WebTriggerParams.Builder g(Uri uri) {
        return new WebTriggerParams.Builder(uri);
    }

    public static /* synthetic */ WebTriggerRegistrationRequest.Builder i(ArrayList arrayList, Uri uri) {
        return new WebTriggerRegistrationRequest.Builder(arrayList, uri);
    }

    public static /* bridge */ /* synthetic */ HealthConnectManager m(Object obj) {
        return (HealthConnectManager) obj;
    }

    public static /* bridge */ /* synthetic */ InsertRecordsResponse n(Object obj) {
        return (InsertRecordsResponse) obj;
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder p(TextPaint textPaint, String str) {
        return new GraphemeClusterSegmentFinder(str, textPaint);
    }

    public static /* synthetic */ SurfaceSyncGroup q() {
        return new SurfaceSyncGroup("exo-sync-b-334901521");
    }

    public static /* synthetic */ void s() {
    }
}
