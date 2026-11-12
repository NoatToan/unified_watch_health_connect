package com.xiaomi.hm.health.adapter;

import com.huami.femalehealth.uilib.helper.FemaleAppNoticeHelper;
import kotlin.Lazy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/adapter/FemaleAppNoticeHelperAdapter;", "", "Lcom/huami/femalehealth/uilib/helper/FemaleAppNoticeHelper;", "a", "Lkotlin/Lazy;", "getFemaleAppNoticeHelper", "()Lcom/huami/femalehealth/uilib/helper/FemaleAppNoticeHelper;", "femaleAppNoticeHelper", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class FemaleAppNoticeHelperAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy femaleAppNoticeHelper = KoinJavaComponent.inject$default(FemaleAppNoticeHelper.class, null, null, 6, null);

    @NotNull
    public final FemaleAppNoticeHelper getFemaleAppNoticeHelper() {
        return (FemaleAppNoticeHelper) this.femaleAppNoticeHelper.getValue();
    }
}
