package com.huami.femalehealth.uilib.ui.activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.huami.femalehealth.uilib.helper.FHLifecycleObserver;
import com.huami.femalehealth.uilib.manager.FemaleHealthActivityManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0004H\u0014¨\u0006\f"}, d2 = {"Lcom/huami/femalehealth/uilib/ui/activity/FHBaseTitleActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lcom/huami/femalehealth/uilib/helper/FHLifecycleObserver;", "observer", "observerLifeCycle", "onDestroy", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public abstract class FHBaseTitleActivity extends AppCompatActivity {
    public void _$_clearFindViewByIdCache() {
    }

    public final void observerLifeCycle(@NotNull FHLifecycleObserver observer) {
        getLifecycle().addObserver(observer);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FemaleHealthActivityManager.INSTANCE.add(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        FemaleHealthActivityManager.INSTANCE.remove(this);
        super.onDestroy();
    }
}
