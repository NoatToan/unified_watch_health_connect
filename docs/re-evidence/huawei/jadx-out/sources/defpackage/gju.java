package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public class gju implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("id")
    private String f35327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("bestRecords")
    private Map<String, String> f35328c;

    @SerializedName(ParsedFieldTag.TASK_COMPLETE_TIME)
    private Long e;

    private gju(d dVar) {
        this.f35328c = dVar.f35329a;
        this.f35327b = dVar.d;
        this.e = dVar.f35330c;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.bl();
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<String, String> f35329a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f35330c;
        private String d;

        public d a(Map<String, String> map) {
            this.f35329a = map;
            return this;
        }

        public d e(String str) {
            this.d = str;
            return this;
        }

        public d d(Long l) {
            this.f35330c = l;
            return this;
        }

        public gju d() {
            return new gju(this);
        }
    }
}
