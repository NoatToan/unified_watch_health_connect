package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.model.MedalConstants;

/* JADX INFO: loaded from: classes29.dex */
public class gkh implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("timestamp")
    private Long f35375a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(MedalConstants.EVENT_KEY)
    private String f35376c;

    @SerializedName("value")
    private d d;

    @SerializedName(MedalConstants.EVENT_KEYTYPE)
    private String e;

    private gkh(c cVar) {
        this.f35376c = cVar.f35377a;
        this.e = cVar.d;
        this.f35375a = cVar.e;
        this.d = cVar.f35378c;
    }

    public static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("calorie")
        private Float f35379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("duration")
        private Integer f35380c;

        private d(a aVar) {
            this.f35379b = aVar.f35381a;
            this.f35380c = aVar.f35382b;
        }

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Float f35381a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Integer f35382b;

            public a d(Float f) {
                this.f35381a = f;
                return this;
            }

            public a b(Integer num) {
                this.f35382b = num;
                return this;
            }

            public d c() {
                return new d(this);
            }
        }
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.bt();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35377a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f35378c;
        private String d;
        private Long e;

        public c c(String str) {
            this.f35377a = str;
            return this;
        }

        public c e(String str) {
            this.d = str;
            return this;
        }

        public c e(Long l) {
            this.e = l;
            return this;
        }

        public c a(d dVar) {
            this.f35378c = dVar;
            return this;
        }

        public gkh b() {
            return new gkh(this);
        }
    }
}
