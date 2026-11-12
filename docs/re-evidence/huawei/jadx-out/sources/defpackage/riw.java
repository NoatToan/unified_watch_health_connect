package defpackage;

import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.backlog.BacklogInterface;
import com.huawei.ui.homehealth.backlog.BacklogType;
import com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes17.dex */
public class riw implements BacklogInterface {
    @Override // com.huawei.ui.homehealth.backlog.BacklogInterface
    public CompletableFuture<List<dse>> requestBacklog(DeviceInfo deviceInfo) {
        final CompletableFuture<List<dse>> completableFuture = new CompletableFuture<>();
        a(deviceInfo, new BackLogCallback<List<dse>>() { // from class: riw.2
            @Override // com.huawei.health.device.callback.BackLogCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<dse> list) {
                completableFuture.complete(list);
            }

            @Override // com.huawei.health.device.callback.BackLogCallback
            public void onFailure(int i, String str) {
                LogUtil.j("LocalBacklogImpl", "requestLocalBacklogEvent onFailure errCode:", Integer.valueOf(i), " errMsg:", str);
                completableFuture.complete(Collections.EMPTY_LIST);
            }
        });
        return completableFuture;
    }

    @Override // com.huawei.ui.homehealth.backlog.BacklogInterface
    public void updateVisitedStatus(DeviceInfo deviceInfo, String str, BackLogCallback<Boolean> backLogCallback) {
        BacklogEvent backlogEventD = rir.d(str);
        if (backlogEventD == null) {
            backLogCallback.onFailure(-1, "backlogType error");
        } else {
            backlogEventD.updateVisited(deviceInfo, true);
        }
    }

    @Override // com.huawei.ui.homehealth.backlog.BacklogInterface
    public void updateDeleteStatus(DeviceInfo deviceInfo, String str, BackLogCallback<Boolean> backLogCallback) {
        BacklogEvent backlogEventD = rir.d(str);
        if (backlogEventD == null) {
            backLogCallback.onFailure(-1, "backlogType error");
        } else {
            backlogEventD.updateRemind(deviceInfo);
            backLogCallback.onSuccess(true);
        }
    }

    private void a(DeviceInfo deviceInfo, final BackLogCallback<List<dse>> backLogCallback) {
        LogUtil.a("LocalBacklogImpl", "queryBacklogList");
        BacklogType[] backlogTypeArrValues = BacklogType.values();
        LogUtil.a("LocalBacklogImpl", "list length ", Integer.valueOf(backlogTypeArrValues.length));
        final List list = (List) Arrays.stream(backlogTypeArrValues).map(new AnonymousClass3(deviceInfo)).collect(Collectors.toList());
        CompletableFuture.allOf((CompletableFuture[]) list.toArray(new CompletableFuture[0])).thenApply(new Function() { // from class: riu
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return riw.b(list, (Void) obj);
            }
        }).whenComplete((BiConsumer<? super U, ? super Throwable>) new BiConsumer() { // from class: riz
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                riw.e(backLogCallback, (List) obj, (Throwable) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: riw$3, reason: invalid class name */
    class AnonymousClass3 implements Function<BacklogType, CompletableFuture<Optional<dse>>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f47370c;

        AnonymousClass3(DeviceInfo deviceInfo) {
            this.f47370c = deviceInfo;
        }

        @Override // java.util.function.Function
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<Optional<dse>> apply(final BacklogType backlogType) {
            CompletableFuture completableFutureCompletedFuture = CompletableFuture.completedFuture(backlogType);
            final DeviceInfo deviceInfo = this.f47370c;
            return lqw.c(Optional.empty(), 5L, TimeUnit.SECONDS, completableFutureCompletedFuture.thenComposeAsync(new Function() { // from class: rjc
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return riw.e(deviceInfo, (BacklogType) obj);
                }
            }, (Executor) ThreadPoolManager.c()).exceptionally(new Function() { // from class: rjd
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return riw.AnonymousClass3.d(backlogType, (Throwable) obj);
                }
            }));
        }

        static /* synthetic */ Optional d(BacklogType backlogType, Throwable th) {
            lqw.e("LocalBacklogImpl", "queryBacklogEvent exceptionally event.getId: " + backlogType.getId(), th);
            return Optional.empty();
        }
    }

    static /* synthetic */ List b(List list, Void r1) {
        return (List) list.stream().map(new Function() { // from class: riv
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Optional) ((CompletableFuture) obj).join();
            }
        }).filter(new riy()).map(new Function() { // from class: rix
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (dse) ((Optional) obj).get();
            }
        }).sorted(Comparator.comparingInt(new ris())).collect(Collectors.toList());
    }

    static /* synthetic */ void e(BackLogCallback backLogCallback, List list, Throwable th) {
        if (th == null) {
            LogUtil.a("LocalBacklogImpl", "queryBacklogEvents request:", Integer.valueOf(list.size()));
            backLogCallback.onSuccess(Collections.unmodifiableList(list));
        } else {
            lqw.e("LocalBacklogImpl", "queryBacklogEvent failed", th);
            backLogCallback.onFailure(-1, "Query backlog failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CompletableFuture<Optional<dse>> e(final DeviceInfo deviceInfo, final BacklogType backlogType) {
        final BacklogEvent backlogEventE = rir.e(backlogType);
        if (backlogEventE == null) {
            LogUtil.j("LocalBacklogImpl", "BacklogEvent is null for type: " + backlogType.getId());
            return CompletableFuture.completedFuture(Optional.empty());
        }
        final CompletableFuture completableFuture = new CompletableFuture();
        backlogEventE.checkEventComplete(deviceInfo, new BacklogEvent.EventCompleteCallback() { // from class: rjb
            @Override // com.huawei.ui.homehealth.backlog.backlogevent.BacklogEvent.EventCompleteCallback
            public final void onResult(boolean z) {
                completableFuture.complete(Boolean.valueOf(z));
            }
        });
        return completableFuture.thenApply(new Function() { // from class: rja
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return riw.c(backlogEventE, deviceInfo, backlogType, (Boolean) obj);
            }
        });
    }

    static /* synthetic */ Optional c(BacklogEvent backlogEvent, DeviceInfo deviceInfo, BacklogType backlogType, Boolean bool) {
        if (!bool.booleanValue()) {
            return Optional.empty();
        }
        dse dseVarCreateBacklogBean = backlogEvent.createBacklogBean(deviceInfo);
        if (dseVarCreateBacklogBean == null) {
            return Optional.empty();
        }
        dseVarCreateBacklogBean.d(backlogType.getOrder());
        return Optional.of(dseVarCreateBacklogBean);
    }
}
