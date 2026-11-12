package com.xiaomi.fitness.heartrate.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fitness.baseui.extension.LaunchExtensionKt;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.heartrate.ui.PrincipleActivity;
import defpackage.d0j;
import defpackage.fri;
import defpackage.kji;
import defpackage.lui;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/PrincipleActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "<init>", "()V", "mOrigin", "", "Ljava/lang/Integer;", "layoutId", "getLayoutId", "()I", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PrincipleActivity extends BaseActivity {

    @Nullable
    private Integer mOrigin;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(PrincipleActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Activity activity = (Activity) new WeakReference(this$0).get();
        if (activity != null) {
            LaunchExtensionKt.startActivity$default(activity, CitingLiteratureActivity.class, (Function1) null, 2, (Object) null);
        }
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        Integer num = this.mOrigin;
        return (num != null && 1 == num.intValue()) ? lui.f : lui.f25444b;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        this.mOrigin = Integer.valueOf(getIntent().getIntExtra(DetectManualActivity.DETECT_TYPE, 2));
        super.onCreate(savedInstanceState);
        setTitle(d0j.f14931k);
        setTitleBackground(kji.f23920a);
        UIUtils.INSTANCE.setNavigationBarColor(this, kji.f23920a);
        setActionBarNormalTitleMode();
        ((TextView) findViewById(fri.n)).setOnClickListener(new View.OnClickListener() { // from class: z8i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrincipleActivity.onCreate$lambda$0(this.f41026a, view);
            }
        });
    }
}
