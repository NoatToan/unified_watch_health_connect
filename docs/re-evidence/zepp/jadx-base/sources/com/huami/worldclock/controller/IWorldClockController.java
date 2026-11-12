package com.huami.worldclock.controller;

import android.content.Context;
import com.huami.tools.analytics.DbUtils;
import com.huami.worldclock.bean.WorldClockBean;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006JF\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022)\u0010\u000e\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\n0\t¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/huami/worldclock/controller/IWorldClockController;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "setLocaleWorldClock", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setDefaultWorldClock", "Lkotlin/Function1;", "", "Lcom/huami/worldclock/bean/WorldClockBean;", "Lkotlin/ParameterName;", "name", "result", "callback", "queryWorldTime", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public interface IWorldClockController {
    @Nullable
    Object queryWorldTime(@NotNull Context context, @Nullable Function1<? super List<WorldClockBean>, Unit> function1, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object setDefaultWorldClock(@NotNull Context context, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object setLocaleWorldClock(@NotNull Context context, @NotNull Continuation<? super Unit> continuation);
}
