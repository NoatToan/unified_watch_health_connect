package gv2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.baseviews.doublelabel.floatpicker.FloatPickerDataHandler$Companion", f = "FloatPickerDataHandler.kt", l = {99}, m = "updateFloatPicker", v = 1)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f79448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f79449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c.a f79450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79451d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c.a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f79450c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f79449b = obj;
        this.f79451d |= Integer.MIN_VALUE;
        return this.f79450c.a(null, 0, 0, 0.0f, this);
    }
}
