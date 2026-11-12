package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.pingan.PinganHealthCareWebViewActivityKt;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmUpToRemoteSucFragment;
import defpackage.c0j;
import defpackage.jui;
import defpackage.yvb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\b*\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmUpToRemoteSucFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingFragment;", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDetailViewModel;", "Lyvb;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "bindView", "(Lyvb;)V", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepRhythmUpToRemoteSucFragment extends Hilt_SleepRhythmUpToRemoteSucFragment<SleepRhythmDetailViewModel, yvb> {
    public SleepRhythmUpToRemoteSucFragment() {
        super(jui.Q3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindView$lambda$0(SleepRhythmUpToRemoteSucFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$1(SleepRhythmUpToRemoteSucFragment this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Uri uri = Uri.parse("tel:$010-69006178");
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(uri);
        this$0.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$2(SleepRhythmUpToRemoteSucFragment this$0, TextView it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentActivity mActivity = this$0.getMActivity();
        Intrinsics.checkNotNull(mActivity);
        PinganHealthCareWebViewActivityKt.startPinganHealthCareWebActivity("https://fe.pkucare.com/outpatient/appoint/list?days=&type=normal&data=%257B%2522_id%2522%253A%2522668ecc2b649c31141ad21be0%2522%252C%2522dept_name_en%2522%253A%2522%2522%252C%2522parent_code%2522%253A%2522001%2522%252C%2522ih_dept_id%2522%253A%25220000168%2522%252C%2522dept_rule%2522%253A0%252C%2522title%2522%253A%2522%2522%252C%2522initial%2522%253A%2522SMZX%2522%252C%2522notice%2522%253A%2522%2522%252C%2522sort%2522%253A11%252C%2522dept_code%2522%253A%2522001012%2522%252C%2522dept_name%2522%253A%2522%25E7%259D%25A1%25E7%259C%25A0%25E5%258C%25BB%25E5%25AD%25A6%25E7%25A7%2591%2522%252C%2522spread%2522%253Afalse%257D&id=001012&dept_name=%E7%9D%A1%E7%9C%A0%E5%8C%BB%E5%AD%A6%E7%A7%91&org_code=112628\n", mActivity);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.ViewDataBinder
    public void bindView(@NotNull yvb yvbVar) {
        Intrinsics.checkNotNullParameter(yvbVar, "<this>");
        yvbVar.A.setOnClickListener(new View.OnClickListener() { // from class: ewm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepRhythmUpToRemoteSucFragment.bindView$lambda$0(this.f17133a, view);
            }
        });
        yvbVar.E.getPaint().setFlags(8);
        ViewExtKt.clickWithTrigger$default(yvbVar.E, 0L, new Function1() { // from class: fwm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SleepRhythmUpToRemoteSucFragment.bindView$lambda$1(this.f18327a, (TextView) obj);
            }
        }, 1, null);
        ViewExtKt.clickWithTrigger$default(yvbVar.D, 0L, new Function1() { // from class: gwm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SleepRhythmUpToRemoteSucFragment.bindView$lambda$2(this.f19404a, (TextView) obj);
            }
        }, 1, null);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingFragment, com.xiaomi.fitness.baseui.view.BaseViewModelFragment, com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setTitle(c0j.Lj);
        setActionBarDisplayable(true);
        setActionBarNormalTitleMode();
    }
}
