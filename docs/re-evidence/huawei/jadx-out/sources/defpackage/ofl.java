package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.hms.framework.network.restclient.Headers;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import com.huawei.networkclient.repository.DataConverterRepository;
import health.compact.a.LogUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public class ofl implements DataConverterRepository.DataConverter<byte[]> {
    @Override // com.huawei.networkclient.repository.DataConverterRepository.DataConverter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] convert(String str, Class<byte[]> cls) {
        return str.getBytes();
    }

    @Override // com.huawei.networkclient.repository.DataConverterRepository.DataConverter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public byte[] convert(ResponseBody responseBody, Headers headers, Class<byte[]> cls) {
        InputStream inputStream = responseBody.getInputStream();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                try {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (IOException e) {
                    LogUtil.d("ByteArrayConverter", "convert error ", ExceptionUtils.c(e));
                }
            } catch (Throwable th) {
                FileUtils.a(responseBody.getInputStream());
                throw th;
            }
        }
        FileUtils.a(responseBody.getInputStream());
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.huawei.networkclient.repository.DataConverterRepository.DataConverter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String revert(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }
}
