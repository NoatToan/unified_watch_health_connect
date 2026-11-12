package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.module.homepage.R;
import com.huami.module.homepage.cards.view.ScheduleView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageLayoutToolSleepAssistantBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatTextView toolSleepAssistant;

    @NonNull
    public final ScheduleView toolSleepAssistantAnim;

    @NonNull
    public final AppCompatImageView toolSleepAssistantImage;

    @NonNull
    public final Button toolSleepAssistantPlay;

    @NonNull
    public final AppCompatTextView toolSleepAssistantPrompt;

    @NonNull
    public final AppCompatTextView toolSleepAssistantStatus;

    @NonNull
    public final AppCompatTextView toolSleepAssistantTitle;

    private HomepageLayoutToolSleepAssistantBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatTextView toolSleepAssistant, @NonNull ScheduleView toolSleepAssistantAnim, @NonNull AppCompatImageView toolSleepAssistantImage, @NonNull Button toolSleepAssistantPlay, @NonNull AppCompatTextView toolSleepAssistantPrompt, @NonNull AppCompatTextView toolSleepAssistantStatus, @NonNull AppCompatTextView toolSleepAssistantTitle) {
        this.a = rootView;
        this.toolSleepAssistant = toolSleepAssistant;
        this.toolSleepAssistantAnim = toolSleepAssistantAnim;
        this.toolSleepAssistantImage = toolSleepAssistantImage;
        this.toolSleepAssistantPlay = toolSleepAssistantPlay;
        this.toolSleepAssistantPrompt = toolSleepAssistantPrompt;
        this.toolSleepAssistantStatus = toolSleepAssistantStatus;
        this.toolSleepAssistantTitle = toolSleepAssistantTitle;
    }

    @NonNull
    public static HomepageLayoutToolSleepAssistantBinding bind(@NonNull View rootView) {
        int i = R.id.tool_sleep_assistant;
        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
        if (appCompatTextView != null) {
            i = R.id.tool_sleep_assistant_anim;
            ScheduleView scheduleView = (ScheduleView) ViewBindings.findChildViewById(rootView, i);
            if (scheduleView != null) {
                i = R.id.tool_sleep_assistant_image;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
                if (appCompatImageView != null) {
                    i = R.id.tool_sleep_assistant_play;
                    Button button = (Button) ViewBindings.findChildViewById(rootView, i);
                    if (button != null) {
                        i = R.id.tool_sleep_assistant_prompt;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                        if (appCompatTextView2 != null) {
                            i = R.id.tool_sleep_assistant_status;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                            if (appCompatTextView3 != null) {
                                i = R.id.tool_sleep_assistant_title;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                                if (appCompatTextView4 != null) {
                                    return new HomepageLayoutToolSleepAssistantBinding((ConstraintLayout) rootView, appCompatTextView, scheduleView, appCompatImageView, button, appCompatTextView2, appCompatTextView3, appCompatTextView4);
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
    public static HomepageLayoutToolSleepAssistantBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageLayoutToolSleepAssistantBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_layout_tool_sleep_assistant, parent, false);
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
