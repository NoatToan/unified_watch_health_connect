package gd0;

import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.devices.task.DuplicateCourseTask", f = "DuplicateCourseTask.kt", l = {26, 28, 38}, m = "execute", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f76958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f76959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f76960c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f76959b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f76958a = obj;
        this.f76960c |= Integer.MIN_VALUE;
        return this.f76959b.a(this);
    }
}
