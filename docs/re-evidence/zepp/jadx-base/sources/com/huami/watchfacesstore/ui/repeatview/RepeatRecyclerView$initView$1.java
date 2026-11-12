package com.huami.watchfacesstore.ui.repeatview;

import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.OnLifecycleEvent;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.ui.repeatview.RepeatRecyclerView$initView$1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007¨\u0006\u0005"}, d2 = {"com/huami/watchfacesstore/ui/repeatview/RepeatRecyclerView$initView$1", "Landroidx/lifecycle/LifecycleObserver;", "", "OnResume", "onStop", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class RepeatRecyclerView$initView$1 implements LifecycleObserver {
    public final /* synthetic */ RepeatRecyclerView a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "OnLifecycleEvent smoothScrollToPosition";
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
            return "OnLifecycleEvent stopScroll";
        }
    }

    public RepeatRecyclerView$initView$1(RepeatRecyclerView repeatRecyclerView) {
        this.a = repeatRecyclerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(RepeatRecyclerView repeatRecyclerView) {
        HMLog.info(repeatRecyclerView.tag, a.a);
        repeatRecyclerView.smoothScrollToPosition(2147483646);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void OnResume() {
        final RepeatRecyclerView repeatRecyclerView = this.a;
        repeatRecyclerView.postDelayed(new Runnable() { // from class: sb6
            @Override // java.lang.Runnable
            public final void run() {
                RepeatRecyclerView$initView$1.b(repeatRecyclerView);
            }
        }, 100L);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        HMLog.info(this.a.tag, b.a);
        this.a.stopScroll();
    }
}
