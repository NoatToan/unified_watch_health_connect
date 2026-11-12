package qi2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lqi2/a;", "Lqi2/c;", "Lui2/a;", "environment", "", "applicationId", "", "isAppDebugBuild", "<init>", "(Lui2/a;Ljava/lang/String;Z)V", "cmc_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ui2.a aVar, String str, boolean z14) {
        super(aVar, str, d.COLLECT_DATE_OF_BIRTH, z14);
        aVar.getClass();
        str.getClass();
    }

    @Override // qi2.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return super.equals(obj) && obj != null && a.class == obj.getClass();
    }

    public /* synthetic */ a(ui2.a aVar, String str, boolean z14, int i14, j jVar) {
        this(aVar, str, (i14 & 4) != 0 ? false : z14);
    }
}
