package com.huami.midong.webview.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.huami.watch.jsbridge.R;

/* JADX INFO: loaded from: classes11.dex */
public class WebPromptFragment extends Fragment {
    private EditText mContentView;
    private TextView mTitleView;
    private String mTitle = "";
    private String mContent = "";

    public String getContent() {
        return this.mContent;
    }

    public String getTitle() {
        return this.mTitle;
    }

    @Override // android.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_dialog_prompt, viewGroup, false);
        this.mTitleView = (TextView) viewInflate.findViewById(R.id.prompt_title);
        this.mContentView = (EditText) viewInflate.findViewById(R.id.prompt_content);
        this.mTitleView.setText(this.mTitle);
        this.mContentView.setText(this.mContent);
        this.mContentView.addTextChangedListener(new TextWatcher() { // from class: com.huami.midong.webview.ui.WebPromptFragment.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                WebPromptFragment.this.mContent = charSequence.toString();
            }
        });
        return viewInflate;
    }

    public void setContent(String str) {
        this.mContent = str;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }
}
