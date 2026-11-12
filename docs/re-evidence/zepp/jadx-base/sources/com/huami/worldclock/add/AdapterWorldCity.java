package com.huami.worldclock.add;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.worldclock.R;
import com.huami.worldclock.add.AdapterWorldCity;
import com.huami.worldclock.bean.AppType;
import com.huami.worldclock.bean.WorldClockCityBean;
import com.huami.worldclock.manager.WorldClockStrResHelper;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001)B\u0007¢\u0006\u0004\b'\u0010(J\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0016R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR6\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/huami/worldclock/add/AdapterWorldCity;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/worldclock/add/AdapterWorldCity$ViewHolderAddWorldCity;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holderAdd", "position", "", "onBindViewHolder", "Lcom/huami/worldclock/bean/AppType;", "a", "Lcom/huami/worldclock/bean/AppType;", "getAppType", "()Lcom/huami/worldclock/bean/AppType;", "setAppType", "(Lcom/huami/worldclock/bean/AppType;)V", "appType", "Landroid/view/View$OnClickListener;", "b", "Landroid/view/View$OnClickListener;", "getListener", "()Landroid/view/View$OnClickListener;", "setListener", "(Landroid/view/View$OnClickListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "Lcom/huami/worldclock/bean/WorldClockCityBean;", "value", "c", "Ljava/util/List;", "getCitys", "()Ljava/util/List;", "setCitys", "(Ljava/util/List;)V", "citys", "<init>", "()V", "ViewHolderAddWorldCity", "worldclock_release"}, k = 1, mv = {1, 5, 1})
public final class AdapterWorldCity extends RecyclerView.Adapter<ViewHolderAddWorldCity> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private View.OnClickListener listener;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private AppType appType = AppType.MIDONG;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private List<WorldClockCityBean> citys = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\u000b\u001a\u00020\u00068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/huami/worldclock/add/AdapterWorldCity$ViewHolderAddWorldCity;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/worldclock/bean/WorldClockCityBean;", LargeWatchSkinActivity.KEY_BEAN, "", "bindData", "Landroid/widget/TextView;", "a", "Lkotlin/Lazy;", "c", "()Landroid/widget/TextView;", "cityCountry", "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/worldclock/add/AdapterWorldCity;Landroid/view/View;)V", "worldclock_release"}, k = 1, mv = {1, 5, 1})
    public final class ViewHolderAddWorldCity extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Lazy cityCountry;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<TextView> {
            public final /* synthetic */ View a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view) {
                super(0);
                this.a = view;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TextView invoke() {
                return (TextView) this.a.findViewById(R.id.world_city);
            }
        }

        public ViewHolderAddWorldCity(View view) {
            super(view);
            this.cityCountry = LazyKt__LazyJVMKt.lazy(new a(view));
            view.setOnClickListener(new View.OnClickListener() { // from class: g7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AdapterWorldCity.ViewHolderAddWorldCity.b(adapterWorldCity, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(AdapterWorldCity adapterWorldCity, View view) {
            View.OnClickListener listener = adapterWorldCity.getListener();
            if (listener == null) {
                return;
            }
            listener.onClick(view);
        }

        private final TextView c() {
            return (TextView) this.cityCountry.getValue();
        }

        public final void bindData(@NotNull WorldClockCityBean bean) {
            Context context = this.itemView.getContext();
            if (context != null) {
                int city = WorldClockStrResHelper.INSTANCE.getCity(context, bean);
                c().setText(city == 0 ? "" : context.getString(city));
            }
            this.itemView.setTag(bean);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            iArr[AppType.MIDONG.ordinal()] = 1;
            iArr[AppType.MIFIT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public final AppType getAppType() {
        return this.appType;
    }

    @NotNull
    public final List<WorldClockCityBean> getCitys() {
        return this.citys;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.citys.size();
    }

    @Nullable
    public final View.OnClickListener getListener() {
        return this.listener;
    }

    public final void setAppType(@NotNull AppType appType) {
        this.appType = appType;
    }

    public final void setCitys(@NotNull List<WorldClockCityBean> list) {
        this.citys.clear();
        this.citys.addAll(list);
        notifyDataSetChanged();
    }

    public final void setListener(@Nullable View.OnClickListener onClickListener) {
        this.listener = onClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolderAddWorldCity holderAdd, int position) {
        holderAdd.bindData(this.citys.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolderAddWorldCity onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        int i2 = (i == 1 || i != 2) ? R.layout.item_world_city : R.layout.item_world_city_mi;
        return new ViewHolderAddWorldCity(LayoutInflater.from(parent.getContext()).inflate(i2, parent, false));
    }
}
