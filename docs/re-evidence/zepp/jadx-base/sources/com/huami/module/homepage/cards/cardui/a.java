package com.huami.module.homepage.cards.cardui;

import android.os.CountDownTimer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/huami/module/homepage/cards/cardui/a;", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "", "onTick", "onFinish", "Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", "callback", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
final class a extends CountDownTimer {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> callback;

    public a(@NotNull Function0<Boolean> function0) {
        super(120000L, 120000L);
        this.callback = function0;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        if (this.callback.invoke().booleanValue()) {
            return;
        }
        start();
    }

    @Override // android.os.CountDownTimer
    public void onTick(long millisUntilFinished) {
    }
}
