package com.xiaomi.fitness.trail;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fitness.baseui.recyclerview.decoration.GridItemSpace;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.trail.RecordEditActivity;
import com.xiaomi.fitness.trail.adapter.RecordEditAdapter;
import com.xiaomi.fitness.trail.viewmodel.RecordEditViewModel;
import defpackage.dki;
import defpackage.hoi;
import defpackage.ivi;
import defpackage.qv1;
import defpackage.rop;
import defpackage.wc0;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/trail/RecordEditActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/trail/viewmodel/RecordEditViewModel;", "Lrop;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "layoutId", "I", "getLayoutId", "()I", "getViewModelId", "viewModelId", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RecordEditActivity extends BaseBindingActivity<RecordEditViewModel, rop> {
    private final int layoutId = ivi.J1;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(View view) {
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return this.layoutId;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return qv1.f31871a;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setBackgroundResource(dki.f2);
        setTitle("记录跑步");
        setActionBarResizeable(false);
        IActionBar.DefaultImpls.setStartView$default(this, 0, hoi.N, null, new View.OnClickListener() { // from class: w6k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecordEditActivity.onCreate$lambda$0(view);
            }
        }, 5, null);
        IActionBar.DefaultImpls.setEndView$default(this, 0, hoi.O, null, new View.OnClickListener() { // from class: x6k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecordEditActivity.onCreate$lambda$1(view);
            }
        }, 5, null);
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setBackgroundDrawable(new ColorDrawable(-1));
        }
        wc0 miuiActionBar2 = getMiuiActionBar();
        if (miuiActionBar2 != null) {
            miuiActionBar2.setBackgroundDrawable(new ColorDrawable(-1));
        }
        wc0 miuiActionBar3 = getMiuiActionBar();
        if (miuiActionBar3 != null) {
            miuiActionBar3.setDisplayHomeAsUpEnabled(false);
        }
        getMBinding().A.addItemDecoration(new GridItemSpace(ExtUtilsKt.getDp(12), ExtUtilsKt.getDp(12), false));
        getMBinding().A.setAdapter(new RecordEditAdapter());
    }
}
