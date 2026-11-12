package s3;

import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u0000B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ls3/c;", "", Action.KEY_ATTRIBUTE, "", "sourceInformation", "dataStartOffset", "<init>", "(ILjava/lang/String;I)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f156319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f156321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<Object> f156322d;

    public c(int i14, String str, int i15) {
        this.f156319a = i14;
        this.f156320b = str;
        this.f156321c = i15;
    }

    public final ArrayList<Object> a() {
        return this.f156322d;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF156319a() {
        return this.f156319a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF156320b() {
        return this.f156320b;
    }

    public final boolean d(b bVar) {
        ArrayList<Object> arrayList = this.f156322d;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                Object obj = arrayList.get(i14);
                if (s.g(obj, bVar)) {
                    return true;
                }
                if ((obj instanceof c) && ((c) obj).d(bVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final c e() {
        Object obj;
        ArrayList<Object> arrayList = this.f156322d;
        if (arrayList == null) {
            obj = null;
            break;
        }
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                obj = null;
                break;
            }
            obj = arrayList.get(size);
            if (obj instanceof c) {
                break;
            }
            size--;
        }
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null ? cVar.e() : this;
    }

    public final boolean f(b bVar) {
        ArrayList<Object> arrayList = this.f156322d;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof b) {
                    if (obj.equals(bVar)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof c) && !((c) obj).f(bVar)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.f156322d = null;
                return false;
            }
        }
        return true;
    }
}
