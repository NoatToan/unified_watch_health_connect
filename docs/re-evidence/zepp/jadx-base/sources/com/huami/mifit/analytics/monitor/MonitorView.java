package com.huami.mifit.analytics.monitor;

import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R%\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00188\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001e¨\u0006%"}, d2 = {"Lcom/huami/mifit/analytics/monitor/MonitorView;", "", "Landroid/view/View;", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Lkotlin/Function1;", "", "", "b", "Lkotlin/jvm/functions/Function1;", "getExposedCallback", "()Lkotlin/jvm/functions/Function1;", "exposedCallback", "", "c", "J", "getShowStartTime", "()J", "setShowStartTime", "(J)V", "showStartTime", "", GoogleApiAvailabilityLight.a, "Z", "isReported", "()Z", "setReported", "(Z)V", "value", "e", "isShow", "setShow", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;JZ)V", "analytics_release"}, k = 1, mv = {1, 5, 1})
public final class MonitorView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final View view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function1<Integer, Unit> exposedCallback;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long showStartTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isReported;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isShow;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Integer, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(int i) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MonitorView(@NotNull View view, @NotNull Function1<? super Integer, Unit> function1, long j, boolean z) {
        this.view = view;
        this.exposedCallback = function1;
        this.showStartTime = j;
        this.isReported = z;
    }

    @NotNull
    public final Function1<Integer, Unit> getExposedCallback() {
        return this.exposedCallback;
    }

    public final long getShowStartTime() {
        return this.showStartTime;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: isReported, reason: from getter */
    public final boolean getIsReported() {
        return this.isReported;
    }

    /* JADX INFO: renamed from: isShow, reason: from getter */
    public final boolean getIsShow() {
        return this.isShow;
    }

    public final void setReported(boolean z) {
        this.isReported = z;
    }

    public final void setShow(boolean z) {
        this.showStartTime = z ? System.currentTimeMillis() : -1L;
        this.isShow = z;
    }

    public final void setShowStartTime(long j) {
        this.showStartTime = j;
    }

    public /* synthetic */ MonitorView(View view, Function1 function1, long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i & 2) != 0 ? a.a : function1, (i & 4) != 0 ? -1L : j, (i & 8) != 0 ? false : z);
    }
}
