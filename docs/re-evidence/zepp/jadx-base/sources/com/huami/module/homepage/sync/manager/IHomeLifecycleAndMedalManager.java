package com.huami.module.homepage.sync.manager;

import androidx.p008lifecycle.LifecycleObserver;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/huami/module/homepage/sync/manager/IHomeLifecycleAndMedalManager;", "Landroidx/lifecycle/LifecycleObserver;", "", "requestStatusPopupAd", "popMedalUi", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setInForegroundListener", "homePage_release"}, k = 1, mv = {1, 5, 1})
public interface IHomeLifecycleAndMedalManager extends LifecycleObserver {
    void popMedalUi();

    void requestStatusPopupAd();

    void setInForegroundListener(@NotNull Function0<Unit> listener);
}
