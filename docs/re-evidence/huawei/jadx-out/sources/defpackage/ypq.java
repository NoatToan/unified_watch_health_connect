package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsSize;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class ypq implements KfsConstraintValidator<KfsSize, float[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53731a;
    private int d;
    private String e;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsSize kfsSize) throws yny {
        ypx.a(kfsSize);
        this.f53731a = kfsSize.min();
        this.d = kfsSize.max();
        this.e = yoi.b(kfsSize, str);
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean isValid(float[] fArr) {
        if (fArr == null) {
            return true;
        }
        int length = fArr.length;
        return length >= this.f53731a && length <= this.d;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.e;
    }
}
