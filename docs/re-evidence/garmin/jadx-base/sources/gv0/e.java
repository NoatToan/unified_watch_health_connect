package gv0;

import com.google.android.gms.identity.intents.AddressConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.LiveTrackSettingsViewModel", f = "LiveTrackSettingsViewModel.kt", l = {AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES}, m = "addChildLiveTrackRecipient", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pu0.b f79253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f79254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f79255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f79256d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, t13.d<? super e> dVar2) {
        super(dVar2);
        this.f79255c = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f79254b = obj;
        this.f79256d |= Integer.MIN_VALUE;
        return d.x4(this.f79255c, 0L, null, this);
    }
}
