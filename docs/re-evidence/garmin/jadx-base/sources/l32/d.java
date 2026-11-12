package l32;

import android.widget.Button;
import java.util.List;
import k32.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ll32/d;", "", "T", "Ll32/c;", "<init>", "()V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d<T> implements c<T> {
    @Override // l32.c
    public final void a(List<e<T>> list, k32.d<T> dVar, e<T> eVar) {
        list.getClass();
        dVar.getClass();
        eVar.getClass();
        a aVar = new a(eVar, list, dVar, 1);
        Button button = eVar.f102679d;
        if (button != null) {
            button.setOnClickListener(aVar);
        }
    }
}
