package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.miui.circulate.device.api.Constant;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class ryl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f33069a = Pattern.compile("([a-z])=\\s?(.+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f33070b = Pattern.compile("([0-9A-Za-z-]+)(?::(.*))?");
    public static final Pattern c = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");

    public static void a(qyl.b bVar, ijf.b bVar2) throws ParserException {
        try {
            bVar.n(bVar2.j());
        } catch (IllegalStateException e) {
            throw new ParserException(e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x0106  */
    public static qyl b(String str) throws ParserException {
        byte b2;
        qyl.b bVar = new qyl.b();
        ijf.b bVarC = null;
        for (String str2 : wlq.M0(str, "\r\n")) {
            if (!"".equals(str2)) {
                Matcher matcher = f33069a.matcher(str2);
                if (!matcher.matches()) {
                    String strValueOf = String.valueOf(str2);
                    throw new ParserException(strValueOf.length() != 0 ? "Malformed SDP line: ".concat(strValueOf) : new String("Malformed SDP line: "));
                }
                String str3 = (String) rk1.e(matcher.group(1));
                String str4 = (String) rk1.e(matcher.group(2));
                switch (str3.hashCode()) {
                    case 97:
                        if (str3.equals(PluginDeviceInfo.FMODEL)) {
                            b2 = 11;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 98:
                        if (str3.equals(PluginDeviceInfo.FDESC)) {
                            b2 = 8;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 99:
                        if (str3.equals(PluginDeviceInfo.FICONON)) {
                            b2 = 7;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 100:
                    case 102:
                    case 103:
                    case 104:
                    case 106:
                    case 108:
                    case 110:
                    case 113:
                    case 119:
                    case 120:
                    case 121:
                    default:
                        b2 = -1;
                        break;
                    case 101:
                        if (str3.equals(PluginDeviceInfo.FICONOFFLINE)) {
                            b2 = 5;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 105:
                        if (str3.equals("i")) {
                            b2 = 3;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 107:
                        if (str3.equals(Constant.KeyValue.KEY_COLUMN)) {
                            b2 = 10;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 109:
                        if (str3.equals("m")) {
                            b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 111:
                        if (str3.equals(DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER)) {
                            b2 = 1;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 112:
                        if (str3.equals(FitnessFilePathUtils.TimeZoneConstant.POSITIVE)) {
                            b2 = 6;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 114:
                        if (str3.equals("r")) {
                            b2 = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 115:
                        if (str3.equals("s")) {
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 116:
                        if (str3.equals(DeviceTagInterface.CUSTOM_TAG_TYPE)) {
                            b2 = 9;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 117:
                        if (str3.equals("u")) {
                            b2 = 4;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 118:
                        if (str3.equals("v")) {
                            b2 = 0;
                        } else {
                            b2 = -1;
                        }
                        break;
                    case 122:
                        if (str3.equals("z")) {
                            b2 = HMProSyncDataBaseProfile.DATA_TYPE_COACHING;
                        } else {
                            b2 = -1;
                        }
                        break;
                }
                switch (b2) {
                    case 0:
                        if (!"0".equals(str4)) {
                            throw new ParserException(String.format("SDP version %s is not supported.", str4));
                        }
                        break;
                        break;
                    case 1:
                        bVar.t(str4);
                        break;
                    case 2:
                        bVar.w(str4);
                        break;
                    case 3:
                        if (bVarC == null) {
                            bVar.v(str4);
                        } else {
                            bVarC.n(str4);
                        }
                        break;
                    case 4:
                        bVar.y(Uri.parse(str4));
                        break;
                    case 5:
                        bVar.r(str4);
                        break;
                    case 6:
                        bVar.u(str4);
                        break;
                    case 7:
                        if (bVarC == null) {
                            bVar.q(str4);
                        } else {
                            bVarC.l(str4);
                        }
                        break;
                    case 8:
                        String[] strArrM0 = wlq.M0(str4, ":\\s?");
                        rk1.a(strArrM0.length == 2);
                        int i = Integer.parseInt(strArrM0[1]);
                        if (bVarC == null) {
                            bVar.p(i * 1000);
                        } else {
                            bVarC.k(i * 1000);
                        }
                        break;
                    case 9:
                        bVar.x(str4);
                        break;
                    case 10:
                        if (bVarC == null) {
                            bVar.s(str4);
                        } else {
                            bVarC.m(str4);
                        }
                        break;
                    case 11:
                        Matcher matcher2 = f33070b.matcher(str4);
                        if (!matcher2.matches()) {
                            String strValueOf2 = String.valueOf(str2);
                            throw new ParserException(strValueOf2.length() != 0 ? "Malformed Attribute line: ".concat(strValueOf2) : new String("Malformed Attribute line: "));
                        }
                        String str5 = (String) rk1.e(matcher2.group(1));
                        String strE = qlo.e(matcher2.group(2));
                        if (bVarC == null) {
                            bVar.m(str5, strE);
                        } else {
                            bVarC.i(str5, strE);
                        }
                        break;
                        break;
                    case 12:
                        if (bVarC != null) {
                            a(bVar, bVarC);
                        }
                        bVarC = c(str4);
                        break;
                }
            }
        }
        if (bVarC != null) {
            a(bVar, bVarC);
        }
        try {
            return bVar.o();
        } catch (IllegalStateException e) {
            throw new ParserException(e);
        }
    }

    public static ijf.b c(String str) throws ParserException {
        Matcher matcher = c.matcher(str);
        if (!matcher.matches()) {
            String strValueOf = String.valueOf(str);
            throw new ParserException(strValueOf.length() != 0 ? "Malformed SDP media description line: ".concat(strValueOf) : new String("Malformed SDP media description line: "));
        }
        try {
            return new ijf.b((String) rk1.e(matcher.group(1)), Integer.parseInt((String) rk1.e(matcher.group(2))), (String) rk1.e(matcher.group(3)), Integer.parseInt((String) rk1.e(matcher.group(4))));
        } catch (NumberFormatException e) {
            String strValueOf2 = String.valueOf(str);
            throw new ParserException(strValueOf2.length() != 0 ? "Malformed SDP media description line: ".concat(strValueOf2) : new String("Malformed SDP media description line: "), e);
        }
    }
}
