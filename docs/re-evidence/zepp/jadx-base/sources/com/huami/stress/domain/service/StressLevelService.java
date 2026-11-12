package com.huami.stress.domain.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.stress.domain.utils.RationUtils;
import com.huami.stress_service.StressConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0019\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005J\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/huami/stress/domain/service/StressLevelService;", "Lorg/koin/core/component/KoinComponent;", "", "value", "calculateStressLevel", "", "getStressRange", "stress", "calculateStressRation", "a", LogUtil.I, "START", "b", "COMFORTABLE", "c", "NORMAL", GoogleApiAvailabilityLight.a, "MEDIUM", "e", "HIGH", "f", "START_NEW", "g", "COMFORTABLE_NEW", "h", "NORMAL_NEW", "i", "MEDIUM_NEW", "<init>", "()V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class StressLevelService implements KoinComponent {

    @NotNull
    public static final StressLevelService INSTANCE = new StressLevelService();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int START = 0;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int COMFORTABLE = 39;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int NORMAL = 59;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final int MEDIUM = 79;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final int HIGH = 100;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final int START_NEW = 1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final int COMFORTABLE_NEW = 25;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final int NORMAL_NEW = 50;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final int MEDIUM_NEW = 80;

    private StressLevelService() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public final int calculateStressLevel(int value) {
        ?? UseL66StressStandard = ((StressConfig) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(StressConfig.class), null, null)).useL66StressStandard();
        int i = UseL66StressStandard != 0 ? 25 : 39;
        int i2 = UseL66StressStandard != 0 ? 50 : 59;
        int i3 = UseL66StressStandard != 0 ? 80 : 79;
        boolean z = false;
        if (UseL66StressStandard <= value && value <= i) {
            z = true;
        }
        if (z) {
            return 1;
        }
        if (value <= i2) {
            return 2;
        }
        if (value <= i3) {
            return 3;
        }
        return value <= 100 ? 4 : -1;
    }

    @NotNull
    public final List<Integer> calculateStressRation(@NotNull List<Integer> stress) {
        Iterator<T> it2 = stress.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (it2.hasNext()) {
            int iCalculateStressLevel = INSTANCE.calculateStressLevel(((Number) it2.next()).intValue());
            if (iCalculateStressLevel == 1) {
                i++;
            } else if (iCalculateStressLevel == 2) {
                i2++;
            } else if (iCalculateStressLevel == 3) {
                i3++;
            } else if (iCalculateStressLevel == 4) {
                i4++;
            }
        }
        return RationUtils.INSTANCE.largestRemainderRound(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}), 100);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final List<Integer> getStressRange() {
        return ((StressConfig) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(StressConfig.class), null, null)).useL66StressStandard() ? CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{1, 25, 50, 80, 100}) : CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{0, 39, 59, 79, 100});
    }
}
