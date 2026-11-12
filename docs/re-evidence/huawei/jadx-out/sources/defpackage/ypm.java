package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsSize;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class ypm implements KfsConstraintValidator<KfsSize, Map> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53725c;
    private int d;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsSize kfsSize) throws yny {
        ypx.a(kfsSize);
        this.f53725c = kfsSize.min();
        this.d = kfsSize.max();
        this.f53724b = yoi.b(kfsSize, str);
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean isValid(Map map) {
        if (map == null) {
            return true;
        }
        int size = map.size();
        return size >= this.f53725c && size <= this.d;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.f53724b;
    }
}
