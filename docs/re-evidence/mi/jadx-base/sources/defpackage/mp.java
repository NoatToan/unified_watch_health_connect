package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lmp;", "Lnbt;", "", "toString", "()Ljava/lang/String;", "", "code", "I", PluginDeviceInfo.FMODEL, "()I", "<init>", "(I)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class mp implements nbt {
    public final int t;

    public mp(int i) {
        this.t = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public int getT() {
        return this.t;
    }

    @NotNull
    public String toString() {
        return "ProtocolAuthError{code:" + getT() + ", desc: " + p0.v.a(getT()) + AbstractJsonLexerKt.END_OBJ;
    }
}
