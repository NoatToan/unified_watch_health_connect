package com.xiaomi.fitness.sport.view.lockscreen.view;

import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.c;
import androidx.core.view.d;
import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sleep.trace.analyze.SleepAnalyzerAlpha;
import com.xiaomi.fitness.sport.bean.SportingData;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import com.xiaomi.fitness.sport.model.utils.CommonSportModelUtil;
import com.xiaomi.fitness.sport.utils.SportUtilsExtKt;
import com.xiaomi.fitness.sport.view.lockscreen.entity.LockScreenReceiver;
import com.xiaomi.fitness.sport.view.lockscreen.ui.LockUnderView;
import com.xiaomi.fitness.sport.view.lockscreen.ui.ValueIconUnitView;
import com.xiaomi.fitness.sport.view.lockscreen.view.SportLockScreenActivity;
import com.xiaomi.fitness.sport.view.lockscreen.viewmodel.SportLockScreenViewModel;
import com.xiaomi.fitness.sport.view.widget.SportCommandView;
import defpackage.aki;
import defpackage.dvi;
import defpackage.xri;
import defpackage.z9n;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u0000 n2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001nB\u0007¢\u0006\u0004\bm\u0010\u0007J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\u0007J\u000f\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u0007J\u000f\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u0007J\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u0007J\u000f\u0010\u001e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u0007J\u000f\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001f\u0010\u0007J7\u0010%\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u00162\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010#\u001a\u0004\u0018\u00010!2\b\u0010$\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010*H\u0014¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0005H\u0014¢\u0006\u0004\b1\u0010\u0007J\u000f\u00102\u001a\u00020\u0005H\u0014¢\u0006\u0004\b2\u0010\u0007J\u0017\u00103\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0005H\u0014¢\u0006\u0004\b5\u0010\u0007J\u0011\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b7\u00108R\u0014\u00109\u001a\u00020!8\u0002X\u0082D¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b;\u0010<R\"\u0010=\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010C\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010>\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR\u001b\u0010K\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010H\u001a\u0004\bN\u0010OR\u001b\u0010U\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010H\u001a\u0004\bS\u0010TR\"\u0010V\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010\\\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010W\u001a\u0004\b]\u0010Y\"\u0004\b^\u0010[R\"\u0010_\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b_\u0010W\u001a\u0004\b`\u0010Y\"\u0004\ba\u0010[R\"\u0010b\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bb\u0010W\u001a\u0004\bc\u0010Y\"\u0004\bd\u0010[R\"\u0010e\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010W\u001a\u0004\bf\u0010Y\"\u0004\bg\u0010[R\"\u0010h\u001a\u00020\u00168\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bh\u0010W\u001a\u0004\bi\u0010Y\"\u0004\bj\u0010[R\u001e\u0010k\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006o"}, d2 = {"Lcom/xiaomi/fitness/sport/view/lockscreen/view/SportLockScreenActivity;", "Lcom/xiaomi/fitness/sport/view/sporting/BaseSportingActivity;", "Lcom/xiaomi/fitness/sport/view/lockscreen/viewmodel/SportLockScreenViewModel;", "Lz9n;", "Lcom/xiaomi/fitness/sport/view/lockscreen/ui/LockUnderView$OnAlphaChangeListener;", "", "findViews", "()V", "initGoalTypeAndWearMode", "startObserving", "initContentView", "startSystemTimer", "sendMessagePerSecond", "stopSystemTimer", "updateSystemTimeUIPerMinute", "", "Landroid/view/View;", "getSportTracerViews", "()[Landroid/view/View;", "Landroid/widget/TextView;", "getAllSportTitleViews", "()[Landroid/widget/TextView;", "Lcom/xiaomi/fitness/sport/view/lockscreen/ui/ValueIconUnitView;", "getAllItemViews", "()[Lcom/xiaomi/fitness/sport/view/lockscreen/ui/ValueIconUnitView;", "", SleepAnalyzerAlpha.NAME_ALPHA, "getColorWithArgb", "(I)I", "hideSystemUI", "registerUnlockScreenReceiver", "unregisterUnlockScreenReceiver", "itemView", "", "value", "unit", "other", "refreshItemViewWithUpdatedData", "(Lcom/xiaomi/fitness/sport/view/lockscreen/ui/ValueIconUnitView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "isNeedRemind", "()Z", LifecycleConstantKt.ON_RESUME, LifecycleConstantKt.ON_PAUSE, "onAlphaChange", "(I)V", LifecycleConstantKt.ON_DESTROY, "Lcom/xiaomi/fitness/sport/view/widget/SportCommandView;", "getSportCommandView", "()Lcom/xiaomi/fitness/sport/view/widget/SportCommandView;", "TAG", "Ljava/lang/String;", "MSG_WHAT_UDPATE_SYSTEM_TIME", "I", "sportTimerView", "Landroid/widget/TextView;", "getSportTimerView", "()Landroid/widget/TextView;", "setSportTimerView", "(Landroid/widget/TextView;)V", "targetDataUnit", "getTargetDataUnit", "setTargetDataUnit", "Ljava/text/SimpleDateFormat;", "mDurationFormat$delegate", "Lkotlin/Lazy;", "getMDurationFormat", "()Ljava/text/SimpleDateFormat;", "mDurationFormat", "Lcom/xiaomi/fitness/sport/view/lockscreen/view/SportLockScreenActivity$Companion$SystemTimeHandler;", "systemTimeHandler$delegate", "getSystemTimeHandler", "()Lcom/xiaomi/fitness/sport/view/lockscreen/view/SportLockScreenActivity$Companion$SystemTimeHandler;", "systemTimeHandler", "Lcom/xiaomi/fitness/sport/view/lockscreen/view/SportLockScreenActivity$Companion$HomeButtonAndMultiTaskReceiver;", "homeButtonAndMultiTaskReceiver$delegate", "getHomeButtonAndMultiTaskReceiver", "()Lcom/xiaomi/fitness/sport/view/lockscreen/view/SportLockScreenActivity$Companion$HomeButtonAndMultiTaskReceiver;", "homeButtonAndMultiTaskReceiver", "itemView0", "Lcom/xiaomi/fitness/sport/view/lockscreen/ui/ValueIconUnitView;", "getItemView0", "()Lcom/xiaomi/fitness/sport/view/lockscreen/ui/ValueIconUnitView;", "setItemView0", "(Lcom/xiaomi/fitness/sport/view/lockscreen/ui/ValueIconUnitView;)V", "itemView1", "getItemView1", "setItemView1", "itemView2", "getItemView2", "setItemView2", "itemView3", "getItemView3", "setItemView3", "itemView4", "getItemView4", "setItemView4", "itemView5", "getItemView5", "setItemView5", "itemViewArray", "[Lcom/xiaomi/fitness/sport/view/lockscreen/ui/ValueIconUnitView;", "<init>", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportLockScreenActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportLockScreenActivity.kt\ncom/xiaomi/fitness/sport/view/lockscreen/view/SportLockScreenActivity\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,461:1\n13402#2,2:462\n13402#2,2:464\n13402#2,2:466\n*S KotlinDebug\n*F\n+ 1 SportLockScreenActivity.kt\ncom/xiaomi/fitness/sport/view/lockscreen/view/SportLockScreenActivity\n*L\n267#1:462,2\n271#1:464,2\n274#1:466,2\n*E\n"})
public final class SportLockScreenActivity extends Hilt_SportLockScreenActivity<SportLockScreenViewModel, z9n> implements LockUnderView.OnAlphaChangeListener {
    private final int MSG_WHAT_UDPATE_SYSTEM_TIME;

    @NotNull
    private final String TAG;

    /* JADX INFO: renamed from: homeButtonAndMultiTaskReceiver$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy homeButtonAndMultiTaskReceiver;
    public ValueIconUnitView itemView0;
    public ValueIconUnitView itemView1;
    public ValueIconUnitView itemView2;
    public ValueIconUnitView itemView3;
    public ValueIconUnitView itemView4;
    public ValueIconUnitView itemView5;

    @Nullable
    private ValueIconUnitView[] itemViewArray;

    /* JADX INFO: renamed from: mDurationFormat$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDurationFormat;
    public TextView sportTimerView;

    /* JADX INFO: renamed from: systemTimeHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy systemTimeHandler;
    public TextView targetDataUnit;

    public SportLockScreenActivity() {
        super(dvi.O, 0);
        this.TAG = "SportLockScreenActivity";
        this.MSG_WHAT_UDPATE_SYSTEM_TIME = 1;
        this.mDurationFormat = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: zpn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportLockScreenActivity.mDurationFormat_delegate$lambda$0();
            }
        });
        this.systemTimeHandler = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: bqn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportLockScreenActivity.systemTimeHandler_delegate$lambda$1(this.f4488a);
            }
        });
        this.homeButtonAndMultiTaskReceiver = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: dqn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SportLockScreenActivity.homeButtonAndMultiTaskReceiver_delegate$lambda$2(this.f15819a);
            }
        });
    }

    private final void findViews() {
        setSportTimerView((TextView) findViewById(xri.f7));
        setTargetDataUnit((TextView) findViewById(xri.g7));
        setItemView0((ValueIconUnitView) findViewById(xri.K2));
        setItemView1((ValueIconUnitView) findViewById(xri.L2));
        setItemView2((ValueIconUnitView) findViewById(xri.M2));
        setItemView3((ValueIconUnitView) findViewById(xri.N2));
        setItemView4((ValueIconUnitView) findViewById(xri.O2));
        setItemView5((ValueIconUnitView) findViewById(xri.P2));
        this.itemViewArray = new ValueIconUnitView[]{getItemView0(), getItemView1(), getItemView2(), getItemView3(), getItemView4(), getItemView5()};
    }

    private final ValueIconUnitView[] getAllItemViews() {
        return new ValueIconUnitView[]{getItemView0(), getItemView1(), getItemView2(), getItemView3(), getItemView4(), getItemView5()};
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TextView[] getAllSportTitleViews() {
        return new TextView[]{((z9n) getMBinding()).H, ((z9n) getMBinding()).G, ((z9n) getMBinding()).F, ((z9n) getMBinding()).A};
    }

    private final int getColorWithArgb(int alpha) {
        return Color.argb(alpha, 255, 255, 255);
    }

    private final Companion.HomeButtonAndMultiTaskReceiver getHomeButtonAndMultiTaskReceiver() {
        return (Companion.HomeButtonAndMultiTaskReceiver) this.homeButtonAndMultiTaskReceiver.getValue();
    }

    private final SimpleDateFormat getMDurationFormat() {
        return (SimpleDateFormat) this.mDurationFormat.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View[] getSportTracerViews() {
        return new View[]{((z9n) getMBinding()).E.F, ((z9n) getMBinding()).E.G, ((z9n) getMBinding()).E.D, ((z9n) getMBinding()).E.A, ((z9n) getMBinding()).E.C};
    }

    private final Companion.SystemTimeHandler getSystemTimeHandler() {
        return (Companion.SystemTimeHandler) this.systemTimeHandler.getValue();
    }

    private final void hideSystemUI() {
        getWindow().getDecorView().setSystemUiVisibility(5890);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Companion.HomeButtonAndMultiTaskReceiver homeButtonAndMultiTaskReceiver_delegate$lambda$2(SportLockScreenActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Companion.HomeButtonAndMultiTaskReceiver(this$0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initContentView() {
        getWindow().addFlags(4718592);
        d dVarL = c.L(((z9n) getMBinding()).getRoot());
        if (dVarL != null) {
            dVarL.a(WindowInsetsCompat.m.g());
        }
        if (dVarL != null) {
            dVarL.a(WindowInsetsCompat.m.f());
        }
        getMDurationFormat().setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        ((z9n) getMBinding()).F.setText(SportUtilsExtKt.getSportTypeStr(((CommonSportModel) ((SportLockScreenViewModel) getMViewModel()).getMModel()).getSportType()));
        startSystemTimer();
        ((z9n) getMBinding()).C.setOnAlphaChangeListener(this);
        ((z9n) getMBinding()).C.setOnMoveListener(new Function1() { // from class: xpn
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SportLockScreenActivity.initContentView$lambda$5(this.f39340a, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initContentView$lambda$5(SportLockScreenActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            this$0.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initGoalTypeAndWearMode() {
        Logger.d(this.TAG, "sportGoal type " + getGoalType());
        Logger.d(this.TAG, "sportGoal value " + getGoalValue());
        setWearMode(getIntent().getIntExtra("WEAR_MODE", 0));
        if (getGoalType() == -1) {
            RelativeLayout goalSection = ((z9n) getMBinding()).E.B;
            Intrinsics.checkNotNullExpressionValue(goalSection, "goalSection");
            ViewExtKt.gone(goalSection);
        } else {
            RelativeLayout goalSection2 = ((z9n) getMBinding()).E.B;
            Intrinsics.checkNotNullExpressionValue(goalSection2, "goalSection");
            ViewExtKt.visible(goalSection2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat mDurationFormat_delegate$lambda$0() {
        return new SimpleDateFormat(StringUtils.EXPECT_TIME_FORMAT);
    }

    private final void refreshItemViewWithUpdatedData(ValueIconUnitView itemView, String value, String unit, String other) {
        ImageView iconView;
        ImageView iconView2;
        if (value == null) {
            if (itemView != null) {
                ViewExtKt.gone(itemView);
                return;
            }
            return;
        }
        if (itemView != null) {
            itemView.setValue(value);
        }
        if (other == null || other.length() == 0 || Intrinsics.areEqual(other, "pace")) {
            if (itemView != null) {
                itemView.setUnit(String.valueOf(unit));
            }
            if (itemView == null || (iconView = itemView.getIconView()) == null) {
                return;
            }
            ViewExtKt.gone(iconView);
            return;
        }
        if (itemView != null) {
            itemView.setUnit(other);
        }
        if (itemView == null || (iconView2 = itemView.getIconView()) == null) {
            return;
        }
        ViewExtKt.visible(iconView2);
    }

    private final void registerUnlockScreenReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(getHomeButtonAndMultiTaskReceiver(), intentFilter, 2);
        } else {
            registerReceiver(getHomeButtonAndMultiTaskReceiver(), intentFilter);
        }
        Logger.d(this.TAG, "homeButtonAndMultiTaskReceiver successfully registered ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMessagePerSecond() {
        getSystemTimeHandler().sendEmptyMessageDelayed(this.MSG_WHAT_UDPATE_SYSTEM_TIME, 1000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void startObserving() {
        MutableLiveData<SportingData> mData = ((SportLockScreenViewModel) getMViewModel()).getMData();
        if (mData != null) {
            mData.observe(this, new SportLockScreenActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: fqn
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SportLockScreenActivity.startObserving$lambda$4(this.f18093a, (SportingData) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit startObserving$lambda$4(SportLockScreenActivity this$0, SportingData sportingData) {
        List<SportingItemData> list;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d(this$0.TAG, "sportingData size=" + ((sportingData == null || (list = sportingData.getList()) == null) ? 0 : list.size()));
        if (sportingData == null || sportingData.getList() == null) {
            return Unit.INSTANCE;
        }
        if (sportingData.getList().size() > 0) {
            List<SportingItemData> listFilterOutSportBeanDataIfNeed = CommonSportModelUtil.INSTANCE.filterOutSportBeanDataIfNeed(new CopyOnWriteArrayList(sportingData.getList()), this$0.getWearMode());
            ((z9n) this$0.getMBinding()).B0(listFilterOutSportBeanDataIfNeed);
            int size = listFilterOutSportBeanDataIfNeed.size();
            for (int i = 0; i < size; i++) {
                if (i >= 0) {
                    ValueIconUnitView[] valueIconUnitViewArr = this$0.itemViewArray;
                    Intrinsics.checkNotNull(valueIconUnitViewArr);
                    if (i < valueIconUnitViewArr.length && listFilterOutSportBeanDataIfNeed.size() > i) {
                        try {
                            ValueIconUnitView[] valueIconUnitViewArr2 = this$0.itemViewArray;
                            this$0.refreshItemViewWithUpdatedData(valueIconUnitViewArr2 != null ? valueIconUnitViewArr2[i] : null, listFilterOutSportBeanDataIfNeed.get(i).getData(), listFilterOutSportBeanDataIfNeed.get(i).getDataDes(), listFilterOutSportBeanDataIfNeed.get(i).getOther());
                            Logger.d(this$0.TAG, "itemView" + i + " value=" + listFilterOutSportBeanDataIfNeed.get(i).getData() + " unit=" + listFilterOutSportBeanDataIfNeed.get(i).getDataDes() + " other=" + listFilterOutSportBeanDataIfNeed.get(i).getOther());
                        } catch (Exception e) {
                            Logger.d(this$0.TAG, "startObserving refreshItemViewWithUpdatedData error message=" + e.getMessage());
                        }
                    }
                }
            }
        }
        ((z9n) this$0.getMBinding()).C0(sportingData.getMap());
        Logger.d(this$0.TAG, "titleData=" + ((z9n) this$0.getMBinding()).A0());
        return Unit.INSTANCE;
    }

    private final void startSystemTimer() {
        sendMessagePerSecond();
    }

    private final void stopSystemTimer() {
        getSystemTimeHandler().removeMessages(this.MSG_WHAT_UDPATE_SYSTEM_TIME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Companion.SystemTimeHandler systemTimeHandler_delegate$lambda$1(SportLockScreenActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new Companion.SystemTimeHandler(this$0);
    }

    private final void unregisterUnlockScreenReceiver() {
        unregisterReceiver(getHomeButtonAndMultiTaskReceiver());
        Logger.d(this.TAG, "homeButtonAndMultiTaskReceiver successfully unregistered ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateSystemTimeUIPerMinute() {
        ((z9n) getMBinding()).G.setText(DateFormat.format(TimeUtils.FORMAT_H_M, System.currentTimeMillis()).toString());
    }

    @NotNull
    public final ValueIconUnitView getItemView0() {
        ValueIconUnitView valueIconUnitView = this.itemView0;
        if (valueIconUnitView != null) {
            return valueIconUnitView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemView0");
        return null;
    }

    @NotNull
    public final ValueIconUnitView getItemView1() {
        ValueIconUnitView valueIconUnitView = this.itemView1;
        if (valueIconUnitView != null) {
            return valueIconUnitView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemView1");
        return null;
    }

    @NotNull
    public final ValueIconUnitView getItemView2() {
        ValueIconUnitView valueIconUnitView = this.itemView2;
        if (valueIconUnitView != null) {
            return valueIconUnitView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemView2");
        return null;
    }

    @NotNull
    public final ValueIconUnitView getItemView3() {
        ValueIconUnitView valueIconUnitView = this.itemView3;
        if (valueIconUnitView != null) {
            return valueIconUnitView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemView3");
        return null;
    }

    @NotNull
    public final ValueIconUnitView getItemView4() {
        ValueIconUnitView valueIconUnitView = this.itemView4;
        if (valueIconUnitView != null) {
            return valueIconUnitView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemView4");
        return null;
    }

    @NotNull
    public final ValueIconUnitView getItemView5() {
        ValueIconUnitView valueIconUnitView = this.itemView5;
        if (valueIconUnitView != null) {
            return valueIconUnitView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemView5");
        return null;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    @NotNull
    public Resources getResources() {
        Resources resources = super.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Configuration configuration = new Configuration();
        configuration.setToDefaults();
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return resources;
    }

    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity
    @Nullable
    public SportCommandView getSportCommandView() {
        return null;
    }

    @NotNull
    public final TextView getSportTimerView() {
        TextView textView = this.sportTimerView;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sportTimerView");
        return null;
    }

    @NotNull
    public final TextView getTargetDataUnit() {
        TextView textView = this.targetDataUnit;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("targetDataUnit");
        return null;
    }

    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity
    public boolean isNeedRemind() {
        return false;
    }

    @Override // com.xiaomi.fitness.sport.view.lockscreen.ui.LockUnderView.OnAlphaChangeListener
    public void onAlphaChange(int alpha) {
        for (TextView textView : getAllSportTitleViews()) {
            textView.setTextColor(getColorWithArgb(alpha));
        }
        for (ValueIconUnitView valueIconUnitView : getAllItemViews()) {
            valueIconUnitView.setTextColor(getColorWithArgb(alpha));
        }
        for (View view : getSportTracerViews()) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(getColorWithArgb(alpha));
            } else {
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.ProgressBar");
                ((ProgressBar) view).getProgressDrawable().setAlpha(alpha);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.lockscreen.view.Hilt_SportLockScreenActivity, com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActionBarDisplayable(false);
        ((z9n) getMBinding()).getRoot().setBackgroundColor(getColor(aki.f1134a));
        hideSystemUI();
        initContentView();
        findViews();
        initGoalTypeAndWearMode();
        startObserving();
    }

    @Override // com.xiaomi.fitness.sport.view.lockscreen.view.Hilt_SportLockScreenActivity, com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        stopSystemTimer();
        LockScreenReceiver.INSTANCE.unregisterPhoneListener();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        unregisterUnlockScreenReceiver();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.view.sporting.BaseSportingActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (getGoalType() == -1) {
            RelativeLayout goalSection = ((z9n) getMBinding()).E.B;
            Intrinsics.checkNotNullExpressionValue(goalSection, "goalSection");
            ViewExtKt.gone(goalSection);
        } else {
            RelativeLayout goalSection2 = ((z9n) getMBinding()).E.B;
            Intrinsics.checkNotNullExpressionValue(goalSection2, "goalSection");
            ViewExtKt.visible(goalSection2);
        }
        Logger.d(this.TAG, "on resume goalType " + getGoalType());
        super.onResume();
        registerUnlockScreenReceiver();
    }

    public final void setItemView0(@NotNull ValueIconUnitView valueIconUnitView) {
        Intrinsics.checkNotNullParameter(valueIconUnitView, "<set-?>");
        this.itemView0 = valueIconUnitView;
    }

    public final void setItemView1(@NotNull ValueIconUnitView valueIconUnitView) {
        Intrinsics.checkNotNullParameter(valueIconUnitView, "<set-?>");
        this.itemView1 = valueIconUnitView;
    }

    public final void setItemView2(@NotNull ValueIconUnitView valueIconUnitView) {
        Intrinsics.checkNotNullParameter(valueIconUnitView, "<set-?>");
        this.itemView2 = valueIconUnitView;
    }

    public final void setItemView3(@NotNull ValueIconUnitView valueIconUnitView) {
        Intrinsics.checkNotNullParameter(valueIconUnitView, "<set-?>");
        this.itemView3 = valueIconUnitView;
    }

    public final void setItemView4(@NotNull ValueIconUnitView valueIconUnitView) {
        Intrinsics.checkNotNullParameter(valueIconUnitView, "<set-?>");
        this.itemView4 = valueIconUnitView;
    }

    public final void setItemView5(@NotNull ValueIconUnitView valueIconUnitView) {
        Intrinsics.checkNotNullParameter(valueIconUnitView, "<set-?>");
        this.itemView5 = valueIconUnitView;
    }

    public final void setSportTimerView(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.sportTimerView = textView;
    }

    public final void setTargetDataUnit(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.targetDataUnit = textView;
    }
}
