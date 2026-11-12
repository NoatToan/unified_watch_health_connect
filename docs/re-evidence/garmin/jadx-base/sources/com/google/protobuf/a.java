package com.google.protobuf;

import com.google.android.gms.tasks.OnFailureListener;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.FlushOperationResultCallback;
import com.mapbox.common.location.GoogleDeviceLocationProvider;
import com.mapbox.common.module.MapboxHttpClient;
import com.mapbox.common.module.cronet.LazyEngine;
import com.mapbox.common.module.okhttp.NetworkUsageListener;
import com.mapbox.maps.FeatureStateOperationCallback;
import com.mapbox.maps.MapLoadingError;
import com.mapbox.maps.MapLoadingErrorDelegate;
import com.mapbox.maps.MapProvider;
import okhttp3.Call;
import okhttp3.EventListener;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements OnFailureListener, Expected.Transformer, EventListener.Factory, FlushOperationResultCallback, FeatureStateOperationCallback, MapLoadingErrorDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54342a;

    public /* synthetic */ a(int i14) {
        this.f54342a = i14;
    }

    public static String a(String str, String str2, StringBuilder sb3) {
        sb3.append(RecordUtils.fieldToString(str));
        sb3.append(str2);
        return sb3.toString();
    }

    public static /* synthetic */ void b() {
        throw new OutOfMemoryError();
    }

    public static void c(double d14, String str, StringBuilder sb3) {
        sb3.append(RecordUtils.fieldToString(Double.valueOf(d14)));
        sb3.append(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void d(int i14, int i15) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i14) + ((Object) " at index ") + i15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(int i14, long j8) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i14) + ((Object) " at index ") + j8);
    }

    public static /* synthetic */ void f(int i14, Object obj) {
        throw new IllegalStateException("Source subfield " + i14 + ((Object) " is present but null: ") + obj);
    }

    public static /* synthetic */ void g(long j8) {
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + j8);
    }

    public static void h(long j8, String str, StringBuilder sb3) {
        sb3.append(RecordUtils.fieldToString(Long.valueOf(j8)));
        sb3.append(str);
    }

    public static /* synthetic */ void i(Object obj, Object obj2) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append(obj2);
        throw new IllegalArgumentException(sb3.toString());
    }

    public static /* synthetic */ void j(Object obj, String str) throws InvalidProtocolBufferException {
        throw new InvalidProtocolBufferException(str + obj);
    }

    public static void k(String str, String str2, StringBuilder sb3) {
        sb3.append(RecordUtils.fieldToString(str));
        sb3.append(str2);
    }

    public static /* synthetic */ void l(String str, Object[] objArr) {
        throw new ArrayIndexOutOfBoundsException(String.format(str, objArr));
    }

    public static /* synthetic */ void m() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void n(int i14, int i15) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i14) + ((Object) " at index ") + i15);
    }

    public static /* synthetic */ void o(Object obj, String str) throws InvalidProtocolBufferException {
        throw new InvalidProtocolBufferException(str + obj);
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return NetworkUsageListener.lambda$static$0(call);
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        return MapboxHttpClient.getLifeCycleStateCallback$lambda$4$lambda$3((String) obj);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.f54342a) {
            case 14:
                GoogleDeviceLocationProvider.removeLocationUpdates$lambda$10(exc);
                break;
            case 15:
                GoogleDeviceLocationProvider.requestLocationUpdates$lambda$8(exc);
                break;
            default:
                LazyEngine.tryInstallFromGooglePlay$lambda$2(exc);
                break;
        }
    }

    @Override // com.mapbox.common.FlushOperationResultCallback, com.mapbox.maps.FeatureStateOperationCallback
    public void run(Expected expected) {
        switch (this.f54342a) {
            case 20:
                MapProvider.flushPendingEvents$lambda$1(expected);
                break;
            case 21:
                MapProvider.flushPendingEvents$lambda$3(expected);
                break;
            case 22:
                expected.getClass();
                break;
            case 23:
            default:
                expected.getClass();
                break;
            case 24:
                expected.getClass();
                break;
            case 25:
                expected.getClass();
                break;
            case 26:
                expected.getClass();
                break;
        }
    }

    @Override // com.mapbox.maps.MapLoadingErrorDelegate
    public void sendMapLoadingError(MapLoadingError mapLoadingError) {
        switch (this.f54342a) {
            case 23:
                mapLoadingError.getClass();
                break;
            case 28:
                mapLoadingError.getClass();
                break;
            default:
                mapLoadingError.getClass();
                break;
        }
    }
}
