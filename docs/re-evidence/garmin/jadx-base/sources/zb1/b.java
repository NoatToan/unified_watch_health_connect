package zb1;

import com.garmin.proto.generated.GDICore;
import com.garmin.proto.generated.GDIDataTypes;
import com.garmin.proto.generated.WifiSetup;
import i22.d;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes9.dex */
public class b {
    public static WifiSetup.GcsLocationType a() {
        if (((f12.b) KoinJavaComponent.get(f12.b.class)).i()) {
            return WifiSetup.GcsLocationType.PRODUCTION;
        }
        if (((f12.b) KoinJavaComponent.get(f12.b.class)).f()) {
            return WifiSetup.GcsLocationType.CHINA;
        }
        return ((f12.b) KoinJavaComponent.get(f12.b.class)).G() ? WifiSetup.GcsLocationType.TEST : WifiSetup.GcsLocationType.TEST;
    }

    public static GDICore.LocationData.Builder b(d dVar) {
        GDICore.LocationData.Builder builderNewBuilder = GDICore.LocationData.newBuilder();
        GDIDataTypes.ScPoint.Builder builderNewBuilder2 = GDIDataTypes.ScPoint.newBuilder();
        builderNewBuilder2.setLat(lb2.b.a(dVar.getLatitude()));
        builderNewBuilder2.setLon(lb2.b.a(dVar.getLongitude()));
        builderNewBuilder.setPosition(builderNewBuilder2);
        builderNewBuilder.setAltitude(dVar.getAltitude());
        builderNewBuilder.setTimestamp((int) ((dVar.getTimestamp() / 1000) - 631065600));
        builderNewBuilder.setHorizontalAccuracy(dVar.getHorizAccuracy());
        builderNewBuilder.setVerticalAccuracy(dVar.getVertAccuracy());
        builderNewBuilder.setDatatype(dVar.getDataType());
        builderNewBuilder.setCourse(dVar.getCourse());
        builderNewBuilder.setSpeed(dVar.getSpeed());
        return builderNewBuilder;
    }
}
