package com.huami.third.xiaomi.ui;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.huami.third.xiaomi.LoadingView;
import com.huami.third.xiaomi.MiHolder;
import com.huami.third.xiaomi.MiSource;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013JA\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042#\b\u0002\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0007R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/third/xiaomi/ui/MiBind;", "", "Landroidx/fragment/app/FragmentActivity;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/third/xiaomi/LoadingView;", "loadingView", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "auth", "", "callback", "open", "Lcom/huami/third/xiaomi/MiSource;", "a", "Lcom/huami/third/xiaomi/MiSource;", "miSource", "<init>", "()V", "xiaomi-ui_release"}, k = 1, mv = {1, 4, 1})
public final class MiBind {

    @NotNull
    public static final MiBind INSTANCE = new MiBind();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final MiSource miSource = new MiSource();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a extends Lambda implements Function1<Boolean, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ FragmentActivity a;
        public final /* synthetic */ Function1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FragmentActivity fragmentActivity, Function1 function1) {
            super(1);
            this.a = fragmentActivity;
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.a.startActivity(new Intent(this.a, (Class<?>) MiBindActivity.class));
            this.b.invoke(Boolean.valueOf(z));
        }
    }

    private MiBind() {
    }

    @JvmStatic
    public static final void open(@NotNull FragmentActivity context, @Nullable LoadingView loadingView, @NotNull Function1<? super Boolean, Unit> callback) {
        MiSource miSource2 = miSource;
        if (!miSource2.checkNeedAuth(context)) {
            context.startActivity(new Intent(context, (Class<?>) MiBindActivity.class));
        } else {
            MiHolder.INSTANCE.setLoadingView(loadingView);
            miSource2.getAuthorCode(context, new b(context, callback));
        }
    }

    public static /* synthetic */ void open$default(FragmentActivity fragmentActivity, LoadingView loadingView, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            loadingView = null;
        }
        if ((i & 4) != 0) {
            function1 = a.a;
        }
        open(fragmentActivity, loadingView, function1);
    }
}
