package com.huami.pai.view;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.DialogFragment;
import androidx.viewpager.widget.ViewPager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.pai.ext.ViewExKt;
import com.huami.pai.koin.ScopesAndQualifersKt;
import com.huami.pai.lib.R;
import com.huami.pai.sp.ISharedPref;
import com.huami.pai.view.PaiGuidePopupFragment;
import com.huami.pai.vo.PaiGuide;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/pai/view/PaiGuidePopupFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/view/View;", "contentView", "", GoogleApiAvailabilityLight.a, "Ljava/util/ArrayList;", "Lcom/huami/pai/vo/PaiGuide;", "g", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onStart", "", "a", "Z", "isRtl", "Lcom/huami/pai/sp/ISharedPref;", "b", "Lkotlin/Lazy;", "c", "()Lcom/huami/pai/sp/ISharedPref;", "mSharedPref", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class PaiGuidePopupFragment extends DialogFragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isRtl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mSharedPref;

    /* JADX WARN: Multi-variable type inference failed */
    public PaiGuidePopupFragment() {
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mSharedPref = LazyKt__LazyJVMKt.lazy(new Function0<ISharedPref>() { // from class: com.huami.pai.view.PaiGuidePopupFragment$special$$inlined$injectInPai$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.huami.pai.sp.ISharedPref, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ISharedPref invoke() {
                return ScopesAndQualifersKt.paiScope(ComponentCallbackExtKt.getKoin(this)).get(Reflection.getOrCreateKotlinClass(ISharedPref.class), qualifier, objArr);
            }
        });
    }

    private final ISharedPref c() {
        return (ISharedPref) this.mSharedPref.getValue();
    }

    private final void d(View contentView) {
        ImageButton imageButton = (ImageButton) contentView.findViewById(R.id.guide_close_button);
        imageButton.bringToFront();
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: or5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaiGuidePopupFragment.e(this.a, view);
            }
        });
        final Button button = (Button) contentView.findViewById(R.id.last_page_button);
        button.setOnClickListener(new View.OnClickListener() { // from class: pr5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PaiGuidePopupFragment.f(this.a, view);
            }
        });
        ViewPager viewPager = (ViewPager) contentView.findViewById(R.id.guide_vp);
        final ImageView imageView = (ImageView) contentView.findViewById(R.id.guide_current_indicator);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.pai_circle_6);
        if (drawable != null) {
            drawable.setTint(ViewExKt.color(requireContext(), R.color.p3));
        }
        imageView.setImageDrawable(drawable);
        LinearLayout linearLayout = (LinearLayout) contentView.findViewById(R.id.guide_indicator_container);
        final ArrayList<PaiGuide> arrayListG = g();
        final float dimension = getResources().getDimension(R.dimen.size_18dp);
        int i = 0;
        int size = arrayListG.size() - 1;
        if (size >= 0) {
            do {
                i++;
                ImageView imageView2 = new ImageView(requireContext());
                Drawable drawable2 = ContextCompat.getDrawable(requireContext(), R.drawable.pai_circle_6);
                if (drawable2 != null) {
                    drawable2.setTint(ViewExKt.addAlpha(ViewExKt.color(requireContext(), R.color.s3), 0.5d));
                }
                imageView2.setImageDrawable(drawable2);
                imageView2.setScaleType(ImageView.ScaleType.MATRIX);
                int i2 = (int) dimension;
                imageView2.setLayoutParams(new LinearLayout.LayoutParams(i2, i2));
                linearLayout.addView(imageView2);
            } while (i <= size);
        }
        viewPager.setOffscreenPageLimit(5);
        viewPager.setAdapter(new PaiGuideAdapter(arrayListG, requireContext()));
        if (this.isRtl) {
            viewPager.setCurrentItem(arrayListG.size() - 1);
        }
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.huami.pai.view.PaiGuidePopupFragment$initContentView$3
            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (this.a.isRtl) {
                    position -= arrayListG.size() - 1;
                }
                imageView.setTranslationX((position + positionOffset) * dimension);
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int position) {
                if (position == (this.a.isRtl ? 0 : arrayListG.size() - 1)) {
                    button.setVisibility(0);
                } else {
                    button.setVisibility(8);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(PaiGuidePopupFragment paiGuidePopupFragment, View view) {
        paiGuidePopupFragment.dismiss();
        paiGuidePopupFragment.c().saveBoolean("key_pai_guide_rollout", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(PaiGuidePopupFragment paiGuidePopupFragment, View view) {
        paiGuidePopupFragment.dismiss();
        paiGuidePopupFragment.c().saveBoolean("key_pai_guide_rollout", false);
    }

    private final ArrayList<PaiGuide> g() {
        ArrayList<PaiGuide> arrayList = new ArrayList<>();
        PaiGuide paiGuide = new PaiGuide(null, null, 0, 7, null);
        paiGuide.setTitle(getString(R.string.pai_guide_feat_produce_title_modify));
        paiGuide.setDesc(getString(R.string.pai_guide_feat_produce_desce_modify));
        paiGuide.setIllustrationId(R.drawable.pai_guide_illustration_feat_produce);
        arrayList.add(paiGuide);
        PaiGuide paiGuide2 = new PaiGuide(null, null, 0, 7, null);
        paiGuide2.setTitle(getString(R.string.pai_guide_feat_goal_titlee_modify));
        paiGuide2.setDesc(getString(R.string.pai_guide_feat_goal_desce_modify));
        paiGuide2.setIllustrationId(R.drawable.pai_guide_illustration_feat_goal);
        arrayList.add(paiGuide2);
        PaiGuide paiGuide3 = new PaiGuide(null, null, 0, 7, null);
        paiGuide3.setTitle(getString(R.string.pai_guide_feat_keep_title));
        paiGuide3.setDesc(getString(R.string.pai_guide_feat_keep_desce_modify));
        paiGuide3.setIllustrationId(R.drawable.pai_guide_illustration_feat_keep);
        arrayList.add(paiGuide3);
        PaiGuide paiGuide4 = new PaiGuide(null, null, 0, 7, null);
        paiGuide4.setTitle(getString(R.string.pai_guide_feat_custom_titlee_modify));
        paiGuide4.setDesc(getString(R.string.pai_guide_feat_custom_desce_modify));
        paiGuide4.setIllustrationId(R.drawable.pai_guide_illustration_feat_custom);
        arrayList.add(paiGuide4);
        PaiGuide paiGuide5 = new PaiGuide(null, null, 0, 7, null);
        paiGuide5.setTitle(getString(R.string.pai_guide_feat_improve_titlee_modify));
        paiGuide5.setDesc(getString(R.string.pai_guide_feat_improve_desce_modify));
        paiGuide5.setIllustrationId(R.drawable.pai_guide_illustration_feat_imporve);
        arrayList.add(paiGuide5);
        if (this.isRtl) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.pai_tip_common_dialog, container, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        Objects.requireNonNull(dialog);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 17;
            attributes.width = (int) ViewExKt.dip2px(280, requireContext());
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) view;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.fragment_pai_guide_popup, viewGroup, false);
        this.isRtl = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        d(viewInflate);
        viewGroup.addView(viewInflate);
    }
}
