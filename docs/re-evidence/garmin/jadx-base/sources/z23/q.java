package z23;

import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q extends p005kotlin.jvm.internal.q implements e23.l<Member, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f202067a = new q();

    public q() {
        super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
    }

    @Override // e23.l
    public final Boolean invoke(Member member) {
        Member member2 = member;
        member2.getClass();
        return Boolean.valueOf(member2.isSynthetic());
    }
}
