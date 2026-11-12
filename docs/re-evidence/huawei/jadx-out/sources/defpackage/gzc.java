package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.pluginachievement.manager.db.IAchieveDBMgr;

/* JADX INFO: loaded from: classes8.dex */
public class gzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("pageNo")
    private int f36253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("infoType")
    private int f36254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("type")
    private int f36255c;

    @SerializedName(IAchieveDBMgr.PARAM_PAGE_SIZE)
    private int d;

    @SerializedName("operType")
    private int e;

    private gzc(b bVar) {
        this.f36253a = bVar.f36256a;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f36254b = bVar.f36258c;
        this.f36255c = bVar.f36257b;
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f36256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f36257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f36258c;
        private int d;
        private int e;

        public b b(int i) {
            this.f36256a = i;
            return this;
        }

        public b d(int i) {
            this.d = i;
            return this;
        }

        public b c(int i) {
            this.e = i;
            return this;
        }

        public b e(int i) {
            this.f36258c = i;
            return this;
        }

        public b a(int i) {
            this.f36257b = i;
            return this;
        }

        public gzc c() {
            return new gzc(this);
        }
    }
}
