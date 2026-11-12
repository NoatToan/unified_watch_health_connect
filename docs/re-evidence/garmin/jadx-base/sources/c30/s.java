package c30;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.domain.custom.ConvertToGCJ02UseCase", f = "ConvertToGCJ02UseCase.kt", l = {47}, m = "convertToGCJ02", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a50.g f24006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.courses.model.e f24007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f24008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f24009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f24010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u f24011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24012g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f24011f = uVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f24010e = obj;
        this.f24012g |= Integer.MIN_VALUE;
        return u.a(this.f24011f, null, this);
    }
}
