package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class gi4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f19019a = JsonReader.a.a("ty", PluginDeviceInfo.FICONOFF);

    public static fi4 a(JsonReader jsonReader, lse lseVar) throws IOException {
        fi4 fi4VarA;
        String strNextString;
        jsonReader.beginObject();
        byte b2 = 2;
        int iNextInt = 2;
        while (true) {
            fi4VarA = null;
            if (!jsonReader.d()) {
                strNextString = null;
                break;
            }
            int iP = jsonReader.p(f19019a);
            if (iP == 0) {
                strNextString = jsonReader.nextString();
                break;
            }
            if (iP != 1) {
                jsonReader.s();
                jsonReader.skipValue();
            } else {
                iNextInt = jsonReader.nextInt();
            }
        }
        if (strNextString == null) {
            return null;
        }
        switch (strNextString.hashCode()) {
            case 3239:
                b2 = !strNextString.equals(Language.EL) ? (byte) -1 : (byte) 0;
                break;
            case 3270:
                b2 = !strNextString.equals("fl") ? (byte) -1 : (byte) 1;
                break;
            case 3295:
                if (!strNextString.equals("gf")) {
                    b2 = -1;
                }
                break;
            case 3307:
                b2 = !strNextString.equals("gr") ? (byte) -1 : (byte) 3;
                break;
            case 3308:
                b2 = !strNextString.equals("gs") ? (byte) -1 : (byte) 4;
                break;
            case 3488:
                b2 = !strNextString.equals("mm") ? (byte) -1 : (byte) 5;
                break;
            case 3633:
                b2 = !strNextString.equals("rc") ? (byte) -1 : (byte) 6;
                break;
            case 3634:
                b2 = !strNextString.equals("rd") ? (byte) -1 : (byte) 7;
                break;
            case 3646:
                b2 = !strNextString.equals("rp") ? (byte) -1 : (byte) 8;
                break;
            case 3669:
                b2 = !strNextString.equals("sh") ? (byte) -1 : (byte) 9;
                break;
            case 3679:
                b2 = !strNextString.equals("sr") ? (byte) -1 : (byte) 10;
                break;
            case 3681:
                b2 = !strNextString.equals("st") ? (byte) -1 : (byte) 11;
                break;
            case 3705:
                b2 = !strNextString.equals("tm") ? (byte) -1 : AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                break;
            case 3710:
                b2 = !strNextString.equals("tr") ? (byte) -1 : HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                fi4VarA = rw3.a(jsonReader, lseVar, iNextInt);
                break;
            case 1:
                fi4VarA = x2m.a(jsonReader, lseVar);
                break;
            case 2:
                fi4VarA = l3b.a(jsonReader, lseVar);
                break;
            case 3:
                fi4VarA = z2m.a(jsonReader, lseVar);
                break;
            case 4:
                fi4VarA = n3b.a(jsonReader, lseVar);
                break;
            case 5:
                fi4VarA = rqf.a(jsonReader);
                lseVar.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                fi4VarA = eak.a(jsonReader, lseVar);
                break;
            case 7:
                fi4VarA = wxk.a(jsonReader, lseVar);
                break;
            case 8:
                fi4VarA = blk.a(jsonReader, lseVar);
                break;
            case 9:
                fi4VarA = f3m.a(jsonReader, lseVar);
                break;
            case 10:
                fi4VarA = e3i.a(jsonReader, lseVar, iNextInt);
                break;
            case 11:
                fi4VarA = g3m.a(jsonReader, lseVar);
                break;
            case 12:
                fi4VarA = h3m.a(jsonReader, lseVar);
                break;
            case 13:
                fi4VarA = rb1.g(jsonReader, lseVar);
                break;
            default:
                rpe.c("Unknown shape type " + strNextString);
                break;
        }
        while (jsonReader.d()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return fi4VarA;
    }
}
