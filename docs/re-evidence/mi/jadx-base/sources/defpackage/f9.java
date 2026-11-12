package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lf9;", "Ljq$a;", "", "toString", "<init>", "()V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public class f9 extends jq.a {

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf9$a;", "Lf9;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends f9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f17540a = new a();
    }

    public f9() {
        super(new byte[0]);
    }

    @Override // jq.a
    @NotNull
    public String toString() {
        return "EchoCommand{bytes=" + tet.x(getBytes()) + AbstractJsonLexerKt.END_OBJ;
    }
}
