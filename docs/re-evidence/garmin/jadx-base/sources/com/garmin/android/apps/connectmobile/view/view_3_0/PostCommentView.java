package com.garmin.android.apps.connectmobile.view.view_3_0;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.lifecycle.n0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.tag.TaggableEditText;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import cs1.f;
import do1.n;
import gg1.l0;
import go1.j;
import h32.l;
import o13.m;
import o13.t;
import o53.f0;
import p005kotlin.Metadata;
import v22.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0002%\u001eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R(\u0010\u000b\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b\r\u0010\u0012¨\u0006&"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/view_3_0/PostCommentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/text/Spannable;", "commentText", "", "setCommentText", "(Landroid/text/Spannable;)V", "", "hintText", "setCommentHint", "(Ljava/lang/String;)V", "hintContentDescription", "setCommentContentDescription", "Lcom/garmin/android/apps/connectmobile/view/view_3_0/PostCommentView$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setPostCommentListener", "(Lcom/garmin/android/apps/connectmobile/view/view_3_0/PostCommentView$b;)V", "Lcs1/f;", "taggingSuggestionListener", "setSuggestionListener", "(Lcs1/f;)V", "Lf12/l;", "a", "Lo13/l;", "getUserSettings", "()Lf12/l;", "userSettings", "getCommentText", "()Ljava/lang/String;", "b", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PostCommentView extends ConstraintLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f47845f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f47846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UserLevelImageView f47847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TaggableEditText f47848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f47849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f47850e;

    public interface b {
        void m6(Editable editable);
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/view/view_3_0/PostCommentView$c", "Landroid/view/View$AccessibilityDelegate;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47851a;

        public c(String str) {
            this.f47851a = str;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfo accessibilityNodeInfo) {
            view2.getClass();
            accessibilityNodeInfo.getClass();
            super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfo);
            accessibilityNodeInfo.setText(this.f47851a);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostCommentView(Context context, AttributeSet attributeSet, int i14) {
        TaggableEditText taggableEditText;
        super(context, attributeSet, i14);
        context.getClass();
        this.f47846a = m.b(new j(18));
        Object systemService = getContext().getSystemService("layout_inflater");
        systemService.getClass();
        int i15 = 1;
        View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.post_comment_widget_3_0, (ViewGroup) this, true);
        this.f47847b = (UserLevelImageView) viewInflate.findViewById(R.id.post_comment_profile_image);
        this.f47848c = (TaggableEditText) viewInflate.findViewById(R.id.post_comment_text);
        this.f47849d = (TextView) viewInflate.findViewById(R.id.post_comment_button);
        View viewFindViewById = viewInflate.findViewById(R.id.post_comment_divider);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f60606a);
        typedArrayObtainStyledAttributes.getClass();
        float dimension = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        if (dimension > 0.0f && dimension2 > 0.0f) {
            UserLevelImageView userLevelImageView = this.f47847b;
            ViewGroup.LayoutParams layoutParams = userLevelImageView != null ? userLevelImageView.getLayoutParams() : null;
            layoutParams.getClass();
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).width = (int) dimension;
            ((ViewGroup.MarginLayoutParams) bVar).height = (int) dimension2;
            UserLevelImageView userLevelImageView2 = this.f47847b;
            if (userLevelImageView2 != null) {
                userLevelImageView2.setLayoutParams(bVar);
            }
        }
        boolean z14 = typedArrayObtainStyledAttributes.getBoolean(1, true);
        viewFindViewById.getClass();
        e.r(viewFindViewById, z14);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(2, 0.0f);
        if (dimension3 > 0.0f && (taggableEditText = this.f47848c) != null) {
            taggableEditText.setMinHeight((int) dimension3);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(0, false)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate.findViewById(R.id.post_comment_parent);
            d dVar = new d();
            dVar.f(constraintLayout);
            dVar.e(R.id.post_comment_profile_image, 3);
            dVar.b(constraintLayout);
        }
        typedArrayObtainStyledAttributes.recycle();
        k();
        InputFilter[] inputFilterArr = {new l0(i15), new InputFilter.LengthFilter(255)};
        TaggableEditText taggableEditText2 = this.f47848c;
        if (taggableEditText2 != null) {
            taggableEditText2.setFilters(inputFilterArr);
        }
        TaggableEditText taggableEditText3 = this.f47848c;
        if (taggableEditText3 != null) {
            taggableEditText3.addTextChangedListener(new l(this));
        }
        TextView textView = this.f47849d;
        if (textView != null) {
            textView.setEnabled(false);
        }
        TextView textView2 = this.f47849d;
        if (textView2 != null) {
            textView2.setOnClickListener(new cw2.b(22, this, viewInflate));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f12.l getUserSettings() {
        return (f12.l) this.f47846a.getValue();
    }

    public final String getCommentText() {
        TaggableEditText taggableEditText = this.f47848c;
        return String.valueOf(taggableEditText != null ? taggableEditText.getText() : null);
    }

    public final void j() {
        setVisibility(8);
        setCommentText("");
        clearFocus();
        Object systemService = getContext().getSystemService("input_method");
        systemService.getClass();
        ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public final void k() {
        n0 n0VarR = xy2.b.r(this);
        if (n0VarR != null) {
            ge1.b.T(f0.w(n0VarR), null, null, new h32.m(this, null), 3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k();
    }

    public final void setCommentContentDescription(String hintContentDescription) {
        c cVar = new c(hintContentDescription);
        TaggableEditText taggableEditText = this.f47848c;
        if (taggableEditText != null) {
            taggableEditText.setAccessibilityDelegate(cVar);
        }
    }

    public final void setCommentHint(String hintText) {
        TaggableEditText taggableEditText = this.f47848c;
        if (taggableEditText != null) {
            taggableEditText.setHint(hintText);
        }
    }

    public final void setCommentText(Spannable commentText) {
        commentText.getClass();
        TaggableEditText taggableEditText = this.f47848c;
        if (taggableEditText != null) {
            taggableEditText.setText(commentText);
        }
    }

    public final void setPostCommentListener(b listener) {
        this.f47850e = listener;
    }

    public final void setSuggestionListener(f taggingSuggestionListener) {
        taggingSuggestionListener.getClass();
        TaggableEditText taggableEditText = this.f47848c;
        if (taggableEditText != null) {
            taggableEditText.setSuggestionListener(taggingSuggestionListener);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/view_3_0/PostCommentView$a;", "", "<init>", "()V", "", "COMMENT_LENGTH_LIMIT", "I", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public final void setCommentText(String str) {
        TaggableEditText taggableEditText = this.f47848c;
        if (taggableEditText != null) {
            taggableEditText.setText(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostCommentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostCommentView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ PostCommentView(Context context, AttributeSet attributeSet, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
