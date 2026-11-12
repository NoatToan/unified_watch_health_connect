package com.xiaomi.fitness.rn.settings.util;

import android.app.Activity;
import android.content.DialogInterface;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.RNDeviceModel;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.fitness.rn.settings.util.RnDeviceDeleteDialog;
import defpackage.u2j;
import defpackage.v0j;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import miuix.appcompat.app.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\rR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/rn/settings/util/RnDeviceDeleteDialog;", "", "weakAct", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "title", "", "did", "pid", "", "callBack", "Lkotlin/Function1;", "", "", "<init>", "(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "show", "settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RnDeviceDeleteDialog {

    @Nullable
    private final Function1<Boolean, Unit> callBack;

    @NotNull
    private final String did;
    private final int pid;

    @Nullable
    private final String title;

    @NotNull
    private final WeakReference<Activity> weakAct;

    /* JADX WARN: Multi-variable type inference failed */
    public RnDeviceDeleteDialog(@NotNull WeakReference<Activity> weakAct, @Nullable String str, @NotNull String did, int i, @Nullable Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(weakAct, "weakAct");
        Intrinsics.checkNotNullParameter(did, "did");
        this.weakAct = weakAct;
        this.title = str;
        this.did = did;
        this.pid = i;
        this.callBack = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$0(RnDeviceDeleteDialog this$0, RNDeviceModel rNDeviceModel, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).unbindDevice(this$0.did, new RnDeviceDeleteDialog$show$1$1(dialogInterface, this$0, rNDeviceModel));
    }

    public final void show() {
        Activity activity = this.weakAct.get();
        if (activity == null) {
            return;
        }
        String string = this.title;
        if (string == null) {
            string = ResourceExtKt.getString(v0j.q);
        }
        final RNDeviceModel rNDeviceModel = (RNDeviceModel) RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).getDeviceModel(this.did);
        new c.a(activity, u2j.f35312a).m(string).u(v0j.c, new DialogInterface.OnClickListener() { // from class: fuk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RnDeviceDeleteDialog.show$lambda$0(this.f18255a, rNDeviceModel, dialogInterface, i);
            }
        }).o(v0j.f36350b, new DialogInterface.OnClickListener() { // from class: guk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).b().show();
    }
}
