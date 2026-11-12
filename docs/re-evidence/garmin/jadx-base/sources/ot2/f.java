package ot2;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.lib.workoutcommon.presentation.formatter.EndConditionFormatterKt", f = "EndConditionFormatter.kt", l = {299, MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE, 303, 309, 311}, m = "formatPower")
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f133865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f133866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f133867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f133868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f133869e;

    public f(t13.d<? super f> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f133868d = obj;
        this.f133869e |= Integer.MIN_VALUE;
        return b.e(false, 0.0d, null, this);
    }
}
