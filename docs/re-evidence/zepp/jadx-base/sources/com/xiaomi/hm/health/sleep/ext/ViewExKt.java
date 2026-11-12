package com.xiaomi.hm.health.sleep.ext;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewStub;
import android.view.WindowManager;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.sleep.ext.ViewExKt;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0012\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0000\u001a\u0012\u0010\n\u001a\u00020\b*\u00020\u00002\u0006\u0010\t\u001a\u00020\b\u001a\u0012\u0010\f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\b\u001a\f\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0007\u001a\n\u0010\u0010\u001a\u00020\u0001*\u00020\u000f\u001a\n\u0010\u0011\u001a\u00020\u0001*\u00020\u000f\u001a(\u0010\u0016\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0014¨\u0006\u0017"}, d2 = {"Landroid/view/View;", "", "visible", "", "setVisible", "inVisible", "setInVisible", "isVisible", "", Constant.PAI_KEY_DAILY_PAI, "dpToPx", "sp", "spToPx", "Landroid/graphics/Point;", "findScreenWH", "Landroid/view/ViewStub;", "isInflated", "isNotInflated", "", "delay", "Lkotlin/Function1;", "action", "smartClick", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class ViewExKt {
    public static final float dpToPx(@NotNull View view, float f) {
        return TypedValue.applyDimension(1, f, view.getResources().getDisplayMetrics());
    }

    @TargetApi(13)
    @NotNull
    public static final Point findScreenWH(@NotNull View view) {
        Object systemService = view.getContext().getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    public static final boolean isInflated(@NotNull ViewStub viewStub) {
        return viewStub.getParent() == null;
    }

    public static final boolean isNotInflated(@NotNull ViewStub viewStub) {
        return viewStub.getParent() != null;
    }

    public static final boolean isVisible(@NotNull View view) {
        return view.getVisibility() == 0;
    }

    public static final void setInVisible(@NotNull View view, boolean z) {
        view.setVisibility(!z ? 0 : 4);
    }

    @TargetApi(13)
    public static final void setVisible(@NotNull View view, boolean z) {
        view.setVisibility(z ? 0 : 8);
    }

    public static final void smartClick(@NotNull final View view, final long j, @NotNull final Function1<? super View, Unit> function1) {
        view.setOnClickListener(new View.OnClickListener() { // from class: jb8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ViewExKt.m3450smartClick$lambda0(function1, j, view, view2);
            }
        });
    }

    public static /* synthetic */ void smartClick$default(View view, long j, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        smartClick(view, j, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: smartClick$lambda-0, reason: not valid java name */
    public static final void m3450smartClick$lambda0(Function1 function1, long j, View view, View view2) {
        view2.setClickable(false);
        e.f(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new ViewExKt$smartClick$1$1(function1, view2, j, view, null), 2, null);
    }

    public static final float spToPx(@NotNull View view, float f) {
        return TypedValue.applyDimension(2, f, view.getResources().getDisplayMetrics());
    }
}
