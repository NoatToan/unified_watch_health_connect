package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes29.dex */
public class gob implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("audioId")
    private int f35867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("endTimeStamp")
    private long f35868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("startTimeStamp")
    private long f35869c;

    @SerializedName(KakaConstants.SLEEP_MUSIC_DURATION)
    private int d;

    @SerializedName("timeZone")
    private String e;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f35870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f35871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f35872c;
        private int d;
        private long e;

        public b c(int i) {
            this.f35870a = i;
            return this;
        }

        public b b(long j) {
            this.f35871b = j;
            return this;
        }

        public b a(long j) {
            this.e = j;
            return this;
        }

        public b a(int i) {
            this.d = i;
            return this;
        }

        public b b(String str) {
            this.f35872c = str;
            return this;
        }

        public gob e() {
            return new gob(this);
        }
    }

    private gob(b bVar) {
        this.f35867a = bVar.f35870a;
        this.f35869c = bVar.f35871b;
        this.f35868b = bVar.e;
        this.d = bVar.d;
        this.e = bVar.f35872c;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("sportSuggestUrl") + "/user/addSleepPlayLog";
    }
}
