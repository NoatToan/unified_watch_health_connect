package kh2;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class h extends w implements p<DialogInterface, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f104797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gi2.e f104798b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Fragment fragment, gi2.e eVar) {
        super(2);
        this.f104797a = fragment;
        this.f104798b = eVar;
    }

    @Override // e23.p
    public final Unit invoke(DialogInterface dialogInterface, Integer num) {
        DialogInterface dialogInterface2 = dialogInterface;
        num.intValue();
        dialogInterface2.getClass();
        k.f104801a.getClass();
        this.f104798b.u(new j(this.f104797a));
        dialogInterface2.cancel();
        return Unit.INSTANCE;
    }
}
