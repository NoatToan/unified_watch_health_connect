package fv2;

import android.content.Context;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "com.garmin.realtimesettings.app.baseviews.doublelabel.datepicker.DatePickerDataHandler$Companion", f = "DatePickerDataHandler.kt", l = {107}, m = "updateDatePickerValue", v = 1)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f73744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f73745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e.a f73746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f73747d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e.a aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f73746c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f73745b = obj;
        this.f73747d |= Integer.MIN_VALUE;
        return this.f73746c.c(null, 0, 0, null, this);
    }
}
