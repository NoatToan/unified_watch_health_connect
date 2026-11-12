package com.huami.fhservice;

import androidx.p008lifecycle.LifecycleOwner;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001b\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nH§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nH§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\nH§@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\fJ\u001f\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\nH§@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\fJ\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\nH§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\fJ\u0013\u0010\u0015\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/huami/fhservice/FemaleHealthService;", "", "", "trigger", "", "setTriggerLifecycle", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "addObserver", "removeObserver", "Lkotlinx/coroutines/flow/Flow;", "getCurrentStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getCurrentStatusContent", "getCurrentStatusDetailContent", "", "Lcom/huami/fhservice/ZeppCalendarStatus;", "getCalendarStatus", "", "hasData", "clearCache", "servicelib_release"}, k = 1, mv = {1, 5, 1})
public interface FemaleHealthService {
    void addObserver(@NotNull LifecycleOwner lifecycleOwner);

    @Nullable
    Object clearCache(@NotNull Continuation<? super Unit> continuation);

    @ExperimentalCoroutinesApi
    @Nullable
    Object getCalendarStatus(@NotNull Continuation<? super Flow<? extends List<ZeppCalendarStatus>>> continuation);

    @ExperimentalCoroutinesApi
    @Nullable
    Object getCurrentStatus(@NotNull Continuation<? super Flow<Integer>> continuation);

    @ExperimentalCoroutinesApi
    @Nullable
    Object getCurrentStatusContent(@NotNull Continuation<? super Flow<String>> continuation);

    @ExperimentalCoroutinesApi
    @Nullable
    Object getCurrentStatusDetailContent(@NotNull Continuation<? super Flow<String>> continuation);

    @ExperimentalCoroutinesApi
    @Nullable
    Object hasData(@NotNull Continuation<? super Flow<Boolean>> continuation);

    void removeObserver(@NotNull LifecycleOwner lifecycleOwner);

    void setTriggerLifecycle(int trigger);
}
