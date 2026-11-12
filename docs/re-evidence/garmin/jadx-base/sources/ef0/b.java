package ef0;

import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lef0/b;", "", "", "uri", "Lef0/e;", "status", Constants.MessagePayloadKeys.RAW_DATA, "", "isDragging", "<init>", "(Ljava/lang/String;Lef0/e;Ljava/lang/Object;Z)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f63940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f63941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f63942d;

    public b(String str, e eVar, Object obj, boolean z14) {
        str.getClass();
        eVar.getClass();
        obj.getClass();
        this.f63939a = str;
        this.f63940b = eVar;
        this.f63941c = obj;
        this.f63942d = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f63939a, bVar.f63939a) && this.f63940b == bVar.f63940b && s.g(this.f63941c, bVar.f63941c) && this.f63942d == bVar.f63942d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63942d) + ((this.f63941c.hashCode() + ((this.f63940b.hashCode() + (this.f63939a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DraggableImagePreviewerData(uri=" + this.f63939a + ", status=" + this.f63940b + ", rawData=" + this.f63941c + ", isDragging=" + this.f63942d + ")";
    }

    public /* synthetic */ b(String str, e eVar, Object obj, boolean z14, int i14, j jVar) {
        this(str, eVar, obj, (i14 & 8) != 0 ? false : z14);
    }
}
