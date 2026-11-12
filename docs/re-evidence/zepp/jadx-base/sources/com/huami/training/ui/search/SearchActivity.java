package com.huami.training.ui.search;

import android.content.ComponentCallbacks;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.di.koin.ScopesAndQualifersKt;
import com.huami.training.dto.Difficulty;
import com.huami.training.ext.ViewExKt;
import com.huami.training.helper.AppExecutors;
import com.huami.training.navigation.NavigationController;
import com.huami.training.ui.R;
import com.huami.training.ui.common.CourseLayoutDelegate;
import com.huami.training.ui.search.SearchActivity;
import com.huami.training.ui.search.SearchViewModel;
import com.huami.training.ui.tag.TagsAdapter;
import com.huami.training.utils.AnalyticsHelper;
import com.huami.training.utils.CountListItemVisitHelper;
import com.huami.training.vo.Resource;
import com.huami.training.vo.SearchInfo;
import com.huami.training.vo.Status;
import com.huami.training.vo.TagVo;
import com.huami.training.vo.TrainingVo;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.typeface.TypefaceTextView;
import defpackage.GlobalTitleStyleKt;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 :2\u00020\u0001:\u0003:;<B\u0007¢\u0006\u0004\b8\u00109J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J\u0012\u0010\u0012\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001c\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010 \u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010$\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b\"\u0010#R\u001d\u0010'\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0014\u0010&R\u001d\u0010+\u001a\u00020(8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R$\u00107\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006="}, d2 = {"Lcom/huami/training/ui/search/SearchActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", "K", "initView", "G", "B", "F", "C", "Lcom/huami/training/vo/SearchInfo;", "searchInfo", "u", "Landroid/os/IBinder;", "windowToken", "t", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onPostCreate", "Lcom/huami/training/helper/AppExecutors;", "x", "Lkotlin/Lazy;", "v", "()Lcom/huami/training/helper/AppExecutors;", "appExecutors", "Lcom/huami/training/navigation/NavigationController;", "y", "()Lcom/huami/training/navigation/NavigationController;", "navigationController", "Lcom/huami/training/ui/search/SearchUiDelegate;", "z", "()Lcom/huami/training/ui/search/SearchUiDelegate;", "uiDelegate", "Lcom/huami/training/ui/search/SearchViewModel;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lcom/huami/training/ui/search/SearchViewModel;", "viewModel", "Lcom/huami/training/ui/common/CourseLayoutDelegate;", "()Lcom/huami/training/ui/common/CourseLayoutDelegate;", "layoutDelegate", "Lcom/huami/training/ui/tag/TagsAdapter;", "w", "()Lcom/huami/training/ui/tag/TagsAdapter;", "hotSearchAdapter", "Lcom/huami/training/ui/search/SearchActivity$SearchResultAdapter;", LogUtil.D, "Lcom/huami/training/ui/search/SearchActivity$SearchResultAdapter;", "searchResultAdapter", "Landroid/widget/EditText;", "E", "Landroid/widget/EditText;", "getEditQuery", "()Landroid/widget/EditText;", "setEditQuery", "(Landroid/widget/EditText;)V", "editQuery", "<init>", "()V", "Companion", "SearchResultAdapter", "SearchResultViewHolder", "ui_release"}, k = 1, mv = {1, 5, 1})
public final class SearchActivity extends BaseTitleActivity {

    @NotNull
    public static final String QUERY_MODE_NAME = "name";

    @NotNull
    public static final String QUERY_MODE_TAG = "tag";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy layoutDelegate;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final Lazy hotSearchAdapter;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private SearchResultAdapter searchResultAdapter;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    private EditText editQuery;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy appExecutors;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy uiDelegate;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\r\b\u0002\u0018\u0000 \b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR0\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/huami/training/ui/search/SearchActivity$SearchResultAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/huami/training/vo/TrainingVo;", "Lcom/huami/training/ui/search/SearchActivity$SearchResultViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "c", "holder", "position", "", "b", "com/huami/training/ui/search/SearchActivity$SearchResultAdapter$itemVisitsCounter$1", "a", "Lcom/huami/training/ui/search/SearchActivity$SearchResultAdapter$itemVisitsCounter$1;", "itemVisitsCounter", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "onItemClickListener", "Lcom/huami/training/helper/AppExecutors;", "appExecutors", "<init>", "(Lcom/huami/training/helper/AppExecutors;)V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class SearchResultAdapter extends ListAdapter<TrainingVo, SearchResultViewHolder> {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private static final DiffUtil.ItemCallback<TrainingVo> d = new DiffUtil.ItemCallback<TrainingVo>() { // from class: com.huami.training.ui.search.SearchActivity$SearchResultAdapter$Companion$DIFF$1
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areContentsTheSame(@NotNull TrainingVo oldItem, @NotNull TrainingVo newItem) {
                return Intrinsics.areEqual(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areItemsTheSame(@NotNull TrainingVo oldItem, @NotNull TrainingVo newItem) {
                return oldItem.getId() == newItem.getId();
            }
        };

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final SearchActivity$SearchResultAdapter$itemVisitsCounter$1 itemVisitsCounter;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private Function1<? super TrainingVo, Unit> onItemClickListener;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/huami/training/ui/search/SearchActivity$SearchResultAdapter$Companion;", "", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/huami/training/vo/TrainingVo;", "DIFF", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "getDIFF", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final DiffUtil.ItemCallback<TrainingVo> getDIFF() {
                return SearchResultAdapter.d;
            }
        }

        /* JADX WARN: Type inference failed for: r3v4, types: [com.huami.training.ui.search.SearchActivity$SearchResultAdapter$itemVisitsCounter$1] */
        public SearchResultAdapter(@NotNull AppExecutors appExecutors) {
            super(new AsyncDifferConfig.Builder(d).setBackgroundThreadExecutor(appExecutors.getDiskIO()).build());
            this.itemVisitsCounter = new CountListItemVisitHelper<TrainingVo>() { // from class: com.huami.training.ui.search.SearchActivity$SearchResultAdapter$itemVisitsCounter$1
                @Override // com.huami.training.utils.CountListItemVisitHelper
                public void count(int position, @NotNull TrainingVo v) {
                    AnalyticsHelper.INSTANCE.countSearchListItemVisit(String.valueOf(v.getId()));
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(SearchResultAdapter searchResultAdapter, SearchResultViewHolder searchResultViewHolder, View view) {
            TrainingVo item = searchResultAdapter.getItem(searchResultViewHolder.getAdapterPosition());
            Function1<TrainingVo, Unit> onItemClickListener = searchResultAdapter.getOnItemClickListener();
            if (onItemClickListener == null) {
                return;
            }
            onItemClickListener.invoke(item);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull SearchResultViewHolder holder, int position) {
            TrainingVo item = getItem(position);
            holder.bind(item);
            put(item, position);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SearchResultViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            final SearchResultViewHolder searchResultViewHolder = new SearchResultViewHolder(parent);
            searchResultViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.huami.training.ui.search.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SearchActivity.SearchResultAdapter.d(this.a, searchResultViewHolder, view);
                }
            });
            return searchResultViewHolder;
        }

        @Nullable
        public final Function1<TrainingVo, Unit> getOnItemClickListener() {
            return this.onItemClickListener;
        }

        public final void setOnItemClickListener(@Nullable Function1<? super TrainingVo, Unit> function1) {
            this.onItemClickListener = function1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/huami/training/ui/search/SearchActivity$SearchResultViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/huami/training/vo/TrainingVo;", "item", "", "bind", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class SearchResultViewHolder extends RecyclerView.ViewHolder {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Difficulty.values().length];
                iArr[Difficulty.JUNIOR.ordinal()] = 1;
                iArr[Difficulty.INTERMEDIATE.ordinal()] = 2;
                iArr[Difficulty.SENIOR.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public SearchResultViewHolder(@NotNull ViewGroup viewGroup) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tr_item_search_result, viewGroup, false));
        }

        public final void bind(@NotNull TrainingVo item) {
            String string;
            View view = this.itemView;
            ((TypefaceTextView) view.findViewById(R.id.tv_name)).setText(item.getName());
            TypefaceTextView typefaceTextView = (TypefaceTextView) view.findViewById(R.id.tv_level);
            Difficulty difficulty = item.getDifficulty();
            int i = difficulty == null ? -1 : WhenMappings.$EnumSwitchMapping$0[difficulty.ordinal()];
            if (i == 1) {
                string = view.getContext().getString(R.string.tr_difficulty_junior);
            } else if (i != 2) {
                string = i != 3 ? "" : view.getContext().getString(R.string.tr_difficulty_senior);
            } else {
                string = view.getContext().getString(R.string.tr_difficulty_intermediate);
            }
            typefaceTextView.setText(string);
            ((TypefaceTextView) view.findViewById(R.id.tv_consumption)).setText(view.getResources().getQuantityString(R.plurals.tr_cal, item.getCalorie(), Integer.valueOf(item.getCalorie())));
            ((TypefaceTextView) view.findViewById(R.id.tv_study_number)).setText(view.getResources().getQuantityString(R.plurals.tr_study_number, item.getParticipants(), Integer.valueOf(item.getParticipants())));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            iArr[Status.ERROR.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/ui/tag/TagsAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<TagsAdapter> {

        /* JADX INFO: renamed from: com.huami.training.ui.search.SearchActivity$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/vo/TagVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0631a extends Lambda implements Function1<TagVo, Unit> {
            public final /* synthetic */ SearchActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0631a(SearchActivity searchActivity) {
                super(1);
                this.a = searchActivity;
            }

            public final void a(@NotNull TagVo tagVo) {
                this.a.u(new SearchInfo(tagVo.getName(), "tag"));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TagVo tagVo) {
                a(tagVo);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TagsAdapter getA() {
            return new TagsAdapter(SearchActivity.this.x(), 0, new C0631a(SearchActivity.this), 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/vo/TrainingVo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<TrainingVo, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull TrainingVo trainingVo) {
            AnalyticsHelper.INSTANCE.countSearchResultClicked(String.valueOf(trainingVo.getId()));
            SearchActivity.this.y().navigateToTrainingDetail(SearchActivity.this, trainingVo.getId(), trainingVo.getTrainingType());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TrainingVo trainingVo) {
            a(trainingVo);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/vo/TagVo;", GoogleApiAvailabilityLight.a, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<TagVo, CharSequence> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull TagVo tagVo) {
            return tagVo.getName();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchActivity() {
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.appExecutors = LazyKt__LazyJVMKt.lazy(new Function0<AppExecutors>() { // from class: com.huami.training.ui.search.SearchActivity$special$$inlined$injectInTr$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.training.helper.AppExecutors, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AppExecutors getA() {
                return ScopesAndQualifersKt.trainingScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(AppExecutors.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.navigationController = LazyKt__LazyJVMKt.lazy(new Function0<NavigationController>() { // from class: com.huami.training.ui.search.SearchActivity$special$$inlined$injectInTr$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.training.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final NavigationController getA() {
                return ScopesAndQualifersKt.trainingScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(NavigationController.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.uiDelegate = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SearchUiDelegate>() { // from class: com.huami.training.ui.search.SearchActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.training.ui.search.SearchUiDelegate, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SearchUiDelegate getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(SearchUiDelegate.class), objArr4, objArr5);
            }
        });
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SearchViewModel>() { // from class: com.huami.training.ui.search.SearchActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.training.ui.search.SearchViewModel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SearchViewModel getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(SearchViewModel.class), objArr6, objArr7);
            }
        });
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.layoutDelegate = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<CourseLayoutDelegate>() { // from class: com.huami.training.ui.search.SearchActivity$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.training.ui.common.CourseLayoutDelegate, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final CourseLayoutDelegate getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(CourseLayoutDelegate.class), objArr8, objArr9);
            }
        });
        this.hotSearchAdapter = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchViewModel A() {
        return (SearchViewModel) this.viewModel.getValue();
    }

    private final void B() {
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.search_edit_frame);
        View viewInflate = LayoutInflater.from(constraintLayout.getContext()).inflate(x().getSearchEdit(), (ViewGroup) constraintLayout, false);
        Objects.requireNonNull(viewInflate, "null cannot be cast to non-null type android.widget.EditText");
        setEditQuery((EditText) viewInflate);
        constraintLayout.addView(getEditQuery());
    }

    private final void C() {
        EditText editText = this.editQuery;
        if (editText != null) {
            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: jk6
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    return SearchActivity.D(this.a, textView, i, keyEvent);
                }
            });
        }
        EditText editText2 = this.editQuery;
        if (editText2 != null) {
            editText2.setOnKeyListener(new View.OnKeyListener() { // from class: ik6
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    return SearchActivity.E(this.a, view, i, keyEvent);
                }
            });
        }
        EditText editText3 = this.editQuery;
        if (editText3 == null) {
            return;
        }
        editText3.addTextChangedListener(new TextWatcher() { // from class: com.huami.training.ui.search.SearchActivity$initSearchInputListener$3
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable p0) {
                ViewExKt.setVisible((ImageView) this.a.findViewById(R.id.delete), !(p0 == null || m.isBlank(p0)));
                if (p0 == null || m.isBlank(p0)) {
                    ViewExKt.setVisible((RecyclerView) this.a.findViewById(R.id.rcv_search_result), false);
                    ViewExKt.setVisible((LinearLayout) this.a.findViewById(R.id.error_layout), false);
                    ViewExKt.setVisible((ConstraintLayout) this.a.findViewById(R.id.hot_search_zone), true);
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence p0, int p1, int p2, int p3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence p0, int p1, int p2, int p3) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(SearchActivity searchActivity, View view, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        EditText editQuery = searchActivity.getEditQuery();
        searchActivity.u(new SearchInfo(String.valueOf(editQuery == null ? null : editQuery.getText()), "name"));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean E(SearchActivity searchActivity, View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || i != 66) {
            return false;
        }
        EditText editQuery = searchActivity.getEditQuery();
        searchActivity.u(new SearchInfo(String.valueOf(editQuery == null ? null : editQuery.getText()), "name"));
        return true;
    }

    private final void F() {
        SearchResultAdapter searchResultAdapter = new SearchResultAdapter(v());
        this.searchResultAdapter = searchResultAdapter;
        Objects.requireNonNull(searchResultAdapter);
        searchResultAdapter.setOnItemClickListener(new b());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rcv_search_result);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        SearchResultAdapter searchResultAdapter2 = this.searchResultAdapter;
        Objects.requireNonNull(searchResultAdapter2);
        recyclerView.setAdapter(searchResultAdapter2);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), 1);
        Drawable drawable = ContextCompat.getDrawable(recyclerView.getContext(), R.drawable.tr_item_divider);
        if (drawable != null) {
            dividerItemDecoration.setDrawable(drawable);
        }
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huami.training.ui.search.SearchActivity$initSearchResultRcv$2$2
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView2, int dx, int dy) {
                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int iFindLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
                SearchActivity.SearchResultAdapter searchResultAdapter3 = this.a.searchResultAdapter;
                Objects.requireNonNull(searchResultAdapter3);
                if (iFindLastVisibleItemPosition == searchResultAdapter3.getA() - 1) {
                    this.a.A().loadNextPage();
                }
            }
        });
    }

    private final void G() {
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.training_home_search);
        recyclerView.setAdapter(w());
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getContext());
        flexboxLayoutManager.setFlexDirection(0);
        Unit unit = Unit.INSTANCE;
        recyclerView.setLayoutManager(flexboxLayoutManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(SearchActivity searchActivity, View view) {
        searchActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(SearchActivity searchActivity, View view) {
        EditText editQuery = searchActivity.getEditQuery();
        if (editQuery != null) {
            editQuery.setText((CharSequence) null);
        }
        SearchResultAdapter searchResultAdapter = searchActivity.searchResultAdapter;
        Objects.requireNonNull(searchResultAdapter);
        searchResultAdapter.submitList(null);
        ViewExKt.setVisible((RecyclerView) searchActivity.findViewById(R.id.rcv_search_result), false);
        if (searchActivity.w().getA() > 0) {
            ViewExKt.setVisible((ConstraintLayout) searchActivity.findViewById(R.id.hot_search_zone), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(SearchActivity searchActivity, View view) {
        searchActivity.A().retry();
    }

    private final void K() {
        A().getHotSearchResults().observe(this, new Observer() { // from class: mk6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchActivity.L(this.a, (Resource) obj);
            }
        });
        A().getSearchResults().observe(this, new Observer() { // from class: lk6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchActivity.M(this.a, (Resource) obj);
            }
        });
        A().getLoadMoreStatus().observe(this, new Observer() { // from class: kk6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SearchActivity.N(this.a, (SearchViewModel.LoadMoreState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(SearchActivity searchActivity, Resource resource) {
        ConstraintLayout constraintLayout = (ConstraintLayout) searchActivity.findViewById(R.id.hot_search_zone);
        Collection collection = (Collection) resource.getData();
        ViewExKt.setVisible(constraintLayout, !(collection == null || collection.isEmpty()));
        List<TagVo> list = (List) resource.getData();
        if (list == null) {
            return;
        }
        searchActivity.w().setNewData(list);
        AnalyticsHelper.INSTANCE.countSearchTagVisit(CollectionsKt___CollectionsKt.joinToString$default(list, null, null, null, 0, null, c.a, 31, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    public static final void M(SearchActivity searchActivity, Resource resource) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        ViewExKt.setVisible((ProgressBar) searchActivity.findViewById(R.id.loading_bar), resource.getStatus() == Status.LOADING);
        Status status = resource.getStatus();
        Status status2 = Status.SUCCESS;
        if (status != status2) {
            z = false;
        } else {
            Collection collection = (Collection) resource.getData();
            if (collection == null || collection.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
        }
        if (resource.getStatus() != Status.ERROR) {
            if (resource.getStatus() == status2) {
                Collection collection2 = (Collection) resource.getData();
                z2 = collection2 == null || collection2.isEmpty();
            }
        }
        ViewExKt.setVisible((RecyclerView) searchActivity.findViewById(R.id.rcv_search_result), z);
        ViewExKt.setVisible((ConstraintLayout) searchActivity.findViewById(R.id.hot_search_zone), false);
        ViewExKt.setVisible((LinearLayout) searchActivity.findViewById(R.id.error_layout), z2);
        SearchResultAdapter searchResultAdapter = searchActivity.searchResultAdapter;
        Objects.requireNonNull(searchResultAdapter);
        searchResultAdapter.submitList((List) resource.getData());
        int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            ((TypefaceTextView) searchActivity.findViewById(R.id.tv_error_tips)).setText(searchActivity.getString(R.string.tr_search_error_tips));
            ViewExKt.setVisible((Button) searchActivity.findViewById(R.id.retry), true);
            return;
        }
        Collection collection3 = (Collection) resource.getData();
        if (collection3 != null && !collection3.isEmpty()) {
            z3 = false;
        }
        if (z3) {
            ((TypefaceTextView) searchActivity.findViewById(R.id.tv_error_tips)).setText(searchActivity.getString(R.string.tr_search_empty_tips));
            ViewExKt.setVisible((Button) searchActivity.findViewById(R.id.retry), false);
        } else {
            SearchResultAdapter searchResultAdapter2 = searchActivity.searchResultAdapter;
            Objects.requireNonNull(searchResultAdapter2);
            searchResultAdapter2.submitList((List) resource.getData());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(SearchActivity searchActivity, SearchViewModel.LoadMoreState loadMoreState) {
        ViewExKt.setVisible((ProgressBar) searchActivity.findViewById(R.id.load_more_bar), loadMoreState.getIsRunning());
    }

    private final void initView() {
        setTitleBarVisible(false);
        G();
        B();
        F();
        C();
        int i = R.id.tv_cancel;
        ((TypefaceTextView) findViewById(i)).setOnClickListener(new View.OnClickListener() { // from class: hk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchActivity.H(this.a, view);
            }
        });
        ((TypefaceTextView) findViewById(i)).setTextColor(z().getButtonTextColor());
        ((ImageView) findViewById(R.id.delete)).setOnClickListener(new View.OnClickListener() { // from class: fk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchActivity.I(this.a, view);
            }
        });
        int i2 = R.id.retry;
        ((Button) findViewById(i2)).setOnClickListener(new View.OnClickListener() { // from class: gk6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SearchActivity.J(this.a, view);
            }
        });
        ((Button) findViewById(i2)).setTextColor(z().getButtonTextColor());
        ((Button) findViewById(i2)).setBackgroundResource(z().getRoundButtonBg());
    }

    private final void t(IBinder windowToken) {
        Object systemService = getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(SearchInfo searchInfo) {
        if (m.isBlank(searchInfo.getQuery())) {
            return;
        }
        EditText editText = this.editQuery;
        if (editText != null) {
            editText.setText(searchInfo.getQuery());
        }
        EditText editText2 = this.editQuery;
        if (editText2 != null) {
            editText2.setSelection(searchInfo.getQuery().length());
        }
        A().setQuery(searchInfo);
        t(this.editQuery.getWindowToken());
        String mode = searchInfo.getMode();
        if (Intrinsics.areEqual(mode, "name")) {
            AnalyticsHelper.INSTANCE.countSearchEvent(searchInfo.getQuery());
        } else if (Intrinsics.areEqual(mode, "tag")) {
            AnalyticsHelper.INSTANCE.countSearchCourseTag(searchInfo.getQuery());
        }
    }

    private final AppExecutors v() {
        return (AppExecutors) this.appExecutors.getValue();
    }

    private final TagsAdapter w() {
        return (TagsAdapter) this.hotSearchAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CourseLayoutDelegate x() {
        return (CourseLayoutDelegate) this.layoutDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationController y() {
        return (NavigationController) this.navigationController.getValue();
    }

    private final SearchUiDelegate z() {
        return (SearchUiDelegate) this.uiDelegate.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final EditText getEditQuery() {
        return this.editQuery;
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Theme_App_Zepp);
        setContentView(R.layout.training_search_layout);
        GlobalTitleStyleKt.setUnifyTitleStyle$default(this, getString(R.string.tr_search_training), null, 2, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        initView();
        K();
    }

    public final void setEditQuery(@Nullable EditText editText) {
        this.editQuery = editText;
    }
}
