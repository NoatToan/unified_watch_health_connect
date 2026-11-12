package com.huami.watchfacesstore.ext;

import android.view.View;
import androidx.constraintlayout.widget.Group;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.watch.notification.TransportUri;
import com.huami.watchfacesstore.ext.ViewExtKt;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\u001a9\u0010\u0007\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0016\u0010\u000f\u001a\u00020\u0005*\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000\"2\u0010\u0015\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u00028B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\"2\u0010\u0018\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u00028B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014\"\u001a\u0010\u001c\u001a\u00020\u0019*\u00020\u00008@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Landroid/view/View;", ExifInterface.GPS_DIRECTION_TRUE, "", "delay", "Lkotlin/Function1;", "", TransportUri.ACTION_BLOCK, "clickWithTrigger", "(Landroid/view/View;JLkotlin/jvm/functions/Function1;)V", "", "b", "(Landroid/view/View;)Z", "Landroidx/constraintlayout/widget/Group;", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setAllOnClickListener", "value", "e", "(Landroid/view/View;)J", "g", "(Landroid/view/View;J)V", "triggerLastTime", GoogleApiAvailabilityLight.a, "f", "triggerDelay", "", "getStartDistanceOnScreen", "(Landroid/view/View;)I", "startDistanceOnScreen", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class ViewExtKt {
    private static final <T extends View> boolean b(T t) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = jCurrentTimeMillis - e(t) >= d(t);
        g(t, jCurrentTimeMillis);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(View view, Function1 function1, View view2) {
        if (b(view)) {
            Objects.requireNonNull(view2, "null cannot be cast to non-null type T of com.huami.watchfacesstore.ext.ViewExtKt.clickWithTrigger$lambda-0");
            function1.invoke(view2);
        }
    }

    public static final <T extends View> void clickWithTrigger(@NotNull final T t, long j, @NotNull final Function1<? super T, Unit> function1) {
        f(t, j);
        t.setOnClickListener(new View.OnClickListener() { // from class: lb8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewExtKt.c(t, function1, view);
            }
        });
    }

    public static /* synthetic */ void clickWithTrigger$default(View view, long j, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 800;
        }
        clickWithTrigger(view, j, function1);
    }

    private static final <T extends View> long d(T t) {
        if (t.getTag(1123461123) == null) {
            return -1L;
        }
        Object tag = t.getTag(1123461123);
        Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) tag).longValue();
    }

    private static final <T extends View> long e(T t) {
        if (t.getTag(1123460103) == null) {
            return 0L;
        }
        Object tag = t.getTag(1123460103);
        Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) tag).longValue();
    }

    private static final <T extends View> void f(T t, long j) {
        t.setTag(1123461123, Long.valueOf(j));
    }

    private static final <T extends View> void g(T t, long j) {
        t.setTag(1123460103, Long.valueOf(j));
    }

    public static final int getStartDistanceOnScreen(@NotNull View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[0];
    }

    public static final void setAllOnClickListener(@NotNull Group group, @Nullable View.OnClickListener onClickListener) {
        for (int i : group.getReferencedIds()) {
            group.getRootView().findViewById(i).setOnClickListener(onClickListener);
        }
    }
}
