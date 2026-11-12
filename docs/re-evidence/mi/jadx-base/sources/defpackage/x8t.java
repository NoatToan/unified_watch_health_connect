package defpackage;

import com.google.gson.GsonBuilder;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.request.BaseRequest;
import com.miui.tsmclient.common.net.request.SecureRequest;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class x8t<T extends CommonResponseInfo> extends SecureRequest<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, Object> f38871b;

    public x8t(String str, String str2, Class<T> cls) {
        super(str, str2, cls);
        this.f38871b = new HashMap();
        this.mRequestType = BaseRequest.RequestType.NORMAL;
        this.mContentType = "application/json;charset=UTF-8";
    }

    public void a(String str, Object obj) {
        if (obj != null) {
            this.f38871b.put(str, obj);
        }
    }

    @Override // com.miui.tsmclient.common.net.request.BaseRequest
    public String getCustomBody() {
        return new GsonBuilder().disableHtmlEscaping().create().toJson(this.f38871b);
    }
}
