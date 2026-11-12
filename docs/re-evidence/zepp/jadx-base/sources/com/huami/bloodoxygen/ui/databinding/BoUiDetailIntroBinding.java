package com.huami.bloodoxygen.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodoxygen.ui.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes5.dex */
public final class BoUiDetailIntroBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final View dividerReadMore;

    @NonNull
    public final Group groupReadMore;

    @NonNull
    public final TypefaceTextView introContent;

    @NonNull
    public final TextView jpHintText;

    @NonNull
    public final LinearLayout readMore;

    @NonNull
    public final TypefaceTextView title;

    private BoUiDetailIntroBinding(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull Group group, @NonNull TypefaceTextView typefaceTextView, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull TypefaceTextView typefaceTextView2) {
        this.a = linearLayout;
        this.dividerReadMore = view;
        this.groupReadMore = group;
        this.introContent = typefaceTextView;
        this.jpHintText = textView;
        this.readMore = linearLayout2;
        this.title = typefaceTextView2;
    }

    @NonNull
    public static BoUiDetailIntroBinding bind(@NonNull View view) {
        int i = R.id.divider_read_more;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            i = R.id.group_read_more;
            Group group = (Group) ViewBindings.findChildViewById(view, i);
            if (group != null) {
                i = R.id.intro_content;
                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                if (typefaceTextView != null) {
                    i = R.id.jp_hint_text;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.read_more;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = R.id.title;
                            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                            if (typefaceTextView2 != null) {
                                return new BoUiDetailIntroBinding((LinearLayout) view, viewFindChildViewById, group, typefaceTextView, textView, linearLayout, typefaceTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static BoUiDetailIntroBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static BoUiDetailIntroBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.bo_ui_detail_intro, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
