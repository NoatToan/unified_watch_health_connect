package yj1;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyj1/a;", "", "", "contactNames", "", "hasError", "<init>", "(Ljava/lang/String;Z)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f197517b;

    public /* synthetic */ a(String str, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? false : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f197516a, aVar.f197516a) && this.f197517b == aVar.f197517b;
    }

    public final int hashCode() {
        String str = this.f197516a;
        return Boolean.hashCode(this.f197517b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return n23.j.g("AssistanceContactsUiState(contactNames=", this.f197516a, ", hasError=", this.f197517b, ")");
    }

    public a(String str, boolean z14) {
        this.f197516a = str;
        this.f197517b = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }
}
