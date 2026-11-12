package defpackage;

import com.huawei.hms.framework.network.restclient.Headers;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import com.huawei.networkclient.repository.DataConverterRepository;
import health.compact.a.LogUtil;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class ofm implements DataConverterRepository.DataConverter<oeq> {
    @Override // com.huawei.networkclient.repository.DataConverterRepository.DataConverter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public oeq convert(String str, Class<oeq> cls) {
        if (str == null) {
            return new oeq(Collections.EMPTY_MAP, new byte[0]);
        }
        return new oeq(Collections.EMPTY_MAP, str.getBytes(StandardCharsets.UTF_8));
    }

    @Override // com.huawei.networkclient.repository.DataConverterRepository.DataConverter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public oeq convert(ResponseBody responseBody, Headers headers, Class<oeq> cls) {
        Map<String, List<String>> multimap;
        byte[] bArrBytes;
        if (headers != null) {
            multimap = headers.toMultimap();
        } else {
            multimap = Collections.EMPTY_MAP;
        }
        if (responseBody == null) {
            return new oeq(multimap, new byte[0]);
        }
        try {
            bArrBytes = responseBody.bytes();
        } catch (IOException e) {
            LogUtil.d("ApiResponseConverter", "convert ApiResponse err: " + e.getMessage());
            bArrBytes = null;
        }
        return new oeq(multimap, bArrBytes);
    }

    @Override // com.huawei.networkclient.repository.DataConverterRepository.DataConverter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String revert(oeq oeqVar) {
        if (oeqVar == null || oeqVar.a() == null || oeqVar.a().length == 0) {
            return "";
        }
        return new String(oeqVar.a(), StandardCharsets.UTF_8);
    }
}
