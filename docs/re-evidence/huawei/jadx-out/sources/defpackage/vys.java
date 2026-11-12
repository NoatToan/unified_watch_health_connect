package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.networkclient.IRequest;

/* JADX INFO: loaded from: classes43.dex */
public class vys implements IRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("phoneType")
    private String f51704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("petalOaid")
    private String f51705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("deviceId")
    private String f51706c;

    @Override // com.huawei.networkclient.IRequest
    public String getUrl() {
        return null;
    }

    protected vys(c cVar) {
        this.f51704a = cVar.d;
        this.f51705b = cVar.e;
        this.f51706c = cVar.f51707c;
    }

    public static class c<T extends c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f51707c;
        private String d;
        private String e;

        public T d(String str) {
            this.e = str;
            return this;
        }

        public T b(String str) {
            this.f51707c = str;
            return this;
        }

        public T e(String str) {
            this.d = str;
            return this;
        }
    }
}
