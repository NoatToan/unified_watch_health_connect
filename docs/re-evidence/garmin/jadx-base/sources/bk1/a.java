package bk1;

import c83.a0;
import com.garmin.android.apps.connectmobile.settings.model.Office365SettingDTO;
import com.nimbusds.jose.jwk.JWKParameterNames;
import hk1.m;
import i83.f;
import i83.o;
import i83.p;
import o53.i0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u0002H'¢\u0006\u0004\b\f\u0010\u0006J\u001b\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u0002H'¢\u0006\u0004\b\r\u0010\u0006J%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000e\u0010\u000b¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lbk1/a;", "", "Lo53/i0;", "Lc83/a0;", "", "a", "()Lo53/i0;", "Lhk1/m;", "settings", "Lcom/garmin/android/apps/connectmobile/settings/model/Office365SettingDTO;", "c", "(Lhk1/m;)Lo53/i0;", "d", "b", JWKParameterNames.RSA_EXPONENT, "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @f("/calendar-service/calendarSync/office365/loginurl")
    i0<a0<String>> a();

    @f("/calendar-service/calendarSync/office365/status")
    i0<a0<Office365SettingDTO>> b();

    @o("/calendar-service/calendarSync/office365/connect")
    i0<a0<Office365SettingDTO>> c(@i83.a m settings);

    @i83.b("/calendar-service/calendarSync/office365/disconnect")
    i0<a0<Office365SettingDTO>> d();

    @p("/calendar-service/calendarSync/office365/setting")
    i0<a0<Office365SettingDTO>> e(@i83.a m settings);
}
