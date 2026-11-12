package androidx.p004activity;

import android.view.View;
import com.mi.health.course.export.data.CourseConfigModel;
import defpackage.hti;
import defpackage.q7h;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.activity.ViewTreeOnBackPressedDispatcherOwner, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroid/view/View;", "Lq7h;", "onBackPressedDispatcherOwner", "", CourseConfigModel.DevCmd.CMD_ACTION_SET, "(Landroid/view/View;Lq7h;)V", "setViewTreeOnBackPressedDispatcherOwner", "get", "(Landroid/view/View;)Lq7h;", "findViewTreeOnBackPressedDispatcherOwner", "activity_release"}, k = 2, mv = {1, 6, 0})
@JvmName(name = "ViewTreeOnBackPressedDispatcherOwner")
public final class View {
    @JvmName(name = "get")
    @Nullable
    public static final q7h get(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (q7h) SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(SequencesKt__SequencesKt.generateSequence(view, (Function1<? super android.view.View, ? extends android.view.View>) ((Function1<? super Object, ? extends Object>) new Function1<android.view.View, android.view.View>() { // from class: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final View invoke2(@NotNull View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Object parent = it.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        })), new Function1<android.view.View, q7h>() { // from class: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final q7h invoke2(@NotNull View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Object tag = it.getTag(hti.f20439a);
                if (tag instanceof q7h) {
                    return (q7h) tag;
                }
                return null;
            }
        }));
    }

    @JvmName(name = CourseConfigModel.DevCmd.CMD_ACTION_SET)
    public static final void set(@NotNull android.view.View view, @NotNull q7h onBackPressedDispatcherOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(hti.f20439a, onBackPressedDispatcherOwner);
    }
}
