package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;
import com.huami.sleep.view.UnitTextView;

/* JADX INFO: loaded from: classes13.dex */
public final class FragmentIntoSleepDetailBinding implements ViewBinding {

    @NonNull
    private final NestedScrollView a;

    @NonNull
    public final TextView detailIntoSleepAdviceOne;

    @NonNull
    public final TextView detailIntoSleepAdviceThree;

    @NonNull
    public final TextView detailIntoSleepAdviceTitle;

    @NonNull
    public final TextView detailIntoSleepAdviceTwo;

    @NonNull
    public final TextView detailIntoSleepChange;

    @NonNull
    public final ImageView detailIntoSleepChangeImg;

    @NonNull
    public final Group detailIntoSleepChinaTagGroup;

    @NonNull
    public final Group detailIntoSleepForeignTagGroup;

    @NonNull
    public final Group detailIntoSleepGroup;

    @NonNull
    public final TextView detailIntoSleepRefs;

    @NonNull
    public final ImageView detailIntoSleepSkyImg;

    @NonNull
    public final TextView detailIntoSleepSkyImgBeta;

    @NonNull
    public final TextView detailIntoSleepSkyImgBetaForeign;

    @NonNull
    public final TextView detailIntoSleepSkyImgFreeSign;

    @NonNull
    public final TextView detailIntoSleepSkyImgFreeSignForeign;

    @NonNull
    public final TextView detailIntoSleepSkyImgName;

    @NonNull
    public final TextView detailIntoSleepUpdateFour;

    @NonNull
    public final TextView detailIntoSleepUpdateOne;

    @NonNull
    public final TextView detailIntoSleepUpdateOnePlus;

    @NonNull
    public final TextView detailIntoSleepUpdateThree;

    @NonNull
    public final TextView detailIntoSleepUpdateTitle;

    @NonNull
    public final TextView detailIntoSleepUpdateTwo;

    @NonNull
    public final UnitTextView detailIntoSleepValue;

    @NonNull
    public final TextView detailIntoSleepWhatTitle;

    @NonNull
    public final TextView detailIntoSleepWhatTitleDesc;

    @NonNull
    public final View divider;

    @NonNull
    public final TextView sleepReferenceDocuments;

    @NonNull
    public final TextView sleepReferenceDocumentsInfo;

    private FragmentIntoSleepDetailBinding(@NonNull NestedScrollView rootView, @NonNull TextView detailIntoSleepAdviceOne, @NonNull TextView detailIntoSleepAdviceThree, @NonNull TextView detailIntoSleepAdviceTitle, @NonNull TextView detailIntoSleepAdviceTwo, @NonNull TextView detailIntoSleepChange, @NonNull ImageView detailIntoSleepChangeImg, @NonNull Group detailIntoSleepChinaTagGroup, @NonNull Group detailIntoSleepForeignTagGroup, @NonNull Group detailIntoSleepGroup, @NonNull TextView detailIntoSleepRefs, @NonNull ImageView detailIntoSleepSkyImg, @NonNull TextView detailIntoSleepSkyImgBeta, @NonNull TextView detailIntoSleepSkyImgBetaForeign, @NonNull TextView detailIntoSleepSkyImgFreeSign, @NonNull TextView detailIntoSleepSkyImgFreeSignForeign, @NonNull TextView detailIntoSleepSkyImgName, @NonNull TextView detailIntoSleepUpdateFour, @NonNull TextView detailIntoSleepUpdateOne, @NonNull TextView detailIntoSleepUpdateOnePlus, @NonNull TextView detailIntoSleepUpdateThree, @NonNull TextView detailIntoSleepUpdateTitle, @NonNull TextView detailIntoSleepUpdateTwo, @NonNull UnitTextView detailIntoSleepValue, @NonNull TextView detailIntoSleepWhatTitle, @NonNull TextView detailIntoSleepWhatTitleDesc, @NonNull View divider, @NonNull TextView sleepReferenceDocuments, @NonNull TextView sleepReferenceDocumentsInfo) {
        this.a = rootView;
        this.detailIntoSleepAdviceOne = detailIntoSleepAdviceOne;
        this.detailIntoSleepAdviceThree = detailIntoSleepAdviceThree;
        this.detailIntoSleepAdviceTitle = detailIntoSleepAdviceTitle;
        this.detailIntoSleepAdviceTwo = detailIntoSleepAdviceTwo;
        this.detailIntoSleepChange = detailIntoSleepChange;
        this.detailIntoSleepChangeImg = detailIntoSleepChangeImg;
        this.detailIntoSleepChinaTagGroup = detailIntoSleepChinaTagGroup;
        this.detailIntoSleepForeignTagGroup = detailIntoSleepForeignTagGroup;
        this.detailIntoSleepGroup = detailIntoSleepGroup;
        this.detailIntoSleepRefs = detailIntoSleepRefs;
        this.detailIntoSleepSkyImg = detailIntoSleepSkyImg;
        this.detailIntoSleepSkyImgBeta = detailIntoSleepSkyImgBeta;
        this.detailIntoSleepSkyImgBetaForeign = detailIntoSleepSkyImgBetaForeign;
        this.detailIntoSleepSkyImgFreeSign = detailIntoSleepSkyImgFreeSign;
        this.detailIntoSleepSkyImgFreeSignForeign = detailIntoSleepSkyImgFreeSignForeign;
        this.detailIntoSleepSkyImgName = detailIntoSleepSkyImgName;
        this.detailIntoSleepUpdateFour = detailIntoSleepUpdateFour;
        this.detailIntoSleepUpdateOne = detailIntoSleepUpdateOne;
        this.detailIntoSleepUpdateOnePlus = detailIntoSleepUpdateOnePlus;
        this.detailIntoSleepUpdateThree = detailIntoSleepUpdateThree;
        this.detailIntoSleepUpdateTitle = detailIntoSleepUpdateTitle;
        this.detailIntoSleepUpdateTwo = detailIntoSleepUpdateTwo;
        this.detailIntoSleepValue = detailIntoSleepValue;
        this.detailIntoSleepWhatTitle = detailIntoSleepWhatTitle;
        this.detailIntoSleepWhatTitleDesc = detailIntoSleepWhatTitleDesc;
        this.divider = divider;
        this.sleepReferenceDocuments = sleepReferenceDocuments;
        this.sleepReferenceDocumentsInfo = sleepReferenceDocumentsInfo;
    }

    @NonNull
    public static FragmentIntoSleepDetailBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        int i = R.id.detailIntoSleepAdviceOne;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.detailIntoSleepAdviceThree;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView2 != null) {
                i = R.id.detailIntoSleepAdviceTitle;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView3 != null) {
                    i = R.id.detailIntoSleepAdviceTwo;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView4 != null) {
                        i = R.id.detailIntoSleepChange;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView5 != null) {
                            i = R.id.detailIntoSleepChangeImg;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                            if (imageView != null) {
                                i = R.id.detailIntoSleepChinaTagGroup;
                                Group group = (Group) ViewBindings.findChildViewById(rootView, i);
                                if (group != null) {
                                    i = R.id.detailIntoSleepForeignTagGroup;
                                    Group group2 = (Group) ViewBindings.findChildViewById(rootView, i);
                                    if (group2 != null) {
                                        i = R.id.detailIntoSleepGroup;
                                        Group group3 = (Group) ViewBindings.findChildViewById(rootView, i);
                                        if (group3 != null) {
                                            i = R.id.detailIntoSleepRefs;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                            if (textView6 != null) {
                                                i = R.id.detailIntoSleepSkyImg;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                                if (imageView2 != null) {
                                                    i = R.id.detailIntoSleepSkyImgBeta;
                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                    if (textView7 != null) {
                                                        i = R.id.detailIntoSleepSkyImgBetaForeign;
                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                        if (textView8 != null) {
                                                            i = R.id.detailIntoSleepSkyImgFreeSign;
                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                            if (textView9 != null) {
                                                                i = R.id.detailIntoSleepSkyImgFreeSignForeign;
                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                if (textView10 != null) {
                                                                    i = R.id.detailIntoSleepSkyImgName;
                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                    if (textView11 != null) {
                                                                        i = R.id.detailIntoSleepUpdateFour;
                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                        if (textView12 != null) {
                                                                            i = R.id.detailIntoSleepUpdateOne;
                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                            if (textView13 != null) {
                                                                                i = R.id.detailIntoSleepUpdateOnePlus;
                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                if (textView14 != null) {
                                                                                    i = R.id.detailIntoSleepUpdateThree;
                                                                                    TextView textView15 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                    if (textView15 != null) {
                                                                                        i = R.id.detailIntoSleepUpdateTitle;
                                                                                        TextView textView16 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                        if (textView16 != null) {
                                                                                            i = R.id.detailIntoSleepUpdateTwo;
                                                                                            TextView textView17 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                            if (textView17 != null) {
                                                                                                i = R.id.detailIntoSleepValue;
                                                                                                UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                if (unitTextView != null) {
                                                                                                    i = R.id.detailIntoSleepWhatTitle;
                                                                                                    TextView textView18 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                    if (textView18 != null) {
                                                                                                        i = R.id.detailIntoSleepWhatTitleDesc;
                                                                                                        TextView textView19 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                        if (textView19 != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.divider))) != null) {
                                                                                                            i = R.id.sleep_reference_documents;
                                                                                                            TextView textView20 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                            if (textView20 != null) {
                                                                                                                i = R.id.sleep_reference_documents_info;
                                                                                                                TextView textView21 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                if (textView21 != null) {
                                                                                                                    return new FragmentIntoSleepDetailBinding((NestedScrollView) rootView, textView, textView2, textView3, textView4, textView5, imageView, group, group2, group3, textView6, imageView2, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, unitTextView, textView18, textView19, viewFindChildViewById, textView20, textView21);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentIntoSleepDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentIntoSleepDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_into_sleep_detail, parent, false);
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
