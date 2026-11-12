package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class dcz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("interuptInfos")
    private List<e> f31617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("intrNum")
    private int f31618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("isAutoEnd")
    private boolean f31619c;

    @SerializedName(CommonConstant.KEY_GENDER)
    private int d;

    @SerializedName("age")
    private int e;

    @SerializedName("sleepStat")
    private a f;

    @SerializedName("sleepReportData")
    private String g;

    @SerializedName("sleepScore")
    private int h;

    @SerializedName("periodInfos")
    private List<c> i;

    @SerializedName("sdkVersion")
    private int j;

    @SerializedName("voiceStat")
    private h k;

    @SerializedName(JsbMapKeyNames.H5_USER_ID)
    private String m;

    @SerializedName("symptoms")
    private b n;

    @SerializedName("VoiceInfoarray")
    private List<d> o;

    public a e() {
        return this.f;
    }

    public boolean a() {
        return this.f31619c;
    }

    public String toString() {
        return "SleepMonitorInfo{userId='" + this.m + "', age=" + this.e + ", gender=" + this.d + ", sleepScore=" + this.h + ", intrNum=" + this.f31618b + ", sleepStat=" + this.f + ", sleepPeriodInfos=" + this.i + ", interruptInfos=" + this.f31617a + ", voiceInfoArray=" + this.o + ", sleepSymptoms=" + this.n + ", sleepReportData='" + this.g + "', voiceStat=" + this.k + ", sdkVersion=" + this.j + ", isAutoEnd=" + this.f31619c + '}';
    }

    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("envdbmax")
        private int f31633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("envdbavg")
        private int f31634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("envdball")
        private long f31635c;

        @SerializedName("envdb")
        private int[] d;

        @SerializedName("counter")
        private long e;

        @SerializedName("snoreavgdb")
        private int f;

        @SerializedName("snoremaxdb")
        private int g;

        @SerializedName("snorelength")
        private long h;

        @SerializedName("envdbmin")
        private int i;

        @SerializedName("snorefreq")
        private int j;

        @SerializedName("snorenum")
        private int n;

        public String toString() {
            return "SleepVoiceStat{envdbAll=" + this.f31635c + ", counter=" + this.e + ", envdb=" + Arrays.toString(this.d) + ", envdbAvg=" + this.f31634b + ", envdbMax=" + this.f31633a + ", envdbMin=" + this.i + ", snoreNum=" + this.n + ", snoreAvgDb=" + this.f + ", snoreMaxDb=" + this.g + ", snoreLength=" + this.h + ", snoreFreq=" + this.j + '}';
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("sym1_lvl")
        private int f31623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("sym2_idx")
        private int f31624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("sym1_idx")
        private int f31625c;

        @SerializedName("sym2_lvl")
        private int e;

        public String toString() {
            return "SleepSymptoms{firstSymptomsId=" + this.f31625c + ", firstSymptomsLevel=" + this.f31623a + ", secondSymptomsId=" + this.f31624b + ", secondSymptomsLevel=" + this.e + '}';
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("voice_duration")
        private int f31628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("voice_start_time")
        private long f31629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("voice_filepath")
        private String f31630c;

        @SerializedName("voice_type")
        private int d;

        public String toString() {
            return "SleepVoiceInfo{voiceStartTime=" + this.f31629b + ", voiceDuration=" + this.f31628a + ", voiceFilePath=" + this.f31630c + ", voiceType=" + this.d + '}';
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("interupt_duration")
        private long f31631a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("interupt_start_time")
        private long f31632c;

        public String toString() {
            return "SleepInteruptInfo{interruptStartTime=" + this.f31632c + ", interruptLength=" + this.f31631a + '}';
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("period_type")
        private int f31626a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("period_duration")
        private int f31627c;

        public String toString() {
            return "SleepPeriodInfo{periodType=" + this.f31626a + ", periodDuration=" + this.f31627c + '}';
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("awaketime")
        private int f31620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("deepsleepnum")
        private int f31621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("awakecount")
        private int f31622c;

        @SerializedName("deepsleeptime")
        private int d;

        @SerializedName("deepdesc")
        private int e;

        @SerializedName("interupttime")
        private int f;

        @SerializedName("lightdesc")
        private int g;

        @SerializedName("dreamdesc")
        private int h;

        @SerializedName("fallsleeptime")
        private int i;

        @SerializedName("lightsleeptime")
        private int j;

        @SerializedName("sleepbegintime")
        private long k;

        @SerializedName("remtime")
        private int l;

        @SerializedName("totalsleeptime")
        private int m;

        @SerializedName("sleependtime")
        private long n;

        @SerializedName("unknowtime")
        private int o;

        @SerializedName("validsleeptime")
        private int q;

        public long c() {
            return this.k;
        }

        public long b() {
            return this.n;
        }

        public String toString() {
            return "SleepMonitorStat{sleepBeginTime=" + this.k + ", sleepEndTime=" + this.n + ", fallSleepTime=" + this.i + ", totalSleepTime=" + this.m + ", interruptTime=" + this.f + ", deepSleepTime=" + this.d + ", lightSleepTime=" + this.j + ", remTime=" + this.l + ", awakeTime=" + this.f31620a + ", unknowTime=" + this.o + ", deepDesc=" + this.e + ", lightDesc=" + this.g + ", dreamDesc=" + this.h + ", validSleepTime=" + this.q + ", deepSleepNumber=" + this.f31621b + ", awakeCount=" + this.f31622c + '}';
        }
    }

    public static dcz a(String str) {
        dcz dczVar = new dcz();
        try {
            return (dcz) HiJsonUtil.d(str, dcz.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.j("SleepMonitorInfo", "SleepMonitorInfo fromJson is jsonSyntaxException");
            return dczVar;
        }
    }
}
