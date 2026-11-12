package rs2;

import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.ExtensionRegistryLite;

/* JADX INFO: loaded from: classes.dex */
public interface g extends f {
    void onExtensionsRegistered(ExtensionRegistryLite extensionRegistryLite);

    void onProtobufRequest(int i14, GDISmartProto.Smart smart);

    void onProtobufRespond(int i14, GDISmartProto.Smart smart);

    void onReceiveResponse(int i14, GDISmartProto.Smart smart);

    void onSendNotification(int i14, GDISmartProto.Smart smart);

    void onSendRequest(int i14, GDISmartProto.Smart smart);
}
