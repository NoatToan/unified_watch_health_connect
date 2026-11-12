package a03;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.skydoves.flexible.core.FlexibleSheetState", f = "FlexibleSheetState.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, 213, 220}, m = "show")
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p pVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f191c = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f190b = obj;
        this.f192d |= Integer.MIN_VALUE;
        return this.f191c.g(this);
    }
}
