package kh2;

import android.content.DialogInterface;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class i extends w implements p<DialogInterface, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f104799a = new i();

    public i() {
        super(2);
    }

    @Override // e23.p
    public final Unit invoke(DialogInterface dialogInterface, Integer num) {
        DialogInterface dialogInterface2 = dialogInterface;
        num.intValue();
        dialogInterface2.getClass();
        dialogInterface2.cancel();
        return Unit.INSTANCE;
    }
}
