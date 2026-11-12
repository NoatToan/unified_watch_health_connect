package qo1;

import c83.a0;
import com.garmin.android.apps.connectmobile.userprofile.model.k;
import com.garmin.android.apps.connectmobile.userprofile.model.m;
import e23.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/userprofile/model/m;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.social.repo.SocialProfileRepo$getSocialProfile$4", f = "SocialProfileRepo.kt", l = {65}, m = "invokeSuspend", v = 2)
public final class f extends i implements l<t13.d<? super a0<m>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f145973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f145974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f145975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<k> f145976d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(c cVar, String str, List<? extends k> list, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f145974b = cVar;
        this.f145975c = str;
        this.f145976d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f145974b, this.f145975c, this.f145976d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<m>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f145973a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        eo1.a aVar2 = this.f145974b.f145961a;
        List<k> list = this.f145976d;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((k) it.next()).name());
        }
        i0<a0<m>> i0VarF = aVar2.f(this.f145975c, arrayList);
        this.f145973a = 1;
        Object objAwait = i0VarF.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
