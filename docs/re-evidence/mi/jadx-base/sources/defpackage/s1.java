package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.c;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Ls1;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "year", "S", PluginDeviceInfo.FICONON, "()S", "", "month", c.f13755a, PluginDeviceInfo.FDESC, "()B", "day", PluginDeviceInfo.FMODEL, "<init>", "(SBB)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f33146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f33147b;
    public final byte c;

    public s1(short s, byte b2, byte b3) {
        this.f33146a = s;
        this.f33147b = b2;
        this.c = b3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte getF33147b() {
        return this.f33147b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final short getF33146a() {
        return this.f33146a;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) other;
        return this.f33146a == s1Var.f33146a && this.f33147b == s1Var.f33147b && this.c == s1Var.c;
    }

    public int hashCode() {
        return (((Short.hashCode(this.f33146a) * 31) + Byte.hashCode(this.f33147b)) * 31) + Byte.hashCode(this.c);
    }

    @NotNull
    public String toString() {
        return "Birth[year: " + ((int) this.f33146a) + ", month: " + ((int) this.f33147b) + ", day: " + ((int) this.c) + AbstractJsonLexerKt.END_LIST;
    }
}
