package com.xiaomi.fitness.mine.vip;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.app.AppManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.membership.export.MembershipHelper;
import com.xiaomi.fitness.membership.export.MembershipHelperExtKt;
import com.xiaomi.fitness.membership.export.data.HomeConfig;
import com.xiaomi.fitness.membership.export.data.VipConfigInfo;
import com.xiaomi.fitness.membership.export.data.VipInfo;
import com.xiaomi.fitness.mine.vip.MineVipView;
import com.xiaomi.fitness.yrn_config.YRNConstants;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.wearable.yrn.export.YRNHelper;
import com.xiaomi.wearable.yrn.export.YRNHelperExtKt;
import defpackage.m0j;
import defpackage.n4g;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/mine/vip/MineVipView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/xiaomi/fitness/membership/export/data/VipInfo;", "info", "", "setButton", "(Lcom/xiaomi/fitness/membership/export/data/VipInfo;)V", "Lkotlin/Function0;", "login", "checkLogin", "(Lkotlin/jvm/functions/Function0;)V", "showVipPurchaseDialog", "()V", "gotoVipCenter", "setVipInfo", "Lcom/xiaomi/fitness/membership/export/data/VipConfigInfo;", q.f13857a, "setVipConfig", "(Lcom/xiaomi/fitness/membership/export/data/VipConfigInfo;)V", "Ln4g;", "binding", "Ln4g;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMineVipView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MineVipView.kt\ncom/xiaomi/fitness/mine/vip/MineVipView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
public final class MineVipView extends ConstraintLayout {
    private static final int SHOW_CHARGE_DAYS = 7;

    @NotNull
    private final n4g binding;

    /* JADX INFO: renamed from: com.xiaomi.fitness.mine.vip.MineVipView$setVipConfig$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.mine.vip.MineVipView$setVipConfig$1", f = "MineVipView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ HomeConfig $homeConfig;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HomeConfig homeConfig, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$homeConfig = homeConfig;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MineVipView.this.new AnonymousClass1(this.$homeConfig, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            TextView textView = MineVipView.this.binding.E;
            List<String> first = this.$homeConfig.getFirst();
            textView.setText(first != null ? (String) CollectionsKt___CollectionsKt.getOrNull(first, 0) : null);
            TextView textView2 = MineVipView.this.binding.J;
            List<String> first2 = this.$homeConfig.getFirst();
            textView2.setText(first2 != null ? (String) CollectionsKt___CollectionsKt.getOrNull(first2, 1) : null);
            TextView textView3 = MineVipView.this.binding.D;
            List<String> second = this.$homeConfig.getSecond();
            textView3.setText(second != null ? (String) CollectionsKt___CollectionsKt.getOrNull(second, 0) : null);
            TextView textView4 = MineVipView.this.binding.I;
            List<String> second2 = this.$homeConfig.getSecond();
            textView4.setText(second2 != null ? (String) CollectionsKt___CollectionsKt.getOrNull(second2, 1) : null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MineVipView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(final MineVipView this$0, View it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.checkLogin(new Function0() { // from class: t4g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MineVipView.lambda$1$lambda$0(this.f34301a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(MineVipView this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            AnyExtKt.main$default(null, new MineVipView$2$1(this$0, null), 1, null);
        }
        return Unit.INSTANCE;
    }

    private final void checkLogin(Function0<Unit> login) {
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            login.invoke();
        } else if (fragmentActivity != null) {
            CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).showLoginDialog(fragmentActivity);
        }
    }

    private final void gotoVipCenter() {
        Activity currentActivity = AppManager.INSTANCE.getInstance().getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        YRNHelperExtKt.getInstance(YRNHelper.INSTANCE).openPage(currentActivity, YRNConstants.APP_NAME, "dial/Membership", null);
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36274"), TuplesKt.to("name", "profile_tab_page_member_center")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda$1$lambda$0(MineVipView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.gotoVipCenter();
        return Unit.INSTANCE;
    }

    private final void setButton(VipInfo info) {
        boolean z = false;
        int days = info != null ? info.getDays() : 0;
        String expiredAt = info != null ? info.getExpiredAt() : null;
        boolean z2 = expiredAt != null && expiredAt.length() != 0 && days <= 7 && days > -7;
        if (expiredAt != null && expiredAt.length() != 0 && days < 0 && days > -7) {
            z = true;
        }
        TextView button = this.binding.A;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        ViewExtKt.visible(button);
        if ((z2 && info != null && info.getType() == 0) || (z && info != null && info.getType() == 1)) {
            this.binding.A.setText(m0j.y0);
            ViewExtKt.clickWithTrigger$default(this.binding.A, 0L, new Function1() { // from class: p4g
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MineVipView.setButton$lambda$4(this.f29989a, (TextView) obj);
                }
            }, 1, null);
        } else if (info == null || !info.getActive()) {
            this.binding.A.setText(m0j.x0);
            ViewExtKt.clickWithTrigger$default(this.binding.A, 0L, new Function1() { // from class: q4g
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MineVipView.setButton$lambda$6(this.f31080a, (TextView) obj);
                }
            }, 1, null);
        } else if (days > 7 || info.getType() == 1) {
            this.binding.A.setText(m0j.z0);
            ViewExtKt.clickWithTrigger$default(this.binding.A, 0L, new Function1() { // from class: r4g
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return MineVipView.setButton$lambda$8(this.f32176a, (TextView) obj);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setButton$lambda$4(final MineVipView this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.checkLogin(new Function0() { // from class: s4g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MineVipView.setButton$lambda$4$lambda$3(this.f33272a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setButton$lambda$4$lambda$3(MineVipView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showVipPurchaseDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setButton$lambda$6(final MineVipView this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.checkLogin(new Function0() { // from class: u4g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MineVipView.setButton$lambda$6$lambda$5(this.f35369a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setButton$lambda$6$lambda$5(MineVipView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.showVipPurchaseDialog();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setButton$lambda$8(final MineVipView this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.checkLogin(new Function0() { // from class: x4g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MineVipView.setButton$lambda$8$lambda$7(this.f38682a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setButton$lambda$8$lambda$7(MineVipView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.gotoVipCenter();
        return Unit.INSTANCE;
    }

    private final void showVipPurchaseDialog() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.90.0.1.36274"), TuplesKt.to("name", "profile_tab_page_member_center_button")));
        MembershipHelperExtKt.getInstance(MembershipHelper.INSTANCE).showVipPurchaseDialog("profile_tab_page_member_center");
    }

    public final void setVipConfig(@Nullable VipConfigInfo config) {
        HomeConfig home;
        if (config == null || (home = config.getHome()) == null) {
            return;
        }
        AnyExtKt.main$default(null, new AnonymousClass1(home, null), 1, null);
    }

    public final void setVipInfo(@Nullable VipInfo info) {
        setButton(info);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MineVipView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MineVipView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MineVipView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        n4g n4gVarA0 = n4g.A0(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(n4gVarA0, "inflate(...)");
        this.binding = n4gVarA0;
        ViewExtKt.clickWithTrigger$default(n4gVarA0.getRoot(), 0L, new Function1() { // from class: v4g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineVipView._init_$lambda$1(this.f36468a, (View) obj);
            }
        }, 1, null);
        MembershipHelperExtKt.getInstance(MembershipHelper.INSTANCE).addMemberStatusChangeListener(new Function1() { // from class: w4g
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return MineVipView._init_$lambda$2(this.f37609a, ((Boolean) obj).booleanValue());
            }
        });
        float f = AppUtil.isRTLDirection() ? -1.0f : 1.0f;
        n4gVarA0.C.setScaleX(f);
        n4gVarA0.H.setScaleX(f);
    }
}
