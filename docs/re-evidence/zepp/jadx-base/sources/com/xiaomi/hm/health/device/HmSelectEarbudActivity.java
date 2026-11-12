package com.xiaomi.hm.health.device;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.devicex.databinding.ActivitySelectEarbudBinding;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.HmSelectEarbudActivity;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.headset.BindHeadsetGuideActivity;
import com.xiaomi.hm.health.device.headset.BindPairedHeadsetActivity;
import com.xiaomi.hm.health.device.headset.PairedDevice;
import com.xiaomi.hm.health.device.headset.PairedDeviceViewModel;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00030\u001b\u001fB\u0007¢\u0006\u0004\b.\u0010/J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0016\u0010\u0011\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0012\u0010\u0014\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014J\"\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010#\u001a\u00020\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010(\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001d\u0010-\u001a\u00020)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/xiaomi/hm/health/device/HmSelectEarbudActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/koin/core/component/KoinComponent;", "", "initView", "l", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "m", "o", GoogleApiAvailabilityLight.b, "", "type", "e", "", "Lcom/xiaomi/hm/health/device/headset/PairedDevice;", "pairedDevices", "i", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Lcom/huami/devicex/databinding/ActivitySelectEarbudBinding;", "a", "Lcom/huami/devicex/databinding/ActivitySelectEarbudBinding;", "binding", "Lcom/xiaomi/hm/health/device/HmSelectEarbudActivity$b;", "b", "Lkotlin/Lazy;", "g", "()Lcom/xiaomi/hm/health/device/HmSelectEarbudActivity$b;", "mAdapter", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "c", "f", "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "Lcom/xiaomi/hm/health/device/headset/PairedDeviceViewModel;", GoogleApiAvailabilityLight.a, "h", "()Lcom/xiaomi/hm/health/device/headset/PairedDeviceViewModel;", "pairedMozartViewModel", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HmSelectEarbudActivity extends AppCompatActivity implements KoinComponent {
    private static final int e = 0;
    private static final int f = 1;
    private static final int g = 2;
    private static final int h = 3;
    private static final int i = 2;
    private static final int j = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private ActivitySelectEarbudBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAdapter = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceXNavigator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy pairedMozartViewModel;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.HmSelectEarbudActivity$a, reason: from toString */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0018"}, d2 = {"com/xiaomi/hm/health/device/HmSelectEarbudActivity$a", "", "", "a", "b", "c", "type", "titleRes", "imgRes", "Lcom/xiaomi/hm/health/device/HmSelectEarbudActivity$a;", GoogleApiAvailabilityLight.a, "", "toString", "hashCode", "other", "", "equals", LogUtil.I, "h", "()I", "g", "f", "<init>", "(III)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class DeviceItem {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final int type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int titleRes;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private final int imgRes;

        public DeviceItem(int i, int i2, int i3) {
            this.type = i;
            this.titleRes = i2;
            this.imgRes = i3;
        }

        public static /* synthetic */ DeviceItem e(DeviceItem deviceItem, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = deviceItem.type;
            }
            if ((i4 & 2) != 0) {
                i2 = deviceItem.titleRes;
            }
            if ((i4 & 4) != 0) {
                i3 = deviceItem.imgRes;
            }
            return deviceItem.d(i, i2, i3);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getTitleRes() {
            return this.titleRes;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getImgRes() {
            return this.imgRes;
        }

        @NotNull
        public final DeviceItem d(int type, int titleRes, int imgRes) {
            return new DeviceItem(type, titleRes, imgRes);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceItem)) {
                return false;
            }
            DeviceItem deviceItem = (DeviceItem) other;
            return this.type == deviceItem.type && this.titleRes == deviceItem.titleRes && this.imgRes == deviceItem.imgRes;
        }

        public final int f() {
            return this.imgRes;
        }

        public final int g() {
            return this.titleRes;
        }

        public final int h() {
            return this.type;
        }

        public int hashCode() {
            return (((this.type * 31) + this.titleRes) * 31) + this.imgRes;
        }

        @NotNull
        public String toString() {
            return "DeviceItem(type=" + this.type + ", titleRes=" + this.titleRes + ", imgRes=" + this.imgRes + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"com/xiaomi/hm/health/device/HmSelectEarbudActivity$b", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/xiaomi/hm/health/device/HmSelectEarbudActivity$a;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "helper", "item", "", "a", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class b extends BaseQuickAdapter<DeviceItem, BaseViewHolder> {
        public b() {
            super(R.layout.layout_select_headset_item);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void convert(@NotNull BaseViewHolder helper, @NotNull DeviceItem item) {
            int i = R.id.watch_img;
            ((ImageView) helper.getView(i)).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            helper.setImageResource(i, item.f());
            helper.setText(R.id.watch_tv, item.g());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/HmSelectEarbudActivity$b;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<b> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b getA() {
            return new b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/PairedDeviceViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<PairedDeviceViewModel> {
        public d() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(HmSelectEarbudActivity hmSelectEarbudActivity, List list) {
            hmSelectEarbudActivity.i(list);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PairedDeviceViewModel getA() {
            PairedDeviceViewModel pairedDeviceViewModel = (PairedDeviceViewModel) new ViewModelProvider(HmSelectEarbudActivity.this).get(PairedDeviceViewModel.class);
            MutableLiveData<List<PairedDevice>> deviceListLiveData = pairedDeviceViewModel.getDeviceListLiveData();
            final HmSelectEarbudActivity hmSelectEarbudActivity = HmSelectEarbudActivity.this;
            deviceListLiveData.observe(hmSelectEarbudActivity, new Observer() { // from class: com.xiaomi.hm.health.device.q
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    HmSelectEarbudActivity.d.c(hmSelectEarbudActivity, (List) obj);
                }
            });
            return pairedDeviceViewModel;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HmSelectEarbudActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.HmSelectEarbudActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceXNavigator getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), qualifier, objArr);
            }
        });
        this.pairedMozartViewModel = LazyKt__LazyJVMKt.lazy(new d());
    }

    private final HMDeviceSource e(int type) {
        if (type == 0) {
            return HMDeviceSource.EARBUD_CHOPIN;
        }
        if (type == 1) {
            return HMDeviceSource.OTHER_MOZART;
        }
        if (type != 2) {
            return type != 3 ? HMDeviceSource.VDEVICE : HMDeviceSource.OTHER_LULLABY;
        }
        return HMDeviceSource.OTHER_HAYDN;
    }

    private final DeviceXNavigator f() {
        return (DeviceXNavigator) this.deviceXNavigator.getValue();
    }

    private final b g() {
        return (b) this.mAdapter.getValue();
    }

    private final PairedDeviceViewModel h() {
        return (PairedDeviceViewModel) this.pairedMozartViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(List<PairedDevice> pairedDevices) {
        if (h().getSource() != HMDeviceSource.OTHER_MOZART) {
            f().startBindHeadSetNew(this, h().getSource());
            finish();
        } else if (pairedDevices.isEmpty()) {
            o();
        } else {
            n();
        }
    }

    private final void initView() {
        ActivitySelectEarbudBinding activitySelectEarbudBinding = this.binding;
        Objects.requireNonNull(activitySelectEarbudBinding);
        activitySelectEarbudBinding.rainbowTitleHeadset.setNavigationOnClickListener(new View.OnClickListener() { // from class: n74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HmSelectEarbudActivity.j(this.a, view);
            }
        });
        ActivitySelectEarbudBinding activitySelectEarbudBinding2 = this.binding;
        Objects.requireNonNull(activitySelectEarbudBinding2);
        activitySelectEarbudBinding2.deviceList.setLayoutManager(new LinearLayoutManager(this));
        ActivitySelectEarbudBinding activitySelectEarbudBinding3 = this.binding;
        Objects.requireNonNull(activitySelectEarbudBinding3);
        activitySelectEarbudBinding3.deviceList.setAdapter(g());
        g().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: o74
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                HmSelectEarbudActivity.k(this.a, baseQuickAdapter, view, i2);
            }
        });
        ArrayList arrayList = new ArrayList();
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportBindLullaby()) {
            arrayList.add(new DeviceItem(3, R.string.headset_lullaby, R.drawable.private_haydn_select_icon));
        }
        arrayList.add(new DeviceItem(2, R.string.headset_haydn, R.drawable.private_haydn_select_icon));
        arrayList.add(new DeviceItem(1, R.string.headset_mozart, R.drawable.icon_mozart));
        arrayList.add(new DeviceItem(0, R.string.earbud_chopin, R.drawable.icon_chopin));
        g().setNewData(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(HmSelectEarbudActivity hmSelectEarbudActivity, View view) {
        hmSelectEarbudActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(HmSelectEarbudActivity hmSelectEarbudActivity, BaseQuickAdapter baseQuickAdapter, View view, int i2) {
        DeviceItem item = hmSelectEarbudActivity.g().getItem(i2);
        if (item == null) {
            return;
        }
        int iH = item.h();
        if (iH == 0) {
            hmSelectEarbudActivity.l();
            return;
        }
        if (iH == 1 || iH == 2 || iH == 3) {
            HMDeviceSource hMDeviceSourceE = hmSelectEarbudActivity.e(iH);
            hmSelectEarbudActivity.h().setSource(hMDeviceSourceE);
            hmSelectEarbudActivity.m(hMDeviceSourceE);
        }
    }

    private final void l() {
        if (PhoneEnvActivity.testPhoneEnv((Context) this, true, 25)) {
            startActivityForResult(new Intent(this, (Class<?>) HmBindEarbudTipActivity.class), 1);
        } else {
            finish();
        }
    }

    private final void m(HMDeviceSource source) {
        if (PhoneEnvActivity.testPhoneEnv(this, true, source == HMDeviceSource.OTHER_MOZART ? 20 : 28, source)) {
            h().load();
        } else {
            finish();
        }
    }

    private final void n() {
        startActivityForResult(BindPairedHeadsetActivity.INSTANCE.newIntent(this, HMDeviceSource.OTHER_MOZART), 3);
    }

    private final void o() {
        startActivityForResult(BindHeadsetGuideActivity.INSTANCE.newIntent(this), 2);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == -1) {
            if (PhoneEnvActivity.testPhoneEnv((Context) this, true, 25)) {
                f().startBindEarbud(this);
            }
            finish();
        }
        if (requestCode == 2 && resultCode == -1) {
            f().startBindHeadSet(this);
            finish();
        }
        if (requestCode == 3) {
            if (resultCode == 2) {
                Analytics.recordEvent(new CountEventBuilder(StatEvent.BIND_SELECT_DEVICE_EXIT).setValue(StatEvent.BIND_SELECT_DEVICE_EXIT_REASON_BIND_HEADSET));
                f().startBindHeadSet(this);
            }
            if (resultCode != -1) {
                return;
            }
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        ActivitySelectEarbudBinding activitySelectEarbudBindingInflate = ActivitySelectEarbudBinding.inflate(getLayoutInflater());
        this.binding = activitySelectEarbudBindingInflate;
        Objects.requireNonNull(activitySelectEarbudBindingInflate);
        setContentView(activitySelectEarbudBindingInflate.getRoot());
        initView();
    }
}
