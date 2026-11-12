package t8;

import android.health.connect.datatypes.DataOrigin;
import android.health.connect.datatypes.Device;
import android.health.connect.datatypes.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    public static final Metadata a(z8.c cVar) {
        Device deviceBuild;
        cVar.getClass();
        Metadata.Builder builderI = q2.o.i();
        z8.b bVar = cVar.f202973g;
        if (bVar != null) {
            Device.Builder builderD = q2.o.d();
            String str = bVar.f202964b;
            if (str != null) {
                builderD.setManufacturer(str);
            }
            String str2 = bVar.f202965c;
            if (str2 != null) {
                builderD.setModel(str2);
            }
            try {
                Integer num = (Integer) a.f163151w.get(Integer.valueOf(bVar.f202963a));
                deviceBuild = builderD.setType(num != null ? num.intValue() : 0).build();
                deviceBuild.getClass();
            } catch (IllegalArgumentException unused) {
                Integer num2 = (Integer) a.f163151w.get(0);
                deviceBuild = builderD.setType(num2 != null ? num2.intValue() : 0).build();
                deviceBuild.getClass();
            }
            builderI.setDevice(deviceBuild);
        }
        builderI.setLastModifiedTime(cVar.f202970d);
        builderI.setId(cVar.f202968b);
        z8.a aVar = cVar.f202969c;
        aVar.getClass();
        DataOrigin.Builder builderB = q2.o.b();
        builderB.setPackageName(aVar.f202962a);
        DataOrigin dataOriginBuild = builderB.build();
        dataOriginBuild.getClass();
        builderI.setDataOrigin(dataOriginBuild);
        builderI.setClientRecordId(cVar.f202971e);
        builderI.setClientRecordVersion(cVar.f202972f);
        Integer num3 = (Integer) a.f163148t.get(Integer.valueOf(cVar.f202967a));
        builderI.setRecordingMethod(num3 != null ? num3.intValue() : 0);
        Metadata metadataBuild = builderI.build();
        metadataBuild.getClass();
        return metadataBuild;
    }
}
