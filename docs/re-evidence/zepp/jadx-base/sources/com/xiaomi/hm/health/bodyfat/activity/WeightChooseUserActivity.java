package com.xiaomi.hm.health.bodyfat.activity;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.xiaomi.hm.health.bodyfat.utils.BFKeeper;

/* JADX INFO: loaded from: classes19.dex */
public class WeightChooseUserActivity extends AppCompatActivity {
    private WeightChooseUserFragment a;
    private boolean b = false;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.b = false;
        BFKeeper.setChooseUserShowing(false);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        Intent intent = getIntent();
        this.a = (WeightChooseUserFragment) Fragment.instantiate(this, WeightChooseUserFragment.class.getName(), intent != null ? intent.getExtras() : null);
        this.b = true;
        BFKeeper.setChooseUserShowing(true);
        this.a.setOnDismissListener(new WeightChooseUserFragment.OnDialogDismissListener() { // from class: dr8
            @Override // com.xiaomi.hm.health.bodyfat.activity.WeightChooseUserFragment.OnDialogDismissListener
            public final void onDismiss() {
                this.a.d();
            }
        });
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(R.id.content, this.a);
        fragmentTransactionBeginTransaction.commit();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BFKeeper.setChooseUserShowing(false);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!this.b || keyEvent.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        this.a.onCancel(null);
        return true;
    }
}
