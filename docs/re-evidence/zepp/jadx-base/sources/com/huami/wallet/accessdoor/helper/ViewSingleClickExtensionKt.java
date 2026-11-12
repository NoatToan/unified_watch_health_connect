package com.huami.wallet.accessdoor.helper;

import android.view.View;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.wallet.accessdoor.helper.ViewSingleClickExtensionKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a+\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005\"\"\u0010\u000e\u001a\u00020\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\"\u0016\u0010\u000f\u001a\u00020\u00018\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Landroid/view/View;", "", "interval", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "singleClickListener", "a", "J", "getLastTime", "()J", "setLastTime", "(J)V", "lastTime", "DEFAULT_INTERVAL_TIME", "access-door_release"}, k = 2, mv = {1, 5, 1})
public final class ViewSingleClickExtensionKt {
    public static final long DEFAULT_INTERVAL_TIME = 1000;
    private static long a;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(long j, Function1 function1, View view, View view2) {
        if (Math.abs(System.currentTimeMillis() - getLastTime()) > j) {
            function1.invoke(view);
            setLastTime(System.currentTimeMillis());
        }
    }

    public static final long getLastTime() {
        return a;
    }

    public static final void setLastTime(long j) {
        a = j;
    }

    public static final void singleClickListener(@NotNull final View view, final long j, @NotNull final Function1<? super View, Unit> function1) {
        view.setOnClickListener(new View.OnClickListener() { // from class: pb8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewSingleClickExtensionKt.b(j, function1, view, view2);
            }
        });
    }
}
