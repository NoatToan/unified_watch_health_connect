package com.xiaomi.hm.health.ui.smartplay.appnotify;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.notification.NotificationProtocolWrapper;
import com.huami.bluetooth.profile.channel.module.notification.entity.ContactItemModify;
import com.huami.bluetooth.profile.channel.module.notification.entity.ContactSettingItem;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.HMDeviceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b7\u00108J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bJ\u001a\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\rJ\u001a\u0010\u0010\u001a\u00020\u00042\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\rJ\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0012\u001a\u00020\tR\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R6\u00100\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010(j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0019\u00104\u001a\b\u0012\u0004\u0012\u00020\u0006018F@\u0006¢\u0006\u0006\u001a\u0004\b2\u00103R\u0019\u00106\u001a\b\u0012\u0004\u0012\u00020\u0002018F@\u0006¢\u0006\u0006\u001a\u0004\b5\u00103¨\u00069"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/ContactItemViewModel;", "Landroidx/lifecycle/ViewModel;", "", ContactSettingItemActivity.KEY_VIBRATION, "", "newVibration", "", ContactSettingItemActivity.KEY_CONTACT, "newContact", "", "isContactAlreadyExist", "", "supportVibrations", "Lkotlin/Function1;", "result", "addContactItem", "updateContactItem", "vibrate", "containEmoji", "a", "Ljava/lang/String;", "tag", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "b", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "mDevice", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;", "c", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;", "getContactItemOld", "()Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;", "setContactItemOld", "(Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;)V", "contactItemOld", "Landroidx/lifecycle/MutableLiveData;", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MutableLiveData;", "mutableContactNew", "e", "mutableVibrationNew", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "f", "Ljava/util/ArrayList;", "getContactNames", "()Ljava/util/ArrayList;", "setContactNames", "(Ljava/util/ArrayList;)V", "contactNames", "Landroidx/lifecycle/LiveData;", "getContactNew", "()Landroidx/lifecycle/LiveData;", "contactNew", "getVibrationNew", "vibrationNew", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ContactItemViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "ContactItemViewModel";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private HMMiLiProDevice mDevice;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private ContactSettingItem contactItemOld;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<String> mutableContactNew;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> mutableVibrationNew;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private ArrayList<String> contactNames;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.smartplay.appnotify.ContactItemViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C1029a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1029a(boolean z) {
                super(0);
                this.a = z;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "vibrate result: " + this.a;
            }
        }

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            HMLog.info(ContactItemViewModel.this.tag, new C1029a(z));
        }
    }

    public ContactItemViewModel() {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        this.mDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
        this.mutableContactNew = new MutableLiveData<>();
        this.mutableVibrationNew = new MutableLiveData<>();
    }

    public final void addContactItem(@NotNull Function1<? super Boolean, Unit> result) {
        NotificationProtocolWrapper notificationWrapper;
        ContactSettingItem contactSettingItem = this.contactItemOld;
        if (contactSettingItem == null) {
            return;
        }
        ContactSettingItem contactSettingItem2 = new ContactSettingItem(contactSettingItem.getPkg(), getContactNew().getValue(), getVibrationNew().getValue().intValue());
        HMMiLiProDevice hMMiLiProDevice = this.mDevice;
        if (hMMiLiProDevice == null || (notificationWrapper = hMMiLiProDevice.getNotificationWrapper()) == null) {
            return;
        }
        notificationWrapper.addContactSettingItem(CollectionsKt__CollectionsKt.arrayListOf(contactSettingItem2), result);
    }

    public final boolean containEmoji() {
        return Pattern.compile("[^\u0000-\uffff]").matcher(String.valueOf(getContactNew().getValue())).find();
    }

    @Nullable
    public final ContactSettingItem getContactItemOld() {
        return this.contactItemOld;
    }

    @Nullable
    public final ArrayList<String> getContactNames() {
        return this.contactNames;
    }

    @NotNull
    public final LiveData<String> getContactNew() {
        return this.mutableContactNew;
    }

    @NotNull
    public final LiveData<Integer> getVibrationNew() {
        return this.mutableVibrationNew;
    }

    public final boolean isContactAlreadyExist() {
        ArrayList<String> arrayList = this.contactNames;
        if (arrayList == null) {
            return false;
        }
        return CollectionsKt___CollectionsKt.contains(arrayList, getContactNew().getValue());
    }

    public final void newContact(@NotNull String contact) {
        this.mutableContactNew.setValue(contact);
    }

    public final void newVibration(int vibration) {
        this.mutableVibrationNew.setValue(Integer.valueOf(vibration));
    }

    public final void setContactItemOld(@Nullable ContactSettingItem contactSettingItem) {
        this.contactItemOld = contactSettingItem;
    }

    public final void setContactNames(@Nullable ArrayList<String> arrayList) {
        this.contactNames = arrayList;
    }

    @Nullable
    public final List<Integer> supportVibrations() {
        NotificationProtocolWrapper notificationWrapper;
        HMMiLiProDevice hMMiLiProDevice = this.mDevice;
        if (hMMiLiProDevice == null || (notificationWrapper = hMMiLiProDevice.getNotificationWrapper()) == null) {
            return null;
        }
        return notificationWrapper.getVibrationList();
    }

    public final void updateContactItem(@NotNull Function1<? super Boolean, Unit> result) {
        NotificationProtocolWrapper notificationWrapper;
        ContactSettingItem contactSettingItem = this.contactItemOld;
        if (contactSettingItem == null) {
            return;
        }
        ContactItemModify contactItemModify = new ContactItemModify(contactSettingItem.getPkg(), contactSettingItem.getContact(), contactSettingItem.getVibration(), getContactNew().getValue(), getVibrationNew().getValue().intValue());
        HMMiLiProDevice hMMiLiProDevice = this.mDevice;
        if (hMMiLiProDevice == null || (notificationWrapper = hMMiLiProDevice.getNotificationWrapper()) == null) {
            return;
        }
        notificationWrapper.modifyContactSettingItem(CollectionsKt__CollectionsKt.arrayListOf(contactItemModify), result);
    }

    public final void vibrate(int vibration) {
        NotificationProtocolWrapper notificationWrapper;
        HMMiLiProDevice hMMiLiProDevice = this.mDevice;
        if (hMMiLiProDevice == null || (notificationWrapper = hMMiLiProDevice.getNotificationWrapper()) == null) {
            return;
        }
        notificationWrapper.vibrate(vibration, new a());
    }
}
