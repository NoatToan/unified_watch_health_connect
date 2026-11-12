package com.garmin.android.ancs;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.util.EnumSet;
import v.e0;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ANCSMessageBase {

    public enum ActionID {
        POSITIVE((byte) 0),
        NEGATIVE((byte) 1);


        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final byte f28615id;

        ActionID(byte b14) {
            this.f28615id = b14;
        }

        public static ActionID fromId(byte b14) {
            for (ActionID actionID : values()) {
                if (actionID.f28615id == b14) {
                    return actionID;
                }
            }
            h.s(e0.f(b14, "unsupported ActionID byte [", "]"));
            return null;
        }
    }

    public enum AncsError {
        NO_ERROR(0),
        UNKNOWN_ANCS_COMMAND(SyslogConstants.LOG_LOCAL4),
        INVALID_ANCS_COMMAND(161),
        INVALID_ANCS_PARAMETER(162);

        public final byte value;

        AncsError(int i14) {
            this.value = (byte) i14;
        }
    }

    public enum AppAttributeID {
        DISPLAY_NAME((byte) 0);


        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final byte f28616id;

        AppAttributeID(byte b14) {
            this.f28616id = b14;
        }

        public static AppAttributeID fromId(byte b14) {
            for (AppAttributeID appAttributeID : values()) {
                if (appAttributeID.f28616id == b14) {
                    return appAttributeID;
                }
            }
            h.s(e0.f(b14, "unsupported AppAttributeID byte [", "]"));
            return null;
        }
    }

    public enum CategoryID {
        OTHER((byte) 0),
        INCOMING_CALL((byte) 1),
        MISSED_CALL((byte) 2),
        VOICEMAIL((byte) 3),
        SOCIAL((byte) 4),
        SCHEDULE((byte) 5),
        EMAIL((byte) 6),
        NEWS((byte) 7),
        HEALTH_AND_FITNESS((byte) 8),
        BUSINESS_AND_FINANCE((byte) 9),
        LOCATION((byte) 10),
        ENTERTAINMENT(Ascii.VT),
        SMS(Ascii.FF);


        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final byte f28617id;

        CategoryID(byte b14) {
            this.f28617id = b14;
        }

        public static CategoryID fromId(byte b14) {
            for (CategoryID categoryID : values()) {
                if (categoryID.f28617id == b14) {
                    return categoryID;
                }
            }
            h.s(e0.f(b14, "unsupported CategoryID byte [", "]"));
            return null;
        }
    }

    public enum CommandID {
        GET_NOTIFICATION_ATTRIBUTES((byte) 0),
        GET_APP_ATTRIBUTES((byte) 1),
        PERFORM_NOTIFICATION_ACTION((byte) 2),
        PERFORM_ANDROID_ACTION(UnsignedBytes.MAX_POWER_OF_TWO);


        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final byte f28618id;

        CommandID(byte b14) {
            this.f28618id = b14;
        }

        public static CommandID fromId(byte b14) {
            for (CommandID commandID : values()) {
                if (commandID.f28618id == b14) {
                    return commandID;
                }
            }
            h.s(e0.f(b14, "unsupported CommandID byte [", "]"));
            return null;
        }
    }

    public enum EventFlag {
        SILENT((byte) 1),
        IMPORTANT((byte) 2),
        PRE_EXISTING((byte) 4),
        POSITIVE_ACTION((byte) 8),
        NEGATIVE_ACTION(Ascii.DLE);

        public final byte flag;

        EventFlag(byte b14) {
            this.flag = b14;
        }

        public static EnumSet<EventFlag> fromFlags(byte b14) {
            EnumSet<EventFlag> enumSetNoneOf = EnumSet.noneOf(EventFlag.class);
            for (EventFlag eventFlag : values()) {
                byte b15 = eventFlag.flag;
                if ((b15 & b14) == b15) {
                    enumSetNoneOf.add(eventFlag);
                }
            }
            return enumSetNoneOf;
        }
    }

    public enum EventID {
        NOTIFICATION_ADDED((byte) 0),
        NOTIFICATION_MODIFIED((byte) 1),
        NOTIFICATION_REMOVED((byte) 2);


        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final byte f28619id;

        EventID(byte b14) {
            this.f28619id = b14;
        }

        public static EventID fromId(byte b14) {
            for (EventID eventID : values()) {
                if (eventID.f28619id == b14) {
                    return eventID;
                }
            }
            h.s(e0.f(b14, "unsupported EventID byte [", "]"));
            return null;
        }
    }

    public enum FeatureFlag {
        PHONE_NUMBER_AVAILABLE((byte) 1),
        HAS_ANDROID_ACTIONS((byte) 2),
        HAS_MEDIA((byte) 4);

        public final byte flag;

        FeatureFlag(byte b14) {
            this.flag = b14;
        }

        public static EnumSet<FeatureFlag> fromFlags(int i14) {
            EnumSet<FeatureFlag> enumSetNoneOf = EnumSet.noneOf(FeatureFlag.class);
            for (FeatureFlag featureFlag : values()) {
                byte b14 = featureFlag.flag;
                if ((b14 & i14) == b14) {
                    enumSetNoneOf.add(featureFlag);
                }
            }
            return enumSetNoneOf;
        }
    }

    public enum NotificationAttributeID {
        APP_IDENTIFIER((byte) 0),
        TITLE((byte) 1),
        SUBTITLE((byte) 2),
        MESSAGE((byte) 3),
        MESSAGE_SIZE((byte) 4),
        DATE((byte) 5),
        POSITIVE_ACTION_LABEL((byte) 6),
        NEGATIVE_ACTION_LABEL((byte) 7),
        PHONE_NUMBER((byte) 126),
        ACTIONS(Ascii.DEL),
        MEDIA_OBJECT_COUNT(UnsignedBytes.MAX_POWER_OF_TWO),
        CONVERSATION_ID((byte) -127);


        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final byte f28620id;

        NotificationAttributeID(byte b14) {
            this.f28620id = b14;
        }

        public static NotificationAttributeID fromId(byte b14) {
            for (NotificationAttributeID notificationAttributeID : values()) {
                if (notificationAttributeID.f28620id == b14) {
                    return notificationAttributeID;
                }
            }
            h.s(e0.f(b14, "unsupported NotificationAttributeID byte [", "]"));
            return null;
        }
    }

    public static byte getByte(byte[] bArr, int i14) {
        return bArr[i14];
    }

    public static byte[] getBytes(byte[] bArr, int i14, int i15) {
        byte[] bArr2 = new byte[i15];
        System.arraycopy(bArr, i14, bArr2, 0, i15);
        return bArr2;
    }

    public static int getInt(byte[] bArr, int i14) {
        return ((bArr[i14 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i14] & UnsignedBytes.MAX_VALUE) | ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i14 + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public static short getShort(byte[] bArr, int i14) {
        return (short) (((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[i14] & UnsignedBytes.MAX_VALUE));
    }

    public static String getString(byte[] bArr, int i14) {
        int i15 = 0;
        while (true) {
            int i16 = i15 + i14;
            if (i16 >= bArr.length || bArr[i16] == 0) {
                break;
            }
            i15++;
        }
        return new String(bArr, i14, i15, Charset.defaultCharset());
    }

    public static void putByte(byte[] bArr, int i14, byte b14) {
        bArr[i14] = b14;
    }

    public static void putBytes(byte[] bArr, int i14, byte[] bArr2) {
        if (bArr2.length > 0) {
            System.arraycopy(bArr2, 0, bArr, i14, bArr2.length);
        }
    }

    public static void putInt(byte[] bArr, int i14, int i15) {
        bArr[i14] = (byte) i15;
        bArr[i14 + 1] = (byte) (i15 >> 8);
        bArr[i14 + 2] = (byte) (i15 >> 16);
        bArr[i14 + 3] = (byte) (i15 >> 24);
    }

    public static void putShort(byte[] bArr, int i14, short s8) {
        bArr[i14] = (byte) s8;
        bArr[i14 + 1] = (byte) (s8 >> 8);
    }

    public static int putString(byte[] bArr, int i14, String str) {
        byte[] bytes = str.getBytes();
        putBytes(bArr, i14, bytes);
        bArr[i14 + bytes.length] = 0;
        return bytes.length + 1;
    }

    public abstract byte[] serialize();

    public abstract int size();
}
