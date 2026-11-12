package ue2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lue2/b;", "", "Lue2/a;", "ageSignalsError", "", "message", "<init>", "(Lue2/a;Ljava/lang/String;)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f170260a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str) {
        super(str, null);
        aVar.getClass();
        this.f170260a = aVar;
    }

    public /* synthetic */ b(a aVar, String str, int i14, j jVar) {
        this(aVar, (i14 & 2) != 0 ? null : str);
    }
}
