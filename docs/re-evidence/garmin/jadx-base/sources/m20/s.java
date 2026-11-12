package m20;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.network.ContactsRepo", f = "ContactsRepo.kt", l = {79}, m = "replaceContactProfile", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f116019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f116020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f116021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f116022d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f116021c = zVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f116020b = obj;
        this.f116022d |= Integer.MIN_VALUE;
        return z.d(this.f116021c, null, this);
    }
}
