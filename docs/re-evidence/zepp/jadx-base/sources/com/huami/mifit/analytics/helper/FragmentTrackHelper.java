package com.huami.mifit.analytics.helper;

import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001BH\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012%\b\u0002\u0010\u0014\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR3\u0010\u0014\u001a\u001f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/mifit/analytics/helper/FragmentTrackHelper;", "", "", GoogleApiAvailabilityLight.a, "c", "b", "", "a", "trackOnResume", "trackOnPause", "trackOnUserVisibleHint", "trackOnHiddenChanged", "Landroidx/fragment/app/Fragment;", "Landroidx/fragment/app/Fragment;", "fragment", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "duration", "Lkotlin/jvm/functions/Function1;", "durationTracker", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "viewScreenTracker", "Ljava/lang/Long;", "viewStartTime", "<init>", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "analytics_release"}, k = 1, mv = {1, 5, 1})
public final class FragmentTrackHelper {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Fragment fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final Function1<Long, Unit> durationTracker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final Function0<Unit> viewScreenTracker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Long viewStartTime;

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentTrackHelper(@NotNull Fragment fragment, @Nullable Function1<? super Long, Unit> function1, @Nullable Function0<Unit> function0) {
        this.fragment = fragment;
        this.durationTracker = function1;
        this.viewScreenTracker = function0;
    }

    private final long a() {
        return System.currentTimeMillis();
    }

    private final void b() {
        if (this.viewStartTime != null) {
            long jA = a() - this.viewStartTime.longValue();
            Function1<Long, Unit> function1 = this.durationTracker;
            if (function1 != null) {
                function1.invoke(Long.valueOf(jA));
            }
            this.viewStartTime = null;
        }
    }

    private final void c() {
        if (this.viewStartTime == null) {
            this.viewStartTime = Long.valueOf(a());
        }
    }

    private final void d() {
        Function0<Unit> function0 = this.viewScreenTracker;
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }

    public final void trackOnHiddenChanged() {
        Fragment fragment = this.fragment;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = !fragment.isHidden() && fragment.isResumed() && fragment.getUserVisibleHint();
        Fragment parentFragment = this.fragment.getParentFragment();
        if (parentFragment != null) {
            if (!parentFragment.isHidden() && parentFragment.isResumed() && parentFragment.getUserVisibleHint()) {
                z = true;
            }
            z2 = z;
        }
        if (!z3 || !z2) {
            b();
        } else {
            c();
            d();
        }
    }

    public final void trackOnPause() {
        b();
    }

    public final void trackOnResume() {
        Fragment fragment = this.fragment;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = !fragment.isHidden() && fragment.getUserVisibleHint();
        Fragment parentFragment = this.fragment.getParentFragment();
        if (parentFragment != null) {
            if (!parentFragment.isHidden() && parentFragment.getUserVisibleHint()) {
                z = true;
            }
            z2 = z;
        }
        if (!z3 || !z2) {
            b();
        } else {
            c();
            d();
        }
    }

    public final void trackOnUserVisibleHint() {
        Fragment fragment = this.fragment;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = fragment.getUserVisibleHint() && !fragment.isHidden() && fragment.isResumed();
        Fragment parentFragment = this.fragment.getParentFragment();
        if (parentFragment != null) {
            if (parentFragment.getUserVisibleHint() && !parentFragment.isHidden() && parentFragment.isResumed()) {
                z = true;
            }
            z2 = z;
        }
        if (!z3 || !z2) {
            b();
        } else {
            c();
            d();
        }
    }

    public /* synthetic */ FragmentTrackHelper(Fragment fragment, Function1 function1, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, (i & 2) != 0 ? null : function1, (i & 4) != 0 ? null : function0);
    }
}
