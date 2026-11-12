package com.garmin.android.apps.connectmobile.activities.photos;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import fo1.z;
import java.util.List;
import jo1.f;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "Ljo1/f;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.activities.photos.PostPhotoManagementActivity$PhotoViewModel$saveReorderedList$1", f = "PostPhotoManagementActivity.kt", l = {174}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<d<? super v2<? extends List<? extends f>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PostPhotoManagementActivity.b f29749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f29750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<String> f29751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PostPhotoManagementActivity.b bVar, String str, List<String> list, d<? super b> dVar) {
        super(1, dVar);
        this.f29749b = bVar;
        this.f29750c = str;
        this.f29751d = list;
    }

    @Override // v13.a
    public final d<Unit> create(d<?> dVar) {
        return new b(this.f29749b, this.f29750c, this.f29751d, dVar);
    }

    @Override // e23.l
    public final Object invoke(d<? super v2<? extends List<? extends f>>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f29748a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        fo1.f fVar = this.f29749b.f29726a;
        this.f29748a = 1;
        fVar.getClass();
        Object objJ = f0.J(fVar, new z(fVar, this.f29750c, this.f29751d, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
