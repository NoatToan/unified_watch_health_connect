package k10;

import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/group/service/model/GroupDetailsDTO;", "<anonymous>", "()Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connections.groups.details.settings.GroupSettingsViewModel$editGroup$1", f = "GroupSettingsViewModel.kt", l = {12}, m = "invokeSuspend", v = 2)
public final class e extends i implements l<t13.d<? super v2<? extends GroupDetailsDTO>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f102158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f102159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f102160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GroupDTO f102161d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, String str, GroupDTO groupDTO, t13.d<? super e> dVar) {
        super(1, dVar);
        this.f102159b = fVar;
        this.f102160c = str;
        this.f102161d = groupDTO;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e(this.f102159b, this.f102160c, this.f102161d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super v2<? extends GroupDetailsDTO>> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f102158a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        ym0.a aVar2 = this.f102159b.f102162a;
        this.f102158a = 1;
        aVar2.getClass();
        Object objJ = f0.J(aVar2, new ym0.l(aVar2, this.f102160c, this.f102161d, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
