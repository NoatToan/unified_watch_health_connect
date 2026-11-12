package com.huami.pai.lib.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.pai.lib.R;

/* JADX INFO: loaded from: classes12.dex */
public final class PaiFragmentFitnessAgeBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Group ageChartArea;

    @NonNull
    public final View ageChartBg;

    @NonNull
    public final FrameLayout ageChartContainer;

    @NonNull
    public final Group ageSeekbarArea;

    @NonNull
    public final Space ageSeekbarAreaBottomSpace;

    @NonNull
    public final TextView currentAge;

    @NonNull
    public final TextView currentAgeTitle;

    @NonNull
    public final TextView insistDays;

    @NonNull
    public final SeekBar insistDaysSeekbar;

    @NonNull
    public final TextView insistDaysTitle;

    @NonNull
    public final TextView paiName;

    @NonNull
    public final View predictedAgeBg;

    @NonNull
    public final TextView predictedAgeTitle;

    @NonNull
    public final Group questionnaire;

    @NonNull
    public final ImageView questionnaireArrow;

    @NonNull
    public final View questionnaireBg;

    @NonNull
    public final Barrier questionnaireBottomBorder;

    @NonNull
    public final Space questionnaireBottomSpace;

    @NonNull
    public final ImageView questionnaireIcon;

    @NonNull
    public final TextView questionnaireSubtitle;

    @NonNull
    public final TextView questionnaireTitle;

    @NonNull
    public final Barrier questionnaireTopBorder;

    @NonNull
    public final Space questionnaireTopSpace;

    @NonNull
    public final ConstraintLayout rootFitage;

    @NonNull
    public final TextView soughtPai;

    @NonNull
    public final SeekBar soughtPaiSeekbar;

    private PaiFragmentFitnessAgeBinding(@NonNull ConstraintLayout rootView, @NonNull Group ageChartArea, @NonNull View ageChartBg, @NonNull FrameLayout ageChartContainer, @NonNull Group ageSeekbarArea, @NonNull Space ageSeekbarAreaBottomSpace, @NonNull TextView currentAge, @NonNull TextView currentAgeTitle, @NonNull TextView insistDays, @NonNull SeekBar insistDaysSeekbar, @NonNull TextView insistDaysTitle, @NonNull TextView paiName, @NonNull View predictedAgeBg, @NonNull TextView predictedAgeTitle, @NonNull Group questionnaire, @NonNull ImageView questionnaireArrow, @NonNull View questionnaireBg, @NonNull Barrier questionnaireBottomBorder, @NonNull Space questionnaireBottomSpace, @NonNull ImageView questionnaireIcon, @NonNull TextView questionnaireSubtitle, @NonNull TextView questionnaireTitle, @NonNull Barrier questionnaireTopBorder, @NonNull Space questionnaireTopSpace, @NonNull ConstraintLayout rootFitage, @NonNull TextView soughtPai, @NonNull SeekBar soughtPaiSeekbar) {
        this.a = rootView;
        this.ageChartArea = ageChartArea;
        this.ageChartBg = ageChartBg;
        this.ageChartContainer = ageChartContainer;
        this.ageSeekbarArea = ageSeekbarArea;
        this.ageSeekbarAreaBottomSpace = ageSeekbarAreaBottomSpace;
        this.currentAge = currentAge;
        this.currentAgeTitle = currentAgeTitle;
        this.insistDays = insistDays;
        this.insistDaysSeekbar = insistDaysSeekbar;
        this.insistDaysTitle = insistDaysTitle;
        this.paiName = paiName;
        this.predictedAgeBg = predictedAgeBg;
        this.predictedAgeTitle = predictedAgeTitle;
        this.questionnaire = questionnaire;
        this.questionnaireArrow = questionnaireArrow;
        this.questionnaireBg = questionnaireBg;
        this.questionnaireBottomBorder = questionnaireBottomBorder;
        this.questionnaireBottomSpace = questionnaireBottomSpace;
        this.questionnaireIcon = questionnaireIcon;
        this.questionnaireSubtitle = questionnaireSubtitle;
        this.questionnaireTitle = questionnaireTitle;
        this.questionnaireTopBorder = questionnaireTopBorder;
        this.questionnaireTopSpace = questionnaireTopSpace;
        this.rootFitage = rootFitage;
        this.soughtPai = soughtPai;
        this.soughtPaiSeekbar = soughtPaiSeekbar;
    }

    @NonNull
    public static PaiFragmentFitnessAgeBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        int i = R.id.ageChartArea;
        Group group = (Group) ViewBindings.findChildViewById(rootView, i);
        if (group != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.ageChartBg))) != null) {
            i = R.id.ageChartContainer;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
            if (frameLayout != null) {
                i = R.id.ageSeekbarArea;
                Group group2 = (Group) ViewBindings.findChildViewById(rootView, i);
                if (group2 != null) {
                    i = R.id.ageSeekbarAreaBottomSpace;
                    Space space = (Space) ViewBindings.findChildViewById(rootView, i);
                    if (space != null) {
                        i = R.id.currentAge;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView != null) {
                            i = R.id.currentAgeTitle;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView2 != null) {
                                i = R.id.insistDays;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                if (textView3 != null) {
                                    i = R.id.insistDaysSeekbar;
                                    SeekBar seekBar = (SeekBar) ViewBindings.findChildViewById(rootView, i);
                                    if (seekBar != null) {
                                        i = R.id.insistDaysTitle;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                        if (textView4 != null) {
                                            i = R.id.paiName;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                            if (textView5 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, (i = R.id.predictedAgeBg))) != null) {
                                                i = R.id.predictedAgeTitle;
                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                if (textView6 != null) {
                                                    i = R.id.questionnaire;
                                                    Group group3 = (Group) ViewBindings.findChildViewById(rootView, i);
                                                    if (group3 != null) {
                                                        i = R.id.questionnaireArrow;
                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                                        if (imageView != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, (i = R.id.questionnaireBg))) != null) {
                                                            i = R.id.questionnaireBottomBorder;
                                                            Barrier barrier = (Barrier) ViewBindings.findChildViewById(rootView, i);
                                                            if (barrier != null) {
                                                                i = R.id.questionnaireBottomSpace;
                                                                Space space2 = (Space) ViewBindings.findChildViewById(rootView, i);
                                                                if (space2 != null) {
                                                                    i = R.id.questionnaireIcon;
                                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                                                    if (imageView2 != null) {
                                                                        i = R.id.questionnaireSubtitle;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                        if (textView7 != null) {
                                                                            i = R.id.questionnaireTitle;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                            if (textView8 != null) {
                                                                                i = R.id.questionnaireTopBorder;
                                                                                Barrier barrier2 = (Barrier) ViewBindings.findChildViewById(rootView, i);
                                                                                if (barrier2 != null) {
                                                                                    i = R.id.questionnaireTopSpace;
                                                                                    Space space3 = (Space) ViewBindings.findChildViewById(rootView, i);
                                                                                    if (space3 != null) {
                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
                                                                                        i = R.id.soughtPai;
                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                        if (textView9 != null) {
                                                                                            i = R.id.soughtPaiSeekbar;
                                                                                            SeekBar seekBar2 = (SeekBar) ViewBindings.findChildViewById(rootView, i);
                                                                                            if (seekBar2 != null) {
                                                                                                return new PaiFragmentFitnessAgeBinding(constraintLayout, group, viewFindChildViewById, frameLayout, group2, space, textView, textView2, textView3, seekBar, textView4, textView5, viewFindChildViewById2, textView6, group3, imageView, viewFindChildViewById3, barrier, space2, imageView2, textView7, textView8, barrier2, space3, constraintLayout, textView9, seekBar2);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static PaiFragmentFitnessAgeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PaiFragmentFitnessAgeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.pai_fragment_fitness_age, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
