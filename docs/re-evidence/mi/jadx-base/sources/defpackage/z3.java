package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.c.q;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0018B1\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0019"}, d2 = {"Lz3;", "", "", PluginDeviceInfo.FLOCALIZATIONS, "h", "", "i", "", "flag", "I", PluginDeviceInfo.FICONOFF, "()I", "sessionId", PluginDeviceInfo.FBLUETOOTHPAIR, "index", PluginDeviceInfo.FICONOFFLINE, "data", "[B", PluginDeviceInfo.FICONON, "()[B", q.f13858b, PluginDeviceInfo.FDESC, "<init>", "(III[BI)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public class z3 {

    @NotNull
    public static final a f = new a(null);

    @NotNull
    public static final z3 g = new z3(-1, -1, -1, new byte[0], 0, 16, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40827b;
    public final int c;

    @NotNull
    public final byte[] d;
    public final int e;

    public z3(int i, int i2, int i3, @NotNull byte[] data, int i4) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f40826a = i;
        this.f40827b = i2;
        this.c = i3;
        this.d = data;
        this.e = i4;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getE() {
        return this.e;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final byte[] getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF40826a() {
        return this.f40826a;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getF40827b() {
        return this.f40827b;
    }

    public final boolean g() {
        return (this.f40826a & 2) > 0;
    }

    public final boolean h() {
        return (this.f40826a & 4) > 0;
    }

    @NotNull
    public byte[] i() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(this.f40826a);
        int i = this.e;
        if (i >= 0) {
            byteArrayOutputStream.write(i);
        }
        byteArrayOutputStream.write(this.f40827b);
        byteArrayOutputStream.write(this.c);
        byteArrayOutputStream.write(this.d);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    public /* synthetic */ z3(int i, int i2, int i3, byte[] bArr, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, bArr, (i5 & 16) != 0 ? -1 : i4);
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\rR\u0014\u0010\u0019\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\r¨\u0006\u001c"}, d2 = {"Lz3$a;", "", "", "byteArray", "Lz3;", PluginDeviceInfo.FICONON, PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, "ERROR_INSTANCE", "Lz3;", "()Lz3;", "", "DATA_PACKET_TYPE", "I", "FLAG_BEGIN", "FLAG_ENCRYPTION", "FLAG_END", "FLAG_LEN", "FLAG_MIDDLE", "FLAG_REQUIRE_REPLY", "INDEX_LEN", "MIN_PACKET_HEADER_SIZE", "MIN_PACKET_SIZE", "MODULE_LEN", "SESSION_ID_LEN", "TOTAL_SIZE_LEN", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z3 a(byte[] byteArray) {
            return new cb(tet.d(byteArray, 1, 1), tet.d(byteArray, 2, 1), tet.d(byteArray, 3, 1), tet.c(byteArray, 4), tet.d(byteArray, 8, 2), CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.slice(byteArray, new IntRange(10, byteArray.length - 1))), 0, 64, null);
        }

        public final z3 b(byte[] byteArray) {
            return new z3(tet.d(byteArray, 1, 1), tet.d(byteArray, 2, 1), tet.d(byteArray, 3, 1), CollectionsKt___CollectionsKt.toByteArray(ArraysKt___ArraysKt.slice(byteArray, new IntRange(4, byteArray.length - 1))), 0, 16, null);
        }

        @NotNull
        public final z3 c(@NotNull byte[] byteArray) {
            Object objM886constructorimpl;
            Intrinsics.checkNotNullParameter(byteArray, "byteArray");
            if (byteArray.length < 4) {
                return a();
            }
            byte b2 = byteArray[1];
            try {
                Result.Companion companion = Result.Companion;
                objM886constructorimpl = Result.m886constructorimpl((1 & b2) > 0 ? a(byteArray) : b(byteArray));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
            }
            z3 z3VarA = a();
            if (Result.m892isFailureimpl(objM886constructorimpl)) {
                objM886constructorimpl = z3VarA;
            }
            return (z3) objM886constructorimpl;
        }

        @NotNull
        public final z3 a() {
            return z3.g;
        }
    }
}
