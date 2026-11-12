package com.xiaomi.fitness.route.track.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.route.export.track.Route;
import com.xiaomi.fitness.route.track.view.RouteResultData;
import com.xiaomi.fitness.route.track.view.UiResultData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH&J \u0010\u000f\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0011\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\u0012J \u0010\u0013\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0011\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\u0012J(\u0010\u0014\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00150\u00102\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H¦@¢\u0006\u0002\u0010\u0018J\u001e\u0010\u0019\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u001a\u001a\u00020\u001bH&J\u001c\u0010\u001c\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH¦@¢\u0006\u0002\u0010\u001dJ4\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u00152\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\"2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/route/track/viewmodel/DistributeTrack;", "", "downTrackFile", "Lkotlinx/coroutines/flow/Flow;", "Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$OriginalRoute;", "route", "Lcom/xiaomi/fitness/route/export/track/Route;", "(Lcom/xiaomi/fitness/route/export/track/Route;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "catchIOThrowable", "", "installPercentage", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/route/track/view/UiResultData;", "noInstallCount", "", "parserFile", "Lkotlinx/coroutines/flow/FlowCollector;", "originalRoute", "(Lkotlinx/coroutines/flow/FlowCollector;Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$OriginalRoute;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recorderFile", "distributeToDevice", "Lcom/xiaomi/fitness/route/track/view/RouteResultData;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/flow/FlowCollector;Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM$OriginalRoute;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "catchDistributeToDevice", Constants.EXTRA_ERROR_MESSAGE, "", "distributeComplete", "(Landroidx/lifecycle/MutableLiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUI", "installCount", "it", "list", "", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DistributeTrack {
    void catchDistributeToDevice(@NotNull MutableLiveData<UiResultData> installPercentage, @NotNull String errorMsg);

    void catchIOThrowable(@NotNull MutableLiveData<UiResultData> installPercentage, int noInstallCount);

    @Nullable
    Object distributeComplete(@NotNull MutableLiveData<UiResultData> mutableLiveData, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object distributeToDevice(@NotNull FlowCollector<? super RouteResultData> flowCollector, @NotNull MyTrackLibraryVM.OriginalRoute originalRoute, @NotNull CoroutineScope coroutineScope, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object downTrackFile(@NotNull Route route, @NotNull Continuation<? super Flow<MyTrackLibraryVM.OriginalRoute>> continuation);

    @Nullable
    Object parserFile(@NotNull FlowCollector<? super MyTrackLibraryVM.OriginalRoute> flowCollector, @NotNull MyTrackLibraryVM.OriginalRoute originalRoute, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object recorderFile(@NotNull FlowCollector<? super MyTrackLibraryVM.OriginalRoute> flowCollector, @NotNull MyTrackLibraryVM.OriginalRoute originalRoute, @NotNull Continuation<? super Unit> continuation);

    void updateUI(int installCount, @NotNull RouteResultData it, @NotNull List<Route> list, @NotNull MutableLiveData<UiResultData> installPercentage);
}
