package com.google.maps.android;

import com.airbnb.lottie.parser.moshi.a;
import com.google.android.gms.maps.model.LatLng;
import ge1.b;
import o53.s0;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import t13.d;
import x53.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/maps/android/StreetViewUtils;", "", "<init>", "()V", "Companion", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StreetViewUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/maps/android/StreetViewUtils$Companion;", "", "<init>", "()V", "", "responseString", "Lcom/google/maps/android/ResponseStreetView;", "deserializeResponse", "(Ljava/lang/String;)Lcom/google/maps/android/ResponseStreetView;", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "apiKey", "Lcom/google/maps/android/Source;", "source", "Lcom/google/maps/android/Status;", "fetchStreetViewData", "(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;Lcom/google/maps/android/Source;Lt13/d;)Ljava/lang/Object;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ResponseStreetView deserializeResponse(String responseString) {
            String strOptString = new JSONObject(responseString).optString("status");
            strOptString.getClass();
            return new ResponseStreetView(Status.valueOf(strOptString));
        }

        public static /* synthetic */ Object fetchStreetViewData$default(Companion companion, LatLng latLng, String str, Source source, d dVar, int i14, Object obj) {
            if ((i14 & 4) != 0) {
                source = Source.DEFAULT;
            }
            return companion.fetchStreetViewData(latLng, str, source, dVar);
        }

        public final Object fetchStreetViewData(LatLng latLng, String str, Source source, d<? super Status> dVar) {
            StringBuilder sb3 = new StringBuilder("https://maps.googleapis.com/maps/api/streetview/metadata");
            double d14 = latLng.latitude;
            double d15 = latLng.longitude;
            StringBuilder sbA = a.a("?location=", d14, ",");
            sbA.append(d15);
            sb3.append(sbA.toString());
            sb3.append("&key=" + str);
            sb3.append("&source=" + source.getValue());
            String string = sb3.toString();
            c cVar = s0.f129406a;
            return b.e0(x53.b.f189152a, new StreetViewUtils$Companion$fetchStreetViewData$2(string, null), dVar);
        }

        private Companion() {
        }
    }
}
