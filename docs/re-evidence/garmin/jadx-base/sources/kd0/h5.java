package kd0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.social.share.UCropImageActivity;
import org.json.JSONObject;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkd0/h5;", "Lv90/e;", "Ldv/m;", "setupWizardRepo", "<init>", "(Ldv/m;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h5 implements v90.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dv.m f104102a;

    public h5(dv.m mVar) {
        mVar.getClass();
        this.f104102a = mVar;
    }

    @Override // v90.e
    public final Object a(UserSettingsDTO userSettingsDTO, JSONObject jSONObject, ab0.c cVar) {
        return this.f104102a.b(userSettingsDTO, jSONObject, cVar);
    }

    @Override // v90.e
    public final Intent b(Context context, Uri uri) {
        context.getClass();
        uri.getClass();
        return UCropImageActivity.a.a(UCropImageActivity.f44623o, context, uri, 0, 0, UCropImageActivity.b.RECTANGLE, null, 0.0f, 236);
    }
}
