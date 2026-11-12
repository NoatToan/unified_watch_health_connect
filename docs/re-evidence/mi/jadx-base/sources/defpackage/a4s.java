package defpackage;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.entity.DoorCardProduct;
import com.miui.tsmclient.entity.digitalkey.ProductList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class a4s extends CommonResponseInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("data")
    public a f618a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("proprietaryProtocolProducts")
        public List<DoorCardProduct> f619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("cccProducts")
        public List<ProductList.ProductInfo> f620b;

        @SerializedName("iccoaV2Products")
        public List<ProductList.ProductInfo> c;

        public List<ProductList.ProductInfo> a() {
            return this.f620b;
        }
    }

    public a a() {
        return this.f618a;
    }
}
