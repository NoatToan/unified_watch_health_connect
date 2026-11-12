package com.xiaomi.fitness.initialization;

import com.xiaomi.fitness.component.ComponentConfigProvider;
import com.xiaomi.fitness.component.ComponentConfiguration;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/initialization/Initializer;", "Lcom/xiaomi/fitness/component/ComponentConfigProvider;", "<init>", "()V", "constructSet", "", "Lcom/xiaomi/fitness/component/ComponentConfiguration;", "app_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Initializer implements ComponentConfigProvider {
    @Override // com.xiaomi.fitness.component.ComponentConfigProvider
    @NotNull
    public final Set<ComponentConfiguration> constructSet() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new StandDetect_ComponentConfiguration());
        linkedHashSet.add(new FitApp_ComponentConfiguration());
        linkedHashSet.add(new DeviceManager_ComponentConfiguration());
        linkedHashSet.add(new Main_ComponentConfiguration());
        linkedHashSet.add(new DeviceSettings_ComponentConfiguration());
        linkedHashSet.add(new Login_ComponentConfiguration());
        linkedHashSet.add(new SportEco_ComponentConfiguration());
        linkedHashSet.add(new Feedback_ComponentConfiguration());
        linkedHashSet.add(new Checkupdate_ComponentConfiguration());
        linkedHashSet.add(new Notify_ComponentConfiguration());
        linkedHashSet.add(new Sync_ComponentConfiguration());
        linkedHashSet.add(new UserInfo_ComponentConfiguration());
        linkedHashSet.add(new Mine_ComponentConfiguration());
        linkedHashSet.add(new Medal_ComponentConfiguration());
        linkedHashSet.add(new Sport_ComponentConfiguration());
        linkedHashSet.add(new Health_ComponentConfiguration());
        linkedHashSet.add(new Nfc_ComponentConfiguration());
        linkedHashSet.add(new Share_ComponentConfiguration());
        linkedHashSet.add(new FitnessSync_ComponentConfiguration());
        linkedHashSet.add(new About_ComponentConfiguration());
        linkedHashSet.add(new WatchFace_ComponentConfiguration());
        linkedHashSet.add(new Access_ComponentConfiguration());
        linkedHashSet.add(new Course_ComponentConfiguration());
        linkedHashSet.add(new Push_ComponentConfiguration());
        linkedHashSet.add(new Habit_ComponentConfiguration());
        linkedHashSet.add(new FitnessDataProvider_ComponentConfiguration());
        linkedHashSet.add(new LpaManagement_ComponentConfiguration());
        linkedHashSet.add(new ActivePk_ComponentConfiguration());
        linkedHashSet.add(new ElectronicScale_ComponentConfiguration());
        linkedHashSet.add(new EcoDeviceManager_ComponentConfiguration());
        linkedHashSet.add(new MessageCenter_ComponentConfiguration());
        linkedHashSet.add(new Pay_ComponentConfiguration());
        linkedHashSet.add(new TrainingPlan_ComponentConfiguration());
        linkedHashSet.add(new YrnConfig_ComponentConfiguration());
        linkedHashSet.add(new FitnessDataCore_ComponentConfiguration());
        linkedHashSet.add(new Banner_ComponentConfiguration());
        linkedHashSet.add(new PermissionManager_ComponentConfiguration());
        linkedHashSet.add(new Ui_ComponentConfiguration());
        linkedHashSet.add(new CourseSchedule_ComponentConfiguration());
        linkedHashSet.add(new ResearchSupport_ComponentConfiguration());
        linkedHashSet.add(new Membership_ComponentConfiguration());
        linkedHashSet.add(new SportManager_ComponentConfiguration());
        linkedHashSet.add(new SportEcoManager_ComponentConfiguration());
        linkedHashSet.add(new FitnessEcoSync_ComponentConfiguration());
        linkedHashSet.add(new Milink_ComponentConfiguration());
        linkedHashSet.add(new SportCapture_ComponentConfiguration());
        linkedHashSet.add(new Aivs_ComponentConfiguration());
        linkedHashSet.add(new Netproxy_ComponentConfiguration());
        linkedHashSet.add(new Xmswearable_ComponentConfiguration());
        linkedHashSet.add(new Statistics_ComponentConfiguration());
        linkedHashSet.add(new Smarthome_ComponentConfiguration());
        linkedHashSet.add(new Settingitem_ComponentConfiguration());
        linkedHashSet.add(new KeepAlive_ComponentConfiguration());
        linkedHashSet.add(new ResPreload_ComponentConfiguration());
        linkedHashSet.add(new Reminder_ComponentConfiguration());
        return linkedHashSet;
    }
}
