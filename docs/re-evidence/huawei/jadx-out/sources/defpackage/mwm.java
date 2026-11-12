package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.network.embedded.k;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mwm implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("sleepLinkageV2Controller")
    private e f42576c;

    public e a() {
        return this.f42576c;
    }

    public String toString() {
        return "HiAiSleepVer2CloudConfigBean{sleepLinkageV2Controller=" + this.f42576c + '}';
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("nightOtherAllSupport")
        private boolean f42577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("nightMinSupportVersionList")
        private List<String> f42578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName(k.g)
        private boolean f42579c;

        @SerializedName("nightGreySupportVersionList")
        private List<String> d;

        @SerializedName("nightSupportVersionList")
        private List<String> e;

        @SerializedName("noonSupportVersionList")
        private List<String> f;

        @SerializedName("noonOtherAllSupport")
        private boolean h;

        @SerializedName("noonMinSupportVersionList")
        private List<String> i;

        @SerializedName("uidTailNumberWhiteList")
        private List<String> j;

        public boolean i() {
            return this.f42579c;
        }

        public List<String> a() {
            return a(this.d);
        }

        public List<String> f() {
            return a(this.j);
        }

        public List<String> d() {
            return a(this.e);
        }

        public List<String> e() {
            return a(this.f42578b);
        }

        public boolean j() {
            return this.f42577a;
        }

        public List<String> c() {
            return a(this.f);
        }

        public List<String> b() {
            return a(this.i);
        }

        public boolean g() {
            return this.h;
        }

        private List<String> a(List<String> list) {
            return list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
        }

        public String toString() {
            return "SleepLinkageV2Controller{enable=" + this.f42579c + ", nightGreySupportVersionList=" + this.d + ", uidTailNumberWhiteList=" + this.j + ", nightSupportVersionList=" + this.e + ", nightMinSupportVersionList=" + this.f42578b + ", nightOtherAllSupport=" + this.f42577a + ", noonSupportVersionList=" + this.f + ", noonMinSupportVersionList=" + this.i + ", noonOtherAllSupport=" + this.h + '}';
        }
    }
}
