package com.garmin.android.apps.connectmobile.view.conversation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.tag.TaggableEditText;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.garmin.android.apps.connectmobile.view.conversation.CommentView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.perf.util.Constants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import cs1.f;
import d53.w;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import v22.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001:\u0002?@B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u0016J\u0015\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0013¢\u0006\u0004\b \u0010\u0016J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\n¢\u0006\u0004\b\"\u0010\u000eJ\u0015\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\f2\u0006\u0010(\u001a\u00020+¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020\nH\u0002¢\u0006\u0004\b/\u0010\u000eR*\u00106\u001a\u00020\n2\u0006\u00100\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u0010\u000eR*\u0010>\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/conversation/CommentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "highlighted", "", "setHighlighted", "(Z)V", "Lb12/b;", "data", "setProfileImageData", "(Lb12/b;)V", "", "name", "setAuthorFullName", "(Ljava/lang/String;)V", "Landroid/text/Spannable;", "spannableBody", "setCommentBody", "(Landroid/text/Spannable;)V", "editingText", "setEditingText", "timeString", "setCommentCreatedTime", "timeStringContentDescription", "setCommentCreatedTimeContentDescription", "enable", "setSocialEnabled", "Lu22/a;", "viewMode", "setEditMode", "(Lu22/a;)V", "Lcom/garmin/android/apps/connectmobile/view/conversation/CommentView$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnCommentActionListener", "(Lcom/garmin/android/apps/connectmobile/view/conversation/CommentView$b;)V", "Lcs1/f;", "setTaggingSuggestionListener", "(Lcs1/f;)V", Constants.ENABLE_DISABLE, "setContentViewEnabled", "like", "m", "Z", "getLikeByUser", "()Z", "setLikeByUser", "likeByUser", "count", JWKParameterNames.RSA_MODULUS, "I", "getLikeCount", "()I", "setLikeCount", "(I)V", "likeCount", "b", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CommentView extends ConstraintLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f47627q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f47628r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f47629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f47630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UserLevelImageView f47631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f47632d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f47633e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f47634f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f47635g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f47636h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ViewGroup f47637i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TaggableEditText f47638j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Button f47639k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Button f47640l;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean likeByUser;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int likeCount;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f47643o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public u22.a f47644p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/conversation/CommentView$b;", "", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static class b {
        public void a() {
        }

        public void b() {
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }

        public void f(Editable editable) {
            editable.getClass();
        }

        public void g(Editable editable) {
        }

        public void h() {
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47645a;

        static {
            int[] iArr = new int[u22.a.values().length];
            try {
                iArr[u22.a.EditFocusCell.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u22.a.EditBackgroundCell.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u22.a.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f47645a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/view/conversation/CommentView$d", "Landroid/text/TextWatcher;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements TextWatcher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f47647b;

        public d(b bVar) {
            this.f47647b = bVar;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            if (CommentView.this.f47643o) {
                this.f47647b.g(editable);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/view/conversation/CommentView$e", "Lcs1/f;", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f47649b;

        public e(f fVar) {
            this.f47649b = fVar;
        }

        @Override // cs1.f
        public final void v3(com.garmin.android.apps.connectmobile.tag.a aVar) {
            aVar.getClass();
            if (!(aVar instanceof com.garmin.android.apps.connectmobile.tag.a.b)) {
                if (!(aVar instanceof com.garmin.android.apps.connectmobile.tag.a.d) && !(aVar instanceof com.garmin.android.apps.connectmobile.tag.a.f)) {
                    u0.r();
                    return;
                } else if (CommentView.this.f47644p != u22.a.EditFocusCell) {
                    aVar = com.garmin.android.apps.connectmobile.tag.a.e.f45057a;
                }
            }
            this.f47649b.v3(aVar);
        }

        @Override // cs1.f
        public final void w3(String str) {
            str.getClass();
            if (CommentView.this.f47644p == u22.a.EditFocusCell) {
                this.f47649b.w3(str);
            }
        }
    }

    static {
        new a(null);
        f47627q = R.drawable.favorite_fill;
        f47628r = R.drawable.favorite_outline;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f47643o = true;
        this.f47644p = u22.a.NORMAL;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.conversation_comment, (ViewGroup) this, true);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        View viewFindViewById = viewInflate.findViewById(R.id.root_layout);
        viewFindViewById.getClass();
        this.f47629a = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.comment_content_container);
        viewFindViewById2.getClass();
        this.f47630b = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(R.id.image_view_author_profile);
        viewFindViewById3.getClass();
        this.f47631c = (UserLevelImageView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(R.id.text_view_author_name);
        viewFindViewById4.getClass();
        this.f47632d = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewInflate.findViewById(R.id.text_view_comment_body);
        viewFindViewById5.getClass();
        this.f47633e = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewInflate.findViewById(R.id.text_view_comment_created_time);
        viewFindViewById6.getClass();
        this.f47634f = (TextView) viewFindViewById6;
        View viewFindViewById7 = viewInflate.findViewById(R.id.image_view_like);
        viewFindViewById7.getClass();
        this.f47635g = (ImageView) viewFindViewById7;
        View viewFindViewById8 = viewInflate.findViewById(R.id.text_view_like_count);
        viewFindViewById8.getClass();
        this.f47636h = (TextView) viewFindViewById8;
        View viewFindViewById9 = viewInflate.findViewById(R.id.comment_edit_container);
        viewFindViewById9.getClass();
        this.f47637i = (ViewGroup) viewFindViewById9;
        View viewFindViewById10 = viewInflate.findViewById(R.id.comment_edit_text);
        viewFindViewById10.getClass();
        this.f47638j = (TaggableEditText) viewFindViewById10;
        View viewFindViewById11 = viewInflate.findViewById(R.id.cancel_edit_button);
        viewFindViewById11.getClass();
        this.f47639k = (Button) viewFindViewById11;
        View viewFindViewById12 = viewInflate.findViewById(R.id.save_edit_button);
        viewFindViewById12.getClass();
        this.f47640l = (Button) viewFindViewById12;
    }

    private final void setContentViewEnabled(boolean isEnabled) {
        setEnabled(isEnabled);
        this.f47633e.setEnabled(isEnabled);
        this.f47631c.setEnabled(isEnabled);
        this.f47635g.setEnabled(isEnabled);
        this.f47636h.setEnabled(isEnabled);
    }

    public final boolean getLikeByUser() {
        return this.likeByUser;
    }

    public final int getLikeCount() {
        return this.likeCount;
    }

    public final void setAuthorFullName(String name) {
        this.f47632d.setText(name);
    }

    public final void setCommentBody(Spannable spannableBody) {
        spannableBody.getClass();
        TextView textView = this.f47633e;
        textView.setText(spannableBody);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void setCommentCreatedTime(String timeString) {
        timeString.getClass();
        this.f47634f.setText(timeString);
    }

    public final void setCommentCreatedTimeContentDescription(String timeStringContentDescription) {
        timeStringContentDescription.getClass();
        this.f47634f.setContentDescription(timeStringContentDescription);
    }

    public final void setEditMode(u22.a viewMode) {
        viewMode.getClass();
        this.f47644p = viewMode;
        int i14 = c.f47645a[viewMode.ordinal()];
        ViewGroup viewGroup = this.f47637i;
        ViewGroup viewGroup2 = this.f47630b;
        TaggableEditText taggableEditText = this.f47638j;
        if (i14 == 1) {
            if (!taggableEditText.isFocused()) {
                taggableEditText.requestFocus();
            }
            v22.e.j(viewGroup2);
            v22.e.q(viewGroup);
            taggableEditText.setParseTokenEnabled(true);
            setBackgroundColor(a7.b.getColor(getContext(), R.color.gcm_surface_1));
            setAlpha(1.0f);
            setContentViewEnabled(false);
            return;
        }
        if (i14 == 2) {
            v22.e.q(viewGroup2);
            v22.e.j(viewGroup);
            taggableEditText.setParseTokenEnabled(false);
            setBackgroundColor(a7.b.getColor(getContext(), R.color.gcm_background));
            setAlpha(0.3f);
            setContentViewEnabled(false);
            return;
        }
        if (i14 != 3) {
            u0.r();
            return;
        }
        v22.e.q(viewGroup2);
        v22.e.j(viewGroup);
        taggableEditText.setParseTokenEnabled(false);
        setBackgroundColor(a7.b.getColor(getContext(), R.color.gcm_surface_1));
        setAlpha(1.0f);
        setContentViewEnabled(true);
    }

    public final void setEditingText(Spannable editingText) {
        editingText.getClass();
        TaggableEditText taggableEditText = this.f47638j;
        taggableEditText.setText(editingText);
        Editable text = taggableEditText.getText();
        taggableEditText.setSelection(text != null ? text.length() : 0);
    }

    public final void setHighlighted(boolean highlighted) {
        this.f47629a.setBackground(highlighted ? new ColorDrawable(a7.b.getColor(getContext(), R.color.gcm_surface_2)) : a7.b.getDrawable(getContext(), R.drawable.gcm_surface_1_selector_background));
    }

    public final void setLikeByUser(boolean z14) {
        this.likeByUser = z14;
        int i14 = z14 ? f47627q : f47628r;
        ImageView imageView = this.f47635g;
        imageView.setImageResource(i14);
        imageView.setContentDescription(z14 ? getContext().getString(R.string.lbl_unlike) : getContext().getString(R.string.lbl_like));
        imageView.setImageTintList(ColorStateList.valueOf(a7.b.getColor(getContext(), R.color.gcm_icon_primary_action)));
    }

    public final void setLikeCount(int i14) {
        this.likeCount = i14;
        String strValueOf = String.valueOf(i14);
        TextView textView = this.f47636h;
        textView.setText(strValueOf);
        textView.setContentDescription(i14 == 1 ? getContext().getString(R.string.lbl_likes_count_singular, Integer.valueOf(i14)) : getContext().getString(R.string.lbl_likes_count, Integer.valueOf(i14)));
        v22.e.r(textView, this.f47643o && i14 > 0);
    }

    public final void setOnCommentActionListener(final b listener) {
        listener.getClass();
        final int i14 = 0;
        setOnClickListener(new View.OnClickListener() { // from class: u22.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                CommentView.b bVar = listener;
                switch (i15) {
                    case 0:
                        int i16 = CommentView.f47627q;
                        bVar.a();
                        break;
                    default:
                        int i17 = CommentView.f47627q;
                        bVar.c();
                        break;
                }
            }
        });
        final int i15 = 1;
        this.f47631c.setOnClickListener(new View.OnClickListener() { // from class: u22.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                CommentView.b bVar = listener;
                switch (i16) {
                    case 0:
                        int i17 = CommentView.f47627q;
                        bVar.a();
                        break;
                    default:
                        int i18 = CommentView.f47627q;
                        bVar.c();
                        break;
                }
            }
        });
        this.f47633e.setOnLongClickListener(new gc0.a(this, 4));
        setOnLongClickListener(new b00.c(7, this, listener));
        final int i16 = 0;
        this.f47635g.setOnClickListener(new View.OnClickListener(this) { // from class: u22.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentView f168203b;

            {
                this.f168203b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        if (this.f168203b.f47643o) {
                            listener.h();
                            break;
                        }
                        break;
                    case 1:
                        if (this.f168203b.f47643o) {
                            listener.b();
                            break;
                        }
                        break;
                    case 2:
                        CommentView commentView = this.f168203b;
                        boolean z14 = commentView.f47643o;
                        TaggableEditText taggableEditText = commentView.f47638j;
                        if (z14) {
                            e.b(taggableEditText);
                            Editable text = taggableEditText.getText();
                            CommentView.b bVar = listener;
                            if (text == null || w.J(text)) {
                                bVar.e();
                            } else {
                                bVar.f(text);
                            }
                            break;
                        }
                        break;
                    default:
                        CommentView commentView2 = this.f168203b;
                        if (commentView2.f47643o) {
                            e.b(commentView2.f47638j);
                            listener.e();
                            break;
                        }
                        break;
                }
            }
        });
        final int i17 = 1;
        this.f47636h.setOnClickListener(new View.OnClickListener(this) { // from class: u22.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentView f168203b;

            {
                this.f168203b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        if (this.f168203b.f47643o) {
                            listener.h();
                            break;
                        }
                        break;
                    case 1:
                        if (this.f168203b.f47643o) {
                            listener.b();
                            break;
                        }
                        break;
                    case 2:
                        CommentView commentView = this.f168203b;
                        boolean z14 = commentView.f47643o;
                        TaggableEditText taggableEditText = commentView.f47638j;
                        if (z14) {
                            e.b(taggableEditText);
                            Editable text = taggableEditText.getText();
                            CommentView.b bVar = listener;
                            if (text == null || w.J(text)) {
                                bVar.e();
                            } else {
                                bVar.f(text);
                            }
                            break;
                        }
                        break;
                    default:
                        CommentView commentView2 = this.f168203b;
                        if (commentView2.f47643o) {
                            e.b(commentView2.f47638j);
                            listener.e();
                            break;
                        }
                        break;
                }
            }
        });
        this.f47638j.addTextChangedListener(new d(listener));
        final int i18 = 2;
        this.f47640l.setOnClickListener(new View.OnClickListener(this) { // from class: u22.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentView f168203b;

            {
                this.f168203b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i18) {
                    case 0:
                        if (this.f168203b.f47643o) {
                            listener.h();
                            break;
                        }
                        break;
                    case 1:
                        if (this.f168203b.f47643o) {
                            listener.b();
                            break;
                        }
                        break;
                    case 2:
                        CommentView commentView = this.f168203b;
                        boolean z14 = commentView.f47643o;
                        TaggableEditText taggableEditText = commentView.f47638j;
                        if (z14) {
                            e.b(taggableEditText);
                            Editable text = taggableEditText.getText();
                            CommentView.b bVar = listener;
                            if (text == null || w.J(text)) {
                                bVar.e();
                            } else {
                                bVar.f(text);
                            }
                            break;
                        }
                        break;
                    default:
                        CommentView commentView2 = this.f168203b;
                        if (commentView2.f47643o) {
                            e.b(commentView2.f47638j);
                            listener.e();
                            break;
                        }
                        break;
                }
            }
        });
        final int i19 = 3;
        this.f47639k.setOnClickListener(new View.OnClickListener(this) { // from class: u22.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommentView f168203b;

            {
                this.f168203b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i19) {
                    case 0:
                        if (this.f168203b.f47643o) {
                            listener.h();
                            break;
                        }
                        break;
                    case 1:
                        if (this.f168203b.f47643o) {
                            listener.b();
                            break;
                        }
                        break;
                    case 2:
                        CommentView commentView = this.f168203b;
                        boolean z14 = commentView.f47643o;
                        TaggableEditText taggableEditText = commentView.f47638j;
                        if (z14) {
                            e.b(taggableEditText);
                            Editable text = taggableEditText.getText();
                            CommentView.b bVar = listener;
                            if (text == null || w.J(text)) {
                                bVar.e();
                            } else {
                                bVar.f(text);
                            }
                            break;
                        }
                        break;
                    default:
                        CommentView commentView2 = this.f168203b;
                        if (commentView2.f47643o) {
                            e.b(commentView2.f47638j);
                            listener.e();
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final void setProfileImageData(b12.b data) {
        data.getClass();
        this.f47631c.setProfileImageData(data);
    }

    public final void setSocialEnabled(boolean enable) {
        this.f47643o = enable;
        v22.e.r(this.f47635g, enable);
        v22.e.r(this.f47636h, enable && this.likeCount > 0);
    }

    public final void setTaggingSuggestionListener(f listener) {
        listener.getClass();
        this.f47638j.setSuggestionListener(new e(listener));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/view/conversation/CommentView$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DRAWABLE_RES_LIKE", "I", "DRAWABLE_RES_UNLIKE", "DEFAULT_COMMENT_MAX_LINE", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ CommentView(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
