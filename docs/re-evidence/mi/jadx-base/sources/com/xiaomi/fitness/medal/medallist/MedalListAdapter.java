package com.xiaomi.fitness.medal.medallist;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.request.ImageRequest;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.google.gson.Gson;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.medal.MedalHelper;
import com.xiaomi.fitness.medal.bean.MedalAdapterData;
import com.xiaomi.fitness.medal.export.MedalManager;
import com.xiaomi.fitness.medal.export.MedalManagerExtKt;
import com.xiaomi.fitness.medal.medaldetail.MedalDetailActivity;
import com.xiaomi.fitness.medal.medaldetail.MedalDetailActivityKt;
import com.xiaomi.fitness.medal.medallist.MedalListAdapter;
import com.xiaomi.fitness.v2.onetrack.HealthTabOneTrackExtKt;
import com.xiaomi.onetrack.OneTrack;
import defpackage.ecf;
import defpackage.iri;
import defpackage.j0j;
import defpackage.mli;
import defpackage.ni4;
import defpackage.nji;
import defpackage.nuf;
import defpackage.pui;
import defpackage.tni;
import defpackage.txi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005./012B%\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u001d\u001a\u00020\f\u0012\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b,\u0010-J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\tR\u0017\u0010\u001d\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001e¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/medal/medallist/MedalListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "constructUiModel", "()V", "Lecf;", "newData", "updateFreshData", "(Lecf;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "data", "Lecf;", "getData", "()Lecf;", "setData", "colCountPerRow", "I", "getColCountPerRow", "", "activePkMedalInitExpandStatus", "Z", "getActivePkMedalInitExpandStatus", "()Z", "setActivePkMedalInitExpandStatus", "(Z)V", "", "Lcom/xiaomi/fitness/medal/bean/MedalAdapterData;", "uiModelList", "Ljava/util/List;", "paddingHorizontalBetweenMedal", "<init>", "(Lecf;IZ)V", "Companion", "MedalSectionHolder", "MedalItemHolder", "MedalShowMoreHolder", "MedalUnlockButtonViewHolder", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMedalListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MedalListAdapter.kt\ncom/xiaomi/fitness/medal/medallist/MedalListAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n+ 4 Extensions.kt\ncoil/-SingletonExtensions$load$1\n*L\n1#1,403:1\n1872#2,3:404\n1863#2,2:407\n1863#2,2:409\n1863#2,2:411\n54#3,3:413\n24#3:416\n57#3,6:417\n63#3,2:424\n57#4:423\n*S KotlinDebug\n*F\n+ 1 MedalListAdapter.kt\ncom/xiaomi/fitness/medal/medallist/MedalListAdapter\n*L\n149#1:404,3\n163#1:407,2\n188#1:409,2\n225#1:411,2\n275#1:413,3\n275#1:416\n275#1:417,6\n275#1:424,2\n275#1:423\n*E\n"})
public final class MedalListAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int EXPANDED_PAD_STATE_COL_COUNT = 5;
    public static final int EXPANDED_STATE_COL_COUNT = 4;
    public static final int FOLDED_STATE_COL_COUNT = 3;

    @NotNull
    public static final String TAG = "MedalListAdapter";
    public static final int TYPE_ITEM = 2;
    public static final int TYPE_SECTION = 1;
    public static final int TYPE_SHOW_MORE = 3;
    public static final int TYPE_UNLOCK_CITY_MEDALS = 4;
    private boolean activePkMedalInitExpandStatus;
    private final int colCountPerRow;

    @Nullable
    private ecf data;
    private final int paddingHorizontalBetweenMedal;

    @NotNull
    private final List<MedalAdapterData> uiModelList;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/medal/medallist/MedalListAdapter$MedalItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/medal/bean/MedalAdapterData;", "data", "", "oneTrackMedalClick", "(Lcom/xiaomi/fitness/medal/bean/MedalAdapterData;)V", "Landroid/widget/ImageView;", "medalIcon", "Landroid/widget/ImageView;", "getMedalIcon", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "medalName", "Landroid/widget/TextView;", "getMedalName", "()Landroid/widget/TextView;", "medalDescription", "getMedalDescription", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/medal/medallist/MedalListAdapter;Landroid/view/View;)V", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class MedalItemHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView medalDescription;

        @NotNull
        private final ImageView medalIcon;

        @NotNull
        private final TextView medalName;
        final /* synthetic */ MedalListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MedalItemHolder(@NotNull MedalListAdapter medalListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = medalListAdapter;
            View viewFindViewById = view.findViewById(iri.I);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.medalIcon = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(iri.K);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.medalName = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(iri.F);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.medalDescription = (TextView) viewFindViewById3;
        }

        @NotNull
        public final TextView getMedalDescription() {
            return this.medalDescription;
        }

        @NotNull
        public final ImageView getMedalIcon() {
            return this.medalIcon;
        }

        @NotNull
        public final TextView getMedalName() {
            return this.medalName;
        }

        public final void oneTrackMedalClick(@NotNull MedalAdapterData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            String model = wearableDeviceModel != null ? DeviceModelExtKt.getModel(wearableDeviceModel) : null;
            String str = data.getCategoryId() == 8 ? "recommend" : "no_recommend";
            Pair[] pairArr = new Pair[8];
            pairArr[0] = TuplesKt.to("name", "medal_select");
            pairArr[1] = TuplesKt.to("source", str);
            pairArr[2] = TuplesKt.to(OneTrack.Param.ASSET_NAME, this.medalName.getText());
            ecf.a.C0923a medalData = data.getMedalData();
            pairArr[3] = TuplesKt.to("asset_id", medalData != null ? medalData.o : null);
            ecf.a.C0923a medalData2 = data.getMedalData();
            pairArr[4] = TuplesKt.to(HealthTabOneTrackExtKt.KEY_TYPE_NUM, medalData2 != null ? Integer.valueOf(medalData2.f16490b) : null);
            MedalHelper.Companion companion = MedalHelper.INSTANCE;
            ecf.a.C0923a medalData3 = data.getMedalData();
            Intrinsics.checkNotNull(medalData3);
            pairArr[5] = TuplesKt.to("type_str", companion.getTypeStrForMedalClass(medalData3.f16490b));
            pairArr[6] = TuplesKt.to("device_model", model);
            pairArr[7] = TuplesKt.to("tip", "56.16.1.1.22915");
            Map<String, ? extends Object> mapMapOf = MapsKt__MapsKt.mapOf(pairArr);
            Logger.d(MedalListAdapter.TAG, "oneTrackMedalClick oneTrackMap=" + mapMapOf);
            OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("click_v3", mapMapOf);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/medal/medallist/MedalListAdapter$MedalSectionHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "sectionText", "Landroid/widget/TextView;", "getSectionText", "()Landroid/widget/TextView;", "Landroid/view/View;", "divider", "Landroid/view/View;", "getDivider", "()Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/medal/medallist/MedalListAdapter;Landroid/view/View;)V", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class MedalSectionHolder extends RecyclerView.d0 {

        @NotNull
        private final View divider;

        @NotNull
        private final TextView sectionText;
        final /* synthetic */ MedalListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MedalSectionHolder(@NotNull MedalListAdapter medalListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = medalListAdapter;
            View viewFindViewById = view.findViewById(iri.f0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.sectionText = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(iri.n);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.divider = viewFindViewById2;
        }

        @NotNull
        public final View getDivider() {
            return this.divider;
        }

        @NotNull
        public final TextView getSectionText() {
            return this.sectionText;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/medal/medallist/MedalListAdapter$MedalShowMoreHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "showMoreButtonTextView", "Landroid/widget/TextView;", "getShowMoreButtonTextView", "()Landroid/widget/TextView;", "Landroid/widget/ImageView;", "displayArrow", "Landroid/widget/ImageView;", "getDisplayArrow", "()Landroid/widget/ImageView;", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/medal/medallist/MedalListAdapter;Landroid/view/View;)V", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class MedalShowMoreHolder extends RecyclerView.d0 {

        @NotNull
        private final ImageView displayArrow;

        @NotNull
        private final TextView showMoreButtonTextView;
        final /* synthetic */ MedalListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MedalShowMoreHolder(@NotNull MedalListAdapter medalListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = medalListAdapter;
            View viewFindViewById = view.findViewById(iri.s0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.showMoreButtonTextView = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(iri.f22019b);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.displayArrow = (ImageView) viewFindViewById2;
        }

        @NotNull
        public final ImageView getDisplayArrow() {
            return this.displayArrow;
        }

        @NotNull
        public final TextView getShowMoreButtonTextView() {
            return this.showMoreButtonTextView;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/medal/medallist/MedalListAdapter$MedalUnlockButtonViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "unlockButton", "Landroid/widget/TextView;", "getUnlockButton", "()Landroid/widget/TextView;", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/medal/medallist/MedalListAdapter;Landroid/view/View;)V", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nMedalListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MedalListAdapter.kt\ncom/xiaomi/fitness/medal/medallist/MedalListAdapter$MedalUnlockButtonViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,403:1\n1863#2,2:404\n*S KotlinDebug\n*F\n+ 1 MedalListAdapter.kt\ncom/xiaomi/fitness/medal/medallist/MedalListAdapter$MedalUnlockButtonViewHolder\n*L\n378#1:404,2\n*E\n"})
    public final class MedalUnlockButtonViewHolder extends RecyclerView.d0 {
        final /* synthetic */ MedalListAdapter this$0;

        @NotNull
        private final TextView unlockButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Type inference failed for: r1v7, types: [T, ecf$a] */
        public MedalUnlockButtonViewHolder(@NotNull MedalListAdapter medalListAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = medalListAdapter;
            View viewFindViewById = view.findViewById(iri.x0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.unlockButton = (TextView) viewFindViewById;
            if (medalListAdapter.getData() != null) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                ecf data = medalListAdapter.getData();
                Intrinsics.checkNotNull(data);
                List<ecf.a> medals = data.f16485a;
                Intrinsics.checkNotNullExpressionValue(medals, "medals");
                Iterator<T> it = medals.iterator();
                while (it.hasNext()) {
                    ?? r1 = (ecf.a) it.next();
                    if (r1.c == 3) {
                        objectRef.element = r1;
                    }
                }
                String str = (ecf.a) objectRef.element;
                Logger.d(MedalListAdapter.TAG, "MedalUnlockButtonViewHolder cityMedalCategory=" + (str == null ? "" : str));
                final Context context = view.getContext();
                nuf.f(view);
                view.setOnClickListener(new View.OnClickListener() { // from class: iff
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        MedalListAdapter.MedalUnlockButtonViewHolder._init_$lambda$2(context, objectRef, view2);
                    }
                });
                nuf.f(view);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$2(Context context, Ref.ObjectRef cityMedalCategory, View view) {
            Intrinsics.checkNotNullParameter(cityMedalCategory, "$cityMedalCategory");
            Intent intent = new Intent(context, (Class<?>) CityMedalListActivity.class);
            String json = new Gson().toJson(cityMedalCategory.element);
            Bundle bundle = new Bundle();
            bundle.putString(MedalDetailActivityKt.KEY_PARAM_CITY_MEDAL_CATEGORY, json);
            intent.putExtras(bundle);
            Logger.d(MedalListAdapter.TAG, "MedalUnLockButtonViewHolder CityMedalListActivity listener set.");
            context.startActivity(intent);
        }

        @NotNull
        public final TextView getUnlockButton() {
            return this.unlockButton;
        }
    }

    public /* synthetic */ MedalListAdapter(ecf ecfVar, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(ecfVar, (i2 & 2) != 0 ? 3 : i, (i2 & 4) != 0 ? false : z);
    }

    private final void constructUiModel() {
        Logger.d(TAG, "constructUiModel method running");
        if (this.data == null) {
            return;
        }
        this.uiModelList.clear();
        ecf ecfVar = this.data;
        Intrinsics.checkNotNull(ecfVar);
        for (ecf.a aVar : ecfVar.f16485a) {
            List<ecf.a.C0923a> list = aVar.f16487a;
            this.uiModelList.add(new MedalAdapterData(aVar.f16488b, null, 1, 0, aVar.c, 8, null));
            Logger.d(TAG, "constructUiModel section model added. ");
            int i = aVar.c;
            boolean z = true;
            int i2 = 0;
            if (i == 6) {
                Logger.d(TAG, "constructUiModel active pk medal category");
                int iMin = Math.min(this.colCountPerRow * 3, list.size());
                z = list.size() > this.colCountPerRow * 3;
                Intrinsics.checkNotNull(list);
                for (Object obj : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    ecf.a.C0923a c0923a = (ecf.a.C0923a) obj;
                    if (i2 < iMin) {
                        this.uiModelList.add(new MedalAdapterData(aVar.f16488b, c0923a, 2, 0, aVar.c, 8, null));
                    }
                    i2 = i3;
                }
                if (z) {
                    if (this.activePkMedalInitExpandStatus) {
                        Iterator<T> it = list.subList(this.colCountPerRow * 3, list.size()).iterator();
                        while (it.hasNext()) {
                            this.uiModelList.add(new MedalAdapterData(null, (ecf.a.C0923a) it.next(), 2, 0, aVar.c, 8, null));
                        }
                    }
                    this.uiModelList.add(new MedalAdapterData(aVar.f16488b, null, 3, 0, aVar.c, 8, null));
                }
            } else if (i == 3) {
                Logger.d(TAG, "constructUiModel city medal category");
                Intrinsics.checkNotNull(list);
                int i4 = 0;
                for (ecf.a.C0923a c0923a2 : list) {
                    if (c0923a2.f) {
                        this.uiModelList.add(new MedalAdapterData(aVar.f16488b, c0923a2, 2, 0, aVar.c, 8, null));
                        z = false;
                    }
                    if (!c0923a2.f) {
                        i4++;
                    }
                }
                if (z) {
                    this.uiModelList.add(new MedalAdapterData(aVar.f16488b, list.get(0), 2, 0, aVar.c, 8, null));
                }
                this.uiModelList.add(new MedalAdapterData(aVar.f16488b, null, 4, i4, aVar.c));
            } else {
                Logger.d(TAG, "constructUiModel other medal category");
                Intrinsics.checkNotNull(list);
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    this.uiModelList.add(new MedalAdapterData(aVar.f16488b, (ecf.a.C0923a) it2.next(), 2, 0, aVar.c, 8, null));
                }
            }
            notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$6(RecyclerView.d0 holder, MedalAdapterData medalData, View view) {
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Intrinsics.checkNotNullParameter(medalData, "$medalData");
        ((MedalItemHolder) holder).oneTrackMedalClick(medalData);
        Context context = holder.itemView.getContext();
        ecf.a.C0923a medalData2 = medalData.getMedalData();
        if (medalData2 != null) {
            Intent intent = new Intent();
            intent.putExtra("key_params_medal_id", medalData2.o.longValue());
            intent.putExtra("key_params_medal_type", medalData2.m);
            intent.putExtra("key_params_medal_class", medalData2.f16490b);
            intent.putExtra("key_from_medal_home", true);
            intent.putExtra(MedalDetailActivityKt.KEY_PARAM_MEDAL_CATEGORY_ID, medalData.getCategoryId());
            Logger.d(TAG, "MedalItemHolder medalType=" + medalData2.m);
            intent.setClass(context, MedalDetailActivity.class);
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$7(MedalListAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.activePkMedalInitExpandStatus = !this$0.activePkMedalInitExpandStatus;
        this$0.constructUiModel();
    }

    public final boolean getActivePkMedalInitExpandStatus() {
        return this.activePkMedalInitExpandStatus;
    }

    public final int getColCountPerRow() {
        return this.colCountPerRow;
    }

    @Nullable
    public final ecf getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.uiModelList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        int itemType = this.uiModelList.get(position).getItemType();
        if (itemType == 1) {
            return 1;
        }
        if (itemType != 3) {
            return itemType != 4 ? 2 : 4;
        }
        return 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        MedalAdapterData medalAdapterData = this.uiModelList.get(position);
        Logger.d(TAG, "onBindViewHolder position=" + position + " medalAdapterData=" + medalAdapterData);
        int iCoerceIn = RangesKt___RangesKt.coerceIn(((UIUtils.INSTANCE.getScreenWidth(ApplicationExtKt.getApplication()) - (this.paddingHorizontalBetweenMedal * (this.colCountPerRow - 1))) - (ExtUtilsKt.getDimension(mli.c) * 2)) / this.colCountPerRow, 0, ExtUtilsKt.getDp(Float.valueOf(100.0f)));
        if (holder instanceof MedalSectionHolder) {
            MedalSectionHolder medalSectionHolder = (MedalSectionHolder) holder;
            medalSectionHolder.getSectionText().setText(this.uiModelList.get(position).getCategoryName());
            if (position == 0) {
                ViewExtKt.gone(medalSectionHolder.getDivider());
                return;
            } else {
                ViewExtKt.visible(medalSectionHolder.getDivider());
                return;
            }
        }
        if (!(holder instanceof MedalItemHolder)) {
            if (!(holder instanceof MedalShowMoreHolder)) {
                if (holder instanceof MedalUnlockButtonViewHolder) {
                    ((MedalUnlockButtonViewHolder) holder).getUnlockButton().setText(ApplicationExtKt.getApplication().getResources().getQuantityString(txi.f35161a, medalAdapterData.getCityMedalsCountNotGot(), Integer.valueOf(medalAdapterData.getCityMedalsCountNotGot())));
                    return;
                }
                return;
            }
            MedalShowMoreHolder medalShowMoreHolder = (MedalShowMoreHolder) holder;
            medalShowMoreHolder.getShowMoreButtonTextView().setOnClickListener(new View.OnClickListener() { // from class: gff
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MedalListAdapter.onBindViewHolder$lambda$7(this.f18924a, view);
                }
            });
            medalShowMoreHolder.getShowMoreButtonTextView().setVisibility(medalAdapterData.getItemType() != 3 ? 8 : 0);
            String string = !this.activePkMedalInitExpandStatus ? medalShowMoreHolder.getShowMoreButtonTextView().getResources().getString(j0j.v) : medalShowMoreHolder.getShowMoreButtonTextView().getResources().getString(j0j.g);
            Intrinsics.checkNotNull(string);
            medalShowMoreHolder.getShowMoreButtonTextView().setText(string);
            holder.itemView.setContentDescription(string);
            ((MedalShowMoreHolder) holder).getDisplayArrow().setBackground(!this.activePkMedalInitExpandStatus ? ni4.e(holder.itemView.getContext(), tni.c) : ni4.e(holder.itemView.getContext(), tni.d));
            return;
        }
        final MedalAdapterData medalAdapterData2 = this.uiModelList.get(position);
        ecf.a.C0923a medalData = medalAdapterData2.getMedalData();
        if (medalData != null) {
            MedalItemHolder medalItemHolder = (MedalItemHolder) holder;
            medalItemHolder.getMedalIcon().getLayoutParams().width = iCoerceIn;
            ViewGroup.LayoutParams layoutParams = medalItemHolder.getMedalIcon().getLayoutParams();
            MedalManager.Companion companion = MedalManager.INSTANCE;
            layoutParams.height = (int) (iCoerceIn * MedalManagerExtKt.getInstance(companion).getMedalListImgRatio(medalData.f16490b));
            if (medalData.f16490b == 6) {
                medalItemHolder.getMedalName().setMaxLines(1);
                medalItemHolder.getMedalName().setEllipsize(TextUtils.TruncateAt.MIDDLE);
            } else {
                medalItemHolder.getMedalName().setMaxLines(10);
                medalItemHolder.getMedalName().setEllipsize(null);
            }
            medalItemHolder.getMedalName().setText(medalData.l);
            medalItemHolder.getMedalName().setTextColor(holder.itemView.getContext().getResources().getColor(medalData.f ? nji.j : nji.f27983k));
            String str = !TextUtils.isEmpty(medalData.c) ? medalData.c : "-";
            MedalItemHolder medalItemHolder2 = (MedalItemHolder) holder;
            ImageView medalIcon = medalItemHolder2.getMedalIcon();
            Coil.imageLoader(medalIcon.getContext()).enqueue(new ImageRequest.Builder(medalIcon.getContext()).data(str).target(medalIcon).build());
            Logger.d(TAG, "MedalItemHolder category=" + medalAdapterData2);
            medalItemHolder2.getMedalDescription().setText(MedalManagerExtKt.getInstance(companion).getMedalSubtitle(medalAdapterData2.getMedalData()));
        }
        nuf.f(holder.itemView);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: fff
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MedalListAdapter.onBindViewHolder$lambda$6(holder, medalAdapterData2, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(pui.l, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new MedalSectionHolder(this, viewInflate);
        }
        if (viewType == 3) {
            View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(pui.p, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
            return new MedalShowMoreHolder(this, viewInflate2);
        }
        if (viewType != 4) {
            View viewInflate3 = LayoutInflater.from(parent.getContext()).inflate(pui.i, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate3, "inflate(...)");
            return new MedalItemHolder(this, viewInflate3);
        }
        View viewInflate4 = LayoutInflater.from(parent.getContext()).inflate(pui.m, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate4, "inflate(...)");
        return new MedalUnlockButtonViewHolder(this, viewInflate4);
    }

    public final void setActivePkMedalInitExpandStatus(boolean z) {
        this.activePkMedalInitExpandStatus = z;
    }

    public final void setData(@Nullable ecf ecfVar) {
        this.data = ecfVar;
    }

    public final void updateFreshData(@NotNull ecf newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        this.data = newData;
        constructUiModel();
    }

    public MedalListAdapter(@Nullable ecf ecfVar, int i, boolean z) {
        this.data = ecfVar;
        this.colCountPerRow = i;
        this.activePkMedalInitExpandStatus = z;
        this.uiModelList = new ArrayList();
        this.paddingHorizontalBetweenMedal = ExtUtilsKt.getDimension(mli.f26982a);
    }
}
