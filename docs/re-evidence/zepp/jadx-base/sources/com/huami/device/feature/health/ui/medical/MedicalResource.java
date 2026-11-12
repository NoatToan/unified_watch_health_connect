package com.huami.device.feature.health.ui.medical;

import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.res.AppResKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\nB\t\b\u0000¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/huami/device/feature/health/ui/medical/MedicalResource;", "", "", "getAtrial_fib_text", "()Ljava/lang/String;", "atrial_fib_text", "getAtrial_fib_summary", "atrial_fib_summary", "<init>", "()V", "Companion", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public class MedicalResource {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<MedicalResource> a = LazyKt__LazyJVMKt.lazy(a.a);

    @NotNull
    private static final Lazy<NormalMedicalResource> b = LazyKt__LazyJVMKt.lazy(b.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u001d\u0010\n\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/huami/device/feature/health/ui/medical/MedicalResource$Companion;", "", "", "c", "Lcom/huami/device/feature/health/ui/medical/MedicalResource;", "get", "medicalInstance$delegate", "Lkotlin/Lazy;", "a", "()Lcom/huami/device/feature/health/ui/medical/MedicalResource;", "medicalInstance", "normalInstance$delegate", "b", "normalInstance", "<init>", "()V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final MedicalResource a() {
            return (MedicalResource) MedicalResource.a.getValue();
        }

        private final MedicalResource b() {
            return (MedicalResource) MedicalResource.b.getValue();
        }

        private final boolean c() {
            HealthDevice healthDevice = (HealthDevice) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(HealthDevice.class), null, null);
            return healthDevice != null && healthDevice.isMedicalDevice();
        }

        @JvmStatic
        @NotNull
        public final MedicalResource get() {
            return c() ? a() : b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/device/feature/health/ui/medical/MedicalResource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MedicalResource> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MedicalResource invoke() {
            return new MedicalResource();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/device/feature/health/ui/medical/NormalMedicalResource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<NormalMedicalResource> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NormalMedicalResource invoke() {
            return new NormalMedicalResource();
        }
    }

    @JvmStatic
    @NotNull
    public static final MedicalResource get() {
        return INSTANCE.get();
    }

    @NotNull
    public String getAtrial_fib_summary() {
        return AppResKt.getHealthStr().getAtrialFibSummaryMedical();
    }

    @NotNull
    public String getAtrial_fib_text() {
        return AppResKt.getHealthStr().getAtrialFibMedical();
    }
}
