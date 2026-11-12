package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Ll9;", "", "", "toString", "", "code", "I", PluginDeviceInfo.FMODEL, "()I", "desc", "Ljava/lang/String;", PluginDeviceInfo.FDESC, "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public class l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final String desc;

    public l9(int i, @NotNull String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.f24791a = i;
        this.desc = desc;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF24791a() {
        return this.f24791a;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public String toString() {
        return "ErrorCode{code=" + this.f24791a + ", desc=" + this.desc + AbstractJsonLexerKt.END_OBJ;
    }
}
