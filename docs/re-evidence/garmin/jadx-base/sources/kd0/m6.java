package kd0;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.TrainingPlanDelegateImpl", f = "TrainingPlanDelegateImpl.kt", l = {MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE}, m = "getIntensityMinutesData", v = 2)
public final class m6 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f104232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f104233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i6 f104234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f104235d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(i6 i6Var, t13.d<? super m6> dVar) {
        super(dVar);
        this.f104234c = i6Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104233b = obj;
        this.f104235d |= Integer.MIN_VALUE;
        return this.f104234c.d(this);
    }
}
