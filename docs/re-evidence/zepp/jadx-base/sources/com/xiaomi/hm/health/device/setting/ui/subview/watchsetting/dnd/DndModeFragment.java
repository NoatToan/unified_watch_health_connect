package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.dnd;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.assistant.ocr.camera.CameraActivity;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.ListTile;
import com.huami.tools.log.HMLog;
import com.huami.widget.wheelview.HMTimeChooseView;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.ImageSpanUtil;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.dnd.DndModeFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingHelper;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001a\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001c\u001a\u00020\u00178\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\"\u001a\u00020\u001d8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/dnd/DndModeFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/BaseWatchSettingFragment;", "", "initViewModel", "initView", "showDescriptionConfirmDialog", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/general/General;", CameraActivity.CONTENT_TYPE_GENERAL, GoogleApiAvailabilityLight.b, com.google.android.exoplayer2.text.ttml.b.r, "", "isStart", "r", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onDetach", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/dnd/DndModeViewModel;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/dnd/DndModeViewModel;", "dndModeViewModel", "", "e", LogUtil.I, "getContainerId", "()I", "containerId", "", "f", "Ljava/lang/String;", "getTitleRes", "()Ljava/lang/String;", "titleRes", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "g", "Lcom/huami/android/design/dialog/AlertDialogFragment;", "descriptionDialog", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DndModeFragment extends BaseWatchSettingFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String h = "DndModeFragment";
    private static final int i = 0;
    private static final int j = 1;
    private static final int k = 2;
    private static final int l = 3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private DndModeViewModel dndModeViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int containerId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final String titleRes;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private AlertDialogFragment descriptionDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/dnd/DndModeFragment$Companion;", "", "", "value", "", "a", "DND_MODE_ALWAYS", LogUtil.I, "DND_MODE_MANUAL", "DND_MODE_ON_TIME", "DND_MODE_SMART", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String a(int value) {
            if (value == 0) {
                return GlobalConfig.get().isBuildMidong() ? IntroduceShuffleFactoryKt.getString(R.string.ds_dnd_mode_manual) : IntroduceShuffleFactoryKt.getString(R.string.close);
            }
            if (value == 1) {
                return GlobalConfig.get().isBuildMidong() ? IntroduceShuffleFactoryKt.getString(R.string.ds_dnd_mode_on_time) : IntroduceShuffleFactoryKt.getString(R.string.avoid_enable_time);
            }
            if (value != 2) {
                return value != 3 ? IntroduceShuffleFactoryKt.getString(R.string.unknown) : IntroduceShuffleFactoryKt.getString(R.string.ds_dnd_mode_always);
            }
            return IntroduceShuffleFactoryKt.getString(R.string.ds_dnd_mode_smart);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DndModeFragment.this.showDescriptionConfirmDialog();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            DndModeFragment.this.p();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<View, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            DndModeFragment.this.r(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<View, Unit> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            DndModeFragment.this.r(false);
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
            return "showDndModeUI return for dndMode null";
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
            return "showTimeChooseUI startTime null";
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
            return "showTimeChooseUI endTime null";
        }
    }

    public DndModeFragment() {
        super(R.layout.fragment_dnd_mode);
        this.containerId = R.id.container;
        this.titleRes = IntroduceShuffleFactoryKt.getString(R.string.ds_dnd);
    }

    private final void initView() {
        setLoadingHelper(new LoadingHelper(requireContext()));
        if (GlobalConfig.get().isBuildMidong()) {
            View view = getView();
            ((ListTile) (view == null ? null : view.findViewById(R.id.dnd_mode_iv))).setTitle(getString(R.string.ds_dnd_start_auto));
        } else {
            String string = getString(R.string.ds_interest_screen_display_enabled);
            View view2 = getView();
            ((ListTile) (view2 == null ? null : view2.findViewById(R.id.dnd_mode_iv))).setTitle(new ImageSpanUtil(requireContext(), string, R.drawable.device_setting_descriptio_smart_on).getSpan(new a()));
            View view3 = getView();
            TextView textView = (TextView) ((ListTile) (view3 == null ? null : view3.findViewById(R.id.dnd_mode_iv))).findViewById(R.id.rainbow_tile_title);
            if (textView != null) {
                textView.setHighlightColor(0);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        View view4 = getView();
        ExtKt.smartClick$default(view4 == null ? null : view4.findViewById(R.id.dnd_mode_iv), 0L, new b(), 1, null);
        View view5 = getView();
        ExtKt.smartClick$default(view5 == null ? null : view5.findViewById(R.id.dnd_start_time_iv), 0L, new c(), 1, null);
        View view6 = getView();
        ExtKt.smartClick$default(view6 != null ? view6.findViewById(R.id.dnd_stop_time_iv) : null, 0L, new d(), 1, null);
    }

    private final void initViewModel() {
        this.dndModeViewModel = (DndModeViewModel) new ViewModelProvider(requireActivity()).get(DndModeViewModel.class);
        WatchSettingViewModel watchSettingViewModel = (WatchSettingViewModel) new ViewModelProvider(requireActivity()).get(WatchSettingViewModel.class);
        DndModeViewModel dndModeViewModel = this.dndModeViewModel;
        Objects.requireNonNull(dndModeViewModel);
        dndModeViewModel.init(watchSettingViewModel.getWatchSettings());
        DndModeViewModel dndModeViewModel2 = this.dndModeViewModel;
        Objects.requireNonNull(dndModeViewModel2);
        dndModeViewModel2.getDndModeLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: cc1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DndModeFragment.k(this.a, (General) obj);
            }
        });
        DndModeViewModel dndModeViewModel3 = this.dndModeViewModel;
        Objects.requireNonNull(dndModeViewModel3);
        dndModeViewModel3.getLoadingLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: dc1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DndModeFragment.l(this.a, (LoadingVo) obj);
            }
        });
        DndModeViewModel dndModeViewModel4 = this.dndModeViewModel;
        Objects.requireNonNull(dndModeViewModel4);
        dndModeViewModel4.getWriteResultLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: ec1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                DndModeFragment.m(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(DndModeFragment dndModeFragment, General general) {
        dndModeFragment.n(general);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(DndModeFragment dndModeFragment, LoadingVo loadingVo) {
        LoadingHelper.responseToLoadingStatus$default(dndModeFragment.getLoadingHelper(), dndModeFragment.getActivity(), loadingVo, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(DndModeFragment dndModeFragment, Boolean bool) {
        if (bool.booleanValue()) {
            DndModeViewModel dndModeViewModel = dndModeFragment.dndModeViewModel;
            Objects.requireNonNull(dndModeViewModel);
            General value = dndModeViewModel.getDndModeLiveData().getValue();
            if (value == null) {
                return;
            }
            dndModeFragment.n(value);
        }
    }

    private final void n(General general) {
        Time dndStartTime;
        Time dndStopTime;
        EnumData dndMode = general.getDndMode();
        Integer numValueOf = dndMode == null ? null : Integer.valueOf(dndMode.getValue());
        if (numValueOf == null) {
            return;
        }
        int iIntValue = numValueOf.intValue();
        EnumData dndMode2 = general.getDndMode();
        ArrayList<Integer> enums = dndMode2 == null ? null : dndMode2.getEnums();
        if ((enums == null || enums.isEmpty()) || (dndStartTime = general.getDndStartTime()) == null || (dndStopTime = general.getDndStopTime()) == null) {
            return;
        }
        View view = getView();
        ((ListTile) (view == null ? null : view.findViewById(R.id.dnd_mode_iv))).setTips(INSTANCE.a(iIntValue));
        boolean z = iIntValue == 1;
        View view2 = getView();
        ((ListTile) (view2 == null ? null : view2.findViewById(R.id.dnd_start_time_iv))).setEnabled(z);
        View view3 = getView();
        ((ListTile) (view3 == null ? null : view3.findViewById(R.id.dnd_stop_time_iv))).setEnabled(z);
        String[] timeDesc = WatchSettingExtsKt.getTimeDesc(dndStartTime, dndStopTime);
        View view4 = getView();
        ((ListTile) (view4 == null ? null : view4.findViewById(R.id.dnd_start_time_iv))).setTips(timeDesc[0]);
        View view5 = getView();
        ((ListTile) (view5 != null ? view5.findViewById(R.id.dnd_stop_time_iv) : null)).setTips(timeDesc[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        EnumData dndMode;
        EnumData dndMode2;
        DndModeViewModel dndModeViewModel = this.dndModeViewModel;
        Objects.requireNonNull(dndModeViewModel);
        General value = dndModeViewModel.getDndModeLiveData().getValue();
        Integer numValueOf = (value == null || (dndMode = value.getDndMode()) == null) ? null : Integer.valueOf(dndMode.getValue());
        ArrayList<Integer> enums = (value == null || (dndMode2 = value.getDndMode()) == null) ? null : dndMode2.getEnums();
        if (numValueOf != null) {
            if (!(enums == null || enums.isEmpty())) {
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enums, 10));
                Iterator<T> it2 = enums.iterator();
                while (it2.hasNext()) {
                    arrayList.add(INSTANCE.a(((Number) it2.next()).intValue()));
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                new AlertDialogFragment.Builder(requireActivity()).setTitle(GlobalConfig.get().isBuildMidong() ? R.string.ds_dnd_start_auto : R.string.ds_interest_screen_display_enabled).setCancelable(true).setNeutralButton(R.string.cancel, (DialogInterface.OnClickListener) null).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItemChoice(numValueOf.intValue()).setItems((String[]) array), new DialogInterface.OnClickListener() { // from class: zb1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        DndModeFragment.q(this.a, dialogInterface, i2);
                    }
                }).show(requireActivity().getSupportFragmentManager(), "dndModeUI");
                return;
            }
        }
        HMLog.info(h, e.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(DndModeFragment dndModeFragment, DialogInterface dialogInterface, int i2) {
        DndModeViewModel dndModeViewModel = dndModeFragment.dndModeViewModel;
        Objects.requireNonNull(dndModeViewModel);
        dndModeViewModel.pushDndModeToDevice(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(final boolean isStart) {
        String string;
        final int i2;
        final int i3;
        DndModeViewModel dndModeViewModel = this.dndModeViewModel;
        Objects.requireNonNull(dndModeViewModel);
        General value = dndModeViewModel.getDndModeLiveData().getValue();
        Time dndStartTime = value == null ? null : value.getDndStartTime();
        Time dndStopTime = value == null ? null : value.getDndStopTime();
        if (dndStartTime == null) {
            HMLog.info(h, f.a);
            return;
        }
        if (dndStopTime == null) {
            HMLog.info(h, g.a);
            return;
        }
        HMTimeChooseView hMTimeChooseView = new HMTimeChooseView(requireActivity());
        if (isStart) {
            int hour = dndStartTime.getHour();
            int minute = dndStartTime.getMinute();
            string = getResources().getString(R.string.avoid_disturb_on_time);
            i3 = hour;
            i2 = minute;
        } else {
            int hour2 = dndStopTime.getHour();
            int minute2 = dndStopTime.getMinute();
            string = getResources().getString(R.string.avoid_disturb_off_time);
            i2 = minute2;
            i3 = hour2;
        }
        hMTimeChooseView.setInitialTime(i3, i2);
        final Time time = new Time(i3, i2);
        final Time time2 = new Time(i3, i2);
        hMTimeChooseView.setOnTimeChooseListener(new HMTimeChooseView.ITimeChooseListener() { // from class: fc1
            @Override // com.huami.widget.wheelview.HMTimeChooseView.ITimeChooseListener
            public final void onTimeChoose(int i4, int i5) {
                DndModeFragment.s(isStart, time, time2, i4, i5);
            }
        });
        new AlertDialogFragment.Builder(requireActivity()).setTitle(string).setContentView(hMTimeChooseView).setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: ac1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                DndModeFragment.t(isStart, time, i3, i2, time2, this, dialogInterface, i4);
            }
        }).setNegativeButton(getString(R.string.cancel), (DialogInterface.OnClickListener) null).setCancelable(true).show(requireActivity().getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(boolean z, Time time, Time time2, int i2, int i3) {
        if (z) {
            time.setHour(i2);
            time.setMinute(i3);
        } else {
            time2.setHour(i2);
            time2.setMinute(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDescriptionConfirmDialog() {
        AlertDialogFragment alertDialogFragment;
        boolean z = false;
        if (this.descriptionDialog == null) {
            this.descriptionDialog = new AlertDialogFragment.Builder(requireContext()).setCancelable(false).setTitle(R.string.ds_dnd_mode_smart).setMessage(getString(R.string.mili_dnd_description)).setNeutralButton(getString(R.string.got_it), new DialogInterface.OnClickListener() { // from class: bc1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    DndModeFragment.o(dialogInterface, i2);
                }
            }).create();
        }
        AlertDialogFragment alertDialogFragment2 = this.descriptionDialog;
        if (alertDialogFragment2 != null && !alertDialogFragment2.isShowing()) {
            z = true;
        }
        if (!z || (alertDialogFragment = this.descriptionDialog) == null) {
            return;
        }
        alertDialogFragment.show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x001e  */
    public static final void t(boolean z, Time time, int i2, int i3, Time time2, DndModeFragment dndModeFragment, DialogInterface dialogInterface, int i4) {
        boolean z2 = true;
        if (z) {
            int minutes = WatchSettingExtsKt.toMinutes(time);
            if (minutes == -1) {
                return;
            }
            if (minutes == (i2 * 60) + i3) {
                z2 = false;
            }
        } else {
            int minutes2 = WatchSettingExtsKt.toMinutes(time2);
            if (minutes2 == -1) {
                return;
            }
            if (minutes2 == (i2 * 60) + i3) {
                z2 = false;
            }
        }
        if (z2) {
            DndModeViewModel dndModeViewModel = dndModeFragment.dndModeViewModel;
            Objects.requireNonNull(dndModeViewModel);
            if (!z) {
                time = time2;
            }
            dndModeViewModel.pushTimeToDevice(z, time);
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

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        DndModeViewModel dndModeViewModel = this.dndModeViewModel;
        Objects.requireNonNull(dndModeViewModel);
        dndModeViewModel.removeListener();
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViewModel();
        initView();
    }
}
