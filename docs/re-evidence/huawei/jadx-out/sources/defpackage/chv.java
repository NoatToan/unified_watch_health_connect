package defpackage;

import com.huawei.hms.network.restclient.Converter;
import com.huawei.hms.network.restclient.RestClient;
import com.huawei.hms.network.restclient.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes4.dex */
public class chv {
    public static <T> T a(Class<T> cls, String str) {
        return (T) new RestClient.Builder().baseUrl(str).httpClient(chw.b()).addConverterFactory((Converter.Factory) GsonConverterFactory.create()).build().create(cls);
    }
}
