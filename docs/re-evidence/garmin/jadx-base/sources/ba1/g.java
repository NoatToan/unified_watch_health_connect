package ba1;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.personalrecords.presentation.viewmodel.PersonalRecordsViewModel", f = "PersonalRecordsViewModel.kt", l = {660, 684}, m = "getPersonalRecordsSports", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f17028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f17029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f17030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17031d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, t13.d<? super g> dVar2) {
        super(dVar2);
        this.f17030c = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f17029b = obj;
        this.f17031d |= Integer.MIN_VALUE;
        return d.x4(this.f17030c, this);
    }
}
