package com.huami.watchfacesstore.ui.repeatview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#B\u0019\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b\"\u0010&B!\b\u0016\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001e\u0010\u0011\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000bR\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006)"}, d2 = {"Lcom/huami/watchfacesstore/ui/repeatview/RepeatRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "a", "stopScroll", "onAttachedToWindow", "", "position", "smoothScrollToPosition", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "", "", "list", "needGap", "setRepeatAdapter", "Ljava/lang/String;", "tag", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "getOnClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnClickListener", "(Lkotlin/jvm/functions/Function0;)V", "onClickListener", "", "c", "J", "clickTime", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class RepeatRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> onClickListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long clickTime;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onAttachedToWindow smoothScrollToPosition";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "smoothScrollToPosition";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "stopScroll";
        }
    }

    public RepeatRecyclerView(@NotNull Context context) {
        super(context);
        this.tag = "RepeatRecyclerView";
        a();
    }

    private final void a() {
        if (getContext() instanceof AppCompatActivity) {
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            ((AppCompatActivity) context).getLifecycle().addObserver(new RepeatRecyclerView$initView$1(this));
        }
    }

    public static /* synthetic */ void setRepeatAdapter$default(RepeatRecyclerView repeatRecyclerView, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        repeatRecyclerView.setRepeatAdapter(list, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        Integer numValueOf = ev == null ? null : Integer.valueOf(ev.getAction());
        if (numValueOf != null && numValueOf.intValue() == 1 && System.currentTimeMillis() - this.clickTime > 500) {
            Function0<Unit> function0 = this.onClickListener;
            if (function0 != null) {
                function0.invoke();
            }
            this.clickTime = System.currentTimeMillis();
        }
        return true;
    }

    @Nullable
    public final Function0<Unit> getOnClickListener() {
        return this.onClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        HMLog.info(this.tag, a.a);
        smoothScrollToPosition(2147483646);
    }

    public final void setOnClickListener(@Nullable Function0<Unit> function0) {
        this.onClickListener = function0;
    }

    public final void setRepeatAdapter(@NotNull List<String> list, boolean needGap) {
        setAdapter(new ScrollAdapter(list, needGap));
        setLayoutManager(new ScrollLayoutManager(getContext()));
        smoothScrollToPosition(2147483646);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void smoothScrollToPosition(int position) {
        super.smoothScrollToPosition(position);
        HMLog.info(this.tag, b.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void stopScroll() {
        super.stopScroll();
        HMLog.info(this.tag, c.a);
    }

    public RepeatRecyclerView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tag = "RepeatRecyclerView";
        a();
    }

    public RepeatRecyclerView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.tag = "RepeatRecyclerView";
        a();
    }
}
