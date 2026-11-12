package ct2;

import androidx.media3.common.PlaybackException;
import com.garmin.android.gfdi.filetransfer.DeleteFileResponseMessage;
import com.garmin.android.gncs.datasource.GncsDataSourceMessage;
import com.garmin.android.gncs.messages.NotificationServiceSubscriptionMessage;
import com.garmin.android.music.MusicDataHandler;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lct2/c;", "", "<init>", "()V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f55534a = new c();

    private c() {
    }

    public static String a(int i14) {
        String str;
        if (i14 == 5000) {
            str = "Acknowledgement";
        } else if (i14 == 5052) {
            str = "Current Time";
        } else if (i14 == 5054) {
            str = "Compressed File Data";
        } else if (i14 == 5011) {
            str = "FIT Definition";
        } else if (i14 == 5012) {
            str = "FIT Data";
        } else if (i14 == 5019) {
            str = "Ephemeris Data Request";
        } else if (i14 != 5020) {
            switch (i14) {
                case 5002:
                    str = "Download File";
                    break;
                case PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED /* 5003 */:
                    str = "Upload File";
                    break;
                case PlaybackException.ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED /* 5004 */:
                    str = "File Data";
                    break;
                case 5005:
                    str = "Create File";
                    break;
                case DeleteFileResponseMessage.MESSAGE_ID /* 5006 */:
                    str = "Delete File";
                    break;
                case 5007:
                    str = "Directory Filter";
                    break;
                case 5008:
                    str = "Set File Flags";
                    break;
                case 5009:
                    str = "File Ready";
                    break;
                default:
                    switch (i14) {
                        case 5014:
                            str = "Weather Request";
                            break;
                        case 5015:
                            str = "Weather Alert";
                            break;
                        case 5016:
                            str = "LT Tracking Request";
                            break;
                        default:
                            switch (i14) {
                                case 5022:
                                    str = "Cancel File Transfer";
                                    break;
                                case 5023:
                                    str = "Battery Status";
                                    break;
                                case 5024:
                                    str = "Device Information";
                                    break;
                                case 5025:
                                    str = "LT Stop Tracking";
                                    break;
                                case 5026:
                                    str = "Set Device Settings";
                                    break;
                                case 5027:
                                    str = "Queued Download";
                                    break;
                                case 5028:
                                    str = "Ephemeris EPO Request";
                                    break;
                                case 5029:
                                    str = "Ephemeris EPO Data";
                                    break;
                                case 5030:
                                    str = "System Event";
                                    break;
                                case 5031:
                                    str = "Supported File Types";
                                    break;
                                default:
                                    switch (i14) {
                                        case 5033:
                                            str = "GNCS Notification Source";
                                            break;
                                        case 5034:
                                            str = "GNCS Control Point";
                                            break;
                                        case GncsDataSourceMessage.MESSAGE_ID /* 5035 */:
                                            str = "GNCS Data Source";
                                            break;
                                        case NotificationServiceSubscriptionMessage.MESSAGE_ID /* 5036 */:
                                            str = "GNCS Notification Service Subscription";
                                            break;
                                        case 5037:
                                            str = "Sync Request";
                                            break;
                                        default:
                                            switch (i14) {
                                                case 5039:
                                                    str = "Find My Phone";
                                                    break;
                                                case 5040:
                                                    str = "Cancel Find My Phone";
                                                    break;
                                                case MusicDataHandler.MUSIC_CONTROL_MESSAGE_ID /* 5041 */:
                                                    str = "Music Control";
                                                    break;
                                                case MusicDataHandler.MUSIC_CAPABILITIES_MESSAGE_ID /* 5042 */:
                                                    str = "Music Control Capabilities";
                                                    break;
                                                case 5043:
                                                    str = "Protobuf Request";
                                                    break;
                                                case 5044:
                                                    str = "Protobuf Response";
                                                    break;
                                                case 5045:
                                                    str = "Cancel Protobuf";
                                                    break;
                                                case 5046:
                                                    str = "LT Auto Start Tracking";
                                                    break;
                                                case 5047:
                                                    str = "LT Auto Start Cancel";
                                                    break;
                                                case 5048:
                                                    str = "LT Auto Start Failure";
                                                    break;
                                                case MusicDataHandler.MUSIC_ENTITY_UPDATE_MESSAGE_ID /* 5049 */:
                                                    str = "Music Entity Update";
                                                    break;
                                                case 5050:
                                                    str = "Configuration";
                                                    break;
                                                default:
                                                    switch (i14) {
                                                        case 5101:
                                                            str = "Auth Negotiation Begin";
                                                            break;
                                                        case 5102:
                                                            str = "LTK Reconnect";
                                                            break;
                                                        case 5103:
                                                            str = "STK Begin Generation";
                                                            break;
                                                        case 5104:
                                                            str = "Confirm Number";
                                                            break;
                                                        case 5105:
                                                            str = "STK Rand Number";
                                                            break;
                                                        case 5106:
                                                            str = "STK Generation Status";
                                                            break;
                                                        case 5107:
                                                            str = "LTK Key Distribution";
                                                            break;
                                                        case 5108:
                                                            str = "Session Key SKD Distribution";
                                                            break;
                                                        case 5109:
                                                            str = "Session Key Verification";
                                                            break;
                                                        case 5110:
                                                            str = "Passkey Redisplay";
                                                            break;
                                                        case 5111:
                                                            str = "Secure Session";
                                                            break;
                                                        case 5112:
                                                            str = "Out-of-Band Passkey Data";
                                                            break;
                                                        default:
                                                            str = "Unknown Message";
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            str = "Ephemeris Data";
        }
        return str + " (" + i14 + ")";
    }
}
