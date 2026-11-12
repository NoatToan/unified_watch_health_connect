package defpackage;

import android.text.TextUtils;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsStringNotEmpty;
import com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator;

/* JADX INFO: loaded from: classes20.dex */
public class yoo implements KfsConstraintValidator<KfsStringNotEmpty, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53702a;

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void initialize(String str, KfsStringNotEmpty kfsStringNotEmpty) throws yny {
        this.f53702a = yoi.b(kfsStringNotEmpty.message(), str + " can't be empty");
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean isValid(String str) {
        return !TextUtils.isEmpty(str);
    }

    @Override // com.huawei.wisesecurity.kfs.validation.constrains.validator.KfsConstraintValidator
    public String getMessage() {
        return this.f53702a;
    }
}
