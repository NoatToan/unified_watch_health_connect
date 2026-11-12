package com.xiaomi.hm.health.device.earbud.activity;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.xiaomi.hm.health.baseui.widget.ItemView;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.device.BaseEarbudDeviceActivity;
import com.xiaomi.hm.health.device.earbud.activity.HmEarbudOperSettingActivity;
import com.xiaomi.hm.health.device.earbud.view.EarbudImageView;
import com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u001d\u0010\u0014\u001a\u00020\u00028T@\u0014X\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/activity/HmEarbudOperSettingActivity;", "Lcom/xiaomi/hm/health/device/BaseEarbudDeviceActivity;", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", "", "initView", "o", "", "choiceValue", "", "isLeft", "isDouble", "m", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "observeData", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "getMViewModel", "()Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", "mViewModel", "<init>", "()V", "Companion", "a", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HmEarbudOperSettingActivity extends BaseEarbudDeviceActivity<EarbudDeviceViewModel> {

    @NotNull
    private static final List<OperItem> e = CollectionsKt__CollectionsKt.listOf((Object[]) new OperItem[]{new OperItem((byte) 1, R.string.earbud_oper_start_pause), new OperItem((byte) 5, R.string.earbud_oper_next), new OperItem((byte) 4, R.string.earbud_oper_pre), new OperItem((byte) 0, R.string.earbud_oper_disable)});

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(EarbudDeviceViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudOperSettingActivity$special$$inlined$viewModels$default$2
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
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudOperSettingActivity$special$$inlined$viewModels$default$1
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

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.earbud.activity.HmEarbudOperSettingActivity$a, reason: from toString */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"com/xiaomi/hm/health/device/earbud/activity/HmEarbudOperSettingActivity$a", "", "", "a", "", "b", "value", "nameRes", "Lcom/xiaomi/hm/health/device/earbud/activity/HmEarbudOperSettingActivity$a;", "c", "", "toString", "hashCode", "other", "", "equals", "B", "f", "()B", LogUtil.I, "e", "()I", "<init>", "(BI)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class OperItem {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private final byte value;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private final int nameRes;

        public OperItem(byte b, @StringRes int i) {
            this.value = b;
            this.nameRes = i;
        }

        public static /* synthetic */ OperItem d(OperItem operItem, byte b, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                b = operItem.value;
            }
            if ((i2 & 2) != 0) {
                i = operItem.nameRes;
            }
            return operItem.c(b, i);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final byte getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getNameRes() {
            return this.nameRes;
        }

        @NotNull
        public final OperItem c(byte value, @StringRes int nameRes) {
            return new OperItem(value, nameRes);
        }

        public final int e() {
            return this.nameRes;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OperItem)) {
                return false;
            }
            OperItem operItem = (OperItem) other;
            return this.value == operItem.value && this.nameRes == operItem.nameRes;
        }

        public final byte f() {
            return this.value;
        }

        public int hashCode() {
            return (this.value * 31) + this.nameRes;
        }

        @NotNull
        public String toString() {
            byte b = this.value;
            return "OperItem(value=" + ((int) b) + ", nameRes=" + this.nameRes + ")";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            HmEarbudOperSettingActivity.this.getMViewModel().resetOperSettings();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<View, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            List<Byte> value = HmEarbudOperSettingActivity.this.getMViewModel().getLeftOperSettingData().getValue();
            if (value == null) {
                return;
            }
            HmEarbudOperSettingActivity.this.m(value.get(0).byteValue(), true, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<View, Unit> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            List<Byte> value = HmEarbudOperSettingActivity.this.getMViewModel().getLeftOperSettingData().getValue();
            if (value == null) {
                return;
            }
            HmEarbudOperSettingActivity.this.m(value.get(1).byteValue(), true, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<View, Unit> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            List<Byte> value = HmEarbudOperSettingActivity.this.getMViewModel().getRightOperSettingData().getValue();
            if (value == null) {
                return;
            }
            HmEarbudOperSettingActivity.this.m(value.get(0).byteValue(), false, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<View, Unit> {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            List<Byte> value = HmEarbudOperSettingActivity.this.getMViewModel().getRightOperSettingData().getValue();
            if (value == null) {
                return;
            }
            HmEarbudOperSettingActivity.this.m(value.get(1).byteValue(), false, true);
        }
    }

    private final void initView() {
        BTStatusFragment.newInstance(R.id.status_content, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudOperSettingActivity.initView.1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            @NotNull
            public HMDeviceType getHMDeviceType() {
                return HMDeviceType.EARBUD;
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                super.onEnableChange(enable);
                HmEarbudOperSettingActivity.this.o();
            }
        });
        ExtKt.smartClick$default((TextView) findViewById(R.id.btn_reset), 0L, new b(), 1, null);
        ExtKt.smartClick$default((ItemView) findViewById(R.id.left_click), 0L, new c(), 1, null);
        ExtKt.smartClick$default((ItemView) findViewById(R.id.left_double_click), 0L, new d(), 1, null);
        ExtKt.smartClick$default((ItemView) findViewById(R.id.right_click), 0L, new e(), 1, null);
        ExtKt.smartClick$default((ItemView) findViewById(R.id.right_double_click), 0L, new f(), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(HmEarbudOperSettingActivity hmEarbudOperSettingActivity, HmEarbudDevice hmEarbudDevice) {
        hmEarbudOperSettingActivity.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(HmEarbudOperSettingActivity hmEarbudOperSettingActivity, List list) {
        if (list == null) {
            return;
        }
        ItemView itemView = (ItemView) hmEarbudOperSettingActivity.findViewById(R.id.left_click);
        Resources resources = hmEarbudOperSettingActivity.getResources();
        int i = R.array.earbud_opers;
        itemView.setValue(resources.getStringArray(i)[((Number) list.get(0)).byteValue()]);
        ((ItemView) hmEarbudOperSettingActivity.findViewById(R.id.left_double_click)).setValue(hmEarbudOperSettingActivity.getResources().getStringArray(i)[((Number) list.get(1)).byteValue()]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(HmEarbudOperSettingActivity hmEarbudOperSettingActivity, List list) {
        if (list == null) {
            return;
        }
        ItemView itemView = (ItemView) hmEarbudOperSettingActivity.findViewById(R.id.right_click);
        Resources resources = hmEarbudOperSettingActivity.getResources();
        int i = R.array.earbud_opers;
        itemView.setValue(resources.getStringArray(i)[((Number) list.get(0)).byteValue()]);
        ((ItemView) hmEarbudOperSettingActivity.findViewById(R.id.right_double_click)).setValue(hmEarbudOperSettingActivity.getResources().getStringArray(i)[((Number) list.get(1)).byteValue()]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(int choiceValue, final boolean isLeft, final boolean isDouble) {
        int i = R.string.earbud_oper_dialog_title;
        Object[] objArr = new Object[2];
        objArr[0] = getString(isLeft ? R.string.earbud_left_ear : R.string.earbud_right_ear);
        objArr[1] = getString(isDouble ? R.string.earbud_double_click : R.string.earbud_click);
        String string = getString(i, objArr);
        List<OperItem> list = e;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(getString(((OperItem) it2.next()).e()));
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        AlertDialogFragment.ChoiceItems items = new AlertDialogFragment.ChoiceItems().setItems((String[]) array);
        Iterator<OperItem> it3 = e.iterator();
        int i2 = 0;
        while (it3.hasNext()) {
            if (it3.next().f() == ((byte) choiceValue)) {
                new AlertDialogFragment.Builder(this).setCancelable(true).setTitle(string).setSingleChoiceItems(items.setItemChoice(i2), new DialogInterface.OnClickListener() { // from class: m64
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        HmEarbudOperSettingActivity.n(this.a, isLeft, isDouble, dialogInterface, i3);
                    }
                }).show(getSupportFragmentManager());
            }
            i2++;
        }
        i2 = -1;
        new AlertDialogFragment.Builder(this).setCancelable(true).setTitle(string).setSingleChoiceItems(items.setItemChoice(i2), new DialogInterface.OnClickListener() { // from class: m64
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                HmEarbudOperSettingActivity.n(this.a, isLeft, isDouble, dialogInterface, i3);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(HmEarbudOperSettingActivity hmEarbudOperSettingActivity, boolean z, boolean z2, DialogInterface dialogInterface, int i) {
        hmEarbudOperSettingActivity.getMViewModel().updateOperSettings(e.get(i).f(), z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        HmEarbudDevice value = getMViewModel().getDeviceData().getValue();
        if (value == null) {
            return;
        }
        int i = R.id.device_img;
        ((EarbudImageView) findViewById(i)).setLeftConnect(value.isConnected());
        ((EarbudImageView) findViewById(i)).setRightConnect(value.getRightDevice().isConnected());
        ((ItemView) findViewById(R.id.left_click)).setEnabled(value.isConnected());
        ((ItemView) findViewById(R.id.left_double_click)).setEnabled(value.isConnected());
        ((ItemView) findViewById(R.id.right_click)).setEnabled(value.getRightDevice().isConnected());
        ((ItemView) findViewById(R.id.right_double_click)).setEnabled(value.getRightDevice().isConnected());
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity
    @NotNull
    public EarbudDeviceViewModel getMViewModel() {
        return (EarbudDeviceViewModel) this.mViewModel.getValue();
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity
    public void observeData() {
        super.observeData();
        getMViewModel().refreshOperSettings();
        getMViewModel().getDeviceData().observe(this, new Observer() { // from class: n64
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudOperSettingActivity.j(this.a, (HmEarbudDevice) obj);
            }
        });
        getMViewModel().getLeftOperSettingData().observe(this, new Observer() { // from class: o64
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudOperSettingActivity.k(this.a, (List) obj);
            }
        });
        getMViewModel().getRightOperSettingData().observe(this, new Observer() { // from class: p64
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudOperSettingActivity.l(this.a, (List) obj);
            }
        });
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earbud_oper_setting);
        getString(R.string.earbud_operation);
        initView();
        observeData();
    }
}
