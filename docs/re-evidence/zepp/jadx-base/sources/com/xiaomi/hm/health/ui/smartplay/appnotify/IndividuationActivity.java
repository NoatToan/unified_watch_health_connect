package com.xiaomi.hm.health.ui.smartplay.appnotify;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.contract.ActivityResultContract;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.profile.channel.module.notification.entity.ContactSettingItem;
import com.huami.devicex.R;
import com.huami.devicex.databinding.ActivityIndividuationBinding;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.analytics.DbUtils;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.watch.ui.dialog.AlertDialog;
import com.xiaomi.hm.health.ui.smartplay.appnotify.IndividuationActivity;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u001d\u0010\u0011\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/IndividuationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", com.google.android.exoplayer2.text.ttml.b.r, "z", "v", "l", "u", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onBackPressed", "Lcom/xiaomi/hm/health/ui/smartplay/appnotify/IndividuationViewModel;", "a", "Lkotlin/Lazy;", "o", "()Lcom/xiaomi/hm/health/ui/smartplay/appnotify/IndividuationViewModel;", "mViewModel", "Lcom/huami/devicex/databinding/ActivityIndividuationBinding;", "b", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", GoogleApiAvailabilityLight.b, "()Lcom/huami/devicex/databinding/ActivityIndividuationBinding;", "mViewBinding", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "c", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "mAppName", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class IndividuationActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public static final String KEY_APP_NAME = "app_name";

    @NotNull
    public static final String KEY_PKG = "package_name";
    public static final /* synthetic */ KProperty<Object>[] e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty mViewBinding = ActivityViewBindingsKt.viewBinding(new IndividuationActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivityIndividuationBinding.class)));

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private String mAppName;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/IndividuationActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "pkg", "appName", "", WebConstant.QueryParam.LAUNCH, "KEY_APP_NAME", "Ljava/lang/String;", "KEY_PKG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context context, @NotNull String pkg, @NotNull String appName) {
            Intent intent = new Intent(context, (Class<?>) IndividuationActivity.class);
            intent.putExtra("package_name", pkg);
            intent.putExtra("app_name", appName);
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Boolean, Unit> {
        public a() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(boolean z, IndividuationActivity individuationActivity) {
            if (z) {
                LoadingDialog loadingDialog = individuationActivity.mLoadingDialog;
                Objects.requireNonNull(loadingDialog);
                loadingDialog.setSuccess(individuationActivity.getString(R.string.delete_success));
            } else {
                LoadingDialog loadingDialog2 = individuationActivity.mLoadingDialog;
                Objects.requireNonNull(loadingDialog2);
                loadingDialog2.setFailed(individuationActivity.getString(R.string.delete_fail));
            }
            individuationActivity.o().updateEditView(individuationActivity.n());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final boolean z) {
            final IndividuationActivity individuationActivity = IndividuationActivity.this;
            individuationActivity.runOnUiThread(new Runnable() { // from class: com.xiaomi.hm.health.ui.smartplay.appnotify.a
                @Override // java.lang.Runnable
                public final void run() {
                    IndividuationActivity.a.b(z, individuationActivity);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Boolean, Unit> {
        public b() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(IndividuationActivity individuationActivity) {
            LoadingDialog loadingDialog = individuationActivity.mLoadingDialog;
            Objects.requireNonNull(loadingDialog);
            loadingDialog.dismiss();
            individuationActivity.o().updateContactItems();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            final IndividuationActivity individuationActivity = IndividuationActivity.this;
            individuationActivity.runOnUiThread(new Runnable() { // from class: com.xiaomi.hm.health.ui.smartplay.appnotify.b
                @Override // java.lang.Runnable
                public final void run() {
                    IndividuationActivity.b.b(individuationActivity);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/appnotify/IndividuationViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<IndividuationViewModel> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IndividuationViewModel invoke() {
            return (IndividuationViewModel) IndividuationActivity.this.getDefaultViewModelProviderFactory().create(IndividuationViewModel.class);
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(IndividuationActivity.class), "mViewBinding", "getMViewBinding()Lcom/huami/devicex/databinding/ActivityIndividuationBinding;"));
        e = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(IndividuationActivity individuationActivity, ContactSettingItem contactSettingItem) {
        if (contactSettingItem == null) {
            return;
        }
        individuationActivity.o().updateContactItems(contactSettingItem);
    }

    private final void l() {
        if (o().supportNotifyApp()) {
            return;
        }
        int i = R.string.tip_not_support_notification;
        String str = this.mAppName;
        Objects.requireNonNull(str);
        AlertDialog.setMessage(getString(i, new Object[]{str})).setPositiveBtn(getString(R.string.choise_open), new DialogInterface.OnClickListener() { // from class: ze4
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                IndividuationActivity.m(this.a, dialogInterface, i2);
            }
        }).setNegativeBtn(getString(R.string.cancel)).build().show(getFragmentManager(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(IndividuationActivity individuationActivity, DialogInterface dialogInterface, int i) {
        individuationActivity.o().makeAppSupported();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivityIndividuationBinding n() {
        return (ActivityIndividuationBinding) this.mViewBinding.getValue(this, e[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IndividuationViewModel o() {
        return (IndividuationViewModel) this.mViewModel.getValue();
    }

    private final void p() {
        n().titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: bf4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IndividuationActivity.q(this.a, view);
            }
        });
        n().titleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: hf4
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i) {
                IndividuationActivity.r(this.a, view, i);
            }
        });
        n().btnDelete.setOnClickListener(new View.OnClickListener() { // from class: af4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IndividuationActivity.s(this.a, view);
            }
        });
        n().tvAddContact.setOnClickListener(new View.OnClickListener() { // from class: cf4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IndividuationActivity.t(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(IndividuationActivity individuationActivity, View view) {
        individuationActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(IndividuationActivity individuationActivity, View view, int i) {
        individuationActivity.o().updateEditView(individuationActivity.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(IndividuationActivity individuationActivity, View view) {
        individuationActivity.mLoadingDialog = LoadingDialog.showDialog(individuationActivity, individuationActivity.getString(R.string.delete_loading));
        individuationActivity.o().deleteContactItems(individuationActivity.new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(IndividuationActivity individuationActivity, View view) {
        AnalyticsStarredContacts.INSTANCE.recordAddContactClicked();
        individuationActivity.o().addNewContact(individuationActivity);
    }

    private final void u() {
        n().rvContacts.setLayoutManager(new LinearLayoutManager(this, 1, false));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, 1);
        dividerItemDecoration.setDrawable(AppCompatResources.getDrawable(this, R.drawable.decoration_item_individual));
        n().rvContacts.addItemDecoration(dividerItemDecoration);
        n().rvContacts.setAdapter(o().getListAdapter(this));
        this.mLoadingDialog = LoadingDialog.showDialog(this, getString(R.string.loading));
        o().loadContacts(new b());
    }

    private final void v() {
        o().isContactsEmpty().observe(this, new Observer() { // from class: ff4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                IndividuationActivity.w(this.a, (Boolean) obj);
            }
        });
        o().isContactsFull().observe(this, new Observer() { // from class: gf4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                IndividuationActivity.x(this.a, (Boolean) obj);
            }
        });
        o().getDeleteButtonEnable().observe(this, new Observer() { // from class: ef4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                IndividuationActivity.y(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(IndividuationActivity individuationActivity, Boolean bool) {
        individuationActivity.n().titleBar.setMenuIcon(bool.booleanValue() ? R.drawable.ic_edit_disable : R.drawable.edit);
        if (bool.booleanValue()) {
            individuationActivity.n().btnDelete.setVisibility(8);
            individuationActivity.n().tvAddContact.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(IndividuationActivity individuationActivity, Boolean bool) {
        individuationActivity.n().tvAddContact.setVisibility(bool.booleanValue() ? 8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(IndividuationActivity individuationActivity, Boolean bool) {
        individuationActivity.n().btnDelete.setEnabled(bool.booleanValue());
    }

    private final void z() {
        o().setActivityLauncher(registerForActivityResult(new ActivityResultContract<ContactSettingItem, ContactSettingItem>() { // from class: com.xiaomi.hm.health.ui.smartplay.appnotify.IndividuationActivity$registerForActivityResult$1
            @Override // androidx.view.result.contract.ActivityResultContract
            @NotNull
            public Intent createIntent(@NotNull Context context, @Nullable ContactSettingItem input) {
                return this.a.o().getMIntent();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.view.result.contract.ActivityResultContract
            @Nullable
            public ContactSettingItem parseResult(int resultCode, @Nullable Intent intent) {
                if (intent == null) {
                    return null;
                }
                return (ContactSettingItem) intent.getParcelableExtra(ContactSettingItemActivity.KEY_CONTACT_ITEM);
            }
        }, new ActivityResultCallback() { // from class: df4
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                IndividuationActivity.A(this.a, (ContactSettingItem) obj);
            }
        }));
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        IndividuationViewModel individuationViewModelO = o();
        String str = this.mAppName;
        Objects.requireNonNull(str);
        individuationViewModelO.recordStarredContacts(str);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(n().getRoot());
        o().setPkg(getIntent().getStringExtra("package_name"));
        this.mAppName = getIntent().getStringExtra("app_name");
        z();
        v();
        l();
        u();
        p();
    }
}
