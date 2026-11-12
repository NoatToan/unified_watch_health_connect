package com.xiaomi.fitness.devicesettings.bluttooth.music;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicListAdapter;
import com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicListBean;
import defpackage.eui;
import defpackage.zqi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001#B;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u001c\u0010\u001f\u001a\u00020\u000b2\n\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\u001eH\u0016J\b\u0010\"\u001a\u00020\u001eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R.\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicListAdapter$MusicListHolder;", "context", "Landroid/content/Context;", "dataList", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicListBean;", "onItemClick", "Lkotlin/Function2;", "", "", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function2;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "getOnItemClick", "()Lkotlin/jvm/functions/Function2;", "setOnItemClick", "(Lkotlin/jvm/functions/Function2;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "MusicListHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MusicListAdapter extends RecyclerView.Adapter<MusicListHolder> {

    @NotNull
    private Context context;

    @NotNull
    private List<MusicListBean> dataList;

    @Nullable
    private Function2<? super Boolean, ? super MusicListBean, Unit> onItemClick;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0016\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R*\u0010\u0019\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R*\u0010\u001c\u001a\n \u000f*\u0004\u0018\u00010\u00070\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\t\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\r¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicListAdapter$MusicListHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicListBean;", "musicListBean", "", "bind", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicListBean;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "nameView", "Landroid/widget/TextView;", "getNameView", "()Landroid/widget/TextView;", "setNameView", "(Landroid/widget/TextView;)V", "descView", "getDescView", "setDescView", "checkView", "getCheckView", "setCheckView", "nextView", "getNextView", "setNextView", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicListAdapter;Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class MusicListHolder extends RecyclerView.d0 {
        private TextView checkView;
        private TextView descView;
        private TextView nameView;
        private View nextView;
        final /* synthetic */ MusicListAdapter this$0;

        @NotNull
        private View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MusicListHolder(@NotNull MusicListAdapter musicListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = musicListAdapter;
            this.view = view;
            this.nameView = (TextView) view.findViewById(zqi.C5);
            this.descView = (TextView) this.view.findViewById(zqi.d1);
            this.checkView = (TextView) this.view.findViewById(zqi.v0);
            this.nextView = this.view.findViewById(zqi.K5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(MusicListBean musicListBean, MusicListHolder this$0, MusicListAdapter this$1, View view) {
            Intrinsics.checkNotNullParameter(musicListBean, "$musicListBean");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            if (musicListBean.getPageType() == 0) {
                TextView textView = this$0.checkView;
                textView.setSelected(!textView.isSelected());
                musicListBean.setSelect(this$0.checkView.isSelected());
            }
            Function2<Boolean, MusicListBean, Unit> onItemClick = this$1.getOnItemClick();
            if (onItemClick != null) {
                onItemClick.invoke(Boolean.valueOf(musicListBean.getPageType() != 0), musicListBean);
            }
        }

        public final void bind(@NotNull final MusicListBean musicListBean) {
            Intrinsics.checkNotNullParameter(musicListBean, "musicListBean");
            this.nameView.setText(musicListBean.getName());
            this.descView.setText(musicListBean.getDesc());
            this.checkView.setSelected(musicListBean.getIsSelect());
            if (musicListBean.getPageType() == 0) {
                this.checkView.setVisibility(0);
                this.nextView.setVisibility(8);
            } else {
                this.checkView.setVisibility(8);
                this.nextView.setVisibility(0);
            }
            View view = this.view;
            final MusicListAdapter musicListAdapter = this.this$0;
            view.setOnClickListener(new View.OnClickListener() { // from class: fbg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MusicListAdapter.MusicListHolder.bind$lambda$0(musicListBean, this, musicListAdapter, view2);
                }
            });
        }

        public final TextView getCheckView() {
            return this.checkView;
        }

        public final TextView getDescView() {
            return this.descView;
        }

        public final TextView getNameView() {
            return this.nameView;
        }

        public final View getNextView() {
            return this.nextView;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }

        public final void setCheckView(TextView textView) {
            this.checkView = textView;
        }

        public final void setDescView(TextView textView) {
            this.descView = textView;
        }

        public final void setNameView(TextView textView) {
            this.nameView = textView;
        }

        public final void setNextView(View view) {
            this.nextView = view;
        }

        public final void setView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.view = view;
        }
    }

    public /* synthetic */ MusicListAdapter(Context context, List list, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, list, (i & 4) != 0 ? null : function2);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final List<MusicListBean> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    @Nullable
    public final Function2<Boolean, MusicListBean, Unit> getOnItemClick() {
        return this.onItemClick;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setDataList(@NotNull List<MusicListBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public final void setOnItemClick(@Nullable Function2<? super Boolean, ? super MusicListBean, Unit> function2) {
        this.onItemClick = function2;
    }

    public MusicListAdapter(@NotNull Context context, @NotNull List<MusicListBean> dataList, @Nullable Function2<? super Boolean, ? super MusicListBean, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.context = context;
        this.dataList = dataList;
        this.onItemClick = function2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull MusicListHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.dataList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public MusicListHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(eui.a1, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new MusicListHolder(this, viewInflate);
    }
}
