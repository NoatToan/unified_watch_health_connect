package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.parser.schema.DailyReportKey;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\n\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Lm2;", "", "", "toString", "", "hashCode", "other", "", "equals", "", DailyReportKey.diastolic, "S", PluginDeviceInfo.FMODEL, "()S", DailyReportKey.systolic, PluginDeviceInfo.FDESC, "<init>", "(SS)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f25662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f25663b;

    public m2(short s, short s2) {
        this.f25662a = s;
        this.f25663b = s2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final short getF25662a() {
        return this.f25662a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final short getF25663b() {
        return this.f25663b;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) other;
        return this.f25662a == m2Var.f25662a && this.f25663b == m2Var.f25663b;
    }

    public int hashCode() {
        return (Short.hashCode(this.f25662a) * 31) + Short.hashCode(this.f25663b);
    }

    @NotNull
    public String toString() {
        return "BloodPressure[舒张压：" + ((int) this.f25662a) + ", 收缩压：" + ((int) this.f25663b) + AbstractJsonLexerKt.END_LIST;
    }
}
