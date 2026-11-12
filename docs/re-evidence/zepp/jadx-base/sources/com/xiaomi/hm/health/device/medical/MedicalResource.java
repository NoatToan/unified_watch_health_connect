package com.xiaomi.hm.health.device.medical;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0016\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/medical/MedicalResource;", "", "", "a", LogUtil.I, "getAtrial_fib_text", "()I", "atrial_fib_text", "b", "getAtrial_fib_summary", "atrial_fib_summary", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class MedicalResource {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<MedicalResource> c = LazyKt__LazyJVMKt.lazy(a.a);

    @NotNull
    private static final Lazy<NormalMedicalResource> d = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int atrial_fib_text = R.string.abnormal_heart_beat_medical;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int atrial_fib_summary = R.string.health_detect_atrial_fib_summary_medical;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/medical/MedicalResource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/medical/NormalMedicalResource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
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
    public static final MedicalResource get(int i) {
        return INSTANCE.get(i);
    }

    @JvmStatic
    @NotNull
    public static final MedicalResource get(@Nullable HMDeviceSource hMDeviceSource) {
        return INSTANCE.get(hMDeviceSource);
    }

    @JvmStatic
    @NotNull
    public static final MedicalResource get(boolean z) {
        return INSTANCE.get(z);
    }

    public int getAtrial_fib_summary() {
        return this.atrial_fib_summary;
    }

    public int getAtrial_fib_text() {
        return this.atrial_fib_text;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0014\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007R\u001d\u0010\r\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0010\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/medical/MedicalResource$Companion;", "", "", "isMedical", "Lcom/xiaomi/hm/health/device/medical/MedicalResource;", "get", "", "source", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "medicalInstance$delegate", "Lkotlin/Lazy;", "a", "()Lcom/xiaomi/hm/health/device/medical/MedicalResource;", "medicalInstance", "normalInstance$delegate", "b", "normalInstance", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "medicalInstance", "getMedicalInstance()Lcom/xiaomi/hm/health/device/medical/MedicalResource;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "normalInstance", "getNormalInstance()Lcom/xiaomi/hm/health/device/medical/MedicalResource;"))};

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final MedicalResource a() {
            return (MedicalResource) MedicalResource.c.getValue();
        }

        private final MedicalResource b() {
            return (MedicalResource) MedicalResource.d.getValue();
        }

        public static /* synthetic */ MedicalResource get$default(Companion companion, HMDeviceSource hMDeviceSource, int i, Object obj) {
            if ((i & 1) != 0) {
                hMDeviceSource = null;
            }
            return companion.get(hMDeviceSource);
        }

        @JvmStatic
        @NotNull
        public final MedicalResource get(boolean isMedical) {
            return isMedical ? a() : b();
        }

        @JvmStatic
        @NotNull
        public final MedicalResource get(int source) {
            return get(MedicalUtilKt.isMedicalDevice(source) || MedicalUtilKt.isMedicalCollectDevice(source));
        }

        @JvmStatic
        @NotNull
        public final MedicalResource get(@Nullable HMDeviceSource source) {
            return get(MedicalUtilKt.isMedicalDevice(source) || MedicalUtilKt.isMedicalCollectDevice(source));
        }
    }
}
