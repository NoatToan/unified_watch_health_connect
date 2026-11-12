package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.jsoperation.JsUtil;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ddb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("deep_sleep_duration")
    private long f31640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("awake_count")
    private int f31641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("age")
    private int f31642c;

    @SerializedName("begin_time")
    private long d;

    @SerializedName("awake_sleep_duration")
    private long e;

    @SerializedName("interupt_details")
    private List<b> f;

    @SerializedName("env_noise")
    private d g;

    @SerializedName("end_time")
    private long h;

    @SerializedName(CommonConstant.KEY_GENDER)
    private int i;

    @SerializedName("fallasleep_duration")
    private long j;

    @SerializedName("interup_duration")
    private long k;

    @SerializedName("period_details")
    private List<a> l;

    @SerializedName("rem_sleep_duration")
    private long m;

    @SerializedName("sleepMerge")
    private e n;

    @SerializedName("light_sleep_duration")
    private long o;

    @SerializedName("valid_sleep_duration")
    private long p;

    @SerializedName("total_duration")
    private long q;

    @SerializedName(JsUtil.SCORE)
    private int r;

    @SerializedName("unknow_sleep_duration")
    private long s;

    @SerializedName("symptoms")
    private h t;

    @SerializedName("voice_infos")
    private List<c> v;

    /* JADX INFO: loaded from: classes24.dex */
    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("envdblevel")
        private int f31652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("sym1_lvl")
        private int f31653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("interuptlevel")
        private int f31654c;

        @SerializedName("sym1_idx")
        private int d;

        @SerializedName("envdb")
        private int e;

        @SerializedName("starnum")
        private int f;

        @SerializedName("totalscore")
        private int g;

        @SerializedName("totalsleeptime")
        private int h;

        @SerializedName("sym2_idx")
        private int i;

        @SerializedName("sym2_lvl")
        private int j;

        public String toString() {
            return "SleepMerge{totalscore=" + this.g + ", starNumber=" + this.f + ", totalSleepTime=" + this.h + ", envDb=" + this.e + ", envDbLevel=" + this.f31652a + ", interruptLevel=" + this.f31654c + ", firstSymptomsId=" + this.d + ", firstSymptomsLevel=" + this.f31653b + ", secondSymptomsId=" + this.i + ", secondSymptomsLevel=" + this.j + '}';
        }
    }

    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("sym1_idx")
        private int f31655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("sym2_lvl")
        private int f31656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("sym2_idx")
        private int f31657c;

        @SerializedName("sym1_lvl")
        private int e;

        public String toString() {
            return "SleepSymptoms{firstSymptomsId=" + this.f31655a + ", firstSymptomsLevel=" + this.e + ", secondSymptomsId=" + this.f31657c + ", secondSymptomsLevel=" + this.f31656b + '}';
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("env_db_avg")
        private int f31649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("env_db_infos")
        private int[] f31650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("snore_avgdb")
        private int f31651c;

        @SerializedName("env_db_max")
        private int d;

        @SerializedName("env_db_min")
        private int e;

        @SerializedName("snore_max_db")
        private int f;

        @SerializedName("snore_duration")
        private long h;

        @SerializedName("snore_count")
        private int i;

        public int[] a() {
            int[] iArr = this.f31650b;
            if (iArr == null) {
                return new int[0];
            }
            return (int[]) iArr.clone();
        }

        public int d() {
            return this.f31649a;
        }

        public int c() {
            return this.d;
        }

        public int e() {
            return this.e;
        }

        public String toString() {
            return "EnvNoiseInfo{envDbInfos=" + Arrays.toString(this.f31650b) + ", envDbAvg=" + this.f31649a + ", envDbMax=" + this.d + ", envDbMin=" + this.e + ", snoreCount=" + this.i + ", snoreAvgDb=" + this.f31651c + ", snoreMaxDb=" + this.f + ", snoreDuration=" + this.h + '}';
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("period_duration")
        private long f31643c;

        @SerializedName("period_type")
        private long e;

        public long d() {
            return this.e;
        }

        public long c() {
            return this.f31643c;
        }

        public String toString() {
            return "PeriodInfo{periodType=" + this.e + ", periodDuration=" + this.f31643c + '}';
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("voice_duration")
        private int f31646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("voice_start_time")
        private long f31647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("voice_type")
        private int f31648c;

        @SerializedName("voice_filepath")
        private String d;

        public long a() {
            return this.f31647b;
        }

        public int b() {
            return this.f31646a;
        }

        public String d() {
            return this.d;
        }

        public int e() {
            return this.f31648c;
        }

        public String toString() {
            return "SleepMonitorReportVoice{voiceStartTime=" + this.f31647b + ", voiceDuration=" + this.f31646a + ", voiceFilepath='" + this.d + "', voiceType=" + this.f31648c + '}';
        }

        public int hashCode() {
            String str = this.d;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.d == null && cVar.d() == null) {
                return true;
            }
            if (this.d != null || cVar.d() == null) {
                return d().equals(cVar.d());
            }
            return false;
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("interupt_duration")
        private long f31644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("interupt_start_time")
        private long f31645c;

        public String toString() {
            return "InterruptInfo{interruptStartTime=" + this.f31645c + ", interruptDuration=" + this.f31644b + '}';
        }
    }

    public long b() {
        return this.d;
    }

    public long e() {
        return this.h;
    }

    public long g() {
        return this.p;
    }

    public int a() {
        return this.f31641b;
    }

    public int f() {
        return this.r;
    }

    public List<c> i() {
        return this.v;
    }

    public List<a> c() {
        return this.l;
    }

    public d d() {
        return this.g;
    }

    public h j() {
        return this.t;
    }

    public String toString() {
        return "SleepMonitorReport{age=" + this.f31642c + ", gender=" + this.i + ", beginTime=" + this.d + ", endTime=" + this.h + ", totalDuration=" + this.q + ", fallSleepDuration=" + this.j + ", interruptDuration=" + this.k + ", deepSleepDuration=" + this.f31640a + ", lightSleepDuration=" + this.o + ", remSleepDuration=" + this.m + ", awakeSleepDuration=" + this.e + ", unknowSleepDuration=" + this.s + ", validSleepDuration=" + this.p + ", awakeCount=" + this.f31641b + ", sleepScore=" + this.r + ", interruptDetails=" + this.f + ", voiceInfos=" + this.v + ", periodDetails=" + this.l + ", envNoise=" + this.g + ", symptoms=" + this.t + '}';
    }

    public static ddb a(String str) {
        ddb ddbVar = new ddb();
        try {
            return (ddb) HiJsonUtil.d(str, ddb.class);
        } catch (JsonSyntaxException unused) {
            LogUtil.j("SleepMonitorReport", "SleepMonitorReport fromJson is jsonSyntaxException");
            return ddbVar;
        }
    }
}
