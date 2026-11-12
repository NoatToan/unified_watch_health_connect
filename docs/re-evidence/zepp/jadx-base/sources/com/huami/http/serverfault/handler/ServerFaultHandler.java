package com.huami.http.serverfault.handler;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.http.serverfault.MonitoringRules;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00168F@\u0006¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/huami/http/serverfault/handler/ServerFaultHandler;", "", "", "resetStatus", "", "url", "", "statusCode", "updateApiStatus", "Landroidx/lifecycle/MutableLiveData;", "", "a", "Landroidx/lifecycle/MutableLiveData;", "shouldShowTipValue", "Ljava/util/concurrent/ConcurrentSkipListSet;", "b", "Ljava/util/concurrent/ConcurrentSkipListSet;", "failedApis", "Lkotlin/ranges/IntRange;", "c", "Lkotlin/ranges/IntRange;", "failedStatusCode", "Landroidx/lifecycle/LiveData;", "getShouldShowTip", "()Landroidx/lifecycle/LiveData;", "shouldShowTip", "", "Lcom/huami/http/serverfault/MonitoringRules;", "getMonitorRules", "()Ljava/util/List;", "monitorRules", "<init>", "()V", "serverfault_release"}, k = 1, mv = {1, 4, 0})
public abstract class ServerFaultHandler {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final MutableLiveData<Boolean> shouldShowTipValue = new MutableLiveData<>(Boolean.FALSE);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ConcurrentSkipListSet<String> failedApis = new ConcurrentSkipListSet<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final IntRange failedStatusCode = new IntRange(500, 599);

    @NotNull
    public abstract List<MonitoringRules> getMonitorRules();

    @NotNull
    public final LiveData<Boolean> getShouldShowTip() {
        return this.shouldShowTipValue;
    }

    public final void resetStatus() {
        this.failedApis.clear();
        this.shouldShowTipValue.postValue(Boolean.FALSE);
    }

    public final void updateApiStatus(@NotNull String url, int statusCode) {
        synchronized (this.failedApis) {
            for (MonitoringRules monitoringRules : getMonitorRules()) {
                if (monitoringRules.getRule().matches(url)) {
                    if (this.failedStatusCode.contains(statusCode)) {
                        this.failedApis.add(monitoringRules.getTag());
                    } else {
                        this.failedApis.remove(monitoringRules.getTag());
                    }
                    boolean z = !this.failedApis.isEmpty();
                    if (!(true ^ Intrinsics.areEqual(this.shouldShowTipValue.getValue(), Boolean.valueOf(z)))) {
                        break;
                    }
                    this.shouldShowTipValue.postValue(Boolean.valueOf(z));
                    break;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
