package com.google.androidbrowserhelper.trusted;

import android.content.Context;
import android.os.Bundle;
import androidx.browser.trusted.f;

/* JADX INFO: loaded from: classes14.dex */
public interface ExtraCommandHandler {
    public static final String EXTRA_COMMAND_SUCCESS = "success";

    Bundle handleExtraCommand(Context context, String str, Bundle bundle, f fVar);
}
