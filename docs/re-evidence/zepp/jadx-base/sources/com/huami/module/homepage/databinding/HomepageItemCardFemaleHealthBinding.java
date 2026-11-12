package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.business.femalehealth.FemaleCircleListView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageItemCardFemaleHealthBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout cardFragment;

    @NonNull
    public final Button femaleHealthButton;

    @NonNull
    public final TextView femaleHealthContent;

    @NonNull
    public final TextView femaleHealthLevel;

    @NonNull
    public final FemaleCircleListView femaleHealthList;

    @NonNull
    public final View femaleHealthNone;

    @NonNull
    public final TextView femaleHealthNoneContent;

    @NonNull
    public final TextView femaleHealthTitle;

    @NonNull
    public final Group homepageFemaleHealthNoneGroup;

    private HomepageItemCardFemaleHealthBinding(@NonNull ConstraintLayout rootView, @NonNull ConstraintLayout cardFragment, @NonNull Button femaleHealthButton, @NonNull TextView femaleHealthContent, @NonNull TextView femaleHealthLevel, @NonNull FemaleCircleListView femaleHealthList, @NonNull View femaleHealthNone, @NonNull TextView femaleHealthNoneContent, @NonNull TextView femaleHealthTitle, @NonNull Group homepageFemaleHealthNoneGroup) {
        this.a = rootView;
        this.cardFragment = cardFragment;
        this.femaleHealthButton = femaleHealthButton;
        this.femaleHealthContent = femaleHealthContent;
        this.femaleHealthLevel = femaleHealthLevel;
        this.femaleHealthList = femaleHealthList;
        this.femaleHealthNone = femaleHealthNone;
        this.femaleHealthNoneContent = femaleHealthNoneContent;
        this.femaleHealthTitle = femaleHealthTitle;
        this.homepageFemaleHealthNoneGroup = homepageFemaleHealthNoneGroup;
    }

    @NonNull
    public static HomepageItemCardFemaleHealthBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        ConstraintLayout constraintLayout = (ConstraintLayout) rootView;
        int i = R.id.female_health_button;
        Button button = (Button) ViewBindings.findChildViewById(rootView, i);
        if (button != null) {
            i = R.id.female_health_content;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.female_health_level;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView2 != null) {
                    i = R.id.female_health_list;
                    FemaleCircleListView femaleCircleListView = (FemaleCircleListView) ViewBindings.findChildViewById(rootView, i);
                    if (femaleCircleListView != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.female_health_none))) != null) {
                        i = R.id.female_health_none_content;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                        if (textView3 != null) {
                            i = R.id.female_health_title;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                            if (textView4 != null) {
                                i = R.id.homepage_female_health_none_group;
                                Group group = (Group) ViewBindings.findChildViewById(rootView, i);
                                if (group != null) {
                                    return new HomepageItemCardFemaleHealthBinding(constraintLayout, constraintLayout, button, textView, textView2, femaleCircleListView, viewFindChildViewById, textView3, textView4, group);
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
    public static HomepageItemCardFemaleHealthBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageItemCardFemaleHealthBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_item_card_female_health, parent, false);
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
