package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsSize;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class ypo implements KfsConstraintValidator<KfsSize, boolean[]> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f53728c;
    private int e;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsSize kfsSize) throws yny {
        ypx.a(kfsSize);
        this.e = kfsSize.min();
        this.f53728c = kfsSize.max();
        this.f53727b = yoi.b(kfsSize, str);
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean isValid(boolean[] zArr) {
        if (zArr == null) {
            return true;
        }
        int length = zArr.length;
        return length >= this.e && length <= this.f53728c;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.f53727b;
    }
}
