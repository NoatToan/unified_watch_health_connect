package com.huami.device.feature.health.ui.bloodpressure.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.device.feature.health.bloodpressure_ui.R;
import com.huami.device.feature.health.ui.bloodpressure.fragment.BloodPressureGuideFragment;
import com.huami.device.feature.health.ui.bloodpressure.viewmodel.BloodPressureCorrectViewModel;
import com.huami.device.feature.health.ui.view.HeightWrapContentViewPager;
import com.huami.device.feature.health.ui.view.SquareImageView;
import com.huami.device.feature.health.util.BloodPressureExtKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/device/feature/health/ui/bloodpressure/fragment/BloodPressureGuideFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "", "onViewCreated", "Lcom/huami/device/feature/health/ui/bloodpressure/viewmodel/BloodPressureCorrectViewModel;", "a", "Lkotlin/Lazy;", "c", "()Lcom/huami/device/feature/health/ui/bloodpressure/viewmodel/BloodPressureCorrectViewModel;", "mViewModel", "", "Lcom/huami/device/feature/health/ui/view/SquareImageView;", "b", "()Ljava/util/List;", "mImages", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureGuideFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BloodPressureCorrectViewModel.class), new Function0<ViewModelStore>() { // from class: com.huami.device.feature.health.ui.bloodpressure.fragment.BloodPressureGuideFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return this.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.huami.device.feature.health.ui.bloodpressure.fragment.BloodPressureGuideFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider.Factory invoke() {
            return this.requireActivity().getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mImages = LazyKt__LazyJVMKt.lazy(new b());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0012"}, d2 = {"com/huami/device/feature/health/ui/bloodpressure/fragment/BloodPressureGuideFragment$a", "Landroidx/viewpager/widget/PagerAdapter;", "", "getCount", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "object", "", "isViewFromObject", "Landroid/view/ViewGroup;", "container", "position", "instantiateItem", "", "destroyItem", "<init>", "(Lcom/huami/device/feature/health/ui/bloodpressure/fragment/BloodPressureGuideFragment;)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
    public final class a extends PagerAdapter {
        public a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(@NotNull ViewGroup container, int position, @NotNull Object object) {
            container.removeView((View) BloodPressureGuideFragment.this.b().get(position));
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        /* JADX INFO: renamed from: getCount */
        public int getPagerCount() {
            return 3;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NotNull
        public Object instantiateItem(@NotNull ViewGroup container, int position) {
            Object obj = BloodPressureGuideFragment.this.b().get(position);
            container.addView((SquareImageView) obj);
            return obj;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(@NotNull View view, @NotNull Object object) {
            return Intrinsics.areEqual(view, object);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/device/feature/health/ui/view/SquareImageView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<List<? extends SquareImageView>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends SquareImageView> invoke() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(R.drawable.ic_guide_one));
            arrayList.add(Integer.valueOf(R.drawable.ic_guide_two));
            arrayList.add(Integer.valueOf(R.drawable.ic_guide_three));
            BloodPressureGuideFragment bloodPressureGuideFragment = BloodPressureGuideFragment.this;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                SquareImageView squareImageView = new SquareImageView(bloodPressureGuideFragment.requireContext(), null, 0, 6, null);
                squareImageView.setImageResource(iIntValue);
                squareImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                arrayList2.add(squareImageView);
            }
            return arrayList2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SquareImageView> b() {
        return (List) this.mImages.getValue();
    }

    private final BloodPressureCorrectViewModel c() {
        return (BloodPressureCorrectViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(BloodPressureGuideFragment bloodPressureGuideFragment, View view) {
        if (bloodPressureGuideFragment.c().checkDeviceConnect()) {
            FragmentKt.findNavController(bloodPressureGuideFragment).navigate(R.id.guide_to_measure);
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blood_pressure_guide, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        View view2 = getView();
        ((Button) (view2 == null ? null : view2.findViewById(R.id.btn_next))).setOnClickListener(new View.OnClickListener() { // from class: u00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                BloodPressureGuideFragment.d(this.a, view3);
            }
        });
        View view3 = getView();
        ((TextView) (view3 == null ? null : view3.findViewById(R.id.guide_summary))).setText(getResources().getStringArray(R.array.blood_pressure_guide_summary)[0]);
        View view4 = getView();
        ((ImageView) (view4 == null ? null : view4.findViewById(R.id.dot_one))).setEnabled(true);
        View view5 = getView();
        ((ImageView) (view5 == null ? null : view5.findViewById(R.id.dot_two))).setEnabled(false);
        View view6 = getView();
        ((ImageView) (view6 == null ? null : view6.findViewById(R.id.dot_three))).setEnabled(false);
        View view7 = getView();
        ((HeightWrapContentViewPager) (view7 == null ? null : view7.findViewById(R.id.guide_img_view_pager))).setAdapter(new a());
        View view8 = getView();
        ((HeightWrapContentViewPager) (view8 == null ? null : view8.findViewById(R.id.guide_img_view_pager))).addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.huami.device.feature.health.ui.bloodpressure.fragment.BloodPressureGuideFragment.onViewCreated.2
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int position) {
                View view9 = BloodPressureGuideFragment.this.getView();
                ((ImageView) (view9 == null ? null : view9.findViewById(R.id.dot_one))).setEnabled(position == 0);
                View view10 = BloodPressureGuideFragment.this.getView();
                ((ImageView) (view10 == null ? null : view10.findViewById(R.id.dot_two))).setEnabled(position == 1);
                View view11 = BloodPressureGuideFragment.this.getView();
                ((ImageView) (view11 == null ? null : view11.findViewById(R.id.dot_three))).setEnabled(position == 2);
                View view12 = BloodPressureGuideFragment.this.getView();
                BloodPressureExtKt.setVisible(view12 == null ? null : view12.findViewById(R.id.btn_next), position == 2);
                View view13 = BloodPressureGuideFragment.this.getView();
                ((TextView) (view13 != null ? view13.findViewById(R.id.guide_summary) : null)).setText(BloodPressureGuideFragment.this.getResources().getStringArray(R.array.blood_pressure_guide_summary)[position]);
            }
        });
        View view9 = getView();
        ((HeightWrapContentViewPager) (view9 != null ? view9.findViewById(R.id.guide_img_view_pager) : null)).setCurrentItem(0);
    }
}
