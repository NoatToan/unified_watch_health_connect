package defpackage;

import com.huawei.operation.utils.Constants;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class exw extends RuntimeException {
    private static final long serialVersionUID = -7980777896702070496L;

    public exw(String str) {
        super(String.format(Locale.ENGLISH, "Invalid version number %s.", str == null ? Constants.NULL : str));
    }
}
