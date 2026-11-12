package com.xiaomi.fitness.devicesettings.bluttooth.music;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.devicesettings.bluttooth.music.bean.MusicBean;
import defpackage.eui;
import defpackage.jni;
import defpackage.wzi;
import defpackage.zqi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushResultAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushResultAdapter$MusicPushResultHolder;", "context", "Landroid/content/Context;", "dataList", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemCount", "MusicPushResultHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MusicPushResultAdapter extends RecyclerView.Adapter<MusicPushResultHolder> {

    @NotNull
    private Context context;

    @NotNull
    private List<MusicBean> dataList;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0016\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R*\u0010\u001a\u001a\n \u000f*\u0004\u0018\u00010\u00190\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushResultAdapter$MusicPushResultHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;", "musicBean", "", "bind", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/bean/MusicBean;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "nameView", "Landroid/widget/TextView;", "getNameView", "()Landroid/widget/TextView;", "setNameView", "(Landroid/widget/TextView;)V", "descView", "getDescView", "setDescView", "Landroid/widget/ImageView;", "nextView", "Landroid/widget/ImageView;", "getNextView", "()Landroid/widget/ImageView;", "setNextView", "(Landroid/widget/ImageView;)V", "<init>", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/music/MusicPushResultAdapter;Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class MusicPushResultHolder extends RecyclerView.d0 {
        private TextView descView;
        private TextView nameView;
        private ImageView nextView;
        final /* synthetic */ MusicPushResultAdapter this$0;

        @NotNull
        private View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MusicPushResultHolder(@NotNull MusicPushResultAdapter musicPushResultAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = musicPushResultAdapter;
            this.view = view;
            this.nameView = (TextView) view.findViewById(zqi.C5);
            this.descView = (TextView) this.view.findViewById(zqi.d1);
            this.nextView = (ImageView) this.view.findViewById(zqi.K5);
        }

        public final void bind(@NotNull MusicBean musicBean) {
            String artist;
            Intrinsics.checkNotNullParameter(musicBean, "musicBean");
            this.nameView.setText(musicBean.getName());
            if (musicBean.getArtist() == null || musicBean.getAlbum() == null) {
                artist = musicBean.getArtist();
                if (artist == null) {
                    artist = ResourceExtKt.getString(wzi.D5);
                }
            } else {
                artist = ResourceExtKt.getString(wzi.B5, musicBean.getArtist(), musicBean.getAlbum());
            }
            this.descView.setText(artist);
            this.nextView.setImageResource(musicBean.getIsDownLoadSuccess() ? jni.e0 : jni.Z0);
        }

        public final TextView getDescView() {
            return this.descView;
        }

        public final TextView getNameView() {
            return this.nameView;
        }

        public final ImageView getNextView() {
            return this.nextView;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }

        public final void setDescView(TextView textView) {
            this.descView = textView;
        }

        public final void setNameView(TextView textView) {
            this.nameView = textView;
        }

        public final void setNextView(ImageView imageView) {
            this.nextView = imageView;
        }

        public final void setView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.view = view;
        }
    }

    public MusicPushResultAdapter(@NotNull Context context, @NotNull List<MusicBean> dataList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.context = context;
        this.dataList = dataList;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final List<MusicBean> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setDataList(@NotNull List<MusicBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull MusicPushResultHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.dataList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public MusicPushResultHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(eui.c1, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new MusicPushResultHolder(this, viewInflate);
    }
}
