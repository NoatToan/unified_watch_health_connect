package com.huami.wallet.ui.utils;

import android.view.View;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB*\u0012!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u0016\u0010\u0017B%\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\u0016\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R4\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/huami/wallet/ui/utils/SingleClickListener;", "Landroid/view/View$OnClickListener;", "", "a", "Landroid/view/View;", "v", "", "onClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlin/jvm/functions/Function1;", "getClick", "()Lkotlin/jvm/functions/Function1;", "click", "", "b", LogUtil.I, "clickTimeOut", "c", "J", "lastClick", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "t", "(ILkotlin/jvm/functions/Function1;)V", "Companion", "core-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SingleClickListener implements View.OnClickListener {
    private static final int d = 500;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function1<View, Unit> click;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int clickTimeOut;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private long lastClick;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleClickListener(@NotNull Function1<? super View, Unit> function1) {
        this.click = function1;
        this.clickTimeOut = 500;
    }

    private final long a() {
        return System.currentTimeMillis() - this.lastClick;
    }

    @NotNull
    public final Function1<View, Unit> getClick() {
        return this.click;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        if (a() > this.clickTimeOut) {
            this.lastClick = System.currentTimeMillis();
            this.click.invoke(v);
        }
    }

    public SingleClickListener(int i, @NotNull Function1<? super View, Unit> function1) {
        this(function1);
        this.clickTimeOut = i;
    }
}
