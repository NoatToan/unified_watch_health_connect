package com.garmin.android.gfdi.configuration;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Xml;
import gt2.b;
import gt2.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes8.dex */
public enum SupportedCapability implements Parcelable {
    CONNECT_MOBILE_FIT_LINK,
    GOLF_FIT_LINK,
    VIVOKID_JR_FIT_LINK,
    SYNC,
    DEVICE_INITIATES_SYNC,
    HOST_INITIATED_SYNC_REQUESTS,
    GNCS,
    ADVANCED_MUSIC_CONTROLS,
    FIND_MY_PHONE,
    FIND_MY_WATCH,
    CONNECTIQ_HTTP,
    CONNECTIQ_SETTINGS,
    CONNECTIQ_WATCH_APP_DOWNLOAD,
    CONNECTIQ_WIDGET_DOWNLOAD,
    CONNECTIQ_WATCH_FACE_DOWNLOAD,
    CONNECTIQ_DATA_FIELD_DOWNLOAD,
    CONNECTIQ_APP_MANAGEMENT,
    COURSE_DOWNLOAD,
    WORKOUT_DOWNLOAD,
    GOLF_COURSE_DOWNLOAD,
    DELTA_SOFTWARE_UPDATE_FILES,
    FITPAY,
    LIVETRACK,
    LIVETRACK_AUTO_START,
    LIVETRACK_MESSAGING,
    GROUP_LIVETRACK,
    WEATHER_CONDITIONS,
    WEATHER_ALERTS,
    GPS_EPHEMERIS_DOWNLOAD,
    EXPLICIT_ARCHIVE,
    SWING_SENSOR,
    SWING_SENSOR_REMOTE,
    INCIDENT_DETECTION,
    TRUEUP,
    INSTANT_INPUT,
    SEGMENTS,
    AUDIO_PROMPT_LAP,
    AUDIO_PROMPT_PACE_SPEED,
    AUDIO_PROMPT_HEART_RATE,
    AUDIO_PROMPT_POWER,
    AUDIO_PROMPT_NAVIGATION,
    AUDIO_PROMPT_CADENCE,
    SPORT_GENERIC,
    SPORT_RUNNING,
    SPORT_CYCLING,
    SPORT_TRANSITION,
    SPORT_FITNESS_EQUIPMENT,
    SPORT_SWIMMING,
    STOP_SYNC_AFTER_SOFTWARE_UPDATE,
    CALENDAR,
    WIFI_SETUP,
    SMS_NOTIFICATIONS,
    BASIC_MUSIC_CONTROLS,
    AUDIO_PROMPTS_SPEECH,
    DELTA_SOFTWARE_UPDATES,
    GARMIN_DEVICE_INFO_FILE_TYPE,
    SPORT_PROFILE_SETUP,
    HSA_SUPPORT,
    SPORT_STRENGTH,
    SPORT_CARDIO,
    UNION_PAY,
    IPASS,
    CIQ_AUDIO_CONTENT_PROVIDER,
    UNION_PAY_INTERNATIONAL,
    REQUEST_PAIR_FLOW,
    LOCATION_UPDATE,
    LTE_SUPPORT,
    DEVICE_DRIVEN_LIVETRACK_SUPPORT,
    CUSTOM_CANNED_TEXT_LIST_SUPPORT,
    EXPLORE_SYNC,
    INCIDENT_DETECT_AND_ASSISTANCE,
    CURRENT_TIME_REQUEST_SUPPORT,
    CONTACTS_SUPPORT,
    LAUNCH_REMOTE_CIQ_APP_SUPPORT,
    DEVICE_MESSAGES,
    WAYPOINT_TRANSFER,
    MULTI_LINK_SERVICE,
    OAUTH_CREDENTIALS,
    GOLF_9_PLUS_9,
    ANTI_THEFT_ALARM,
    INREACH,
    EVENT_SHARING,
    HSA_FEATURE_MESSAGE,
    HANDS_CALIBRATION,
    LOCATION_UPDATE_PROVIDER,
    LIVE_TRACK_COURSE_SHARING,
    SIMPLE_SETUP_FEATURE_LIST,
    WIND_DATA_APP_SUPPORT,
    HTTP_RAW_RESOURCE_REQUEST,
    SAMD,
    SYNC_2,
    NAVIGATION_SYNC,
    REALTIME_SETTINGS,
    HAND_CALIBRATION_IMG_DETECT;

    public static final Parcelable.Creator<SupportedCapability> CREATOR = new Parcelable.Creator<SupportedCapability>() { // from class: com.garmin.android.gfdi.configuration.SupportedCapability.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SupportedCapability createFromParcel(Parcel parcel) {
            return SupportedCapability.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SupportedCapability[] newArray(int i14) {
            return new SupportedCapability[i14];
        }
    };

    /* JADX WARN: Code duplicated, block: B:46:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.io.InputStream] */
    public static Set<SupportedCapability> loadAppCapabilities(Context context) throws Throwable {
        Throwable th3;
        Throwable e4;
        try {
            try {
                InputStream inputStreamOpen = context.getAssets().open("client_config.xml");
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
                    xmlPullParserNewPullParser.setInput(inputStreamOpen, null);
                    xmlPullParserNewPullParser.nextTag();
                    xmlPullParserNewPullParser.require(2, null, "config");
                    while (xmlPullParserNewPullParser.next() != 3) {
                        if (xmlPullParserNewPullParser.getEventType() == 2) {
                            if ("supported_capabilities".equals(xmlPullParserNewPullParser.getName())) {
                                EnumSet enumSet = XmlUtil.readEnumSet(xmlPullParserNewPullParser, "value", SupportedCapability.class);
                                if (inputStreamOpen != null) {
                                    try {
                                        inputStreamOpen.close();
                                    } catch (IOException unused) {
                                    }
                                }
                                return enumSet;
                            }
                            XmlUtil.skip(xmlPullParserNewPullParser);
                        }
                    }
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return Collections.EMPTY_SET;
                } catch (IOException e14) {
                    e4 = e14;
                    int i14 = c.f79010a;
                    b.f79005a.i("SupportedCapability").error("Failed to parse client_config.xml", e4);
                    throw new RuntimeException(e4);
                } catch (XmlPullParserException e15) {
                    e4 = e15;
                    int i15 = c.f79010a;
                    b.f79005a.i("SupportedCapability").error("Failed to parse client_config.xml", e4);
                    throw new RuntimeException(e4);
                }
            } catch (Throwable th4) {
                th3 = th4;
                if (context != 0) {
                    try {
                        context.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th3;
            }
        } catch (IOException e16) {
            e = e16;
            e4 = e;
            int i16 = c.f79010a;
            b.f79005a.i("SupportedCapability").error("Failed to parse client_config.xml", e4);
            throw new RuntimeException(e4);
        } catch (XmlPullParserException e17) {
            e = e17;
            e4 = e;
            int i17 = c.f79010a;
            b.f79005a.i("SupportedCapability").error("Failed to parse client_config.xml", e4);
            throw new RuntimeException(e4);
        } catch (Throwable th5) {
            th3 = th5;
            context = 0;
            if (context != 0) {
                context.close();
            }
            throw th3;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean hasBitSet(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        int iOrdinal = ordinal();
        int i14 = iOrdinal / 8;
        byte b14 = (byte) ((1 << (iOrdinal % 8)) & 255);
        return ((bArr.length <= i14 ? (byte) 0 : bArr[i14]) & b14) == b14;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(name());
    }
}
