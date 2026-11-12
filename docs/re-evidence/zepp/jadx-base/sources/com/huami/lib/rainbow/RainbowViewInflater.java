package com.huami.lib.rainbow;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.theme.MaterialComponentsViewInflater;
import com.huami.lib.rainbow.button.RainbowButton;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class RainbowViewInflater extends MaterialComponentsViewInflater {
    private static final List<String> a = Arrays.asList("androidx.appcompat.widget.AppCompatButton", "com.google.android.material.button.MaterialButton");

    @Override // com.google.android.material.theme.MaterialComponentsViewInflater, androidx.appcompat.app.AppCompatViewInflater
    @NonNull
    public AppCompatButton createButton(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new RainbowButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    @Nullable
    @org.jetbrains.annotations.Nullable
    public View createView(Context context, String str, AttributeSet attributeSet) {
        return a.contains(str) ? new RainbowButton(context, attributeSet) : super.createView(context, str, attributeSet);
    }
}
