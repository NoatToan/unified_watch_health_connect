package com.garmin.proto.generated;

import com.garmin.android.apps.connectmobile.f3;
import com.google.common.net.HttpHeaders;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public final class GDICalendarProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011GDICalendar.proto\u0012\u0012GDI.Proto.Calendar\u001a\rGDICore.proto\u001a\u0012GDIDataTypes.proto\"«\u0002\n\u000fCalendarService\u0012J\n\u0017calendar_events_request\u0018\u0001 \u0001(\u000b2).GDI.Proto.Calendar.CalendarEventsRequest\u0012L\n\u0018calendar_events_response\u0018\u0002 \u0001(\u000b2*.GDI.Proto.Calendar.CalendarEventsResponse\u0012=\n\u0010calendar_request\u0018\u0003 \u0001(\u000b2#.GDI.Proto.Calendar.CalendarRequest\u0012?\n\u0011calendar_response\u0018\u0004 \u0001(\u000b2$.GDI.Proto.Calendar.CalendarResponse\"½\u0003\n\u0015CalendarEventsRequest\u0012\u0012\n\nstart_date\u0018\u0001 \u0001(\u0004\u0012\u0010\n\bend_date\u0018\u0002 \u0001(\u0004\u0012 \n\u0011include_organizer\u0018\u0003 \u0001(\b:\u0005false\u0012\u001b\n\rinclude_title\u0018\u0004 \u0001(\b:\u0004true\u0012\u001e\n\u0010include_location\u0018\u0005 \u0001(\b:\u0004true\u0012\"\n\u0013include_description\u0018\u0006 \u0001(\b:\u0005false\u0012 \n\u0012include_start_date\u0018\u0007 \u0001(\b:\u0004true\u0012\u001f\n\u0010include_end_date\u0018\b \u0001(\b:\u0005false\u0012\u001e\n\u000finclude_all_day\u0018\t \u0001(\b:\u0005false\u0012\u001f\n\u0014max_organizer_length\u0018\n \u0001(\r:\u00010\u0012\u001b\n\u0010max_title_length\u0018\u000b \u0001(\r:\u00010\u0012\u001e\n\u0013max_location_length\u0018\f \u0001(\r:\u00010\u0012!\n\u0016max_description_length\u0018\r \u0001(\r:\u00010\u0012\u0017\n\nmax_events\u0018\u000e \u0001(\r:\u0003100\"å\u0001\n\u0016CalendarEventsResponse\u0012I\n\u0006status\u0018\u0001 \u0001(\u000e29.GDI.Proto.Calendar.CalendarEventsResponse.ResponseStatus\u00121\n\u0006events\u0018\u0002 \u0003(\u000b2!.GDI.Proto.Calendar.CalendarEvent\"M\n\u000eResponseStatus\u0012\u001b\n\u0017UNKNOWN_RESPONSE_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0016\n\u0012INVALID_DATE_RANGE\u0010\u0002\"®\u0001\n\rCalendarEvent\u0012\u0011\n\torganizer\u0018\u0001 \u0001(\t\u0012\r\n\u0005title\u0018\u0002 \u0001(\t\u0012\u0010\n\blocation\u0018\u0003 \u0001(\t\u0012\u0013\n\u000bdescription\u0018\u0004 \u0001(\t\u0012\u0012\n\nstart_date\u0018\u0005 \u0001(\u0004\u0012\u0010\n\bend_date\u0018\u0006 \u0001(\u0004\u0012\u000f\n\u0007all_day\u0018\u0007 \u0001(\b\u0012\u001d\n\u0015reminder_time_in_secs\u0018\b \u0003(\r\"°\u0001\n\u0013CapabilitiesRequest\u0012!\n\u0019calendar_features_version\u0018\u0001 \u0001(\r2v\n\u0019expanded_calendar_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018' \u0001(\u000b2'.GDI.Proto.Calendar.CapabilitiesRequest\"´\u0001\n\u0014CapabilitiesResponse\u0012!\n\u0019calendar_features_version\u0018\u0001 \u0001(\r2y\n\u001aexpanded_calendar_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018' \u0001(\u000b2(.GDI.Proto.Calendar.CapabilitiesResponse\"ã\u0002\n\u000fCalendarRequest\u0012\u0012\n\nstart_date\u0018\u0001 \u0001(\u0004\u0012\u0010\n\bend_date\u0018\u0002 \u0001(\u0004\u0012\u0015\n\rinclude_title\u0018\u0003 \u0001(\b\u0012\u0018\n\u0010include_location\u0018\u0004 \u0001(\b\u0012\u001b\n\u0013include_description\u0018\u0005 \u0001(\b\u0012\u0019\n\u0011include_attendees\u0018\u0006 \u0001(\b\u0012\u0012\n\nmax_events\u0018\u0007 \u0001(\r\u0012\u0015\n\rmax_calendars\u0018\b \u0001(\r\u0012\u0015\n\rmax_attendees\u0018\t \u0001(\r\u0012\u0018\n\u0010max_title_length\u0018\n \u0001(\r\u0012\u001b\n\u0013max_location_length\u0018\u000b \u0001(\r\u0012\u001e\n\u0016max_description_length\u0018\f \u0001(\r\u0012\u0012\n\ncal_hashes\u0018\r \u0003(\f\u0012\u0014\n\fevent_hashes\u0018\u000e \u0003(\f\"ù\u0001\n\u0010CalendarResponse\u0012C\n\u0006status\u0018\u0001 \u0001(\u000e23.GDI.Proto.Calendar.CalendarResponse.ResponseStatus\u00128\n\txfer_data\u0018\u0002 \u0001(\u000b2%.GDI.Proto.DataTypes.DataTransferItem\"f\n\u000eResponseStatus\u0012\u001b\n\u0017UNKNOWN_RESPONSE_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0016\n\u0012INVALID_DATE_RANGE\u0010\u0002\u0012\u0017\n\u0013PERMISSION_REQUIRED\u0010\u0003\"¤\u0001\n\fCalendarFile\u0012\u001a\n\u0012deleted_cal_hashes\u0018\u0001 \u0003(\f\u0012\u001c\n\u0014deleted_event_hashes\u0018\u0002 \u0003(\f\u0012/\n\tcalendars\u0018\u0003 \u0003(\u000b2\u001c.GDI.Proto.Calendar.Calendar\u0012)\n\u0006events\u0018\u0004 \u0003(\u000b2\u0019.GDI.Proto.Calendar.Event\"J\n\bCalendar\u0012\f\n\u0004hash\u0018\u0001 \u0001(\f\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012\u0013\n\u000bcalendar_id\u0018\u0003 \u0001(\t\u0012\r\n\u0005color\u0018\u0004 \u0001(\r\"ê\u0001\n\u0005Event\u0012\f\n\u0004hash\u0018\u0001 \u0001(\f\u0012\u0013\n\u000bcalendar_id\u0018\u0002 \u0001(\t\u0012\u0012\n\nstart_date\u0018\u0003 \u0001(\u0004\u0012\u0010\n\bend_date\u0018\u0004 \u0001(\u0004\u0012\u000f\n\u0007all_day\u0018\u0005 \u0001(\b\u0012\r\n\u0005title\u0018\u0006 \u0001(\t\u0012\u0010\n\blocation\u0018\u0007 \u0001(\t\u0012\u0013\n\u000bdescription\u0018\b \u0001(\t\u0012\u000f\n\u0007pos_lat\u0018\t \u0001(\u0002\u0012\u000f\n\u0007pos_lon\u0018\n \u0001(\u0002\u0012/\n\tattendees\u0018\u000b \u0003(\u000b2\u001c.GDI.Proto.Calendar.Attendee\"\u009f\u0001\n\bAttendee\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012;\n\u0006status\u0018\u0002 \u0001(\u000e2+.GDI.Proto.Calendar.Attendee.AttendeeStatus\"H\n\u000eAttendeeStatus\u0012\f\n\bACCEPTED\u0010\u0000\u0012\f\n\bDECLINED\u0010\u0001\u0012\r\n\tTENTATIVE\u0010\u0002\u0012\u000b\n\u0007PENDING\u0010\u0003B0\n\u001acom.garmin.proto.generatedB\u0010GDICalendarProtoH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor(), GDIDataTypes.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Calendar_Attendee_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Calendar_Attendee_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Calendar_CalendarEvent_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Calendar_CalendarEvent_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Calendar_CalendarEventsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Calendar_CalendarEventsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Calendar_CalendarEventsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Calendar_CalendarEventsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Calendar_CalendarFile_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Calendar_CalendarFile_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Calendar_CalendarRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Calendar_CalendarRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Calendar_CalendarResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Calendar_CalendarResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Calendar_CalendarService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Calendar_CalendarService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Calendar_Calendar_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Calendar_Calendar_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Calendar_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Calendar_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Calendar_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Calendar_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Calendar_Event_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Calendar_Event_fieldAccessorTable;

    public interface AttendeeOrBuilder extends MessageOrBuilder {
        String getName();

        ByteString getNameBytes();

        Attendee.AttendeeStatus getStatus();

        boolean hasName();

        boolean hasStatus();
    }

    public interface CalendarEventOrBuilder extends MessageOrBuilder {
        boolean getAllDay();

        String getDescription();

        ByteString getDescriptionBytes();

        long getEndDate();

        String getLocation();

        ByteString getLocationBytes();

        String getOrganizer();

        ByteString getOrganizerBytes();

        int getReminderTimeInSecs(int i14);

        int getReminderTimeInSecsCount();

        List<Integer> getReminderTimeInSecsList();

        long getStartDate();

        String getTitle();

        ByteString getTitleBytes();

        boolean hasAllDay();

        boolean hasDescription();

        boolean hasEndDate();

        boolean hasLocation();

        boolean hasOrganizer();

        boolean hasStartDate();

        boolean hasTitle();
    }

    public interface CalendarEventsRequestOrBuilder extends MessageOrBuilder {
        long getEndDate();

        boolean getIncludeAllDay();

        boolean getIncludeDescription();

        boolean getIncludeEndDate();

        boolean getIncludeLocation();

        boolean getIncludeOrganizer();

        boolean getIncludeStartDate();

        boolean getIncludeTitle();

        int getMaxDescriptionLength();

        int getMaxEvents();

        int getMaxLocationLength();

        int getMaxOrganizerLength();

        int getMaxTitleLength();

        long getStartDate();

        boolean hasEndDate();

        boolean hasIncludeAllDay();

        boolean hasIncludeDescription();

        boolean hasIncludeEndDate();

        boolean hasIncludeLocation();

        boolean hasIncludeOrganizer();

        boolean hasIncludeStartDate();

        boolean hasIncludeTitle();

        boolean hasMaxDescriptionLength();

        boolean hasMaxEvents();

        boolean hasMaxLocationLength();

        boolean hasMaxOrganizerLength();

        boolean hasMaxTitleLength();

        boolean hasStartDate();
    }

    public interface CalendarEventsResponseOrBuilder extends MessageOrBuilder {
        CalendarEvent getEvents(int i14);

        int getEventsCount();

        List<CalendarEvent> getEventsList();

        CalendarEventOrBuilder getEventsOrBuilder(int i14);

        List<? extends CalendarEventOrBuilder> getEventsOrBuilderList();

        CalendarEventsResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface CalendarFileOrBuilder extends MessageOrBuilder {
        Calendar getCalendars(int i14);

        int getCalendarsCount();

        List<Calendar> getCalendarsList();

        CalendarOrBuilder getCalendarsOrBuilder(int i14);

        List<? extends CalendarOrBuilder> getCalendarsOrBuilderList();

        ByteString getDeletedCalHashes(int i14);

        int getDeletedCalHashesCount();

        List<ByteString> getDeletedCalHashesList();

        ByteString getDeletedEventHashes(int i14);

        int getDeletedEventHashesCount();

        List<ByteString> getDeletedEventHashesList();

        Event getEvents(int i14);

        int getEventsCount();

        List<Event> getEventsList();

        EventOrBuilder getEventsOrBuilder(int i14);

        List<? extends EventOrBuilder> getEventsOrBuilderList();
    }

    public interface CalendarOrBuilder extends MessageOrBuilder {
        String getCalendarId();

        ByteString getCalendarIdBytes();

        int getColor();

        ByteString getHash();

        String getName();

        ByteString getNameBytes();

        boolean hasCalendarId();

        boolean hasColor();

        boolean hasHash();

        boolean hasName();
    }

    public interface CalendarRequestOrBuilder extends MessageOrBuilder {
        ByteString getCalHashes(int i14);

        int getCalHashesCount();

        List<ByteString> getCalHashesList();

        long getEndDate();

        ByteString getEventHashes(int i14);

        int getEventHashesCount();

        List<ByteString> getEventHashesList();

        boolean getIncludeAttendees();

        boolean getIncludeDescription();

        boolean getIncludeLocation();

        boolean getIncludeTitle();

        int getMaxAttendees();

        int getMaxCalendars();

        int getMaxDescriptionLength();

        int getMaxEvents();

        int getMaxLocationLength();

        int getMaxTitleLength();

        long getStartDate();

        boolean hasEndDate();

        boolean hasIncludeAttendees();

        boolean hasIncludeDescription();

        boolean hasIncludeLocation();

        boolean hasIncludeTitle();

        boolean hasMaxAttendees();

        boolean hasMaxCalendars();

        boolean hasMaxDescriptionLength();

        boolean hasMaxEvents();

        boolean hasMaxLocationLength();

        boolean hasMaxTitleLength();

        boolean hasStartDate();
    }

    public interface CalendarResponseOrBuilder extends MessageOrBuilder {
        CalendarResponse.ResponseStatus getStatus();

        GDIDataTypes.DataTransferItem getXferData();

        GDIDataTypes.DataTransferItemOrBuilder getXferDataOrBuilder();

        boolean hasStatus();

        boolean hasXferData();
    }

    public interface CalendarServiceOrBuilder extends MessageOrBuilder {
        CalendarEventsRequest getCalendarEventsRequest();

        CalendarEventsRequestOrBuilder getCalendarEventsRequestOrBuilder();

        CalendarEventsResponse getCalendarEventsResponse();

        CalendarEventsResponseOrBuilder getCalendarEventsResponseOrBuilder();

        CalendarRequest getCalendarRequest();

        CalendarRequestOrBuilder getCalendarRequestOrBuilder();

        CalendarResponse getCalendarResponse();

        CalendarResponseOrBuilder getCalendarResponseOrBuilder();

        boolean hasCalendarEventsRequest();

        boolean hasCalendarEventsResponse();

        boolean hasCalendarRequest();

        boolean hasCalendarResponse();
    }

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
        int getCalendarFeaturesVersion();

        boolean hasCalendarFeaturesVersion();
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        int getCalendarFeaturesVersion();

        boolean hasCalendarFeaturesVersion();
    }

    public interface EventOrBuilder extends MessageOrBuilder {
        boolean getAllDay();

        Attendee getAttendees(int i14);

        int getAttendeesCount();

        List<Attendee> getAttendeesList();

        AttendeeOrBuilder getAttendeesOrBuilder(int i14);

        List<? extends AttendeeOrBuilder> getAttendeesOrBuilderList();

        String getCalendarId();

        ByteString getCalendarIdBytes();

        String getDescription();

        ByteString getDescriptionBytes();

        long getEndDate();

        ByteString getHash();

        String getLocation();

        ByteString getLocationBytes();

        float getPosLat();

        float getPosLon();

        long getStartDate();

        String getTitle();

        ByteString getTitleBytes();

        boolean hasAllDay();

        boolean hasCalendarId();

        boolean hasDescription();

        boolean hasEndDate();

        boolean hasHash();

        boolean hasLocation();

        boolean hasPosLat();

        boolean hasPosLon();

        boolean hasStartDate();

        boolean hasTitle();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_Calendar_CalendarService_descriptor = descriptor2;
        internal_static_GDI_Proto_Calendar_CalendarService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"CalendarEventsRequest", "CalendarEventsResponse", "CalendarRequest", "CalendarResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_Calendar_CalendarEventsRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_Calendar_CalendarEventsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"StartDate", "EndDate", "IncludeOrganizer", "IncludeTitle", "IncludeLocation", "IncludeDescription", "IncludeStartDate", "IncludeEndDate", "IncludeAllDay", "MaxOrganizerLength", "MaxTitleLength", "MaxLocationLength", "MaxDescriptionLength", "MaxEvents"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_Calendar_CalendarEventsResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_Calendar_CalendarEventsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Status", "Events"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_Calendar_CalendarEvent_descriptor = descriptor5;
        internal_static_GDI_Proto_Calendar_CalendarEvent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Organizer", "Title", HttpHeaders.LOCATION, "Description", "StartDate", "EndDate", "AllDay", "ReminderTimeInSecs"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_Calendar_CapabilitiesRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_Calendar_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"CalendarFeaturesVersion"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_Calendar_CapabilitiesResponse_descriptor = descriptor7;
        internal_static_GDI_Proto_Calendar_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"CalendarFeaturesVersion"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_Calendar_CalendarRequest_descriptor = descriptor8;
        internal_static_GDI_Proto_Calendar_CalendarRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"StartDate", "EndDate", "IncludeTitle", "IncludeLocation", "IncludeDescription", "IncludeAttendees", "MaxEvents", "MaxCalendars", "MaxAttendees", "MaxTitleLength", "MaxLocationLength", "MaxDescriptionLength", "CalHashes", "EventHashes"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_Calendar_CalendarResponse_descriptor = descriptor9;
        internal_static_GDI_Proto_Calendar_CalendarResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Status", "XferData"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_Calendar_CalendarFile_descriptor = descriptor10;
        internal_static_GDI_Proto_Calendar_CalendarFile_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"DeletedCalHashes", "DeletedEventHashes", "Calendars", "Events"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_Calendar_Calendar_descriptor = descriptor11;
        internal_static_GDI_Proto_Calendar_Calendar_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Hash", "Name", "CalendarId", "Color"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_Calendar_Event_descriptor = descriptor12;
        internal_static_GDI_Proto_Calendar_Event_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Hash", "CalendarId", "StartDate", "EndDate", "AllDay", "Title", HttpHeaders.LOCATION, "Description", "PosLat", "PosLon", "Attendees"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_Calendar_Attendee_descriptor = descriptor13;
        internal_static_GDI_Proto_Calendar_Attendee_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Name", "Status"});
        GDICore.getDescriptor();
        GDIDataTypes.getDescriptor();
    }

    private GDICalendarProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.expandedCalendarRequest);
        extensionRegistryLite.add(CapabilitiesResponse.expandedCalendarResponse);
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int CALENDAR_FEATURES_VERSION_FIELD_NUMBER = 1;
        public static final int EXPANDED_CALENDAR_REQUEST_FIELD_NUMBER = 39;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int calendarFeaturesVersion_;
        private byte memoizedIsInitialized;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDICalendarProto.CapabilitiesRequest.1
            @Override // com.google.protobuf.Parser
            public CapabilitiesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CapabilitiesRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, CapabilitiesRequest> expandedCalendarRequest = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesRequest.class, getDefaultInstance());

        private CapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.calendarFeaturesVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_CapabilitiesRequest_descriptor;
        }

        public static Builder newBuilder(CapabilitiesRequest capabilitiesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(capabilitiesRequest);
        }

        public static CapabilitiesRequest parseDelimitedFrom(InputStream inputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CapabilitiesRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CapabilitiesRequest)) {
                return super.equals(obj);
            }
            CapabilitiesRequest capabilitiesRequest = (CapabilitiesRequest) obj;
            if (hasCalendarFeaturesVersion() != capabilitiesRequest.hasCalendarFeaturesVersion()) {
                return false;
            }
            return (!hasCalendarFeaturesVersion() || getCalendarFeaturesVersion() == capabilitiesRequest.getCalendarFeaturesVersion()) && getUnknownFields().equals(capabilitiesRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CapabilitiesRequestOrBuilder
        public int getCalendarFeaturesVersion() {
            return this.calendarFeaturesVersion_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CapabilitiesRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.calendarFeaturesVersion_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CapabilitiesRequestOrBuilder
        public boolean hasCalendarFeaturesVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCalendarFeaturesVersion()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCalendarFeaturesVersion();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CapabilitiesRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.calendarFeaturesVersion_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesRequestOrBuilder {
            private int bitField0_;
            private int calendarFeaturesVersion_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CapabilitiesRequest capabilitiesRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    capabilitiesRequest.calendarFeaturesVersion_ = this.calendarFeaturesVersion_;
                } else {
                    i14 = 0;
                }
                capabilitiesRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesRequest build() {
                CapabilitiesRequest capabilitiesRequestBuildPartial = buildPartial();
                if (capabilitiesRequestBuildPartial.isInitialized()) {
                    return capabilitiesRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) capabilitiesRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesRequest buildPartial() {
                CapabilitiesRequest capabilitiesRequest = new CapabilitiesRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(capabilitiesRequest);
                }
                onBuilt();
                return capabilitiesRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.calendarFeaturesVersion_ = 0;
                return this;
            }

            public Builder clearCalendarFeaturesVersion() {
                this.bitField0_ &= -2;
                this.calendarFeaturesVersion_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CapabilitiesRequestOrBuilder
            public int getCalendarFeaturesVersion() {
                return this.calendarFeaturesVersion_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CapabilitiesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CapabilitiesRequestOrBuilder
            public boolean hasCalendarFeaturesVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.calendarFeaturesVersion_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setCalendarFeaturesVersion(int i14) {
                this.calendarFeaturesVersion_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CapabilitiesRequest getDefaultInstanceForType() {
                return CapabilitiesRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CapabilitiesRequest) {
                    return mergeFrom((CapabilitiesRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CapabilitiesRequest capabilitiesRequest) {
                if (capabilitiesRequest == CapabilitiesRequest.getDefaultInstance()) {
                    return this;
                }
                if (capabilitiesRequest.hasCalendarFeaturesVersion()) {
                    setCalendarFeaturesVersion(capabilitiesRequest.getCalendarFeaturesVersion());
                }
                mergeUnknownFields(capabilitiesRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CapabilitiesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CapabilitiesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ CapabilitiesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CapabilitiesRequest() {
            this.calendarFeaturesVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CapabilitiesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CapabilitiesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(InputStream inputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(CodedInputStream codedInputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CapabilitiesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int CALENDAR_FEATURES_VERSION_FIELD_NUMBER = 1;
        public static final int EXPANDED_CALENDAR_RESPONSE_FIELD_NUMBER = 39;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int calendarFeaturesVersion_;
        private byte memoizedIsInitialized;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDICalendarProto.CapabilitiesResponse.1
            @Override // com.google.protobuf.Parser
            public CapabilitiesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CapabilitiesResponse.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, CapabilitiesResponse> expandedCalendarResponse = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesResponse.class, getDefaultInstance());

        private CapabilitiesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.calendarFeaturesVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_CapabilitiesResponse_descriptor;
        }

        public static Builder newBuilder(CapabilitiesResponse capabilitiesResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(capabilitiesResponse);
        }

        public static CapabilitiesResponse parseDelimitedFrom(InputStream inputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CapabilitiesResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CapabilitiesResponse)) {
                return super.equals(obj);
            }
            CapabilitiesResponse capabilitiesResponse = (CapabilitiesResponse) obj;
            if (hasCalendarFeaturesVersion() != capabilitiesResponse.hasCalendarFeaturesVersion()) {
                return false;
            }
            return (!hasCalendarFeaturesVersion() || getCalendarFeaturesVersion() == capabilitiesResponse.getCalendarFeaturesVersion()) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CapabilitiesResponseOrBuilder
        public int getCalendarFeaturesVersion() {
            return this.calendarFeaturesVersion_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CapabilitiesResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.calendarFeaturesVersion_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CapabilitiesResponseOrBuilder
        public boolean hasCalendarFeaturesVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCalendarFeaturesVersion()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCalendarFeaturesVersion();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CapabilitiesResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.calendarFeaturesVersion_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private int bitField0_;
            private int calendarFeaturesVersion_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    capabilitiesResponse.calendarFeaturesVersion_ = this.calendarFeaturesVersion_;
                } else {
                    i14 = 0;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CapabilitiesResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesResponse build() {
                CapabilitiesResponse capabilitiesResponseBuildPartial = buildPartial();
                if (capabilitiesResponseBuildPartial.isInitialized()) {
                    return capabilitiesResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) capabilitiesResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesResponse buildPartial() {
                CapabilitiesResponse capabilitiesResponse = new CapabilitiesResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(capabilitiesResponse);
                }
                onBuilt();
                return capabilitiesResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.calendarFeaturesVersion_ = 0;
                return this;
            }

            public Builder clearCalendarFeaturesVersion() {
                this.bitField0_ &= -2;
                this.calendarFeaturesVersion_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CapabilitiesResponseOrBuilder
            public int getCalendarFeaturesVersion() {
                return this.calendarFeaturesVersion_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CapabilitiesResponseOrBuilder
            public boolean hasCalendarFeaturesVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.calendarFeaturesVersion_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setCalendarFeaturesVersion(int i14) {
                this.calendarFeaturesVersion_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CapabilitiesResponse getDefaultInstanceForType() {
                return CapabilitiesResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CapabilitiesResponse) {
                    return mergeFrom((CapabilitiesResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CapabilitiesResponse capabilitiesResponse) {
                if (capabilitiesResponse == CapabilitiesResponse.getDefaultInstance()) {
                    return this;
                }
                if (capabilitiesResponse.hasCalendarFeaturesVersion()) {
                    setCalendarFeaturesVersion(capabilitiesResponse.getCalendarFeaturesVersion());
                }
                mergeUnknownFields(capabilitiesResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CapabilitiesResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CapabilitiesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ CapabilitiesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CapabilitiesResponse() {
            this.calendarFeaturesVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CapabilitiesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CapabilitiesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(InputStream inputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(CodedInputStream codedInputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CapabilitiesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Attendee extends GeneratedMessageV3 implements AttendeeOrBuilder {
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int STATUS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private int status_;
        private static final Attendee DEFAULT_INSTANCE = new Attendee();

        @Deprecated
        public static final Parser<Attendee> PARSER = new AbstractParser<Attendee>() { // from class: com.garmin.proto.generated.GDICalendarProto.Attendee.1
            @Override // com.google.protobuf.Parser
            public Attendee parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Attendee.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        private Attendee() {
            this.name_ = "";
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.status_ = 0;
        }

        public static Attendee getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_Attendee_descriptor;
        }

        public static Builder newBuilder(Attendee attendee) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(attendee);
        }

        public static Attendee parseDelimitedFrom(InputStream inputStream) {
            return (Attendee) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Attendee parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Attendee> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Attendee)) {
                return super.equals(obj);
            }
            Attendee attendee = (Attendee) obj;
            if (hasName() != attendee.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(attendee.getName())) && hasStatus() == attendee.hasStatus()) {
                return (!hasStatus() || this.status_ == attendee.status_) && getUnknownFields().equals(attendee.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.AttendeeOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.AttendeeOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Attendee> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.status_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.AttendeeOrBuilder
        public AttendeeStatus getStatus() {
            AttendeeStatus attendeeStatusForNumber = AttendeeStatus.forNumber(this.status_);
            return attendeeStatusForNumber == null ? AttendeeStatus.ACCEPTED : attendeeStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.AttendeeOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.AttendeeOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasName()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getName().hashCode();
            }
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.status_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_Attendee_fieldAccessorTable.ensureFieldAccessorsInitialized(Attendee.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Attendee();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AttendeeOrBuilder {
            private int bitField0_;
            private Object name_;
            private int status_;

            private Builder() {
                this.name_ = "";
                this.status_ = 0;
            }

            private void buildPartial0(Attendee attendee) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    attendee.name_ = this.name_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    attendee.status_ = this.status_;
                    i14 |= 2;
                }
                attendee.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_Attendee_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Attendee build() {
                Attendee attendeeBuildPartial = buildPartial();
                if (attendeeBuildPartial.isInitialized()) {
                    return attendeeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) attendeeBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Attendee buildPartial() {
                Attendee attendee = new Attendee(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(attendee);
                }
                onBuilt();
                return attendee;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.name_ = "";
                this.status_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearName() {
                this.name_ = Attendee.getDefaultInstance().getName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStatus() {
                this.bitField0_ &= -3;
                this.status_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_Attendee_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.AttendeeOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.AttendeeOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.AttendeeOrBuilder
            public AttendeeStatus getStatus() {
                AttendeeStatus attendeeStatusForNumber = AttendeeStatus.forNumber(this.status_);
                return attendeeStatusForNumber == null ? AttendeeStatus.ACCEPTED : attendeeStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.AttendeeOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.AttendeeOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_Attendee_fieldAccessorTable.ensureFieldAccessorsInitialized(Attendee.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (AttendeeStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.name_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(AttendeeStatus attendeeStatus) {
                attendeeStatus.getClass();
                this.bitField0_ |= 2;
                this.status_ = attendeeStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Attendee getDefaultInstanceForType() {
                return Attendee.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.status_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Attendee) {
                    return mergeFrom((Attendee) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Attendee attendee) {
                if (attendee == Attendee.getDefaultInstance()) {
                    return this;
                }
                if (attendee.hasName()) {
                    this.name_ = attendee.name_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (attendee.hasStatus()) {
                    setStatus(attendee.getStatus());
                }
                mergeUnknownFields(attendee.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Attendee getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Attendee parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Attendee) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Attendee parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Attendee parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Attendee parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Attendee parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Attendee parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Attendee parseFrom(InputStream inputStream) {
            return (Attendee) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Attendee parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Attendee) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private Attendee(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.name_ = "";
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Attendee parseFrom(CodedInputStream codedInputStream) {
            return (Attendee) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Attendee parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Attendee) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ Attendee(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public enum AttendeeStatus implements ProtocolMessageEnum {
            ACCEPTED(0),
            DECLINED(1),
            TENTATIVE(2),
            PENDING(3);

            public static final int ACCEPTED_VALUE = 0;
            public static final int DECLINED_VALUE = 1;
            public static final int PENDING_VALUE = 3;
            public static final int TENTATIVE_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<AttendeeStatus> internalValueMap = new Internal.EnumLiteMap<AttendeeStatus>() { // from class: com.garmin.proto.generated.GDICalendarProto.Attendee.AttendeeStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public AttendeeStatus findValueByNumber(int i14) {
                    return AttendeeStatus.forNumber(i14);
                }
            };
            private static final AttendeeStatus[] VALUES = values();

            AttendeeStatus(int i14) {
                this.value = i14;
            }

            public static AttendeeStatus forNumber(int i14) {
                if (i14 == 0) {
                    return ACCEPTED;
                }
                if (i14 == 1) {
                    return DECLINED;
                }
                if (i14 == 2) {
                    return TENTATIVE;
                }
                if (i14 != 3) {
                    return null;
                }
                return PENDING;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Attendee.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<AttendeeStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static AttendeeStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                h.s("EnumValueDescriptor is not for this type.");
                return null;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static AttendeeStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class Calendar extends GeneratedMessageV3 implements CalendarOrBuilder {
        public static final int CALENDAR_ID_FIELD_NUMBER = 3;
        public static final int COLOR_FIELD_NUMBER = 4;
        public static final int HASH_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object calendarId_;
        private int color_;
        private ByteString hash_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private static final Calendar DEFAULT_INSTANCE = new Calendar();

        @Deprecated
        public static final Parser<Calendar> PARSER = new AbstractParser<Calendar>() { // from class: com.garmin.proto.generated.GDICalendarProto.Calendar.1
            @Override // com.google.protobuf.Parser
            public Calendar parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Calendar.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        private Calendar() {
            ByteString byteString = ByteString.EMPTY;
            this.hash_ = byteString;
            this.name_ = "";
            this.calendarId_ = "";
            this.color_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.hash_ = byteString;
            this.name_ = "";
            this.calendarId_ = "";
        }

        public static Calendar getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_Calendar_descriptor;
        }

        public static Builder newBuilder(Calendar calendar) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(calendar);
        }

        public static Calendar parseDelimitedFrom(InputStream inputStream) {
            return (Calendar) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Calendar parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Calendar> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Calendar)) {
                return super.equals(obj);
            }
            Calendar calendar = (Calendar) obj;
            if (hasHash() != calendar.hasHash()) {
                return false;
            }
            if ((hasHash() && !getHash().equals(calendar.getHash())) || hasName() != calendar.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(calendar.getName())) || hasCalendarId() != calendar.hasCalendarId()) {
                return false;
            }
            if ((!hasCalendarId() || getCalendarId().equals(calendar.getCalendarId())) && hasColor() == calendar.hasColor()) {
                return (!hasColor() || getColor() == calendar.getColor()) && getUnknownFields().equals(calendar.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarOrBuilder
        public String getCalendarId() {
            Object obj = this.calendarId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.calendarId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarOrBuilder
        public ByteString getCalendarIdBytes() {
            Object obj = this.calendarId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.calendarId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarOrBuilder
        public int getColor() {
            return this.color_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarOrBuilder
        public ByteString getHash() {
            return this.hash_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Calendar> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.hash_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += GeneratedMessageV3.computeStringSize(2, this.name_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBytesSize += GeneratedMessageV3.computeStringSize(3, this.calendarId_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBytesSize += CodedOutputStream.computeUInt32Size(4, this.color_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarOrBuilder
        public boolean hasCalendarId() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarOrBuilder
        public boolean hasColor() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarOrBuilder
        public boolean hasHash() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasHash()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getHash().hashCode();
            }
            if (hasName()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getName().hashCode();
            }
            if (hasCalendarId()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getCalendarId().hashCode();
            }
            if (hasColor()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getColor();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_Calendar_fieldAccessorTable.ensureFieldAccessorsInitialized(Calendar.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Calendar();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.hash_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.name_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.calendarId_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.color_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CalendarOrBuilder {
            private int bitField0_;
            private Object calendarId_;
            private int color_;
            private ByteString hash_;
            private Object name_;

            private Builder() {
                this.hash_ = ByteString.EMPTY;
                this.name_ = "";
                this.calendarId_ = "";
            }

            private void buildPartial0(Calendar calendar) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    calendar.hash_ = this.hash_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    calendar.name_ = this.name_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    calendar.calendarId_ = this.calendarId_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    calendar.color_ = this.color_;
                    i14 |= 8;
                }
                calendar.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_Calendar_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Calendar build() {
                Calendar calendarBuildPartial = buildPartial();
                if (calendarBuildPartial.isInitialized()) {
                    return calendarBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) calendarBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Calendar buildPartial() {
                Calendar calendar = new Calendar(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(calendar);
                }
                onBuilt();
                return calendar;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.hash_ = ByteString.EMPTY;
                this.name_ = "";
                this.calendarId_ = "";
                this.color_ = 0;
                return this;
            }

            public Builder clearCalendarId() {
                this.calendarId_ = Calendar.getDefaultInstance().getCalendarId();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearColor() {
                this.bitField0_ &= -9;
                this.color_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHash() {
                this.bitField0_ &= -2;
                this.hash_ = Calendar.getDefaultInstance().getHash();
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = Calendar.getDefaultInstance().getName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarOrBuilder
            public String getCalendarId() {
                Object obj = this.calendarId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.calendarId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarOrBuilder
            public ByteString getCalendarIdBytes() {
                Object obj = this.calendarId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.calendarId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarOrBuilder
            public int getColor() {
                return this.color_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_Calendar_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarOrBuilder
            public ByteString getHash() {
                return this.hash_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarOrBuilder
            public boolean hasCalendarId() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarOrBuilder
            public boolean hasColor() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarOrBuilder
            public boolean hasHash() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_Calendar_fieldAccessorTable.ensureFieldAccessorsInitialized(Calendar.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.hash_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.calendarId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.color_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setCalendarId(String str) {
                str.getClass();
                this.calendarId_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setCalendarIdBytes(ByteString byteString) {
                byteString.getClass();
                this.calendarId_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setColor(int i14) {
                this.color_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setHash(ByteString byteString) {
                byteString.getClass();
                this.hash_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.name_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Calendar getDefaultInstanceForType() {
                return Calendar.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.hash_ = ByteString.EMPTY;
                this.name_ = "";
                this.calendarId_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Calendar) {
                    return mergeFrom((Calendar) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Calendar calendar) {
                if (calendar == Calendar.getDefaultInstance()) {
                    return this;
                }
                if (calendar.hasHash()) {
                    setHash(calendar.getHash());
                }
                if (calendar.hasName()) {
                    this.name_ = calendar.name_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (calendar.hasCalendarId()) {
                    this.calendarId_ = calendar.calendarId_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (calendar.hasColor()) {
                    setColor(calendar.getColor());
                }
                mergeUnknownFields(calendar.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Calendar getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Calendar parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Calendar) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Calendar parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Calendar parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Calendar parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Calendar parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Calendar parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Calendar parseFrom(InputStream inputStream) {
            return (Calendar) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Calendar parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Calendar) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Calendar parseFrom(CodedInputStream codedInputStream) {
            return (Calendar) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Calendar parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Calendar) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private Calendar(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.hash_ = ByteString.EMPTY;
            this.name_ = "";
            this.calendarId_ = "";
            this.color_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ Calendar(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class CalendarEvent extends GeneratedMessageV3 implements CalendarEventOrBuilder {
        public static final int ALL_DAY_FIELD_NUMBER = 7;
        public static final int DESCRIPTION_FIELD_NUMBER = 4;
        public static final int END_DATE_FIELD_NUMBER = 6;
        public static final int LOCATION_FIELD_NUMBER = 3;
        public static final int ORGANIZER_FIELD_NUMBER = 1;
        public static final int REMINDER_TIME_IN_SECS_FIELD_NUMBER = 8;
        public static final int START_DATE_FIELD_NUMBER = 5;
        public static final int TITLE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private boolean allDay_;
        private int bitField0_;
        private volatile Object description_;
        private long endDate_;
        private volatile Object location_;
        private byte memoizedIsInitialized;
        private volatile Object organizer_;
        private Internal.IntList reminderTimeInSecs_;
        private long startDate_;
        private volatile Object title_;
        private static final CalendarEvent DEFAULT_INSTANCE = new CalendarEvent();

        @Deprecated
        public static final Parser<CalendarEvent> PARSER = new AbstractParser<CalendarEvent>() { // from class: com.garmin.proto.generated.GDICalendarProto.CalendarEvent.1
            @Override // com.google.protobuf.Parser
            public CalendarEvent parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CalendarEvent.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        private CalendarEvent() {
            this.organizer_ = "";
            this.title_ = "";
            this.location_ = "";
            this.description_ = "";
            this.startDate_ = 0L;
            this.endDate_ = 0L;
            this.allDay_ = false;
            this.reminderTimeInSecs_ = GeneratedMessageV3.emptyIntList();
            this.memoizedIsInitialized = (byte) -1;
            this.organizer_ = "";
            this.title_ = "";
            this.location_ = "";
            this.description_ = "";
            this.reminderTimeInSecs_ = GeneratedMessageV3.emptyIntList();
        }

        public static CalendarEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarEvent_descriptor;
        }

        public static Builder newBuilder(CalendarEvent calendarEvent) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(calendarEvent);
        }

        public static CalendarEvent parseDelimitedFrom(InputStream inputStream) {
            return (CalendarEvent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CalendarEvent parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CalendarEvent> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CalendarEvent)) {
                return super.equals(obj);
            }
            CalendarEvent calendarEvent = (CalendarEvent) obj;
            if (hasOrganizer() != calendarEvent.hasOrganizer()) {
                return false;
            }
            if ((hasOrganizer() && !getOrganizer().equals(calendarEvent.getOrganizer())) || hasTitle() != calendarEvent.hasTitle()) {
                return false;
            }
            if ((hasTitle() && !getTitle().equals(calendarEvent.getTitle())) || hasLocation() != calendarEvent.hasLocation()) {
                return false;
            }
            if ((hasLocation() && !getLocation().equals(calendarEvent.getLocation())) || hasDescription() != calendarEvent.hasDescription()) {
                return false;
            }
            if ((hasDescription() && !getDescription().equals(calendarEvent.getDescription())) || hasStartDate() != calendarEvent.hasStartDate()) {
                return false;
            }
            if ((hasStartDate() && getStartDate() != calendarEvent.getStartDate()) || hasEndDate() != calendarEvent.hasEndDate()) {
                return false;
            }
            if ((!hasEndDate() || getEndDate() == calendarEvent.getEndDate()) && hasAllDay() == calendarEvent.hasAllDay()) {
                return (!hasAllDay() || getAllDay() == calendarEvent.getAllDay()) && getReminderTimeInSecsList().equals(calendarEvent.getReminderTimeInSecsList()) && getUnknownFields().equals(calendarEvent.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public boolean getAllDay() {
            return this.allDay_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public String getDescription() {
            Object obj = this.description_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.description_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public ByteString getDescriptionBytes() {
            Object obj = this.description_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.description_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public long getEndDate() {
            return this.endDate_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public String getLocation() {
            Object obj = this.location_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.location_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public ByteString getLocationBytes() {
            Object obj = this.location_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.location_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public String getOrganizer() {
            Object obj = this.organizer_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.organizer_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public ByteString getOrganizerBytes() {
            Object obj = this.organizer_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.organizer_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CalendarEvent> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public int getReminderTimeInSecs(int i14) {
            return this.reminderTimeInSecs_.getInt(i14);
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public int getReminderTimeInSecsCount() {
            return this.reminderTimeInSecs_.size();
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public List<Integer> getReminderTimeInSecsList() {
            return this.reminderTimeInSecs_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.organizer_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.title_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.location_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.description_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt64Size(5, this.startDate_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt64Size(6, this.endDate_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(7, this.allDay_);
            }
            int iB = 0;
            for (int i15 = 0; i15 < this.reminderTimeInSecs_.size(); i15++) {
                iB = f3.b(this.reminderTimeInSecs_, i15, iB);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + getReminderTimeInSecsList().size() + iComputeStringSize + iB;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public long getStartDate() {
            return this.startDate_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public String getTitle() {
            Object obj = this.title_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.title_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public ByteString getTitleBytes() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.title_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public boolean hasAllDay() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public boolean hasDescription() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public boolean hasEndDate() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public boolean hasLocation() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public boolean hasOrganizer() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public boolean hasStartDate() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
        public boolean hasTitle() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasOrganizer()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getOrganizer().hashCode();
            }
            if (hasTitle()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTitle().hashCode();
            }
            if (hasLocation()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getLocation().hashCode();
            }
            if (hasDescription()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getDescription().hashCode();
            }
            if (hasStartDate()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashLong(getStartDate());
            }
            if (hasEndDate()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Internal.hashLong(getEndDate());
            }
            if (hasAllDay()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + Internal.hashBoolean(getAllDay());
            }
            if (getReminderTimeInSecsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getReminderTimeInSecsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(CalendarEvent.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CalendarEvent();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.organizer_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.title_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.location_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.description_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt64(5, this.startDate_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt64(6, this.endDate_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeBool(7, this.allDay_);
            }
            int iC = 0;
            while (iC < this.reminderTimeInSecs_.size()) {
                iC = f3.c(this.reminderTimeInSecs_, iC, codedOutputStream, 8, iC, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CalendarEventOrBuilder {
            private boolean allDay_;
            private int bitField0_;
            private Object description_;
            private long endDate_;
            private Object location_;
            private Object organizer_;
            private Internal.IntList reminderTimeInSecs_;
            private long startDate_;
            private Object title_;

            private Builder() {
                this.organizer_ = "";
                this.title_ = "";
                this.location_ = "";
                this.description_ = "";
                this.reminderTimeInSecs_ = GeneratedMessageV3.emptyIntList();
            }

            private void buildPartial0(CalendarEvent calendarEvent) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    calendarEvent.organizer_ = this.organizer_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    calendarEvent.title_ = this.title_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    calendarEvent.location_ = this.location_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    calendarEvent.description_ = this.description_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    calendarEvent.startDate_ = this.startDate_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    calendarEvent.endDate_ = this.endDate_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    calendarEvent.allDay_ = this.allDay_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    this.reminderTimeInSecs_.makeImmutable();
                    calendarEvent.reminderTimeInSecs_ = this.reminderTimeInSecs_;
                }
                calendarEvent.bitField0_ |= i14;
            }

            private void ensureReminderTimeInSecsIsMutable() {
                if (!this.reminderTimeInSecs_.isModifiable()) {
                    this.reminderTimeInSecs_ = (Internal.IntList) GeneratedMessageV3.makeMutableCopy(this.reminderTimeInSecs_);
                }
                this.bitField0_ |= 128;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarEvent_descriptor;
            }

            public Builder addAllReminderTimeInSecs(Iterable<? extends Integer> iterable) {
                ensureReminderTimeInSecsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.reminderTimeInSecs_);
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder addReminderTimeInSecs(int i14) {
                ensureReminderTimeInSecsIsMutable();
                this.reminderTimeInSecs_.addInt(i14);
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalendarEvent build() {
                CalendarEvent calendarEventBuildPartial = buildPartial();
                if (calendarEventBuildPartial.isInitialized()) {
                    return calendarEventBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) calendarEventBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalendarEvent buildPartial() {
                CalendarEvent calendarEvent = new CalendarEvent(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(calendarEvent);
                }
                onBuilt();
                return calendarEvent;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.organizer_ = "";
                this.title_ = "";
                this.location_ = "";
                this.description_ = "";
                this.startDate_ = 0L;
                this.endDate_ = 0L;
                this.allDay_ = false;
                this.reminderTimeInSecs_ = GeneratedMessageV3.emptyIntList();
                return this;
            }

            public Builder clearAllDay() {
                this.bitField0_ &= -65;
                this.allDay_ = false;
                onChanged();
                return this;
            }

            public Builder clearDescription() {
                this.description_ = CalendarEvent.getDefaultInstance().getDescription();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearEndDate() {
                this.bitField0_ &= -33;
                this.endDate_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLocation() {
                this.location_ = CalendarEvent.getDefaultInstance().getLocation();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearOrganizer() {
                this.organizer_ = CalendarEvent.getDefaultInstance().getOrganizer();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearReminderTimeInSecs() {
                this.reminderTimeInSecs_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= -129;
                onChanged();
                return this;
            }

            public Builder clearStartDate() {
                this.bitField0_ &= -17;
                this.startDate_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                this.title_ = CalendarEvent.getDefaultInstance().getTitle();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public boolean getAllDay() {
                return this.allDay_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public String getDescription() {
                Object obj = this.description_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.description_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public ByteString getDescriptionBytes() {
                Object obj = this.description_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.description_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarEvent_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public long getEndDate() {
                return this.endDate_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public String getLocation() {
                Object obj = this.location_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.location_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public ByteString getLocationBytes() {
                Object obj = this.location_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.location_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public String getOrganizer() {
                Object obj = this.organizer_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.organizer_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public ByteString getOrganizerBytes() {
                Object obj = this.organizer_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.organizer_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public int getReminderTimeInSecs(int i14) {
                return this.reminderTimeInSecs_.getInt(i14);
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public int getReminderTimeInSecsCount() {
                return this.reminderTimeInSecs_.size();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public List<Integer> getReminderTimeInSecsList() {
                this.reminderTimeInSecs_.makeImmutable();
                return this.reminderTimeInSecs_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public long getStartDate() {
                return this.startDate_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.title_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public ByteString getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public boolean hasAllDay() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public boolean hasDescription() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public boolean hasEndDate() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public boolean hasLocation() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public boolean hasOrganizer() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public boolean hasStartDate() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventOrBuilder
            public boolean hasTitle() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarEvent_fieldAccessorTable.ensureFieldAccessorsInitialized(CalendarEvent.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.organizer_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.title_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.location_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.description_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.startDate_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.endDate_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 32;
                                } else if (tag == 56) {
                                    this.allDay_ = codedInputStream.readBool();
                                    this.bitField0_ |= 64;
                                } else if (tag == 64) {
                                    int uInt32 = codedInputStream.readUInt32();
                                    ensureReminderTimeInSecsIsMutable();
                                    this.reminderTimeInSecs_.addInt(uInt32);
                                } else if (tag == 66) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    ensureReminderTimeInSecsIsMutable();
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.reminderTimeInSecs_.addInt(codedInputStream.readUInt32());
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAllDay(boolean z14) {
                this.allDay_ = z14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setDescription(String str) {
                str.getClass();
                this.description_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                byteString.getClass();
                this.description_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setEndDate(long j8) {
                this.endDate_ = j8;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLocation(String str) {
                str.getClass();
                this.location_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLocationBytes(ByteString byteString) {
                byteString.getClass();
                this.location_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setOrganizer(String str) {
                str.getClass();
                this.organizer_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setOrganizerBytes(ByteString byteString) {
                byteString.getClass();
                this.organizer_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setReminderTimeInSecs(int i14, int i15) {
                ensureReminderTimeInSecsIsMutable();
                this.reminderTimeInSecs_.setInt(i14, i15);
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStartDate(long j8) {
                this.startDate_ = j8;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTitle(String str) {
                str.getClass();
                this.title_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                byteString.getClass();
                this.title_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CalendarEvent getDefaultInstanceForType() {
                return CalendarEvent.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.organizer_ = "";
                this.title_ = "";
                this.location_ = "";
                this.description_ = "";
                this.reminderTimeInSecs_ = GeneratedMessageV3.emptyIntList();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CalendarEvent) {
                    return mergeFrom((CalendarEvent) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CalendarEvent calendarEvent) {
                if (calendarEvent == CalendarEvent.getDefaultInstance()) {
                    return this;
                }
                if (calendarEvent.hasOrganizer()) {
                    this.organizer_ = calendarEvent.organizer_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (calendarEvent.hasTitle()) {
                    this.title_ = calendarEvent.title_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (calendarEvent.hasLocation()) {
                    this.location_ = calendarEvent.location_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (calendarEvent.hasDescription()) {
                    this.description_ = calendarEvent.description_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (calendarEvent.hasStartDate()) {
                    setStartDate(calendarEvent.getStartDate());
                }
                if (calendarEvent.hasEndDate()) {
                    setEndDate(calendarEvent.getEndDate());
                }
                if (calendarEvent.hasAllDay()) {
                    setAllDay(calendarEvent.getAllDay());
                }
                if (!calendarEvent.reminderTimeInSecs_.isEmpty()) {
                    if (this.reminderTimeInSecs_.isEmpty()) {
                        Internal.IntList intList = calendarEvent.reminderTimeInSecs_;
                        this.reminderTimeInSecs_ = intList;
                        intList.makeImmutable();
                        this.bitField0_ |= 128;
                    } else {
                        ensureReminderTimeInSecsIsMutable();
                        this.reminderTimeInSecs_.addAll(calendarEvent.reminderTimeInSecs_);
                    }
                    onChanged();
                }
                mergeUnknownFields(calendarEvent.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CalendarEvent getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CalendarEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarEvent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalendarEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CalendarEvent parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CalendarEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CalendarEvent parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CalendarEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CalendarEvent parseFrom(InputStream inputStream) {
            return (CalendarEvent) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CalendarEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarEvent) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalendarEvent parseFrom(CodedInputStream codedInputStream) {
            return (CalendarEvent) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CalendarEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarEvent) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private CalendarEvent(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.organizer_ = "";
            this.title_ = "";
            this.location_ = "";
            this.description_ = "";
            this.startDate_ = 0L;
            this.endDate_ = 0L;
            this.allDay_ = false;
            this.reminderTimeInSecs_ = GeneratedMessageV3.emptyIntList();
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ CalendarEvent(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class CalendarEventsRequest extends GeneratedMessageV3 implements CalendarEventsRequestOrBuilder {
        public static final int END_DATE_FIELD_NUMBER = 2;
        public static final int INCLUDE_ALL_DAY_FIELD_NUMBER = 9;
        public static final int INCLUDE_DESCRIPTION_FIELD_NUMBER = 6;
        public static final int INCLUDE_END_DATE_FIELD_NUMBER = 8;
        public static final int INCLUDE_LOCATION_FIELD_NUMBER = 5;
        public static final int INCLUDE_ORGANIZER_FIELD_NUMBER = 3;
        public static final int INCLUDE_START_DATE_FIELD_NUMBER = 7;
        public static final int INCLUDE_TITLE_FIELD_NUMBER = 4;
        public static final int MAX_DESCRIPTION_LENGTH_FIELD_NUMBER = 13;
        public static final int MAX_EVENTS_FIELD_NUMBER = 14;
        public static final int MAX_LOCATION_LENGTH_FIELD_NUMBER = 12;
        public static final int MAX_ORGANIZER_LENGTH_FIELD_NUMBER = 10;
        public static final int MAX_TITLE_LENGTH_FIELD_NUMBER = 11;
        public static final int START_DATE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long endDate_;
        private boolean includeAllDay_;
        private boolean includeDescription_;
        private boolean includeEndDate_;
        private boolean includeLocation_;
        private boolean includeOrganizer_;
        private boolean includeStartDate_;
        private boolean includeTitle_;
        private int maxDescriptionLength_;
        private int maxEvents_;
        private int maxLocationLength_;
        private int maxOrganizerLength_;
        private int maxTitleLength_;
        private byte memoizedIsInitialized;
        private long startDate_;
        private static final CalendarEventsRequest DEFAULT_INSTANCE = new CalendarEventsRequest();

        @Deprecated
        public static final Parser<CalendarEventsRequest> PARSER = new AbstractParser<CalendarEventsRequest>() { // from class: com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequest.1
            @Override // com.google.protobuf.Parser
            public CalendarEventsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CalendarEventsRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        private CalendarEventsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.startDate_ = 0L;
            this.endDate_ = 0L;
            this.includeOrganizer_ = false;
            this.includeTitle_ = true;
            this.includeLocation_ = true;
            this.includeDescription_ = false;
            this.includeStartDate_ = true;
            this.includeEndDate_ = false;
            this.includeAllDay_ = false;
            this.maxOrganizerLength_ = 0;
            this.maxTitleLength_ = 0;
            this.maxLocationLength_ = 0;
            this.maxDescriptionLength_ = 0;
            this.maxEvents_ = 100;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CalendarEventsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarEventsRequest_descriptor;
        }

        public static Builder newBuilder(CalendarEventsRequest calendarEventsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(calendarEventsRequest);
        }

        public static CalendarEventsRequest parseDelimitedFrom(InputStream inputStream) {
            return (CalendarEventsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CalendarEventsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CalendarEventsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CalendarEventsRequest)) {
                return super.equals(obj);
            }
            CalendarEventsRequest calendarEventsRequest = (CalendarEventsRequest) obj;
            if (hasStartDate() != calendarEventsRequest.hasStartDate()) {
                return false;
            }
            if ((hasStartDate() && getStartDate() != calendarEventsRequest.getStartDate()) || hasEndDate() != calendarEventsRequest.hasEndDate()) {
                return false;
            }
            if ((hasEndDate() && getEndDate() != calendarEventsRequest.getEndDate()) || hasIncludeOrganizer() != calendarEventsRequest.hasIncludeOrganizer()) {
                return false;
            }
            if ((hasIncludeOrganizer() && getIncludeOrganizer() != calendarEventsRequest.getIncludeOrganizer()) || hasIncludeTitle() != calendarEventsRequest.hasIncludeTitle()) {
                return false;
            }
            if ((hasIncludeTitle() && getIncludeTitle() != calendarEventsRequest.getIncludeTitle()) || hasIncludeLocation() != calendarEventsRequest.hasIncludeLocation()) {
                return false;
            }
            if ((hasIncludeLocation() && getIncludeLocation() != calendarEventsRequest.getIncludeLocation()) || hasIncludeDescription() != calendarEventsRequest.hasIncludeDescription()) {
                return false;
            }
            if ((hasIncludeDescription() && getIncludeDescription() != calendarEventsRequest.getIncludeDescription()) || hasIncludeStartDate() != calendarEventsRequest.hasIncludeStartDate()) {
                return false;
            }
            if ((hasIncludeStartDate() && getIncludeStartDate() != calendarEventsRequest.getIncludeStartDate()) || hasIncludeEndDate() != calendarEventsRequest.hasIncludeEndDate()) {
                return false;
            }
            if ((hasIncludeEndDate() && getIncludeEndDate() != calendarEventsRequest.getIncludeEndDate()) || hasIncludeAllDay() != calendarEventsRequest.hasIncludeAllDay()) {
                return false;
            }
            if ((hasIncludeAllDay() && getIncludeAllDay() != calendarEventsRequest.getIncludeAllDay()) || hasMaxOrganizerLength() != calendarEventsRequest.hasMaxOrganizerLength()) {
                return false;
            }
            if ((hasMaxOrganizerLength() && getMaxOrganizerLength() != calendarEventsRequest.getMaxOrganizerLength()) || hasMaxTitleLength() != calendarEventsRequest.hasMaxTitleLength()) {
                return false;
            }
            if ((hasMaxTitleLength() && getMaxTitleLength() != calendarEventsRequest.getMaxTitleLength()) || hasMaxLocationLength() != calendarEventsRequest.hasMaxLocationLength()) {
                return false;
            }
            if ((hasMaxLocationLength() && getMaxLocationLength() != calendarEventsRequest.getMaxLocationLength()) || hasMaxDescriptionLength() != calendarEventsRequest.hasMaxDescriptionLength()) {
                return false;
            }
            if ((!hasMaxDescriptionLength() || getMaxDescriptionLength() == calendarEventsRequest.getMaxDescriptionLength()) && hasMaxEvents() == calendarEventsRequest.hasMaxEvents()) {
                return (!hasMaxEvents() || getMaxEvents() == calendarEventsRequest.getMaxEvents()) && getUnknownFields().equals(calendarEventsRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public long getEndDate() {
            return this.endDate_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean getIncludeAllDay() {
            return this.includeAllDay_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean getIncludeDescription() {
            return this.includeDescription_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean getIncludeEndDate() {
            return this.includeEndDate_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean getIncludeLocation() {
            return this.includeLocation_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean getIncludeOrganizer() {
            return this.includeOrganizer_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean getIncludeStartDate() {
            return this.includeStartDate_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean getIncludeTitle() {
            return this.includeTitle_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public int getMaxDescriptionLength() {
            return this.maxDescriptionLength_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public int getMaxEvents() {
            return this.maxEvents_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public int getMaxLocationLength() {
            return this.maxLocationLength_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public int getMaxOrganizerLength() {
            return this.maxOrganizerLength_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public int getMaxTitleLength() {
            return this.maxTitleLength_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CalendarEventsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt64Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt64Size(1, this.startDate_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt64Size(2, this.endDate_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeBoolSize(3, this.includeOrganizer_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeBoolSize(4, this.includeTitle_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeBoolSize(5, this.includeLocation_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeBoolSize(6, this.includeDescription_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeBoolSize(7, this.includeStartDate_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeBoolSize(8, this.includeEndDate_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeBoolSize(9, this.includeAllDay_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt32Size(10, this.maxOrganizerLength_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt32Size(11, this.maxTitleLength_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt32Size(12, this.maxLocationLength_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt32Size(13, this.maxDescriptionLength_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt32Size(14, this.maxEvents_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public long getStartDate() {
            return this.startDate_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean hasEndDate() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean hasIncludeAllDay() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean hasIncludeDescription() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean hasIncludeEndDate() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean hasIncludeLocation() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean hasIncludeOrganizer() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean hasIncludeStartDate() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean hasIncludeTitle() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean hasMaxDescriptionLength() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean hasMaxEvents() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean hasMaxLocationLength() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean hasMaxOrganizerLength() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean hasMaxTitleLength() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
        public boolean hasStartDate() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStartDate()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashLong(getStartDate());
            }
            if (hasEndDate()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashLong(getEndDate());
            }
            if (hasIncludeOrganizer()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getIncludeOrganizer());
            }
            if (hasIncludeTitle()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getIncludeTitle());
            }
            if (hasIncludeLocation()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashBoolean(getIncludeLocation());
            }
            if (hasIncludeDescription()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Internal.hashBoolean(getIncludeDescription());
            }
            if (hasIncludeStartDate()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + Internal.hashBoolean(getIncludeStartDate());
            }
            if (hasIncludeEndDate()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + Internal.hashBoolean(getIncludeEndDate());
            }
            if (hasIncludeAllDay()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + Internal.hashBoolean(getIncludeAllDay());
            }
            if (hasMaxOrganizerLength()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getMaxOrganizerLength();
            }
            if (hasMaxTitleLength()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getMaxTitleLength();
            }
            if (hasMaxLocationLength()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getMaxLocationLength();
            }
            if (hasMaxDescriptionLength()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getMaxDescriptionLength();
            }
            if (hasMaxEvents()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getMaxEvents();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarEventsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CalendarEventsRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CalendarEventsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt64(1, this.startDate_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt64(2, this.endDate_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.includeOrganizer_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.includeTitle_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.includeLocation_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeBool(6, this.includeDescription_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeBool(7, this.includeStartDate_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeBool(8, this.includeEndDate_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeBool(9, this.includeAllDay_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeUInt32(10, this.maxOrganizerLength_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeUInt32(11, this.maxTitleLength_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeUInt32(12, this.maxLocationLength_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeUInt32(13, this.maxDescriptionLength_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeUInt32(14, this.maxEvents_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CalendarEventsRequestOrBuilder {
            private int bitField0_;
            private long endDate_;
            private boolean includeAllDay_;
            private boolean includeDescription_;
            private boolean includeEndDate_;
            private boolean includeLocation_;
            private boolean includeOrganizer_;
            private boolean includeStartDate_;
            private boolean includeTitle_;
            private int maxDescriptionLength_;
            private int maxEvents_;
            private int maxLocationLength_;
            private int maxOrganizerLength_;
            private int maxTitleLength_;
            private long startDate_;

            private Builder() {
                this.includeTitle_ = true;
                this.includeLocation_ = true;
                this.includeStartDate_ = true;
                this.maxEvents_ = 100;
            }

            private void buildPartial0(CalendarEventsRequest calendarEventsRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    calendarEventsRequest.startDate_ = this.startDate_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    calendarEventsRequest.endDate_ = this.endDate_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    calendarEventsRequest.includeOrganizer_ = this.includeOrganizer_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    calendarEventsRequest.includeTitle_ = this.includeTitle_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    calendarEventsRequest.includeLocation_ = this.includeLocation_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    calendarEventsRequest.includeDescription_ = this.includeDescription_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    calendarEventsRequest.includeStartDate_ = this.includeStartDate_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    calendarEventsRequest.includeEndDate_ = this.includeEndDate_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    calendarEventsRequest.includeAllDay_ = this.includeAllDay_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    calendarEventsRequest.maxOrganizerLength_ = this.maxOrganizerLength_;
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    calendarEventsRequest.maxTitleLength_ = this.maxTitleLength_;
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    calendarEventsRequest.maxLocationLength_ = this.maxLocationLength_;
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    calendarEventsRequest.maxDescriptionLength_ = this.maxDescriptionLength_;
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    calendarEventsRequest.maxEvents_ = this.maxEvents_;
                    i14 |= 8192;
                }
                calendarEventsRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarEventsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalendarEventsRequest build() {
                CalendarEventsRequest calendarEventsRequestBuildPartial = buildPartial();
                if (calendarEventsRequestBuildPartial.isInitialized()) {
                    return calendarEventsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) calendarEventsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalendarEventsRequest buildPartial() {
                CalendarEventsRequest calendarEventsRequest = new CalendarEventsRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(calendarEventsRequest);
                }
                onBuilt();
                return calendarEventsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.startDate_ = 0L;
                this.endDate_ = 0L;
                this.includeOrganizer_ = false;
                this.includeTitle_ = true;
                this.includeLocation_ = true;
                this.includeDescription_ = false;
                this.includeStartDate_ = true;
                this.includeEndDate_ = false;
                this.includeAllDay_ = false;
                this.maxOrganizerLength_ = 0;
                this.maxTitleLength_ = 0;
                this.maxLocationLength_ = 0;
                this.maxDescriptionLength_ = 0;
                this.maxEvents_ = 100;
                return this;
            }

            public Builder clearEndDate() {
                this.bitField0_ &= -3;
                this.endDate_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIncludeAllDay() {
                this.bitField0_ &= -257;
                this.includeAllDay_ = false;
                onChanged();
                return this;
            }

            public Builder clearIncludeDescription() {
                this.bitField0_ &= -33;
                this.includeDescription_ = false;
                onChanged();
                return this;
            }

            public Builder clearIncludeEndDate() {
                this.bitField0_ &= -129;
                this.includeEndDate_ = false;
                onChanged();
                return this;
            }

            public Builder clearIncludeLocation() {
                this.bitField0_ &= -17;
                this.includeLocation_ = true;
                onChanged();
                return this;
            }

            public Builder clearIncludeOrganizer() {
                this.bitField0_ &= -5;
                this.includeOrganizer_ = false;
                onChanged();
                return this;
            }

            public Builder clearIncludeStartDate() {
                this.bitField0_ &= -65;
                this.includeStartDate_ = true;
                onChanged();
                return this;
            }

            public Builder clearIncludeTitle() {
                this.bitField0_ &= -9;
                this.includeTitle_ = true;
                onChanged();
                return this;
            }

            public Builder clearMaxDescriptionLength() {
                this.bitField0_ &= -4097;
                this.maxDescriptionLength_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxEvents() {
                this.bitField0_ &= -8193;
                this.maxEvents_ = 100;
                onChanged();
                return this;
            }

            public Builder clearMaxLocationLength() {
                this.bitField0_ &= -2049;
                this.maxLocationLength_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxOrganizerLength() {
                this.bitField0_ &= -513;
                this.maxOrganizerLength_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxTitleLength() {
                this.bitField0_ &= -1025;
                this.maxTitleLength_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStartDate() {
                this.bitField0_ &= -2;
                this.startDate_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarEventsRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public long getEndDate() {
                return this.endDate_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean getIncludeAllDay() {
                return this.includeAllDay_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean getIncludeDescription() {
                return this.includeDescription_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean getIncludeEndDate() {
                return this.includeEndDate_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean getIncludeLocation() {
                return this.includeLocation_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean getIncludeOrganizer() {
                return this.includeOrganizer_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean getIncludeStartDate() {
                return this.includeStartDate_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean getIncludeTitle() {
                return this.includeTitle_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public int getMaxDescriptionLength() {
                return this.maxDescriptionLength_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public int getMaxEvents() {
                return this.maxEvents_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public int getMaxLocationLength() {
                return this.maxLocationLength_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public int getMaxOrganizerLength() {
                return this.maxOrganizerLength_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public int getMaxTitleLength() {
                return this.maxTitleLength_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public long getStartDate() {
                return this.startDate_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean hasEndDate() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean hasIncludeAllDay() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean hasIncludeDescription() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean hasIncludeEndDate() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean hasIncludeLocation() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean hasIncludeOrganizer() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean hasIncludeStartDate() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean hasIncludeTitle() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean hasMaxDescriptionLength() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean hasMaxEvents() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean hasMaxLocationLength() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean hasMaxOrganizerLength() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean hasMaxTitleLength() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsRequestOrBuilder
            public boolean hasStartDate() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarEventsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CalendarEventsRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    break;
                                case 8:
                                    this.startDate_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 16:
                                    this.endDate_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 24:
                                    this.includeOrganizer_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 32:
                                    this.includeTitle_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 40:
                                    this.includeLocation_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 48:
                                    this.includeDescription_ = codedInputStream.readBool();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 56:
                                    this.includeStartDate_ = codedInputStream.readBool();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 64:
                                    this.includeEndDate_ = codedInputStream.readBool();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 72:
                                    this.includeAllDay_ = codedInputStream.readBool();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 80:
                                    this.maxOrganizerLength_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 512;
                                    continue;
                                case 88:
                                    this.maxTitleLength_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 96:
                                    this.maxLocationLength_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 104:
                                    this.maxDescriptionLength_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 112:
                                    this.maxEvents_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8192;
                                    continue;
                                default:
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        break;
                                    }
                                    break;
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setEndDate(long j8) {
                this.endDate_ = j8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setIncludeAllDay(boolean z14) {
                this.includeAllDay_ = z14;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setIncludeDescription(boolean z14) {
                this.includeDescription_ = z14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setIncludeEndDate(boolean z14) {
                this.includeEndDate_ = z14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setIncludeLocation(boolean z14) {
                this.includeLocation_ = z14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setIncludeOrganizer(boolean z14) {
                this.includeOrganizer_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setIncludeStartDate(boolean z14) {
                this.includeStartDate_ = z14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setIncludeTitle(boolean z14) {
                this.includeTitle_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setMaxDescriptionLength(int i14) {
                this.maxDescriptionLength_ = i14;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setMaxEvents(int i14) {
                this.maxEvents_ = i14;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setMaxLocationLength(int i14) {
                this.maxLocationLength_ = i14;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setMaxOrganizerLength(int i14) {
                this.maxOrganizerLength_ = i14;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setMaxTitleLength(int i14) {
                this.maxTitleLength_ = i14;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStartDate(long j8) {
                this.startDate_ = j8;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CalendarEventsRequest getDefaultInstanceForType() {
                return CalendarEventsRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.includeTitle_ = true;
                this.includeLocation_ = true;
                this.includeStartDate_ = true;
                this.maxEvents_ = 100;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CalendarEventsRequest) {
                    return mergeFrom((CalendarEventsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CalendarEventsRequest calendarEventsRequest) {
                if (calendarEventsRequest == CalendarEventsRequest.getDefaultInstance()) {
                    return this;
                }
                if (calendarEventsRequest.hasStartDate()) {
                    setStartDate(calendarEventsRequest.getStartDate());
                }
                if (calendarEventsRequest.hasEndDate()) {
                    setEndDate(calendarEventsRequest.getEndDate());
                }
                if (calendarEventsRequest.hasIncludeOrganizer()) {
                    setIncludeOrganizer(calendarEventsRequest.getIncludeOrganizer());
                }
                if (calendarEventsRequest.hasIncludeTitle()) {
                    setIncludeTitle(calendarEventsRequest.getIncludeTitle());
                }
                if (calendarEventsRequest.hasIncludeLocation()) {
                    setIncludeLocation(calendarEventsRequest.getIncludeLocation());
                }
                if (calendarEventsRequest.hasIncludeDescription()) {
                    setIncludeDescription(calendarEventsRequest.getIncludeDescription());
                }
                if (calendarEventsRequest.hasIncludeStartDate()) {
                    setIncludeStartDate(calendarEventsRequest.getIncludeStartDate());
                }
                if (calendarEventsRequest.hasIncludeEndDate()) {
                    setIncludeEndDate(calendarEventsRequest.getIncludeEndDate());
                }
                if (calendarEventsRequest.hasIncludeAllDay()) {
                    setIncludeAllDay(calendarEventsRequest.getIncludeAllDay());
                }
                if (calendarEventsRequest.hasMaxOrganizerLength()) {
                    setMaxOrganizerLength(calendarEventsRequest.getMaxOrganizerLength());
                }
                if (calendarEventsRequest.hasMaxTitleLength()) {
                    setMaxTitleLength(calendarEventsRequest.getMaxTitleLength());
                }
                if (calendarEventsRequest.hasMaxLocationLength()) {
                    setMaxLocationLength(calendarEventsRequest.getMaxLocationLength());
                }
                if (calendarEventsRequest.hasMaxDescriptionLength()) {
                    setMaxDescriptionLength(calendarEventsRequest.getMaxDescriptionLength());
                }
                if (calendarEventsRequest.hasMaxEvents()) {
                    setMaxEvents(calendarEventsRequest.getMaxEvents());
                }
                mergeUnknownFields(calendarEventsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CalendarEventsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CalendarEventsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarEventsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalendarEventsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CalendarEventsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CalendarEventsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CalendarEventsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CalendarEventsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CalendarEventsRequest parseFrom(InputStream inputStream) {
            return (CalendarEventsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CalendarEventsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarEventsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalendarEventsRequest parseFrom(CodedInputStream codedInputStream) {
            return (CalendarEventsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CalendarEventsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarEventsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ CalendarEventsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CalendarEventsRequest() {
            this.startDate_ = 0L;
            this.endDate_ = 0L;
            this.includeOrganizer_ = false;
            this.includeDescription_ = false;
            this.includeEndDate_ = false;
            this.includeAllDay_ = false;
            this.maxOrganizerLength_ = 0;
            this.maxTitleLength_ = 0;
            this.maxLocationLength_ = 0;
            this.maxDescriptionLength_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.includeTitle_ = true;
            this.includeLocation_ = true;
            this.includeStartDate_ = true;
            this.maxEvents_ = 100;
        }
    }

    public static final class CalendarEventsResponse extends GeneratedMessageV3 implements CalendarEventsResponseOrBuilder {
        public static final int EVENTS_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private List<CalendarEvent> events_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final CalendarEventsResponse DEFAULT_INSTANCE = new CalendarEventsResponse();

        @Deprecated
        public static final Parser<CalendarEventsResponse> PARSER = new AbstractParser<CalendarEventsResponse>() { // from class: com.garmin.proto.generated.GDICalendarProto.CalendarEventsResponse.1
            @Override // com.google.protobuf.Parser
            public CalendarEventsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CalendarEventsResponse.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        private CalendarEventsResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.events_ = Collections.EMPTY_LIST;
        }

        public static CalendarEventsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarEventsResponse_descriptor;
        }

        public static Builder newBuilder(CalendarEventsResponse calendarEventsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(calendarEventsResponse);
        }

        public static CalendarEventsResponse parseDelimitedFrom(InputStream inputStream) {
            return (CalendarEventsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CalendarEventsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CalendarEventsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CalendarEventsResponse)) {
                return super.equals(obj);
            }
            CalendarEventsResponse calendarEventsResponse = (CalendarEventsResponse) obj;
            if (hasStatus() != calendarEventsResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == calendarEventsResponse.status_) && getEventsList().equals(calendarEventsResponse.getEventsList()) && getUnknownFields().equals(calendarEventsResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsResponseOrBuilder
        public CalendarEvent getEvents(int i14) {
            return this.events_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsResponseOrBuilder
        public int getEventsCount() {
            return this.events_.size();
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsResponseOrBuilder
        public List<CalendarEvent> getEventsList() {
            return this.events_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsResponseOrBuilder
        public CalendarEventOrBuilder getEventsOrBuilder(int i14) {
            return this.events_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsResponseOrBuilder
        public List<? extends CalendarEventOrBuilder> getEventsOrBuilderList() {
            return this.events_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CalendarEventsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            for (int i15 = 0; i15 < this.events_.size(); i15++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.events_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.status_;
            }
            if (getEventsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getEventsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarEventsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CalendarEventsResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CalendarEventsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.status_);
            }
            for (int i14 = 0; i14 < this.events_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.events_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CalendarEventsResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<CalendarEvent, CalendarEvent.Builder, CalendarEventOrBuilder> eventsBuilder_;
            private List<CalendarEvent> events_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                this.events_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(CalendarEventsResponse calendarEventsResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    calendarEventsResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                calendarEventsResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(CalendarEventsResponse calendarEventsResponse) {
                RepeatedFieldBuilderV3<CalendarEvent, CalendarEvent.Builder, CalendarEventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    calendarEventsResponse.events_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.events_ = Collections.unmodifiableList(this.events_);
                    this.bitField0_ &= -3;
                }
                calendarEventsResponse.events_ = this.events_;
            }

            private void ensureEventsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.events_ = new ArrayList(this.events_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarEventsResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<CalendarEvent, CalendarEvent.Builder, CalendarEventOrBuilder> getEventsFieldBuilder() {
                if (this.eventsBuilder_ == null) {
                    this.eventsBuilder_ = new RepeatedFieldBuilderV3<>(this.events_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.events_ = null;
                }
                return this.eventsBuilder_;
            }

            public Builder addAllEvents(Iterable<? extends CalendarEvent> iterable) {
                RepeatedFieldBuilderV3<CalendarEvent, CalendarEvent.Builder, CalendarEventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureEventsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.events_);
                onChanged();
                return this;
            }

            public Builder addEvents(CalendarEvent.Builder builder) {
                RepeatedFieldBuilderV3<CalendarEvent, CalendarEvent.Builder, CalendarEventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureEventsIsMutable();
                this.events_.add(builder.build());
                onChanged();
                return this;
            }

            public CalendarEvent.Builder addEventsBuilder() {
                return (CalendarEvent.Builder) getEventsFieldBuilder().addBuilder(CalendarEvent.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalendarEventsResponse build() {
                CalendarEventsResponse calendarEventsResponseBuildPartial = buildPartial();
                if (calendarEventsResponseBuildPartial.isInitialized()) {
                    return calendarEventsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) calendarEventsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalendarEventsResponse buildPartial() {
                CalendarEventsResponse calendarEventsResponse = new CalendarEventsResponse(this);
                buildPartialRepeatedFields(calendarEventsResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(calendarEventsResponse);
                }
                onBuilt();
                return calendarEventsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                RepeatedFieldBuilderV3<CalendarEvent, CalendarEvent.Builder, CalendarEventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.events_ = Collections.EMPTY_LIST;
                } else {
                    this.events_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            public Builder clearEvents() {
                RepeatedFieldBuilderV3<CalendarEvent, CalendarEvent.Builder, CalendarEventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.events_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarEventsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsResponseOrBuilder
            public CalendarEvent getEvents(int i14) {
                RepeatedFieldBuilderV3<CalendarEvent, CalendarEvent.Builder, CalendarEventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.events_.get(i14) : (CalendarEvent) repeatedFieldBuilderV3.getMessage(i14);
            }

            public CalendarEvent.Builder getEventsBuilder(int i14) {
                return (CalendarEvent.Builder) getEventsFieldBuilder().getBuilder(i14);
            }

            public List<CalendarEvent.Builder> getEventsBuilderList() {
                return getEventsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsResponseOrBuilder
            public int getEventsCount() {
                RepeatedFieldBuilderV3<CalendarEvent, CalendarEvent.Builder, CalendarEventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.events_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsResponseOrBuilder
            public List<CalendarEvent> getEventsList() {
                RepeatedFieldBuilderV3<CalendarEvent, CalendarEvent.Builder, CalendarEventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.events_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsResponseOrBuilder
            public CalendarEventOrBuilder getEventsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<CalendarEvent, CalendarEvent.Builder, CalendarEventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.events_.get(i14) : (CalendarEventOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsResponseOrBuilder
            public List<? extends CalendarEventOrBuilder> getEventsOrBuilderList() {
                RepeatedFieldBuilderV3<CalendarEvent, CalendarEvent.Builder, CalendarEventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.events_);
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarEventsResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarEventsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CalendarEventsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CalendarEventsResponse calendarEventsResponse) {
                if (calendarEventsResponse == CalendarEventsResponse.getDefaultInstance()) {
                    return this;
                }
                if (calendarEventsResponse.hasStatus()) {
                    setStatus(calendarEventsResponse.getStatus());
                }
                if (this.eventsBuilder_ == null) {
                    if (!calendarEventsResponse.events_.isEmpty()) {
                        if (this.events_.isEmpty()) {
                            this.events_ = calendarEventsResponse.events_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureEventsIsMutable();
                            this.events_.addAll(calendarEventsResponse.events_);
                        }
                        onChanged();
                    }
                } else if (!calendarEventsResponse.events_.isEmpty()) {
                    boolean zIsEmpty = this.eventsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<CalendarEvent, CalendarEvent.Builder, CalendarEventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.eventsBuilder_ = null;
                        this.events_ = calendarEventsResponse.events_;
                        this.bitField0_ &= -3;
                        this.eventsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getEventsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(calendarEventsResponse.events_);
                    }
                }
                mergeUnknownFields(calendarEventsResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeEvents(int i14) {
                RepeatedFieldBuilderV3<CalendarEvent, CalendarEvent.Builder, CalendarEventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureEventsIsMutable();
                this.events_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setEvents(int i14, CalendarEvent.Builder builder) {
                RepeatedFieldBuilderV3<CalendarEvent, CalendarEvent.Builder, CalendarEventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureEventsIsMutable();
                this.events_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CalendarEventsResponse getDefaultInstanceForType() {
                return CalendarEventsResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = 0;
                this.events_ = Collections.EMPTY_LIST;
            }

            public CalendarEvent.Builder addEventsBuilder(int i14) {
                return (CalendarEvent.Builder) getEventsFieldBuilder().addBuilder(i14, CalendarEvent.getDefaultInstance());
            }

            public Builder addEvents(int i14, CalendarEvent calendarEvent) {
                RepeatedFieldBuilderV3<CalendarEvent, CalendarEvent.Builder, CalendarEventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    calendarEvent.getClass();
                    ensureEventsIsMutable();
                    this.events_.add(i14, calendarEvent);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, calendarEvent);
                return this;
            }

            public Builder setEvents(int i14, CalendarEvent calendarEvent) {
                RepeatedFieldBuilderV3<CalendarEvent, CalendarEvent.Builder, CalendarEventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    calendarEvent.getClass();
                    ensureEventsIsMutable();
                    this.events_.set(i14, calendarEvent);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, calendarEvent);
                return this;
            }

            public Builder addEvents(CalendarEvent calendarEvent) {
                RepeatedFieldBuilderV3<CalendarEvent, CalendarEvent.Builder, CalendarEventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    calendarEvent.getClass();
                    ensureEventsIsMutable();
                    this.events_.add(calendarEvent);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(calendarEvent);
                return this;
            }

            public Builder addEvents(int i14, CalendarEvent.Builder builder) {
                RepeatedFieldBuilderV3<CalendarEvent, CalendarEvent.Builder, CalendarEventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventsIsMutable();
                    this.events_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CalendarEventsResponse) {
                    return mergeFrom((CalendarEventsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    CalendarEvent calendarEvent = (CalendarEvent) codedInputStream.readMessage(CalendarEvent.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<CalendarEvent, CalendarEvent.Builder, CalendarEventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureEventsIsMutable();
                                        this.events_.add(calendarEvent);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(calendarEvent);
                                    }
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CalendarEventsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CalendarEventsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarEventsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalendarEventsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CalendarEventsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CalendarEventsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CalendarEventsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CalendarEventsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private CalendarEventsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CalendarEventsResponse parseFrom(InputStream inputStream) {
            return (CalendarEventsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CalendarEventsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarEventsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ CalendarEventsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CalendarEventsResponse parseFrom(CodedInputStream codedInputStream) {
            return (CalendarEventsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CalendarEventsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarEventsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE_STATUS(0),
            OK(1),
            INVALID_DATE_RANGE(2);

            public static final int INVALID_DATE_RANGE_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_RESPONSE_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDICalendarProto.CalendarEventsResponse.ResponseStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResponseStatus findValueByNumber(int i14) {
                    return ResponseStatus.forNumber(i14);
                }
            };
            private static final ResponseStatus[] VALUES = values();

            ResponseStatus(int i14) {
                this.value = i14;
            }

            public static ResponseStatus forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN_RESPONSE_STATUS;
                }
                if (i14 == 1) {
                    return OK;
                }
                if (i14 != 2) {
                    return null;
                }
                return INVALID_DATE_RANGE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CalendarEventsResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ResponseStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ResponseStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                h.s("EnumValueDescriptor is not for this type.");
                return null;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static ResponseStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class CalendarFile extends GeneratedMessageV3 implements CalendarFileOrBuilder {
        public static final int CALENDARS_FIELD_NUMBER = 3;
        public static final int DELETED_CAL_HASHES_FIELD_NUMBER = 1;
        public static final int DELETED_EVENT_HASHES_FIELD_NUMBER = 2;
        public static final int EVENTS_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private List<Calendar> calendars_;
        private Internal.ProtobufList<ByteString> deletedCalHashes_;
        private Internal.ProtobufList<ByteString> deletedEventHashes_;
        private List<Event> events_;
        private byte memoizedIsInitialized;
        private static final CalendarFile DEFAULT_INSTANCE = new CalendarFile();

        @Deprecated
        public static final Parser<CalendarFile> PARSER = new AbstractParser<CalendarFile>() { // from class: com.garmin.proto.generated.GDICalendarProto.CalendarFile.1
            @Override // com.google.protobuf.Parser
            public CalendarFile parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CalendarFile.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        private CalendarFile() {
            this.deletedCalHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
            this.deletedEventHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
            this.memoizedIsInitialized = (byte) -1;
            this.deletedCalHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
            this.deletedEventHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
            List list = Collections.EMPTY_LIST;
            this.calendars_ = list;
            this.events_ = list;
        }

        public static CalendarFile getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarFile_descriptor;
        }

        public static Builder newBuilder(CalendarFile calendarFile) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(calendarFile);
        }

        public static CalendarFile parseDelimitedFrom(InputStream inputStream) {
            return (CalendarFile) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CalendarFile parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CalendarFile> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CalendarFile)) {
                return super.equals(obj);
            }
            CalendarFile calendarFile = (CalendarFile) obj;
            return getDeletedCalHashesList().equals(calendarFile.getDeletedCalHashesList()) && getDeletedEventHashesList().equals(calendarFile.getDeletedEventHashesList()) && getCalendarsList().equals(calendarFile.getCalendarsList()) && getEventsList().equals(calendarFile.getEventsList()) && getUnknownFields().equals(calendarFile.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
        public Calendar getCalendars(int i14) {
            return this.calendars_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
        public int getCalendarsCount() {
            return this.calendars_.size();
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
        public List<Calendar> getCalendarsList() {
            return this.calendars_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
        public CalendarOrBuilder getCalendarsOrBuilder(int i14) {
            return this.calendars_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
        public List<? extends CalendarOrBuilder> getCalendarsOrBuilderList() {
            return this.calendars_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
        public ByteString getDeletedCalHashes(int i14) {
            return this.deletedCalHashes_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
        public int getDeletedCalHashesCount() {
            return this.deletedCalHashes_.size();
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
        public List<ByteString> getDeletedCalHashesList() {
            return this.deletedCalHashes_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
        public ByteString getDeletedEventHashes(int i14) {
            return this.deletedEventHashes_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
        public int getDeletedEventHashesCount() {
            return this.deletedEventHashes_.size();
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
        public List<ByteString> getDeletedEventHashesList() {
            return this.deletedEventHashes_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
        public Event getEvents(int i14) {
            return this.events_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
        public int getEventsCount() {
            return this.events_.size();
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
        public List<Event> getEventsList() {
            return this.events_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
        public EventOrBuilder getEventsOrBuilder(int i14) {
            return this.events_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
        public List<? extends EventOrBuilder> getEventsOrBuilderList() {
            return this.events_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CalendarFile> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSizeNoTag = 0;
            for (int i15 = 0; i15 < this.deletedCalHashes_.size(); i15++) {
                iComputeBytesSizeNoTag += CodedOutputStream.computeBytesSizeNoTag(this.deletedCalHashes_.get(i15));
            }
            int size = getDeletedCalHashesList().size() + iComputeBytesSizeNoTag;
            int iComputeBytesSizeNoTag2 = 0;
            for (int i16 = 0; i16 < this.deletedEventHashes_.size(); i16++) {
                iComputeBytesSizeNoTag2 += CodedOutputStream.computeBytesSizeNoTag(this.deletedEventHashes_.get(i16));
            }
            int size2 = getDeletedEventHashesList().size() + size + iComputeBytesSizeNoTag2;
            for (int i17 = 0; i17 < this.calendars_.size(); i17++) {
                size2 += CodedOutputStream.computeMessageSize(3, this.calendars_.get(i17));
            }
            for (int i18 = 0; i18 < this.events_.size(); i18++) {
                size2 += CodedOutputStream.computeMessageSize(4, this.events_.get(i18));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + size2;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getDeletedCalHashesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDeletedCalHashesList().hashCode();
            }
            if (getDeletedEventHashesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDeletedEventHashesList().hashCode();
            }
            if (getCalendarsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getCalendarsList().hashCode();
            }
            if (getEventsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getEventsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarFile_fieldAccessorTable.ensureFieldAccessorsInitialized(CalendarFile.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CalendarFile();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.deletedCalHashes_.size(); i14++) {
                codedOutputStream.writeBytes(1, this.deletedCalHashes_.get(i14));
            }
            for (int i15 = 0; i15 < this.deletedEventHashes_.size(); i15++) {
                codedOutputStream.writeBytes(2, this.deletedEventHashes_.get(i15));
            }
            for (int i16 = 0; i16 < this.calendars_.size(); i16++) {
                codedOutputStream.writeMessage(3, this.calendars_.get(i16));
            }
            for (int i17 = 0; i17 < this.events_.size(); i17++) {
                codedOutputStream.writeMessage(4, this.events_.get(i17));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CalendarFileOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<Calendar, Calendar.Builder, CalendarOrBuilder> calendarsBuilder_;
            private List<Calendar> calendars_;
            private Internal.ProtobufList<ByteString> deletedCalHashes_;
            private Internal.ProtobufList<ByteString> deletedEventHashes_;
            private RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> eventsBuilder_;
            private List<Event> events_;

            private Builder() {
                this.deletedCalHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
                this.deletedEventHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
                List list = Collections.EMPTY_LIST;
                this.calendars_ = list;
                this.events_ = list;
            }

            private void buildPartial0(CalendarFile calendarFile) {
                int i14 = this.bitField0_;
                if ((i14 & 1) != 0) {
                    this.deletedCalHashes_.makeImmutable();
                    calendarFile.deletedCalHashes_ = this.deletedCalHashes_;
                }
                if ((i14 & 2) != 0) {
                    this.deletedEventHashes_.makeImmutable();
                    calendarFile.deletedEventHashes_ = this.deletedEventHashes_;
                }
            }

            private void buildPartialRepeatedFields(CalendarFile calendarFile) {
                RepeatedFieldBuilderV3<Calendar, Calendar.Builder, CalendarOrBuilder> repeatedFieldBuilderV3 = this.calendarsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 4) != 0) {
                        this.calendars_ = Collections.unmodifiableList(this.calendars_);
                        this.bitField0_ &= -5;
                    }
                    calendarFile.calendars_ = this.calendars_;
                } else {
                    calendarFile.calendars_ = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV4 = this.eventsBuilder_;
                if (repeatedFieldBuilderV4 != null) {
                    calendarFile.events_ = repeatedFieldBuilderV4.build();
                    return;
                }
                if ((this.bitField0_ & 8) != 0) {
                    this.events_ = Collections.unmodifiableList(this.events_);
                    this.bitField0_ &= -9;
                }
                calendarFile.events_ = this.events_;
            }

            private void ensureCalendarsIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.calendars_ = new ArrayList(this.calendars_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensureDeletedCalHashesIsMutable() {
                if (!this.deletedCalHashes_.isModifiable()) {
                    this.deletedCalHashes_ = GeneratedMessageV3.makeMutableCopy(this.deletedCalHashes_);
                }
                this.bitField0_ |= 1;
            }

            private void ensureDeletedEventHashesIsMutable() {
                if (!this.deletedEventHashes_.isModifiable()) {
                    this.deletedEventHashes_ = GeneratedMessageV3.makeMutableCopy(this.deletedEventHashes_);
                }
                this.bitField0_ |= 2;
            }

            private void ensureEventsIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.events_ = new ArrayList(this.events_);
                    this.bitField0_ |= 8;
                }
            }

            private RepeatedFieldBuilderV3<Calendar, Calendar.Builder, CalendarOrBuilder> getCalendarsFieldBuilder() {
                if (this.calendarsBuilder_ == null) {
                    this.calendarsBuilder_ = new RepeatedFieldBuilderV3<>(this.calendars_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.calendars_ = null;
                }
                return this.calendarsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarFile_descriptor;
            }

            private RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> getEventsFieldBuilder() {
                if (this.eventsBuilder_ == null) {
                    this.eventsBuilder_ = new RepeatedFieldBuilderV3<>(this.events_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                    this.events_ = null;
                }
                return this.eventsBuilder_;
            }

            public Builder addAllCalendars(Iterable<? extends Calendar> iterable) {
                RepeatedFieldBuilderV3<Calendar, Calendar.Builder, CalendarOrBuilder> repeatedFieldBuilderV3 = this.calendarsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureCalendarsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.calendars_);
                onChanged();
                return this;
            }

            public Builder addAllDeletedCalHashes(Iterable<? extends ByteString> iterable) {
                ensureDeletedCalHashesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.deletedCalHashes_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder addAllDeletedEventHashes(Iterable<? extends ByteString> iterable) {
                ensureDeletedEventHashesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.deletedEventHashes_);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder addAllEvents(Iterable<? extends Event> iterable) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureEventsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.events_);
                onChanged();
                return this;
            }

            public Builder addCalendars(Calendar.Builder builder) {
                RepeatedFieldBuilderV3<Calendar, Calendar.Builder, CalendarOrBuilder> repeatedFieldBuilderV3 = this.calendarsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureCalendarsIsMutable();
                this.calendars_.add(builder.build());
                onChanged();
                return this;
            }

            public Calendar.Builder addCalendarsBuilder() {
                return (Calendar.Builder) getCalendarsFieldBuilder().addBuilder(Calendar.getDefaultInstance());
            }

            public Builder addDeletedCalHashes(ByteString byteString) {
                byteString.getClass();
                ensureDeletedCalHashesIsMutable();
                this.deletedCalHashes_.add(byteString);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder addDeletedEventHashes(ByteString byteString) {
                byteString.getClass();
                ensureDeletedEventHashesIsMutable();
                this.deletedEventHashes_.add(byteString);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder addEvents(Event.Builder builder) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureEventsIsMutable();
                this.events_.add(builder.build());
                onChanged();
                return this;
            }

            public Event.Builder addEventsBuilder() {
                return (Event.Builder) getEventsFieldBuilder().addBuilder(Event.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalendarFile build() {
                CalendarFile calendarFileBuildPartial = buildPartial();
                if (calendarFileBuildPartial.isInitialized()) {
                    return calendarFileBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) calendarFileBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalendarFile buildPartial() {
                CalendarFile calendarFile = new CalendarFile(this);
                buildPartialRepeatedFields(calendarFile);
                if (this.bitField0_ != 0) {
                    buildPartial0(calendarFile);
                }
                onBuilt();
                return calendarFile;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.deletedCalHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
                this.deletedEventHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
                RepeatedFieldBuilderV3<Calendar, Calendar.Builder, CalendarOrBuilder> repeatedFieldBuilderV3 = this.calendarsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.calendars_ = Collections.EMPTY_LIST;
                } else {
                    this.calendars_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -5;
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV4 = this.eventsBuilder_;
                if (repeatedFieldBuilderV4 == null) {
                    this.events_ = Collections.EMPTY_LIST;
                } else {
                    this.events_ = null;
                    repeatedFieldBuilderV4.clear();
                }
                this.bitField0_ &= -9;
                return this;
            }

            public Builder clearCalendars() {
                RepeatedFieldBuilderV3<Calendar, Calendar.Builder, CalendarOrBuilder> repeatedFieldBuilderV3 = this.calendarsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.calendars_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearDeletedCalHashes() {
                this.deletedCalHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearDeletedEventHashes() {
                this.deletedEventHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearEvents() {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.events_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
            public Calendar getCalendars(int i14) {
                RepeatedFieldBuilderV3<Calendar, Calendar.Builder, CalendarOrBuilder> repeatedFieldBuilderV3 = this.calendarsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.calendars_.get(i14) : (Calendar) repeatedFieldBuilderV3.getMessage(i14);
            }

            public Calendar.Builder getCalendarsBuilder(int i14) {
                return (Calendar.Builder) getCalendarsFieldBuilder().getBuilder(i14);
            }

            public List<Calendar.Builder> getCalendarsBuilderList() {
                return getCalendarsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
            public int getCalendarsCount() {
                RepeatedFieldBuilderV3<Calendar, Calendar.Builder, CalendarOrBuilder> repeatedFieldBuilderV3 = this.calendarsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.calendars_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
            public List<Calendar> getCalendarsList() {
                RepeatedFieldBuilderV3<Calendar, Calendar.Builder, CalendarOrBuilder> repeatedFieldBuilderV3 = this.calendarsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.calendars_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
            public CalendarOrBuilder getCalendarsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<Calendar, Calendar.Builder, CalendarOrBuilder> repeatedFieldBuilderV3 = this.calendarsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.calendars_.get(i14) : (CalendarOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
            public List<? extends CalendarOrBuilder> getCalendarsOrBuilderList() {
                RepeatedFieldBuilderV3<Calendar, Calendar.Builder, CalendarOrBuilder> repeatedFieldBuilderV3 = this.calendarsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.calendars_);
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
            public ByteString getDeletedCalHashes(int i14) {
                return this.deletedCalHashes_.get(i14);
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
            public int getDeletedCalHashesCount() {
                return this.deletedCalHashes_.size();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
            public List<ByteString> getDeletedCalHashesList() {
                this.deletedCalHashes_.makeImmutable();
                return this.deletedCalHashes_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
            public ByteString getDeletedEventHashes(int i14) {
                return this.deletedEventHashes_.get(i14);
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
            public int getDeletedEventHashesCount() {
                return this.deletedEventHashes_.size();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
            public List<ByteString> getDeletedEventHashesList() {
                this.deletedEventHashes_.makeImmutable();
                return this.deletedEventHashes_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarFile_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
            public Event getEvents(int i14) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.events_.get(i14) : (Event) repeatedFieldBuilderV3.getMessage(i14);
            }

            public Event.Builder getEventsBuilder(int i14) {
                return (Event.Builder) getEventsFieldBuilder().getBuilder(i14);
            }

            public List<Event.Builder> getEventsBuilderList() {
                return getEventsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
            public int getEventsCount() {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.events_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
            public List<Event> getEventsList() {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.events_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
            public EventOrBuilder getEventsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.events_.get(i14) : (EventOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarFileOrBuilder
            public List<? extends EventOrBuilder> getEventsOrBuilderList() {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.events_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarFile_fieldAccessorTable.ensureFieldAccessorsInitialized(CalendarFile.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(CalendarFile calendarFile) {
                if (calendarFile == CalendarFile.getDefaultInstance()) {
                    return this;
                }
                if (!calendarFile.deletedCalHashes_.isEmpty()) {
                    if (this.deletedCalHashes_.isEmpty()) {
                        Internal.ProtobufList<ByteString> protobufList = calendarFile.deletedCalHashes_;
                        this.deletedCalHashes_ = protobufList;
                        protobufList.makeImmutable();
                        this.bitField0_ |= 1;
                    } else {
                        ensureDeletedCalHashesIsMutable();
                        this.deletedCalHashes_.addAll(calendarFile.deletedCalHashes_);
                    }
                    onChanged();
                }
                if (!calendarFile.deletedEventHashes_.isEmpty()) {
                    if (this.deletedEventHashes_.isEmpty()) {
                        Internal.ProtobufList<ByteString> protobufList2 = calendarFile.deletedEventHashes_;
                        this.deletedEventHashes_ = protobufList2;
                        protobufList2.makeImmutable();
                        this.bitField0_ |= 2;
                    } else {
                        ensureDeletedEventHashesIsMutable();
                        this.deletedEventHashes_.addAll(calendarFile.deletedEventHashes_);
                    }
                    onChanged();
                }
                if (this.calendarsBuilder_ == null) {
                    if (!calendarFile.calendars_.isEmpty()) {
                        if (this.calendars_.isEmpty()) {
                            this.calendars_ = calendarFile.calendars_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureCalendarsIsMutable();
                            this.calendars_.addAll(calendarFile.calendars_);
                        }
                        onChanged();
                    }
                } else if (!calendarFile.calendars_.isEmpty()) {
                    boolean zIsEmpty = this.calendarsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<Calendar, Calendar.Builder, CalendarOrBuilder> repeatedFieldBuilderV3 = this.calendarsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.calendarsBuilder_ = null;
                        this.calendars_ = calendarFile.calendars_;
                        this.bitField0_ &= -5;
                        this.calendarsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getCalendarsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(calendarFile.calendars_);
                    }
                }
                if (this.eventsBuilder_ == null) {
                    if (!calendarFile.events_.isEmpty()) {
                        if (this.events_.isEmpty()) {
                            this.events_ = calendarFile.events_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureEventsIsMutable();
                            this.events_.addAll(calendarFile.events_);
                        }
                        onChanged();
                    }
                } else if (!calendarFile.events_.isEmpty()) {
                    boolean zIsEmpty2 = this.eventsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV4 = this.eventsBuilder_;
                    if (zIsEmpty2) {
                        repeatedFieldBuilderV4.dispose();
                        this.eventsBuilder_ = null;
                        this.events_ = calendarFile.events_;
                        this.bitField0_ &= -9;
                        this.eventsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getEventsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV4.addAllMessages(calendarFile.events_);
                    }
                }
                mergeUnknownFields(calendarFile.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeCalendars(int i14) {
                RepeatedFieldBuilderV3<Calendar, Calendar.Builder, CalendarOrBuilder> repeatedFieldBuilderV3 = this.calendarsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureCalendarsIsMutable();
                this.calendars_.remove(i14);
                onChanged();
                return this;
            }

            public Builder removeEvents(int i14) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureEventsIsMutable();
                this.events_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setCalendars(int i14, Calendar.Builder builder) {
                RepeatedFieldBuilderV3<Calendar, Calendar.Builder, CalendarOrBuilder> repeatedFieldBuilderV3 = this.calendarsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureCalendarsIsMutable();
                this.calendars_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setDeletedCalHashes(int i14, ByteString byteString) {
                byteString.getClass();
                ensureDeletedCalHashesIsMutable();
                this.deletedCalHashes_.set(i14, byteString);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDeletedEventHashes(int i14, ByteString byteString) {
                byteString.getClass();
                ensureDeletedEventHashesIsMutable();
                this.deletedEventHashes_.set(i14, byteString);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setEvents(int i14, Event.Builder builder) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureEventsIsMutable();
                this.events_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CalendarFile getDefaultInstanceForType() {
                return CalendarFile.getDefaultInstance();
            }

            public Calendar.Builder addCalendarsBuilder(int i14) {
                return (Calendar.Builder) getCalendarsFieldBuilder().addBuilder(i14, Calendar.getDefaultInstance());
            }

            public Event.Builder addEventsBuilder(int i14) {
                return (Event.Builder) getEventsFieldBuilder().addBuilder(i14, Event.getDefaultInstance());
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.deletedCalHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
                this.deletedEventHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
                List list = Collections.EMPTY_LIST;
                this.calendars_ = list;
                this.events_ = list;
            }

            public Builder addCalendars(int i14, Calendar calendar) {
                RepeatedFieldBuilderV3<Calendar, Calendar.Builder, CalendarOrBuilder> repeatedFieldBuilderV3 = this.calendarsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    calendar.getClass();
                    ensureCalendarsIsMutable();
                    this.calendars_.add(i14, calendar);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, calendar);
                return this;
            }

            public Builder addEvents(int i14, Event event) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    event.getClass();
                    ensureEventsIsMutable();
                    this.events_.add(i14, event);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, event);
                return this;
            }

            public Builder setCalendars(int i14, Calendar calendar) {
                RepeatedFieldBuilderV3<Calendar, Calendar.Builder, CalendarOrBuilder> repeatedFieldBuilderV3 = this.calendarsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    calendar.getClass();
                    ensureCalendarsIsMutable();
                    this.calendars_.set(i14, calendar);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, calendar);
                return this;
            }

            public Builder setEvents(int i14, Event event) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    event.getClass();
                    ensureEventsIsMutable();
                    this.events_.set(i14, event);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, event);
                return this;
            }

            public Builder addCalendars(Calendar calendar) {
                RepeatedFieldBuilderV3<Calendar, Calendar.Builder, CalendarOrBuilder> repeatedFieldBuilderV3 = this.calendarsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    calendar.getClass();
                    ensureCalendarsIsMutable();
                    this.calendars_.add(calendar);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(calendar);
                return this;
            }

            public Builder addEvents(Event event) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    event.getClass();
                    ensureEventsIsMutable();
                    this.events_.add(event);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(event);
                return this;
            }

            public Builder addCalendars(int i14, Calendar.Builder builder) {
                RepeatedFieldBuilderV3<Calendar, Calendar.Builder, CalendarOrBuilder> repeatedFieldBuilderV3 = this.calendarsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureCalendarsIsMutable();
                    this.calendars_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            public Builder addEvents(int i14, Event.Builder builder) {
                RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV3 = this.eventsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEventsIsMutable();
                    this.events_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CalendarFile) {
                    return mergeFrom((CalendarFile) message);
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    ByteString bytes = codedInputStream.readBytes();
                                    ensureDeletedCalHashesIsMutable();
                                    this.deletedCalHashes_.add(bytes);
                                } else if (tag == 18) {
                                    ByteString bytes2 = codedInputStream.readBytes();
                                    ensureDeletedEventHashesIsMutable();
                                    this.deletedEventHashes_.add(bytes2);
                                } else if (tag == 26) {
                                    Calendar calendar = (Calendar) codedInputStream.readMessage(Calendar.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Calendar, Calendar.Builder, CalendarOrBuilder> repeatedFieldBuilderV3 = this.calendarsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureCalendarsIsMutable();
                                        this.calendars_.add(calendar);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(calendar);
                                    }
                                } else if (tag != 34) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    Event event = (Event) codedInputStream.readMessage(Event.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Event, Event.Builder, EventOrBuilder> repeatedFieldBuilderV4 = this.eventsBuilder_;
                                    if (repeatedFieldBuilderV4 == null) {
                                        ensureEventsIsMutable();
                                        this.events_.add(event);
                                    } else {
                                        repeatedFieldBuilderV4.addMessage(event);
                                    }
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CalendarFile getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CalendarFile parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarFile) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalendarFile parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CalendarFile parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CalendarFile parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CalendarFile parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CalendarFile parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CalendarFile parseFrom(InputStream inputStream) {
            return (CalendarFile) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CalendarFile parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarFile) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalendarFile parseFrom(CodedInputStream codedInputStream) {
            return (CalendarFile) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CalendarFile parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarFile) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private CalendarFile(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.deletedCalHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
            this.deletedEventHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ CalendarFile(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class CalendarRequest extends GeneratedMessageV3 implements CalendarRequestOrBuilder {
        public static final int CAL_HASHES_FIELD_NUMBER = 13;
        public static final int END_DATE_FIELD_NUMBER = 2;
        public static final int EVENT_HASHES_FIELD_NUMBER = 14;
        public static final int INCLUDE_ATTENDEES_FIELD_NUMBER = 6;
        public static final int INCLUDE_DESCRIPTION_FIELD_NUMBER = 5;
        public static final int INCLUDE_LOCATION_FIELD_NUMBER = 4;
        public static final int INCLUDE_TITLE_FIELD_NUMBER = 3;
        public static final int MAX_ATTENDEES_FIELD_NUMBER = 9;
        public static final int MAX_CALENDARS_FIELD_NUMBER = 8;
        public static final int MAX_DESCRIPTION_LENGTH_FIELD_NUMBER = 12;
        public static final int MAX_EVENTS_FIELD_NUMBER = 7;
        public static final int MAX_LOCATION_LENGTH_FIELD_NUMBER = 11;
        public static final int MAX_TITLE_LENGTH_FIELD_NUMBER = 10;
        public static final int START_DATE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Internal.ProtobufList<ByteString> calHashes_;
        private long endDate_;
        private Internal.ProtobufList<ByteString> eventHashes_;
        private boolean includeAttendees_;
        private boolean includeDescription_;
        private boolean includeLocation_;
        private boolean includeTitle_;
        private int maxAttendees_;
        private int maxCalendars_;
        private int maxDescriptionLength_;
        private int maxEvents_;
        private int maxLocationLength_;
        private int maxTitleLength_;
        private byte memoizedIsInitialized;
        private long startDate_;
        private static final CalendarRequest DEFAULT_INSTANCE = new CalendarRequest();

        @Deprecated
        public static final Parser<CalendarRequest> PARSER = new AbstractParser<CalendarRequest>() { // from class: com.garmin.proto.generated.GDICalendarProto.CalendarRequest.1
            @Override // com.google.protobuf.Parser
            public CalendarRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CalendarRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        private CalendarRequest() {
            this.startDate_ = 0L;
            this.endDate_ = 0L;
            this.includeTitle_ = false;
            this.includeLocation_ = false;
            this.includeDescription_ = false;
            this.includeAttendees_ = false;
            this.maxEvents_ = 0;
            this.maxCalendars_ = 0;
            this.maxAttendees_ = 0;
            this.maxTitleLength_ = 0;
            this.maxLocationLength_ = 0;
            this.maxDescriptionLength_ = 0;
            this.calHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
            this.eventHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
            this.memoizedIsInitialized = (byte) -1;
            this.calHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
            this.eventHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
        }

        public static CalendarRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarRequest_descriptor;
        }

        public static Builder newBuilder(CalendarRequest calendarRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(calendarRequest);
        }

        public static CalendarRequest parseDelimitedFrom(InputStream inputStream) {
            return (CalendarRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CalendarRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CalendarRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CalendarRequest)) {
                return super.equals(obj);
            }
            CalendarRequest calendarRequest = (CalendarRequest) obj;
            if (hasStartDate() != calendarRequest.hasStartDate()) {
                return false;
            }
            if ((hasStartDate() && getStartDate() != calendarRequest.getStartDate()) || hasEndDate() != calendarRequest.hasEndDate()) {
                return false;
            }
            if ((hasEndDate() && getEndDate() != calendarRequest.getEndDate()) || hasIncludeTitle() != calendarRequest.hasIncludeTitle()) {
                return false;
            }
            if ((hasIncludeTitle() && getIncludeTitle() != calendarRequest.getIncludeTitle()) || hasIncludeLocation() != calendarRequest.hasIncludeLocation()) {
                return false;
            }
            if ((hasIncludeLocation() && getIncludeLocation() != calendarRequest.getIncludeLocation()) || hasIncludeDescription() != calendarRequest.hasIncludeDescription()) {
                return false;
            }
            if ((hasIncludeDescription() && getIncludeDescription() != calendarRequest.getIncludeDescription()) || hasIncludeAttendees() != calendarRequest.hasIncludeAttendees()) {
                return false;
            }
            if ((hasIncludeAttendees() && getIncludeAttendees() != calendarRequest.getIncludeAttendees()) || hasMaxEvents() != calendarRequest.hasMaxEvents()) {
                return false;
            }
            if ((hasMaxEvents() && getMaxEvents() != calendarRequest.getMaxEvents()) || hasMaxCalendars() != calendarRequest.hasMaxCalendars()) {
                return false;
            }
            if ((hasMaxCalendars() && getMaxCalendars() != calendarRequest.getMaxCalendars()) || hasMaxAttendees() != calendarRequest.hasMaxAttendees()) {
                return false;
            }
            if ((hasMaxAttendees() && getMaxAttendees() != calendarRequest.getMaxAttendees()) || hasMaxTitleLength() != calendarRequest.hasMaxTitleLength()) {
                return false;
            }
            if ((hasMaxTitleLength() && getMaxTitleLength() != calendarRequest.getMaxTitleLength()) || hasMaxLocationLength() != calendarRequest.hasMaxLocationLength()) {
                return false;
            }
            if ((!hasMaxLocationLength() || getMaxLocationLength() == calendarRequest.getMaxLocationLength()) && hasMaxDescriptionLength() == calendarRequest.hasMaxDescriptionLength()) {
                return (!hasMaxDescriptionLength() || getMaxDescriptionLength() == calendarRequest.getMaxDescriptionLength()) && getCalHashesList().equals(calendarRequest.getCalHashesList()) && getEventHashesList().equals(calendarRequest.getEventHashesList()) && getUnknownFields().equals(calendarRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public ByteString getCalHashes(int i14) {
            return this.calHashes_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public int getCalHashesCount() {
            return this.calHashes_.size();
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public List<ByteString> getCalHashesList() {
            return this.calHashes_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public long getEndDate() {
            return this.endDate_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public ByteString getEventHashes(int i14) {
            return this.eventHashes_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public int getEventHashesCount() {
            return this.eventHashes_.size();
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public List<ByteString> getEventHashesList() {
            return this.eventHashes_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public boolean getIncludeAttendees() {
            return this.includeAttendees_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public boolean getIncludeDescription() {
            return this.includeDescription_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public boolean getIncludeLocation() {
            return this.includeLocation_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public boolean getIncludeTitle() {
            return this.includeTitle_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public int getMaxAttendees() {
            return this.maxAttendees_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public int getMaxCalendars() {
            return this.maxCalendars_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public int getMaxDescriptionLength() {
            return this.maxDescriptionLength_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public int getMaxEvents() {
            return this.maxEvents_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public int getMaxLocationLength() {
            return this.maxLocationLength_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public int getMaxTitleLength() {
            return this.maxTitleLength_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CalendarRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt64Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt64Size(1, this.startDate_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt64Size(2, this.endDate_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeBoolSize(3, this.includeTitle_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeBoolSize(4, this.includeLocation_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeBoolSize(5, this.includeDescription_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeBoolSize(6, this.includeAttendees_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt32Size(7, this.maxEvents_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt32Size(8, this.maxCalendars_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt32Size(9, this.maxAttendees_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt32Size(10, this.maxTitleLength_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt32Size(11, this.maxLocationLength_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt32Size(12, this.maxDescriptionLength_);
            }
            int iComputeBytesSizeNoTag = 0;
            for (int i15 = 0; i15 < this.calHashes_.size(); i15++) {
                iComputeBytesSizeNoTag += CodedOutputStream.computeBytesSizeNoTag(this.calHashes_.get(i15));
            }
            int size = getCalHashesList().size() + iComputeUInt64Size + iComputeBytesSizeNoTag;
            int iComputeBytesSizeNoTag2 = 0;
            for (int i16 = 0; i16 < this.eventHashes_.size(); i16++) {
                iComputeBytesSizeNoTag2 += CodedOutputStream.computeBytesSizeNoTag(this.eventHashes_.get(i16));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + getEventHashesList().size() + size + iComputeBytesSizeNoTag2;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public long getStartDate() {
            return this.startDate_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public boolean hasEndDate() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public boolean hasIncludeAttendees() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public boolean hasIncludeDescription() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public boolean hasIncludeLocation() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public boolean hasIncludeTitle() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public boolean hasMaxAttendees() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public boolean hasMaxCalendars() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public boolean hasMaxDescriptionLength() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public boolean hasMaxEvents() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public boolean hasMaxLocationLength() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public boolean hasMaxTitleLength() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
        public boolean hasStartDate() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStartDate()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashLong(getStartDate());
            }
            if (hasEndDate()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashLong(getEndDate());
            }
            if (hasIncludeTitle()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getIncludeTitle());
            }
            if (hasIncludeLocation()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getIncludeLocation());
            }
            if (hasIncludeDescription()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashBoolean(getIncludeDescription());
            }
            if (hasIncludeAttendees()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Internal.hashBoolean(getIncludeAttendees());
            }
            if (hasMaxEvents()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getMaxEvents();
            }
            if (hasMaxCalendars()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getMaxCalendars();
            }
            if (hasMaxAttendees()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getMaxAttendees();
            }
            if (hasMaxTitleLength()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getMaxTitleLength();
            }
            if (hasMaxLocationLength()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getMaxLocationLength();
            }
            if (hasMaxDescriptionLength()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getMaxDescriptionLength();
            }
            if (getCalHashesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getCalHashesList().hashCode();
            }
            if (getEventHashesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getEventHashesList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CalendarRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CalendarRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt64(1, this.startDate_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt64(2, this.endDate_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.includeTitle_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.includeLocation_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.includeDescription_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeBool(6, this.includeAttendees_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.maxEvents_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt32(8, this.maxCalendars_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeUInt32(9, this.maxAttendees_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeUInt32(10, this.maxTitleLength_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeUInt32(11, this.maxLocationLength_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeUInt32(12, this.maxDescriptionLength_);
            }
            for (int i14 = 0; i14 < this.calHashes_.size(); i14++) {
                codedOutputStream.writeBytes(13, this.calHashes_.get(i14));
            }
            for (int i15 = 0; i15 < this.eventHashes_.size(); i15++) {
                codedOutputStream.writeBytes(14, this.eventHashes_.get(i15));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CalendarRequestOrBuilder {
            private int bitField0_;
            private Internal.ProtobufList<ByteString> calHashes_;
            private long endDate_;
            private Internal.ProtobufList<ByteString> eventHashes_;
            private boolean includeAttendees_;
            private boolean includeDescription_;
            private boolean includeLocation_;
            private boolean includeTitle_;
            private int maxAttendees_;
            private int maxCalendars_;
            private int maxDescriptionLength_;
            private int maxEvents_;
            private int maxLocationLength_;
            private int maxTitleLength_;
            private long startDate_;

            private Builder() {
                this.calHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
                this.eventHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
            }

            private void buildPartial0(CalendarRequest calendarRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    calendarRequest.startDate_ = this.startDate_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    calendarRequest.endDate_ = this.endDate_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    calendarRequest.includeTitle_ = this.includeTitle_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    calendarRequest.includeLocation_ = this.includeLocation_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    calendarRequest.includeDescription_ = this.includeDescription_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    calendarRequest.includeAttendees_ = this.includeAttendees_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    calendarRequest.maxEvents_ = this.maxEvents_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    calendarRequest.maxCalendars_ = this.maxCalendars_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    calendarRequest.maxAttendees_ = this.maxAttendees_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    calendarRequest.maxTitleLength_ = this.maxTitleLength_;
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    calendarRequest.maxLocationLength_ = this.maxLocationLength_;
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    calendarRequest.maxDescriptionLength_ = this.maxDescriptionLength_;
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    this.calHashes_.makeImmutable();
                    calendarRequest.calHashes_ = this.calHashes_;
                }
                if ((i15 & 8192) != 0) {
                    this.eventHashes_.makeImmutable();
                    calendarRequest.eventHashes_ = this.eventHashes_;
                }
                calendarRequest.bitField0_ |= i14;
            }

            private void ensureCalHashesIsMutable() {
                if (!this.calHashes_.isModifiable()) {
                    this.calHashes_ = GeneratedMessageV3.makeMutableCopy(this.calHashes_);
                }
                this.bitField0_ |= 4096;
            }

            private void ensureEventHashesIsMutable() {
                if (!this.eventHashes_.isModifiable()) {
                    this.eventHashes_ = GeneratedMessageV3.makeMutableCopy(this.eventHashes_);
                }
                this.bitField0_ |= 8192;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarRequest_descriptor;
            }

            public Builder addAllCalHashes(Iterable<? extends ByteString> iterable) {
                ensureCalHashesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.calHashes_);
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder addAllEventHashes(Iterable<? extends ByteString> iterable) {
                ensureEventHashesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.eventHashes_);
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder addCalHashes(ByteString byteString) {
                byteString.getClass();
                ensureCalHashesIsMutable();
                this.calHashes_.add(byteString);
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder addEventHashes(ByteString byteString) {
                byteString.getClass();
                ensureEventHashesIsMutable();
                this.eventHashes_.add(byteString);
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalendarRequest build() {
                CalendarRequest calendarRequestBuildPartial = buildPartial();
                if (calendarRequestBuildPartial.isInitialized()) {
                    return calendarRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) calendarRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalendarRequest buildPartial() {
                CalendarRequest calendarRequest = new CalendarRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(calendarRequest);
                }
                onBuilt();
                return calendarRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.startDate_ = 0L;
                this.endDate_ = 0L;
                this.includeTitle_ = false;
                this.includeLocation_ = false;
                this.includeDescription_ = false;
                this.includeAttendees_ = false;
                this.maxEvents_ = 0;
                this.maxCalendars_ = 0;
                this.maxAttendees_ = 0;
                this.maxTitleLength_ = 0;
                this.maxLocationLength_ = 0;
                this.maxDescriptionLength_ = 0;
                this.calHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
                this.eventHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
                return this;
            }

            public Builder clearCalHashes() {
                this.calHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
                this.bitField0_ &= -4097;
                onChanged();
                return this;
            }

            public Builder clearEndDate() {
                this.bitField0_ &= -3;
                this.endDate_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearEventHashes() {
                this.eventHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
                this.bitField0_ &= -8193;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIncludeAttendees() {
                this.bitField0_ &= -33;
                this.includeAttendees_ = false;
                onChanged();
                return this;
            }

            public Builder clearIncludeDescription() {
                this.bitField0_ &= -17;
                this.includeDescription_ = false;
                onChanged();
                return this;
            }

            public Builder clearIncludeLocation() {
                this.bitField0_ &= -9;
                this.includeLocation_ = false;
                onChanged();
                return this;
            }

            public Builder clearIncludeTitle() {
                this.bitField0_ &= -5;
                this.includeTitle_ = false;
                onChanged();
                return this;
            }

            public Builder clearMaxAttendees() {
                this.bitField0_ &= -257;
                this.maxAttendees_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxCalendars() {
                this.bitField0_ &= -129;
                this.maxCalendars_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxDescriptionLength() {
                this.bitField0_ &= -2049;
                this.maxDescriptionLength_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxEvents() {
                this.bitField0_ &= -65;
                this.maxEvents_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxLocationLength() {
                this.bitField0_ &= -1025;
                this.maxLocationLength_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxTitleLength() {
                this.bitField0_ &= -513;
                this.maxTitleLength_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStartDate() {
                this.bitField0_ &= -2;
                this.startDate_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public ByteString getCalHashes(int i14) {
                return this.calHashes_.get(i14);
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public int getCalHashesCount() {
                return this.calHashes_.size();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public List<ByteString> getCalHashesList() {
                this.calHashes_.makeImmutable();
                return this.calHashes_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public long getEndDate() {
                return this.endDate_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public ByteString getEventHashes(int i14) {
                return this.eventHashes_.get(i14);
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public int getEventHashesCount() {
                return this.eventHashes_.size();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public List<ByteString> getEventHashesList() {
                this.eventHashes_.makeImmutable();
                return this.eventHashes_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public boolean getIncludeAttendees() {
                return this.includeAttendees_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public boolean getIncludeDescription() {
                return this.includeDescription_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public boolean getIncludeLocation() {
                return this.includeLocation_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public boolean getIncludeTitle() {
                return this.includeTitle_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public int getMaxAttendees() {
                return this.maxAttendees_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public int getMaxCalendars() {
                return this.maxCalendars_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public int getMaxDescriptionLength() {
                return this.maxDescriptionLength_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public int getMaxEvents() {
                return this.maxEvents_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public int getMaxLocationLength() {
                return this.maxLocationLength_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public int getMaxTitleLength() {
                return this.maxTitleLength_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public long getStartDate() {
                return this.startDate_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public boolean hasEndDate() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public boolean hasIncludeAttendees() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public boolean hasIncludeDescription() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public boolean hasIncludeLocation() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public boolean hasIncludeTitle() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public boolean hasMaxAttendees() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public boolean hasMaxCalendars() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public boolean hasMaxDescriptionLength() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public boolean hasMaxEvents() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public boolean hasMaxLocationLength() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public boolean hasMaxTitleLength() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarRequestOrBuilder
            public boolean hasStartDate() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CalendarRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    break;
                                case 8:
                                    this.startDate_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 16:
                                    this.endDate_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 24:
                                    this.includeTitle_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 32:
                                    this.includeLocation_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 40:
                                    this.includeDescription_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 48:
                                    this.includeAttendees_ = codedInputStream.readBool();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 56:
                                    this.maxEvents_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 64:
                                    this.maxCalendars_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 72:
                                    this.maxAttendees_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 80:
                                    this.maxTitleLength_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 512;
                                    continue;
                                case 88:
                                    this.maxLocationLength_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 96:
                                    this.maxDescriptionLength_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 106:
                                    ByteString bytes = codedInputStream.readBytes();
                                    ensureCalHashesIsMutable();
                                    this.calHashes_.add(bytes);
                                    continue;
                                case 114:
                                    ByteString bytes2 = codedInputStream.readBytes();
                                    ensureEventHashesIsMutable();
                                    this.eventHashes_.add(bytes2);
                                    continue;
                                default:
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        break;
                                    }
                                    break;
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setCalHashes(int i14, ByteString byteString) {
                byteString.getClass();
                ensureCalHashesIsMutable();
                this.calHashes_.set(i14, byteString);
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setEndDate(long j8) {
                this.endDate_ = j8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setEventHashes(int i14, ByteString byteString) {
                byteString.getClass();
                ensureEventHashesIsMutable();
                this.eventHashes_.set(i14, byteString);
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setIncludeAttendees(boolean z14) {
                this.includeAttendees_ = z14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setIncludeDescription(boolean z14) {
                this.includeDescription_ = z14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setIncludeLocation(boolean z14) {
                this.includeLocation_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setIncludeTitle(boolean z14) {
                this.includeTitle_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMaxAttendees(int i14) {
                this.maxAttendees_ = i14;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setMaxCalendars(int i14) {
                this.maxCalendars_ = i14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setMaxDescriptionLength(int i14) {
                this.maxDescriptionLength_ = i14;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setMaxEvents(int i14) {
                this.maxEvents_ = i14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setMaxLocationLength(int i14) {
                this.maxLocationLength_ = i14;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setMaxTitleLength(int i14) {
                this.maxTitleLength_ = i14;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStartDate(long j8) {
                this.startDate_ = j8;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CalendarRequest getDefaultInstanceForType() {
                return CalendarRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.calHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
                this.eventHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CalendarRequest) {
                    return mergeFrom((CalendarRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CalendarRequest calendarRequest) {
                if (calendarRequest == CalendarRequest.getDefaultInstance()) {
                    return this;
                }
                if (calendarRequest.hasStartDate()) {
                    setStartDate(calendarRequest.getStartDate());
                }
                if (calendarRequest.hasEndDate()) {
                    setEndDate(calendarRequest.getEndDate());
                }
                if (calendarRequest.hasIncludeTitle()) {
                    setIncludeTitle(calendarRequest.getIncludeTitle());
                }
                if (calendarRequest.hasIncludeLocation()) {
                    setIncludeLocation(calendarRequest.getIncludeLocation());
                }
                if (calendarRequest.hasIncludeDescription()) {
                    setIncludeDescription(calendarRequest.getIncludeDescription());
                }
                if (calendarRequest.hasIncludeAttendees()) {
                    setIncludeAttendees(calendarRequest.getIncludeAttendees());
                }
                if (calendarRequest.hasMaxEvents()) {
                    setMaxEvents(calendarRequest.getMaxEvents());
                }
                if (calendarRequest.hasMaxCalendars()) {
                    setMaxCalendars(calendarRequest.getMaxCalendars());
                }
                if (calendarRequest.hasMaxAttendees()) {
                    setMaxAttendees(calendarRequest.getMaxAttendees());
                }
                if (calendarRequest.hasMaxTitleLength()) {
                    setMaxTitleLength(calendarRequest.getMaxTitleLength());
                }
                if (calendarRequest.hasMaxLocationLength()) {
                    setMaxLocationLength(calendarRequest.getMaxLocationLength());
                }
                if (calendarRequest.hasMaxDescriptionLength()) {
                    setMaxDescriptionLength(calendarRequest.getMaxDescriptionLength());
                }
                if (!calendarRequest.calHashes_.isEmpty()) {
                    if (this.calHashes_.isEmpty()) {
                        Internal.ProtobufList<ByteString> protobufList = calendarRequest.calHashes_;
                        this.calHashes_ = protobufList;
                        protobufList.makeImmutable();
                        this.bitField0_ |= 4096;
                    } else {
                        ensureCalHashesIsMutable();
                        this.calHashes_.addAll(calendarRequest.calHashes_);
                    }
                    onChanged();
                }
                if (!calendarRequest.eventHashes_.isEmpty()) {
                    if (this.eventHashes_.isEmpty()) {
                        Internal.ProtobufList<ByteString> protobufList2 = calendarRequest.eventHashes_;
                        this.eventHashes_ = protobufList2;
                        protobufList2.makeImmutable();
                        this.bitField0_ |= 8192;
                    } else {
                        ensureEventHashesIsMutable();
                        this.eventHashes_.addAll(calendarRequest.eventHashes_);
                    }
                    onChanged();
                }
                mergeUnknownFields(calendarRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CalendarRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CalendarRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalendarRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CalendarRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CalendarRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CalendarRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CalendarRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CalendarRequest parseFrom(InputStream inputStream) {
            return (CalendarRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CalendarRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalendarRequest parseFrom(CodedInputStream codedInputStream) {
            return (CalendarRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CalendarRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private CalendarRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.startDate_ = 0L;
            this.endDate_ = 0L;
            this.includeTitle_ = false;
            this.includeLocation_ = false;
            this.includeDescription_ = false;
            this.includeAttendees_ = false;
            this.maxEvents_ = 0;
            this.maxCalendars_ = 0;
            this.maxAttendees_ = 0;
            this.maxTitleLength_ = 0;
            this.maxLocationLength_ = 0;
            this.maxDescriptionLength_ = 0;
            this.calHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
            this.eventHashes_ = GeneratedMessageV3.emptyList(ByteString.class);
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ CalendarRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class CalendarResponse extends GeneratedMessageV3 implements CalendarResponseOrBuilder {
        private static final CalendarResponse DEFAULT_INSTANCE = new CalendarResponse();

        @Deprecated
        public static final Parser<CalendarResponse> PARSER = new AbstractParser<CalendarResponse>() { // from class: com.garmin.proto.generated.GDICalendarProto.CalendarResponse.1
            @Override // com.google.protobuf.Parser
            public CalendarResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CalendarResponse.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int STATUS_FIELD_NUMBER = 1;
        public static final int XFER_DATA_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int status_;
        private GDIDataTypes.DataTransferItem xferData_;

        private CalendarResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CalendarResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarResponse_descriptor;
        }

        public static Builder newBuilder(CalendarResponse calendarResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(calendarResponse);
        }

        public static CalendarResponse parseDelimitedFrom(InputStream inputStream) {
            return (CalendarResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CalendarResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CalendarResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CalendarResponse)) {
                return super.equals(obj);
            }
            CalendarResponse calendarResponse = (CalendarResponse) obj;
            if (hasStatus() != calendarResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == calendarResponse.status_) && hasXferData() == calendarResponse.hasXferData()) {
                return (!hasXferData() || getXferData().equals(calendarResponse.getXferData())) && getUnknownFields().equals(calendarResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CalendarResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getXferData());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarResponseOrBuilder
        public GDIDataTypes.DataTransferItem getXferData() {
            GDIDataTypes.DataTransferItem dataTransferItem = this.xferData_;
            return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarResponseOrBuilder
        public GDIDataTypes.DataTransferItemOrBuilder getXferDataOrBuilder() {
            GDIDataTypes.DataTransferItem dataTransferItem = this.xferData_;
            return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarResponseOrBuilder
        public boolean hasXferData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.status_;
            }
            if (hasXferData()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getXferData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CalendarResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            if (!hasXferData() || getXferData().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CalendarResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.status_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getXferData());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CalendarResponseOrBuilder {
            private int bitField0_;
            private int status_;
            private SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> xferDataBuilder_;
            private GDIDataTypes.DataTransferItem xferData_;

            private Builder() {
                this.status_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CalendarResponse calendarResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    calendarResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                    calendarResponse.xferData_ = singleFieldBuilderV3 == null ? this.xferData_ : (GDIDataTypes.DataTransferItem) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                calendarResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarResponse_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> getXferDataFieldBuilder() {
                if (this.xferDataBuilder_ == null) {
                    this.xferDataBuilder_ = new SingleFieldBuilderV3<>(getXferData(), getParentForChildren(), isClean());
                    this.xferData_ = null;
                }
                return this.xferDataBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getXferDataFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalendarResponse build() {
                CalendarResponse calendarResponseBuildPartial = buildPartial();
                if (calendarResponseBuildPartial.isInitialized()) {
                    return calendarResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) calendarResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalendarResponse buildPartial() {
                CalendarResponse calendarResponse = new CalendarResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(calendarResponse);
                }
                onBuilt();
                return calendarResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.xferData_ = null;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.xferDataBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = 0;
                onChanged();
                return this;
            }

            public Builder clearXferData() {
                this.bitField0_ &= -3;
                this.xferData_ = null;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.xferDataBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarResponseOrBuilder
            public GDIDataTypes.DataTransferItem getXferData() {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.DataTransferItem) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.DataTransferItem dataTransferItem = this.xferData_;
                return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
            }

            public GDIDataTypes.DataTransferItem.Builder getXferDataBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (GDIDataTypes.DataTransferItem.Builder) getXferDataFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarResponseOrBuilder
            public GDIDataTypes.DataTransferItemOrBuilder getXferDataOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.DataTransferItemOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.DataTransferItem dataTransferItem = this.xferData_;
                return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarResponseOrBuilder
            public boolean hasXferData() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CalendarResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasXferData() || getXferData().isInitialized();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getXferDataFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeXferData(GDIDataTypes.DataTransferItem dataTransferItem) {
                GDIDataTypes.DataTransferItem dataTransferItem2;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataTransferItem);
                } else if ((this.bitField0_ & 2) == 0 || (dataTransferItem2 = this.xferData_) == null || dataTransferItem2 == GDIDataTypes.DataTransferItem.getDefaultInstance()) {
                    this.xferData_ = dataTransferItem;
                } else {
                    getXferDataBuilder().mergeFrom(dataTransferItem);
                }
                if (this.xferData_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setXferData(GDIDataTypes.DataTransferItem.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.xferData_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CalendarResponse getDefaultInstanceForType() {
                return CalendarResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setXferData(GDIDataTypes.DataTransferItem dataTransferItem) {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataTransferItem.getClass();
                    this.xferData_ = dataTransferItem;
                } else {
                    singleFieldBuilderV3.setMessage(dataTransferItem);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CalendarResponse) {
                    return mergeFrom((CalendarResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CalendarResponse calendarResponse) {
                if (calendarResponse == CalendarResponse.getDefaultInstance()) {
                    return this;
                }
                if (calendarResponse.hasStatus()) {
                    setStatus(calendarResponse.getStatus());
                }
                if (calendarResponse.hasXferData()) {
                    mergeXferData(calendarResponse.getXferData());
                }
                mergeUnknownFields(calendarResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CalendarResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CalendarResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalendarResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ CalendarResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CalendarResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CalendarResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CalendarResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CalendarResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CalendarResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CalendarResponse parseFrom(InputStream inputStream) {
            return (CalendarResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CalendarResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalendarResponse parseFrom(CodedInputStream codedInputStream) {
            return (CalendarResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CalendarResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE_STATUS(0),
            OK(1),
            INVALID_DATE_RANGE(2),
            PERMISSION_REQUIRED(3);

            public static final int INVALID_DATE_RANGE_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int PERMISSION_REQUIRED_VALUE = 3;
            public static final int UNKNOWN_RESPONSE_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDICalendarProto.CalendarResponse.ResponseStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResponseStatus findValueByNumber(int i14) {
                    return ResponseStatus.forNumber(i14);
                }
            };
            private static final ResponseStatus[] VALUES = values();

            ResponseStatus(int i14) {
                this.value = i14;
            }

            public static ResponseStatus forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN_RESPONSE_STATUS;
                }
                if (i14 == 1) {
                    return OK;
                }
                if (i14 == 2) {
                    return INVALID_DATE_RANGE;
                }
                if (i14 != 3) {
                    return null;
                }
                return PERMISSION_REQUIRED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CalendarResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ResponseStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ResponseStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                h.s("EnumValueDescriptor is not for this type.");
                return null;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static ResponseStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class CalendarService extends GeneratedMessageV3 implements CalendarServiceOrBuilder {
        public static final int CALENDAR_EVENTS_REQUEST_FIELD_NUMBER = 1;
        public static final int CALENDAR_EVENTS_RESPONSE_FIELD_NUMBER = 2;
        public static final int CALENDAR_REQUEST_FIELD_NUMBER = 3;
        public static final int CALENDAR_RESPONSE_FIELD_NUMBER = 4;
        private static final CalendarService DEFAULT_INSTANCE = new CalendarService();

        @Deprecated
        public static final Parser<CalendarService> PARSER = new AbstractParser<CalendarService>() { // from class: com.garmin.proto.generated.GDICalendarProto.CalendarService.1
            @Override // com.google.protobuf.Parser
            public CalendarService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CalendarService.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CalendarEventsRequest calendarEventsRequest_;
        private CalendarEventsResponse calendarEventsResponse_;
        private CalendarRequest calendarRequest_;
        private CalendarResponse calendarResponse_;
        private byte memoizedIsInitialized;

        private CalendarService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CalendarService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarService_descriptor;
        }

        public static Builder newBuilder(CalendarService calendarService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(calendarService);
        }

        public static CalendarService parseDelimitedFrom(InputStream inputStream) {
            return (CalendarService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CalendarService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CalendarService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CalendarService)) {
                return super.equals(obj);
            }
            CalendarService calendarService = (CalendarService) obj;
            if (hasCalendarEventsRequest() != calendarService.hasCalendarEventsRequest()) {
                return false;
            }
            if ((hasCalendarEventsRequest() && !getCalendarEventsRequest().equals(calendarService.getCalendarEventsRequest())) || hasCalendarEventsResponse() != calendarService.hasCalendarEventsResponse()) {
                return false;
            }
            if ((hasCalendarEventsResponse() && !getCalendarEventsResponse().equals(calendarService.getCalendarEventsResponse())) || hasCalendarRequest() != calendarService.hasCalendarRequest()) {
                return false;
            }
            if ((!hasCalendarRequest() || getCalendarRequest().equals(calendarService.getCalendarRequest())) && hasCalendarResponse() == calendarService.hasCalendarResponse()) {
                return (!hasCalendarResponse() || getCalendarResponse().equals(calendarService.getCalendarResponse())) && getUnknownFields().equals(calendarService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
        public CalendarEventsRequest getCalendarEventsRequest() {
            CalendarEventsRequest calendarEventsRequest = this.calendarEventsRequest_;
            return calendarEventsRequest == null ? CalendarEventsRequest.getDefaultInstance() : calendarEventsRequest;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
        public CalendarEventsRequestOrBuilder getCalendarEventsRequestOrBuilder() {
            CalendarEventsRequest calendarEventsRequest = this.calendarEventsRequest_;
            return calendarEventsRequest == null ? CalendarEventsRequest.getDefaultInstance() : calendarEventsRequest;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
        public CalendarEventsResponse getCalendarEventsResponse() {
            CalendarEventsResponse calendarEventsResponse = this.calendarEventsResponse_;
            return calendarEventsResponse == null ? CalendarEventsResponse.getDefaultInstance() : calendarEventsResponse;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
        public CalendarEventsResponseOrBuilder getCalendarEventsResponseOrBuilder() {
            CalendarEventsResponse calendarEventsResponse = this.calendarEventsResponse_;
            return calendarEventsResponse == null ? CalendarEventsResponse.getDefaultInstance() : calendarEventsResponse;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
        public CalendarRequest getCalendarRequest() {
            CalendarRequest calendarRequest = this.calendarRequest_;
            return calendarRequest == null ? CalendarRequest.getDefaultInstance() : calendarRequest;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
        public CalendarRequestOrBuilder getCalendarRequestOrBuilder() {
            CalendarRequest calendarRequest = this.calendarRequest_;
            return calendarRequest == null ? CalendarRequest.getDefaultInstance() : calendarRequest;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
        public CalendarResponse getCalendarResponse() {
            CalendarResponse calendarResponse = this.calendarResponse_;
            return calendarResponse == null ? CalendarResponse.getDefaultInstance() : calendarResponse;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
        public CalendarResponseOrBuilder getCalendarResponseOrBuilder() {
            CalendarResponse calendarResponse = this.calendarResponse_;
            return calendarResponse == null ? CalendarResponse.getDefaultInstance() : calendarResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CalendarService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCalendarEventsRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getCalendarEventsResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getCalendarRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getCalendarResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
        public boolean hasCalendarEventsRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
        public boolean hasCalendarEventsResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
        public boolean hasCalendarRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
        public boolean hasCalendarResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCalendarEventsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCalendarEventsRequest().hashCode();
            }
            if (hasCalendarEventsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCalendarEventsResponse().hashCode();
            }
            if (hasCalendarRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getCalendarRequest().hashCode();
            }
            if (hasCalendarResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getCalendarResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarService_fieldAccessorTable.ensureFieldAccessorsInitialized(CalendarService.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            if (!hasCalendarResponse() || getCalendarResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CalendarService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getCalendarEventsRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getCalendarEventsResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getCalendarRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getCalendarResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CalendarServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<CalendarEventsRequest, CalendarEventsRequest.Builder, CalendarEventsRequestOrBuilder> calendarEventsRequestBuilder_;
            private CalendarEventsRequest calendarEventsRequest_;
            private SingleFieldBuilderV3<CalendarEventsResponse, CalendarEventsResponse.Builder, CalendarEventsResponseOrBuilder> calendarEventsResponseBuilder_;
            private CalendarEventsResponse calendarEventsResponse_;
            private SingleFieldBuilderV3<CalendarRequest, CalendarRequest.Builder, CalendarRequestOrBuilder> calendarRequestBuilder_;
            private CalendarRequest calendarRequest_;
            private SingleFieldBuilderV3<CalendarResponse, CalendarResponse.Builder, CalendarResponseOrBuilder> calendarResponseBuilder_;
            private CalendarResponse calendarResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CalendarService calendarService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<CalendarEventsRequest, CalendarEventsRequest.Builder, CalendarEventsRequestOrBuilder> singleFieldBuilderV3 = this.calendarEventsRequestBuilder_;
                    calendarService.calendarEventsRequest_ = singleFieldBuilderV3 == null ? this.calendarEventsRequest_ : (CalendarEventsRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<CalendarEventsResponse, CalendarEventsResponse.Builder, CalendarEventsResponseOrBuilder> singleFieldBuilderV4 = this.calendarEventsResponseBuilder_;
                    calendarService.calendarEventsResponse_ = singleFieldBuilderV4 == null ? this.calendarEventsResponse_ : (CalendarEventsResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<CalendarRequest, CalendarRequest.Builder, CalendarRequestOrBuilder> singleFieldBuilderV5 = this.calendarRequestBuilder_;
                    calendarService.calendarRequest_ = singleFieldBuilderV5 == null ? this.calendarRequest_ : (CalendarRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<CalendarResponse, CalendarResponse.Builder, CalendarResponseOrBuilder> singleFieldBuilderV6 = this.calendarResponseBuilder_;
                    calendarService.calendarResponse_ = singleFieldBuilderV6 == null ? this.calendarResponse_ : (CalendarResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                calendarService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<CalendarEventsRequest, CalendarEventsRequest.Builder, CalendarEventsRequestOrBuilder> getCalendarEventsRequestFieldBuilder() {
                if (this.calendarEventsRequestBuilder_ == null) {
                    this.calendarEventsRequestBuilder_ = new SingleFieldBuilderV3<>(getCalendarEventsRequest(), getParentForChildren(), isClean());
                    this.calendarEventsRequest_ = null;
                }
                return this.calendarEventsRequestBuilder_;
            }

            private SingleFieldBuilderV3<CalendarEventsResponse, CalendarEventsResponse.Builder, CalendarEventsResponseOrBuilder> getCalendarEventsResponseFieldBuilder() {
                if (this.calendarEventsResponseBuilder_ == null) {
                    this.calendarEventsResponseBuilder_ = new SingleFieldBuilderV3<>(getCalendarEventsResponse(), getParentForChildren(), isClean());
                    this.calendarEventsResponse_ = null;
                }
                return this.calendarEventsResponseBuilder_;
            }

            private SingleFieldBuilderV3<CalendarRequest, CalendarRequest.Builder, CalendarRequestOrBuilder> getCalendarRequestFieldBuilder() {
                if (this.calendarRequestBuilder_ == null) {
                    this.calendarRequestBuilder_ = new SingleFieldBuilderV3<>(getCalendarRequest(), getParentForChildren(), isClean());
                    this.calendarRequest_ = null;
                }
                return this.calendarRequestBuilder_;
            }

            private SingleFieldBuilderV3<CalendarResponse, CalendarResponse.Builder, CalendarResponseOrBuilder> getCalendarResponseFieldBuilder() {
                if (this.calendarResponseBuilder_ == null) {
                    this.calendarResponseBuilder_ = new SingleFieldBuilderV3<>(getCalendarResponse(), getParentForChildren(), isClean());
                    this.calendarResponse_ = null;
                }
                return this.calendarResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarService_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCalendarEventsRequestFieldBuilder();
                    getCalendarEventsResponseFieldBuilder();
                    getCalendarRequestFieldBuilder();
                    getCalendarResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalendarService build() {
                CalendarService calendarServiceBuildPartial = buildPartial();
                if (calendarServiceBuildPartial.isInitialized()) {
                    return calendarServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) calendarServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CalendarService buildPartial() {
                CalendarService calendarService = new CalendarService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(calendarService);
                }
                onBuilt();
                return calendarService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.calendarEventsRequest_ = null;
                SingleFieldBuilderV3<CalendarEventsRequest, CalendarEventsRequest.Builder, CalendarEventsRequestOrBuilder> singleFieldBuilderV3 = this.calendarEventsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.calendarEventsRequestBuilder_ = null;
                }
                this.calendarEventsResponse_ = null;
                SingleFieldBuilderV3<CalendarEventsResponse, CalendarEventsResponse.Builder, CalendarEventsResponseOrBuilder> singleFieldBuilderV4 = this.calendarEventsResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.calendarEventsResponseBuilder_ = null;
                }
                this.calendarRequest_ = null;
                SingleFieldBuilderV3<CalendarRequest, CalendarRequest.Builder, CalendarRequestOrBuilder> singleFieldBuilderV5 = this.calendarRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.calendarRequestBuilder_ = null;
                }
                this.calendarResponse_ = null;
                SingleFieldBuilderV3<CalendarResponse, CalendarResponse.Builder, CalendarResponseOrBuilder> singleFieldBuilderV6 = this.calendarResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.calendarResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearCalendarEventsRequest() {
                this.bitField0_ &= -2;
                this.calendarEventsRequest_ = null;
                SingleFieldBuilderV3<CalendarEventsRequest, CalendarEventsRequest.Builder, CalendarEventsRequestOrBuilder> singleFieldBuilderV3 = this.calendarEventsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.calendarEventsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCalendarEventsResponse() {
                this.bitField0_ &= -3;
                this.calendarEventsResponse_ = null;
                SingleFieldBuilderV3<CalendarEventsResponse, CalendarEventsResponse.Builder, CalendarEventsResponseOrBuilder> singleFieldBuilderV3 = this.calendarEventsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.calendarEventsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCalendarRequest() {
                this.bitField0_ &= -5;
                this.calendarRequest_ = null;
                SingleFieldBuilderV3<CalendarRequest, CalendarRequest.Builder, CalendarRequestOrBuilder> singleFieldBuilderV3 = this.calendarRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.calendarRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCalendarResponse() {
                this.bitField0_ &= -9;
                this.calendarResponse_ = null;
                SingleFieldBuilderV3<CalendarResponse, CalendarResponse.Builder, CalendarResponseOrBuilder> singleFieldBuilderV3 = this.calendarResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.calendarResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
            public CalendarEventsRequest getCalendarEventsRequest() {
                SingleFieldBuilderV3<CalendarEventsRequest, CalendarEventsRequest.Builder, CalendarEventsRequestOrBuilder> singleFieldBuilderV3 = this.calendarEventsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CalendarEventsRequest) singleFieldBuilderV3.getMessage();
                }
                CalendarEventsRequest calendarEventsRequest = this.calendarEventsRequest_;
                return calendarEventsRequest == null ? CalendarEventsRequest.getDefaultInstance() : calendarEventsRequest;
            }

            public CalendarEventsRequest.Builder getCalendarEventsRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (CalendarEventsRequest.Builder) getCalendarEventsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
            public CalendarEventsRequestOrBuilder getCalendarEventsRequestOrBuilder() {
                SingleFieldBuilderV3<CalendarEventsRequest, CalendarEventsRequest.Builder, CalendarEventsRequestOrBuilder> singleFieldBuilderV3 = this.calendarEventsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CalendarEventsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CalendarEventsRequest calendarEventsRequest = this.calendarEventsRequest_;
                return calendarEventsRequest == null ? CalendarEventsRequest.getDefaultInstance() : calendarEventsRequest;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
            public CalendarEventsResponse getCalendarEventsResponse() {
                SingleFieldBuilderV3<CalendarEventsResponse, CalendarEventsResponse.Builder, CalendarEventsResponseOrBuilder> singleFieldBuilderV3 = this.calendarEventsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CalendarEventsResponse) singleFieldBuilderV3.getMessage();
                }
                CalendarEventsResponse calendarEventsResponse = this.calendarEventsResponse_;
                return calendarEventsResponse == null ? CalendarEventsResponse.getDefaultInstance() : calendarEventsResponse;
            }

            public CalendarEventsResponse.Builder getCalendarEventsResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (CalendarEventsResponse.Builder) getCalendarEventsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
            public CalendarEventsResponseOrBuilder getCalendarEventsResponseOrBuilder() {
                SingleFieldBuilderV3<CalendarEventsResponse, CalendarEventsResponse.Builder, CalendarEventsResponseOrBuilder> singleFieldBuilderV3 = this.calendarEventsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CalendarEventsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CalendarEventsResponse calendarEventsResponse = this.calendarEventsResponse_;
                return calendarEventsResponse == null ? CalendarEventsResponse.getDefaultInstance() : calendarEventsResponse;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
            public CalendarRequest getCalendarRequest() {
                SingleFieldBuilderV3<CalendarRequest, CalendarRequest.Builder, CalendarRequestOrBuilder> singleFieldBuilderV3 = this.calendarRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CalendarRequest) singleFieldBuilderV3.getMessage();
                }
                CalendarRequest calendarRequest = this.calendarRequest_;
                return calendarRequest == null ? CalendarRequest.getDefaultInstance() : calendarRequest;
            }

            public CalendarRequest.Builder getCalendarRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (CalendarRequest.Builder) getCalendarRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
            public CalendarRequestOrBuilder getCalendarRequestOrBuilder() {
                SingleFieldBuilderV3<CalendarRequest, CalendarRequest.Builder, CalendarRequestOrBuilder> singleFieldBuilderV3 = this.calendarRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CalendarRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CalendarRequest calendarRequest = this.calendarRequest_;
                return calendarRequest == null ? CalendarRequest.getDefaultInstance() : calendarRequest;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
            public CalendarResponse getCalendarResponse() {
                SingleFieldBuilderV3<CalendarResponse, CalendarResponse.Builder, CalendarResponseOrBuilder> singleFieldBuilderV3 = this.calendarResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CalendarResponse) singleFieldBuilderV3.getMessage();
                }
                CalendarResponse calendarResponse = this.calendarResponse_;
                return calendarResponse == null ? CalendarResponse.getDefaultInstance() : calendarResponse;
            }

            public CalendarResponse.Builder getCalendarResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (CalendarResponse.Builder) getCalendarResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
            public CalendarResponseOrBuilder getCalendarResponseOrBuilder() {
                SingleFieldBuilderV3<CalendarResponse, CalendarResponse.Builder, CalendarResponseOrBuilder> singleFieldBuilderV3 = this.calendarResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CalendarResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CalendarResponse calendarResponse = this.calendarResponse_;
                return calendarResponse == null ? CalendarResponse.getDefaultInstance() : calendarResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
            public boolean hasCalendarEventsRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
            public boolean hasCalendarEventsResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
            public boolean hasCalendarRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.CalendarServiceOrBuilder
            public boolean hasCalendarResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_CalendarService_fieldAccessorTable.ensureFieldAccessorsInitialized(CalendarService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasCalendarResponse() || getCalendarResponse().isInitialized();
            }

            public Builder mergeCalendarEventsRequest(CalendarEventsRequest calendarEventsRequest) {
                CalendarEventsRequest calendarEventsRequest2;
                SingleFieldBuilderV3<CalendarEventsRequest, CalendarEventsRequest.Builder, CalendarEventsRequestOrBuilder> singleFieldBuilderV3 = this.calendarEventsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(calendarEventsRequest);
                } else if ((this.bitField0_ & 1) == 0 || (calendarEventsRequest2 = this.calendarEventsRequest_) == null || calendarEventsRequest2 == CalendarEventsRequest.getDefaultInstance()) {
                    this.calendarEventsRequest_ = calendarEventsRequest;
                } else {
                    getCalendarEventsRequestBuilder().mergeFrom(calendarEventsRequest);
                }
                if (this.calendarEventsRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCalendarEventsResponse(CalendarEventsResponse calendarEventsResponse) {
                CalendarEventsResponse calendarEventsResponse2;
                SingleFieldBuilderV3<CalendarEventsResponse, CalendarEventsResponse.Builder, CalendarEventsResponseOrBuilder> singleFieldBuilderV3 = this.calendarEventsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(calendarEventsResponse);
                } else if ((this.bitField0_ & 2) == 0 || (calendarEventsResponse2 = this.calendarEventsResponse_) == null || calendarEventsResponse2 == CalendarEventsResponse.getDefaultInstance()) {
                    this.calendarEventsResponse_ = calendarEventsResponse;
                } else {
                    getCalendarEventsResponseBuilder().mergeFrom(calendarEventsResponse);
                }
                if (this.calendarEventsResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCalendarRequest(CalendarRequest calendarRequest) {
                CalendarRequest calendarRequest2;
                SingleFieldBuilderV3<CalendarRequest, CalendarRequest.Builder, CalendarRequestOrBuilder> singleFieldBuilderV3 = this.calendarRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(calendarRequest);
                } else if ((this.bitField0_ & 4) == 0 || (calendarRequest2 = this.calendarRequest_) == null || calendarRequest2 == CalendarRequest.getDefaultInstance()) {
                    this.calendarRequest_ = calendarRequest;
                } else {
                    getCalendarRequestBuilder().mergeFrom(calendarRequest);
                }
                if (this.calendarRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCalendarResponse(CalendarResponse calendarResponse) {
                CalendarResponse calendarResponse2;
                SingleFieldBuilderV3<CalendarResponse, CalendarResponse.Builder, CalendarResponseOrBuilder> singleFieldBuilderV3 = this.calendarResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(calendarResponse);
                } else if ((this.bitField0_ & 8) == 0 || (calendarResponse2 = this.calendarResponse_) == null || calendarResponse2 == CalendarResponse.getDefaultInstance()) {
                    this.calendarResponse_ = calendarResponse;
                } else {
                    getCalendarResponseBuilder().mergeFrom(calendarResponse);
                }
                if (this.calendarResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    codedInputStream.readMessage(getCalendarEventsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getCalendarEventsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getCalendarRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getCalendarResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setCalendarEventsRequest(CalendarEventsRequest.Builder builder) {
                SingleFieldBuilderV3<CalendarEventsRequest, CalendarEventsRequest.Builder, CalendarEventsRequestOrBuilder> singleFieldBuilderV3 = this.calendarEventsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.calendarEventsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCalendarEventsResponse(CalendarEventsResponse.Builder builder) {
                SingleFieldBuilderV3<CalendarEventsResponse, CalendarEventsResponse.Builder, CalendarEventsResponseOrBuilder> singleFieldBuilderV3 = this.calendarEventsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.calendarEventsResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCalendarRequest(CalendarRequest.Builder builder) {
                SingleFieldBuilderV3<CalendarRequest, CalendarRequest.Builder, CalendarRequestOrBuilder> singleFieldBuilderV3 = this.calendarRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.calendarRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setCalendarResponse(CalendarResponse.Builder builder) {
                SingleFieldBuilderV3<CalendarResponse, CalendarResponse.Builder, CalendarResponseOrBuilder> singleFieldBuilderV3 = this.calendarResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.calendarResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CalendarService getDefaultInstanceForType() {
                return CalendarService.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            public Builder setCalendarEventsRequest(CalendarEventsRequest calendarEventsRequest) {
                SingleFieldBuilderV3<CalendarEventsRequest, CalendarEventsRequest.Builder, CalendarEventsRequestOrBuilder> singleFieldBuilderV3 = this.calendarEventsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    calendarEventsRequest.getClass();
                    this.calendarEventsRequest_ = calendarEventsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(calendarEventsRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCalendarEventsResponse(CalendarEventsResponse calendarEventsResponse) {
                SingleFieldBuilderV3<CalendarEventsResponse, CalendarEventsResponse.Builder, CalendarEventsResponseOrBuilder> singleFieldBuilderV3 = this.calendarEventsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    calendarEventsResponse.getClass();
                    this.calendarEventsResponse_ = calendarEventsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(calendarEventsResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCalendarRequest(CalendarRequest calendarRequest) {
                SingleFieldBuilderV3<CalendarRequest, CalendarRequest.Builder, CalendarRequestOrBuilder> singleFieldBuilderV3 = this.calendarRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    calendarRequest.getClass();
                    this.calendarRequest_ = calendarRequest;
                } else {
                    singleFieldBuilderV3.setMessage(calendarRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setCalendarResponse(CalendarResponse calendarResponse) {
                SingleFieldBuilderV3<CalendarResponse, CalendarResponse.Builder, CalendarResponseOrBuilder> singleFieldBuilderV3 = this.calendarResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    calendarResponse.getClass();
                    this.calendarResponse_ = calendarResponse;
                } else {
                    singleFieldBuilderV3.setMessage(calendarResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CalendarService) {
                    return mergeFrom((CalendarService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CalendarService calendarService) {
                if (calendarService == CalendarService.getDefaultInstance()) {
                    return this;
                }
                if (calendarService.hasCalendarEventsRequest()) {
                    mergeCalendarEventsRequest(calendarService.getCalendarEventsRequest());
                }
                if (calendarService.hasCalendarEventsResponse()) {
                    mergeCalendarEventsResponse(calendarService.getCalendarEventsResponse());
                }
                if (calendarService.hasCalendarRequest()) {
                    mergeCalendarRequest(calendarService.getCalendarRequest());
                }
                if (calendarService.hasCalendarResponse()) {
                    mergeCalendarResponse(calendarService.getCalendarResponse());
                }
                mergeUnknownFields(calendarService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CalendarService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ CalendarService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CalendarService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CalendarService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalendarService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CalendarService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CalendarService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CalendarService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CalendarService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CalendarService parseFrom(InputStream inputStream) {
            return (CalendarService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CalendarService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CalendarService parseFrom(CodedInputStream codedInputStream) {
            return (CalendarService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CalendarService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CalendarService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Event extends GeneratedMessageV3 implements EventOrBuilder {
        public static final int ALL_DAY_FIELD_NUMBER = 5;
        public static final int ATTENDEES_FIELD_NUMBER = 11;
        public static final int CALENDAR_ID_FIELD_NUMBER = 2;
        public static final int DESCRIPTION_FIELD_NUMBER = 8;
        public static final int END_DATE_FIELD_NUMBER = 4;
        public static final int HASH_FIELD_NUMBER = 1;
        public static final int LOCATION_FIELD_NUMBER = 7;
        public static final int POS_LAT_FIELD_NUMBER = 9;
        public static final int POS_LON_FIELD_NUMBER = 10;
        public static final int START_DATE_FIELD_NUMBER = 3;
        public static final int TITLE_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private boolean allDay_;
        private List<Attendee> attendees_;
        private int bitField0_;
        private volatile Object calendarId_;
        private volatile Object description_;
        private long endDate_;
        private ByteString hash_;
        private volatile Object location_;
        private byte memoizedIsInitialized;
        private float posLat_;
        private float posLon_;
        private long startDate_;
        private volatile Object title_;
        private static final Event DEFAULT_INSTANCE = new Event();

        @Deprecated
        public static final Parser<Event> PARSER = new AbstractParser<Event>() { // from class: com.garmin.proto.generated.GDICalendarProto.Event.1
            @Override // com.google.protobuf.Parser
            public Event parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Event.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        private Event() {
            ByteString byteString = ByteString.EMPTY;
            this.hash_ = byteString;
            this.calendarId_ = "";
            this.startDate_ = 0L;
            this.endDate_ = 0L;
            this.allDay_ = false;
            this.title_ = "";
            this.location_ = "";
            this.description_ = "";
            this.posLat_ = 0.0f;
            this.posLon_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
            this.hash_ = byteString;
            this.calendarId_ = "";
            this.title_ = "";
            this.location_ = "";
            this.description_ = "";
            this.attendees_ = Collections.EMPTY_LIST;
        }

        public static Event getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_Event_descriptor;
        }

        public static Builder newBuilder(Event event) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(event);
        }

        public static Event parseDelimitedFrom(InputStream inputStream) {
            return (Event) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Event parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Event> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Event)) {
                return super.equals(obj);
            }
            Event event = (Event) obj;
            if (hasHash() != event.hasHash()) {
                return false;
            }
            if ((hasHash() && !getHash().equals(event.getHash())) || hasCalendarId() != event.hasCalendarId()) {
                return false;
            }
            if ((hasCalendarId() && !getCalendarId().equals(event.getCalendarId())) || hasStartDate() != event.hasStartDate()) {
                return false;
            }
            if ((hasStartDate() && getStartDate() != event.getStartDate()) || hasEndDate() != event.hasEndDate()) {
                return false;
            }
            if ((hasEndDate() && getEndDate() != event.getEndDate()) || hasAllDay() != event.hasAllDay()) {
                return false;
            }
            if ((hasAllDay() && getAllDay() != event.getAllDay()) || hasTitle() != event.hasTitle()) {
                return false;
            }
            if ((hasTitle() && !getTitle().equals(event.getTitle())) || hasLocation() != event.hasLocation()) {
                return false;
            }
            if ((hasLocation() && !getLocation().equals(event.getLocation())) || hasDescription() != event.hasDescription()) {
                return false;
            }
            if ((hasDescription() && !getDescription().equals(event.getDescription())) || hasPosLat() != event.hasPosLat()) {
                return false;
            }
            if ((!hasPosLat() || Float.floatToIntBits(getPosLat()) == Float.floatToIntBits(event.getPosLat())) && hasPosLon() == event.hasPosLon()) {
                return (!hasPosLon() || Float.floatToIntBits(getPosLon()) == Float.floatToIntBits(event.getPosLon())) && getAttendeesList().equals(event.getAttendeesList()) && getUnknownFields().equals(event.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public boolean getAllDay() {
            return this.allDay_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public Attendee getAttendees(int i14) {
            return this.attendees_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public int getAttendeesCount() {
            return this.attendees_.size();
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public List<Attendee> getAttendeesList() {
            return this.attendees_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public AttendeeOrBuilder getAttendeesOrBuilder(int i14) {
            return this.attendees_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public List<? extends AttendeeOrBuilder> getAttendeesOrBuilderList() {
            return this.attendees_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public String getCalendarId() {
            Object obj = this.calendarId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.calendarId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public ByteString getCalendarIdBytes() {
            Object obj = this.calendarId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.calendarId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public String getDescription() {
            Object obj = this.description_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.description_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public ByteString getDescriptionBytes() {
            Object obj = this.description_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.description_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public long getEndDate() {
            return this.endDate_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public ByteString getHash() {
            return this.hash_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public String getLocation() {
            Object obj = this.location_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.location_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public ByteString getLocationBytes() {
            Object obj = this.location_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.location_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Event> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public float getPosLat() {
            return this.posLat_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public float getPosLon() {
            return this.posLon_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.hash_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += GeneratedMessageV3.computeStringSize(2, this.calendarId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBytesSize += CodedOutputStream.computeUInt64Size(3, this.startDate_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBytesSize += CodedOutputStream.computeUInt64Size(4, this.endDate_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeBytesSize += CodedOutputStream.computeBoolSize(5, this.allDay_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeBytesSize += GeneratedMessageV3.computeStringSize(6, this.title_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeBytesSize += GeneratedMessageV3.computeStringSize(7, this.location_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeBytesSize += GeneratedMessageV3.computeStringSize(8, this.description_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeBytesSize += CodedOutputStream.computeFloatSize(9, this.posLat_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeBytesSize += CodedOutputStream.computeFloatSize(10, this.posLon_);
            }
            for (int i15 = 0; i15 < this.attendees_.size(); i15++) {
                iComputeBytesSize += CodedOutputStream.computeMessageSize(11, this.attendees_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public long getStartDate() {
            return this.startDate_;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public String getTitle() {
            Object obj = this.title_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.title_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public ByteString getTitleBytes() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.title_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public boolean hasAllDay() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public boolean hasCalendarId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public boolean hasDescription() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public boolean hasEndDate() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public boolean hasHash() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public boolean hasLocation() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public boolean hasPosLat() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public boolean hasPosLon() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public boolean hasStartDate() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
        public boolean hasTitle() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasHash()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getHash().hashCode();
            }
            if (hasCalendarId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCalendarId().hashCode();
            }
            if (hasStartDate()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashLong(getStartDate());
            }
            if (hasEndDate()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashLong(getEndDate());
            }
            if (hasAllDay()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashBoolean(getAllDay());
            }
            if (hasTitle()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getTitle().hashCode();
            }
            if (hasLocation()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getLocation().hashCode();
            }
            if (hasDescription()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getDescription().hashCode();
            }
            if (hasPosLat()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + Float.floatToIntBits(getPosLat());
            }
            if (hasPosLon()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + Float.floatToIntBits(getPosLon());
            }
            if (getAttendeesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getAttendeesList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICalendarProto.internal_static_GDI_Proto_Calendar_Event_fieldAccessorTable.ensureFieldAccessorsInitialized(Event.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Event();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.hash_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.calendarId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt64(3, this.startDate_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt64(4, this.endDate_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.allDay_);
            }
            if ((this.bitField0_ & 32) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.title_);
            }
            if ((this.bitField0_ & 64) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.location_);
            }
            if ((this.bitField0_ & 128) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.description_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeFloat(9, this.posLat_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeFloat(10, this.posLon_);
            }
            for (int i14 = 0; i14 < this.attendees_.size(); i14++) {
                codedOutputStream.writeMessage(11, this.attendees_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EventOrBuilder {
            private boolean allDay_;
            private RepeatedFieldBuilderV3<Attendee, Attendee.Builder, AttendeeOrBuilder> attendeesBuilder_;
            private List<Attendee> attendees_;
            private int bitField0_;
            private Object calendarId_;
            private Object description_;
            private long endDate_;
            private ByteString hash_;
            private Object location_;
            private float posLat_;
            private float posLon_;
            private long startDate_;
            private Object title_;

            private Builder() {
                this.hash_ = ByteString.EMPTY;
                this.calendarId_ = "";
                this.title_ = "";
                this.location_ = "";
                this.description_ = "";
                this.attendees_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(Event event) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    event.hash_ = this.hash_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    event.calendarId_ = this.calendarId_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    event.startDate_ = this.startDate_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    event.endDate_ = this.endDate_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    event.allDay_ = this.allDay_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    event.title_ = this.title_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    event.location_ = this.location_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    event.description_ = this.description_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    event.posLat_ = this.posLat_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    event.posLon_ = this.posLon_;
                    i14 |= 512;
                }
                event.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(Event event) {
                RepeatedFieldBuilderV3<Attendee, Attendee.Builder, AttendeeOrBuilder> repeatedFieldBuilderV3 = this.attendeesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    event.attendees_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1024) != 0) {
                    this.attendees_ = Collections.unmodifiableList(this.attendees_);
                    this.bitField0_ &= -1025;
                }
                event.attendees_ = this.attendees_;
            }

            private void ensureAttendeesIsMutable() {
                if ((this.bitField0_ & 1024) == 0) {
                    this.attendees_ = new ArrayList(this.attendees_);
                    this.bitField0_ |= 1024;
                }
            }

            private RepeatedFieldBuilderV3<Attendee, Attendee.Builder, AttendeeOrBuilder> getAttendeesFieldBuilder() {
                if (this.attendeesBuilder_ == null) {
                    this.attendeesBuilder_ = new RepeatedFieldBuilderV3<>(this.attendees_, (this.bitField0_ & 1024) != 0, getParentForChildren(), isClean());
                    this.attendees_ = null;
                }
                return this.attendeesBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_Event_descriptor;
            }

            public Builder addAllAttendees(Iterable<? extends Attendee> iterable) {
                RepeatedFieldBuilderV3<Attendee, Attendee.Builder, AttendeeOrBuilder> repeatedFieldBuilderV3 = this.attendeesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureAttendeesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.attendees_);
                onChanged();
                return this;
            }

            public Builder addAttendees(Attendee.Builder builder) {
                RepeatedFieldBuilderV3<Attendee, Attendee.Builder, AttendeeOrBuilder> repeatedFieldBuilderV3 = this.attendeesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureAttendeesIsMutable();
                this.attendees_.add(builder.build());
                onChanged();
                return this;
            }

            public Attendee.Builder addAttendeesBuilder() {
                return (Attendee.Builder) getAttendeesFieldBuilder().addBuilder(Attendee.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Event build() {
                Event eventBuildPartial = buildPartial();
                if (eventBuildPartial.isInitialized()) {
                    return eventBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) eventBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Event buildPartial() {
                Event event = new Event(this);
                buildPartialRepeatedFields(event);
                if (this.bitField0_ != 0) {
                    buildPartial0(event);
                }
                onBuilt();
                return event;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.hash_ = ByteString.EMPTY;
                this.calendarId_ = "";
                this.startDate_ = 0L;
                this.endDate_ = 0L;
                this.allDay_ = false;
                this.title_ = "";
                this.location_ = "";
                this.description_ = "";
                this.posLat_ = 0.0f;
                this.posLon_ = 0.0f;
                RepeatedFieldBuilderV3<Attendee, Attendee.Builder, AttendeeOrBuilder> repeatedFieldBuilderV3 = this.attendeesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.attendees_ = Collections.EMPTY_LIST;
                } else {
                    this.attendees_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -1025;
                return this;
            }

            public Builder clearAllDay() {
                this.bitField0_ &= -17;
                this.allDay_ = false;
                onChanged();
                return this;
            }

            public Builder clearAttendees() {
                RepeatedFieldBuilderV3<Attendee, Attendee.Builder, AttendeeOrBuilder> repeatedFieldBuilderV3 = this.attendeesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.attendees_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -1025;
                onChanged();
                return this;
            }

            public Builder clearCalendarId() {
                this.calendarId_ = Event.getDefaultInstance().getCalendarId();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearDescription() {
                this.description_ = Event.getDefaultInstance().getDescription();
                this.bitField0_ &= -129;
                onChanged();
                return this;
            }

            public Builder clearEndDate() {
                this.bitField0_ &= -9;
                this.endDate_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHash() {
                this.bitField0_ &= -2;
                this.hash_ = Event.getDefaultInstance().getHash();
                onChanged();
                return this;
            }

            public Builder clearLocation() {
                this.location_ = Event.getDefaultInstance().getLocation();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPosLat() {
                this.bitField0_ &= -257;
                this.posLat_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearPosLon() {
                this.bitField0_ &= -513;
                this.posLon_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearStartDate() {
                this.bitField0_ &= -5;
                this.startDate_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                this.title_ = Event.getDefaultInstance().getTitle();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public boolean getAllDay() {
                return this.allDay_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public Attendee getAttendees(int i14) {
                RepeatedFieldBuilderV3<Attendee, Attendee.Builder, AttendeeOrBuilder> repeatedFieldBuilderV3 = this.attendeesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.attendees_.get(i14) : (Attendee) repeatedFieldBuilderV3.getMessage(i14);
            }

            public Attendee.Builder getAttendeesBuilder(int i14) {
                return (Attendee.Builder) getAttendeesFieldBuilder().getBuilder(i14);
            }

            public List<Attendee.Builder> getAttendeesBuilderList() {
                return getAttendeesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public int getAttendeesCount() {
                RepeatedFieldBuilderV3<Attendee, Attendee.Builder, AttendeeOrBuilder> repeatedFieldBuilderV3 = this.attendeesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.attendees_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public List<Attendee> getAttendeesList() {
                RepeatedFieldBuilderV3<Attendee, Attendee.Builder, AttendeeOrBuilder> repeatedFieldBuilderV3 = this.attendeesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.attendees_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public AttendeeOrBuilder getAttendeesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<Attendee, Attendee.Builder, AttendeeOrBuilder> repeatedFieldBuilderV3 = this.attendeesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.attendees_.get(i14) : (AttendeeOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public List<? extends AttendeeOrBuilder> getAttendeesOrBuilderList() {
                RepeatedFieldBuilderV3<Attendee, Attendee.Builder, AttendeeOrBuilder> repeatedFieldBuilderV3 = this.attendeesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.attendees_);
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public String getCalendarId() {
                Object obj = this.calendarId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.calendarId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public ByteString getCalendarIdBytes() {
                Object obj = this.calendarId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.calendarId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public String getDescription() {
                Object obj = this.description_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.description_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public ByteString getDescriptionBytes() {
                Object obj = this.description_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.description_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_Event_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public long getEndDate() {
                return this.endDate_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public ByteString getHash() {
                return this.hash_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public String getLocation() {
                Object obj = this.location_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.location_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public ByteString getLocationBytes() {
                Object obj = this.location_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.location_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public float getPosLat() {
                return this.posLat_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public float getPosLon() {
                return this.posLon_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public long getStartDate() {
                return this.startDate_;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.title_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public ByteString getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.title_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public boolean hasAllDay() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public boolean hasCalendarId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public boolean hasDescription() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public boolean hasEndDate() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public boolean hasHash() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public boolean hasLocation() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public boolean hasPosLat() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public boolean hasPosLon() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public boolean hasStartDate() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDICalendarProto.EventOrBuilder
            public boolean hasTitle() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICalendarProto.internal_static_GDI_Proto_Calendar_Event_fieldAccessorTable.ensureFieldAccessorsInitialized(Event.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(Event event) {
                if (event == Event.getDefaultInstance()) {
                    return this;
                }
                if (event.hasHash()) {
                    setHash(event.getHash());
                }
                if (event.hasCalendarId()) {
                    this.calendarId_ = event.calendarId_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (event.hasStartDate()) {
                    setStartDate(event.getStartDate());
                }
                if (event.hasEndDate()) {
                    setEndDate(event.getEndDate());
                }
                if (event.hasAllDay()) {
                    setAllDay(event.getAllDay());
                }
                if (event.hasTitle()) {
                    this.title_ = event.title_;
                    this.bitField0_ |= 32;
                    onChanged();
                }
                if (event.hasLocation()) {
                    this.location_ = event.location_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                if (event.hasDescription()) {
                    this.description_ = event.description_;
                    this.bitField0_ |= 128;
                    onChanged();
                }
                if (event.hasPosLat()) {
                    setPosLat(event.getPosLat());
                }
                if (event.hasPosLon()) {
                    setPosLon(event.getPosLon());
                }
                if (this.attendeesBuilder_ == null) {
                    if (!event.attendees_.isEmpty()) {
                        if (this.attendees_.isEmpty()) {
                            this.attendees_ = event.attendees_;
                            this.bitField0_ &= -1025;
                        } else {
                            ensureAttendeesIsMutable();
                            this.attendees_.addAll(event.attendees_);
                        }
                        onChanged();
                    }
                } else if (!event.attendees_.isEmpty()) {
                    boolean zIsEmpty = this.attendeesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<Attendee, Attendee.Builder, AttendeeOrBuilder> repeatedFieldBuilderV3 = this.attendeesBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.attendeesBuilder_ = null;
                        this.attendees_ = event.attendees_;
                        this.bitField0_ &= -1025;
                        this.attendeesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getAttendeesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(event.attendees_);
                    }
                }
                mergeUnknownFields(event.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeAttendees(int i14) {
                RepeatedFieldBuilderV3<Attendee, Attendee.Builder, AttendeeOrBuilder> repeatedFieldBuilderV3 = this.attendeesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureAttendeesIsMutable();
                this.attendees_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setAllDay(boolean z14) {
                this.allDay_ = z14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setAttendees(int i14, Attendee.Builder builder) {
                RepeatedFieldBuilderV3<Attendee, Attendee.Builder, AttendeeOrBuilder> repeatedFieldBuilderV3 = this.attendeesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureAttendeesIsMutable();
                this.attendees_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setCalendarId(String str) {
                str.getClass();
                this.calendarId_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCalendarIdBytes(ByteString byteString) {
                byteString.getClass();
                this.calendarId_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setDescription(String str) {
                str.getClass();
                this.description_ = str;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                byteString.getClass();
                this.description_ = byteString;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setEndDate(long j8) {
                this.endDate_ = j8;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setHash(ByteString byteString) {
                byteString.getClass();
                this.hash_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLocation(String str) {
                str.getClass();
                this.location_ = str;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setLocationBytes(ByteString byteString) {
                byteString.getClass();
                this.location_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setPosLat(float f14) {
                this.posLat_ = f14;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setPosLon(float f14) {
                this.posLon_ = f14;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStartDate(long j8) {
                this.startDate_ = j8;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTitle(String str) {
                str.getClass();
                this.title_ = str;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setTitleBytes(ByteString byteString) {
                byteString.getClass();
                this.title_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Event getDefaultInstanceForType() {
                return Event.getDefaultInstance();
            }

            public Attendee.Builder addAttendeesBuilder(int i14) {
                return (Attendee.Builder) getAttendeesFieldBuilder().addBuilder(i14, Attendee.getDefaultInstance());
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.hash_ = ByteString.EMPTY;
                this.calendarId_ = "";
                this.title_ = "";
                this.location_ = "";
                this.description_ = "";
                this.attendees_ = Collections.EMPTY_LIST;
            }

            public Builder addAttendees(int i14, Attendee attendee) {
                RepeatedFieldBuilderV3<Attendee, Attendee.Builder, AttendeeOrBuilder> repeatedFieldBuilderV3 = this.attendeesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    attendee.getClass();
                    ensureAttendeesIsMutable();
                    this.attendees_.add(i14, attendee);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, attendee);
                return this;
            }

            public Builder setAttendees(int i14, Attendee attendee) {
                RepeatedFieldBuilderV3<Attendee, Attendee.Builder, AttendeeOrBuilder> repeatedFieldBuilderV3 = this.attendeesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    attendee.getClass();
                    ensureAttendeesIsMutable();
                    this.attendees_.set(i14, attendee);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, attendee);
                return this;
            }

            public Builder addAttendees(Attendee attendee) {
                RepeatedFieldBuilderV3<Attendee, Attendee.Builder, AttendeeOrBuilder> repeatedFieldBuilderV3 = this.attendeesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    attendee.getClass();
                    ensureAttendeesIsMutable();
                    this.attendees_.add(attendee);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(attendee);
                return this;
            }

            public Builder addAttendees(int i14, Attendee.Builder builder) {
                RepeatedFieldBuilderV3<Attendee, Attendee.Builder, AttendeeOrBuilder> repeatedFieldBuilderV3 = this.attendeesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAttendeesIsMutable();
                    this.attendees_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Event) {
                    return mergeFrom((Event) message);
                }
                super.mergeFrom(message);
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    break;
                                case 10:
                                    this.hash_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    this.calendarId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 24:
                                    this.startDate_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 32:
                                    this.endDate_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 40:
                                    this.allDay_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    this.title_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    this.location_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    this.description_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 77:
                                    this.posLat_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 85:
                                    this.posLon_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    Attendee attendee = (Attendee) codedInputStream.readMessage(Attendee.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Attendee, Attendee.Builder, AttendeeOrBuilder> repeatedFieldBuilderV3 = this.attendeesBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureAttendeesIsMutable();
                                        this.attendees_.add(attendee);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(attendee);
                                        continue;
                                    }
                                    break;
                                default:
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        break;
                                    }
                                    break;
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Event getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Event parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Event) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Event parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Event parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Event parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Event parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Event parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Event parseFrom(InputStream inputStream) {
            return (Event) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Event parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Event) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Event parseFrom(CodedInputStream codedInputStream) {
            return (Event) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Event parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Event) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private Event(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.hash_ = ByteString.EMPTY;
            this.calendarId_ = "";
            this.startDate_ = 0L;
            this.endDate_ = 0L;
            this.allDay_ = false;
            this.title_ = "";
            this.location_ = "";
            this.description_ = "";
            this.posLat_ = 0.0f;
            this.posLon_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ Event(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
