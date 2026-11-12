package com.xiaomi.hm.health.device.earbud.fragment.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.widget.wheelview.WheelView;
import com.loc.z;
import com.xiaomi.hm.health.device.earbud.adapter.PlayTimeAdapter;
import com.xiaomi.hm.health.device.earbud.fragment.dialog.EarbudPlayTimeDialog;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014J\b\u0010\n\u001a\u00020\tH\u0014R+\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0017\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\r\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR?\u0010*\u001a\u001f\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006."}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/fragment/dialog/EarbudPlayTimeDialog;", "Lcom/huami/android/design/dialog/BaseDialogFragment;", "", "i", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "hasPadding", "Landroid/view/View;", "initView", "Lcom/huami/widget/wheelview/WheelView;", "<set-?>", "e", "Lkotlin/properties/ReadWriteProperty;", "f", "()Lcom/huami/widget/wheelview/WheelView;", z.j, "(Lcom/huami/widget/wheelview/WheelView;)V", "mWheelView", "Lcom/xiaomi/hm/health/device/earbud/adapter/PlayTimeAdapter;", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/earbud/adapter/PlayTimeAdapter;", "mAdapter", "", "g", LogUtil.I, "getCurrentValue", "()I", "setCurrentValue", "(I)V", "currentValue", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "minute", "h", "Lkotlin/jvm/functions/Function1;", "getOnValueSelect", "()Lkotlin/jvm/functions/Function1;", "setOnValueSelect", "(Lkotlin/jvm/functions/Function1;)V", "onValueSelect", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudPlayTimeDialog extends BaseDialogFragment {
    public static final /* synthetic */ KProperty<Object>[] i;
    private static final int j;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty mWheelView = Delegates.INSTANCE.notNull();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAdapter = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int currentValue;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Integer, Unit> onValueSelect;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/adapter/PlayTimeAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<PlayTimeAdapter> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PlayTimeAdapter invoke() {
            return new PlayTimeAdapter(EarbudPlayTimeDialog.this.requireContext(), EarbudPlayTimeDialog.this.f());
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[0] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(EarbudPlayTimeDialog.class), "mWheelView", "getMWheelView()Lcom/huami/widget/wheelview/WheelView;"));
        i = kPropertyArr;
        INSTANCE = new Companion(null);
        j = DeviceXFunctionsKt.getBuildConfigApi().isSupportChopinSetTestTime() ? 1 : 15;
    }

    private final PlayTimeAdapter e() {
        return (PlayTimeAdapter) this.mAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WheelView f() {
        return (WheelView) this.mWheelView.getValue(this, i[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(EarbudPlayTimeDialog earbudPlayTimeDialog, View view) {
        earbudPlayTimeDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(EarbudPlayTimeDialog earbudPlayTimeDialog, View view) {
        Function1<Integer, Unit> onValueSelect = earbudPlayTimeDialog.getOnValueSelect();
        if (onValueSelect != null) {
            onValueSelect.invoke(Integer.valueOf(earbudPlayTimeDialog.e().getCurrentValue()));
        }
        earbudPlayTimeDialog.dismiss();
    }

    private final void i() {
        f().setVisibleItems(5).setCenterDrawable(R.drawable.wheel_custom_val_white_1);
        f().setStyle(WheelView.Style.LINE);
        f().setViewAdapter(e());
        f().setCenterBgColor(-1);
        f().setCurrentItem(this.currentValue / j);
    }

    private final void j(WheelView wheelView) {
        this.mWheelView.setValue(this, i[0], wheelView);
    }

    public void _$_clearFindViewByIdCache() {
    }

    public final int getCurrentValue() {
        return this.currentValue;
    }

    @Nullable
    public final Function1<Integer, Unit> getOnValueSelect() {
        return this.onValueSelect;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @NotNull
    public View initView() {
        View viewInflate = LayoutInflater.from(requireActivity()).inflate(R.layout.dialog_earbud_play_time, (ViewGroup) null);
        j((WheelView) viewInflate.findViewById(R.id.time_wheel));
        viewInflate.findViewById(R.id.btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: jf1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EarbudPlayTimeDialog.g(this.a, view);
            }
        });
        viewInflate.findViewById(R.id.btn_save).setOnClickListener(new View.OnClickListener() { // from class: if1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EarbudPlayTimeDialog.h(this.a, view);
            }
        });
        i();
        return viewInflate;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setCancelable(false);
    }

    public final void setCurrentValue(int i2) {
        this.currentValue = i2;
    }

    public final void setOnValueSelect(@Nullable Function1<? super Integer, Unit> function1) {
        this.onValueSelect = function1;
    }
}
