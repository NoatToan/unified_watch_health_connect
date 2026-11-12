package defpackage;

import com.miui.circulate.device.api.Constant;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0012"}, d2 = {"Lcb;", "Lz3;", "", "i", "", "totalSize", "I", Constant.KeyValue.KEY_COLUMN, "()I", RnReportConst.ApiReport.PARAM_MODULE, "j", "flag", "sessionId", "packetIndex", "data", q.f13858b, "<init>", "(IIIII[BI)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class cb extends z3 {
    public final int h;
    public final int i;

    public /* synthetic */ cb(int i, int i2, int i3, int i4, int i5, byte[] bArr, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, i5, bArr, (i7 & 64) != 0 ? -1 : i6);
    }

    @Override // defpackage.z3
    @NotNull
    public byte[] i() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(d());
        if (b() >= 0) {
            byteArrayOutputStream.write(b());
        }
        byteArrayOutputStream.write(f());
        byteArrayOutputStream.write(e());
        byteArrayOutputStream.write(tet.p(this.h));
        byteArrayOutputStream.write(tet.s((short) this.i));
        byteArrayOutputStream.write(c());
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getI() {
        return this.i;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getH() {
        return this.h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(int i, int i2, int i3, int i4, int i5, @NotNull byte[] data, int i6) {
        super(i, i2, i3, data, i6);
        Intrinsics.checkNotNullParameter(data, "data");
        this.h = i4;
        this.i = i5;
    }
}
