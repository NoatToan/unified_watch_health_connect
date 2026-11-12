package com.xiaomi.hm.health.ui.smartplay.appnotify;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.profile.channel.module.notification.entity.ContactSettingItem;
import com.huami.devicex.R;
import com.huami.devicex.databinding.ActivityContactSettingItemBinding;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.widget.toast.CustomToast;
import com.loc.z;
import com.xiaomi.hm.health.keeper.HMKeeperConstant;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b9\u0010:J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\tH\u0002J\u0012\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\tH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0012\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0013\u001a\u00020\u0002H\u0014R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R+\u00101\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R+\u00108\u001a\u0002022\u0006\u0010*\u001a\u0002028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010,\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006<"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/ContactSettingItemActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "x", "u", "t", SOAP.XMLNS, com.google.android.exoplayer2.text.ttml.b.r, "", "result", DTransferConstants.SEARCH_KEY, "addToStack", z.j, "h", "B", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStart", "", "a", "Ljava/lang/String;", "tag", "b", "mBusiness", "Lcom/huami/devicex/databinding/ActivityContactSettingItemBinding;", "c", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "m", "()Lcom/huami/devicex/databinding/ActivityContactSettingItemBinding;", "mViewBinding", "Lcom/xiaomi/hm/health/ui/smartplay/appnotify/ContactItemViewModel;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", GoogleApiAvailabilityLight.b, "()Lcom/xiaomi/hm/health/ui/smartplay/appnotify/ContactItemViewModel;", "mViewModel", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "e", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "<set-?>", "f", "Lkotlin/properties/ReadWriteProperty;", "l", "()Ljava/lang/String;", "C", "(Ljava/lang/String;)V", "contactNew", "", "g", "o", "()I", LogUtil.D, "(I)V", "vibrationNew", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ContactSettingItemActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final String KEY_CONTACT = "contact";

    @NotNull
    public static final String KEY_CONTACT_ITEM = "contact_item";

    @NotNull
    public static final String KEY_VIBRATION = "vibration";
    public static final int RESULT_CODE_FOR_ACTIVITY = 1001;
    public static final /* synthetic */ KProperty<Object>[] h;

    @NotNull
    private static final String i = "modify_contact";

    @NotNull
    private static final String j = "modify_vibration";

    @NotNull
    private static final String k = "add_contact_vibration";

    @NotNull
    private static final String l = "contact";

    @NotNull
    private static final String m = "vibration";

    @NotNull
    private static final String n = "which_business";

    @NotNull
    private static final String o = "contact_list";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String mBusiness;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty contactNew;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty vibrationNew;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "ContactSettingItemActivity";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty mViewBinding = ActivityViewBindingsKt.viewBinding(new ContactSettingItemActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivityContactSettingItemBinding.class)));

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ContactItemViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelStore getA() {
            return this.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.Factory getA() {
            return this.getDefaultViewModelProviderFactory();
        }
    });

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bJ\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\r\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000eR\u0016\u0010\u001a\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/ContactSettingItemActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/bluetooth/profile/channel/module/notification/entity/ContactSettingItem;", "item", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "names", "Landroid/content/Intent;", "createContactIntent", "createVibrationIntent", "BUSINESS_ADD_NEW", "Ljava/lang/String;", "BUSINESS_MODIFY_CONTACT", "BUSINESS_MODIFY_VIBRATION", "KEY_BUSINESS", HMKeeperConstant.y, "KEY_CONTACT_ITEM", "KEY_CONTACT_LIST", "KEY_VIBRATION", "", "RESULT_CODE_FOR_ACTIVITY", LogUtil.I, "TAG_CONTACT_FRAGMENT", "TAG_VIBRATION_FRAGMENT", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Intent createContactIntent(@NotNull Context context, @NotNull ContactSettingItem item, @NotNull ArrayList<String> names) {
            Intent intent = new Intent(context, (Class<?>) ContactSettingItemActivity.class);
            intent.putExtra(ContactSettingItemActivity.KEY_CONTACT_ITEM, item);
            intent.putExtra(ContactSettingItemActivity.n, TextUtils.isEmpty(item.getContact()) ? ContactSettingItemActivity.k : ContactSettingItemActivity.i);
            intent.putExtra(ContactSettingItemActivity.o, names);
            return intent;
        }

        @NotNull
        public final Intent createVibrationIntent(@NotNull Context context, @NotNull ContactSettingItem item) {
            Intent intent = new Intent(context, (Class<?>) ContactSettingItemActivity.class);
            intent.putExtra(ContactSettingItemActivity.KEY_CONTACT_ITEM, item);
            intent.putExtra(ContactSettingItemActivity.n, ContactSettingItemActivity.j);
            return intent;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Boolean, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ContactSettingItemActivity.this.q(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ContactSettingItemActivity.this.q(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "contact names: " + ContactSettingItemActivity.this.n().getContactNames();
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[4];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ContactSettingItemActivity.class), "mViewBinding", "getMViewBinding()Lcom/huami/devicex/databinding/ActivityContactSettingItemBinding;"));
        kPropertyArr[2] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ContactSettingItemActivity.class), "contactNew", "getContactNew()Ljava/lang/String;"));
        kPropertyArr[3] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(ContactSettingItemActivity.class), "vibrationNew", "getVibrationNew()I"));
        h = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    public ContactSettingItemActivity() {
        Delegates delegates = Delegates.INSTANCE;
        this.contactNew = delegates.notNull();
        this.vibrationNew = delegates.notNull();
    }

    private final void A() {
        this.mBusiness = getIntent().getStringExtra(n);
        ContactSettingItem contactSettingItem = (ContactSettingItem) getIntent().getParcelableExtra(KEY_CONTACT_ITEM);
        if (contactSettingItem != null) {
            n().setContactItemOld(contactSettingItem);
            n().newContact(contactSettingItem.getContact());
            n().newVibration(contactSettingItem.getVibration());
        }
        n().setContactNames(getIntent().getStringArrayListExtra(o));
        HMLog.info(this.tag, new c());
    }

    private final void B() {
        Intent intent = new Intent();
        intent.putExtra(KEY_CONTACT_ITEM, new ContactSettingItem(n().getContactItemOld().getPkg(), l(), o()));
        Unit unit = Unit.INSTANCE;
        setResult(1001, intent);
    }

    private final void C(String str) {
        this.contactNew.setValue(this, h[2], str);
    }

    private final void D(int i2) {
        this.vibrationNew.setValue(this, h[3], Integer.valueOf(i2));
    }

    private final void h(boolean addToStack) {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int id = m().fragmentContainer.getId();
        Bundle bundle = new Bundle();
        ContactSettingItem contactItemOld = n().getContactItemOld();
        bundle.putString("contact", contactItemOld == null ? null : contactItemOld.getContact());
        Unit unit = Unit.INSTANCE;
        fragmentTransactionBeginTransaction.replace(id, ContactFragment.class, bundle, "contact");
        if (addToStack) {
            fragmentTransactionBeginTransaction.addToBackStack("contact");
        }
        fragmentTransactionBeginTransaction.commit();
    }

    public static /* synthetic */ void i(ContactSettingItemActivity contactSettingItemActivity, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        contactSettingItemActivity.h(z);
    }

    private final void j(boolean addToStack) {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int id = m().fragmentContainer.getId();
        Bundle bundle = new Bundle();
        ContactSettingItem contactItemOld = n().getContactItemOld();
        if (contactItemOld != null) {
            bundle.putInt("vibration", contactItemOld.getVibration());
        }
        Unit unit = Unit.INSTANCE;
        fragmentTransactionBeginTransaction.replace(id, VibrationFragment.class, bundle, "vibration");
        if (addToStack) {
            fragmentTransactionBeginTransaction.addToBackStack("contact");
        }
        fragmentTransactionBeginTransaction.commit();
    }

    public static /* synthetic */ void k(ContactSettingItemActivity contactSettingItemActivity, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        contactSettingItemActivity.j(z);
    }

    private final String l() {
        return (String) this.contactNew.getValue(this, h[2]);
    }

    private final ActivityContactSettingItemBinding m() {
        return (ActivityContactSettingItemBinding) this.mViewBinding.getValue(this, h[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ContactItemViewModel n() {
        return (ContactItemViewModel) this.mViewModel.getValue();
    }

    private final int o() {
        return ((Number) this.vibrationNew.getValue(this, h[3])).intValue();
    }

    private final void p() {
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("vibration");
        if (fragmentFindFragmentByTag == null ? false : fragmentFindFragmentByTag.isVisible()) {
            this.mLoadingDialog = LoadingDialog.showDialog(this, getString(R.string.intro_recovering_settings_device));
            n().addContactItem(new a());
        } else if (n().isContactAlreadyExist()) {
            CustomToast.showShort(this, R.string.tip_contact_exist);
        } else if (n().containEmoji()) {
            CustomToast.showShort(this, R.string.tip_input_contact);
        } else {
            j(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(final boolean result) {
        runOnUiThread(new Runnable() { // from class: rz0
            @Override // java.lang.Runnable
            public final void run() {
                ContactSettingItemActivity.r(result, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(boolean z, ContactSettingItemActivity contactSettingItemActivity) {
        if (z) {
            AnalyticsStarredContacts.INSTANCE.recordAddContactSucceed();
            LoadingDialog loadingDialog = contactSettingItemActivity.mLoadingDialog;
            Objects.requireNonNull(loadingDialog);
            loadingDialog.setSuccess(contactSettingItemActivity.getString(R.string.setting_success));
            contactSettingItemActivity.B();
        } else {
            LoadingDialog loadingDialog2 = contactSettingItemActivity.mLoadingDialog;
            Objects.requireNonNull(loadingDialog2);
            loadingDialog2.setFailed(contactSettingItemActivity.getString(R.string.setting_fail));
        }
        contactSettingItemActivity.finish();
    }

    private final void s() {
        if (n().isContactAlreadyExist()) {
            CustomToast.showShort(this, R.string.tip_contact_exist);
        } else if (n().containEmoji()) {
            CustomToast.showShort(this, R.string.tip_input_contact);
        } else {
            this.mLoadingDialog = LoadingDialog.showDialog(this, getString(R.string.intro_recovering_settings_device));
            n().updateContactItem(new b());
        }
    }

    private final void t() {
        if (!Intrinsics.areEqual(this.mBusiness, k)) {
            finish();
            return;
        }
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag("vibration");
        if (fragmentFindFragmentByTag == null) {
            fragmentFindFragmentByTag = null;
        } else if (fragmentFindFragmentByTag.isVisible()) {
            getSupportFragmentManager().popBackStack();
        } else {
            finish();
        }
        if (fragmentFindFragmentByTag == null) {
            finish();
        }
    }

    private final void u() {
        m().titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: oz0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContactSettingItemActivity.v(this.a, view);
            }
        });
        m().btnConfirm.setOnClickListener(new View.OnClickListener() { // from class: nz0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ContactSettingItemActivity.w(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(ContactSettingItemActivity contactSettingItemActivity, View view) {
        contactSettingItemActivity.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(ContactSettingItemActivity contactSettingItemActivity, View view) {
        if (Intrinsics.areEqual(contactSettingItemActivity.mBusiness, k)) {
            contactSettingItemActivity.p();
        } else {
            contactSettingItemActivity.s();
        }
    }

    private final void x() {
        String str = this.mBusiness;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -665654885) {
                if (iHashCode != -236042987) {
                    if (iHashCode == 585057613 && str.equals(j)) {
                        k(this, false, 1, null);
                        return;
                    }
                    return;
                }
                if (!str.equals(k)) {
                    return;
                }
            } else if (!str.equals(i)) {
                return;
            }
            i(this, false, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(ContactSettingItemActivity contactSettingItemActivity, Integer num) {
        contactSettingItemActivity.D(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(ContactSettingItemActivity contactSettingItemActivity, String str) {
        contactSettingItemActivity.C(str);
        contactSettingItemActivity.m().btnConfirm.setEnabled(!TextUtils.isEmpty(str));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(m().getRoot());
        A();
        x();
        u();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        n().getVibrationNew().observe(this, new Observer() { // from class: pz0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ContactSettingItemActivity.y(this.a, (Integer) obj);
            }
        });
        n().getContactNew().observe(this, new Observer() { // from class: qz0
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                ContactSettingItemActivity.z(this.a, (String) obj);
            }
        });
    }
}
