package com.xiaomi.fitness.heartrate.ui;

import android.os.Bundle;
import android.widget.TextView;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import defpackage.d0j;
import defpackage.fri;
import defpackage.lui;
import defpackage.phi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\n\u0010\f\u001a\u0004\u0018\u00010\rH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/heartrate/ui/CitingLiteratureActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "<init>", "()V", "layoutId", "", "getLayoutId", "()I", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getReferenceText", "", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CitingLiteratureActivity extends BaseActivity {
    private final String getReferenceText() {
        String[] stringArray = getResources().getStringArray(phi.f30398a);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        if (stringArray.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (stringArray.length > 1) {
            int length = stringArray.length - 1;
            for (int i = 0; i < length; i++) {
                sb.append(stringArray[i]);
                sb.append("\n\n");
            }
        }
        sb.append(stringArray[stringArray.length - 1]);
        return sb.toString();
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return lui.c;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String referenceText = getReferenceText();
        if (referenceText != null) {
            ((TextView) findViewById(fri.g)).setText(referenceText);
        }
        setTitle(d0j.F);
    }
}
