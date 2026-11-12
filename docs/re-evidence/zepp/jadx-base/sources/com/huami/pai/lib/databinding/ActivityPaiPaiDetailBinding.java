package com.huami.pai.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.pai.lib.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes12.dex */
public final class ActivityPaiPaiDetailBinding implements ViewBinding {

    @NonNull
    private final NestedScrollView a;

    @NonNull
    public final Barrier flBarrier;

    @NonNull
    public final FragmentContainerView flDayhr;

    @NonNull
    public final FragmentContainerView flDaynohr;

    @NonNull
    public final FragmentContainerView flFitnessage;

    @NonNull
    public final FragmentContainerView flHistory;

    @NonNull
    public final FragmentContainerView flHrsetting;

    @NonNull
    public final FragmentContainerView flIntro;

    @NonNull
    public final FragmentContainerView flSporthint;

    @NonNull
    public final TypefaceTextView jpHintText;

    private ActivityPaiPaiDetailBinding(@NonNull NestedScrollView rootView, @NonNull Barrier flBarrier, @NonNull FragmentContainerView flDayhr, @NonNull FragmentContainerView flDaynohr, @NonNull FragmentContainerView flFitnessage, @NonNull FragmentContainerView flHistory, @NonNull FragmentContainerView flHrsetting, @NonNull FragmentContainerView flIntro, @NonNull FragmentContainerView flSporthint, @NonNull TypefaceTextView jpHintText) {
        this.a = rootView;
        this.flBarrier = flBarrier;
        this.flDayhr = flDayhr;
        this.flDaynohr = flDaynohr;
        this.flFitnessage = flFitnessage;
        this.flHistory = flHistory;
        this.flHrsetting = flHrsetting;
        this.flIntro = flIntro;
        this.flSporthint = flSporthint;
        this.jpHintText = jpHintText;
    }

    @NonNull
    public static ActivityPaiPaiDetailBinding bind(@NonNull View rootView) {
        int i = R.id.fl_barrier;
        Barrier barrier = (Barrier) ViewBindings.findChildViewById(rootView, i);
        if (barrier != null) {
            i = R.id.fl_dayhr;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(rootView, i);
            if (fragmentContainerView != null) {
                i = R.id.fl_daynohr;
                FragmentContainerView fragmentContainerView2 = (FragmentContainerView) ViewBindings.findChildViewById(rootView, i);
                if (fragmentContainerView2 != null) {
                    i = R.id.fl_fitnessage;
                    FragmentContainerView fragmentContainerView3 = (FragmentContainerView) ViewBindings.findChildViewById(rootView, i);
                    if (fragmentContainerView3 != null) {
                        i = R.id.fl_history;
                        FragmentContainerView fragmentContainerView4 = (FragmentContainerView) ViewBindings.findChildViewById(rootView, i);
                        if (fragmentContainerView4 != null) {
                            i = R.id.fl_hrsetting;
                            FragmentContainerView fragmentContainerView5 = (FragmentContainerView) ViewBindings.findChildViewById(rootView, i);
                            if (fragmentContainerView5 != null) {
                                i = R.id.fl_intro;
                                FragmentContainerView fragmentContainerView6 = (FragmentContainerView) ViewBindings.findChildViewById(rootView, i);
                                if (fragmentContainerView6 != null) {
                                    i = R.id.fl_sporthint;
                                    FragmentContainerView fragmentContainerView7 = (FragmentContainerView) ViewBindings.findChildViewById(rootView, i);
                                    if (fragmentContainerView7 != null) {
                                        i = R.id.jp_hint_text;
                                        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, i);
                                        if (typefaceTextView != null) {
                                            return new ActivityPaiPaiDetailBinding((NestedScrollView) rootView, barrier, fragmentContainerView, fragmentContainerView2, fragmentContainerView3, fragmentContainerView4, fragmentContainerView5, fragmentContainerView6, fragmentContainerView7, typefaceTextView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityPaiPaiDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityPaiPaiDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_pai_pai_detail, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.a;
    }
}
