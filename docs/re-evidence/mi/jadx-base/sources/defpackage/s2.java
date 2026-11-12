package defpackage;

import com.huami.bluetooth.profile.channel.module.binary.Layout;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rB!\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0012B%\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\f\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Ls2;", "", "", "byteArray", "[B", PluginDeviceInfo.FDESC, "()[B", "", "acceptedResponseTag", "I", PluginDeviceInfo.FMODEL, "()I", "<init>", "([BI)V", "Lr2;", "cmd", "filterTag", "contentArray", "(Lr2;I[B)V", "Lcom/huami/bluetooth/profile/channel/module/binary/Layout;", MiuiCursorConstants.CONTENT, "(Lr2;ILcom/huami/bluetooth/profile/channel/module/binary/Layout;)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final byte[] f33188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f33189b;

    public s2(@NotNull byte[] byteArray, int i) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        this.f33188a = byteArray;
        this.f33189b = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF33189b() {
        return this.f33189b;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte[] getF33188a() {
        return this.f33188a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s2(@NotNull r2 cmd, int i, @NotNull byte[] contentArray) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        Intrinsics.checkNotNullParameter(contentArray, "contentArray");
        byte[] bArrR = tet.r(cmd.getF32095a(), cmd.getF32096b());
        Intrinsics.checkNotNullExpressionValue(bArrR, "numberToBytes(cmd.cmd.toLong(), cmd.length)");
        this(ArraysKt___ArraysJvmKt.plus(bArrR, contentArray), i);
    }

    public /* synthetic */ s2(r2 r2Var, int i, Layout layout, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r2Var, i, (i2 & 4) != 0 ? null : layout);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s2(@NotNull r2 cmd, int i, @Nullable Layout layout) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        byte[] bArrB = new qdt().b(layout);
        Intrinsics.checkNotNullExpressionValue(bArrB, "encode(content)");
        this(cmd, i, bArrB);
    }
}
