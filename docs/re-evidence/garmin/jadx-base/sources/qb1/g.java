package qb1;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupViewModel", f = "PregnancySetupViewModel.kt", l = {536}, m = "getAllRegisteredGCDevices", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f144104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f144105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f144106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f144107d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f144106c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f144105b = obj;
        this.f144107d |= Integer.MIN_VALUE;
        return f.x4(this.f144106c, this);
    }
}
