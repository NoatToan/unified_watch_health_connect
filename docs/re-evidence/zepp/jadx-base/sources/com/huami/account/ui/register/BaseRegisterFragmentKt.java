package com.huami.account.ui.register;

import android.graphics.Typeface;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.huami.account.ui.R;
import com.huami.account.ui.register.BaseRegisterFragmentKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Landroid/widget/EditText;", "passwordEditor", "Landroid/widget/ImageView;", "showIcon", "", "setupPasswordVisible", "accountui_release"}, k = 2, mv = {1, 5, 1})
public final class BaseRegisterFragmentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(EditText editText, int i, ImageView imageView, View view) {
        Typeface typeface = editText.getTypeface();
        if (editText.getInputType() == i) {
            editText.setInputType(144);
            imageView.setImageResource(R.drawable.account_ui_hm_email_eye_open);
        } else {
            editText.setInputType(i);
            imageView.setImageResource(R.drawable.account_ui_hm_email_eye_close);
        }
        editText.setTypeface(typeface);
        editText.setSelection(editText.length());
    }

    public static final void setupPasswordVisible(@NotNull final EditText editText, @NotNull final ImageView imageView) {
        final int inputType = editText.getInputType();
        imageView.setOnClickListener(new View.OnClickListener() { // from class: ir
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseRegisterFragmentKt.b(editText, inputType, imageView, view);
            }
        });
    }
}
