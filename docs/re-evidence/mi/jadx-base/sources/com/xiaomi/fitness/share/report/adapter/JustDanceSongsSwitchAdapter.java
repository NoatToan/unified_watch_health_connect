package com.xiaomi.fitness.share.report.adapter;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.p;
import coil.request.ImageRequest;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongItem;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongItemKt;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongList;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.detail.view.JustDanceScoreLevelView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.share.report.SportReportShareExtKt;
import com.xiaomi.fitness.share.report.adapter.JustDanceSongsSwitchAdapter;
import defpackage.bsi;
import defpackage.c4b;
import defpackage.etk;
import defpackage.hoi;
import defpackage.ivi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003$%&B!\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010#J\u001f\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/share/report/adapter/JustDanceSongsSwitchAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "getSportReport", "()Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongList;", "switchSongList", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongList;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "accountInfo", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "", "sportName", "Ljava/lang/String;", "<init>", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongList;Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "DiffCallback", "JustDanceShareViewHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class JustDanceSongsSwitchAdapter extends p<SwitchSongItem, RecyclerView.d0> {

    @NotNull
    public static final String TAG = "CustomizeSwitchAdapter";

    @Nullable
    private AccountCoreInfo accountInfo;

    @NotNull
    private final LifecycleOwner lifecycleOwner;

    @NotNull
    private String sportName;

    @NotNull
    private final SportBasicReport sportReport;

    @Nullable
    private final SwitchSongList switchSongList;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/share/report/adapter/JustDanceSongsSwitchAdapter$DiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;)Z", "areContentsTheSame", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DiffCallback extends h.f<SwitchSongItem> {
        @Override // androidx.recyclerview.widget.h.f
        public boolean areContentsTheSame(@NotNull SwitchSongItem oldItem, @NotNull SwitchSongItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getName(), newItem.getName());
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull SwitchSongItem oldItem, @NotNull SwitchSongItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b)\u0010*J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n \u0015*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\n \u0015*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n \u0015*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n \u0015*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n \u0015*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010'\u001a\n \u0015*\u0004\u0018\u00010&0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/share/report/adapter/JustDanceSongsSwitchAdapter$JustDanceShareViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "sportReport", "", "position", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "accountInfo", "", "sportName", "", "bindData", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;ILcom/xiaomi/fitness/account/manager/AccountCoreInfo;Ljava/lang/String;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroid/widget/ImageView;", "bgIv", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "qrCodeIv", "Landroid/widget/TextView;", "appNameTv", "Landroid/widget/TextView;", "songNameTV", "songArcTV", "scoreTV", "calorieTV", "Lcom/xiaomi/fitness/detail/view/JustDanceScoreLevelView;", "levelView", "Lcom/xiaomi/fitness/detail/view/JustDanceScoreLevelView;", "Landroidx/cardview/widget/CardView;", "cardView", "Landroidx/cardview/widget/CardView;", "getCardView", "()Landroidx/cardview/widget/CardView;", "Letk;", "retrofit", "Letk;", "<init>", "(Lcom/xiaomi/fitness/share/report/adapter/JustDanceSongsSwitchAdapter;Landroid/view/View;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class JustDanceShareViewHolder extends RecyclerView.d0 {
        private final TextView appNameTv;

        @NotNull
        private final ImageView bgIv;
        private final TextView calorieTV;

        @NotNull
        private final CardView cardView;
        private final JustDanceScoreLevelView levelView;
        private final ImageView qrCodeIv;
        private final etk retrofit;
        private final TextView scoreTV;
        private final TextView songArcTV;
        private final TextView songNameTV;
        final /* synthetic */ JustDanceSongsSwitchAdapter this$0;

        @NotNull
        private final View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JustDanceShareViewHolder(@NotNull JustDanceSongsSwitchAdapter justDanceSongsSwitchAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = justDanceSongsSwitchAdapter;
            this.view = view;
            View viewFindViewById = view.findViewById(bsi.w);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.bgIv = (ImageView) viewFindViewById;
            this.qrCodeIv = (ImageView) view.findViewById(bsi.d5);
            this.appNameTv = (TextView) view.findViewById(bsi.l);
            this.songNameTV = (TextView) view.findViewById(bsi.x6);
            this.songArcTV = (TextView) view.findViewById(bsi.w6);
            this.scoreTV = (TextView) view.findViewById(bsi.t3);
            this.calorieTV = (TextView) view.findViewById(bsi.k3);
            this.levelView = (JustDanceScoreLevelView) view.findViewById(bsi.u3);
            View viewFindViewById2 = view.findViewById(bsi.C);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.cardView = (CardView) viewFindViewById2;
            this.retrofit = new etk.b().c("https://jd.ubicdn.com/").b(c4b.f()).e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$0(JustDanceShareViewHolder this$0, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            ImageView qrCodeIv = this$0.qrCodeIv;
            Intrinsics.checkNotNullExpressionValue(qrCodeIv, "qrCodeIv");
            ViewExtKt.visible(qrCodeIv);
            this$0.qrCodeIv.setImageBitmap(bitmap);
            return Unit.INSTANCE;
        }

        public final void bindData(@NotNull SportBasicReport sportReport, int position, @Nullable AccountCoreInfo accountInfo, @NotNull String sportName) {
            String string;
            Intrinsics.checkNotNullParameter(sportReport, "sportReport");
            Intrinsics.checkNotNullParameter(sportName, "sportName");
            SwitchSongList switchSongList = this.this$0.switchSongList;
            if ((switchSongList != null ? switchSongList.getSongList() : null) == null) {
                return;
            }
            List<SwitchSongItem> songList = this.this$0.switchSongList.getSongList();
            Intrinsics.checkNotNull(songList);
            SwitchSongItem switchSongItem = songList.get(position);
            AnyExtKt.io$default(null, new JustDanceSongsSwitchAdapter$JustDanceShareViewHolder$bindData$1(new ImageRequest.Builder(ApplicationExtKt.getApplication()).data(SwitchSongItemKt.getViewPager(switchSongItem)).allowConversionToBitmap(true).allowHardware(false).build(), this, null), 1, null);
            Drawable resourceDrawable = ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), hoi.x);
            if (resourceDrawable != null) {
                resourceDrawable.setBounds(0, 0, 40, 40);
            }
            this.appNameTv.setCompoundDrawables(resourceDrawable, null, null, null);
            SportReportShareExtKt.getCommonQrCodeBitmapLiveData().observe(this.this$0.lifecycleOwner, new JustDanceSongsSwitchAdapter$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: azd
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return JustDanceSongsSwitchAdapter.JustDanceShareViewHolder.bindData$lambda$0(this.f3605a, (Bitmap) obj);
                }
            }));
            this.songNameTV.setText(switchSongItem.getSongName());
            TextView textView = this.scoreTV;
            Integer score = switchSongItem.getScore();
            if (score == null || (string = score.toString()) == null) {
                string = "";
            }
            textView.setText(string);
            this.calorieTV.setText(switchSongItem.getCalories());
            JustDanceScoreLevelView justDanceScoreLevelView = this.levelView;
            Integer score2 = switchSongItem.getScore();
            int iIntValue = score2 != null ? score2.intValue() : 0;
            Integer starNum = switchSongItem.getStarNum();
            justDanceScoreLevelView.initData(iIntValue, starNum != null ? starNum.intValue() : 0, true);
            AnyExtKt.main$default(null, new JustDanceSongsSwitchAdapter$JustDanceShareViewHolder$bindData$3(switchSongItem, this, null), 1, null);
        }

        @NotNull
        public final CardView getCardView() {
            return this.cardView;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JustDanceSongsSwitchAdapter(@NotNull SportBasicReport sportReport, @Nullable SwitchSongList switchSongList, @NotNull LifecycleOwner lifecycleOwner) {
        super(new DiffCallback());
        Intrinsics.checkNotNullParameter(sportReport, "sportReport");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.sportReport = sportReport;
        this.switchSongList = switchSongList;
        this.lifecycleOwner = lifecycleOwner;
        this.sportName = "";
    }

    @Override // androidx.recyclerview.widget.p, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        List<SwitchSongItem> songList;
        SwitchSongList switchSongList = this.switchSongList;
        if (switchSongList == null || (songList = switchSongList.getSongList()) == null) {
            return 0;
        }
        return songList.size();
    }

    @NotNull
    public final SportBasicReport getSportReport() {
        return this.sportReport;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setIsRecyclable(false);
        if (holder instanceof JustDanceShareViewHolder) {
            JustDanceShareViewHolder justDanceShareViewHolder = (JustDanceShareViewHolder) holder;
            justDanceShareViewHolder.bindData(this.sportReport, position, this.accountInfo, this.sportName);
            justDanceShareViewHolder.getCardView().setTag(Integer.valueOf(position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(ivi.w1, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new JustDanceShareViewHolder(this, viewInflate);
    }
}
