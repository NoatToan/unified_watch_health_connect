package com.xiaomi.hm.health.device.headset.ui.fragment;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcherKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.slre.LfType;
import com.xiaomi.hm.health.device.headset.bean.AutoDisposable;
import com.xiaomi.hm.health.device.headset.bean.AutoDisposableKt;
import com.xiaomi.hm.health.device.headset.ui.CervicalProtectionActivity;
import com.xiaomi.hm.health.device.headset.ui.CervicalRulerView;
import com.xiaomi.hm.health.device.headset.ui.fragment.CervicalProtectionDetailFragment;
import com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel;
import com.xiaomi.hm.health.device.headset.vo.CervicalProtectionVo;
import com.xiaomi.hm.health.device.headset.vo.CervicalRelaxVo;
import de.greenrobot.event.EventBus;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017J\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013J\b\u0010\u0016\u001a\u00020\u0004H\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010(\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006-²\u0006\u000e\u0010,\u001a\u00020\u00028\n@\nX\u008b\u008e\u0002"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/fragment/CervicalProtectionDetailFragment;", "Landroidx/fragment/app/Fragment;", "", "angle", "", "o", GoogleApiAvailabilityLight.b, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onActivityCreated", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/xiaomi/hm/health/bt/profile/slre/HMLFEvent;", "event", "onEvent", "onDestroy", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CervicalProtectionViewModel;", "a", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CervicalProtectionViewModel;", "viewModel", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "b", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "setLoadingDlg", "Lcom/xiaomi/hm/health/device/headset/ui/fragment/CervicalProtectionSheetDialogFragment;", "c", "Lcom/xiaomi/hm/health/device/headset/ui/fragment/CervicalProtectionSheetDialogFragment;", "cervicalProtectionDialog", "Lcom/xiaomi/hm/health/device/headset/bean/AutoDisposable;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "g", "()Lcom/xiaomi/hm/health/device/headset/bean/AutoDisposable;", "autoDisposable", "<init>", "()V", "Companion", "drawableRes", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class CervicalProtectionDetailFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] e;

    @NotNull
    private static final String f = "CervicalProtectionDetailFragment";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private CervicalProtectionViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog setLoadingDlg;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private CervicalProtectionSheetDialogFragment cervicalProtectionDialog;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy autoDisposable = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017Jm\u0010\u0012\u001a\u00020\u0011*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052K\u0010\u0010\u001aG\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0007H\u0007R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/fragment/CervicalProtectionDetailFragment$Companion;", "", "Lcom/huami/lib/rainbow/ListTile;", "", "windowDuration", "Ljava/util/concurrent/TimeUnit;", "unit", "Lkotlin/Function3;", "Landroid/widget/CompoundButton;", "Lkotlin/ParameterName;", "name", "buttonView", "", "isChecked", "isPress", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lio/reactivex/disposables/Disposable;", "setOnCheckedChangeProofClickListener", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(ListTile listTile, final ObservableEmitter observableEmitter) {
            listTile.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: um0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    CervicalProtectionDetailFragment.Companion.e(observableEmitter, compoundButton, z);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(ObservableEmitter observableEmitter, CompoundButton compoundButton, boolean z) {
            if (observableEmitter.isDisposed()) {
                return;
            }
            observableEmitter.onNext(new Triple(compoundButton, Boolean.valueOf(z), Boolean.valueOf(compoundButton.isPressed())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(Function3 function3, Triple triple) {
            function3.invoke(triple.getFirst(), triple.getSecond(), triple.getThird());
        }

        public static /* synthetic */ Disposable setOnCheckedChangeProofClickListener$default(Companion companion, ListTile listTile, long j, TimeUnit timeUnit, Function3 function3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 1000;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                timeUnit = TimeUnit.MILLISECONDS;
            }
            return companion.setOnCheckedChangeProofClickListener(listTile, j2, timeUnit, function3);
        }

        @JvmOverloads
        @NotNull
        public final Disposable setOnCheckedChangeProofClickListener(@NotNull final ListTile listTile, long j, @NotNull TimeUnit timeUnit, @NotNull final Function3<? super CompoundButton, ? super Boolean, ? super Boolean, Unit> function3) {
            return Observable.create(new ObservableOnSubscribe() { // from class: vm0
                @Override // io.reactivex.ObservableOnSubscribe
                public final void subscribe(ObservableEmitter observableEmitter) {
                    CervicalProtectionDetailFragment.Companion.d(listTile, observableEmitter);
                }
            }).throttleLast(j, timeUnit).subscribe(new Consumer() { // from class: wm0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    CervicalProtectionDetailFragment.Companion.f(function3, (Triple) obj);
                }
            });
        }

        @JvmOverloads
        @NotNull
        public final Disposable setOnCheckedChangeProofClickListener(@NotNull ListTile listTile, long j, @NotNull Function3<? super CompoundButton, ? super Boolean, ? super Boolean, Unit> function3) {
            return setOnCheckedChangeProofClickListener$default(this, listTile, j, null, function3, 2, null);
        }

        @JvmOverloads
        @NotNull
        public final Disposable setOnCheckedChangeProofClickListener(@NotNull ListTile listTile, @NotNull Function3<? super CompoundButton, ? super Boolean, ? super Boolean, Unit> function3) {
            return setOnCheckedChangeProofClickListener$default(this, listTile, 0L, null, function3, 3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/bean/AutoDisposable;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<AutoDisposable> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AutoDisposable getA() {
            AutoDisposable autoDisposable = new AutoDisposable();
            autoDisposable.bind(CervicalProtectionDetailFragment.this.getLifecycle());
            return autoDisposable;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<OnBackPressedCallback, Unit> {
        public final /* synthetic */ CervicalProtectionActivity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CervicalProtectionActivity cervicalProtectionActivity) {
            super(1);
            this.a = cervicalProtectionActivity;
        }

        public final void a(@NotNull OnBackPressedCallback onBackPressedCallback) {
            this.a.setResult();
            this.a.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OnBackPressedCallback onBackPressedCallback) {
            a(onBackPressedCallback);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ HMLFEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HMLFEvent hMLFEvent) {
            super(0);
            this.a = hMLFEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onEvent:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n"}, d2 = {"Landroid/widget/CompoundButton;", "buttonView", "", "isChecked", "isPress", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function3<CompoundButton, Boolean, Boolean, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "result", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Boolean, Unit> {
            public final /* synthetic */ CervicalProtectionDetailFragment a;
            public final /* synthetic */ boolean b;
            public final /* synthetic */ CompoundButton c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(CervicalProtectionDetailFragment cervicalProtectionDetailFragment, boolean z, CompoundButton compoundButton) {
                super(1);
                this.a = cervicalProtectionDetailFragment;
                this.b = z;
                this.c = compoundButton;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void b(CervicalProtectionDetailFragment cervicalProtectionDetailFragment) {
                cervicalProtectionDetailFragment.n();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (z) {
                    if (this.b) {
                        CompoundButton compoundButton = this.c;
                        final CervicalProtectionDetailFragment cervicalProtectionDetailFragment = this.a;
                        compoundButton.post(new Runnable() { // from class: com.xiaomi.hm.health.device.headset.ui.fragment.a
                            @Override // java.lang.Runnable
                            public final void run() {
                                CervicalProtectionDetailFragment.d.a.b(cervicalProtectionDetailFragment);
                            }
                        });
                        return;
                    }
                    return;
                }
                LoadingDialog loadingDialog = this.a.setLoadingDlg;
                if (loadingDialog == null) {
                    return;
                }
                if (!(!loadingDialog.isShowing())) {
                    loadingDialog = null;
                }
                if (loadingDialog == null) {
                    return;
                }
                CervicalProtectionDetailFragment cervicalProtectionDetailFragment2 = this.a;
                loadingDialog.show();
                loadingDialog.setFailed(cervicalProtectionDetailFragment2.getString(R.string.save_failed));
            }
        }

        public d() {
            super(3);
        }

        public final void a(@NotNull CompoundButton compoundButton, boolean z, boolean z2) {
            if (z2) {
                CervicalProtectionViewModel cervicalProtectionViewModel = CervicalProtectionDetailFragment.this.viewModel;
                Objects.requireNonNull(cervicalProtectionViewModel);
                cervicalProtectionViewModel.setCervicalRelax(z, new a(CervicalProtectionDetailFragment.this, z, compoundButton));
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(CompoundButton compoundButton, Boolean bool, Boolean bool2) {
            a(compoundButton, bool.booleanValue(), bool2.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "result", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<Boolean, Unit> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                FragmentKt.findNavController(CervicalProtectionDetailFragment.this).navigate(R.id.action_cervicalProtection_detail_to_home);
                return;
            }
            LoadingDialog loadingDialog = CervicalProtectionDetailFragment.this.setLoadingDlg;
            if (loadingDialog == null) {
                return;
            }
            if (!(!loadingDialog.isShowing())) {
                loadingDialog = null;
            }
            if (loadingDialog == null) {
                return;
            }
            CervicalProtectionDetailFragment cervicalProtectionDetailFragment = CervicalProtectionDetailFragment.this;
            loadingDialog.show();
            loadingDialog.setFailed(cervicalProtectionDetailFragment.getString(R.string.save_failed));
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[1] = Reflection.mutableProperty0(new MutablePropertyReference0Impl(Reflection.getOrCreateKotlinClass(CervicalProtectionDetailFragment.class), "drawableRes", "<v#0>"));
        e = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    private final AutoDisposable g() {
        return (AutoDisposable) this.autoDisposable.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(CervicalProtectionActivity cervicalProtectionActivity, View view) {
        cervicalProtectionActivity.setResult();
        cervicalProtectionActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(CervicalProtectionDetailFragment cervicalProtectionDetailFragment, CervicalRelaxVo cervicalRelaxVo) {
        if (cervicalRelaxVo == null) {
            return;
        }
        View view = cervicalProtectionDetailFragment.getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.cervical_protection_relax_switch))).setEnabled(cervicalRelaxVo.isEnable());
        View view2 = cervicalProtectionDetailFragment.getView();
        ListTile listTile = (ListTile) (view2 != null ? view2.findViewById(R.id.cervical_protection_relax_switch) : null);
        Boolean relaxEnable = cervicalRelaxVo.getRelaxEnable();
        listTile.setChecked(relaxEnable == null ? false : relaxEnable.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(CervicalProtectionDetailFragment cervicalProtectionDetailFragment, Integer num) {
        cervicalProtectionDetailFragment.o(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(CervicalProtectionDetailFragment cervicalProtectionDetailFragment, CervicalProtectionVo cervicalProtectionVo) {
        if (cervicalProtectionVo == null) {
            return;
        }
        View view = cervicalProtectionDetailFragment.getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.cervical_protection_switch))).setEnabled(cervicalProtectionVo.isEnable());
        View view2 = cervicalProtectionDetailFragment.getView();
        ListTile listTile = (ListTile) (view2 != null ? view2.findViewById(R.id.cervical_protection_switch) : null);
        Boolean cervicalProtection = cervicalProtectionVo.getCervicalProtection();
        listTile.setChecked(cervicalProtection == null ? false : cervicalProtection.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(CervicalProtectionDetailFragment cervicalProtectionDetailFragment, CompoundButton compoundButton, boolean z) {
        if (!compoundButton.isPressed() || z) {
            return;
        }
        CervicalProtectionViewModel cervicalProtectionViewModel = cervicalProtectionDetailFragment.viewModel;
        Objects.requireNonNull(cervicalProtectionViewModel);
        cervicalProtectionViewModel.setCervicalProtection(z, cervicalProtectionDetailFragment.new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(CervicalProtectionDetailFragment cervicalProtectionDetailFragment, View view) {
        FragmentKt.findNavController(cervicalProtectionDetailFragment).navigate(R.id.action_cervicalProtectionDetailFragment_to_cervicalProtectionCalibrationFragment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        boolean z = false;
        if (this.cervicalProtectionDialog == null) {
            CervicalProtectionViewModel cervicalProtectionViewModel = this.viewModel;
            Objects.requireNonNull(cervicalProtectionViewModel);
            if (cervicalProtectionViewModel.getCom.facebook.appevents.integrity.IntegrityManager.INTEGRITY_TYPE_ADDRESS java.lang.String() != null) {
                CervicalProtectionSheetDialogFragment.Companion companion = CervicalProtectionSheetDialogFragment.INSTANCE;
                CervicalProtectionViewModel cervicalProtectionViewModel2 = this.viewModel;
                Objects.requireNonNull(cervicalProtectionViewModel2);
                CervicalProtectionSheetDialogFragment cervicalProtectionSheetDialogFragmentNewInstance = companion.newInstance(cervicalProtectionViewModel2.getCom.facebook.appevents.integrity.IntegrityManager.INTEGRITY_TYPE_ADDRESS java.lang.String());
                this.cervicalProtectionDialog = cervicalProtectionSheetDialogFragmentNewInstance;
                if (cervicalProtectionSheetDialogFragmentNewInstance != null) {
                    cervicalProtectionSheetDialogFragmentNewInstance.setCancelable(false);
                }
            }
        }
        CervicalProtectionSheetDialogFragment cervicalProtectionSheetDialogFragment = this.cervicalProtectionDialog;
        if (cervicalProtectionSheetDialogFragment == null) {
            return;
        }
        if (!cervicalProtectionSheetDialogFragment.isAdded() && !cervicalProtectionSheetDialogFragment.isVisible() && getChildFragmentManager().findFragmentByTag(CervicalProtectionSheetDialogFragment.TAG) == null) {
            z = true;
        }
        if (!z) {
            cervicalProtectionSheetDialogFragment = null;
        }
        if (cervicalProtectionSheetDialogFragment == null) {
            return;
        }
        cervicalProtectionSheetDialogFragment.showAllowingStateLoss(getChildFragmentManager(), CervicalProtectionSheetDialogFragment.TAG);
    }

    @RequiresApi(21)
    private final void o(int angle) {
        String string;
        String string2;
        String string3;
        ReadWriteProperty readWritePropertyNotNull = Delegates.INSTANCE.notNull();
        if (angle <= 15) {
            string = getString(R.string.headset_cervical_protection_press_des_1);
            q(readWritePropertyNotNull, R.drawable.private_haydn_cervical_protection_less_15);
            string2 = getString(R.string.headset_cervical_protection_head_down_angle_des_1);
        } else {
            if (16 <= angle && angle <= 29) {
                string = getString(R.string.headset_cervical_protection_press_des_2);
                q(readWritePropertyNotNull, R.drawable.private_haydn_cervical_protection_between_16_29);
                string2 = getString(R.string.headset_cervical_protection_head_down_angle_des_2);
            } else {
                if (30 <= angle && angle <= 44) {
                    string = getString(R.string.headset_cervical_protection_press_des_3);
                    q(readWritePropertyNotNull, R.drawable.private_haydn_cervical_protection_between_30_44);
                    string2 = getString(R.string.headset_cervical_protection_head_down_angle_des_3);
                } else {
                    string = getString(R.string.headset_cervical_protection_press_des_4);
                    q(readWritePropertyNotNull, R.drawable.private_haydn_cervical_protection_more_45);
                    string2 = getString(R.string.headset_cervical_protection_head_down_angle_des_4);
                }
            }
        }
        Drawable drawable = ContextCompat.getDrawable(requireContext(), p(readWritePropertyNotNull));
        View view = getView();
        ((ImageView) (view == null ? null : view.findViewById(R.id.cervical_protection_schematic_diagram))).setImageDrawable(drawable);
        if (angle < 0) {
            string3 = "0";
        } else {
            string3 = angle > 60 ? getString(R.string.headset_cervical_protection_angle_more_60) : String.valueOf(angle);
        }
        String string4 = getString(R.string.headset_cervical_protection_angle, string3);
        CharSequence charSequenceSubSequence = StringsKt__StringsKt.subSequence(string4, new IntRange(0, string3.length() - 1));
        CharSequence charSequenceSubSequence2 = StringsKt__StringsKt.subSequence(string4, new IntRange(string3.length(), string3.length()));
        View view2 = getView();
        ((TextView) (view2 == null ? null : view2.findViewById(R.id.cervical_protection_angle_symbol))).setText(charSequenceSubSequence2);
        View view3 = getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.cervical_protection_angle_value))).setText(charSequenceSubSequence);
        String string5 = getString(R.string.headset_cervical_protection_press, string);
        SpannableString spannableString = new SpannableString(string5);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(requireContext(), R.color.cl_ff5850)), string5.length() - string.length(), string5.length(), 17);
        View view4 = getView();
        ((TextView) (view4 == null ? null : view4.findViewById(R.id.cervical_protection_press_des))).setText(spannableString);
        View view5 = getView();
        ((TextView) (view5 == null ? null : view5.findViewById(R.id.cervical_protection_press_detail_des))).setText(string2);
        View view6 = getView();
        ((CervicalRulerView) (view6 != null ? view6.findViewById(R.id.cervical_protection_ruler_view) : null)).setAngle(angle);
    }

    private static final int p(ReadWriteProperty<Object, Integer> readWriteProperty) {
        return readWriteProperty.getValue(null, e[1]).intValue();
    }

    private static final void q(ReadWriteProperty<Object, Integer> readWriteProperty, int i) {
        readWriteProperty.setValue(null, e[1], Integer.valueOf(i));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @RequiresApi(21)
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        final CervicalProtectionActivity cervicalProtectionActivity;
        super.onActivityCreated(savedInstanceState);
        FragmentActivity activity = getActivity();
        if ((activity == null ? true : activity instanceof CervicalProtectionActivity) && (cervicalProtectionActivity = (CervicalProtectionActivity) getActivity()) != null) {
            cervicalProtectionActivity.setRainbowTitle(R.string.settings_item_cervical_protection);
            cervicalProtectionActivity.setBackClick(new View.OnClickListener() { // from class: om0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CervicalProtectionDetailFragment.h(cervicalProtectionActivity, view);
                }
            });
            OnBackPressedDispatcherKt.addCallback$default(cervicalProtectionActivity.getOnBackPressedDispatcher(), this, false, new b(cervicalProtectionActivity), 2, null);
        }
        CervicalProtectionViewModel cervicalProtectionViewModel = (CervicalProtectionViewModel) new ViewModelProvider(requireActivity()).get(CervicalProtectionViewModel.class);
        this.viewModel = cervicalProtectionViewModel;
        Objects.requireNonNull(cervicalProtectionViewModel);
        cervicalProtectionViewModel.getCervicalRelax().observe(getViewLifecycleOwner(), new Observer() { // from class: sm0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CervicalProtectionDetailFragment.i(this.a, (CervicalRelaxVo) obj);
            }
        });
        CervicalProtectionViewModel cervicalProtectionViewModel2 = this.viewModel;
        Objects.requireNonNull(cervicalProtectionViewModel2);
        cervicalProtectionViewModel2.getCervicalAngle().observe(getViewLifecycleOwner(), new Observer() { // from class: tm0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CervicalProtectionDetailFragment.j(this.a, (Integer) obj);
            }
        });
        CervicalProtectionViewModel cervicalProtectionViewModel3 = this.viewModel;
        Objects.requireNonNull(cervicalProtectionViewModel3);
        cervicalProtectionViewModel3.getCervicalProtection().observe(getViewLifecycleOwner(), new Observer() { // from class: rm0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                CervicalProtectionDetailFragment.k(this.a, (CervicalProtectionVo) obj);
            }
        });
        CervicalProtectionViewModel cervicalProtectionViewModel4 = this.viewModel;
        Objects.requireNonNull(cervicalProtectionViewModel4);
        CervicalProtectionViewModel.queryAngle$default(cervicalProtectionViewModel4, null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cervical_protection_detail, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
        CervicalProtectionViewModel cervicalProtectionViewModel = this.viewModel;
        if (cervicalProtectionViewModel != null) {
            Objects.requireNonNull(cervicalProtectionViewModel);
            Boolean bool = Boolean.TRUE;
            CervicalProtectionViewModel.releaseCallback$default(cervicalProtectionViewModel, bool, bool, bool, null, 8, null);
        }
    }

    public final void onEvent(@NotNull HMLFEvent event) {
        if (event.getLfType() == LfType.HEAD_NECK_ANGLE_CHANGE) {
            CervicalProtectionViewModel cervicalProtectionViewModel = this.viewModel;
            Objects.requireNonNull(cervicalProtectionViewModel);
            CervicalProtectionViewModel.handleLfEvent$default(cervicalProtectionViewModel, event, null, 2, null);
            HMLog.debug(f, new c(event));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (this.setLoadingDlg == null) {
            LoadingDialog loadingDialog = new LoadingDialog(requireContext());
            loadingDialog.setCancelable(false);
            Unit unit = Unit.INSTANCE;
            this.setLoadingDlg = loadingDialog;
        }
        Companion companion = INSTANCE;
        View view2 = getView();
        AutoDisposableKt.addTo(Companion.setOnCheckedChangeProofClickListener$default(companion, (ListTile) (view2 == null ? null : view2.findViewById(R.id.cervical_protection_relax_switch)), 500L, null, new d(), 2, null), g());
        View view3 = getView();
        ((ListTile) (view3 == null ? null : view3.findViewById(R.id.cervical_protection_switch))).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qm0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                CervicalProtectionDetailFragment.l(this.a, compoundButton, z);
            }
        });
        View view4 = getView();
        ((ListTile) (view4 != null ? view4.findViewById(R.id.cervical_protection_seated_calibration) : null)).setOnClickListener(new View.OnClickListener() { // from class: pm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                CervicalProtectionDetailFragment.m(this.a, view5);
            }
        });
    }
}
