package com.huami.healthlabel.utils;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.healthlabel.R;
import com.huami.healthlabel.db.LabelDb;
import com.huami.healthlabel.healthlabelhistory.HealthLabelHistoryActivity;
import com.huami.healthlabel.koin.ScopesAndQualifersKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.notification.TransportUri;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\b\u0010\u0004\u001a\u00020\u0002H\u0007\u001a\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0001\u001a\u0014\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\"\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u000e\"*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "openRecordLabelPage", "handleReLogin", "Lcom/huami/healthlabel/utils/ReLoginListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setReLoginListener", "Lkotlin/Function0;", TransportUri.ACTION_BLOCK, "addLabelListener", "a", "Lcom/huami/healthlabel/utils/ReLoginListener;", "getReLoginListener$annotations", "()V", "reLoginListener", "b", "Lkotlin/jvm/functions/Function0;", "getAddLabelListener", "()Lkotlin/jvm/functions/Function0;", "setAddLabelListener", "(Lkotlin/jvm/functions/Function0;)V", "healthLabel_release"}, k = 2, mv = {1, 5, 1})
@JvmName(name = "HealthLabelHelper")
public final class HealthLabelHelper {

    @Nullable
    private static ReLoginListener a;

    @Nullable
    private static Function0<Unit> b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.healthlabel.utils.HealthLabelHelper$handleReLogin$1", f = "HealthLabelHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LabelDb labelDb = ScopesAndQualifersKt.labelDb(ScopesAndQualifersKt.getKoin());
            labelDb.healthLabelDao().deleteLabel(0L, Long.MAX_VALUE);
            labelDb.homeLabelDao().deleteAllLabel();
            ReLoginListener reLoginListener = HealthLabelHelper.a;
            if (reLoginListener != null) {
                reLoginListener.reLoginSuccess();
            }
            return Unit.INSTANCE;
        }
    }

    @Deprecated(message = "卡片模式下已经不需要了")
    private static /* synthetic */ void a() {
    }

    public static final void addLabelListener(@NotNull Function0<Unit> function0) {
        b = function0;
    }

    @Nullable
    public static final Function0<Unit> getAddLabelListener() {
        return b;
    }

    @Deprecated(message = "卡片模式下已经不需要了")
    public static final void handleReLogin() {
        e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new a(null), 2, null);
    }

    public static final void openRecordLabelPage(@NotNull Context context) {
        if (UtilsKt.isNetworkConnect(UtilsKt.getGlobalContext()) || SpUtilsKt.getHasRecordData()) {
            context.startActivity(new Intent(context, (Class<?>) HealthLabelHistoryActivity.class).putExtra("cf", HealthLabelAnalyticsKt.TAG_CLICK_SOURCE_MINE).addFlags(268435456));
        } else {
            UtilsKt.toast(R.string.health_label_network_error_retry);
        }
    }

    public static final void setAddLabelListener(@Nullable Function0<Unit> function0) {
        b = function0;
    }

    @Deprecated(message = "卡片模式下已经不需要了")
    public static final void setReLoginListener(@Nullable ReLoginListener reLoginListener) {
        a = reLoginListener;
    }
}
