package com.huami.midong.ppg.ui.midong.ui.res;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.afppg_ui_base.inject.PpgUiModuleKt;
import com.huami.midong.ppg.ui.midong.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\t\b\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/huami/midong/ppg/ui/midong/ui/res/MedicalResource;", "", "", "a", LogUtil.I, "getAtrial_fib_text", "()I", "atrial_fib_text", "b", "getAtrial_fib_summary", "atrial_fib_summary", "c", "getAtrial_fib_description_midong", "atrial_fib_description_midong", "<init>", "()V", "Companion", "afppg-ui-midong_release"}, k = 1, mv = {1, 5, 1})
public class MedicalResource {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<MedicalResource> d = LazyKt__LazyJVMKt.lazy(a.a);

    @NotNull
    private static final Lazy<NormalMedicalResource> e = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int atrial_fib_text = R.string.abnormal_heart_beat_medical;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int atrial_fib_summary = R.string.health_detect_atrial_fib_summary_medical;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int atrial_fib_description_midong = R.string.abnormal_heart_rate_description;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/midong/ppg/ui/midong/ui/res/MedicalResource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/midong/ppg/ui/midong/ui/res/NormalMedicalResource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
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
    public static final MedicalResource get(boolean z) {
        return INSTANCE.get(z);
    }

    public int getAtrial_fib_description_midong() {
        return this.atrial_fib_description_midong;
    }

    public int getAtrial_fib_summary() {
        return this.atrial_fib_summary;
    }

    public int getAtrial_fib_text() {
        return this.atrial_fib_text;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u001d\u0010\f\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u000f\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/huami/midong/ppg/ui/midong/ui/res/MedicalResource$Companion;", "", "", "isMedical", "Lcom/huami/midong/ppg/ui/midong/ui/res/MedicalResource;", "get", "", "source", "medicalInstance$delegate", "Lkotlin/Lazy;", "a", "()Lcom/huami/midong/ppg/ui/midong/ui/res/MedicalResource;", "medicalInstance", "normalInstance$delegate", "b", "normalInstance", "<init>", "()V", "afppg-ui-midong_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final MedicalResource a() {
            return (MedicalResource) MedicalResource.d.getValue();
        }

        private final MedicalResource b() {
            return (MedicalResource) MedicalResource.e.getValue();
        }

        @JvmStatic
        @NotNull
        public final MedicalResource get(boolean isMedical) {
            return isMedical ? a() : b();
        }

        @JvmStatic
        @NotNull
        public final MedicalResource get(int source) {
            return get(PpgUiModuleKt.getUiConfig().isMedicalSource(source));
        }
    }
}
