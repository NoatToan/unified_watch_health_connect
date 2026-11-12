package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class ItemOfflineVoiceLanguageBinding implements ViewBinding {

    @NonNull
    private final ListTile a;

    @NonNull
    public final ListTile offlineLanguageTile;

    private ItemOfflineVoiceLanguageBinding(@NonNull ListTile listTile, @NonNull ListTile listTile2) {
        this.a = listTile;
        this.offlineLanguageTile = listTile2;
    }

    @NonNull
    public static ItemOfflineVoiceLanguageBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        ListTile listTile = (ListTile) view;
        return new ItemOfflineVoiceLanguageBinding(listTile, listTile);
    }

    @NonNull
    public static ItemOfflineVoiceLanguageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOfflineVoiceLanguageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_offline_voice_language, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ListTile getRoot() {
        return this.a;
    }
}
