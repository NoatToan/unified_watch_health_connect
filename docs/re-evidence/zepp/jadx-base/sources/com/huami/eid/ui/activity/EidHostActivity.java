package com.huami.eid.ui.activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.p010navigation.fragment.NavHostFragment;
import androidx.view.result.ActivityResultCaller;
import com.huami.eid.ui.R;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/huami/eid/ui/activity/EidHostActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "onBackPressed", "<init>", "()V", "eid_release"}, k = 1, mv = {1, 5, 1})
public final class EidHostActivity extends AppCompatActivity {
    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.my_nav_host_fragment);
        Objects.requireNonNull(fragmentFindFragmentById, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        ActivityResultCaller activityResultCaller = ((NavHostFragment) fragmentFindFragmentById).getChildFragmentManager().getFragments().get(0);
        Objects.requireNonNull(activityResultCaller, "null cannot be cast to non-null type com.huami.eid.ui.activity.OnBackPressed");
        ((OnBackPressed) activityResultCaller).onBackPressed();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eid_host);
    }
}
