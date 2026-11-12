package com.xiaomi.fitness.sport_eco.view.launch.gym.setting;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalRopeSettingViewModel;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import defpackage.ayi;
import defpackage.bt7;
import defpackage.dvq;
import defpackage.e1j;
import defpackage.mcn;
import defpackage.two;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u0000 M2\u00020\u0001:\u0002NMB\u001d\b\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\bK\u0010LJ\u001b\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\t2\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R!\u0010,\u001a\b\u0012\u0004\u0012\u00020#0\u00128FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010'R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R$\u00104\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010:\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010@\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R\"\u0010C\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010;\u001a\u0004\bD\u0010=\"\u0004\bE\u0010?R\u0011\u0010H\u001a\u0002018F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010J\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bI\u0010\u001a¨\u0006O"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalRopeSettingViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$SwitchSettingItem;", "", "checked", "setChecked", "(Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$SwitchSettingItem;Z)Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$SwitchSettingItem;", "Landroid/os/Bundle;", "savedInstanceState", "", "attach", "(Landroid/os/Bundle;)V", "Lkotlin/Function2;", "Ltwo;", "callback", "getRopeInfo", "(Lkotlin/jvm/functions/Function2;)V", "isSporting", "", "Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;", "buildSettingItems", "(Z)Ljava/util/List;", "", "localSportType", "Ljava/lang/String;", "getLocalSportType", "()Ljava/lang/String;", "setLocalSportType", "(Ljava/lang/String;)V", "Lmcn;", "sportDB", "Lmcn;", "getSportDB", "()Lmcn;", "Ljava/util/ArrayList;", "", DialWidgetType.COUNT_DOWN, "Ljava/util/ArrayList;", "getCountdown", "()Ljava/util/ArrayList;", "metronomeFrequencyHopping$delegate", "Lkotlin/Lazy;", "getMetronomeFrequencyHopping", "()Ljava/util/List;", "metronomeFrequencyHopping", "countingInterval", "getCountingInterval", "reportingInterval", "getReportingInterval", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "mDeviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "mDeviceInfo", "Ltwo;", "getMDeviceInfo", "()Ltwo;", "setMDeviceInfo", "(Ltwo;)V", "metronomeValue", "I", "getMetronomeValue", "()I", "setMetronomeValue", "(I)V", "countingIntervalValue", "getCountingIntervalValue", "setCountingIntervalValue", "reportingIntervalValue", "getReportingIntervalValue", "setReportingIntervalValue", "getCurDevice", "()Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "curDevice", "getCurModel", "curModel", "<init>", "(Ljava/lang/String;Lmcn;)V", "Companion", "ViewModelFactory", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LocalRopeSettingViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "LocalRopeSettingViewModel";

    @NotNull
    private final ArrayList<Integer> countdown;

    @NotNull
    private final ArrayList<Integer> countingInterval;
    private int countingIntervalValue;

    @Nullable
    private String localSportType;

    @Nullable
    private two mDeviceInfo;
    private EcoDeviceModel mDeviceModel;

    /* JADX INFO: renamed from: metronomeFrequencyHopping$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy metronomeFrequencyHopping;
    private int metronomeValue;

    @NotNull
    private final ArrayList<Integer> reportingInterval;
    private int reportingIntervalValue;

    @NotNull
    private final mcn sportDB;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/launch/gym/setting/LocalRopeSettingViewModel$ViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Ldvq;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Ldvq;", "", "localSportType", "Ljava/lang/String;", "Lmcn;", "sportDB", "Lmcn;", "<init>", "(Ljava/lang/String;Lmcn;)V", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class ViewModelFactory implements ViewModelProvider.Factory {

        @Nullable
        private String localSportType;

        @NotNull
        private final mcn sportDB;

        public ViewModelFactory(@Nullable String str, @NotNull mcn sportDB) {
            Intrinsics.checkNotNullParameter(sportDB, "sportDB");
            this.localSportType = str;
            this.sportDB = sportDB;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NotNull
        public <T extends dvq> T create(@NotNull Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            if (Intrinsics.areEqual(modelClass, LocalRopeSettingViewModel.class)) {
                return new LocalRopeSettingViewModel(this.localSportType, this.sportDB, null);
            }
            throw new RuntimeException("unknown class :" + modelClass.getName());
        }
    }

    private LocalRopeSettingViewModel(String str, mcn mcnVar) {
        this.localSportType = str;
        this.sportDB = mcnVar;
        this.countdown = CollectionsKt__CollectionsKt.arrayListOf(3, 5, 7);
        this.metronomeFrequencyHopping = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ske
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalRopeSettingViewModel.metronomeFrequencyHopping_delegate$lambda$0();
            }
        });
        this.countingInterval = CollectionsKt__CollectionsKt.arrayListOf(0, 50, 100, 150, 200, 250, 300, 350, 400, 450, 500);
        this.reportingInterval = CollectionsKt__CollectionsKt.arrayListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List metronomeFrequencyHopping_delegate$lambda$0() {
        List list = CollectionsKt___CollectionsKt.toList(new IntRange(100, 220));
        ListExtKt.add(list, 0, 0);
        return list;
    }

    private final LocalSportSettingItemAdapter.SwitchSettingItem setChecked(LocalSportSettingItemAdapter.SwitchSettingItem switchSettingItem, boolean z) {
        switchSettingItem.setChecked(z);
        return switchSettingItem;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        EcoDeviceManager ecoDeviceManagerExtKt = EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE);
        String str = this.localSportType;
        if (str == null) {
            str = "";
        }
        EcoDeviceModel localDeviceModel = ecoDeviceManagerExtKt.getLocalDeviceModel(str);
        if (localDeviceModel != null) {
            this.mDeviceModel = localDeviceModel;
        }
    }

    @NotNull
    public final List<LocalSportSettingItemAdapter.SettingItem> buildSettingItems(boolean isSporting) {
        MetronomeSettingItem metronomeSettingItem = new MetronomeSettingItem();
        mcn mcnVar = this.sportDB;
        if (mcnVar.i) {
            this.metronomeValue = mcnVar.j;
            Application application = ApplicationExtKt.getApplication();
            int i = ayi.l;
            int i2 = this.metronomeValue;
            metronomeSettingItem.setRightValue(ResourceExtKt.getQuantityString(application, i, i2, Integer.valueOf(i2)));
        } else {
            metronomeSettingItem.setRightValue(ResourceExtKt.getString(e1j.C0));
        }
        mcn mcnVar2 = this.sportDB;
        int i3 = mcnVar2.q;
        if (i3 <= 0) {
            i3 = 0;
        }
        this.countingIntervalValue = i3;
        int i4 = mcnVar2.f26021r;
        this.reportingIntervalValue = i4 > 0 ? i4 : 0;
        ArrayList arrayList = new ArrayList();
        if (Intrinsics.areEqual(this.localSportType, "yunmai.jmprope.sr804")) {
            arrayList.add(new LocalSportSettingItemAdapter.LabelSettingItem(ResourceExtKt.getString(e1j.Y), null, 2, null));
            arrayList.add(setChecked(new ScreenOnSettingItem(), this.sportDB.f26019b));
            if (!isSporting) {
                arrayList.add(new LocalSportSettingItemAdapter.LabelSettingItem(ResourceExtKt.getString(e1j.M3), null, 2, null));
                arrayList.add(new SportsDataToBeClaimedSettingItem());
                arrayList.add(new HelpSettingItem());
                arrayList.add(new UpgradeSettingItem());
                arrayList.add(new AboutSettingItem());
                arrayList.add(new LocalSportSettingItemAdapter.LabelSettingItem(ResourceExtKt.getString(e1j.r3), null, 2, null));
                arrayList.add(new UserAgreementSettingItem());
                arrayList.add(new DevicePrivacyPolicySettingItem());
                arrayList.add(new PrivacyPolicyWithdrawalOfConsentSettingItem());
            }
        } else {
            arrayList.add(new LocalSportSettingItemAdapter.LabelSettingItem(ResourceExtKt.getString(e1j.Y), null, 2, null));
            arrayList.add(metronomeSettingItem);
            arrayList.add(setChecked(new ScreenOnSettingItem(), this.sportDB.f26019b));
            arrayList.add(setChecked(new VoiceAnnouncementsSettingItem(), this.sportDB.m));
            if (!isSporting) {
                arrayList.add(new LocalSportSettingItemAdapter.LabelSettingItem(ResourceExtKt.getString(e1j.M3), null, 2, null));
                arrayList.add(new SportsDataToBeClaimedSettingItem());
                arrayList.add(new HelpSettingItem());
                arrayList.add(new UpgradeSettingItem());
                arrayList.add(new AboutSettingItem());
                arrayList.add(new LocalSportSettingItemAdapter.LabelSettingItem(ResourceExtKt.getString(e1j.r3), null, 2, null));
                arrayList.add(new UserAgreementSettingItem());
                arrayList.add(new DevicePrivacyPolicySettingItem());
                arrayList.add(new PrivacyPolicyWithdrawalOfConsentSettingItem());
            }
        }
        return arrayList;
    }

    @NotNull
    public final ArrayList<Integer> getCountdown() {
        return this.countdown;
    }

    @NotNull
    public final ArrayList<Integer> getCountingInterval() {
        return this.countingInterval;
    }

    public final int getCountingIntervalValue() {
        return this.countingIntervalValue;
    }

    @NotNull
    public final EcoDeviceModel getCurDevice() {
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        if (ecoDeviceModel != null) {
            return ecoDeviceModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
        return null;
    }

    @NotNull
    public final String getCurModel() {
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        if (ecoDeviceModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
            ecoDeviceModel = null;
        }
        return EcoDeviceModelExtKt.getModel(ecoDeviceModel);
    }

    @Nullable
    public final String getLocalSportType() {
        return this.localSportType;
    }

    @Nullable
    public final two getMDeviceInfo() {
        return this.mDeviceInfo;
    }

    @NotNull
    public final List<Integer> getMetronomeFrequencyHopping() {
        return (List) this.metronomeFrequencyHopping.getValue();
    }

    public final int getMetronomeValue() {
        return this.metronomeValue;
    }

    @NotNull
    public final ArrayList<Integer> getReportingInterval() {
        return this.reportingInterval;
    }

    public final int getReportingIntervalValue() {
        return this.reportingIntervalValue;
    }

    public final void getRopeInfo(@NotNull final Function2<? super Boolean, ? super two, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        EcoDeviceModel ecoDeviceModel = this.mDeviceModel;
        if (ecoDeviceModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeviceModel");
            ecoDeviceModel = null;
        }
        com.xiaomi.fitness.sport_eco.extension.EcoDeviceModelExtKt.getRopeInfo(ecoDeviceModel, new bt7<two>() { // from class: com.xiaomi.fitness.sport_eco.view.launch.gym.setting.LocalRopeSettingViewModel.getRopeInfo.1
            @Override // defpackage.bt7
            public void onError(int errorCode) {
                ScopeExtKt.scope(Dispatchers.getMain(), new LocalRopeSettingViewModel$getRopeInfo$1$onError$1(callback, null));
            }

            @Override // defpackage.bt7
            public void onResult(two result) {
                Intrinsics.checkNotNullParameter(result, "result");
                ScopeExtKt.scope(Dispatchers.getMain(), new LocalRopeSettingViewModel$getRopeInfo$1$onResult$1(LocalRopeSettingViewModel.this, result, callback, null));
            }
        });
    }

    @NotNull
    public final mcn getSportDB() {
        return this.sportDB;
    }

    public final void setCountingIntervalValue(int i) {
        this.countingIntervalValue = i;
    }

    public final void setLocalSportType(@Nullable String str) {
        this.localSportType = str;
    }

    public final void setMDeviceInfo(@Nullable two twoVar) {
        this.mDeviceInfo = twoVar;
    }

    public final void setMetronomeValue(int i) {
        this.metronomeValue = i;
    }

    public final void setReportingIntervalValue(int i) {
        this.reportingIntervalValue = i;
    }

    public /* synthetic */ LocalRopeSettingViewModel(String str, mcn mcnVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, mcnVar);
    }

    public /* synthetic */ LocalRopeSettingViewModel(String str, mcn mcnVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, mcnVar);
    }
}
