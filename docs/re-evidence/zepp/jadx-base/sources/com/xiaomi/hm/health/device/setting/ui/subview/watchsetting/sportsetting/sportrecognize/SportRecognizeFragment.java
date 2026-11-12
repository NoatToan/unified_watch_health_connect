package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.fragment.FragmentKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.ListTile;
import com.loc.z;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingHelper;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0017\u001a\u00020\u00078\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001c\u001a\u00020\u00188\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/sportrecognize/SportRecognizeFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/BaseWatchSettingFragment;", "", "initViewModel", "initView", "h", z.j, "", "which", "f", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/sportrecognize/SportRecognizeViewModel;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/sportrecognize/SportRecognizeViewModel;", "sportRecognizeViewModel", "e", LogUtil.I, "getContainerId", "()I", "containerId", "", "Ljava/lang/String;", "getTitleRes", "()Ljava/lang/String;", "titleRes", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SportRecognizeFragment extends BaseWatchSettingFragment {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private SportRecognizeViewModel sportRecognizeViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int containerId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final String titleRes;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportRecognizeSensitivity.values().length];
            iArr[SportRecognizeSensitivity.HIGH.ordinal()] = 1;
            iArr[SportRecognizeSensitivity.STANDARD.ordinal()] = 2;
            iArr[SportRecognizeSensitivity.LOW.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

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
            FragmentKt.findNavController(SportRecognizeFragment.this).navigateUp();
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
            SportRecognizeFragment.this.j();
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
            FragmentKt.findNavController(SportRecognizeFragment.this).navigate(R.id.action_to_sportTypeFragment);
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
            SportRecognizeFragment.this.h();
        }
    }

    public SportRecognizeFragment() {
        super(R.layout.fragment_sport_recognize);
        this.containerId = R.id.container;
        this.titleRes = IntroduceShuffleFactoryKt.getString(R.string.ds_sport_recognize);
    }

    private final int f(int which) {
        return which;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SportRecognizeFragment sportRecognizeFragment, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            SportRecognizeViewModel sportRecognizeViewModel = sportRecognizeFragment.sportRecognizeViewModel;
            Objects.requireNonNull(sportRecognizeViewModel);
            sportRecognizeViewModel.setAlert(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        String string;
        SportRecognizeViewModel sportRecognizeViewModel = this.sportRecognizeViewModel;
        Objects.requireNonNull(sportRecognizeViewModel);
        EnumData value = sportRecognizeViewModel.getSportRecognizeSensitivityLiveData().getValue();
        if (value == null) {
            return;
        }
        ArrayList<Integer> enums = value.getEnums();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(enums, 10));
        Iterator<T> it2 = enums.iterator();
        while (it2.hasNext()) {
            SportRecognizeSensitivity sportRecognizeSensitivityFromValue = SportRecognizeSensitivity.INSTANCE.fromValue(((Number) it2.next()).intValue());
            int i = sportRecognizeSensitivityFromValue == null ? -1 : WhenMappings.$EnumSwitchMapping$0[sportRecognizeSensitivityFromValue.ordinal()];
            if (i == 1) {
                string = getString(R.string.ds_sport_recognize_sensitivity_high);
            } else if (i != 2) {
                string = i != 3 ? "" : getString(R.string.ds_sport_recognize_sensitivity_low);
            } else {
                string = getString(R.string.ds_sport_recognize_sensitivity_standard);
            }
            arrayList.add(string);
        }
        AlertDialogFragment.ChoiceItems itemChoice = new AlertDialogFragment.ChoiceItems().setItemChoice(value.getValue());
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        new AlertDialogFragment.Builder(requireActivity()).setTitle(R.string.ds_sport_recognize_sensitivity).setCancelable(true).setNeutralButton(R.string.cancel, (DialogInterface.OnClickListener) null).setSingleChoiceItems(itemChoice.setItems((String[]) array), new DialogInterface.OnClickListener() { // from class: qb7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SportRecognizeFragment.i(this.a, dialogInterface, i2);
            }
        }).show(requireActivity().getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SportRecognizeFragment sportRecognizeFragment, DialogInterface dialogInterface, int i) {
        SportRecognizeViewModel sportRecognizeViewModel = sportRecognizeFragment.sportRecognizeViewModel;
        Objects.requireNonNull(sportRecognizeViewModel);
        sportRecognizeViewModel.setSensitivity(sportRecognizeFragment.f(i));
    }

    private final void initView() {
        View view = getView();
        ExtKt.smartClick$default(view == null ? null : view.findViewById(R.id.btn_back), 0L, new a(), 1, null);
        View view2 = getView();
        ExtKt.smartClick$default(view2 == null ? null : view2.findViewById(R.id.question_img), 0L, new b(), 1, null);
        View view3 = getView();
        ExtKt.smartClick$default(view3 == null ? null : view3.findViewById(R.id.type_container), 0L, new c(), 1, null);
        View view4 = getView();
        ExtKt.smartClick$default(view4 == null ? null : view4.findViewById(R.id.sensitive_lt), 0L, new d(), 1, null);
        View view5 = getView();
        ((ListTile) (view5 != null ? view5.findViewById(R.id.alert_lt) : null)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: rb7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SportRecognizeFragment.g(this.a, compoundButton, z);
            }
        });
    }

    private final void initViewModel() {
        ViewModelProvider viewModelProvider = new ViewModelProvider(requireActivity());
        SportRecognizeViewModel sportRecognizeViewModel = (SportRecognizeViewModel) viewModelProvider.get(SportRecognizeViewModel.class);
        this.sportRecognizeViewModel = sportRecognizeViewModel;
        Objects.requireNonNull(sportRecognizeViewModel);
        sportRecognizeViewModel.getSportTypeVisibleLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeFragment$initViewModel$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Boolean bool = (Boolean) t;
                View view = this.a.getView();
                ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.type_container), bool.booleanValue(), false, 2, null);
            }
        });
        SportRecognizeViewModel sportRecognizeViewModel2 = this.sportRecognizeViewModel;
        Objects.requireNonNull(sportRecognizeViewModel2);
        sportRecognizeViewModel2.getAlertVisibleLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeFragment$initViewModel$$inlined$observe$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Boolean bool = (Boolean) t;
                View view = this.a.getView();
                ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.alert_lt), bool.booleanValue(), false, 2, null);
            }
        });
        SportRecognizeViewModel sportRecognizeViewModel3 = this.sportRecognizeViewModel;
        Objects.requireNonNull(sportRecognizeViewModel3);
        sportRecognizeViewModel3.getAlertLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeFragment$initViewModel$$inlined$observe$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Boolean bool = (Boolean) t;
                View view = this.a.getView();
                ((ListTile) (view == null ? null : view.findViewById(R.id.alert_lt))).setChecked(bool.booleanValue());
            }
        });
        SportRecognizeViewModel sportRecognizeViewModel4 = this.sportRecognizeViewModel;
        Objects.requireNonNull(sportRecognizeViewModel4);
        sportRecognizeViewModel4.getSportRecognizeSensitivityVisibleLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeFragment$initViewModel$$inlined$observe$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Boolean bool = (Boolean) t;
                View view = this.a.getView();
                ExtKt.setVisible$default(view == null ? null : view.findViewById(R.id.sensitive_lt), bool.booleanValue(), false, 2, null);
            }
        });
        SportRecognizeViewModel sportRecognizeViewModel5 = this.sportRecognizeViewModel;
        Objects.requireNonNull(sportRecognizeViewModel5);
        sportRecognizeViewModel5.getSportRecognizeSensitivityLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeFragment$initViewModel$$inlined$observe$5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                EnumData enumData = (EnumData) t;
                View view = this.a.getView();
                ListTile listTile = (ListTile) (view == null ? null : view.findViewById(R.id.sensitive_lt));
                SportRecognizeSensitivity sportRecognizeSensitivityFromValue = SportRecognizeSensitivity.INSTANCE.fromValue(enumData.getValue());
                String desc = sportRecognizeSensitivityFromValue != null ? sportRecognizeSensitivityFromValue.getDesc() : null;
                if (desc == null) {
                    desc = this.a.getString(R.string.unknown);
                }
                listTile.setTips(desc);
            }
        });
        SportRecognizeViewModel sportRecognizeViewModel6 = this.sportRecognizeViewModel;
        Objects.requireNonNull(sportRecognizeViewModel6);
        sportRecognizeViewModel6.getLoadingLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeFragment$initViewModel$$inlined$observe$6
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                LoadingHelper.responseToLoadingStatus$default(this.a.getLoadingHelper(), this.a.getActivity(), (LoadingVo) t, null, null, 12, null);
            }
        });
        SportRecognizeViewModel sportRecognizeViewModel7 = this.sportRecognizeViewModel;
        Objects.requireNonNull(sportRecognizeViewModel7);
        sportRecognizeViewModel7.getRecognizeAndSensitivityEnableLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportRecognizeFragment$initViewModel$$inlined$observe$7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                Boolean bool = (Boolean) t;
                View view = this.a.getView();
                ((ListTile) (view == null ? null : view.findViewById(R.id.alert_lt))).setEnabled(bool.booleanValue());
                View view2 = this.a.getView();
                ((ListTile) (view2 != null ? view2.findViewById(R.id.sensitive_lt) : null)).setEnabled(bool.booleanValue());
            }
        });
        SportRecognizeViewModel sportRecognizeViewModel8 = this.sportRecognizeViewModel;
        Objects.requireNonNull(sportRecognizeViewModel8);
        sportRecognizeViewModel8.load(((WatchSettingViewModel) viewModelProvider.get(WatchSettingViewModel.class)).getWatchSettings());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        new AlertDialogFragment.Builder(requireActivity()).setCancelable(true).setMessage(R.string.ds_sport_recognize_type_tips).setNeutralButton(R.string.ds_sport_recognize_type_tips_known, (DialogInterface.OnClickListener) null).show(requireActivity().getSupportFragmentManager());
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
