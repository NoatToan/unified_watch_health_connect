package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lz7;", "", PluginDeviceInfo.FMODEL, "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f40965a = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t"}, d2 = {"Lz7$a;", "", "Lqd;", "deviceSource", "Llj;", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {

        /* JADX INFO: renamed from: z7$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class C1164a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f40966a;

            static {
                int[] iArr = new int[qd.values().length];
                try {
                    iArr[qd.O0.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[qd.p0.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[qd.q0.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[qd.l2.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[qd.o1.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[qd.p1.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[qd.q1.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[qd.k2.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[qd.B2.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[qd.C2.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[qd.I2.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[qd.K2.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[qd.J2.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[qd.M2.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[qd.G2.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[qd.H2.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[qd.L2.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                f40966a = iArr;
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final ImageSize a(@NotNull qd deviceSource) {
            Intrinsics.checkNotNullParameter(deviceSource, "deviceSource");
            switch (C1164a.f40966a[deviceSource.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return new ImageSize(120, 240);
                case 5:
                case 6:
                case 7:
                case 8:
                    return new ImageSize(126, 294);
                case 9:
                case 10:
                    return new ImageSize(152, 486);
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    return new ImageSize(192, 486);
                default:
                    return null;
            }
        }

        @Nullable
        public final ImageSize b(@NotNull qd deviceSource) {
            Intrinsics.checkNotNullParameter(deviceSource, "deviceSource");
            switch (C1164a.f40966a[deviceSource.ordinal()]) {
                case 4:
                    return new ImageSize(84, 168);
                case 5:
                case 6:
                case 7:
                case 8:
                    return new ImageSize(90, 210);
                case 9:
                case 10:
                    return new ImageSize(110, 352);
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    return new ImageSize(128, 326);
                default:
                    return null;
            }
        }
    }
}
