package com.xiaomi.hm.health.bodyfat.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.activity.BalanceDetailsActivity;
import com.xiaomi.hm.health.bodyfat.manager.UserInfoManager;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.BFConstant;
import com.xiaomi.hm.health.bodyfat.utils.BFTitleStyleKt;
import com.xiaomi.hm.health.bodyfat.utils.BodyFatTimeUtils;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.Utils;
import com.xiaomi.hm.health.bodyfat.view.SDAdaptiveTextView;
import com.xiaomi.hm.health.bodyfat.viewmodel.BalanceDetailViewModel;
import com.xiaomi.hm.health.databases.model.UserInfos;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import io.netty.util.internal.StringUtil;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\b\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014R\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/BalanceDetailsActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "initView", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "user", "Lcom/xiaomi/hm/health/databases/model/WeightInfos;", "weightInfos", "z", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/content/Intent;", "intent", "onNewIntent", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/BalanceDetailViewModel;", "x", "Lkotlin/Lazy;", SOAP.XMLNS, "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/BalanceDetailViewModel;", "viewModel", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class BalanceDetailsActivity extends BaseTitleActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new c());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/activity/BalanceDetailsActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "uid", "", "startMe", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startMe(@NotNull Context context, long uid) {
            Intent intent = new Intent(context, (Class<?>) BalanceDetailsActivity.class);
            Bundle bundle = new Bundle();
            bundle.putLong(BFConstant.KEY_UID, uid);
            Unit unit = Unit.INSTANCE;
            intent.putExtras(bundle);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.activity.BalanceDetailsActivity$initView$5$1", f = "BalanceDetailsActivity.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ WeightInfos c;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.activity.BalanceDetailsActivity$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.activity.BalanceDetailsActivity$initView$5$1$1", f = "BalanceDetailsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0778a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ BalanceDetailsActivity b;
            public final /* synthetic */ UserInfos c;
            public final /* synthetic */ WeightInfos d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0778a(BalanceDetailsActivity balanceDetailsActivity, UserInfos userInfos, WeightInfos weightInfos, Continuation<? super C0778a> continuation) {
                super(2, continuation);
                this.b = balanceDetailsActivity;
                this.c = userInfos;
                this.d = weightInfos;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0778a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0778a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.z(this.c, this.d);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WeightInfos weightInfos, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = weightInfos;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BalanceDetailsActivity.this.new a(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoManager manager = UserInfoManager.getManager();
                Long value = BalanceDetailsActivity.this.s().getUid().getValue();
                if (value == null) {
                    value = Boxing.boxLong(0L);
                }
                UserInfos info = manager.getInfo(value.longValue());
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C0778a c0778a = new C0778a(BalanceDetailsActivity.this, info, this.c, null);
                this.a = 1;
                if (BuildersKt.withContext(main, c0778a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.activity.BalanceDetailsActivity$showDelDialog$1$1", f = "BalanceDetailsActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BalanceDetailsActivity.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WeightInfoManager.getManager().deleteInfo(BalanceDetailsActivity.this.s().getSelectData().getValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/BalanceDetailViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<BalanceDetailViewModel> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BalanceDetailViewModel getA() {
            return (BalanceDetailViewModel) ViewModelProviders.of(BalanceDetailsActivity.this).get(BalanceDetailViewModel.class);
        }
    }

    private final void A() {
        new AlertDialogFragment.Builder(this).setCancelable(true).setMessage(R.string.one_foot_delete_title).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: qm
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                BalanceDetailsActivity.B(this.a, dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(BalanceDetailsActivity balanceDetailsActivity, DialogInterface dialogInterface, int i) {
        if (balanceDetailsActivity.s().getSelectData().getValue() != null) {
            e.f(LifecycleOwnerKt.getLifecycleScope(balanceDetailsActivity), Dispatchers.getIO(), null, balanceDetailsActivity.new b(null), 2, null);
        }
    }

    private final void initView() {
        BFTitleStyleKt.setUnifyTitleStyle$default(this, null, null, 3, null);
        TextView textView = (TextView) findViewById(R.id.card_status_title);
        SDAdaptiveTextView sDAdaptiveTextView = (SDAdaptiveTextView) findViewById(R.id.card_status_introduce);
        textView.setText(R.string.bodyfat_measure_principle);
        sDAdaptiveTextView.setText(R.string.bodyfat_desc_measure_balance_theroy);
        final View viewFindViewById = findViewById(R.id.delete_ll);
        s().getDeleteEnable().observe(this, new Observer() { // from class: um
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BalanceDetailsActivity.t(viewFindViewById, (Boolean) obj);
            }
        });
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: rm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BalanceDetailsActivity.u(this.a, view);
            }
        });
        findViewById(R.id.measure_ll).setOnClickListener(new View.OnClickListener() { // from class: sm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BalanceDetailsActivity.v(this.a, view);
            }
        });
        findViewById(R.id.guest_ll).setOnClickListener(new View.OnClickListener() { // from class: tm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BalanceDetailsActivity.w(this.a, view);
            }
        });
        s().getSelectData().observe(this, new Observer() { // from class: wm
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BalanceDetailsActivity.x(this.a, (WeightInfos) obj);
            }
        });
        final TextView textView2 = (TextView) findViewById(R.id.tx_no_score);
        s().getWeightInfos().observe(this, new Observer() { // from class: vm
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                BalanceDetailsActivity.y(textView2, (List) obj);
            }
        });
        MutableLiveData<Long> uid = s().getUid();
        Bundle extras = getIntent().getExtras();
        Long lValueOf = extras != null ? Long.valueOf(extras.getLong(BFConstant.KEY_UID)) : null;
        if (lValueOf == null) {
            lValueOf = Long.valueOf(Utils.toLongValue$default(Utils.INSTANCE, BFCallback.getHMPersonInfo().getUserid(), 0L, 2, null));
        }
        uid.setValue(lValueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BalanceDetailViewModel s() {
        return (BalanceDetailViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(View view, Boolean bool) {
        if (bool.booleanValue()) {
            view.setEnabled(true);
            view.setAlpha(1.0f);
        } else {
            view.setEnabled(false);
            view.setAlpha(0.4f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(BalanceDetailsActivity balanceDetailsActivity, View view) {
        List<WeightInfos> value = balanceDetailsActivity.s().getWeightInfos().getValue();
        if ((value == null ? 0 : value.size()) > 1) {
            balanceDetailsActivity.A();
        } else {
            CustomToast.makeText(balanceDetailsActivity.getApplicationContext(), R.string.cannot_delete, 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(BalanceDetailsActivity balanceDetailsActivity, View view) {
        ConnectScaleActivity.Companion companion = ConnectScaleActivity.INSTANCE;
        companion.launch(balanceDetailsActivity, companion.getTYPE_BALANCE());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(BalanceDetailsActivity balanceDetailsActivity, View view) {
        balanceDetailsActivity.startActivity(new Intent(balanceDetailsActivity, (Class<?>) GuestChooseModeActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(BalanceDetailsActivity balanceDetailsActivity, WeightInfos weightInfos) {
        e.f(LifecycleOwnerKt.getLifecycleScope(balanceDetailsActivity), Dispatchers.getIO(), null, balanceDetailsActivity.new a(weightInfos, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(TextView textView, List list) {
        if (list == null || list.isEmpty()) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(UserInfos user, WeightInfos weightInfos) {
        if (user != null) {
            if (weightInfos == null) {
                if (HMWeightUtils.length(user.getName()) > 18) {
                    setTitleText(Intrinsics.stringPlus(user.getName().substring(0, 8), ".."));
                    return;
                } else {
                    setTitleText(user.getName());
                    return;
                }
            }
            if (HMWeightUtils.length(user.getName()) > 18) {
                setTitleText(user.getName().substring(0, 8) + ".. " + ((Object) BodyFatTimeUtils.INSTANCE.formatDateTime_no_y((Context) this, weightInfos.getTimestamp().longValue(), false)));
                return;
            }
            setTitleText(user.getName() + StringUtil.SPACE + ((Object) BodyFatTimeUtils.INSTANCE.formatDateTime_no_y((Context) this, weightInfos.getTimestamp().longValue(), false)));
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activtiy_balance_details);
        initView();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(@Nullable Intent intent) {
        Bundle extras;
        super.onNewIntent(intent);
        MutableLiveData<Long> uid = s().getUid();
        Long lValueOf = null;
        if (intent != null && (extras = intent.getExtras()) != null) {
            lValueOf = Long.valueOf(extras.getLong(BFConstant.KEY_UID));
        }
        if (lValueOf == null) {
            lValueOf = Long.valueOf(Utils.toLongValue$default(Utils.INSTANCE, BFCallback.getHMPersonInfo().getUserid(), 0L, 2, null));
        }
        uid.setValue(lValueOf);
    }
}
