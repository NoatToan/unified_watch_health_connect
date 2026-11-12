package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wv, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lwv;", "", "", PluginDeviceInfo.FDESC, "", "toString", "", "code", "I", PluginDeviceInfo.FMODEL, "()I", "<init>", "(I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class ValidateResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int code;

    public ValidateResponse(int i) {
        this.code = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public final boolean b() {
        return this.code == 1;
    }

    @NotNull
    public String toString() {
        return "ValidateResponse(code=" + this.code + ')';
    }
}
