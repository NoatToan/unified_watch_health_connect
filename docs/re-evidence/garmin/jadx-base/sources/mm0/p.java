package mm0;

import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.GroupDetailViewModel", f = "GroupDetailViewModel.kt", l = {101}, m = "updateGroupMemberProfilePicture", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.b f119567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GroupDetailsDTO f119568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f119569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f119570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f119571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f119572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f119573g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e eVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f119572f = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f119571e = obj;
        this.f119573g |= Integer.MIN_VALUE;
        int i14 = e.f119504m;
        return this.f119572f.D4(null, this);
    }
}
