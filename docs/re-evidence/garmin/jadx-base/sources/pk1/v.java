package pk1;

import com.garmin.android.apps.connectmobile.settings.view.GCMSettingsItemView;
import java.util.Calendar;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpk1/v;", "Lgg1/b$a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v implements gg1.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f138347a;

    public v(u uVar) {
        this.f138347a = uVar;
    }

    @Override // gg1.b.a
    public final void a(Calendar calendar) {
        u uVar = this.f138347a;
        GCMSettingsItemView gCMSettingsItemView = uVar.f138318c;
        if (gCMSettingsItemView == null) {
            p005kotlin.jvm.internal.s.m("dateOfBirthView");
            throw null;
        }
        gCMSettingsItemView.setSummary(uVar.C6(LocalDate.fromCalendarFields(calendar)));
        uVar.u6();
    }
}
