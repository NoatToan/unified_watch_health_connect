package fd;

import android.net.Uri;
import android.view.InputEvent;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfd/g;", "", "", "Landroid/net/Uri;", "registrationUris", "Landroid/view/InputEvent;", "inputEvent", "<init>", "(Ljava/util/List;Landroid/view/InputEvent;)V", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Uri> f70430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputEvent f70431b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(List<? extends Uri> list, InputEvent inputEvent) {
        list.getClass();
        this.f70430a = list;
        this.f70431b = inputEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f70430a, gVar.f70430a) && s.g(this.f70431b, gVar.f70431b);
    }

    public final int hashCode() {
        int iHashCode = this.f70430a.hashCode();
        InputEvent inputEvent = this.f70431b;
        if (inputEvent == null) {
            return iHashCode;
        }
        return inputEvent.hashCode() + (iHashCode * 31);
    }

    public final String toString() {
        return am.j.m("AppSourcesRegistrationRequest { ", "RegistrationUris=[" + this.f70430a + "], InputEvent=" + this.f70431b, " }");
    }

    public /* synthetic */ g(List list, InputEvent inputEvent, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, (i14 & 2) != 0 ? null : inputEvent);
    }
}
