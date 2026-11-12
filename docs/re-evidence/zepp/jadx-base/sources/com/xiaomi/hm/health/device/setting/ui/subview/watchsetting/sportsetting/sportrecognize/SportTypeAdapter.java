package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumArray;
import com.huami.devicex.R;
import com.huami.sky.lib.constant.WebConstant;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportTypeAdapter;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\\\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012K\u0010$\u001aG\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0004\b*\u0010+J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014Rg\u0010$\u001aG\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\f0\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001d\u0010)\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001e\u0010(¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/sportrecognize/SportTypeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/sportrecognize/SportTypeViewHolder;", "Lorg/koin/core/component/KoinComponent;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;", "a", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;", "getEnumArray", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;", "setEnumArray", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;)V", "enumArray", "Lkotlin/Function3;", "Landroidx/appcompat/widget/SwitchCompat;", "Lkotlin/ParameterName;", "name", WebConstant.QueryParam.SWITCH, "type", "", "enable", "b", "Lkotlin/jvm/functions/Function3;", "getListener", "()Lkotlin/jvm/functions/Function3;", "setListener", "(Lkotlin/jvm/functions/Function3;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/sportrecognize/SportTypeDescApi;", "c", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sportsetting/sportrecognize/SportTypeDescApi;", "sportTypeDescApi", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;Lkotlin/jvm/functions/Function3;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SportTypeAdapter extends RecyclerView.Adapter<SportTypeViewHolder> implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private EnumArray enumArray;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Function3<? super SwitchCompat, ? super Integer, ? super Boolean, Unit> listener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportTypeDescApi;

    /* JADX WARN: Multi-variable type inference failed */
    public SportTypeAdapter(@NotNull EnumArray enumArray, @NotNull Function3<? super SwitchCompat, ? super Integer, ? super Boolean, Unit> function3) {
        this.enumArray = enumArray;
        this.listener = function3;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.sportTypeDescApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<SportTypeDescApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportTypeAdapter$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sportsetting.sportrecognize.SportTypeDescApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SportTypeDescApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(SportTypeDescApi.class), qualifier, objArr);
            }
        });
    }

    private final SportTypeDescApi b() {
        return (SportTypeDescApi) this.sportTypeDescApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(SportTypeAdapter sportTypeAdapter, int i, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            sportTypeAdapter.getListener().invoke((SwitchCompat) compoundButton, Integer.valueOf(i), Boolean.valueOf(z));
        }
    }

    @NotNull
    public final EnumArray getEnumArray() {
        return this.enumArray;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        return this.enumArray.getEnums().size();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final Function3<SwitchCompat, Integer, Boolean, Unit> getListener() {
        return this.listener;
    }

    public final void setEnumArray(@NotNull EnumArray enumArray) {
        this.enumArray = enumArray;
    }

    public final void setListener(@NotNull Function3<? super SwitchCompat, ? super Integer, ? super Boolean, Unit> function3) {
        this.listener = function3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SportTypeViewHolder holder, int position) {
        final int iIntValue = this.enumArray.getEnums().get(position).intValue();
        holder.getTypeTv().setText(b().getDesc(iIntValue));
        holder.getEnableSwitch().setChecked(this.enumArray.getValues().contains(Integer.valueOf(iIntValue)));
        holder.getEnableSwitch().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: vd7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SportTypeAdapter.c(this.a, iIntValue, compoundButton, z);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SportTypeViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new SportTypeViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sport_type, parent, false));
    }
}
