package com.xiaomi.fitness.detail.inner;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.p;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import coil.transform.RoundedCornersTransformation;
import com.mibi.sdk.component.params.SdkContants;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongItem;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongItemKt;
import com.xiaomi.fit.fitness.export.data.item.SwitchSongList;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.detail.BaseSportDetailFragment;
import com.xiaomi.fitness.detail.inner.SportDetailJustDanceDataFragment;
import com.xiaomi.fitness.detail.view.JustDanceScoreLevelView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.bsi;
import defpackage.c4b;
import defpackage.etk;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.rpp;
import defpackage.sea;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 !2\u00020\u0001:\u0003\"#!B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n \u001c*\u0004\u0018\u00010\u001b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailJustDanceDataFragment;", "Lcom/xiaomi/fitness/detail/BaseSportDetailFragment;", "Landroid/os/Bundle;", SdkContants.KEY_BUNDLE, "", "initParamsFromBundle", "(Landroid/os/Bundle;)V", "", "getCardName", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "savedInstanceState", "Landroid/view/View;", "onInflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongList;", "mSwitchSongList", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongList;", "Lsea;", "mViewBinding", "Lsea;", "Letk;", "kotlin.jvm.PlatformType", "retrofit", "Letk;", "<init>", "()V", "Companion", "JustDanceDataListAdapter", "DiffCallback", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSportDetailJustDanceDataFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailJustDanceDataFragment.kt\ncom/xiaomi/fitness/detail/inner/SportDetailJustDanceDataFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,251:1\n1863#2,2:252\n*S KotlinDebug\n*F\n+ 1 SportDetailJustDanceDataFragment.kt\ncom/xiaomi/fitness/detail/inner/SportDetailJustDanceDataFragment\n*L\n103#1:252,2\n*E\n"})
public final class SportDetailJustDanceDataFragment extends BaseSportDetailFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "SportDetailDateFromFragment";

    @Nullable
    private SwitchSongList mSwitchSongList;
    private sea mViewBinding;
    private final etk retrofit = new etk.b().c("https://jd.ubicdn.com/").b(c4b.f()).e();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailJustDanceDataFragment$Companion;", "", "<init>", "()V", "TAG", "", "switchDetailFragment", "", "sportValues", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", DailyRecordKey.sportType, "", "triathlonNum", "sportDetailType", "switchJustDanceList", "", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void switchDetailFragment(@NotNull SportBasicReport sportValues, int sportType, int triathlonNum, int sportDetailType, @Nullable List<SwitchSongItem> switchJustDanceList, @Nullable FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(sportValues, "sportValues");
            Bundle bundle = new Bundle();
            bundle.putSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES, sportValues);
            bundle.putInt("sport_type", sportType);
            bundle.putInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, sportDetailType);
            bundle.putSerializable(SportDetailJustDanceDataFragmentKt.BUNDLE_PARAMS_SPORT_DETAIL_JUST_DANCE_LIST, new SwitchSongList(switchJustDanceList));
            BaseSportDetailFragment.Companion companion = BaseSportDetailFragment.INSTANCE;
            String strCreateFragmentTag = BaseSportDetailFragment.createFragmentTag("SportDetailDateFromFragment", triathlonNum, sportType);
            int i = bsi.p3;
            Intrinsics.checkNotNull(fragmentManager);
            BaseSportDetailFragment.switchFragment(i, SportDetailJustDanceDataFragment.class, strCreateFragmentTag, bundle, fragmentManager);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailJustDanceDataFragment$DiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;)Z", "areContentsTheSame", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class DiffCallback extends h.f<SwitchSongItem> {
        @Override // androidx.recyclerview.widget.h.f
        public boolean areContentsTheSame(@NotNull SwitchSongItem oldItem, @NotNull SwitchSongItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getName(), newItem.getName()) && Intrinsics.areEqual(oldItem.getScore(), newItem.getScore());
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull SwitchSongItem oldItem, @NotNull SwitchSongItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n0\u0003R\u00060\u0000R\u00020\u00040\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\t\u001a\n0\u0003R\u00060\u0000R\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\r2\u000e\u0010\u000b\u001a\n0\u0003R\u00060\u0000R\u00020\u00042\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailJustDanceDataFragment$JustDanceDataListAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;", "Lcom/xiaomi/fitness/detail/inner/SportDetailJustDanceDataFragment$JustDanceDataListAdapter$JustDanceListHolder;", "Lcom/xiaomi/fitness/detail/inner/SportDetailJustDanceDataFragment;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/detail/inner/SportDetailJustDanceDataFragment$JustDanceDataListAdapter$JustDanceListHolder;", "holder", "position", "", "onBindViewHolder", "(Lcom/xiaomi/fitness/detail/inner/SportDetailJustDanceDataFragment$JustDanceDataListAdapter$JustDanceListHolder;I)V", "getItemCount", "()I", "<init>", "(Lcom/xiaomi/fitness/detail/inner/SportDetailJustDanceDataFragment;)V", "JustDanceListHolder", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class JustDanceDataListAdapter extends p<SwitchSongItem, JustDanceListHolder> {

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/detail/inner/SportDetailJustDanceDataFragment$JustDanceDataListAdapter$JustDanceListHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;", "song", "", "bind", "(Lcom/xiaomi/fit/fitness/export/data/item/SwitchSongItem;)V", "Lrpp;", "binding", "Lrpp;", "getBinding", "()Lrpp;", "<init>", "(Lcom/xiaomi/fitness/detail/inner/SportDetailJustDanceDataFragment$JustDanceDataListAdapter;Lrpp;)V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
        @SourceDebugExtension({"SMAP\nSportDetailJustDanceDataFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportDetailJustDanceDataFragment.kt\ncom/xiaomi/fitness/detail/inner/SportDetailJustDanceDataFragment$JustDanceDataListAdapter$JustDanceListHolder\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,251:1\n54#2,3:252\n24#2:255\n59#2,6:256\n*S KotlinDebug\n*F\n+ 1 SportDetailJustDanceDataFragment.kt\ncom/xiaomi/fitness/detail/inner/SportDetailJustDanceDataFragment$JustDanceDataListAdapter$JustDanceListHolder\n*L\n158#1:252,3\n158#1:255\n158#1:256,6\n*E\n"})
        public final class JustDanceListHolder extends RecyclerView.d0 {

            @NotNull
            private final rpp binding;
            final /* synthetic */ JustDanceDataListAdapter this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JustDanceListHolder(@NotNull JustDanceDataListAdapter justDanceDataListAdapter, rpp binding) {
                super(binding.getRoot());
                Intrinsics.checkNotNullParameter(binding, "binding");
                this.this$0 = justDanceDataListAdapter;
                this.binding = binding;
            }

            public final void bind(@NotNull SwitchSongItem song) {
                String string;
                Intrinsics.checkNotNullParameter(song, "song");
                AppCompatImageView justDanceCoverIv = this.binding.D;
                Intrinsics.checkNotNullExpressionValue(justDanceCoverIv, "justDanceCoverIv");
                String cover = SwitchSongItemKt.getCover(song);
                ImageLoader imageLoader = Coil.imageLoader(justDanceCoverIv.getContext());
                ImageRequest.Builder builderTarget = new ImageRequest.Builder(justDanceCoverIv.getContext()).data(cover).target(justDanceCoverIv);
                builderTarget.transformations(new RoundedCornersTransformation(16.0f));
                imageLoader.enqueue(builderTarget.build());
                TextView textView = this.binding.G;
                Integer score = song.getScore();
                if (score == null || (string = score.toString()) == null) {
                    string = "";
                }
                textView.setText(string);
                this.binding.B.setText(song.getCalories());
                JustDanceScoreLevelView justDanceScoreLevelView = this.binding.H;
                Integer score2 = song.getScore();
                int iIntValue = score2 != null ? score2.intValue() : 0;
                Integer starNum = song.getStarNum();
                JustDanceScoreLevelView.initData$default(justDanceScoreLevelView, iIntValue, starNum != null ? starNum.intValue() : 0, false, 4, null);
                AnyExtKt.main$default(null, new SportDetailJustDanceDataFragment$JustDanceDataListAdapter$JustDanceListHolder$bind$2(song, SportDetailJustDanceDataFragment.this, this, null), 1, null);
            }

            @NotNull
            public final rpp getBinding() {
                return this.binding;
            }
        }

        public JustDanceDataListAdapter() {
            super(new DiffCallback());
        }

        @Override // androidx.recyclerview.widget.p, androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getCount() {
            return getCurrentList().size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(@NotNull JustDanceListHolder holder, int position) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            SwitchSongItem switchSongItem = getCurrentList().get(position);
            Intrinsics.checkNotNullExpressionValue(switchSongItem, "get(...)");
            holder.bind(switchSongItem);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        public JustDanceListHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            rpp rppVarA0 = rpp.A0(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(rppVarA0, "inflate(...)");
            return new JustDanceListHolder(this, rppVarA0);
        }
    }

    private final void initParamsFromBundle(Bundle bundle) {
        if (bundle != null) {
            setMSportValues((SportBasicReport) bundle.getSerializable(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_VALUES));
            setMDetailSportType(bundle.getInt(SportRecordBundleKey.BUNDLE_PARAMS_SPORT_DETAIL_TYPE, -1));
            this.mSwitchSongList = (SwitchSongList) bundle.getSerializable(SportDetailJustDanceDataFragmentKt.BUNDLE_PARAMS_SPORT_DETAIL_JUST_DANCE_LIST);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(Ref.BooleanRef isShowMore, SportDetailJustDanceDataFragment this$0, Drawable drawable, JustDanceDataListAdapter adapter, Drawable drawable2, View view) {
        Intrinsics.checkNotNullParameter(isShowMore, "$isShowMore");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapter, "$adapter");
        sea seaVar = null;
        if (isShowMore.element) {
            sea seaVar2 = this$0.mViewBinding;
            if (seaVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
                seaVar2 = null;
            }
            seaVar2.B.setCompoundDrawables(null, null, drawable, null);
            sea seaVar3 = this$0.mViewBinding;
            if (seaVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            } else {
                seaVar = seaVar3;
            }
            seaVar.B.setText(this$0.getString(j1j.b7));
            SwitchSongList switchSongList = this$0.mSwitchSongList;
            Intrinsics.checkNotNull(switchSongList);
            List<SwitchSongItem> songList = switchSongList.getSongList();
            Intrinsics.checkNotNull(songList);
            adapter.submitList(CollectionsKt___CollectionsKt.toMutableList((Collection) songList));
        } else {
            sea seaVar4 = this$0.mViewBinding;
            if (seaVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
                seaVar4 = null;
            }
            seaVar4.B.setCompoundDrawables(null, null, drawable2, null);
            SwitchSongList switchSongList2 = this$0.mSwitchSongList;
            Intrinsics.checkNotNull(switchSongList2);
            List<SwitchSongItem> songList2 = switchSongList2.getSongList();
            Intrinsics.checkNotNull(songList2);
            adapter.submitList(CollectionsKt___CollectionsKt.toMutableList((Collection) CollectionsKt___CollectionsKt.take(songList2, 3)));
            sea seaVar5 = this$0.mViewBinding;
            if (seaVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            } else {
                seaVar = seaVar5;
            }
            seaVar.B.setText(this$0.getString(j1j.a7));
        }
        isShowMore.element = !isShowMore.element;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment
    @NotNull
    public String getCardName() {
        return "just_dance";
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, defpackage.osc
    @NotNull
    public View onInflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNull(inflater);
        this.mViewBinding = sea.A0(inflater, container, false);
        initParamsFromBundle(getArguments());
        sea seaVar = this.mViewBinding;
        if (seaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            seaVar = null;
        }
        View root = seaVar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // com.xiaomi.fitness.detail.BaseSportDetailFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        int iIntValue;
        List<SwitchSongItem> songList;
        List<SwitchSongItem> songList2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        sea seaVar = this.mViewBinding;
        sea seaVar2 = null;
        if (seaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            seaVar = null;
        }
        seaVar.E.bindData(hoi.q0, getString(j1j.U1));
        final JustDanceDataListAdapter justDanceDataListAdapter = new JustDanceDataListAdapter();
        sea seaVar3 = this.mViewBinding;
        if (seaVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            seaVar3 = null;
        }
        seaVar3.A.setLayoutManager(new LinearLayoutManager(getMActivity(), 1, false));
        sea seaVar4 = this.mViewBinding;
        if (seaVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            seaVar4 = null;
        }
        seaVar4.A.setAdapter(justDanceDataListAdapter);
        SwitchSongList switchSongList = this.mSwitchSongList;
        if (switchSongList != null) {
            List<SwitchSongItem> songList3 = switchSongList != null ? switchSongList.getSongList() : null;
            if (songList3 != null && !songList3.isEmpty()) {
                SwitchSongList switchSongList2 = this.mSwitchSongList;
                Intrinsics.checkNotNull(switchSongList2);
                List<SwitchSongItem> songList4 = switchSongList2.getSongList();
                Intrinsics.checkNotNull(songList4);
                if (songList4.size() > 3) {
                    SwitchSongList switchSongList3 = this.mSwitchSongList;
                    Intrinsics.checkNotNull(switchSongList3);
                    List<SwitchSongItem> songList5 = switchSongList3.getSongList();
                    Intrinsics.checkNotNull(songList5);
                    justDanceDataListAdapter.submitList(CollectionsKt___CollectionsKt.toMutableList((Collection) CollectionsKt___CollectionsKt.take(songList5, 3)));
                    sea seaVar5 = this.mViewBinding;
                    if (seaVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
                        seaVar5 = null;
                    }
                    TextView danceDataMoreView = seaVar5.B;
                    Intrinsics.checkNotNullExpressionValue(danceDataMoreView, "danceDataMoreView");
                    ViewExtKt.visible(danceDataMoreView);
                } else {
                    SwitchSongList switchSongList4 = this.mSwitchSongList;
                    Intrinsics.checkNotNull(switchSongList4);
                    List<SwitchSongItem> songList6 = switchSongList4.getSongList();
                    Intrinsics.checkNotNull(songList6);
                    justDanceDataListAdapter.submitList(CollectionsKt___CollectionsKt.toMutableList((Collection) songList6));
                    sea seaVar6 = this.mViewBinding;
                    if (seaVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
                        seaVar6 = null;
                    }
                    TextView danceDataMoreView2 = seaVar6.B;
                    Intrinsics.checkNotNullExpressionValue(danceDataMoreView2, "danceDataMoreView");
                    ViewExtKt.gone(danceDataMoreView2);
                }
                sea seaVar7 = this.mViewBinding;
                if (seaVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
                    seaVar7 = null;
                }
                TextView textView = seaVar7.D;
                SwitchSongList switchSongList5 = this.mSwitchSongList;
                textView.setText(String.valueOf((switchSongList5 == null || (songList2 = switchSongList5.getSongList()) == null) ? 0 : songList2.size()));
                SwitchSongList switchSongList6 = this.mSwitchSongList;
                if (switchSongList6 == null || (songList = switchSongList6.getSongList()) == null) {
                    iIntValue = 0;
                } else {
                    Iterator<T> it = songList.iterator();
                    iIntValue = 0;
                    while (it.hasNext()) {
                        Integer score = ((SwitchSongItem) it.next()).getScore();
                        iIntValue += score != null ? score.intValue() : 0;
                    }
                }
                sea seaVar8 = this.mViewBinding;
                if (seaVar8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
                    seaVar8 = null;
                }
                TextView textView2 = seaVar8.G;
                SwitchSongList switchSongList7 = this.mSwitchSongList;
                List<SwitchSongItem> songList7 = switchSongList7 != null ? switchSongList7.getSongList() : null;
                Intrinsics.checkNotNull(songList7);
                textView2.setText(String.valueOf(iIntValue / songList7.size()));
            }
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        final Drawable resourceDrawable = ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), hoi.n0);
        if (resourceDrawable != null) {
            resourceDrawable.setBounds(0, 0, ExtUtilsKt.getDp(Float.valueOf(30.0f)), ExtUtilsKt.getDp(Float.valueOf(30.0f)));
        }
        final Drawable resourceDrawable2 = ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), hoi.o0);
        if (resourceDrawable2 != null) {
            resourceDrawable2.setBounds(0, 0, ExtUtilsKt.getDp(Float.valueOf(30.0f)), ExtUtilsKt.getDp(Float.valueOf(30.0f)));
        }
        sea seaVar9 = this.mViewBinding;
        if (seaVar9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
            seaVar9 = null;
        }
        seaVar9.B.setCompoundDrawables(null, null, resourceDrawable, null);
        sea seaVar10 = this.mViewBinding;
        if (seaVar10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewBinding");
        } else {
            seaVar2 = seaVar10;
        }
        seaVar2.B.setOnClickListener(new View.OnClickListener() { // from class: ehn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SportDetailJustDanceDataFragment.onViewCreated$lambda$1(booleanRef, this, resourceDrawable2, justDanceDataListAdapter, resourceDrawable, view2);
            }
        });
    }
}
