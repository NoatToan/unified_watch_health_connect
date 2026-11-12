package x01;

import b63.o;
import b63.v;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionViewModel", f = "NutritionViewModel.kt", l = {178}, m = "getReminderDestination", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f188321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f188322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v f188323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f188324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f188325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f188326f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f188325e = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f188324d = obj;
        this.f188326f |= Integer.MIN_VALUE;
        return k.y4(this.f188325e, null, this);
    }
}
