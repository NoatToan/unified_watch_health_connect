package m7;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public class b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f117057a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, boolean z14, c cVar) {
        super(inputConnection, z14);
        this.f117057a = cVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i14, Bundle bundle) {
        if (this.f117057a.a(d.a(inputContentInfo), i14, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i14, bundle);
    }
}
