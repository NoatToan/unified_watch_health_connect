package com.xiaomi.fitness.sport.view.widget;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.LocationExtKt;
import com.xiaomi.fitness.common.extensions.PermissionExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.sport.utils.SportPermissionsUtil;
import com.xiaomi.fitness.sport.view.widget.GpsSignalView;
import defpackage.bg4;
import defpackage.c1j;
import defpackage.dvi;
import defpackage.eoi;
import defpackage.i6i;
import defpackage.na4;
import defpackage.o4h;
import defpackage.ua1;
import defpackage.xri;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 L2\u00020\u0001:\u0002LMB\u001b\u0012\b\u0010G\u001a\u0004\u0018\u00010F\u0012\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bJ\u0010KJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J0\u0010\u0017\u001a\u00020\u00022!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\bJ\r\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010\u0004J\u001d\u0010#\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0002¢\u0006\u0004\b%\u0010\u0004J\r\u0010&\u001a\u00020\u0002¢\u0006\u0004\b&\u0010\u0004J\r\u0010'\u001a\u00020\u0002¢\u0006\u0004\b'\u0010\u0004R\u0016\u0010(\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010+R\u0016\u00102\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010+R\u0016\u00103\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010+R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R\u0018\u0010<\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u0018\u0010=\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010:R\u0018\u0010>\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010:R\u0018\u0010?\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00106R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR3\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006N"}, d2 = {"Lcom/xiaomi/fitness/sport/view/widget/GpsSignalView;", "Landroid/widget/LinearLayout;", "", "setListener", "()V", "", "visible", "setNoSignalDescribe", "(Z)V", "setGpsNotEnable", "showWarningBg", "hideWarningBg", "showSignal", "showIndicator", "showSignalIndicator", "showGpsDescribe", "hideGpsDescribe", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/sport/view/widget/GpsSignalView$SignalEnum;", "Lkotlin/ParameterName;", "name", "signal", "permissionChanged", "setPermissionChanged", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/fragment/app/FragmentActivity;", LifecycleConstantKt.TYPE_ACTIVITY, "setFragmentActivity", "(Landroidx/fragment/app/FragmentActivity;)V", "click", "setClick", "setLocationPermission", "", "gpsStatus", "isShowDescribe", "setSignal", "(IZ)V", LifecycleConstantKt.ON_DESTROY, LifecycleConstantKt.ON_STOP, "onTouch", "gpsStrength", "I", "isGpsDescribe", "Z", "Lna4;", "disposable", "Lna4;", "gpsState", "Lcom/xiaomi/fitness/sport/view/widget/GpsSignalView$SignalEnum;", "signalDescribe", "isActivityTouch", "isClickables", "Landroid/widget/TextView;", "gps", "Landroid/widget/TextView;", "gpsTv", "Landroid/view/View;", "signal0", "Landroid/view/View;", "signal1", "signal2", "signal3", "signal4", "gpsDescribe", "Landroid/widget/ImageView;", "arrow", "Landroid/widget/ImageView;", "Lkotlin/jvm/functions/Function1;", "mActivity", "Landroidx/fragment/app/FragmentActivity;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "SignalEnum", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nGpsSignalView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GpsSignalView.kt\ncom/xiaomi/fitness/sport/view/widget/GpsSignalView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,307:1\n1#2:308\n*E\n"})
public final class GpsSignalView extends LinearLayout {

    @NotNull
    public static final String TAG = "GpsSignalView";

    @Nullable
    private ImageView arrow;

    @NotNull
    private na4 disposable;

    @Nullable
    private TextView gps;

    @Nullable
    private TextView gpsDescribe;

    @NotNull
    private SignalEnum gpsState;
    private int gpsStrength;

    @Nullable
    private TextView gpsTv;
    private boolean isActivityTouch;
    private boolean isClickables;
    private boolean isGpsDescribe;

    @Nullable
    private FragmentActivity mActivity;

    @Nullable
    private Function1<? super SignalEnum, Unit> permissionChanged;

    @Nullable
    private View signal0;

    @Nullable
    private View signal1;

    @Nullable
    private View signal2;

    @Nullable
    private View signal3;

    @Nullable
    private View signal4;
    private boolean signalDescribe;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sport/view/widget/GpsSignalView$SignalEnum;", "", "<init>", "(Ljava/lang/String;I)V", "NoGpsEnable", "NoLocationPermission", "NoSignal", "HasSignal", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum SignalEnum {
        NoGpsEnable,
        NoLocationPermission,
        NoSignal,
        HasSignal;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<SignalEnum> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SignalEnum.values().length];
            try {
                iArr[SignalEnum.HasSignal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SignalEnum.NoGpsEnable.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SignalEnum.NoLocationPermission.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SignalEnum.NoSignal.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GpsSignalView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isGpsDescribe = true;
        this.disposable = new na4();
        this.gpsState = SignalEnum.NoSignal;
        this.isClickables = true;
        LayoutInflater.from(context).inflate(dvi.s1, (ViewGroup) this, true);
        this.gps = (TextView) findViewById(xri.V1);
        this.gpsTv = (TextView) findViewById(xri.gps_tv);
        this.gpsTv = (TextView) findViewById(xri.gps_tv);
        this.signal0 = findViewById(xri.a6);
        this.signal1 = findViewById(xri.b6);
        this.signal2 = findViewById(xri.c6);
        this.signal3 = findViewById(xri.d6);
        this.signal4 = findViewById(xri.e6);
        this.gpsDescribe = (TextView) findViewById(xri.gps_describe);
        this.arrow = (ImageView) findViewById(xri.o);
        setNoSignalDescribe(false);
        setListener();
    }

    private final void hideGpsDescribe() {
        o4h<Long> o4hVarC = o4h.C(1L, 5L, 0L, 1L, TimeUnit.SECONDS);
        final Function1 function1 = new Function1() { // from class: v2b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(GpsSignalView.hideGpsDescribe$lambda$8(this.f36410a, (Long) obj));
            }
        };
        o4h<Long> o4hVarH = o4hVarC.V(new i6i() { // from class: w2b
            @Override // defpackage.i6i
            public final boolean test(Object obj) {
                return GpsSignalView.hideGpsDescribe$lambda$9(function1, obj);
            }
        }).H(ua1.c());
        final Function1 function2 = new Function1() { // from class: x2b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GpsSignalView.hideGpsDescribe$lambda$10(this.f38604a, (Long) obj);
            }
        };
        this.disposable.a(o4hVarH.N(new bg4() { // from class: y2b
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                GpsSignalView.hideGpsDescribe$lambda$11(function2, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hideGpsDescribe$lambda$10(GpsSignalView this$0, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (l != null && l.longValue() == 5) {
            this$0.setNoSignalDescribe(false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideGpsDescribe$lambda$11(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hideGpsDescribe$lambda$8(GpsSignalView this$0, Long it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return this$0.gpsStrength != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hideGpsDescribe$lambda$9(Function1 tmp0, Object p0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) tmp0.invoke2(p0)).booleanValue();
    }

    private final void hideWarningBg() {
        TextView textView = this.gps;
        if (textView != null) {
            textView.setCompoundDrawables(null, null, null, null);
        }
    }

    private final void setGpsNotEnable() {
        showSignal(false);
        TextView textView = this.gpsTv;
        if (textView != null) {
            textView.setText(getResources().getString(c1j.I1));
        }
        showWarningBg();
    }

    private final void setListener() {
        setOnClickListener(new View.OnClickListener() { // from class: u2b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GpsSignalView.setListener$lambda$3(this.f35309a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(final GpsSignalView this$0, View view) {
        FragmentActivity fragmentActivity;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isClickables) {
            int i = WhenMappings.$EnumSwitchMapping$0[this$0.gpsState.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    this$0.getContext().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    return;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this$0.disposable.d();
                    this$0.setNoSignalDescribe(this$0.signalDescribe);
                    return;
                }
                if (this$0.getContext() instanceof FragmentActivity) {
                    Context context = this$0.getContext();
                    Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    fragmentActivity = (FragmentActivity) context;
                } else {
                    fragmentActivity = this$0.mActivity;
                }
                if (fragmentActivity != null) {
                    SportPermissionsUtil.INSTANCE.getSportPermissions(fragmentActivity, 1, new Function0() { // from class: d3b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GpsSignalView.setListener$lambda$3$lambda$2$lambda$1(this.f15033a);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setListener$lambda$3$lambda$2$lambda$1(GpsSignalView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super SignalEnum, Unit> function1 = this$0.permissionChanged;
        if (function1 != null) {
            function1.invoke2(SignalEnum.HasSignal);
        }
        return Unit.INSTANCE;
    }

    private final void setNoSignalDescribe(boolean visible) {
        if (!this.isActivityTouch) {
            Logger.d(TAG, "setNoSignalDescribe visible=" + visible);
            this.signalDescribe = visible ^ true;
        }
        if (visible) {
            TextView textView = this.gpsDescribe;
            if (textView != null) {
                ViewExtKt.visible(textView);
            }
            ImageView imageView = this.arrow;
            if (imageView != null) {
                ViewExtKt.visible(imageView);
                return;
            }
            return;
        }
        TextView textView2 = this.gpsDescribe;
        if (textView2 != null) {
            ViewExtKt.gone(textView2);
        }
        ImageView imageView2 = this.arrow;
        if (imageView2 != null) {
            ViewExtKt.gone(imageView2);
        }
    }

    private final void showGpsDescribe() {
        FitnessLogUtils.d(TAG, "showGpsDescribe");
        o4h<Long> o4hVarC = o4h.C(1L, 8L, 0L, 1L, TimeUnit.SECONDS);
        final Function1 function1 = new Function1() { // from class: z2b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(GpsSignalView.showGpsDescribe$lambda$4(this.f40806a, (Long) obj));
            }
        };
        o4h<Long> o4hVarH = o4hVarC.V(new i6i() { // from class: a3b
            @Override // defpackage.i6i
            public final boolean test(Object obj) {
                return GpsSignalView.showGpsDescribe$lambda$5(function1, obj);
            }
        }).H(ua1.c());
        final Function1 function2 = new Function1() { // from class: b3b
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return GpsSignalView.showGpsDescribe$lambda$6(this.f3744a, (Long) obj);
            }
        };
        this.disposable.a(o4hVarH.N(new bg4() { // from class: c3b
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                GpsSignalView.showGpsDescribe$lambda$7(function2, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showGpsDescribe$lambda$4(GpsSignalView this$0, Long it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        return this$0.gpsStrength != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showGpsDescribe$lambda$5(Function1 tmp0, Object p0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) tmp0.invoke2(p0)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showGpsDescribe$lambda$6(GpsSignalView this$0, Long l) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (l != null && l.longValue() == 8) {
            this$0.setNoSignalDescribe(true);
            this$0.hideGpsDescribe();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showGpsDescribe$lambda$7(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    private final void showSignal(boolean visible) {
        if (visible) {
            View view = this.signal0;
            if (view != null) {
                ViewExtKt.visible(view);
            }
            View view2 = this.signal1;
            if (view2 != null) {
                ViewExtKt.visible(view2);
            }
            View view3 = this.signal2;
            if (view3 != null) {
                ViewExtKt.visible(view3);
            }
            View view4 = this.signal3;
            if (view4 != null) {
                ViewExtKt.visible(view4);
            }
            View view5 = this.signal4;
            if (view5 != null) {
                ViewExtKt.visible(view5);
                return;
            }
            return;
        }
        View view6 = this.signal0;
        if (view6 != null) {
            ViewExtKt.gone(view6);
        }
        View view7 = this.signal1;
        if (view7 != null) {
            ViewExtKt.gone(view7);
        }
        View view8 = this.signal2;
        if (view8 != null) {
            ViewExtKt.gone(view8);
        }
        View view9 = this.signal3;
        if (view9 != null) {
            ViewExtKt.gone(view9);
        }
        View view10 = this.signal4;
        if (view10 != null) {
            ViewExtKt.gone(view10);
        }
    }

    private final void showSignalIndicator(boolean showIndicator) {
        if (showIndicator) {
            TextView textView = this.gps;
            if (textView != null) {
                ViewExtKt.visible(textView);
                return;
            }
            return;
        }
        TextView textView2 = this.gps;
        if (textView2 != null) {
            ViewExtKt.gone(textView2);
        }
    }

    private final void showWarningBg() {
        Drawable drawable = ViewExtKt.getDrawable(this, eoi.F);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        TextView textView = this.gpsTv;
        if (textView != null) {
            textView.setCompoundDrawablePadding(ExtUtilsKt.getDp(Float.valueOf(5.0f)));
        }
        TextView textView2 = this.gpsTv;
        if (textView2 != null) {
            textView2.setCompoundDrawables(null, null, drawable, null);
        }
    }

    public final void onDestroy() {
        this.disposable.d();
    }

    public final void onStop() {
        setNoSignalDescribe(false);
        this.disposable.d();
    }

    public final void onTouch() {
        this.isActivityTouch = true;
        setNoSignalDescribe(false);
        this.isActivityTouch = false;
    }

    public final void setClick(boolean click) {
        this.isClickables = click;
    }

    public final void setFragmentActivity(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.mActivity = activity;
    }

    public final void setLocationPermission() {
        TextView textView = this.gpsTv;
        if (textView != null) {
            ViewExtKt.gone(textView);
        }
        TextView textView2 = this.gps;
        if (textView2 != null) {
            ViewExtKt.gone(textView2);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!LocationExtKt.supportsOutdoorSportPositionService(context)) {
            TextView textView3 = this.gpsTv;
            if (textView3 != null) {
                ViewExtKt.visible(textView3);
            }
            this.gpsState = SignalEnum.NoGpsEnable;
            setGpsNotEnable();
            return;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (PermissionExtKt.isPermissionGranted(context2, "android.permission.ACCESS_FINE_LOCATION")) {
            hideWarningBg();
            TextView textView4 = this.gps;
            if (textView4 != null) {
                ViewExtKt.visible(textView4);
            }
            showSignal(true);
            this.gpsState = SignalEnum.HasSignal;
            return;
        }
        TextView textView5 = this.gpsTv;
        if (textView5 != null) {
            ViewExtKt.visible(textView5);
        }
        this.gpsState = SignalEnum.NoLocationPermission;
        showSignal(false);
        TextView textView6 = this.gpsTv;
        if (textView6 != null) {
            textView6.setText(getResources().getString(c1j.J1));
        }
        showWarningBg();
    }

    public final void setPermissionChanged(@NotNull Function1<? super SignalEnum, Unit> permissionChanged) {
        Intrinsics.checkNotNullParameter(permissionChanged, "permissionChanged");
        this.permissionChanged = permissionChanged;
    }

    public final void setSignal(int gpsStatus, boolean isShowDescribe) {
        this.gpsStrength = gpsStatus;
        if (isShowDescribe && this.isGpsDescribe) {
            this.isGpsDescribe = false;
            if (gpsStatus == 0) {
                showGpsDescribe();
            } else {
                hideGpsDescribe();
            }
        }
        if (gpsStatus == 0) {
            this.gpsState = SignalEnum.NoSignal;
            View view = this.signal0;
            if (view != null) {
                view.setSelected(false);
            }
            View view2 = this.signal1;
            if (view2 != null) {
                view2.setSelected(false);
            }
            View view3 = this.signal2;
            if (view3 != null) {
                view3.setSelected(false);
            }
            View view4 = this.signal3;
            if (view4 != null) {
                view4.setSelected(false);
            }
            View view5 = this.signal4;
            if (view5 != null) {
                view5.setSelected(false);
                return;
            }
            return;
        }
        if (gpsStatus == 1) {
            this.gpsState = SignalEnum.HasSignal;
            View view6 = this.signal0;
            if (view6 != null) {
                view6.setSelected(true);
            }
            View view7 = this.signal1;
            if (view7 != null) {
                view7.setSelected(false);
            }
            View view8 = this.signal2;
            if (view8 != null) {
                view8.setSelected(false);
            }
            View view9 = this.signal3;
            if (view9 != null) {
                view9.setSelected(false);
            }
            View view10 = this.signal4;
            if (view10 != null) {
                view10.setSelected(false);
                return;
            }
            return;
        }
        if (gpsStatus == 2) {
            this.gpsState = SignalEnum.HasSignal;
            View view11 = this.signal0;
            if (view11 != null) {
                view11.setSelected(true);
            }
            View view12 = this.signal1;
            if (view12 != null) {
                view12.setSelected(true);
            }
            View view13 = this.signal2;
            if (view13 != null) {
                view13.setSelected(true);
            }
            View view14 = this.signal3;
            if (view14 != null) {
                view14.setSelected(false);
            }
            View view15 = this.signal4;
            if (view15 != null) {
                view15.setSelected(false);
                return;
            }
            return;
        }
        if (gpsStatus != 3) {
            return;
        }
        this.gpsState = SignalEnum.HasSignal;
        View view16 = this.signal0;
        if (view16 != null) {
            view16.setSelected(true);
        }
        View view17 = this.signal1;
        if (view17 != null) {
            view17.setSelected(true);
        }
        View view18 = this.signal2;
        if (view18 != null) {
            view18.setSelected(true);
        }
        View view19 = this.signal3;
        if (view19 != null) {
            view19.setSelected(true);
        }
        View view20 = this.signal4;
        if (view20 != null) {
            view20.setSelected(true);
        }
    }
}
