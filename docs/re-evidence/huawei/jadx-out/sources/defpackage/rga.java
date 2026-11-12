package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwmusiccontrolmgr.datatype.MusicSong;
import com.huawei.ui.device.R;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class rga {
    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "#";
        }
        String strB = aji.b(str, "");
        if (TextUtils.isEmpty(strB)) {
            return "#";
        }
        String upperCase = strB.substring(0, 1).toUpperCase(Locale.ENGLISH);
        return upperCase.matches("[A-Z]") ? upperCase : "#";
    }

    public static int a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return 1;
        }
        if (TextUtils.isEmpty(str2)) {
            return -1;
        }
        if (!"#".equals(str) && !"#".equals(str2)) {
            return str.compareTo(str2);
        }
        if ("#".equals(str)) {
            return !"#".equals(str2) ? 1 : 0;
        }
        return -1;
    }

    public static String a(Context context, MusicSong musicSong) {
        if (musicSong == null) {
            return "";
        }
        String songSingerName = musicSong.getSongSingerName();
        return (TextUtils.isEmpty(songSingerName) || !"<unknown>".equalsIgnoreCase(songSingerName)) ? songSingerName : context.getResources().getString(R.string.IDS_music_unknown_artist);
    }
}
