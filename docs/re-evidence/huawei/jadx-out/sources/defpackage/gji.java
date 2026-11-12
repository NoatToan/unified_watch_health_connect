package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gji implements IRequest {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("lang")
    private String f35274b;

    @SerializedName("workoutPackageId")
    private String d;

    private gji(b bVar) {
        this.f35274b = bVar.f35275a;
        this.d = bVar.d;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.ap();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35275a;
        private String d;

        public b e(String str) {
            this.f35275a = str;
            return this;
        }

        public b b(String str) {
            this.d = str;
            return this;
        }

        public gji b() {
            return new gji(this);
        }
    }
}
