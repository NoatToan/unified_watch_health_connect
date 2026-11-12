package defpackage;

import android.content.Context;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.PickerDialog;

/* JADX INFO: loaded from: classes10.dex */
public class ig8 implements kwc<CommonDialog, Context> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21112a;

    public ig8(String str) {
        this.f21112a = str;
    }

    @Override // defpackage.kwc
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public PickerDialog a(Context context, int i) {
        return new PickerDialog.b(this.f21112a).setCustomLayoutId(nvi.f28482a).setPositiveText(o1j.T).setNegativeText(o1j.f28645b).setCancelable(true).setDialogTitle(i).setCanceledOnTouchOutside(true).create();
    }
}
