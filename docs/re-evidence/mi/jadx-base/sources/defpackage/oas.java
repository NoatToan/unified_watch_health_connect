package defpackage;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.entity.DoorCardProduct;
import com.miui.tsmclient.entity.digitalkey.ProductList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class oas extends CommonResponseInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("data")
    public a f28941a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("proprietaryProtocolProducts")
        public List<DoorCardProduct> f28942a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("digitalKeyProducts")
        public List<ProductList.ProductInfo> f28943b;

        public List<DoorCardProduct> a() {
            return this.f28942a;
        }
    }

    public a a() {
        return this.f28941a;
    }
}
