package com.xiaomi.fitness.homepage.view.refresh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.jui;
import defpackage.ze2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\u0004J#\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/homepage/view/refresh/LoadAction;", "Lze2$b;", "", "onTriggered", "()V", "onEntered", "onExit", "onActivated", "onFinished", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateIndicator", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lkotlin/Function0;", "trigger", "Lkotlin/jvm/functions/Function0;", "", "enterPoint", "", "triggerTextIDs", "triggerParam", "<init>", "(I[ILkotlin/jvm/functions/Function0;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class LoadAction extends ze2.b {

    @Nullable
    private Function0<Unit> trigger;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadAction(int i, @NotNull int[] triggerTextIDs, @Nullable Function0<Unit> function0) {
        super(i, triggerTextIDs);
        Intrinsics.checkNotNullParameter(triggerTextIDs, "triggerTextIDs");
        this.trigger = function0;
    }

    @Override // ze2.a
    public void onActivated() {
    }

    @Override // ze2.a
    @Nullable
    public View onCreateIndicator(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (container != null) {
            View viewInflate = inflater.inflate(jui.R5, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            View viewInflate2 = inflater.inflate(jui.S5, (ViewGroup) null);
            View viewInflate3 = inflater.inflate(jui.T5, (ViewGroup) null);
            container.addView(viewInflate);
            container.addView(viewInflate2);
            container.addView(viewInflate3);
        }
        return null;
    }

    @Override // ze2.a
    public void onEntered() {
    }

    @Override // ze2.a
    public void onExit() {
    }

    @Override // ze2.a
    public void onFinished() {
    }

    @Override // ze2.a
    public void onTriggered() {
        Function0<Unit> function0 = this.trigger;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
