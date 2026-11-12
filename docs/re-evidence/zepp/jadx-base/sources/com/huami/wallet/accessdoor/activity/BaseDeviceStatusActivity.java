package com.huami.wallet.accessdoor.activity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.components.devicestatus.DeviceStatusFragment;
import com.huami.components.devicestatus.EnableChangeListener;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.activity.BaseDeviceStatusActivity;
import com.huami.wallet.accessdoor.databinding.WlBaseTitleContentBinding;
import com.huami.wallet.accessdoor.utils.AccessDoorUI;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016J\u0006\u0010\u000f\u001a\u00020\u0002R\u001d\u0010\u0015\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\u00020\u00168F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/huami/wallet/accessdoor/activity/BaseDeviceStatusActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", GoogleApiAvailabilityLight.a, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "setContentView", "", "layoutResID", "Landroid/view/ViewGroup$LayoutParams;", "params", "addContentView", "removeDeviceStatusTip", "Lcom/huami/wallet/accessdoor/databinding/WlBaseTitleContentBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "f", "()Lcom/huami/wallet/accessdoor/databinding/WlBaseTitleContentBinding;", "binding", "Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "b", "Lkotlin/Lazy;", "getTvTitleBar", "()Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "tvTitleBar", "Lcom/huami/components/devicestatus/DeviceStatusFragment;", "c", "Lcom/huami/components/devicestatus/DeviceStatusFragment;", "fragment", "<init>", "()V", "access-door_release"}, k = 1, mv = {1, 5, 1})
public abstract class BaseDeviceStatusActivity extends AppCompatActivity {
    public static final /* synthetic */ KProperty<Object>[] d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = ActivityViewBindingsKt.viewBinding(new BaseDeviceStatusActivity$special$$inlined$viewBinding$1(new InflateViewBinder(WlBaseTitleContentBinding.class)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvTitleBar = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private DeviceStatusFragment fragment;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/lib/rainbow/titlebar/RainbowTitleBar;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<RainbowTitleBar> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RainbowTitleBar invoke() {
            return BaseDeviceStatusActivity.this.f().tvTitleBar;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(BaseDeviceStatusActivity.class), "binding", "getBinding()Lcom/huami/wallet/accessdoor/databinding/WlBaseTitleContentBinding;"));
        d = kPropertyArr;
    }

    private final void d() {
        DeviceStatusFragment deviceStatusFragment = new DeviceStatusFragment();
        this.fragment = deviceStatusFragment;
        deviceStatusFragment.setEnableChangeListener(new EnableChangeListener() { // from class: sp
            @Override // com.huami.components.devicestatus.EnableChangeListener
            public final void onEnableChange(boolean z) {
                BaseDeviceStatusActivity.e(this.a, z);
            }
        });
        this.fragment.setStringProvider(AccessDoorUI.getInstance().getDeviceStatusStringProvider());
        getSupportFragmentManager().beginTransaction().replace(R.id.wl_header, this.fragment, this.fragment.getClass().getName()).commitAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(BaseDeviceStatusActivity baseDeviceStatusActivity, boolean z) {
        baseDeviceStatusActivity.f().wlContent.setForeground(z ? null : new ColorDrawable(ContextCompat.getColor(baseDeviceStatusActivity, R.color.wl_disabled_mask)));
        baseDeviceStatusActivity.f().disabledMask.setVisibility(z ? 8 : 0);
        baseDeviceStatusActivity.f().disabledMask.setClickable(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WlBaseTitleContentBinding f() {
        return (WlBaseTitleContentBinding) this.binding.getValue(this, d[0]);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void addContentView(@NotNull View view, @NotNull ViewGroup.LayoutParams params) {
        f().wlContent.addView(view, params);
    }

    @NotNull
    public final RainbowTitleBar getTvTitleBar() {
        return (RainbowTitleBar) this.tvTitleBar.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App);
        super.onCreate(savedInstanceState);
        super.setContentView(f().getRoot());
        d();
    }

    public final void removeDeviceStatusTip() {
        getSupportFragmentManager().beginTransaction().remove(this.fragment).commitAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(@NotNull View view) {
        f().wlContent.removeAllViews();
        f().wlContent.addView(view);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(int layoutResID) {
        f().wlContent.removeAllViews();
        View.inflate(this, layoutResID, f().wlContent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.view.ComponentActivity, android.app.Activity
    public void setContentView(@NotNull View view, @NotNull ViewGroup.LayoutParams params) {
        f().wlContent.removeAllViews();
        f().wlContent.addView(view, params);
    }
}
