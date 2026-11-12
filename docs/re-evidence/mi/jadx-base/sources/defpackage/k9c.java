package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k9c implements ym9<k9c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f23629b;
    public final boolean c;

    public k9c(String str, List<String> list, boolean z) {
        this.f23628a = str;
        this.f23629b = Collections.unmodifiableList(list);
        this.c = z;
    }
}
