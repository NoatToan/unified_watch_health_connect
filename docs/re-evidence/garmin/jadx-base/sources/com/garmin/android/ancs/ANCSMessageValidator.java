package com.garmin.android.ancs;

import ih2.b;

/* JADX INFO: loaded from: classes7.dex */
public final class ANCSMessageValidator {
    private static final String TAG = "ANCSMessageValidator: ";

    /* JADX INFO: renamed from: com.garmin.android.ancs.ANCSMessageValidator$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$CommandID;

        static {
            int[] iArr = new int[ANCSMessageBase.CommandID.values().length];
            $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$CommandID = iArr;
            try {
                iArr[ANCSMessageBase.CommandID.GET_NOTIFICATION_ATTRIBUTES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$CommandID[ANCSMessageBase.CommandID.GET_APP_ATTRIBUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$CommandID[ANCSMessageBase.CommandID.PERFORM_NOTIFICATION_ACTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$CommandID[ANCSMessageBase.CommandID.PERFORM_ANDROID_ACTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static ANCSMessageBase.AncsError validateAppAttributes(byte[] bArr) {
        try {
            new ANCSGetAppAttributesRequest(bArr).dump();
            return ANCSMessageBase.AncsError.NO_ERROR;
        } catch (ANCSInvalidCommandException e4) {
            e = e4;
            b.a(e, "ANCSMessageValidator: validateAppAttributes()");
            return ANCSMessageBase.AncsError.INVALID_ANCS_COMMAND;
        } catch (ANCSInvalidFormatException e14) {
            e = e14;
            b.a(e, "ANCSMessageValidator: validateAppAttributes()");
            return ANCSMessageBase.AncsError.INVALID_ANCS_COMMAND;
        } catch (ANCSInvalidParameterException e15) {
            b.a(e15, "ANCSMessageValidator: validateAppAttributes()");
            return ANCSMessageBase.AncsError.INVALID_ANCS_PARAMETER;
        }
    }

    public static ANCSMessageBase.AncsError validateControlPointMessage(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return ANCSMessageBase.AncsError.UNKNOWN_ANCS_COMMAND;
        }
        try {
            int i14 = AnonymousClass1.$SwitchMap$com$garmin$android$ancs$ANCSMessageBase$CommandID[ANCSMessageBase.CommandID.fromId(bArr[0]).ordinal()];
            if (i14 == 1) {
                return validateNotificationAttributes(bArr);
            }
            if (i14 == 2) {
                return validateAppAttributes(bArr);
            }
            if (i14 != 3) {
                return i14 != 4 ? ANCSMessageBase.AncsError.UNKNOWN_ANCS_COMMAND : validatePerformAndroidAction(bArr);
            }
            return validatePerformNotificationAction(bArr);
        } catch (IllegalArgumentException unused) {
            return ANCSMessageBase.AncsError.UNKNOWN_ANCS_COMMAND;
        }
    }

    private static ANCSMessageBase.AncsError validateNotificationAttributes(byte[] bArr) {
        try {
            new ANCSGetNotificationAttributesRequest(bArr).dump();
            return ANCSMessageBase.AncsError.NO_ERROR;
        } catch (ANCSInvalidCommandException e4) {
            e = e4;
            b.a(e, "ANCSMessageValidator: validateNotificationAttributes()");
            return ANCSMessageBase.AncsError.INVALID_ANCS_COMMAND;
        } catch (ANCSInvalidFormatException e14) {
            e = e14;
            b.a(e, "ANCSMessageValidator: validateNotificationAttributes()");
            return ANCSMessageBase.AncsError.INVALID_ANCS_COMMAND;
        } catch (ANCSInvalidParameterException e15) {
            b.a(e15, "ANCSMessageValidator: validateNotificationAttributes()");
            return ANCSMessageBase.AncsError.INVALID_ANCS_PARAMETER;
        }
    }

    private static ANCSMessageBase.AncsError validatePerformAndroidAction(byte[] bArr) {
        try {
            new ANCSPerformAndroidAction(bArr).dump();
            return ANCSMessageBase.AncsError.NO_ERROR;
        } catch (ANCSInvalidCommandException | ANCSInvalidFormatException e4) {
            b.a(e4, "ANCSMessageValidator: validatePerformAndroidAction()");
            return ANCSMessageBase.AncsError.INVALID_ANCS_COMMAND;
        }
    }

    private static ANCSMessageBase.AncsError validatePerformNotificationAction(byte[] bArr) {
        try {
            new ANCSPerformNotificationAction(bArr).dump();
            return ANCSMessageBase.AncsError.NO_ERROR;
        } catch (ANCSInvalidCommandException | ANCSInvalidFormatException e4) {
            b.a(e4, "ANCSMessageValidator: validatePerformNotificationAction()");
            return ANCSMessageBase.AncsError.INVALID_ANCS_COMMAND;
        }
    }
}
