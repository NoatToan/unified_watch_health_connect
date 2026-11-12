package defpackage;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.entity.digitalkey.CertificateInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ffs extends CommonResponseInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("data")
    public a f17749a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("certificates")
        public List<CertificateInfo> f17750a;

        public List<CertificateInfo> a() {
            return this.f17750a;
        }
    }

    public List<CertificateInfo> a() {
        a aVar = this.f17749a;
        return aVar != null ? aVar.a() : new ArrayList();
    }
}
