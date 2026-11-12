package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes29.dex */
public class gjs implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("planId")
    private String f35318a;

    @SerializedName("remindTime")
    private Integer d;

    private gjs(e eVar) {
        this.f35318a = eVar.f35319a;
        this.d = eVar.f35320c;
    }

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return gkv.bh();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f35319a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f35320c;

        public e a(String str) {
            this.f35319a = str;
            return this;
        }

        public e b(Integer num) {
            this.f35320c = num;
            return this;
        }

        public gjs e() {
            return new gjs(this);
        }
    }
}
