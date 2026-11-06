# Garmin GFDI 5050 Configuration – Capability Bit Table

**Evidence grade:** [V] Verified  
**Source:** `rea inspect-android-method base.apk com.garmin.android.gfdi.configuration.SupportedCapability <clinit>` → `normalized_result.source.text` (41 264 bytes of smali, status=complete).  
**Reproduce:** `REA_JADX_MCP_JAR=~/.local/share/rea/android/jadx-headless-mcp-0.7.1-all.jar JAVA_HOME=/opt/homebrew/opt/openjdk@21 rea inspect-android-method .../garmin-analysis/bundle/base.apk com.garmin.android.gfdi.configuration.SupportedCapability '<clinit>'`

## 5050 Wire Format [V]

```
device→host (after GFDI session opens):
  [byteCount u8][bitmask byteCount bytes]  (little-endian, bit N = ordinal N)

host→device (in response to device 5050):
  [byteCount u8][bitmask byteCount bytes]  (host's capability set)
```

Bit encoding verified in `at2/a.java` onMessageReceived: `bArr[ordinal/8] & (1<<(ordinal%8))`.  
Host bitmask computed by `rs2.u.a(deviceCapabilities)` which intersects device capabilities with the app's declared set from `assets/client_config.xml`.

## SupportedCapability Enum Ordinals [V]

Extracted from `<clinit>` smali: each `new-instance SupportedCapability; const-string "<NAME>"; const/<w> <ordinal>; invoke-direct <init>(String,int)`.

| Bit | Name | In client_config.xml |
|-----|------|---------------------|
| 0 | CONNECT_MOBILE_FIT_LINK | ✓ |
| 1 | GOLF_FIT_LINK | |
| 2 | VIVOKID_JR_FIT_LINK | |
| 3 | SYNC | ✓ |
| 4 | DEVICE_INITIATES_SYNC | ✓ |
| 5 | HOST_INITIATED_SYNC_REQUESTS | ✓ |
| 6 | GNCS | ✓ |
| 7 | ADVANCED_MUSIC_CONTROLS | ✓ |
| 8 | FIND_MY_PHONE | ✓ |
| 9 | FIND_MY_WATCH | |
| 10 | CONNECTIQ_HTTP | ✓ |
| 11 | CONNECTIQ_SETTINGS | ✓ |
| 12 | CONNECTIQ_WATCH_APP_DOWNLOAD | ✓ |
| 13 | CONNECTIQ_WIDGET_DOWNLOAD | ✓ |
| 14 | CONNECTIQ_WATCH_FACE_DOWNLOAD | ✓ |
| 15 | CONNECTIQ_DATA_FIELD_DOWNLOAD | ✓ |
| 16 | CONNECTIQ_APP_MANAGEMENT | ✓ |
| 17 | COURSE_DOWNLOAD | ✓ |
| 18 | WORKOUT_DOWNLOAD | ✓ |
| 19 | GOLF_COURSE_DOWNLOAD | ✓ |
| 20 | DELTA_SOFTWARE_UPDATE_FILES | ✓ |
| 21 | FITPAY | |
| 22 | LIVETRACK | ✓ |
| 23 | LIVETRACK_AUTO_START | ✓ |
| 24 | LIVETRACK_MESSAGING | ✓ |
| 25 | GROUP_LIVETRACK | ✓ |
| 26 | WEATHER_CONDITIONS | ✓ |
| 27 | WEATHER_ALERTS | ✓ |
| 28 | GPS_EPHEMERIS_DOWNLOAD | ✓ |
| 29 | EXPLICIT_ARCHIVE | ✓ |
| 30 | SWING_SENSOR | ✓ |
| 31 | SWING_SENSOR_REMOTE | ✓ |
| 32 | INCIDENT_DETECTION | ✓ |
| 33 | TRUEUP | ✓ |
| 34 | INSTANT_INPUT | ✓ |
| 35 | SEGMENTS | ✓ |
| 36 | AUDIO_PROMPT_LAP | ✓ |
| 37 | AUDIO_PROMPT_PACE_SPEED | ✓ |
| 38 | AUDIO_PROMPT_HEART_RATE | ✓ |
| 39 | AUDIO_PROMPT_POWER | ✓ |
| 40 | AUDIO_PROMPT_NAVIGATION | ✓ |
| 41 | AUDIO_PROMPT_CADENCE | ✓ |
| 42 | SPORT_GENERIC | ✓ |
| 43 | SPORT_RUNNING | ✓ |
| 44 | SPORT_CYCLING | ✓ |
| 45 | SPORT_TRANSITION | ✓ |
| 46 | SPORT_FITNESS_EQUIPMENT | ✓ |
| 47 | SPORT_SWIMMING | ✓ |
| 48 | STOP_SYNC_AFTER_SOFTWARE_UPDATE | |
| 49 | CALENDAR | |
| 50 | WIFI_SETUP | ✓ |
| 51 | SMS_NOTIFICATIONS | ✓ |
| 52 | BASIC_MUSIC_CONTROLS | ✓ |
| 53 | AUDIO_PROMPTS_SPEECH | ✓ |
| 54 | DELTA_SOFTWARE_UPDATES | ✓ |
| 55 | GARMIN_DEVICE_INFO_FILE_TYPE | ✓ |
| 56 | SPORT_PROFILE_SETUP | |
| 57 | HSA_SUPPORT | |
| 58 | SPORT_STRENGTH | ✓ |
| 59 | SPORT_CARDIO | ✓ |
| 60 | UNION_PAY | |
| 61 | IPASS | |
| 62 | CIQ_AUDIO_CONTENT_PROVIDER | ✓ |
| 63 | UNION_PAY_INTERNATIONAL | ✓ |
| 64 | REQUEST_PAIR_FLOW | ✓ |
| 65 | LOCATION_UPDATE | ✓ |
| 66 | LTE_SUPPORT | ✓ |
| 67 | DEVICE_DRIVEN_LIVETRACK_SUPPORT | ✓ |
| 68 | CUSTOM_CANNED_TEXT_LIST_SUPPORT | ✓ |
| 69 | EXPLORE_SYNC | |
| 70 | INCIDENT_DETECT_AND_ASSISTANCE | ✓ |
| 71 | CURRENT_TIME_REQUEST_SUPPORT | ✓ |
| 72 | CONTACTS_SUPPORT | ✓ |
| 73 | LAUNCH_REMOTE_CIQ_APP_SUPPORT | |
| 74 | DEVICE_MESSAGES | ✓ |
| 75 | WAYPOINT_TRANSFER | |
| 76 | MULTI_LINK_SERVICE | |
| 77 | OAUTH_CREDENTIALS | ✓ |
| 78 | GOLF_9_PLUS_9 | |
| 79 | ANTI_THEFT_ALARM | ✓ |
| 80 | INREACH | |
| 81 | EVENT_SHARING | ✓ |
| 82 | HSA_FEATURE_MESSAGE | |
| 83 | HANDS_CALIBRATION | |
| 84 | LOCATION_UPDATE_PROVIDER | |
| 85 | LIVE_TRACK_COURSE_SHARING | |
| 86 | SIMPLE_SETUP_FEATURE_LIST | |
| 87 | WIND_DATA_APP_SUPPORT | |
| 88 | HTTP_RAW_RESOURCE_REQUEST | ✓ |
| 89 | SAMD | |
| 90 | SYNC_2 | |
| 91 | NAVIGATION_SYNC | |
| 92 | REALTIME_SETTINGS | |
| 93 | HAND_CALIBRATION_IMG_DETECT | |

## Minimum host capability set for health sync

The driver needs only bits the host actually implements. Recommended minimal set for a health-only driver:

| Bit | Name | Why |
|-----|------|-----|
| 0 | CONNECT_MOBILE_FIT_LINK | FIT file transfer |
| 3 | SYNC | bidirectional sync |
| 4 | DEVICE_INITIATES_SYNC | watch-initiated sync |
| 5 | HOST_INITIATED_SYNC_REQUESTS | app-initiated sync |
| 29 | EXPLICIT_ARCHIVE | mark files archived after download |
| 71 | CURRENT_TIME_REQUEST_SUPPORT | watch asks host for time (5052) |

The driver's current behaviour (mirror device bitmask) will advertise features like LIVETRACK, GNCS, weather etc. that the host does not handle. When the watch sends unsolicited messages for those features the driver must respond with ACK status=2 (UNKNOWN_OR_NOT_SUPPORTED); otherwise the watch may retry indefinitely.

## Note on `client_uuid`

`assets/client_config.xml` sets `<client_uuid>0x01</client_uuid>` — this is the ML `clientId` used in `REGISTER` commands. The same XML sets `<keep_alive_interval>25</keep_alive_interval>` (seconds).
