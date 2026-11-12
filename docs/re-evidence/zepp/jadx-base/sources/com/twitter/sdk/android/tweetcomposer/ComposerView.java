package com.twitter.sdk.android.tweetcomposer;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.timepicker.TimeModel;
import com.squareup.picasso.Picasso;
import com.twitter.sdk.android.core.internal.UserUtils;
import com.twitter.sdk.android.core.models.User;
import com.twitter.sdk.android.tweetcomposer.internal.util.ObservableScrollView;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class ComposerView extends LinearLayout {
    public ImageView a;
    public ImageView b;
    public EditText c;
    public TextView d;
    public Button e;
    public ObservableScrollView f;
    public View g;
    public ColorDrawable h;
    public ImageView i;
    public com.twitter.sdk.android.tweetcomposer.a.b j;
    private Picasso k;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ComposerView.this.j.b();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ComposerView composerView = ComposerView.this;
            composerView.j.a(composerView.getTweetText());
        }
    }

    public class c implements TextView.OnEditorActionListener {
        public c() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            ComposerView composerView = ComposerView.this;
            composerView.j.a(composerView.getTweetText());
            return true;
        }
    }

    public class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ComposerView composerView = ComposerView.this;
            composerView.j.c(composerView.getTweetText());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class e implements ObservableScrollView.ScrollViewListener {
        public e() {
        }

        @Override // com.twitter.sdk.android.tweetcomposer.internal.util.ObservableScrollView.ScrollViewListener
        public void onScrollChanged(int i) {
            if (i > 0) {
                ComposerView.this.g.setVisibility(0);
            } else {
                ComposerView.this.g.setVisibility(4);
            }
        }
    }

    public ComposerView(Context context) {
        this(context, null);
    }

    private void b(Context context) {
        this.k = Picasso.with(getContext());
        this.h = new ColorDrawable(context.getResources().getColor(R.color.tw__composer_light_gray));
        LinearLayout.inflate(context, R.layout.tw__composer_view, this);
    }

    public void a() {
        this.a = (ImageView) findViewById(R.id.tw__author_avatar);
        this.b = (ImageView) findViewById(R.id.tw__composer_close);
        this.c = (EditText) findViewById(R.id.tw__edit_tweet);
        this.d = (TextView) findViewById(R.id.tw__char_count);
        this.e = (Button) findViewById(R.id.tw__post_tweet);
        this.f = (ObservableScrollView) findViewById(R.id.tw__composer_scroll_view);
        this.g = findViewById(R.id.tw__composer_profile_divider);
        this.i = (ImageView) findViewById(R.id.tw__image_view);
    }

    public void c(boolean z) {
        this.e.setEnabled(z);
    }

    public String getTweetText() {
        return this.c.getText().toString();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        a();
        this.b.setOnClickListener(new a());
        this.e.setOnClickListener(new b());
        this.c.setOnEditorActionListener(new c());
        this.c.addTextChangedListener(new d());
        this.f.setScrollViewListener(new e());
    }

    public void setCallbacks(com.twitter.sdk.android.tweetcomposer.a.b bVar) {
        this.j = bVar;
    }

    public void setCharCount(int i) {
        this.d.setText(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(i)));
    }

    public void setCharCountTextStyle(int i) {
        this.d.setTextAppearance(getContext(), i);
    }

    public void setImageView(Uri uri) {
        if (this.k != null) {
            this.i.setVisibility(0);
            this.k.load(uri).into(this.i);
        }
    }

    public void setProfilePhotoView(User user) {
        String profileImageUrlHttps = UserUtils.getProfileImageUrlHttps(user, UserUtils.AvatarSize.REASONABLY_SMALL);
        Picasso picasso = this.k;
        if (picasso != null) {
            picasso.load(profileImageUrlHttps).placeholder(this.h).into(this.a);
        }
    }

    public void setTweetText(String str) {
        this.c.setText(str);
    }

    public ComposerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public ComposerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context);
    }
}
