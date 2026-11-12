package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes5.dex */
public final class GDIInReachWeatherExtension {
    public static final int INREACH_WEATHER_SERVICE_FIELD_NUMBER = 34;
    private static Descriptors.FileDescriptor descriptor;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInReachWeather.InReachWeatherService> inreachWeatherService;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIInReachWeather.InReachWeatherService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDIInReachWeather.InReachWeatherService.class, GDIInReachWeather.InReachWeatherService.getDefaultInstance());
        inreachWeatherService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n GDIInReachWeatherExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0017GDIInReachWeather.proto:h\n\u0017inreach_weather_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\" \u0001(\u000b2/.GDI.Proto.InReachWeather.InReachWeatherServiceB:\n\u001acom.garmin.proto.generatedB\u001aGDIInReachWeatherExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDIInReachWeather.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDIInReachWeather.getDescriptor();
    }

    private GDIInReachWeatherExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(inreachWeatherService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
