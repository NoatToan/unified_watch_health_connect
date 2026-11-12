package com.huami.sky.ui.sleepreminder;

import android.annotation.SuppressLint;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.lib.entity.SleepReminderInfo;
import com.huami.sky.service.SkyPlayFromEvent;
import com.huami.sky.ui.R;
import com.huami.sky.ui.analytic.SkyPlayEventKt;
import com.huami.sky.ui.analytic.SkyReminderEventKt;
import com.huami.sky.ui.databinding.ActivitySkySleepReminderBinding;
import com.huami.sky.ui.databinding.SkyLayoutReminderTimeBinding;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.sky.ui.intro.SkyInitActivityManager;
import com.huami.sky.ui.intro.SkyInitActivityObserver;
import com.huami.sky.ui.play.SkyPlayActivity;
import com.huami.sky.ui.sleepreminder.SkySleepReminderActivity;
import com.huami.sky.ui.sleepreminder.notification.SkyReminderAlarmManager;
import com.huami.sky.ui.sleepreminder.notification.SkyReminderNotificationManager;
import com.huami.sky.ui.utils.UtilsKt;
import com.huami.sky.ui.view.GridSpaceItemDecoration;
import com.huami.sky.ui.view.SkyAlertFragment;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.WheelViewAdapter;
import com.loc.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b9\u0010:J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0003J\b\u0010\u0011\u001a\u00020\u000bH\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0002H\u0002J\b\u0010\u0019\u001a\u00020\u0002H\u0002J\b\u0010\u001a\u001a\u00020\u0002H\u0002J\u0012\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014R\u001d\u0010#\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010)\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R$\u00108\u001a\u0010\u0012\f\u0012\n 5*\u0004\u0018\u00010404038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006<"}, d2 = {"Lcom/huami/sky/ui/sleepreminder/SkySleepReminderActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", SOAP.XMLNS, "initView", "w", "Lcom/huami/sky/lib/entity/SleepReminderInfo;", "sleepReminderInfo", "G", "v", "F", "", "hasDaySelect", "H", "E", "u", GoogleApiAvailabilityLight.b, "x", "C", "B", LogUtil.D, hl.k, "", "l", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "i", "z", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/sky/ui/databinding/ActivitySkySleepReminderBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", z.j, "()Lcom/huami/sky/ui/databinding/ActivitySkySleepReminderBinding;", "binding", "Lcom/huami/sky/ui/sleepreminder/SkySleepReminderViewModel;", "b", "Lkotlin/Lazy;", "m", "()Lcom/huami/sky/ui/sleepreminder/SkySleepReminderViewModel;", "sleepReminderViewModel", "Lcom/huami/sky/ui/sleepreminder/SkyReminderRepeatAdapter;", "c", "Lcom/huami/sky/ui/sleepreminder/SkyReminderRepeatAdapter;", "repeatAdapter", GoogleApiAvailabilityLight.a, "Z", "firstInit", "e", "Lcom/huami/sky/lib/entity/SleepReminderInfo;", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "f", "Landroidx/activity/result/ActivityResultLauncher;", "reminderActivityLauncher", "<init>", "()V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkySleepReminderActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] g;

    @NotNull
    private static final String h = "SkySleepReminderActivity";
    private static final int i = 7;
    private static final int j = 6;
    private static final int k = 36;
    private static final int l = 40;
    private static final int m = 60;
    private static final float n = 16.0f;
    private static final float o = 14.0f;
    private static final int p = 3;
    private static final int q = 5;

    @NotNull
    private static final String r = "first.init.key";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = ActivityViewBindingsKt.viewBinding(new SkySleepReminderActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivitySkySleepReminderBinding.class)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy sleepReminderViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private SkyReminderRepeatAdapter repeatAdapter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean firstInit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private SleepReminderInfo sleepReminderInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ActivityResultLauncher<Intent> reminderActivityLauncher;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0016\u0010\u0010\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0016\u0010\u0012\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0016\u0010\u0014\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/huami/sky/ui/sleepreminder/SkySleepReminderActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "firstInit", "", "open", "", "AM_PM_VISIBLE_ITEM", LogUtil.I, "", "FIRST_INIT_KEY", "Ljava/lang/String;", "HOUR_MINUTE_VISIBLE_ITEM", "MINUTE_60", "REPEAT_ITEM_WIDTH", "REPEAT_RECYCLER_MARGIN", "REPEAT_SPACING_COUNT", "REPEAT_SPAN_COUNT", "TAG", "", "TEXT_SIZE_14", "F", "TEXT_SIZE_16", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void open$default(Companion companion, Context context, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            companion.open(context, z);
        }

        public final void open(@NotNull Context context, boolean firstInit) {
            Intent intent = new Intent(context, (Class<?>) SkySleepReminderActivity.class);
            intent.putExtra(SkySleepReminderActivity.r, firstInit);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/ui/view/SkyAlertFragment;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<SkyAlertFragment, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull SkyAlertFragment skyAlertFragment) {
            SkySleepReminderActivity.this.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SkyAlertFragment skyAlertFragment) {
            a(skyAlertFragment);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ SleepReminderInfo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SleepReminderInfo sleepReminderInfo) {
            super(0);
            this.a = sleepReminderInfo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "获取到的入睡通知提醒设置信息：" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/ui/view/SkyAlertFragment;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<SkyAlertFragment, Unit> {
        public c() {
            super(1);
        }

        public final void a(@NotNull SkyAlertFragment skyAlertFragment) {
            SkySleepReminderActivity.this.A();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SkyAlertFragment skyAlertFragment) {
            a(skyAlertFragment);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/ui/view/SkyAlertFragment;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<SkyAlertFragment, Unit> {
        public d() {
            super(1);
        }

        public final void a(@NotNull SkyAlertFragment skyAlertFragment) {
            SkySleepReminderActivity.this.A();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SkyAlertFragment skyAlertFragment) {
            a(skyAlertFragment);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/ui/view/SkyAlertFragment;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<SkyAlertFragment, Unit> {
        public e() {
            super(1);
        }

        public final void a(@NotNull SkyAlertFragment skyAlertFragment) {
            SkySleepReminderActivity.this.A();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SkyAlertFragment skyAlertFragment) {
            a(skyAlertFragment);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/ui/view/SkyAlertFragment;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<SkyAlertFragment, Unit> {
        public f() {
            super(1);
        }

        public final void a(@NotNull SkyAlertFragment skyAlertFragment) {
            SkyReminderNotificationManager skyReminderNotificationManager = SkyReminderNotificationManager.INSTANCE;
            SkySleepReminderActivity skySleepReminderActivity = SkySleepReminderActivity.this;
            skyReminderNotificationManager.actionToNotificationSetting(skySleepReminderActivity, skySleepReminderActivity.reminderActivityLauncher);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SkyAlertFragment skyAlertFragment) {
            a(skyAlertFragment);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "是否开启入睡通知提醒权限: " + this.a;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkySleepReminderActivity.class), "binding", "getBinding()Lcom/huami/sky/ui/databinding/ActivitySkySleepReminderBinding;"));
        g = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkySleepReminderActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sky.ui.sleepreminder.SkySleepReminderActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.sleepReminderViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SkySleepReminderViewModel>() { // from class: com.huami.sky.ui.sleepreminder.SkySleepReminderActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sky.ui.sleepreminder.SkySleepReminderViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SkySleepReminderViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SkySleepReminderViewModel.class), function0, objArr);
            }
        });
        this.reminderActivityLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: hz6
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                SkySleepReminderActivity.y(this.a, (ActivityResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A() {
        SleepReminderInfo sleepReminderInfoK = k();
        SkyReminderEventKt.recordReminderEvent("0", sleepReminderInfoK);
        m().saveSleepReminderInfo(sleepReminderInfoK);
        i();
    }

    private final void B() {
        new SkyAlertFragment().showDialog(this, Integer.valueOf(R.string.sky_reminder_notification_title), null, R.string.sky_reminder_permission_understand, R.string.sky_reminder_permission_detail, (32 & 32) != 0 ? SkyAlertFragment.a.a : null, new c());
    }

    private final void C() {
        new SkyAlertFragment().showDialog(this, Integer.valueOf(R.string.sky_reminder_permission_on_title), null, R.string.sky_reminder_permission_understand, R.string.sky_reminder_permission_on_detail, (32 & 32) != 0 ? SkyAlertFragment.a.a : null, new d());
    }

    private final void D() {
        new SkyAlertFragment().showDialog(this, null, Integer.valueOf(R.string.sky_reminder_later), R.string.sky_reminder_go_setting, R.string.sky_reminder_permission_toset_detail, new e(), new f());
    }

    private final void E() {
        boolean zIsNotificationEnable = SkyReminderNotificationManager.INSTANCE.isNotificationEnable(this);
        boolean zHasRequirePermission = SkyReminderAlarmManager.INSTANCE.getInstance().hasRequirePermission(this);
        HMLog.info(h, new g(zIsNotificationEnable));
        if (this.firstInit) {
            if (zIsNotificationEnable) {
                C();
                return;
            } else {
                B();
                return;
            }
        }
        if (zIsNotificationEnable && zHasRequirePermission) {
            j().reminderNotification.getRoot().setVisibility(8);
        } else {
            j().reminderNotification.getRoot().setVisibility(0);
            SkyPlayEventKt.recordEvent(SkyReminderEventKt.AIMUSIC_SLEEP_REMIND_NONOTIFICATION_V);
        }
    }

    private final void F(SleepReminderInfo sleepReminderInfo) {
        int time = sleepReminderInfo.getTime();
        int i2 = time / 60;
        j().reminderSelectTimeLayout.reminderTimeHour.setCurrentItem(UtilsKt.hour12Format(i2) - 1);
        j().reminderSelectTimeLayout.reminderTimeMinute.setCurrentItem(time % 60);
        j().reminderSelectTimeLayout.reminderTimeAmPm.setCurrentItem(!UtilsKt.isAfternoon(i2) ? 1 : 0);
    }

    private final void G(SleepReminderInfo sleepReminderInfo) {
        List<Integer> days = sleepReminderInfo.getDays();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            arrayList.add(new SkyRepeatBean(getResources().getStringArray(R.array.sky_reminder_repeat_day_short)[i2], false));
            if (i3 >= 7) {
                break;
            } else {
                i2 = i3;
            }
        }
        int size = arrayList.size();
        Iterator<Integer> it2 = days.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue() - 1;
            if (iIntValue < size) {
                ((SkyRepeatBean) arrayList.get(iIntValue)).setChecked(true);
            }
        }
        SkyReminderRepeatAdapter skyReminderRepeatAdapter = this.repeatAdapter;
        Objects.requireNonNull(skyReminderRepeatAdapter);
        skyReminderRepeatAdapter.setData(arrayList);
        SkyReminderRepeatAdapter skyReminderRepeatAdapter2 = this.repeatAdapter;
        Objects.requireNonNull(skyReminderRepeatAdapter2);
        H(skyReminderRepeatAdapter2.hasDaySelected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(boolean hasDaySelect) {
        if (hasDaySelect) {
            j().reminderSelectTimeLayout.divider1.setAlpha(1.0f);
            j().reminderSelectTimeLayout.divider2.setAlpha(1.0f);
            j().reminderSelectTime.setTextColor(ContextCompat.getColor(this, R.color.s46));
            AppCompatTextView appCompatTextView = j().reminderSave;
            appCompatTextView.setAlpha(1.0f);
            appCompatTextView.setClickable(true);
        } else {
            j().reminderSelectTimeLayout.divider1.setAlpha(0.3f);
            j().reminderSelectTimeLayout.divider2.setAlpha(0.3f);
            SkyExtKt.setTextColorRes(j().reminderSelectTime, R.color.s46, Double.valueOf(0.3d));
            AppCompatTextView appCompatTextView2 = j().reminderSave;
            appCompatTextView2.setAlpha(0.3f);
            appCompatTextView2.setClickable(false);
        }
        SkyLayoutReminderTimeBinding skyLayoutReminderTimeBinding = j().reminderSelectTimeLayout;
        WheelViewAdapter viewAdapter = skyLayoutReminderTimeBinding.reminderTimeAmPm.getViewAdapter();
        Objects.requireNonNull(viewAdapter, "null cannot be cast to non-null type com.huami.sky.ui.sleepreminder.SkyReminderTimeAdapter");
        ((SkyReminderTimeAdapter) viewAdapter).setClickable(hasDaySelect);
        WheelViewAdapter viewAdapter2 = skyLayoutReminderTimeBinding.reminderTimeHour.getViewAdapter();
        Objects.requireNonNull(viewAdapter2, "null cannot be cast to non-null type com.huami.sky.ui.sleepreminder.SkyReminderTimeAdapter");
        ((SkyReminderTimeAdapter) viewAdapter2).setClickable(hasDaySelect);
        WheelViewAdapter viewAdapter3 = skyLayoutReminderTimeBinding.reminderTimeMinute.getViewAdapter();
        Objects.requireNonNull(viewAdapter3, "null cannot be cast to non-null type com.huami.sky.ui.sleepreminder.SkyReminderTimeAdapter");
        ((SkyReminderTimeAdapter) viewAdapter3).setClickable(hasDaySelect);
    }

    private final void i() {
        SkyPlayActivity.INSTANCE.actionToPlayActivity(this, SkyPlayFromEvent.FROM_INIT_GUIDE.getFrom());
        SkyInitActivityManager.INSTANCE.finishInitActivities();
    }

    private final void initView() {
        AppCompatTextView appCompatTextView = j().reminderSetLater;
        int i2 = R.color.s46;
        Double dValueOf = Double.valueOf(0.6d);
        SkyExtKt.setTextColorRes(appCompatTextView, i2, dValueOf);
        SkyExtKt.setTextColorRes(j().reminderSubTitle, i2, dValueOf);
        v();
        w();
        u();
        if (!this.firstInit) {
            j().reminderSetLater.setVisibility(8);
            j().reminderSave.setText(getResources().getString(R.string.sky_music_preference_save));
            boolean zHasRequirePermission = SkyReminderAlarmManager.INSTANCE.getInstance().hasRequirePermission(this);
            if (!SkyReminderNotificationManager.INSTANCE.isNotificationEnable(this) || !zHasRequirePermission) {
                j().reminderNotification.getRoot().setVisibility(0);
                SkyPlayEventKt.recordEvent(SkyReminderEventKt.AIMUSIC_SLEEP_REMIND_NONOTIFICATION_V);
            }
            ViewGroup.LayoutParams layoutParams = j().reminderSave.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = SkyExtKt.getDp(40);
            j().reminderSave.setLayoutParams(layoutParams2);
        }
        AppCompatTextView appCompatTextView2 = j().reminderSave;
        appCompatTextView2.setBackground(SkyExtKt.skyButtonBackGround(new GradientDrawable(), appCompatTextView2.getContext()));
        SkyExtKt.setTextColorRes(appCompatTextView2, R.color.s5, Double.valueOf(0.9d));
    }

    private final ActivitySkySleepReminderBinding j() {
        return (ActivitySkySleepReminderBinding) this.binding.getValue(this, g[0]);
    }

    private final SleepReminderInfo k() {
        SkyReminderRepeatAdapter skyReminderRepeatAdapter = this.repeatAdapter;
        Objects.requireNonNull(skyReminderRepeatAdapter);
        List<SkyRepeatBean> data = skyReminderRepeatAdapter.getData();
        int size = data.size();
        ArrayList arrayList = new ArrayList();
        if (size > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (data.get(i2).isChecked()) {
                    arrayList.add(Integer.valueOf(i3));
                }
                if (i3 >= size) {
                    break;
                }
                i2 = i3;
            }
        }
        return new SleepReminderInfo(arrayList.size() > 0 ? 1 : 0, arrayList, l());
    }

    private final int l() {
        SkyLayoutReminderTimeBinding skyLayoutReminderTimeBinding = j().reminderSelectTimeLayout;
        return (UtilsKt.hour24Format(skyLayoutReminderTimeBinding.reminderTimeHour.getRealCurrentItem() + 1, skyLayoutReminderTimeBinding.reminderTimeAmPm.getRealCurrentItem() <= 0) * 60) + skyLayoutReminderTimeBinding.reminderTimeMinute.getRealCurrentItem();
    }

    private final SkySleepReminderViewModel m() {
        return (SkySleepReminderViewModel) this.sleepReminderViewModel.getValue();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void n() {
        j().titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: ez6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkySleepReminderActivity.o(this.a, view);
            }
        });
        j().reminderSave.setOnClickListener(new View.OnClickListener() { // from class: gz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkySleepReminderActivity.p(this.a, view);
            }
        });
        j().reminderSetLater.setOnClickListener(new View.OnClickListener() { // from class: dz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkySleepReminderActivity.q(this.a, view);
            }
        });
        j().reminderNotification.reminderNotificationOpen.setOnClickListener(new View.OnClickListener() { // from class: fz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkySleepReminderActivity.r(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(SkySleepReminderActivity skySleepReminderActivity, View view) {
        if (skySleepReminderActivity.firstInit) {
            skySleepReminderActivity.finish();
        } else if (skySleepReminderActivity.x()) {
            new SkyAlertFragment().showDialog(skySleepReminderActivity, null, Integer.valueOf(R.string.sky_question_cancel), R.string.sky_preference_exit, R.string.sky_preference_warning, (32 & 32) != 0 ? SkyAlertFragment.a.a : null, skySleepReminderActivity.new a());
        } else {
            skySleepReminderActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(SkySleepReminderActivity skySleepReminderActivity, View view) {
        if (skySleepReminderActivity.firstInit) {
            if (SkyReminderNotificationManager.INSTANCE.isNotificationEnable(skySleepReminderActivity)) {
                skySleepReminderActivity.A();
                return;
            } else {
                skySleepReminderActivity.D();
                return;
            }
        }
        SleepReminderInfo sleepReminderInfoK = skySleepReminderActivity.k();
        SkyReminderEventKt.recordReminderEvent("1", sleepReminderInfoK);
        skySleepReminderActivity.m().saveSleepReminderInfo(sleepReminderInfoK);
        skySleepReminderActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(SkySleepReminderActivity skySleepReminderActivity, View view) {
        SkyPlayEventKt.recordEvent(SkyReminderEventKt.AIMUSIC_SLEEP_REMIND_LATER_C);
        skySleepReminderActivity.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(SkySleepReminderActivity skySleepReminderActivity, View view) {
        SkyReminderNotificationManager skyReminderNotificationManager = SkyReminderNotificationManager.INSTANCE;
        boolean zIsNotificationEnable = skyReminderNotificationManager.isNotificationEnable(skySleepReminderActivity);
        boolean zHasRequirePermission = SkyReminderAlarmManager.INSTANCE.getInstance().hasRequirePermission(skySleepReminderActivity);
        if (!zIsNotificationEnable) {
            skyReminderNotificationManager.actionToNotificationSetting(skySleepReminderActivity, skySleepReminderActivity.reminderActivityLauncher);
        } else {
            if (zHasRequirePermission) {
                return;
            }
            skySleepReminderActivity.z();
        }
    }

    private final void s() {
        m().getSleepReminderInfoLiveData().observe(this, new Observer() { // from class: iz6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SkySleepReminderActivity.t(this.a, (SleepReminderInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(SkySleepReminderActivity skySleepReminderActivity, SleepReminderInfo sleepReminderInfo) {
        HMLog.info(h, new b(sleepReminderInfo));
        skySleepReminderActivity.sleepReminderInfo = sleepReminderInfo;
        skySleepReminderActivity.G(sleepReminderInfo);
        skySleepReminderActivity.F(sleepReminderInfo);
    }

    private final void u() {
        SkyExtKt.setTextColorRes(j().reminderNotification.reminderNotificationSubTitle, R.color.s46, Double.valueOf(0.6d));
        AppCompatTextView appCompatTextView = j().reminderNotification.reminderNotificationOpen;
        appCompatTextView.setBackground(SkyExtKt.skyButtonBackGround(new GradientDrawable(), appCompatTextView.getContext()));
        SkyExtKt.setTextColorRes(appCompatTextView, R.color.s5, Double.valueOf(0.9d));
    }

    private final void v() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getResources().getString(R.string.sky_reminder_morning));
        arrayList.add(getResources().getString(R.string.sky_reminder_afternoon));
        WheelView wheelView = j().reminderSelectTimeLayout.reminderTimeAmPm;
        SkyReminderTimeAdapter skyReminderTimeAdapter = new SkyReminderTimeAdapter(wheelView.getContext(), arrayList, wheelView);
        skyReminderTimeAdapter.setCenterTextSize(16.0f);
        skyReminderTimeAdapter.setNormalTextSize(14.0f);
        wheelView.setViewAdapter(skyReminderTimeAdapter);
        wheelView.setCenterDrawable(android.R.color.transparent);
        wheelView.setVisibleItems(3);
        WheelView wheelView2 = j().reminderSelectTimeLayout.reminderTimeHour;
        Context context = wheelView2.getContext();
        SkySleepReminderParams skySleepReminderParams = SkySleepReminderParams.INSTANCE;
        wheelView2.setViewAdapter(new SkyReminderTimeAdapter(context, skySleepReminderParams.buildHourParams(), wheelView2));
        wheelView2.setCenterDrawable(android.R.color.transparent);
        wheelView2.setVisibleItems(5);
        WheelView wheelView3 = j().reminderSelectTimeLayout.reminderTimeMinute;
        wheelView3.setViewAdapter(new SkyReminderTimeAdapter(wheelView3.getContext(), skySleepReminderParams.buildMinuteParams(), wheelView3));
        wheelView3.setCenterDrawable(android.R.color.transparent);
        wheelView3.setVisibleItems(5);
    }

    private final void w() {
        SkyReminderRepeatAdapter skyReminderRepeatAdapter = new SkyReminderRepeatAdapter(this);
        this.repeatAdapter = skyReminderRepeatAdapter;
        Objects.requireNonNull(skyReminderRepeatAdapter);
        skyReminderRepeatAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.huami.sky.ui.sleepreminder.SkySleepReminderActivity$initRepeatRecycler$1
            @Override // com.huami.sky.ui.sleepreminder.OnItemClickListener
            public void onItemClick(int position) {
                SkySleepReminderActivity skySleepReminderActivity = this.a;
                SkyReminderRepeatAdapter skyReminderRepeatAdapter2 = skySleepReminderActivity.repeatAdapter;
                Objects.requireNonNull(skyReminderRepeatAdapter2);
                skySleepReminderActivity.H(skyReminderRepeatAdapter2.hasDaySelected());
            }
        });
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 7);
        RecyclerView recyclerView = j().reminderRepeatRecycler;
        SkyReminderRepeatAdapter skyReminderRepeatAdapter2 = this.repeatAdapter;
        Objects.requireNonNull(skyReminderRepeatAdapter2);
        recyclerView.setAdapter(skyReminderRepeatAdapter2);
        j().reminderRepeatRecycler.setLayoutManager(gridLayoutManager);
        j().reminderRepeatRecycler.addItemDecoration(new GridSpaceItemDecoration(7, ((UtilsKt.screenWidth() - SkyExtKt.getDp(40)) - SkyExtKt.getDp(252)) / 6));
    }

    private final boolean x() {
        SleepReminderInfo sleepReminderInfoK = k();
        SleepReminderInfo sleepReminderInfo = this.sleepReminderInfo;
        return (sleepReminderInfo != null && Intrinsics.areEqual(sleepReminderInfoK.getDays(), sleepReminderInfo.getDays()) && sleepReminderInfoK.getTime() == sleepReminderInfo.getTime()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(SkySleepReminderActivity skySleepReminderActivity, ActivityResult activityResult) {
        skySleepReminderActivity.E();
    }

    private final void z() {
        SkyReminderAlarmManager.Companion companion = SkyReminderAlarmManager.INSTANCE;
        boolean zHasRequirePermission = companion.getInstance().hasRequirePermission(this);
        if (Build.VERSION.SDK_INT < 31 || zHasRequirePermission) {
            return;
        }
        companion.getInstance().requireAlarmPermission(this, this.reminderActivityLauncher);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(j().getRoot());
        getLifecycle().addObserver(new SkyInitActivityObserver(this));
        m().completeIntroProcess();
        this.firstInit = getIntent().getBooleanExtra(r, false);
        initView();
        s();
        m().getSleepReminderInfo();
        n();
        SkyReminderEventKt.recordReminderViewEvent(this.firstInit ? "0" : "1");
    }
}
