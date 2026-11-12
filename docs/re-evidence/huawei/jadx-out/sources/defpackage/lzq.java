package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.AudioChannelType;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.BitDepth;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicEncode;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicHistoryCallbackInterface;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicStruct;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.NegotiationCallbackInterface;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.NegotiationData;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class lzq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static lvb f41216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static IBaseResponseCallback f41217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static IBaseResponseCallback f41218c;
    private static int d;
    private static MusicHistoryCallbackInterface e;
    private static NegotiationCallbackInterface g;
    private static List<man> i = new ArrayList(16);
    private static boolean j = false;
    private static Handler f = new Handler(Looper.getMainLooper()) { // from class: lzq.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                LogUtil.a("MusicManagerUtils", "handleMessage timeout.");
                lzq.d(false);
            } else {
                LogUtil.j("MusicManagerUtils", "Invalid music message.");
            }
        }
    };

    static /* synthetic */ int b() {
        int i2 = d;
        d = i2 + 1;
        return i2;
    }

    public static void d(lvb lvbVar) {
        if (lvbVar == null) {
            LogUtil.j("MusicManagerUtils", "setConfigAndLock hwDeviceConfigManager is null");
        } else {
            f41216a = lvbVar;
        }
    }

    public static void d(eew eewVar, List<String> list) {
        int i2;
        ArrayList arrayList = new ArrayList(16);
        String strB = eewVar.b();
        int i3 = 2;
        int iA = lsk.a(strB.length() >= 2 ? strB.substring(0, 2) : null, 16);
        arrayList.add(Integer.valueOf(iA));
        while ((iA & 128) != 0 && strB.length() >= (i2 = i3 + 2)) {
            iA = lsk.a(strB.substring(i3, i2), 16);
            arrayList.add(Integer.valueOf(iA));
            i3 = i2;
        }
        DeviceInfo deviceInfoD = mgg.d("MusicManagerUtils");
        if (deviceInfoD != null && cpf.a(10000, deviceInfoD.getDeviceModel())) {
            list.add("MP3");
            list.add("AAC");
        } else {
            a(arrayList, list);
        }
    }

    private static void a(List<Integer> list, List<String> list2) {
        if (list.size() >= 1) {
            c(list, list2, 0);
        }
        if (list.size() >= 2) {
            if ((list.get(1).intValue() & 1) != 0) {
                list2.add("PCM");
            }
            if ((list.get(1).intValue() & 2) != 0) {
                list2.add("APE");
            }
            if ((list.get(1).intValue() & 4) != 0) {
                list2.add("M4A");
            }
            if ((list.get(1).intValue() & 8) != 0) {
                list2.add("FLAC");
            }
            if ((list.get(1).intValue() & 16) != 0) {
                list2.add("OPUS");
            }
            if ((list.get(1).intValue() & 32) != 0) {
                list2.add("OGG");
            }
            if ((list.get(1).intValue() & 64) != 0) {
                list2.add("BUTT");
            }
        }
        if (list.size() >= 3) {
            if ((list.get(2).intValue() & 1) != 0) {
                list2.add("AMR");
            }
            if ((list.get(2).intValue() & 2) != 0) {
                list2.add("IMY");
            }
        }
    }

    private static void c(List<Integer> list, List<String> list2, int i2) {
        if ((list.get(0).intValue() & 1) != i2) {
            list2.add("MP3");
        }
        if ((list.get(0).intValue() & 2) != i2) {
            list2.add("WAV");
        }
        if ((list.get(0).intValue() & 4) != i2) {
            list2.add("AAC");
        }
        if ((list.get(0).intValue() & 8) != i2) {
            list2.add("SBC");
        }
        if ((list.get(0).intValue() & 16) != i2) {
            list2.add("MSBC");
        }
        if ((list.get(0).intValue() & 32) != i2) {
            list2.add("HWA");
        }
        if ((list.get(0).intValue() & 64) != i2) {
            list2.add("CVSD");
        }
    }

    private static void a(eew eewVar, NegotiationData negotiationData, NegotiationData.TypeStruct typeStruct) {
        LogUtil.a("MusicManagerUtils", "handleMusicSampleRateMessage enter");
        ArrayList arrayList = new ArrayList(16);
        String strD = eeq.d(eewVar.b());
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("MusicManagerUtils", "handleMusicSampleRateMessage sampleRateString is empty.");
            return;
        }
        LogUtil.a("MusicManagerUtils", "getMusicType():", Integer.valueOf(negotiationData.getMusicType()), " ; sampleRateString:", strD);
        typeStruct.setSampleRate(strD);
        String[] strArrSplit = strD.split(",");
        if (strArrSplit.length > 0) {
            if (!"FFFF".equals(strArrSplit[0])) {
                for (String str : strArrSplit) {
                    arrayList.add(Integer.valueOf(lsk.a(str, 10)));
                }
            }
        }
        if (negotiationData.getMusicType() == 0) {
            negotiationData.setMp3SampleRate(arrayList);
        }
    }

    public static boolean e(String str, int i2) {
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length != 0 && !"FFFF".equals(strArrSplit[0])) {
            for (String str2 : strArrSplit) {
                if (lsk.a(str2, 10) == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(List<AudioChannelType> list, int i2) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<AudioChannelType> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().getChannelValue() == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(List<MusicEncode> list, String str) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return false;
        }
        Iterator<MusicEncode> it = list.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().getDescription())) {
                return true;
            }
        }
        return false;
    }

    private static void b(eew eewVar, NegotiationData.TypeStruct typeStruct) {
        LogUtil.a("MusicManagerUtils", "handleMusicBitrateRateMessage enter");
        int iA = lsk.a(eewVar.b(), 16);
        if (iA < 0) {
            LogUtil.j("MusicManagerUtils", "handleMusicBitrateRateMessage bitrate value illegal.");
        } else {
            LogUtil.a("MusicManagerUtils", "handleMusicBitrateRateMessage, bitrate :", Integer.valueOf(iA));
            typeStruct.setMusicBitrate(iA);
        }
    }

    private static void d(eew eewVar, NegotiationData.TypeStruct typeStruct) {
        LogUtil.a("MusicManagerUtils", "handleMusicChannelCountMessage enter");
        int iA = lsk.a(eewVar.b(), 16);
        if (iA < 0) {
            LogUtil.j("MusicManagerUtils", "handleMusicChannelCountMessage channelCount value illegal.");
        } else {
            LogUtil.a("MusicManagerUtils", "handleMusicChannelCountMessage, channelCount:", Integer.valueOf(iA));
            typeStruct.setMusicChannelCount(iA);
        }
    }

    private static void i(eew eewVar, NegotiationData.TypeStruct typeStruct) {
        LogUtil.a("MusicManagerUtils", "handleMusicEncryptedBitrateMessage enter");
        int iA = lsk.a(eewVar.b(), 16);
        if (iA < 0) {
            LogUtil.j("MusicManagerUtils", "handleMusicEncryptedBitrateMessage channelCount value illegal.");
        } else {
            LogUtil.a("MusicManagerUtils", "handleMusicEncryptedBitrateMessage, encryptedBitrate :", Integer.valueOf(iA));
            typeStruct.setMusicEncryptedBitrate(iA);
        }
    }

    private static void c(eew eewVar, NegotiationData negotiationData, NegotiationData.TypeStruct typeStruct) {
        LogUtil.a("MusicManagerUtils", "handleMusicSampleRateMessage enter");
        int iA = lsk.a(eewVar.b(), 16);
        typeStruct.setMusicEncode(iA);
        LogUtil.a("MusicManagerUtils", "musicEncode:", Integer.valueOf(iA));
        if (iA == 0) {
            negotiationData.setAacSupportAdts(true);
        }
    }

    private static void e(eew eewVar, NegotiationData.TypeStruct typeStruct) {
        LogUtil.a("MusicManagerUtils", "handleMusicDepthMessage enter");
        try {
            String strE = e(eewVar.b());
            LogUtil.a("MusicManagerUtils", "handleMusicDepthMessage musicDepth：", strE);
            int length = strE.length();
            ArrayList arrayList = new ArrayList(16);
            for (int i2 = 0; i2 < length; i2++) {
                if (strE.charAt(i2) == '1') {
                    if (i2 == 0) {
                        arrayList.add(BitDepth.BIT_8);
                    } else if (i2 == 1) {
                        arrayList.add(BitDepth.BIT_16);
                    } else if (i2 == 2) {
                        arrayList.add(BitDepth.BIT_24);
                    } else if (i2 == 3) {
                        arrayList.add(BitDepth.BIT_32);
                    } else if (i2 == 4) {
                        arrayList.add(BitDepth.BIT_64);
                    } else {
                        LogUtil.j("MusicManagerUtils", "handleMusicDepthMessage position:", Integer.valueOf(i2));
                    }
                }
            }
            LogUtil.a("MusicManagerUtils", "handleMusicDepthMessage bitDepths：", arrayList);
            typeStruct.setBitDepths(arrayList);
        } catch (IllegalArgumentException e2) {
            LogUtil.e("MusicManagerUtils", "handleMusicDepthMessage e：", e2);
        }
    }

    private static void c(eew eewVar, NegotiationData.TypeStruct typeStruct) {
        LogUtil.a("MusicManagerUtils", "handleMusicChannelMessage enter");
        try {
            String strE = e(eewVar.b());
            int length = strE.length();
            ArrayList arrayList = new ArrayList(16);
            for (int i2 = 0; i2 < length; i2++) {
                if (strE.charAt(i2) == '1') {
                    if (i2 == 0) {
                        arrayList.add(AudioChannelType.MONO);
                    } else if (i2 == 1) {
                        arrayList.add(AudioChannelType.STEREO);
                    } else {
                        LogUtil.j("MusicManagerUtils", "handleMusicChannelMessage position:", Integer.valueOf(i2));
                    }
                }
            }
            LogUtil.a("MusicManagerUtils", "handleMusicDepthMessage audioChannelTypes：", arrayList);
            typeStruct.setAudioChannelTypes(arrayList);
        } catch (IllegalArgumentException e2) {
            LogUtil.e("MusicManagerUtils", "handleMusicChannelMessage e：", e2);
        }
    }

    public static String e(String str) {
        int i2;
        StringBuilder sb = new StringBuilder();
        for (char c2 : str.toUpperCase(Locale.getDefault()).toCharArray()) {
            if (c2 >= '0' && c2 <= '9') {
                i2 = c2 - '0';
            } else {
                if (c2 < 'A' || c2 > 'F') {
                    throw new IllegalArgumentException("Invalid character: " + c2);
                }
                i2 = c2 - '7';
            }
            sb.append(String.format(Locale.US, "%04d", Integer.valueOf(Integer.parseInt(Integer.toBinaryString(i2)))));
        }
        return new StringBuilder(sb.toString()).reverse().toString();
    }

    public static void a(eew eewVar, NegotiationData.TypeStruct typeStruct) {
        try {
            String strE = e(eewVar.b());
            int length = strE.length();
            ArrayList arrayList = new ArrayList(16);
            MusicEncode[] musicEncodeArrValues = MusicEncode.values();
            int length2 = musicEncodeArrValues.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (strE.charAt(i2) == '1') {
                    if (i2 >= length2) {
                        LogUtil.j("MusicManagerUtils", "handleMusicEncodeNewMessage position:", Integer.valueOf(i2), "musicEncodesLength:", Integer.valueOf(length2));
                        break;
                    }
                    arrayList.add(musicEncodeArrValues[i2]);
                }
            }
            LogUtil.a("MusicManagerUtils", "handleMusicEncodeNewMessage musicEncodes：", arrayList);
            typeStruct.setMusicEncodes(arrayList);
        } catch (IllegalArgumentException e2) {
            LogUtil.e("MusicManagerUtils", "handleMusicChannelMessage e：", e2);
        }
    }

    public static void e(MusicStruct musicStruct) {
        if (musicStruct == null) {
            LogUtil.j("MusicManagerUtils", "sendMusicFileResponse musicStruct is null");
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(37);
        deviceCommand.setCommandID(9);
        StringBuilder sb = new StringBuilder(16);
        l(musicStruct, sb);
        o(musicStruct, sb);
        n(musicStruct, sb);
        b(musicStruct, sb);
        k(musicStruct, sb);
        m(musicStruct, sb);
        j(musicStruct, sb);
        h(musicStruct, sb);
        c(musicStruct, sb);
        a(musicStruct, sb);
        e(musicStruct, sb);
        i(musicStruct, sb);
        f(musicStruct, sb);
        q(musicStruct, sb);
        g(musicStruct, sb);
        d(musicStruct, sb);
        String string = sb.toString();
        LogUtil.a("MusicManagerUtils", "package sendMusicFileRequest Command :", string);
        byte[] bArrC = eeq.c(string);
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        if (f41216a == null) {
            ReleaseLogUtil.e("R_MusicManagerUtils", "sendMusicFileResponse deviceConfigManager is null");
            lzl.a(BaseApplication.getContext()).e();
        }
        f41216a.c(deviceCommand);
    }

    public static void b(mak makVar) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(37);
        deviceCommand.setCommandID(10);
        StringBuilder sb = new StringBuilder(16);
        a(makVar, sb);
        c(makVar, sb);
        e(makVar, sb);
        b(makVar, sb);
        d(makVar, sb);
        String string = sb.toString();
        LogUtil.a("MusicManagerUtils", "package sendMusicAccountInfo Command :", string);
        byte[] bArrC = eeq.c(string);
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        if (f41216a == null) {
            LogUtil.j("MusicManagerUtils", "sendMusicAccountInfo deviceConfigManager is null");
            lzl.a(BaseApplication.getContext()).e();
        }
        f41216a.c(deviceCommand);
    }

    public static void c(NegotiationData negotiationData, NegotiationCallbackInterface negotiationCallbackInterface) {
        if (negotiationCallbackInterface == null) {
            LogUtil.j("MusicManagerUtils", "getNegotiation is null");
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(37);
        deviceCommand.setCommandID(13);
        StringBuilder sb = new StringBuilder(16);
        String strD = eeq.d(1);
        String strB = eeq.b(0);
        String strD2 = eeq.d(2);
        String strB2 = eeq.b(0);
        String strD3 = eeq.d(3);
        String strB3 = eeq.b(0);
        String strD4 = eeq.d(4);
        String strB4 = eeq.b(0);
        String strD5 = eeq.d(5);
        String strB5 = eeq.b(0);
        sb.append(strD);
        sb.append(strB);
        sb.append(strD2);
        sb.append(strB2);
        sb.append(strD3);
        sb.append(strB3);
        sb.append(strD4);
        sb.append(strB4);
        sb.append(strD5);
        sb.append(strB5);
        String string = sb.toString();
        LogUtil.a("MusicManagerUtils", "package sendMusicAccountInfo Command :", string);
        byte[] bArrC = eeq.c(string);
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        if (f41216a == null) {
            LogUtil.j("MusicManagerUtils", "getNegotiation deviceConfigManager is null");
            lzl.a(BaseApplication.getContext()).e();
        }
        f41216a.c(deviceCommand);
        g = negotiationCallbackInterface;
        LogUtil.d("MusicManagerUtils", "negotiationData:", negotiationData);
    }

    public static void e(MusicHistoryCallbackInterface musicHistoryCallbackInterface, int i2, String str, Object obj) {
        if (musicHistoryCallbackInterface == null || obj == null) {
            return;
        }
        if (j) {
            LogUtil.a("MusicManagerUtils", "MusicHistory is transfering.");
            musicHistoryCallbackInterface.getHistoryRecordsBusy(i2, str, 1);
        } else {
            LogUtil.a("MusicManagerUtils", "getMusicHistory");
            e = musicHistoryCallbackInterface;
            j();
            d(i2, str, obj);
        }
    }

    public static void b(List<eew> list, List<ees> list2, int i2) {
        switch (i2) {
            case 11:
                f.removeMessages(1);
                if (list != null) {
                    d(list);
                }
                break;
            case 12:
                f.removeMessages(1);
                if (list != null && list2 != null) {
                    e(list, list2);
                    break;
                }
                break;
            case 13:
                if (list != null) {
                    b(list, list2);
                }
                break;
            default:
                LogUtil.j("MusicManagerUtils", "handleOnlineMusic invalid command:", Integer.valueOf(i2));
                break;
        }
    }

    private static void j() {
        d(true);
        d = 0;
        i.clear();
    }

    private static void e(List<eew> list, List<ees> list2) {
        LogUtil.a("MusicManagerUtils", "MusicConstants.COMMAND_ID_HISTORY_INFO_RECORD_FRAME_INDEX");
        mag magVar = new mag();
        for (eew eewVar : list) {
            int iA = lsk.a(eewVar.e(), 16);
            if (iA != 1 && iA != 2) {
                if (iA == 3) {
                    magVar.d(lsk.a(eewVar.b(), 16));
                } else {
                    LogUtil.j("MusicManagerUtils", "HandleMusicHistory type:", Integer.valueOf(lsk.a(eewVar.e(), 16)));
                }
            }
        }
        ArrayList arrayList = new ArrayList(16);
        Iterator<ees> it = list2.iterator();
        while (it.hasNext()) {
            Iterator<ees> it2 = it.next().b().iterator();
            while (it2.hasNext()) {
                a(it2.next(), arrayList);
            }
        }
        magVar.e(arrayList);
        f41218c.a(100000, magVar);
    }

    private static void a(ees eesVar, List<man> list) {
        if (eesVar == null || list == null) {
            return;
        }
        man manVar = new man();
        manVar.c("");
        for (eew eewVar : eesVar.e()) {
            switch (lsk.a(eewVar.e(), 16)) {
                case 6:
                    manVar.c(eeq.d(eewVar.b()));
                    break;
                case 7:
                    manVar.e(lsk.a(eewVar.b(), 16));
                    break;
                case 8:
                    manVar.b(lsk.a(eewVar.b(), 16));
                    break;
                case 9:
                    manVar.a(lsk.a(eewVar.b(), 16));
                    break;
                default:
                    LogUtil.j("MusicManagerUtils", "MusicHistoryList type:", Integer.valueOf(lsk.a(eewVar.e(), 16)));
                    break;
            }
        }
        if ("".equals(manVar.a())) {
            return;
        }
        list.add(manVar);
        LogUtil.a("MusicManagerUtils", "musicStruct:", manVar.toString());
    }

    private static void d(final int i2, final String str, final Object obj) {
        if (obj == null) {
            d(false);
        } else {
            c(new IBaseResponseCallback() { // from class: lzq.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i3, Object obj2) {
                    int i4 = 0;
                    if (obj2 == null) {
                        LogUtil.j("MusicManagerUtils", "getHistoryFrameCount objData is null");
                        lzq.d(false);
                        return;
                    }
                    try {
                        i4 = Integer.parseInt(obj2.toString());
                    } catch (NumberFormatException e2) {
                        LogUtil.e("MusicManagerUtils", "getHistoryFrameCount objData exception:", e2.getMessage());
                    }
                    LogUtil.a("MusicManagerUtils", "getHistoryFrameCount onResponse(int error, Object objData) historyFrameCount:", Integer.valueOf(i4));
                    lzq.b(i4, i2, str, obj);
                }
            }, i2, str, obj);
        }
    }

    private static void c(IBaseResponseCallback iBaseResponseCallback, int i2, String str, Object obj) {
        LogUtil.a("MusicManagerUtils", "sendHistoryFrameCount");
        if (obj == null) {
            d(false);
            return;
        }
        synchronized (obj) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(37);
            deviceCommand.setCommandID(11);
            StringBuilder sb = new StringBuilder(16);
            d(i2, sb);
            d(str, sb);
            String string = sb.toString();
            LogUtil.a("MusicManagerUtils", "sendHistoryFrameCount packageMusicCommand :", string);
            byte[] bArrC = eeq.c(string);
            deviceCommand.setDataLen(bArrC.length);
            deviceCommand.setDataContent(bArrC);
            if (f41216a == null) {
                LogUtil.j("MusicManagerUtils", "sendHistoryFrameCount deviceConfigManager is null");
                lzl.a(BaseApplication.getContext()).e();
            }
            f41216a.c(deviceCommand);
            f.sendEmptyMessageDelayed(1, 10000L);
            f41217b = iBaseResponseCallback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final int i2, final int i3, final String str, final Object obj) {
        LogUtil.a("MusicManagerUtils", "Enter getHistoryInfo(): musicHistoryFrameCount:", Integer.valueOf(i2), " historyFrameCurrentIndex: ", Integer.valueOf(d));
        int i4 = d;
        if (i4 >= i2) {
            LogUtil.a("MusicManagerUtils", "musicHistoryStructList.size:", Integer.valueOf(i.size()));
            e.onGetHistoryRecords(i3, str, i);
            d = 0;
            d(false);
            return;
        }
        e(i4, i3, str, obj, new IBaseResponseCallback() { // from class: lzq.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i5, Object obj2) {
                if (obj2 == null) {
                    LogUtil.j("MusicManagerUtils", "Enter getHistoryInfo() objData is null");
                    lzq.d(false);
                } else {
                    if (!(obj2 instanceof mag)) {
                        LogUtil.j("MusicManagerUtils", "objData is not instanceof HistoryFrameStruct");
                        return;
                    }
                    lzq.i.addAll(((mag) obj2).e());
                    lzq.b();
                    lzq.b(i2, i3, str, obj);
                }
            }
        });
    }

    private static void e(int i2, int i3, String str, Object obj, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("MusicManagerUtils", "sendGetHistoryInfo musicFrameIndex: ", Integer.valueOf(i2));
        synchronized (obj) {
            DeviceCommand deviceCommand = new DeviceCommand();
            deviceCommand.setServiceID(37);
            deviceCommand.setCommandID(12);
            StringBuilder sb = new StringBuilder(16);
            e(i3, sb);
            b(str, sb);
            c(i2, sb);
            String string = sb.toString();
            LogUtil.a("MusicManagerUtils", "package packageMusicCommand :", string);
            byte[] bArrC = eeq.c(string);
            deviceCommand.setDataLen(bArrC.length);
            deviceCommand.setDataContent(bArrC);
            if (f41216a == null) {
                LogUtil.j("MusicManagerUtils", "sendGetHistoryInfo deviceConfigManager is null");
                lzl.a(BaseApplication.getContext()).e();
            }
            f41216a.c(deviceCommand);
            f.sendEmptyMessageDelayed(1, 10000L);
            f41218c = iBaseResponseCallback;
        }
    }

    private static void l(MusicStruct musicStruct, StringBuilder sb) {
        if (musicStruct == null || sb == null) {
            return;
        }
        String strE = eeq.e(musicStruct.getMusicIndex());
        String strB = eeq.b(strE.length() / 2);
        sb.append(eeq.d(1));
        sb.append(strB);
        sb.append(strE);
    }

    private static void o(MusicStruct musicStruct, StringBuilder sb) {
        if (musicStruct == null || sb == null) {
            return;
        }
        String musicName = musicStruct.getMusicName();
        Objects.isNull(musicName);
        if (musicName == null) {
            LogUtil.j("MusicManagerUtils", "musicStruct.getMusicName is null");
            return;
        }
        String strA = eeq.a(musicStruct.getMusicName());
        if (strA.length() > 240) {
            strA = strA.substring(0, 240);
            LogUtil.a("MusicManagerUtils", "musicNameValue out of size");
        }
        String strB = eeq.b(strA.length() / 2);
        sb.append(eeq.d(3));
        sb.append(strB);
        sb.append(strA);
    }

    private static void n(MusicStruct musicStruct, StringBuilder sb) {
        if (musicStruct == null || sb == null) {
            return;
        }
        String strA = eeq.a(musicStruct.getMusicSinger());
        if (strA.length() > 120) {
            strA = strA.substring(0, 120);
            LogUtil.a("MusicManagerUtils", "musicSingerValue out of size");
        }
        String strB = eeq.b(strA.length() / 2);
        sb.append(eeq.d(4));
        sb.append(strB);
        sb.append(strA);
    }

    private static void b(MusicStruct musicStruct, StringBuilder sb) {
        if (musicStruct == null || sb == null) {
            return;
        }
        if (TextUtils.isEmpty(musicStruct.getMusicAlbum())) {
            LogUtil.j("MusicManagerUtils", "musicStruct.getMusicAlbum is null");
            return;
        }
        String strA = eeq.a(musicStruct.getMusicAlbum());
        String strB = eeq.b(strA.length() / 2);
        sb.append(eeq.d(5));
        sb.append(strB);
        sb.append(strA);
    }

    private static void k(MusicStruct musicStruct, StringBuilder sb) {
        if (musicStruct == null || sb == null) {
            return;
        }
        if (TextUtils.isEmpty(musicStruct.getMusicId())) {
            LogUtil.j("MusicManagerUtils", "musicStruct.getMusicId is null");
            return;
        }
        String strA = eeq.a(musicStruct.getMusicId());
        String strB = eeq.b(strA.length() / 2);
        sb.append(eeq.d(6));
        sb.append(strB);
        sb.append(strA);
    }

    private static void m(MusicStruct musicStruct, StringBuilder sb) {
        if (musicStruct == null || sb == null) {
            return;
        }
        if (musicStruct.getMusicType() == -1) {
            LogUtil.j("MusicManagerUtils", "musicStruct.getMusicIndex is null");
            return;
        }
        String strD = eeq.d(musicStruct.getMusicType());
        String strB = eeq.b(strD.length() / 2);
        sb.append(eeq.d(7));
        sb.append(strB);
        sb.append(strD);
    }

    private static void j(MusicStruct musicStruct, StringBuilder sb) {
        if (musicStruct == null || sb == null) {
            return;
        }
        if (musicStruct.getMusicCopyright() == -1) {
            LogUtil.j("MusicManagerUtils", "musicStruct.getMusicCopyright is null");
            return;
        }
        String strD = eeq.d(musicStruct.getMusicCopyright());
        String strB = eeq.b(strD.length() / 2);
        sb.append(eeq.d(8));
        sb.append(strB);
        sb.append(strD);
    }

    private static void h(MusicStruct musicStruct, StringBuilder sb) {
        if (musicStruct == null || sb == null) {
            return;
        }
        if (musicStruct.getMusicEncryption() == -1) {
            LogUtil.j("MusicManagerUtils", "musicStruct.getMusicEncryption is null");
            return;
        }
        String strD = eeq.d(musicStruct.getMusicEncryption());
        String strB = eeq.b(strD.length() / 2);
        sb.append(eeq.d(9));
        sb.append(strB);
        sb.append(strD);
    }

    private static void c(MusicStruct musicStruct, StringBuilder sb) {
        if (musicStruct == null || sb == null) {
            return;
        }
        if (TextUtils.isEmpty(musicStruct.getMusicKey())) {
            LogUtil.j("MusicManagerUtils", "musicStruct.getMusicKey is null");
            return;
        }
        String musicKey = musicStruct.getMusicKey();
        String strB = eeq.b(musicKey.length() / 2);
        sb.append(eeq.d(10));
        sb.append(strB);
        sb.append(musicKey);
    }

    private static void a(MusicStruct musicStruct, StringBuilder sb) {
        if (musicStruct == null || sb == null) {
            return;
        }
        if (TextUtils.isEmpty(musicStruct.getMusicIv())) {
            LogUtil.j("MusicManagerUtils", "musicStruct.getMusicIv is null");
            return;
        }
        String musicIv = musicStruct.getMusicIv();
        String strB = eeq.b(musicIv.length() / 2);
        sb.append(eeq.d(11));
        sb.append(strB);
        sb.append(musicIv);
    }

    private static void e(MusicStruct musicStruct, StringBuilder sb) {
        if (musicStruct == null || sb == null) {
            return;
        }
        if (TextUtils.isEmpty(musicStruct.getAccountName())) {
            LogUtil.j("MusicManagerUtils", "musicStruct.getAccountName is null");
            return;
        }
        String strA = eeq.a(musicStruct.getAccountName());
        String strB = eeq.b(strA.length() / 2);
        sb.append(eeq.d(12));
        sb.append(strB);
        sb.append(strA);
    }

    private static void i(MusicStruct musicStruct, StringBuilder sb) {
        if (musicStruct == null || sb == null) {
            return;
        }
        if (musicStruct.getMusicAppType() == -1) {
            LogUtil.j("MusicManagerUtils", "musicStruct.getMusicAppType is null");
            return;
        }
        String strD = eeq.d(musicStruct.getMusicAppType());
        String strB = eeq.b(strD.length() / 2);
        sb.append(eeq.d(13));
        sb.append(strB);
        sb.append(strD);
    }

    private static void f(MusicStruct musicStruct, StringBuilder sb) {
        if (musicStruct == null || sb == null) {
            return;
        }
        if (musicStruct.getMusicDuration() == -1) {
            LogUtil.j("MusicManagerUtils", "assembleMusicDuration.getMusicDuration is null");
            return;
        }
        String strC = eeq.c(musicStruct.getMusicDuration());
        String strB = eeq.b(strC.length() / 2);
        sb.append(eeq.d(14));
        sb.append(strB);
        sb.append(strC);
    }

    private static void q(MusicStruct musicStruct, StringBuilder sb) {
        if (musicStruct == null || sb == null) {
            LogUtil.j("MusicManagerUtils", "assemblePackageName musicStruct or musicFileInfoListHex is null");
            return;
        }
        if (TextUtils.isEmpty(musicStruct.getPackageName())) {
            LogUtil.j("MusicManagerUtils", "assemblePackageName getPackageName is null");
            return;
        }
        String strA = eeq.a(musicStruct.getPackageName());
        String strB = eeq.b(strA.length() / 2);
        sb.append(eeq.d(15));
        sb.append(strB);
        sb.append(strA);
    }

    private static void g(MusicStruct musicStruct, StringBuilder sb) {
        if (musicStruct == null || sb == null) {
            LogUtil.j("MusicManagerUtils", "assembleMusicFolderName musicStruct or musicFileInfoListHex is null");
            return;
        }
        if (TextUtils.isEmpty(musicStruct.getMusicFolder())) {
            LogUtil.j("MusicManagerUtils", "assembleMusicFolderName getMusicFolder is null");
            return;
        }
        String strA = eeq.a(musicStruct.getMusicFolder());
        String strB = eeq.b(strA.length() / 2);
        sb.append(eeq.d(16));
        sb.append(strB);
        sb.append(strA);
    }

    private static void d(MusicStruct musicStruct, StringBuilder sb) {
        if (musicStruct == null || sb == null) {
            LogUtil.j("MusicManagerUtils", "assembleMusicAlbumId musicStruct or musicFileInfoListHex is null");
            return;
        }
        if (TextUtils.isEmpty(musicStruct.getMusicAlbumId())) {
            LogUtil.j("MusicManagerUtils", "assembleMusicFolderName getMusicAlbumId is null");
            return;
        }
        String strA = eeq.a(musicStruct.getMusicAlbumId());
        String strB = eeq.b(strA.length() / 2);
        sb.append(eeq.d(17));
        sb.append(strB);
        sb.append(strA);
    }

    private static void a(mak makVar, StringBuilder sb) {
        if (makVar == null || sb == null) {
            return;
        }
        if (makVar.a() == -1) {
            LogUtil.j("MusicManagerUtils", "musicStruct.getMusicDuration is null");
            return;
        }
        String strD = eeq.d(makVar.a());
        String strB = eeq.b(strD.length() / 2);
        sb.append(eeq.d(1));
        sb.append(strB);
        sb.append(strD);
    }

    private static void c(mak makVar, StringBuilder sb) {
        if (makVar == null || sb == null) {
            return;
        }
        if (makVar.b() == null) {
            LogUtil.j("MusicManagerUtils", "musicStruct.getAccountInfo is null");
            return;
        }
        String strA = eeq.a(makVar.b());
        String strB = eeq.b(strA.length() / 2);
        sb.append(eeq.d(2));
        sb.append(strB);
        sb.append(strA);
    }

    private static void e(mak makVar, StringBuilder sb) {
        if (makVar == null || sb == null) {
            return;
        }
        if (makVar.e() == -1) {
            LogUtil.j("MusicManagerUtils", "musicStruct.getAccountDeadline is null");
            return;
        }
        String strC = eeq.c(makVar.e());
        String strB = eeq.b(strC.length() / 2);
        sb.append(eeq.d(3));
        sb.append(strB);
        sb.append(strC);
    }

    private static void b(mak makVar, StringBuilder sb) {
        if (makVar == null || sb == null) {
            return;
        }
        if (makVar.c() == -1) {
            LogUtil.j("MusicManagerUtils", "musicStruct.getLastLoginTime is null");
            return;
        }
        String strC = eeq.c(makVar.c());
        String strB = eeq.b(strC.length() / 2);
        sb.append(eeq.d(4));
        sb.append(strB);
        sb.append(strC);
    }

    private static void d(mak makVar, StringBuilder sb) {
        if (makVar == null || sb == null) {
            return;
        }
        if (makVar.d() == -1) {
            LogUtil.j("MusicManagerUtils", "musicStruct.getAccountNotifyType is null");
            return;
        }
        String strD = eeq.d(makVar.d());
        String strB = eeq.b(strD.length() / 2);
        sb.append(eeq.d(5));
        sb.append(strB);
        sb.append(strD);
    }

    private static void d(int i2, StringBuilder sb) {
        if (sb == null) {
            return;
        }
        if (i2 == -1) {
            LogUtil.j("MusicManagerUtils", "assembleHistoryFrameAppType is null");
            return;
        }
        String strD = eeq.d(i2);
        String strB = eeq.b(strD.length() / 2);
        sb.append(eeq.d(1));
        sb.append(strB);
        sb.append(strD);
    }

    private static void d(String str, StringBuilder sb) {
        if (sb == null) {
            return;
        }
        if (str == null) {
            LogUtil.j("MusicManagerUtils", "assembleHistoryFrameAccountInfo is null");
            return;
        }
        String strA = eeq.a(str);
        String strB = eeq.b(strA.length() / 2);
        sb.append(eeq.d(2));
        sb.append(strB);
        sb.append(strA);
    }

    private static void d(List<eew> list) {
        int iA = 0;
        for (eew eewVar : list) {
            int iA2 = lsk.a(eewVar.e(), 16);
            if (iA2 != 1 && iA2 != 2) {
                if (iA2 == 3) {
                    iA = lsk.a(eewVar.b(), 16);
                } else {
                    LogUtil.j("MusicManagerUtils", "handleHistoryFrameCountMessage invalid type:", Integer.valueOf(lsk.a(eewVar.e(), 16)));
                }
            }
        }
        LogUtil.a("MusicManagerUtils", "frameCount:", Integer.valueOf(iA));
        f41217b.a(100000, Integer.valueOf(iA));
    }

    private static void b(List<eew> list, List<ees> list2) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        int iA = -1;
        int iA2 = -1;
        int iA3 = 0;
        int iA4 = -1;
        for (eew eewVar : list) {
            int iA5 = lsk.a(eewVar.e(), 16);
            if (iA5 == 1) {
                iA3 = lsk.a(eewVar.b(), 16);
            } else if (iA5 == 2) {
                d(eewVar, arrayList);
            } else if (iA5 == 3) {
                iA = lsk.a(eewVar.b(), 16);
            } else if (iA5 == 4) {
                iA4 = lsk.a(eewVar.b(), 16);
            } else if (iA5 == 5) {
                iA2 = lsk.a(eewVar.b(), 16);
            } else {
                LogUtil.j("MusicManagerUtils", "HandleNegotiationMessage invalid type:", Integer.valueOf(lsk.a(eewVar.e(), 16)));
            }
        }
        NegotiationData negotiationData = new NegotiationData();
        c(list2, negotiationData);
        negotiationData.setMusicFormatList(arrayList);
        negotiationData.setStorageSpace(iA3);
        LogUtil.a("MusicManagerUtils", "maxMusicNumber:", Integer.valueOf(iA));
        negotiationData.setMaxMusicNumber(iA);
        LogUtil.a("MusicManagerUtils", "handleNegotiationMessage:", arrayList.toString(), "storageSpace: ", Integer.valueOf(iA3));
        negotiationData.setMaxFolderNumber(iA4);
        negotiationData.setMusicQuality(iA2);
        LogUtil.a("MusicManagerUtils", "maxFolderNumber:", Integer.valueOf(iA4), "musicQuality:", Integer.valueOf(iA2));
        NegotiationCallbackInterface negotiationCallbackInterface = g;
        if (negotiationCallbackInterface != null) {
            negotiationCallbackInterface.onGetNegotiationData(negotiationData, 100000);
        } else {
            LogUtil.j("MusicManagerUtils", "negotiationCallbackInterface is null");
        }
    }

    private static void c(List<ees> list, NegotiationData negotiationData) {
        ArrayList arrayList = new ArrayList(16);
        if (list != null) {
            Iterator<ees> it = list.iterator();
            while (it.hasNext()) {
                Iterator<ees> it2 = it.next().b().iterator();
                while (it2.hasNext()) {
                    b(it2.next(), negotiationData, arrayList);
                }
            }
        } else {
            LogUtil.j("MusicManagerUtils", "tlvFatherList is null");
        }
        negotiationData.setTypeStructList(arrayList);
    }

    private static void b(ees eesVar, NegotiationData negotiationData, List<NegotiationData.TypeStruct> list) {
        if (eesVar == null || negotiationData == null) {
            LogUtil.j("MusicManagerUtils", "handleMusicTypeTlvFather, tlvFather or negotiationData is null.");
            return;
        }
        NegotiationData.TypeStruct typeStruct = new NegotiationData.TypeStruct();
        for (eew eewVar : eesVar.e()) {
            switch (lsk.a(eewVar.e(), 16)) {
                case 8:
                    negotiationData.setMusicType(lsk.a(eewVar.b(), 16));
                    typeStruct.setMusicType(lsk.a(eewVar.b(), 16));
                    LogUtil.a("MusicManagerUtils", "negotiationData getMusicType", Integer.valueOf(negotiationData.getMusicType()));
                    break;
                case 9:
                    a(eewVar, negotiationData, typeStruct);
                    break;
                case 10:
                    c(eewVar, negotiationData, typeStruct);
                    break;
                case 11:
                    b(eewVar, typeStruct);
                    break;
                case 12:
                    d(eewVar, typeStruct);
                    break;
                case 13:
                    i(eewVar, typeStruct);
                    break;
                case 14:
                    e(eewVar, typeStruct);
                    break;
                case 15:
                    c(eewVar, typeStruct);
                    break;
                case 16:
                    a(eewVar, typeStruct);
                    break;
                default:
                    LogUtil.j("MusicManagerUtils", "handleMusicTypeTlvFather type:", Integer.valueOf(lsk.a(eewVar.e(), 16)));
                    break;
            }
        }
        list.add(typeStruct);
    }

    private static void e(int i2, StringBuilder sb) {
        if (sb == null) {
            return;
        }
        if (i2 == -1) {
            LogUtil.j("MusicManagerUtils", "musicStruct.getMusicDuration is null");
            return;
        }
        String strD = eeq.d(i2);
        String strB = eeq.b(strD.length() / 2);
        sb.append(eeq.d(1));
        sb.append(strB);
        sb.append(strD);
    }

    private static void b(String str, StringBuilder sb) {
        if (sb == null) {
            return;
        }
        if (str == null) {
            LogUtil.j("MusicManagerUtils", "musicStruct.getAccountInfo is null");
            return;
        }
        String strA = eeq.a(str);
        String strB = eeq.b(strA.length() / 2);
        sb.append(eeq.d(2));
        sb.append(strB);
        sb.append(strA);
    }

    private static void c(int i2, StringBuilder sb) {
        if (sb == null) {
            return;
        }
        if (i2 == -1) {
            LogUtil.j("MusicManagerUtils", "assembleHistoryFrameIndex.getMusicDuration is null");
            return;
        }
        String strE = eeq.e(i2);
        String strB = eeq.b(strE.length() / 2);
        sb.append(eeq.d(3));
        sb.append(strB);
        sb.append(strE);
    }

    public static boolean g() {
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null) {
            return false;
        }
        LogUtil.a("MusicManagerUtils", "isSupportSendSwitchStatus deviceCapability is not null");
        return deviceCapabilityC.isSupportSendSwitchStatus();
    }

    public static void d(boolean z) {
        j = z;
    }

    public static boolean d() {
        DeviceInfo deviceInfoD = mgg.d("MusicManagerUtils");
        if (deviceInfoD == null) {
            LogUtil.j("MusicManagerUtils", "isDeviceDismissNewFolder deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoD, 64);
    }

    public static boolean e() {
        DeviceInfo deviceInfoD = mgg.d("MusicManagerUtils");
        if (deviceInfoD == null) {
            LogUtil.j("MusicManagerUtils", "isDeviceDismissOnlineMusic deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoD, 65);
    }

    public static boolean h() {
        DeviceInfo deviceInfoD = mgg.d("MusicManagerUtils");
        if (deviceInfoD == null) {
            LogUtil.j("MusicManagerUtils", "isSupportAuthorizationStatus deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoD, 66);
    }

    public static boolean d(DeviceInfo deviceInfo) {
        Map<String, DeviceCapability> mapD = lvb.e().d(1, deviceInfo.getDeviceIdentify(), "MusicManagerUtils");
        if (mapD == null || mapD.isEmpty()) {
            LogUtil.j("MusicManagerUtils", "isDeviceSupportCurFunction: queryDeviceCapability is null. ");
            return false;
        }
        DeviceCapability deviceCapability = mapD.get(deviceInfo.getDeviceIdentify());
        return deviceCapability != null && deviceCapability.isSupportMusicInfoList();
    }

    public static boolean c() {
        DeviceInfo deviceInfoC = mgg.c("MusicManagerUtils");
        return deviceInfoC != null && eei.d(deviceInfoC) && deviceInfoC.getProductType() == 74;
    }
}
