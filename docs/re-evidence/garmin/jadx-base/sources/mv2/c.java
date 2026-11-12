package mv2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.baseviews.doublelabel.timepicker.TimePickerDataHandler$Companion", f = "TimePickerDataHandler.kt", l = {87}, m = "updateTimePicker", v = 1)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f121201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d.a f121203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f121204d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d.a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f121203c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f121202b = obj;
        this.f121204d |= Integer.MIN_VALUE;
        return this.f121203c.a(null, 0, 0, 0, this);
    }
}
