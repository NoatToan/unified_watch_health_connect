package com.xiaomi.fitness.base;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.alibaba.android.arouter.facade.annotation.Route;
import defpackage.eri;
import defpackage.jui;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Route(path = "/common/activity/stub")
public final class StubActivity extends Hilt_StubActivity {
    public static String q(Class<? extends Fragment> cls) {
        return "tag:" + cls.getName();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    /* JADX INFO: renamed from: getLayoutId */
    public int getMContentLayoutId() {
        return jui.j;
    }

    @Override // com.xiaomi.fitness.base.Hilt_StubActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setActionBarDisplayable(false);
        r();
    }

    public final Fragment p() {
        String stringExtra;
        Bundle bundleExtra;
        Intent intent = getIntent();
        if (intent != null) {
            stringExtra = intent.getStringExtra("frag_name");
            bundleExtra = intent.getBundleExtra("frag_args");
        } else {
            stringExtra = null;
            bundleExtra = null;
        }
        if (stringExtra == null || stringExtra.trim().length() == 0) {
            throw new IllegalStateException("intent should has full name of a fragment");
        }
        Fragment fragmentA = getSupportFragmentManager().x0().a(getClassLoader(), stringExtra);
        if (bundleExtra != null) {
            fragmentA.setArguments(bundleExtra);
        }
        return fragmentA;
    }

    public final void r() {
        Fragment fragmentP = p();
        getSupportFragmentManager().o().c(eri.k5, fragmentP, q(fragmentP.getClass())).o();
    }
}
