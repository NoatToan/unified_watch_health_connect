package com.xiaomi.fitness.notify;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.xiaomi.fitness.baseui.view.BaseBindingActivity;
import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.fitness.notify.NotifySelectAppActivity;
import defpackage.i1h;
import defpackage.iv1;
import defpackage.q0j;
import defpackage.tui;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/notify/NotifySelectAppActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/notify/NotifyViewModel;", "Li1h;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "bindView", "(Li1h;)V", "Lcom/xiaomi/fitness/notify/NotifyAdapter;", "mNotifyAdapter", "Lcom/xiaomi/fitness/notify/NotifyAdapter;", "getMNotifyAdapter", "()Lcom/xiaomi/fitness/notify/NotifyAdapter;", "setMNotifyAdapter", "(Lcom/xiaomi/fitness/notify/NotifyAdapter;)V", "", "getViewModelId", "()I", "viewModelId", "getLayoutId", "layoutId", "<init>", "()V", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class NotifySelectAppActivity extends BaseBindingActivity<NotifyViewModel, i1h> {

    @Nullable
    private NotifyAdapter mNotifyAdapter;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$1(NotifySelectAppActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(NotifySelectAppActivity this$0, List it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), Dispatchers.getMain(), null, new NotifySelectAppActivity$onCreate$1$1(this$0, it, null), 2, null);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull i1h i1hVar) {
        Intrinsics.checkNotNullParameter(i1hVar, "<this>");
        i1hVar.B.setOnClickListener(new View.OnClickListener() { // from class: h1h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotifySelectAppActivity.bindView$lambda$1(this.f19572a, view);
            }
        });
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return tui.i;
    }

    @Nullable
    public final NotifyAdapter getMNotifyAdapter() {
        return this.mNotifyAdapter;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return iv1.f22118a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(q0j.h);
        this.mNotifyAdapter = new NotifyAdapter((NotifyViewModel) getMViewModel());
        getMBinding().A.setLayoutManager(new LinearLayoutManager(this, 1, false));
        getMBinding().A.setAdapter(this.mNotifyAdapter);
        getMBinding().B.setText(q0j.l0);
        PageState.DefaultImpls.showLoading$default(this, null, 0, false, 5, null);
        ((NotifyViewModel) getMViewModel()).getPackageList(new Function1() { // from class: g1h
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return NotifySelectAppActivity.onCreate$lambda$0(this.f18466a, (List) obj);
            }
        });
    }

    public final void setMNotifyAdapter(@Nullable NotifyAdapter notifyAdapter) {
        this.mNotifyAdapter = notifyAdapter;
    }
}
