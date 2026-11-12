package com.huami.core.device.wifi_settings.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.core.device.wifi_settings.R;
import com.huami.core.device.wifi_settings.WifiRouter;
import com.huami.core.device.wifi_settings.bean.WifiBean;
import com.huami.core.device.wifi_settings.bean.WifiMultiBean;
import com.huami.core.device.wifi_settings.ui.WifiConfigListActivity;
import com.huami.core.device.wifi_settings.ui.adapter.WifiConfigAdapter;
import com.huami.core.device.wifi_settings.viewmodel.WifiViewModel;
import com.huami.core.device.wifi_settings.viewmodel.WifiViewModelFactory;
import com.huami.tools.log.HMLog;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u0002:\u0001AB\u0007¢\u0006\u0004\b?\u0010@J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015H\u0016J\"\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001d\u001a\u00020\u0003H\u0014R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010&R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u001d\u00107\u001a\u00020(8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001d\u0010:\u001a\u00020(8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u00106R\u0016\u0010>\u001a\u00020;8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006B"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/WifiConfigListActivity;", "Lcom/huami/core/device/wifi_settings/ui/BaseWifiActivity;", "Lkotlinx/coroutines/CoroutineScope;", "", "initRecyclerView", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/huami/core/device/wifi_settings/bean/WifiBean;", "wifiBean", "", "position", LogUtil.D, "F", "E", "initLayout", "maskViewId", "statusContainerId", "", "scanWifiEnable", "isShowLoadDialog", "initView", "initData", "", "list", "resultSuc", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "onDestroy", "Landroidx/recyclerview/widget/RecyclerView;", "C", "Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "mTvEmpty", "Lcom/huami/core/device/wifi_settings/ui/adapter/WifiConfigAdapter;", "Lcom/huami/core/device/wifi_settings/ui/adapter/WifiConfigAdapter;", "mAdapter", "Lcom/huami/core/device/wifi_settings/bean/WifiMultiBean;", "Ljava/util/List;", "mData", "Lcom/huami/core/device/wifi_settings/viewmodel/WifiViewModel;", "G", "Lcom/huami/core/device/wifi_settings/viewmodel/WifiViewModel;", "mWifiViewModel", "Landroid/view/View;", "H", "Landroid/view/View;", "mMaskView", LogUtil.I, "Lkotlin/Lazy;", "y", "()Lcom/huami/core/device/wifi_settings/bean/WifiMultiBean;", "mNearbyTitle", "J", "x", "mConfigTitle", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "Companion", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
public final class WifiConfigListActivity extends BaseWifiActivity implements CoroutineScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int REQUEST_CODE_FOR_SELECT = 102;
    public static final int REQUEST_CODE_FOR_SET = 101;

    @NotNull
    public static final String TAG = "WifiConfigList_Activity";

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private RecyclerView mRecyclerView;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private AppCompatTextView mTvEmpty;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private WifiConfigAdapter mAdapter;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    private WifiViewModel mWifiViewModel;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private View mMaskView;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private List<WifiMultiBean> mData = new ArrayList();

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    private final Lazy mNearbyTitle = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    private final Lazy mConfigTitle = LazyKt__LazyJVMKt.lazy(new a());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/core/device/wifi_settings/ui/WifiConfigListActivity$Companion;", "", "Landroid/app/Activity;", "activity", "", "source", "requestCode", "", "startActivity", "REQUEST_CODE_FOR_SELECT", LogUtil.I, "REQUEST_CODE_FOR_SET", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startActivity(@NotNull Activity activity, int source, int requestCode) {
            Intent intent = new Intent(activity, (Class<?>) WifiConfigListActivity.class);
            intent.putExtra("source", source);
            activity.startActivityForResult(intent, requestCode);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/core/device/wifi_settings/bean/WifiMultiBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<WifiMultiBean> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WifiMultiBean getA() {
            return new WifiMultiBean((Integer) 1, WifiConfigListActivity.this.getString(R.string.wifi_already_config));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/core/device/wifi_settings/bean/WifiMultiBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<WifiMultiBean> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WifiMultiBean getA() {
            return new WifiMultiBean((Integer) 1, WifiConfigListActivity.this.getString(R.string.wifi_nearby_title));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ List<WifiBean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<WifiBean> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            List<WifiBean> list = this.a;
            return Intrinsics.stringPlus("NearBy WifiList Result:", list == null ? null : Integer.valueOf(list.size()));
        }
    }

    /* JADX INFO: renamed from: com.huami.core.device.wifi_settings.ui.WifiConfigListActivity$initRecyclerView$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"com/huami/core/device/wifi_settings/ui/WifiConfigListActivity$initRecyclerView$2", "Lcom/huami/core/device/wifi_settings/ui/adapter/WifiConfigAdapter$OnClickConfigWifiListener;", "Lcom/huami/core/device/wifi_settings/bean/WifiMultiBean;", "wifiMultiBean", "", "position", "", "onClickReset", "onClickRemove", "wifi-settings_release"}, k = 1, mv = {1, 5, 1})
    public static final class AnonymousClass2 implements WifiConfigAdapter.OnClickConfigWifiListener {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(WifiConfigListActivity wifiConfigListActivity, WifiBean wifiBean, int i, DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            wifiConfigListActivity.D(wifiBean, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }

        @Override // com.huami.core.device.wifi_settings.ui.adapter.WifiConfigAdapter.OnClickConfigWifiListener
        public void onClickRemove(@NotNull WifiMultiBean wifiMultiBean, final int position) {
            final WifiBean wifiBean = wifiMultiBean.getWifiBean();
            if (wifiBean == null) {
                return;
            }
            final WifiConfigListActivity wifiConfigListActivity = WifiConfigListActivity.this;
            CenterDialogFragment.setNegativeButton$default(CenterDialogFragment.setPositiveButton$default(CenterDialogFragment.Companion.newInstance$default(CenterDialogFragment.INSTANCE, 0, 1, null).setMessage(wifiConfigListActivity.getString(R.string.wifi_remove_message)), wifiConfigListActivity.getString(R.string.wifi_remove), null, new DialogInterface.OnClickListener() { // from class: zu8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    WifiConfigListActivity.AnonymousClass2.c(wifiConfigListActivity, wifiBean, position, dialogInterface, i);
                }
            }, 2, null), wifiConfigListActivity.getString(R.string.wifi_cancel), null, new DialogInterface.OnClickListener() { // from class: av8
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    WifiConfigListActivity.AnonymousClass2.d(dialogInterface, i);
                }
            }, 2, null).show(wifiConfigListActivity.getSupportFragmentManager());
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.huami.core.device.wifi_settings.ui.adapter.WifiConfigAdapter.OnClickConfigWifiListener
        public void onClickReset(@NotNull WifiMultiBean wifiMultiBean, int position) {
            if (wifiMultiBean.getIsNearBy()) {
                WifiConfigListActivity.this.F(wifiMultiBean.getWifiBean());
                return;
            }
            WifiRouter wifiRouter = WifiRouter.INSTANCE;
            WifiConfigListActivity wifiConfigListActivity = WifiConfigListActivity.this;
            wifiRouter.launchWifiList(wifiConfigListActivity, wifiConfigListActivity.getMSource(), 102);
        }
    }

    private final void A() {
        WifiViewModel wifiViewModel = this.mWifiViewModel;
        if (wifiViewModel == null) {
            return;
        }
        wifiViewModel.getMWifiListLiveData().observe(this, new Observer() { // from class: yu8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WifiConfigListActivity.B(this.a, (List) obj);
            }
        });
        wifiViewModel.getMRemoveResultLiveData().observe(this, new Observer() { // from class: xu8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WifiConfigListActivity.C(this.a, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(WifiConfigListActivity wifiConfigListActivity, List list) {
        wifiConfigListActivity.hideLoadDialog();
        if (list == null || list.isEmpty()) {
            wifiConfigListActivity.E();
            return;
        }
        AppCompatTextView appCompatTextView = wifiConfigListActivity.mTvEmpty;
        if (appCompatTextView == null) {
            appCompatTextView = null;
        }
        appCompatTextView.setVisibility(8);
        RecyclerView recyclerView = wifiConfigListActivity.mRecyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setVisibility(0);
        wifiConfigListActivity.mData.clear();
        wifiConfigListActivity.mData.addAll(list);
        WifiConfigAdapter wifiConfigAdapter = wifiConfigListActivity.mAdapter;
        (wifiConfigAdapter != null ? wifiConfigAdapter : null).notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(WifiConfigListActivity wifiConfigListActivity, Boolean bool) {
        wifiConfigListActivity.hideLoadDialog();
        Toast.makeText(wifiConfigListActivity, bool.booleanValue() ? R.string.wifi_remove_success : R.string.wifi_remove_failed, 0).show();
        if (bool.booleanValue()) {
            wifiConfigListActivity.setResult(-1);
            wifiConfigListActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(WifiBean wifiBean, int position) {
        WifiViewModel wifiViewModel = this.mWifiViewModel;
        if (wifiViewModel == null) {
            return;
        }
        BaseWifiActivity.showLoadDialog$default(this, null, 1, null);
        wifiViewModel.removeWifi(wifiBean);
    }

    private final void E() {
        AppCompatTextView appCompatTextView = this.mTvEmpty;
        if (appCompatTextView == null) {
            appCompatTextView = null;
        }
        appCompatTextView.setVisibility(0);
        this.mData.clear();
        WifiConfigAdapter wifiConfigAdapter = this.mAdapter;
        if (wifiConfigAdapter == null) {
            wifiConfigAdapter = null;
        }
        wifiConfigAdapter.notifyDataSetChanged();
        RecyclerView recyclerView = this.mRecyclerView;
        (recyclerView != null ? recyclerView : null).setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(WifiBean wifiBean) {
        WifiRouter.INSTANCE.launchWifiSet(this, getMSource(), wifiBean, false, 101);
    }

    private final void initRecyclerView() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setHasFixedSize(true);
        WifiConfigAdapter wifiConfigAdapter = new WifiConfigAdapter(this.mData);
        this.mAdapter = wifiConfigAdapter;
        wifiConfigAdapter.setMListener(new View.OnClickListener() { // from class: wu8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WifiConfigListActivity.z(this.a, view);
            }
        });
        WifiConfigAdapter wifiConfigAdapter2 = this.mAdapter;
        if (wifiConfigAdapter2 == null) {
            wifiConfigAdapter2 = null;
        }
        wifiConfigAdapter2.setMClickConfigWifiListener(new AnonymousClass2());
        RecyclerView recyclerView3 = this.mRecyclerView;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        WifiConfigAdapter wifiConfigAdapter3 = this.mAdapter;
        recyclerView3.setAdapter(wifiConfigAdapter3 != null ? wifiConfigAdapter3 : null);
    }

    private final WifiMultiBean x() {
        return (WifiMultiBean) this.mConfigTitle.getValue();
    }

    private final WifiMultiBean y() {
        return (WifiMultiBean) this.mNearbyTitle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(WifiConfigListActivity wifiConfigListActivity, View view) {
        Object tag;
        WifiBean wifiBean;
        if (view == null || (tag = view.getTag()) == null || !(tag instanceof WifiMultiBean) || (wifiBean = ((WifiMultiBean) tag).getWifiBean()) == null || wifiBean.getWifiType() != 0) {
            return;
        }
        wifiConfigListActivity.F(wifiBean);
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return JobKt__JobKt.d(null, 1, null).plus(Dispatchers.getIO());
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    public void initData() {
        WifiViewModel wifiViewModel = this.mWifiViewModel;
        if (wifiViewModel == null) {
            return;
        }
        wifiViewModel.getConfigWifiList();
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    public int initLayout() {
        return R.layout.wifi_setting_activity_wifi_config_list;
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    public void initView() {
        this.mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        this.mTvEmpty = (AppCompatTextView) findViewById(R.id.tv_empty);
        this.mMaskView = findViewById(R.id.mask_view);
        initRecyclerView();
        this.mWifiViewModel = (WifiViewModel) new ViewModelProvider(this, new WifiViewModelFactory(getMSource())).get(WifiViewModel.class);
        A();
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    public boolean isShowLoadDialog() {
        return true;
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    public int maskViewId() {
        return R.id.mask_view;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1) {
            if (requestCode == 101) {
                Toast.makeText(this, R.string.wifi_config_success, 0).show();
                setResult(-1, data);
                finish();
            } else {
                if (requestCode != 102) {
                    return;
                }
                Serializable serializableExtra = data == null ? null : data.getSerializableExtra(WifiSetActivity.KEY_CONNECT);
                if (serializableExtra == null) {
                    return;
                }
                F((WifiBean) serializableExtra);
            }
        }
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CoroutineScopeKt.cancel$default(this, null, 1, null);
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity, com.huami.core.device.wifi_settings.wifiscan.listener.ScanResultListener
    public void resultSuc(@Nullable List<WifiBean> list) {
        HMLog.info(TAG, new c(list));
        WifiViewModel wifiViewModel = this.mWifiViewModel;
        if (wifiViewModel == null) {
            return;
        }
        wifiViewModel.mixNearByWithConfigWifi(list, y(), x());
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    /* JADX INFO: renamed from: scanWifiEnable */
    public boolean getWifiScanEnable() {
        return true;
    }

    @Override // com.huami.core.device.wifi_settings.ui.BaseWifiActivity
    public int statusContainerId() {
        return R.id.device_status;
    }
}
