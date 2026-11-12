package com.garmin.proto.generated;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
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

/* JADX INFO: loaded from: classes14.dex */
public final class GDIAudioPromptsProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0015GDIAudioPrompts.proto\u0012\u0016GDI.Proto.AudioPrompts\"Ú\b\n\u0013AudioPromptsService\u0012A\n\u0010lap_notification\u0018\u0001 \u0001(\u000b2'.GDI.Proto.AudioPrompts.LapNotification\u0012e\n#audio_settings_updated_notification\u0018\u0002 \u0001(\u000b28.GDI.Proto.AudioPrompts.AudioSettingsUpdatedNotification\u0012L\n\u0016audio_settings_request\u0018\u0003 \u0001(\u000b2,.GDI.Proto.AudioPrompts.AudioSettingsRequest\u0012N\n\u0017audio_settings_response\u0018\u0004 \u0001(\u000b2-.GDI.Proto.AudioPrompts.AudioSettingsResponse\u0012E\n\u0012speed_notification\u0018\u0005 \u0001(\u000b2).GDI.Proto.AudioPrompts.SpeedNotification\u0012C\n\u0011pace_notification\u0018\u0006 \u0001(\u000b2(.GDI.Proto.AudioPrompts.PaceNotification\u0012N\n\u0017heart_rate_notification\u0018\u0007 \u0001(\u000b2-.GDI.Proto.AudioPrompts.HeartRateNotification\u0012E\n\u0012power_notification\u0018\b \u0001(\u000b2).GDI.Proto.AudioPrompts.PowerNotification\u0012G\n\u0013speech_notification\u0018\t \u0001(\u000b2*.GDI.Proto.AudioPrompts.SpeechNotification\u0012V\n\u001bsupported_languages_request\u0018\n \u0001(\u000b21.GDI.Proto.AudioPrompts.SupportedLanguagesRequest\u0012X\n\u001csupported_languages_response\u0018\u000b \u0001(\u000b22.GDI.Proto.AudioPrompts.SupportedLanguagesResponse\u0012H\n\u0014set_language_request\u0018\f \u0001(\u000b2*.GDI.Proto.AudioPrompts.SetLanguageRequest\u0012J\n\u0015set_language_response\u0018\r \u0001(\u000b2+.GDI.Proto.AudioPrompts.SetLanguageResponse\u0012G\n\u0013phrase_notification\u0018\u000e \u0001(\u000b2*.GDI.Proto.AudioPrompts.PhraseNotification\"\"\n AudioSettingsUpdatedNotification\"\u0016\n\u0014AudioSettingsRequest\"\u0091\u0001\n\u0015AudioSettingsResponse\u0012\u0011\n\tspeakLaps\u0018\u0001 \u0002(\b\u0012\u0019\n\u0011speedIntervalTime\u0018\u0002 \u0002(\u0004\u0012\u0016\n\u000ehrIntervalTime\u0018\u0003 \u0002(\u0004\u0012\u0019\n\u0011powerIntervalTime\u0018\u0004 \u0001(\u0004\u0012\u0017\n\u000fspeakNavigation\u0018\u0005 \u0001(\b\"\u008b\u0001\n\u000fLapNotification\u0012\u0012\n\nlap_number\u0018\u0001 \u0002(\r\u0012\u0010\n\blap_time\u0018\u0002 \u0002(\u0004\u0012\u0011\n\tlap_speed\u0018\u0003 \u0001(\u0002\u0012?\n\u0015audio_prompt_language\u0018\u0004 \u0001(\u000b2 .GDI.Proto.AudioPrompts.Language\"À\u0001\n\u0011SpeedNotification\u0012\u0015\n\raverage_speed\u0018\u0001 \u0001(\u0002\u0012\u0015\n\rcurrent_speed\u0018\u0002 \u0001(\u0002\u0012\u0011\n\tlap_speed\u0018\u0003 \u0001(\u0002\u0012)\n!device_is_displaying_metric_units\u0018\u0004 \u0002(\b\u0012?\n\u0015audio_prompt_language\u0018\u0005 \u0001(\u000b2 .GDI.Proto.AudioPrompts.Language\"\u0091\u0001\n\u0010PaceNotification\u0012\u0014\n\faverage_pace\u0018\u0001 \u0001(\u0004\u0012\u0014\n\fcurrent_pace\u0018\u0002 \u0001(\u0004\u0012\u0010\n\blap_pace\u0018\u0003 \u0001(\u0004\u0012?\n\u0015audio_prompt_language\u0018\u0004 \u0001(\u000b2 .GDI.Proto.AudioPrompts.Language\"£\u0001\n\u0015HeartRateNotification\u0012\u000b\n\u0003bpm\u0018\u0001 \u0001(\r\u0012\f\n\u0004zone\u0018\u0002 \u0001(\u0002\u0012\u0016\n\u000epercentage_max\u0018\u0003 \u0001(\r\u0012\u0016\n\u000epercentage_hrr\u0018\u0004 \u0001(\r\u0012?\n\u0015audio_prompt_language\u0018\u0005 \u0001(\u000b2 .GDI.Proto.AudioPrompts.Language\"\u0098\u0001\n\u0011PowerNotification\u0012\u0015\n\raverage_power\u0018\u0001 \u0001(\r\u0012\u0018\n\u0010normalized_power\u0018\u0002 \u0001(\r\u0012\u0011\n\tlap_power\u0018\u0003 \u0001(\r\u0012?\n\u0015audio_prompt_language\u0018\u0004 \u0001(\u000b2 .GDI.Proto.AudioPrompts.Language\"d\n\u0012SpeechNotification\u00127\n\u000bspeech_type\u0018\u0001 \u0001(\u000e2\".GDI.Proto.AudioPrompts.SpeechType\u0012\u0015\n\rtext_to_speak\u0018\u0002 \u0001(\t\"\u0095\u0001\n\u0012PhraseNotification\u0012\u0010\n\bpriority\u0018\u0001 \u0001(\r\u0012/\n\u0007phrases\u0018\u0002 \u0003(\u000b2\u001e.GDI.Proto.AudioPrompts.Phrase\u0012<\n\u000egravel_phrases\u0018\u0003 \u0003(\u000b2$.GDI.Proto.AudioPrompts.GravelPhrase\"S\n\u0006Phrase\u0012\u0011\n\tphrase_id\u0018\u0001 \u0002(\r\u00126\n\u000bslot_values\u0018\u0002 \u0003(\u000b2!.GDI.Proto.AudioPrompts.SlotValue\"@\n\tSlotValue\u0012\u0013\n\tint_value\u0018\u0001 \u0001(\u0011H\u0000\u0012\u0015\n\u000bfloat_value\u0018\u0002 \u0001(\u0002H\u0000B\u0007\n\u0005value\"]\n\fGravelPhrase\u0012\u0017\n\u000fphrase_template\u0018\u0001 \u0002(\t\u0012\u0014\n\fcontext_json\u0018\u0002 \u0001(\t\u0012\u001e\n\u0016speech_rate_multiplier\u0018\u0003 \u0001(\u0002\"D\n\u0012SetLanguageRequest\u0012.\n\u0004lang\u0018\u0001 \u0002(\u000b2 .GDI.Proto.AudioPrompts.Language\"&\n\u0013SetLanguageResponse\u0012\u000f\n\u0007success\u0018\u0001 \u0002(\b\"7\n\bLanguage\u0012\u0015\n\rlanguage_code\u0018\u0001 \u0002(\t\u0012\u0014\n\fcountry_code\u0018\u0002 \u0001(\t\"\u001b\n\u0019SupportedLanguagesRequest\"Q\n\u001aSupportedLanguagesResponse\u00123\n\tlanguages\u0018\u0001 \u0003(\u000b2 .GDI.Proto.AudioPrompts.Language*)\n\nSpeechType\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u000e\n\nNAVIGATION\u0010\u0001B4\n\u001acom.garmin.proto.generatedB\u0014GDIAudioPromptsProtoH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AudioPrompts_AudioPromptsService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AudioPrompts_AudioPromptsService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AudioPrompts_AudioSettingsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AudioPrompts_AudioSettingsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AudioPrompts_AudioSettingsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AudioPrompts_AudioSettingsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AudioPrompts_AudioSettingsUpdatedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AudioPrompts_AudioSettingsUpdatedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AudioPrompts_GravelPhrase_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AudioPrompts_GravelPhrase_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AudioPrompts_HeartRateNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AudioPrompts_HeartRateNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AudioPrompts_Language_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AudioPrompts_Language_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AudioPrompts_LapNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AudioPrompts_LapNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AudioPrompts_PaceNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AudioPrompts_PaceNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AudioPrompts_PhraseNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AudioPrompts_PhraseNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AudioPrompts_Phrase_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AudioPrompts_Phrase_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AudioPrompts_PowerNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AudioPrompts_PowerNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AudioPrompts_SetLanguageRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AudioPrompts_SetLanguageRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AudioPrompts_SetLanguageResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AudioPrompts_SetLanguageResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AudioPrompts_SlotValue_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AudioPrompts_SlotValue_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AudioPrompts_SpeechNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AudioPrompts_SpeechNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AudioPrompts_SpeedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AudioPrompts_SpeedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AudioPrompts_SupportedLanguagesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AudioPrompts_SupportedLanguagesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AudioPrompts_SupportedLanguagesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AudioPrompts_SupportedLanguagesResponse_fieldAccessorTable;

    /* JADX INFO: renamed from: com.garmin.proto.generated.GDIAudioPromptsProto$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$garmin$proto$generated$GDIAudioPromptsProto$SlotValue$ValueCase;

        static {
            int[] iArr = new int[SlotValue.ValueCase.values().length];
            $SwitchMap$com$garmin$proto$generated$GDIAudioPromptsProto$SlotValue$ValueCase = iArr;
            try {
                iArr[SlotValue.ValueCase.INT_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$garmin$proto$generated$GDIAudioPromptsProto$SlotValue$ValueCase[SlotValue.ValueCase.FLOAT_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$garmin$proto$generated$GDIAudioPromptsProto$SlotValue$ValueCase[SlotValue.ValueCase.VALUE_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface AudioPromptsServiceOrBuilder extends MessageOrBuilder {
        AudioSettingsRequest getAudioSettingsRequest();

        AudioSettingsRequestOrBuilder getAudioSettingsRequestOrBuilder();

        AudioSettingsResponse getAudioSettingsResponse();

        AudioSettingsResponseOrBuilder getAudioSettingsResponseOrBuilder();

        AudioSettingsUpdatedNotification getAudioSettingsUpdatedNotification();

        AudioSettingsUpdatedNotificationOrBuilder getAudioSettingsUpdatedNotificationOrBuilder();

        HeartRateNotification getHeartRateNotification();

        HeartRateNotificationOrBuilder getHeartRateNotificationOrBuilder();

        LapNotification getLapNotification();

        LapNotificationOrBuilder getLapNotificationOrBuilder();

        PaceNotification getPaceNotification();

        PaceNotificationOrBuilder getPaceNotificationOrBuilder();

        PhraseNotification getPhraseNotification();

        PhraseNotificationOrBuilder getPhraseNotificationOrBuilder();

        PowerNotification getPowerNotification();

        PowerNotificationOrBuilder getPowerNotificationOrBuilder();

        SetLanguageRequest getSetLanguageRequest();

        SetLanguageRequestOrBuilder getSetLanguageRequestOrBuilder();

        SetLanguageResponse getSetLanguageResponse();

        SetLanguageResponseOrBuilder getSetLanguageResponseOrBuilder();

        SpeechNotification getSpeechNotification();

        SpeechNotificationOrBuilder getSpeechNotificationOrBuilder();

        SpeedNotification getSpeedNotification();

        SpeedNotificationOrBuilder getSpeedNotificationOrBuilder();

        SupportedLanguagesRequest getSupportedLanguagesRequest();

        SupportedLanguagesRequestOrBuilder getSupportedLanguagesRequestOrBuilder();

        SupportedLanguagesResponse getSupportedLanguagesResponse();

        SupportedLanguagesResponseOrBuilder getSupportedLanguagesResponseOrBuilder();

        boolean hasAudioSettingsRequest();

        boolean hasAudioSettingsResponse();

        boolean hasAudioSettingsUpdatedNotification();

        boolean hasHeartRateNotification();

        boolean hasLapNotification();

        boolean hasPaceNotification();

        boolean hasPhraseNotification();

        boolean hasPowerNotification();

        boolean hasSetLanguageRequest();

        boolean hasSetLanguageResponse();

        boolean hasSpeechNotification();

        boolean hasSpeedNotification();

        boolean hasSupportedLanguagesRequest();

        boolean hasSupportedLanguagesResponse();
    }

    public interface AudioSettingsRequestOrBuilder extends MessageOrBuilder {
    }

    public interface AudioSettingsResponseOrBuilder extends MessageOrBuilder {
        long getHrIntervalTime();

        long getPowerIntervalTime();

        boolean getSpeakLaps();

        boolean getSpeakNavigation();

        long getSpeedIntervalTime();

        boolean hasHrIntervalTime();

        boolean hasPowerIntervalTime();

        boolean hasSpeakLaps();

        boolean hasSpeakNavigation();

        boolean hasSpeedIntervalTime();
    }

    public interface AudioSettingsUpdatedNotificationOrBuilder extends MessageOrBuilder {
    }

    public interface GravelPhraseOrBuilder extends MessageOrBuilder {
        String getContextJson();

        ByteString getContextJsonBytes();

        String getPhraseTemplate();

        ByteString getPhraseTemplateBytes();

        float getSpeechRateMultiplier();

        boolean hasContextJson();

        boolean hasPhraseTemplate();

        boolean hasSpeechRateMultiplier();
    }

    public interface HeartRateNotificationOrBuilder extends MessageOrBuilder {
        Language getAudioPromptLanguage();

        LanguageOrBuilder getAudioPromptLanguageOrBuilder();

        int getBpm();

        int getPercentageHrr();

        int getPercentageMax();

        float getZone();

        boolean hasAudioPromptLanguage();

        boolean hasBpm();

        boolean hasPercentageHrr();

        boolean hasPercentageMax();

        boolean hasZone();
    }

    public interface LanguageOrBuilder extends MessageOrBuilder {
        String getCountryCode();

        ByteString getCountryCodeBytes();

        String getLanguageCode();

        ByteString getLanguageCodeBytes();

        boolean hasCountryCode();

        boolean hasLanguageCode();
    }

    public interface LapNotificationOrBuilder extends MessageOrBuilder {
        Language getAudioPromptLanguage();

        LanguageOrBuilder getAudioPromptLanguageOrBuilder();

        int getLapNumber();

        float getLapSpeed();

        long getLapTime();

        boolean hasAudioPromptLanguage();

        boolean hasLapNumber();

        boolean hasLapSpeed();

        boolean hasLapTime();
    }

    public interface PaceNotificationOrBuilder extends MessageOrBuilder {
        Language getAudioPromptLanguage();

        LanguageOrBuilder getAudioPromptLanguageOrBuilder();

        long getAveragePace();

        long getCurrentPace();

        long getLapPace();

        boolean hasAudioPromptLanguage();

        boolean hasAveragePace();

        boolean hasCurrentPace();

        boolean hasLapPace();
    }

    public interface PhraseNotificationOrBuilder extends MessageOrBuilder {
        GravelPhrase getGravelPhrases(int i14);

        int getGravelPhrasesCount();

        List<GravelPhrase> getGravelPhrasesList();

        GravelPhraseOrBuilder getGravelPhrasesOrBuilder(int i14);

        List<? extends GravelPhraseOrBuilder> getGravelPhrasesOrBuilderList();

        Phrase getPhrases(int i14);

        int getPhrasesCount();

        List<Phrase> getPhrasesList();

        PhraseOrBuilder getPhrasesOrBuilder(int i14);

        List<? extends PhraseOrBuilder> getPhrasesOrBuilderList();

        int getPriority();

        boolean hasPriority();
    }

    public interface PhraseOrBuilder extends MessageOrBuilder {
        int getPhraseId();

        SlotValue getSlotValues(int i14);

        int getSlotValuesCount();

        List<SlotValue> getSlotValuesList();

        SlotValueOrBuilder getSlotValuesOrBuilder(int i14);

        List<? extends SlotValueOrBuilder> getSlotValuesOrBuilderList();

        boolean hasPhraseId();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface PowerNotificationOrBuilder extends MessageOrBuilder {
        Language getAudioPromptLanguage();

        LanguageOrBuilder getAudioPromptLanguageOrBuilder();

        int getAveragePower();

        int getLapPower();

        int getNormalizedPower();

        boolean hasAudioPromptLanguage();

        boolean hasAveragePower();

        boolean hasLapPower();

        boolean hasNormalizedPower();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface SetLanguageRequestOrBuilder extends MessageOrBuilder {
        Language getLang();

        LanguageOrBuilder getLangOrBuilder();

        boolean hasLang();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface SetLanguageResponseOrBuilder extends MessageOrBuilder {
        boolean getSuccess();

        boolean hasSuccess();
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface SlotValueOrBuilder extends MessageOrBuilder {
        float getFloatValue();

        int getIntValue();

        SlotValue.ValueCase getValueCase();

        boolean hasFloatValue();

        boolean hasIntValue();
    }

    /* JADX INFO: loaded from: classes10.dex */
    public interface SpeechNotificationOrBuilder extends MessageOrBuilder {
        SpeechType getSpeechType();

        String getTextToSpeak();

        ByteString getTextToSpeakBytes();

        boolean hasSpeechType();

        boolean hasTextToSpeak();
    }

    /* JADX INFO: loaded from: classes11.dex */
    public interface SpeedNotificationOrBuilder extends MessageOrBuilder {
        Language getAudioPromptLanguage();

        LanguageOrBuilder getAudioPromptLanguageOrBuilder();

        float getAverageSpeed();

        float getCurrentSpeed();

        boolean getDeviceIsDisplayingMetricUnits();

        float getLapSpeed();

        boolean hasAudioPromptLanguage();

        boolean hasAverageSpeed();

        boolean hasCurrentSpeed();

        boolean hasDeviceIsDisplayingMetricUnits();

        boolean hasLapSpeed();
    }

    /* JADX INFO: loaded from: classes11.dex */
    public interface SupportedLanguagesRequestOrBuilder extends MessageOrBuilder {
    }

    /* JADX INFO: loaded from: classes11.dex */
    public interface SupportedLanguagesResponseOrBuilder extends MessageOrBuilder {
        Language getLanguages(int i14);

        int getLanguagesCount();

        List<Language> getLanguagesList();

        LanguageOrBuilder getLanguagesOrBuilder(int i14);

        List<? extends LanguageOrBuilder> getLanguagesOrBuilderList();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_AudioPrompts_AudioPromptsService_descriptor = descriptor2;
        internal_static_GDI_Proto_AudioPrompts_AudioPromptsService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"LapNotification", "AudioSettingsUpdatedNotification", "AudioSettingsRequest", "AudioSettingsResponse", "SpeedNotification", "PaceNotification", "HeartRateNotification", "PowerNotification", "SpeechNotification", "SupportedLanguagesRequest", "SupportedLanguagesResponse", "SetLanguageRequest", "SetLanguageResponse", "PhraseNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_AudioPrompts_AudioSettingsUpdatedNotification_descriptor = descriptor3;
        internal_static_GDI_Proto_AudioPrompts_AudioSettingsUpdatedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_AudioPrompts_AudioSettingsRequest_descriptor = descriptor4;
        internal_static_GDI_Proto_AudioPrompts_AudioSettingsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[0]);
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_AudioPrompts_AudioSettingsResponse_descriptor = descriptor5;
        internal_static_GDI_Proto_AudioPrompts_AudioSettingsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"SpeakLaps", "SpeedIntervalTime", "HrIntervalTime", "PowerIntervalTime", "SpeakNavigation"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_AudioPrompts_LapNotification_descriptor = descriptor6;
        internal_static_GDI_Proto_AudioPrompts_LapNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"LapNumber", "LapTime", "LapSpeed", "AudioPromptLanguage"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_AudioPrompts_SpeedNotification_descriptor = descriptor7;
        internal_static_GDI_Proto_AudioPrompts_SpeedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"AverageSpeed", "CurrentSpeed", "LapSpeed", "DeviceIsDisplayingMetricUnits", "AudioPromptLanguage"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_AudioPrompts_PaceNotification_descriptor = descriptor8;
        internal_static_GDI_Proto_AudioPrompts_PaceNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"AveragePace", "CurrentPace", "LapPace", "AudioPromptLanguage"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_AudioPrompts_HeartRateNotification_descriptor = descriptor9;
        internal_static_GDI_Proto_AudioPrompts_HeartRateNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Bpm", "Zone", "PercentageMax", "PercentageHrr", "AudioPromptLanguage"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_AudioPrompts_PowerNotification_descriptor = descriptor10;
        internal_static_GDI_Proto_AudioPrompts_PowerNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"AveragePower", "NormalizedPower", "LapPower", "AudioPromptLanguage"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_AudioPrompts_SpeechNotification_descriptor = descriptor11;
        internal_static_GDI_Proto_AudioPrompts_SpeechNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"SpeechType", "TextToSpeak"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_AudioPrompts_PhraseNotification_descriptor = descriptor12;
        internal_static_GDI_Proto_AudioPrompts_PhraseNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Priority", "Phrases", "GravelPhrases"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_AudioPrompts_Phrase_descriptor = descriptor13;
        internal_static_GDI_Proto_AudioPrompts_Phrase_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"PhraseId", "SlotValues"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_GDI_Proto_AudioPrompts_SlotValue_descriptor = descriptor14;
        internal_static_GDI_Proto_AudioPrompts_SlotValue_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"IntValue", "FloatValue", "Value"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(13);
        internal_static_GDI_Proto_AudioPrompts_GravelPhrase_descriptor = descriptor15;
        internal_static_GDI_Proto_AudioPrompts_GravelPhrase_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"PhraseTemplate", "ContextJson", "SpeechRateMultiplier"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(14);
        internal_static_GDI_Proto_AudioPrompts_SetLanguageRequest_descriptor = descriptor16;
        internal_static_GDI_Proto_AudioPrompts_SetLanguageRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Lang"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(15);
        internal_static_GDI_Proto_AudioPrompts_SetLanguageResponse_descriptor = descriptor17;
        internal_static_GDI_Proto_AudioPrompts_SetLanguageResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Success"});
        Descriptors.Descriptor descriptor18 = getDescriptor().getMessageTypes().get(16);
        internal_static_GDI_Proto_AudioPrompts_Language_descriptor = descriptor18;
        internal_static_GDI_Proto_AudioPrompts_Language_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"LanguageCode", "CountryCode"});
        Descriptors.Descriptor descriptor19 = getDescriptor().getMessageTypes().get(17);
        internal_static_GDI_Proto_AudioPrompts_SupportedLanguagesRequest_descriptor = descriptor19;
        internal_static_GDI_Proto_AudioPrompts_SupportedLanguagesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[0]);
        Descriptors.Descriptor descriptor20 = getDescriptor().getMessageTypes().get(18);
        internal_static_GDI_Proto_AudioPrompts_SupportedLanguagesResponse_descriptor = descriptor20;
        internal_static_GDI_Proto_AudioPrompts_SupportedLanguagesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"Languages"});
    }

    private GDIAudioPromptsProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class AudioSettingsRequest extends GeneratedMessageV3 implements AudioSettingsRequestOrBuilder {
        private static final AudioSettingsRequest DEFAULT_INSTANCE = new AudioSettingsRequest();

        @Deprecated
        public static final Parser<AudioSettingsRequest> PARSER = new AbstractParser<AudioSettingsRequest>() { // from class: com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsRequest.1
            @Override // com.google.protobuf.Parser
            public AudioSettingsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AudioSettingsRequest.newBuilder();
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
        private byte memoizedIsInitialized;

        private AudioSettingsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AudioSettingsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_AudioSettingsRequest_descriptor;
        }

        public static Builder newBuilder(AudioSettingsRequest audioSettingsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(audioSettingsRequest);
        }

        public static AudioSettingsRequest parseDelimitedFrom(InputStream inputStream) {
            return (AudioSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AudioSettingsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AudioSettingsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof AudioSettingsRequest) {
                return getUnknownFields().equals(((AudioSettingsRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AudioSettingsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getDescriptor().hashCode() + 779) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_AudioSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AudioSettingsRequest.class, Builder.class);
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
            return new AudioSettingsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AudioSettingsRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_AudioSettingsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AudioSettingsRequest build() {
                AudioSettingsRequest audioSettingsRequestBuildPartial = buildPartial();
                if (audioSettingsRequestBuildPartial.isInitialized()) {
                    return audioSettingsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) audioSettingsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AudioSettingsRequest buildPartial() {
                AudioSettingsRequest audioSettingsRequest = new AudioSettingsRequest(this);
                onBuilt();
                return audioSettingsRequest;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_AudioSettingsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_AudioSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AudioSettingsRequest.class, Builder.class);
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
                            if (tag == 0 || !super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                z14 = true;
                            }
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
            public AudioSettingsRequest getDefaultInstanceForType() {
                return AudioSettingsRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AudioSettingsRequest) {
                    return mergeFrom((AudioSettingsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AudioSettingsRequest audioSettingsRequest) {
                if (audioSettingsRequest == AudioSettingsRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(audioSettingsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AudioSettingsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ AudioSettingsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private AudioSettingsRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AudioSettingsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudioSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AudioSettingsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AudioSettingsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AudioSettingsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AudioSettingsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AudioSettingsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AudioSettingsRequest parseFrom(InputStream inputStream) {
            return (AudioSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AudioSettingsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudioSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AudioSettingsRequest parseFrom(CodedInputStream codedInputStream) {
            return (AudioSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AudioSettingsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudioSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AudioSettingsResponse extends GeneratedMessageV3 implements AudioSettingsResponseOrBuilder {
        public static final int HRINTERVALTIME_FIELD_NUMBER = 3;
        public static final int POWERINTERVALTIME_FIELD_NUMBER = 4;
        public static final int SPEAKLAPS_FIELD_NUMBER = 1;
        public static final int SPEAKNAVIGATION_FIELD_NUMBER = 5;
        public static final int SPEEDINTERVALTIME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long hrIntervalTime_;
        private byte memoizedIsInitialized;
        private long powerIntervalTime_;
        private boolean speakLaps_;
        private boolean speakNavigation_;
        private long speedIntervalTime_;
        private static final AudioSettingsResponse DEFAULT_INSTANCE = new AudioSettingsResponse();

        @Deprecated
        public static final Parser<AudioSettingsResponse> PARSER = new AbstractParser<AudioSettingsResponse>() { // from class: com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponse.1
            @Override // com.google.protobuf.Parser
            public AudioSettingsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AudioSettingsResponse.newBuilder();
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

        private AudioSettingsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.speakLaps_ = false;
            this.speedIntervalTime_ = 0L;
            this.hrIntervalTime_ = 0L;
            this.powerIntervalTime_ = 0L;
            this.speakNavigation_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AudioSettingsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_AudioSettingsResponse_descriptor;
        }

        public static Builder newBuilder(AudioSettingsResponse audioSettingsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(audioSettingsResponse);
        }

        public static AudioSettingsResponse parseDelimitedFrom(InputStream inputStream) {
            return (AudioSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AudioSettingsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AudioSettingsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AudioSettingsResponse)) {
                return super.equals(obj);
            }
            AudioSettingsResponse audioSettingsResponse = (AudioSettingsResponse) obj;
            if (hasSpeakLaps() != audioSettingsResponse.hasSpeakLaps()) {
                return false;
            }
            if ((hasSpeakLaps() && getSpeakLaps() != audioSettingsResponse.getSpeakLaps()) || hasSpeedIntervalTime() != audioSettingsResponse.hasSpeedIntervalTime()) {
                return false;
            }
            if ((hasSpeedIntervalTime() && getSpeedIntervalTime() != audioSettingsResponse.getSpeedIntervalTime()) || hasHrIntervalTime() != audioSettingsResponse.hasHrIntervalTime()) {
                return false;
            }
            if ((hasHrIntervalTime() && getHrIntervalTime() != audioSettingsResponse.getHrIntervalTime()) || hasPowerIntervalTime() != audioSettingsResponse.hasPowerIntervalTime()) {
                return false;
            }
            if ((!hasPowerIntervalTime() || getPowerIntervalTime() == audioSettingsResponse.getPowerIntervalTime()) && hasSpeakNavigation() == audioSettingsResponse.hasSpeakNavigation()) {
                return (!hasSpeakNavigation() || getSpeakNavigation() == audioSettingsResponse.getSpeakNavigation()) && getUnknownFields().equals(audioSettingsResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponseOrBuilder
        public long getHrIntervalTime() {
            return this.hrIntervalTime_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AudioSettingsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponseOrBuilder
        public long getPowerIntervalTime() {
            return this.powerIntervalTime_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.speakLaps_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt64Size(2, this.speedIntervalTime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt64Size(3, this.hrIntervalTime_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBoolSize += CodedOutputStream.computeUInt64Size(4, this.powerIntervalTime_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(5, this.speakNavigation_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponseOrBuilder
        public boolean getSpeakLaps() {
            return this.speakLaps_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponseOrBuilder
        public boolean getSpeakNavigation() {
            return this.speakNavigation_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponseOrBuilder
        public long getSpeedIntervalTime() {
            return this.speedIntervalTime_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponseOrBuilder
        public boolean hasHrIntervalTime() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponseOrBuilder
        public boolean hasPowerIntervalTime() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponseOrBuilder
        public boolean hasSpeakLaps() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponseOrBuilder
        public boolean hasSpeakNavigation() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponseOrBuilder
        public boolean hasSpeedIntervalTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSpeakLaps()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getSpeakLaps());
            }
            if (hasSpeedIntervalTime()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashLong(getSpeedIntervalTime());
            }
            if (hasHrIntervalTime()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashLong(getHrIntervalTime());
            }
            if (hasPowerIntervalTime()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashLong(getPowerIntervalTime());
            }
            if (hasSpeakNavigation()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashBoolean(getSpeakNavigation());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_AudioSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AudioSettingsResponse.class, Builder.class);
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
            if (!hasSpeakLaps()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSpeedIntervalTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasHrIntervalTime()) {
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
            return new AudioSettingsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.speakLaps_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt64(2, this.speedIntervalTime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt64(3, this.hrIntervalTime_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt64(4, this.powerIntervalTime_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.speakNavigation_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AudioSettingsResponseOrBuilder {
            private int bitField0_;
            private long hrIntervalTime_;
            private long powerIntervalTime_;
            private boolean speakLaps_;
            private boolean speakNavigation_;
            private long speedIntervalTime_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(AudioSettingsResponse audioSettingsResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    audioSettingsResponse.speakLaps_ = this.speakLaps_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    audioSettingsResponse.speedIntervalTime_ = this.speedIntervalTime_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    audioSettingsResponse.hrIntervalTime_ = this.hrIntervalTime_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    audioSettingsResponse.powerIntervalTime_ = this.powerIntervalTime_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    audioSettingsResponse.speakNavigation_ = this.speakNavigation_;
                    i14 |= 16;
                }
                audioSettingsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_AudioSettingsResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AudioSettingsResponse build() {
                AudioSettingsResponse audioSettingsResponseBuildPartial = buildPartial();
                if (audioSettingsResponseBuildPartial.isInitialized()) {
                    return audioSettingsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) audioSettingsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AudioSettingsResponse buildPartial() {
                AudioSettingsResponse audioSettingsResponse = new AudioSettingsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(audioSettingsResponse);
                }
                onBuilt();
                return audioSettingsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.speakLaps_ = false;
                this.speedIntervalTime_ = 0L;
                this.hrIntervalTime_ = 0L;
                this.powerIntervalTime_ = 0L;
                this.speakNavigation_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHrIntervalTime() {
                this.bitField0_ &= -5;
                this.hrIntervalTime_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPowerIntervalTime() {
                this.bitField0_ &= -9;
                this.powerIntervalTime_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearSpeakLaps() {
                this.bitField0_ &= -2;
                this.speakLaps_ = false;
                onChanged();
                return this;
            }

            public Builder clearSpeakNavigation() {
                this.bitField0_ &= -17;
                this.speakNavigation_ = false;
                onChanged();
                return this;
            }

            public Builder clearSpeedIntervalTime() {
                this.bitField0_ &= -3;
                this.speedIntervalTime_ = 0L;
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
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_AudioSettingsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponseOrBuilder
            public long getHrIntervalTime() {
                return this.hrIntervalTime_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponseOrBuilder
            public long getPowerIntervalTime() {
                return this.powerIntervalTime_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponseOrBuilder
            public boolean getSpeakLaps() {
                return this.speakLaps_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponseOrBuilder
            public boolean getSpeakNavigation() {
                return this.speakNavigation_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponseOrBuilder
            public long getSpeedIntervalTime() {
                return this.speedIntervalTime_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponseOrBuilder
            public boolean hasHrIntervalTime() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponseOrBuilder
            public boolean hasPowerIntervalTime() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponseOrBuilder
            public boolean hasSpeakLaps() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponseOrBuilder
            public boolean hasSpeakNavigation() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsResponseOrBuilder
            public boolean hasSpeedIntervalTime() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_AudioSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AudioSettingsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSpeakLaps() && hasSpeedIntervalTime() && hasHrIntervalTime();
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
                                    this.speakLaps_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.speedIntervalTime_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.hrIntervalTime_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.powerIntervalTime_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.speakNavigation_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16;
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

            public Builder setHrIntervalTime(long j8) {
                this.hrIntervalTime_ = j8;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPowerIntervalTime(long j8) {
                this.powerIntervalTime_ = j8;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSpeakLaps(boolean z14) {
                this.speakLaps_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSpeakNavigation(boolean z14) {
                this.speakNavigation_ = z14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSpeedIntervalTime(long j8) {
                this.speedIntervalTime_ = j8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
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
            public AudioSettingsResponse getDefaultInstanceForType() {
                return AudioSettingsResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AudioSettingsResponse) {
                    return mergeFrom((AudioSettingsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AudioSettingsResponse audioSettingsResponse) {
                if (audioSettingsResponse == AudioSettingsResponse.getDefaultInstance()) {
                    return this;
                }
                if (audioSettingsResponse.hasSpeakLaps()) {
                    setSpeakLaps(audioSettingsResponse.getSpeakLaps());
                }
                if (audioSettingsResponse.hasSpeedIntervalTime()) {
                    setSpeedIntervalTime(audioSettingsResponse.getSpeedIntervalTime());
                }
                if (audioSettingsResponse.hasHrIntervalTime()) {
                    setHrIntervalTime(audioSettingsResponse.getHrIntervalTime());
                }
                if (audioSettingsResponse.hasPowerIntervalTime()) {
                    setPowerIntervalTime(audioSettingsResponse.getPowerIntervalTime());
                }
                if (audioSettingsResponse.hasSpeakNavigation()) {
                    setSpeakNavigation(audioSettingsResponse.getSpeakNavigation());
                }
                mergeUnknownFields(audioSettingsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AudioSettingsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AudioSettingsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudioSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AudioSettingsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AudioSettingsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AudioSettingsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AudioSettingsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AudioSettingsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AudioSettingsResponse parseFrom(InputStream inputStream) {
            return (AudioSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AudioSettingsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudioSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AudioSettingsResponse parseFrom(CodedInputStream codedInputStream) {
            return (AudioSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ AudioSettingsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AudioSettingsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudioSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private AudioSettingsResponse() {
            this.speakLaps_ = false;
            this.speedIntervalTime_ = 0L;
            this.hrIntervalTime_ = 0L;
            this.powerIntervalTime_ = 0L;
            this.speakNavigation_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    public static final class AudioSettingsUpdatedNotification extends GeneratedMessageV3 implements AudioSettingsUpdatedNotificationOrBuilder {
        private static final AudioSettingsUpdatedNotification DEFAULT_INSTANCE = new AudioSettingsUpdatedNotification();

        @Deprecated
        public static final Parser<AudioSettingsUpdatedNotification> PARSER = new AbstractParser<AudioSettingsUpdatedNotification>() { // from class: com.garmin.proto.generated.GDIAudioPromptsProto.AudioSettingsUpdatedNotification.1
            @Override // com.google.protobuf.Parser
            public AudioSettingsUpdatedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AudioSettingsUpdatedNotification.newBuilder();
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
        private byte memoizedIsInitialized;

        private AudioSettingsUpdatedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AudioSettingsUpdatedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_AudioSettingsUpdatedNotification_descriptor;
        }

        public static Builder newBuilder(AudioSettingsUpdatedNotification audioSettingsUpdatedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(audioSettingsUpdatedNotification);
        }

        public static AudioSettingsUpdatedNotification parseDelimitedFrom(InputStream inputStream) {
            return (AudioSettingsUpdatedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AudioSettingsUpdatedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AudioSettingsUpdatedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof AudioSettingsUpdatedNotification) {
                return getUnknownFields().equals(((AudioSettingsUpdatedNotification) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AudioSettingsUpdatedNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getDescriptor().hashCode() + 779) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_AudioSettingsUpdatedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AudioSettingsUpdatedNotification.class, Builder.class);
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
            return new AudioSettingsUpdatedNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AudioSettingsUpdatedNotificationOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_AudioSettingsUpdatedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AudioSettingsUpdatedNotification build() {
                AudioSettingsUpdatedNotification audioSettingsUpdatedNotificationBuildPartial = buildPartial();
                if (audioSettingsUpdatedNotificationBuildPartial.isInitialized()) {
                    return audioSettingsUpdatedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) audioSettingsUpdatedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AudioSettingsUpdatedNotification buildPartial() {
                AudioSettingsUpdatedNotification audioSettingsUpdatedNotification = new AudioSettingsUpdatedNotification(this);
                onBuilt();
                return audioSettingsUpdatedNotification;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_AudioSettingsUpdatedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_AudioSettingsUpdatedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(AudioSettingsUpdatedNotification.class, Builder.class);
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
                            if (tag == 0 || !super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                z14 = true;
                            }
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
            public AudioSettingsUpdatedNotification getDefaultInstanceForType() {
                return AudioSettingsUpdatedNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AudioSettingsUpdatedNotification) {
                    return mergeFrom((AudioSettingsUpdatedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AudioSettingsUpdatedNotification audioSettingsUpdatedNotification) {
                if (audioSettingsUpdatedNotification == AudioSettingsUpdatedNotification.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(audioSettingsUpdatedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AudioSettingsUpdatedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ AudioSettingsUpdatedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private AudioSettingsUpdatedNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AudioSettingsUpdatedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudioSettingsUpdatedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AudioSettingsUpdatedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AudioSettingsUpdatedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AudioSettingsUpdatedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AudioSettingsUpdatedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AudioSettingsUpdatedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AudioSettingsUpdatedNotification parseFrom(InputStream inputStream) {
            return (AudioSettingsUpdatedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AudioSettingsUpdatedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudioSettingsUpdatedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AudioSettingsUpdatedNotification parseFrom(CodedInputStream codedInputStream) {
            return (AudioSettingsUpdatedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AudioSettingsUpdatedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudioSettingsUpdatedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class SetLanguageResponse extends GeneratedMessageV3 implements SetLanguageResponseOrBuilder {
        private static final SetLanguageResponse DEFAULT_INSTANCE = new SetLanguageResponse();

        @Deprecated
        public static final Parser<SetLanguageResponse> PARSER = new AbstractParser<SetLanguageResponse>() { // from class: com.garmin.proto.generated.GDIAudioPromptsProto.SetLanguageResponse.1
            @Override // com.google.protobuf.Parser
            public SetLanguageResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SetLanguageResponse.newBuilder();
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
        public static final int SUCCESS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean success_;

        private SetLanguageResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.success_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetLanguageResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SetLanguageResponse_descriptor;
        }

        public static Builder newBuilder(SetLanguageResponse setLanguageResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(setLanguageResponse);
        }

        public static SetLanguageResponse parseDelimitedFrom(InputStream inputStream) {
            return (SetLanguageResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SetLanguageResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SetLanguageResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetLanguageResponse)) {
                return super.equals(obj);
            }
            SetLanguageResponse setLanguageResponse = (SetLanguageResponse) obj;
            if (hasSuccess() != setLanguageResponse.hasSuccess()) {
                return false;
            }
            return (!hasSuccess() || getSuccess() == setLanguageResponse.getSuccess()) && getUnknownFields().equals(setLanguageResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SetLanguageResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.success_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SetLanguageResponseOrBuilder
        public boolean getSuccess() {
            return this.success_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SetLanguageResponseOrBuilder
        public boolean hasSuccess() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSuccess()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getSuccess());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SetLanguageResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SetLanguageResponse.class, Builder.class);
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
            if (hasSuccess()) {
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
            return new SetLanguageResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.success_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetLanguageResponseOrBuilder {
            private int bitField0_;
            private boolean success_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SetLanguageResponse setLanguageResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    setLanguageResponse.success_ = this.success_;
                } else {
                    i14 = 0;
                }
                setLanguageResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SetLanguageResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetLanguageResponse build() {
                SetLanguageResponse setLanguageResponseBuildPartial = buildPartial();
                if (setLanguageResponseBuildPartial.isInitialized()) {
                    return setLanguageResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) setLanguageResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetLanguageResponse buildPartial() {
                SetLanguageResponse setLanguageResponse = new SetLanguageResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(setLanguageResponse);
                }
                onBuilt();
                return setLanguageResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.success_ = false;
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

            public Builder clearSuccess() {
                this.bitField0_ &= -2;
                this.success_ = false;
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
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SetLanguageResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SetLanguageResponseOrBuilder
            public boolean getSuccess() {
                return this.success_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SetLanguageResponseOrBuilder
            public boolean hasSuccess() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SetLanguageResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SetLanguageResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSuccess();
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
                                    this.success_ = codedInputStream.readBool();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSuccess(boolean z14) {
                this.success_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
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
            public SetLanguageResponse getDefaultInstanceForType() {
                return SetLanguageResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SetLanguageResponse) {
                    return mergeFrom((SetLanguageResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SetLanguageResponse setLanguageResponse) {
                if (setLanguageResponse == SetLanguageResponse.getDefaultInstance()) {
                    return this;
                }
                if (setLanguageResponse.hasSuccess()) {
                    setSuccess(setLanguageResponse.getSuccess());
                }
                mergeUnknownFields(setLanguageResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SetLanguageResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SetLanguageResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetLanguageResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetLanguageResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SetLanguageResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SetLanguageResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SetLanguageResponse() {
            this.success_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SetLanguageResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SetLanguageResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SetLanguageResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SetLanguageResponse parseFrom(InputStream inputStream) {
            return (SetLanguageResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SetLanguageResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetLanguageResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetLanguageResponse parseFrom(CodedInputStream codedInputStream) {
            return (SetLanguageResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SetLanguageResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetLanguageResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class SupportedLanguagesRequest extends GeneratedMessageV3 implements SupportedLanguagesRequestOrBuilder {
        private static final SupportedLanguagesRequest DEFAULT_INSTANCE = new SupportedLanguagesRequest();

        @Deprecated
        public static final Parser<SupportedLanguagesRequest> PARSER = new AbstractParser<SupportedLanguagesRequest>() { // from class: com.garmin.proto.generated.GDIAudioPromptsProto.SupportedLanguagesRequest.1
            @Override // com.google.protobuf.Parser
            public SupportedLanguagesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SupportedLanguagesRequest.newBuilder();
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
        private byte memoizedIsInitialized;

        private SupportedLanguagesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SupportedLanguagesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SupportedLanguagesRequest_descriptor;
        }

        public static Builder newBuilder(SupportedLanguagesRequest supportedLanguagesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(supportedLanguagesRequest);
        }

        public static SupportedLanguagesRequest parseDelimitedFrom(InputStream inputStream) {
            return (SupportedLanguagesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SupportedLanguagesRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SupportedLanguagesRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof SupportedLanguagesRequest) {
                return getUnknownFields().equals(((SupportedLanguagesRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SupportedLanguagesRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getDescriptor().hashCode() + 779) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SupportedLanguagesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedLanguagesRequest.class, Builder.class);
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
            return new SupportedLanguagesRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SupportedLanguagesRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SupportedLanguagesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SupportedLanguagesRequest build() {
                SupportedLanguagesRequest supportedLanguagesRequestBuildPartial = buildPartial();
                if (supportedLanguagesRequestBuildPartial.isInitialized()) {
                    return supportedLanguagesRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) supportedLanguagesRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SupportedLanguagesRequest buildPartial() {
                SupportedLanguagesRequest supportedLanguagesRequest = new SupportedLanguagesRequest(this);
                onBuilt();
                return supportedLanguagesRequest;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SupportedLanguagesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SupportedLanguagesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedLanguagesRequest.class, Builder.class);
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
                            if (tag == 0 || !super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                z14 = true;
                            }
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
            public SupportedLanguagesRequest getDefaultInstanceForType() {
                return SupportedLanguagesRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SupportedLanguagesRequest) {
                    return mergeFrom((SupportedLanguagesRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SupportedLanguagesRequest supportedLanguagesRequest) {
                if (supportedLanguagesRequest == SupportedLanguagesRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(supportedLanguagesRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SupportedLanguagesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SupportedLanguagesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SupportedLanguagesRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SupportedLanguagesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedLanguagesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SupportedLanguagesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SupportedLanguagesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SupportedLanguagesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SupportedLanguagesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SupportedLanguagesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SupportedLanguagesRequest parseFrom(InputStream inputStream) {
            return (SupportedLanguagesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SupportedLanguagesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedLanguagesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SupportedLanguagesRequest parseFrom(CodedInputStream codedInputStream) {
            return (SupportedLanguagesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SupportedLanguagesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedLanguagesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AudioPromptsService extends GeneratedMessageV3 implements AudioPromptsServiceOrBuilder {
        public static final int AUDIO_SETTINGS_REQUEST_FIELD_NUMBER = 3;
        public static final int AUDIO_SETTINGS_RESPONSE_FIELD_NUMBER = 4;
        public static final int AUDIO_SETTINGS_UPDATED_NOTIFICATION_FIELD_NUMBER = 2;
        public static final int HEART_RATE_NOTIFICATION_FIELD_NUMBER = 7;
        public static final int LAP_NOTIFICATION_FIELD_NUMBER = 1;
        public static final int PACE_NOTIFICATION_FIELD_NUMBER = 6;
        public static final int PHRASE_NOTIFICATION_FIELD_NUMBER = 14;
        public static final int POWER_NOTIFICATION_FIELD_NUMBER = 8;
        public static final int SET_LANGUAGE_REQUEST_FIELD_NUMBER = 12;
        public static final int SET_LANGUAGE_RESPONSE_FIELD_NUMBER = 13;
        public static final int SPEECH_NOTIFICATION_FIELD_NUMBER = 9;
        public static final int SPEED_NOTIFICATION_FIELD_NUMBER = 5;
        public static final int SUPPORTED_LANGUAGES_REQUEST_FIELD_NUMBER = 10;
        public static final int SUPPORTED_LANGUAGES_RESPONSE_FIELD_NUMBER = 11;
        private static final long serialVersionUID = 0;
        private AudioSettingsRequest audioSettingsRequest_;
        private AudioSettingsResponse audioSettingsResponse_;
        private AudioSettingsUpdatedNotification audioSettingsUpdatedNotification_;
        private int bitField0_;
        private HeartRateNotification heartRateNotification_;
        private LapNotification lapNotification_;
        private byte memoizedIsInitialized;
        private PaceNotification paceNotification_;
        private PhraseNotification phraseNotification_;
        private PowerNotification powerNotification_;
        private SetLanguageRequest setLanguageRequest_;
        private SetLanguageResponse setLanguageResponse_;
        private SpeechNotification speechNotification_;
        private SpeedNotification speedNotification_;
        private SupportedLanguagesRequest supportedLanguagesRequest_;
        private SupportedLanguagesResponse supportedLanguagesResponse_;
        private static final AudioPromptsService DEFAULT_INSTANCE = new AudioPromptsService();

        @Deprecated
        public static final Parser<AudioPromptsService> PARSER = new AbstractParser<AudioPromptsService>() { // from class: com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsService.1
            @Override // com.google.protobuf.Parser
            public AudioPromptsService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AudioPromptsService.newBuilder();
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

        private AudioPromptsService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AudioPromptsService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_AudioPromptsService_descriptor;
        }

        public static Builder newBuilder(AudioPromptsService audioPromptsService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(audioPromptsService);
        }

        public static AudioPromptsService parseDelimitedFrom(InputStream inputStream) {
            return (AudioPromptsService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AudioPromptsService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AudioPromptsService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AudioPromptsService)) {
                return super.equals(obj);
            }
            AudioPromptsService audioPromptsService = (AudioPromptsService) obj;
            if (hasLapNotification() != audioPromptsService.hasLapNotification()) {
                return false;
            }
            if ((hasLapNotification() && !getLapNotification().equals(audioPromptsService.getLapNotification())) || hasAudioSettingsUpdatedNotification() != audioPromptsService.hasAudioSettingsUpdatedNotification()) {
                return false;
            }
            if ((hasAudioSettingsUpdatedNotification() && !getAudioSettingsUpdatedNotification().equals(audioPromptsService.getAudioSettingsUpdatedNotification())) || hasAudioSettingsRequest() != audioPromptsService.hasAudioSettingsRequest()) {
                return false;
            }
            if ((hasAudioSettingsRequest() && !getAudioSettingsRequest().equals(audioPromptsService.getAudioSettingsRequest())) || hasAudioSettingsResponse() != audioPromptsService.hasAudioSettingsResponse()) {
                return false;
            }
            if ((hasAudioSettingsResponse() && !getAudioSettingsResponse().equals(audioPromptsService.getAudioSettingsResponse())) || hasSpeedNotification() != audioPromptsService.hasSpeedNotification()) {
                return false;
            }
            if ((hasSpeedNotification() && !getSpeedNotification().equals(audioPromptsService.getSpeedNotification())) || hasPaceNotification() != audioPromptsService.hasPaceNotification()) {
                return false;
            }
            if ((hasPaceNotification() && !getPaceNotification().equals(audioPromptsService.getPaceNotification())) || hasHeartRateNotification() != audioPromptsService.hasHeartRateNotification()) {
                return false;
            }
            if ((hasHeartRateNotification() && !getHeartRateNotification().equals(audioPromptsService.getHeartRateNotification())) || hasPowerNotification() != audioPromptsService.hasPowerNotification()) {
                return false;
            }
            if ((hasPowerNotification() && !getPowerNotification().equals(audioPromptsService.getPowerNotification())) || hasSpeechNotification() != audioPromptsService.hasSpeechNotification()) {
                return false;
            }
            if ((hasSpeechNotification() && !getSpeechNotification().equals(audioPromptsService.getSpeechNotification())) || hasSupportedLanguagesRequest() != audioPromptsService.hasSupportedLanguagesRequest()) {
                return false;
            }
            if ((hasSupportedLanguagesRequest() && !getSupportedLanguagesRequest().equals(audioPromptsService.getSupportedLanguagesRequest())) || hasSupportedLanguagesResponse() != audioPromptsService.hasSupportedLanguagesResponse()) {
                return false;
            }
            if ((hasSupportedLanguagesResponse() && !getSupportedLanguagesResponse().equals(audioPromptsService.getSupportedLanguagesResponse())) || hasSetLanguageRequest() != audioPromptsService.hasSetLanguageRequest()) {
                return false;
            }
            if ((hasSetLanguageRequest() && !getSetLanguageRequest().equals(audioPromptsService.getSetLanguageRequest())) || hasSetLanguageResponse() != audioPromptsService.hasSetLanguageResponse()) {
                return false;
            }
            if ((!hasSetLanguageResponse() || getSetLanguageResponse().equals(audioPromptsService.getSetLanguageResponse())) && hasPhraseNotification() == audioPromptsService.hasPhraseNotification()) {
                return (!hasPhraseNotification() || getPhraseNotification().equals(audioPromptsService.getPhraseNotification())) && getUnknownFields().equals(audioPromptsService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public AudioSettingsRequest getAudioSettingsRequest() {
            AudioSettingsRequest audioSettingsRequest = this.audioSettingsRequest_;
            return audioSettingsRequest == null ? AudioSettingsRequest.getDefaultInstance() : audioSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public AudioSettingsRequestOrBuilder getAudioSettingsRequestOrBuilder() {
            AudioSettingsRequest audioSettingsRequest = this.audioSettingsRequest_;
            return audioSettingsRequest == null ? AudioSettingsRequest.getDefaultInstance() : audioSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public AudioSettingsResponse getAudioSettingsResponse() {
            AudioSettingsResponse audioSettingsResponse = this.audioSettingsResponse_;
            return audioSettingsResponse == null ? AudioSettingsResponse.getDefaultInstance() : audioSettingsResponse;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public AudioSettingsResponseOrBuilder getAudioSettingsResponseOrBuilder() {
            AudioSettingsResponse audioSettingsResponse = this.audioSettingsResponse_;
            return audioSettingsResponse == null ? AudioSettingsResponse.getDefaultInstance() : audioSettingsResponse;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public AudioSettingsUpdatedNotification getAudioSettingsUpdatedNotification() {
            AudioSettingsUpdatedNotification audioSettingsUpdatedNotification = this.audioSettingsUpdatedNotification_;
            return audioSettingsUpdatedNotification == null ? AudioSettingsUpdatedNotification.getDefaultInstance() : audioSettingsUpdatedNotification;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public AudioSettingsUpdatedNotificationOrBuilder getAudioSettingsUpdatedNotificationOrBuilder() {
            AudioSettingsUpdatedNotification audioSettingsUpdatedNotification = this.audioSettingsUpdatedNotification_;
            return audioSettingsUpdatedNotification == null ? AudioSettingsUpdatedNotification.getDefaultInstance() : audioSettingsUpdatedNotification;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public HeartRateNotification getHeartRateNotification() {
            HeartRateNotification heartRateNotification = this.heartRateNotification_;
            return heartRateNotification == null ? HeartRateNotification.getDefaultInstance() : heartRateNotification;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public HeartRateNotificationOrBuilder getHeartRateNotificationOrBuilder() {
            HeartRateNotification heartRateNotification = this.heartRateNotification_;
            return heartRateNotification == null ? HeartRateNotification.getDefaultInstance() : heartRateNotification;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public LapNotification getLapNotification() {
            LapNotification lapNotification = this.lapNotification_;
            return lapNotification == null ? LapNotification.getDefaultInstance() : lapNotification;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public LapNotificationOrBuilder getLapNotificationOrBuilder() {
            LapNotification lapNotification = this.lapNotification_;
            return lapNotification == null ? LapNotification.getDefaultInstance() : lapNotification;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public PaceNotification getPaceNotification() {
            PaceNotification paceNotification = this.paceNotification_;
            return paceNotification == null ? PaceNotification.getDefaultInstance() : paceNotification;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public PaceNotificationOrBuilder getPaceNotificationOrBuilder() {
            PaceNotification paceNotification = this.paceNotification_;
            return paceNotification == null ? PaceNotification.getDefaultInstance() : paceNotification;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AudioPromptsService> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public PhraseNotification getPhraseNotification() {
            PhraseNotification phraseNotification = this.phraseNotification_;
            return phraseNotification == null ? PhraseNotification.getDefaultInstance() : phraseNotification;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public PhraseNotificationOrBuilder getPhraseNotificationOrBuilder() {
            PhraseNotification phraseNotification = this.phraseNotification_;
            return phraseNotification == null ? PhraseNotification.getDefaultInstance() : phraseNotification;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public PowerNotification getPowerNotification() {
            PowerNotification powerNotification = this.powerNotification_;
            return powerNotification == null ? PowerNotification.getDefaultInstance() : powerNotification;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public PowerNotificationOrBuilder getPowerNotificationOrBuilder() {
            PowerNotification powerNotification = this.powerNotification_;
            return powerNotification == null ? PowerNotification.getDefaultInstance() : powerNotification;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getLapNotification()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getAudioSettingsUpdatedNotification());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getAudioSettingsRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getAudioSettingsResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getSpeedNotification());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getPaceNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getHeartRateNotification());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getPowerNotification());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getSpeechNotification());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getSupportedLanguagesRequest());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getSupportedLanguagesResponse());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getSetLanguageRequest());
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(13, getSetLanguageResponse());
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(14, getPhraseNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public SetLanguageRequest getSetLanguageRequest() {
            SetLanguageRequest setLanguageRequest = this.setLanguageRequest_;
            return setLanguageRequest == null ? SetLanguageRequest.getDefaultInstance() : setLanguageRequest;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public SetLanguageRequestOrBuilder getSetLanguageRequestOrBuilder() {
            SetLanguageRequest setLanguageRequest = this.setLanguageRequest_;
            return setLanguageRequest == null ? SetLanguageRequest.getDefaultInstance() : setLanguageRequest;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public SetLanguageResponse getSetLanguageResponse() {
            SetLanguageResponse setLanguageResponse = this.setLanguageResponse_;
            return setLanguageResponse == null ? SetLanguageResponse.getDefaultInstance() : setLanguageResponse;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public SetLanguageResponseOrBuilder getSetLanguageResponseOrBuilder() {
            SetLanguageResponse setLanguageResponse = this.setLanguageResponse_;
            return setLanguageResponse == null ? SetLanguageResponse.getDefaultInstance() : setLanguageResponse;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public SpeechNotification getSpeechNotification() {
            SpeechNotification speechNotification = this.speechNotification_;
            return speechNotification == null ? SpeechNotification.getDefaultInstance() : speechNotification;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public SpeechNotificationOrBuilder getSpeechNotificationOrBuilder() {
            SpeechNotification speechNotification = this.speechNotification_;
            return speechNotification == null ? SpeechNotification.getDefaultInstance() : speechNotification;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public SpeedNotification getSpeedNotification() {
            SpeedNotification speedNotification = this.speedNotification_;
            return speedNotification == null ? SpeedNotification.getDefaultInstance() : speedNotification;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public SpeedNotificationOrBuilder getSpeedNotificationOrBuilder() {
            SpeedNotification speedNotification = this.speedNotification_;
            return speedNotification == null ? SpeedNotification.getDefaultInstance() : speedNotification;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public SupportedLanguagesRequest getSupportedLanguagesRequest() {
            SupportedLanguagesRequest supportedLanguagesRequest = this.supportedLanguagesRequest_;
            return supportedLanguagesRequest == null ? SupportedLanguagesRequest.getDefaultInstance() : supportedLanguagesRequest;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public SupportedLanguagesRequestOrBuilder getSupportedLanguagesRequestOrBuilder() {
            SupportedLanguagesRequest supportedLanguagesRequest = this.supportedLanguagesRequest_;
            return supportedLanguagesRequest == null ? SupportedLanguagesRequest.getDefaultInstance() : supportedLanguagesRequest;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public SupportedLanguagesResponse getSupportedLanguagesResponse() {
            SupportedLanguagesResponse supportedLanguagesResponse = this.supportedLanguagesResponse_;
            return supportedLanguagesResponse == null ? SupportedLanguagesResponse.getDefaultInstance() : supportedLanguagesResponse;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public SupportedLanguagesResponseOrBuilder getSupportedLanguagesResponseOrBuilder() {
            SupportedLanguagesResponse supportedLanguagesResponse = this.supportedLanguagesResponse_;
            return supportedLanguagesResponse == null ? SupportedLanguagesResponse.getDefaultInstance() : supportedLanguagesResponse;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public boolean hasAudioSettingsRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public boolean hasAudioSettingsResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public boolean hasAudioSettingsUpdatedNotification() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public boolean hasHeartRateNotification() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public boolean hasLapNotification() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public boolean hasPaceNotification() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public boolean hasPhraseNotification() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public boolean hasPowerNotification() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public boolean hasSetLanguageRequest() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public boolean hasSetLanguageResponse() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public boolean hasSpeechNotification() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public boolean hasSpeedNotification() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public boolean hasSupportedLanguagesRequest() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
        public boolean hasSupportedLanguagesResponse() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasLapNotification()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getLapNotification().hashCode();
            }
            if (hasAudioSettingsUpdatedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getAudioSettingsUpdatedNotification().hashCode();
            }
            if (hasAudioSettingsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getAudioSettingsRequest().hashCode();
            }
            if (hasAudioSettingsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getAudioSettingsResponse().hashCode();
            }
            if (hasSpeedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getSpeedNotification().hashCode();
            }
            if (hasPaceNotification()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getPaceNotification().hashCode();
            }
            if (hasHeartRateNotification()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getHeartRateNotification().hashCode();
            }
            if (hasPowerNotification()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getPowerNotification().hashCode();
            }
            if (hasSpeechNotification()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getSpeechNotification().hashCode();
            }
            if (hasSupportedLanguagesRequest()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getSupportedLanguagesRequest().hashCode();
            }
            if (hasSupportedLanguagesResponse()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getSupportedLanguagesResponse().hashCode();
            }
            if (hasSetLanguageRequest()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getSetLanguageRequest().hashCode();
            }
            if (hasSetLanguageResponse()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getSetLanguageResponse().hashCode();
            }
            if (hasPhraseNotification()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getPhraseNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_AudioPromptsService_fieldAccessorTable.ensureFieldAccessorsInitialized(AudioPromptsService.class, Builder.class);
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
            if (hasLapNotification() && !getLapNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAudioSettingsResponse() && !getAudioSettingsResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSpeedNotification() && !getSpeedNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasPaceNotification() && !getPaceNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasHeartRateNotification() && !getHeartRateNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasPowerNotification() && !getPowerNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSupportedLanguagesResponse() && !getSupportedLanguagesResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSetLanguageRequest() && !getSetLanguageRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSetLanguageResponse() && !getSetLanguageResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasPhraseNotification() || getPhraseNotification().isInitialized()) {
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
            return new AudioPromptsService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getLapNotification());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getAudioSettingsUpdatedNotification());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getAudioSettingsRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getAudioSettingsResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getSpeedNotification());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getPaceNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getHeartRateNotification());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getPowerNotification());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getSpeechNotification());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getSupportedLanguagesRequest());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getSupportedLanguagesResponse());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(12, getSetLanguageRequest());
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeMessage(13, getSetLanguageResponse());
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeMessage(14, getPhraseNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AudioPromptsServiceOrBuilder {
            private SingleFieldBuilderV3<AudioSettingsRequest, AudioSettingsRequest.Builder, AudioSettingsRequestOrBuilder> audioSettingsRequestBuilder_;
            private AudioSettingsRequest audioSettingsRequest_;
            private SingleFieldBuilderV3<AudioSettingsResponse, AudioSettingsResponse.Builder, AudioSettingsResponseOrBuilder> audioSettingsResponseBuilder_;
            private AudioSettingsResponse audioSettingsResponse_;
            private SingleFieldBuilderV3<AudioSettingsUpdatedNotification, AudioSettingsUpdatedNotification.Builder, AudioSettingsUpdatedNotificationOrBuilder> audioSettingsUpdatedNotificationBuilder_;
            private AudioSettingsUpdatedNotification audioSettingsUpdatedNotification_;
            private int bitField0_;
            private SingleFieldBuilderV3<HeartRateNotification, HeartRateNotification.Builder, HeartRateNotificationOrBuilder> heartRateNotificationBuilder_;
            private HeartRateNotification heartRateNotification_;
            private SingleFieldBuilderV3<LapNotification, LapNotification.Builder, LapNotificationOrBuilder> lapNotificationBuilder_;
            private LapNotification lapNotification_;
            private SingleFieldBuilderV3<PaceNotification, PaceNotification.Builder, PaceNotificationOrBuilder> paceNotificationBuilder_;
            private PaceNotification paceNotification_;
            private SingleFieldBuilderV3<PhraseNotification, PhraseNotification.Builder, PhraseNotificationOrBuilder> phraseNotificationBuilder_;
            private PhraseNotification phraseNotification_;
            private SingleFieldBuilderV3<PowerNotification, PowerNotification.Builder, PowerNotificationOrBuilder> powerNotificationBuilder_;
            private PowerNotification powerNotification_;
            private SingleFieldBuilderV3<SetLanguageRequest, SetLanguageRequest.Builder, SetLanguageRequestOrBuilder> setLanguageRequestBuilder_;
            private SetLanguageRequest setLanguageRequest_;
            private SingleFieldBuilderV3<SetLanguageResponse, SetLanguageResponse.Builder, SetLanguageResponseOrBuilder> setLanguageResponseBuilder_;
            private SetLanguageResponse setLanguageResponse_;
            private SingleFieldBuilderV3<SpeechNotification, SpeechNotification.Builder, SpeechNotificationOrBuilder> speechNotificationBuilder_;
            private SpeechNotification speechNotification_;
            private SingleFieldBuilderV3<SpeedNotification, SpeedNotification.Builder, SpeedNotificationOrBuilder> speedNotificationBuilder_;
            private SpeedNotification speedNotification_;
            private SingleFieldBuilderV3<SupportedLanguagesRequest, SupportedLanguagesRequest.Builder, SupportedLanguagesRequestOrBuilder> supportedLanguagesRequestBuilder_;
            private SupportedLanguagesRequest supportedLanguagesRequest_;
            private SingleFieldBuilderV3<SupportedLanguagesResponse, SupportedLanguagesResponse.Builder, SupportedLanguagesResponseOrBuilder> supportedLanguagesResponseBuilder_;
            private SupportedLanguagesResponse supportedLanguagesResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(AudioPromptsService audioPromptsService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<LapNotification, LapNotification.Builder, LapNotificationOrBuilder> singleFieldBuilderV3 = this.lapNotificationBuilder_;
                    audioPromptsService.lapNotification_ = singleFieldBuilderV3 == null ? this.lapNotification_ : (LapNotification) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<AudioSettingsUpdatedNotification, AudioSettingsUpdatedNotification.Builder, AudioSettingsUpdatedNotificationOrBuilder> singleFieldBuilderV4 = this.audioSettingsUpdatedNotificationBuilder_;
                    audioPromptsService.audioSettingsUpdatedNotification_ = singleFieldBuilderV4 == null ? this.audioSettingsUpdatedNotification_ : (AudioSettingsUpdatedNotification) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<AudioSettingsRequest, AudioSettingsRequest.Builder, AudioSettingsRequestOrBuilder> singleFieldBuilderV5 = this.audioSettingsRequestBuilder_;
                    audioPromptsService.audioSettingsRequest_ = singleFieldBuilderV5 == null ? this.audioSettingsRequest_ : (AudioSettingsRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<AudioSettingsResponse, AudioSettingsResponse.Builder, AudioSettingsResponseOrBuilder> singleFieldBuilderV6 = this.audioSettingsResponseBuilder_;
                    audioPromptsService.audioSettingsResponse_ = singleFieldBuilderV6 == null ? this.audioSettingsResponse_ : (AudioSettingsResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<SpeedNotification, SpeedNotification.Builder, SpeedNotificationOrBuilder> singleFieldBuilderV7 = this.speedNotificationBuilder_;
                    audioPromptsService.speedNotification_ = singleFieldBuilderV7 == null ? this.speedNotification_ : (SpeedNotification) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<PaceNotification, PaceNotification.Builder, PaceNotificationOrBuilder> singleFieldBuilderV8 = this.paceNotificationBuilder_;
                    audioPromptsService.paceNotification_ = singleFieldBuilderV8 == null ? this.paceNotification_ : (PaceNotification) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<HeartRateNotification, HeartRateNotification.Builder, HeartRateNotificationOrBuilder> singleFieldBuilderV9 = this.heartRateNotificationBuilder_;
                    audioPromptsService.heartRateNotification_ = singleFieldBuilderV9 == null ? this.heartRateNotification_ : (HeartRateNotification) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<PowerNotification, PowerNotification.Builder, PowerNotificationOrBuilder> singleFieldBuilderV10 = this.powerNotificationBuilder_;
                    audioPromptsService.powerNotification_ = singleFieldBuilderV10 == null ? this.powerNotification_ : (PowerNotification) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<SpeechNotification, SpeechNotification.Builder, SpeechNotificationOrBuilder> singleFieldBuilderV11 = this.speechNotificationBuilder_;
                    audioPromptsService.speechNotification_ = singleFieldBuilderV11 == null ? this.speechNotification_ : (SpeechNotification) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<SupportedLanguagesRequest, SupportedLanguagesRequest.Builder, SupportedLanguagesRequestOrBuilder> singleFieldBuilderV12 = this.supportedLanguagesRequestBuilder_;
                    audioPromptsService.supportedLanguagesRequest_ = singleFieldBuilderV12 == null ? this.supportedLanguagesRequest_ : (SupportedLanguagesRequest) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<SupportedLanguagesResponse, SupportedLanguagesResponse.Builder, SupportedLanguagesResponseOrBuilder> singleFieldBuilderV13 = this.supportedLanguagesResponseBuilder_;
                    audioPromptsService.supportedLanguagesResponse_ = singleFieldBuilderV13 == null ? this.supportedLanguagesResponse_ : (SupportedLanguagesResponse) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<SetLanguageRequest, SetLanguageRequest.Builder, SetLanguageRequestOrBuilder> singleFieldBuilderV14 = this.setLanguageRequestBuilder_;
                    audioPromptsService.setLanguageRequest_ = singleFieldBuilderV14 == null ? this.setLanguageRequest_ : (SetLanguageRequest) singleFieldBuilderV14.build();
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    SingleFieldBuilderV3<SetLanguageResponse, SetLanguageResponse.Builder, SetLanguageResponseOrBuilder> singleFieldBuilderV15 = this.setLanguageResponseBuilder_;
                    audioPromptsService.setLanguageResponse_ = singleFieldBuilderV15 == null ? this.setLanguageResponse_ : (SetLanguageResponse) singleFieldBuilderV15.build();
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    SingleFieldBuilderV3<PhraseNotification, PhraseNotification.Builder, PhraseNotificationOrBuilder> singleFieldBuilderV16 = this.phraseNotificationBuilder_;
                    audioPromptsService.phraseNotification_ = singleFieldBuilderV16 == null ? this.phraseNotification_ : (PhraseNotification) singleFieldBuilderV16.build();
                    i14 |= 8192;
                }
                audioPromptsService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<AudioSettingsRequest, AudioSettingsRequest.Builder, AudioSettingsRequestOrBuilder> getAudioSettingsRequestFieldBuilder() {
                if (this.audioSettingsRequestBuilder_ == null) {
                    this.audioSettingsRequestBuilder_ = new SingleFieldBuilderV3<>(getAudioSettingsRequest(), getParentForChildren(), isClean());
                    this.audioSettingsRequest_ = null;
                }
                return this.audioSettingsRequestBuilder_;
            }

            private SingleFieldBuilderV3<AudioSettingsResponse, AudioSettingsResponse.Builder, AudioSettingsResponseOrBuilder> getAudioSettingsResponseFieldBuilder() {
                if (this.audioSettingsResponseBuilder_ == null) {
                    this.audioSettingsResponseBuilder_ = new SingleFieldBuilderV3<>(getAudioSettingsResponse(), getParentForChildren(), isClean());
                    this.audioSettingsResponse_ = null;
                }
                return this.audioSettingsResponseBuilder_;
            }

            private SingleFieldBuilderV3<AudioSettingsUpdatedNotification, AudioSettingsUpdatedNotification.Builder, AudioSettingsUpdatedNotificationOrBuilder> getAudioSettingsUpdatedNotificationFieldBuilder() {
                if (this.audioSettingsUpdatedNotificationBuilder_ == null) {
                    this.audioSettingsUpdatedNotificationBuilder_ = new SingleFieldBuilderV3<>(getAudioSettingsUpdatedNotification(), getParentForChildren(), isClean());
                    this.audioSettingsUpdatedNotification_ = null;
                }
                return this.audioSettingsUpdatedNotificationBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_AudioPromptsService_descriptor;
            }

            private SingleFieldBuilderV3<HeartRateNotification, HeartRateNotification.Builder, HeartRateNotificationOrBuilder> getHeartRateNotificationFieldBuilder() {
                if (this.heartRateNotificationBuilder_ == null) {
                    this.heartRateNotificationBuilder_ = new SingleFieldBuilderV3<>(getHeartRateNotification(), getParentForChildren(), isClean());
                    this.heartRateNotification_ = null;
                }
                return this.heartRateNotificationBuilder_;
            }

            private SingleFieldBuilderV3<LapNotification, LapNotification.Builder, LapNotificationOrBuilder> getLapNotificationFieldBuilder() {
                if (this.lapNotificationBuilder_ == null) {
                    this.lapNotificationBuilder_ = new SingleFieldBuilderV3<>(getLapNotification(), getParentForChildren(), isClean());
                    this.lapNotification_ = null;
                }
                return this.lapNotificationBuilder_;
            }

            private SingleFieldBuilderV3<PaceNotification, PaceNotification.Builder, PaceNotificationOrBuilder> getPaceNotificationFieldBuilder() {
                if (this.paceNotificationBuilder_ == null) {
                    this.paceNotificationBuilder_ = new SingleFieldBuilderV3<>(getPaceNotification(), getParentForChildren(), isClean());
                    this.paceNotification_ = null;
                }
                return this.paceNotificationBuilder_;
            }

            private SingleFieldBuilderV3<PhraseNotification, PhraseNotification.Builder, PhraseNotificationOrBuilder> getPhraseNotificationFieldBuilder() {
                if (this.phraseNotificationBuilder_ == null) {
                    this.phraseNotificationBuilder_ = new SingleFieldBuilderV3<>(getPhraseNotification(), getParentForChildren(), isClean());
                    this.phraseNotification_ = null;
                }
                return this.phraseNotificationBuilder_;
            }

            private SingleFieldBuilderV3<PowerNotification, PowerNotification.Builder, PowerNotificationOrBuilder> getPowerNotificationFieldBuilder() {
                if (this.powerNotificationBuilder_ == null) {
                    this.powerNotificationBuilder_ = new SingleFieldBuilderV3<>(getPowerNotification(), getParentForChildren(), isClean());
                    this.powerNotification_ = null;
                }
                return this.powerNotificationBuilder_;
            }

            private SingleFieldBuilderV3<SetLanguageRequest, SetLanguageRequest.Builder, SetLanguageRequestOrBuilder> getSetLanguageRequestFieldBuilder() {
                if (this.setLanguageRequestBuilder_ == null) {
                    this.setLanguageRequestBuilder_ = new SingleFieldBuilderV3<>(getSetLanguageRequest(), getParentForChildren(), isClean());
                    this.setLanguageRequest_ = null;
                }
                return this.setLanguageRequestBuilder_;
            }

            private SingleFieldBuilderV3<SetLanguageResponse, SetLanguageResponse.Builder, SetLanguageResponseOrBuilder> getSetLanguageResponseFieldBuilder() {
                if (this.setLanguageResponseBuilder_ == null) {
                    this.setLanguageResponseBuilder_ = new SingleFieldBuilderV3<>(getSetLanguageResponse(), getParentForChildren(), isClean());
                    this.setLanguageResponse_ = null;
                }
                return this.setLanguageResponseBuilder_;
            }

            private SingleFieldBuilderV3<SpeechNotification, SpeechNotification.Builder, SpeechNotificationOrBuilder> getSpeechNotificationFieldBuilder() {
                if (this.speechNotificationBuilder_ == null) {
                    this.speechNotificationBuilder_ = new SingleFieldBuilderV3<>(getSpeechNotification(), getParentForChildren(), isClean());
                    this.speechNotification_ = null;
                }
                return this.speechNotificationBuilder_;
            }

            private SingleFieldBuilderV3<SpeedNotification, SpeedNotification.Builder, SpeedNotificationOrBuilder> getSpeedNotificationFieldBuilder() {
                if (this.speedNotificationBuilder_ == null) {
                    this.speedNotificationBuilder_ = new SingleFieldBuilderV3<>(getSpeedNotification(), getParentForChildren(), isClean());
                    this.speedNotification_ = null;
                }
                return this.speedNotificationBuilder_;
            }

            private SingleFieldBuilderV3<SupportedLanguagesRequest, SupportedLanguagesRequest.Builder, SupportedLanguagesRequestOrBuilder> getSupportedLanguagesRequestFieldBuilder() {
                if (this.supportedLanguagesRequestBuilder_ == null) {
                    this.supportedLanguagesRequestBuilder_ = new SingleFieldBuilderV3<>(getSupportedLanguagesRequest(), getParentForChildren(), isClean());
                    this.supportedLanguagesRequest_ = null;
                }
                return this.supportedLanguagesRequestBuilder_;
            }

            private SingleFieldBuilderV3<SupportedLanguagesResponse, SupportedLanguagesResponse.Builder, SupportedLanguagesResponseOrBuilder> getSupportedLanguagesResponseFieldBuilder() {
                if (this.supportedLanguagesResponseBuilder_ == null) {
                    this.supportedLanguagesResponseBuilder_ = new SingleFieldBuilderV3<>(getSupportedLanguagesResponse(), getParentForChildren(), isClean());
                    this.supportedLanguagesResponse_ = null;
                }
                return this.supportedLanguagesResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getLapNotificationFieldBuilder();
                    getAudioSettingsUpdatedNotificationFieldBuilder();
                    getAudioSettingsRequestFieldBuilder();
                    getAudioSettingsResponseFieldBuilder();
                    getSpeedNotificationFieldBuilder();
                    getPaceNotificationFieldBuilder();
                    getHeartRateNotificationFieldBuilder();
                    getPowerNotificationFieldBuilder();
                    getSpeechNotificationFieldBuilder();
                    getSupportedLanguagesRequestFieldBuilder();
                    getSupportedLanguagesResponseFieldBuilder();
                    getSetLanguageRequestFieldBuilder();
                    getSetLanguageResponseFieldBuilder();
                    getPhraseNotificationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AudioPromptsService build() {
                AudioPromptsService audioPromptsServiceBuildPartial = buildPartial();
                if (audioPromptsServiceBuildPartial.isInitialized()) {
                    return audioPromptsServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) audioPromptsServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AudioPromptsService buildPartial() {
                AudioPromptsService audioPromptsService = new AudioPromptsService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(audioPromptsService);
                }
                onBuilt();
                return audioPromptsService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.lapNotification_ = null;
                SingleFieldBuilderV3<LapNotification, LapNotification.Builder, LapNotificationOrBuilder> singleFieldBuilderV3 = this.lapNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lapNotificationBuilder_ = null;
                }
                this.audioSettingsUpdatedNotification_ = null;
                SingleFieldBuilderV3<AudioSettingsUpdatedNotification, AudioSettingsUpdatedNotification.Builder, AudioSettingsUpdatedNotificationOrBuilder> singleFieldBuilderV4 = this.audioSettingsUpdatedNotificationBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.audioSettingsUpdatedNotificationBuilder_ = null;
                }
                this.audioSettingsRequest_ = null;
                SingleFieldBuilderV3<AudioSettingsRequest, AudioSettingsRequest.Builder, AudioSettingsRequestOrBuilder> singleFieldBuilderV5 = this.audioSettingsRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.audioSettingsRequestBuilder_ = null;
                }
                this.audioSettingsResponse_ = null;
                SingleFieldBuilderV3<AudioSettingsResponse, AudioSettingsResponse.Builder, AudioSettingsResponseOrBuilder> singleFieldBuilderV6 = this.audioSettingsResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.audioSettingsResponseBuilder_ = null;
                }
                this.speedNotification_ = null;
                SingleFieldBuilderV3<SpeedNotification, SpeedNotification.Builder, SpeedNotificationOrBuilder> singleFieldBuilderV7 = this.speedNotificationBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.speedNotificationBuilder_ = null;
                }
                this.paceNotification_ = null;
                SingleFieldBuilderV3<PaceNotification, PaceNotification.Builder, PaceNotificationOrBuilder> singleFieldBuilderV8 = this.paceNotificationBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.paceNotificationBuilder_ = null;
                }
                this.heartRateNotification_ = null;
                SingleFieldBuilderV3<HeartRateNotification, HeartRateNotification.Builder, HeartRateNotificationOrBuilder> singleFieldBuilderV9 = this.heartRateNotificationBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.heartRateNotificationBuilder_ = null;
                }
                this.powerNotification_ = null;
                SingleFieldBuilderV3<PowerNotification, PowerNotification.Builder, PowerNotificationOrBuilder> singleFieldBuilderV10 = this.powerNotificationBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.powerNotificationBuilder_ = null;
                }
                this.speechNotification_ = null;
                SingleFieldBuilderV3<SpeechNotification, SpeechNotification.Builder, SpeechNotificationOrBuilder> singleFieldBuilderV11 = this.speechNotificationBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.speechNotificationBuilder_ = null;
                }
                this.supportedLanguagesRequest_ = null;
                SingleFieldBuilderV3<SupportedLanguagesRequest, SupportedLanguagesRequest.Builder, SupportedLanguagesRequestOrBuilder> singleFieldBuilderV12 = this.supportedLanguagesRequestBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.supportedLanguagesRequestBuilder_ = null;
                }
                this.supportedLanguagesResponse_ = null;
                SingleFieldBuilderV3<SupportedLanguagesResponse, SupportedLanguagesResponse.Builder, SupportedLanguagesResponseOrBuilder> singleFieldBuilderV13 = this.supportedLanguagesResponseBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.supportedLanguagesResponseBuilder_ = null;
                }
                this.setLanguageRequest_ = null;
                SingleFieldBuilderV3<SetLanguageRequest, SetLanguageRequest.Builder, SetLanguageRequestOrBuilder> singleFieldBuilderV14 = this.setLanguageRequestBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.setLanguageRequestBuilder_ = null;
                }
                this.setLanguageResponse_ = null;
                SingleFieldBuilderV3<SetLanguageResponse, SetLanguageResponse.Builder, SetLanguageResponseOrBuilder> singleFieldBuilderV15 = this.setLanguageResponseBuilder_;
                if (singleFieldBuilderV15 != null) {
                    singleFieldBuilderV15.dispose();
                    this.setLanguageResponseBuilder_ = null;
                }
                this.phraseNotification_ = null;
                SingleFieldBuilderV3<PhraseNotification, PhraseNotification.Builder, PhraseNotificationOrBuilder> singleFieldBuilderV16 = this.phraseNotificationBuilder_;
                if (singleFieldBuilderV16 != null) {
                    singleFieldBuilderV16.dispose();
                    this.phraseNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearAudioSettingsRequest() {
                this.bitField0_ &= -5;
                this.audioSettingsRequest_ = null;
                SingleFieldBuilderV3<AudioSettingsRequest, AudioSettingsRequest.Builder, AudioSettingsRequestOrBuilder> singleFieldBuilderV3 = this.audioSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.audioSettingsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAudioSettingsResponse() {
                this.bitField0_ &= -9;
                this.audioSettingsResponse_ = null;
                SingleFieldBuilderV3<AudioSettingsResponse, AudioSettingsResponse.Builder, AudioSettingsResponseOrBuilder> singleFieldBuilderV3 = this.audioSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.audioSettingsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAudioSettingsUpdatedNotification() {
                this.bitField0_ &= -3;
                this.audioSettingsUpdatedNotification_ = null;
                SingleFieldBuilderV3<AudioSettingsUpdatedNotification, AudioSettingsUpdatedNotification.Builder, AudioSettingsUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.audioSettingsUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.audioSettingsUpdatedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHeartRateNotification() {
                this.bitField0_ &= -65;
                this.heartRateNotification_ = null;
                SingleFieldBuilderV3<HeartRateNotification, HeartRateNotification.Builder, HeartRateNotificationOrBuilder> singleFieldBuilderV3 = this.heartRateNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.heartRateNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLapNotification() {
                this.bitField0_ &= -2;
                this.lapNotification_ = null;
                SingleFieldBuilderV3<LapNotification, LapNotification.Builder, LapNotificationOrBuilder> singleFieldBuilderV3 = this.lapNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lapNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPaceNotification() {
                this.bitField0_ &= -33;
                this.paceNotification_ = null;
                SingleFieldBuilderV3<PaceNotification, PaceNotification.Builder, PaceNotificationOrBuilder> singleFieldBuilderV3 = this.paceNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.paceNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPhraseNotification() {
                this.bitField0_ &= -8193;
                this.phraseNotification_ = null;
                SingleFieldBuilderV3<PhraseNotification, PhraseNotification.Builder, PhraseNotificationOrBuilder> singleFieldBuilderV3 = this.phraseNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.phraseNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearPowerNotification() {
                this.bitField0_ &= -129;
                this.powerNotification_ = null;
                SingleFieldBuilderV3<PowerNotification, PowerNotification.Builder, PowerNotificationOrBuilder> singleFieldBuilderV3 = this.powerNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.powerNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSetLanguageRequest() {
                this.bitField0_ &= -2049;
                this.setLanguageRequest_ = null;
                SingleFieldBuilderV3<SetLanguageRequest, SetLanguageRequest.Builder, SetLanguageRequestOrBuilder> singleFieldBuilderV3 = this.setLanguageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.setLanguageRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSetLanguageResponse() {
                this.bitField0_ &= -4097;
                this.setLanguageResponse_ = null;
                SingleFieldBuilderV3<SetLanguageResponse, SetLanguageResponse.Builder, SetLanguageResponseOrBuilder> singleFieldBuilderV3 = this.setLanguageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.setLanguageResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSpeechNotification() {
                this.bitField0_ &= -257;
                this.speechNotification_ = null;
                SingleFieldBuilderV3<SpeechNotification, SpeechNotification.Builder, SpeechNotificationOrBuilder> singleFieldBuilderV3 = this.speechNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.speechNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSpeedNotification() {
                this.bitField0_ &= -17;
                this.speedNotification_ = null;
                SingleFieldBuilderV3<SpeedNotification, SpeedNotification.Builder, SpeedNotificationOrBuilder> singleFieldBuilderV3 = this.speedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.speedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSupportedLanguagesRequest() {
                this.bitField0_ &= -513;
                this.supportedLanguagesRequest_ = null;
                SingleFieldBuilderV3<SupportedLanguagesRequest, SupportedLanguagesRequest.Builder, SupportedLanguagesRequestOrBuilder> singleFieldBuilderV3 = this.supportedLanguagesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.supportedLanguagesRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSupportedLanguagesResponse() {
                this.bitField0_ &= -1025;
                this.supportedLanguagesResponse_ = null;
                SingleFieldBuilderV3<SupportedLanguagesResponse, SupportedLanguagesResponse.Builder, SupportedLanguagesResponseOrBuilder> singleFieldBuilderV3 = this.supportedLanguagesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.supportedLanguagesResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public AudioSettingsRequest getAudioSettingsRequest() {
                SingleFieldBuilderV3<AudioSettingsRequest, AudioSettingsRequest.Builder, AudioSettingsRequestOrBuilder> singleFieldBuilderV3 = this.audioSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AudioSettingsRequest) singleFieldBuilderV3.getMessage();
                }
                AudioSettingsRequest audioSettingsRequest = this.audioSettingsRequest_;
                return audioSettingsRequest == null ? AudioSettingsRequest.getDefaultInstance() : audioSettingsRequest;
            }

            public AudioSettingsRequest.Builder getAudioSettingsRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (AudioSettingsRequest.Builder) getAudioSettingsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public AudioSettingsRequestOrBuilder getAudioSettingsRequestOrBuilder() {
                SingleFieldBuilderV3<AudioSettingsRequest, AudioSettingsRequest.Builder, AudioSettingsRequestOrBuilder> singleFieldBuilderV3 = this.audioSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AudioSettingsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AudioSettingsRequest audioSettingsRequest = this.audioSettingsRequest_;
                return audioSettingsRequest == null ? AudioSettingsRequest.getDefaultInstance() : audioSettingsRequest;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public AudioSettingsResponse getAudioSettingsResponse() {
                SingleFieldBuilderV3<AudioSettingsResponse, AudioSettingsResponse.Builder, AudioSettingsResponseOrBuilder> singleFieldBuilderV3 = this.audioSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AudioSettingsResponse) singleFieldBuilderV3.getMessage();
                }
                AudioSettingsResponse audioSettingsResponse = this.audioSettingsResponse_;
                return audioSettingsResponse == null ? AudioSettingsResponse.getDefaultInstance() : audioSettingsResponse;
            }

            public AudioSettingsResponse.Builder getAudioSettingsResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (AudioSettingsResponse.Builder) getAudioSettingsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public AudioSettingsResponseOrBuilder getAudioSettingsResponseOrBuilder() {
                SingleFieldBuilderV3<AudioSettingsResponse, AudioSettingsResponse.Builder, AudioSettingsResponseOrBuilder> singleFieldBuilderV3 = this.audioSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AudioSettingsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AudioSettingsResponse audioSettingsResponse = this.audioSettingsResponse_;
                return audioSettingsResponse == null ? AudioSettingsResponse.getDefaultInstance() : audioSettingsResponse;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public AudioSettingsUpdatedNotification getAudioSettingsUpdatedNotification() {
                SingleFieldBuilderV3<AudioSettingsUpdatedNotification, AudioSettingsUpdatedNotification.Builder, AudioSettingsUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.audioSettingsUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AudioSettingsUpdatedNotification) singleFieldBuilderV3.getMessage();
                }
                AudioSettingsUpdatedNotification audioSettingsUpdatedNotification = this.audioSettingsUpdatedNotification_;
                return audioSettingsUpdatedNotification == null ? AudioSettingsUpdatedNotification.getDefaultInstance() : audioSettingsUpdatedNotification;
            }

            public AudioSettingsUpdatedNotification.Builder getAudioSettingsUpdatedNotificationBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (AudioSettingsUpdatedNotification.Builder) getAudioSettingsUpdatedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public AudioSettingsUpdatedNotificationOrBuilder getAudioSettingsUpdatedNotificationOrBuilder() {
                SingleFieldBuilderV3<AudioSettingsUpdatedNotification, AudioSettingsUpdatedNotification.Builder, AudioSettingsUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.audioSettingsUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AudioSettingsUpdatedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AudioSettingsUpdatedNotification audioSettingsUpdatedNotification = this.audioSettingsUpdatedNotification_;
                return audioSettingsUpdatedNotification == null ? AudioSettingsUpdatedNotification.getDefaultInstance() : audioSettingsUpdatedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_AudioPromptsService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public HeartRateNotification getHeartRateNotification() {
                SingleFieldBuilderV3<HeartRateNotification, HeartRateNotification.Builder, HeartRateNotificationOrBuilder> singleFieldBuilderV3 = this.heartRateNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HeartRateNotification) singleFieldBuilderV3.getMessage();
                }
                HeartRateNotification heartRateNotification = this.heartRateNotification_;
                return heartRateNotification == null ? HeartRateNotification.getDefaultInstance() : heartRateNotification;
            }

            public HeartRateNotification.Builder getHeartRateNotificationBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (HeartRateNotification.Builder) getHeartRateNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public HeartRateNotificationOrBuilder getHeartRateNotificationOrBuilder() {
                SingleFieldBuilderV3<HeartRateNotification, HeartRateNotification.Builder, HeartRateNotificationOrBuilder> singleFieldBuilderV3 = this.heartRateNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HeartRateNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HeartRateNotification heartRateNotification = this.heartRateNotification_;
                return heartRateNotification == null ? HeartRateNotification.getDefaultInstance() : heartRateNotification;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public LapNotification getLapNotification() {
                SingleFieldBuilderV3<LapNotification, LapNotification.Builder, LapNotificationOrBuilder> singleFieldBuilderV3 = this.lapNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LapNotification) singleFieldBuilderV3.getMessage();
                }
                LapNotification lapNotification = this.lapNotification_;
                return lapNotification == null ? LapNotification.getDefaultInstance() : lapNotification;
            }

            public LapNotification.Builder getLapNotificationBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (LapNotification.Builder) getLapNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public LapNotificationOrBuilder getLapNotificationOrBuilder() {
                SingleFieldBuilderV3<LapNotification, LapNotification.Builder, LapNotificationOrBuilder> singleFieldBuilderV3 = this.lapNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LapNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LapNotification lapNotification = this.lapNotification_;
                return lapNotification == null ? LapNotification.getDefaultInstance() : lapNotification;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public PaceNotification getPaceNotification() {
                SingleFieldBuilderV3<PaceNotification, PaceNotification.Builder, PaceNotificationOrBuilder> singleFieldBuilderV3 = this.paceNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PaceNotification) singleFieldBuilderV3.getMessage();
                }
                PaceNotification paceNotification = this.paceNotification_;
                return paceNotification == null ? PaceNotification.getDefaultInstance() : paceNotification;
            }

            public PaceNotification.Builder getPaceNotificationBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (PaceNotification.Builder) getPaceNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public PaceNotificationOrBuilder getPaceNotificationOrBuilder() {
                SingleFieldBuilderV3<PaceNotification, PaceNotification.Builder, PaceNotificationOrBuilder> singleFieldBuilderV3 = this.paceNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PaceNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PaceNotification paceNotification = this.paceNotification_;
                return paceNotification == null ? PaceNotification.getDefaultInstance() : paceNotification;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public PhraseNotification getPhraseNotification() {
                SingleFieldBuilderV3<PhraseNotification, PhraseNotification.Builder, PhraseNotificationOrBuilder> singleFieldBuilderV3 = this.phraseNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PhraseNotification) singleFieldBuilderV3.getMessage();
                }
                PhraseNotification phraseNotification = this.phraseNotification_;
                return phraseNotification == null ? PhraseNotification.getDefaultInstance() : phraseNotification;
            }

            public PhraseNotification.Builder getPhraseNotificationBuilder() {
                this.bitField0_ |= 8192;
                onChanged();
                return (PhraseNotification.Builder) getPhraseNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public PhraseNotificationOrBuilder getPhraseNotificationOrBuilder() {
                SingleFieldBuilderV3<PhraseNotification, PhraseNotification.Builder, PhraseNotificationOrBuilder> singleFieldBuilderV3 = this.phraseNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PhraseNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PhraseNotification phraseNotification = this.phraseNotification_;
                return phraseNotification == null ? PhraseNotification.getDefaultInstance() : phraseNotification;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public PowerNotification getPowerNotification() {
                SingleFieldBuilderV3<PowerNotification, PowerNotification.Builder, PowerNotificationOrBuilder> singleFieldBuilderV3 = this.powerNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerNotification) singleFieldBuilderV3.getMessage();
                }
                PowerNotification powerNotification = this.powerNotification_;
                return powerNotification == null ? PowerNotification.getDefaultInstance() : powerNotification;
            }

            public PowerNotification.Builder getPowerNotificationBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (PowerNotification.Builder) getPowerNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public PowerNotificationOrBuilder getPowerNotificationOrBuilder() {
                SingleFieldBuilderV3<PowerNotification, PowerNotification.Builder, PowerNotificationOrBuilder> singleFieldBuilderV3 = this.powerNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PowerNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                PowerNotification powerNotification = this.powerNotification_;
                return powerNotification == null ? PowerNotification.getDefaultInstance() : powerNotification;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public SetLanguageRequest getSetLanguageRequest() {
                SingleFieldBuilderV3<SetLanguageRequest, SetLanguageRequest.Builder, SetLanguageRequestOrBuilder> singleFieldBuilderV3 = this.setLanguageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetLanguageRequest) singleFieldBuilderV3.getMessage();
                }
                SetLanguageRequest setLanguageRequest = this.setLanguageRequest_;
                return setLanguageRequest == null ? SetLanguageRequest.getDefaultInstance() : setLanguageRequest;
            }

            public SetLanguageRequest.Builder getSetLanguageRequestBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (SetLanguageRequest.Builder) getSetLanguageRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public SetLanguageRequestOrBuilder getSetLanguageRequestOrBuilder() {
                SingleFieldBuilderV3<SetLanguageRequest, SetLanguageRequest.Builder, SetLanguageRequestOrBuilder> singleFieldBuilderV3 = this.setLanguageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetLanguageRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SetLanguageRequest setLanguageRequest = this.setLanguageRequest_;
                return setLanguageRequest == null ? SetLanguageRequest.getDefaultInstance() : setLanguageRequest;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public SetLanguageResponse getSetLanguageResponse() {
                SingleFieldBuilderV3<SetLanguageResponse, SetLanguageResponse.Builder, SetLanguageResponseOrBuilder> singleFieldBuilderV3 = this.setLanguageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetLanguageResponse) singleFieldBuilderV3.getMessage();
                }
                SetLanguageResponse setLanguageResponse = this.setLanguageResponse_;
                return setLanguageResponse == null ? SetLanguageResponse.getDefaultInstance() : setLanguageResponse;
            }

            public SetLanguageResponse.Builder getSetLanguageResponseBuilder() {
                this.bitField0_ |= 4096;
                onChanged();
                return (SetLanguageResponse.Builder) getSetLanguageResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public SetLanguageResponseOrBuilder getSetLanguageResponseOrBuilder() {
                SingleFieldBuilderV3<SetLanguageResponse, SetLanguageResponse.Builder, SetLanguageResponseOrBuilder> singleFieldBuilderV3 = this.setLanguageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SetLanguageResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SetLanguageResponse setLanguageResponse = this.setLanguageResponse_;
                return setLanguageResponse == null ? SetLanguageResponse.getDefaultInstance() : setLanguageResponse;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public SpeechNotification getSpeechNotification() {
                SingleFieldBuilderV3<SpeechNotification, SpeechNotification.Builder, SpeechNotificationOrBuilder> singleFieldBuilderV3 = this.speechNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SpeechNotification) singleFieldBuilderV3.getMessage();
                }
                SpeechNotification speechNotification = this.speechNotification_;
                return speechNotification == null ? SpeechNotification.getDefaultInstance() : speechNotification;
            }

            public SpeechNotification.Builder getSpeechNotificationBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (SpeechNotification.Builder) getSpeechNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public SpeechNotificationOrBuilder getSpeechNotificationOrBuilder() {
                SingleFieldBuilderV3<SpeechNotification, SpeechNotification.Builder, SpeechNotificationOrBuilder> singleFieldBuilderV3 = this.speechNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SpeechNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SpeechNotification speechNotification = this.speechNotification_;
                return speechNotification == null ? SpeechNotification.getDefaultInstance() : speechNotification;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public SpeedNotification getSpeedNotification() {
                SingleFieldBuilderV3<SpeedNotification, SpeedNotification.Builder, SpeedNotificationOrBuilder> singleFieldBuilderV3 = this.speedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SpeedNotification) singleFieldBuilderV3.getMessage();
                }
                SpeedNotification speedNotification = this.speedNotification_;
                return speedNotification == null ? SpeedNotification.getDefaultInstance() : speedNotification;
            }

            public SpeedNotification.Builder getSpeedNotificationBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (SpeedNotification.Builder) getSpeedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public SpeedNotificationOrBuilder getSpeedNotificationOrBuilder() {
                SingleFieldBuilderV3<SpeedNotification, SpeedNotification.Builder, SpeedNotificationOrBuilder> singleFieldBuilderV3 = this.speedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SpeedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SpeedNotification speedNotification = this.speedNotification_;
                return speedNotification == null ? SpeedNotification.getDefaultInstance() : speedNotification;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public SupportedLanguagesRequest getSupportedLanguagesRequest() {
                SingleFieldBuilderV3<SupportedLanguagesRequest, SupportedLanguagesRequest.Builder, SupportedLanguagesRequestOrBuilder> singleFieldBuilderV3 = this.supportedLanguagesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SupportedLanguagesRequest) singleFieldBuilderV3.getMessage();
                }
                SupportedLanguagesRequest supportedLanguagesRequest = this.supportedLanguagesRequest_;
                return supportedLanguagesRequest == null ? SupportedLanguagesRequest.getDefaultInstance() : supportedLanguagesRequest;
            }

            public SupportedLanguagesRequest.Builder getSupportedLanguagesRequestBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (SupportedLanguagesRequest.Builder) getSupportedLanguagesRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public SupportedLanguagesRequestOrBuilder getSupportedLanguagesRequestOrBuilder() {
                SingleFieldBuilderV3<SupportedLanguagesRequest, SupportedLanguagesRequest.Builder, SupportedLanguagesRequestOrBuilder> singleFieldBuilderV3 = this.supportedLanguagesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SupportedLanguagesRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SupportedLanguagesRequest supportedLanguagesRequest = this.supportedLanguagesRequest_;
                return supportedLanguagesRequest == null ? SupportedLanguagesRequest.getDefaultInstance() : supportedLanguagesRequest;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public SupportedLanguagesResponse getSupportedLanguagesResponse() {
                SingleFieldBuilderV3<SupportedLanguagesResponse, SupportedLanguagesResponse.Builder, SupportedLanguagesResponseOrBuilder> singleFieldBuilderV3 = this.supportedLanguagesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SupportedLanguagesResponse) singleFieldBuilderV3.getMessage();
                }
                SupportedLanguagesResponse supportedLanguagesResponse = this.supportedLanguagesResponse_;
                return supportedLanguagesResponse == null ? SupportedLanguagesResponse.getDefaultInstance() : supportedLanguagesResponse;
            }

            public SupportedLanguagesResponse.Builder getSupportedLanguagesResponseBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (SupportedLanguagesResponse.Builder) getSupportedLanguagesResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public SupportedLanguagesResponseOrBuilder getSupportedLanguagesResponseOrBuilder() {
                SingleFieldBuilderV3<SupportedLanguagesResponse, SupportedLanguagesResponse.Builder, SupportedLanguagesResponseOrBuilder> singleFieldBuilderV3 = this.supportedLanguagesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SupportedLanguagesResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SupportedLanguagesResponse supportedLanguagesResponse = this.supportedLanguagesResponse_;
                return supportedLanguagesResponse == null ? SupportedLanguagesResponse.getDefaultInstance() : supportedLanguagesResponse;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public boolean hasAudioSettingsRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public boolean hasAudioSettingsResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public boolean hasAudioSettingsUpdatedNotification() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public boolean hasHeartRateNotification() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public boolean hasLapNotification() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public boolean hasPaceNotification() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public boolean hasPhraseNotification() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public boolean hasPowerNotification() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public boolean hasSetLanguageRequest() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public boolean hasSetLanguageResponse() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public boolean hasSpeechNotification() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public boolean hasSpeedNotification() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public boolean hasSupportedLanguagesRequest() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.AudioPromptsServiceOrBuilder
            public boolean hasSupportedLanguagesResponse() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_AudioPromptsService_fieldAccessorTable.ensureFieldAccessorsInitialized(AudioPromptsService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasLapNotification() && !getLapNotification().isInitialized()) {
                    return false;
                }
                if (hasAudioSettingsResponse() && !getAudioSettingsResponse().isInitialized()) {
                    return false;
                }
                if (hasSpeedNotification() && !getSpeedNotification().isInitialized()) {
                    return false;
                }
                if (hasPaceNotification() && !getPaceNotification().isInitialized()) {
                    return false;
                }
                if (hasHeartRateNotification() && !getHeartRateNotification().isInitialized()) {
                    return false;
                }
                if (hasPowerNotification() && !getPowerNotification().isInitialized()) {
                    return false;
                }
                if (hasSupportedLanguagesResponse() && !getSupportedLanguagesResponse().isInitialized()) {
                    return false;
                }
                if (hasSetLanguageRequest() && !getSetLanguageRequest().isInitialized()) {
                    return false;
                }
                if (!hasSetLanguageResponse() || getSetLanguageResponse().isInitialized()) {
                    return !hasPhraseNotification() || getPhraseNotification().isInitialized();
                }
                return false;
            }

            public Builder mergeAudioSettingsRequest(AudioSettingsRequest audioSettingsRequest) {
                AudioSettingsRequest audioSettingsRequest2;
                SingleFieldBuilderV3<AudioSettingsRequest, AudioSettingsRequest.Builder, AudioSettingsRequestOrBuilder> singleFieldBuilderV3 = this.audioSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(audioSettingsRequest);
                } else if ((this.bitField0_ & 4) == 0 || (audioSettingsRequest2 = this.audioSettingsRequest_) == null || audioSettingsRequest2 == AudioSettingsRequest.getDefaultInstance()) {
                    this.audioSettingsRequest_ = audioSettingsRequest;
                } else {
                    getAudioSettingsRequestBuilder().mergeFrom(audioSettingsRequest);
                }
                if (this.audioSettingsRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeAudioSettingsResponse(AudioSettingsResponse audioSettingsResponse) {
                AudioSettingsResponse audioSettingsResponse2;
                SingleFieldBuilderV3<AudioSettingsResponse, AudioSettingsResponse.Builder, AudioSettingsResponseOrBuilder> singleFieldBuilderV3 = this.audioSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(audioSettingsResponse);
                } else if ((this.bitField0_ & 8) == 0 || (audioSettingsResponse2 = this.audioSettingsResponse_) == null || audioSettingsResponse2 == AudioSettingsResponse.getDefaultInstance()) {
                    this.audioSettingsResponse_ = audioSettingsResponse;
                } else {
                    getAudioSettingsResponseBuilder().mergeFrom(audioSettingsResponse);
                }
                if (this.audioSettingsResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeAudioSettingsUpdatedNotification(AudioSettingsUpdatedNotification audioSettingsUpdatedNotification) {
                AudioSettingsUpdatedNotification audioSettingsUpdatedNotification2;
                SingleFieldBuilderV3<AudioSettingsUpdatedNotification, AudioSettingsUpdatedNotification.Builder, AudioSettingsUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.audioSettingsUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(audioSettingsUpdatedNotification);
                } else if ((this.bitField0_ & 2) == 0 || (audioSettingsUpdatedNotification2 = this.audioSettingsUpdatedNotification_) == null || audioSettingsUpdatedNotification2 == AudioSettingsUpdatedNotification.getDefaultInstance()) {
                    this.audioSettingsUpdatedNotification_ = audioSettingsUpdatedNotification;
                } else {
                    getAudioSettingsUpdatedNotificationBuilder().mergeFrom(audioSettingsUpdatedNotification);
                }
                if (this.audioSettingsUpdatedNotification_ != null) {
                    this.bitField0_ |= 2;
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
                            switch (tag) {
                                case 0:
                                    break;
                                case 10:
                                    codedInputStream.readMessage(getLapNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getAudioSettingsUpdatedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getAudioSettingsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getAudioSettingsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getSpeedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getPaceNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getHeartRateNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getPowerNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getSpeechNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getSupportedLanguagesRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getSupportedLanguagesResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 98:
                                    codedInputStream.readMessage(getSetLanguageRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 106:
                                    codedInputStream.readMessage(getSetLanguageResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 114:
                                    codedInputStream.readMessage(getPhraseNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeHeartRateNotification(HeartRateNotification heartRateNotification) {
                HeartRateNotification heartRateNotification2;
                SingleFieldBuilderV3<HeartRateNotification, HeartRateNotification.Builder, HeartRateNotificationOrBuilder> singleFieldBuilderV3 = this.heartRateNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(heartRateNotification);
                } else if ((this.bitField0_ & 64) == 0 || (heartRateNotification2 = this.heartRateNotification_) == null || heartRateNotification2 == HeartRateNotification.getDefaultInstance()) {
                    this.heartRateNotification_ = heartRateNotification;
                } else {
                    getHeartRateNotificationBuilder().mergeFrom(heartRateNotification);
                }
                if (this.heartRateNotification_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLapNotification(LapNotification lapNotification) {
                LapNotification lapNotification2;
                SingleFieldBuilderV3<LapNotification, LapNotification.Builder, LapNotificationOrBuilder> singleFieldBuilderV3 = this.lapNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(lapNotification);
                } else if ((this.bitField0_ & 1) == 0 || (lapNotification2 = this.lapNotification_) == null || lapNotification2 == LapNotification.getDefaultInstance()) {
                    this.lapNotification_ = lapNotification;
                } else {
                    getLapNotificationBuilder().mergeFrom(lapNotification);
                }
                if (this.lapNotification_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergePaceNotification(PaceNotification paceNotification) {
                PaceNotification paceNotification2;
                SingleFieldBuilderV3<PaceNotification, PaceNotification.Builder, PaceNotificationOrBuilder> singleFieldBuilderV3 = this.paceNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(paceNotification);
                } else if ((this.bitField0_ & 32) == 0 || (paceNotification2 = this.paceNotification_) == null || paceNotification2 == PaceNotification.getDefaultInstance()) {
                    this.paceNotification_ = paceNotification;
                } else {
                    getPaceNotificationBuilder().mergeFrom(paceNotification);
                }
                if (this.paceNotification_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergePhraseNotification(PhraseNotification phraseNotification) {
                PhraseNotification phraseNotification2;
                SingleFieldBuilderV3<PhraseNotification, PhraseNotification.Builder, PhraseNotificationOrBuilder> singleFieldBuilderV3 = this.phraseNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(phraseNotification);
                } else if ((this.bitField0_ & 8192) == 0 || (phraseNotification2 = this.phraseNotification_) == null || phraseNotification2 == PhraseNotification.getDefaultInstance()) {
                    this.phraseNotification_ = phraseNotification;
                } else {
                    getPhraseNotificationBuilder().mergeFrom(phraseNotification);
                }
                if (this.phraseNotification_ != null) {
                    this.bitField0_ |= 8192;
                    onChanged();
                }
                return this;
            }

            public Builder mergePowerNotification(PowerNotification powerNotification) {
                PowerNotification powerNotification2;
                SingleFieldBuilderV3<PowerNotification, PowerNotification.Builder, PowerNotificationOrBuilder> singleFieldBuilderV3 = this.powerNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(powerNotification);
                } else if ((this.bitField0_ & 128) == 0 || (powerNotification2 = this.powerNotification_) == null || powerNotification2 == PowerNotification.getDefaultInstance()) {
                    this.powerNotification_ = powerNotification;
                } else {
                    getPowerNotificationBuilder().mergeFrom(powerNotification);
                }
                if (this.powerNotification_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSetLanguageRequest(SetLanguageRequest setLanguageRequest) {
                SetLanguageRequest setLanguageRequest2;
                SingleFieldBuilderV3<SetLanguageRequest, SetLanguageRequest.Builder, SetLanguageRequestOrBuilder> singleFieldBuilderV3 = this.setLanguageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(setLanguageRequest);
                } else if ((this.bitField0_ & 2048) == 0 || (setLanguageRequest2 = this.setLanguageRequest_) == null || setLanguageRequest2 == SetLanguageRequest.getDefaultInstance()) {
                    this.setLanguageRequest_ = setLanguageRequest;
                } else {
                    getSetLanguageRequestBuilder().mergeFrom(setLanguageRequest);
                }
                if (this.setLanguageRequest_ != null) {
                    this.bitField0_ |= 2048;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSetLanguageResponse(SetLanguageResponse setLanguageResponse) {
                SetLanguageResponse setLanguageResponse2;
                SingleFieldBuilderV3<SetLanguageResponse, SetLanguageResponse.Builder, SetLanguageResponseOrBuilder> singleFieldBuilderV3 = this.setLanguageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(setLanguageResponse);
                } else if ((this.bitField0_ & 4096) == 0 || (setLanguageResponse2 = this.setLanguageResponse_) == null || setLanguageResponse2 == SetLanguageResponse.getDefaultInstance()) {
                    this.setLanguageResponse_ = setLanguageResponse;
                } else {
                    getSetLanguageResponseBuilder().mergeFrom(setLanguageResponse);
                }
                if (this.setLanguageResponse_ != null) {
                    this.bitField0_ |= 4096;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSpeechNotification(SpeechNotification speechNotification) {
                SpeechNotification speechNotification2;
                SingleFieldBuilderV3<SpeechNotification, SpeechNotification.Builder, SpeechNotificationOrBuilder> singleFieldBuilderV3 = this.speechNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(speechNotification);
                } else if ((this.bitField0_ & 256) == 0 || (speechNotification2 = this.speechNotification_) == null || speechNotification2 == SpeechNotification.getDefaultInstance()) {
                    this.speechNotification_ = speechNotification;
                } else {
                    getSpeechNotificationBuilder().mergeFrom(speechNotification);
                }
                if (this.speechNotification_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSpeedNotification(SpeedNotification speedNotification) {
                SpeedNotification speedNotification2;
                SingleFieldBuilderV3<SpeedNotification, SpeedNotification.Builder, SpeedNotificationOrBuilder> singleFieldBuilderV3 = this.speedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(speedNotification);
                } else if ((this.bitField0_ & 16) == 0 || (speedNotification2 = this.speedNotification_) == null || speedNotification2 == SpeedNotification.getDefaultInstance()) {
                    this.speedNotification_ = speedNotification;
                } else {
                    getSpeedNotificationBuilder().mergeFrom(speedNotification);
                }
                if (this.speedNotification_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSupportedLanguagesRequest(SupportedLanguagesRequest supportedLanguagesRequest) {
                SupportedLanguagesRequest supportedLanguagesRequest2;
                SingleFieldBuilderV3<SupportedLanguagesRequest, SupportedLanguagesRequest.Builder, SupportedLanguagesRequestOrBuilder> singleFieldBuilderV3 = this.supportedLanguagesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(supportedLanguagesRequest);
                } else if ((this.bitField0_ & 512) == 0 || (supportedLanguagesRequest2 = this.supportedLanguagesRequest_) == null || supportedLanguagesRequest2 == SupportedLanguagesRequest.getDefaultInstance()) {
                    this.supportedLanguagesRequest_ = supportedLanguagesRequest;
                } else {
                    getSupportedLanguagesRequestBuilder().mergeFrom(supportedLanguagesRequest);
                }
                if (this.supportedLanguagesRequest_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSupportedLanguagesResponse(SupportedLanguagesResponse supportedLanguagesResponse) {
                SupportedLanguagesResponse supportedLanguagesResponse2;
                SingleFieldBuilderV3<SupportedLanguagesResponse, SupportedLanguagesResponse.Builder, SupportedLanguagesResponseOrBuilder> singleFieldBuilderV3 = this.supportedLanguagesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(supportedLanguagesResponse);
                } else if ((this.bitField0_ & 1024) == 0 || (supportedLanguagesResponse2 = this.supportedLanguagesResponse_) == null || supportedLanguagesResponse2 == SupportedLanguagesResponse.getDefaultInstance()) {
                    this.supportedLanguagesResponse_ = supportedLanguagesResponse;
                } else {
                    getSupportedLanguagesResponseBuilder().mergeFrom(supportedLanguagesResponse);
                }
                if (this.supportedLanguagesResponse_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAudioSettingsRequest(AudioSettingsRequest.Builder builder) {
                SingleFieldBuilderV3<AudioSettingsRequest, AudioSettingsRequest.Builder, AudioSettingsRequestOrBuilder> singleFieldBuilderV3 = this.audioSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.audioSettingsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setAudioSettingsResponse(AudioSettingsResponse.Builder builder) {
                SingleFieldBuilderV3<AudioSettingsResponse, AudioSettingsResponse.Builder, AudioSettingsResponseOrBuilder> singleFieldBuilderV3 = this.audioSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.audioSettingsResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setAudioSettingsUpdatedNotification(AudioSettingsUpdatedNotification.Builder builder) {
                SingleFieldBuilderV3<AudioSettingsUpdatedNotification, AudioSettingsUpdatedNotification.Builder, AudioSettingsUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.audioSettingsUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.audioSettingsUpdatedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setHeartRateNotification(HeartRateNotification.Builder builder) {
                SingleFieldBuilderV3<HeartRateNotification, HeartRateNotification.Builder, HeartRateNotificationOrBuilder> singleFieldBuilderV3 = this.heartRateNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.heartRateNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setLapNotification(LapNotification.Builder builder) {
                SingleFieldBuilderV3<LapNotification, LapNotification.Builder, LapNotificationOrBuilder> singleFieldBuilderV3 = this.lapNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.lapNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPaceNotification(PaceNotification.Builder builder) {
                SingleFieldBuilderV3<PaceNotification, PaceNotification.Builder, PaceNotificationOrBuilder> singleFieldBuilderV3 = this.paceNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.paceNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setPhraseNotification(PhraseNotification.Builder builder) {
                SingleFieldBuilderV3<PhraseNotification, PhraseNotification.Builder, PhraseNotificationOrBuilder> singleFieldBuilderV3 = this.phraseNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.phraseNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setPowerNotification(PowerNotification.Builder builder) {
                SingleFieldBuilderV3<PowerNotification, PowerNotification.Builder, PowerNotificationOrBuilder> singleFieldBuilderV3 = this.powerNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.powerNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSetLanguageRequest(SetLanguageRequest.Builder builder) {
                SingleFieldBuilderV3<SetLanguageRequest, SetLanguageRequest.Builder, SetLanguageRequestOrBuilder> singleFieldBuilderV3 = this.setLanguageRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.setLanguageRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setSetLanguageResponse(SetLanguageResponse.Builder builder) {
                SingleFieldBuilderV3<SetLanguageResponse, SetLanguageResponse.Builder, SetLanguageResponseOrBuilder> singleFieldBuilderV3 = this.setLanguageResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.setLanguageResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setSpeechNotification(SpeechNotification.Builder builder) {
                SingleFieldBuilderV3<SpeechNotification, SpeechNotification.Builder, SpeechNotificationOrBuilder> singleFieldBuilderV3 = this.speechNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.speechNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setSpeedNotification(SpeedNotification.Builder builder) {
                SingleFieldBuilderV3<SpeedNotification, SpeedNotification.Builder, SpeedNotificationOrBuilder> singleFieldBuilderV3 = this.speedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.speedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSupportedLanguagesRequest(SupportedLanguagesRequest.Builder builder) {
                SingleFieldBuilderV3<SupportedLanguagesRequest, SupportedLanguagesRequest.Builder, SupportedLanguagesRequestOrBuilder> singleFieldBuilderV3 = this.supportedLanguagesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.supportedLanguagesRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setSupportedLanguagesResponse(SupportedLanguagesResponse.Builder builder) {
                SingleFieldBuilderV3<SupportedLanguagesResponse, SupportedLanguagesResponse.Builder, SupportedLanguagesResponseOrBuilder> singleFieldBuilderV3 = this.supportedLanguagesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.supportedLanguagesResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AudioPromptsService getDefaultInstanceForType() {
                return AudioPromptsService.getDefaultInstance();
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

            public Builder setAudioSettingsRequest(AudioSettingsRequest audioSettingsRequest) {
                SingleFieldBuilderV3<AudioSettingsRequest, AudioSettingsRequest.Builder, AudioSettingsRequestOrBuilder> singleFieldBuilderV3 = this.audioSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    audioSettingsRequest.getClass();
                    this.audioSettingsRequest_ = audioSettingsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(audioSettingsRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setAudioSettingsResponse(AudioSettingsResponse audioSettingsResponse) {
                SingleFieldBuilderV3<AudioSettingsResponse, AudioSettingsResponse.Builder, AudioSettingsResponseOrBuilder> singleFieldBuilderV3 = this.audioSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    audioSettingsResponse.getClass();
                    this.audioSettingsResponse_ = audioSettingsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(audioSettingsResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setAudioSettingsUpdatedNotification(AudioSettingsUpdatedNotification audioSettingsUpdatedNotification) {
                SingleFieldBuilderV3<AudioSettingsUpdatedNotification, AudioSettingsUpdatedNotification.Builder, AudioSettingsUpdatedNotificationOrBuilder> singleFieldBuilderV3 = this.audioSettingsUpdatedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    audioSettingsUpdatedNotification.getClass();
                    this.audioSettingsUpdatedNotification_ = audioSettingsUpdatedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(audioSettingsUpdatedNotification);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setHeartRateNotification(HeartRateNotification heartRateNotification) {
                SingleFieldBuilderV3<HeartRateNotification, HeartRateNotification.Builder, HeartRateNotificationOrBuilder> singleFieldBuilderV3 = this.heartRateNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    heartRateNotification.getClass();
                    this.heartRateNotification_ = heartRateNotification;
                } else {
                    singleFieldBuilderV3.setMessage(heartRateNotification);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setLapNotification(LapNotification lapNotification) {
                SingleFieldBuilderV3<LapNotification, LapNotification.Builder, LapNotificationOrBuilder> singleFieldBuilderV3 = this.lapNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    lapNotification.getClass();
                    this.lapNotification_ = lapNotification;
                } else {
                    singleFieldBuilderV3.setMessage(lapNotification);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPaceNotification(PaceNotification paceNotification) {
                SingleFieldBuilderV3<PaceNotification, PaceNotification.Builder, PaceNotificationOrBuilder> singleFieldBuilderV3 = this.paceNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    paceNotification.getClass();
                    this.paceNotification_ = paceNotification;
                } else {
                    singleFieldBuilderV3.setMessage(paceNotification);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setPhraseNotification(PhraseNotification phraseNotification) {
                SingleFieldBuilderV3<PhraseNotification, PhraseNotification.Builder, PhraseNotificationOrBuilder> singleFieldBuilderV3 = this.phraseNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    phraseNotification.getClass();
                    this.phraseNotification_ = phraseNotification;
                } else {
                    singleFieldBuilderV3.setMessage(phraseNotification);
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setPowerNotification(PowerNotification powerNotification) {
                SingleFieldBuilderV3<PowerNotification, PowerNotification.Builder, PowerNotificationOrBuilder> singleFieldBuilderV3 = this.powerNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    powerNotification.getClass();
                    this.powerNotification_ = powerNotification;
                } else {
                    singleFieldBuilderV3.setMessage(powerNotification);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setSetLanguageRequest(SetLanguageRequest setLanguageRequest) {
                SingleFieldBuilderV3<SetLanguageRequest, SetLanguageRequest.Builder, SetLanguageRequestOrBuilder> singleFieldBuilderV3 = this.setLanguageRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    setLanguageRequest.getClass();
                    this.setLanguageRequest_ = setLanguageRequest;
                } else {
                    singleFieldBuilderV3.setMessage(setLanguageRequest);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setSetLanguageResponse(SetLanguageResponse setLanguageResponse) {
                SingleFieldBuilderV3<SetLanguageResponse, SetLanguageResponse.Builder, SetLanguageResponseOrBuilder> singleFieldBuilderV3 = this.setLanguageResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    setLanguageResponse.getClass();
                    this.setLanguageResponse_ = setLanguageResponse;
                } else {
                    singleFieldBuilderV3.setMessage(setLanguageResponse);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setSpeechNotification(SpeechNotification speechNotification) {
                SingleFieldBuilderV3<SpeechNotification, SpeechNotification.Builder, SpeechNotificationOrBuilder> singleFieldBuilderV3 = this.speechNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    speechNotification.getClass();
                    this.speechNotification_ = speechNotification;
                } else {
                    singleFieldBuilderV3.setMessage(speechNotification);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setSpeedNotification(SpeedNotification speedNotification) {
                SingleFieldBuilderV3<SpeedNotification, SpeedNotification.Builder, SpeedNotificationOrBuilder> singleFieldBuilderV3 = this.speedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    speedNotification.getClass();
                    this.speedNotification_ = speedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(speedNotification);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSupportedLanguagesRequest(SupportedLanguagesRequest supportedLanguagesRequest) {
                SingleFieldBuilderV3<SupportedLanguagesRequest, SupportedLanguagesRequest.Builder, SupportedLanguagesRequestOrBuilder> singleFieldBuilderV3 = this.supportedLanguagesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    supportedLanguagesRequest.getClass();
                    this.supportedLanguagesRequest_ = supportedLanguagesRequest;
                } else {
                    singleFieldBuilderV3.setMessage(supportedLanguagesRequest);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setSupportedLanguagesResponse(SupportedLanguagesResponse supportedLanguagesResponse) {
                SingleFieldBuilderV3<SupportedLanguagesResponse, SupportedLanguagesResponse.Builder, SupportedLanguagesResponseOrBuilder> singleFieldBuilderV3 = this.supportedLanguagesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    supportedLanguagesResponse.getClass();
                    this.supportedLanguagesResponse_ = supportedLanguagesResponse;
                } else {
                    singleFieldBuilderV3.setMessage(supportedLanguagesResponse);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AudioPromptsService) {
                    return mergeFrom((AudioPromptsService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AudioPromptsService audioPromptsService) {
                if (audioPromptsService == AudioPromptsService.getDefaultInstance()) {
                    return this;
                }
                if (audioPromptsService.hasLapNotification()) {
                    mergeLapNotification(audioPromptsService.getLapNotification());
                }
                if (audioPromptsService.hasAudioSettingsUpdatedNotification()) {
                    mergeAudioSettingsUpdatedNotification(audioPromptsService.getAudioSettingsUpdatedNotification());
                }
                if (audioPromptsService.hasAudioSettingsRequest()) {
                    mergeAudioSettingsRequest(audioPromptsService.getAudioSettingsRequest());
                }
                if (audioPromptsService.hasAudioSettingsResponse()) {
                    mergeAudioSettingsResponse(audioPromptsService.getAudioSettingsResponse());
                }
                if (audioPromptsService.hasSpeedNotification()) {
                    mergeSpeedNotification(audioPromptsService.getSpeedNotification());
                }
                if (audioPromptsService.hasPaceNotification()) {
                    mergePaceNotification(audioPromptsService.getPaceNotification());
                }
                if (audioPromptsService.hasHeartRateNotification()) {
                    mergeHeartRateNotification(audioPromptsService.getHeartRateNotification());
                }
                if (audioPromptsService.hasPowerNotification()) {
                    mergePowerNotification(audioPromptsService.getPowerNotification());
                }
                if (audioPromptsService.hasSpeechNotification()) {
                    mergeSpeechNotification(audioPromptsService.getSpeechNotification());
                }
                if (audioPromptsService.hasSupportedLanguagesRequest()) {
                    mergeSupportedLanguagesRequest(audioPromptsService.getSupportedLanguagesRequest());
                }
                if (audioPromptsService.hasSupportedLanguagesResponse()) {
                    mergeSupportedLanguagesResponse(audioPromptsService.getSupportedLanguagesResponse());
                }
                if (audioPromptsService.hasSetLanguageRequest()) {
                    mergeSetLanguageRequest(audioPromptsService.getSetLanguageRequest());
                }
                if (audioPromptsService.hasSetLanguageResponse()) {
                    mergeSetLanguageResponse(audioPromptsService.getSetLanguageResponse());
                }
                if (audioPromptsService.hasPhraseNotification()) {
                    mergePhraseNotification(audioPromptsService.getPhraseNotification());
                }
                mergeUnknownFields(audioPromptsService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AudioPromptsService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ AudioPromptsService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private AudioPromptsService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AudioPromptsService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudioPromptsService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AudioPromptsService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AudioPromptsService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AudioPromptsService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AudioPromptsService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AudioPromptsService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AudioPromptsService parseFrom(InputStream inputStream) {
            return (AudioPromptsService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AudioPromptsService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudioPromptsService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AudioPromptsService parseFrom(CodedInputStream codedInputStream) {
            return (AudioPromptsService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AudioPromptsService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AudioPromptsService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GravelPhrase extends GeneratedMessageV3 implements GravelPhraseOrBuilder {
        public static final int CONTEXT_JSON_FIELD_NUMBER = 2;
        private static final GravelPhrase DEFAULT_INSTANCE = new GravelPhrase();

        @Deprecated
        public static final Parser<GravelPhrase> PARSER = new AbstractParser<GravelPhrase>() { // from class: com.garmin.proto.generated.GDIAudioPromptsProto.GravelPhrase.1
            @Override // com.google.protobuf.Parser
            public GravelPhrase parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GravelPhrase.newBuilder();
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
        public static final int PHRASE_TEMPLATE_FIELD_NUMBER = 1;
        public static final int SPEECH_RATE_MULTIPLIER_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object contextJson_;
        private byte memoizedIsInitialized;
        private volatile Object phraseTemplate_;
        private float speechRateMultiplier_;

        private GravelPhrase() {
            this.phraseTemplate_ = "";
            this.contextJson_ = "";
            this.speechRateMultiplier_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
            this.phraseTemplate_ = "";
            this.contextJson_ = "";
        }

        public static GravelPhrase getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_GravelPhrase_descriptor;
        }

        public static Builder newBuilder(GravelPhrase gravelPhrase) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(gravelPhrase);
        }

        public static GravelPhrase parseDelimitedFrom(InputStream inputStream) {
            return (GravelPhrase) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GravelPhrase parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GravelPhrase> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GravelPhrase)) {
                return super.equals(obj);
            }
            GravelPhrase gravelPhrase = (GravelPhrase) obj;
            if (hasPhraseTemplate() != gravelPhrase.hasPhraseTemplate()) {
                return false;
            }
            if ((hasPhraseTemplate() && !getPhraseTemplate().equals(gravelPhrase.getPhraseTemplate())) || hasContextJson() != gravelPhrase.hasContextJson()) {
                return false;
            }
            if ((!hasContextJson() || getContextJson().equals(gravelPhrase.getContextJson())) && hasSpeechRateMultiplier() == gravelPhrase.hasSpeechRateMultiplier()) {
                return (!hasSpeechRateMultiplier() || Float.floatToIntBits(getSpeechRateMultiplier()) == Float.floatToIntBits(gravelPhrase.getSpeechRateMultiplier())) && getUnknownFields().equals(gravelPhrase.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.GravelPhraseOrBuilder
        public String getContextJson() {
            Object obj = this.contextJson_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.contextJson_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.GravelPhraseOrBuilder
        public ByteString getContextJsonBytes() {
            Object obj = this.contextJson_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.contextJson_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GravelPhrase> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.GravelPhraseOrBuilder
        public String getPhraseTemplate() {
            Object obj = this.phraseTemplate_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.phraseTemplate_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.GravelPhraseOrBuilder
        public ByteString getPhraseTemplateBytes() {
            Object obj = this.phraseTemplate_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.phraseTemplate_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.phraseTemplate_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.contextJson_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeFloatSize(3, this.speechRateMultiplier_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.GravelPhraseOrBuilder
        public float getSpeechRateMultiplier() {
            return this.speechRateMultiplier_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.GravelPhraseOrBuilder
        public boolean hasContextJson() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.GravelPhraseOrBuilder
        public boolean hasPhraseTemplate() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.GravelPhraseOrBuilder
        public boolean hasSpeechRateMultiplier() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPhraseTemplate()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPhraseTemplate().hashCode();
            }
            if (hasContextJson()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getContextJson().hashCode();
            }
            if (hasSpeechRateMultiplier()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Float.floatToIntBits(getSpeechRateMultiplier());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_GravelPhrase_fieldAccessorTable.ensureFieldAccessorsInitialized(GravelPhrase.class, Builder.class);
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
            if (hasPhraseTemplate()) {
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
            return new GravelPhrase();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.phraseTemplate_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.contextJson_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeFloat(3, this.speechRateMultiplier_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GravelPhraseOrBuilder {
            private int bitField0_;
            private Object contextJson_;
            private Object phraseTemplate_;
            private float speechRateMultiplier_;

            private Builder() {
                this.phraseTemplate_ = "";
                this.contextJson_ = "";
            }

            private void buildPartial0(GravelPhrase gravelPhrase) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    gravelPhrase.phraseTemplate_ = this.phraseTemplate_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    gravelPhrase.contextJson_ = this.contextJson_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    gravelPhrase.speechRateMultiplier_ = this.speechRateMultiplier_;
                    i14 |= 4;
                }
                gravelPhrase.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_GravelPhrase_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GravelPhrase build() {
                GravelPhrase gravelPhraseBuildPartial = buildPartial();
                if (gravelPhraseBuildPartial.isInitialized()) {
                    return gravelPhraseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) gravelPhraseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GravelPhrase buildPartial() {
                GravelPhrase gravelPhrase = new GravelPhrase(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(gravelPhrase);
                }
                onBuilt();
                return gravelPhrase;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.phraseTemplate_ = "";
                this.contextJson_ = "";
                this.speechRateMultiplier_ = 0.0f;
                return this;
            }

            public Builder clearContextJson() {
                this.contextJson_ = GravelPhrase.getDefaultInstance().getContextJson();
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

            public Builder clearPhraseTemplate() {
                this.phraseTemplate_ = GravelPhrase.getDefaultInstance().getPhraseTemplate();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearSpeechRateMultiplier() {
                this.bitField0_ &= -5;
                this.speechRateMultiplier_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.GravelPhraseOrBuilder
            public String getContextJson() {
                Object obj = this.contextJson_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.contextJson_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.GravelPhraseOrBuilder
            public ByteString getContextJsonBytes() {
                Object obj = this.contextJson_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.contextJson_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_GravelPhrase_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.GravelPhraseOrBuilder
            public String getPhraseTemplate() {
                Object obj = this.phraseTemplate_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.phraseTemplate_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.GravelPhraseOrBuilder
            public ByteString getPhraseTemplateBytes() {
                Object obj = this.phraseTemplate_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.phraseTemplate_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.GravelPhraseOrBuilder
            public float getSpeechRateMultiplier() {
                return this.speechRateMultiplier_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.GravelPhraseOrBuilder
            public boolean hasContextJson() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.GravelPhraseOrBuilder
            public boolean hasPhraseTemplate() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.GravelPhraseOrBuilder
            public boolean hasSpeechRateMultiplier() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_GravelPhrase_fieldAccessorTable.ensureFieldAccessorsInitialized(GravelPhrase.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasPhraseTemplate();
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
                                    this.phraseTemplate_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.contextJson_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 29) {
                                    this.speechRateMultiplier_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 4;
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

            public Builder setContextJson(String str) {
                str.getClass();
                this.contextJson_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setContextJsonBytes(ByteString byteString) {
                byteString.getClass();
                this.contextJson_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setPhraseTemplate(String str) {
                str.getClass();
                this.phraseTemplate_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPhraseTemplateBytes(ByteString byteString) {
                byteString.getClass();
                this.phraseTemplate_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSpeechRateMultiplier(float f14) {
                this.speechRateMultiplier_ = f14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GravelPhrase getDefaultInstanceForType() {
                return GravelPhrase.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.phraseTemplate_ = "";
                this.contextJson_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GravelPhrase) {
                    return mergeFrom((GravelPhrase) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GravelPhrase gravelPhrase) {
                if (gravelPhrase == GravelPhrase.getDefaultInstance()) {
                    return this;
                }
                if (gravelPhrase.hasPhraseTemplate()) {
                    this.phraseTemplate_ = gravelPhrase.phraseTemplate_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (gravelPhrase.hasContextJson()) {
                    this.contextJson_ = gravelPhrase.contextJson_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (gravelPhrase.hasSpeechRateMultiplier()) {
                    setSpeechRateMultiplier(gravelPhrase.getSpeechRateMultiplier());
                }
                mergeUnknownFields(gravelPhrase.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GravelPhrase getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GravelPhrase parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GravelPhrase) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GravelPhrase parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GravelPhrase parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GravelPhrase parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GravelPhrase parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GravelPhrase parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GravelPhrase parseFrom(InputStream inputStream) {
            return (GravelPhrase) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GravelPhrase parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GravelPhrase) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GravelPhrase parseFrom(CodedInputStream codedInputStream) {
            return (GravelPhrase) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private GravelPhrase(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.phraseTemplate_ = "";
            this.contextJson_ = "";
            this.speechRateMultiplier_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GravelPhrase parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GravelPhrase) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ GravelPhrase(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class HeartRateNotification extends GeneratedMessageV3 implements HeartRateNotificationOrBuilder {
        public static final int AUDIO_PROMPT_LANGUAGE_FIELD_NUMBER = 5;
        public static final int BPM_FIELD_NUMBER = 1;
        private static final HeartRateNotification DEFAULT_INSTANCE = new HeartRateNotification();

        @Deprecated
        public static final Parser<HeartRateNotification> PARSER = new AbstractParser<HeartRateNotification>() { // from class: com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotification.1
            @Override // com.google.protobuf.Parser
            public HeartRateNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HeartRateNotification.newBuilder();
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
        public static final int PERCENTAGE_HRR_FIELD_NUMBER = 4;
        public static final int PERCENTAGE_MAX_FIELD_NUMBER = 3;
        public static final int ZONE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private Language audioPromptLanguage_;
        private int bitField0_;
        private int bpm_;
        private byte memoizedIsInitialized;
        private int percentageHrr_;
        private int percentageMax_;
        private float zone_;

        private HeartRateNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.bpm_ = 0;
            this.zone_ = 0.0f;
            this.percentageMax_ = 0;
            this.percentageHrr_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HeartRateNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_HeartRateNotification_descriptor;
        }

        public static Builder newBuilder(HeartRateNotification heartRateNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(heartRateNotification);
        }

        public static HeartRateNotification parseDelimitedFrom(InputStream inputStream) {
            return (HeartRateNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HeartRateNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HeartRateNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HeartRateNotification)) {
                return super.equals(obj);
            }
            HeartRateNotification heartRateNotification = (HeartRateNotification) obj;
            if (hasBpm() != heartRateNotification.hasBpm()) {
                return false;
            }
            if ((hasBpm() && getBpm() != heartRateNotification.getBpm()) || hasZone() != heartRateNotification.hasZone()) {
                return false;
            }
            if ((hasZone() && Float.floatToIntBits(getZone()) != Float.floatToIntBits(heartRateNotification.getZone())) || hasPercentageMax() != heartRateNotification.hasPercentageMax()) {
                return false;
            }
            if ((hasPercentageMax() && getPercentageMax() != heartRateNotification.getPercentageMax()) || hasPercentageHrr() != heartRateNotification.hasPercentageHrr()) {
                return false;
            }
            if ((!hasPercentageHrr() || getPercentageHrr() == heartRateNotification.getPercentageHrr()) && hasAudioPromptLanguage() == heartRateNotification.hasAudioPromptLanguage()) {
                return (!hasAudioPromptLanguage() || getAudioPromptLanguage().equals(heartRateNotification.getAudioPromptLanguage())) && getUnknownFields().equals(heartRateNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
        public Language getAudioPromptLanguage() {
            Language language = this.audioPromptLanguage_;
            return language == null ? Language.getDefaultInstance() : language;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
        public LanguageOrBuilder getAudioPromptLanguageOrBuilder() {
            Language language = this.audioPromptLanguage_;
            return language == null ? Language.getDefaultInstance() : language;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
        public int getBpm() {
            return this.bpm_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HeartRateNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
        public int getPercentageHrr() {
            return this.percentageHrr_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
        public int getPercentageMax() {
            return this.percentageMax_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.bpm_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(2, this.zone_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.percentageMax_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.percentageHrr_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(5, getAudioPromptLanguage());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
        public float getZone() {
            return this.zone_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
        public boolean hasAudioPromptLanguage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
        public boolean hasBpm() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
        public boolean hasPercentageHrr() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
        public boolean hasPercentageMax() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
        public boolean hasZone() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasBpm()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getBpm();
            }
            if (hasZone()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getZone());
            }
            if (hasPercentageMax()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getPercentageMax();
            }
            if (hasPercentageHrr()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getPercentageHrr();
            }
            if (hasAudioPromptLanguage()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getAudioPromptLanguage().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_HeartRateNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(HeartRateNotification.class, Builder.class);
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
            if (!hasAudioPromptLanguage() || getAudioPromptLanguage().isInitialized()) {
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
            return new HeartRateNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.bpm_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.zone_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.percentageMax_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.percentageHrr_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getAudioPromptLanguage());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HeartRateNotificationOrBuilder {
            private SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> audioPromptLanguageBuilder_;
            private Language audioPromptLanguage_;
            private int bitField0_;
            private int bpm_;
            private int percentageHrr_;
            private int percentageMax_;
            private float zone_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(HeartRateNotification heartRateNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    heartRateNotification.bpm_ = this.bpm_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    heartRateNotification.zone_ = this.zone_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    heartRateNotification.percentageMax_ = this.percentageMax_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    heartRateNotification.percentageHrr_ = this.percentageHrr_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                    heartRateNotification.audioPromptLanguage_ = singleFieldBuilderV3 == null ? this.audioPromptLanguage_ : (Language) singleFieldBuilderV3.build();
                    i14 |= 16;
                }
                heartRateNotification.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> getAudioPromptLanguageFieldBuilder() {
                if (this.audioPromptLanguageBuilder_ == null) {
                    this.audioPromptLanguageBuilder_ = new SingleFieldBuilderV3<>(getAudioPromptLanguage(), getParentForChildren(), isClean());
                    this.audioPromptLanguage_ = null;
                }
                return this.audioPromptLanguageBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_HeartRateNotification_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getAudioPromptLanguageFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HeartRateNotification build() {
                HeartRateNotification heartRateNotificationBuildPartial = buildPartial();
                if (heartRateNotificationBuildPartial.isInitialized()) {
                    return heartRateNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) heartRateNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HeartRateNotification buildPartial() {
                HeartRateNotification heartRateNotification = new HeartRateNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(heartRateNotification);
                }
                onBuilt();
                return heartRateNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.bpm_ = 0;
                this.zone_ = 0.0f;
                this.percentageMax_ = 0;
                this.percentageHrr_ = 0;
                this.audioPromptLanguage_ = null;
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.audioPromptLanguageBuilder_ = null;
                }
                return this;
            }

            public Builder clearAudioPromptLanguage() {
                this.bitField0_ &= -17;
                this.audioPromptLanguage_ = null;
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.audioPromptLanguageBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearBpm() {
                this.bitField0_ &= -2;
                this.bpm_ = 0;
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

            public Builder clearPercentageHrr() {
                this.bitField0_ &= -9;
                this.percentageHrr_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPercentageMax() {
                this.bitField0_ &= -5;
                this.percentageMax_ = 0;
                onChanged();
                return this;
            }

            public Builder clearZone() {
                this.bitField0_ &= -3;
                this.zone_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
            public Language getAudioPromptLanguage() {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Language) singleFieldBuilderV3.getMessage();
                }
                Language language = this.audioPromptLanguage_;
                return language == null ? Language.getDefaultInstance() : language;
            }

            public Language.Builder getAudioPromptLanguageBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (Language.Builder) getAudioPromptLanguageFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
            public LanguageOrBuilder getAudioPromptLanguageOrBuilder() {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LanguageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Language language = this.audioPromptLanguage_;
                return language == null ? Language.getDefaultInstance() : language;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
            public int getBpm() {
                return this.bpm_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_HeartRateNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
            public int getPercentageHrr() {
                return this.percentageHrr_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
            public int getPercentageMax() {
                return this.percentageMax_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
            public float getZone() {
                return this.zone_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
            public boolean hasAudioPromptLanguage() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
            public boolean hasBpm() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
            public boolean hasPercentageHrr() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
            public boolean hasPercentageMax() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.HeartRateNotificationOrBuilder
            public boolean hasZone() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_HeartRateNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(HeartRateNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasAudioPromptLanguage() || getAudioPromptLanguage().isInitialized();
            }

            public Builder mergeAudioPromptLanguage(Language language) {
                Language language2;
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(language);
                } else if ((this.bitField0_ & 16) == 0 || (language2 = this.audioPromptLanguage_) == null || language2 == Language.getDefaultInstance()) {
                    this.audioPromptLanguage_ = language;
                } else {
                    getAudioPromptLanguageBuilder().mergeFrom(language);
                }
                if (this.audioPromptLanguage_ != null) {
                    this.bitField0_ |= 16;
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
                                if (tag == 8) {
                                    this.bpm_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.zone_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.percentageMax_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.percentageHrr_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getAudioPromptLanguageFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
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

            public Builder setAudioPromptLanguage(Language.Builder builder) {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.audioPromptLanguage_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setBpm(int i14) {
                this.bpm_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setPercentageHrr(int i14) {
                this.percentageHrr_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setPercentageMax(int i14) {
                this.percentageMax_ = i14;
                this.bitField0_ |= 4;
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

            public Builder setZone(float f14) {
                this.zone_ = f14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public HeartRateNotification getDefaultInstanceForType() {
                return HeartRateNotification.getDefaultInstance();
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

            public Builder setAudioPromptLanguage(Language language) {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    language.getClass();
                    this.audioPromptLanguage_ = language;
                } else {
                    singleFieldBuilderV3.setMessage(language);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HeartRateNotification) {
                    return mergeFrom((HeartRateNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HeartRateNotification heartRateNotification) {
                if (heartRateNotification == HeartRateNotification.getDefaultInstance()) {
                    return this;
                }
                if (heartRateNotification.hasBpm()) {
                    setBpm(heartRateNotification.getBpm());
                }
                if (heartRateNotification.hasZone()) {
                    setZone(heartRateNotification.getZone());
                }
                if (heartRateNotification.hasPercentageMax()) {
                    setPercentageMax(heartRateNotification.getPercentageMax());
                }
                if (heartRateNotification.hasPercentageHrr()) {
                    setPercentageHrr(heartRateNotification.getPercentageHrr());
                }
                if (heartRateNotification.hasAudioPromptLanguage()) {
                    mergeAudioPromptLanguage(heartRateNotification.getAudioPromptLanguage());
                }
                mergeUnknownFields(heartRateNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HeartRateNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static HeartRateNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartRateNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HeartRateNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HeartRateNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HeartRateNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static HeartRateNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static HeartRateNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HeartRateNotification parseFrom(InputStream inputStream) {
            return (HeartRateNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static HeartRateNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartRateNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ HeartRateNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private HeartRateNotification() {
            this.bpm_ = 0;
            this.zone_ = 0.0f;
            this.percentageMax_ = 0;
            this.percentageHrr_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HeartRateNotification parseFrom(CodedInputStream codedInputStream) {
            return (HeartRateNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HeartRateNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HeartRateNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Language extends GeneratedMessageV3 implements LanguageOrBuilder {
        public static final int COUNTRY_CODE_FIELD_NUMBER = 2;
        public static final int LANGUAGE_CODE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object countryCode_;
        private volatile Object languageCode_;
        private byte memoizedIsInitialized;
        private static final Language DEFAULT_INSTANCE = new Language();

        @Deprecated
        public static final Parser<Language> PARSER = new AbstractParser<Language>() { // from class: com.garmin.proto.generated.GDIAudioPromptsProto.Language.1
            @Override // com.google.protobuf.Parser
            public Language parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Language.newBuilder();
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

        private Language() {
            this.languageCode_ = "";
            this.countryCode_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.languageCode_ = "";
            this.countryCode_ = "";
        }

        public static Language getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_Language_descriptor;
        }

        public static Builder newBuilder(Language language) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(language);
        }

        public static Language parseDelimitedFrom(InputStream inputStream) {
            return (Language) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Language parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Language> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Language)) {
                return super.equals(obj);
            }
            Language language = (Language) obj;
            if (hasLanguageCode() != language.hasLanguageCode()) {
                return false;
            }
            if ((!hasLanguageCode() || getLanguageCode().equals(language.getLanguageCode())) && hasCountryCode() == language.hasCountryCode()) {
                return (!hasCountryCode() || getCountryCode().equals(language.getCountryCode())) && getUnknownFields().equals(language.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LanguageOrBuilder
        public String getCountryCode() {
            Object obj = this.countryCode_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.countryCode_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LanguageOrBuilder
        public ByteString getCountryCodeBytes() {
            Object obj = this.countryCode_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.countryCode_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LanguageOrBuilder
        public String getLanguageCode() {
            Object obj = this.languageCode_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.languageCode_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LanguageOrBuilder
        public ByteString getLanguageCodeBytes() {
            Object obj = this.languageCode_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.languageCode_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Language> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.languageCode_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.countryCode_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LanguageOrBuilder
        public boolean hasCountryCode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LanguageOrBuilder
        public boolean hasLanguageCode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasLanguageCode()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getLanguageCode().hashCode();
            }
            if (hasCountryCode()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCountryCode().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_Language_fieldAccessorTable.ensureFieldAccessorsInitialized(Language.class, Builder.class);
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
            if (hasLanguageCode()) {
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
            return new Language();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.languageCode_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.countryCode_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LanguageOrBuilder {
            private int bitField0_;
            private Object countryCode_;
            private Object languageCode_;

            private Builder() {
                this.languageCode_ = "";
                this.countryCode_ = "";
            }

            private void buildPartial0(Language language) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    language.languageCode_ = this.languageCode_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    language.countryCode_ = this.countryCode_;
                    i14 |= 2;
                }
                language.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_Language_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Language build() {
                Language languageBuildPartial = buildPartial();
                if (languageBuildPartial.isInitialized()) {
                    return languageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) languageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Language buildPartial() {
                Language language = new Language(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(language);
                }
                onBuilt();
                return language;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.languageCode_ = "";
                this.countryCode_ = "";
                return this;
            }

            public Builder clearCountryCode() {
                this.countryCode_ = Language.getDefaultInstance().getCountryCode();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLanguageCode() {
                this.languageCode_ = Language.getDefaultInstance().getLanguageCode();
                this.bitField0_ &= -2;
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

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LanguageOrBuilder
            public String getCountryCode() {
                Object obj = this.countryCode_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.countryCode_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LanguageOrBuilder
            public ByteString getCountryCodeBytes() {
                Object obj = this.countryCode_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.countryCode_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_Language_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LanguageOrBuilder
            public String getLanguageCode() {
                Object obj = this.languageCode_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.languageCode_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LanguageOrBuilder
            public ByteString getLanguageCodeBytes() {
                Object obj = this.languageCode_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.languageCode_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LanguageOrBuilder
            public boolean hasCountryCode() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LanguageOrBuilder
            public boolean hasLanguageCode() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_Language_fieldAccessorTable.ensureFieldAccessorsInitialized(Language.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasLanguageCode();
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
                                    this.languageCode_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.countryCode_ = codedInputStream.readBytes();
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

            public Builder setCountryCode(String str) {
                str.getClass();
                this.countryCode_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCountryCodeBytes(ByteString byteString) {
                byteString.getClass();
                this.countryCode_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLanguageCode(String str) {
                str.getClass();
                this.languageCode_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLanguageCodeBytes(ByteString byteString) {
                byteString.getClass();
                this.languageCode_ = byteString;
                this.bitField0_ |= 1;
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
            public Language getDefaultInstanceForType() {
                return Language.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.languageCode_ = "";
                this.countryCode_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Language) {
                    return mergeFrom((Language) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Language language) {
                if (language == Language.getDefaultInstance()) {
                    return this;
                }
                if (language.hasLanguageCode()) {
                    this.languageCode_ = language.languageCode_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (language.hasCountryCode()) {
                    this.countryCode_ = language.countryCode_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(language.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Language getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Language parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Language) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Language parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Language parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Language parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Language parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Language parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Language parseFrom(InputStream inputStream) {
            return (Language) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Language parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Language) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private Language(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.languageCode_ = "";
            this.countryCode_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Language parseFrom(CodedInputStream codedInputStream) {
            return (Language) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Language parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Language) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ Language(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class LapNotification extends GeneratedMessageV3 implements LapNotificationOrBuilder {
        public static final int AUDIO_PROMPT_LANGUAGE_FIELD_NUMBER = 4;
        public static final int LAP_NUMBER_FIELD_NUMBER = 1;
        public static final int LAP_SPEED_FIELD_NUMBER = 3;
        public static final int LAP_TIME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private Language audioPromptLanguage_;
        private int bitField0_;
        private int lapNumber_;
        private float lapSpeed_;
        private long lapTime_;
        private byte memoizedIsInitialized;
        private static final LapNotification DEFAULT_INSTANCE = new LapNotification();

        @Deprecated
        public static final Parser<LapNotification> PARSER = new AbstractParser<LapNotification>() { // from class: com.garmin.proto.generated.GDIAudioPromptsProto.LapNotification.1
            @Override // com.google.protobuf.Parser
            public LapNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LapNotification.newBuilder();
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

        private LapNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.lapNumber_ = 0;
            this.lapTime_ = 0L;
            this.lapSpeed_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LapNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_LapNotification_descriptor;
        }

        public static Builder newBuilder(LapNotification lapNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lapNotification);
        }

        public static LapNotification parseDelimitedFrom(InputStream inputStream) {
            return (LapNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LapNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LapNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LapNotification)) {
                return super.equals(obj);
            }
            LapNotification lapNotification = (LapNotification) obj;
            if (hasLapNumber() != lapNotification.hasLapNumber()) {
                return false;
            }
            if ((hasLapNumber() && getLapNumber() != lapNotification.getLapNumber()) || hasLapTime() != lapNotification.hasLapTime()) {
                return false;
            }
            if ((hasLapTime() && getLapTime() != lapNotification.getLapTime()) || hasLapSpeed() != lapNotification.hasLapSpeed()) {
                return false;
            }
            if ((!hasLapSpeed() || Float.floatToIntBits(getLapSpeed()) == Float.floatToIntBits(lapNotification.getLapSpeed())) && hasAudioPromptLanguage() == lapNotification.hasAudioPromptLanguage()) {
                return (!hasAudioPromptLanguage() || getAudioPromptLanguage().equals(lapNotification.getAudioPromptLanguage())) && getUnknownFields().equals(lapNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LapNotificationOrBuilder
        public Language getAudioPromptLanguage() {
            Language language = this.audioPromptLanguage_;
            return language == null ? Language.getDefaultInstance() : language;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LapNotificationOrBuilder
        public LanguageOrBuilder getAudioPromptLanguageOrBuilder() {
            Language language = this.audioPromptLanguage_;
            return language == null ? Language.getDefaultInstance() : language;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LapNotificationOrBuilder
        public int getLapNumber() {
            return this.lapNumber_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LapNotificationOrBuilder
        public float getLapSpeed() {
            return this.lapSpeed_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LapNotificationOrBuilder
        public long getLapTime() {
            return this.lapTime_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LapNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.lapNumber_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt64Size(2, this.lapTime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(3, this.lapSpeed_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(4, getAudioPromptLanguage());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LapNotificationOrBuilder
        public boolean hasAudioPromptLanguage() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LapNotificationOrBuilder
        public boolean hasLapNumber() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LapNotificationOrBuilder
        public boolean hasLapSpeed() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LapNotificationOrBuilder
        public boolean hasLapTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasLapNumber()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getLapNumber();
            }
            if (hasLapTime()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashLong(getLapTime());
            }
            if (hasLapSpeed()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Float.floatToIntBits(getLapSpeed());
            }
            if (hasAudioPromptLanguage()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getAudioPromptLanguage().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_LapNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(LapNotification.class, Builder.class);
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
            if (!hasLapNumber()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLapTime()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAudioPromptLanguage() || getAudioPromptLanguage().isInitialized()) {
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
            return new LapNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.lapNumber_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt64(2, this.lapTime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeFloat(3, this.lapSpeed_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getAudioPromptLanguage());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LapNotificationOrBuilder {
            private SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> audioPromptLanguageBuilder_;
            private Language audioPromptLanguage_;
            private int bitField0_;
            private int lapNumber_;
            private float lapSpeed_;
            private long lapTime_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(LapNotification lapNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    lapNotification.lapNumber_ = this.lapNumber_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    lapNotification.lapTime_ = this.lapTime_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    lapNotification.lapSpeed_ = this.lapSpeed_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                    lapNotification.audioPromptLanguage_ = singleFieldBuilderV3 == null ? this.audioPromptLanguage_ : (Language) singleFieldBuilderV3.build();
                    i14 |= 8;
                }
                lapNotification.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> getAudioPromptLanguageFieldBuilder() {
                if (this.audioPromptLanguageBuilder_ == null) {
                    this.audioPromptLanguageBuilder_ = new SingleFieldBuilderV3<>(getAudioPromptLanguage(), getParentForChildren(), isClean());
                    this.audioPromptLanguage_ = null;
                }
                return this.audioPromptLanguageBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_LapNotification_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getAudioPromptLanguageFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LapNotification build() {
                LapNotification lapNotificationBuildPartial = buildPartial();
                if (lapNotificationBuildPartial.isInitialized()) {
                    return lapNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) lapNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LapNotification buildPartial() {
                LapNotification lapNotification = new LapNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(lapNotification);
                }
                onBuilt();
                return lapNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.lapNumber_ = 0;
                this.lapTime_ = 0L;
                this.lapSpeed_ = 0.0f;
                this.audioPromptLanguage_ = null;
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.audioPromptLanguageBuilder_ = null;
                }
                return this;
            }

            public Builder clearAudioPromptLanguage() {
                this.bitField0_ &= -9;
                this.audioPromptLanguage_ = null;
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.audioPromptLanguageBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLapNumber() {
                this.bitField0_ &= -2;
                this.lapNumber_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLapSpeed() {
                this.bitField0_ &= -5;
                this.lapSpeed_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearLapTime() {
                this.bitField0_ &= -3;
                this.lapTime_ = 0L;
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

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LapNotificationOrBuilder
            public Language getAudioPromptLanguage() {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Language) singleFieldBuilderV3.getMessage();
                }
                Language language = this.audioPromptLanguage_;
                return language == null ? Language.getDefaultInstance() : language;
            }

            public Language.Builder getAudioPromptLanguageBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (Language.Builder) getAudioPromptLanguageFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LapNotificationOrBuilder
            public LanguageOrBuilder getAudioPromptLanguageOrBuilder() {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LanguageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Language language = this.audioPromptLanguage_;
                return language == null ? Language.getDefaultInstance() : language;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_LapNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LapNotificationOrBuilder
            public int getLapNumber() {
                return this.lapNumber_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LapNotificationOrBuilder
            public float getLapSpeed() {
                return this.lapSpeed_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LapNotificationOrBuilder
            public long getLapTime() {
                return this.lapTime_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LapNotificationOrBuilder
            public boolean hasAudioPromptLanguage() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LapNotificationOrBuilder
            public boolean hasLapNumber() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LapNotificationOrBuilder
            public boolean hasLapSpeed() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.LapNotificationOrBuilder
            public boolean hasLapTime() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_LapNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(LapNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasLapNumber() && hasLapTime()) {
                    return !hasAudioPromptLanguage() || getAudioPromptLanguage().isInitialized();
                }
                return false;
            }

            public Builder mergeAudioPromptLanguage(Language language) {
                Language language2;
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(language);
                } else if ((this.bitField0_ & 8) == 0 || (language2 = this.audioPromptLanguage_) == null || language2 == Language.getDefaultInstance()) {
                    this.audioPromptLanguage_ = language;
                } else {
                    getAudioPromptLanguageBuilder().mergeFrom(language);
                }
                if (this.audioPromptLanguage_ != null) {
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
                                if (tag == 8) {
                                    this.lapNumber_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.lapTime_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 2;
                                } else if (tag == 29) {
                                    this.lapSpeed_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getAudioPromptLanguageFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setAudioPromptLanguage(Language.Builder builder) {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.audioPromptLanguage_ = builder.build();
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

            public Builder setLapNumber(int i14) {
                this.lapNumber_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLapSpeed(float f14) {
                this.lapSpeed_ = f14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLapTime(long j8) {
                this.lapTime_ = j8;
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
            public LapNotification getDefaultInstanceForType() {
                return LapNotification.getDefaultInstance();
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

            public Builder setAudioPromptLanguage(Language language) {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    language.getClass();
                    this.audioPromptLanguage_ = language;
                } else {
                    singleFieldBuilderV3.setMessage(language);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LapNotification) {
                    return mergeFrom((LapNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LapNotification lapNotification) {
                if (lapNotification == LapNotification.getDefaultInstance()) {
                    return this;
                }
                if (lapNotification.hasLapNumber()) {
                    setLapNumber(lapNotification.getLapNumber());
                }
                if (lapNotification.hasLapTime()) {
                    setLapTime(lapNotification.getLapTime());
                }
                if (lapNotification.hasLapSpeed()) {
                    setLapSpeed(lapNotification.getLapSpeed());
                }
                if (lapNotification.hasAudioPromptLanguage()) {
                    mergeAudioPromptLanguage(lapNotification.getAudioPromptLanguage());
                }
                mergeUnknownFields(lapNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LapNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LapNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LapNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LapNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LapNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LapNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LapNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LapNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LapNotification parseFrom(InputStream inputStream) {
            return (LapNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LapNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LapNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ LapNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private LapNotification() {
            this.lapNumber_ = 0;
            this.lapTime_ = 0L;
            this.lapSpeed_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LapNotification parseFrom(CodedInputStream codedInputStream) {
            return (LapNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LapNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LapNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PaceNotification extends GeneratedMessageV3 implements PaceNotificationOrBuilder {
        public static final int AUDIO_PROMPT_LANGUAGE_FIELD_NUMBER = 4;
        public static final int AVERAGE_PACE_FIELD_NUMBER = 1;
        public static final int CURRENT_PACE_FIELD_NUMBER = 2;
        public static final int LAP_PACE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private Language audioPromptLanguage_;
        private long averagePace_;
        private int bitField0_;
        private long currentPace_;
        private long lapPace_;
        private byte memoizedIsInitialized;
        private static final PaceNotification DEFAULT_INSTANCE = new PaceNotification();

        @Deprecated
        public static final Parser<PaceNotification> PARSER = new AbstractParser<PaceNotification>() { // from class: com.garmin.proto.generated.GDIAudioPromptsProto.PaceNotification.1
            @Override // com.google.protobuf.Parser
            public PaceNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PaceNotification.newBuilder();
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

        private PaceNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.averagePace_ = 0L;
            this.currentPace_ = 0L;
            this.lapPace_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PaceNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_PaceNotification_descriptor;
        }

        public static Builder newBuilder(PaceNotification paceNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(paceNotification);
        }

        public static PaceNotification parseDelimitedFrom(InputStream inputStream) {
            return (PaceNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PaceNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PaceNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PaceNotification)) {
                return super.equals(obj);
            }
            PaceNotification paceNotification = (PaceNotification) obj;
            if (hasAveragePace() != paceNotification.hasAveragePace()) {
                return false;
            }
            if ((hasAveragePace() && getAveragePace() != paceNotification.getAveragePace()) || hasCurrentPace() != paceNotification.hasCurrentPace()) {
                return false;
            }
            if ((hasCurrentPace() && getCurrentPace() != paceNotification.getCurrentPace()) || hasLapPace() != paceNotification.hasLapPace()) {
                return false;
            }
            if ((!hasLapPace() || getLapPace() == paceNotification.getLapPace()) && hasAudioPromptLanguage() == paceNotification.hasAudioPromptLanguage()) {
                return (!hasAudioPromptLanguage() || getAudioPromptLanguage().equals(paceNotification.getAudioPromptLanguage())) && getUnknownFields().equals(paceNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PaceNotificationOrBuilder
        public Language getAudioPromptLanguage() {
            Language language = this.audioPromptLanguage_;
            return language == null ? Language.getDefaultInstance() : language;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PaceNotificationOrBuilder
        public LanguageOrBuilder getAudioPromptLanguageOrBuilder() {
            Language language = this.audioPromptLanguage_;
            return language == null ? Language.getDefaultInstance() : language;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PaceNotificationOrBuilder
        public long getAveragePace() {
            return this.averagePace_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PaceNotificationOrBuilder
        public long getCurrentPace() {
            return this.currentPace_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PaceNotificationOrBuilder
        public long getLapPace() {
            return this.lapPace_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PaceNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt64Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt64Size(1, this.averagePace_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt64Size(2, this.currentPace_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt64Size(3, this.lapPace_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeMessageSize(4, getAudioPromptLanguage());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PaceNotificationOrBuilder
        public boolean hasAudioPromptLanguage() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PaceNotificationOrBuilder
        public boolean hasAveragePace() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PaceNotificationOrBuilder
        public boolean hasCurrentPace() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PaceNotificationOrBuilder
        public boolean hasLapPace() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAveragePace()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashLong(getAveragePace());
            }
            if (hasCurrentPace()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashLong(getCurrentPace());
            }
            if (hasLapPace()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashLong(getLapPace());
            }
            if (hasAudioPromptLanguage()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getAudioPromptLanguage().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_PaceNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(PaceNotification.class, Builder.class);
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
            if (!hasAudioPromptLanguage() || getAudioPromptLanguage().isInitialized()) {
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
            return new PaceNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt64(1, this.averagePace_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt64(2, this.currentPace_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt64(3, this.lapPace_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getAudioPromptLanguage());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PaceNotificationOrBuilder {
            private SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> audioPromptLanguageBuilder_;
            private Language audioPromptLanguage_;
            private long averagePace_;
            private int bitField0_;
            private long currentPace_;
            private long lapPace_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(PaceNotification paceNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    paceNotification.averagePace_ = this.averagePace_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    paceNotification.currentPace_ = this.currentPace_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    paceNotification.lapPace_ = this.lapPace_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                    paceNotification.audioPromptLanguage_ = singleFieldBuilderV3 == null ? this.audioPromptLanguage_ : (Language) singleFieldBuilderV3.build();
                    i14 |= 8;
                }
                paceNotification.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> getAudioPromptLanguageFieldBuilder() {
                if (this.audioPromptLanguageBuilder_ == null) {
                    this.audioPromptLanguageBuilder_ = new SingleFieldBuilderV3<>(getAudioPromptLanguage(), getParentForChildren(), isClean());
                    this.audioPromptLanguage_ = null;
                }
                return this.audioPromptLanguageBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_PaceNotification_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getAudioPromptLanguageFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PaceNotification build() {
                PaceNotification paceNotificationBuildPartial = buildPartial();
                if (paceNotificationBuildPartial.isInitialized()) {
                    return paceNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) paceNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PaceNotification buildPartial() {
                PaceNotification paceNotification = new PaceNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(paceNotification);
                }
                onBuilt();
                return paceNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.averagePace_ = 0L;
                this.currentPace_ = 0L;
                this.lapPace_ = 0L;
                this.audioPromptLanguage_ = null;
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.audioPromptLanguageBuilder_ = null;
                }
                return this;
            }

            public Builder clearAudioPromptLanguage() {
                this.bitField0_ &= -9;
                this.audioPromptLanguage_ = null;
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.audioPromptLanguageBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAveragePace() {
                this.bitField0_ &= -2;
                this.averagePace_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearCurrentPace() {
                this.bitField0_ &= -3;
                this.currentPace_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLapPace() {
                this.bitField0_ &= -5;
                this.lapPace_ = 0L;
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

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PaceNotificationOrBuilder
            public Language getAudioPromptLanguage() {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Language) singleFieldBuilderV3.getMessage();
                }
                Language language = this.audioPromptLanguage_;
                return language == null ? Language.getDefaultInstance() : language;
            }

            public Language.Builder getAudioPromptLanguageBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (Language.Builder) getAudioPromptLanguageFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PaceNotificationOrBuilder
            public LanguageOrBuilder getAudioPromptLanguageOrBuilder() {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LanguageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Language language = this.audioPromptLanguage_;
                return language == null ? Language.getDefaultInstance() : language;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PaceNotificationOrBuilder
            public long getAveragePace() {
                return this.averagePace_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PaceNotificationOrBuilder
            public long getCurrentPace() {
                return this.currentPace_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_PaceNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PaceNotificationOrBuilder
            public long getLapPace() {
                return this.lapPace_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PaceNotificationOrBuilder
            public boolean hasAudioPromptLanguage() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PaceNotificationOrBuilder
            public boolean hasAveragePace() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PaceNotificationOrBuilder
            public boolean hasCurrentPace() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PaceNotificationOrBuilder
            public boolean hasLapPace() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_PaceNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(PaceNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasAudioPromptLanguage() || getAudioPromptLanguage().isInitialized();
            }

            public Builder mergeAudioPromptLanguage(Language language) {
                Language language2;
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(language);
                } else if ((this.bitField0_ & 8) == 0 || (language2 = this.audioPromptLanguage_) == null || language2 == Language.getDefaultInstance()) {
                    this.audioPromptLanguage_ = language;
                } else {
                    getAudioPromptLanguageBuilder().mergeFrom(language);
                }
                if (this.audioPromptLanguage_ != null) {
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
                                if (tag == 8) {
                                    this.averagePace_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.currentPace_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.lapPace_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getAudioPromptLanguageFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setAudioPromptLanguage(Language.Builder builder) {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.audioPromptLanguage_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setAveragePace(long j8) {
                this.averagePace_ = j8;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCurrentPace(long j8) {
                this.currentPace_ = j8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLapPace(long j8) {
                this.lapPace_ = j8;
                this.bitField0_ |= 4;
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
            public PaceNotification getDefaultInstanceForType() {
                return PaceNotification.getDefaultInstance();
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

            public Builder setAudioPromptLanguage(Language language) {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    language.getClass();
                    this.audioPromptLanguage_ = language;
                } else {
                    singleFieldBuilderV3.setMessage(language);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PaceNotification) {
                    return mergeFrom((PaceNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PaceNotification paceNotification) {
                if (paceNotification == PaceNotification.getDefaultInstance()) {
                    return this;
                }
                if (paceNotification.hasAveragePace()) {
                    setAveragePace(paceNotification.getAveragePace());
                }
                if (paceNotification.hasCurrentPace()) {
                    setCurrentPace(paceNotification.getCurrentPace());
                }
                if (paceNotification.hasLapPace()) {
                    setLapPace(paceNotification.getLapPace());
                }
                if (paceNotification.hasAudioPromptLanguage()) {
                    mergeAudioPromptLanguage(paceNotification.getAudioPromptLanguage());
                }
                mergeUnknownFields(paceNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PaceNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PaceNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PaceNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PaceNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PaceNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PaceNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PaceNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PaceNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PaceNotification parseFrom(InputStream inputStream) {
            return (PaceNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ PaceNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private PaceNotification() {
            this.averagePace_ = 0L;
            this.currentPace_ = 0L;
            this.lapPace_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PaceNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PaceNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PaceNotification parseFrom(CodedInputStream codedInputStream) {
            return (PaceNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PaceNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PaceNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Phrase extends GeneratedMessageV3 implements PhraseOrBuilder {
        private static final Phrase DEFAULT_INSTANCE = new Phrase();

        @Deprecated
        public static final Parser<Phrase> PARSER = new AbstractParser<Phrase>() { // from class: com.garmin.proto.generated.GDIAudioPromptsProto.Phrase.1
            @Override // com.google.protobuf.Parser
            public Phrase parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Phrase.newBuilder();
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
        public static final int PHRASE_ID_FIELD_NUMBER = 1;
        public static final int SLOT_VALUES_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int phraseId_;
        private List<SlotValue> slotValues_;

        private Phrase() {
            this.phraseId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.slotValues_ = Collections.EMPTY_LIST;
        }

        public static Phrase getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_Phrase_descriptor;
        }

        public static Builder newBuilder(Phrase phrase) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(phrase);
        }

        public static Phrase parseDelimitedFrom(InputStream inputStream) {
            return (Phrase) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Phrase parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Phrase> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Phrase)) {
                return super.equals(obj);
            }
            Phrase phrase = (Phrase) obj;
            if (hasPhraseId() != phrase.hasPhraseId()) {
                return false;
            }
            return (!hasPhraseId() || getPhraseId() == phrase.getPhraseId()) && getSlotValuesList().equals(phrase.getSlotValuesList()) && getUnknownFields().equals(phrase.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Phrase> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseOrBuilder
        public int getPhraseId() {
            return this.phraseId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.phraseId_) : 0;
            for (int i15 = 0; i15 < this.slotValues_.size(); i15++) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, this.slotValues_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseOrBuilder
        public SlotValue getSlotValues(int i14) {
            return this.slotValues_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseOrBuilder
        public int getSlotValuesCount() {
            return this.slotValues_.size();
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseOrBuilder
        public List<SlotValue> getSlotValuesList() {
            return this.slotValues_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseOrBuilder
        public SlotValueOrBuilder getSlotValuesOrBuilder(int i14) {
            return this.slotValues_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseOrBuilder
        public List<? extends SlotValueOrBuilder> getSlotValuesOrBuilderList() {
            return this.slotValues_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseOrBuilder
        public boolean hasPhraseId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPhraseId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPhraseId();
            }
            if (getSlotValuesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSlotValuesList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_Phrase_fieldAccessorTable.ensureFieldAccessorsInitialized(Phrase.class, Builder.class);
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
            if (hasPhraseId()) {
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
            return new Phrase();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.phraseId_);
            }
            for (int i14 = 0; i14 < this.slotValues_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.slotValues_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PhraseOrBuilder {
            private int bitField0_;
            private int phraseId_;
            private RepeatedFieldBuilderV3<SlotValue, SlotValue.Builder, SlotValueOrBuilder> slotValuesBuilder_;
            private List<SlotValue> slotValues_;

            private Builder() {
                this.slotValues_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(Phrase phrase) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    phrase.phraseId_ = this.phraseId_;
                } else {
                    i14 = 0;
                }
                phrase.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(Phrase phrase) {
                RepeatedFieldBuilderV3<SlotValue, SlotValue.Builder, SlotValueOrBuilder> repeatedFieldBuilderV3 = this.slotValuesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    phrase.slotValues_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.slotValues_ = Collections.unmodifiableList(this.slotValues_);
                    this.bitField0_ &= -3;
                }
                phrase.slotValues_ = this.slotValues_;
            }

            private void ensureSlotValuesIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.slotValues_ = new ArrayList(this.slotValues_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_Phrase_descriptor;
            }

            private RepeatedFieldBuilderV3<SlotValue, SlotValue.Builder, SlotValueOrBuilder> getSlotValuesFieldBuilder() {
                if (this.slotValuesBuilder_ == null) {
                    this.slotValuesBuilder_ = new RepeatedFieldBuilderV3<>(this.slotValues_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.slotValues_ = null;
                }
                return this.slotValuesBuilder_;
            }

            public Builder addAllSlotValues(Iterable<? extends SlotValue> iterable) {
                RepeatedFieldBuilderV3<SlotValue, SlotValue.Builder, SlotValueOrBuilder> repeatedFieldBuilderV3 = this.slotValuesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureSlotValuesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.slotValues_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSlotValues(SlotValue.Builder builder) {
                RepeatedFieldBuilderV3<SlotValue, SlotValue.Builder, SlotValueOrBuilder> repeatedFieldBuilderV3 = this.slotValuesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureSlotValuesIsMutable();
                this.slotValues_.add(builder.build());
                onChanged();
                return this;
            }

            public SlotValue.Builder addSlotValuesBuilder() {
                return (SlotValue.Builder) getSlotValuesFieldBuilder().addBuilder(SlotValue.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Phrase build() {
                Phrase phraseBuildPartial = buildPartial();
                if (phraseBuildPartial.isInitialized()) {
                    return phraseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) phraseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Phrase buildPartial() {
                Phrase phrase = new Phrase(this);
                buildPartialRepeatedFields(phrase);
                if (this.bitField0_ != 0) {
                    buildPartial0(phrase);
                }
                onBuilt();
                return phrase;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.phraseId_ = 0;
                RepeatedFieldBuilderV3<SlotValue, SlotValue.Builder, SlotValueOrBuilder> repeatedFieldBuilderV3 = this.slotValuesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.slotValues_ = Collections.EMPTY_LIST;
                } else {
                    this.slotValues_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
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

            public Builder clearPhraseId() {
                this.bitField0_ &= -2;
                this.phraseId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSlotValues() {
                RepeatedFieldBuilderV3<SlotValue, SlotValue.Builder, SlotValueOrBuilder> repeatedFieldBuilderV3 = this.slotValuesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.slotValues_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
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
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_Phrase_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseOrBuilder
            public int getPhraseId() {
                return this.phraseId_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseOrBuilder
            public SlotValue getSlotValues(int i14) {
                RepeatedFieldBuilderV3<SlotValue, SlotValue.Builder, SlotValueOrBuilder> repeatedFieldBuilderV3 = this.slotValuesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.slotValues_.get(i14) : (SlotValue) repeatedFieldBuilderV3.getMessage(i14);
            }

            public SlotValue.Builder getSlotValuesBuilder(int i14) {
                return (SlotValue.Builder) getSlotValuesFieldBuilder().getBuilder(i14);
            }

            public List<SlotValue.Builder> getSlotValuesBuilderList() {
                return getSlotValuesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseOrBuilder
            public int getSlotValuesCount() {
                RepeatedFieldBuilderV3<SlotValue, SlotValue.Builder, SlotValueOrBuilder> repeatedFieldBuilderV3 = this.slotValuesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.slotValues_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseOrBuilder
            public List<SlotValue> getSlotValuesList() {
                RepeatedFieldBuilderV3<SlotValue, SlotValue.Builder, SlotValueOrBuilder> repeatedFieldBuilderV3 = this.slotValuesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.slotValues_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseOrBuilder
            public SlotValueOrBuilder getSlotValuesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<SlotValue, SlotValue.Builder, SlotValueOrBuilder> repeatedFieldBuilderV3 = this.slotValuesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.slotValues_.get(i14) : (SlotValueOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseOrBuilder
            public List<? extends SlotValueOrBuilder> getSlotValuesOrBuilderList() {
                RepeatedFieldBuilderV3<SlotValue, SlotValue.Builder, SlotValueOrBuilder> repeatedFieldBuilderV3 = this.slotValuesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.slotValues_);
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseOrBuilder
            public boolean hasPhraseId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_Phrase_fieldAccessorTable.ensureFieldAccessorsInitialized(Phrase.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasPhraseId();
            }

            public Builder mergeFrom(Phrase phrase) {
                if (phrase == Phrase.getDefaultInstance()) {
                    return this;
                }
                if (phrase.hasPhraseId()) {
                    setPhraseId(phrase.getPhraseId());
                }
                if (this.slotValuesBuilder_ == null) {
                    if (!phrase.slotValues_.isEmpty()) {
                        if (this.slotValues_.isEmpty()) {
                            this.slotValues_ = phrase.slotValues_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureSlotValuesIsMutable();
                            this.slotValues_.addAll(phrase.slotValues_);
                        }
                        onChanged();
                    }
                } else if (!phrase.slotValues_.isEmpty()) {
                    boolean zIsEmpty = this.slotValuesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<SlotValue, SlotValue.Builder, SlotValueOrBuilder> repeatedFieldBuilderV3 = this.slotValuesBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.slotValuesBuilder_ = null;
                        this.slotValues_ = phrase.slotValues_;
                        this.bitField0_ &= -3;
                        this.slotValuesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getSlotValuesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(phrase.slotValues_);
                    }
                }
                mergeUnknownFields(phrase.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeSlotValues(int i14) {
                RepeatedFieldBuilderV3<SlotValue, SlotValue.Builder, SlotValueOrBuilder> repeatedFieldBuilderV3 = this.slotValuesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureSlotValuesIsMutable();
                this.slotValues_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setPhraseId(int i14) {
                this.phraseId_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSlotValues(int i14, SlotValue.Builder builder) {
                RepeatedFieldBuilderV3<SlotValue, SlotValue.Builder, SlotValueOrBuilder> repeatedFieldBuilderV3 = this.slotValuesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureSlotValuesIsMutable();
                this.slotValues_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Phrase getDefaultInstanceForType() {
                return Phrase.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.slotValues_ = Collections.EMPTY_LIST;
            }

            public SlotValue.Builder addSlotValuesBuilder(int i14) {
                return (SlotValue.Builder) getSlotValuesFieldBuilder().addBuilder(i14, SlotValue.getDefaultInstance());
            }

            public Builder addSlotValues(int i14, SlotValue slotValue) {
                RepeatedFieldBuilderV3<SlotValue, SlotValue.Builder, SlotValueOrBuilder> repeatedFieldBuilderV3 = this.slotValuesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    slotValue.getClass();
                    ensureSlotValuesIsMutable();
                    this.slotValues_.add(i14, slotValue);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, slotValue);
                return this;
            }

            public Builder setSlotValues(int i14, SlotValue slotValue) {
                RepeatedFieldBuilderV3<SlotValue, SlotValue.Builder, SlotValueOrBuilder> repeatedFieldBuilderV3 = this.slotValuesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    slotValue.getClass();
                    ensureSlotValuesIsMutable();
                    this.slotValues_.set(i14, slotValue);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, slotValue);
                return this;
            }

            public Builder addSlotValues(SlotValue slotValue) {
                RepeatedFieldBuilderV3<SlotValue, SlotValue.Builder, SlotValueOrBuilder> repeatedFieldBuilderV3 = this.slotValuesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    slotValue.getClass();
                    ensureSlotValuesIsMutable();
                    this.slotValues_.add(slotValue);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(slotValue);
                return this;
            }

            public Builder addSlotValues(int i14, SlotValue.Builder builder) {
                RepeatedFieldBuilderV3<SlotValue, SlotValue.Builder, SlotValueOrBuilder> repeatedFieldBuilderV3 = this.slotValuesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureSlotValuesIsMutable();
                    this.slotValues_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Phrase) {
                    return mergeFrom((Phrase) message);
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
                                    this.phraseId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    SlotValue slotValue = (SlotValue) codedInputStream.readMessage(SlotValue.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<SlotValue, SlotValue.Builder, SlotValueOrBuilder> repeatedFieldBuilderV3 = this.slotValuesBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureSlotValuesIsMutable();
                                        this.slotValues_.add(slotValue);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(slotValue);
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
        public Phrase getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Phrase parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Phrase) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Phrase parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Phrase parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Phrase parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Phrase parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Phrase parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private Phrase(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.phraseId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Phrase parseFrom(InputStream inputStream) {
            return (Phrase) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Phrase parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Phrase) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ Phrase(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Phrase parseFrom(CodedInputStream codedInputStream) {
            return (Phrase) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Phrase parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Phrase) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PhraseNotification extends GeneratedMessageV3 implements PhraseNotificationOrBuilder {
        public static final int GRAVEL_PHRASES_FIELD_NUMBER = 3;
        public static final int PHRASES_FIELD_NUMBER = 2;
        public static final int PRIORITY_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private List<GravelPhrase> gravelPhrases_;
        private byte memoizedIsInitialized;
        private List<Phrase> phrases_;
        private int priority_;
        private static final PhraseNotification DEFAULT_INSTANCE = new PhraseNotification();

        @Deprecated
        public static final Parser<PhraseNotification> PARSER = new AbstractParser<PhraseNotification>() { // from class: com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotification.1
            @Override // com.google.protobuf.Parser
            public PhraseNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PhraseNotification.newBuilder();
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

        private PhraseNotification() {
            this.priority_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            List list = Collections.EMPTY_LIST;
            this.phrases_ = list;
            this.gravelPhrases_ = list;
        }

        public static PhraseNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_PhraseNotification_descriptor;
        }

        public static Builder newBuilder(PhraseNotification phraseNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(phraseNotification);
        }

        public static PhraseNotification parseDelimitedFrom(InputStream inputStream) {
            return (PhraseNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PhraseNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PhraseNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PhraseNotification)) {
                return super.equals(obj);
            }
            PhraseNotification phraseNotification = (PhraseNotification) obj;
            if (hasPriority() != phraseNotification.hasPriority()) {
                return false;
            }
            return (!hasPriority() || getPriority() == phraseNotification.getPriority()) && getPhrasesList().equals(phraseNotification.getPhrasesList()) && getGravelPhrasesList().equals(phraseNotification.getGravelPhrasesList()) && getUnknownFields().equals(phraseNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
        public GravelPhrase getGravelPhrases(int i14) {
            return this.gravelPhrases_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
        public int getGravelPhrasesCount() {
            return this.gravelPhrases_.size();
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
        public List<GravelPhrase> getGravelPhrasesList() {
            return this.gravelPhrases_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
        public GravelPhraseOrBuilder getGravelPhrasesOrBuilder(int i14) {
            return this.gravelPhrases_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
        public List<? extends GravelPhraseOrBuilder> getGravelPhrasesOrBuilderList() {
            return this.gravelPhrases_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PhraseNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
        public Phrase getPhrases(int i14) {
            return this.phrases_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
        public int getPhrasesCount() {
            return this.phrases_.size();
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
        public List<Phrase> getPhrasesList() {
            return this.phrases_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
        public PhraseOrBuilder getPhrasesOrBuilder(int i14) {
            return this.phrases_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
        public List<? extends PhraseOrBuilder> getPhrasesOrBuilderList() {
            return this.phrases_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
        public int getPriority() {
            return this.priority_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.priority_) : 0;
            for (int i15 = 0; i15 < this.phrases_.size(); i15++) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, this.phrases_.get(i15));
            }
            for (int i16 = 0; i16 < this.gravelPhrases_.size(); i16++) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(3, this.gravelPhrases_.get(i16));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
        public boolean hasPriority() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPriority()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPriority();
            }
            if (getPhrasesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getPhrasesList().hashCode();
            }
            if (getGravelPhrasesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getGravelPhrasesList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_PhraseNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(PhraseNotification.class, Builder.class);
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
            for (int i14 = 0; i14 < getPhrasesCount(); i14++) {
                if (!getPhrases(i14).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i15 = 0; i15 < getGravelPhrasesCount(); i15++) {
                if (!getGravelPhrases(i15).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
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
            return new PhraseNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.priority_);
            }
            for (int i14 = 0; i14 < this.phrases_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.phrases_.get(i14));
            }
            for (int i15 = 0; i15 < this.gravelPhrases_.size(); i15++) {
                codedOutputStream.writeMessage(3, this.gravelPhrases_.get(i15));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PhraseNotificationOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<GravelPhrase, GravelPhrase.Builder, GravelPhraseOrBuilder> gravelPhrasesBuilder_;
            private List<GravelPhrase> gravelPhrases_;
            private RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> phrasesBuilder_;
            private List<Phrase> phrases_;
            private int priority_;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.phrases_ = list;
                this.gravelPhrases_ = list;
            }

            private void buildPartial0(PhraseNotification phraseNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    phraseNotification.priority_ = this.priority_;
                } else {
                    i14 = 0;
                }
                phraseNotification.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(PhraseNotification phraseNotification) {
                RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.phrases_ = Collections.unmodifiableList(this.phrases_);
                        this.bitField0_ &= -3;
                    }
                    phraseNotification.phrases_ = this.phrases_;
                } else {
                    phraseNotification.phrases_ = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<GravelPhrase, GravelPhrase.Builder, GravelPhraseOrBuilder> repeatedFieldBuilderV4 = this.gravelPhrasesBuilder_;
                if (repeatedFieldBuilderV4 != null) {
                    phraseNotification.gravelPhrases_ = repeatedFieldBuilderV4.build();
                    return;
                }
                if ((this.bitField0_ & 4) != 0) {
                    this.gravelPhrases_ = Collections.unmodifiableList(this.gravelPhrases_);
                    this.bitField0_ &= -5;
                }
                phraseNotification.gravelPhrases_ = this.gravelPhrases_;
            }

            private void ensureGravelPhrasesIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.gravelPhrases_ = new ArrayList(this.gravelPhrases_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensurePhrasesIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.phrases_ = new ArrayList(this.phrases_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_PhraseNotification_descriptor;
            }

            private RepeatedFieldBuilderV3<GravelPhrase, GravelPhrase.Builder, GravelPhraseOrBuilder> getGravelPhrasesFieldBuilder() {
                if (this.gravelPhrasesBuilder_ == null) {
                    this.gravelPhrasesBuilder_ = new RepeatedFieldBuilderV3<>(this.gravelPhrases_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.gravelPhrases_ = null;
                }
                return this.gravelPhrasesBuilder_;
            }

            private RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> getPhrasesFieldBuilder() {
                if (this.phrasesBuilder_ == null) {
                    this.phrasesBuilder_ = new RepeatedFieldBuilderV3<>(this.phrases_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.phrases_ = null;
                }
                return this.phrasesBuilder_;
            }

            public Builder addAllGravelPhrases(Iterable<? extends GravelPhrase> iterable) {
                RepeatedFieldBuilderV3<GravelPhrase, GravelPhrase.Builder, GravelPhraseOrBuilder> repeatedFieldBuilderV3 = this.gravelPhrasesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureGravelPhrasesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.gravelPhrases_);
                onChanged();
                return this;
            }

            public Builder addAllPhrases(Iterable<? extends Phrase> iterable) {
                RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensurePhrasesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.phrases_);
                onChanged();
                return this;
            }

            public Builder addGravelPhrases(GravelPhrase.Builder builder) {
                RepeatedFieldBuilderV3<GravelPhrase, GravelPhrase.Builder, GravelPhraseOrBuilder> repeatedFieldBuilderV3 = this.gravelPhrasesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureGravelPhrasesIsMutable();
                this.gravelPhrases_.add(builder.build());
                onChanged();
                return this;
            }

            public GravelPhrase.Builder addGravelPhrasesBuilder() {
                return (GravelPhrase.Builder) getGravelPhrasesFieldBuilder().addBuilder(GravelPhrase.getDefaultInstance());
            }

            public Builder addPhrases(Phrase.Builder builder) {
                RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensurePhrasesIsMutable();
                this.phrases_.add(builder.build());
                onChanged();
                return this;
            }

            public Phrase.Builder addPhrasesBuilder() {
                return (Phrase.Builder) getPhrasesFieldBuilder().addBuilder(Phrase.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PhraseNotification build() {
                PhraseNotification phraseNotificationBuildPartial = buildPartial();
                if (phraseNotificationBuildPartial.isInitialized()) {
                    return phraseNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) phraseNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PhraseNotification buildPartial() {
                PhraseNotification phraseNotification = new PhraseNotification(this);
                buildPartialRepeatedFields(phraseNotification);
                if (this.bitField0_ != 0) {
                    buildPartial0(phraseNotification);
                }
                onBuilt();
                return phraseNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.priority_ = 0;
                RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.phrases_ = Collections.EMPTY_LIST;
                } else {
                    this.phrases_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                RepeatedFieldBuilderV3<GravelPhrase, GravelPhrase.Builder, GravelPhraseOrBuilder> repeatedFieldBuilderV4 = this.gravelPhrasesBuilder_;
                if (repeatedFieldBuilderV4 == null) {
                    this.gravelPhrases_ = Collections.EMPTY_LIST;
                } else {
                    this.gravelPhrases_ = null;
                    repeatedFieldBuilderV4.clear();
                }
                this.bitField0_ &= -5;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGravelPhrases() {
                RepeatedFieldBuilderV3<GravelPhrase, GravelPhrase.Builder, GravelPhraseOrBuilder> repeatedFieldBuilderV3 = this.gravelPhrasesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.gravelPhrases_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPhrases() {
                RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.phrases_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearPriority() {
                this.bitField0_ &= -2;
                this.priority_ = 0;
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
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_PhraseNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
            public GravelPhrase getGravelPhrases(int i14) {
                RepeatedFieldBuilderV3<GravelPhrase, GravelPhrase.Builder, GravelPhraseOrBuilder> repeatedFieldBuilderV3 = this.gravelPhrasesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.gravelPhrases_.get(i14) : (GravelPhrase) repeatedFieldBuilderV3.getMessage(i14);
            }

            public GravelPhrase.Builder getGravelPhrasesBuilder(int i14) {
                return (GravelPhrase.Builder) getGravelPhrasesFieldBuilder().getBuilder(i14);
            }

            public List<GravelPhrase.Builder> getGravelPhrasesBuilderList() {
                return getGravelPhrasesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
            public int getGravelPhrasesCount() {
                RepeatedFieldBuilderV3<GravelPhrase, GravelPhrase.Builder, GravelPhraseOrBuilder> repeatedFieldBuilderV3 = this.gravelPhrasesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.gravelPhrases_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
            public List<GravelPhrase> getGravelPhrasesList() {
                RepeatedFieldBuilderV3<GravelPhrase, GravelPhrase.Builder, GravelPhraseOrBuilder> repeatedFieldBuilderV3 = this.gravelPhrasesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.gravelPhrases_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
            public GravelPhraseOrBuilder getGravelPhrasesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<GravelPhrase, GravelPhrase.Builder, GravelPhraseOrBuilder> repeatedFieldBuilderV3 = this.gravelPhrasesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.gravelPhrases_.get(i14) : (GravelPhraseOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
            public List<? extends GravelPhraseOrBuilder> getGravelPhrasesOrBuilderList() {
                RepeatedFieldBuilderV3<GravelPhrase, GravelPhrase.Builder, GravelPhraseOrBuilder> repeatedFieldBuilderV3 = this.gravelPhrasesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.gravelPhrases_);
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
            public Phrase getPhrases(int i14) {
                RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.phrases_.get(i14) : (Phrase) repeatedFieldBuilderV3.getMessage(i14);
            }

            public Phrase.Builder getPhrasesBuilder(int i14) {
                return (Phrase.Builder) getPhrasesFieldBuilder().getBuilder(i14);
            }

            public List<Phrase.Builder> getPhrasesBuilderList() {
                return getPhrasesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
            public int getPhrasesCount() {
                RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.phrases_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
            public List<Phrase> getPhrasesList() {
                RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.phrases_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
            public PhraseOrBuilder getPhrasesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.phrases_.get(i14) : (PhraseOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
            public List<? extends PhraseOrBuilder> getPhrasesOrBuilderList() {
                RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.phrases_);
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
            public int getPriority() {
                return this.priority_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PhraseNotificationOrBuilder
            public boolean hasPriority() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_PhraseNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(PhraseNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getPhrasesCount(); i14++) {
                    if (!getPhrases(i14).isInitialized()) {
                        return false;
                    }
                }
                for (int i15 = 0; i15 < getGravelPhrasesCount(); i15++) {
                    if (!getGravelPhrases(i15).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(PhraseNotification phraseNotification) {
                if (phraseNotification == PhraseNotification.getDefaultInstance()) {
                    return this;
                }
                if (phraseNotification.hasPriority()) {
                    setPriority(phraseNotification.getPriority());
                }
                if (this.phrasesBuilder_ == null) {
                    if (!phraseNotification.phrases_.isEmpty()) {
                        if (this.phrases_.isEmpty()) {
                            this.phrases_ = phraseNotification.phrases_;
                            this.bitField0_ &= -3;
                        } else {
                            ensurePhrasesIsMutable();
                            this.phrases_.addAll(phraseNotification.phrases_);
                        }
                        onChanged();
                    }
                } else if (!phraseNotification.phrases_.isEmpty()) {
                    boolean zIsEmpty = this.phrasesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.phrasesBuilder_ = null;
                        this.phrases_ = phraseNotification.phrases_;
                        this.bitField0_ &= -3;
                        this.phrasesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getPhrasesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(phraseNotification.phrases_);
                    }
                }
                if (this.gravelPhrasesBuilder_ == null) {
                    if (!phraseNotification.gravelPhrases_.isEmpty()) {
                        if (this.gravelPhrases_.isEmpty()) {
                            this.gravelPhrases_ = phraseNotification.gravelPhrases_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureGravelPhrasesIsMutable();
                            this.gravelPhrases_.addAll(phraseNotification.gravelPhrases_);
                        }
                        onChanged();
                    }
                } else if (!phraseNotification.gravelPhrases_.isEmpty()) {
                    boolean zIsEmpty2 = this.gravelPhrasesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<GravelPhrase, GravelPhrase.Builder, GravelPhraseOrBuilder> repeatedFieldBuilderV4 = this.gravelPhrasesBuilder_;
                    if (zIsEmpty2) {
                        repeatedFieldBuilderV4.dispose();
                        this.gravelPhrasesBuilder_ = null;
                        this.gravelPhrases_ = phraseNotification.gravelPhrases_;
                        this.bitField0_ &= -5;
                        this.gravelPhrasesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getGravelPhrasesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV4.addAllMessages(phraseNotification.gravelPhrases_);
                    }
                }
                mergeUnknownFields(phraseNotification.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeGravelPhrases(int i14) {
                RepeatedFieldBuilderV3<GravelPhrase, GravelPhrase.Builder, GravelPhraseOrBuilder> repeatedFieldBuilderV3 = this.gravelPhrasesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureGravelPhrasesIsMutable();
                this.gravelPhrases_.remove(i14);
                onChanged();
                return this;
            }

            public Builder removePhrases(int i14) {
                RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensurePhrasesIsMutable();
                this.phrases_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGravelPhrases(int i14, GravelPhrase.Builder builder) {
                RepeatedFieldBuilderV3<GravelPhrase, GravelPhrase.Builder, GravelPhraseOrBuilder> repeatedFieldBuilderV3 = this.gravelPhrasesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureGravelPhrasesIsMutable();
                this.gravelPhrases_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setPhrases(int i14, Phrase.Builder builder) {
                RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensurePhrasesIsMutable();
                this.phrases_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setPriority(int i14) {
                this.priority_ = i14;
                this.bitField0_ |= 1;
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
            public PhraseNotification getDefaultInstanceForType() {
                return PhraseNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                List list = Collections.EMPTY_LIST;
                this.phrases_ = list;
                this.gravelPhrases_ = list;
            }

            public GravelPhrase.Builder addGravelPhrasesBuilder(int i14) {
                return (GravelPhrase.Builder) getGravelPhrasesFieldBuilder().addBuilder(i14, GravelPhrase.getDefaultInstance());
            }

            public Phrase.Builder addPhrasesBuilder(int i14) {
                return (Phrase.Builder) getPhrasesFieldBuilder().addBuilder(i14, Phrase.getDefaultInstance());
            }

            public Builder addGravelPhrases(int i14, GravelPhrase gravelPhrase) {
                RepeatedFieldBuilderV3<GravelPhrase, GravelPhrase.Builder, GravelPhraseOrBuilder> repeatedFieldBuilderV3 = this.gravelPhrasesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    gravelPhrase.getClass();
                    ensureGravelPhrasesIsMutable();
                    this.gravelPhrases_.add(i14, gravelPhrase);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, gravelPhrase);
                return this;
            }

            public Builder addPhrases(int i14, Phrase phrase) {
                RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    phrase.getClass();
                    ensurePhrasesIsMutable();
                    this.phrases_.add(i14, phrase);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, phrase);
                return this;
            }

            public Builder setGravelPhrases(int i14, GravelPhrase gravelPhrase) {
                RepeatedFieldBuilderV3<GravelPhrase, GravelPhrase.Builder, GravelPhraseOrBuilder> repeatedFieldBuilderV3 = this.gravelPhrasesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    gravelPhrase.getClass();
                    ensureGravelPhrasesIsMutable();
                    this.gravelPhrases_.set(i14, gravelPhrase);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, gravelPhrase);
                return this;
            }

            public Builder setPhrases(int i14, Phrase phrase) {
                RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    phrase.getClass();
                    ensurePhrasesIsMutable();
                    this.phrases_.set(i14, phrase);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, phrase);
                return this;
            }

            public Builder addGravelPhrases(GravelPhrase gravelPhrase) {
                RepeatedFieldBuilderV3<GravelPhrase, GravelPhrase.Builder, GravelPhraseOrBuilder> repeatedFieldBuilderV3 = this.gravelPhrasesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    gravelPhrase.getClass();
                    ensureGravelPhrasesIsMutable();
                    this.gravelPhrases_.add(gravelPhrase);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(gravelPhrase);
                return this;
            }

            public Builder addPhrases(Phrase phrase) {
                RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    phrase.getClass();
                    ensurePhrasesIsMutable();
                    this.phrases_.add(phrase);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(phrase);
                return this;
            }

            public Builder addGravelPhrases(int i14, GravelPhrase.Builder builder) {
                RepeatedFieldBuilderV3<GravelPhrase, GravelPhrase.Builder, GravelPhraseOrBuilder> repeatedFieldBuilderV3 = this.gravelPhrasesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureGravelPhrasesIsMutable();
                    this.gravelPhrases_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            public Builder addPhrases(int i14, Phrase.Builder builder) {
                RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensurePhrasesIsMutable();
                    this.phrases_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PhraseNotification) {
                    return mergeFrom((PhraseNotification) message);
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
                                    this.priority_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    Phrase phrase = (Phrase) codedInputStream.readMessage(Phrase.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Phrase, Phrase.Builder, PhraseOrBuilder> repeatedFieldBuilderV3 = this.phrasesBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensurePhrasesIsMutable();
                                        this.phrases_.add(phrase);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(phrase);
                                    }
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    GravelPhrase gravelPhrase = (GravelPhrase) codedInputStream.readMessage(GravelPhrase.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<GravelPhrase, GravelPhrase.Builder, GravelPhraseOrBuilder> repeatedFieldBuilderV4 = this.gravelPhrasesBuilder_;
                                    if (repeatedFieldBuilderV4 == null) {
                                        ensureGravelPhrasesIsMutable();
                                        this.gravelPhrases_.add(gravelPhrase);
                                    } else {
                                        repeatedFieldBuilderV4.addMessage(gravelPhrase);
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
        public PhraseNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PhraseNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PhraseNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PhraseNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PhraseNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PhraseNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PhraseNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PhraseNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PhraseNotification parseFrom(InputStream inputStream) {
            return (PhraseNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private PhraseNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.priority_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PhraseNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PhraseNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PhraseNotification parseFrom(CodedInputStream codedInputStream) {
            return (PhraseNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ PhraseNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static PhraseNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PhraseNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PowerNotification extends GeneratedMessageV3 implements PowerNotificationOrBuilder {
        public static final int AUDIO_PROMPT_LANGUAGE_FIELD_NUMBER = 4;
        public static final int AVERAGE_POWER_FIELD_NUMBER = 1;
        public static final int LAP_POWER_FIELD_NUMBER = 3;
        public static final int NORMALIZED_POWER_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private Language audioPromptLanguage_;
        private int averagePower_;
        private int bitField0_;
        private int lapPower_;
        private byte memoizedIsInitialized;
        private int normalizedPower_;
        private static final PowerNotification DEFAULT_INSTANCE = new PowerNotification();

        @Deprecated
        public static final Parser<PowerNotification> PARSER = new AbstractParser<PowerNotification>() { // from class: com.garmin.proto.generated.GDIAudioPromptsProto.PowerNotification.1
            @Override // com.google.protobuf.Parser
            public PowerNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PowerNotification.newBuilder();
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

        private PowerNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.averagePower_ = 0;
            this.normalizedPower_ = 0;
            this.lapPower_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PowerNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_PowerNotification_descriptor;
        }

        public static Builder newBuilder(PowerNotification powerNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(powerNotification);
        }

        public static PowerNotification parseDelimitedFrom(InputStream inputStream) {
            return (PowerNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PowerNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PowerNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PowerNotification)) {
                return super.equals(obj);
            }
            PowerNotification powerNotification = (PowerNotification) obj;
            if (hasAveragePower() != powerNotification.hasAveragePower()) {
                return false;
            }
            if ((hasAveragePower() && getAveragePower() != powerNotification.getAveragePower()) || hasNormalizedPower() != powerNotification.hasNormalizedPower()) {
                return false;
            }
            if ((hasNormalizedPower() && getNormalizedPower() != powerNotification.getNormalizedPower()) || hasLapPower() != powerNotification.hasLapPower()) {
                return false;
            }
            if ((!hasLapPower() || getLapPower() == powerNotification.getLapPower()) && hasAudioPromptLanguage() == powerNotification.hasAudioPromptLanguage()) {
                return (!hasAudioPromptLanguage() || getAudioPromptLanguage().equals(powerNotification.getAudioPromptLanguage())) && getUnknownFields().equals(powerNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PowerNotificationOrBuilder
        public Language getAudioPromptLanguage() {
            Language language = this.audioPromptLanguage_;
            return language == null ? Language.getDefaultInstance() : language;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PowerNotificationOrBuilder
        public LanguageOrBuilder getAudioPromptLanguageOrBuilder() {
            Language language = this.audioPromptLanguage_;
            return language == null ? Language.getDefaultInstance() : language;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PowerNotificationOrBuilder
        public int getAveragePower() {
            return this.averagePower_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PowerNotificationOrBuilder
        public int getLapPower() {
            return this.lapPower_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PowerNotificationOrBuilder
        public int getNormalizedPower() {
            return this.normalizedPower_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PowerNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.averagePower_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.normalizedPower_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.lapPower_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(4, getAudioPromptLanguage());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PowerNotificationOrBuilder
        public boolean hasAudioPromptLanguage() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PowerNotificationOrBuilder
        public boolean hasAveragePower() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PowerNotificationOrBuilder
        public boolean hasLapPower() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PowerNotificationOrBuilder
        public boolean hasNormalizedPower() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAveragePower()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAveragePower();
            }
            if (hasNormalizedPower()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getNormalizedPower();
            }
            if (hasLapPower()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getLapPower();
            }
            if (hasAudioPromptLanguage()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getAudioPromptLanguage().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_PowerNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(PowerNotification.class, Builder.class);
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
            if (!hasAudioPromptLanguage() || getAudioPromptLanguage().isInitialized()) {
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
            return new PowerNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.averagePower_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.normalizedPower_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.lapPower_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getAudioPromptLanguage());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* JADX INFO: loaded from: classes2.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PowerNotificationOrBuilder {
            private SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> audioPromptLanguageBuilder_;
            private Language audioPromptLanguage_;
            private int averagePower_;
            private int bitField0_;
            private int lapPower_;
            private int normalizedPower_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(PowerNotification powerNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    powerNotification.averagePower_ = this.averagePower_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    powerNotification.normalizedPower_ = this.normalizedPower_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    powerNotification.lapPower_ = this.lapPower_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                    powerNotification.audioPromptLanguage_ = singleFieldBuilderV3 == null ? this.audioPromptLanguage_ : (Language) singleFieldBuilderV3.build();
                    i14 |= 8;
                }
                powerNotification.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> getAudioPromptLanguageFieldBuilder() {
                if (this.audioPromptLanguageBuilder_ == null) {
                    this.audioPromptLanguageBuilder_ = new SingleFieldBuilderV3<>(getAudioPromptLanguage(), getParentForChildren(), isClean());
                    this.audioPromptLanguage_ = null;
                }
                return this.audioPromptLanguageBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_PowerNotification_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getAudioPromptLanguageFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PowerNotification build() {
                PowerNotification powerNotificationBuildPartial = buildPartial();
                if (powerNotificationBuildPartial.isInitialized()) {
                    return powerNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) powerNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PowerNotification buildPartial() {
                PowerNotification powerNotification = new PowerNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(powerNotification);
                }
                onBuilt();
                return powerNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.averagePower_ = 0;
                this.normalizedPower_ = 0;
                this.lapPower_ = 0;
                this.audioPromptLanguage_ = null;
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.audioPromptLanguageBuilder_ = null;
                }
                return this;
            }

            public Builder clearAudioPromptLanguage() {
                this.bitField0_ &= -9;
                this.audioPromptLanguage_ = null;
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.audioPromptLanguageBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAveragePower() {
                this.bitField0_ &= -2;
                this.averagePower_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLapPower() {
                this.bitField0_ &= -5;
                this.lapPower_ = 0;
                onChanged();
                return this;
            }

            public Builder clearNormalizedPower() {
                this.bitField0_ &= -3;
                this.normalizedPower_ = 0;
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

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PowerNotificationOrBuilder
            public Language getAudioPromptLanguage() {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Language) singleFieldBuilderV3.getMessage();
                }
                Language language = this.audioPromptLanguage_;
                return language == null ? Language.getDefaultInstance() : language;
            }

            public Language.Builder getAudioPromptLanguageBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (Language.Builder) getAudioPromptLanguageFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PowerNotificationOrBuilder
            public LanguageOrBuilder getAudioPromptLanguageOrBuilder() {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LanguageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Language language = this.audioPromptLanguage_;
                return language == null ? Language.getDefaultInstance() : language;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PowerNotificationOrBuilder
            public int getAveragePower() {
                return this.averagePower_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_PowerNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PowerNotificationOrBuilder
            public int getLapPower() {
                return this.lapPower_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PowerNotificationOrBuilder
            public int getNormalizedPower() {
                return this.normalizedPower_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PowerNotificationOrBuilder
            public boolean hasAudioPromptLanguage() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PowerNotificationOrBuilder
            public boolean hasAveragePower() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PowerNotificationOrBuilder
            public boolean hasLapPower() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.PowerNotificationOrBuilder
            public boolean hasNormalizedPower() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_PowerNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(PowerNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasAudioPromptLanguage() || getAudioPromptLanguage().isInitialized();
            }

            public Builder mergeAudioPromptLanguage(Language language) {
                Language language2;
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(language);
                } else if ((this.bitField0_ & 8) == 0 || (language2 = this.audioPromptLanguage_) == null || language2 == Language.getDefaultInstance()) {
                    this.audioPromptLanguage_ = language;
                } else {
                    getAudioPromptLanguageBuilder().mergeFrom(language);
                }
                if (this.audioPromptLanguage_ != null) {
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
                                if (tag == 8) {
                                    this.averagePower_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.normalizedPower_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.lapPower_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getAudioPromptLanguageFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setAudioPromptLanguage(Language.Builder builder) {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.audioPromptLanguage_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setAveragePower(int i14) {
                this.averagePower_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLapPower(int i14) {
                this.lapPower_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setNormalizedPower(int i14) {
                this.normalizedPower_ = i14;
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
            public PowerNotification getDefaultInstanceForType() {
                return PowerNotification.getDefaultInstance();
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

            public Builder setAudioPromptLanguage(Language language) {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    language.getClass();
                    this.audioPromptLanguage_ = language;
                } else {
                    singleFieldBuilderV3.setMessage(language);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PowerNotification) {
                    return mergeFrom((PowerNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PowerNotification powerNotification) {
                if (powerNotification == PowerNotification.getDefaultInstance()) {
                    return this;
                }
                if (powerNotification.hasAveragePower()) {
                    setAveragePower(powerNotification.getAveragePower());
                }
                if (powerNotification.hasNormalizedPower()) {
                    setNormalizedPower(powerNotification.getNormalizedPower());
                }
                if (powerNotification.hasLapPower()) {
                    setLapPower(powerNotification.getLapPower());
                }
                if (powerNotification.hasAudioPromptLanguage()) {
                    mergeAudioPromptLanguage(powerNotification.getAudioPromptLanguage());
                }
                mergeUnknownFields(powerNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PowerNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PowerNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PowerNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PowerNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PowerNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PowerNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PowerNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ PowerNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static PowerNotification parseFrom(InputStream inputStream) {
            return (PowerNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private PowerNotification() {
            this.averagePower_ = 0;
            this.normalizedPower_ = 0;
            this.lapPower_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PowerNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PowerNotification parseFrom(CodedInputStream codedInputStream) {
            return (PowerNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PowerNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PowerNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class SetLanguageRequest extends GeneratedMessageV3 implements SetLanguageRequestOrBuilder {
        public static final int LANG_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Language lang_;
        private byte memoizedIsInitialized;
        private static final SetLanguageRequest DEFAULT_INSTANCE = new SetLanguageRequest();

        @Deprecated
        public static final Parser<SetLanguageRequest> PARSER = new AbstractParser<SetLanguageRequest>() { // from class: com.garmin.proto.generated.GDIAudioPromptsProto.SetLanguageRequest.1
            @Override // com.google.protobuf.Parser
            public SetLanguageRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SetLanguageRequest.newBuilder();
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

        private SetLanguageRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetLanguageRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SetLanguageRequest_descriptor;
        }

        public static Builder newBuilder(SetLanguageRequest setLanguageRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(setLanguageRequest);
        }

        public static SetLanguageRequest parseDelimitedFrom(InputStream inputStream) {
            return (SetLanguageRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SetLanguageRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SetLanguageRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetLanguageRequest)) {
                return super.equals(obj);
            }
            SetLanguageRequest setLanguageRequest = (SetLanguageRequest) obj;
            if (hasLang() != setLanguageRequest.hasLang()) {
                return false;
            }
            return (!hasLang() || getLang().equals(setLanguageRequest.getLang())) && getUnknownFields().equals(setLanguageRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SetLanguageRequestOrBuilder
        public Language getLang() {
            Language language = this.lang_;
            return language == null ? Language.getDefaultInstance() : language;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SetLanguageRequestOrBuilder
        public LanguageOrBuilder getLangOrBuilder() {
            Language language = this.lang_;
            return language == null ? Language.getDefaultInstance() : language;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SetLanguageRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getLang()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SetLanguageRequestOrBuilder
        public boolean hasLang() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasLang()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getLang().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SetLanguageRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SetLanguageRequest.class, Builder.class);
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
            if (!hasLang()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getLang().isInitialized()) {
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
            return new SetLanguageRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getLang());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SetLanguageRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> langBuilder_;
            private Language lang_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SetLanguageRequest setLanguageRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.langBuilder_;
                    setLanguageRequest.lang_ = singleFieldBuilderV3 == null ? this.lang_ : (Language) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                setLanguageRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SetLanguageRequest_descriptor;
            }

            private SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> getLangFieldBuilder() {
                if (this.langBuilder_ == null) {
                    this.langBuilder_ = new SingleFieldBuilderV3<>(getLang(), getParentForChildren(), isClean());
                    this.lang_ = null;
                }
                return this.langBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getLangFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetLanguageRequest build() {
                SetLanguageRequest setLanguageRequestBuildPartial = buildPartial();
                if (setLanguageRequestBuildPartial.isInitialized()) {
                    return setLanguageRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) setLanguageRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SetLanguageRequest buildPartial() {
                SetLanguageRequest setLanguageRequest = new SetLanguageRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(setLanguageRequest);
                }
                onBuilt();
                return setLanguageRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.lang_ = null;
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.langBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.langBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLang() {
                this.bitField0_ &= -2;
                this.lang_ = null;
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.langBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.langBuilder_ = null;
                }
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SetLanguageRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SetLanguageRequestOrBuilder
            public Language getLang() {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.langBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Language) singleFieldBuilderV3.getMessage();
                }
                Language language = this.lang_;
                return language == null ? Language.getDefaultInstance() : language;
            }

            public Language.Builder getLangBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Language.Builder) getLangFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SetLanguageRequestOrBuilder
            public LanguageOrBuilder getLangOrBuilder() {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.langBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LanguageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Language language = this.lang_;
                return language == null ? Language.getDefaultInstance() : language;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SetLanguageRequestOrBuilder
            public boolean hasLang() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SetLanguageRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SetLanguageRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasLang() && getLang().isInitialized();
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
                                    codedInputStream.readMessage(getLangFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeLang(Language language) {
                Language language2;
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.langBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(language);
                } else if ((this.bitField0_ & 1) == 0 || (language2 = this.lang_) == null || language2 == Language.getDefaultInstance()) {
                    this.lang_ = language;
                } else {
                    getLangBuilder().mergeFrom(language);
                }
                if (this.lang_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
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

            public Builder setLang(Language.Builder builder) {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.langBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.lang_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
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
            public SetLanguageRequest getDefaultInstanceForType() {
                return SetLanguageRequest.getDefaultInstance();
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

            public Builder setLang(Language language) {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.langBuilder_;
                if (singleFieldBuilderV3 == null) {
                    language.getClass();
                    this.lang_ = language;
                } else {
                    singleFieldBuilderV3.setMessage(language);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SetLanguageRequest) {
                    return mergeFrom((SetLanguageRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SetLanguageRequest setLanguageRequest) {
                if (setLanguageRequest == SetLanguageRequest.getDefaultInstance()) {
                    return this;
                }
                if (setLanguageRequest.hasLang()) {
                    mergeLang(setLanguageRequest.getLang());
                }
                mergeUnknownFields(setLanguageRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SetLanguageRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SetLanguageRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SetLanguageRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SetLanguageRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetLanguageRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetLanguageRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SetLanguageRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SetLanguageRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SetLanguageRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SetLanguageRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SetLanguageRequest parseFrom(InputStream inputStream) {
            return (SetLanguageRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SetLanguageRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetLanguageRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SetLanguageRequest parseFrom(CodedInputStream codedInputStream) {
            return (SetLanguageRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SetLanguageRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SetLanguageRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class SlotValue extends GeneratedMessageV3 implements SlotValueOrBuilder {
        public static final int FLOAT_VALUE_FIELD_NUMBER = 2;
        public static final int INT_VALUE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int valueCase_;
        private Object value_;
        private static final SlotValue DEFAULT_INSTANCE = new SlotValue();

        @Deprecated
        public static final Parser<SlotValue> PARSER = new AbstractParser<SlotValue>() { // from class: com.garmin.proto.generated.GDIAudioPromptsProto.SlotValue.1
            @Override // com.google.protobuf.Parser
            public SlotValue parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SlotValue.newBuilder();
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

        private SlotValue(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.valueCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SlotValue getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SlotValue_descriptor;
        }

        public static Builder newBuilder(SlotValue slotValue) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(slotValue);
        }

        public static SlotValue parseDelimitedFrom(InputStream inputStream) {
            return (SlotValue) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SlotValue parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SlotValue> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SlotValue)) {
                return super.equals(obj);
            }
            SlotValue slotValue = (SlotValue) obj;
            if (!getValueCase().equals(slotValue.getValueCase())) {
                return false;
            }
            int i14 = this.valueCase_;
            if (i14 != 1) {
                if (i14 == 2 && Float.floatToIntBits(getFloatValue()) != Float.floatToIntBits(slotValue.getFloatValue())) {
                    return false;
                }
            } else if (getIntValue() != slotValue.getIntValue()) {
                return false;
            }
            return getUnknownFields().equals(slotValue.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SlotValueOrBuilder
        public float getFloatValue() {
            if (this.valueCase_ == 2) {
                return ((Float) this.value_).floatValue();
            }
            return 0.0f;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SlotValueOrBuilder
        public int getIntValue() {
            if (this.valueCase_ == 1) {
                return ((Integer) this.value_).intValue();
            }
            return 0;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SlotValue> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeSInt32Size = this.valueCase_ == 1 ? CodedOutputStream.computeSInt32Size(1, ((Integer) this.value_).intValue()) : 0;
            if (this.valueCase_ == 2) {
                iComputeSInt32Size += CodedOutputStream.computeFloatSize(2, ((Float) this.value_).floatValue());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeSInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SlotValueOrBuilder
        public ValueCase getValueCase() {
            return ValueCase.forNumber(this.valueCase_);
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SlotValueOrBuilder
        public boolean hasFloatValue() {
            return this.valueCase_ == 2;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SlotValueOrBuilder
        public boolean hasIntValue() {
            return this.valueCase_ == 1;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int iC;
            int intValue;
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            int i15 = this.valueCase_;
            if (i15 != 1) {
                if (i15 == 2) {
                    iC = e5.c(iHashCode, 37, 2, 53);
                    intValue = Float.floatToIntBits(getFloatValue());
                }
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }
            iC = e5.c(iHashCode, 37, 1, 53);
            intValue = getIntValue();
            iHashCode = iC + intValue;
            int iHashCode3 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SlotValue_fieldAccessorTable.ensureFieldAccessorsInitialized(SlotValue.class, Builder.class);
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
            return new SlotValue();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if (this.valueCase_ == 1) {
                codedOutputStream.writeSInt32(1, ((Integer) this.value_).intValue());
            }
            if (this.valueCase_ == 2) {
                codedOutputStream.writeFloat(2, ((Float) this.value_).floatValue());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SlotValueOrBuilder {
            private int bitField0_;
            private int valueCase_;
            private Object value_;

            private Builder() {
                this.valueCase_ = 0;
            }

            private void buildPartial0(SlotValue slotValue) {
            }

            private void buildPartialOneofs(SlotValue slotValue) {
                slotValue.valueCase_ = this.valueCase_;
                slotValue.value_ = this.value_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SlotValue_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SlotValue build() {
                SlotValue slotValueBuildPartial = buildPartial();
                if (slotValueBuildPartial.isInitialized()) {
                    return slotValueBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) slotValueBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SlotValue buildPartial() {
                SlotValue slotValue = new SlotValue(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(slotValue);
                }
                buildPartialOneofs(slotValue);
                onBuilt();
                return slotValue;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.valueCase_ = 0;
                this.value_ = null;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFloatValue() {
                if (this.valueCase_ == 2) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                    onChanged();
                }
                return this;
            }

            public Builder clearIntValue() {
                if (this.valueCase_ == 1) {
                    this.valueCase_ = 0;
                    this.value_ = null;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearValue() {
                this.valueCase_ = 0;
                this.value_ = null;
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
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SlotValue_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SlotValueOrBuilder
            public float getFloatValue() {
                if (this.valueCase_ == 2) {
                    return ((Float) this.value_).floatValue();
                }
                return 0.0f;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SlotValueOrBuilder
            public int getIntValue() {
                if (this.valueCase_ == 1) {
                    return ((Integer) this.value_).intValue();
                }
                return 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SlotValueOrBuilder
            public ValueCase getValueCase() {
                return ValueCase.forNumber(this.valueCase_);
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SlotValueOrBuilder
            public boolean hasFloatValue() {
                return this.valueCase_ == 2;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SlotValueOrBuilder
            public boolean hasIntValue() {
                return this.valueCase_ == 1;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SlotValue_fieldAccessorTable.ensureFieldAccessorsInitialized(SlotValue.class, Builder.class);
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
                                    this.value_ = Integer.valueOf(codedInputStream.readSInt32());
                                    this.valueCase_ = 1;
                                } else if (tag == 21) {
                                    this.value_ = Float.valueOf(codedInputStream.readFloat());
                                    this.valueCase_ = 2;
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

            public Builder setFloatValue(float f14) {
                this.valueCase_ = 2;
                this.value_ = Float.valueOf(f14);
                onChanged();
                return this;
            }

            public Builder setIntValue(int i14) {
                this.valueCase_ = 1;
                this.value_ = Integer.valueOf(i14);
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
            public SlotValue getDefaultInstanceForType() {
                return SlotValue.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.valueCase_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SlotValue) {
                    return mergeFrom((SlotValue) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SlotValue slotValue) {
                if (slotValue == SlotValue.getDefaultInstance()) {
                    return this;
                }
                int i14 = AnonymousClass1.$SwitchMap$com$garmin$proto$generated$GDIAudioPromptsProto$SlotValue$ValueCase[slotValue.getValueCase().ordinal()];
                if (i14 == 1) {
                    setIntValue(slotValue.getIntValue());
                } else if (i14 == 2) {
                    setFloatValue(slotValue.getFloatValue());
                }
                mergeUnknownFields(slotValue.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SlotValue getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public enum ValueCase implements Internal.EnumLite, AbstractMessageLite.InternalOneOfEnum {
            INT_VALUE(1),
            FLOAT_VALUE(2),
            VALUE_NOT_SET(0);

            private final int value;

            ValueCase(int i14) {
                this.value = i14;
            }

            public static ValueCase forNumber(int i14) {
                if (i14 == 0) {
                    return VALUE_NOT_SET;
                }
                if (i14 == 1) {
                    return INT_VALUE;
                }
                if (i14 != 2) {
                    return null;
                }
                return FLOAT_VALUE;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ValueCase valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public static SlotValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SlotValue) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SlotValue parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SlotValue(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SlotValue parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SlotValue() {
            this.valueCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SlotValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SlotValue parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SlotValue parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SlotValue parseFrom(InputStream inputStream) {
            return (SlotValue) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SlotValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SlotValue) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SlotValue parseFrom(CodedInputStream codedInputStream) {
            return (SlotValue) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SlotValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SlotValue) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    public static final class SpeechNotification extends GeneratedMessageV3 implements SpeechNotificationOrBuilder {
        private static final SpeechNotification DEFAULT_INSTANCE = new SpeechNotification();

        @Deprecated
        public static final Parser<SpeechNotification> PARSER = new AbstractParser<SpeechNotification>() { // from class: com.garmin.proto.generated.GDIAudioPromptsProto.SpeechNotification.1
            @Override // com.google.protobuf.Parser
            public SpeechNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SpeechNotification.newBuilder();
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
        public static final int SPEECH_TYPE_FIELD_NUMBER = 1;
        public static final int TEXT_TO_SPEAK_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int speechType_;
        private volatile Object textToSpeak_;

        private SpeechNotification() {
            this.speechType_ = 0;
            this.textToSpeak_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.speechType_ = 0;
            this.textToSpeak_ = "";
        }

        public static SpeechNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SpeechNotification_descriptor;
        }

        public static Builder newBuilder(SpeechNotification speechNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(speechNotification);
        }

        public static SpeechNotification parseDelimitedFrom(InputStream inputStream) {
            return (SpeechNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SpeechNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SpeechNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SpeechNotification)) {
                return super.equals(obj);
            }
            SpeechNotification speechNotification = (SpeechNotification) obj;
            if (hasSpeechType() != speechNotification.hasSpeechType()) {
                return false;
            }
            if ((!hasSpeechType() || this.speechType_ == speechNotification.speechType_) && hasTextToSpeak() == speechNotification.hasTextToSpeak()) {
                return (!hasTextToSpeak() || getTextToSpeak().equals(speechNotification.getTextToSpeak())) && getUnknownFields().equals(speechNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SpeechNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.speechType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += GeneratedMessageV3.computeStringSize(2, this.textToSpeak_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeechNotificationOrBuilder
        public SpeechType getSpeechType() {
            SpeechType speechTypeForNumber = SpeechType.forNumber(this.speechType_);
            return speechTypeForNumber == null ? SpeechType.UNKNOWN : speechTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeechNotificationOrBuilder
        public String getTextToSpeak() {
            Object obj = this.textToSpeak_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.textToSpeak_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeechNotificationOrBuilder
        public ByteString getTextToSpeakBytes() {
            Object obj = this.textToSpeak_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.textToSpeak_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeechNotificationOrBuilder
        public boolean hasSpeechType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeechNotificationOrBuilder
        public boolean hasTextToSpeak() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSpeechType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.speechType_;
            }
            if (hasTextToSpeak()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTextToSpeak().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SpeechNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SpeechNotification.class, Builder.class);
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
            return new SpeechNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.speechType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.textToSpeak_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* JADX INFO: loaded from: classes10.dex */
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SpeechNotificationOrBuilder {
            private int bitField0_;
            private int speechType_;
            private Object textToSpeak_;

            private Builder() {
                this.speechType_ = 0;
                this.textToSpeak_ = "";
            }

            private void buildPartial0(SpeechNotification speechNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    speechNotification.speechType_ = this.speechType_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    speechNotification.textToSpeak_ = this.textToSpeak_;
                    i14 |= 2;
                }
                speechNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SpeechNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SpeechNotification build() {
                SpeechNotification speechNotificationBuildPartial = buildPartial();
                if (speechNotificationBuildPartial.isInitialized()) {
                    return speechNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) speechNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SpeechNotification buildPartial() {
                SpeechNotification speechNotification = new SpeechNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(speechNotification);
                }
                onBuilt();
                return speechNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.speechType_ = 0;
                this.textToSpeak_ = "";
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

            public Builder clearSpeechType() {
                this.bitField0_ &= -2;
                this.speechType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTextToSpeak() {
                this.textToSpeak_ = SpeechNotification.getDefaultInstance().getTextToSpeak();
                this.bitField0_ &= -3;
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
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SpeechNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeechNotificationOrBuilder
            public SpeechType getSpeechType() {
                SpeechType speechTypeForNumber = SpeechType.forNumber(this.speechType_);
                return speechTypeForNumber == null ? SpeechType.UNKNOWN : speechTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeechNotificationOrBuilder
            public String getTextToSpeak() {
                Object obj = this.textToSpeak_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.textToSpeak_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeechNotificationOrBuilder
            public ByteString getTextToSpeakBytes() {
                Object obj = this.textToSpeak_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.textToSpeak_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeechNotificationOrBuilder
            public boolean hasSpeechType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeechNotificationOrBuilder
            public boolean hasTextToSpeak() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SpeechNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SpeechNotification.class, Builder.class);
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
                                    int i14 = codedInputStream.readEnum();
                                    if (SpeechType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.speechType_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    this.textToSpeak_ = codedInputStream.readBytes();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSpeechType(SpeechType speechType) {
                speechType.getClass();
                this.bitField0_ |= 1;
                this.speechType_ = speechType.getNumber();
                onChanged();
                return this;
            }

            public Builder setTextToSpeak(String str) {
                str.getClass();
                this.textToSpeak_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTextToSpeakBytes(ByteString byteString) {
                byteString.getClass();
                this.textToSpeak_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SpeechNotification getDefaultInstanceForType() {
                return SpeechNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.speechType_ = 0;
                this.textToSpeak_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SpeechNotification) {
                    return mergeFrom((SpeechNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SpeechNotification speechNotification) {
                if (speechNotification == SpeechNotification.getDefaultInstance()) {
                    return this;
                }
                if (speechNotification.hasSpeechType()) {
                    setSpeechType(speechNotification.getSpeechType());
                }
                if (speechNotification.hasTextToSpeak()) {
                    this.textToSpeak_ = speechNotification.textToSpeak_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(speechNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SpeechNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SpeechNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SpeechNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SpeechNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SpeechNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SpeechNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SpeechNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SpeechNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SpeechNotification parseFrom(InputStream inputStream) {
            return (SpeechNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SpeechNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SpeechNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private SpeechNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.speechType_ = 0;
            this.textToSpeak_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SpeechNotification parseFrom(CodedInputStream codedInputStream) {
            return (SpeechNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SpeechNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SpeechNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ SpeechNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class SpeedNotification extends GeneratedMessageV3 implements SpeedNotificationOrBuilder {
        public static final int AUDIO_PROMPT_LANGUAGE_FIELD_NUMBER = 5;
        public static final int AVERAGE_SPEED_FIELD_NUMBER = 1;
        public static final int CURRENT_SPEED_FIELD_NUMBER = 2;
        public static final int DEVICE_IS_DISPLAYING_METRIC_UNITS_FIELD_NUMBER = 4;
        public static final int LAP_SPEED_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private Language audioPromptLanguage_;
        private float averageSpeed_;
        private int bitField0_;
        private float currentSpeed_;
        private boolean deviceIsDisplayingMetricUnits_;
        private float lapSpeed_;
        private byte memoizedIsInitialized;
        private static final SpeedNotification DEFAULT_INSTANCE = new SpeedNotification();

        @Deprecated
        public static final Parser<SpeedNotification> PARSER = new AbstractParser<SpeedNotification>() { // from class: com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotification.1
            @Override // com.google.protobuf.Parser
            public SpeedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SpeedNotification.newBuilder();
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

        private SpeedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.averageSpeed_ = 0.0f;
            this.currentSpeed_ = 0.0f;
            this.lapSpeed_ = 0.0f;
            this.deviceIsDisplayingMetricUnits_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SpeedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SpeedNotification_descriptor;
        }

        public static Builder newBuilder(SpeedNotification speedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(speedNotification);
        }

        public static SpeedNotification parseDelimitedFrom(InputStream inputStream) {
            return (SpeedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SpeedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SpeedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SpeedNotification)) {
                return super.equals(obj);
            }
            SpeedNotification speedNotification = (SpeedNotification) obj;
            if (hasAverageSpeed() != speedNotification.hasAverageSpeed()) {
                return false;
            }
            if ((hasAverageSpeed() && Float.floatToIntBits(getAverageSpeed()) != Float.floatToIntBits(speedNotification.getAverageSpeed())) || hasCurrentSpeed() != speedNotification.hasCurrentSpeed()) {
                return false;
            }
            if ((hasCurrentSpeed() && Float.floatToIntBits(getCurrentSpeed()) != Float.floatToIntBits(speedNotification.getCurrentSpeed())) || hasLapSpeed() != speedNotification.hasLapSpeed()) {
                return false;
            }
            if ((hasLapSpeed() && Float.floatToIntBits(getLapSpeed()) != Float.floatToIntBits(speedNotification.getLapSpeed())) || hasDeviceIsDisplayingMetricUnits() != speedNotification.hasDeviceIsDisplayingMetricUnits()) {
                return false;
            }
            if ((!hasDeviceIsDisplayingMetricUnits() || getDeviceIsDisplayingMetricUnits() == speedNotification.getDeviceIsDisplayingMetricUnits()) && hasAudioPromptLanguage() == speedNotification.hasAudioPromptLanguage()) {
                return (!hasAudioPromptLanguage() || getAudioPromptLanguage().equals(speedNotification.getAudioPromptLanguage())) && getUnknownFields().equals(speedNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
        public Language getAudioPromptLanguage() {
            Language language = this.audioPromptLanguage_;
            return language == null ? Language.getDefaultInstance() : language;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
        public LanguageOrBuilder getAudioPromptLanguageOrBuilder() {
            Language language = this.audioPromptLanguage_;
            return language == null ? Language.getDefaultInstance() : language;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
        public float getAverageSpeed() {
            return this.averageSpeed_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
        public float getCurrentSpeed() {
            return this.currentSpeed_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
        public boolean getDeviceIsDisplayingMetricUnits() {
            return this.deviceIsDisplayingMetricUnits_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
        public float getLapSpeed() {
            return this.lapSpeed_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SpeedNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeFloatSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFloatSize(1, this.averageSpeed_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(2, this.currentSpeed_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(3, this.lapSpeed_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeFloatSize += CodedOutputStream.computeBoolSize(4, this.deviceIsDisplayingMetricUnits_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeFloatSize += CodedOutputStream.computeMessageSize(5, getAudioPromptLanguage());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeFloatSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
        public boolean hasAudioPromptLanguage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
        public boolean hasAverageSpeed() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
        public boolean hasCurrentSpeed() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
        public boolean hasDeviceIsDisplayingMetricUnits() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
        public boolean hasLapSpeed() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAverageSpeed()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Float.floatToIntBits(getAverageSpeed());
            }
            if (hasCurrentSpeed()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getCurrentSpeed());
            }
            if (hasLapSpeed()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Float.floatToIntBits(getLapSpeed());
            }
            if (hasDeviceIsDisplayingMetricUnits()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getDeviceIsDisplayingMetricUnits());
            }
            if (hasAudioPromptLanguage()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getAudioPromptLanguage().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SpeedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SpeedNotification.class, Builder.class);
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
            if (!hasDeviceIsDisplayingMetricUnits()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasAudioPromptLanguage() || getAudioPromptLanguage().isInitialized()) {
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
            return new SpeedNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeFloat(1, this.averageSpeed_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.currentSpeed_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeFloat(3, this.lapSpeed_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.deviceIsDisplayingMetricUnits_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getAudioPromptLanguage());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SpeedNotificationOrBuilder {
            private SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> audioPromptLanguageBuilder_;
            private Language audioPromptLanguage_;
            private float averageSpeed_;
            private int bitField0_;
            private float currentSpeed_;
            private boolean deviceIsDisplayingMetricUnits_;
            private float lapSpeed_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SpeedNotification speedNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    speedNotification.averageSpeed_ = this.averageSpeed_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    speedNotification.currentSpeed_ = this.currentSpeed_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    speedNotification.lapSpeed_ = this.lapSpeed_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    speedNotification.deviceIsDisplayingMetricUnits_ = this.deviceIsDisplayingMetricUnits_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                    speedNotification.audioPromptLanguage_ = singleFieldBuilderV3 == null ? this.audioPromptLanguage_ : (Language) singleFieldBuilderV3.build();
                    i14 |= 16;
                }
                speedNotification.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> getAudioPromptLanguageFieldBuilder() {
                if (this.audioPromptLanguageBuilder_ == null) {
                    this.audioPromptLanguageBuilder_ = new SingleFieldBuilderV3<>(getAudioPromptLanguage(), getParentForChildren(), isClean());
                    this.audioPromptLanguage_ = null;
                }
                return this.audioPromptLanguageBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SpeedNotification_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getAudioPromptLanguageFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SpeedNotification build() {
                SpeedNotification speedNotificationBuildPartial = buildPartial();
                if (speedNotificationBuildPartial.isInitialized()) {
                    return speedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) speedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SpeedNotification buildPartial() {
                SpeedNotification speedNotification = new SpeedNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(speedNotification);
                }
                onBuilt();
                return speedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.averageSpeed_ = 0.0f;
                this.currentSpeed_ = 0.0f;
                this.lapSpeed_ = 0.0f;
                this.deviceIsDisplayingMetricUnits_ = false;
                this.audioPromptLanguage_ = null;
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.audioPromptLanguageBuilder_ = null;
                }
                return this;
            }

            public Builder clearAudioPromptLanguage() {
                this.bitField0_ &= -17;
                this.audioPromptLanguage_ = null;
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.audioPromptLanguageBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAverageSpeed() {
                this.bitField0_ &= -2;
                this.averageSpeed_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearCurrentSpeed() {
                this.bitField0_ &= -3;
                this.currentSpeed_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearDeviceIsDisplayingMetricUnits() {
                this.bitField0_ &= -9;
                this.deviceIsDisplayingMetricUnits_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLapSpeed() {
                this.bitField0_ &= -5;
                this.lapSpeed_ = 0.0f;
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

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
            public Language getAudioPromptLanguage() {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Language) singleFieldBuilderV3.getMessage();
                }
                Language language = this.audioPromptLanguage_;
                return language == null ? Language.getDefaultInstance() : language;
            }

            public Language.Builder getAudioPromptLanguageBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (Language.Builder) getAudioPromptLanguageFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
            public LanguageOrBuilder getAudioPromptLanguageOrBuilder() {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LanguageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Language language = this.audioPromptLanguage_;
                return language == null ? Language.getDefaultInstance() : language;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
            public float getAverageSpeed() {
                return this.averageSpeed_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
            public float getCurrentSpeed() {
                return this.currentSpeed_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SpeedNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
            public boolean getDeviceIsDisplayingMetricUnits() {
                return this.deviceIsDisplayingMetricUnits_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
            public float getLapSpeed() {
                return this.lapSpeed_;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
            public boolean hasAudioPromptLanguage() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
            public boolean hasAverageSpeed() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
            public boolean hasCurrentSpeed() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
            public boolean hasDeviceIsDisplayingMetricUnits() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SpeedNotificationOrBuilder
            public boolean hasLapSpeed() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SpeedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SpeedNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasDeviceIsDisplayingMetricUnits()) {
                    return !hasAudioPromptLanguage() || getAudioPromptLanguage().isInitialized();
                }
                return false;
            }

            public Builder mergeAudioPromptLanguage(Language language) {
                Language language2;
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(language);
                } else if ((this.bitField0_ & 16) == 0 || (language2 = this.audioPromptLanguage_) == null || language2 == Language.getDefaultInstance()) {
                    this.audioPromptLanguage_ = language;
                } else {
                    getAudioPromptLanguageBuilder().mergeFrom(language);
                }
                if (this.audioPromptLanguage_ != null) {
                    this.bitField0_ |= 16;
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
                                if (tag == 13) {
                                    this.averageSpeed_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.currentSpeed_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 2;
                                } else if (tag == 29) {
                                    this.lapSpeed_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.deviceIsDisplayingMetricUnits_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getAudioPromptLanguageFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
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

            public Builder setAudioPromptLanguage(Language.Builder builder) {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.audioPromptLanguage_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setAverageSpeed(float f14) {
                this.averageSpeed_ = f14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCurrentSpeed(float f14) {
                this.currentSpeed_ = f14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setDeviceIsDisplayingMetricUnits(boolean z14) {
                this.deviceIsDisplayingMetricUnits_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLapSpeed(float f14) {
                this.lapSpeed_ = f14;
                this.bitField0_ |= 4;
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
            public SpeedNotification getDefaultInstanceForType() {
                return SpeedNotification.getDefaultInstance();
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

            public Builder setAudioPromptLanguage(Language language) {
                SingleFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> singleFieldBuilderV3 = this.audioPromptLanguageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    language.getClass();
                    this.audioPromptLanguage_ = language;
                } else {
                    singleFieldBuilderV3.setMessage(language);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SpeedNotification) {
                    return mergeFrom((SpeedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SpeedNotification speedNotification) {
                if (speedNotification == SpeedNotification.getDefaultInstance()) {
                    return this;
                }
                if (speedNotification.hasAverageSpeed()) {
                    setAverageSpeed(speedNotification.getAverageSpeed());
                }
                if (speedNotification.hasCurrentSpeed()) {
                    setCurrentSpeed(speedNotification.getCurrentSpeed());
                }
                if (speedNotification.hasLapSpeed()) {
                    setLapSpeed(speedNotification.getLapSpeed());
                }
                if (speedNotification.hasDeviceIsDisplayingMetricUnits()) {
                    setDeviceIsDisplayingMetricUnits(speedNotification.getDeviceIsDisplayingMetricUnits());
                }
                if (speedNotification.hasAudioPromptLanguage()) {
                    mergeAudioPromptLanguage(speedNotification.getAudioPromptLanguage());
                }
                mergeUnknownFields(speedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SpeedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SpeedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SpeedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SpeedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SpeedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SpeedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SpeedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SpeedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SpeedNotification parseFrom(InputStream inputStream) {
            return (SpeedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SpeedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SpeedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ SpeedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SpeedNotification() {
            this.averageSpeed_ = 0.0f;
            this.currentSpeed_ = 0.0f;
            this.lapSpeed_ = 0.0f;
            this.deviceIsDisplayingMetricUnits_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SpeedNotification parseFrom(CodedInputStream codedInputStream) {
            return (SpeedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SpeedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SpeedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    public static final class SupportedLanguagesResponse extends GeneratedMessageV3 implements SupportedLanguagesResponseOrBuilder {
        public static final int LANGUAGES_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<Language> languages_;
        private byte memoizedIsInitialized;
        private static final SupportedLanguagesResponse DEFAULT_INSTANCE = new SupportedLanguagesResponse();

        @Deprecated
        public static final Parser<SupportedLanguagesResponse> PARSER = new AbstractParser<SupportedLanguagesResponse>() { // from class: com.garmin.proto.generated.GDIAudioPromptsProto.SupportedLanguagesResponse.1
            @Override // com.google.protobuf.Parser
            public SupportedLanguagesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SupportedLanguagesResponse.newBuilder();
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

        private SupportedLanguagesResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.languages_ = Collections.EMPTY_LIST;
        }

        public static SupportedLanguagesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SupportedLanguagesResponse_descriptor;
        }

        public static Builder newBuilder(SupportedLanguagesResponse supportedLanguagesResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(supportedLanguagesResponse);
        }

        public static SupportedLanguagesResponse parseDelimitedFrom(InputStream inputStream) {
            return (SupportedLanguagesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SupportedLanguagesResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SupportedLanguagesResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SupportedLanguagesResponse)) {
                return super.equals(obj);
            }
            SupportedLanguagesResponse supportedLanguagesResponse = (SupportedLanguagesResponse) obj;
            return getLanguagesList().equals(supportedLanguagesResponse.getLanguagesList()) && getUnknownFields().equals(supportedLanguagesResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SupportedLanguagesResponseOrBuilder
        public Language getLanguages(int i14) {
            return this.languages_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SupportedLanguagesResponseOrBuilder
        public int getLanguagesCount() {
            return this.languages_.size();
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SupportedLanguagesResponseOrBuilder
        public List<Language> getLanguagesList() {
            return this.languages_;
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SupportedLanguagesResponseOrBuilder
        public LanguageOrBuilder getLanguagesOrBuilder(int i14) {
            return this.languages_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SupportedLanguagesResponseOrBuilder
        public List<? extends LanguageOrBuilder> getLanguagesOrBuilderList() {
            return this.languages_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SupportedLanguagesResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.languages_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.languages_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
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
            if (getLanguagesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getLanguagesList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SupportedLanguagesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedLanguagesResponse.class, Builder.class);
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
            for (int i14 = 0; i14 < getLanguagesCount(); i14++) {
                if (!getLanguages(i14).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
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
            return new SupportedLanguagesResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.languages_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.languages_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SupportedLanguagesResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> languagesBuilder_;
            private List<Language> languages_;

            private Builder() {
                this.languages_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(SupportedLanguagesResponse supportedLanguagesResponse) {
            }

            private void buildPartialRepeatedFields(SupportedLanguagesResponse supportedLanguagesResponse) {
                RepeatedFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> repeatedFieldBuilderV3 = this.languagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    supportedLanguagesResponse.languages_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.languages_ = Collections.unmodifiableList(this.languages_);
                    this.bitField0_ &= -2;
                }
                supportedLanguagesResponse.languages_ = this.languages_;
            }

            private void ensureLanguagesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.languages_ = new ArrayList(this.languages_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SupportedLanguagesResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> getLanguagesFieldBuilder() {
                if (this.languagesBuilder_ == null) {
                    this.languagesBuilder_ = new RepeatedFieldBuilderV3<>(this.languages_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.languages_ = null;
                }
                return this.languagesBuilder_;
            }

            public Builder addAllLanguages(Iterable<? extends Language> iterable) {
                RepeatedFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> repeatedFieldBuilderV3 = this.languagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureLanguagesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.languages_);
                onChanged();
                return this;
            }

            public Builder addLanguages(Language.Builder builder) {
                RepeatedFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> repeatedFieldBuilderV3 = this.languagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureLanguagesIsMutable();
                this.languages_.add(builder.build());
                onChanged();
                return this;
            }

            public Language.Builder addLanguagesBuilder() {
                return (Language.Builder) getLanguagesFieldBuilder().addBuilder(Language.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SupportedLanguagesResponse build() {
                SupportedLanguagesResponse supportedLanguagesResponseBuildPartial = buildPartial();
                if (supportedLanguagesResponseBuildPartial.isInitialized()) {
                    return supportedLanguagesResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) supportedLanguagesResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SupportedLanguagesResponse buildPartial() {
                SupportedLanguagesResponse supportedLanguagesResponse = new SupportedLanguagesResponse(this);
                buildPartialRepeatedFields(supportedLanguagesResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(supportedLanguagesResponse);
                }
                onBuilt();
                return supportedLanguagesResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> repeatedFieldBuilderV3 = this.languagesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.languages_ = Collections.EMPTY_LIST;
                } else {
                    this.languages_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLanguages() {
                RepeatedFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> repeatedFieldBuilderV3 = this.languagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.languages_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SupportedLanguagesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SupportedLanguagesResponseOrBuilder
            public Language getLanguages(int i14) {
                RepeatedFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> repeatedFieldBuilderV3 = this.languagesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.languages_.get(i14) : (Language) repeatedFieldBuilderV3.getMessage(i14);
            }

            public Language.Builder getLanguagesBuilder(int i14) {
                return (Language.Builder) getLanguagesFieldBuilder().getBuilder(i14);
            }

            public List<Language.Builder> getLanguagesBuilderList() {
                return getLanguagesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SupportedLanguagesResponseOrBuilder
            public int getLanguagesCount() {
                RepeatedFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> repeatedFieldBuilderV3 = this.languagesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.languages_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SupportedLanguagesResponseOrBuilder
            public List<Language> getLanguagesList() {
                RepeatedFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> repeatedFieldBuilderV3 = this.languagesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.languages_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SupportedLanguagesResponseOrBuilder
            public LanguageOrBuilder getLanguagesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> repeatedFieldBuilderV3 = this.languagesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.languages_.get(i14) : (LanguageOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIAudioPromptsProto.SupportedLanguagesResponseOrBuilder
            public List<? extends LanguageOrBuilder> getLanguagesOrBuilderList() {
                RepeatedFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> repeatedFieldBuilderV3 = this.languagesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.languages_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAudioPromptsProto.internal_static_GDI_Proto_AudioPrompts_SupportedLanguagesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedLanguagesResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getLanguagesCount(); i14++) {
                    if (!getLanguages(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(SupportedLanguagesResponse supportedLanguagesResponse) {
                if (supportedLanguagesResponse == SupportedLanguagesResponse.getDefaultInstance()) {
                    return this;
                }
                if (this.languagesBuilder_ == null) {
                    if (!supportedLanguagesResponse.languages_.isEmpty()) {
                        if (this.languages_.isEmpty()) {
                            this.languages_ = supportedLanguagesResponse.languages_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureLanguagesIsMutable();
                            this.languages_.addAll(supportedLanguagesResponse.languages_);
                        }
                        onChanged();
                    }
                } else if (!supportedLanguagesResponse.languages_.isEmpty()) {
                    boolean zIsEmpty = this.languagesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> repeatedFieldBuilderV3 = this.languagesBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.languagesBuilder_ = null;
                        this.languages_ = supportedLanguagesResponse.languages_;
                        this.bitField0_ &= -2;
                        this.languagesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getLanguagesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(supportedLanguagesResponse.languages_);
                    }
                }
                mergeUnknownFields(supportedLanguagesResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeLanguages(int i14) {
                RepeatedFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> repeatedFieldBuilderV3 = this.languagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureLanguagesIsMutable();
                this.languages_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLanguages(int i14, Language.Builder builder) {
                RepeatedFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> repeatedFieldBuilderV3 = this.languagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureLanguagesIsMutable();
                this.languages_.set(i14, builder.build());
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
            public SupportedLanguagesResponse getDefaultInstanceForType() {
                return SupportedLanguagesResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.languages_ = Collections.EMPTY_LIST;
            }

            public Language.Builder addLanguagesBuilder(int i14) {
                return (Language.Builder) getLanguagesFieldBuilder().addBuilder(i14, Language.getDefaultInstance());
            }

            public Builder addLanguages(int i14, Language language) {
                RepeatedFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> repeatedFieldBuilderV3 = this.languagesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    language.getClass();
                    ensureLanguagesIsMutable();
                    this.languages_.add(i14, language);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, language);
                return this;
            }

            public Builder setLanguages(int i14, Language language) {
                RepeatedFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> repeatedFieldBuilderV3 = this.languagesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    language.getClass();
                    ensureLanguagesIsMutable();
                    this.languages_.set(i14, language);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, language);
                return this;
            }

            public Builder addLanguages(Language language) {
                RepeatedFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> repeatedFieldBuilderV3 = this.languagesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    language.getClass();
                    ensureLanguagesIsMutable();
                    this.languages_.add(language);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(language);
                return this;
            }

            public Builder addLanguages(int i14, Language.Builder builder) {
                RepeatedFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> repeatedFieldBuilderV3 = this.languagesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureLanguagesIsMutable();
                    this.languages_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SupportedLanguagesResponse) {
                    return mergeFrom((SupportedLanguagesResponse) message);
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
                                if (tag != 10) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    Language language = (Language) codedInputStream.readMessage(Language.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Language, Language.Builder, LanguageOrBuilder> repeatedFieldBuilderV3 = this.languagesBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureLanguagesIsMutable();
                                        this.languages_.add(language);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(language);
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
        public SupportedLanguagesResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SupportedLanguagesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedLanguagesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SupportedLanguagesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SupportedLanguagesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SupportedLanguagesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SupportedLanguagesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SupportedLanguagesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ SupportedLanguagesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SupportedLanguagesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SupportedLanguagesResponse parseFrom(InputStream inputStream) {
            return (SupportedLanguagesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SupportedLanguagesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedLanguagesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SupportedLanguagesResponse parseFrom(CodedInputStream codedInputStream) {
            return (SupportedLanguagesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SupportedLanguagesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedLanguagesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    /* JADX INFO: loaded from: classes10.dex */
    public enum SpeechType implements ProtocolMessageEnum {
        UNKNOWN(0),
        NAVIGATION(1);

        public static final int NAVIGATION_VALUE = 1;
        public static final int UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<SpeechType> internalValueMap = new Internal.EnumLiteMap<SpeechType>() { // from class: com.garmin.proto.generated.GDIAudioPromptsProto.SpeechType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SpeechType findValueByNumber(int i14) {
                return SpeechType.forNumber(i14);
            }
        };
        private static final SpeechType[] VALUES = values();

        SpeechType(int i14) {
            this.value = i14;
        }

        public static SpeechType forNumber(int i14) {
            if (i14 == 0) {
                return UNKNOWN;
            }
            if (i14 != 1) {
                return null;
            }
            return NAVIGATION;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIAudioPromptsProto.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<SpeechType> internalGetValueMap() {
            return internalValueMap;
        }

        public static SpeechType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static SpeechType valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
