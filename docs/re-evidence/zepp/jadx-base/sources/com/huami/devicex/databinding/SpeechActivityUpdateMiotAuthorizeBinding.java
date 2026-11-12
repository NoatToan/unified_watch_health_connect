package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class SpeechActivityUpdateMiotAuthorizeBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final Button speechAccountAuthorizeBtn;

    private SpeechActivityUpdateMiotAuthorizeBinding(@NonNull RelativeLayout relativeLayout, @NonNull Button button) {
        this.a = relativeLayout;
        this.speechAccountAuthorizeBtn = button;
    }

    @NonNull
    public static SpeechActivityUpdateMiotAuthorizeBinding bind(@NonNull View view) {
        int i = R.id.speech_account_authorize_btn;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            return new SpeechActivityUpdateMiotAuthorizeBinding((RelativeLayout) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static SpeechActivityUpdateMiotAuthorizeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SpeechActivityUpdateMiotAuthorizeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.speech_activity_update_miot_authorize, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
