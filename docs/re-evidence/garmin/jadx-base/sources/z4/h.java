package z4;

import android.view.KeyEvent;
import e23.l;
import h4.r;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lz4/h;", "Lz4/g;", "Lh4/r$c;", "Lkotlin/Function1;", "Lz4/b;", "", "onEvent", "onPreEvent", "<init>", "(Le23/l;Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends r.c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l<? super b, Boolean> f202313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l<? super b, Boolean> f202314b;

    public h(l<? super b, Boolean> lVar, l<? super b, Boolean> lVar2) {
        this.f202313a = lVar;
        this.f202314b = lVar2;
    }

    @Override // z4.g
    public final boolean J(KeyEvent keyEvent) {
        l<? super b, Boolean> lVar = this.f202314b;
        if (lVar != null) {
            return lVar.invoke(b.a(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // z4.g
    public final boolean M1(KeyEvent keyEvent) {
        l<? super b, Boolean> lVar = this.f202313a;
        if (lVar != null) {
            return lVar.invoke(b.a(keyEvent)).booleanValue();
        }
        return false;
    }
}
