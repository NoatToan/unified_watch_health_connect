package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes7.dex */
public final class FragmentOfflineVoiceMainBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final View maskView;

    @NonNull
    public final ListTile offlineVoiceLanguageIv;

    @NonNull
    public final ListTile offlineVoiceWakeupMethodIv;

    @NonNull
    public final ListTile offlineVoiceWordsIv;

    private FragmentOfflineVoiceMainBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull View view, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull ListTile listTile3) {
        this.a = linearLayout;
        this.container = frameLayout;
        this.maskView = view;
        this.offlineVoiceLanguageIv = listTile;
        this.offlineVoiceWakeupMethodIv = listTile2;
        this.offlineVoiceWordsIv = listTile3;
    }

    @NonNull
    public static FragmentOfflineVoiceMainBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
            i = R.id.offline_voice_language_iv;
            ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
            if (listTile != null) {
                i = R.id.offline_voice_wakeup_method_iv;
                ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile2 != null) {
                    i = R.id.offline_voice_words_iv;
                    ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile3 != null) {
                        return new FragmentOfflineVoiceMainBinding((LinearLayout) view, frameLayout, viewFindChildViewById, listTile, listTile2, listTile3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOfflineVoiceMainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOfflineVoiceMainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_offline_voice_main, viewGroup, false);
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
