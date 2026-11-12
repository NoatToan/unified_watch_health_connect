package com.xiaomi.fitness.relative.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.relative.ui.NoDataSharedActivity;
import defpackage.aoi;
import defpackage.t0j;
import defpackage.xui;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/relative/ui/NoDataSharedActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "<init>", "()V", "layoutId", "", "getLayoutId", "()I", "relativeUid", "", "Ljava/lang/Long;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "relative-care_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NoDataSharedActivity extends Hilt_NoDataSharedActivity {

    @Nullable
    private Long relativeUid;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(NoDataSharedActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intent intent = new Intent(this$0, (Class<?>) RelativeDataSettingsActivity.class);
        intent.putExtra("key_relative_uid", this$0.relativeUid);
        this$0.startActivity(intent);
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    /* JADX INFO: renamed from: getLayoutId */
    public int getMContentLayoutId() {
        return xui.l;
    }

    @Override // com.xiaomi.fitness.relative.ui.Hilt_NoDataSharedActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.relativeUid = Long.valueOf(getIntent().getLongExtra("key_relative_uid", 0L));
        setEndView(0, aoi.d, getString(t0j.e), new View.OnClickListener() { // from class: mug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NoDataSharedActivity.onCreate$lambda$0(this.f27219a, view);
            }
        });
    }
}
