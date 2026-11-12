package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"Lpk;", "Lu4;", "Lok;", "", "value", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class pk implements u4<LogStream, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f30477a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lpk$a;", "", "", "CONTENT_MIN_BYTES", "I", "DATA_MIN_BYTES", "INDEX_BYTES", "LEVEL_BYTES", "STREAM_ID_BYTES", "SUB_DOMAIN_ID_MIN_BYTES", "TAG_MIN_BYTES", "TIMESTAMP_BYTES", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] encode(@NotNull LogStream value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public LogStream decode(@NotNull byte[] value) {
        String str;
        int i;
        int i2;
        String str2;
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.length < 14) {
            throw new oo("Invalid data size!");
        }
        int iA = c3.a(value, 1, 0, 2, null);
        int iA2 = c3.a(value, 1, 1);
        int iA3 = ql.a(value, 2);
        if (iA3 > 2) {
            byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(value, 2, iA3);
            i = iA3 + 1;
            str = new String(bArrCopyOfRange, Charsets.UTF_8);
        } else {
            str = new String();
            i = 3;
        }
        int iA4 = ql.a(value, i);
        if (iA4 > i) {
            byte[] bArrCopyOfRange2 = ArraysKt___ArraysJvmKt.copyOfRange(value, i, iA4);
            i2 = iA4 + 1;
            str2 = new String(bArrCopyOfRange2, Charsets.UTF_8);
        } else {
            i2 = i + 1;
            str2 = new String();
        }
        long jB = c3.b(value, 8, i2);
        int iA5 = c3.a(value, 1, i2 + 8);
        int i3 = i2 + 9;
        int iA6 = ql.a(value, i3);
        return new LogStream(iA, iA2, str, str2, jB, iA5, iA6 > i3 ? new String(ArraysKt___ArraysJvmKt.copyOfRange(value, i3, iA6), Charsets.UTF_8) : new String());
    }
}
