package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hms.framework.network.restclient.Headers;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import com.huawei.networkclient.repository.DataConverterRepository;
import health.compact.a.LogUtil;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public class ofn implements DataConverterRepository.DataConverter<String> {
    @Override // com.huawei.networkclient.repository.DataConverterRepository.DataConverter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String revert(String str) {
        return str;
    }

    @Override // com.huawei.networkclient.repository.DataConverterRepository.DataConverter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String convert(String str, Class<String> cls) {
        return str;
    }

    @Override // com.huawei.networkclient.repository.DataConverterRepository.DataConverter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public String convert(ResponseBody responseBody, Headers headers, Class<String> cls) {
        try {
            return new String(responseBody.bytes(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            LogUtil.d("StringConverter", "convert error ", ExceptionUtils.c(e));
            return null;
        }
    }
}
