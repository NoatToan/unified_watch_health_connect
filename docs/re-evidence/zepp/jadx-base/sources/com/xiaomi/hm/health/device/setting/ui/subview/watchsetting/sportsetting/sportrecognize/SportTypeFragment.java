package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumArray;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingHelper;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportTypeFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b0\u00101J&\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J&\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0002J\b\u0010\u000f\u001a\u00020\u0007H\u0002J\u001a\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R\u001c\u0010\u0019\u001a\u00020\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u00020\u001a8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R.\u0010/\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010.¨\u00063"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/sportrecognize/SportTypeFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/BaseWatchSettingFragment;", "", "type", "", "enable", "Lkotlin/Function0;", "", "failAction", z.j, GoogleApiAvailabilityLight.b, "Landroidx/appcompat/widget/SwitchCompat;", WebConstant.QueryParam.SWITCH, "r", "initViewModel", "initView", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", GoogleApiAvailabilityLight.a, LogUtil.I, "getContainerId", "()I", "containerId", "", "e", "Ljava/lang/String;", "getTitleRes", "()Ljava/lang/String;", "titleRes", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/sportrecognize/SportTypeAdapter;", "f", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/sportrecognize/SportTypeAdapter;", "adapter", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/sportrecognize/SportRecognizeViewModel;", "g", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/sportrecognize/SportRecognizeViewModel;", "sportRecognizeViewModel", "h", "Z", "laneLengthDlgShowing", "i", "wearingWristDlgShowing", "Lkotlin/Function3;", "Lkotlin/jvm/functions/Function3;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SportTypeFragment extends BaseWatchSettingFragment {

    @NotNull
    private static final String k = "SportTypeFragment";

    @NotNull
    private static final HashMap<Integer, Integer> l;

    @NotNull
    private static final HashMap<Integer, Integer> m;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int containerId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String titleRes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private SportTypeAdapter adapter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private SportRecognizeViewModel sportRecognizeViewModel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean laneLengthDlgShowing;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean wearingWristDlgShowing;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Function3<SwitchCompat, Integer, Boolean, Unit> listener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            FragmentKt.findNavController(SportTypeFragment.this).navigateUp();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Landroidx/appcompat/widget/SwitchCompat;", WebConstant.QueryParam.SWITCH, "", "type", "", "enable", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function3<SwitchCompat, Integer, Boolean, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, boolean z) {
                super(0);
                this.a = i;
                this.b = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "type: " + this.a + ", enable: " + this.b;
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportTypeFragment$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0869b extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportTypeFragment a;
            public final /* synthetic */ SwitchCompat b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0869b(SportTypeFragment sportTypeFragment, SwitchCompat switchCompat) {
                super(0);
                this.a = sportTypeFragment;
                this.b = switchCompat;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.r(this.b);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<Unit> {
            public final /* synthetic */ SportTypeFragment a;
            public final /* synthetic */ SwitchCompat b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SportTypeFragment sportTypeFragment, SwitchCompat switchCompat) {
                super(0);
                this.a = sportTypeFragment;
                this.b = switchCompat;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.r(this.b);
            }
        }

        public b() {
            super(3);
        }

        public final void a(@NotNull SwitchCompat switchCompat, int i, boolean z) {
            HMLog.info(SportTypeFragment.k, new a(i, z));
            if (z && i == 23) {
                SportRecognizeViewModel sportRecognizeViewModel = SportTypeFragment.this.sportRecognizeViewModel;
                Objects.requireNonNull(sportRecognizeViewModel);
                if (!sportRecognizeViewModel.getHasSetRowingMachineWearingWrist()) {
                    SportTypeFragment sportTypeFragment = SportTypeFragment.this;
                    sportTypeFragment.n(i, z, new C0869b(sportTypeFragment, switchCompat));
                    return;
                }
            }
            if (z && i == 6) {
                SportRecognizeViewModel sportRecognizeViewModel2 = SportTypeFragment.this.sportRecognizeViewModel;
                Objects.requireNonNull(sportRecognizeViewModel2);
                if (!sportRecognizeViewModel2.getHasSetPoolSwimmingLaneLength()) {
                    SportTypeFragment sportTypeFragment2 = SportTypeFragment.this;
                    sportTypeFragment2.j(i, z, new c(sportTypeFragment2, switchCompat));
                    return;
                }
            }
            SportRecognizeViewModel sportRecognizeViewModel3 = SportTypeFragment.this.sportRecognizeViewModel;
            Objects.requireNonNull(sportRecognizeViewModel3);
            sportRecognizeViewModel3.setSportType(i, z);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SwitchCompat switchCompat, Integer num, Boolean bool) {
            a(switchCompat, num.intValue(), bool.booleanValue());
            return Unit.INSTANCE;
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "lane dialog showing!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "lane length: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return com.twitter.sdk.android.tweetcomposer.g.g;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "dismiss";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "wrist dialog showing!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "wear hand: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return com.twitter.sdk.android.tweetcomposer.g.g;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "dismiss";
        }
    }

    static {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        map.put(1, 3);
        map.put(2, 2);
        map.put(3, 4);
        l = map;
        HashMap<Integer, Integer> map2 = new HashMap<>();
        map2.put(0, 1);
        map2.put(1, 2);
        m = map2;
    }

    public SportTypeFragment() {
        super(R.layout.fragment_sport_type);
        this.containerId = R.id.container;
        this.titleRes = IntroduceShuffleFactoryKt.getString(R.string.ds_sport_recognize_type);
        this.listener = new b();
    }

    private final void initView() {
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.btn_back), 0L, new a(), 1, null);
        View view2 = getView();
        ((RecyclerView) (view2 == null ? null : view2.findViewById(R.id.sport_type_rv))).setLayoutManager(new LinearLayoutManager(requireContext()));
        View view3 = getView();
        View viewFindViewById = view3 != null ? view3.findViewById(R.id.sport_type_rv) : null;
        SportTypeAdapter sportTypeAdapter = new SportTypeAdapter(new EnumArray(new ArrayList(), new ArrayList(), false, 4, null), this.listener);
        this.adapter = sportTypeAdapter;
        Unit unit = Unit.INSTANCE;
        ((RecyclerView) viewFindViewById).setAdapter(sportTypeAdapter);
    }

    private final void initViewModel() {
        SportRecognizeViewModel sportRecognizeViewModel = (SportRecognizeViewModel) new ViewModelProvider(requireActivity()).get(SportRecognizeViewModel.class);
        this.sportRecognizeViewModel = sportRecognizeViewModel;
        Objects.requireNonNull(sportRecognizeViewModel);
        sportRecognizeViewModel.getLoadingLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportTypeFragment$initViewModel$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                LoadingHelper.responseToLoadingStatus$default(this.a.getLoadingHelper(), this.a.getActivity(), (LoadingVo) t, null, null, 12, null);
            }
        });
        SportRecognizeViewModel sportRecognizeViewModel2 = this.sportRecognizeViewModel;
        Objects.requireNonNull(sportRecognizeViewModel2);
        sportRecognizeViewModel2.getSportTypeLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportTypeFragment$initViewModel$$inlined$observe$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                SportTypeAdapter sportTypeAdapter = this.a.adapter;
                Objects.requireNonNull(sportTypeAdapter);
                sportTypeAdapter.setEnumArray((EnumArray) t);
                SportTypeAdapter sportTypeAdapter2 = this.a.adapter;
                Objects.requireNonNull(sportTypeAdapter2);
                sportTypeAdapter2.notifyDataSetChanged();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(final int type, final boolean enable, final Function0<Unit> failAction) {
        if (this.laneLengthDlgShowing) {
            HMLog.error$default(k, null, null, c.a, 6, null);
            return;
        }
        this.laneLengthDlgShowing = true;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        new AlertDialogFragment.Builder(requireActivity()).setTitle(R.string.settings_lane_length).setCancelable(true).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItems(new String[]{getString(R.string.settings_lane_length_25_m), getString(R.string.settings_lane_length_25_yard), getString(R.string.settings_lane_length_50_m), getString(R.string.settings_lane_length_50_yard)}), new DialogInterface.OnClickListener() { // from class: yd7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SportTypeFragment.k(booleanRef, this, type, enable, dialogInterface, i2);
            }
        }).setNeutralButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: xd7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SportTypeFragment.l(failAction, dialogInterface, i2);
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ae7
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SportTypeFragment.m(this.a, booleanRef, failAction, dialogInterface);
            }
        }).show(requireActivity().getSupportFragmentManager(), "SelectPoolSwimmingLaneLengthDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(Ref.BooleanRef booleanRef, SportTypeFragment sportTypeFragment, int i2, boolean z, DialogInterface dialogInterface, int i3) {
        booleanRef.element = true;
        HMLog.info(k, new d(i3));
        Integer num = l.get(Integer.valueOf(i3));
        if (num == null) {
            return;
        }
        SportRecognizeViewModel sportRecognizeViewModel = sportTypeFragment.sportRecognizeViewModel;
        Objects.requireNonNull(sportRecognizeViewModel);
        sportRecognizeViewModel.setPoolSwimmingLaneLength(i2, z, num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(Function0 function0, DialogInterface dialogInterface, int i2) {
        HMLog.info(k, e.a);
        function0.getA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(SportTypeFragment sportTypeFragment, Ref.BooleanRef booleanRef, Function0 function0, DialogInterface dialogInterface) {
        HMLog.info(k, f.a);
        sportTypeFragment.laneLengthDlgShowing = false;
        if (booleanRef.element) {
            return;
        }
        function0.getA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(final int type, final boolean enable, final Function0<Unit> failAction) {
        if (this.wearingWristDlgShowing) {
            HMLog.error$default(k, null, null, g.a, 6, null);
            return;
        }
        this.wearingWristDlgShowing = true;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        new AlertDialogFragment.Builder(requireActivity()).setTitle(R.string.settings_wearing_hand).setCancelable(true).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItems(new String[]{getString(R.string.left_hand), getString(R.string.right_hand)}), new DialogInterface.OnClickListener() { // from class: zd7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SportTypeFragment.o(booleanRef, this, type, enable, dialogInterface, i2);
            }
        }).setNeutralButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: wd7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SportTypeFragment.p(failAction, dialogInterface, i2);
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: be7
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                SportTypeFragment.q(this.a, booleanRef, failAction, dialogInterface);
            }
        }).show(requireActivity().getSupportFragmentManager(), "SelectWearingWristDialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(Ref.BooleanRef booleanRef, SportTypeFragment sportTypeFragment, int i2, boolean z, DialogInterface dialogInterface, int i3) {
        booleanRef.element = true;
        HMLog.info(k, new h(i3));
        Integer num = m.get(Integer.valueOf(i3));
        if (num == null) {
            throw new IllegalArgumentException("unknown wrist!");
        }
        int iIntValue = num.intValue();
        SportRecognizeViewModel sportRecognizeViewModel = sportTypeFragment.sportRecognizeViewModel;
        Objects.requireNonNull(sportRecognizeViewModel);
        sportRecognizeViewModel.setRowingMachineWearingWrist(i2, z, iIntValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Function0 function0, DialogInterface dialogInterface, int i2) {
        HMLog.info(k, i.a);
        function0.getA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(SportTypeFragment sportTypeFragment, Ref.BooleanRef booleanRef, Function0 function0, DialogInterface dialogInterface) {
        HMLog.info(k, j.a);
        sportTypeFragment.wearingWristDlgShowing = false;
        if (booleanRef.element) {
            return;
        }
        function0.getA();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(SwitchCompat switchCompat) {
        if (switchCompat.isChecked()) {
            switchCompat.toggle();
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment
    public int getContainerId() {
        return this.containerId;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment
    @NotNull
    public String getTitleRes() {
        return this.titleRes;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        initViewModel();
    }
}
