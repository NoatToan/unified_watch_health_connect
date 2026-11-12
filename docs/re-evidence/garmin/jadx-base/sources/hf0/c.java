package hf0;

import p005kotlin.Metadata;
import v13.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.ecg.data.preference.UserPreferenceGhsEcgHelperKt", f = "UserPreferenceGhsEcgHelper.kt", l = {10}, m = "updateUserPreferenceGhsEcgEnabled", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f83624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f83625b;

    public c(t13.d<? super c> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f83624a = obj;
        this.f83625b |= Integer.MIN_VALUE;
        return d.a(this);
    }
}
