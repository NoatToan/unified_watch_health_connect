package defpackage;

import android.os.Bundle;
import com.huawei.hwcommonmodel.datatypes.MusicInfo;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nbs {
    public static byte[] e(MusicInfo musicInfo) {
        String str;
        String str2;
        if (musicInfo == null) {
            return new byte[0];
        }
        Bundle bundle = musicInfo.getBundle();
        String string = bundle.getString("mSingerName");
        String string2 = bundle.getString("mSongName");
        int i = bundle.getInt("mPlayState");
        int i2 = bundle.getInt("mMaxVolume");
        int i3 = bundle.getInt("mCurrentVolume");
        StringBuffer stringBuffer = new StringBuffer(16);
        if (string == null || "".equals(string)) {
            str = eeq.d(1) + "0100";
        } else {
            str = eeq.d(1) + c(eeq.a(string).length() / 2) + eeq.a(string);
        }
        if (string2 == null || "".equals(string2)) {
            str2 = eeq.d(2) + "0100";
        } else {
            str2 = eeq.d(2) + c(eeq.a(string2).length() / 2) + eeq.a(string2);
        }
        String str3 = eeq.d(3) + eeq.d(1) + eeq.d(i);
        stringBuffer.append(str).append(str2).append(str3).append(eeq.d(4) + eeq.d(1) + eeq.d(i2)).append(eeq.d(5) + eeq.d(1) + eeq.d(i3));
        String string3 = stringBuffer.toString();
        LogUtil.a("MusicControlManager", "package packageMusicCommand :", string3);
        return eeq.c(string3);
    }

    private static String c(int i) {
        if (i > 127) {
            return eeq.d((i >> 7) + 128) + eeq.d(i & 127);
        }
        return eeq.d(i);
    }

    public static byte[] a(int i) {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(eeq.d(127) + eeq.d(4) + eeq.c(i));
        String string = stringBuffer.toString();
        LogUtil.a("MusicControlManager", "package Error Code Command:", string);
        return eeq.c(string);
    }
}
