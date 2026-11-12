package defpackage;

import com.huawei.wisesecurity.kfs.validation.constrains.KfsSize;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class ypz implements KfsConstraintValidator<KfsSize, Object[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f53744b;
    private String d;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsSize kfsSize) throws yny {
        ypx.a(kfsSize);
        this.f53744b = kfsSize.min();
        this.f53743a = kfsSize.max();
        this.d = yoi.b(kfsSize, str);
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean isValid(Object[] objArr) {
        if (objArr == null) {
            return true;
        }
        int length = objArr.length;
        return length >= this.f53744b && length <= this.f53743a;
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.d;
    }
}
