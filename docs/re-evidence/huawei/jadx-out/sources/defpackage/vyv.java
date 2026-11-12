package defpackage;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.application.BaseApplication;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes43.dex */
public class vyv extends vys {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("label")
    private String[] f51711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("offeringSource")
    private int f51712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("age")
    private int f51713c;

    @SerializedName("sex")
    private int d;

    @SerializedName("pagination")
    private vyz e;

    @SerializedName("timeZone")
    private String i;

    @SerializedName(TtmlNode.TAG_STYLE)
    private String j;

    private vyv(d dVar) {
        super(dVar);
        this.d = dVar.f51715b;
        this.f51713c = dVar.f51716c;
        this.j = dVar.i;
        this.f51711a = dVar.f51714a;
        this.e = dVar.e;
        this.i = dVar.g;
        this.f51712b = dVar.d;
    }

    public static final class d extends vys.c<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String[] f51714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f51715b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f51716c;
        private int d;
        private vyz e;
        private String g;
        private String i;

        public d a(int i) {
            this.f51715b = i;
            return this;
        }

        public d c(int i) {
            this.f51716c = i;
            return this;
        }

        public d c(String str) {
            this.i = str;
            return this;
        }

        public d a(String str) {
            this.g = str;
            return this;
        }

        public d c(String[] strArr) {
            this.f51714a = strArr;
            return this;
        }

        public d b(vyz vyzVar) {
            this.e = vyzVar;
            return this;
        }

        public d b(int i) {
            this.d = i;
            return this;
        }

        public vyv c() {
            return new vyv(this);
        }
    }

    @Override // defpackage.vys, com.huawei.networkclient.IRequest
    public String getUrl() {
        return GRSManager.c(BaseApplication.b()).getUrl("domainHealthrecommendHicloud") + "/mall/targetRecommend";
    }
}
