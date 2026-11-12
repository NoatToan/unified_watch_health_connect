package com.huami.view.basetitle;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes15.dex */
public class BaseFragmentActivity extends AppCompatActivity {
    public boolean useSaveInstanceState;

    public <T extends View> T $(@IdRes int i) {
        return (T) findViewById(i);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        if (this.useSaveInstanceState) {
            super.onSaveInstanceState(bundle);
        }
    }
}
