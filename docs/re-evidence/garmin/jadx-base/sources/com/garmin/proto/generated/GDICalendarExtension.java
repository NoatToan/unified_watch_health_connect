package com.garmin.proto.generated;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes11.dex */
public final class GDICalendarExtension {
    public static final int CALENDAR_EVENTS_SERVICE_FIELD_NUMBER = 1;
    public static final GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDICalendarProto.CalendarService> calendarEventsService;
    private static Descriptors.FileDescriptor descriptor;

    static {
        GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDICalendarProto.CalendarService> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(GDICalendarProto.CalendarService.class, GDICalendarProto.CalendarService.getDefaultInstance());
        calendarEventsService = generatedExtensionNewFileScopedGeneratedExtension;
        Descriptors.FileDescriptor fileDescriptorInternalBuildGeneratedFileFrom = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001aGDICalendarExtension.proto\u0012\u000fGDI.Proto.Smart\u001a\u000eGDISmart.proto\u001a\u0011GDICalendar.proto:\\\n\u0017calendar_events_service\u0012\u0016.GDI.Proto.Smart.Smart\u0018\u0001 \u0001(\u000b2#.GDI.Proto.Calendar.CalendarServiceB4\n\u001acom.garmin.proto.generatedB\u0014GDICalendarExtensionH\u0003"}, new Descriptors.FileDescriptor[]{GDISmartProto.getDescriptor(), GDICalendarProto.getDescriptor()});
        descriptor = fileDescriptorInternalBuildGeneratedFileFrom;
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(fileDescriptorInternalBuildGeneratedFileFrom.getExtensions().get(0));
        GDISmartProto.getDescriptor();
        GDICalendarProto.getDescriptor();
    }

    private GDICalendarExtension() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(calendarEventsService);
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
