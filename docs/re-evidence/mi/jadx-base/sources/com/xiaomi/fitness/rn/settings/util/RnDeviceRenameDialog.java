package com.xiaomi.fitness.rn.settings.util;

import android.app.Activity;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.rn.settings.util.RnDeviceRenameDialog;
import defpackage.sri;
import defpackage.u2j;
import defpackage.v0j;
import defpackage.zui;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import miuix.appcompat.app.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\r\u001a\u00020\nJ\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/rn/settings/util/RnDeviceRenameDialog;", "", "weakAct", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "did", "", "name", "callBack", "Lkotlin/Function1;", "", "<init>", "(Ljava/lang/ref/WeakReference;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "show", "showErrorNameToast", "errorCode", "", "settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRnDeviceRenameDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnDeviceRenameDialog.kt\ncom/xiaomi/fitness/rn/settings/util/RnDeviceRenameDialog\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,131:1\n58#2,23:132\n93#2,3:155\n*S KotlinDebug\n*F\n+ 1 RnDeviceRenameDialog.kt\ncom/xiaomi/fitness/rn/settings/util/RnDeviceRenameDialog\n*L\n54#1:132,23\n54#1:155,3\n*E\n"})
public final class RnDeviceRenameDialog {

    @NotNull
    private final Function1<String, Unit> callBack;

    @NotNull
    private final String did;

    @NotNull
    private final String name;

    @NotNull
    private final WeakReference<Activity> weakAct;

    /* JADX WARN: Multi-variable type inference failed */
    public RnDeviceRenameDialog(@NotNull WeakReference<Activity> weakAct, @NotNull String did, @NotNull String name, @NotNull Function1<? super String, Unit> callBack) {
        Intrinsics.checkNotNullParameter(weakAct, "weakAct");
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.weakAct = weakAct;
        this.did = did;
        this.name = name;
        this.callBack = callBack;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$1(EditText editText, final RnDeviceRenameDialog this$0, final DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        final String string = StringsKt__StringsKt.trim((CharSequence) editText.getText().toString()).toString();
        RnDeviceRenameDialogKt.requestRenameDevice(this$0.did, this$0.name, string, new Function1() { // from class: quk
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return RnDeviceRenameDialog.show$lambda$1$lambda$0(dialogInterface, this$0, string, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit show$lambda$1$lambda$0(DialogInterface dialogInterface, RnDeviceRenameDialog this$0, String newName, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(newName, "$newName");
        AnyExtKt.main$default(null, new RnDeviceRenameDialog$show$dialog$1$1$1(i, dialogInterface, this$0, newName, null), 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorNameToast(int errorCode) {
        ToastUtil.showLongToast(RnDeviceRenameDialogKt.convertInputErrorMsgResId(errorCode));
    }

    public final void show() {
        Activity activity = this.weakAct.get();
        if (activity == null) {
            return;
        }
        final EditText editText = (EditText) LayoutInflater.from(activity).inflate(zui.c, (ViewGroup) null).findViewById(sri.f);
        editText.setText(this.name);
        final c cVarB = new c.a(activity, u2j.f35312a).y(v0j.B).A(editText).u(v0j.c, new DialogInterface.OnClickListener() { // from class: ouk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                RnDeviceRenameDialog.show$lambda$1(editText, this, dialogInterface, i);
            }
        }).o(v0j.f36350b, new DialogInterface.OnClickListener() { // from class: puk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).b();
        Intrinsics.checkNotNullExpressionValue(cVarB, "create(...)");
        cVarB.show();
        Intrinsics.checkNotNull(editText);
        editText.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.rn.settings.util.RnDeviceRenameDialog$show$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable s) {
                int iCheckInputNameValid = RnDeviceRenameDialogKt.checkInputNameValid(StringsKt__StringsKt.trim((CharSequence) editText.getText().toString()).toString());
                if (iCheckInputNameValid != 0) {
                    this.showErrorNameToast(iCheckInputNameValid);
                }
                cVarB.m(-1).setEnabled(iCheckInputNameValid == 0);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence text, int start, int before, int count) {
            }
        });
    }
}
