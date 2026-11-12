package defpackage;

import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.hms.framework.network.restclient.Headers;
import com.huawei.hms.framework.network.restclient.hwhttp.ResponseBody;
import com.huawei.networkclient.repository.DataConverterRepository;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes3.dex */
public class ofo<Output> implements DataConverterRepository.DataConverter<Output> {
    @Override // com.huawei.networkclient.repository.DataConverterRepository.DataConverter
    public Output convert(String str, Class<Output> cls) {
        return (Output) ofe.c().fromJson(str, (Class) cls);
    }

    @Override // com.huawei.networkclient.repository.DataConverterRepository.DataConverter
    public Output convert(ResponseBody responseBody, Headers headers, Class<Output> cls) {
        try {
            return (Output) ofe.c().fromJson(responseBody.charStream(), (Class) cls);
        } catch (OutOfMemoryError e) {
            ReleaseLogUtil.b("R_GsonConverter", "convert to fail", ExceptionUtils.c(e));
            return null;
        } finally {
            FileUtils.a(responseBody.getInputStream());
        }
    }

    @Override // com.huawei.networkclient.repository.DataConverterRepository.DataConverter
    public String revert(Output output) {
        return ofe.c(output);
    }
}
