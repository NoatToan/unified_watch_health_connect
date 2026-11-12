package v12;

import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.past.PrivacySelectionAllPastActivitiesViewModel", f = "PrivacySelectionAllPastActivitiesViewModel.kt", l = {60, 63, 65, 68, 70}, m = "onPrivacyChangeConfirmed", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PrivacyType f174688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f174689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f174690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f174691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f174692e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f174691d = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f174690c = obj;
        this.f174692e |= Integer.MIN_VALUE;
        return e.A4(this.f174691d, this);
    }
}
