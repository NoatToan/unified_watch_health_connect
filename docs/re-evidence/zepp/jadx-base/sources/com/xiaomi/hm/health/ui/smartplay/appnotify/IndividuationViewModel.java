package com.xiaomi.hm.health.ui.smartplay.appnotify;

import android.content.Context;
import android.content.Intent;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.view.result.ActivityResultLauncher;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.notification.NotificationProtocolWrapper;
import com.huami.bluetooth.profile.channel.module.notification.entity.ContactSettingItem;
import com.huami.device.feature.notification.appnotify.NotificationManager;
import com.huami.devicex.R;
import com.huami.devicex.databinding.ActivityIndividuationBinding;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.wallet.accessdoor.helper.RainbowTitleBarExtKt;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.HMDeviceManager;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b`\u0010aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0002J\u001a\u0010\u000b\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\bJ\u001a\u0010\f\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\tJ\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0005R\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00100)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R(\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010+\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001f\u00108\u001a\b\u0012\u0004\u0012\u00020\t038\u0006@\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001f\u0010:\u001a\b\u0012\u0004\u0012\u00020\t038\u0006@\u0006¢\u0006\f\n\u0004\b9\u00105\u001a\u0004\b:\u00107R\u001f\u0010<\u001a\b\u0012\u0004\u0012\u00020\t038\u0006@\u0006¢\u0006\f\n\u0004\b;\u00105\u001a\u0004\b<\u00107R\"\u0010=\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010J\u001a\u00020C8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010Q\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR,\u0010Y\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010R8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010_\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010\u001d\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^¨\u0006b"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/IndividuationViewModel;", "Landroidx/lifecycle/ViewModel;", "", "a", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "b", "Lkotlin/Function1;", "", "result", "loadContacts", "deleteContactItems", "Lcom/huami/devicex/databinding/ActivityIndividuationBinding;", "viewBinding", "updateEditView", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;", "item", "updateContactItems", "Lcom/xiaomi/hm/health/ui/smartplay/appnotify/IndividuationActivity;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/ui/smartplay/appnotify/IndividuationListAdapter;", "getListAdapter", "Landroid/content/Context;", "addNewContact", "supportNotifyApp", "makeAppSupported", "appName", "recordStarredContacts", "Ljava/lang/String;", "tag", "", LogUtil.I, "maxContactsSize", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "c", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "mDevice", GoogleApiAvailabilityLight.a, "Z", "isEditing", "", "e", "Ljava/util/List;", "mContactSettingList", "f", "getMItemPreDelete", "()Ljava/util/List;", "setMItemPreDelete", "(Ljava/util/List;)V", "mItemPreDelete", "Landroidx/lifecycle/MutableLiveData;", "g", "Landroidx/lifecycle/MutableLiveData;", "getDeleteButtonEnable", "()Landroidx/lifecycle/MutableLiveData;", "deleteButtonEnable", "h", "isContactsEmpty", "i", "isContactsFull", "mAdapter", "Lcom/xiaomi/hm/health/ui/smartplay/appnotify/IndividuationListAdapter;", "getMAdapter", "()Lcom/xiaomi/hm/health/ui/smartplay/appnotify/IndividuationListAdapter;", "setMAdapter", "(Lcom/xiaomi/hm/health/ui/smartplay/appnotify/IndividuationListAdapter;)V", "Landroid/content/Intent;", z.j, "Landroid/content/Intent;", "getMIntent$devicex_zeppRelease", "()Landroid/content/Intent;", "setMIntent$devicex_zeppRelease", "(Landroid/content/Intent;)V", "mIntent", hl.k, "Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;", "getMContactItemOld", "()Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;", "setMContactItemOld", "(Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;)V", "mContactItemOld", "Landroidx/activity/result/ActivityResultLauncher;", "l", "Landroidx/activity/result/ActivityResultLauncher;", "getActivityLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setActivityLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V", "activityLauncher", "m", "getPkg", "()Ljava/lang/String;", "setPkg", "(Ljava/lang/String;)V", "pkg", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class IndividuationViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "IndividuationViewModel";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int maxContactsSize = 5;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private HMMiLiProDevice mDevice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isEditing;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private List<ContactSettingItem> mContactSettingList;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private List<ContactSettingItem> mItemPreDelete;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> deleteButtonEnable;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> isContactsEmpty;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> isContactsFull;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private Intent mIntent;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private ContactSettingItem mContactItemOld;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private ActivityResultLauncher<ContactSettingItem> activityLauncher;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private String pkg;
    public IndividuationListAdapter mAdapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.smartplay.appnotify.IndividuationViewModel$checkContactsSize$1", f = "IndividuationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return IndividuationViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IndividuationViewModel.this.isContactsEmpty().setValue(Boxing.boxBoolean(IndividuationViewModel.this.mContactSettingList.size() == 0));
            IndividuationViewModel.this.isContactsFull().setValue(Boxing.boxBoolean(IndividuationViewModel.this.mContactSettingList.size() == IndividuationViewModel.this.maxContactsSize));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ Function1<Boolean, Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Boolean, Unit> function1) {
            super(1);
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                IndividuationViewModel.this.mContactSettingList.removeAll(IndividuationViewModel.this.getMItemPreDelete());
                IndividuationViewModel.this.a();
            }
            this.b.invoke(Boolean.valueOf(z));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n"}, d2 = {"Ljava/util/ArrayList;", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;", "Lkotlin/collections/ArrayList;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<ArrayList<ContactSettingItem>, Unit> {
        public final /* synthetic */ Function1<Boolean, Unit> b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ ArrayList<ContactSettingItem> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ArrayList<ContactSettingItem> arrayList) {
                super(0);
                this.a = arrayList;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "all contacts: " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super Boolean, Unit> function1) {
            super(1);
            this.b = function1;
        }

        public final void a(@NotNull ArrayList<ContactSettingItem> arrayList) {
            HMLog.info(IndividuationViewModel.this.tag, new a(arrayList));
            IndividuationViewModel individuationViewModel = IndividuationViewModel.this;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (Intrinsics.areEqual(((ContactSettingItem) obj).getPkg(), individuationViewModel.getPkg())) {
                    arrayList2.add(obj);
                }
            }
            IndividuationViewModel.this.mContactSettingList.addAll(arrayList2);
            IndividuationViewModel.this.a();
            this.b.invoke(Boolean.TRUE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ArrayList<ContactSettingItem> arrayList) {
            a(arrayList);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "makeAppSupported: pkg is null";
        }
    }

    public IndividuationViewModel() {
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        this.mDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
        this.mContactSettingList = new ArrayList();
        this.mItemPreDelete = new ArrayList();
        this.deleteButtonEnable = new MutableLiveData<>();
        this.isContactsEmpty = new MutableLiveData<>();
        this.isContactsFull = new MutableLiveData<>();
        this.mIntent = new Intent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList<String> b() {
        ArrayList<String> arrayList = new ArrayList<>();
        List<ContactSettingItem> list = this.mContactSettingList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((ContactSettingItem) it2.next()).getContact());
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList.add((String) it3.next());
        }
        return arrayList;
    }

    public final void addNewContact(@NotNull Context context) {
        this.mContactItemOld = null;
        String str = this.pkg;
        if (str == null) {
            str = "";
        }
        ContactSettingItem contactSettingItem = new ContactSettingItem(str, "", Vibration.INSTANCE.m3453default());
        this.mIntent = ContactSettingItemActivity.INSTANCE.createContactIntent(context, contactSettingItem, b());
        ActivityResultLauncher<ContactSettingItem> activityResultLauncher = this.activityLauncher;
        if (activityResultLauncher == null) {
            return;
        }
        activityResultLauncher.launch(contactSettingItem);
    }

    public final void deleteContactItems(@NotNull Function1<? super Boolean, Unit> result) {
        NotificationProtocolWrapper notificationWrapper;
        HMMiLiProDevice hMMiLiProDevice = this.mDevice;
        Unit unit = null;
        if (hMMiLiProDevice != null && (notificationWrapper = hMMiLiProDevice.getNotificationWrapper()) != null) {
            notificationWrapper.deleteContactSettingItems((ArrayList) this.mItemPreDelete, new b(result));
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            result.invoke(Boolean.FALSE);
        }
    }

    @Nullable
    public final ActivityResultLauncher<ContactSettingItem> getActivityLauncher() {
        return this.activityLauncher;
    }

    @NotNull
    public final MutableLiveData<Boolean> getDeleteButtonEnable() {
        return this.deleteButtonEnable;
    }

    @NotNull
    public final IndividuationListAdapter getListAdapter(@NotNull final IndividuationActivity context) {
        IndividuationListAdapter.IndividuationListener individuationListener = new IndividuationListAdapter.IndividuationListener() { // from class: com.xiaomi.hm.health.ui.smartplay.appnotify.IndividuationViewModel$getListAdapter$listener$1
            @Override // com.xiaomi.hm.health.ui.smartplay.appnotify.IndividuationListAdapter.IndividuationListener
            public void onCheckedChangeListener(boolean isChecked, @NotNull ContactSettingItem item) {
                if (isChecked) {
                    this.a.getMItemPreDelete().add(item);
                } else {
                    this.a.getMItemPreDelete().remove(item);
                }
                this.a.getDeleteButtonEnable().setValue(Boolean.valueOf(this.a.getMItemPreDelete().size() != 0));
            }

            @Override // com.xiaomi.hm.health.ui.smartplay.appnotify.IndividuationListAdapter.IndividuationListener
            public void onContactClickListener(@NotNull ContactSettingItem item) {
                this.a.setMContactItemOld(item);
                IndividuationViewModel individuationViewModel = this.a;
                individuationViewModel.setMIntent$devicex_zeppRelease(ContactSettingItemActivity.INSTANCE.createContactIntent(context, item, individuationViewModel.b()));
                ActivityResultLauncher<ContactSettingItem> activityLauncher = this.a.getActivityLauncher();
                if (activityLauncher == null) {
                    return;
                }
                activityLauncher.launch(item);
            }

            @Override // com.xiaomi.hm.health.ui.smartplay.appnotify.IndividuationListAdapter.IndividuationListener
            public void onVibrationClickListener(@NotNull ContactSettingItem item) {
                this.a.setMContactItemOld(item);
                this.a.setMIntent$devicex_zeppRelease(ContactSettingItemActivity.INSTANCE.createVibrationIntent(context, item));
                ActivityResultLauncher<ContactSettingItem> activityLauncher = this.a.getActivityLauncher();
                if (activityLauncher == null) {
                    return;
                }
                activityLauncher.launch(item);
            }
        };
        setMAdapter(new IndividuationListAdapter(this.mContactSettingList));
        getMAdapter().setIndividuationListener(individuationListener);
        return getMAdapter();
    }

    @NotNull
    public final IndividuationListAdapter getMAdapter() {
        IndividuationListAdapter individuationListAdapter = this.mAdapter;
        Objects.requireNonNull(individuationListAdapter);
        return individuationListAdapter;
    }

    @Nullable
    public final ContactSettingItem getMContactItemOld() {
        return this.mContactItemOld;
    }

    @NotNull
    /* JADX INFO: renamed from: getMIntent$devicex_zeppRelease, reason: from getter */
    public final Intent getMIntent() {
        return this.mIntent;
    }

    @NotNull
    public final List<ContactSettingItem> getMItemPreDelete() {
        return this.mItemPreDelete;
    }

    @Nullable
    public final String getPkg() {
        return this.pkg;
    }

    @NotNull
    public final MutableLiveData<Boolean> isContactsEmpty() {
        return this.isContactsEmpty;
    }

    @NotNull
    public final MutableLiveData<Boolean> isContactsFull() {
        return this.isContactsFull;
    }

    public final void loadContacts(@NotNull Function1<? super Boolean, Unit> result) {
        NotificationProtocolWrapper notificationWrapper;
        HMMiLiProDevice hMMiLiProDevice = this.mDevice;
        Unit unit = null;
        if (hMMiLiProDevice != null && (notificationWrapper = hMMiLiProDevice.getNotificationWrapper()) != null) {
            notificationWrapper.queryContactSettingItems(new c(result));
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            result.invoke(Boolean.FALSE);
        }
    }

    public final void makeAppSupported() {
        Unit unit;
        String str = this.pkg;
        if (str == null) {
            unit = null;
        } else {
            NotificationManager.getInstance().getAppsRepo().addApp(str);
            EventBus.getDefault().post(new SupportAppEvent(str));
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            HMLog.info(this.tag, d.a);
        }
    }

    public final void recordStarredContacts(@NotNull String appName) {
        AnalyticsStarredContacts.INSTANCE.recordSingleAppStarredContactSize(appName, this.mContactSettingList.size());
        List<ContactSettingItem> list = this.mContactSettingList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((ContactSettingItem) it2.next()).getVibration()));
        }
        String string = arrayList.toString();
        AnalyticsStarredContacts analyticsStarredContacts = AnalyticsStarredContacts.INSTANCE;
        analyticsStarredContacts.recordSingleAppVibrationUsage(appName, string);
        if (this.mContactSettingList.size() > 0) {
            analyticsStarredContacts.recordUsedStarredContactApps(appName);
        }
    }

    public final void setActivityLauncher(@Nullable ActivityResultLauncher<ContactSettingItem> activityResultLauncher) {
        this.activityLauncher = activityResultLauncher;
    }

    public final void setMAdapter(@NotNull IndividuationListAdapter individuationListAdapter) {
        this.mAdapter = individuationListAdapter;
    }

    public final void setMContactItemOld(@Nullable ContactSettingItem contactSettingItem) {
        this.mContactItemOld = contactSettingItem;
    }

    public final void setMIntent$devicex_zeppRelease(@NotNull Intent intent) {
        this.mIntent = intent;
    }

    public final void setMItemPreDelete(@NotNull List<ContactSettingItem> list) {
        this.mItemPreDelete = list;
    }

    public final void setPkg(@Nullable String str) {
        this.pkg = str;
    }

    public final boolean supportNotifyApp() {
        String str = this.pkg;
        if (str == null) {
            return false;
        }
        return NotificationManager.getInstance().getAppsRepo().hasApp(HMDeviceType.MILI, str);
    }

    public final void updateContactItems(@NotNull ContactSettingItem item) {
        int iIndexOf;
        ContactSettingItem contactSettingItem = this.mContactItemOld;
        if (contactSettingItem == null) {
            iIndexOf = -1;
        } else {
            iIndexOf = this.mContactSettingList.indexOf(contactSettingItem);
            this.mContactSettingList.remove(contactSettingItem);
        }
        if (iIndexOf == -1) {
            this.mContactSettingList.add(item);
        } else {
            this.mContactSettingList.add(iIndexOf, item);
        }
        getMAdapter().update(false, this.mContactSettingList);
        a();
    }

    public final void updateEditView(@NotNull ActivityIndividuationBinding viewBinding) {
        if (this.mContactSettingList.size() == 0) {
            return;
        }
        if (this.isEditing) {
            this.isEditing = false;
            viewBinding.titleBar.setNavigationIcon(R.drawable.ic_arrow_back_20_2x);
            viewBinding.titleBar.setMenuIcon(R.drawable.edit);
            viewBinding.btnDelete.setVisibility(8);
            if (this.mContactSettingList.size() < this.maxContactsSize) {
                viewBinding.tvAddContact.setVisibility(0);
            }
        } else {
            this.isEditing = true;
            viewBinding.tvAddContact.setVisibility(8);
            viewBinding.btnDelete.setVisibility(0);
            RainbowTitleBarExtKt.hideNavigationIcon(viewBinding.titleBar);
            viewBinding.titleBar.setMenuText(DeviceXFunctionsKt.getContext().getString(R.string.cancel));
        }
        getMAdapter().update(this.isEditing, this.mContactSettingList);
    }

    public final void updateContactItems() {
        getMAdapter().update(false, this.mContactSettingList);
        a();
    }
}
