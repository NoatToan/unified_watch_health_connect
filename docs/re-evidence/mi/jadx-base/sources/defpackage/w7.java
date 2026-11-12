package defpackage;

import android.content.Context;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lw7;", "", PluginDeviceInfo.FMODEL, "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class w7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f37676a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J*\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ$\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0010"}, d2 = {"Lw7$a;", "", "Lqd;", "deviceSource", "Lph;", PluginDeviceInfo.FMODEL, "Landroid/content/Context;", "context", "", "bgPath", "", "argb", "processor", PluginDeviceInfo.FDESC, "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final ph a(@NotNull qd deviceSource) {
            Intrinsics.checkNotNullParameter(deviceSource, "deviceSource");
            ImageSize imageSizeA = z7.f40965a.a(deviceSource);
            if (imageSizeA == null) {
                return null;
            }
            return td.f34581a.b(deviceSource) ? new e8(new x7(imageSizeA.getWidth(), imageSizeA.getHeight())) : new u7(new v7(new x7(imageSizeA.getWidth(), imageSizeA.getHeight()), false, false, 2, null));
        }

        public final ph b(qd deviceSource) {
            ImageSize imageSizeB = z7.f40965a.b(deviceSource);
            if (imageSizeB != null) {
                return new u7(new v7(new x7(imageSizeB.getWidth(), imageSizeB.getHeight()), false, false, 2, null));
            }
            throw new IllegalStateException("no such preview image size".toString());
        }

        @Nullable
        public final ph a(@NotNull Context context, @NotNull qd deviceSource, @NotNull String bgPath, @Nullable byte[] argb) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(deviceSource, "deviceSource");
            Intrinsics.checkNotNullParameter(bgPath, "bgPath");
            if (td.f34581a.b(deviceSource)) {
                return new h8(bgPath, argb);
            }
            ph phVarA = a(deviceSource, new d8(), argb);
            ph phVarB = b(deviceSource);
            Intrinsics.checkNotNull(phVarB);
            return new iv(new b8(phVarA, bgPath, phVarB.a(context, bgPath)));
        }

        @Nullable
        public final ph a(@NotNull qd deviceSource, @Nullable ph processor, @Nullable byte[] argb) {
            Intrinsics.checkNotNullParameter(deviceSource, "deviceSource");
            if (td.f34581a.b(deviceSource)) {
                t5t.d("MenstruationDataParser", "zeppos  custom color");
                return new h8(null, argb, 1, null);
            }
            return new y7(processor, argb);
        }
    }
}
