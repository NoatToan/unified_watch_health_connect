package defpackage;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtils;
import health.compact.a.ReleaseLogUtil;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class njo implements Serializable {
    private static final long serialVersionUID = -406367943615323220L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mOptionData")
    private Map<String, String> f43095a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("mType")
    private int f43096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mMessageTime")
    private long f43097c;

    @SerializedName("mEventId")
    private int d;

    @SerializedName("mEmergence")
    private int e;

    public njo(String[] strArr) {
        if (strArr.length < 6) {
            LogUtil.a("Track_SportEventMessage", "SportEventMessage is too short");
            return;
        }
        this.f43097c = CommonUtils.i(strArr[1].split("=")[1]);
        this.f43096b = CommonUtils.j(strArr[2].split("=")[1]);
        this.e = CommonUtils.j(strArr[3].split("=")[1]);
        this.d = CommonUtils.j(strArr[4].split("=")[1]);
        for (int i = 5; i < strArr.length; i++) {
            d(strArr[i].split("=")[0], strArr[i].split("=")[1]);
        }
    }

    public njo(String str) {
        if (str == null || str.length() != 32) {
            LogUtil.j("Track_SportEventMessage", "eventDataStr is valid");
            return;
        }
        this.f43097c = CommonUtils.d(a(str, 0, 8), 16);
        this.f43096b = CommonUtils.c(a(str, 16, 18), 16);
        this.d = CommonUtils.c(a(str, 18, 20), 16);
        int iC = CommonUtils.c(a(str, 20, 22), 16);
        this.e = iC;
        LogUtil.j("Track_SportEventMessage", "eventDataStr = ", str, " mMessageTime = ", Long.valueOf(this.f43097c), " mType = ", Integer.valueOf(this.f43096b), " mEventId = ", Integer.valueOf(this.d), " color = ", Integer.valueOf(iC));
        b(str);
    }

    private void b(String str) {
        String str2;
        int iC = CommonUtils.c(a(str, 12, 16), 16);
        d("depth", Integer.toString(iC));
        LogUtil.j("Track_SportEventMessage", "buildOptionData depth = ", Integer.valueOf(iC));
        int i = this.d;
        if (i == 1 || i == 11) {
            str2 = "m-r-s";
        } else if (i == 10 || i == 16) {
            str2 = HwExerciseConstants.EXTRA_CNS;
        } else if (i == 13 || i == 14) {
            str2 = HwExerciseConstants.EXTRA_PRESSURE_OXYGEN;
        } else if (i == 21) {
            str2 = "angle";
        } else {
            if (i == 24) {
                d("gas", CommonUtils.c(a(str, 28, 30), 16) + "/" + CommonUtils.c(a(str, 30, 32), 16));
                return;
            }
            if (i == 25) {
                str2 = "ndl";
            } else if (i != 26 && i != 27) {
                str2 = "";
            } else {
                int iC2 = CommonUtils.c(a(str, 28, 30), 16);
                int iC3 = CommonUtils.c(a(str, 30, 32), 16);
                d("msid", Integer.toString(iC2));
                d("msty", Integer.toString(iC3));
                ReleaseLogUtil.d("Track_SportEventMessage", "buildOptionData mEventId = ", Integer.valueOf(this.d), " msty = ", Integer.valueOf(iC3), " msid = ", Integer.valueOf(iC2));
                return;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        d(str2, Integer.toString(CommonUtils.c(a(str, 28, 32), 16)));
    }

    public njo d(String str, String str2) {
        if (!this.f43095a.containsKey(str) && str != null) {
            this.f43095a.put(str, str2);
        }
        return this;
    }

    public String toString() {
        return "tp=msg;t=" + this.f43097c + ";ty=" + this.f43096b + ";e=" + this.e + ";id=" + this.d + ";" + ((CharSequence) c()) + System.lineSeparator();
    }

    private StringBuilder c() {
        StringBuilder sb = new StringBuilder();
        Map<String, String> map = this.f43095a;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append(";");
            }
        }
        return sb;
    }

    private static String a(String str, int i, int i2) {
        String strSubstring = str.substring(i, i2);
        StringBuilder sb = new StringBuilder();
        while (strSubstring.length() > 2) {
            sb.append(strSubstring.substring(strSubstring.length() - 2));
            strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
        }
        sb.append(strSubstring);
        return sb.toString();
    }
}
