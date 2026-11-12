package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.BaseWatchSettingFragment;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingViewModel;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingHelper;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.GpsSetting;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpssetting.enums.LocationCombination;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u00020\u00128\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001d\u001a\u00020\u00188\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR*\u0010#\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020 0\u001f\u0012\u0004\u0012\u00020\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/GpsDiyFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/BaseWatchSettingFragment;", "", "initViewModel", "initView", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/GpsDiyAdapter;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/GpsDiyAdapter;", "adapter", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/GpsDiyViewModel;", "e", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/GpsDiyViewModel;", "gpsDiyViewModel", "", "f", LogUtil.I, "getContainerId", "()I", "containerId", "", "g", "Ljava/lang/String;", "getTitleRes", "()Ljava/lang/String;", "titleRes", "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/GpsDiyVo;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsSetting;", "h", "Lkotlin/jvm/functions/Function1;", "onClick", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class GpsDiyFragment extends BaseWatchSettingFragment {

    @NotNull
    private static final String i = "GpsDiyFragment";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private GpsDiyAdapter adapter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private GpsDiyViewModel gpsDiyViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int containerId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final String titleRes;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Function1<GpsDiyVo<? extends GpsSetting>, Unit> onClick;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpsdiy/GpsDiyVo;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/gpssetting/enums/GpsSetting;", "gpsVo", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<GpsDiyVo<? extends GpsSetting>, Unit> {

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy.GpsDiyFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "index", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0864a extends Lambda implements Function1<Integer, Unit> {
            public final /* synthetic */ GpsDiyFragment a;
            public final /* synthetic */ GpsDiyVo<? extends GpsSetting> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0864a(GpsDiyFragment gpsDiyFragment, GpsDiyVo<? extends GpsSetting> gpsDiyVo) {
                super(1);
                this.a = gpsDiyFragment;
                this.b = gpsDiyVo;
            }

            public final void a(int i) {
                GpsDiyViewModel gpsDiyViewModel = this.a.gpsDiyViewModel;
                Objects.requireNonNull(gpsDiyViewModel);
                gpsDiyViewModel.writeSetting(this.b, i);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                a(num.intValue());
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(int i) {
                super(0);
                this.a = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "onClick: " + this.a;
            }
        }

        public a() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(GpsDiyVo gpsDiyVo, GpsDiyFragment gpsDiyFragment, DialogInterface dialogInterface, int i) {
            HMLog.info(GpsDiyFragment.i, new b(i));
            if (gpsDiyVo.getSelectIndex() == i) {
                return;
            }
            GpsDiyViewModel gpsDiyViewModel = gpsDiyFragment.gpsDiyViewModel;
            Objects.requireNonNull(gpsDiyViewModel);
            gpsDiyViewModel.writeSetting(gpsDiyVo, i);
        }

        public final void b(@NotNull final GpsDiyVo<? extends GpsSetting> gpsDiyVo) {
            if (!(CollectionsKt.firstOrNull((List) gpsDiyVo.getList()) instanceof LocationCombination)) {
                AlertDialogFragment.ChoiceItems items = new AlertDialogFragment.ChoiceItems().setItemChoice(gpsDiyVo.getSelectIndex()).setItems(gpsDiyVo.descArray());
                AlertDialogFragment.Builder neutralButton = new AlertDialogFragment.Builder(GpsDiyFragment.this.requireActivity()).setTitle(gpsDiyVo.getName()).setCancelable(true).setNeutralButton(R.string.cancel, (DialogInterface.OnClickListener) null);
                final GpsDiyFragment gpsDiyFragment = GpsDiyFragment.this;
                neutralButton.setSingleChoiceItems(items, new DialogInterface.OnClickListener() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy.a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        GpsDiyFragment.a.c(gpsDiyVo, gpsDiyFragment, dialogInterface, i);
                    }
                }).show(GpsDiyFragment.this.requireActivity().getSupportFragmentManager(), "onClick");
                return;
            }
            Collection list = gpsDiyVo.getList();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(new LocateCombinationVo(i == gpsDiyVo.getSelectIndex(), (LocationCombination) ((GpsSetting) obj)));
                i = i2;
            }
            LocateCombinationDlgHelper locateCombinationDlgHelper = new LocateCombinationDlgHelper();
            AppCompatActivity appCompatActivity = (AppCompatActivity) GpsDiyFragment.this.requireActivity();
            ArrayList<LocateCombinationVo> arrayList2 = new ArrayList<>();
            arrayList2.addAll(arrayList);
            Unit unit = Unit.INSTANCE;
            locateCombinationDlgHelper.showDlg(appCompatActivity, arrayList2, new C0864a(GpsDiyFragment.this, gpsDiyVo));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GpsDiyVo<? extends GpsSetting> gpsDiyVo) {
            b(gpsDiyVo);
            return Unit.INSTANCE;
        }
    }

    public GpsDiyFragment() {
        super(R.layout.fragment_gps_diy);
        this.containerId = R.id.container;
        this.titleRes = IntroduceShuffleFactoryKt.getString(R.string.ds_gps_mode_diy);
        this.onClick = new a();
    }

    private final void initView() {
        View view = getView();
        ((RecyclerView) (view == null ? null : view.findViewById(R.id.gps_diy_rv))).setLayoutManager(new LinearLayoutManager(requireActivity()));
        View view2 = getView();
        View viewFindViewById = view2 != null ? view2.findViewById(R.id.gps_diy_rv) : null;
        GpsDiyAdapter gpsDiyAdapter = new GpsDiyAdapter(new ArrayList(), this.onClick);
        this.adapter = gpsDiyAdapter;
        Unit unit = Unit.INSTANCE;
        ((RecyclerView) viewFindViewById).setAdapter(gpsDiyAdapter);
    }

    private final void initViewModel() {
        GpsDiyViewModel gpsDiyViewModel = (GpsDiyViewModel) new ViewModelProvider(requireActivity()).get(GpsDiyViewModel.class);
        this.gpsDiyViewModel = gpsDiyViewModel;
        Objects.requireNonNull(gpsDiyViewModel);
        gpsDiyViewModel.getLoadingLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy.GpsDiyFragment$initViewModel$$inlined$observe$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                LoadingHelper.responseToLoadingStatus$default(this.a.getLoadingHelper(), this.a.getActivity(), (LoadingVo) t, null, null, 12, null);
            }
        });
        GpsDiyViewModel gpsDiyViewModel2 = this.gpsDiyViewModel;
        Objects.requireNonNull(gpsDiyViewModel2);
        gpsDiyViewModel2.getGpsDiySettingLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.gpsdiy.GpsDiyFragment$initViewModel$$inlined$observe$2
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(T t) {
                GpsDiyAdapter gpsDiyAdapter = this.a.adapter;
                Objects.requireNonNull(gpsDiyAdapter);
                gpsDiyAdapter.setList((List) t);
                GpsDiyAdapter gpsDiyAdapter2 = this.a.adapter;
                Objects.requireNonNull(gpsDiyAdapter2);
                gpsDiyAdapter2.notifyDataSetChanged();
            }
        });
        HashMap<SettingsGroupType, Settings> watchSettings = ((WatchSettingViewModel) new ViewModelProvider(requireActivity()).get(WatchSettingViewModel.class)).getWatchSettings();
        GpsDiyViewModel gpsDiyViewModel3 = this.gpsDiyViewModel;
        Objects.requireNonNull(gpsDiyViewModel3);
        gpsDiyViewModel3.load(watchSettings);
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
