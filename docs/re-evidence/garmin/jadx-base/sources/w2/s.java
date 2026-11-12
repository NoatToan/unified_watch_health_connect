package w2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final /* synthetic */ class s extends p005kotlin.jvm.internal.q implements e23.p<u2.e, CharSequence, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f181440a = new s();

    public s() {
        super(2, u2.e.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
    }

    @Override // e23.p
    public final Boolean invoke(u2.e eVar, CharSequence charSequence) {
        return Boolean.valueOf(d53.u.m(eVar.f167839c, charSequence));
    }
}
