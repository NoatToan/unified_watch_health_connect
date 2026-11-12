package com.huami.algo;

import com.huami.algo.healthcare.HealthCare;
import com.huami.algo.jhmsignal.JhmSignal;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\u000b\u001a\u00020\u00068F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/algo/HealthNative;", "", "", "key", "Lcom/huami/algo/healthcare/HealthCare;", "getHealthCare", "Lcom/huami/algo/jhmsignal/JhmSignal;", "a", "Lkotlin/Lazy;", "getJhmInstance", "()Lcom/huami/algo/jhmsignal/JhmSignal;", "jhmInstance", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class HealthNative {
    public static final HealthNative INSTANCE = new HealthNative();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy jhmInstance = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/algo/jhmsignal/JhmSignal;", "a", "()Lcom/huami/algo/jhmsignal/JhmSignal;"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<JhmSignal> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JhmSignal invoke() {
            return new JhmSignal();
        }
    }

    private HealthNative() {
    }

    @NotNull
    public final HealthCare getHealthCare(int key) {
        return new HealthCare(key);
    }

    @NotNull
    public final JhmSignal getJhmInstance() {
        return (JhmSignal) jhmInstance.getValue();
    }
}
