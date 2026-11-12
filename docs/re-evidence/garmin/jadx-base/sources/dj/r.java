package dj;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceParams;
import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r {
    public static /* synthetic */ DeletionRequest.Builder a() {
        return new DeletionRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ MeasurementManager g(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* synthetic */ WebSourceParams.Builder i(Uri uri) {
        return new WebSourceParams.Builder(uri);
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return MeasurementManager.class;
    }

    public static /* synthetic */ void n() {
    }
}
