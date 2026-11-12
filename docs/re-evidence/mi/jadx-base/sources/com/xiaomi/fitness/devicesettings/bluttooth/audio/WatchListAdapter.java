package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.WatchListAdapter;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import defpackage.eui;
import defpackage.jni;
import defpackage.wkf;
import defpackage.wzi;
import defpackage.xc6;
import defpackage.zqi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001,BO\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002J\u001c\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020#H\u0016J\u001c\u0010(\u001a\u00020\r2\n\u0010)\u001a\u00060\u0002R\u00020\u00002\u0006\u0010*\u001a\u00020#H\u0016J\b\u0010+\u001a\u00020#H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchListAdapter$MusicListHolder;", "context", "Landroid/content/Context;", "showSelect", "", "dataList", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchRecordBean;", "selectDataList", "onItemClick", "Lkotlin/Function1;", "", "<init>", "(Landroid/content/Context;ZLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getShowSelect", "()Z", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "getSelectDataList", "setSelectDataList", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "secondsToStr", "", "seconds", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "holder", "position", "getItemCount", "MusicListHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WatchListAdapter extends RecyclerView.Adapter<MusicListHolder> {

    @NotNull
    private Context context;

    @NotNull
    private List<WatchRecordBean> dataList;

    @Nullable
    private Function1<? super WatchRecordBean, Unit> onItemClick;

    @NotNull
    private List<WatchRecordBean> selectDataList;
    private final boolean showSelect;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0016\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R*\u0010\u0019\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R*\u0010\u001d\u001a\n \u000f*\u0004\u0018\u00010\u001c0\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchListAdapter$MusicListHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchRecordBean;", "watchRecordBean", "", "bind", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchRecordBean;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "nameView", "Landroid/widget/TextView;", "getNameView", "()Landroid/widget/TextView;", "setNameView", "(Landroid/widget/TextView;)V", "timeView", "getTimeView", "setTimeView", "durationView", "getDurationView", "setDurationView", "Landroid/widget/ImageView;", "selectStatusView", "Landroid/widget/ImageView;", "getSelectStatusView", "()Landroid/widget/ImageView;", "setSelectStatusView", "(Landroid/widget/ImageView;)V", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/WatchListAdapter;Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class MusicListHolder extends RecyclerView.d0 {
        private TextView durationView;
        private TextView nameView;
        private ImageView selectStatusView;
        final /* synthetic */ WatchListAdapter this$0;
        private TextView timeView;

        @NotNull
        private View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MusicListHolder(@NotNull WatchListAdapter watchListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = watchListAdapter;
            this.view = view;
            this.nameView = (TextView) view.findViewById(zqi.C5);
            this.timeView = (TextView) this.view.findViewById(zqi.L9);
            this.durationView = (TextView) this.view.findViewById(zqi.x2);
            this.selectStatusView = (ImageView) this.view.findViewById(zqi.P7);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(WatchListAdapter this$0, WatchRecordBean watchRecordBean, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(watchRecordBean, "$watchRecordBean");
            Function1<WatchRecordBean, Unit> onItemClick = this$0.getOnItemClick();
            if (onItemClick != null) {
                onItemClick.invoke2(watchRecordBean);
            }
        }

        public final void bind(@NotNull final WatchRecordBean watchRecordBean) {
            String string;
            Intrinsics.checkNotNullParameter(watchRecordBean, "watchRecordBean");
            wkf file = watchRecordBean.getFile();
            TextView textView = this.nameView;
            String id = file.c.c;
            Intrinsics.checkNotNullExpressionValue(id, "id");
            textView.setText(UtilsKt.simpleRecordFileName(id));
            xc6.d("WatchListAdapter bind timestamp:" + file.f + " " + System.currentTimeMillis());
            this.timeView.setText(TimeUtils.formatDate("yyyy/MM/dd HH:mm", Long.valueOf(file.f)));
            this.durationView.setText(this.this$0.secondsToStr(file.g));
            View view = this.view;
            final WatchListAdapter watchListAdapter = this.this$0;
            view.setOnClickListener(new View.OnClickListener() { // from class: c6r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    WatchListAdapter.MusicListHolder.bind$lambda$0(watchListAdapter, watchRecordBean, view2);
                }
            });
            if (this.this$0.getShowSelect()) {
                ImageView selectStatusView = this.selectStatusView;
                Intrinsics.checkNotNullExpressionValue(selectStatusView, "selectStatusView");
                ExtUtilsKt.setVisible(selectStatusView, true);
                this.view.setEnabled(true ^ watchRecordBean.isPull());
                this.view.setAlpha(watchRecordBean.isPull() ? 0.6f : 1.0f);
                if (watchRecordBean.isPull()) {
                    this.selectStatusView.setImageResource(jni.i);
                    this.selectStatusView.setContentDescription(ResourceExtKt.getString(wzi.z2));
                    return;
                }
                this.selectStatusView.setImageResource(this.this$0.getSelectDataList().contains(watchRecordBean) ? jni.i : jni.j);
                ImageView imageView = this.selectStatusView;
                if (this.this$0.getSelectDataList().contains(watchRecordBean)) {
                    string = ResourceExtKt.getString(wzi.z2);
                } else {
                    string = this.this$0.getContext().getString(wzi.V5);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                }
                imageView.setContentDescription(string);
            }
        }

        public final TextView getDurationView() {
            return this.durationView;
        }

        public final TextView getNameView() {
            return this.nameView;
        }

        public final ImageView getSelectStatusView() {
            return this.selectStatusView;
        }

        public final TextView getTimeView() {
            return this.timeView;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }

        public final void setDurationView(TextView textView) {
            this.durationView = textView;
        }

        public final void setNameView(TextView textView) {
            this.nameView = textView;
        }

        public final void setSelectStatusView(ImageView imageView) {
            this.selectStatusView = imageView;
        }

        public final void setTimeView(TextView textView) {
            this.timeView = textView;
        }

        public final void setView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.view = view;
        }
    }

    public /* synthetic */ WatchListAdapter(Context context, boolean z, List list, List list2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? false : z, list, (i & 8) != 0 ? new ArrayList() : list2, (i & 16) != 0 ? null : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String secondsToStr(int seconds) {
        int i = seconds / 3600;
        int i2 = (seconds % 3600) / 60;
        int i3 = seconds % 60;
        if (i <= 0) {
            return i2 + "m" + i3 + "s";
        }
        return i + "h" + i2 + "m" + i3 + "s";
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final List<WatchRecordBean> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    @Nullable
    public final Function1<WatchRecordBean, Unit> getOnItemClick() {
        return this.onItemClick;
    }

    @NotNull
    public final List<WatchRecordBean> getSelectDataList() {
        return this.selectDataList;
    }

    public final boolean getShowSelect() {
        return this.showSelect;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setDataList(@NotNull List<WatchRecordBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public final void setOnItemClick(@Nullable Function1<? super WatchRecordBean, Unit> function1) {
        this.onItemClick = function1;
    }

    public final void setSelectDataList(@NotNull List<WatchRecordBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.selectDataList = list;
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
        View viewInflate = LayoutInflater.from(this.context).inflate(eui.X0, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new MusicListHolder(this, viewInflate);
    }

    public WatchListAdapter(@NotNull Context context, boolean z, @NotNull List<WatchRecordBean> dataList, @NotNull List<WatchRecordBean> selectDataList, @Nullable Function1<? super WatchRecordBean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(selectDataList, "selectDataList");
        this.context = context;
        this.showSelect = z;
        this.dataList = dataList;
        this.selectDataList = selectDataList;
        this.onItemClick = function1;
    }
}
