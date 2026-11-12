package com.garmin.android.apps.connectmobile.gfdi.protobuf;

import com.garmin.proto.generated.GDISimpleSetup;
import com.garmin.proto.generated.GDISimpleSetupExtension;
import com.garmin.proto.generated.GDISmartProto;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"TAG", "", "setSimpleSetupService", "", "Lcom/garmin/proto/generated/GDISmartProto$Smart$Builder;", "service", "Lcom/garmin/proto/generated/GDISimpleSetup$SimpleSetupService$Builder;", "app_vanillaRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class SimpleSetupProtoManagerKt {
    private static final String TAG = "SimpleSetupProtoManager";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSimpleSetupService(GDISmartProto.Smart.Builder builder, GDISimpleSetup.SimpleSetupService.Builder builder2) {
        builder.setExtension(GDISimpleSetupExtension.simpleSetupService, builder2.build());
    }
}
