package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.hms.framework.network.restclient.Converter;
import com.huawei.hms.framework.network.restclient.RestClient;
import com.huawei.hms.framework.network.restclient.hwhttp.RequestBody;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import health.compact.a.LogUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public class ofc extends Converter.Factory {
    @Override // com.huawei.hms.framework.network.restclient.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, RestClient restClient) {
        if (String.class.equals(type)) {
            return new Converter() { // from class: ofa
                @Override // com.huawei.hms.framework.network.restclient.Converter
                public final Object convert(Object obj) {
                    return ofc.e((ResponseBody) obj);
                }
            };
        }
        return null;
    }

    static /* synthetic */ String e(ResponseBody responseBody) throws IOException {
        InputStream inputStream = responseBody.getInputStream();
        if (inputStream == null) {
            LogUtil.d("StringConverterFactory", " response body null");
            return "";
        }
        int iAvailable = inputStream.available() > 0 ? inputStream.available() : 2048;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iAvailable);
        try {
            try {
                byte[] bArr = new byte[Math.min(iAvailable, 2048)];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                }
                byteArrayOutputStream.flush();
            } catch (IOException e) {
                LogUtil.e("StringConverterFactory", "convert to String error:", ExceptionUtils.c(e));
            }
            return byteArrayOutputStream.toString("UTF-8");
        } finally {
            FileUtils.a(inputStream);
            FileUtils.a(byteArrayOutputStream);
        }
    }

    @Override // com.huawei.hms.framework.network.restclient.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, RestClient restClient) {
        if (String.class.equals(type)) {
            return new Converter() { // from class: ofd
                @Override // com.huawei.hms.framework.network.restclient.Converter
                public final Object convert(Object obj) {
                    return RequestBody.create("text/plain; charset=UTF-8", ((String) obj).getBytes(StandardCharsets.UTF_8));
                }
            };
        }
        return null;
    }
}
