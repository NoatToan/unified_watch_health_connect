package x5;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0013\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lx5/a0;", "Lx5/z;", "Landroid/view/inputmethod/InputConnection;", "delegate", "Lkotlin/Function1;", "Lx5/x;", "", "onConnectionClosed", "<init>", "(Landroid/view/inputmethod/InputConnection;Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a0 extends z {
    public a0(InputConnection inputConnection, e23.l<? super x, Unit> lVar) {
        super(inputConnection, lVar);
    }

    @Override // x5.y, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i14, Bundle bundle) {
        InputConnection inputConnection = this.f188967b;
        if (inputConnection != null) {
            return inputConnection.commitContent(inputContentInfo, i14, bundle);
        }
        return false;
    }
}
