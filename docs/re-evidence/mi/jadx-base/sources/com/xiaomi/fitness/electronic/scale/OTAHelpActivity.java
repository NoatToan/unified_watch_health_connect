package com.xiaomi.fitness.electronic.scale;

import android.os.Bundle;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import defpackage.av1;
import defpackage.gui;
import defpackage.rj0;
import defpackage.zzi;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/OTAHelpActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/electronic/scale/OTAHelpViewModel;", "Lrj0;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "()V", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class OTAHelpActivity extends BaseBindingActivity<OTAHelpViewModel, rj0> {
    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return gui.o;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return av1.d;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(zzi.o4);
        setSubtitle(zzi.G0);
    }
}
