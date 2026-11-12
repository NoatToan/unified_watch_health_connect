package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.vo.CommonLanguageConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/adapter/CommonLanguageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/adapter/CommonLanguageViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/vo/CommonLanguageConfig;", "a", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/vo/CommonLanguageConfig;", "getLanguageConfig", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/vo/CommonLanguageConfig;", "setLanguageConfig", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/vo/CommonLanguageConfig;)V", "languageConfig", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/adapter/CommonLanguageListener;", "b", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/adapter/CommonLanguageListener;", "getListener", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/adapter/CommonLanguageListener;", "setListener", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/adapter/CommonLanguageListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/vo/CommonLanguageConfig;Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/language/adapter/CommonLanguageListener;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class CommonLanguageAdapter extends RecyclerView.Adapter<CommonLanguageViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private CommonLanguageConfig languageConfig;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private CommonLanguageListener listener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(1);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            CommonLanguageAdapter.this.getLanguageConfig().setCurrIndex(this.b);
            CommonLanguageAdapter.this.getListener().onSelect(CommonLanguageAdapter.this.getLanguageConfig());
            CommonLanguageAdapter.this.notifyDataSetChanged();
        }
    }

    public /* synthetic */ CommonLanguageAdapter(CommonLanguageConfig commonLanguageConfig, CommonLanguageListener commonLanguageListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CommonLanguageConfig(null, 0, null, 7, null) : commonLanguageConfig, commonLanguageListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.languageConfig.getLanguageKeys().size();
    }

    @NotNull
    public final CommonLanguageConfig getLanguageConfig() {
        return this.languageConfig;
    }

    @NotNull
    public final CommonLanguageListener getListener() {
        return this.listener;
    }

    public final void setLanguageConfig(@NotNull CommonLanguageConfig commonLanguageConfig) {
        this.languageConfig = commonLanguageConfig;
    }

    public final void setListener(@NotNull CommonLanguageListener commonLanguageListener) {
        this.listener = commonLanguageListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull CommonLanguageViewHolder holder, int position) {
        String strInvoke;
        int iIntValue = this.languageConfig.getLanguageKeys().get(position).intValue();
        TextView languageTv = holder.getLanguageTv();
        Function1<Integer, String> toDesc = this.languageConfig.getToDesc();
        String str = "";
        if (toDesc != null && (strInvoke = toDesc.invoke(Integer.valueOf(iIntValue))) != null) {
            str = strInvoke;
        }
        languageTv.setText(str);
        ExtKt.setVisible$default(holder.getSelectIv(), position == this.languageConfig.getCurrIndex(), false, 2, null);
        ExtKt.smartClick$default(holder.getCom.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY java.lang.String(), 0L, new a(position), 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public CommonLanguageViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new CommonLanguageViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_common_language, parent, false));
    }

    public CommonLanguageAdapter(@NotNull CommonLanguageConfig commonLanguageConfig, @NotNull CommonLanguageListener commonLanguageListener) {
        this.languageConfig = commonLanguageConfig;
        this.listener = commonLanguageListener;
    }
}
