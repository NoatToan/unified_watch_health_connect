package com.huami.moving.sport.ui.activity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.config.DataGroup;
import com.huami.moving.sport.ui.R;
import com.huami.moving.sport.ui.activity.SportDataDetailFragment;
import com.huami.moving.sport.ui.common.SportDataDisplayItem;
import com.huami.moving.sport.ui.databinding.MovingUiFragmentSportDataDetailBinding;
import com.huami.moving.sport.ui.viewmodel.SportDetailPageViewModel;
import com.huami.tools.analytics.DbUtils;
import com.huami.viewbindingx.BindViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.fragment.FragmentViewBindingKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0003\r#\u0013B\u0007¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016R\u001d\u0010\u0011\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010 \u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/huami/moving/sport/ui/activity/SportDataDetailFragment;", "Landroidx/fragment/app/Fragment;", "", "l", "Landroid/graphics/Bitmap;", "bitmap", hl.k, "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/huami/moving/sport/ui/databinding/MovingUiFragmentSportDataDetailBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "e", "()Lcom/huami/moving/sport/ui/databinding/MovingUiFragmentSportDataDetailBinding;", "viewBinding", "Lcom/huami/moving/sport/ui/viewmodel/SportDetailPageViewModel;", "b", "Lkotlin/Lazy;", "f", "()Lcom/huami/moving/sport/ui/viewmodel/SportDetailPageViewModel;", "viewModel", "", "c", "g", "()Z", "isOutdoorSport", "Lcom/huami/moving/sport/ui/activity/SportDataDetailFragment$a;", GoogleApiAvailabilityLight.a, "()Lcom/huami/moving/sport/ui/activity/SportDataDetailFragment$a;", "adapter", "<init>", "()V", "Companion", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SportDataDetailFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty<Object>[] e;

    @NotNull
    private static final String f = "is_outdoor_sport";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy isOutdoorSport;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/moving/sport/ui/activity/SportDataDetailFragment$Companion;", "", "", "isOutdoorSport", "Landroidx/fragment/app/Fragment;", "newInstance", "", "ARG_OUTDOOR_SPORT", "Ljava/lang/String;", "<init>", "()V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Fragment newInstance(boolean isOutdoorSport) {
            SportDataDetailFragment sportDataDetailFragment = new SportDataDetailFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(SportDataDetailFragment.f, isOutdoorSport);
            Unit unit = Unit.INSTANCE;
            sportDataDetailFragment.setArguments(bundle);
            return sportDataDetailFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\t\u001a\u00020\b2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016R(\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015¨\u0006\u0019"}, d2 = {"com/huami/moving/sport/ui/activity/SportDataDetailFragment$a", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/moving/sport/ui/activity/SportDataDetailFragment$b;", "", "Lcom/huami/moving/config/DataGroup;", "", "Lcom/huami/moving/sport/ui/common/SportDataDisplayItem;", "data", "", "c", "Landroid/view/ViewGroup;", "parent", "", "viewType", "b", "holder", "position", "a", "getItemCount", "", "Ljava/util/Map;", LogUtil.I, "size", "<init>", "()V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class a extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Map<DataGroup, List<SportDataDisplayItem>> data = new LinkedHashMap();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private int size;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull b holder, int position) {
            int size = 0;
            for (Map.Entry<DataGroup, List<SportDataDisplayItem>> entry : this.data.entrySet()) {
                if (position < entry.getValue().size() + size) {
                    int i = position - size;
                    holder.a(entry.getValue().get(i), i == 0);
                    return;
                }
                size += entry.getValue().size();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            return new b(LayoutInflater.from(parent.getContext()).inflate(R.layout.moving_ui_item_sport_detail_data, parent, false));
        }

        public final void c(@NotNull Map<DataGroup, ? extends List<SportDataDisplayItem>> data) {
            Iterator<T> it2 = data.values().iterator();
            int size = 0;
            while (it2.hasNext()) {
                size += ((List) it2.next()).size();
            }
            this.data.clear();
            this.data.putAll(data);
            this.size = size;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount, reason: from getter */
        public int getA() {
            return this.size;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¨\u0006\u0010"}, d2 = {"com/huami/moving/sport/ui/activity/SportDataDetailFragment$b", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/moving/sport/ui/common/SportDataDisplayItem;", "item", "Landroid/text/SpannableStringBuilder;", "b", "", "isHeader", "", "a", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "<init>", "(Landroid/view/View;)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class b extends RecyclerView.ViewHolder {
        public b(@NotNull View view) {
            super(view);
        }

        private final SpannableStringBuilder b(Context context, SportDataDisplayItem item) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String value = item.getValue();
            SpannableString spannableString = new SpannableString(value);
            spannableString.setSpan(new TextAppearanceSpan(context, R.style.moving_ui_SportData_DetailValue), 0, value.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) " ");
            String unit = item.getUnit();
            if (unit != null) {
                if (!(!m.isBlank(unit))) {
                    unit = null;
                }
                if (unit != null) {
                    SpannableString spannableString2 = new SpannableString(unit);
                    spannableString2.setSpan(new TextAppearanceSpan(context, R.style.moving_ui_SportData_DetailTitle), 0, unit.length(), 17);
                    spannableStringBuilder.append((CharSequence) spannableString2);
                }
            }
            return spannableStringBuilder;
        }

        public final void a(@NotNull SportDataDisplayItem item, boolean isHeader) {
            int dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(isHeader ? R.dimen.moving_ui_sport_data_header_top_padding : R.dimen.moving_ui_sport_data_top_padding);
            View view = this.itemView;
            view.setPadding(view.getPaddingLeft(), dimensionPixelSize, this.itemView.getPaddingRight(), this.itemView.getPaddingBottom());
            ((TextView) this.itemView.findViewById(R.id.tv_name)).setText(item.getTitle());
            ((TextView) this.itemView.findViewById(R.id.tv_value)).setText(b(this.itemView.getContext(), item));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/moving/sport/ui/activity/SportDataDetailFragment$a;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<a> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a getA() {
            return new a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Boolean> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Boolean getA() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            Bundle arguments = SportDataDetailFragment.this.getArguments();
            Boolean bool = (Boolean) (arguments == null ? null : arguments.get(SportDataDetailFragment.f));
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[4];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SportDataDetailFragment.class), "viewBinding", "getViewBinding()Lcom/huami/moving/sport/ui/databinding/MovingUiFragmentSportDataDetailBinding;"));
        e = kPropertyArr;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SportDataDetailFragment() {
        super(R.layout.moving_ui_fragment_sport_data_detail);
        this.viewBinding = FragmentViewBindingKt.viewBinding(new SportDataDetailFragment$special$$inlined$viewBindingByBind$1(new BindViewBinder(MovingUiFragmentSportDataDetailBinding.class)));
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.moving.sport.ui.activity.SportDataDetailFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SportDetailPageViewModel>() { // from class: com.huami.moving.sport.ui.activity.SportDataDetailFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.moving.sport.ui.viewmodel.SportDetailPageViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SportDetailPageViewModel getA() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SportDetailPageViewModel.class), function0, objArr);
            }
        });
        this.isOutdoorSport = LazyKt__LazyJVMKt.lazy(new d());
        this.adapter = LazyKt__LazyJVMKt.lazy(c.a);
    }

    private final a d() {
        return (a) this.adapter.getValue();
    }

    private final MovingUiFragmentSportDataDetailBinding e() {
        return (MovingUiFragmentSportDataDetailBinding) this.viewBinding.getValue(this, e[0]);
    }

    private final SportDetailPageViewModel f() {
        return (SportDetailPageViewModel) this.viewModel.getValue();
    }

    private final boolean g() {
        return ((Boolean) this.isOutdoorSport.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(SportDataDetailFragment sportDataDetailFragment, View view) {
        sportDataDetailFragment.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(SportDataDetailFragment sportDataDetailFragment, Pair pair) {
        if (((Boolean) pair.getFirst()).booleanValue()) {
            sportDataDetailFragment.k((Bitmap) pair.getSecond());
        } else {
            sportDataDetailFragment.l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SportDataDetailFragment sportDataDetailFragment, Map map) {
        sportDataDetailFragment.d().c(map);
    }

    private final void k(Bitmap bitmap) {
        e().ivBackground.setImageDrawable(new BitmapDrawable(getResources(), bitmap));
        e().rootContainer.setBackground(new ColorDrawable(ContextCompat.getColor(requireContext(), R.color.moving_ui_black_transparent)));
    }

    private final void l() {
        e().ivBackground.setImageResource(R.drawable.moving_ui_bg_sport_data_detail);
    }

    @JvmStatic
    @NotNull
    public static final Fragment newInstance(boolean z) {
        return INSTANCE.newInstance(z);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        e().titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: x77
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SportDataDetailFragment.h(this.a, view2);
            }
        });
        if (g()) {
            f().getMapBackgroundLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: z77
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    SportDataDetailFragment.i(this.a, (Pair) obj);
                }
            });
        } else {
            l();
        }
        e().rvContainer.setAdapter(d());
        f().getSportDetailData().observe(getViewLifecycleOwner(), new Observer() { // from class: y77
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SportDataDetailFragment.j(this.a, (Map) obj);
            }
        });
    }
}
