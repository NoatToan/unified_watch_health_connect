package o63;

import java.util.LinkedHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {24}, m = "readObject")
public final class x extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o13.c f129898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y f129899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinkedHashMap f129900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f129901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f129902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f129903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f129904g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, t13.d<? super x> dVar) {
        super(dVar);
        this.f129903f = yVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f129902e = obj;
        this.f129904g |= Integer.MIN_VALUE;
        return y.a(this.f129903f, null, this);
    }
}
